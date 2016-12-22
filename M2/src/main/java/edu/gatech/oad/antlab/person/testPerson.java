package edu.gatech.oad.antlab.person;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
/**
 * Make sure to change private to public 
 * if you want to test your Person class
 * @author JONGWOO JANG
 *
 */
public class testPerson {
	@Rule
	public Timeout globalTimeout = new Timeout(10000, TimeUnit.MILLISECONDS);
	
	@Test
	public void testPerson1() {
		Person1 p1 = new Person1("gtg123b");
		String a = p1.calc("gtg123b");
		assertEquals("g123bgt", a);
		a = null;
		assertEquals(null, a);
		a = p1.calc("bc");
		assertEquals("bc", a);
		a = p1.calc("b");
		assertEquals("b", a);
		a = p1.calc("");
		assertEquals("", a);
		a = p1.calc("GTG123B");
		assertEquals("G123BGT", a);
		a = p1.calc("BC");
		assertEquals("BC", a);
		a = p1.calc("B");
		assertEquals("B", a);
		a = p1.calc("");
		assertEquals("", a);
	}
	
	@Test
	public void testPerson2() {
		Person2 p2 = new Person2("abcdefg");
		String a = p2.calc("abcdefg");
		char[] chars = a.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		System.out.println(sorted);
		assertEquals("abcdefg", sorted);
		
		a = p2.calc("b");
		chars = a.toCharArray();
		Arrays.sort(chars);
		sorted = new String(chars);
		assertEquals("b", sorted);
		
		a = p2.calc("cb");
		chars = a.toCharArray();
		Arrays.sort(chars);
		sorted = new String(chars);
		assertEquals("bc", sorted);
		
		a = p2.calc("acd");
		chars = a.toCharArray();
		Arrays.sort(chars);
		sorted = new String(chars);
		assertEquals("acd", sorted);
		
		a = p2.calc("abcdefg");
		chars = a.toCharArray();
		Arrays.sort(chars);
		sorted = new String(chars);
		assertEquals("abcdefg", sorted);

		a = p2.calc("ADFRC");
		chars = a.toCharArray();
		Arrays.sort(chars);
		sorted = new String(chars);
		assertEquals("ACDFR", sorted);
	}
	
	@Test
	public void testPerson3() {
		Person3 p3 = new Person3("gtg123b");
		String a = p3.calc("gtg123b");
		assertEquals("b321gtg", a);
		a = null;
		assertEquals(null, a);
		a = p3.calc("bc");
		assertEquals("cb", a);
		a = p3.calc("b");
		assertEquals("b", a);
		a = p3.calc("");
		assertEquals("", a);
		a = p3.calc("GTG123B");
		assertEquals("B321GTG", a);
		a = p3.calc("BC");
		assertEquals("CB", a);
		a = p3.calc("B");
		assertEquals("B", a);
	}

	@Test
	public void testPerson4() {
		Person4 p4 = new Person4("abc123");
		String a = p4.calc("abc123");
		assertEquals("bcd234", a);
		a = null;
		assertEquals(null, a);
		a = p4.calc("");
		assertEquals("", a);
		a = p4.calc("d");
		assertEquals("e", a);
		a = p4.calc("az");
		assertEquals("b{", a);
		a = p4.calc("ABC123");
		assertEquals("BCD234", a);
		a = p4.calc("DBZ");
		assertEquals("EC[", a);
	}
	
	@Test
	public void testPerson5() {
		Person5 p5 = new Person5("gtg123b");
		String a = p5.calc("gtg123b");
		assertEquals("g123bgt", a);
		a = null;
		assertEquals(null, a);
		a = p5.calc("bc");
		assertEquals("bc", a);
		a = p5.calc("b");
		assertEquals("b", a);
		a = p5.calc("");
		assertEquals("", a);
		a = p5.calc("GTG123B");
		assertEquals("G123BGT", a);
		a = p5.calc("BC");
		assertEquals("BC", a);
		a = p5.calc("B");
		assertEquals("B", a);
		a = p5.calc("");
		assertEquals("", a);
	}
}

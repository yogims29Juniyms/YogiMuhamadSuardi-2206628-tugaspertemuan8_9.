/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbosoal2;

/**
 *
 * @author admin
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Kaisar Setio Febrian", "Jl. Merdeka No. 123", "0812-3456-7890", "tio@gmail.com");

        Student student = new Student("M. Izzudin Alfatih", "Jl. Diponegoro No. 456", "0813-6789-1234", "fatih@gmail.com", Student.SENIOR);

        MyDate hireDate = new MyDate(2020, 5, 1);
        Employee employee = new Employee("Sahrul Mubarok", "Jl. Sudirman No. 789", "0814-9876-5432", "sahrul@gmail.com", "Kantor Pusat", 50000000, hireDate);

        Faculty faculty = new Faculty("Dr. Yogi Muhamad Suardi", "Jl. Gatot Subroto No. 321", "0815-6543-2109", "yogi@gmail.com", "Gedung Ilmu Pengetahuan", 75000000, hireDate, 10, "Profesor");

        Staff staff = new Staff("Irfan Habibi", "Jl. K.H. Ahmad Dahlan No. 654", "0816-4321-0987", "Irfan@gmail.com", "Gedung Administrasi", 40000000, hireDate, "Manajer");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

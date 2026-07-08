package X;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.text.a0;
import kotlin.text.u;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: renamed from: X.08Ng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2107008Ng {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public static List LIZ() {
        MainDispatcherFactory mainDispatcherFactory;
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("okp.a", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            ?? classLoader = MainDispatcherFactory.class.getClassLoader();
            try {
                classLoader = LIZIZ(MainDispatcherFactory.class, classLoader);
                return classLoader;
            } catch (Throwable unused4) {
                return C13LP.LLIIII(C786410Ut5.o4(MainDispatcherFactory.class, classLoader));
            }
        }
    }

    public static List LIZJ(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return C13LP.LLIIII(linkedHashSet);
            }
            String string = a0.LJLIIIL(a0.LJJZ(line, "#", line)).toString();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Illegal service provider class name: ");
                    sbLIZ.append(string);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    public static List LIZIZ(Class cls, ClassLoader classLoader) throws ClassNotFoundException {
        BufferedReader bufferedReader;
        List listLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("META-INF/services/");
        sbLIZ.append(cls.getName());
        ArrayList<URL> list = Collections.list(classLoader.getResources(C2188811AlT.LIZIZ(sbLIZ)));
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            String string = url.toString();
            if (u.LJJIIJZLJL(string, "jar", false)) {
                String strLJJLIL = a0.LJJLIL(string, "jar:file:", string);
                String strLJJLL = a0.LJJLL('!', strLJJLIL, strLJJLIL);
                String strLJJLIL2 = a0.LJJLIL(string, "!/", string);
                JarFile jarFile = new JarFile(strLJJLL, false);
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strLJJLIL2)), "UTF-8"));
                    try {
                        listLIZJ = LIZJ(bufferedReader);
                        C2107108Nh.LIZ(bufferedReader, null);
                        jarFile.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            jarFile.close();
                            throw th2;
                        } catch (Throwable th3) {
                            C13SZ.LIZ(th, th3);
                            throw th;
                        }
                    }
                }
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
                try {
                    listLIZJ = LIZJ(bufferedReader);
                    C2107108Nh.LIZ(bufferedReader, null);
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } finally {
                    }
                }
            }
            C19719612Di.LJJI(listLIZJ, arrayList);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        if (!setLLIIJI.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(setLLIIJI, 10));
            Iterator it2 = setLLIIJI.iterator();
            while (it2.hasNext()) {
                Class<?> cls2 = Class.forName((String) it2.next(), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    arrayList2.add(cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Expected service of class ");
                    sbLIZ2.append(cls);
                    sbLIZ2.append(", but found ");
                    sbLIZ2.append(cls2);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
            }
            return arrayList2;
        }
        "No providers were loaded with FastServiceLoader".toString();
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
    }
}

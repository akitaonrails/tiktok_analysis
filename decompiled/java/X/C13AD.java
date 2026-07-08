package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13AD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13AD {
    public static volatile int LIZ;
    public static final C13AF LIZIZ = new C13AF();
    public static final C13AI LIZJ = new C13AJ() { // from class: X.13AI
        public final C13AK LIZ = new C13AN() { // from class: X.13AK
            @Override // X.C13AN
            public final C13AX LIZ(String str) {
                return C13AY.NOP_LOGGER;
            }
        };

        @Override // X.C13AJ
        public final String LIZIZ() {
            return "2.0.99";
        }

        @Override // X.C13AJ
        public final void initialize() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [X.13AK] */
        {
            new C13AM();
        }

        @Override // X.C13AJ
        public final C13AN LIZ() {
            return this.LIZ;
        }
    };
    public static final boolean LIZLLL;
    public static volatile C13AJ LJ;
    public static final String[] LJFF;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.13AI] */
    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean zEqualsIgnoreCase = property != null ? property.equalsIgnoreCase("true") : false;
        LIZLLL = zEqualsIgnoreCase;
        LJFF = new String[]{"2.0"};
    }

    public static List<C13AJ> LIZ() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = C13AD.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        C13AJ c13aj = null;
        if (property != null && !property.isEmpty()) {
            try {
                C13AC.LIZJ(C786410Ut5.j4("Attempting to load provider \"%s\" specified via \"%s\" system property", new Object[]{property, "slf4j.provider"}));
                c13aj = (C13AJ) classLoader.loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e) {
                TryCatchGuardChecker.doCheck(e);
                C13AC.LIZ(C786410Ut5.j4("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", new Object[]{property}), e);
            } catch (ClassNotFoundException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C13AC.LIZ(C786410Ut5.j4("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
            } catch (IllegalAccessException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                C13AC.LIZ(C786410Ut5.j4("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
            } catch (InstantiationException e4) {
                e = e4;
                TryCatchGuardChecker.doCheck(e);
                C13AC.LIZ(C786410Ut5.j4("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
            } catch (NoSuchMethodException e5) {
                e = e5;
                TryCatchGuardChecker.doCheck(e);
                C13AC.LIZ(C786410Ut5.j4("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
            } catch (InvocationTargetException e6) {
                e = e6;
                TryCatchGuardChecker.doCheck(e);
                C13AC.LIZ(C786410Ut5.j4("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
            }
        }
        if (c13aj != null) {
            arrayList.add(c13aj);
            return arrayList;
        }
        Iterator it2 = (System.getSecurityManager() == null ? C786410Ut5.o4(C13AJ.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: X.13AH
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return C786410Ut5.o4(C13AJ.class, classLoader);
            }
        })).iterator();
        while (it2.hasNext()) {
            try {
                arrayList.add(it2.next());
            } catch (ServiceConfigurationError e7) {
                TryCatchGuardChecker.doCheck(e7);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("A service provider failed to instantiate:\n");
                sbLIZ.append(e7.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                PrintStream printStreamLIZIZ = C13AC.LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SLF4J(E): ");
                sbLIZ2.append(strLIZIZ);
                printStreamLIZIZ.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return arrayList;
    }

    public static void LJ() throws Throwable {
        C13AF c13af = LIZIZ;
        synchronized (c13af) {
            try {
                c13af.LIZ.LIZ = true;
                C13AE c13ae = c13af.LIZ;
                c13ae.getClass();
                for (C13AT c13at : new ArrayList(((ConcurrentHashMap) c13ae.LIZIZ).values())) {
                    c13at.LLILLJJLI = LIZJ(c13at.LL);
                }
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LinkedBlockingQueue<C13AO> linkedBlockingQueue = LIZIZ.LIZ.LIZJ;
        int size = linkedBlockingQueue.size();
        ArrayList<C13AO> arrayList = new ArrayList(128);
        int i = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (C13AO c13ao : arrayList) {
                if (c13ao != null) {
                    C13AT c13at2 = c13ao.LIZJ;
                    String str = c13at2.LL;
                    if (c13at2.LLILLJJLI == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(c13at2.LLILLJJLI instanceof C13AY)) {
                        if (!c13at2.LIZIZ()) {
                            C13AC.LIZLLL(str);
                        } else if (c13at2.isEnabledForLevel(c13ao.LIZ) && c13at2.LIZIZ()) {
                            try {
                                C2204961BRm.a0(c13at2.LLILZ, c13at2.LLILLJJLI, new Object[]{c13ao}, new C0WZX("ey15EhE2WZ7WG18kSQKBdL0POuAWwnm7qKPCDsfRJHQf5A==", null));
                            } catch (IllegalAccessException e) {
                                TryCatchGuardChecker.doCheck(e);
                            } catch (IllegalArgumentException e2) {
                            } catch (InvocationTargetException e3) {
                            }
                        }
                    }
                }
                int i2 = i + 1;
                if (i == 0) {
                    if (c13ao.LIZJ.LIZIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("A number (");
                        sbLIZ.append(size);
                        sbLIZ.append(") of logging calls during the initialization phase have been intercepted and are");
                        C13AC.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                        C13AC.LIZLLL("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        C13AC.LIZLLL("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(c13ao.LIZJ.LLILLJJLI instanceof C13AY)) {
                        C13AC.LIZLLL("The following set of substitute loggers may have been accessed");
                        C13AC.LIZLLL("during the initialization phase. Logging calls during this");
                        C13AC.LIZLLL("phase were not honored. However, subsequent logging calls to these");
                        C13AC.LIZLLL("loggers will work as normally expected.");
                        C13AC.LIZLLL("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i = i2;
            }
            arrayList.clear();
        }
        C13AE c13ae2 = LIZIZ.LIZ;
        ((ConcurrentHashMap) c13ae2.LIZIZ).clear();
        c13ae2.LIZJ.clear();
    }

    public static final void LIZLLL() throws Throwable {
        try {
            List<C13AJ> listLIZ = LIZ();
            LJII(listLIZ);
            ArrayList arrayList = (ArrayList) listLIZ;
            if (arrayList.isEmpty()) {
                LIZ = 4;
                C13AC.LIZLLL("No SLF4J providers were found.");
                C13AC.LIZLLL("Defaulting to no-operation (NOP) logger implementation");
                C13AC.LIZLLL("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = C13AD.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C13AC.LIZ("Error getting resources from path", e);
                }
                LJI(linkedHashSet);
            } else {
                LJ = (C13AJ) arrayList.get(0);
                LJ.initialize();
                LIZ = 3;
                LJFF(listLIZ);
            }
            LJ();
            if (LIZ == 3) {
                try {
                    String strLIZIZ = LJ.LIZIZ();
                    boolean z = false;
                    for (String str : LJFF) {
                        if (strLIZIZ.startsWith(str)) {
                            z = true;
                        }
                    }
                    if (z) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("The requested version ");
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(" by your slf4j provider is not compatible with ");
                    sbLIZ.append(Arrays.asList(LJFF).toString());
                    C13AC.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    C13AC.LIZLLL("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C13AC.LIZ("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZ = 2;
            C13AC.LIZ("Failed to instantiate SLF4J LoggerFactory", e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C13AX LIZIZ(java.lang.Class<?> r8) {
        /*
            java.lang.String r0 = r8.getName()
            X.13AX r7 = LIZJ(r0)
            boolean r0 = X.C13AD.LIZLLL
            if (r0 == 0) goto L7f
            X.13AG r0 = X.C13AL.LIZ
            r6 = 1
            r1 = 0
            if (r0 != 0) goto L25
            boolean r0 = X.C13AL.LIZIZ
            if (r0 != 0) goto L7f
            X.13AG r0 = new X.13AG     // Catch: java.lang.SecurityException -> L1c
            r0.<init>()     // Catch: java.lang.SecurityException -> L1c
            goto L21
        L1c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r1
        L21:
            X.C13AL.LIZ = r0
            X.C13AL.LIZIZ = r6
        L25:
            r4 = 2
            r5 = 0
            if (r0 == 0) goto L7f
            java.lang.Class[] r3 = r0.getClassContext()
            java.lang.Class<X.13AL> r0 = X.C13AL.class
            java.lang.String r2 = r0.getName()
            r1 = 0
        L34:
            int r0 = r3.length
            if (r1 >= r0) goto L46
            r0 = r3[r1]
            java.lang.String r0 = r0.getName()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L46
            int r1 = r1 + 1
            goto L34
        L46:
            int r0 = r3.length
            if (r1 >= r0) goto L77
            int r1 = r1 + 2
            int r0 = r3.length
            if (r1 >= r0) goto L77
            r2 = r3[r1]
            if (r2 == 0) goto L7f
            boolean r0 = r2.isAssignableFrom(r8)
            r0 = r0 ^ 1
            if (r0 == 0) goto L7f
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = r7.getName()
            r1[r5] = r0
            java.lang.String r0 = r2.getName()
            r1[r6] = r0
            java.lang.String r0 = "Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\"."
            java.lang.String r0 = X.C786410Ut5.j4(r0, r1)
            X.C13AC.LIZLLL(r0)
            java.lang.String r0 = "See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"
            X.C13AC.LIZLLL(r0)
            return r7
        L77:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"
            r1.<init>(r0)
            throw r1
        L7f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13AD.LIZIZ(java.lang.Class):X.13AX");
    }

    public static C13AX LIZJ(String str) {
        C13AJ c13aj;
        if (LIZ == 0) {
            synchronized (C13AD.class) {
                try {
                    if (LIZ == 0) {
                        LIZ = 1;
                        LIZLLL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        int i = LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        c13aj = LIZJ;
                    } else {
                        throw new IllegalStateException("Unreachable code");
                    }
                } else {
                    c13aj = LJ;
                }
            } else {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
        } else {
            c13aj = LIZIZ;
        }
        return c13aj.LIZ().LIZ(str);
    }

    public static void LJFF(List<C13AJ> list) {
        boolean z;
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Actual provider is of type [");
                sbLIZ.append(ListProtector.get(list, 0));
                sbLIZ.append(e3.f);
                C13AC.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            Object obj = ListProtector.get(list, 0);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Connected with provider of type [");
            sbLIZ2.append(obj.getClass().getName());
            sbLIZ2.append(e3.f);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            EnumC1152990g6r enumC1152990g6r = C13AC.LIZ;
            if (C13AC.LIZIZ.LL > 0) {
                return;
            }
            PrintStream printStreamLIZIZ = C13AC.LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("SLF4J(D): ");
            sbLIZ3.append(strLIZIZ);
            printStreamLIZIZ.println(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
    }

    public static void LJI(Set<URL> set) {
        if (set.isEmpty()) {
            return;
        }
        C13AC.LIZLLL("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        for (URL url : set) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Ignoring binding found at [");
            sbLIZ.append(url);
            sbLIZ.append(e3.f);
            C13AC.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        }
        C13AC.LIZLLL("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void LJII(List<C13AJ> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() > 1) {
            C13AC.LIZLLL("Class path contains multiple SLF4J providers.");
            for (Object obj : arrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Found provider [");
                sbLIZ.append(obj);
                sbLIZ.append(e3.f);
                C13AC.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            }
            C13AC.LIZLLL("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}

package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.08Nx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2108708Nx {
    public static final C2108708Nx LIZ = new C2108708Nx();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1744));
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C2109408Oe());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C2108908Nz());
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1743));
    public static final C0VSJ LJFF = new C0VSJ(C1BWL.LIZ().getFilesDir(), "NativeLibDexInstaller/oat");
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1745));
    public static final C01GW LJII = C452501pT.LIZIZ(new C08O0());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1850307Mn());
    public static final AtomicBoolean LJIIIZ = new AtomicBoolean(false);

    public final synchronized void LJII() {
        String str = C1BWL.LIZ().getApplicationInfo().nativeLibraryDir;
        C0VSJ c0vsj = LJFF;
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        LJIIJ(str, false);
    }

    public static boolean LJIIIIZZ() {
        return ((Boolean) LJIIIIZZ.getValue()).booleanValue();
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static boolean LIZLLL(Context context) {
        try {
            C0VSJ c0vsj = new C0VSJ(LIZ(context), "splitcompat");
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, (String) LIZJ.getValue());
            C0VSJ c0vsj3 = new C0VSJ(c0vsj2, "verified-splits");
            if (c0vsj3.isDirectory() && c0vsj.listFiles().length == 1 && c0vsj2.listFiles().length == 1) {
                File[] fileArrListFiles = c0vsj3.listFiles();
                if (fileArrListFiles != null) {
                    if (fileArrListFiles.length != 0) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x003b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ(X.C0VSJ r7) {
        /*
            boolean r0 = r7.isFile()
            r6 = 0
            if (r0 == 0) goto L47
            long r3 = r7.length()
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L47
            X.0VSP r5 = new X.0VSP     // Catch: java.lang.Throwable -> L43
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L43
            r1 = 2
            r4 = 0
            byte[] r3 = new byte[r1]     // Catch: java.lang.Throwable -> L33
            int r0 = r5.read(r3)     // Catch: java.lang.Throwable -> L33
            if (r0 != r1) goto L2e
            r1 = r3[r6]     // Catch: java.lang.Throwable -> L33
            r0 = 80
            if (r1 != r0) goto L2e
            r2 = 1
            r1 = r3[r2]     // Catch: java.lang.Throwable -> L33
            r0 = 75
            if (r1 != r0) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            X.C2107108Nh.LIZ(r5, r4)     // Catch: java.lang.Throwable -> L43
            return r2
        L33:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            r4 = r1
            goto L3c
        L3b:
            r0 = move-exception
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3b
            X.C2107108Nh.LIZ(r5, r4)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2108708Nx.LJIIIZ(X.0VSJ):boolean");
    }

    public static void LIZJ(C0VSJ c0vsj, File file) {
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C08QA.LJIILLIIL(c0vsj, file, true, 4);
            if (file.canWrite()) {
                file.setWritable(false);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            file.delete();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        r3 = X.C2188811AlT.LIZ();
        r3.append(r0.getAbsolutePath());
        r3.append(": not in waitToInstallDexList");
        r23.add(X.C2188811AlT.LIZIZ(r3));
     */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0139 A[EDGE_INSN: B:288:0x0139->B:58:0x0139 BREAK  A[LOOP:5: B:53:0x011d->B:185:0x0540], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(java.lang.Throwable r27, java.util.List<java.io.File> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2108708Nx.LJFF(java.lang.Throwable, java.util.List):void");
    }

    public static IOException LJIIJJI(Throwable th, InvocationTargetException invocationTargetException) {
        String message;
        if (th instanceof IOException) {
            return (IOException) th;
        }
        if (th == null || (message = th.getMessage()) == null) {
            message = invocationTargetException.getMessage();
            if (th == null) {
                th = invocationTargetException;
            }
        }
        return new IOException(message, th);
    }

    public static IOException LJIIL(String str, IOException iOException) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("; original=");
        sbLIZ.append(iOException.getMessage());
        return new IOException(C2188811AlT.LIZIZ(sbLIZ), iOException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    public final void LJIIJ(String str, boolean z) throws Throwable {
        ?? arrayList;
        String string;
        StringBuilder sbLIZ;
        String str2;
        ArrayList arrayList2 = new ArrayList();
        if (LJIIIZ.compareAndSet(false, true)) {
            arrayList = (List) LIZIZ.getValue();
        } else {
            ClassLoader classLoader = C1BWL.LIZ().getClassLoader();
            arrayList = new ArrayList();
            String string2 = classLoader.toString();
            for (String str3 : (List) LIZIZ.getValue()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("libdex_");
                sbLIZ2.append(str3);
                sbLIZ2.append(".so");
                if (!a0.LJJIIZI(string2, C2188811AlT.LIZIZ(sbLIZ2), false)) {
                    arrayList.add(str3);
                }
            }
        }
        for (String str4 : arrayList) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("libdex_");
            sbLIZ3.append(str4);
            sbLIZ3.append(".so");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            C0VSJ c0vsj = new C0VSJ(str, strLIZIZ);
            if (!c0vsj.isFile()) {
                if (!z) {
                    File file = (File) LIZLLL.getValue();
                    if (LJIIIIZZ()) {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str4);
                        str2 = ".config.armeabi_v7a/";
                    } else {
                        sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str4);
                        str2 = ".config.arm64_v8a/";
                    }
                    sbLIZ.append(str2);
                    sbLIZ.append(strLIZIZ);
                    c0vsj = new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (c0vsj.isFile()) {
                if (c0vsj.canWrite()) {
                    c0vsj.setWritable(false);
                }
                arrayList2.add(c0vsj);
            }
        }
        if (!arrayList2.isEmpty()) {
            try {
                LJI(C1BWL.LIZ().getClassLoader(), arrayList2, LJFF);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                LJFF(e, arrayList2);
            } catch (InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                Throwable cause = e2.getCause();
                if (cause instanceof IllegalArgumentException) {
                    String message = cause.getMessage();
                    if (message != null && (string = a0.LJLIIIL(message).toString()) != null && u.LJJIIJZLJL(string, "Optimized data directory", false)) {
                        LJI(C1BWL.LIZ().getClassLoader(), arrayList2, null);
                        return;
                    }
                    return;
                }
                if (cause instanceof IOException) {
                    LJFF(cause, arrayList2);
                } else {
                    LJFF(e2, arrayList2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJFF(th, arrayList2);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:64:0x0127
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static boolean LJ(X.C0VSJ r9, java.lang.String r10, X.C0VSJ r11) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2108708Nx.LJ(X.0VSJ, java.lang.String, X.0VSJ):boolean");
    }

    public static void LJI(ClassLoader classLoader, List list, C0VSJ c0vsj) throws Throwable {
        Method methodExactMethod;
        Object objInvoke;
        Object[] objArr;
        Method methodExactMethod2;
        Object obj = Reflect.on(classLoader).field("pathList", new Class[0]).get();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        try {
            methodExactMethod2 = Reflect.on(obj).exactMethod("makePathElements", new Class[]{List.class, File.class, List.class}, new Object[0]);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                methodExactMethod2 = Reflect.on(obj).exactMethod("makePathElements", new Class[]{ArrayList.class, File.class, ArrayList.class}, new Object[0]);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
                try {
                    try {
                        methodExactMethod = Reflect.on(obj).exactMethod("makeDexElements", new Class[]{ArrayList.class, File.class, ArrayList.class}, new Object[0]);
                    } catch (NoSuchMethodException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        try {
                            methodExactMethod = Reflect.on(obj).exactMethod("makeDexElements", new Class[]{List.class, File.class, List.class}, new Object[0]);
                        } catch (NoSuchMethodException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            throw e4;
                        }
                    }
                    if (methodExactMethod == null) {
                        objInvoke = null;
                    } else {
                        methodExactMethod.setAccessible(true);
                        objInvoke = methodExactMethod.invoke(obj, arrayList2, c0vsj, arrayList);
                    }
                    objArr = (Object[]) objInvoke;
                } catch (NoSuchMethodException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw e5;
                }
            }
        }
        methodExactMethod2.setAccessible(true);
        objArr = (Object[]) methodExactMethod2.invoke(obj, arrayList2, c0vsj, arrayList);
        Field fieldExactField = Reflect.on(obj).exactField("dexElements", new Class[0]);
        fieldExactField.setAccessible(true);
        Object[] objArr2 = (Object[]) fieldExactField.get(obj);
        Object objNewInstance = Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objNewInstance, 0, objArr2.length);
        System.arraycopy(objArr, 0, objNewInstance, objArr2.length, objArr.length);
        fieldExactField.set(obj, objNewInstance);
        if (arrayList.size() > 0) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw ((Throwable) it2.next());
            }
        }
    }

    public static String LIZIZ(String str, String str2, List list, Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!set.isEmpty()) {
            sb.append("; failedPaths=");
            sb.append(C13LP.LJJLIIIJ(set, ", ", null, null, 0, null, AFwS231S0000000_3.get$arr$(282), 30));
        }
        if (!list.isEmpty()) {
            sb.append("; recoveryAttempts=");
            sb.append(C13LP.LJJLIIIJ(list, " | ", null, null, 0, null, null, 62));
        }
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
        }
        return sb.toString();
    }

    public static IOException LJIILIIL(IOException iOException, List list, List list2, String str) {
        C08CX c08cx = C08CX.INSTANCE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("replaced=");
        sbLIZ.append(C13LP.LJJLIIIJ(list2, ", ", null, null, 0, null, null, 62));
        return LJIIL(LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ), list, c08cx), iOException);
    }
}

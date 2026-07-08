package X;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.soloader.Api18TraceUtils;
import com.facebook.soloader.SysUtil;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.08eR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2167708eR {
    public static InterfaceC2167308eN LIZIZ;
    public static AbstractC2220208mu[] LJFF;
    public static C2167608eQ LJI;
    public static int LJIIJJI;
    public static final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public static volatile AbstractC2167908eT[] LIZLLL = null;
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public static final HashSet<String> LJII = new HashSet<>();
    public static final Map<String, Object> LJIIIIZZ = new HashMap();
    public static final Set<String> LJIIIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final String[] LJIIJ = {System.mapLibraryName("breakpad")};
    public static int LJIIL = 0;
    public static final boolean LIZ = true;

    public static synchronized void LJFF() {
        Method declaredMethod;
        boolean z;
        String strLIZ;
        if (LIZIZ != null) {
            return;
        }
        Runtime runtime = Runtime.getRuntime();
        String strJoin = null;
        if (Build.VERSION.SDK_INT > 27) {
            declaredMethod = null;
            z = false;
            strLIZ = null;
            LIZIZ = new C2167208eM(z, strLIZ, strJoin, runtime, declaredMethod);
            return;
        }
        try {
            declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            z = true;
            strLIZ = SysUtil.Api14Utils.LIZ();
            if (strLIZ != null) {
                String[] strArrSplit = strLIZ.split(":");
                ArrayList arrayList = new ArrayList(strArrSplit.length);
                for (String str : strArrSplit) {
                    if (!str.contains("!")) {
                        arrayList.add(str);
                    }
                }
                strJoin = TextUtils.join(":", arrayList);
            }
        } catch (NoSuchMethodException | SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            declaredMethod = null;
            z = false;
            strLIZ = null;
        }
        LIZIZ = new C2167208eM(z, strLIZ, strJoin, runtime, declaredMethod);
        return;
    }

    public static boolean LJII() {
        if (LIZLLL != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        reentrantReadWriteLock.readLock().lock();
        try {
            boolean z = LIZLLL != null;
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ.readLock().unlock();
            throw th;
        }
    }

    public static void LIZLLL(Context context) {
        try {
            LJ(context, 0, LJIIJ);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public static void LJIIIIZZ(String str) {
        boolean z;
        Boolean boolValueOf;
        if (LIZLLL == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (LIZLLL == null) {
                    if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        if (!LJII()) {
                            throw new IllegalStateException("SoLoader.init() not yet called");
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else {
                        synchronized (C2167708eR.class) {
                            try {
                                boolean z2 = !LJII.contains(str);
                                if (z2) {
                                    LoadSoLancet.LIZJ(str);
                                    long jUptimeMillis = SystemClock.uptimeMillis();
                                    Librarian.LJFF(str);
                                    LoadSoLancet.LJ(jUptimeMillis, str);
                                    LoadSoLancet.LIZLLL(jUptimeMillis, str);
                                    LoadSoLancet.LIZIZ(str);
                                }
                                boolValueOf = Boolean.valueOf(z2);
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        if (boolValueOf != null) {
                            boolValueOf.booleanValue();
                            return;
                        }
                    }
                } else {
                    reentrantReadWriteLock.readLock().unlock();
                }
            } catch (Throwable th) {
                LIZJ.readLock().unlock();
                throw th;
            }
        }
        String strMapLibraryName = System.mapLibraryName(str);
        do {
            z = false;
            try {
                LJIIIZ(strMapLibraryName, str, 0, null);
                return;
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
                int i = LJ.get();
                LIZJ.writeLock().lock();
                try {
                    try {
                        if (LJI != null && LJI.LIZJ()) {
                            LJ.getAndIncrement();
                            z = true;
                        }
                        LIZJ.writeLock().unlock();
                        if (LJ.get() == i) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th2) {
                    LIZJ.writeLock().unlock();
                    throw th2;
                }
            }
        } while (z);
    }

    public static void LIZ(Context context, ArrayList arrayList) {
        if ((LJIIJJI & 8) != 0) {
            LJFF = null;
            try {
                SysUtil.LIZ(AbstractC2220208mu.LJIIJ(context, "lib-main"));
                return;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        C0VSJ c0vsj = new C0VSJ(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C2221408n6(context, c0vsj, "lib-main"));
        if (context.getApplicationInfo().splitSourceDirs != null) {
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                C0VSJ c0vsj2 = new C0VSJ(strArr[i]);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("lib-");
                sbLIZ.append(i2);
                arrayList2.add(new C2221408n6(context, c0vsj2, C2188811AlT.LIZIZ(sbLIZ)));
                i++;
                i2++;
            }
        }
        LJFF = (AbstractC2220208mu[]) arrayList2.toArray(new AbstractC2220208mu[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    public static void LIZIZ(ArrayList<AbstractC2167908eT> arrayList, String[] strArr) {
        String strLIZIZ;
        if (Process.is64Bit()) {
            strLIZIZ = "/system/lib64:/vendor/lib64";
        } else {
            strLIZIZ = "/system/lib:/vendor/lib";
        }
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(":");
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        Iterator it2 = new HashSet(Arrays.asList(strLIZIZ.split(":"))).iterator();
        while (it2.hasNext()) {
            arrayList.add(new C2167508eP(new C0VSJ((String) it2.next()), 2, strArr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r8 = X.C2167708eR.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r8 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r7 = r8.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r6 >= r7) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r4 = r8[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r3 = r4.LJIIIIZZ(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r4.LJ = r11;
        r4.LIZIZ(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r4.LIZ(r11, r12, r13) != 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r11, int r12, android.os.StrictMode.ThreadPolicy r13) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2167708eR.LIZJ(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.08eV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.content.Context r4, int r5, java.lang.String[] r6) {
        /*
            boolean r0 = LJII()
            if (r0 == 0) goto L7
            return
        L7:
            android.os.StrictMode$ThreadPolicy r3 = android.os.StrictMode.allowThreadDiskWrites()
            int r1 = X.C2167708eR.LJIIL     // Catch: java.lang.Throwable -> L55
            if (r1 != 0) goto L28
            r0 = r5 & 32
            if (r0 != 0) goto L27
            if (r4 == 0) goto L27
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L55
            int r1 = r0.flags     // Catch: java.lang.Throwable -> L55
            r0 = r1 & 1
            if (r0 == 0) goto L27
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L25
            r1 = 3
            goto L28
        L25:
            r1 = 2
            goto L28
        L27:
            r1 = 1
        L28:
            X.C2167708eR.LJIIL = r1     // Catch: java.lang.Throwable -> L55
            r0 = r5 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L36
            boolean r0 = com.facebook.soloader.SysUtil.LIZJ(r1, r4)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L36
            r5 = r5 | 72
        L36:
            LJFF()     // Catch: java.lang.Throwable -> L55
            LJI(r4, r5, r6)     // Catch: java.lang.Throwable -> L55
            X.08eV r2 = new X.08eV     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.Class<X.08eU> r1 = X.C2168008eU.class
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L55
            boolean r0 = X.C2168008eU.LIZIZ()     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L4d
            X.C2168008eU.LIZ(r2)     // Catch: java.lang.Throwable -> L52
        L4d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            android.os.StrictMode.setThreadPolicy(r3)
            return
        L52:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L55
            android.os.StrictMode.setThreadPolicy(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2167708eR.LJ(android.content.Context, int, java.lang.String[]):void");
    }

    public static void LJI(final Context context, int i, String[] strArr) {
        int i2;
        if (LIZLLL != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
        reentrantReadWriteLock.writeLock().lock();
        if (LIZLLL != null) {
            reentrantReadWriteLock.writeLock().unlock();
            return;
        }
        try {
            LJIIJJI = i;
            ArrayList arrayList = new ArrayList();
            LIZIZ(arrayList, strArr);
            int i3 = 1;
            if (context != null) {
                if ((i & 1) == 0) {
                    if ((i & 64) != 0) {
                        if (context.getApplicationInfo().splitSourceDirs != null) {
                            for (String str : context.getApplicationInfo().splitSourceDirs) {
                                arrayList.add(0, new C2167408eO(new C0VSJ(str)));
                            }
                        }
                        arrayList.add(0, new C2167408eO(context));
                    }
                    int i4 = LJIIL;
                    if (i4 != 1) {
                        if (i4 != 2 && i4 != 3) {
                            throw new RuntimeException("Unsupported app type, we should not reach here");
                        }
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    C2167608eQ c2167608eQ = new C2167608eQ(context, i2);
                    LJI = c2167608eQ;
                    arrayList.add(0, c2167608eQ);
                    LIZ(context, arrayList);
                } else {
                    LJFF = null;
                    arrayList.add(0, new AbstractC2220208mu(context) { // from class: X.08my
                        @Override // X.AbstractC2220208mu
                        public final AbstractC2220508mx LJIIJJI() {
                            return new C2220708mz(this, this);
                        }
                    });
                }
            }
            AbstractC2167908eT[] abstractC2167908eTArr = (AbstractC2167908eT[]) arrayList.toArray(new AbstractC2167908eT[arrayList.size()]);
            ReentrantReadWriteLock reentrantReadWriteLock2 = LIZJ;
            reentrantReadWriteLock2.writeLock().lock();
            try {
                if ((LJIIJJI & 2) == 0) {
                    i3 = 0;
                }
                reentrantReadWriteLock2.writeLock().unlock();
                int length = abstractC2167908eTArr.length;
                while (true) {
                    int i5 = length - 1;
                    if (length > 0) {
                        boolean z = LIZ;
                        if (z) {
                            Api18TraceUtils.LIZ("SoLoader", "_", abstractC2167908eTArr[i5].getClass().getSimpleName());
                        }
                        abstractC2167908eTArr[i5].LIZIZ(i3);
                        if (z) {
                            Trace.endSection();
                        }
                        length = i5;
                    } else {
                        LIZLLL = abstractC2167908eTArr;
                        LJ.getAndIncrement();
                        LIZJ.writeLock().unlock();
                        return;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZJ.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            LIZJ.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean LJIIIZ(String str, String str2, int i, StrictMode.ThreadPolicy threadPolicy) {
        Object obj;
        if (!TextUtils.isEmpty(str2) && LJIIIZ.contains(str2)) {
            return false;
        }
        synchronized (C2167708eR.class) {
            try {
                HashSet<String> hashSet = LJII;
                if (hashSet.contains(str)) {
                    return false;
                }
                Map<String, Object> map = LJIIIIZZ;
                if (((HashMap) map).containsKey(str)) {
                    obj = ((HashMap) map).get(str);
                } else {
                    obj = new Object();
                    ((HashMap) map).put(str, obj);
                }
                ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
                reentrantReadWriteLock.readLock().lock();
                try {
                    synchronized (obj) {
                        try {
                            synchronized (C2167708eR.class) {
                                try {
                                    if (hashSet.contains(str)) {
                                        reentrantReadWriteLock.readLock().unlock();
                                        return false;
                                    }
                                    try {
                                        LIZJ(str, i, threadPolicy);
                                        synchronized (C2167708eR.class) {
                                            try {
                                                hashSet.add(str);
                                            } finally {
                                            }
                                        }
                                        if ((i & 16) == 0 && !TextUtils.isEmpty(str2)) {
                                            LJIIIZ.contains(str2);
                                        }
                                        reentrantReadWriteLock.readLock().unlock();
                                        return true;
                                    } catch (UnsatisfiedLinkError e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        String message = e.getMessage();
                                        if (message != null && message.contains("unexpected e_machine:")) {
                                            final String strSubstring = message.substring(message.lastIndexOf("unexpected e_machine:"));
                                            throw new UnsatisfiedLinkError(e, strSubstring) { // from class: X.08eS
                                                /* JADX WARN: Illegal instructions before constructor call */
                                                {
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("APK was built for a different platform. Supported ABIs: ");
                                                    sbLIZ.append(Arrays.toString(SysUtil.MarshmallowSysdeps.getSupportedAbis()));
                                                    sbLIZ.append(" error: ");
                                                    sbLIZ.append(strSubstring);
                                                    super(C2188811AlT.LIZIZ(sbLIZ));
                                                    initCause(e);
                                                }
                                            };
                                        }
                                        throw e;
                                    }
                                } finally {
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    LIZJ.readLock().unlock();
                    throw th2;
                }
            } finally {
            }
        }
    }
}

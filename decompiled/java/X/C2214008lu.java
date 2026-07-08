package X;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.08lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2214008lu {
    public static final String LIZ = new String(C2214108lv.LIZ);
    public static final String LIZIZ = new String(C2214108lv.LIZIZ);
    public static final String LIZJ = new String(C2214108lv.LIZJ);
    public static final String LIZLLL = new String(C2214108lv.LIZLLL);
    public static final String LJ = new String(C2214108lv.LJ);
    public static final String LJFF = new String(C2214108lv.LJFF);
    public static final HashSet<String> LJI = new HashSet<>();
    public static final HashSet<String> LJII = new HashSet<>();
    public static final HashSet<String> LJIIIIZZ = new HashSet<>();
    public static String LJIIIZ = null;
    public static int LJIIJ = 0;
    public static String LJIIJJI = null;
    public static String LJIIL = null;
    public static String LJIILIIL = null;
    public static boolean LJIILJJIL = false;
    public static final C1959407lw<Integer> LJIILL = new C1959407lw<>(new Class[0]);

    public static String LJFF() {
        String str = LJIIJJI;
        if (str != null) {
            return str;
        }
        String str2 = LIZ;
        HashSet<String> hashSet = LJII;
        if (hashSet.isEmpty() || hashSet.contains(str2)) {
            LJIIJJI = str2;
            return str2;
        }
        Iterator<String> it2 = hashSet.iterator();
        String next = null;
        while (it2.hasNext()) {
            next = it2.next();
            if (next.startsWith(str2)) {
                LJIIJJI = next;
                return next;
            }
        }
        LJIIJJI = next;
        return next;
    }

    public static void LJI() throws Throwable {
        if (LJIILJJIL || LJIIJ != 0) {
            return;
        }
        C1959407lw<Integer> c1959407lw = LJIILL;
        Object[] objArr = new Object[0];
        c1959407lw.getClass();
        Object objA0 = null;
        try {
            objA0 = C2204961BRm.a0(c1959407lw.LIZ, null, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyXcip6z9zDpDEXNOXezJrvzePURmqi8gah32wmJ+f7Rw==", null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Integer num = (Integer) objA0;
        if (num != null) {
            LJIIJ = num.intValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:6:0x0007, B:9:0x000f, B:11:0x001b, B:15:0x002a, B:17:0x0032, B:19:0x003a, B:13:0x0026, B:20:0x005b), top: B:29:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r5) {
        /*
            boolean r0 = X.C2214008lu.LJIILJJIL
            if (r0 != 0) goto L63
            java.util.HashSet<java.lang.String> r4 = X.C2214008lu.LJI
            monitor-enter(r4)
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5b
            if (r5 == 0) goto L5b
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = r0.dataDir     // Catch: java.lang.Throwable -> L5d
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L29
            X.0VSJ r0 = new X.0VSJ     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L5d
            r0.<init>(r1)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L5d
            java.lang.String r3 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L5d
            goto L2a
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
        L29:
            r3 = r1
        L2a:
            r4.add(r1)     // Catch: java.lang.Throwable -> L5d
            r4.add(r3)     // Catch: java.lang.Throwable -> L5d
            if (r3 == 0) goto L5b
            java.lang.String r2 = X.C2214008lu.LIZLLL     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r3.startsWith(r2)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L5d
            r1.append(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r5.getPackageName()     // Catch: java.lang.Throwable -> L5d
            r1.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = LIZLLL(r3)     // Catch: java.lang.Throwable -> L5d
            r4.add(r1)     // Catch: java.lang.Throwable -> L5d
            r4.add(r0)     // Catch: java.lang.Throwable -> L5d
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5d
            return
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5d
            throw r0
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2214008lu.LIZ(android.content.Context):void");
    }

    public static void LIZIZ(Context context) {
        if (!LJIILJJIL) {
            synchronized (LJIIIIZZ) {
                try {
                    for (String str : LJII) {
                        HashSet<String> hashSet = LJIIIIZZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str);
                        sbLIZ.append(LIZIZ);
                        sbLIZ.append("/");
                        sbLIZ.append(context.getPackageName());
                        hashSet.add(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static HashSet<String> LIZJ(Context context) {
        if (!LJIILJJIL) {
            HashSet<String> hashSet = LJII;
            synchronized (hashSet) {
                try {
                    if (hashSet.isEmpty() && context != null) {
                        try {
                            String str = LIZ;
                            if (new C0VSJ(str).exists()) {
                                hashSet.add(str);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        try {
                            String str2 = LIZJ + "/" + LJIIJ;
                            if (new C0VSJ(str2).exists()) {
                                LJII.add(str2);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        try {
                            LJII.addAll(LJ(context));
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                        if (Build.VERSION.SDK_INT > 28) {
                            HashSet<String> hashSet2 = LJII;
                            hashSet2.add(LIZ);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(LIZJ);
                            sbLIZ.append("/");
                            sbLIZ.append(LJIIJ);
                            hashSet2.add(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        HashSet hashSet3 = new HashSet();
                        for (String canonicalPath : LJII) {
                            if (!TextUtils.isEmpty(canonicalPath)) {
                                try {
                                    canonicalPath = new C0VSJ(canonicalPath).getCanonicalPath();
                                } catch (IOException e4) {
                                    TryCatchGuardChecker.doCheck(e4);
                                }
                            }
                            if (canonicalPath != null) {
                                hashSet3.add(canonicalPath);
                            }
                        }
                        LJII.addAll(hashSet3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJII;
    }

    public static String LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = LIZLLL;
        sbLIZ.append(str2);
        sbLIZ.append("/");
        if (str.startsWith(C2188811AlT.LIZIZ(sbLIZ))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJ);
            sbLIZ2.append("/");
            sbLIZ2.append(LJIIJ);
            sbLIZ2.append(str.substring(str2.length()));
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    public static List<String> LJ(Context context) {
        HashSet hashSet = new HashSet();
        try {
            StorageManager storageManager = (StorageManager) C786410Ut5.H2(context, "storage");
            Method declaredMethod = StorageManager.class.getDeclaredMethod(LJFF, new Class[0]);
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke(storageManager, new Object[0]);
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    hashSet.add(str);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new ArrayList(hashSet);
    }

    public static void LJII(Context context) {
        LJIIL = context.getApplicationInfo().dataDir;
        try {
            File fileX2 = C786410Ut5.x2(context);
            if (fileX2 != null) {
                String parent = fileX2.getParent();
                LJIILIIL = parent;
                if (parent != null) {
                    for (String str : LIZJ(context)) {
                        if (LJIILIIL.startsWith(str)) {
                            LJIIJJI = str;
                            return;
                        }
                    }
                    LJIILIIL = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

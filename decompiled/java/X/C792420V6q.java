package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792420V6q extends C792190V5t {
    public static C0V6P LIZJ = null;
    public static String LIZLLL = null;
    public static Boolean LJ = null;
    public static String LJFF = null;
    public static int LJI = -1;
    public static String LJII = null;
    public static int LJIIIIZZ = -1;
    public static String LJIIIZ = null;
    public static long LJIIJ = -1;
    public static long LJIIJJI = 0;
    public static int LJIIL = -1;
    public static JSONObject LJIILIIL = null;
    public static Map<String, String> LJIILJJIL = null;
    public static long LJIILL = -1;
    public static C793740VBs LJIILLIIL;

    public static int LIZIZ() {
        LIZJ.getClass();
        C792410V6p c792410V6pLJ = C792400V6o.LJ();
        if (c792410V6pLJ != null) {
            return c792410V6pLJ.LIZ;
        }
        return 0;
    }

    public static String LIZJ() {
        if (TextUtils.isEmpty(LJIIIZ)) {
            synchronized (C792420V6q.class) {
                try {
                    if (TextUtils.isEmpty(LJIIIZ)) {
                        ((C0V6O) LIZJ).getClass();
                        C792410V6p c792410V6pLJ = C792400V6o.LJ();
                        LJIIIZ = c792410V6pLJ != null ? c792410V6pLJ.LJI : null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIZ;
    }

    public static String LIZLLL() {
        if (LJFF == null) {
            synchronized (C792420V6q.class) {
                try {
                    if (LJFF == null) {
                        ((C0V6O) LIZJ).getClass();
                        C792410V6p c792410V6pLJ = C792400V6o.LJ();
                        LJFF = c792410V6pLJ != null ? c792410V6pLJ.LIZJ : null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public static String LJ() {
        if (LIZLLL == null) {
            synchronized (C792420V6q.class) {
                try {
                    if (LIZLLL == null) {
                        ((C0V6O) LIZJ).getClass();
                        LIZLLL = C792400V6o.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public static String LJFF() {
        LIZJ.getClass();
        C792410V6p c792410V6pLJ = C792400V6o.LJ();
        if (c792410V6pLJ != null) {
            return c792410V6pLJ.LIZIZ;
        }
        return null;
    }

    public static long LJI() {
        if (LJIIJJI <= 0) {
            LJIIJJI = System.currentTimeMillis();
        }
        return LJIIJJI;
    }

    public static String LJII() {
        if (LJIIL == -1) {
            synchronized (C792420V6q.class) {
                try {
                    if (LJIIL == -1) {
                        ((C0V6O) LIZJ).getClass();
                        C792410V6p c792410V6pLJ = C792400V6o.LJ();
                        LJIIL = c792410V6pLJ != null ? c792410V6pLJ.LJFF : 0;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return String.valueOf(LJIIL);
    }

    public static JSONObject LJIIIIZZ() {
        if (LJIILIIL == null) {
            synchronized (C792420V6q.class) {
                try {
                    if (LJIILIIL == null) {
                        ((C0V6O) LIZJ).getClass();
                        C792410V6p c792410V6pLJ = C792400V6o.LJ();
                        LJIILIIL = c792410V6pLJ != null ? c792410V6pLJ.LJII : null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILIIL;
    }

    public static long LJIIIZ() {
        if (LJIIJ < 0) {
            LJIIJ = System.currentTimeMillis();
        }
        return LJIIJ;
    }

    public static int LJIIJ() {
        if (LJI == -1) {
            synchronized (C792420V6q.class) {
                try {
                    if (LJI == -1) {
                        ((C0V6O) LIZJ).getClass();
                        C792410V6p c792410V6pLJ = C792400V6o.LJ();
                        LJI = c792410V6pLJ != null ? c792410V6pLJ.LIZLLL : 0;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public static Map<String, String> LJIIJJI() {
        if (LJIILJJIL == null) {
            HashMap map = new HashMap();
            LJIILJJIL = map;
            map.put("aid", String.valueOf(LIZIZ()));
            LJIILJJIL.put("os", "Android");
            LJIILJJIL.put("device_platform", "android");
            Map<String, String> map2 = LJIILJJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Build.VERSION.SDK_INT);
            sbLIZ.append("");
            map2.put("os_api", C2188811AlT.LIZIZ(sbLIZ));
            LJIILJJIL.put("update_version_code", String.valueOf(LJIIJ()));
            LJIILJJIL.put("version_code", LIZJ());
            LJIILJJIL.put("channel", LIZLLL());
            LJIILJJIL.put("device_model", Build.MODEL);
            LJIILJJIL.put("device_brand", Build.BRAND);
        }
        LJIILJJIL.put("device_id", LJFF());
        if (C792190V5t.LIZ()) {
            LJIILJJIL.put("_log_level", "debug");
        }
        try {
            Map<String, String> mapLIZ = C0V6O.LIZ();
            if (mapLIZ != null && mapLIZ.size() > 0) {
                for (Map.Entry<String, String> entry : mapLIZ.entrySet()) {
                    LJIILJJIL.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LJIILJJIL;
    }

    public static long LJIIL() {
        InterfaceC792440V6s interfaceC792440V6s;
        LIZJ.getClass();
        if (C792400V6o.LJ() == null || (interfaceC792440V6s = C792400V6o.LJI) == null) {
            return 0L;
        }
        return interfaceC792440V6s.getUid();
    }

    public static int LJIILIIL() {
        if (LJIIIIZZ == -1) {
            synchronized (C792420V6q.class) {
                try {
                    if (LJIIIIZZ == -1) {
                        ((C0V6O) LIZJ).getClass();
                        C792410V6p c792410V6pLJ = C792400V6o.LJ();
                        LJIIIIZZ = c792410V6pLJ != null ? c792410V6pLJ.LIZLLL : 0;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILJJIL() {
        /*
            java.lang.Boolean r0 = X.C792420V6q.LJ
            if (r0 != 0) goto L3b
            java.lang.Class<X.0V6q> r2 = X.C792420V6q.class
            monitor-enter(r2)
            java.lang.Boolean r0 = X.C792420V6q.LJ     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L1d
            java.lang.String r1 = LJ()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L2d
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L1f
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L35
            X.C792420V6q.LJ = r0     // Catch: java.lang.Throwable -> L35
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            goto L3b
        L1f:
            android.app.Application r0 = X.C792190V5t.LIZIZ     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L35
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L35
            X.C792420V6q.LJ = r0     // Catch: java.lang.Throwable -> L35
            goto L1d
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r0
        L3b:
            java.lang.Boolean r0 = X.C792420V6q.LJ
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C792420V6q.LJIILJJIL():boolean");
    }

    public static boolean LJIILL() {
        C793740VBs c793740VBs = LJIILLIIL;
        return c793740VBs != null && c793740VBs.LIZ;
    }
}

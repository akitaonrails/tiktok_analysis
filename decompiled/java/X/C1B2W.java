package X;

import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1B2W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B2W {
    public static long LIZJ;
    public static C1B2W LIZLLL;
    public final Map<String, C1B2X> LIZ = new ConcurrentHashMap();
    public final SharedPreferences LIZIZ;

    public static C1B2W LIZ() {
        if (LIZLLL == null) {
            synchronized (C1B2W.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1B2W();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public C1B2W() {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C1B2S.LIZ, 0, "sec_config");
        this.LIZIZ = sharedPreferencesLIZJ;
        LIZJ = sharedPreferencesLIZJ.getLong("valid_time", 900000L);
    }

    public final C1B2U LIZIZ(String str) {
        if (LIZJ(str)) {
            C1B2X c1b2x = (C1B2X) ((ConcurrentHashMap) this.LIZ).get(str);
            if (c1b2x != null) {
                return c1b2x.LIZIZ;
            }
            if (str.length() > 0) {
                C1B2X c1b2x2 = (C1B2X) ((ConcurrentHashMap) this.LIZ).get(str.substring(0, str.length() - 1));
                if (c1b2x2 != null) {
                    return c1b2x2.LIZIZ;
                }
            }
            if (str.length() > 0) {
                Map<String, C1B2X> map = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("/");
                C1B2X c1b2x3 = (C1B2X) ((ConcurrentHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
                if (c1b2x3 != null) {
                    return c1b2x3.LIZIZ;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final boolean LIZJ(String str) {
        boolean zLIZLLL;
        boolean zLIZLLL2 = LIZLLL(str);
        if (str.length() > 0) {
            zLIZLLL = LIZLLL(str.substring(0, str.length() - 1));
        } else {
            zLIZLLL = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/");
        boolean zLIZLLL3 = LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZLLL2 || zLIZLLL || zLIZLLL3) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(String str) {
        C1B2X c1b2x = (C1B2X) ((ConcurrentHashMap) this.LIZ).get(str);
        if (c1b2x == null) {
            return false;
        }
        if (System.currentTimeMillis() - c1b2x.LIZ > LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UrlSecLinkCache url : ");
            sbLIZ.append(str);
            sbLIZ.append(" exceed the time limit.");
            C2188811AlT.LIZIZ(sbLIZ);
            ((ConcurrentHashMap) this.LIZ).remove(str);
            Map<String, C1B2X> map = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("/");
            ((ConcurrentHashMap) map).remove(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        return true;
    }
}

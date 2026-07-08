package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11YF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11YF {
    public static volatile JSONObject LIZ;

    public static boolean LIZIZ() {
        boolean zLIZ = false;
        try {
            JSONObject jSONObjectLIZ = LIZ();
            if (jSONObjectLIZ == null || jSONObjectLIZ.optInt("v1") != 1) {
                return false;
            }
            zLIZ = C311110CHl.LIZ();
            return zLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLIZ;
        }
    }

    public static boolean LIZLLL() {
        boolean zLIZ = false;
        try {
            JSONObject jSONObjectLIZ = LIZ();
            if (jSONObjectLIZ == null || jSONObjectLIZ.optInt("v2") != 1) {
                return false;
            }
            zLIZ = C311110CHl.LIZ();
            return zLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return zLIZ;
        }
    }

    public static JSONObject LIZ() {
        JSONObject jSONObject;
        if (LIZ == null) {
            if (C0C64.LJIILLIIL().LJJ(31744, "tts_v2_entrance_opt_switch", "", true).length() > 0) {
                try {
                    jSONObject = new JSONObject(C0C64.LJIILLIIL().LJJ(31744, "tts_v2_entrance_opt_switch", "", true));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = null;
                }
                LIZ = jSONObject;
            }
        }
        return LIZ;
    }

    public static boolean LIZJ() {
        return (LIZIZ() || LIZLLL()) && C311110CHl.LIZ();
    }
}

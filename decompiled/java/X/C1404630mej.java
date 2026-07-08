package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404630mej {
    public static volatile JSONObject LIZ;

    public static boolean LIZIZ() {
        try {
            JSONObject jSONObjectLIZ = LIZ();
            if (jSONObjectLIZ != null) {
                if (jSONObjectLIZ.optInt("optimization_on") == 1) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZLLL() {
        JSONObject jSONObjectLIZ;
        try {
            JSONObject jSONObjectLIZ2 = LIZ();
            if (jSONObjectLIZ2 == null || jSONObjectLIZ2.optInt("audio_info_monitor_on") != 1 || (jSONObjectLIZ = LIZ()) == null || jSONObjectLIZ.optJSONObject("audio_metrics_params") == null) {
                return false;
            }
            return LJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static JSONObject LIZ() {
        JSONObject jSONObject;
        if (LIZ == null) {
            if (C0C64.LJIILLIIL().LJJ(31744, "audio_metrics_experiment", "", true).length() > 0) {
                try {
                    jSONObject = new JSONObject(C0C64.LJIILLIIL().LJJ(31744, "audio_metrics_experiment", "", true));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = null;
                }
                LIZ = jSONObject;
            }
        }
        return LIZ;
    }

    public static boolean LJ() {
        JSONObject jSONObjectLIZ;
        int i = Keva.getRepo("audio_metrics").getInt("audio_metrics_time", 0);
        try {
            jSONObjectLIZ = LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int iOptInt = jSONObjectLIZ != null ? jSONObjectLIZ.optInt("audio_metrics_interval") : 0;
        return i >= iOptInt;
    }

    public static String LIZJ() {
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObjectLIZ = LIZ();
            if (jSONObjectLIZ != null && (jSONObjectOptJSONObject = jSONObjectLIZ.optJSONObject("audio_metrics_params")) != null) {
                String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                if (strJ3 != null) {
                    return strJ3;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }
}

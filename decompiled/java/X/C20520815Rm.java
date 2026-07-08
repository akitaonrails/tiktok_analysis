package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15Rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20520815Rm {
    public static volatile JSONObject LIZ;

    public static JSONObject LIZ() {
        JSONObject jSONObject;
        if (LIZ == null) {
            if (C0C64.LJIILLIIL().LJJ(31744, "audio_metrics_experiment_consume", "", true).length() > 0) {
                try {
                    jSONObject = new JSONObject(C0C64.LJIILLIIL().LJJ(31744, "audio_metrics_experiment_consume", "", true));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = null;
                }
                LIZ = jSONObject;
            }
        }
        return LIZ;
    }

    public static int LIZIZ() {
        try {
            JSONObject jSONObjectLIZ = LIZ();
            if (jSONObjectLIZ != null) {
                return jSONObjectLIZ.optInt("sampling_rate");
            }
            return -1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }
}

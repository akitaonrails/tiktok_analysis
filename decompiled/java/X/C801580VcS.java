package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801580VcS {
    public static void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!jSONObject.has("opening") && !jSONObject.has("ending")) {
            if (jSONObject.has("Ending") || jSONObject.has("Opening")) {
                try {
                    jSONObject.optDouble("Opening");
                    jSONObject.optDouble("Ending");
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(e);
                    return;
                }
            }
            return;
        }
        try {
            jSONObject.optDouble("opening");
            jSONObject.optDouble("ending");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e2);
        }
    }
}

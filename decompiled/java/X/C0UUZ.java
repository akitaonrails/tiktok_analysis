package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUZ {
    public static void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("ts", C963140bAe.LIZIZ());
            jSONObject.put("tt_ntp", 1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZLLL(e.getMessage());
        }
    }
}

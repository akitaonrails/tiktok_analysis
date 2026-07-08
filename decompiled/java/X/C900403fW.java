package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C900403fW {
    public C901203fe LIZ;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            C901203fe c901203fe = this.LIZ;
            if (c901203fe != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("risk_info", c901203fe.LIZ);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                jSONObject.put("risk_review_info", jSONObject2);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C900403fW() {
    }

    public C900403fW(C901203fe c901203fe) {
        this.LIZ = c901203fe;
    }
}

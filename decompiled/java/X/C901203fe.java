package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C901203fe {
    public final String LIZ;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("risk_info", this.LIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C901203fe(String str) {
        this.LIZ = str;
    }
}

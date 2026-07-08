package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03hG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C911203hG {
    public final String LIZ;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_data", this.LIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C911203hG(String str) {
        this.LIZ = str;
    }
}

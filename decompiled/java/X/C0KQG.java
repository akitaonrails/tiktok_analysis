package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KQG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQG {
    public static C1791730wj5 LIZ(JSONObject jSONObject) {
        String str = "subs";
        if (!jSONObject.optString("product_type", "").equals("subs")) {
            str = "inapp";
        }
        return new C1791730wj5(jSONObject.optString("product_id"), str, jSONObject.optString("offer_id_token", ""));
    }

    public static C1791730wj5 LIZIZ(String str) {
        try {
            return LIZ(new JSONObject(str));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

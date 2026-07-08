package X;

import Y.ARunnableS17S1100000_12;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TKG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKG {
    public static final C0TKH LIZ = new C0TKH();

    public static void LIZ(Integer num, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "abtest_ab_sdk");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, num);
            jSONObject.put("client_layer_info", jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0TKI.LIZ(new ARunnableS17S1100000_12(jSONObject, 25));
    }
}

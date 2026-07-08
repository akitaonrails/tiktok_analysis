package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.092J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C092J {
    public int LIZ;
    public String LIZIZ;
    public JSONObject LIZJ;

    public static C092J LIZ(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C092J c092j = new C092J();
        c092j.LIZ = jSONObject.optInt("status_code", -1);
        c092j.LIZIZ = jSONObject.optString("status_msg", "Unknown error");
        if (jSONObject.has("data")) {
            try {
                c092j.LIZJ = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
                return c092j;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                String strOptString = jSONObject.optString("data");
                JSONObject jSONObject2 = new JSONObject();
                c092j.LIZJ = jSONObject2;
                jSONObject2.put("raw_data", strOptString);
            }
        }
        return c092j;
    }
}

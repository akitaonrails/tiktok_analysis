package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.140J, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C140J {
    public static boolean LIZIZ(String str) {
        String strOptString;
        C140S c140sLIZ;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("manifests");
            if (jSONObjectOptJSONObject != null && (strOptString = jSONObject.optString("active_manifest", "")) != null && strOptString.length() != 0 && (c140sLIZ = LIZ(jSONObjectOptJSONObject, strOptString)) != null) {
                C140H c140h = new C140H(c140sLIZ);
                ArrayList arrayList = new ArrayList();
                C140H.LIZ(c140h.LIZ, arrayList);
                if (arrayList.isEmpty()) {
                    return true;
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static C140S LIZ(JSONObject jSONObject, String str) {
        String strOptString;
        C140S c140sLIZ;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        C140S c140s = new C140S(jSONObjectOptJSONObject);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ingredients");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("active_manifest", "")) != null && (c140sLIZ = LIZ(jSONObject, strOptString)) != null) {
                    c140s.LIZIZ.add(c140sLIZ);
                }
            }
        }
        return c140s;
    }
}

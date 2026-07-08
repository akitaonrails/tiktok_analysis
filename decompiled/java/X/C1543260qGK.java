package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qGK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543260qGK {
    public static C1543440qGc LIZ(int i, String str, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", i);
        jSONObject2.put("msg", str);
        jSONObject2.put("data", jSONObject);
        return new C1543440qGc(jSONObject2);
    }
}

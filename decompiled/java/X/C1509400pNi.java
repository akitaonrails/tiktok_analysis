package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509400pNi {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZJ(int i, String str, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("range", i);
        jSONObject.put("session_id", str);
        jSONObject.put("rangeExcludeThis", z);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("function", "getRange");
        jSONObject2.put("params", jSONObject);
        jSONObject2.put("cache", true);
        return jSONObject2;
    }

    public static JSONObject LIZ(int i, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("range", i);
        jSONObject.put("aid", str);
        jSONObject.put("rangeExcludeThis", z);
        jSONObject.put("subsequent", z3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("function", "getRange");
        jSONObject2.put("params", jSONObject);
        jSONObject2.put("cache", z2);
        return jSONObject2;
    }
}

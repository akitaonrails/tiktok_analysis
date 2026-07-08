package X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191951AqX {
    public final int LIZ;
    public final JSONArray LIZIZ;

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", this.LIZ);
        JSONArray jSONArray = this.LIZIZ;
        if (jSONArray != null) {
            jSONObject.put("config_ids", jSONArray);
        }
        return jSONObject;
    }

    public final JSONObject LIZIZ(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", this.LIZ);
        jSONObject.put("value", obj);
        JSONArray jSONArray = this.LIZIZ;
        if (jSONArray != null) {
            jSONObject.put("config_ids", jSONArray);
        }
        return jSONObject;
    }

    public C2191951AqX(JSONArray jSONArray, int i) {
        this.LIZ = i;
        this.LIZIZ = jSONArray;
    }
}

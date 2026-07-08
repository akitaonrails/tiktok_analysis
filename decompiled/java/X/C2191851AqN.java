package X;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191851AqN {
    public final C2191951AqX LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final ConcurrentHashMap<Integer, C2192001Aqc> LIZLLL = new ConcurrentHashMap<>();

    public C2191851AqN(JSONObject jSONObject) {
        int iOptInt;
        this.LIZ = new C2191951AqX(jSONObject.optJSONArray("config_ids"), jSONObject.optInt("version", 0));
        this.LIZIZ = jSONObject.optInt("backoff_ratio", 0);
        this.LIZJ = jSONObject.optInt("max_request_frequency", 10);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("priorities");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("global_priority")) > 0) {
                    this.LIZLLL.put(Integer.valueOf(iOptInt), new C2192001Aqc(jSONObjectOptJSONObject));
                }
            }
        }
    }
}

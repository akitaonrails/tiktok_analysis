package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NBB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NBB {
    public final JSONObject LIZ;

    public C0NBB(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }

    public final void LIZIZ(Map<String, ? extends Object> map) throws JSONException {
        for (String str : map.keySet()) {
            LIZ(str, map.get(str));
        }
    }

    public final void LIZ(String str, Object obj) throws JSONException {
        this.LIZ.putOpt(str, obj);
    }
}

package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0524, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0524 {
    public static JSONArray LIZ(h hVar) {
        JSONArray jSONArray = new JSONArray();
        for (k kVar : hVar) {
            kVar.getClass();
            if (kVar instanceof n) {
                jSONArray.put(LIZIZ(kVar.LJIILIIL()));
            } else if (kVar instanceof h) {
                jSONArray.put(LIZ(kVar.LJIIL()));
            } else if (kVar instanceof m) {
                jSONArray.put(JSONObject.NULL);
            } else {
                jSONArray.put(kVar.LJIL());
            }
        }
        return jSONArray;
    }

    public static final JSONObject LIZIZ(n nVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, k> entry : nVar.entrySet()) {
            String key = entry.getKey();
            k value = entry.getValue();
            value.getClass();
            if (value instanceof n) {
                jSONObject.put(key, LIZIZ(value.LJIILIIL()));
            } else if (value instanceof h) {
                jSONObject.put(key, LIZ(value.LJIIL()));
            } else if (value instanceof m) {
                jSONObject.put(key, JSONObject.NULL);
            } else {
                jSONObject.put(key, value.LJIL());
            }
        }
        return jSONObject;
    }
}

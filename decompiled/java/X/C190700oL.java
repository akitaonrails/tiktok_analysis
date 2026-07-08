package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00oL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C190700oL {
    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null && jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    Object obj2 = jSONObject.get(next);
                    if ((obj2 instanceof JSONObject) && (obj instanceof JSONObject)) {
                        LIZ((JSONObject) obj2, (JSONObject) obj);
                    } else if ((obj2 instanceof JSONArray) && obj != null) {
                        JSONArray jSONArray = (JSONArray) obj2;
                        if (obj instanceof JSONArray) {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            for (int i = 0; i < jSONArray2.length(); i++) {
                                jSONArray.put(jSONArray2.get(i));
                            }
                        } else {
                            jSONArray.put(obj);
                        }
                    } else {
                        jSONObject.remove(next);
                        jSONObject.put(next, obj);
                    }
                } else {
                    jSONObject.put(next, obj);
                }
            }
        }
    }
}

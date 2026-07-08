package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837830Wtp {
    public static final JSONObject LIZIZ(C838040WuA c838040WuA) {
        Object obj = ((LinkedHashMap) c838040WuA.LIZLLL).get("certConfig");
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return null;
    }

    public static final void LIZ(C838040WuA c838040WuA, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        Object obj = ((LinkedHashMap) c838040WuA.LIZLLL).get("certConfig");
        if ((obj instanceof JSONObject) && (jSONObject2 = (JSONObject) obj) != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
            return;
        }
        c838040WuA.LIZLLL.put("certConfig", jSONObject);
    }
}

package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530940pwS {
    public static final JSONObject LIZ(JSONObject... jSONObjectArr) throws JSONException {
        Iterator<String> itKeys;
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null && (itKeys = jSONObject2.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject2.opt(next);
                    if (objOpt != null) {
                        jSONObject.put(next, objOpt);
                    }
                }
            }
        }
        return jSONObject;
    }
}

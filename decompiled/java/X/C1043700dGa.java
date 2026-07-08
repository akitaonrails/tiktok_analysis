package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043700dGa {
    public static final void LIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }
}

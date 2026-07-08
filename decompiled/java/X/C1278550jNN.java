package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jNN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278550jNN {
    public static final void LIZ(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (!jSONObject.has(str)) {
            jSONObject.put(str, obj);
        }
    }
}

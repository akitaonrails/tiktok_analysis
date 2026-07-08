package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03PA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PA {
    public static final void LIZ(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put(str, obj);
    }
}

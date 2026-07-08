package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488830oqX {
    public C1488830oqX(JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        jSONObject.put("state", "success");
        jSONObject.put("timestamp", jCurrentTimeMillis);
    }
}

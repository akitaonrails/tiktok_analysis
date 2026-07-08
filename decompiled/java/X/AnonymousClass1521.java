package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1521, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1521 {
    public final C204579153h LIZ;

    public AnonymousClass1521(C204579153h c204579153h) {
        this.LIZ = c204579153h;
    }

    public final void LIZ(String str, JSONObject jSONObject) throws JSONException {
        C204579153h c204579153h = this.LIZ;
        if (c204579153h != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event", str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("result", jSONObject);
            jSONObject3.put("code", 0);
            jSONObject2.put("payload", jSONObject3);
            jSONObject2.put("timestamp", System.currentTimeMillis());
            c204579153h.LJJJJ(C786410Ut5.J3(jSONObject2));
        }
    }
}

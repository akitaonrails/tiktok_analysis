package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191961AqY {
    public final C2191991Aqb LIZ;
    public final C2191991Aqb LIZIZ;
    public final C2191991Aqb LIZJ;

    public C2191961AqY(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("P0");
        this.LIZ = new C2191991Aqb(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("P1");
        this.LIZIZ = new C2191991Aqb(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("P2");
        this.LIZJ = new C2191991Aqb(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
    }
}

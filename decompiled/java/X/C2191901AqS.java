package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191901AqS {
    public final C2191951AqX LIZ;
    public final C2191961AqY LIZIZ;

    public C2191901AqS(JSONObject jSONObject) {
        this.LIZ = new C2191951AqX(jSONObject.optJSONArray("config_ids"), jSONObject.optInt("version", 0));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("config");
        this.LIZIZ = new C2191961AqY(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
    }
}

package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X91, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X91 {
    public final String LIZ;
    public final C0X90 LIZIZ;

    public C0X91(String str, JSONObject jSONObject) {
        this.LIZ = str;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("filter");
        if (jSONObjectOptJSONObject != null) {
            this.LIZIZ = new C0X90(jSONObjectOptJSONObject);
        }
    }
}

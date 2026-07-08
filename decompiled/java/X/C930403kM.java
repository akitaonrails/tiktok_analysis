package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C930403kM {
    public final String LIZ;
    public final C900703fZ LIZIZ;

    public C930403kM(JSONObject jSONObject) {
        this.LIZ = jSONObject.optString("card_bin");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payment_tips");
        if (jSONObjectOptJSONObject != null) {
            this.LIZIZ = new C900703fZ(jSONObjectOptJSONObject);
        }
    }
}

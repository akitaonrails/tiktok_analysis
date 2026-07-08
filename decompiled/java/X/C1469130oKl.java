package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469130oKl {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ;

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.LIZ = jSONObject.optInt("sub_id");
        this.LIZIZ = jSONObject.optInt("language_id");
        jSONObject.optString("format");
        this.LIZJ = jSONObject.optString("version");
    }
}

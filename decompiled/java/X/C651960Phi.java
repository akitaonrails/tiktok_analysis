package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Phi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651960Phi {
    public final /* synthetic */ C1051810dTf LIZ;

    public C651960Phi(C1543350qGT c1543350qGT) {
        this.LIZ = c1543350qGT;
    }

    public final void LIZ(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("msg", str);
        this.LIZ.LIZ(0, jSONObject, "failed");
    }

    public final void LIZIZ(JSONObject jSONObject) {
        this.LIZ.LIZ(1, jSONObject, "success");
    }
}

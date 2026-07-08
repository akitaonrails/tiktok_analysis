package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XB7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XB7 extends C0XB9 {
    public final C844770XBz LJ;

    public C0XB7(C844770XBz c844770XBz) {
        super(true, true);
        this.LJ = c844770XBz;
    }

    @Override // X.C0XB9
    public final boolean LIZ(JSONObject jSONObject) throws JSONException {
        String strLIZIZ = C0XB1.LIZIZ(this.LJ);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            jSONObject.put("cdid", strLIZIZ);
            return true;
        }
        return false;
    }

    @Override // X.C0XB9
    public final void LIZIZ(JSONObject jSONObject) {
        jSONObject.remove("cdid");
    }
}

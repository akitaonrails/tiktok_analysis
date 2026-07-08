package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792230wjt extends AbstractC1792180wjo {
    public final C1792240wju LIZLLL;
    public final String LJ = "livesdk_iap_get_subscription_entitlement";

    @Override // X.AbstractC1792180wjo
    public final String LIZ() {
        return this.LJ;
    }

    public C1792230wjt(C1792240wju c1792240wju) {
        this.LIZLLL = c1792240wju;
    }

    public final void LJFF(C1791560wio c1791560wio, C1792240wju c1792240wju) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("precheck_result", c1791560wio.LJIILIIL);
        jSONObject.put("merchant_id", c1792240wju.LIZIZ);
        jSONObject.put("sub_merchant_id", c1792240wju.LIZJ);
        jSONObject.put("to_user_id", c1792240wju.LIZLLL);
        if (c1791560wio.LJIILIIL == 0) {
            LJ(jSONObject);
        } else {
            LIZJ(c1791560wio, jSONObject);
        }
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C898303fB extends AbstractC915103ht {
    public String LJ;
    public String LJFF;
    public C900203fU LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;

    @Override // X.AbstractC915103ht
    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LJ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("nonce", str);
            C900203fU c900203fU = this.LJI;
            jSONObject.put("configuration", c900203fU == null ? "" : c900203fU.LIZLLL());
            String str2 = this.LJII;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("payment_reference", str2);
            String str3 = this.LJIIIIZZ;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("charge_id", str3);
            String str4 = this.LJII;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("payment_reference", str4);
            jSONObject.put("is_agreement", false);
            jSONObject.put("merchant_order_id", "");
            String str5 = this.LJFF;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("merchant_user_id", str5);
            String str6 = this.LJIIL;
            jSONObject.put("pipo_error_code_params", str6 != null ? str6 : "");
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }

    @Override // X.AbstractC915103ht
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mNonce='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mMerchantUserId='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mRequestConfiguration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mPaymentReference='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mChargeId='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mIsAgreement=");
        sbLIZ.append(false);
        sbLIZ.append(", mMerchantOrderId='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", baseRequest='");
        sbLIZ.append(super.toString());
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZLLL(String str) {
        this.LJ = str;
    }
}

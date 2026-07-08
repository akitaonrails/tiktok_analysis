package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03h5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C910103h5 extends AbstractC916103i3 {
    public C910003h4 LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public C911203hG LJIIJ;
    public String LJIIJJI;
    public EnumC934003kw LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;

    @Override // X.AbstractC916103i3
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mResultCode", this.LIZJ);
            jSONObject.put("mErrorCode", this.LIZLLL);
            jSONObject.put("mErrorMessage", this.LJ);
            C910003h4 c910003h4 = this.LJFF;
            jSONObject.put("mRedirectDetails", c910003h4 == null ? "" : c910003h4.toString());
            jSONObject.put("mPaymentMethodDetails", this.LJI);
            jSONObject.put("mExpirationTime", this.LJII);
            jSONObject.put("mPaymentMethodToken", this.LJIIIIZZ);
            jSONObject.put("mPresentToShopperDetails", this.LJIIIZ);
            jSONObject.put("mChannelSdkInfo", this.LJIIJ);
            jSONObject.put("mPayId", this.LJIIJJI);
            jSONObject.put("mStatus", this.LJIIL);
            jSONObject.put("mLogId", this.LJIILIIL);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C910103h5() {
    }

    public C910103h5(String str) {
        C911203hG c911203hG;
        super(str);
        try {
            this.LIZLLL = this.LIZ.optString("error_code");
            this.LJ = this.LIZ.optString("error_message");
            this.LJII = this.LIZ.optString("expiration_time");
            this.LJI = this.LIZ.optString("payment_method_details");
            this.LJIIIIZZ = this.LIZ.optString("payment_method_token");
            this.LJFF = C910003h4.LIZ(this.LIZ.optJSONObject("redirect_details"));
            this.LIZJ = this.LIZ.optString("result_code");
            this.LJIIIZ = this.LIZ.optString("present_to_shopper_details");
            JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject("channel_sdk_info");
            if (jSONObjectOptJSONObject == null) {
                c911203hG = null;
            } else {
                c911203hG = new C911203hG(jSONObjectOptJSONObject.optString("sdk_data"));
            }
            this.LJIIJ = c911203hG;
            this.LJIIJJI = this.LIZ.optString("pay_id");
            this.LJIIL = EnumC934003kw.getOrderStatus(this.LIZ.optString("order_status"));
            this.LJIILIIL = this.LIZ.optString("logid");
            this.LJIILJJIL = this.LIZ.optString("pipo_error_action");
            this.LJIILL = this.LIZ.optString("action_infos");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

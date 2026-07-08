package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C910303h7 extends AbstractC916103i3 {
    public C910003h4 LJFF;
    public C911203hG LJI;
    public String LJII;

    public C910303h7() {
    }

    public C910303h7(String str) {
        C911203hG c911203hG;
        super(str);
        try {
            this.LIZLLL = this.LIZ.optString("error_code");
            this.LJ = this.LIZ.optString("error_message");
            this.LIZ.optString("expiration_time");
            this.LIZ.optString("payment_method_details");
            this.LJFF = C910003h4.LIZ(this.LIZ.optJSONObject("redirect_details"));
            this.LIZ.optString("payment_method_token");
            this.LIZ.optString("present_to_shopper_details");
            this.LIZ.optString("merchant_order_id");
            JSONObject jSONObjectOptJSONObject = this.LIZ.optJSONObject("channel_sdk_info");
            if (jSONObjectOptJSONObject == null) {
                c911203hG = null;
            } else {
                c911203hG = new C911203hG(jSONObjectOptJSONObject.optString("sdk_data"));
            }
            this.LJI = c911203hG;
            this.LIZ.optString("pay_expiration_time");
            this.LIZ.optString("pay_id");
            this.LIZ.optString("upload_return_url");
            this.LIZ.optBoolean("retryable");
            this.LJII = this.LIZ.optString("pipo_error_action");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.android.gms.wallet.PaymentData;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834330WoB {
    public static JSONArray LIZ(PaymentData paymentData) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(new JSONObject(paymentData.zzg), "paymentMethodData");
        String string = JSONObjectProtectorUtils.getString(jSONObject3, "type");
        JSONObject jSONObject4 = JSONObjectProtectorUtils.getJSONObject(jSONObject3, "info");
        String string2 = JSONObjectProtectorUtils.getString(jSONObject4, "cardNetwork");
        String strOptString = jSONObject4.optString("cardFundingSource");
        String string3 = JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(jSONObject3, "tokenizationData"), "token");
        String string4 = JSONObjectProtectorUtils.getString(jSONObject4, "cardDetails");
        JSONObject[] jSONObjectArr = new JSONObject[5];
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_pi_tokenization_data");
        jSONObject5.put("param_name", "pi_tokenization_data");
        jSONObject5.put("param_value", string3);
        jSONObjectArr[0] = jSONObject5;
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_pi_type");
        jSONObject6.put("param_name", "pi_type");
        jSONObject6.put("param_value", string);
        jSONObjectArr[1] = jSONObject6;
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_pi_network");
        jSONObject7.put("param_name", "pi_network");
        jSONObject7.put("param_value", string2);
        jSONObjectArr[2] = jSONObject7;
        if (strOptString.length() > 0) {
            jSONObject = new JSONObject();
            jSONObject.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_card_funding_source");
            jSONObject.put("param_name", "card_funding_source");
            jSONObject.put("param_value", strOptString);
        } else {
            jSONObject = null;
        }
        jSONObjectArr[3] = jSONObject;
        if (string4.length() > 0) {
            jSONObject2 = new JSONObject();
            jSONObject2.put("element", "eg_pi_ptw_googlepay_c_d_global_googlepay_fpan_last_four");
            jSONObject2.put("param_name", "fpan_last_four");
            jSONObject2.put("param_value", string4);
        } else {
            jSONObject2 = new JSONObject();
        }
        jSONObjectArr[4] = jSONObject2;
        return new JSONArray((Collection) C13LQ.LJIJI(jSONObjectArr));
    }
}

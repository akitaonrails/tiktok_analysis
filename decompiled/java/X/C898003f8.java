package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03f8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C898003f8 extends AbstractC915103ht {
    public String LJ;
    public String LJFF;
    public C900203fU LJI;
    public String LJII;
    public C03S9 LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public List<C902303fp> LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public boolean LJIJJ;
    public String LJIJJLI;

    @Override // X.AbstractC915103ht
    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.LJ;
            if (obj == null) {
                obj = "";
            }
            jSONObject.put("amount", obj);
            Object obj2 = this.LJFF;
            if (obj2 == null) {
                obj2 = "";
            }
            jSONObject.put("charge_id", obj2);
            C900203fU c900203fU = this.LJI;
            if (c900203fU != null) {
                jSONObject.put("configuration", c900203fU.LIZLLL());
            }
            Object obj3 = this.LJII;
            if (obj3 == null) {
                obj3 = "";
            }
            jSONObject.put("currency", obj3);
            C03S9 c03s9 = this.LJIIIIZZ;
            if (c03s9 != null) {
                jSONObject.put("payment_method", c03s9.LIZ());
            }
            Object obj4 = this.LJIIIZ;
            if (obj4 == null) {
                obj4 = "";
            }
            jSONObject.put("payment_reference", obj4);
            Object obj5 = this.LJIIJ;
            if (obj5 == null) {
                obj5 = "";
            }
            jSONObject.put("return_url", obj5);
            Object obj6 = this.LJIIJJI;
            if (obj6 == null) {
                obj6 = "";
            }
            jSONObject.put("risk_info", obj6);
            jSONObject.put("store_payment_method", this.LJIIL);
            jSONObject.put("update_payment_method", this.LJIILIIL);
            Object obj7 = this.LJIILJJIL;
            if (obj7 == null) {
                obj7 = "";
            }
            jSONObject.put("sub_merchant_id", obj7);
            Object obj8 = this.LJIILL;
            if (obj8 == null) {
                obj8 = "";
            }
            jSONObject.put("nonce", obj8);
            Object obj9 = this.LJIILLIIL;
            if (obj9 == null) {
                obj9 = "";
            }
            jSONObject.put("merchant_user_id", obj9);
            jSONObject.put("deeplink", "");
            Object obj10 = this.LJIJ;
            if (obj10 != null) {
                jSONObject.put("payment_amount", obj10);
            }
            Object obj11 = this.LJIJI;
            if (obj11 != null) {
                jSONObject.put("payment_currency", obj11);
            }
            jSONObject.put("is_use_payment_amount", this.LJIJJ);
            if (this.LJIIZILJ != null) {
                JSONArray jSONArray = new JSONArray();
                for (C902303fp c902303fp : this.LJIIZILJ) {
                    c902303fp.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("amount", c902303fp.LIZ);
                        jSONObject2.put("payment_method", c902303fp.LIZIZ.LIZ());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("payment_details", jSONArray);
            }
            Object obj12 = this.LJIJJLI;
            if (obj12 != null) {
                jSONObject.put("pipo_error_code_params", obj12);
                return jSONObject;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return jSONObject;
    }

    @Override // X.AbstractC915103ht
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mAmount='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mChargeId='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mRequestConfiguration=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mCurrency='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mPaymentMethodInfo=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mPaymentReference='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mReturnUrl='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mRiskInfo='");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mNeedStorePaymentMethod=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", mUpdatePaymentMethod=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", mPaymentAmount=");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append(", mPaymentCurrency=");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(", mIsUsePaymentAmount=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", mSubMerchantId='");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", mNonce='");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append('\'');
        sbLIZ.append(", baseRequest='");
        sbLIZ.append(super.toString());
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZLLL(String str) {
        this.LJIIJ = str;
    }
}

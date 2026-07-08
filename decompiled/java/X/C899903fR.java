package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.03fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C899903fR extends AbstractC916103i3 {
    public final String LJFF;
    public final String LJI;
    public final JSONArray LJII;
    public final JSONArray LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final Boolean LJIIL;
    public final Boolean LJIILIIL;
    public final Boolean LJIILJJIL;
    public final Boolean LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final String LJIL;
    public final String LJJ;
    public final String LJJI;
    public final String LJJIFFI;
    public C900703fZ LJJII;
    public List<C900603fY> LJJIII;
    public List<C902103fn> LJJIIJ;
    public final String LJJIIJZLJL;
    public final String LJJIIZ;
    public final String LJJIIZI;

    @Override // X.AbstractC916103i3
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetUnifiedBinDetailResponse{cardBrand='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", cardType='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", cardBrandLength=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", cvvLength=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", validateSucc=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", validateMessage='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", currencyCode='");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", isPersonalUse=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", isPrepaid=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(", isGift=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", isVirtualCard=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(", issuerName='");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", issuerCountryCode='");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append('\'');
        sbLIZ.append(", issuerCountryName='");
        sbLIZ.append(this.LJIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", issuerWebsite='");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append('\'');
        sbLIZ.append(", issuerPhone='");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append('\'');
        sbLIZ.append(", issuerAddress='");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", issuerCity='");
        sbLIZ.append(this.LJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", issuerZipCode='");
        sbLIZ.append(this.LJJIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", paymentMethod='");
        sbLIZ.append(this.LJJIIZI);
        sbLIZ.append('\'');
        sbLIZ.append(", riskDecision='");
        sbLIZ.append(this.LJJ);
        sbLIZ.append('\'');
        sbLIZ.append(", riskMessage='");
        sbLIZ.append(this.LJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", pipoErrorAction='");
        sbLIZ.append(this.LJJIIJZLJL);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C899903fR() {
    }

    public C899903fR(String str) {
        ArrayList arrayList;
        super(str);
        try {
            this.LJFF = this.LIZ.optString("card_brand");
            this.LJI = this.LIZ.optString("card_type");
            this.LJIILIIL = Boolean.valueOf(this.LIZ.optBoolean("is_prepaid"));
            this.LJII = this.LIZ.optJSONArray("card_brand_length");
            this.LJIIIIZZ = this.LIZ.optJSONArray("cvv_length");
            this.LJIIIZ = Boolean.valueOf(this.LIZ.optBoolean("validate_succ"));
            this.LJIIJ = this.LIZ.optString("validate_message");
            this.LJIIJJI = this.LIZ.optString("currency_code");
            this.LJIIL = Boolean.valueOf(this.LIZ.optBoolean("is_personal_use"));
            this.LJIILJJIL = Boolean.valueOf(this.LIZ.optBoolean("is_gift"));
            this.LJIILL = Boolean.valueOf(this.LIZ.optBoolean("is_virtual_card"));
            this.LJIILLIIL = this.LIZ.optString("issuer_name");
            this.LJIIZILJ = this.LIZ.optString("issuer_country_code");
            this.LJIJ = this.LIZ.optString("issuer_country_name");
            this.LJIJI = this.LIZ.optString("issuer_website");
            this.LJIJJ = this.LIZ.optString("issuer_phone");
            this.LJIJJLI = this.LIZ.optString("issuer_address");
            this.LJIL = this.LIZ.optString("issuer_city");
            this.LJJIIZ = this.LIZ.optString("issuer_zip_code");
            this.LJJIIZI = this.LIZ.optString("payment_method");
            this.LJJ = this.LIZ.optString("risk_decision");
            this.LJJI = this.LIZ.optString("risk_msg");
            this.LJJIFFI = this.LIZ.optString("decision");
            this.LJJII = new C900703fZ(this.LIZ.optJSONObject("payment_tips"));
            JSONArray jSONArrayOptJSONArray = this.LIZ.optJSONArray("cashier_pre_check_infos");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList2.add(new C900603fY(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i)));
                }
            }
            this.LJJIII = arrayList2;
            JSONArray jSONArrayOptJSONArray2 = this.LIZ.optJSONArray("element_error_list");
            if (jSONArrayOptJSONArray2 == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    arrayList.add(new C902103fn(jSONArrayOptJSONArray2.optJSONObject(i2)));
                }
            }
            this.LJJIIJ = arrayList;
            this.LJJIIJZLJL = this.LIZ.optString("pipo_error_action");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

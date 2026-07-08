package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03hr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C914903hr extends AbstractC915103ht {
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;

    @Override // X.AbstractC915103ht
    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LJ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("merchant_id", str);
            String str2 = this.LJFF;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("merchant_user_id", str2);
            String str3 = this.LJI;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("payment_method_id", str3);
            String str4 = this.LJII;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("country_or_region", str4);
            String str5 = this.LJIIIIZZ;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("card_number", str5);
            String str6 = this.LJIIIZ;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("cvv", str6);
            String str7 = this.LJIIJJI;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("currency", str7);
            String str8 = this.LJIIJ;
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("amount", str8);
            String str9 = this.LJIIL;
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("expiration_month", str9);
            String str10 = this.LJIILIIL;
            if (str10 == null) {
                str10 = "";
            }
            jSONObject.put("expiration_year", str10);
            String str11 = this.LJIILJJIL;
            if (str11 == null) {
                str11 = "";
            }
            jSONObject.put("holder_name", str11);
            String str12 = this.LJIILLIIL;
            if (str12 == null) {
                str12 = "";
            }
            jSONObject.put("nonce", str12);
            jSONObject.put("email", "");
            String str13 = this.LJIILL;
            jSONObject.put("identity", str13 != null ? str13 : "");
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // X.AbstractC915103ht
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetInstallmentAndCaryTypeRequest{merchantId='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", merchantUserId='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", paymentMethodId='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", countryOrRegion='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", cardNumber='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", cvv='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", amount='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", currency='");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append('\'');
        sbLIZ.append(", expirationMonth='");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", expirationYear='");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", holderName='");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append('\'');
        sbLIZ.append(", email='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", identity='");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append('\'');
        sbLIZ.append(", nonce='");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

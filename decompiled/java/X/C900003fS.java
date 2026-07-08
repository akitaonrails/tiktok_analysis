package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C900003fS extends AbstractC915103ht {
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
    public boolean LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;

    @Override // X.AbstractC915103ht
    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("card_number", "");
            String str = this.LJ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("merchant_user_id", str);
            String str2 = this.LJFF;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("nonce", str2);
            String str3 = this.LJI;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("country_code", str3);
            String str4 = this.LJII;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("card_encrypt_number", str4);
            String str5 = this.LJIIIIZZ;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("biz_merchant_id", str5);
            String str6 = this.LJIIIZ;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("risk_info", str6);
            String str7 = this.LJIIJ;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("language", str7);
            String str8 = this.LJIIJJI;
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("biz_type", str8);
            String str9 = this.LJIIL;
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("full_name", str9);
            String str10 = this.LJIILIIL;
            if (str10 == null) {
                str10 = "";
            }
            jSONObject.put("payment_method_id", str10);
            String str11 = this.LJIILJJIL;
            if (str11 == null) {
                str11 = "";
            }
            jSONObject.put("pipo_error_code_params", str11);
            String str12 = this.LJIILLIIL;
            if (str12 == null) {
                str12 = "";
            }
            jSONObject.put("pc_product_code", str12);
            String str13 = this.LJIIZILJ;
            jSONObject.put(Scene.SCENE_SERVICE, str13 != null ? str13 : "");
            jSONObject.put("is_hsafsa_available", this.LJIILL);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // X.AbstractC915103ht
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetUnifiedBinDetailRequest{cardNumber='");
        sbLIZ.append((String) null);
        sbLIZ.append('\'');
        sbLIZ.append(", merchantUserId='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", nonce='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", countryCode='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", cardEncryptNumber='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", bizMerchantId='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", riskInfo='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", language='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", pcProductCode='");
        sbLIZ.append(this.LJIILLIIL);
        sbLIZ.append('\'');
        sbLIZ.append(", scene='");
        sbLIZ.append(this.LJIIZILJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

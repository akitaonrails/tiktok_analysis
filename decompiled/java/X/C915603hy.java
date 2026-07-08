package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03hy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C915603hy extends AbstractC915103ht {
    public final String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;

    @Override // X.AbstractC915103ht
    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("country_or_region", this.LJ);
            jSONObject.put("merchant_user_id", this.LJII);
            String str = this.LJFF;
            if (str != null) {
                jSONObject.put("bank_code", str);
            }
            String str2 = this.LJI;
            if (str2 != null) {
                jSONObject.put("nonce", str2);
                return jSONObject;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    @Override // X.AbstractC915103ht
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InstallmentCardBinRequest{countryCode = '");
        sbLIZ.append(this.LJ);
        sbLIZ.append("', bankCode = '");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("', merchantUserId = '");
        sbLIZ.append(this.LJII);
        sbLIZ.append("', nonce = ''}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C915603hy(String str) {
        this.LJ = str;
    }
}

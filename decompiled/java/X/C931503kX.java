package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C931503kX {
    public List<Integer> LIZ;
    public final JSONArray LIZIZ;
    public final String LIZJ;
    public final JSONArray LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final List<Integer> LIZ() {
        if (this.LIZ == null) {
            this.LIZ = new ArrayList();
            if (this.LIZIZ != null) {
                for (int i = 0; i < this.LIZIZ.length(); i++) {
                    try {
                        this.LIZ.add((Integer) this.LIZIZ.get(i));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        }
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mCvvLength=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mCardBrandRegex='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mCardBrandLength=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mCardBrandDisplayName='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mCardBrand='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mPaymentMethodId='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C931503kX(JSONObject jSONObject) {
        this.LIZIZ = jSONObject.optJSONArray("cvv_length");
        this.LIZJ = jSONObject.optString("card_brand_regex");
        this.LIZLLL = jSONObject.optJSONArray("card_brand_length");
        this.LJ = jSONObject.optString("card_brand_display_name");
        this.LJFF = jSONObject.optString("card_brand");
        this.LJI = jSONObject.optString("payment_method_id");
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C915203hu extends AbstractC915103ht {
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public C915803i0 LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;

    @Override // X.AbstractC915103ht
    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("merchant_id", this.LJ);
            jSONObject.put("merchant_user_id", this.LJFF);
            jSONObject.put("payment_method_id", this.LJI);
            jSONObject.put("country_or_region", this.LJII);
            jSONObject.put("card_number", this.LJIIIIZZ);
            jSONObject.put("cvv", this.LJIIIZ);
            jSONObject.put("expiration_month", this.LJIIJJI);
            jSONObject.put("expiration_year", this.LJIIJ);
            jSONObject.put("holder_name", this.LJIIL);
            jSONObject.put("currency", this.LJIILL);
            jSONObject.put("amount", this.LJIILJJIL);
            C915803i0 c915803i0 = this.LJIILIIL;
            if (c915803i0 != null) {
                jSONObject.put("billing_address", c915803i0.LIZ());
                return jSONObject;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }
}

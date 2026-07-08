package X;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Y9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03Y9 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public List<String> LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public List<C03YE> LJIIJ;

    public final JSONObject LIZ() throws JSONException {
        if (!this.LJFF) {
            if (this.LIZ == null) {
                throw new IllegalArgumentException("need totalPrice");
            }
            if (this.LIZIZ == null) {
                throw new IllegalArgumentException("need countryCode");
            }
            if (this.LIZJ == null) {
                throw new IllegalArgumentException("need currencyCode");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("totalPrice", this.LIZ);
            jSONObject.put("countryCode", this.LIZIZ);
            jSONObject.put("currencyCode", this.LIZJ);
            jSONObject.put("totalPriceStatus", "FINAL");
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("countryCode", this.LIZIZ);
        jSONObject2.put("currencyCode", this.LIZJ);
        jSONObject2.put("tokenUpdateUrl", this.LJI);
        jSONObject2.put("managementUrl", this.LJII);
        jSONObject2.put("recurrenceComposition", this.LJIIIIZZ);
        jSONObject2.put("billingAgreement", this.LJIIIZ);
        jSONObject2.put("immediateTotalPrice", this.LIZ);
        if (this.LJIIJ != null) {
            JSONArray jSONArray = new JSONArray();
            List<C03YE> list = this.LJIIJ;
            if (list != null) {
                for (C03YE c03ye : list) {
                    c03ye.getClass();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("label", C13LN.LJZL(90, c03ye.LIZ));
                    jSONObject3.put("price", c03ye.LIZIZ);
                    jSONObject3.put("priceStatus", c03ye.LIZJ);
                    jSONObject3.put("recurrencePeriod", c03ye.LIZLLL);
                    jSONObject3.put("recurrencePeriodCount", c03ye.LJ);
                    jSONArray.put(jSONObject3);
                }
            }
            jSONObject2.put("recurrenceItems", jSONArray);
        }
        return jSONObject2;
    }

    public C03Y9(String str, String str2, String str3, List list, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        list = (i & 8) != 0 ? C13BV.INSTANCE : list;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = null;
        this.LJFF = false;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
    }
}

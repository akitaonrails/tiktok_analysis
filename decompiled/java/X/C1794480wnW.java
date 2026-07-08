package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794480wnW extends C1793980wmi {
    public final C1792170wjn LIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJII;
    public String LJIIIIZZ;
    public int LJIIIZ;
    public AbstractC1794600wni LJIIJ;
    public AbstractC1791620wiu LJIIJJI;
    public C1794370wnL LJIIL;
    public final EnumC1794260wnA LJIILIIL;
    public final long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public volatile boolean LJIJI;
    public volatile boolean LJIJJ;
    public volatile boolean LJIJJLI;
    public volatile boolean LJIL;
    public EnumC1791830wjF LJJ;
    public String LJJI;
    public String LJJII;
    public String LJJIII;
    public String LIZIZ = "";
    public String LJI = "";
    public String LJJIFFI = "";

    public final String LIZLLL() {
        String str = this.LJ;
        return str != null ? str : "";
    }

    public final String LJ() {
        String str;
        return (TextUtils.isEmpty(this.LJJII) || TextUtils.isEmpty(this.LJJIII) || ((str = this.LJJII) != null && str.startsWith("newstr"))) ? !TextUtils.isEmpty(this.LJ) ? this.LJ : this.LIZJ : this.LJJIII;
    }

    public final void LJFF() {
        String str = this.LIZ.LJFF;
        this.LIZIZ = str;
        if (str == null || str.isEmpty()) {
            C1792170wjn c1792170wjn = this.LIZ;
            if (c1792170wjn.LJIIJJI) {
                return;
            }
            this.LIZJ = c1792170wjn.LJIIIZ;
            this.LIZLLL = c1792170wjn.LJ;
            if (c1792170wjn.LJIIL.containsKey("OfferIDToken")) {
                this.LJI = this.LIZ.LJIIL.get("OfferIDToken");
            }
            this.LJJ = EnumC1791830wjF.GOOGLE;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.LIZIZ);
            if (!jSONObject.optBoolean("is_generic", false)) {
                if (jSONObject.optInt("SubscriptionMode", -1) > 0) {
                    String strOptString = jSONObject.optString("MerchantSubscriptionID");
                    this.LJ = strOptString;
                    if (strOptString.equals("")) {
                        this.LJ = jSONObject.optString("OrderID");
                    }
                    this.LIZLLL = jSONObject.optString("UserID");
                    this.LIZJ = jSONObject.optString("ProductID");
                    this.LJI = jSONObject.optString("OfferIDToken");
                    this.LJJ = EnumC1791830wjF.GOOGLE;
                    return;
                }
                this.LJ = jSONObject.optString("order_id");
                this.LIZLLL = jSONObject.optString("merchant_user_id");
                this.LIZJ = new JSONObject(jSONObject.optString("goods_detail")).optString("product_id");
                String strOptString2 = jSONObject.optString("payment_method");
                EnumC1791830wjF enumC1791830wjF = EnumC1791830wjF.GOOGLE;
                if (TextUtils.equals(strOptString2, enumC1791830wjF.channelName)) {
                    this.LJJ = enumC1791830wjF;
                    return;
                }
                EnumC1791830wjF enumC1791830wjF2 = EnumC1791830wjF.AMAZON;
                if (!TextUtils.equals(strOptString2, enumC1791830wjF2.channelName)) {
                    throw new RuntimeException("invalid payment_method!");
                }
                this.LJJ = enumC1791830wjF2;
                return;
            }
            this.LJ = jSONObject.optString("order_id");
            this.LIZJ = jSONObject.optString("product_id");
            this.LIZLLL = jSONObject.optString("user_id");
            this.LIZ.LIZIZ = jSONObject.optString("merchant_id");
            this.LJI = jSONObject.optString("offer_id_token", "");
            String strOptString3 = jSONObject.optString("base_path");
            if (!TextUtils.isEmpty(strOptString3)) {
                try {
                    if (strOptString3.endsWith("/")) {
                        strOptString3 = strOptString3.substring(0, strOptString3.length() - 1);
                    }
                    this.LJFF = strOptString3;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            String strOptString4 = jSONObject.optString("payment_method");
            EnumC1791830wjF enumC1791830wjF3 = EnumC1791830wjF.GOOGLE;
            if (TextUtils.equals(strOptString4, enumC1791830wjF3.channelName)) {
                this.LJJ = enumC1791830wjF3;
            } else {
                EnumC1791830wjF enumC1791830wjF4 = EnumC1791830wjF.AMAZON;
                if (TextUtils.equals(strOptString4, enumC1791830wjF4.channelName)) {
                    this.LJJ = enumC1791830wjF4;
                } else {
                    this.LJJ = enumC1791830wjF3;
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("account_ids");
            this.LJII = jSONObject.optString("payment_scenario");
            if (jSONObjectOptJSONObject != null && LJII().booleanValue()) {
                this.LJJII = jSONObjectOptJSONObject.optString("account_token");
                this.LJJIII = jSONObjectOptJSONObject.optString("profile_token");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("gp_sub_info");
            if (jSONObjectOptJSONObject2 != null) {
                this.LJIIIIZZ = jSONObjectOptJSONObject2.optString("purchase_token");
                this.LJIIIZ = jSONObjectOptJSONObject2.optInt("proration_mode", -1);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:19:0x0040, B:12:0x0021, B:14:0x0027, B:16:0x0035), top: B:31:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LJII() {
        /*
            r6 = this;
            X.0wjn r0 = r6.LIZ
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            boolean r0 = r0.LJII
            if (r0 == 0) goto L1f
            r0 = 1
        Lb:
            if (r0 == 0) goto L55
            X.0wgi r0 = X.C1794240wn8.LJIIIIZZ()
            X.0wn8 r0 = (X.C1794240wn8) r0
            X.0wk7 r0 = r0.LIZLLL()
            java.lang.String r1 = r6.LJII
            r0.getClass()
            if (r1 == 0) goto L40
            goto L21
        L1f:
            r0 = 0
            goto Lb
        L21:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Exception -> L49
            if (r0 != 0) goto L40
            java.lang.String r0 = "iap_exp_rtdn_for_subs"
            java.util.Map r0 = X.C1795410wp1.LIZIZ(r0)     // Catch: java.lang.Exception -> L49
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L49
            java.lang.Double r0 = (java.lang.Double) r0     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L4e
            double r3 = r0.doubleValue()     // Catch: java.lang.Exception -> L49
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
            goto L4f
        L40:
            java.lang.String r0 = "live_iap_sub_assemble_exp"
            int r0 = X.C1795410wp1.LIZJ(r0, r2)     // Catch: java.lang.Exception -> L49
            if (r0 != r5) goto L4e
            goto L4f
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L50
        L4e:
            r5 = 0
        L4f:
            r2 = r5
        L50:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1794480wnW.LJII():java.lang.Boolean");
    }

    public final void LJI(AbstractC1794600wni abstractC1794600wni) {
        this.LJIIJ = abstractC1794600wni;
        if (abstractC1794600wni != null && abstractC1794600wni.LJIIIZ) {
            if (TextUtils.isEmpty(this.LJJIII)) {
                this.LJJIII = abstractC1794600wni.LJIIJJI;
            }
            if (TextUtils.isEmpty(this.LJJII)) {
                this.LJJII = abstractC1794600wni.LJIIJ;
            }
        }
    }

    public C1794480wnW(C1792170wjn c1792170wjn, EnumC1794260wnA enumC1794260wnA) {
        this.LJIILIIL = EnumC1794260wnA.NOMAL;
        this.LJIILJJIL = c1792170wjn.LJIILJJIL;
        this.LJIILIIL = enumC1794260wnA;
        this.LIZ = c1792170wjn;
        this.LJFF = c1792170wjn.LJIIIIZZ;
        LJFF();
        if (TextUtils.isEmpty(this.LIZLLL)) {
            this.LIZLLL = c1792170wjn.LJ;
        }
        if (TextUtils.isEmpty(this.LIZJ)) {
            this.LIZJ = c1792170wjn.LJIIIZ;
        }
        if (TextUtils.isEmpty(this.LJ) && (c1792170wjn instanceof C1791780wjA)) {
            this.LJ = ((C1791780wjA) c1792170wjn).LJIILLIIL;
        }
    }
}

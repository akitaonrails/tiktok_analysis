package X;

import com.bytedance.globalpayment.service.manager.PaymentServiceManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wno, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794660wno extends C1793980wmi {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final HashMap<String, ?> LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;

    public static final void LIZLLL(JSONObject jSONObject) {
        C1793980wmi.LIZIZ("billing_country_code", PaymentServiceManager.get().getGoogleIapExternalService().getBillingCountryCode(), jSONObject);
    }

    public static JSONObject LJII(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof C1795900wpo) {
                C1795900wpo c1795900wpo = (C1795900wpo) obj;
                Object obj2 = c1795900wpo.LIZJ;
                jSONObject.put("offer_token", obj2);
                JSONObject jSONObject2 = new JSONObject();
                Matcher matcher = PatternProtector.compile(".*jsonString='(.*)', parsedJson=*").matcher(c1795900wpo.LIZIZ.toString());
                if (matcher.find()) {
                    try {
                        jSONObject2 = new JSONObject(matcher.group(1));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (jSONObject2.has("localizedIn")) {
                    jSONObject2.remove("localizedIn");
                }
                if (jSONObject2.has("subscriptionOfferDetails")) {
                    JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "subscriptionOfferDetails");
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject3 = (JSONObject) jSONArray.get(i);
                        if (JSONObjectProtectorUtils.getString(jSONObject3, "offerIdToken").equals(obj2)) {
                            if (jSONObject3.has("pricingPhases")) {
                                jSONObject3.remove("pricingPhases");
                            }
                            jSONObject2.put("subscriptionOfferDetails", jSONObject3);
                        } else {
                            i++;
                        }
                    }
                }
                jSONObject.put("product_details", jSONObject2);
                return jSONObject;
            }
            return jSONObject;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return jSONObject;
        }
    }

    public final void LJ(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1793980wmi.LIZIZ("payment_attempt_id", this.LJIIJJI, jSONObject);
            C1793980wmi.LIZIZ("client_flow", this.LJIIL, jSONObject);
            C1793980wmi.LIZIZ("product_id", this.LJ, jSONObject);
            C1793980wmi.LIZIZ("request_id", this.LJFF, jSONObject);
            C1793980wmi.LIZIZ("iap_billing_application_lifecycle", str, jSONObject);
            C1793980wmi.LIZIZ("biz_content", this.LJIIJ, jSONObject);
            LIZJ(this.LJIIIZ, jSONObject);
            InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
            EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
            C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
            c1794310wnF.getClass();
            C1794940woG.LIZ(c1794310wnF, enumC1794330wnH, "livesdk_iap_billing_app_lifecycle_change", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("monitorGoogleBillingAPPLifeCycle");
        }
    }

    public final void LJFF(String str) {
        JSONObject jSONObject = new JSONObject();
        C1793980wmi.LIZIZ("payment_attempt_id", this.LJIIJJI, jSONObject);
        C1793980wmi.LIZIZ("client_flow", this.LJIIL, jSONObject);
        C1793980wmi.LIZIZ("product_id", this.LJ, jSONObject);
        C1793980wmi.LIZIZ("request_id", this.LJFF, jSONObject);
        C1793980wmi.LIZIZ("billing_cashier_state", str, jSONObject);
        C1793980wmi.LIZIZ("biz_content", this.LJIIJ, jSONObject);
        LIZJ(this.LJIIIZ, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        LIZLLL(jSONObject2);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.BOTH;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_billing_cashier_state", jSONObject, jSONObject2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r11, java.lang.String r12, java.lang.String r13, long r14, X.C1792840wks r16) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1794660wno.LJI(int, java.lang.String, java.lang.String, long, X.0wks):void");
    }

    public C1794660wno(String str, String str2, String str3, String str4, String str5, boolean z, EnumC1794260wnA enumC1794260wnA, HashMap<String, ?> map, String str6) {
        this.LJ = str;
        this.LJFF = str2;
        this.LJII = z;
        if (str3 != null) {
            this.LJI = str3;
        }
        if (enumC1794260wnA != null) {
            this.LJIIIIZZ = enumC1794260wnA.getValue();
        } else {
            this.LJIIIIZZ = -1;
        }
        this.LJIIIZ = map;
        this.LJIIJ = str6;
        this.LJIIJJI = str4;
        this.LJIIL = str5;
    }
}

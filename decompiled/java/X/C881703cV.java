package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto.RiskContextContent;
import com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto.RiskContextRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.TTSProbeHeaderInterceptor;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03cV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C881703cV {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);

    public static void LIZ(String str, String str2, PaymentMethodInfo paymentMethodInfo, n nVar) {
        String str3;
        String strOptString;
        String str4;
        String str5;
        String str6;
        String str7;
        PaymentApi paymentApi;
        String strLIZIZ;
        String str8;
        C914303hl.LIZ.getClass();
        if (C914303hl.LIZIZ == null) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LJ("NonceHelper.cashier is null");
            return;
        }
        if (Intrinsics.LJFF(paymentMethodInfo.isChooseSave(), Boolean.TRUE)) {
            str3 = "pay_and_bind";
        } else {
            str3 = "pay";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<PaymentElement> list = paymentMethodInfo.paymentElements;
        if (list != null) {
            for (PaymentElement paymentElement : list) {
                String str9 = paymentElement.paramName;
                if (str9 != null && (str8 = paymentElement.paramValue) != null) {
                    linkedHashMap.put(str9, str8);
                }
            }
        }
        C1724230uyD.LIZ.getClass();
        JSONObject jSONObject = C1724230uyD.LIZIZ;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("device_fp_id");
        } else {
            strOptString = null;
        }
        nVar.LJJIIJ("device_fp_id", strOptString);
        C914303hl.LIZ.getClass();
        Cashier cashier = C914303hl.LIZIZ;
        if (cashier != null) {
            str4 = cashier.countryOrRegion;
        } else {
            str4 = null;
        }
        Cashier cashier2 = C914303hl.LIZIZ;
        if (cashier2 != null) {
            str5 = cashier2.merchantUserId;
        } else {
            str5 = null;
        }
        String str10 = paymentMethodInfo.id;
        if (str10 != null) {
            C03SY.LIZ.getClass();
            if (C03SY.LJIJ(str10) && (strLIZIZ = C03SY.LIZIZ(str10)) != null) {
                str10 = strLIZIZ;
            }
        } else {
            str10 = null;
        }
        String str11 = paymentMethodInfo.token;
        Cashier cashier3 = C914303hl.LIZIZ;
        if (cashier3 != null) {
            str6 = cashier3.nonce;
        } else {
            str6 = null;
        }
        RiskContextContent riskContextContent = new RiskContextContent(str, str4, str5, str3, str10, str11, linkedHashMap, nVar, str6, null);
        C877403bo c877403bo = PaymentApi.LIZ;
        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(riskContextContent);
        Cashier cashier4 = C914303hl.LIZIZ;
        if (cashier4 != null) {
            str7 = cashier4.merchantId;
        } else {
            str7 = null;
        }
        RiskContextRequest riskContextRequest = new RiskContextRequest(strLJIIIIZZ, str7, LIZ.format(new Date()), null);
        c877403bo.getClass();
        if (C1008803x0.LIZ()) {
            InterfaceC859903Xp interfaceC859903XpCreateBuilder = C877403bo.LIZJ.createBuilder(str2);
            interfaceC859903XpCreateBuilder.LIZ(new TTSProbeHeaderInterceptor());
            paymentApi = (PaymentApi) interfaceC859903XpCreateBuilder.build().create(PaymentApi.class);
        } else {
            paymentApi = (PaymentApi) C877403bo.LIZJ.createBuilder(str2).build().create(PaymentApi.class);
        }
        paymentApi.LJIILIIL(riskContextRequest, C1020403ys.LIZ()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.03cW
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PaymentPreRiskHelper@c685.paymentRiskContext$2");
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("response: ");
                sbLIZ.append(C1741890vQh.LJIIIIZZ(obj));
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ2);
                C1C7U.LIZIZ("PaymentPreRiskHelper@c685.paymentRiskContext$2");
            }
        }, new C09JN() { // from class: X.03Yh
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PaymentPreRiskHelper@c685.paymentRiskContext$3");
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("throwable: ");
                sbLIZ.append(((Throwable) obj).getMessage());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LJ(strLIZIZ2);
                C1C7U.LIZIZ("PaymentPreRiskHelper@c685.paymentRiskContext$3");
            }
        });
    }
}

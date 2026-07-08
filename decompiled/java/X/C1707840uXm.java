package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.ab.PipoTTLSParamsCheckV2Settings;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPricingPlanMarketingTool;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CashierBasicInfoData;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetails;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.PayRequest;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.utils.QueryStatusManager;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707840uXm {
    public final Context LIZ;
    public final CashierKey LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public String LJII;
    public final String LJIIIIZZ;
    public final C1712020ueW LJIIIZ;
    public final InterfaceC1707330uWx LJIIJ;
    public final C1708990uZd LJIIJJI;
    public final String LJIIL;
    public final C1709570uaZ LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public Configuration LJIILLIIL;

    public static void LIZIZ(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTLSPostPayment, ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(String str) {
        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle_pay_info");
        sbLIZ.append(", pay_response illegal, return, reason: ");
        sbLIZ.append(str);
        c1708720uZCLIZ.LIZ(5, C2188811AlT.LIZIZ(sbLIZ));
        CashierKey cashierKey = this.LIZIZ;
        EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_CLIENT_ERROR_API_RESPONSE_FORMAT_ERROR;
        C1707910uXt.LJFF(cashierKey, enumC1707350uWz.getErrorCode(), enumC1707350uWz.getErrorMessage(), null, 72);
    }

    public final void LJFF(CashierKey cashierKey) {
        if (Intrinsics.LJFF(cashierKey, this.LIZIZ)) {
            C1707520uXG c1707520uXG = new C1707520uXG(this);
            C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
            String str = this.LIZIZ.payRequestId;
            if (str == null) {
                str = "";
            }
            c1708030uY5.LIZ(new C1708070uY9(str)).LIZJ("query_result", null);
            if (this.LJIIJJI.LJIIJ) {
                C1708710uZB.LIZ("Cashier").LIZ(6, "close webview manually");
                C1714410uiN c1714410uiN = C1714410uiN.LIZ;
                String string = this.LIZIZ.toString();
                c1714410uiN.getClass();
                C1714410uiN.LIZ(string);
            }
            QueryStatusManager.LIZJ(new QueryStatusManager(EnumC1707210uWl.QUERY_TRADE_RESULT, c1707520uXG, this.LIZIZ.payRequestId), this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJII, null, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, 32);
            return;
        }
        C1708710uZB.LIZ("Cashier").LIZ(6, "cashier_key not match, return");
        C1707910uXt.LJIIIIZZ.remove(cashierKey);
    }

    public final void LIZLLL(C1707300uWu c1707300uWu, C1709570uaZ c1709570uaZ, final InterfaceC1707310uWv interfaceC1707310uWv) throws JSONException {
        List listLLIIII;
        CashierBasicInfoData cashierBasicInfoData;
        InterfaceC1707310uWv interfaceC1707310uWv2 = new InterfaceC1707310uWv(interfaceC1707310uWv) { // from class: X.0uXr
            public final InterfaceC1707310uWv LIZ;

            {
                this.LIZ = interfaceC1707310uWv;
            }

            @Override // X.InterfaceC1707310uWv
            public final void onSuccess(String str) {
                C1708700uZA c1708700uZALIZ = C1708090uYB.LIZ("Cashier");
                c1708700uZALIZ.LIZLLL("pay_api", "success");
                c1708700uZALIZ.LIZJ(str);
                this.LIZ.onSuccess(str);
            }

            @Override // X.InterfaceC1707310uWv
            public final void LIZ(String str, String str2, String str3) {
                C1708700uZA c1708700uZALIZ = C1708090uYB.LIZ("Cashier");
                c1708700uZALIZ.LIZLLL("pay_api", "fail");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("errorCode=");
                sbLIZ.append(str);
                sbLIZ.append(", errorContent=");
                sbLIZ.append(str2);
                c1708700uZALIZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LIZ(str, str2, str3);
            }
        };
        C1708700uZA c1708700uZALIZ = C1708090uYB.LIZ("Cashier");
        c1708700uZALIZ.LIZLLL("pay_api", "start");
        c1708700uZALIZ.LIZJ(c1707300uWu);
        String strLJIIJ = c1707300uWu.LJII;
        if (strLJIIJ == null) {
            if (c1709570uaZ != null) {
                strLJIIJ = c1709570uaZ.LJIIJ();
            } else {
                strLJIIJ = null;
            }
        }
        this.LJIILJJIL = strLJIIJ;
        PayRequestPaymentDetails payRequestPaymentDetails = c1707300uWu.LJIIIIZZ;
        Configuration configuration = payRequestPaymentDetails.configuration;
        this.LJIILLIIL = configuration;
        this.LJIILL = configuration.f390did;
        String str = c1707300uWu.LIZJ;
        String str2 = c1707300uWu.LIZLLL;
        String str3 = c1707300uWu.LJI;
        String str4 = c1707300uWu.LJ;
        String str5 = c1707300uWu.LJFF;
        List<PayRequestPaymentDetailItem> list = payRequestPaymentDetails.paymentDetailItems;
        boolean z = payRequestPaymentDetails.storePM;
        String str6 = payRequestPaymentDetails.returnLink;
        Integer num = payRequestPaymentDetails.commuteType;
        List<CBIPricingPlanMarketingTool> list2 = payRequestPaymentDetails.marketingInfoList;
        String str7 = payRequestPaymentDetails.paymentConsult;
        C1710930ucl.LIZ.getClass();
        PayRequest payRequest = new PayRequest(str, str2, null, str3, str4, str5, list, z, str6, strLJIIJ, num, configuration, list2, str7, C1710930ucl.LIZIZ("cashier", "payment"), 4, null);
        try {
            String strLIZ = PipoTTLSParamsCheckV2Settings.LIZ("pay");
            if (strLIZ != null && C123100dR.LIZ(strLIZ)) {
                JSONObject jSONObject = new JSONObject();
                if (c1709570uaZ != null && (cashierBasicInfoData = c1709570uaZ.LJFF) != null) {
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(cashierBasicInfoData);
                    if (strLJI != null) {
                        jSONObject.put("cbi_pay_info", new JSONObject(strLJI));
                    }
                }
                C1227904rF.LIZ.getClass();
                String strLJI2 = C1227904rF.LJI(payRequest);
                if (strLJI2 != null) {
                    jSONObject.put("pay_request", new JSONObject(strLJI2));
                }
                IPipoService iPipoService = (IPipoService) ServiceManager.get().getService(IPipoService.class);
                if (c1709570uaZ != null) {
                    listLLIIII = C13LP.LLIIII(c1709570uaZ.LJJIIJ);
                } else {
                    listLLIIII = null;
                }
                iPipoService.LJIILL("pipo_ttls_cashier", strLIZ, "", jSONObject, listLLIIII, null);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (c1707300uWu.LIZ.length() > 0) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1707240uWo(c1707300uWu, payRequest, interfaceC1707310uWv2, null), 2);
        } else {
            EnumC1707350uWz enumC1707350uWz = EnumC1707350uWz.PAY_RESULT_CLIENT_ERROR_PARAM_ERROR;
            interfaceC1707310uWv2.LIZ(String.valueOf(enumC1707350uWz.getErrorCode()), enumC1707350uWz.getErrorMessage(), null);
        }
    }

    public final void LJ(C1707140uWe c1707140uWe, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("item", "post_payment_before_notify_result");
        jSONObject.put("reason", str);
        jSONObject.put("result", str2);
        String str3 = c1707140uWe.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("action", str3);
        C1708610uZ1.LIZIZ(this.LIZIZ.payRequestId).LJIIIZ(C2097908Jt.LIZJ(new Pair("msg", C786410Ut5.J3(jSONObject))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r30, java.lang.String r31, X.C1707790uXh r32, X.C1709570uaZ r33, boolean r34) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1707840uXm.LIZ(android.content.Context, java.lang.String, X.0uXh, X.0uaZ, boolean):boolean");
    }

    public C1707840uXm(Context context, CashierKey cashierKey, String str, String str2, String str3, String str4, String str5, String str6, C1712020ueW c1712020ueW, C1707800uXi c1707800uXi, C1708990uZd c1708990uZd, String str7, C1709570uaZ c1709570uaZ, String str8, String str9, Configuration configuration, int i) {
        C1712020ueW c1712020ueW2 = c1712020ueW;
        String str10 = str6;
        String str11 = str5;
        C1709570uaZ c1709570uaZ2 = c1709570uaZ;
        String str12 = str7;
        C1707800uXi c1707800uXi2 = c1707800uXi;
        Configuration configuration2 = configuration;
        String str13 = str9;
        String str14 = str8;
        context = (i & 1) != 0 ? null : context;
        str11 = (i & 64) != 0 ? null : str11;
        str10 = (i & 256) != 0 ? null : str10;
        c1712020ueW2 = (i & 512) != 0 ? null : c1712020ueW2;
        c1707800uXi2 = (i & 1024) != 0 ? null : c1707800uXi2;
        str12 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str12;
        c1709570uaZ2 = (i & 8192) != 0 ? null : c1709570uaZ2;
        str14 = (i & 16384) != 0 ? null : str14;
        str13 = (32768 & i) != 0 ? null : str13;
        configuration2 = (i & 65536) != 0 ? null : configuration2;
        this.LIZ = context;
        this.LIZIZ = cashierKey;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str11;
        this.LJII = null;
        this.LJIIIIZZ = str10;
        this.LJIIIZ = c1712020ueW2;
        this.LJIIJ = c1707800uXi2;
        this.LJIIJJI = c1708990uZd;
        this.LJIIL = str12;
        this.LJIILIIL = c1709570uaZ2;
        this.LJIILJJIL = str14;
        this.LJIILL = str13;
        this.LJIILLIIL = configuration2;
    }
}

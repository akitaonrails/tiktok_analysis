package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.RedirectDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1707850uXn extends C1707690uXX {
    public static C1708230uYP LJI;
    public final Context LIZ;
    public final C1707840uXm LIZIZ;
    public final C1707790uXh LIZJ;
    public final C1708990uZd LIZLLL;
    public final C1709570uaZ LJ;
    public final C1707670uXV LJFF;

    public final void LIZ(RedirectDetails redirectDetails) {
        String str;
        String str2;
        PaymentOption paymentOptionLJJIJIIJI;
        PODaInfo pODaInfo;
        String str3;
        PaymentOption paymentOptionLJJIJ;
        String strLJIL;
        PaymentOption paymentOptionLJJIJIIJI2;
        String strLJIL2;
        C1708030uY5 c1708030uY5 = C1708030uY5.LIZ;
        String str4 = this.LIZIZ.LIZIZ.payRequestId;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        Map<String, String> map = null;
        c1708030uY5.LIZ(new C1708070uY9(str4)).LIZJ("open_web", null);
        System.currentTimeMillis();
        Map<String, String> map2 = redirectDetails.header;
        if (map2 != null) {
            str = map2.get("three_ds_del_mid_page");
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "true");
        C1714410uiN c1714410uiN = C1714410uiN.LIZ;
        Context context = this.LIZ;
        String str6 = redirectDetails.url;
        if (str6 == null) {
            str6 = "";
        }
        if (zLJFF) {
            str2 = redirectDetails.method;
            map = redirectDetails.body;
        } else {
            str2 = null;
        }
        InterfaceC1712360uf4 interfaceC1712360uf4 = new InterfaceC1712360uf4() { // from class: X.0uXo
            /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
            @Override // X.InterfaceC1712360uf4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ() {
                /*
                    r4 = this;
                    X.0uY5 r2 = X.C1708030uY5.LIZ
                    X.0uY9 r1 = new X.0uY9
                    X.0uXn r0 = r4.LIZ
                    X.0uXm r0 = r0.LIZIZ
                    com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey r0 = r0.LIZIZ
                    java.lang.String r0 = r0.payRequestId
                    if (r0 != 0) goto L10
                    java.lang.String r0 = ""
                L10:
                    r1.<init>(r0)
                    X.0uY2 r3 = r2.LIZ(r1)
                    r1 = 0
                    java.lang.String r0 = "open_web"
                    r2 = 1
                    r3.LIZIZ(r0, r1, r1, r2)
                    X.0uXn r1 = r4.LIZ
                    X.0uaZ r0 = r1.LJ
                    if (r0 == 0) goto L38
                    X.0uZd r0 = r0.LJIIZILJ
                    if (r0 == 0) goto L38
                    boolean r0 = r0.LJIIJ
                    if (r0 != r2) goto L38
                    X.0uXm r0 = r1.LIZIZ
                    com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey r1 = r0.LIZIZ
                    java.util.ArrayList<com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey> r0 = X.C1707910uXt.LJIIIIZZ
                    boolean r0 = r0.contains(r1)
                    if (r0 != 0) goto L45
                L38:
                    X.0uXn r0 = r4.LIZ
                    X.0uXm r0 = r0.LIZIZ
                    com.ss.android.ugc.aweme.pipo.cashier.cashier.CashierKey r2 = r0.LIZIZ
                    java.lang.String r1 = "redirect_pay_flow_web_commute_app"
                    java.lang.String r0 = "web page close"
                    X.C1707910uXt.LIZLLL(r2, r1, r0)
                L45:
                    X.0uYP r2 = X.C1707850uXn.LJI
                    if (r2 == 0) goto L5d
                    X.0qPN r1 = new X.0qPN
                    r1.<init>()
                    java.lang.String r0 = "biz_open_order_detail"
                    r1.LJI(r0, r2)
                    X.0qPN r1 = new X.0qPN
                    r1.<init>()
                    java.lang.String r0 = "pipo_handle_unexpected_biz_destroy"
                    r1.LJI(r0, r2)
                L5d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1707860uXo.LIZIZ():void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [X.0qPP, X.0uYP] */
            @Override // X.InterfaceC1712360uf4
            public final void LIZ(SparkActivity sparkActivity, String str7) {
                C1707850uXn c1707850uXn = this.LIZ;
                if (c1707850uXn.LIZJ.LIZ) {
                    C1714410uiN c1714410uiN2 = C1714410uiN.LIZ;
                    String string = c1707850uXn.LIZIZ.LIZIZ.toString();
                    c1714410uiN2.getClass();
                    C1714410uiN.LIZIZ.put(string, str7);
                }
                C1707840uXm c1707840uXm = this.LIZ.LIZIZ;
                ?? r2 = new InterfaceC1548890qPP(c1707840uXm.LIZIZ, sparkActivity, str7, c1707840uXm.LJI) { // from class: X.0uYP
                    public final CashierKey LL;
                    public final C19EG LLILLJJLI;
                    public final String LLILLL;
                    public final String LLILZ;

                    @Override // X.InterfaceC1548890qPP
                    public final void onEvent(String str8, String str9) {
                        C19EG c19eg;
                        String str10;
                        C1708720uZC c1708720uZCLIZ = C1708710uZB.LIZ("Cashier");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PaymentSuccessSubscriber, handling event: ");
                        sbLIZ.append(str8);
                        c1708720uZCLIZ.LIZ(4, C2188811AlT.LIZIZ(sbLIZ));
                        if (Intrinsics.LJFF(str8, "pipo_handle_unexpected_biz_destroy") && (c19eg = this.LLILLJJLI) != null && (str10 = this.LLILZ) != null) {
                            SmartRouter.buildRoute(c19eg, str10).open();
                        }
                        if (C123100dR.LIZ(str9)) {
                            try {
                                String strOptString = new JSONObject(str9).optString("pay_request_id");
                                C1708720uZC c1708720uZCLIZ2 = C1708710uZB.LIZ("Cashier");
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("PaymentSuccessSubscriber, handling event, input p_r_id: ");
                                sbLIZ2.append(strOptString);
                                c1708720uZCLIZ2.LIZ(4, C2188811AlT.LIZIZ(sbLIZ2));
                                if (C123100dR.LIZ(strOptString) && !TextUtils.equals(strOptString, this.LL.payRequestId)) {
                                    return;
                                } else {
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                        C19EG c19eg2 = this.LLILLJJLI;
                        if (c19eg2 != null) {
                            if (!c19eg2.isFinishing() && !c19eg2.isDestroyed()) {
                                c19eg2.finish();
                                return;
                            }
                            return;
                        }
                        String str11 = this.LLILLL;
                        if (str11 != null) {
                            SparkContext.Companion.getClass();
                            InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str11);
                            if (interfaceC1059280dfiLIZ != null) {
                                interfaceC1059280dfiLIZ.close();
                            }
                        }
                    }

                    {
                        this.LL = cashierKey;
                        this.LLILLJJLI = sparkActivity;
                        this.LLILLL = str7;
                        this.LLILZ = str;
                    }
                };
                C1707850uXn.LJI = r2;
                new C1548870qPN().LJFF("biz_open_order_detail", r2);
                new C1548870qPN().LJFF("pipo_handle_unexpected_biz_destroy", r2);
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str7 = this.LIZIZ.LIZIZ.payRequestId;
        if (str7 != null) {
            str5 = str7;
        }
        linkedHashMap.put("pay_request_id", str5);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_request_id", this.LIZIZ.LIZIZ.payRequestId);
        C1709570uaZ c1709570uaZ = this.LIZIZ.LJIILIIL;
        if (c1709570uaZ != null && (paymentOptionLJJIJIIJI2 = c1709570uaZ.LJJIJIIJI()) != null && (strLJIL2 = paymentOptionLJJIJIIJI2.LJIL()) != null) {
            jSONObject.put("payment_method_id", strLJIL2);
        }
        C1709570uaZ c1709570uaZ2 = this.LIZIZ.LJIILIIL;
        if (c1709570uaZ2 != null && (paymentOptionLJJIJ = c1709570uaZ2.LJJIJ()) != null && (strLJIL = paymentOptionLJJIJ.LJIL()) != null) {
            jSONObject.put("hybrid_payment_method_id", strLJIL);
        }
        C1709570uaZ c1709570uaZ3 = this.LIZIZ.LJIILIIL;
        if (c1709570uaZ3 != null && (paymentOptionLJJIJIIJI = c1709570uaZ3.LJJIJIIJI()) != null && (pODaInfo = paymentOptionLJJIJIIJI.trackInfo) != null && (str3 = pODaInfo.bankCode) != null) {
            jSONObject.put("bank_code", str3);
        }
        linkedHashMap.put("pipo_additional_tracking_params", C786410Ut5.J3(jSONObject));
        C1714410uiN.LIZLLL(c1714410uiN, context, str6, interfaceC1712360uf4, true, linkedHashMap, this.LIZLLL, null, str2, map, 160);
    }

    public C1707850uXn(Context context, C1707840uXm c1707840uXm, C1707120uWc c1707120uWc, String str, C1707790uXh c1707790uXh, C1708990uZd c1708990uZd, C1709570uaZ c1709570uaZ, C1707670uXV c1707670uXV) {
        this.LIZ = context;
        this.LIZIZ = c1707840uXm;
        this.LIZJ = c1707790uXh;
        this.LIZLLL = c1708990uZd;
        this.LJ = c1709570uaZ;
        this.LJFF = c1707670uXV;
    }
}

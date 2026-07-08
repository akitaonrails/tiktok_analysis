package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.cashier.agentbridge.SelectionBankCardDetail;
import com.ss.android.ugc.aweme.pipo.cashier.agentbridge.SelectionPaymentMethodInfo;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ufs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.PIPOCashierAgentBridgeImpl$openInstrumentsChangePage$1", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {344}, m = "invokeSuspend")
public final class C1712860ufs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<C0DFT, Unit> LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C1712870uft LLILZ;
    public final /* synthetic */ C1712960ug2 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1712860ufs(Function1<? super C0DFT, Unit> function1, Context context, C1712870uft c1712870uft, C1712960ug2 c1712960ug2, InterfaceC1364105Vn<? super C1712860ufs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = context;
        this.LLILZ = c1712870uft;
        this.LLILZIL = c1712960ug2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1712860ufs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0foN, X.0ug3] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0foN, X.0ufr] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1712890ufv c1712890ufv = new C1712890ufv(this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1712890ufv);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1");
                return objLJFF;
            }
        }
        C1712990ug5 c1712990ug5 = (C1712990ug5) obj;
        if (c1712990ug5 == null) {
            this.LLILLJJLI.invoke(new C0DFT(C0DFQ.FAIL, null, "access token is unavailable", 2));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1");
            return unit;
        }
        if (C1388190mED.LIZIZ(this.LLILLL) == null) {
            this.LLILLJJLI.invoke(new C0DFT(C0DFQ.FAIL, null, "host activity is unavailable", 2));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1");
            return unit2;
        }
        final String string = UUID.randomUUID().toString();
        final C1712870uft c1712870uft = this.LLILZ;
        C1712970ug3 c1712970ug3 = c1712870uft.LJIILL;
        if (c1712970ug3 != null) {
            C1548820qPI.LJIIIIZZ("pipo_cashier_bind_refresh", c1712970ug3);
        }
        ?? r0 = new InterfaceC1141530foN() { // from class: X.0ug3
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                InterfaceC1713010ug7 interfaceC1713010ug7;
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null && Intrinsics.LJFF(interfaceC1107590evd.getString("pay_request_id"), string) && Intrinsics.LJFF(interfaceC1107590evd.getString("reason"), "NEW_BIND") && (interfaceC1713010ug7 = c1712870uft.LJIILLIIL) != null) {
                    interfaceC1713010ug7.d3(C0DJX.NEW_BIND);
                }
            }
        };
        c1712870uft.LJIILL = r0;
        C1548820qPI.LIZLLL("pipo_cashier_bind_refresh", r0);
        final C1712870uft c1712870uft2 = this.LLILZ;
        final Function1<C0DFT, Unit> function1 = this.LLILLJJLI;
        C1712850ufr c1712850ufr = c1712870uft2.LJIILJJIL;
        if (c1712850ufr != null) {
            C1548820qPI.LJIIIIZZ("pipo_cashier_selection_result", c1712850ufr);
        }
        ?? r02 = new InterfaceC1141530foN() { // from class: X.0ufr
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                SelectionPaymentMethodInfo selectionPaymentMethodInfo;
                EnumC335980DFc enumC335980DFc;
                String str;
                String str2;
                SelectionBankCardDetail selectionBankCardDetail;
                String str3;
                String str4;
                Object c098200Yq;
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd == null || !Intrinsics.LJFF(interfaceC1107590evd.getString("pay_request_id"), string)) {
                    return;
                }
                C1548820qPI.LJIIIIZZ("pipo_cashier_selection_result", this);
                C1712870uft c1712870uft3 = c1712870uft2;
                c1712870uft3.LJIILJJIL = null;
                C1712970ug3 c1712970ug32 = c1712870uft3.LJIILL;
                if (c1712970ug32 != null) {
                    C1548820qPI.LJIIIIZZ("pipo_cashier_bind_refresh", c1712970ug32);
                }
                c1712870uft3.LJIILL = null;
                String string2 = interfaceC1107590evd.getString("result");
                if (Intrinsics.LJFF(string2, "SUCCESS")) {
                    String string3 = interfaceC1107590evd.getString("selection_handle");
                    if (!(!a0.LJJJIL(string3))) {
                        string3 = null;
                    }
                    String string4 = interfaceC1107590evd.getString("selected_payment_method_info");
                    if (string4 != null && (!a0.LJJJIL(string4))) {
                        try {
                            C1227904rF.LIZ.getClass();
                            c098200Yq = (SelectionPaymentMethodInfo) C1227904rF.LIZLLL().LJII(string4, SelectionPaymentMethodInfo.class);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        selectionPaymentMethodInfo = (SelectionPaymentMethodInfo) c098200Yq;
                    } else {
                        selectionPaymentMethodInfo = null;
                    }
                    if (string3 != null && selectionPaymentMethodInfo != null) {
                        String str5 = selectionPaymentMethodInfo.paymentMethodId;
                        String str6 = selectionPaymentMethodInfo.paymentMethodToken;
                        String strLIZ = AnonymousClass0517.LIZ(str5, str6);
                        if (strLIZ == null) {
                            strLIZ = "";
                        }
                        C1712870uft c1712870uft4 = c1712870uft2;
                        c1712870uft4.LJIIJJI = string3;
                        c1712870uft4.LJIIL = str5;
                        c1712870uft4.LJIILIIL = str6;
                        Function1<C0DFT, Unit> function12 = function1;
                        C0DFQ c0dfq = C0DFQ.SUCCESS;
                        if (Intrinsics.LJFF(str5, "pm_pi_ptw_googlepay_c_d")) {
                            enumC335980DFc = EnumC335980DFc.GOOGLEPAY;
                        } else {
                            enumC335980DFc = EnumC335980DFc.CCDC;
                        }
                        if ((selectionPaymentMethodInfo.displayRawName == null || !(!a0.LJJJIL(r0))) && (((str = selectionPaymentMethodInfo.displayName) == null || !(!a0.LJJJIL(str))) && (str2 = selectionPaymentMethodInfo.maskedIdentity) != null)) {
                            a0.LJJJIL(str2);
                        }
                        SelectionBankCardDetail selectionBankCardDetail2 = selectionPaymentMethodInfo.bankCardDetailV2;
                        if ((selectionBankCardDetail2 == null || (str3 = selectionBankCardDetail2.cardOrganization) == null || !(!a0.LJJJIL(str3))) && ((selectionBankCardDetail = selectionPaymentMethodInfo.bankCardDetailV2) == null || (str3 = selectionBankCardDetail.cardBrand) == null || !(!a0.LJJJIL(str3)))) {
                            str3 = null;
                        }
                        SelectionBankCardDetail selectionBankCardDetail3 = selectionPaymentMethodInfo.bankCardDetailV2;
                        if (selectionBankCardDetail3 == null || (str4 = selectionBankCardDetail3.lastFour) == null || !(!a0.LJJJIL(str4))) {
                            str4 = null;
                        }
                        function12.invoke(new C0DFT(c0dfq, new C335760DEg(strLIZ, enumC335980DFc, str3, str4), null, 4));
                        return;
                    }
                    function1.invoke(new C0DFT(C0DFQ.FAIL, null, "selected instrument is missing", 2));
                    return;
                }
                if (Intrinsics.LJFF(string2, "CANCEL")) {
                    function1.invoke(new C0DFT(C0DFQ.CANCEL, null, null, 6));
                    return;
                }
                Function1<C0DFT, Unit> function13 = function1;
                C0DFQ c0dfq2 = C0DFQ.FAIL;
                String string5 = interfaceC1107590evd.getString("error_msg");
                if (string5 == null || !(!a0.LJJJIL(string5))) {
                    string5 = "selection page failed";
                }
                function13.invoke(new C0DFT(c0dfq2, null, string5, 2));
            }
        };
        c1712870uft2.LJIILJJIL = r02;
        C1548820qPI.LIZLLL("pipo_cashier_selection_result", r02);
        Context context = this.LLILLL;
        C1712870uft c1712870uft3 = this.LLILZ;
        C1712960ug2 c1712960ug2 = this.LLILZIL;
        c1712870uft3.getClass();
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("aweme").authority("pipo").path("/cashier/pay_page").appendQueryParameter("pipo_host", c1712960ug2.LIZ).appendQueryParameter("session_id", c1712990ug5.LJ).appendQueryParameter("country_or_region", c1712960ug2.LIZLLL).appendQueryParameter("merchant_id", c1712960ug2.LJ).appendQueryParameter("merchant_user_id", c1712990ug5.LJFF).appendQueryParameter("pay_request_id", string).appendQueryParameter("theme", String.valueOf(c1712870uft3.LIZ.ordinal())).appendQueryParameter("currency", c1712960ug2.LIZJ).appendQueryParameter("amount", c1712960ug2.LIZIZ).appendQueryParameter("universal_cashier_type", "agent_cashier");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c1712960ug2.LJ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("merchant_id", str);
        String str3 = c1712990ug5.LJFF;
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("merchant_user_id", str3);
        String str4 = c1712960ug2.LIZLLL;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("priority_region", str4);
        String str5 = c1712960ug2.LIZJ;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("currency", str5);
        String str6 = c1712960ug2.LIZIZ;
        if (str6 != null) {
            str2 = str6;
        }
        linkedHashMap.put("total_payment", str2);
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("pay_event_info", C786410Ut5.J3(new JSONObject(linkedHashMap)));
        String str7 = c1712870uft3.LJIIL;
        if (str7 != null) {
            builderAppendQueryParameter2.appendQueryParameter("force_selected_pmid", str7);
        }
        String str8 = c1712870uft3.LJIILIIL;
        if (str8 != null) {
            builderAppendQueryParameter2.appendQueryParameter("force_selected_pm_token", str8);
        }
        String str9 = c1712960ug2.LJI;
        if (str9 != null) {
            builderAppendQueryParameter2.appendQueryParameter("google_pay_gateway", str9);
        }
        String str10 = c1712960ug2.LJII;
        if (str10 != null) {
            builderAppendQueryParameter2.appendQueryParameter("google_pay_gateway_merchant_id", str10);
        }
        if (c1712960ug2.LJIIIZ) {
            builderAppendQueryParameter2.appendQueryParameter("force_filter_google_pay", "1");
        }
        SmartRouter.buildRoute(context, builderAppendQueryParameter2.build().toString()).open();
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.openInstrumentsChangePage$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

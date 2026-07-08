package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentListFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodResp;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentParams;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS26S0600000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03bS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C875203bS {
    public static final C875203bS LIZ;
    public static Function0<Unit> LIZIZ;
    public static String LIZJ;
    public static final C876003ba LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.03ba] */
    static {
        final C875203bS c875203bS = new C875203bS();
        LIZ = c875203bS;
        LIZLLL = new InterfaceC1164530gPT(c875203bS) { // from class: X.03ba
            public final C875203bS LL;

            {
                this.LL = c875203bS;
            }

            @Override // X.InterfaceC1164530gPT
            public final void onEvent(String str, String str2) {
                Object c098200Yq;
                String strOptString;
                this.LL.getClass();
                if (Intrinsics.LJFF(str, "ec_checkout_guide_exit")) {
                    Function0<Unit> function0 = C875203bS.LIZIZ;
                    IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                    if (iEventCenter != null) {
                        iEventCenter.LIZJ("ec_checkout_guide_exit", C875203bS.LIZLLL);
                    }
                    String str3 = null;
                    C875203bS.LIZIZ = null;
                    C875203bS.LIZJ = null;
                    try {
                        c098200Yq = new JSONObject(str2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    JSONObject jSONObject = (JSONObject) c098200Yq;
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("action");
                    } else {
                        strOptString = null;
                    }
                    boolean zLJFF = Intrinsics.LJFF(strOptString, "enable");
                    boolean zLJFF2 = Intrinsics.LJFF(strOptString, "skip");
                    if (!zLJFF) {
                        if (!zLJFF2) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (zLJFF && jSONObject != null && jSONObject.optBoolean("result")) {
                        String strOptString2 = jSONObject.optString("success_toast");
                        if (strOptString2 != null && (!a0.LJJJIL(strOptString2))) {
                            str3 = strOptString2;
                        }
                        C875203bS.LIZJ = str3;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }
            }
        };
    }

    public static void LJFF(C875903bZ c875903bZ) {
        C876503bf c876503bf = c875903bZ.LJ;
        if (c876503bf != null && c875903bZ.LIZIZ.LJ != EnumC861103Yb.ENABLE) {
            C23250099c.LIZLLL(c876503bf.LIZ, null, null, new C875703bX(c876503bf, c875903bZ, null), 3);
        } else {
            LJ(c875903bZ.LIZ, c875903bZ.LIZIZ, c875903bZ.LIZLLL, c875903bZ.LJFF, null, c875903bZ.LJI, c875903bZ.LJII, c875903bZ.LJIIIIZZ, new AwS650S0100000_1(c875903bZ, 11));
        }
    }

    public static Response LJIIIIZZ(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("payment_methods")) != null) {
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("payment_methods");
            if (jSONArrayOptJSONArray2 != null) {
                int length = jSONArrayOptJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i);
                    if (jSONObjectOptJSONObject3 != null) {
                        jSONObjectOptJSONObject3.remove("recurring_payment_info");
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("credit_info");
            if (jSONObjectOptJSONObject4 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("payment_methods")) != null) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject5 != null) {
                        jSONObjectOptJSONObject5.remove("recurring_payment_info");
                    }
                }
            }
            str = C786410Ut5.J3(jSONObject);
        }
        Type type = new TypeToken<Response<ListPaymentMethodResp>>() { // from class: X.03bk
        }.getType();
        C1227904rF.LIZ.getClass();
        Response response = (Response) C1227904rF.LIZJ(str, type);
        if (response != null) {
            return response;
        }
        throw new IllegalStateException("backup response parse result is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x000c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.031p] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.031p, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip, java.lang.Boolean, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> LJIIIZ(java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r24) {
        /*
            r6 = 0
            if (r24 == 0) goto Laf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r24.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r5
            java.lang.String r2 = r5.id
            r1 = 1
            boolean r1 = X.C03S8.LJJIFFI(r2, r1, r1)
            if (r1 != 0) goto Lc
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r1 = r5.subPaymentMethods
            java.util.List r8 = LJIIIZ(r1)
            r15 = 0
            r22 = -129(0xffffffffffffff7f, float:NaN)
            r23 = -1
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r24 = r23
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo r1 = r2.LJJIIJ(r15)
            if (r1 == 0) goto Lac
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType r1 = r1.commuteType
        L4d:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType r3 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType.APP_DISPLAY_TIPS_IF_NOT_INSTALL
            if (r1 == r3) goto L5b
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo r1 = r2.LJII(r15)
            if (r1 == 0) goto Laa
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType r1 = r1.commuteType
        L59:
            if (r1 != r3) goto L9f
        L5b:
            boolean r1 = r2.LJJJZ()
            if (r1 != 0) goto L9f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r5 = r2.availability
            if (r5 != 0) goto L6f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r5 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability
            r6 = r6
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r5.<init>(r6, r7, r8, r9, r10)
        L6f:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.String r12 = "9990"
            java.lang.String r9 = r5.unavailableCode
            java.lang.String r10 = r5.unavailableReason
            java.lang.String r11 = r5.unavailablePopupTitle
            r7 = r5
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability r12 = r7.copy(r8, r9, r10, r11, r12)
            r15 = 0
            r22 = -2097153(0xffffffffffdfffff, float:NaN)
            r5 = r2
            r6 = r6
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r13 = r6
            r14 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r23 = r23
            r24 = r23
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r2 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L9f:
            boolean r1 = r2.LIZ()
            if (r1 == 0) goto Lc
            r0.add(r2)
            goto Lc
        Laa:
            r1 = r6
            goto L59
        Lac:
            r1 = r6
            goto L4d
        Lae:
            return r0
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875203bS.LJIIIZ(java.util.List):java.util.List");
    }

    public static void LJIIJ(Context context) {
        String string = context.getString(2131832931);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C876503bf r8, X.InterfaceC1364105Vn<? super X.C876603bg> r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875203bS.LIZLLL(X.03bf, X.05Vn):java.lang.Object");
    }

    public static void LIZ(Context context, PaymentMethod paymentMethod, Function0 function0, AwS402S0200000_1 awS402S0200000_1, C875803bY c875803bY) {
        String str;
        CommuteType commuteType;
        if (!C03S8.LJIJJ(paymentMethod.id) && !Intrinsics.LJFF(paymentMethod.id, "pm_pi_ccdc_all")) {
            if (Intrinsics.LJFF(paymentMethod.id, "pm_pi_ew_paypal_c_d")) {
                if (awS402S0200000_1 != null) {
                    awS402S0200000_1.invoke();
                    return;
                }
                return;
            }
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo == null || (str = bindInfo.schema) == null) {
                str = paymentMethod.schema;
            }
            CommuteInfo commuteInfoLJII = paymentMethod.LJII(false);
            if (commuteInfoLJII != null) {
                commuteType = commuteInfoLJII.commuteType;
            } else {
                commuteType = null;
            }
            if (str != null && !a0.LJJJIL(str)) {
                C23250099c.LIZLLL(c875803bY.LIZ, null, null, new C875403bU(context, paymentMethod, c875803bY, str, commuteType, null), 3);
                return;
            } else {
                LJIIJ(context);
                return;
            }
        }
        function0.invoke();
    }

    public static void LJII(Context context, C867003a8 c867003a8, C876403be c876403be, C877303bn c877303bn, boolean z, Function0 function0) {
        if (c876403be == null) {
            LJIIJ(context);
        } else {
            C23250099c.LIZLLL(c876403be.LIZ, null, null, new C877203bm(c876403be, c867003a8, z, function0, context, c877303bn, null), 3);
        }
    }

    public static void LJI(Context context, FragmentManager fragmentManager, List list, String str, C877303bn c877303bn, String str2, Function2 function2) {
        boolean z;
        if (list.isEmpty()) {
            LJIIJ(context);
            return;
        }
        BackupPaymentListFragment backupPaymentListFragment = new BackupPaymentListFragment();
        backupPaymentListFragment.LLILZ = list;
        backupPaymentListFragment.LLILZIL = str;
        backupPaymentListFragment.LLILZLL = c877303bn;
        backupPaymentListFragment.LLIZ = function2;
        Bundle arguments = backupPaymentListFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        if (str2 != null && !a0.LJJJIL(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            arguments.remove("key_pending_success_toast");
        } else {
            C786410Ut5.LJJJI("key_pending_success_toast", str2, arguments);
        }
        backupPaymentListFragment.setArguments(arguments);
        C882703cf.LIZ(fragmentManager, backupPaymentListFragment, "BackupPaymentListFragment", null, true, 8);
    }

    public static C875903bZ LIZIZ(Context context, FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, final PaymentViewModel paymentViewModel, C867003a8 c867003a8, Boolean bool, C877303bn c877303bn, Function1 function1) {
        boolean zBooleanValue;
        C876803bi c876803bi;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String currency;
        String priceVal;
        String str6;
        Address address;
        C876803bi c876803bi2;
        PaymentParams paymentParams;
        String str7;
        Summary summary;
        Price price;
        PaymentParams paymentParams2;
        String str8;
        Summary summary2;
        Price price2;
        C876803bi c876803bi3;
        Boolean bool2;
        C03SP c03sp = paymentViewModel.LLJJL;
        if (c03sp != null && (bool2 = c03sp.LIZ) != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = c867003a8.LIZLLL;
        }
        String str9 = null;
        C867003a8 c867003a8LIZ = C867003a8.LIZ(c867003a8, zBooleanValue, null, 119);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(paymentViewModel);
        String str10 = paymentViewModel.LLJJJ;
        C03SP c03sp2 = paymentViewModel.LLJJL;
        if (c03sp2 != null) {
            c876803bi = c03sp2.LIZIZ;
        } else {
            c876803bi = null;
        }
        PaymentMethodsData paymentMethodsData = paymentViewModel.LLJJIJIL;
        if (paymentMethodsData != null) {
            str = paymentMethodsData.pipoHost;
        } else {
            str = null;
        }
        Map mapLJ = paymentViewModel.LLJJIJIIJIL;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C876403be c876403be = new C876403be(viewModelScope, str10, c876803bi, str, mapLJ);
        InterfaceC497601wk viewModelScope2 = ViewModelKt.getViewModelScope(paymentViewModel);
        PaymentMethodsData paymentMethodsData2 = paymentViewModel.LLJJIJIL;
        if (paymentMethodsData2 != null) {
            str2 = paymentMethodsData2.consultationId;
        } else {
            str2 = null;
        }
        EnterParams enterParams = paymentViewModel.LLJ;
        if (enterParams != null) {
            str3 = enterParams.LJIIIIZZ;
        } else {
            str3 = null;
        }
        String str11 = paymentViewModel.LLJJJ;
        n nVar = paymentViewModel.LLJJJJLIIL;
        HashMap<String, Object> map = paymentViewModel.LLJJIJIIJIL;
        if (paymentMethodsData2 != null) {
            str4 = paymentMethodsData2.saleRegion;
        } else {
            str4 = null;
        }
        InterfaceC877803bs interfaceC877803bs = new InterfaceC877803bs() { // from class: X.03Zh
            @Override // X.InterfaceC877803bs
            public final void onDismiss() {
                PaymentViewModel paymentViewModel2 = paymentViewModel;
                paymentViewModel2.getClass();
                paymentViewModel2.setState(AFwS228S0000000_1.get$arr$(216));
            }

            @Override // X.InterfaceC877803bs
            public final void onShow() {
                PaymentViewModel paymentViewModel2 = paymentViewModel;
                paymentViewModel2.getClass();
                paymentViewModel2.setState(AFwS228S0000000_1.get$arr$(241));
            }

            @Override // X.InterfaceC877803bs
            public final void onFailed(String str12) {
                if (str12 != null) {
                    PaymentViewModel paymentViewModel2 = paymentViewModel;
                    paymentViewModel2.getClass();
                    paymentViewModel2.setState(new AwS52S1000000_1(str12, 14));
                }
            }
        };
        AwS26S0600000_1 awS26S0600000_1 = new AwS26S0600000_1(context, fragmentManager, c877303bn, new C875803bY(viewModelScope2, str2, str3, str11, nVar, map, str4, paymentMethodsData2, enterParams, interfaceC877803bs), paymentViewModel, lifecycleOwner, 2);
        InterfaceC497601wk viewModelScope3 = ViewModelKt.getViewModelScope(paymentViewModel);
        C03SP c03sp3 = paymentViewModel.LLJJL;
        if (c03sp3 == null || (c876803bi3 = c03sp3.LIZIZ) == null || (str5 = c876803bi3.LJ) == null) {
            C914303hl.LIZ.getClass();
            Cashier cashier = C914303hl.LIZIZ;
            if (cashier != null) {
                str5 = cashier.merchantUserId;
            } else {
                str5 = null;
            }
        }
        EnterParams enterParams2 = paymentViewModel.LLJ;
        if (enterParams2 != null && (summary2 = enterParams2.defaultSummary) != null && (price2 = summary2.total) != null) {
            currency = price2.getCurrency();
        } else {
            currency = null;
        }
        C914303hl c914303hl = C914303hl.LIZ;
        c914303hl.getClass();
        Cashier cashier2 = C914303hl.LIZIZ;
        if (cashier2 != null && (paymentParams2 = cashier2.paymentParams) != null && (str8 = paymentParams2.currency) != null) {
            currency = str8;
        }
        EnterParams enterParams3 = paymentViewModel.LLJ;
        if (enterParams3 != null && (summary = enterParams3.defaultSummary) != null && (price = summary.total) != null) {
            priceVal = price.getPriceVal();
        } else {
            priceVal = null;
        }
        c914303hl.getClass();
        Cashier cashier3 = C914303hl.LIZIZ;
        if (cashier3 != null && (paymentParams = cashier3.paymentParams) != null && (str7 = paymentParams.amount) != null) {
            priceVal = str7;
        }
        C03SP c03sp4 = paymentViewModel.LLJJL;
        if (c03sp4 != null && (c876803bi2 = c03sp4.LIZIZ) != null) {
            str6 = c876803bi2.LIZLLL;
        } else {
            str6 = null;
        }
        EnterParams enterParams4 = paymentViewModel.LLJ;
        if (enterParams4 != null && (address = enterParams4.shippingAddress) != null) {
            str9 = address.id;
        }
        return new C875903bZ(context, c867003a8LIZ, c876403be, c877303bn, new C876503bf(viewModelScope3, new ListPaymentMethodRequest(str5, null, currency, priceVal, str6, "ADD_BACKUP_PI_PAGE", str9), interfaceC877803bs), bool, new AwS367S0200000_1(paymentViewModel, (PaymentViewModel) function1, (Function1<? super Boolean, Unit>) 147), new AwS367S0200000_1(c877303bn, awS26S0600000_1, 148), awS26S0600000_1);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C875903bZ LIZJ(final android.content.Context r23, androidx.fragment.app.FragmentManager r24, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r25, com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel r26, X.C867003a8 r27, java.lang.Boolean r28, X.C877303bn r29, kotlin.jvm.functions.Function1 r30) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875203bS.LIZJ(android.content.Context, androidx.fragment.app.FragmentManager, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel, com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel, X.03a8, java.lang.Boolean, X.03bn, kotlin.jvm.functions.Function1):X.03bZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r1 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r18.invoke(java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r1 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        r10 = new kotlin.jvm.internal.AwS545S0100000_1(r18, (kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>) 1503);
        r9 = new kotlin.jvm.internal.AwS121S0110000_1(r18, (kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>) r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r8 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r0 = r8.title;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (kotlin.text.a0.LJJJIL(r0) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r0 = r8.content;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (kotlin.text.a0.LJJJIL(r0) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        LJIIJ(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        X.C877103bl.LJI(r15, "turn_off_backup_payment", r15.LIZ);
        r2 = new X.C1397580mTM(r13);
        r3 = new android.widget.FrameLayout(r13);
        X.C786410Ut5.a6(r3, new android.widget.FrameLayout.LayoutParams(-1, -2));
        r3.setPadding(0, X.C814420VxA.LIZIZ(X.C418440Gaw.LIZIZ(24)), 0, X.C814420VxA.LIZIZ(X.C418440Gaw.LIZIZ(8)));
        r11 = new com.bytedance.tux.icon.TuxIconView(r13, null, 0, 6, null);
        X.C786410Ut5.M6(r11, new android.widget.FrameLayout.LayoutParams(X.C814420VxA.LIZIZ(X.C418440Gaw.LIZIZ(48)), X.C814420VxA.LIZIZ(X.C418440Gaw.LIZIZ(48)), 17));
        r1 = new X.C419910GdJ();
        r1.LIZ = com.zhiliaoapp.musically.R.raw.icon_bell;
        r1.LJ = java.lang.Integer.valueOf(com.zhiliaoapp.musically.R.attr.a1h);
        r11.setTuxIcon(r1);
        r3.addView(r11);
        X.C340180DVg.LIZ(r2, r3, 0, 6);
        r0 = r8.title;
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fb, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        r2.LJI(r0);
        r0 = r8.content;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0103, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        r2.LIZIZ(r1);
        X.C985403tE.LIZ(r2, new kotlin.jvm.internal.AwS37S0500000_1(r13, r15, r8, r9, r10, 5));
        r2.LJII = false;
        new X.C1397510mTF(r2).LIZLLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.content.Context r13, X.C867003a8 r14, X.C877303bn r15, java.lang.Boolean r16, java.util.List r17, kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, X.InterfaceC1631620sYq r21) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C875203bS.LJ(android.content.Context, X.03a8, X.03bn, java.lang.Boolean, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.0sYq):void");
    }
}

package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsBonusPromotionSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CombinePaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.IndependentPricingPaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentFeePromotionBasicInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMarketingInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentServiceFeeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentBillSummary;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03Q4 {
    public static DialogC1389620mGW LIZIZ;
    public static volatile String LIZLLL;
    public static volatile String LJ;
    public static PaymentMethodsData LJFF;
    public static final C03Q4 LIZ = new C03Q4();
    public static final List<String> LIZJ = new ArrayList();

    public static void LJIIIIZZ() {
        try {
            DialogC1389620mGW dialogC1389620mGW = LIZIZ;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            LIZIZ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIL() {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        try {
            Unit unit = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null) {
                if (LIZIZ == null) {
                    DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
                    dialogC1389620mGW.setCanceledOnTouchOutside(false);
                    dialogC1389620mGW.LJJLJ(2131835638);
                    LIZIZ = dialogC1389620mGW;
                }
                DialogC1389620mGW dialogC1389620mGW2 = LIZIZ;
                if (dialogC1389620mGW2 != null) {
                    C786410Ut5.J4(dialogC1389620mGW2);
                    unit = Unit.LIZ;
                }
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static List LJII(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PaymentMethod paymentMethod = (PaymentMethod) it2.next();
                String str = paymentMethod.id;
                String str2 = paymentMethod.token;
                C03Q4 c03q4 = LIZ;
                List<PaymentMethod> list2 = paymentMethod.subPaymentMethods;
                c03q4.getClass();
                arrayList.add(new IndependentPricingPaymentMethodInfo(str, str2, null, LJII(list2), paymentMethod.promotionInfo, paymentMethod.paymentServiceFeeInfo, paymentMethod.installmentInfo, paymentMethod.installmentInfoList, paymentMethod.paymentPriceVersionId, paymentMethod.needsIndependentPricing, paymentMethod.paymentUnitId, paymentMethod.isInstallment, paymentMethod.cardBin, paymentMethod.lastFour, paymentMethod.isClientBind, paymentMethod.interactionStyle));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LJIIIZ(PaymentMethodsData paymentMethodsData) {
        String str;
        Map<String, String> map;
        if (paymentMethodsData != null && (map = paymentMethodsData.independentPricingParam) != null) {
            str = map.get("enable_new_pricing_flow");
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "true");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIZILJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig$PaymentPricingDefaultConfig r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceDefaultConfig.LIZJ()
            java.lang.Boolean r0 = r0.filterUnavailableAnchorPm
            r3 = 1
            if (r0 == 0) goto Lf
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
        Lf:
            if (r4 == 0) goto L2c
            boolean r0 = r4.LJJJI()
            if (r0 != r3) goto L21
            boolean r0 = LJJIFFI(r4)
            if (r0 == 0) goto L1f
        L1d:
            r3 = 0
            return r3
        L1f:
            if (r4 == 0) goto L2c
        L21:
            java.lang.Boolean r1 = r4.needsIndependentPricing
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2c
            return r3
        L2c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r0 = X.C03Q4.LJFF
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo r2 = r0.LJIJJ(r4)
        L34:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r2 == 0) goto L49
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r2.paymentMethods
            if (r0 == 0) goto L42
            r1.addAll(r0)
        L42:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r2.storedMethods
            if (r0 == 0) goto L49
            r1.addAll(r0)
        L49:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Iterator r2 = r1.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.Boolean r1 = r0.needsIndependentPricing
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L53
            return r3
        L6a:
            r2 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Q4.LJIIZILJ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):boolean");
    }

    public static Boolean LJIJ(PaymentMethod paymentMethod) {
        boolean zBooleanValue;
        if (paymentMethod == null) {
            return Boolean.FALSE;
        }
        if (paymentMethod.LIZIZ) {
            Boolean bool = paymentMethod.LJIIJ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        return paymentMethod.isInstallment;
    }

    public static boolean LJJIFFI(PaymentMethod paymentMethod) {
        Availability availability = paymentMethod.availability;
        if (availability != null) {
            return Intrinsics.LJFF(availability.isAvailable(), Boolean.FALSE);
        }
        return false;
    }

    public final boolean LIZ(PaymentMethod paymentMethod) {
        List<String> list;
        if (paymentMethod == null || !LJJ(this, paymentMethod) || (list = EcPaymentIndependentPriceDefaultConfig.LIZJ().showPaymentTipsPmList) == null || !C13LP.LJJJJ(paymentMethod.id, list)) {
            return false;
        }
        return true;
    }

    public final boolean LJIJI(PaymentMethod paymentMethod) {
        Boolean bool = EcPaymentIndependentPriceDefaultConfig.LIZJ().filterRecommendPm;
        if ((bool == null || bool.booleanValue()) && LJJ(this, paymentMethod) && LJJIFFI(paymentMethod)) {
            return true;
        }
        return false;
    }

    public final boolean LJJI(PaymentMethod paymentMethod) {
        String str;
        List<String> list;
        if (paymentMethod != null && paymentMethod.LIZIZ && LJIIIZ(LJFF) && (str = paymentMethod.id) != null && EcPaymentIndependentPriceConfigSettings.LIZIZ() && (list = EcPaymentIndependentPriceConfigSettings.LIZJ().secondCacheFakeBindPmList) != null && !list.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (u.LJJIIJZLJL(str, it2.next(), false)) {
                    if (LJJ(this, paymentMethod)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static IndependentPricingPaymentMethodInfo LJ(PaymentMethod paymentMethod, PaymentMethod paymentMethod2) {
        boolean zBooleanValue;
        ?? arrayList;
        String str;
        Boolean bool;
        Boolean bool2;
        List<PaymentMethod> list;
        Boolean bool3 = EcPaymentIndependentPriceDefaultConfig.LIZJ().filterSubPaymentMethods;
        if (bool3 != null) {
            zBooleanValue = bool3.booleanValue();
        } else {
            zBooleanValue = true;
        }
        InstallmentInfo installmentInfo = null;
        if (zBooleanValue) {
            if (paymentMethod != null && (list = paymentMethod.subPaymentMethods) != null) {
                arrayList = new ArrayList();
                for (PaymentMethod paymentMethod3 : list) {
                    if (LJJ(LIZ, paymentMethod3)) {
                        arrayList.add(paymentMethod3);
                    }
                }
            } else {
                arrayList = 0;
            }
        } else {
            arrayList = paymentMethod.subPaymentMethods;
        }
        String str2 = paymentMethod.id;
        if (paymentMethod.LIZIZ) {
            str = paymentMethod.LJIIZILJ;
        } else {
            str = paymentMethod.token;
        }
        if (paymentMethod2 != null && C899503fN.LIZIZ(paymentMethod2, paymentMethod)) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        List listLJII = LJII(arrayList);
        List<PaymentPromotion> list2 = paymentMethod.promotionInfo;
        PaymentServiceFeeInfo paymentServiceFeeInfo = paymentMethod.paymentServiceFeeInfo;
        InstallmentInfo installmentInfo2 = paymentMethod.installmentInfo;
        if (installmentInfo2 == null) {
            if (paymentMethod.LIZIZ) {
                List<InstallmentInfo> list3 = paymentMethod.installmentInfoList;
                if (list3 != null) {
                    Iterator<InstallmentInfo> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InstallmentInfo next = it2.next();
                        if (Intrinsics.LJFF(next.bankCode, paymentMethod.LJIILJJIL)) {
                            installmentInfo = next;
                            break;
                        }
                    }
                    installmentInfo = installmentInfo;
                }
            } else {
                List<InstallmentInfo> list4 = paymentMethod.installmentInfoList;
                if (list4 != null) {
                    installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list4);
                }
            }
        } else {
            installmentInfo = installmentInfo2;
        }
        List<InstallmentInfo> list5 = paymentMethod.installmentInfoList;
        String str3 = paymentMethod.paymentPriceVersionId;
        Boolean bool4 = paymentMethod.needsIndependentPricing;
        String str4 = paymentMethod.paymentUnitId;
        Boolean boolLJIJ = LJIJ(paymentMethod);
        String str5 = paymentMethod.cardBin;
        if (str5 == null) {
            str5 = paymentMethod.LJIJ;
        }
        String str6 = paymentMethod.lastFour;
        if (str6 == null) {
            str6 = paymentMethod.LJIJI;
        }
        if (paymentMethod.LIZIZ) {
            bool2 = Boolean.TRUE;
        } else {
            bool2 = paymentMethod.isClientBind;
        }
        return new IndependentPricingPaymentMethodInfo(str2, str, bool, listLJII, list2, paymentServiceFeeInfo, installmentInfo, list5, str3, bool4, str4, boolLJIJ, str5, str6, bool2, paymentMethod.interactionStyle);
    }

    public static boolean LJJ(C03Q4 c03q4, PaymentMethod paymentMethod) {
        Boolean bool;
        CombinePaymentInfo combinePaymentInfo;
        List<CreditInfo> list;
        CreditInfo creditInfo;
        List<PaymentMethod> list2;
        List<PaymentMethod> list3;
        CreditInfo creditInfo2;
        List<PaymentMethod> list4;
        c03q4.getClass();
        if (EcPaymentIndependentPriceConfigSettings.LIZIZ() && paymentMethod != null) {
            if (LJIIIZ(LJFF)) {
                if (paymentMethod.LIZIZ) {
                    if (Intrinsics.LJFF(null, C03QE.LIZIZ)) {
                        PaymentMethodsData paymentMethodsData = LJFF;
                        if (paymentMethodsData != null && (creditInfo2 = paymentMethodsData.creditInfo) != null && (list4 = creditInfo2.paymentMethods) != null && !list4.isEmpty()) {
                            for (PaymentMethod paymentMethod2 : list4) {
                                if (Intrinsics.LJFF(paymentMethod2.needsIndependentPricing, Boolean.TRUE)) {
                                    List list5 = paymentMethod2.subPaymentMethods;
                                    if (list5 == null) {
                                        list5 = C13BV.INSTANCE;
                                    }
                                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                        Iterator it2 = list5.iterator();
                                        while (it2.hasNext()) {
                                            if (Intrinsics.LJFF(((PaymentMethod) it2.next()).id, paymentMethod.id)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        ArrayList<PaymentMethod> arrayList = new ArrayList();
                        PaymentMethodsData paymentMethodsData2 = LJFF;
                        if (paymentMethodsData2 != null && (list3 = paymentMethodsData2.paymentMethods) != null) {
                            arrayList.addAll(list3);
                        }
                        PaymentMethodsData paymentMethodsData3 = LJFF;
                        if (paymentMethodsData3 != null && (creditInfo = paymentMethodsData3.creditInfo) != null && (list2 = creditInfo.paymentMethods) != null) {
                            arrayList.addAll(list2);
                        }
                        PaymentMethodsData paymentMethodsData4 = LJFF;
                        if (paymentMethodsData4 != null && (combinePaymentInfo = paymentMethodsData4.combinePaymentInfo) != null && (list = combinePaymentInfo.creditInfoList) != null) {
                            Iterator<CreditInfo> it3 = list.iterator();
                            while (it3.hasNext()) {
                                List<PaymentMethod> list6 = it3.next().paymentMethods;
                                if (list6 != null) {
                                    arrayList.addAll(list6);
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            for (PaymentMethod paymentMethod3 : arrayList) {
                                if (Intrinsics.LJFF(paymentMethod3.needsIndependentPricing, Boolean.TRUE)) {
                                    List list7 = paymentMethod3.subPaymentMethods;
                                    if (list7 == null) {
                                        list7 = C13BV.INSTANCE;
                                    }
                                    if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                                        Iterator it4 = list7.iterator();
                                        while (it4.hasNext()) {
                                            if (Intrinsics.LJFF(((PaymentMethod) it4.next()).id, paymentMethod.id)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (paymentMethod.LJJJI()) {
                        return LJIIZILJ(paymentMethod);
                    }
                    if (!Intrinsics.LJFF(paymentMethod.needsIndependentPricing, Boolean.TRUE)) {
                        List<PaymentMethod> list8 = paymentMethod.subPaymentMethods;
                        if (list8 != null && !list8.isEmpty()) {
                            Iterator<PaymentMethod> it5 = list8.iterator();
                            while (it5.hasNext()) {
                                if (Intrinsics.LJFF(it5.next().needsIndependentPricing, Boolean.TRUE)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            } else if (!Intrinsics.LJFF(paymentMethod.needsIndependentPricing, Boolean.TRUE)) {
                if (EcPaymentIndependentPriceConfigSettings.LIZIZ() && ((bool = EcPaymentIndependentPriceConfigSettings.LIZJ().supportNewCardCalculation) == null || bool.booleanValue())) {
                    C03SY c03sy = C03SY.LIZ;
                    String str = paymentMethod.id;
                    c03sy.getClass();
                    if (C03SY.LJIJ(str) && paymentMethod.LIZIZ) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final void LJJIII(InstallmentInfo installmentInfo, InstallmentInfo installmentInfo2) {
        List<InstallmentPlan> list;
        List<InstallmentPlan> list2;
        Boolean bool;
        Boolean bool2;
        if (!C03XU.LIZIZ().enableFillInstallmentInfoParams) {
            return;
        }
        boolean z = C03XU.LIZIZ().useIndependentPricingFieldsFirst;
        if (installmentInfo2 != null && (list = installmentInfo2.installmentPlans) != null) {
            for (InstallmentPlan installmentPlan : list) {
                InstallmentPlan installmentPlan2 = null;
                if (installmentInfo != null && (list2 = installmentInfo.installmentPlans) != null) {
                    Iterator<InstallmentPlan> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InstallmentPlan next = it2.next();
                        if (Intrinsics.LJFF(next.tenure, installmentPlan.tenure)) {
                            installmentPlan2 = next;
                            break;
                        }
                    }
                    InstallmentPlan installmentPlan3 = installmentPlan2;
                    if (installmentPlan3 != null) {
                        if (!z || (bool = installmentPlan.isDefault) == null) {
                            bool = installmentPlan3.isDefault;
                        }
                        installmentPlan.isDefault = bool;
                        if (!z || (bool2 = installmentPlan.isRecommend) == null) {
                            bool2 = installmentPlan3.isRecommend;
                        }
                        installmentPlan.isRecommend = bool2;
                    }
                }
            }
        }
    }

    public final C03QB LJIIL(PaymentInfo paymentInfo, String str) {
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        String str2;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethod paymentMethod3;
        if (paymentInfo != null && paymentInfo.LIZIZ()) {
            EcPaymentIndependentPriceDefaultConfig.PaymentPricingDefaultConfig paymentPricingDefaultConfig = EcPaymentIndependentPriceDefaultConfig.LIZ;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.LIZIZ;
            } else {
                paymentMethod = null;
            }
            if (EcPaymentIndependentPriceDefaultConfig.LIZ(paymentMethod)) {
                if (paymentInfo != null) {
                    paymentMethod2 = paymentInfo.LIZIZ;
                } else {
                    paymentMethod2 = null;
                }
                if (LJJ(this, paymentMethod2)) {
                    if (paymentInfo == null || (paymentMethod3 = paymentInfo.LIZIZ) == null || (str2 = paymentMethod3.id) == null) {
                        str2 = "";
                    }
                    if (str == null) {
                        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.LIZJ) != null) {
                            str = paymentMethodInfo.tenure;
                        } else {
                            str = null;
                        }
                    }
                    return new C03QC(str2, str);
                }
            }
        }
        return C03PF.LIZIZ;
    }

    public static Map LIZLLL(PaymentMethodsData paymentMethodsData, String str, Map map) {
        LinkedHashMap linkedHashMap;
        Map<String, String> map2;
        if (paymentMethodsData != null && (map2 = paymentMethodsData.paymentParam) != null) {
            linkedHashMap = new LinkedHashMap(map2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("first_checkout_consultation_id", str);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod LJIIJJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r6, X.C03QB r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Q4.LJIIJJI(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, X.03QB, java.lang.String):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r8, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r9, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r10, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r11) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Q4.LJFF(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):java.util.List");
    }

    public static void LJIIJ(PaymentMethod paymentMethod, String str, InterfaceC497601wk interfaceC497601wk, Function1 function1) {
        String promotionLink;
        Object objSingletonList;
        String promotionCurrency = null;
        if (paymentMethod == null) {
            function1.invoke(null);
            return;
        }
        if (!PipoTtsBonusPromotionSettings.LIZ()) {
            function1.invoke(null);
            return;
        }
        PaymentPromotion paymentPromotionLJIIL = paymentMethod.LJIIL();
        if (paymentPromotionLJIIL != null) {
            promotionLink = paymentPromotionLJIIL.getPromotionLink();
        } else {
            promotionLink = null;
        }
        List listLJIIL = C1697810uHb.LJIIL(paymentMethod.LJIIL());
        if ("aweme://webview_popup?target_handler=pipo_hybrid&disable_auto_append_crossplatform_plugin=1&use_spark=1".length() != 0 && promotionLink != null && promotionLink.length() != 0 && listLJIIL != null && !listLJIIL.isEmpty()) {
            boolean zLIZ = C123100dR.LIZ(paymentMethod.token);
            PaymentPromotion paymentPromotionLJIIL2 = paymentMethod.LJIIL();
            if (paymentPromotionLJIIL2 == null) {
                objSingletonList = C13BV.INSTANCE;
            } else {
                objSingletonList = Collections.singletonList(new PaymentMarketingInfo(paymentPromotionLJIIL2.getPromotionId(), paymentMethod.id, paymentPromotionLJIIL2.getPromotionAmountValue(), null, null, null, null));
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(objSingletonList);
            C914303hl.LIZ.getClass();
            if (C914303hl.LIZIZ != null) {
                C902403fq c902403fq = C902403fq.LIZ;
                Cashier cashier = C914303hl.LIZIZ;
                PaymentPromotion paymentPromotionLJIIL3 = paymentMethod.LJIIL();
                if (paymentPromotionLJIIL3 != null) {
                    promotionCurrency = paymentPromotionLJIIL3.getPromotionCurrency();
                }
                c902403fq.getClass();
                function1.invoke(C902403fq.LIZ("aweme://webview_popup?target_handler=pipo_hybrid&disable_auto_append_crossplatform_plugin=1&use_spark=1", promotionLink, cashier, promotionCurrency, zLIZ ? 1 : 0, strLJIIIIZZ));
                return;
            }
            if (interfaceC497601wk == null) {
                return;
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C845103Rx(str, function1, "aweme://webview_popup?target_handler=pipo_hybrid&disable_auto_append_crossplatform_plugin=1&use_spark=1", promotionLink, paymentMethod, zLIZ, strLJIIIIZZ, null), 3);
            return;
        }
        function1.invoke(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> LJJIIJ(boolean r5, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r6, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r7, X.C03QB r8) {
        /*
            boolean r1 = r8 instanceof X.C03QC
            r0 = 0
            if (r1 == 0) goto L9b
            r1 = r8
            X.03QC r1 = (X.C03QC) r1
            java.lang.String r3 = r1.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CombinePaymentInfo r1 = r7.combinePaymentInfo
            if (r1 == 0) goto L97
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo> r1 = r1.creditInfoList
            if (r1 == 0) goto L97
            java.util.Iterator r2 = r1.iterator()
        L16:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r4 = r2.next()
            r1 = r4
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo) r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r1.creditPaymentMethod
            if (r1 == 0) goto L93
            java.lang.String r1 = r1.id
        L29:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r1 == 0) goto L16
        L2f:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo) r4
            if (r4 == 0) goto L97
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r3 = r4.paymentMethods
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r2 = r4.storedMethods
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r1 = r4.recommendPaymentMethods
        L39:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r3 == 0) goto L43
            r4.addAll(r3)
        L43:
            if (r2 == 0) goto L48
            r4.addAll(r2)
        L48:
            if (r1 == 0) goto L4d
            r4.addAll(r1)
        L4d:
            if (r0 == 0) goto L52
            r4.add(r0)
        L52:
            boolean r0 = r8 instanceof X.C03PF
            if (r0 == 0) goto Lbf
            if (r5 != 0) goto L67
            if (r6 == 0) goto L6c
            boolean r1 = r6.LIZIZ
            r0 = 1
            if (r1 != r0) goto L6c
            X.03Q4 r0 = X.C03Q4.LIZ
            boolean r0 = LJJ(r0, r6)
            if (r0 == 0) goto L6c
        L67:
            if (r6 == 0) goto L6c
            r4.add(r6)
        L6c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LIZ
            r0.getClass()
            r0 = 0
            java.util.List r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper.LJFF(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L7f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod
            if (r0 == 0) goto L7f
            r2.add(r0)
            goto L7f
        L93:
            r1 = r0
            goto L29
        L95:
            r4 = r0
            goto L2f
        L97:
            r3 = r0
            r2 = r0
            r1 = r0
            goto L39
        L9b:
            boolean r1 = r8 instanceof X.C03QE
            if (r1 == 0) goto Lae
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo r1 = r7.creditInfo
            if (r1 == 0) goto Laa
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r3 = r1.paymentMethods
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r2 = r1.storedMethods
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r1 = r1.recommendPaymentMethods
            goto L39
        Laa:
            r3 = r0
            r2 = r0
            r1 = r0
            goto L39
        Lae:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r3 = r7.paymentMethods
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r2 = r7.storedMethods
            java.util.List r1 = r7.LJIJI()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r7.LJIJ()
            goto L39
        Lbc:
            r4.addAll(r2)
        Lbf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Q4.LJJIIJ(boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, X.03QB):java.util.List");
    }

    public static final void LJJIIJZLJL(String str, List<PaymentMethod> list, List<PaymentMethod> list2, C03QB c03qb, Boolean bool) {
        PaymentMethod next;
        String str2;
        String str3;
        String desc;
        String desc2;
        PaymentPromotion paymentPromotion;
        PaymentServiceFeeInfo paymentServiceFeeInfo;
        PaymentPromotion paymentPromotion2;
        List<InstallmentPlan> list3;
        String desc3;
        String priceStr;
        Amount amount;
        PaymentPromotion paymentPromotion3;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list4;
        String desc4;
        String priceStr2;
        Amount amount2;
        PaymentPromotion paymentPromotion4;
        String strLIZ;
        Map<String, PaymentMethod> map;
        boolean zLJFF;
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            for (PaymentMethod paymentMethod : list) {
                Iterator<PaymentMethod> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        PaymentMethod paymentMethod2 = next;
                        if (paymentMethod.LIZIZ) {
                            zLJFF = Intrinsics.LJFF(paymentMethod2.token, paymentMethod.LJIIZILJ);
                        } else {
                            zLJFF = Intrinsics.LJFF(paymentMethod2.LJJI(), paymentMethod.LJJI());
                        }
                        if (zLJFF) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod3 = next;
                if (paymentMethod3 != null) {
                    C03OI.LIZ.getClass();
                    if (EcPaymentIndependentPriceDefaultConfig.LIZIZ()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            C03PA.LIZ(jSONObject, "id_token", paymentMethod3.LJJI());
                            if (paymentMethod != null && (installmentInfo = paymentMethod.installmentInfo) != null && (list4 = installmentInfo.installmentPlans) != null) {
                                try {
                                    C03PA.LIZ(jSONObject, "target_installment_plan_size", Integer.valueOf(list4.size()));
                                    JSONArray jSONArray = new JSONArray();
                                    for (InstallmentPlan installmentPlan : list4) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        C03PA.LIZ(jSONObject2, "tenure", installmentPlan.tenure);
                                        C03PA.LIZ(jSONObject2, FollowStatusChangeMethod.PARAM_UID, installmentPlan.id);
                                        C03PA.LIZ(jSONObject2, "unit_id", installmentPlan.paymentUnitId);
                                        C03PA.LIZ(jSONObject2, "price_version_id", installmentPlan.paymentPriceVersionId);
                                        PaymentServiceFeeInfo paymentServiceFeeInfo2 = installmentPlan.paymentServiceFeeInfo;
                                        if (paymentServiceFeeInfo2 != null && (paymentPromotion4 = paymentServiceFeeInfo2.paymentPromotionInfo) != null) {
                                            desc4 = paymentPromotion4.getDesc();
                                        } else {
                                            desc4 = null;
                                        }
                                        C03PA.LIZ(jSONObject2, "promotion_info", desc4);
                                        PaymentServiceFeeInfo paymentServiceFeeInfo3 = installmentPlan.paymentServiceFeeInfo;
                                        if (paymentServiceFeeInfo3 != null && (amount2 = paymentServiceFeeInfo3.paymentServiceFeeAmount) != null) {
                                            priceStr2 = amount2.getPriceStr();
                                        } else {
                                            priceStr2 = null;
                                        }
                                        C03PA.LIZ(jSONObject2, "service_fee_amount", priceStr2);
                                        jSONArray.put(jSONObject2);
                                    }
                                    C03PA.LIZ(jSONObject, "target_installment_info", jSONArray);
                                } catch (Throwable th) {
                                    th = th;
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                            InstallmentInfo installmentInfo2 = paymentMethod3.installmentInfo;
                            if (installmentInfo2 != null && (list3 = installmentInfo2.installmentPlans) != null) {
                                C03PA.LIZ(jSONObject, "matched_installment_plan_size", Integer.valueOf(list3.size()));
                                JSONArray jSONArray2 = new JSONArray();
                                for (InstallmentPlan installmentPlan2 : list3) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    C03PA.LIZ(jSONObject3, "tenure", installmentPlan2.tenure);
                                    C03PA.LIZ(jSONObject3, FollowStatusChangeMethod.PARAM_UID, installmentPlan2.id);
                                    C03PA.LIZ(jSONObject3, "unit_id", installmentPlan2.paymentUnitId);
                                    C03PA.LIZ(jSONObject3, "price_version_id", installmentPlan2.paymentPriceVersionId);
                                    PaymentServiceFeeInfo paymentServiceFeeInfo4 = installmentPlan2.paymentServiceFeeInfo;
                                    if (paymentServiceFeeInfo4 != null && (paymentPromotion3 = paymentServiceFeeInfo4.paymentPromotionInfo) != null) {
                                        desc3 = paymentPromotion3.getDesc();
                                    } else {
                                        desc3 = null;
                                    }
                                    C03PA.LIZ(jSONObject3, "promotion_info", desc3);
                                    PaymentServiceFeeInfo paymentServiceFeeInfo5 = installmentPlan2.paymentServiceFeeInfo;
                                    if (paymentServiceFeeInfo5 != null && (amount = paymentServiceFeeInfo5.paymentServiceFeeAmount) != null) {
                                        priceStr = amount.getPriceStr();
                                    } else {
                                        priceStr = null;
                                    }
                                    C03PA.LIZ(jSONObject3, "service_fee_amount", priceStr);
                                    jSONArray2.put(jSONObject3);
                                }
                                C03PA.LIZ(jSONObject, "matched_installment_info", jSONArray2);
                            }
                            if (paymentMethod != null) {
                                str2 = paymentMethod.paymentUnitId;
                            } else {
                                str2 = null;
                            }
                            C03PA.LIZ(jSONObject, "target_unit_id", str2);
                            C03PA.LIZ(jSONObject, "matched_unit_id", paymentMethod3.paymentUnitId);
                            if (paymentMethod == null) {
                                str3 = null;
                            } else {
                                str3 = paymentMethod.paymentPriceVersionId;
                            }
                            C03PA.LIZ(jSONObject, "target_price_version_id", str3);
                            C03PA.LIZ(jSONObject, "matched_price_version_id", paymentMethod3.paymentPriceVersionId);
                            if (paymentMethod == null || (paymentServiceFeeInfo = paymentMethod.paymentServiceFeeInfo) == null || (paymentPromotion2 = paymentServiceFeeInfo.paymentPromotionInfo) == null) {
                                desc = null;
                            } else {
                                desc = paymentPromotion2.getDesc();
                            }
                            C03PA.LIZ(jSONObject, "target_price_version_id", desc);
                            PaymentServiceFeeInfo paymentServiceFeeInfo6 = paymentMethod3.paymentServiceFeeInfo;
                            if (paymentServiceFeeInfo6 != null && (paymentPromotion = paymentServiceFeeInfo6.paymentPromotionInfo) != null) {
                                desc2 = paymentPromotion.getDesc();
                            } else {
                                desc2 = null;
                            }
                            C03PA.LIZ(jSONObject, "matched_price_version_id", desc2);
                            C03OI c03oi = C03OI.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str);
                            sbLIZ.append(" updatePaymentMethodsInfo");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c03oi.getClass();
                            C03OI.LJI(strLIZIZ, jSONObject);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    if (!LIZ.LJJI(paymentMethod) && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
                        C03OZ c03oz = new C03OZ(null, 3);
                        paymentMethod.LJIILIIL = c03oz;
                        c03oz.LIZ = PaymentMethod.LIZJ(paymentMethod3, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, -1, -1, -1);
                        LJJIII(paymentMethod.installmentInfo, paymentMethod3.installmentInfo);
                        if (paymentMethod.LJJJI()) {
                            InstallmentInfo installmentInfo3 = paymentMethod3.installmentInfo;
                            if (installmentInfo3 == null) {
                                installmentInfo3 = paymentMethod.installmentInfo;
                            }
                            paymentMethod.installmentInfo = installmentInfo3;
                        } else {
                            paymentMethod.installmentInfo = paymentMethod3.installmentInfo;
                        }
                        paymentMethod.paymentServiceFeeInfo = paymentMethod3.paymentServiceFeeInfo;
                        paymentMethod.promotionInfo = paymentMethod3.promotionInfo;
                        paymentMethod.isInstallment = paymentMethod3.isInstallment;
                        paymentMethod.hybridPaymentInfo = paymentMethod3.hybridPaymentInfo;
                        Boolean bool2 = EcPaymentIndependentPriceDefaultConfig.LIZJ().updateAvailability;
                        if (bool2 == null || bool2.booleanValue()) {
                            Availability availability = paymentMethod3.availability;
                            if (availability != null) {
                                paymentMethod.availability = availability;
                            }
                            PaymentTip paymentTip = paymentMethod3.paymentTip;
                            if (paymentTip != null) {
                                paymentMethod.paymentTip = paymentTip;
                            }
                        }
                        Boolean bool3 = EcPaymentIndependentPriceDefaultConfig.LIZJ().updatePaymentUnitId;
                        if (bool3 == null || bool3.booleanValue()) {
                            paymentMethod.paymentUnitId = paymentMethod3.paymentUnitId;
                            C03OI c03oi2 = C03OI.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("idToken: ");
                            sbLIZ2.append(paymentMethod.LJJI());
                            sbLIZ2.append(", unitId: ");
                            sbLIZ2.append(paymentMethod.paymentUnitId);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            c03oi2.getClass();
                            C03OI.LJFF("updateUnitId", strLIZIZ2);
                        }
                        Boolean bool4 = EcPaymentIndependentPriceDefaultConfig.LIZJ().updatePaymentPriceId;
                        if (bool4 == null || bool4.booleanValue()) {
                            paymentMethod.paymentPriceVersionId = paymentMethod3.paymentPriceVersionId;
                            C03OI c03oi3 = C03OI.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("idToken: ");
                            sbLIZ3.append(paymentMethod.LJJI());
                            sbLIZ3.append(", priceId: ");
                            sbLIZ3.append(paymentMethod.paymentPriceVersionId);
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                            c03oi3.getClass();
                            C03OI.LJFF("updatePriceId", strLIZIZ3);
                        }
                    } else {
                        PaymentMethod paymentMethodLIZJ = PaymentMethod.LIZJ(paymentMethod, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, -1, -1, -1);
                        C03OZ c03oz2 = new C03OZ(null, 3);
                        paymentMethodLIZJ.LJIILIIL = c03oz2;
                        c03oz2.LIZ = PaymentMethod.LIZJ(paymentMethod3, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, -1, -1, -1);
                        LJJIII(paymentMethodLIZJ.installmentInfo, paymentMethod3.installmentInfo);
                        if (paymentMethodLIZJ.LJJJI()) {
                            InstallmentInfo installmentInfo4 = paymentMethod3.installmentInfo;
                            if (installmentInfo4 == null) {
                                installmentInfo4 = paymentMethodLIZJ.installmentInfo;
                            }
                            paymentMethodLIZJ.installmentInfo = installmentInfo4;
                        } else {
                            paymentMethodLIZJ.installmentInfo = paymentMethod3.installmentInfo;
                        }
                        paymentMethodLIZJ.paymentServiceFeeInfo = paymentMethod3.paymentServiceFeeInfo;
                        paymentMethodLIZJ.promotionInfo = paymentMethod3.promotionInfo;
                        paymentMethodLIZJ.isInstallment = paymentMethod3.isInstallment;
                        paymentMethodLIZJ.hybridPaymentInfo = paymentMethod3.hybridPaymentInfo;
                        paymentMethodLIZJ.anchoredPaymentInfo = paymentMethod3.anchoredPaymentInfo;
                        Boolean bool5 = EcPaymentIndependentPriceDefaultConfig.LIZJ().updateAvailability;
                        if (bool5 == null || bool5.booleanValue()) {
                            Availability availability2 = paymentMethod3.availability;
                            if (availability2 != null) {
                                paymentMethodLIZJ.availability = availability2;
                            }
                            PaymentTip paymentTip2 = paymentMethod3.paymentTip;
                            if (paymentTip2 != null) {
                                paymentMethodLIZJ.paymentTip = paymentTip2;
                            }
                        }
                        Boolean bool6 = EcPaymentIndependentPriceDefaultConfig.LIZJ().updatePaymentUnitId;
                        if (bool6 == null || bool6.booleanValue()) {
                            paymentMethodLIZJ.paymentUnitId = paymentMethod3.paymentUnitId;
                            C03OI c03oi4 = C03OI.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("idToken: ");
                            sbLIZ4.append(paymentMethodLIZJ.LJJI());
                            sbLIZ4.append(", unitId: ");
                            sbLIZ4.append(paymentMethodLIZJ.paymentUnitId);
                            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                            c03oi4.getClass();
                            C03OI.LJFF("updateUnitId", strLIZIZ4);
                        }
                        Boolean bool7 = EcPaymentIndependentPriceDefaultConfig.LIZJ().updatePaymentPriceId;
                        if (bool7 == null || bool7.booleanValue()) {
                            paymentMethodLIZJ.paymentPriceVersionId = paymentMethod3.paymentPriceVersionId;
                            C03OI c03oi5 = C03OI.LIZ;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("idToken: ");
                            sbLIZ5.append(paymentMethodLIZJ.LJJI());
                            sbLIZ5.append(", priceId: ");
                            sbLIZ5.append(paymentMethodLIZJ.paymentPriceVersionId);
                            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
                            c03oi5.getClass();
                            C03OI.LJFF("updatePriceId", strLIZIZ5);
                        }
                        if (c03qb == null || (strLIZ = c03qb.LIZ()) == null) {
                            strLIZ = "";
                        }
                        C03OI c03oi6 = C03OI.LIZ;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("forceSecondCache: ");
                        sbLIZ6.append(bool);
                        sbLIZ6.append(", key: ");
                        sbLIZ6.append(strLIZ);
                        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ6);
                        c03oi6.getClass();
                        C03OI.LJFF("matchAndUpdate", strLIZIZ6);
                        C03OZ c03oz3 = paymentMethod.LJIILIIL;
                        if (c03oz3 == null) {
                            paymentMethod.LJIILIIL = new C03OZ(new LinkedHashMap(), 1);
                        } else if (c03oz3.LIZIZ == null) {
                            c03oz3.LIZIZ = new LinkedHashMap();
                        }
                        C03OZ c03oz4 = paymentMethod.LJIILIIL;
                        if (c03oz4 != null && (map = c03oz4.LIZIZ) != null) {
                            map.put(strLIZ, paymentMethodLIZJ);
                        }
                    }
                    List<PaymentMethod> list5 = paymentMethod.subPaymentMethods;
                    List list6 = paymentMethod3.subPaymentMethods;
                    if (list6 == null) {
                        list6 = C13BV.INSTANCE;
                    }
                    LJJIIJZLJL(str, list5, list6, c03qb, bool);
                }
            }
        }
    }

    public static void LJIILIIL(PaymentMethod paymentMethod, PaymentServiceFeeInfo paymentServiceFeeInfo, String str, InterfaceC497601wk interfaceC497601wk, PaymentMarketingInfo paymentMarketingInfo, Function1 function1) {
        String promotionLink;
        String str2;
        String strLJIIIIZZ;
        PaymentPromotion paymentPromotion;
        if (paymentServiceFeeInfo != null && (paymentPromotion = paymentServiceFeeInfo.paymentPromotionInfo) != null) {
            promotionLink = paymentPromotion.getPromotionLink();
        } else {
            promotionLink = null;
        }
        if ("aweme://webview_popup?target_handler=pipo_hybrid&disable_auto_append_crossplatform_plugin=1&use_spark=1".length() != 0 && promotionLink != null && promotionLink.length() != 0) {
            if (paymentMethod != null) {
                str2 = paymentMethod.token;
            } else {
                str2 = null;
            }
            boolean zLIZ = C123100dR.LIZ(str2);
            ArrayList arrayList = new ArrayList();
            List<PaymentFeePromotionBasicInfo> list = paymentServiceFeeInfo.paymentFeePromotionBasicInfos;
            if (list != null) {
                arrayList.addAll(list);
            }
            if (paymentMarketingInfo != null) {
                arrayList.add(paymentMarketingInfo);
            }
            if (!arrayList.isEmpty()) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(arrayList);
            } else {
                strLJIIIIZZ = null;
            }
            C914303hl.LIZ.getClass();
            if (C914303hl.LIZIZ != null) {
                if (function1 != null) {
                    C902403fq c902403fq = C902403fq.LIZ;
                    Cashier cashier = C914303hl.LIZIZ;
                    String promotionCurrency = paymentServiceFeeInfo.paymentPromotionInfo.getPromotionCurrency();
                    c902403fq.getClass();
                    function1.invoke(C902403fq.LIZ("aweme://webview_popup?target_handler=pipo_hybrid&disable_auto_append_crossplatform_plugin=1&use_spark=1", promotionLink, cashier, promotionCurrency, zLIZ ? 1 : 0, strLJIIIIZZ));
                    return;
                }
                return;
            }
            if (interfaceC497601wk == null) {
                return;
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C845003Rw(str, function1, "aweme://webview_popup?target_handler=pipo_hybrid&disable_auto_append_crossplatform_plugin=1&use_spark=1", promotionLink, paymentServiceFeeInfo, zLIZ, strLJIIIIZZ, null), 3);
            return;
        }
        if (function1 != null) {
            function1.invoke(null);
        }
    }

    public static void LJIILL(boolean z, PaymentMethod paymentMethod, boolean z2, boolean z3, String str, C03QH c03qh) {
        LJIIIIZZ();
        if (z3) {
            return;
        }
        if (c03qh != null) {
            c03qh.onFailed();
        } else {
            C1440005kM.LIZ(new C03OD(false, z, paymentMethod, z2, str, null, 32));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r11, java.util.List r12, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r13, boolean r14, java.lang.String r15, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r16) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03Q4.LJJII(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, java.util.List, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, boolean, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData):void");
    }

    public static boolean LIZIZ(C03Q4 c03q4, PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData, InterfaceC497601wk interfaceC497601wk, String str, boolean z, boolean z2, String str2, int i) {
        boolean z3;
        List<PaymentBillSummary> list;
        String str3 = str2;
        boolean z4 = z2;
        boolean z5 = z;
        String str4 = str;
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        if ((i & 64) != 0) {
            z4 = false;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        c03q4.getClass();
        LJFF = paymentMethodsData;
        boolean zLJJ = LJJ(c03q4, paymentMethod);
        if (paymentMethod != null) {
            ArrayList arrayList = (ArrayList) LIZJ;
            if (!arrayList.contains(paymentMethod.LJIIJ())) {
                C03OI c03oi = C03OI.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, str3);
                jSONObject.put("pm_id", paymentMethod.id);
                jSONObject.put("token", paymentMethod.token);
                jSONObject.put("is_support", zLJJ);
                jSONObject.put("force_request", z5);
                if (paymentMethodsData != null) {
                    list = paymentMethodsData.LIZIZ;
                } else {
                    list = null;
                }
                jSONObject.put("has_requested", C756302xN.LIZ(list));
                c03oi.getClass();
                C03OI.LJI("checkAndRequestPaymentSummary", jSONObject);
                arrayList.add(paymentMethod.LJIIJ());
            }
        }
        if (zLJJ) {
            if (!z5 && paymentMethodsData != null && paymentMethodsData.LIZ != null) {
                C03OI.LIZ.getClass();
                C03OI.LJFF("checkAndRequestPaymentSummary", "ignore this request");
            } else {
                LJIJJLI(c03q4, z3, paymentMethodsData, str4, interfaceC497601wk, paymentMethod, z4, str3, UUID.randomUUID().toString(), null, 512);
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(C03Q4 c03q4, PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData, InterfaceC497601wk interfaceC497601wk, String str, List list, String str2, boolean z, boolean z2, String str3, int i) {
        boolean z3;
        List<PaymentPrice> list2;
        String str4 = str3;
        String str5 = str2;
        List list3 = list;
        boolean z4 = z2;
        boolean z5 = z;
        String str6 = str;
        if ((i & 8) != 0) {
            str6 = null;
        }
        if ((i & 16) != 0) {
            list3 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            z5 = false;
        }
        if ((i & 256) != 0) {
            z4 = false;
        }
        if ((i & 512) != 0) {
            str4 = null;
        }
        c03q4.getClass();
        LJFF = paymentMethodsData;
        boolean zLJJ = LJJ(c03q4, paymentMethod);
        if (paymentMethod != null) {
            ArrayList arrayList = (ArrayList) LIZJ;
            if (!arrayList.contains(paymentMethod.LJIIJ())) {
                C03OI c03oi = C03OI.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, str4);
                jSONObject.put("pm_id", paymentMethod.id);
                jSONObject.put("token", paymentMethod.token);
                jSONObject.put("is_support", zLJJ);
                jSONObject.put("force_request", z5);
                if (paymentMethodsData != null) {
                    list2 = paymentMethodsData.LJ;
                } else {
                    list2 = null;
                }
                jSONObject.put("has_requested", C756302xN.LIZ(list2));
                c03oi.getClass();
                C03OI.LJI("checkAndRequestPriceInfo", jSONObject);
                arrayList.add(paymentMethod.LJIIJ());
            }
        }
        if (zLJJ) {
            if (!z5 && paymentMethodsData != null && paymentMethodsData.LIZLLL != null) {
                C03OI.LIZ.getClass();
                C03OI.LJFF("checkAndRequestPriceInfo", "ignore this request");
                return false;
            }
            LJIJJ(c03q4, z3, paymentMethodsData, str6, list3, str5, interfaceC497601wk, paymentMethod, z4, str4, UUID.randomUUID().toString(), null, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
            return true;
        }
        return false;
    }

    public static void LJIJJLI(C03Q4 c03q4, boolean z, PaymentMethodsData paymentMethodsData, String str, InterfaceC497601wk interfaceC497601wk, PaymentMethod paymentMethod, boolean z2, String str2, String str3, C03P3 c03p3, int i) {
        boolean z3;
        boolean z4;
        Throwable th;
        InterfaceC497601wk interfaceC497601wkLIZ = interfaceC497601wk;
        C03P3 c03p32 = c03p3;
        String str4 = str3;
        String str5 = str2;
        boolean z5 = z2;
        PaymentMethod paymentMethod2 = paymentMethod;
        if ((i & 16) != 0) {
            paymentMethod2 = null;
        }
        if ((i & 32) != 0) {
            z5 = false;
        }
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            c03p32 = null;
        }
        c03q4.getClass();
        if (interfaceC497601wkLIZ == null) {
            try {
                interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
            } catch (Throwable th2) {
                th = th2;
                z4 = z3;
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                c03q4.getClass();
                LJIILL(false, paymentMethod2, z5, z4, null, c03p32);
            }
        }
        z4 = z3;
        try {
            C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C03Q2(paymentMethodsData, str5, str4, z5, paymentMethod2, c03p32, z, str, z3, null), 3);
        } catch (Throwable th3) {
            th = th3;
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c03q4.getClass();
            LJIILL(false, paymentMethod2, z5, z4, null, c03p32);
        }
    }

    public static void LJIJJ(C03Q4 c03q4, boolean z, PaymentMethodsData paymentMethodsData, String str, List list, String str2, InterfaceC497601wk interfaceC497601wk, PaymentMethod paymentMethod, boolean z2, String str3, String str4, C03YF c03yf, int i) {
        PaymentMethod paymentMethod2;
        boolean z3;
        InterfaceC497601wk interfaceC497601wkLIZ = interfaceC497601wk;
        C03YF c03yf2 = c03yf;
        String str5 = str4;
        String str6 = str3;
        boolean z4 = z2;
        PaymentMethod paymentMethod3 = paymentMethod;
        boolean z5 = z;
        boolean z6 = false;
        if ((i & 1) != 0) {
            z5 = false;
        }
        if ((i & 64) != 0) {
            paymentMethod3 = null;
        }
        if ((i & 128) != 0) {
            z4 = false;
        }
        if ((i & 256) != 0) {
            z6 = true;
        }
        if ((i & 512) != 0) {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            str5 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c03yf2 = null;
        }
        c03q4.getClass();
        if (interfaceC497601wkLIZ == null) {
            try {
                interfaceC497601wkLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
            } catch (Throwable th) {
                th = th;
                paymentMethod2 = paymentMethod3;
                z3 = z6;
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                c03q4.getClass();
                LJIILL(true, paymentMethod2, z4, z3, null, c03yf2);
            }
        }
        paymentMethod2 = paymentMethod3;
        z3 = z6;
        try {
            C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C03Q3(paymentMethodsData, str6, str5, z4, paymentMethod3, c03yf2, z5, str, list, str2, z6, null), 3);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            c03q4.getClass();
            LJIILL(true, paymentMethod2, z4, z3, null, c03yf2);
        }
    }
}

package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentAddCardConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentIndependentPriceConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentPromotionMergeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnfoldStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03YI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YI {
    public static boolean LJIIJ() {
        EnterParams enterParams;
        PaymentInfo paymentInfo;
        return C03WK.LIZ(PaymentViewModel.LLLIIIIL) && (enterParams = PaymentViewModel.LLLIIIIL) != null && (paymentInfo = enterParams.paymentInfo) != null && paymentInfo.LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJJI() {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.LLLIIIIL
            r4 = 0
            if (r0 == 0) goto L4c
            java.lang.String r1 = r0.paySource
        L7:
            java.lang.String r0 = "orderdetail"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 0
            r2 = 1
            if (r0 != 0) goto L4a
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.LLLIIIIL
            if (r0 == 0) goto L48
            java.lang.String r1 = r0.paySource
        L17:
            java.lang.String r0 = "orderlist"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4a
            r1 = 0
        L20:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings$PipoOspSecondRefreshConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings.LIZ()
            java.util.List<java.lang.String> r0 = r0.sourceList
            if (r0 == 0) goto L4e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r2) goto L4e
            if (r1 != 0) goto L4e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings$PipoOspSecondRefreshConfigModel r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings.LIZ()
            java.util.List<java.lang.String> r1 = r0.sourceList
            if (r1 == 0) goto L47
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.LLLIIIIL
            if (r0 == 0) goto L40
            java.lang.String r4 = r0.paySource
        L40:
            boolean r0 = X.C13LP.LJJJJ(r4, r1)
            if (r0 != r2) goto L47
            r3 = 1
        L47:
            return r3
        L48:
            r1 = r4
            goto L17
        L4a:
            r1 = 1
            goto L20
        L4c:
            r1 = r4
            goto L7
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03YI.LJIIJJI():boolean");
    }

    public static List LJ() {
        return PaymentViewModel.LLLI;
    }

    public static boolean LJFF() {
        return PaymentViewModel.LLLII;
    }

    public static void LJIIL(List list) {
        PaymentViewModel.LLLI = list;
    }

    public static void LJIILIIL(boolean z) {
        PaymentViewModel.LLLII = z;
    }

    public static void LIZ(C03ZA c03za, List list) {
        List<InstallmentPlan> list2;
        List<InstallmentInfo> list3;
        ArrayList arrayList = (ArrayList) list;
        int iIndexOf = arrayList.indexOf(c03za) + 1;
        ArrayList arrayList2 = new ArrayList();
        PaymentMethod paymentMethod = c03za.LIZ;
        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
        if ((installmentInfo != null || ((list3 = paymentMethod.installmentInfoList) != null && (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list3)) != null)) && (list2 = installmentInfo.installmentPlans) != null && !list2.isEmpty()) {
            PaymentMethod paymentMethod2 = c03za.LIZ;
            C03SY c03sy = C03SY.LIZ;
            String str = paymentMethod2.id;
            c03sy.getClass();
            if (!C03SY.LJIJ(str) || paymentMethod2.LJJJJJ()) {
                arrayList2.add(new C862603Yq(new ElementDTO("SUB_PAYMENT_ELEMENT_ID", null, null, null, null, null, null, null, c03za.LIZ.displayName, null, null, null, null), c03za.LIZ, null));
            }
        }
        arrayList.addAll(iIndexOf, arrayList2);
    }

    public static String LIZJ(String str, String str2) {
        if (Intrinsics.LJFF(EcPaymentAddCardConfigSettings.LIZ().newDisplayNameType, Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_ecom_payment_addcard_title_config", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("(********");
            sbLIZ2.append(str);
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("********");
        sbLIZ3.append(str);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static void LJIIIIZZ(PaymentInfo paymentInfo, List list) {
        String str;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethod paymentMethod;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                PaymentMethod paymentMethod2 = (PaymentMethod) it2.next();
                EcomPaymentPromotionMergeModel ecomPaymentPromotionMergeModel = C03S0.LIZ;
                if (C03S0.LIZ(paymentMethod2.id) && paymentMethod2.LJIIL != null) {
                    String str2 = paymentMethod2.id;
                    Boolean boolIsChooseSave = null;
                    if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                        str = paymentMethod.id;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
                            boolIsChooseSave = paymentMethodInfo.isChooseSave();
                        }
                        paymentMethod2.LJIIJJI = boolIsChooseSave;
                    }
                }
            }
        }
    }

    public static boolean LJIILJJIL(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData) {
        String str;
        CreditInfo creditInfo;
        Amount amount;
        String amount2;
        List<String> list = C864803Zm.LIZ;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!C864803Zm.LIZ(str) || paymentMethodsData == null || (creditInfo = paymentMethodsData.creditInfo) == null || (amount = creditInfo.timeLimitedBalanceAmount) == null || (amount2 = amount.getAmount()) == null || !C770702zh.LIZ(amount2)) {
            return false;
        }
        return true;
    }

    public static PaymentMethod LIZLLL(PaymentMethod paymentMethod, InstallmentPlan installmentPlan, String str) {
        PaymentInfo paymentInfo;
        if (LJIIJ()) {
            C03Q4 c03q4 = C03Q4.LIZ;
            EnterParams enterParams = PaymentViewModel.LLLIIIIL;
            String str2 = null;
            if (enterParams != null) {
                paymentInfo = enterParams.paymentInfo;
            } else {
                paymentInfo = null;
            }
            if (installmentPlan != null) {
                str2 = installmentPlan.tenure;
            }
            return c03q4.LJIIJJI(paymentMethod, c03q4.LJIIL(paymentInfo, str2), str);
        }
        return paymentMethod;
    }

    public static void LJIIIZ(PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData, InterfaceC497601wk interfaceC497601wk) {
        PaymentMethod paymentMethod;
        String str;
        List<String> list;
        String str2;
        boolean z;
        String str3;
        List<String> list2;
        String str4;
        Boolean bool;
        if (LJIIJJI()) {
            EnterParams enterParams = PaymentViewModel.LLLIIIIL;
            if (enterParams != null && enterParams.LJJIFFI) {
                return;
            }
            C03Q4 c03q4 = C03Q4.LIZ;
            if (paymentInfo != null) {
                paymentMethod = paymentInfo.paymentMethod;
            } else {
                paymentMethod = null;
            }
            EnterParams enterParams2 = PaymentViewModel.LLLIIIIL;
            if (enterParams2 != null) {
                str = enterParams2.LJIJJLI;
                list = enterParams2.LJIL;
                str2 = enterParams2.LJJ;
            } else {
                str = null;
                list = null;
                str2 = null;
            }
            if (C03Q4.LIZJ(c03q4, paymentMethod, paymentMethodsData, interfaceC497601wk, str, list, str2, false, false, C03OW.SECOND_PAY_DEFAULT_SELECT.getValue(), 448) || !EcPaymentIndependentPriceConfigSettings.LIZIZ()) {
                return;
            }
            Boolean bool2 = EcPaymentIndependentPriceConfigSettings.LIZJ().secPaySilentPricingRequest;
            if (bool2 != null && !bool2.booleanValue()) {
                return;
            }
            if (EcPaymentIndependentPriceConfigSettings.LIZIZ() && (bool = EcPaymentIndependentPriceConfigSettings.LIZJ().secPaySilentLoading) != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            EnterParams enterParams3 = PaymentViewModel.LLLIIIIL;
            if (enterParams3 != null) {
                str3 = enterParams3.LJIJJLI;
                list2 = enterParams3.LJIL;
                str4 = enterParams3.LJJ;
            } else {
                str3 = null;
                list2 = null;
                str4 = null;
            }
            C03Q4.LJIJJ(c03q4, z, paymentMethodsData, str3, list2, str4, interfaceC497601wk, null, false, C03OW.SECOND_PAY_SILENT.getValue(), UUID.randomUUID().toString(), null, 2496);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public static void LIZIZ(C03ZA c03za, PaymentMethod paymentMethod, List list, PaymentMethod paymentMethod2, PaymentMethodsData paymentMethodsData, EnterParams enterParams) {
        boolean zLJFF;
        String str;
        BindInfo bindInfo;
        String str2;
        boolean z;
        String str3;
        ?? arrayList;
        String str4;
        BindInfo bindInfo2;
        String str5;
        boolean z2;
        boolean z3;
        boolean zLJJJJJ;
        List<InstallmentInfo> list2;
        boolean z4;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list3;
        Object c862603Yq;
        List<InstallmentPlan> list4;
        String str6;
        if (C03S8.LJIILJJIL(paymentMethod.id) || C03MT.LIZIZ(paymentMethod.id)) {
            return;
        }
        if (PaymentViewModel.LLLII && paymentMethod.LIZIZ) {
            C03SY c03sy = C03SY.LIZ;
            String str7 = paymentMethod.id;
            c03sy.getClass();
            if (!C03SY.LJIJI(str7)) {
                return;
            }
        }
        Availability availability = c03za.LIZ.availability;
        if (availability != null) {
            zLJFF = Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C03SY c03sy2 = C03SY.LIZ;
        String str8 = paymentMethod.id;
        c03sy2.getClass();
        if (C03SY.LJIJ(str8) && paymentMethod.LIZIZ) {
            LIZ(c03za, list);
            return;
        }
        if (zLJFF) {
            ArrayList arrayList2 = (ArrayList) list;
            int iIndexOf = arrayList2.indexOf(c03za) + 1;
            List<ElementDTO> listLJIIJJI = paymentMethod.LJIIJJI();
            if (listLJIIJJI != null) {
                arrayList = new ArrayList();
                for (ElementDTO elementDTO : listLJIIJJI) {
                    C903403g0 c903403g0 = InterfaceC884803d0.LJIL;
                    PaymentMethod paymentMethod3 = c03za.LIZ;
                    c903403g0.getClass();
                    C862703Yr c862703YrLIZIZ = C903403g0.LIZIZ(elementDTO, paymentMethod3);
                    if (c862703YrLIZIZ != null) {
                        arrayList.add(c862703YrLIZIZ);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList((Collection) arrayList);
            String str9 = c03za.LIZ.saveDisplayText;
            if (str9 != null && str9.length() != 0) {
                arrayList3.add(new C03YP(new ElementDTO("save_element", null, null, null, null, null, null, null, c03za.LIZ.saveDisplayText, null, null, null, null), c03za.LIZ));
            }
            PaymentTip paymentTip = c03za.LIZ.paymentTip;
            if ((paymentTip == null || (str6 = paymentTip.tips) == null || str6.length() <= 0) && ((((str4 = c03za.LIZ.balance) != null && str4.length() != 0) || ((bindInfo2 = c03za.LIZ.bindInfo) != null && (str5 = bindInfo2.buttonText) != null && str5.length() != 0)) && !LJIILJJIL(c03za.LIZ, paymentMethodsData))) {
                if (paymentMethod2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList3.add(new C866803a6(new ElementDTO("balance_element", null, null, null, null, null, null, null, c03za.LIZ.displayName, null, null, null, null), c03za.LIZ, null, z2));
            }
            if (c03za.LIZ.unfoldStrategy == UnfoldStrategy.SUB_PAYMENT_FOLD_BELOW) {
                arrayList3.add(new C861503Yf(new ElementDTO("SUB_PAYMENT_ELEMENT_ID", null, null, null, null, null, null, null, c03za.LIZ.displayName, null, null, null, null), c03za.LIZ));
            }
            boolean zLIZ = C03WK.LIZ(enterParams);
            boolean zLJJJI = c03za.LIZ.LJJJI();
            boolean zLIZLLL = C03YJ.LIZLLL(c03za.LIZ);
            if (zLJJJI && !zLIZ && !zLIZLLL) {
                z3 = false;
            } else {
                z3 = true;
            }
            PaymentMethod paymentMethod4 = c03za.LIZ;
            C03SY c03sy3 = C03SY.LIZ;
            String str10 = paymentMethod4.id;
            c03sy3.getClass();
            if (!C03SY.LJIJ(str10)) {
                zLJJJJJ = true;
            } else {
                zLJJJJJ = paymentMethod4.LJJJJJ();
            }
            InstallmentInfo installmentInfo2 = c03za.LIZ.installmentInfo;
            if ((installmentInfo2 == null || (list4 = installmentInfo2.installmentPlans) == null || list4.isEmpty()) && ((list2 = c03za.LIZ.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list2)) == null || (list3 = installmentInfo.installmentPlans) == null || list3.isEmpty())) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z3 && zLJJJJJ && z4) {
                if (zLJJJI && zLIZ && zLIZLLL) {
                    final ElementDTO elementDTO2 = new ElementDTO("SUB_PAYMENT_ELEMENT_ID", null, null, null, null, null, null, null, c03za.LIZ.displayName, null, null, null, null);
                    final PaymentMethod paymentMethod5 = c03za.LIZ;
                    c862603Yq = new C862703Yr(elementDTO2, paymentMethod5) { // from class: X.03YO
                    };
                } else {
                    c862603Yq = new C862603Yq(new ElementDTO("SUB_PAYMENT_ELEMENT_ID", null, null, null, null, null, null, null, c03za.LIZ.displayName, null, null, null, null), c03za.LIZ, null);
                }
                arrayList3.add(c862603Yq);
            }
            arrayList2.addAll(iIndexOf, arrayList3);
            return;
        }
        ArrayList arrayList4 = (ArrayList) list;
        int iIndexOf2 = arrayList4.indexOf(c03za) + 1;
        ArrayList arrayList5 = new ArrayList();
        PaymentTip paymentTip2 = c03za.LIZ.paymentTip;
        if ((paymentTip2 == null || (str3 = paymentTip2.tips) == null || str3.length() <= 0) && ((((str = c03za.LIZ.balance) != null && str.length() != 0) || ((bindInfo = c03za.LIZ.bindInfo) != null && (str2 = bindInfo.buttonText) != null && str2.length() != 0)) && !LJIILJJIL(c03za.LIZ, paymentMethodsData))) {
            if (paymentMethod2 != null) {
                z = true;
            } else {
                z = false;
            }
            arrayList5.add(new C866803a6(new ElementDTO("balance_element", null, null, null, null, null, null, null, c03za.LIZ.displayName, null, null, null, null), c03za.LIZ, null, z));
        }
        arrayList4.addAll(iIndexOf2, arrayList5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031a A[LOOP:3: B:174:0x0314->B:176:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05d2 A[LOOP:9: B:320:0x05cc->B:322:0x05d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0608 A[LOOP:10: B:328:0x0602->B:330:0x0608, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x07c8 A[PHI: r12
      0x07c8: PHI (r12v6 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) = 
      (r12v2 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
      (r12v8 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod)
     binds: [B:417:0x07a2, B:415:0x079c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0935  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0a9d A[PHI: r2
      0x0a9d: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v11 java.lang.String) binds: [B:598:0x0a9a, B:579:0x0a2d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.bytedance.ies.abmock.SettingsManager] */
    /* JADX WARN: Type inference failed for: r4v17, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState LJI(java.lang.Integer r25, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData r26, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r27, java.lang.Boolean r28, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r29, X.InterfaceC497601wk r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 2719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03YI.LJI(java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams, X.01wk, boolean, boolean, boolean):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState");
    }
}

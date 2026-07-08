package X;

import Y.AfS137S0200000_1;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentAddCardConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPaymentCciSeparateInstallmentTypeModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBinPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CardBinPromotionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CouponDimensionType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03SY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SY {
    public static final C03SY LIZ = new C03SY();

    public static String LIZ(String str) {
        if (str != null) {
            return u.LJJIFFI(str, "ccdc", "cci", false);
        }
        return null;
    }

    public static String LIZIZ(String str) {
        if (str != null) {
            return u.LJJIFFI(str, "cci", "ccdc", false);
        }
        return null;
    }

    public static boolean LIZJ(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            return false;
        }
        if (!Intrinsics.LJFF(EcPaymentAddCardConfigSettings.LIZ().cciInstallmentSeparateSelect, Boolean.TRUE) || !LJIJ(paymentMethod.id) || !paymentMethod.LIZIZ) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("ec_payment_enable_cci_bind_card_fold", false)) {
                return false;
            }
        }
        return true;
    }

    public static String LJ(String str) {
        if (str != null) {
            try {
                C1724230uyD.LIZ.getClass();
                str = C1724230uyD.LIZ().LIZ(str);
                return str;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                return str;
            }
        }
        return null;
    }

    public static String LJII(List list) {
        Object next;
        String str;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((PaymentElement) next).element, "eg_ccdc_global_card_number")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentElement paymentElement = (PaymentElement) next;
        if (paymentElement == null || (str = paymentElement.paramValue) == null) {
            return null;
        }
        LIZ.getClass();
        return LJ(str);
    }

    public static EnumC865103Zp LJIIIIZZ(CciCashierDisplayType cciCashierDisplayType) {
        if (cciCashierDisplayType != null) {
            int i = C805103Cn.LIZ[cciCashierDisplayType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return EnumC865103Zp.FILL_NEW_CCI_CARD_BR;
                        }
                        return null;
                    }
                    return EnumC865103Zp.FILL_NEW_CCI_CARD_BR;
                }
                return EnumC865103Zp.FILL_NEW_CCI_CARD_US;
            }
            return EnumC865103Zp.SELECT_BANK_INSTALLMENT_SEA;
        }
        return null;
    }

    public static String LJIIIZ(List list) {
        Object next;
        String str;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((PaymentElement) next).element, "eg_ccdc_global_cvv")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentElement paymentElement = (PaymentElement) next;
        if (paymentElement == null || (str = paymentElement.paramValue) == null) {
            return null;
        }
        LIZ.getClass();
        return LJ(str);
    }

    public static String LJIIJ(List list) {
        Object next;
        String str;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((PaymentElement) next).element, "eg_ccdc_global_expiration_month")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentElement paymentElement = (PaymentElement) next;
        if (paymentElement == null || (str = paymentElement.paramValue) == null) {
            return null;
        }
        LIZ.getClass();
        return LJ(str);
    }

    public static String LJIIJJI(List list) {
        Object next;
        String str;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((PaymentElement) next).element, "eg_ccdc_global_expiration_year")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentElement paymentElement = (PaymentElement) next;
        if (paymentElement == null || (str = paymentElement.paramValue) == null) {
            return null;
        }
        LIZ.getClass();
        return LJ(str);
    }

    public static String LJIIL(List list) {
        Object next;
        String str;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((PaymentElement) next).element, "eg_ccdc_global_holder_name")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentElement paymentElement = (PaymentElement) next;
        if (paymentElement == null || (str = paymentElement.paramValue) == null) {
            return null;
        }
        LIZ.getClass();
        return LJ(str);
    }

    public static boolean LJIIZILJ(String str) {
        return Intrinsics.LJFF(str, "pm_pi_cci_all");
    }

    public static boolean LJIJ(String str) {
        if (str != null && u.LJJIIJZLJL(str, "pm_pi_cci_", false) && !Intrinsics.LJFF(str, "pm_pi_cci_all")) {
            return true;
        }
        return false;
    }

    public static boolean LJIJI(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "pm_pi_cci_", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJ(PaymentMethod paymentMethod) {
        String str;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!LJIJ(str) || paymentMethod == null || !paymentMethod.LIZIZ) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJLI(PaymentMethod paymentMethod) {
        String str;
        String str2 = null;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (LJIJ(str)) {
            if (paymentMethod != null) {
                str2 = paymentMethod.token;
            }
            if (C123100dR.LIZ(str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJJ(String str) {
        List<String> list;
        if (str != null) {
            try {
                ((C931203kU) C1724150uy5.LJIIL.LIZ()).getClass();
                try {
                    Map<String, ? extends List<String>> map = C845503Sb.LIZIZ;
                    if (map != null) {
                        list = map.get(str);
                    } else {
                        list = null;
                    }
                    C845503Sb.LIZJ = list;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Get dataSourceService error: ");
                sbLIZ.append(e2);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static boolean LIZLLL(CciCashierDisplayType cciCashierDisplayType, String str) {
        Integer numValueOf;
        EcomPaymentCciSeparateInstallmentTypeModel ecomPaymentCciSeparateInstallmentTypeModel = C845603Sc.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomPaymentCciSeparateInstallmentTypeModel ecomPaymentCciSeparateInstallmentTypeModel2 = C845603Sc.LIZ;
        EcomPaymentCciSeparateInstallmentTypeModel ecomPaymentCciSeparateInstallmentTypeModel3 = (EcomPaymentCciSeparateInstallmentTypeModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_payment_cci_separate_installment_type", EcomPaymentCciSeparateInstallmentTypeModel.class, ecomPaymentCciSeparateInstallmentTypeModel2);
        if (ecomPaymentCciSeparateInstallmentTypeModel3 != null) {
            ecomPaymentCciSeparateInstallmentTypeModel2 = ecomPaymentCciSeparateInstallmentTypeModel3;
        }
        List<Integer> list = ecomPaymentCciSeparateInstallmentTypeModel2.enableSeparate;
        if (cciCashierDisplayType != null) {
            numValueOf = Integer.valueOf(cciCashierDisplayType.getValue());
        } else {
            numValueOf = null;
        }
        if (C13LP.LJJJJ(numValueOf, list) && LJIJI(str)) {
            return true;
        }
        return false;
    }

    public static void LJFF(C03SY c03sy, PaymentMethodsData paymentMethodsData) {
        boolean zContainsKey;
        String str;
        AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(332);
        c03sy.getClass();
        try {
            ((C931203kU) C1724150uy5.LJIIL.LIZ()).getClass();
            String str2 = paymentMethodsData.countryCode;
            Map<String, Map<String, List<String>>> map = C845503Sb.LIZ;
            zContainsKey = map.containsKey(str2);
            if (zContainsKey) {
                C845503Sb.LIZIZ = (Map) ((LinkedHashMap) map).get(str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zContainsKey = false;
        }
        if (paymentMethodsData.cciCashierDisplayType == CciCashierDisplayType.DIFFERENT_ENTRANCE_WITH_CCDC_HAVE_BANK_CODE && !zContainsKey && (str = paymentMethodsData.countryCode) != null) {
            LJIL(LIZ, str, aFwS185S0000000_1, null, 10);
        }
    }

    public static C873003b6 LJI(InstallmentPlan installmentPlan, PaymentMethod paymentMethod) {
        List<InstallmentPlan> list;
        if (paymentMethod == null) {
            return null;
        }
        C03SY c03sy = LIZ;
        String str = paymentMethod.id;
        c03sy.getClass();
        if (!LJIJ(str)) {
            return null;
        }
        InstallmentInfo installmentInfo = paymentMethod.installmentInfo;
        if (installmentInfo == null) {
            List<InstallmentInfo> list2 = paymentMethod.installmentInfoList;
            if (list2 == null) {
                return null;
            }
            installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list2);
        }
        if (installmentInfo == null || (list = installmentInfo.installmentPlans) == null) {
            return null;
        }
        for (InstallmentPlan installmentPlan2 : list) {
            if (Intrinsics.LJFF(installmentPlan2, installmentPlan)) {
                if (installmentPlan2 == null) {
                    return null;
                }
                String str2 = paymentMethod.iconUrl;
                return new C873003b6(str2, str2, installmentInfo.bankCode, installmentInfo.bankName, installmentInfo, paymentMethod, (String) null, 192);
            }
        }
        return null;
    }

    public static void LJIILIIL(Function0 function0, InterfaceC1631630sYr interfaceC1631630sYr) {
        C907003ga c907003ga = InterfaceC907103gb.LIZ;
        Boolean bool = Boolean.FALSE;
        c907003ga.getClass();
        C907003ga.LIZ(bool, "").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS137S0200000_1(interfaceC1631630sYr, function0, 11), new C516201zk(function0, 235));
    }

    public static C443120HZe LJIILLIIL(InstallmentInfo installmentInfo, PaymentMethod paymentMethod, String str) {
        List<PaymentPromotion> list;
        InstallmentInfo installmentInfoLIZIZ;
        InstallmentInfo installmentInfoLIZIZ2;
        InstallmentPlan installmentPlan;
        PaymentPromotion paymentPromotion;
        List<Integer> couponDimensions;
        ArrayList arrayList;
        List<CardBinPromotion> cardBinPromos;
        InstallmentPlan installmentPlan2;
        PaymentPromotion paymentPromotion2;
        List<Integer> couponDimensions2;
        List<PaymentPromotion> list2;
        List<PaymentPromotion> list3 = null;
        if (paymentMethod != null) {
            list = paymentMethod.promotionInfo;
        } else {
            list = null;
        }
        if ((list == null || ((list2 = paymentMethod.promotionInfo) != null && list2.isEmpty())) && (installmentInfo == null || installmentInfo.promotionInfo == null)) {
            EnumC845403Sa enumC845403Sa = EnumC845403Sa.NO_PROMOTION;
            if (installmentInfo != null) {
                installmentInfoLIZIZ = InstallmentInfo.LIZIZ(installmentInfo);
            } else {
                installmentInfoLIZIZ = null;
            }
            return new C443120HZe(enumC845403Sa, installmentInfoLIZIZ, null);
        }
        if (installmentInfo != null && installmentInfo.promotionInfo != null) {
            List<InstallmentPlan> list4 = installmentInfo.installmentPlans;
            if (list4 != null && (installmentPlan2 = (InstallmentPlan) C13LP.LJJJLL(list4)) != null && (paymentPromotion2 = installmentPlan2.promotionInfo) != null && (couponDimensions2 = paymentPromotion2.getCouponDimensions()) != null) {
                Integer num = (Integer) C13LP.LJJJLL(couponDimensions2);
                int value = CouponDimensionType.COUPON_DIMENSION_TYPE_BANK_CODE.getValue();
                if (num != null && num.intValue() == value) {
                    EnumC845403Sa enumC845403Sa2 = EnumC845403Sa.BANK_PROMOTION_HIT;
                    InstallmentInfo installmentInfoLIZIZ3 = InstallmentInfo.LIZIZ(installmentInfo);
                    PaymentPromotion paymentPromotion3 = installmentInfo.promotionInfo;
                    return new C443120HZe(enumC845403Sa2, installmentInfoLIZIZ3, Collections.singletonList(paymentPromotion3.copy(paymentPromotion3.desc, paymentPromotion3.selectedDesc, paymentPromotion3.amount, paymentPromotion3.descInEditStatus, paymentPromotion3.cardBinPromotionInfo, paymentPromotion3.promotionId, paymentPromotion3.promotionAmountValue, paymentPromotion3.promotionCurrency, paymentPromotion3.promotionLink, paymentPromotion3.promotionDescHeader, paymentPromotion3.isNotMeetPromotionThreshold, paymentPromotion3.promotionBatchId, paymentPromotion3.notDeductableOnMarketingBindPaymentMethod, paymentPromotion3.hideMarketingAmount, paymentPromotion3.couponDimensions, paymentPromotion3.isCardBindPromotion, paymentPromotion3.cardBindPromotionPopupInfo, paymentPromotion3.cashierBindPiPromoDesc, paymentPromotion3.cashierBindPiPromoDescSelected, paymentPromotion3.daInfo, paymentPromotion3.promotionFormat, paymentPromotion3.isBonusTypePromotion)));
                }
            }
            List<InstallmentPlan> list5 = installmentInfo.installmentPlans;
            if (list5 != null && (installmentPlan = (InstallmentPlan) C13LP.LJJJLL(list5)) != null && (paymentPromotion = installmentPlan.promotionInfo) != null && (couponDimensions = paymentPromotion.getCouponDimensions()) != null) {
                Integer num2 = (Integer) C13LP.LJJJLL(couponDimensions);
                int value2 = CouponDimensionType.COUPON_DIMENSION_TYPE_CARD_BIN.getValue();
                if (num2 != null && num2.intValue() == value2) {
                    CardBinPromotionInfo cardBinPromotionInfo = paymentPromotion.getCardBinPromotionInfo();
                    if (cardBinPromotionInfo != null && (cardBinPromos = cardBinPromotionInfo.getCardBinPromos()) != null) {
                        Iterator<CardBinPromotion> it2 = cardBinPromos.iterator();
                        while (it2.hasNext()) {
                            String str2 = it2.next().cardBin;
                            if (str2 != null && str != null && u.LJJIIJZLJL(str, str2, false)) {
                                EnumC845403Sa enumC845403Sa3 = EnumC845403Sa.CARD_BIN_PROMOTION_HIT;
                                InstallmentInfo installmentInfoLIZIZ4 = InstallmentInfo.LIZIZ(installmentInfo);
                                PaymentPromotion paymentPromotion4 = installmentInfo.promotionInfo;
                                return new C443120HZe(enumC845403Sa3, installmentInfoLIZIZ4, Collections.singletonList(paymentPromotion4.copy(paymentPromotion4.desc, paymentPromotion4.selectedDesc, paymentPromotion4.amount, paymentPromotion4.descInEditStatus, paymentPromotion4.cardBinPromotionInfo, paymentPromotion4.promotionId, paymentPromotion4.promotionAmountValue, paymentPromotion4.promotionCurrency, paymentPromotion4.promotionLink, paymentPromotion4.promotionDescHeader, paymentPromotion4.isNotMeetPromotionThreshold, paymentPromotion4.promotionBatchId, paymentPromotion4.notDeductableOnMarketingBindPaymentMethod, paymentPromotion4.hideMarketingAmount, paymentPromotion4.couponDimensions, paymentPromotion4.isCardBindPromotion, paymentPromotion4.cardBindPromotionPopupInfo, paymentPromotion4.cashierBindPiPromoDesc, paymentPromotion4.cashierBindPiPromoDescSelected, paymentPromotion4.daInfo, paymentPromotion4.promotionFormat, paymentPromotion4.isBonusTypePromotion)));
                            }
                        }
                    }
                    String str3 = installmentInfo.availableCredit;
                    String str4 = installmentInfo.disclaimer;
                    List<InstallmentPlan> list6 = installmentInfo.installmentPlans;
                    if (list6 != null) {
                        arrayList = new ArrayList();
                        Iterator<InstallmentPlan> it3 = list6.iterator();
                        while (it3.hasNext()) {
                            InstallmentPlan installmentPlan3 = it3.next().cciNoPromoInstallmentPlan;
                            if (installmentPlan3 != null) {
                                arrayList.add(installmentPlan3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return new C443120HZe(EnumC845403Sa.CARD_BIN_PROMOTION_MISSING, new InstallmentInfo(str3, str4, arrayList, installmentInfo.orderAmount, installmentInfo.displayName, installmentInfo.bankName, installmentInfo.bankCode, installmentInfo.iconUrl, installmentInfo.iconUrlDark, installmentInfo.installmentFoldNum, installmentInfo.interestFeePromotionDesc, null, null, null, null, null, null, null, null, null), null);
                }
            }
            EnumC845403Sa enumC845403Sa4 = EnumC845403Sa.NO_PROMOTION;
            if (paymentMethod != null) {
                list3 = paymentMethod.promotionInfo;
            }
            return new C443120HZe(enumC845403Sa4, installmentInfo, list3);
        }
        EnumC845403Sa enumC845403Sa5 = EnumC845403Sa.BANK_PROMOTION_MISSING;
        if (installmentInfo != null) {
            installmentInfoLIZIZ2 = InstallmentInfo.LIZIZ(installmentInfo);
        } else {
            installmentInfoLIZIZ2 = null;
        }
        return new C443120HZe(enumC845403Sa5, installmentInfoLIZIZ2, null);
    }

    public static void LJIL(C03SY c03sy, String str, Function0 function0, AwS545S0100000_1 awS545S0100000_1, int i) {
        if ((i & 4) != 0) {
            function0 = AFwS185S0000000_1.get$arr$(333);
        }
        Function0 function02 = awS545S0100000_1;
        if ((i & 8) != 0) {
            function02 = AFwS185S0000000_1.get$arr$(334);
        }
        c03sy.getClass();
        LJIILIIL(new AwS545S0100000_1(function02, (Function0<Unit>) 1621), new C915003hs(str, null, function0, function02));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo r15, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r16, java.lang.String r17, X.InterfaceC497601wk r18, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r19, kotlin.jvm.functions.Function1 r20) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03SY.LJIILJJIL(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, java.lang.String, X.01wk, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, kotlin.jvm.functions.Function1):void");
    }
}

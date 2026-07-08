package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcomPipoRandomPromotionConfigModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomCardRulesV2PmidsSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcomSeparateCardBindEntrancePmidsSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CciCashierDisplayType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CombinePaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CreditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03S8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03S8 {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("oneunita.com", "pipopayment.com");
    public static final ConcurrentHashMap<String, PaymentMethod> LIZIZ = new ConcurrentHashMap<>();

    public static boolean LJIIL() {
        return LIZIZ.get("pm_pi_atmcard_all") != null;
    }

    public static boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoEcomCardRulesV2PmidsSettings.CardRulesV2Model cardRulesV2Model = PipoEcomCardRulesV2PmidsSettings.LIZ;
        PipoEcomCardRulesV2PmidsSettings.CardRulesV2Model cardRulesV2Model2 = (PipoEcomCardRulesV2PmidsSettings.CardRulesV2Model) settingsManagerLIZLLL.LJIIIIZZ("pipo_ecom_card_rules_v2_pmids", PipoEcomCardRulesV2PmidsSettings.CardRulesV2Model.class, cardRulesV2Model);
        if (cardRulesV2Model2 != null) {
            cardRulesV2Model = cardRulesV2Model2;
        }
        return cardRulesV2Model.enabledPaymentMethodIds.contains(str);
    }

    public static Amount LJII(PaymentMethod paymentMethod) {
        Amount amount;
        if (paymentMethod != null) {
            HybridPaymentInfo hybridPaymentInfo = paymentMethod.hybridPaymentInfo;
            if (hybridPaymentInfo == null || (amount = hybridPaymentInfo.actualPaymentAmount) == null) {
                C7767031p c7767031p = paymentMethod.LJFF;
                if (c7767031p != null) {
                    return c7767031p.LIZJ;
                }
                return null;
            }
            return amount;
        }
        return null;
    }

    public static String LJIIIZ(PaymentMethodsData paymentMethodsData) {
        List<PaymentMethod> listLJII;
        if (paymentMethodsData != null && (listLJII = paymentMethodsData.LJII(true)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
            Iterator<PaymentMethod> it2 = listLJII.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().id);
            }
            return arrayList.toString();
        }
        return null;
    }

    public static InstallmentPlan LJIIJ(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        String str;
        String str2;
        InstallmentPlan installmentPlan = null;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || (installmentInfo = paymentMethod.installmentInfo) == null || (list = installmentInfo.installmentPlans) == null) {
            return null;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InstallmentPlan next = it2.next();
            InstallmentPlan installmentPlan2 = next;
            String str3 = installmentPlan2.tenure;
            PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo != null) {
                str = paymentMethodInfo.tenure;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str3, str)) {
                String str4 = installmentPlan2.id;
                PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                if (paymentMethodInfo2 != null) {
                    str2 = paymentMethodInfo2.installmentPlanId;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str4, str2)) {
                    installmentPlan = next;
                    break;
                }
            }
        }
        return installmentPlan;
    }

    public static String LJIIJJI(String str) {
        if (C13LP.LJJJJ(str, C864803Zm.LJFF)) {
            return "date";
        }
        if (C13LP.LJJJJ(str, C864803Zm.LJI)) {
            return "holder";
        }
        if (C13LP.LJJJJ(str, C864803Zm.LJII)) {
            return "card_number";
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public static void LJIILIIL(PaymentMethodsData paymentMethodsData) {
        LIZIZ.clear();
        Iterator it2 = ((ArrayList) C15438062q.LJIJJLI(C13LQ.LJIJI(new List[]{paymentMethodsData.paymentMethods, paymentMethodsData.storedMethods}))).iterator();
        while (it2.hasNext()) {
            LIZ((PaymentMethod) it2.next(), 1);
        }
    }

    public static boolean LJIILJJIL(String str) {
        List<PaymentMethod> list;
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "pm_pi_atmcard_all")) {
            PaymentMethod paymentMethod = LIZIZ.get("pm_pi_atmcard_all");
            if (paymentMethod == null || (list = paymentMethod.subPaymentMethods) == null) {
                return false;
            }
            for (PaymentMethod paymentMethod2 : list) {
                if (Intrinsics.LJFF(paymentMethod2.id, str)) {
                    if (paymentMethod2 == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean LJIILL(String str) {
        if (str == null) {
            return false;
        }
        return u.LJJIIJZLJL(str, "eg_ccdc_global_billing_address", false);
    }

    public static boolean LJIILLIIL(String str) {
        if (str == null) {
            return false;
        }
        return Intrinsics.LJFF(str, "pm_pi_mb_bizum_c_d");
    }

    public static boolean LJIIZILJ(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "pm_pi_bt_blik_c_d") && !Intrinsics.LJFF(str, "pm_pi_bt_blikoneclick_c_d")) {
            return false;
        }
        return true;
    }

    public static boolean LJIJ(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        String str;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || !LJIILLIIL(paymentMethod.id) || (str = paymentMethod.token) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean LJIJI(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        String str;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || !Intrinsics.LJFF(paymentMethod.id, "pm_pi_bt_blikoneclick_c_d") || (str = paymentMethod.token) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJ(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "pm_pi_ccdc_", false) || Intrinsics.LJFF(str, "pm_pi_ccdc_all")) {
            return false;
        }
        return true;
    }

    public static boolean LJIJJLI(String str) {
        if (str == null || !u.LJJIIJZLJL(str, "pm_pi_ccdc_", false) || !a0.LJJIIZI(str, "hsafsa", false) || Intrinsics.LJFF(str, "pm_pi_ccdc_hsafsa_all")) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(String str) {
        if (str == null) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "pm_pi_ccdc_hsafsa_all") && !LJIJJLI(str)) {
            return false;
        }
        return true;
    }

    public static boolean LJJ(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || !LJIILLIIL(paymentMethod.id)) {
            return false;
        }
        String str = paymentMethod.token;
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean LJJI(PaymentInfo paymentInfo) {
        PaymentMethod paymentMethod;
        if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || !LJIIZILJ(paymentMethod.id)) {
            return false;
        }
        String str = paymentMethod.token;
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static boolean LJJIII(String str) {
        if (str == null) {
            return false;
        }
        PipoEcomSeparateCardBindEntrancePmidsSettings.PipoEcomSeparateCardBindEntranceModel pipoEcomSeparateCardBindEntranceModel = PipoEcomSeparateCardBindEntrancePmidsSettings.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoEcomSeparateCardBindEntrancePmidsSettings.PipoEcomSeparateCardBindEntranceModel pipoEcomSeparateCardBindEntranceModel2 = PipoEcomSeparateCardBindEntrancePmidsSettings.LIZ;
        PipoEcomSeparateCardBindEntrancePmidsSettings.PipoEcomSeparateCardBindEntranceModel pipoEcomSeparateCardBindEntranceModel3 = (PipoEcomSeparateCardBindEntrancePmidsSettings.PipoEcomSeparateCardBindEntranceModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_ecom_separate_card_bind_entrance_pmids", PipoEcomSeparateCardBindEntrancePmidsSettings.PipoEcomSeparateCardBindEntranceModel.class, pipoEcomSeparateCardBindEntranceModel2);
        if (pipoEcomSeparateCardBindEntranceModel3 != null) {
            pipoEcomSeparateCardBindEntranceModel2 = pipoEcomSeparateCardBindEntranceModel3;
        }
        return C13LP.LJJJJ(str, pipoEcomSeparateCardBindEntranceModel2.allowPaymentMethodIds);
    }

    public static String LJJIJIIJIL(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        try {
            Uri uri = UriProtector.parse(str);
            boolean z4 = true;
            if (Intrinsics.LJFF(uri.getScheme(), "aweme")) {
                Uri uri2 = UriProtector.parse(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"));
                List<String> list = LIZ;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str2 : list) {
                        String host = uri2.getHost();
                        if (host != null && u.LJIIZILJ(host, str2, false)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            break;
                        }
                    }
                }
                z4 = false;
                if (z4) {
                    return uri.buildUpon().appendQueryParameter("target_handler", "pipo_hybrid").appendQueryParameter("disable_auto_append_crossplatform_plugin", "1").appendQueryParameter("use_spark", "1").build().toString();
                }
            } else {
                List<String> list2 = LIZ;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (String str3 : list2) {
                        String host2 = uri.getHost();
                        if (host2 != null && u.LJIIZILJ(host2, str3, false)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    Uri.Builder builderAuthority = new Uri.Builder().scheme("aweme").authority("webview");
                    C1976807ok.LIZIZ(builderAuthority, C2097608Jq.LJIIIIZZ(new Pair("url", str), new Pair("target_handler", "pipo_hybrid"), new Pair("disable_auto_append_crossplatform_plugin", "1"), new Pair("use_spark", "1")));
                    return builderAuthority.build().toString();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return str;
    }

    public static void LIZ(PaymentMethod paymentMethod, int i) {
        if (i < 0) {
            return;
        }
        LIZIZ.put(paymentMethod.LJJI(), paymentMethod);
        List<PaymentMethod> list = paymentMethod.subPaymentMethods;
        if (list != null) {
            Iterator<PaymentMethod> it2 = list.iterator();
            while (it2.hasNext()) {
                LIZ(it2.next(), i - 1);
            }
        }
    }

    public static PaymentMethod LIZLLL(PaymentMethod paymentMethod, List list) {
        Object next;
        List<PaymentMethod> list2;
        String str;
        String str2;
        PaymentMethod paymentMethod2 = null;
        if (list == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List<PaymentMethod> list3 = ((PaymentMethod) next).subPaymentMethods;
                if (list3 != null) {
                    Iterator<PaymentMethod> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        String str3 = it3.next().id;
                        if (paymentMethod != null) {
                            str2 = paymentMethod.id;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str3, str2)) {
                            break loop0;
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentMethod paymentMethod3 = (PaymentMethod) next;
        if (paymentMethod3 == null || (list2 = paymentMethod3.subPaymentMethods) == null) {
            return null;
        }
        Iterator<PaymentMethod> it4 = list2.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            PaymentMethod next2 = it4.next();
            String str4 = next2.id;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str4, str)) {
                paymentMethod2 = next2;
                break;
            }
        }
        return paymentMethod2;
    }

    public static PaymentInfo LJ(PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData) {
        List<CreditInfo> list;
        CreditInfo next;
        List listLJIILL;
        String str;
        String str2;
        if (paymentInfo == null) {
            return null;
        }
        if (paymentMethodsData != null) {
            PaymentMethod paymentMethod = paymentInfo.LIZIZ;
            AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(849);
            CombinePaymentInfo combinePaymentInfo = paymentMethodsData.combinePaymentInfo;
            if (combinePaymentInfo != null && (list = combinePaymentInfo.creditInfoList) != null) {
                Iterator<CreditInfo> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        PaymentMethod paymentMethod2 = next.creditPaymentMethod;
                        if (paymentMethod2 != null) {
                            str = paymentMethod2.id;
                        } else {
                            str = null;
                        }
                        if (paymentMethod != null) {
                            str2 = paymentMethod.id;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str, str2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                CreditInfo creditInfo = next;
                if (creditInfo != null) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("ec_payment_recommend_convert", true)) {
                        listLJIILL = C03QF.LIZIZ(PaymentMethodsData.LJIILL(creditInfo.recommendPaymentMethods));
                    } else {
                        listLJIILL = PaymentMethodsData.LJIILL(creditInfo.recommendPaymentMethods);
                    }
                    PaymentMethod paymentMethodLIZIZ = PaymentMethodsData.LIZIZ(listLJIILL, 2, aFwS228S0000000_1);
                    if (paymentMethodLIZIZ != null) {
                        return new PaymentInfo(null, paymentMethodLIZIZ, null, null, null, null, null, paymentInfo.LIZIZ, paymentInfo.LIZJ, new LinkedHashMap(), null);
                    }
                }
            }
        }
        return paymentInfo;
    }

    public static List LJJII(List list, List list2) {
        if (list == null) {
            if (list2 == null) {
                return C13BV.INSTANCE;
            }
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = ((PaymentElement) it2.next()).element;
            if (str != null) {
                hashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!C13LP.LJJJJ(((PaymentElement) obj).element, hashSet)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.addAll(list2);
        return arrayList2;
    }

    public static boolean LJJIIJ(PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData) {
        PaymentMethod paymentMethod;
        String str;
        List<ElementDTO> list;
        if (paymentMethodsData != null && paymentMethodsData.LJJII() && paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null && LJIJJ(paymentMethod.id) && (str = paymentMethod.token) != null && str.length() != 0 && (list = paymentMethod.neededElementDTOS) != null && !list.isEmpty()) {
            Iterator<ElementDTO> it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().id;
                if (str2 != null && Intrinsics.LJFF(str2, "eg_ccdc_global_cvv")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(PaymentMethodInfo paymentMethodInfo, PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData) {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig = C03SC.LIZ;
        PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig2 = (PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_sns_bound_ccdc_cvv_update_payment_method", PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.class, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig);
        if (pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig2 != null) {
            pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig = pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig2;
        }
        Boolean bool = pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enable;
        Boolean bool2 = Boolean.FALSE;
        if (!Intrinsics.LJFF(bool, bool2) && Intrinsics.LJFF(pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableChooseSaveOverride, Boolean.TRUE) && LJJIIJ(paymentInfo, paymentMethodsData)) {
            paymentMethodInfo.setChooseSave(bool2);
        }
    }

    public static Amount LJI(PaymentMethod paymentMethod, PaymentMethodsData paymentMethodsData, InstallmentPlan installmentPlan) {
        CreditInfo creditInfoLJIJJ;
        Amount amount;
        InstallmentPlan installmentPlan2;
        HybridPaymentInfo hybridPaymentInfo;
        HybridPaymentInfo hybridPaymentInfo2;
        if (paymentMethodsData != null) {
            creditInfoLJIJJ = paymentMethodsData.LJIJJ(paymentMethod);
        } else {
            creditInfoLJIJJ = null;
        }
        if (Intrinsics.LJFF(paymentMethod.id, "pm_pi_ins_pipobnpl_c_d")) {
            if (installmentPlan == null || (((installmentPlan2 = installmentPlan.displayInstallmentPlan) == null || (hybridPaymentInfo2 = installmentPlan2.hybridPaymentInfo) == null || (amount = hybridPaymentInfo2.actualPaymentAmount) == null) && ((hybridPaymentInfo = installmentPlan.hybridPaymentInfo) == null || (amount = hybridPaymentInfo.actualPaymentAmount) == null))) {
                if (creditInfoLJIJJ == null) {
                    return null;
                }
                return creditInfoLJIJJ.creditPaymentAmount;
            }
        } else {
            HybridPaymentInfo hybridPaymentInfo3 = paymentMethod.hybridPaymentInfo;
            if (hybridPaymentInfo3 == null || (amount = hybridPaymentInfo3.actualPaymentAmount) == null) {
                if (creditInfoLJIJJ == null) {
                    return null;
                }
                return creditInfoLJIJJ.creditPaymentAmount;
            }
        }
        return amount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r3, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L44
            if (r4 == 0) goto L4d
            boolean r1 = r4.LJJLI()
            r0 = 1
            if (r1 != r0) goto L46
            java.lang.String r1 = r5.id
            java.lang.String r0 = "pm_pi_ins_pipobnpl_c_d"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L34
            if (r3 == 0) goto L2d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r0 = r3.displayInstallmentPlan
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo r0 = r0.hybridPaymentInfo
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r0 = r0.actualPaymentAmount
            if (r0 == 0) goto L25
            return r0
        L25:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo r0 = r3.hybridPaymentInfo
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r0 = r0.actualPaymentAmount
            if (r0 != 0) goto L43
        L2d:
            X.031p r0 = r4.LJFF
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r2 = r0.LIZLLL
            return r2
        L34:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HybridPaymentInfo r0 = r5.hybridPaymentInfo
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r0 = r0.actualPaymentAmount
            if (r0 != 0) goto L43
        L3c:
            X.031p r0 = r4.LJFF
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r2 = r0.LIZLLL
            return r2
        L43:
            return r0
        L44:
            if (r4 == 0) goto L4d
        L46:
            X.031p r0 = r4.LJFF
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount r2 = r0.LIZLLL
            return r2
        L4d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03S8.LJIIIIZZ(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod):com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount");
    }

    public static boolean LJJIFFI(String str, boolean z, boolean z2) {
        if (str == null) {
            return false;
        }
        if (!u.LJJIIJZLJL(str, "pm_pi_ew_paypal_c_", false) && ((!z2 || !Intrinsics.LJFF(str, "pm_pi_ins_paypalpaylater_c_r")) && (!z || !Intrinsics.LJFF(str, "pm_pi_ew_paypal_all")))) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIJZLJL(String str, PaymentInfo paymentInfo, InstallmentPlan installmentPlan) {
        PaymentMethod paymentMethod;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        String str2;
        String str3;
        EcomPipoRandomPromotionConfigModel ecomPipoRandomPromotionConfigModel = C03SB.LIZ;
        if (str != null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            EcomPipoRandomPromotionConfigModel ecomPipoRandomPromotionConfigModel2 = C03SB.LIZ;
            EcomPipoRandomPromotionConfigModel ecomPipoRandomPromotionConfigModel3 = (EcomPipoRandomPromotionConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_pipo_random_promotion_config", EcomPipoRandomPromotionConfigModel.class, ecomPipoRandomPromotionConfigModel2);
            if (ecomPipoRandomPromotionConfigModel3 == null) {
                ecomPipoRandomPromotionConfigModel3 = ecomPipoRandomPromotionConfigModel2;
            }
            if (ecomPipoRandomPromotionConfigModel3.enable) {
                EcomPipoRandomPromotionConfigModel ecomPipoRandomPromotionConfigModel4 = (EcomPipoRandomPromotionConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("ecom_pipo_random_promotion_config", EcomPipoRandomPromotionConfigModel.class, ecomPipoRandomPromotionConfigModel2);
                if (ecomPipoRandomPromotionConfigModel4 != null) {
                    ecomPipoRandomPromotionConfigModel2 = ecomPipoRandomPromotionConfigModel4;
                }
                if (!ecomPipoRandomPromotionConfigModel2.enableList.contains(str) || !Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d")) {
                    return false;
                }
                if (installmentPlan == null) {
                    InstallmentPlan installmentPlan2 = null;
                    if (paymentInfo == null || (paymentMethod = paymentInfo.paymentMethod) == null || (installmentInfo = paymentMethod.installmentInfo) == null || (list = installmentInfo.installmentPlans) == null) {
                        return false;
                    }
                    Iterator<InstallmentPlan> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InstallmentPlan next = it2.next();
                        InstallmentPlan installmentPlan3 = next;
                        String str4 = installmentPlan3.id;
                        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
                        if (paymentMethodInfo != null) {
                            str2 = paymentMethodInfo.installmentPlanId;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str4, str2)) {
                            String str5 = installmentPlan3.tenure;
                            PaymentMethodInfo paymentMethodInfo2 = paymentInfo.paymentMethodInfo;
                            if (paymentMethodInfo2 != null) {
                                str3 = paymentMethodInfo2.tenure;
                            } else {
                                str3 = null;
                            }
                            if (Intrinsics.LJFF(str5, str3)) {
                                installmentPlan2 = next;
                                break;
                            }
                        }
                    }
                    installmentPlan = installmentPlan2;
                    if (installmentPlan == null) {
                        return false;
                    }
                }
                PaymentPromotion paymentPromotion = installmentPlan.promotionInfo;
                if (paymentPromotion == null) {
                    return false;
                }
                return Intrinsics.LJFF(paymentPromotion.getHideMarketingAmount(), Boolean.TRUE);
            }
        }
        return false;
    }

    public static boolean LJJIIZ(PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData, C03PV c03pv) {
        if (!LJJIIJ(paymentInfo, paymentMethodsData)) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig = C03SC.LIZ;
        PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig2 = (PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_sns_bound_ccdc_cvv_update_payment_method", PipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.class, pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig);
        if (pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig2 != null) {
            pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig = pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig2;
        }
        Boolean bool = pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enable;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.LJFF(bool, bool2)) {
            return false;
        }
        int i = C837603Pa.LIZ[c03pv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (Intrinsics.LJFF(pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enablePipoSdkPay, bool2)) {
                            return false;
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else if (Intrinsics.LJFF(pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableRetryCashierOrderPay, bool2)) {
                    return false;
                }
            } else if (Intrinsics.LJFF(pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableOspOrderPay, bool2)) {
                return false;
            }
        } else if (Intrinsics.LJFF(pipoTtsSnsBoundCcdcCvvUpdatePaymentMethodConfig.enableOrderCreate, bool2)) {
            return false;
        }
        return true;
    }

    public static void LJJIIZI(PaymentMethod paymentMethod, List list, PaymentInfo paymentInfo) {
        Object next;
        PaymentMethod next2;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C899503fN.LIZIZ((PaymentMethod) next, paymentMethod)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PaymentMethod paymentMethod4 = (PaymentMethod) next;
            if (paymentMethod4 != null) {
                paymentMethod.hybridPaymentInfo = paymentMethod4.hybridPaymentInfo;
                PaymentMethod paymentMethod5 = paymentInfo.paymentMethod;
                if (paymentMethod5 != null && C899503fN.LIZIZ(paymentMethod5, paymentMethod) && (paymentMethod3 = paymentInfo.paymentMethod) != null) {
                    paymentMethod3.hybridPaymentInfo = paymentMethod.hybridPaymentInfo;
                }
                List<PaymentMethod> list2 = paymentMethod.subPaymentMethods;
                if (list2 != null) {
                    for (PaymentMethod paymentMethod6 : list2) {
                        List<PaymentMethod> list3 = paymentMethod4.subPaymentMethods;
                        if (list3 != null) {
                            Iterator<PaymentMethod> it3 = list3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    if (C899503fN.LIZIZ(next2, paymentMethod6)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            PaymentMethod paymentMethod7 = next2;
                            if (paymentMethod7 != null) {
                                paymentMethod6.hybridPaymentInfo = paymentMethod7.hybridPaymentInfo;
                                PaymentMethod paymentMethod8 = paymentInfo.paymentMethod;
                                if (paymentMethod8 != null && C899503fN.LIZIZ(paymentMethod8, paymentMethod6) && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
                                    paymentMethod2.hybridPaymentInfo = paymentMethod6.hybridPaymentInfo;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static Amount LJFF(PaymentMethod paymentMethod, PaymentMethod paymentMethod2, PaymentMethodsData paymentMethodsData, InstallmentPlan installmentPlan, InstallmentPlan installmentPlan2) {
        CreditInfo creditInfoLJIJJ;
        Amount amount;
        InstallmentPlan installmentPlan3;
        HybridPaymentInfo hybridPaymentInfo;
        HybridPaymentInfo hybridPaymentInfo2;
        if (paymentMethodsData != null) {
            creditInfoLJIJJ = paymentMethodsData.LJIJJ(paymentMethod);
        } else {
            creditInfoLJIJJ = null;
        }
        if (paymentMethod2 != null && paymentMethod != null && paymentMethod.LJJJI()) {
            if (Intrinsics.LJFF(paymentMethod2.id, "pm_pi_ins_pipobnpl_c_d")) {
                if (installmentPlan == null || (((installmentPlan3 = installmentPlan.displayInstallmentPlan) == null || (hybridPaymentInfo2 = installmentPlan3.hybridPaymentInfo) == null || (amount = hybridPaymentInfo2.actualPaymentAmount) == null) && ((hybridPaymentInfo = installmentPlan.hybridPaymentInfo) == null || (amount = hybridPaymentInfo.actualPaymentAmount) == null))) {
                    if (creditInfoLJIJJ == null) {
                        return null;
                    }
                    return creditInfoLJIJJ.remainedAmount;
                }
            } else {
                List<? extends Object> list = PaymentViewModel.LLLI;
                PaymentMethod paymentMethodLIZLLL = C03YI.LIZLLL(paymentMethod2, installmentPlan2, "PaymentMethodHelper_getActualAmountForAnchorCombinePayment");
                if (paymentMethodLIZLLL != null) {
                    paymentMethod2 = paymentMethodLIZLLL;
                }
                HybridPaymentInfo hybridPaymentInfo3 = paymentMethod2.hybridPaymentInfo;
                if (hybridPaymentInfo3 == null || (amount = hybridPaymentInfo3.actualPaymentAmount) == null) {
                    if (creditInfoLJIJJ == null) {
                        return null;
                    }
                    return creditInfoLJIJJ.remainedAmount;
                }
            }
        } else if (installmentPlan2 == null || (amount = installmentPlan2.remainedAmount) == null) {
            if (creditInfoLJIJJ == null) {
                return null;
            }
            return creditInfoLJIJJ.remainedAmount;
        }
        return amount;
    }

    public static void LJJIJ(PaymentMethod paymentMethod, InstallmentInfo installmentInfo, List list, CciCashierDisplayType cciCashierDisplayType, boolean z) {
        InstallmentInfo installmentInfo2;
        Object next;
        Object next2;
        C03Q4 c03q4 = C03Q4.LIZ;
        if (C03Q4.LJJ(c03q4, paymentMethod) && !z) {
            return;
        }
        C03SY c03sy = C03SY.LIZ;
        String str = paymentMethod.id;
        c03sy.getClass();
        if (C03SY.LJIJ(str) && cciCashierDisplayType != null) {
            int i = C805203Co.LIZ[cciCashierDisplayType.ordinal()];
            Availability availabilityCopy = null;
            if (i != 1) {
                if (i == 2 && paymentMethod.LIZIZ && paymentMethod.LJIILJJIL != null && C03Q4.LJJ(c03q4, paymentMethod)) {
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (Intrinsics.LJFF(((InstallmentInfo) next2).bankCode, paymentMethod.LJIILJJIL)) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        InstallmentInfo installmentInfo3 = (InstallmentInfo) next2;
                        if (installmentInfo3 != null) {
                            paymentMethod.installmentInfo = installmentInfo3;
                            paymentMethod.installmentInfoList = list;
                            return;
                        }
                    }
                    paymentMethod.installmentInfo = null;
                    paymentMethod.installmentInfoList = null;
                    Availability availability = paymentMethod.availability;
                    if (availability != null) {
                        availabilityCopy = availability.copy(Boolean.FALSE, availability.unavailableCode, availability.unavailableReason, availability.unavailablePopupTitle, availability.statusCode);
                    }
                    paymentMethod.availability = availabilityCopy;
                    return;
                }
            } else if (paymentMethod.LIZIZ) {
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(((InstallmentInfo) next).bankCode, paymentMethod.LJIIIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    installmentInfo2 = (InstallmentInfo) next;
                } else {
                    installmentInfo2 = null;
                }
                C03SY c03sy2 = C03SY.LIZ;
                String str2 = paymentMethod.LIZLLL;
                c03sy2.getClass();
                C443120HZe c443120HZeLJIILLIIL = C03SY.LJIILLIIL(installmentInfo2, paymentMethod, str2);
                InstallmentInfo installmentInfo4 = (InstallmentInfo) c443120HZeLJIILLIIL.getSecond();
                List<PaymentPromotion> list2 = (List) c443120HZeLJIILLIIL.getThird();
                if (installmentInfo4 != null) {
                    paymentMethod.installmentInfo = installmentInfo4;
                    paymentMethod.installmentInfoList = list;
                } else {
                    paymentMethod.installmentInfo = null;
                    paymentMethod.installmentInfoList = null;
                    Availability availability2 = paymentMethod.availability;
                    if (availability2 != null) {
                        availabilityCopy = availability2.copy(Boolean.FALSE, availability2.unavailableCode, availability2.unavailableReason, availability2.unavailablePopupTitle, availability2.statusCode);
                    }
                    paymentMethod.availability = availabilityCopy;
                }
                paymentMethod.promotionInfo = list2;
                return;
            }
        }
        paymentMethod.installmentInfo = installmentInfo;
        paymentMethod.installmentInfoList = list;
    }
}

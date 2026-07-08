package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ActivateHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03Z8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03Z8 {
    public static InstallmentPlan LIZ(PaymentInfo paymentInfo) {
        PaymentMethodInfo paymentMethodInfo;
        String str;
        String str2;
        PaymentMethod paymentMethod;
        InstallmentInfo installmentInfo;
        List<InstallmentPlan> list;
        List<InstallmentInfo> list2;
        InstallmentPlan installmentPlan = null;
        if (paymentInfo == null || (paymentMethodInfo = paymentInfo.paymentMethodInfo) == null || (str = paymentMethodInfo.tenure) == null || (str2 = paymentMethodInfo.installmentPlanId) == null || (paymentMethod = paymentInfo.paymentMethod) == null || (((installmentInfo = paymentMethod.installmentInfo) == null && ((list2 = paymentMethod.installmentInfoList) == null || (installmentInfo = (InstallmentInfo) C13LP.LJJJLL(list2)) == null)) || (list = installmentInfo.installmentPlans) == null)) {
            return null;
        }
        Iterator<InstallmentPlan> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InstallmentPlan next = it2.next();
            InstallmentPlan installmentPlan2 = next;
            if (Intrinsics.LJFF(installmentPlan2.id, str2) && Intrinsics.LJFF(installmentPlan2.tenure, str) && Intrinsics.LJFF(installmentPlan2.installmentOptionId, paymentInfo.paymentMethodInfo.installmentOptionId)) {
                installmentPlan = next;
                break;
            }
        }
        return installmentPlan;
    }

    public static String LIZIZ(InterfaceC869803aa interfaceC869803aa, PaymentInfo paymentInfo, InstallmentPlan installmentPlan) {
        String str;
        String str2;
        if (paymentInfo == null) {
            return null;
        }
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d") || ((installmentPlan == null && (installmentPlan = interfaceC869803aa.xe(paymentInfo)) == null) || (str2 = installmentPlan.extraDescription) == null || str2.length() <= 0)) {
            return null;
        }
        return str2;
    }

    public static String LIZJ(InterfaceC869803aa interfaceC869803aa, PaymentInfo paymentInfo, InstallmentPlan installmentPlan) {
        if (installmentPlan == null) {
            installmentPlan = interfaceC869803aa.xe(paymentInfo);
        }
        ActivateHelper activateHelper = ActivateHelper.LIZ;
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        activateHelper.getClass();
        String strLJIILIIL = ActivateHelper.LJIILIIL(installmentPlan, paymentMethod);
        if (strLJIILIIL != null && strLJIILIIL.length() > 0) {
            return strLJIILIIL;
        }
        return null;
    }

    public static String LIZLLL(InterfaceC869803aa interfaceC869803aa, PaymentInfo paymentInfo, InstallmentPlan installmentPlan) {
        String priceStr;
        String str = null;
        if (paymentInfo == null) {
            return null;
        }
        if (installmentPlan == null && (installmentPlan = interfaceC869803aa.xe(paymentInfo)) == null) {
            return null;
        }
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        }
        if (Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d")) {
            return installmentPlan.planDescription;
        }
        String str2 = installmentPlan.tenure;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String strLJJIFFI = u.LJJIFFI("{tenure} x {amount}", "{tenure}", str2, false);
        Amount amount = installmentPlan.monthlyRepayment;
        if (amount != null && (priceStr = amount.getPriceStr()) != null) {
            str3 = priceStr;
        }
        return u.LJJIFFI(strLJJIFFI, "{amount}", str3, false);
    }

    public static String LJ(InterfaceC869803aa interfaceC869803aa, PaymentInfo paymentInfo, InstallmentPlan installmentPlan) {
        String str;
        String str2;
        if (paymentInfo == null) {
            return null;
        }
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d") || ((installmentPlan == null && (installmentPlan = interfaceC869803aa.xe(paymentInfo)) == null) || (str2 = installmentPlan.aprDescription) == null || str2.length() <= 0)) {
            return null;
        }
        return str2;
    }

    public static String LJFF(InterfaceC869803aa interfaceC869803aa, PaymentInfo paymentInfo, InstallmentPlan installmentPlan) {
        String str;
        String str2;
        if (paymentInfo == null) {
            return null;
        }
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d") || ((installmentPlan == null && (installmentPlan = interfaceC869803aa.xe(paymentInfo)) == null) || (str2 = installmentPlan.totalFeeText) == null || str2.length() <= 0)) {
            return null;
        }
        return str2;
    }
}

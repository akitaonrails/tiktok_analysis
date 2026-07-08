package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YJ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(PaymentMethod paymentMethod) {
        if (paymentMethod != null && paymentMethod.LJJJI() && LIZLLL(paymentMethod) && C03XU.LIZIZ().enableFindSummary) {
            return true;
        }
        return false;
    }

    public static Integer LIZIZ(PaymentInfo paymentInfo) {
        String str;
        if (!C03XU.LIZIZ().enableNewContainer && paymentInfo != null && paymentInfo.LIZIZ()) {
            PaymentMethod paymentMethod = paymentInfo.LIZIZ;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d")) {
                return Integer.valueOf((int) (C958103op.LIZJ() * 0.9f));
            }
        }
        return null;
    }

    public static boolean LIZJ(PaymentMethod paymentMethod) {
        Integer num;
        if (paymentMethod != null && (num = paymentMethod.interactionStyle) != null) {
            int iIntValue = num.intValue();
            if (Intrinsics.LJFF(paymentMethod.id, "pm_pi_ins_pipobnpl_c_d") && iIntValue >= C03YL.HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION_TWOCOLUMNDISPLAYALLINSTALLMENTPLANS.getType()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZLLL(PaymentMethod paymentMethod) {
        Integer num;
        if (paymentMethod != null && (num = paymentMethod.interactionStyle) != null && num.intValue() >= C03YL.HAVE_REMAINING_AMOUNT_HAVE_INSTALLMENT_PREPOSITION.getType()) {
            return true;
        }
        return false;
    }
}

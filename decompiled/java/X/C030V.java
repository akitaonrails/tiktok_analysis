package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.030V, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C030V {
    public static boolean LIZ(PaymentInfo paymentInfo) {
        String str;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        C03SY c03sy = C03SY.LIZ;
        String str2 = null;
        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
            str = paymentMethod2.id;
        } else {
            str = null;
        }
        c03sy.getClass();
        if (!C03SY.LJIJ(str)) {
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                str2 = paymentMethod.id;
            }
            if (!Intrinsics.LJFF(str2, "pm_pi_ins_pipobnpl_c_d")) {
                return false;
            }
            return true;
        }
        return true;
    }
}

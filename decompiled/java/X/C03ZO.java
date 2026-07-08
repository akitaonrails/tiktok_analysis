package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.03ZO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZO {
    public static String LIZ(PaymentMethod paymentMethod) {
        if (paymentMethod == null || paymentMethod.id == null) {
            return null;
        }
        List<PaymentMethod> list = paymentMethod.subPaymentMethods;
        if (list != null && !list.isEmpty()) {
            return null;
        }
        return paymentMethod.LJIIZILJ();
    }

    public static boolean LIZIZ(PaymentMethod paymentMethod) {
        if (paymentMethod == null || !(!((ArrayList) PaymentMethod.LJI(paymentMethod, false, 3)).isEmpty())) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("standalone_ccdc_add_card", false)) {
                return false;
            }
        }
        return true;
    }
}

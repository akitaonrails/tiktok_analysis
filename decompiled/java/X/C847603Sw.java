package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;

/* JADX INFO: renamed from: X.03Sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C847603Sw {
    public static final boolean LIZ(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            List<String> list = C864803Zm.LIZ;
            if (C13LP.LJJJJ(paymentMethod.id, C864803Zm.LIZJ)) {
                return true;
            }
            return false;
        }
        return false;
    }
}

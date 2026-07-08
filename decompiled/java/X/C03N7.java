package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import java.util.List;

/* JADX INFO: renamed from: X.03N7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03N7 {
    public static final PollOrderStatusRequest LIZ(C7873035r c7873035r, String str) {
        String str2;
        PaymentMethod paymentMethod;
        String str3 = c7873035r.LIZIZ;
        List<String> list = c7873035r.LIZ;
        String str4 = c7873035r.LIZLLL;
        String str5 = c7873035r.LJIIIZ;
        PaymentInfo paymentInfo = c7873035r.LJII;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str2 = paymentMethod.id;
        } else {
            str2 = null;
        }
        return new PollOrderStatusRequest(str3, list, 0, str4, str5, str2, Integer.valueOf(C03SW.MINI_FLOW.getValue()), 2, str);
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import java.util.List;

/* JADX INFO: renamed from: X.03Qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C842503Qx {
    public final Integer LIZ;
    public final PaymentMethodsData LIZIZ;
    public final PaymentInfo LIZJ;
    public final List<PaymentPrice> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C842503Qx() {
        this((Integer) null, (PaymentMethodsData) (0 == true ? 1 : 0), (PaymentInfo) (0 == true ? 1 : 0), 15);
    }

    public /* synthetic */ C842503Qx(Integer num, PaymentMethodsData paymentMethodsData, PaymentInfo paymentInfo, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : paymentMethodsData, (i & 4) != 0 ? null : paymentInfo, (List<PaymentPrice>) null);
    }

    public C842503Qx(Integer num, PaymentMethodsData paymentMethodsData, PaymentInfo paymentInfo, List<PaymentPrice> list) {
        this.LIZ = num;
        this.LIZIZ = paymentMethodsData;
        this.LIZJ = paymentInfo;
        this.LIZLLL = list;
    }
}

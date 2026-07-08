package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;

/* JADX INFO: renamed from: X.03Xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C860903Xz {
    public static final C860903Xz LJ = new C860903Xz(C03Y2.USER_CANCEL, 14);
    public final C03Y2 LIZ;
    public final PaymentMethodInfo LIZIZ;
    public final PaymentMethod LIZJ;
    public final PaymentInfo LIZLLL;

    public C860903Xz() {
        this(null, 15);
    }

    public /* synthetic */ C860903Xz(C03Y2 c03y2, int i) {
        this((i & 1) != 0 ? C03Y2.SUCCESS : c03y2, null, null, null);
    }

    public C860903Xz(C03Y2 c03y2, PaymentMethodInfo paymentMethodInfo, PaymentMethod paymentMethod, PaymentInfo paymentInfo) {
        this.LIZ = c03y2;
        this.LIZIZ = paymentMethodInfo;
        this.LIZJ = paymentMethod;
        this.LIZLLL = paymentInfo;
    }
}

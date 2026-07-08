package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03YM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YM {
    public final PaymentInfo LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03YM)) {
            return false;
        }
        C03YM c03ym = (C03YM) obj;
        return Intrinsics.LJFF(this.LIZ, c03ym.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03ym.LIZIZ);
    }

    public /* synthetic */ C03YM(PaymentInfo paymentInfo) {
        this(paymentInfo, null);
    }

    public C03YM(PaymentInfo paymentInfo, Object obj) {
        this.LIZ = paymentInfo;
        this.LIZIZ = obj;
    }
}

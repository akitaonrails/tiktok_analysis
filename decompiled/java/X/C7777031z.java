package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7777031z implements InterfaceC729102sz {
    public final PaymentInfo LIZ;

    public C7777031z() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7777031z) && Intrinsics.LJFF(this.LIZ, ((C7777031z) obj).LIZ);
    }

    public final int hashCode() {
        PaymentInfo paymentInfo = this.LIZ;
        if (paymentInfo == null) {
            return 0;
        }
        return paymentInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentCompState(userPaymentInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7777031z(PaymentInfo paymentInfo) {
        this.LIZ = paymentInfo;
    }
}

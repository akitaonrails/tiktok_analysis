package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C943703mV extends AbstractC944703mf {
    public final PaymentMethod LIZ;
    public final PaymentMethod LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C943703mV)) {
            return false;
        }
        C943703mV c943703mV = (C943703mV) obj;
        return Intrinsics.LJFF(this.LIZ, c943703mV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c943703mV.LIZIZ);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        int iHashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        PaymentMethod paymentMethod2 = this.LIZIZ;
        return iHashCode + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentChange(newPayment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oldPayment=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C943703mV(PaymentMethod paymentMethod, PaymentMethod paymentMethod2) {
        this.LIZ = paymentMethod;
        this.LIZIZ = paymentMethod2;
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPromotion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OY {
    public final List<PaymentPromotion> LIZ;
    public final String LIZIZ;
    public final PaymentMethod LIZJ;

    public C03OY() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OY)) {
            return false;
        }
        C03OY c03oy = (C03OY) obj;
        return Intrinsics.LJFF(this.LIZ, c03oy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03oy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03oy.LIZJ);
    }

    public final int hashCode() {
        List<PaymentPromotion> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethod paymentMethod = this.LIZJ;
        return iHashCode2 + (paymentMethod != null ? paymentMethod.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraPaymentData(extraPromotionInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", realPaymentMethodId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mergedPaymentMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03OY(PaymentMethod paymentMethod, String str, List list) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = paymentMethod;
    }
}

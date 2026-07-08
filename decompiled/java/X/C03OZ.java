package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03OZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OZ {
    public PaymentMethod LIZ;
    public Map<String, PaymentMethod> LIZIZ;

    public C03OZ() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03OZ)) {
            return false;
        }
        C03OZ c03oz = (C03OZ) obj;
        return Intrinsics.LJFF(this.LIZ, c03oz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03oz.LIZIZ);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        int iHashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        Map<String, PaymentMethod> map = this.LIZIZ;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IndependentPaymentData(independentPaymentMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", independentPaymentMethodMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03OZ(Map map, int i) {
        map = (i & 2) != 0 ? null : map;
        this.LIZ = null;
        this.LIZIZ = map;
    }
}

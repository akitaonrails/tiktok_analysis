package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03WJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WJ {
    public final String LIZ;
    public final PaymentMethod LIZIZ;
    public final Object LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03WJ)) {
            return false;
        }
        C03WJ c03wj = (C03WJ) obj;
        return Intrinsics.LJFF(this.LIZ, c03wj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03wj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03wj.LIZJ) && this.LIZLLL == c03wj.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PaymentMethod paymentMethod = this.LIZIZ;
        int iHashCode2 = (iHashCode + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        Object obj = this.LIZJ;
        return ((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentSelectOptionInfo(paymentMethodId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paymentMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", installmentCnt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isDefault=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03WJ(String str, PaymentMethod paymentMethod, Object obj, boolean z) {
        this.LIZ = str;
        this.LIZIZ = paymentMethod;
        this.LIZJ = obj;
        this.LIZLLL = z;
    }
}

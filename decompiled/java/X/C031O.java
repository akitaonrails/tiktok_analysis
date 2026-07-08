package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031O {
    public final PaymentMethod LIZ;
    public final boolean LIZIZ;
    public final CopyOnWriteArrayList<PaymentMethod> LIZJ;

    public C031O() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C031O)) {
            return false;
        }
        C031O c031o = (C031O) obj;
        return Intrinsics.LJFF(this.LIZ, c031o.LIZ) && this.LIZIZ == c031o.LIZIZ && Intrinsics.LJFF(this.LIZJ, c031o.LIZJ);
    }

    public final int hashCode() {
        PaymentMethod paymentMethod = this.LIZ;
        int iHashCode = (((paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList = this.LIZJ;
        return iHashCode + (copyOnWriteArrayList != null ? copyOnWriteArrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspPaymentGenerateListParams(recommendedPayment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasStoredMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", recommendedPayments=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C031O(int i) {
        this(null, false, null);
    }

    public C031O(PaymentMethod paymentMethod, boolean z, CopyOnWriteArrayList<PaymentMethod> copyOnWriteArrayList) {
        this.LIZ = paymentMethod;
        this.LIZIZ = z;
        this.LIZJ = copyOnWriteArrayList;
    }
}

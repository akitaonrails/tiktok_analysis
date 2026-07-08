package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.031M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C031M implements C033V {
    public final PaymentMethodsData LIZ;
    public final Boolean LIZIZ;
    public final BillInfoData LIZJ;
    public final String LIZLLL;

    public C031M() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C031M)) {
            return false;
        }
        C031M c031m = (C031M) obj;
        return Intrinsics.LJFF(this.LIZ, c031m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c031m.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c031m.LIZJ);
    }

    public final int hashCode() {
        PaymentMethodsData paymentMethodsData = this.LIZ;
        int iHashCode = (paymentMethodsData == null ? 0 : paymentMethodsData.hashCode()) * 31;
        Boolean bool = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BillInfoData billInfoData = this.LIZJ;
        return iHashCode2 + (billInfoData != null ? billInfoData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentMethodsBO(paymentMethods=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFinishedData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", billInfoData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C033V
    public final String getName() {
        return this.LIZLLL;
    }

    public C031M(PaymentMethodsData paymentMethodsData, Boolean bool, BillInfoData billInfoData) {
        this.LIZ = paymentMethodsData;
        this.LIZIZ = bool;
        this.LIZJ = billInfoData;
        this.LIZLLL = "PaymentMethodsBO";
    }
}

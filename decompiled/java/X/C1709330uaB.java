package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709330uaB {
    public final C1709570uaZ LIZ;
    public final PaymentOption LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1709330uaB)) {
            return false;
        }
        C1709330uaB c1709330uaB = (C1709330uaB) obj;
        return Intrinsics.LJFF(this.LIZ, c1709330uaB.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1709330uaB.LIZIZ) && this.LIZJ == c1709330uaB.LIZJ && this.LIZLLL == c1709330uaB.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PIPOPaymentOptionVO(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paymentOption=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1709330uaB(C1709570uaZ c1709570uaZ, PaymentOption paymentOption, boolean z, int i) {
        this.LIZ = c1709570uaZ;
        this.LIZIZ = paymentOption;
        this.LIZJ = z;
        this.LIZLLL = i;
    }
}

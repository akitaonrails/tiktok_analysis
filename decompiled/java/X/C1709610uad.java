package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uad, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1709610uad {
    public final Boolean LIZ;
    public final PaymentOption LIZIZ;
    public final PaymentOption LIZJ;

    public C1709610uad() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1709610uad)) {
            return false;
        }
        C1709610uad c1709610uad = (C1709610uad) obj;
        return Intrinsics.LJFF(this.LIZ, c1709610uad.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1709610uad.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1709610uad.LIZJ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        PaymentOption paymentOption = this.LIZIZ;
        int iHashCode2 = (iHashCode + (paymentOption == null ? 0 : paymentOption.hashCode())) * 31;
        PaymentOption paymentOption2 = this.LIZJ;
        return iHashCode2 + (paymentOption2 != null ? paymentOption2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("POCheckboxInfo(defaultSelected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedPO=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", unSelectedPO=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1709610uad(Boolean bool, int i) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, null, null);
    }

    public C1709610uad(Boolean bool, PaymentOption paymentOption, PaymentOption paymentOption2) {
        this.LIZ = bool;
        this.LIZIZ = paymentOption;
        this.LIZJ = paymentOption2;
    }
}

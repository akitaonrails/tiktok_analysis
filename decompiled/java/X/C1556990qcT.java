package X;

import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556990qcT extends AbstractC1556970qcR {
    public final PurchaseOptionWithPrice LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556990qcT) && Intrinsics.LJFF(this.LIZ, ((C1556990qcT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseOptionSelect(purchaseOption=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556990qcT(PurchaseOptionWithPrice purchaseOptionWithPrice) {
        this.LIZ = purchaseOptionWithPrice;
    }
}

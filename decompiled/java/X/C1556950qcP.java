package X;

import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556950qcP extends AbstractC1556970qcR {
    public final List<PurchaseOptionWithPrice> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556950qcP) && Intrinsics.LJFF(this.LIZ, ((C1556950qcP) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseOptionsUpdate(purchaseOptions=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556950qcP(List<PurchaseOptionWithPrice> list) {
        this.LIZ = list;
    }
}

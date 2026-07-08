package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C807003Dg {
    public final LogisticExpressionArea LIZ;
    public final boolean LIZIZ;

    public C807003Dg() {
        this((LogisticExpressionArea) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C807003Dg)) {
            return false;
        }
        C807003Dg c807003Dg = (C807003Dg) obj;
        return Intrinsics.LJFF(this.LIZ, c807003Dg.LIZ) && this.LIZIZ == c807003Dg.LIZIZ;
    }

    public final int hashCode() {
        LogisticExpressionArea logisticExpressionArea = this.LIZ;
        return ((logisticExpressionArea == null ? 0 : logisticExpressionArea.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegularShippingInfoVO(logisticExpressionArea=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C807003Dg(LogisticExpressionArea logisticExpressionArea, int i) {
        this((i & 1) != 0 ? null : logisticExpressionArea, false);
    }

    public C807003Dg(LogisticExpressionArea logisticExpressionArea, boolean z) {
        this.LIZ = logisticExpressionArea;
        this.LIZIZ = z;
    }
}

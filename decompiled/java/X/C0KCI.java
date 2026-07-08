package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KCI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCI {
    public final List<PGCSubscriptionProductDetailWithTemplateInfo> LIZ;
    public final C0KCP LIZIZ;
    public final C0KCK LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KCI)) {
            return false;
        }
        C0KCI c0kci = (C0KCI) obj;
        return Intrinsics.LJFF(this.LIZ, c0kci.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kci.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0kci.LIZJ) && this.LIZLLL == c0kci.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0KCP c0kcp = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c0kcp == null ? 0 : c0kcp.hashCode())) * 31;
        C0KCK c0kck = this.LIZJ;
        return ((iHashCode2 + (c0kck != null ? c0kck.hashCode() : 0)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionProductInfoModel(productListInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraCallbackData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", packageQuantity=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KCI(List<PGCSubscriptionProductDetailWithTemplateInfo> list, C0KCP c0kcp, C0KCK c0kck, int i) {
        this.LIZ = list;
        this.LIZIZ = c0kcp;
        this.LIZJ = c0kck;
        this.LIZLLL = i;
    }
}

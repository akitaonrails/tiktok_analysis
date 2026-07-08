package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KCJ {
    public List<PGCSubscriptionProductDetailWithTemplateInfo> LIZ;
    public C0KCP LIZIZ;
    public C0KCK LIZJ;
    public Map<String, C0KDH> LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public C0KCJ() {
        this(null, null, null, null, false, false, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KCJ)) {
            return false;
        }
        C0KCJ c0kcj = (C0KCJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0kcj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kcj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0kcj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0kcj.LIZLLL) && this.LJ == c0kcj.LJ && this.LJFF == c0kcj.LJFF;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0KCP c0kcp = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c0kcp == null ? 0 : c0kcp.hashCode())) * 31;
        C0KCK c0kck = this.LIZJ;
        return ((((((iHashCode2 + (c0kck != null ? c0kck.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionUpdowngradeProductInfoModel(productListInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraCallbackData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", packagePrivilegeInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isProductListInfoSet=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isPackagePrivilegeInfoSet=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KCJ(List list, C0KCP c0kcp, C0KCK c0kck, Map map, boolean z, boolean z2, int i) {
        list = (i & 1) != 0 ? new ArrayList() : list;
        c0kcp = (i & 2) != 0 ? null : c0kcp;
        c0kck = (i & 4) != 0 ? null : c0kck;
        map = (i & 8) != 0 ? C2097608Jq.LJ() : map;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        this.LIZ = list;
        this.LIZIZ = c0kcp;
        this.LIZJ = c0kck;
        this.LIZLLL = map;
        this.LJ = z;
        this.LJFF = z2;
    }
}

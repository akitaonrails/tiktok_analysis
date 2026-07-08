package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616800sAw {
    public final List<C1616830sAz> LIZ;
    public final C0KQW LIZIZ;
    public final C0KQW LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1616800sAw)) {
            return false;
        }
        C1616800sAw c1616800sAw = (C1616800sAw) obj;
        return Intrinsics.LJFF(this.LIZ, c1616800sAw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1616800sAw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1616800sAw.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C0KQW c0kqw = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c0kqw == null ? 0 : c0kqw.hashCode())) * 31;
        C0KQW c0kqw2 = this.LIZJ;
        return iHashCode2 + (c0kqw2 != null ? c0kqw2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapMarketplacePricesResult(prices=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oneTimeError=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", subscriptionError=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1616800sAw(List<C1616830sAz> list, C0KQW c0kqw, C0KQW c0kqw2) {
        this.LIZ = list;
        this.LIZIZ = c0kqw;
        this.LIZJ = c0kqw2;
    }
}

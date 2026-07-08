package X;

import com.ss.android.ugc.aweme.model.VipSubscriptionEntitlement;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1614790s7h {
    public final EnumC1614730s7b LIZ;
    public final C431520Gw2 LIZIZ;
    public final C1573130r2V LIZJ;
    public final List<VipSubscriptionEntitlement> LIZLLL;
    public final C1614800s7i LJ;
    public final C1614800s7i LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614790s7h)) {
            return false;
        }
        C1614790s7h c1614790s7h = (C1614790s7h) obj;
        return this.LIZ == c1614790s7h.LIZ && Intrinsics.LJFF(this.LIZIZ, c1614790s7h.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1614790s7h.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1614790s7h.LIZLLL) && Intrinsics.LJFF(this.LJ, c1614790s7h.LJ) && Intrinsics.LJFF(this.LJFF, c1614790s7h.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C1573130r2V c1573130r2V = this.LIZJ;
        int iHashCode2 = (((((iHashCode + (c1573130r2V == null ? 0 : c1573130r2V.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        C1614800s7i c1614800s7i = this.LJFF;
        return iHashCode2 + (c1614800s7i != null ? c1614800s7i.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipSubscriptionPageUiState(pageState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", header=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", planSelector=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", benefits=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", primaryCta=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", secondaryCta=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1614790s7h(EnumC1614730s7b enumC1614730s7b, C431520Gw2 c431520Gw2, C1573130r2V c1573130r2V, List<VipSubscriptionEntitlement> list, C1614800s7i c1614800s7i, C1614800s7i c1614800s7i2) {
        this.LIZ = enumC1614730s7b;
        this.LIZIZ = c431520Gw2;
        this.LIZJ = c1573130r2V;
        this.LIZLLL = list;
        this.LJ = c1614800s7i;
        this.LJFF = c1614800s7i2;
    }
}

package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225910i0T extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final Set<String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225910i0T)) {
            return false;
        }
        C1225910i0T c1225910i0T = (C1225910i0T) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1225910i0T.LIZLLL) && this.LJ == c1225910i0T.LJ && this.LJFF == c1225910i0T.LJFF && Intrinsics.LJFF(this.LJI, c1225910i0T.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        Set<String> set = this.LJI;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectLiveVisibleFriendContentTabDataSourceProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", defaultSelectedIdList=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1223510hwb
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.C1223510hwb
    public final C20603715jn LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C1223510hwb
    public final boolean LIZJ() {
        return this.LJFF;
    }

    public C1225910i0T(C20603715jn c20603715jn, Set set) {
        super(c20603715jn, false, false);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = set;
    }
}

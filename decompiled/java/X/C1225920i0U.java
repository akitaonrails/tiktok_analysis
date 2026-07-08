package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225920i0U extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Set<String> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225920i0U)) {
            return false;
        }
        C1225920i0U c1225920i0U = (C1225920i0U) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1225920i0U.LIZLLL) && this.LJ == c1225920i0U.LJ && this.LJFF == c1225920i0U.LJFF && this.LJI == c1225920i0U.LJI && Intrinsics.LJFF(this.LJII, c1225920i0U.LJII);
    }

    public final int hashCode() {
        return (((((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectLiveVisibleGroupsContentTabDataSourceProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", withIndex=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", selectedIds=");
        sbLIZ.append(this.LJII);
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

    public C1225920i0U(C20603715jn c20603715jn, Set set) {
        super(c20603715jn, true, false);
        this.LIZLLL = c20603715jn;
        this.LJ = true;
        this.LJFF = false;
        this.LJI = false;
        this.LJII = set;
    }
}

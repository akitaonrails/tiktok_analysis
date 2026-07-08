package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225510hzp extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225510hzp)) {
            return false;
        }
        C1225510hzp c1225510hzp = (C1225510hzp) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1225510hzp.LIZLLL) && this.LJ == c1225510hzp.LJ && this.LJFF == c1225510hzp.LJFF && this.LJI == c1225510hzp.LJI;
    }

    public final int hashCode() {
        return (((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectAGroupDataSourceProtocolConfig(paginationConfig=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", needReorder=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showLoadingStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", withIndex=");
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

    public C1225510hzp(C20603715jn c20603715jn) {
        super(c20603715jn, true, false);
        this.LIZLLL = c20603715jn;
        this.LJ = true;
        this.LJFF = false;
        this.LJI = true;
    }
}

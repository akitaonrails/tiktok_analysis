package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.101Y, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C101Y implements C07XH {
    public final C722300SUy LIZ;
    public final C191791101l LIZIZ;
    public final C191791101l LIZJ;
    public final C191784101e LIZLLL;
    public final C0SVT LJ;
    public final List<C191784101e> LJFF;
    public final C191796101q LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C101Y)) {
            return false;
        }
        C101Y c101y = (C101Y) obj;
        return Intrinsics.LJFF(this.LIZ, c101y.LIZ) && Intrinsics.LJFF(this.LIZIZ, c101y.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c101y.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c101y.LIZLLL) && Intrinsics.LJFF(this.LJ, c101y.LJ) && Intrinsics.LJFF(this.LJFF, c101y.LJFF) && Intrinsics.LJFF(this.LJI, c101y.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C191784101e c191784101e = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c191784101e == null ? 0 : c191784101e.hashCode())) * 31;
        C0SVT c0svt = this.LJ;
        int iHashCode3 = (((iHashCode2 + (c0svt == null ? 0 : c0svt.hashCode())) * 31) + this.LJFF.hashCode()) * 31;
        C191796101q c191796101q = this.LJI;
        return iHashCode3 + (c191796101q != null ? c191796101q.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskModel(icon=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", accessory=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", background=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", buttons=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", extraTip=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C101Y(C722300SUy c722300SUy, C191791101l c191791101l, C191791101l c191791101l2, C191784101e c191784101e, List list, int i) {
        this(c722300SUy, c191791101l, c191791101l2, (i & 8) != 0 ? null : c191784101e, null, (i & 32) != 0 ? C13BV.INSTANCE : list, null);
    }

    public C101Y(C722300SUy c722300SUy, C191791101l c191791101l, C191791101l c191791101l2, C191784101e c191784101e, C0SVT c0svt, List<C191784101e> list, C191796101q c191796101q) {
        this.LIZ = c722300SUy;
        this.LIZIZ = c191791101l;
        this.LIZJ = c191791101l2;
        this.LIZLLL = c191784101e;
        this.LJ = c0svt;
        this.LJFF = list;
        this.LJI = c191796101q;
    }
}

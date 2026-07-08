package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tlm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678080tlm {
    public final C1691540u7U LIZ;
    public final C1692220u8a LIZIZ;
    public final C1693430uAX LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final long LJI;
    public final C1692150u8T LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1678080tlm)) {
            return false;
        }
        C1678080tlm c1678080tlm = (C1678080tlm) obj;
        return Intrinsics.LJFF(this.LIZ, c1678080tlm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1678080tlm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1678080tlm.LIZJ) && this.LIZLLL == c1678080tlm.LIZLLL && this.LJ == c1678080tlm.LJ && this.LJFF == c1678080tlm.LJFF && C1682380tsi.LIZJ(this.LJI, c1678080tlm.LJI) && Intrinsics.LJFF(this.LJII, c1678080tlm.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutParamsAndResult(textMeasurer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append((Object) this.LIZIZ);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", overflow=");
        sbLIZ.append((Object) C1678110tlp.LIZ(this.LIZLLL));
        sbLIZ.append(", softWrap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxLines=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", constraints=");
        sbLIZ.append((Object) C1682380tsi.LJIIJJI(this.LJI));
        sbLIZ.append(", textLayoutResult=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI)) * 31;
        C1692150u8T c1692150u8T = this.LJII;
        return iHashCode + (c1692150u8T == null ? 0 : c1692150u8T.hashCode());
    }

    public static C1678080tlm LIZ(C1678080tlm c1678080tlm, C1693430uAX c1693430uAX, long j, C1692150u8T c1692150u8T, int i) {
        C1691540u7U c1691540u7U;
        int i2;
        boolean z;
        int i3;
        C1692150u8T c1692150u8T2 = c1692150u8T;
        long j2 = j;
        C1693430uAX c1693430uAX2 = c1693430uAX;
        C1692220u8a c1692220u8a = null;
        if ((i & 1) != 0) {
            c1691540u7U = c1678080tlm.LIZ;
        } else {
            c1691540u7U = null;
        }
        if ((i & 2) != 0) {
            c1692220u8a = c1678080tlm.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1693430uAX2 = c1678080tlm.LIZJ;
        }
        if ((i & 8) != 0) {
            i2 = c1678080tlm.LIZLLL;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            z = c1678080tlm.LJ;
        } else {
            z = false;
        }
        if ((i & 32) != 0) {
            i3 = c1678080tlm.LJFF;
        } else {
            i3 = 0;
        }
        if ((i & 64) != 0) {
            j2 = c1678080tlm.LJI;
        }
        if ((i & 128) != 0) {
            c1692150u8T2 = c1678080tlm.LJII;
        }
        return new C1678080tlm(c1691540u7U, c1692220u8a, c1693430uAX2, i2, z, i3, j2, c1692150u8T2);
    }

    public C1678080tlm(C1691540u7U c1691540u7U, C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, int i, boolean z, int i2, long j, C1692150u8T c1692150u8T) {
        this.LIZ = c1691540u7U;
        this.LIZIZ = c1692220u8a;
        this.LIZJ = c1693430uAX;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = i2;
        this.LJI = j;
        this.LJII = c1692150u8T;
    }
}

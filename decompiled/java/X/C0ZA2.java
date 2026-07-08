package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZA2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZA2 {
    public final boolean LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZA2)) {
            return false;
        }
        C0ZA2 c0za2 = (C0ZA2) obj;
        return this.LIZ == c0za2.LIZ && this.LIZIZ == c0za2.LIZIZ && this.LIZJ == c0za2.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0za2.LIZLLL) && this.LJ == c0za2.LJ && this.LJFF == c0za2.LJFF && this.LJI == c0za2.LJI;
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        return ((((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellDiffInfo(isNoFilterType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", entranceId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", entranceKey=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", group=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", tabCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pageCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZA2(boolean z, int i, int i2, String str, int i3, int i4, int i5, int i6) {
        i = (i6 & 2) != 0 ? -1 : i;
        i2 = (i6 & 4) != 0 ? -1 : i2;
        str = (i6 & 8) != 0 ? null : str;
        i3 = (i6 & 16) != 0 ? -1 : i3;
        i4 = (i6 & 32) != 0 ? 0 : i4;
        i5 = (i6 & 64) != 0 ? 0 : i5;
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = i5;
    }
}

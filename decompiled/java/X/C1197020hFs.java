package X;

/* JADX INFO: renamed from: X.0hFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197020hFs {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    public C1197020hFs() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1197020hFs)) {
            return false;
        }
        C1197020hFs c1197020hFs = (C1197020hFs) obj;
        return this.LIZ == c1197020hFs.LIZ && this.LIZIZ == c1197020hFs.LIZIZ && this.LIZJ == c1197020hFs.LIZJ && this.LIZLLL == c1197020hFs.LIZLLL && this.LJ == c1197020hFs.LJ && this.LJFF == c1197020hFs.LJFF && this.LJI == c1197020hFs.LJI && this.LJII == c1197020hFs.LJII && this.LJIIIIZZ == c1197020hFs.LJIIIIZZ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAnchorTitleLineWidthData(titleWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleWidthWithMargin=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", suffixWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", suffixWidthWithMargin=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dividerWidthWithMargin=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", downArrowWidth=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", downArrowWidthWithMargin=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", titleProductCountWidth=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", titleProductCountWidthWithMargin=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1197020hFs LIZ(C1197020hFs c1197020hFs, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i4;
        int i12 = i3;
        int i13 = i2;
        int i14 = i;
        if ((i5 & 1) != 0) {
            i14 = c1197020hFs.LIZ;
        }
        if ((i5 & 2) != 0) {
            i13 = c1197020hFs.LIZIZ;
        }
        if ((i5 & 4) != 0) {
            i12 = c1197020hFs.LIZJ;
        }
        if ((i5 & 8) != 0) {
            i11 = c1197020hFs.LIZLLL;
        }
        if ((i5 & 16) != 0) {
            i6 = c1197020hFs.LJ;
        } else {
            i6 = 0;
        }
        if ((i5 & 32) != 0) {
            i7 = c1197020hFs.LJFF;
        } else {
            i7 = 0;
        }
        if ((i5 & 64) != 0) {
            i8 = c1197020hFs.LJI;
        } else {
            i8 = 0;
        }
        if ((i5 & 128) != 0) {
            i9 = c1197020hFs.LJII;
        } else {
            i9 = 0;
        }
        if ((i5 & 256) != 0) {
            i10 = c1197020hFs.LJIIIIZZ;
        } else {
            i10 = 0;
        }
        return new C1197020hFs(i14, i13, i12, i11, i6, i7, i8, i9, i10);
    }

    public C1197020hFs(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = i7;
        this.LJII = i8;
        this.LJIIIIZZ = i9;
    }
}

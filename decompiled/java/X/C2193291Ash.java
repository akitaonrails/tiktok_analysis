package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Ash, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193291Ash {
    public final C19720512Dr LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2193291Ash)) {
            return false;
        }
        C2193291Ash c2193291Ash = (C2193291Ash) obj;
        return Intrinsics.LJFF(this.LIZ, c2193291Ash.LIZ) && this.LIZIZ == c2193291Ash.LIZIZ && this.LIZJ == c2193291Ash.LIZJ && this.LIZLLL == c2193291Ash.LIZLLL && this.LJ == c2193291Ash.LJ && this.LJFF == c2193291Ash.LJFF && this.LJI == c2193291Ash.LJI && this.LJII == c2193291Ash.LJII && this.LJIIIIZZ == c2193291Ash.LJIIIIZZ && this.LJIIIZ == c2193291Ash.LJIIIZ && this.LJIIJ == c2193291Ash.LJIIJ && this.LJIIJJI == c2193291Ash.LJIIJJI && this.LJIIL == c2193291Ash.LJIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31) + this.LJIIL;
    }

    public final String toString() {
        return "BannerTextFitMetrics(banner=" + this.LIZ + ", titleTruncated=" + this.LIZIZ + ", subtitleTruncated=" + this.LIZJ + ", subtitleHiddenByLayout=" + this.LIZLLL + ", titleRawLength=" + this.LJ + ", titleVisibleLength=" + this.LJFF + ", subtitleRawLength=" + this.LJI + ", subtitleVisibleLength=" + this.LJII + ", titleLinesRequired=" + this.LJIIIIZZ + ", subtitleLinesRequired=" + this.LJIIIZ + ", titleFontFinal=" + this.LJIIJ + ", subtitleFontFinal=" + this.LJIIJJI + ", containerWidthDp=" + this.LJIIL + ')';
    }

    public C2193291Ash(C19720512Dr c19720512Dr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.LIZ = c19720512Dr;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIIIZ = i9;
        this.LJIIJ = i10;
        this.LJIIJJI = i11;
        this.LJIIL = i12;
    }
}

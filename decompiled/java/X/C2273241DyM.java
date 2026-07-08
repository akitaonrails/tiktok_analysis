package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273241DyM extends C723430SZh {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final long LJIILJJIL;
    public final long LJIILL;
    public final long LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273241DyM)) {
            return false;
        }
        C2273241DyM c2273241DyM = (C2273241DyM) obj;
        return Intrinsics.LJFF(this.LIZJ, c2273241DyM.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2273241DyM.LIZLLL) && Intrinsics.LJFF(this.LJ, c2273241DyM.LJ) && Intrinsics.LJFF(this.LJFF, c2273241DyM.LJFF) && Intrinsics.LJFF(this.LJI, c2273241DyM.LJI) && Intrinsics.LJFF(this.LJII, c2273241DyM.LJII) && this.LJIIIIZZ == c2273241DyM.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c2273241DyM.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c2273241DyM.LJIIJ) && this.LJIIJJI == c2273241DyM.LJIIJJI && this.LJIIL == c2273241DyM.LJIIL && this.LJIILIIL == c2273241DyM.LJIILIIL && this.LJIILJJIL == c2273241DyM.LJIILJJIL && this.LJIILL == c2273241DyM.LJIILL && this.LJIILLIIL == c2273241DyM.LJIILLIIL && this.LJIIZILJ == c2273241DyM.LJIIZILJ && this.LJIJ == c2273241DyM.LJIJ && this.LJIJI == c2273241DyM.LJIJI && this.LJIJJ == c2273241DyM.LJIJJ && this.LJIJJLI == c2273241DyM.LJIJJLI && this.LJIL == c2273241DyM.LJIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        String str = this.LJIIIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LJIIJ;
        return ((((((((((((((((((((((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + this.LJIILIIL) * 31) + C786410Ut5.Y2(this.LJIILJJIL)) * 31) + C786410Ut5.Y2(this.LJIILL)) * 31) + C786410Ut5.Y2(this.LJIILLIIL)) * 31) + this.LJIIZILJ) * 31) + this.LJIJ) * 31) + this.LJIJI) * 31) + this.LJIJJ) * 31) + this.LJIJJLI) * 31) + this.LJIL;
    }

    public final String toString() {
        return "PageNavigationPerformanceParams(fromPageName=" + this.LIZJ + ", toPageName=" + this.LIZLLL + ", fromPageType=" + this.LJ + ", toPageType=" + this.LJFF + ", fromPageActivityName=" + this.LJI + ", toPageActivityName=" + this.LJII + ", isSAFNavigation=" + this.LJIIIIZZ + ", intentAction=" + this.LJIIIZ + ", intentFlags=" + this.LJIIJ + ", hasTransition=" + this.LJIIJJI + ", hasBundle=" + this.LJIIL + ", bundleSize=" + this.LJIILIIL + ", memoryUsageAfter=" + this.LJIILJJIL + ", pageCreateToResumedCost=" + this.LJIILL + ", totalNavigationCost=" + this.LJIILLIIL + ", stackTotalPages=" + this.LJIIZILJ + ", stackActivityCount=" + this.LJIJ + ", stackSafFragmentCount=" + this.LJIJI + ", stackActiveCount=" + this.LJIJJ + ", stackVisibleCount=" + this.LJIJJLI + ", stackBackgroundCount=" + this.LJIL + ')';
    }

    public C2273241DyM(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Integer num, boolean z2, boolean z3, int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str7;
        this.LJIIJ = num;
        this.LJIIJJI = z2;
        this.LJIIL = z3;
        this.LJIILIIL = i;
        this.LJIILJJIL = j;
        this.LJIILL = j2;
        this.LJIILLIIL = j3;
        this.LJIIZILJ = i2;
        this.LJIJ = i3;
        this.LJIJI = i4;
        this.LJIJJ = i5;
        this.LJIJJLI = i6;
        this.LJIL = i7;
    }
}

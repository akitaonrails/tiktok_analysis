package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ukn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1715910ukn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1715910ukn() {
        String str = null;
        this(str, str, str, str, str, str, str, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715910ukn)) {
            return false;
        }
        C1715910ukn c1715910ukn = (C1715910ukn) obj;
        return Intrinsics.LJFF(this.LIZ, c1715910ukn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1715910ukn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1715910ukn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1715910ukn.LIZLLL) && Intrinsics.LJFF(this.LJ, c1715910ukn.LJ) && Intrinsics.LJFF(this.LJFF, c1715910ukn.LJFF) && Intrinsics.LJFF(this.LJI, c1715910ukn.LJI) && Intrinsics.LJFF(this.LJII, c1715910ukn.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1715910ukn.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1715910ukn.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1715910ukn.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1715910ukn.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1715910ukn.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31;
        String str = this.LJII;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIJJI;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIL;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "BiometricParams(enterFrom=" + this.LIZ + ", pipoProductCode=" + this.LIZIZ + ", walletUserId=" + this.LIZJ + ", host=" + this.LIZLLL + ", sessionId=" + this.LJ + ", flowType=" + this.LJFF + ", did=" + this.LJI + ", pageTitle=" + this.LJII + ", pageImage=" + this.LJIIIIZZ + ", pageImageDark=" + this.LJIIIZ + ", pageInstructions=" + this.LJIIJ + ", pagePrimaryBtnText=" + this.LJIIJJI + ", skipBtn=" + this.LJIIL + ')';
    }

    public /* synthetic */ C1715910ukn(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", null, null, null, null, null, null);
    }

    public C1715910ukn(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = str8;
        this.LJIIIIZZ = str9;
        this.LJIIIZ = str10;
        this.LJIIJ = str11;
        this.LJIIJJI = str12;
        this.LJIIL = str13;
    }
}

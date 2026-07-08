package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774720wHe {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Long LJII;
    public final Long LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1774720wHe)) {
            return false;
        }
        C1774720wHe c1774720wHe = (C1774720wHe) obj;
        return Intrinsics.LJFF(this.LIZ, c1774720wHe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1774720wHe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1774720wHe.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1774720wHe.LIZLLL) && Intrinsics.LJFF(this.LJ, c1774720wHe.LJ) && Intrinsics.LJFF(this.LJFF, c1774720wHe.LJFF) && Intrinsics.LJFF(this.LJI, c1774720wHe.LJI) && Intrinsics.LJFF(this.LJII, c1774720wHe.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1774720wHe.LJIIIIZZ) && this.LJIIIZ == c1774720wHe.LJIIIZ && this.LJIIJ == c1774720wHe.LJIIJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Long l = this.LIZLLL;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJI;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.LJII;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LJIIIIZZ;
        return ((((iHashCode6 + (l3 != null ? l3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ);
    }

    public final String toString() {
        return "MynaTemplateInfo(url=" + this.LIZ + ", name=" + this.LIZIZ + ", version=" + this.LIZJ + ", geckoVersion=" + this.LIZLLL + ", templateFrom=" + this.LJ + ", loadSeq=" + this.LJFF + ", templateJsonStr=" + this.LJI + ", parseElementStart=" + this.LJII + ", parseElementEnd=" + this.LJIIIIZZ + ", hitPreDecode=" + this.LJIIIZ + ", hitPreload=" + this.LJIIJ + ')';
    }

    public final String LIZ() {
        String str = this.LJ;
        return str == null ? "" : str;
    }

    public final String LIZIZ() {
        return String.valueOf(this.LIZLLL);
    }

    public /* synthetic */ C1774720wHe(String str, String str2, String str3, Long l, String str4, String str5, String str6, Long l2, Long l3, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : l2, (i & 256) == 0 ? l3 : null, false, false);
    }

    public C1774720wHe(String str, String str2, String str3, Long l, String str4, String str5, String str6, Long l2, Long l3, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = l;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = l2;
        this.LJIIIIZZ = l3;
        this.LJIIIZ = z;
        this.LJIIJ = z2;
    }
}

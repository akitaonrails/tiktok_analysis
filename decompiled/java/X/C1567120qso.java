package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567120qso {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final C1567130qsp LJIIIZ;
    public final boolean LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1567120qso)) {
            return false;
        }
        C1567120qso c1567120qso = (C1567120qso) obj;
        return Intrinsics.LJFF(this.LIZ, c1567120qso.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1567120qso.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1567120qso.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1567120qso.LIZLLL) && Intrinsics.LJFF(this.LJ, c1567120qso.LJ) && this.LJFF == c1567120qso.LJFF && this.LJI == c1567120qso.LJI && this.LJII == c1567120qso.LJII && this.LJIIIIZZ == c1567120qso.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1567120qso.LJIIIZ) && this.LJIIJ == c1567120qso.LJIIJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int iHashCode5 = (((((((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31;
        C1567130qsp c1567130qsp = this.LJIIIZ;
        return ((iHashCode5 + (c1567130qsp != null ? c1567130qsp.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIJ);
    }

    public final String toString() {
        return "RechargePanelNoticeData(id=" + this.LIZ + ", title=" + this.LIZIZ + ", content=" + this.LIZJ + ", schemaUrl=" + this.LIZLLL + ", schemaText=" + this.LJ + ", closable=" + this.LJFF + ", isInfoIcon=" + this.LJI + ", maxViewCount=" + this.LJII + ", dayLimit=" + this.LJIIIIZZ + ", autoLogin=" + this.LJIIIZ + ", linkExternalBrowser=" + this.LJIIJ + ')';
    }

    public C1567120qso(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, int i2, C1567130qsp c1567130qsp, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = c1567130qsp;
        this.LJIIJ = z3;
    }
}

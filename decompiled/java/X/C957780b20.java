package X;

import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.MultiGuestSpotNonSeiExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0b20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957780b20 {
    public final long LIZ;
    public final String LIZIZ;
    public double LIZJ;
    public double LIZLLL;
    public double LJ;
    public double LJFF;
    public final long LJI;
    public double LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final PosIdentity LJIIJ;
    public final String LJIIJJI;
    public final MultiGuestSpotExtra LJIIL;
    public final MultiGuestSpotNonSeiExtra LJIILIIL;
    public final String LJIILJJIL;
    public final String LJIILL;

    public final String toString() {
        return "ExternalWillStartLinkMicLayoutWindow(spotId=" + this.LIZ + ", id=" + this.LIZIZ + ", left=" + this.LIZJ + ", top=" + this.LIZLLL + ", right=" + this.LJ + ", bottom=" + this.LJFF + ", zOrder=" + this.LJI + ", radius=" + this.LJII + ", businessId=" + this.LJIIIIZZ + ", configId=" + this.LJIIIZ + ", uiPos=" + this.LJIIJ + ", contentLinkMicId=" + this.LJIIJJI + ", extra=" + this.LJIIL + ", nonSeiExtra=" + this.LJIILIIL + ", cohostExtra=" + this.LJIILJJIL + ", cohostNonSeiExtra=" + this.LJIILL + ')';
    }

    public C957780b20(long j, String str, double d, double d2, double d3, double d4, long j2, double d5, String str2, String str3, PosIdentity posIdentity, String str4, MultiGuestSpotExtra multiGuestSpotExtra, MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra, String str5, String str6) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = d;
        this.LIZLLL = d2;
        this.LJ = d3;
        this.LJFF = d4;
        this.LJI = j2;
        this.LJII = d5;
        this.LJIIIIZZ = str2;
        this.LJIIIZ = str3;
        this.LJIIJ = posIdentity;
        this.LJIIJJI = str4;
        this.LJIIL = multiGuestSpotExtra;
        this.LJIILIIL = multiGuestSpotNonSeiExtra;
        this.LJIILJJIL = str5;
        this.LJIILL = str6;
    }
}

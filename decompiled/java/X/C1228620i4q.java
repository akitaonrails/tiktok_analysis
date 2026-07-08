package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228620i4q {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final List<Integer> LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final boolean LJIILJJIL;
    public final Float LJIILL;
    public final boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final boolean LJIJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228620i4q)) {
            return false;
        }
        C1228620i4q c1228620i4q = (C1228620i4q) obj;
        return Intrinsics.LJFF(this.LIZ, c1228620i4q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1228620i4q.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1228620i4q.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1228620i4q.LIZLLL) && Intrinsics.LJFF(this.LJ, c1228620i4q.LJ) && Intrinsics.LJFF(this.LJFF, c1228620i4q.LJFF) && Intrinsics.LJFF(this.LJI, c1228620i4q.LJI) && Intrinsics.LJFF(this.LJII, c1228620i4q.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1228620i4q.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1228620i4q.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1228620i4q.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1228620i4q.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1228620i4q.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1228620i4q.LJIILIIL) && this.LJIILJJIL == c1228620i4q.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c1228620i4q.LJIILL) && this.LJIILLIIL == c1228620i4q.LJIILLIIL && Intrinsics.LJFF(this.LJIIZILJ, c1228620i4q.LJIIZILJ) && this.LJIJ == c1228620i4q.LJIJ && this.LJIJI == c1228620i4q.LJIJI && this.LJIJJ == c1228620i4q.LJIJJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31;
        Float f = this.LJIILL;
        return ((((((((((iHashCode + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ) * 31) + this.LJIJI) * 31) + C786410Ut5.Z2(this.LJIJJ);
    }

    public final String toString() {
        return "FanGroupChooseInviteParam(action=" + this.LIZ + ", targetUserId=" + this.LIZIZ + ", inviteTargetUserSuccessToastContent=" + this.LIZJ + ", nextButtonContent=" + this.LIZLLL + ", enterFrom=" + this.LJ + ", enterMethod=" + this.LJFF + ", tracingUuid=" + this.LJI + ", accessCriteriaCollectionIds=" + this.LJII + ", groupType=" + this.LJIIIIZZ + ", groupCategory=" + this.LJIIIZ + ", businessType=" + this.LJIIJ + ", creatorUid=" + this.LJIIJJI + ", defaultGroupName=" + this.LJIIL + ", scene=" + this.LJIILIIL + ", isFullScreen=" + this.LJIILJJIL + ", panelHeightRatio=" + this.LJIILL + ", disableBackgroundMask=" + this.LJIILLIIL + ", trafficType=" + this.LJIIZILJ + ", createChatLandingPage=" + this.LJIJ + ", quickChatViewType=" + this.LJIJI + ", hideTitleText=" + this.LJIJJ + ')';
    }

    public C1228620i4q(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Integer> list, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, Float f, boolean z2, String str14, int i, int i2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = list;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = str11;
        this.LJIIL = str12;
        this.LJIILIIL = str13;
        this.LJIILJJIL = z;
        this.LJIILL = f;
        this.LJIILLIIL = z2;
        this.LJIIZILJ = str14;
        this.LJIJ = i;
        this.LJIJI = i2;
        this.LJIJJ = z3;
    }
}

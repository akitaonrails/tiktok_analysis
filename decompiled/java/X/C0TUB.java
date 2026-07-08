package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TUB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUB {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final Integer LJIIJ;
    public final String LJIIJJI;
    public final Long LJIIL;
    public final String LJIILIIL;
    public final boolean LJIILJJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0TUB)) {
            return false;
        }
        C0TUB c0tub = (C0TUB) obj;
        return this.LIZ == c0tub.LIZ && Intrinsics.LJFF(this.LIZIZ, c0tub.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0tub.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0tub.LIZLLL) && Intrinsics.LJFF(this.LJ, c0tub.LJ) && this.LJFF == c0tub.LJFF && this.LJI == c0tub.LJI && this.LJII == c0tub.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c0tub.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0tub.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0tub.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0tub.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c0tub.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c0tub.LJIILIIL) && this.LJIILJJIL == c0tub.LJIILJJIL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode2 = (((((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        String str3 = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJIIJ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.LJIIJJI;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.LJIIL;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.LJIILIIL;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILJJIL);
    }

    public final String toString() {
        return "ExploreCardPlayAttributionInput(isExploreCardEntrance=" + this.LIZ + ", groupId=" + this.LIZIZ + ", playerSourceId=" + this.LIZJ + ", playUrl=" + this.LIZLLL + ", enterFrom=" + this.LJ + ", isPreviewLight=" + this.LJFF + ", isSingleActivity=" + this.LJI + ", awemeType=" + this.LJII + ", requestId=" + this.LJIIIIZZ + ", entranceMechanismValue=" + this.LJIIIZ + ", modelSource=" + this.LJIIJ + ", fromExplorePage=" + this.LJIIJJI + ", exploreTopicId=" + this.LJIIL + ", exploreTopicName=" + this.LJIILIIL + ", tracksFirstImageRender=" + this.LJIILJJIL + ')';
    }

    public C0TUB(boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, int i, String str5, String str6, Integer num, String str7, Long l, String str8, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = i;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = num;
        this.LJIIJJI = str7;
        this.LJIIL = l;
        this.LJIILIIL = str8;
        this.LJIILJJIL = z4;
    }
}

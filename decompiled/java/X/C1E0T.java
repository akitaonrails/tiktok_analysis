package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1E0T, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E0T implements InterfaceC898340ZMa {
    public static final /* synthetic */ int LJIL = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final Boolean LJI;
    public final Boolean LJII;
    public final Integer LJIIIIZZ;
    public final Integer LJIIIZ;
    public final Long LJIIJ;
    public final Boolean LJIIJJI;
    public final Long LJIIL;
    public final String LJIILIIL;
    public final Boolean LJIILJJIL;
    public final Boolean LJIILL;
    public final Boolean LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final Long LJIJI;
    public final Long LJIJJ;
    public final boolean LJIJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1E0T)) {
            return false;
        }
        C1E0T c1e0t = (C1E0T) obj;
        return this.LIZ == c1e0t.LIZ && this.LIZIZ == c1e0t.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1e0t.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1e0t.LIZLLL) && Intrinsics.LJFF(this.LJ, c1e0t.LJ) && Intrinsics.LJFF(this.LJFF, c1e0t.LJFF) && Intrinsics.LJFF(this.LJI, c1e0t.LJI) && Intrinsics.LJFF(this.LJII, c1e0t.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1e0t.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1e0t.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1e0t.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1e0t.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1e0t.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1e0t.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1e0t.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1e0t.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1e0t.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1e0t.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c1e0t.LJIJ) && Intrinsics.LJFF(this.LJIJI, c1e0t.LJIJI) && Intrinsics.LJFF(this.LJIJJ, c1e0t.LJIJJ) && this.LJIJJLI == c1e0t.LJIJJLI;
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.LJI;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJII;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.LJIIIIZZ;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LJIIIZ;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.LJIIJ;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool3 = this.LJIIJJI;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l2 = this.LJIIL;
        int iHashCode11 = (iHashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.LJIILIIL;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.LJIILJJIL;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.LJIILL;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.LJIILLIIL;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str3 = this.LJIIZILJ;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIJ;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.LJIJI;
        int iHashCode18 = (iHashCode17 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.LJIJJ;
        return ((iHashCode18 + (l4 != null ? l4.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIJJLI);
    }

    public final String toString() {
        return "PreshownStickerMetaData(currentLocaleTimeSecond=" + this.LIZ + ", currentServerTimeSecond=" + this.LIZIZ + ", fromPath=" + this.LIZJ + ", followStatus=" + this.LIZLLL + ", followerStatus=" + this.LJ + ", conversationType=" + this.LJFF + ", isOnline=" + this.LJI + ", isStranger=" + this.LJII + ", latestMessageType=" + this.LJIIIIZZ + ", feedbackScore=" + this.LJIIIZ + ", lastResetScoreTimeDiff=" + this.LJIIJ + ", hasSentStickerToday=" + this.LJIIJJI + ", lastMessageInConvDiff=" + this.LJIIL + ", pushLabel=" + this.LJIILIIL + ", isRecommendedMUFChat=" + this.LJIILJJIL + ", isMaf=" + this.LJIILL + ", convHasLastMsg=" + this.LJIILLIIL + ", appLaunchFrom=" + this.LJIIZILJ + ", outPushLabel=" + this.LJIJ + ", lastEnterChatTimeDiff=" + this.LJIJI + ", lastSendMessageTimeDiff=" + this.LJIJJ + ", hasNewMemberJoinedGroup=" + this.LJIJJLI + ')';
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC898340ZMa
    public final String LIZJ() {
        return this.LIZJ;
    }

    public C1E0T(long j, long j2, String str, Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2, Integer num4, Integer num5, Long l, Boolean bool3, Long l2, String str2, Boolean bool4, Boolean bool5, Boolean bool6, String str3, String str4, Long l3, Long l4, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = num3;
        this.LJI = bool;
        this.LJII = bool2;
        this.LJIIIIZZ = num4;
        this.LJIIIZ = num5;
        this.LJIIJ = l;
        this.LJIIJJI = bool3;
        this.LJIIL = l2;
        this.LJIILIIL = str2;
        this.LJIILJJIL = bool4;
        this.LJIILL = bool5;
        this.LJIILLIIL = bool6;
        this.LJIIZILJ = str3;
        this.LJIJ = str4;
        this.LJIJI = l3;
        this.LJIJJ = l4;
        this.LJIJJLI = z;
    }
}

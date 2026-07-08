package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0anF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948630anF {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final Map<String, String> LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C948630anF)) {
            return false;
        }
        C948630anF c948630anF = (C948630anF) obj;
        return Intrinsics.LJFF(this.LIZ, c948630anF.LIZ) && this.LIZIZ == c948630anF.LIZIZ && Intrinsics.LJFF(this.LIZJ, c948630anF.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c948630anF.LIZLLL) && this.LJ == c948630anF.LJ && this.LJFF == c948630anF.LJFF && this.LJI == c948630anF.LJI && Intrinsics.LJFF(this.LJII, c948630anF.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c948630anF.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c948630anF.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c948630anF.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c948630anF.LJIIJJI);
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode();
    }

    public final String toString() {
        return "CohostContext(uid=" + this.LIZ + ", isFriend=" + this.LIZIZ + ", enterFrom=" + this.LIZJ + ", autoCohostSourceType=" + this.LIZLLL + ", notOpenPanelWhenAutoCohostFailure=" + this.LJ + ", showAnimationForAutoCohostUser=" + this.LJFF + ", autoQuickCohostInvite=" + this.LJI + ", autoMatchScene=" + this.LJII + ", autoMatchEntrance=" + this.LJIIIIZZ + ", autoCohostUIDs=" + this.LJIIIZ + ", autoCohostRoomIDs=" + this.LJIIJ + ", tracks=" + this.LJIIJJI + ')';
    }

    public C948630anF(String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4, String str5, String str6, String str7, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = str4;
        this.LJIIIIZZ = str5;
        this.LJIIIZ = str6;
        this.LJIIJ = str7;
        this.LJIIJJI = map;
    }
}

package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129080fUI {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final Long LJFF;
    public final Integer LJI;
    public final boolean LJII;
    public final Room LJIIIIZZ;
    public final C1885707a3 LJIIIZ;
    public final C1129270fUb LJIIJ;
    public final C1129350fUj LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129080fUI)) {
            return false;
        }
        C1129080fUI c1129080fUI = (C1129080fUI) obj;
        return this.LIZ == c1129080fUI.LIZ && this.LIZIZ == c1129080fUI.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1129080fUI.LIZJ) && this.LIZLLL == c1129080fUI.LIZLLL && this.LJ == c1129080fUI.LJ && Intrinsics.LJFF(this.LJFF, c1129080fUI.LJFF) && Intrinsics.LJFF(this.LJI, c1129080fUI.LJI) && this.LJII == c1129080fUI.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1129080fUI.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1129080fUI.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1129080fUI.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1129080fUI.LJIIJJI);
    }

    public final int hashCode() {
        int iY2 = ((((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        Long l = this.LJFF;
        int iHashCode = (iY2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.LJI;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        Room room = this.LJIIIIZZ;
        int iHashCode3 = (iHashCode2 + (room == null ? 0 : room.hashCode())) * 31;
        C1885707a3 c1885707a3 = this.LJIIIZ;
        int iHashCode4 = (iHashCode3 + (c1885707a3 == null ? 0 : c1885707a3.hashCode())) * 31;
        C1129270fUb c1129270fUb = this.LJIIJ;
        int iHashCode5 = (iHashCode4 + (c1129270fUb == null ? 0 : c1129270fUb.hashCode())) * 31;
        C1129350fUj c1129350fUj = this.LJIIJJI;
        return iHashCode5 + (c1129350fUj != null ? c1129350fUj.hashCode() : 0);
    }

    public final String toString() {
        return "OpenPanelParams(roomId=" + this.LIZ + ", anchorId=" + this.LIZIZ + ", enterFrom=" + this.LIZJ + ", toUserId=" + this.LIZLLL + ", isAnchor=" + this.LJ + ", triggerGiftId=" + this.LJFF + ", triggerTabType=" + this.LJI + ", forceRefresh=" + this.LJII + ", room=" + this.LJIIIIZZ + ", legacyInsertParams=" + this.LJIIIZ + ", preComputedData=" + this.LJIIJ + ", panelBuildMetadata=" + this.LJIIJJI + ')';
    }

    public static C1129080fUI LIZ(C1129080fUI c1129080fUI) {
        return new C1129080fUI(c1129080fUI.LIZ, c1129080fUI.LIZIZ, c1129080fUI.LIZJ, c1129080fUI.LIZLLL, c1129080fUI.LJ, c1129080fUI.LJFF, c1129080fUI.LJI, true, c1129080fUI.LJIIIIZZ, c1129080fUI.LJIIIZ, (C1129270fUb) null, c1129080fUI.LJIIJJI);
    }

    public /* synthetic */ C1129080fUI(long j, long j2, String str, long j3, boolean z, Long l, Integer num, Room room, C1885707a3 c1885707a3, C1129270fUb c1129270fUb, C1129350fUj c1129350fUj, int i) {
        this(j, j2, str, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : num, false, (i & 256) != 0 ? null : room, (i & 512) != 0 ? null : c1885707a3, (i & 1024) != 0 ? null : c1129270fUb, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? c1129350fUj : null);
    }

    public C1129080fUI(long j, long j2, String str, long j3, boolean z, Long l, Integer num, boolean z2, Room room, C1885707a3 c1885707a3, C1129270fUb c1129270fUb, C1129350fUj c1129350fUj) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = j3;
        this.LJ = z;
        this.LJFF = l;
        this.LJI = num;
        this.LJII = z2;
        this.LJIIIIZZ = room;
        this.LJIIIZ = c1885707a3;
        this.LJIIJ = c1129270fUb;
        this.LJIIJJI = c1129350fUj;
    }
}

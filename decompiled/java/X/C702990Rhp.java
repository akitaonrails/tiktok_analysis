package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702990Rhp {
    public final Map<String, List<C703160Ri6>> LIZ;
    public final C702940Rhk LIZIZ;
    public final C700400Rde LIZJ;
    public final C700400Rde LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final Map<String, Long> LJII;
    public final Map<String, C700060Rd6> LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public final List<String> LJIIJ;

    public C702990Rhp() {
        this(2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C702990Rhp)) {
            return false;
        }
        C702990Rhp c702990Rhp = (C702990Rhp) obj;
        return Intrinsics.LJFF(this.LIZ, c702990Rhp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c702990Rhp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c702990Rhp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c702990Rhp.LIZLLL) && this.LJ == c702990Rhp.LJ && this.LJFF == c702990Rhp.LJFF && this.LJI == c702990Rhp.LJI && Intrinsics.LJFF(this.LJII, c702990Rhp.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c702990Rhp.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c702990Rhp.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c702990Rhp.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C702940Rhk c702940Rhk = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c702940Rhk == null ? 0 : c702940Rhk.hashCode())) * 31;
        C700400Rde c700400Rde = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c700400Rde == null ? 0 : c700400Rde.hashCode())) * 31;
        C700400Rde c700400Rde2 = this.LIZLLL;
        return ((((((((((((((iHashCode3 + (c700400Rde2 != null ? c700400Rde2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "SlotStrategyStoreState(rulesBySlot=" + this.LIZ + ", snapshot=" + this.LIZIZ + ", baselineSlotTree=" + this.LIZJ + ", candidateMountedSlotTree=" + this.LIZLLL + ", nextSnapshotVersion=" + this.LJ + ", nextRevision=" + this.LJFF + ", nextExecuteId=" + this.LJI + ", activeExecuteIdBySlot=" + this.LJII + ", committedCandidatesBySlot=" + this.LJIIIIZZ + ", acceptedParentBySlot=" + this.LJIIIZ + ", lastCommitConflictSlotIds=" + this.LJIIJ + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C702990Rhp(int i) {
        Map mapLJ;
        Map mapLJ2;
        Map mapLJ3;
        Map mapLJ4;
        if ((i & 1) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i & 128) != 0) {
            mapLJ2 = C2097608Jq.LJ();
        } else {
            mapLJ2 = null;
        }
        if ((i & 256) != 0) {
            mapLJ3 = C2097608Jq.LJ();
        } else {
            mapLJ3 = null;
        }
        if ((i & 512) != 0) {
            mapLJ4 = C2097608Jq.LJ();
        } else {
            mapLJ4 = null;
        }
        this(mapLJ, null, null, null, 0L, 0L, 0L, mapLJ2, mapLJ3, mapLJ4, (i & 1024) != 0 ? C13BV.INSTANCE : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C702990Rhp(Map<String, ? extends List<C703160Ri6>> map, C702940Rhk c702940Rhk, C700400Rde c700400Rde, C700400Rde c700400Rde2, long j, long j2, long j3, Map<String, Long> map2, Map<String, C700060Rd6> map3, Map<String, String> map4, List<String> list) {
        this.LIZ = map;
        this.LIZIZ = c702940Rhk;
        this.LIZJ = c700400Rde;
        this.LIZLLL = c700400Rde2;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = map2;
        this.LJIIIIZZ = map3;
        this.LJIIIZ = map4;
        this.LJIIJ = list;
    }

    public static C702990Rhp LIZ(C702990Rhp c702990Rhp, Map map, C702940Rhk c702940Rhk, C700400Rde c700400Rde, C700400Rde c700400Rde2, long j, long j2, long j3, Map map2, Map map3, Map map4, List list, int i) {
        Map map5 = map2;
        long j4 = j3;
        long j5 = j2;
        long j6 = j;
        C700400Rde c700400Rde3 = c700400Rde2;
        List list2 = list;
        C700400Rde c700400Rde4 = c700400Rde;
        Map map6 = map4;
        C702940Rhk c702940Rhk2 = c702940Rhk;
        Map map7 = map3;
        Map map8 = map;
        if ((i & 1) != 0) {
            map8 = c702990Rhp.LIZ;
        }
        if ((i & 2) != 0) {
            c702940Rhk2 = c702990Rhp.LIZIZ;
        }
        if ((i & 4) != 0) {
            c700400Rde4 = c702990Rhp.LIZJ;
        }
        if ((i & 8) != 0) {
            c700400Rde3 = c702990Rhp.LIZLLL;
        }
        if ((i & 16) != 0) {
            j6 = c702990Rhp.LJ;
        }
        if ((i & 32) != 0) {
            j5 = c702990Rhp.LJFF;
        }
        if ((i & 64) != 0) {
            j4 = c702990Rhp.LJI;
        }
        if ((i & 128) != 0) {
            map5 = c702990Rhp.LJII;
        }
        if ((i & 256) != 0) {
            map7 = c702990Rhp.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            map6 = c702990Rhp.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            list2 = c702990Rhp.LJIIJ;
        }
        c702990Rhp.getClass();
        return new C702990Rhp(map8, c702940Rhk2, c700400Rde4, c700400Rde3, j6, j5, j4, map5, map7, map6, list2);
    }
}

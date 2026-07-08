package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020830cfh {
    public JSONObject LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public JSONObject LJ;
    public C1020860cfk LJFF;
    public C1020860cfk LJI;
    public Map<String, ? extends Object> LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;
    public final Map<String, Boolean> LJIIL;
    public final Map<Integer, Map<Integer, C1020870cfl>> LJIILIIL;
    public final Map<Integer, C1020860cfk> LJIILJJIL;
    public final Map<Integer, Long> LJIILL;
    public final Map<Integer, Long> LJIILLIIL;
    public final Map<Integer, Integer> LJIIZILJ;
    public final Set<String> LJIJ;

    public C1020830cfh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020830cfh)) {
            return false;
        }
        C1020830cfh c1020830cfh = (C1020830cfh) obj;
        return Intrinsics.LJFF(this.LIZ, c1020830cfh.LIZ) && this.LIZIZ == c1020830cfh.LIZIZ && this.LIZJ == c1020830cfh.LIZJ && this.LIZLLL == c1020830cfh.LIZLLL && Intrinsics.LJFF(this.LJ, c1020830cfh.LJ) && Intrinsics.LJFF(this.LJFF, c1020830cfh.LJFF) && Intrinsics.LJFF(this.LJI, c1020830cfh.LJI) && Intrinsics.LJFF(this.LJII, c1020830cfh.LJII) && this.LJIIIIZZ == c1020830cfh.LJIIIIZZ && this.LJIIIZ == c1020830cfh.LJIIIZ && this.LJIIJ == c1020830cfh.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1020830cfh.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1020830cfh.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1020830cfh.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1020830cfh.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1020830cfh.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1020830cfh.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1020830cfh.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c1020830cfh.LJIJ);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LIZ;
        int iHashCode = (((((((jSONObject == null ? 0 : jSONObject.hashCode()) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        JSONObject jSONObject2 = this.LJ;
        int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        C1020860cfk c1020860cfk = this.LJFF;
        int iHashCode3 = (iHashCode2 + (c1020860cfk == null ? 0 : c1020860cfk.hashCode())) * 31;
        C1020860cfk c1020860cfk2 = this.LJI;
        int iHashCode4 = (((((((((iHashCode3 + (c1020860cfk2 == null ? 0 : c1020860cfk2.hashCode())) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31;
        String str = this.LJIIJJI;
        return ((((((((((((((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL.hashCode()) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode();
    }

    public final String toString() {
        return "UgenOneBigThreeSmallRuntimeState(baseUgenDataSnapshot=" + this.LIZ + ", currentIndex=" + this.LIZIZ + ", isSelected=" + this.LIZJ + ", hostVisible=" + this.LIZLLL + ", lastPayload=" + this.LJ + ", currentSnapshot=" + this.LJFF + ", appliedSnapshot=" + this.LJI + ", pendingRealtimeClickExtraData=" + this.LJII + ", overallAccumulatedStayDurationMs=" + this.LJIIIIZZ + ", hostResumeTimeMs=" + this.LJIIIZ + ", currentExposureCycleId=" + this.LJIIJ + ", lastPublishedJumpSignature=" + this.LJIIJJI + ", imageLoadInfoByUrl=" + this.LJIIL + ", pageImageResultBySlide=" + this.LJIILIIL + ", pageSnapshotsBySlide=" + this.LJIILJJIL + ", slideEnterTimeMap=" + this.LJIILL + ", slideAccumulatedStayDurationMap=" + this.LJIILLIIL + ", slideViewCountMap=" + this.LJIIZILJ + ", reportedPageExposureKeys=" + this.LJIJ + ')';
    }

    public C1020830cfh(Object obj) {
        Map<String, ? extends Object> mapLJ = C2097608Jq.LJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LIZ = null;
        this.LIZIZ = 0;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = mapLJ;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = null;
        this.LJIIL = linkedHashMap;
        this.LJIILIIL = linkedHashMap2;
        this.LJIILJJIL = linkedHashMap3;
        this.LJIILL = linkedHashMap4;
        this.LJIILLIIL = linkedHashMap5;
        this.LJIIZILJ = linkedHashMap6;
        this.LJIJ = linkedHashSet;
    }
}

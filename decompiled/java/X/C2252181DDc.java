package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252181DDc {
    public final EnumC780830Uk5 LIZ;
    public final Map<String, Integer> LIZIZ;
    public final Map<String, Integer> LIZJ;
    public final Map<String, Integer> LIZLLL;
    public final Map<String, Integer> LJ;
    public final Map<String, Integer> LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public Runnable LJIILJJIL;
    public Runnable LJIILL;
    public Runnable LJIILLIIL;

    public C2252181DDc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2252181DDc)) {
            return false;
        }
        C2252181DDc c2252181DDc = (C2252181DDc) obj;
        return this.LIZ == c2252181DDc.LIZ && Intrinsics.LJFF(this.LIZIZ, c2252181DDc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2252181DDc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2252181DDc.LIZLLL) && Intrinsics.LJFF(this.LJ, c2252181DDc.LJ) && Intrinsics.LJFF(this.LJFF, c2252181DDc.LJFF) && this.LJI == c2252181DDc.LJI && this.LJII == c2252181DDc.LJII && this.LJIIIIZZ == c2252181DDc.LJIIIIZZ && this.LJIIIZ == c2252181DDc.LJIIIZ && this.LJIIJ == c2252181DDc.LJIIJ && this.LJIIJJI == c2252181DDc.LJIIJJI && this.LJIIL == c2252181DDc.LJIIL && this.LJIILIIL == c2252181DDc.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c2252181DDc.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c2252181DDc.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c2252181DDc.LJIILLIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Y2(this.LJIIL)) * 31) + C786410Ut5.Y2(this.LJIILIIL)) * 31;
        Runnable runnable = this.LJIILJJIL;
        int iHashCode2 = (iHashCode + (runnable == null ? 0 : runnable.hashCode())) * 31;
        Runnable runnable2 = this.LJIILL;
        int iHashCode3 = (iHashCode2 + (runnable2 == null ? 0 : runnable2.hashCode())) * 31;
        Runnable runnable3 = this.LJIILLIIL;
        return iHashCode3 + (runnable3 != null ? runnable3.hashCode() : 0);
    }

    public final String toString() {
        return "PhaseState(priority=" + this.LIZ + ", expectedCounts=" + this.LIZIZ + ", preRequestCounts=" + this.LIZJ + ", notRequestedCounts=" + this.LIZLLL + ", requestedCounts=" + this.LJ + ", plannedCounts=" + this.LJFF + ", plannedTypeCountTotal=" + this.LJI + ", plannedWidgetCountTotal=" + this.LJII + ", requestedTypeCountTotal=" + this.LJIIIIZZ + ", requestedWidgetCountTotal=" + this.LJIIIZ + ", started=" + this.LJIIJ + ", completed=" + this.LJIIJJI + ", startUptimeMs=" + this.LJIIL + ", completedUptimeMs=" + this.LJIILIIL + ", scheduled=" + this.LJIILJJIL + ", timeout=" + this.LJIILL + ", requestSettle=" + this.LJIILLIIL + ')';
    }

    public C2252181DDc(EnumC780830Uk5 enumC780830Uk5) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        this.LIZ = enumC780830Uk5;
        this.LIZIZ = linkedHashMap;
        this.LIZJ = linkedHashMap2;
        this.LIZLLL = linkedHashMap3;
        this.LJ = linkedHashMap4;
        this.LJFF = linkedHashMap5;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
    }
}

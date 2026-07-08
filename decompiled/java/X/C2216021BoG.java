package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216021BoG {
    public final boolean LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final double LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2216021BoG)) {
            return false;
        }
        C2216021BoG c2216021BoG = (C2216021BoG) obj;
        return this.LIZ == c2216021BoG.LIZ && this.LIZIZ == c2216021BoG.LIZIZ && this.LIZJ == c2216021BoG.LIZJ && Double.compare(this.LIZLLL, c2216021BoG.LIZLLL) == 0 && Double.compare(this.LJ, c2216021BoG.LJ) == 0 && Double.compare(this.LJFF, c2216021BoG.LJFF) == 0 && Double.compare(this.LJI, c2216021BoG.LJI) == 0 && this.LJII == c2216021BoG.LJII && this.LJIIIIZZ == c2216021BoG.LJIIIIZZ && this.LJIIIZ == c2216021BoG.LJIIIZ && this.LJIIJ == c2216021BoG.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c2216021BoG.LJIIJJI);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.X2(this.LIZLLL)) * 31) + C786410Ut5.X2(this.LJ)) * 31) + C786410Ut5.X2(this.LJFF)) * 31) + C786410Ut5.X2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31;
        String str = this.LJIIJJI;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ClarityMetrics(isSuccess=" + this.LIZ + ", durationMs=" + this.LIZIZ + ", totalCount=" + this.LIZJ + ", avgScore=" + this.LIZLLL + ", pct50Score=" + this.LJ + ", pct75Score=" + this.LJFF + ", pct90Score=" + this.LJI + ", useTimeMs=" + this.LJII + ", rawDurationMs=" + this.LJIIIIZZ + ", videoWidth=" + this.LJIIIZ + ", videoHeight=" + this.LJIIJ + ", failureReason=" + this.LJIIJJI + ')';
    }

    public C2216021BoG(boolean z, long j, int i, double d, double d2, double d3, double d4, long j2, long j3, int i2, int i3, String str) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = d;
        this.LJ = d2;
        this.LJFF = d3;
        this.LJI = d4;
        this.LJII = j2;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
        this.LJIIJJI = str;
    }
}

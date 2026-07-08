package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183860gue {
    public final String LIZ;
    public long LIZIZ = 0;
    public long LIZJ = 0;
    public long LIZLLL = 0;
    public boolean LJ = false;
    public int LJFF = 0;
    public long LJI = 0;
    public boolean LJII = false;
    public long LJIIIIZZ = 0;
    public boolean LJIIIZ = false;
    public String LJIIJ = "";
    public long LJIIJJI = 0;
    public long LJIIL = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183860gue)) {
            return false;
        }
        C1183860gue c1183860gue = (C1183860gue) obj;
        return Intrinsics.LJFF(this.LIZ, c1183860gue.LIZ) && this.LIZIZ == c1183860gue.LIZIZ && this.LIZJ == c1183860gue.LIZJ && this.LIZLLL == c1183860gue.LIZLLL && this.LJ == c1183860gue.LJ && this.LJFF == c1183860gue.LJFF && this.LJI == c1183860gue.LJI && this.LJII == c1183860gue.LJII && this.LJIIIIZZ == c1183860gue.LJIIIIZZ && this.LJIIIZ == c1183860gue.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1183860gue.LJIIJ) && this.LJIIJJI == c1183860gue.LJIIJJI && this.LJIIL == c1183860gue.LJIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIJJI)) * 31) + C786410Ut5.Y2(this.LJIIL);
    }

    public final String toString() {
        return "PreloadTraceContext(traceId=" + this.LIZ + ", networkStartTs=" + this.LIZIZ + ", networkEndTs=" + this.LIZJ + ", networkDurationMs=" + this.LIZLLL + ", networkSuccess=" + this.LJ + ", networkErrorCode=" + this.LJFF + ", cacheWriteTs=" + this.LJI + ", cacheWriteSuccess=" + this.LJII + ", cacheReadTs=" + this.LJIIIIZZ + ", cacheHit=" + this.LJIIIZ + ", cacheSourceType=" + this.LJIIJ + ", cacheAgeMs=" + this.LJIIJJI + ", renderStartTs=" + this.LJIIL + ')';
    }

    public C1183860gue(String str) {
        this.LIZ = str;
    }
}

package X;

/* JADX INFO: renamed from: X.0E0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357670E0n {
    public final int LIZ;
    public long LIZJ;
    public long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final boolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public final long LJIIJ;
    public float LIZIZ = 0.0f;
    public boolean LJI = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C357670E0n)) {
            return false;
        }
        C357670E0n c357670E0n = (C357670E0n) obj;
        return this.LIZ == c357670E0n.LIZ && Float.compare(this.LIZIZ, c357670E0n.LIZIZ) == 0 && this.LIZJ == c357670E0n.LIZJ && this.LIZLLL == c357670E0n.LIZLLL && this.LJ == c357670E0n.LJ && this.LJFF == c357670E0n.LJFF && this.LJI == c357670E0n.LJI && this.LJII == c357670E0n.LJII && this.LJIIIIZZ == c357670E0n.LJIIIIZZ && this.LJIIIZ == c357670E0n.LJIIIZ && this.LJIIJ == c357670E0n.LJIIJ;
    }

    public final String toString() {
        return "SlotInfo(index=" + this.LIZ + ", weight=" + this.LIZIZ + ", startTime=" + this.LIZJ + ", endTime=" + this.LIZLLL + ", resourceDuration=" + this.LJ + ", initialSlotDuration=" + this.LJFF + ", isMaxDuration=" + this.LJI + ", hasOverlap=" + this.LJII + ", startTransDuration=" + this.LJIIIIZZ + ", endTransDuration=" + this.LJIIIZ + ", maxSlotDuration=" + this.LJIIJ + ')';
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Y2(this.LJIIJ);
    }

    public C357670E0n(int i, long j, long j2, long j3, long j4, boolean z, long j5, long j6, long j7) {
        this.LIZ = i;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = j3;
        this.LJFF = j4;
        this.LJII = z;
        this.LJIIIIZZ = j5;
        this.LJIIIZ = j6;
        this.LJIIJ = j7;
    }
}

package X;

/* JADX INFO: renamed from: X.1ACk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175561ACk {
    public final long LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2175561ACk)) {
            return false;
        }
        C2175561ACk c2175561ACk = (C2175561ACk) obj;
        return this.LIZ == c2175561ACk.LIZ && this.LIZIZ == c2175561ACk.LIZIZ && this.LIZJ == c2175561ACk.LIZJ && this.LIZLLL == c2175561ACk.LIZLLL && this.LJ == c2175561ACk.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PulsePullConfig(delayTimeMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxPulseCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pulseKeepMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pulseIntervalMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", totalPullTimeMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2175561ACk(long j, int i, long j2, long j3, long j4) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
    }
}

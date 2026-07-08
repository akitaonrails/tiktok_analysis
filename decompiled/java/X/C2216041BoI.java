package X;

/* JADX INFO: renamed from: X.1BoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216041BoI {
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2216041BoI)) {
            return false;
        }
        C2216041BoI c2216041BoI = (C2216041BoI) obj;
        return this.LIZ == c2216041BoI.LIZ && this.LIZIZ == c2216041BoI.LIZIZ && this.LIZJ == c2216041BoI.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeoutConfig(maxDurationMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", softTimeoutMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hardTtlMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2216041BoI(long j, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
    }
}

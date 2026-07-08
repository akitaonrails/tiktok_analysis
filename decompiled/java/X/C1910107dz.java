package X;

/* JADX INFO: renamed from: X.07dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1910107dz {
    public final boolean LIZ;
    public final long LIZIZ;
    public final double LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1910107dz)) {
            return false;
        }
        C1910107dz c1910107dz = (C1910107dz) obj;
        return this.LIZ == c1910107dz.LIZ && this.LIZIZ == c1910107dz.LIZIZ && Double.compare(this.LIZJ, c1910107dz.LIZJ) == 0;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.X2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Decision(shouldReport=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dropCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", qps=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1910107dz(long j, boolean z, double d) {
        this.LIZ = z;
        this.LIZIZ = j;
        this.LIZJ = d;
    }
}

package X;

/* JADX INFO: renamed from: X.0pIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506000pIE {
    public final long LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1506000pIE)) {
            return false;
        }
        C1506000pIE c1506000pIE = (C1506000pIE) obj;
        return this.LIZ == c1506000pIE.LIZ && this.LIZIZ == c1506000pIE.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimedSample(tsMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1506000pIE(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}

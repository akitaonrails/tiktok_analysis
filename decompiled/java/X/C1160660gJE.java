package X;

/* JADX INFO: renamed from: X.0gJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160660gJE {
    public final int LIZ;
    public final long LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160660gJE)) {
            return false;
        }
        C1160660gJE c1160660gJE = (C1160660gJE) obj;
        return this.LIZ == c1160660gJE.LIZ && this.LIZIZ == c1160660gJE.LIZIZ && Float.compare(this.LIZJ, c1160660gJE.LIZJ) == 0 && this.LIZLLL == c1160660gJE.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoplayCandidate(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ratio=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", frameTop=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public C1160660gJE(float f, int i, int i2, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = f;
        this.LIZLLL = i2;
    }
}

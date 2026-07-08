package X;

/* JADX INFO: renamed from: X.10qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19372210qe {
    public final long LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19372210qe)) {
            return false;
        }
        C19372210qe c19372210qe = (C19372210qe) obj;
        return this.LIZ == c19372210qe.LIZ && this.LIZIZ == c19372210qe.LIZIZ && this.LIZJ == c19372210qe.LIZJ && this.LIZLLL == c19372210qe.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Session(startedAtMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentLevel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", peakLevel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tickCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19372210qe(long j, int i, int i2) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}

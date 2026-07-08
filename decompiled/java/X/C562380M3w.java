package X;

/* JADX INFO: renamed from: X.0M3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562380M3w extends C0M2L {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C562380M3w)) {
            return false;
        }
        C562380M3w c562380M3w = (C562380M3w) obj;
        return this.LIZ == c562380M3w.LIZ && this.LIZIZ == c562380M3w.LIZIZ && this.LIZJ == c562380M3w.LIZJ && this.LIZLLL == c562380M3w.LIZLLL && this.LJ == c562380M3w.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountBased(totalCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oldDraftCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldDraftsSizeBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", totalSizeBytes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", months=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C562380M3w(int i, int i2, int i3, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = i3;
    }
}

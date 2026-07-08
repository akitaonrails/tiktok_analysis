package X;

/* JADX INFO: renamed from: X.0M3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562390M3x extends C0M2L {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C562390M3x)) {
            return false;
        }
        C562390M3x c562390M3x = (C562390M3x) obj;
        return this.LIZ == c562390M3x.LIZ && this.LIZIZ == c562390M3x.LIZIZ && this.LIZJ == c562390M3x.LIZJ && this.LIZLLL == c562390M3x.LIZLLL && this.LJ == c562390M3x.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SizeBased(totalCount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oldDraftCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", totalSizeBytes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", oldDraftsSizeBytes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", months=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C562390M3x(int i, int i2, int i3, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = i3;
    }
}

package X;

/* JADX INFO: renamed from: X.0V2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791260V2e {
    public final int LIZ;
    public int LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public int LJ = 1;
    public int LJFF;

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(",");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C791260V2e) {
            C791260V2e c791260V2e = (C791260V2e) obj;
            if (c791260V2e.LIZ == this.LIZ && c791260V2e.LIZLLL == this.LIZLLL) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C791260V2e(int i, int i2, long j, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = i3;
        this.LIZJ = j;
    }
}

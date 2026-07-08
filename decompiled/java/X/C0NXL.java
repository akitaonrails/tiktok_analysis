package X;

/* JADX INFO: renamed from: X.0NXL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NXL {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NXL)) {
            return false;
        }
        C0NXL c0nxl = (C0NXL) obj;
        return this.LIZ == c0nxl.LIZ && this.LIZIZ == c0nxl.LIZIZ && this.LIZJ == c0nxl.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CrossAppActivityStatus(appId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastActiveTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastInactiveTimestamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NXL(int i, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}

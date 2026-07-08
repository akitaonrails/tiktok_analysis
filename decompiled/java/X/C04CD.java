package X;

/* JADX INFO: renamed from: X.04CD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CD {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C04CD() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04CD)) {
            return false;
        }
        C04CD c04cd = (C04CD) obj;
        return this.LIZ == c04cd.LIZ && this.LIZIZ == c04cd.LIZIZ && this.LIZJ == c04cd.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpSessionMetrics(pv=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", buyNowCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", atcCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C04CD(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }

    public static C04CD LIZ(C04CD c04cd, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = c04cd.LIZ;
        }
        if ((i4 & 2) != 0) {
            i2 = c04cd.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i3 = c04cd.LIZJ;
        }
        c04cd.getClass();
        return new C04CD(i, i2, i3);
    }
}

package X;

/* JADX INFO: renamed from: X.0utZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721350utZ {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721350utZ)) {
            return false;
        }
        C1721350utZ c1721350utZ = (C1721350utZ) obj;
        return this.LIZ == c1721350utZ.LIZ && this.LIZIZ == c1721350utZ.LIZIZ && this.LIZJ == c1721350utZ.LIZJ && this.LIZLLL == c1721350utZ.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoldMatch(fullStart=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fullEnd=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contentStart=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contentEnd=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1721350utZ(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}

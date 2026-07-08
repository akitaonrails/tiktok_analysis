package X;

/* JADX INFO: renamed from: X.0vpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757110vpF {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1757110vpF)) {
            return false;
        }
        C1757110vpF c1757110vpF = (C1757110vpF) obj;
        return this.LIZ == c1757110vpF.LIZ && this.LIZIZ == c1757110vpF.LIZIZ && this.LIZJ == c1757110vpF.LIZJ && this.LIZLLL == c1757110vpF.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PiPSafeZone(startInsetPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topInsetPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", endInsetPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomInsetPx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1757110vpF(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}

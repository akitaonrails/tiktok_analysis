package X;

/* JADX INFO: renamed from: X.0qEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542080qEQ {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1542080qEQ)) {
            return false;
        }
        C1542080qEQ c1542080qEQ = (C1542080qEQ) obj;
        return this.LIZ == c1542080qEQ.LIZ && this.LIZIZ == c1542080qEQ.LIZIZ && this.LIZJ == c1542080qEQ.LIZJ && this.LIZLLL == c1542080qEQ.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScreenAdaptationPixelSize(screenWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", screenHeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewportWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", viewportHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1542080qEQ(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}

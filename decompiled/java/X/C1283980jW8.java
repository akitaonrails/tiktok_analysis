package X;

/* JADX INFO: renamed from: X.0jW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283980jW8 {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1283980jW8)) {
            return false;
        }
        C1283980jW8 c1283980jW8 = (C1283980jW8) obj;
        return Double.compare(this.LIZ, c1283980jW8.LIZ) == 0 && Double.compare(this.LIZIZ, c1283980jW8.LIZIZ) == 0 && Double.compare(this.LIZJ, c1283980jW8.LIZJ) == 0 && Double.compare(this.LIZLLL, c1283980jW8.LIZLLL) == 0 && Double.compare(this.LJ, c1283980jW8.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkMicLayoutRect(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", radius=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C2232561CZq LIZ() {
        return new C2232561CZq(Double.valueOf(this.LIZ), Double.valueOf(this.LIZIZ), Double.valueOf(this.LIZJ), Double.valueOf(this.LIZLLL), Double.valueOf(this.LJ));
    }

    public C1283980jW8(double d, double d2, double d3, double d4, double d5) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
        this.LJ = d5;
    }
}

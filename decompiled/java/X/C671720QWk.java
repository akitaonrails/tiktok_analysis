package X;

/* JADX INFO: renamed from: X.0QWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671720QWk {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C671720QWk)) {
            return false;
        }
        C671720QWk c671720QWk = (C671720QWk) obj;
        return this.LIZ == c671720QWk.LIZ && this.LIZIZ == c671720QWk.LIZIZ && this.LIZJ == c671720QWk.LIZJ && this.LIZLLL == c671720QWk.LIZLLL && this.LJ == c671720QWk.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarElementInfo(bgWidth=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inputEdtWidth=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inputHintWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startElementWidth=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", endElementWidth=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C671720QWk(int i, int i2, int i3, int i4, int i5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
    }
}

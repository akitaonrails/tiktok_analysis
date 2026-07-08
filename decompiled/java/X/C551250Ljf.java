package X;

/* JADX INFO: renamed from: X.0Ljf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551250Ljf implements InterfaceC553480LnG {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public C551250Ljf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551250Ljf)) {
            return false;
        }
        C551250Ljf c551250Ljf = (C551250Ljf) obj;
        return this.LIZ == c551250Ljf.LIZ && this.LIZIZ == c551250Ljf.LIZIZ && this.LIZJ == c551250Ljf.LIZJ && this.LIZLLL == c551250Ljf.LIZLLL && this.LJ == c551250Ljf.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomMinimalChainWeight(quota=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", upload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", server=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", polling=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", download=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551250Ljf(int i) {
        this.LIZ = 1;
        this.LIZIZ = 1;
        this.LIZJ = 1;
        this.LIZLLL = 95;
        this.LJ = 2;
    }
}

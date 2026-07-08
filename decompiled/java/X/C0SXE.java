package X;

/* JADX INFO: renamed from: X.0SXE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXE {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SXE)) {
            return false;
        }
        C0SXE c0sxe = (C0SXE) obj;
        return this.LIZ == c0sxe.LIZ && this.LIZIZ == c0sxe.LIZIZ && this.LIZJ == c0sxe.LIZJ && this.LIZLLL == c0sxe.LIZLLL && this.LJ == c0sxe.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingBounds(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", visibleTop=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SXE(int i, int i2, int i3, int i4, int i5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
    }
}

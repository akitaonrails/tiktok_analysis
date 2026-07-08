package X;

/* JADX INFO: renamed from: X.0tv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683880tv8 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InsetsValues(left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683880tv8)) {
            return false;
        }
        C1683880tv8 c1683880tv8 = (C1683880tv8) obj;
        if (this.LIZ == c1683880tv8.LIZ && this.LIZIZ == c1683880tv8.LIZIZ && this.LIZJ == c1683880tv8.LIZJ && this.LIZLLL == c1683880tv8.LIZLLL) {
            return true;
        }
        return false;
    }

    public C1683880tv8(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}

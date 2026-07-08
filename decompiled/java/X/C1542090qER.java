package X;

/* JADX INFO: renamed from: X.0qER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542090qER {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1542090qER)) {
            return false;
        }
        C1542090qER c1542090qER = (C1542090qER) obj;
        return this.LIZ == c1542090qER.LIZ && this.LIZIZ == c1542090qER.LIZIZ && this.LIZJ == c1542090qER.LIZJ && this.LIZLLL == c1542090qER.LIZLLL && this.LJ == c1542090qER.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConfigurationScreenSize(widthDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", heightDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", widthPx=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", heightPx=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", orientation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1542090qER(int i, int i2, int i3, int i4, int i5) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
    }
}

package X;

/* JADX INFO: renamed from: X.14L4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14L4 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14L4)) {
            return false;
        }
        C14L4 c14l4 = (C14L4) obj;
        return this.LIZ == c14l4.LIZ && this.LIZIZ == c14l4.LIZIZ && this.LIZJ == c14l4.LIZJ && this.LIZLLL == c14l4.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlexLine(startIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mainSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", crossSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C14L4(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}

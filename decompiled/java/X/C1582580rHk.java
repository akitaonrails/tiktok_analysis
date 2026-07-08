package X;

/* JADX INFO: renamed from: X.0rHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582580rHk implements InterfaceC1170390gYv {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C1582580rHk() {
        this(0, 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582580rHk)) {
            return false;
        }
        C1582580rHk c1582580rHk = (C1582580rHk) obj;
        return this.LIZ == c1582580rHk.LIZ && this.LIZIZ == c1582580rHk.LIZIZ && this.LIZJ == c1582580rHk.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HugContent(minLabelWidthDp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxLabelWidthDp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minContainerWidthDp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1582580rHk(int i, int i2, int i3) {
        int i4;
        i = (i3 & 1) != 0 ? 32 : i;
        if ((i3 & 2) != 0) {
            i4 = 208;
        } else {
            i4 = 0;
        }
        i2 = (i3 & 4) != 0 ? 0 : i2;
        this.LIZ = i;
        this.LIZIZ = i4;
        this.LIZJ = i2;
    }
}

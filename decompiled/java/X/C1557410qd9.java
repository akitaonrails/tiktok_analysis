package X;

/* JADX INFO: renamed from: X.0qd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557410qd9 implements InterfaceC1557660qdY {
    public final int LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557410qd9)) {
            return false;
        }
        C1557410qd9 c1557410qd9 = (C1557410qd9) obj;
        return this.LIZ == c1557410qd9.LIZ && this.LIZIZ == c1557410qd9.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Scroll(dx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557410qd9(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}

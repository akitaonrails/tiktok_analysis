package X;

/* JADX INFO: renamed from: X.0qd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557400qd8 implements InterfaceC1557660qdY {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557400qd8)) {
            return false;
        }
        C1557400qd8 c1557400qd8 = (C1557400qd8) obj;
        return this.LIZ == c1557400qd8.LIZ && this.LIZIZ == c1557400qd8.LIZIZ && this.LIZJ == c1557400qd8.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollStateChanged(newState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastDx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", lastDy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1557400qd8(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}

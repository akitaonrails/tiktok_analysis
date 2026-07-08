package X;

/* JADX INFO: renamed from: X.07bF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1893107bF implements InterfaceC871310YGb {
    public final long LJIIIZ;
    public final long LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1893107bF)) {
            return false;
        }
        C1893107bF c1893107bF = (C1893107bF) obj;
        return this.LJIIIZ == c1893107bF.LJIIIZ && this.LJIIJ == c1893107bF.LJIIJ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LJIIIZ) * 31) + C786410Ut5.Y2(this.LJIIJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InvalidSessionAccess(expectedUid=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", actualUid=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1893107bF(long j, long j2) {
        this.LJIIIZ = j;
        this.LJIIJ = j2;
    }
}

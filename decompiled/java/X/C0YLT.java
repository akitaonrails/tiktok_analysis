package X;

/* JADX INFO: renamed from: X.0YLT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YLT implements InterfaceC871310YGb {
    public final int LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YLT)) {
            return false;
        }
        C0YLT c0ylt = (C0YLT) obj;
        return this.LJIIIZ == c0ylt.LJIIIZ && this.LJIIJ == c0ylt.LJIIJ && this.LJIIJJI == c0ylt.LJIIJJI;
    }

    public final int hashCode() {
        return (((this.LJIIIZ * 31) + this.LJIIJ) * 31) + C786410Ut5.Z2(this.LJIIJJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TokenInvalid(imcmd=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", isWebSocket=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YLT(int i, int i2, boolean z) {
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = z;
    }
}

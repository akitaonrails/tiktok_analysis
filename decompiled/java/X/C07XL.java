package X;

/* JADX INFO: renamed from: X.07XL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XL implements InterfaceC2011507uL {
    public final boolean LL;

    public C07XL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07XL) && this.LL == ((C07XL) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowCamera(isShown=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07XL(int i) {
        this.LL = false;
    }
}

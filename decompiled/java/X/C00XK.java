package X;

/* JADX INFO: renamed from: X.00XK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XK implements InterfaceC0148002o {
    public final boolean LL;

    public C00XK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00XK) && this.LL == ((C00XK) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeFeedInteractState(hasClosed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00XK(int i) {
        this.LL = false;
    }
}

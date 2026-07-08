package X;

/* JADX INFO: renamed from: X.0c1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995730c1D implements InterfaceC0148002o {
    public final int LL;

    public C995730c1D() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C995730c1D) && this.LL == ((C995730c1D) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecorationBottomBarHeightState(heightPx=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995730c1D(int i) {
        this.LL = i;
    }
}

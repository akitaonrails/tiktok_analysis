package X;

/* JADX INFO: renamed from: X.004n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199004n implements InterfaceC0148002o {
    public final int LL;

    public C0199004n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0199004n) && this.LL == ((C0199004n) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiSlashHeaderLayoutState(placeholder=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0199004n(int i) {
        this.LL = 0;
    }
}

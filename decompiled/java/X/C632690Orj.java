package X;

/* JADX INFO: renamed from: X.0Orj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632690Orj implements InterfaceC0148002o {
    public final int LL;

    public C632690Orj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C632690Orj) && this.LL == ((C632690Orj) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpotlightState(itemWidth=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C632690Orj(int i) {
        this.LL = i;
    }
}

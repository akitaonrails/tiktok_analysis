package X;

/* JADX INFO: renamed from: X.0HXM, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXM implements InterfaceC0148002o {
    public final boolean LL;

    public C0HXM() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HXM) && this.LL == ((C0HXM) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationServicesState(isGranted=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HXM(boolean z) {
        this.LL = z;
    }
}

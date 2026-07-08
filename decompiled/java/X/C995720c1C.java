package X;

/* JADX INFO: renamed from: X.0c1C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995720c1C implements InterfaceC0148002o {
    public final boolean LL;

    public C995720c1C() {
        this(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C995720c1C) && this.LL == ((C995720c1C) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MuteState(isMuted=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C995720c1C(boolean z) {
        this.LL = z;
    }
}

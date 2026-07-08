package X;

/* JADX INFO: renamed from: X.00XF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XF implements InterfaceC0148002o {
    public final boolean LL;

    public C00XF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00XF) && this.LL == ((C00XF) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostAffinityState(showAffinityScore=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00XF(int i) {
        this.LL = false;
    }
}

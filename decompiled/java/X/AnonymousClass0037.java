package X;

/* JADX INFO: renamed from: X.0037, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0037 implements InterfaceC0148002o {
    public final boolean LL;

    public AnonymousClass0037() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0037) && this.LL == ((AnonymousClass0037) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentExposureVMState(init=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0037(int i) {
        this.LL = false;
    }
}

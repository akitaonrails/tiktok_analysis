package X;

/* JADX INFO: renamed from: X.0RJW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJW implements InterfaceC0148002o {
    public final int LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0RJW) && this.LL == ((C0RJW) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConstraintSizeState(scrollRating=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RJW(int i) {
        this.LL = i;
    }
}

package X;

/* JADX INFO: renamed from: X.004p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201004p implements InterfaceC0148002o {
    public final int LL;

    public C0201004p() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0201004p) && this.LL == ((C0201004p) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoTemplateButtonState(cnt=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0201004p(int i) {
        this.LL = -1;
    }
}

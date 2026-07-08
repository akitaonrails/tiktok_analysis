package X;

/* JADX INFO: renamed from: X.06aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1635106aj implements InterfaceC0148002o {
    public final C0ZL4 LL;

    public C1635106aj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1635106aj) && this.LL == ((C1635106aj) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LongPressPanelTypeState(panelType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1635106aj(int i) {
        this(C0ZL4.FULL);
    }

    public C1635106aj(C0ZL4 c0zl4) {
        this.LL = c0zl4;
    }
}

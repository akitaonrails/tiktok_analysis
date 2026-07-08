package X;

/* JADX INFO: renamed from: X.0zBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886520zBy implements InterfaceC0148002o {
    public final EnumC1886530zBz LL;

    public C1886520zBy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1886520zBy) && this.LL == ((C1886520zBy) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PasskeyCreateState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1886520zBy(int i) {
        this(EnumC1886530zBz.READY);
    }

    public C1886520zBy(EnumC1886530zBz enumC1886530zBz) {
        this.LL = enumC1886530zBz;
    }
}

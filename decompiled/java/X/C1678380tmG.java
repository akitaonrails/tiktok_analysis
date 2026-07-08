package X;

/* JADX INFO: renamed from: X.0tmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678380tmG implements InterfaceC0148002o {
    public final EnumC1888140zEa LL;

    public C1678380tmG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1678380tmG) && this.LL == ((C1678380tmG) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GoPasswordlessVMState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1678380tmG(int i) {
        this(EnumC1888140zEa.BASE_PAGE);
    }

    public C1678380tmG(EnumC1888140zEa enumC1888140zEa) {
        this.LL = enumC1888140zEa;
    }
}

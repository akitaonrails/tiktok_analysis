package X;

/* JADX INFO: renamed from: X.09hg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2442609hg implements InterfaceC0148002o {
    public final EnumC2442709hh LL;

    public C2442609hg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2442609hg) && this.LL == ((C2442609hg) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTopIABReviewState(reviewResult=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2442609hg(int i) {
        this(EnumC2442709hh.UNKNOWN);
    }

    public C2442609hg(EnumC2442709hh enumC2442709hh) {
        this.LL = enumC2442709hh;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158550gFp implements InterfaceC0148002o {
    public final AbstractC1158530gFn LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    public C1158550gFp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158550gFp) && Intrinsics.LJFF(this.LL, ((C1158550gFp) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceSkuVMState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158550gFp(AbstractC1158530gFn abstractC1158530gFn) {
        this.LL = abstractC1158530gFn;
        this.LLILLJJLI = C452501pT.LIZIZ(new C1158570gFr(this));
        this.LLILLL = C452501pT.LIZIZ(new C1158560gFq(this));
    }

    public /* synthetic */ C1158550gFp(int i) {
        this(new AbstractC1158530gFn() { // from class: X.0gFm
        });
    }
}

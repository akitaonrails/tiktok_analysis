package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158840gGI implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1770110wAD> LL;

    public C1158840gGI() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158840gGI) && Intrinsics.LJFF(this.LL, ((C1158840gGI) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcVideoGuideState(ecomVideoGuideConfig=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1158840gGI(int i) {
        this(C491101vh.LIZ);
    }

    public C1158840gGI(AbstractC1623806Xk<C1770110wAD> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}

package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SXx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C723070SXx implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C722990SXp> LL;

    public C723070SXx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C723070SXx) && Intrinsics.LJFF(this.LL, ((C723070SXx) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixBottomBarState(preloadedEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C723070SXx(int i) {
        this(C491101vh.LIZ);
    }

    public C723070SXx(AbstractC1623806Xk<C722990SXp> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}

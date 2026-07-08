package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159010gGZ implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1770220wAO> LL;

    public C1159010gGZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1159010gGZ) && Intrinsics.LJFF(this.LL, ((C1159010gGZ) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchNoCartFeedVideoGuideState(config=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159010gGZ(int i) {
        this(C491101vh.LIZ);
    }

    public C1159010gGZ(AbstractC1623806Xk<C1770220wAO> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}

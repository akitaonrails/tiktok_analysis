package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OLE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OLE implements InterfaceC0148002o {
    public final C0OLG LL;

    public C0OLE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0OLE) && Intrinsics.LJFF(this.LL, ((C0OLE) obj).LL);
    }

    public final int hashCode() {
        C0OLG c0olg = this.LL;
        if (c0olg == null) {
            return 0;
        }
        return c0olg.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollToVMState(scrollToEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OLE(int i) {
        this.LL = null;
    }
}

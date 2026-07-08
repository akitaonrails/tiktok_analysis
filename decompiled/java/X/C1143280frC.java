package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0frC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143280frC implements InterfaceC0148002o {
    public final C1123320fL0<InterfaceC1151250g43, InterfaceC1121530fI7> LL;

    public C1143280frC() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1143280frC) && Intrinsics.LJFF(this.LL, ((C1143280frC) obj).LL);
    }

    public final int hashCode() {
        C1123320fL0<InterfaceC1151250g43, InterfaceC1121530fI7> c1123320fL0 = this.LL;
        if (c1123320fL0 == null) {
            return 0;
        }
        return c1123320fL0.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelTouchPointState(tpData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1143280frC(C1123320fL0<InterfaceC1151250g43, InterfaceC1121530fI7> c1123320fL0) {
        this.LL = c1123320fL0;
    }
}

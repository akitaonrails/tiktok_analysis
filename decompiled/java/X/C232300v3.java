package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00v3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C232300v3 implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;

    public C232300v3() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C232300v3) && Intrinsics.LJFF(this.LL, ((C232300v3) obj).LL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdProductTileState(showView=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C232300v3(C291001Au<Unit> c291001Au) {
        this.LL = c291001Au;
    }
}

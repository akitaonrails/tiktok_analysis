package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06e0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1655406e0 implements InterfaceC0148002o {
    public final C291001Au<C0YMW> LL;
    public final C291001Au<Unit> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655406e0)) {
            return false;
        }
        C1655406e0 c1655406e0 = (C1655406e0) obj;
        return Intrinsics.LJFF(this.LL, c1655406e0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1655406e0.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MockedConvVMState(createGroupFailEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", groupLeaveEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1655406e0(C291001Au<? extends C0YMW> c291001Au, C291001Au<Unit> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }

    public static C1655406e0 LIZ(C1655406e0 c1655406e0, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1655406e0.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1655406e0.LLILLJJLI;
        }
        c1655406e0.getClass();
        return new C1655406e0(c291001Au, c291001Au2);
    }
}

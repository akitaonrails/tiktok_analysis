package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224060hxU implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C1224590hyL LLILLJJLI;
    public final C1224590hyL LLILLL;
    public final C291001Au<Boolean> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224060hxU)) {
            return false;
        }
        C1224060hxU c1224060hxU = (C1224060hxU) obj;
        return Intrinsics.LJFF(this.LL, c1224060hxU.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1224060hxU.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1224060hxU.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1224060hxU.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorConfirmWidgetVMState(initWidgetEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mainButtonState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", secondButtonState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateWidgetVisibilityEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1224060hxU(C291001Au<Unit> c291001Au, C1224590hyL c1224590hyL, C1224590hyL c1224590hyL2, C291001Au<Boolean> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c1224590hyL;
        this.LLILLL = c1224590hyL2;
        this.LLILZ = c291001Au2;
    }

    public static C1224060hxU LIZ(C1224060hxU c1224060hxU, C291001Au c291001Au, C1224590hyL c1224590hyL, C1224590hyL c1224590hyL2, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1224060hxU.LL;
        }
        if ((i & 2) != 0) {
            c1224590hyL = c1224060hxU.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1224590hyL2 = c1224060hxU.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c1224060hxU.LLILZ;
        }
        c1224060hxU.getClass();
        return new C1224060hxU(c291001Au, c1224590hyL, c1224590hyL2, c291001Au2);
    }
}

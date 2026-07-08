package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158980gGW implements InterfaceC0148002o {
    public final boolean LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158980gGW)) {
            return false;
        }
        C1158980gGW c1158980gGW = (C1158980gGW) obj;
        return this.LL == c1158980gGW.LL && Intrinsics.LJFF(this.LLILLJJLI, c1158980gGW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1158980gGW.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorContentPageContainerVMState(canScrollUp=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentListRefreshSuccessEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", contactSelectorStateUpdateEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158980gGW(C291001Au c291001Au, C291001Au c291001Au2, boolean z) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }

    public static C1158980gGW LIZ(C1158980gGW c1158980gGW, boolean z, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            z = c1158980gGW.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1158980gGW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1158980gGW.LLILLL;
        }
        c1158980gGW.getClass();
        return new C1158980gGW(c291001Au, c291001Au2, z);
    }
}

package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Znr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910570Znr implements InterfaceC0148002o {
    public final List<C910680Zo2> LL;
    public final boolean LLILLJJLI;

    public C910570Znr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910570Znr)) {
            return false;
        }
        C910570Znr c910570Znr = (C910570Znr) obj;
        return Intrinsics.LJFF(this.LL, c910570Znr.LL) && this.LLILLJJLI == c910570Znr.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnreadIndicatorVMState(uiStateList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isShown=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C910570Znr(int i) {
        this(C13BV.INSTANCE, false);
    }

    public C910570Znr(List<C910680Zo2> list, boolean z) {
        this.LL = list;
        this.LLILLJJLI = z;
    }

    public static C910570Znr LIZ(C910570Znr c910570Znr, List list) {
        boolean z = c910570Znr.LLILLJJLI;
        c910570Znr.getClass();
        return new C910570Znr(list, z);
    }
}

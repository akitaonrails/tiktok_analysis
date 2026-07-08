package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158960gGU implements InterfaceC0148002o {
    public final List<InterfaceC1891350zJl> LL;
    public final int LLILLJJLI;
    public final C291001Au<C1160480gIw> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158960gGU)) {
            return false;
        }
        C1158960gGU c1158960gGU = (C1158960gGU) obj;
        return Intrinsics.LJFF(this.LL, c1158960gGU.LL) && this.LLILLJJLI == c1158960gGU.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1158960gGU.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        C291001Au<C1160480gIw> c291001Au = this.LLILLL;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowingInnerSkylightState(allUserList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", currentSelectedIndex=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", removeItemState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158960gGU() {
        this(C13BV.INSTANCE, -1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158960gGU(List<? extends InterfaceC1891350zJl> list, int i, C291001Au<C1160480gIw> c291001Au) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = c291001Au;
    }
}

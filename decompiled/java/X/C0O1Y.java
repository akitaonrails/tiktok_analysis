package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1Y implements InterfaceC636340Oxc<C0O1Y, InterfaceC1891350zJl> {
    public final C291001Au<Boolean> LL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C0O1Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O1Y)) {
            return false;
        }
        C0O1Y c0o1y = (C0O1Y) obj;
        return Intrinsics.LJFF(this.LL, c0o1y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0o1y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0o1y.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeInnerFlowCommentListVMState(init=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasComment=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C0O1Y(int i) {
        this(null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C0O1Y(C291001Au c291001Au, C291001Au c291001Au2, C627660Ojc c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = c627660Ojc;
        this.LLILLL = c291001Au2;
    }
}

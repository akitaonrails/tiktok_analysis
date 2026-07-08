package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326310Cqj implements InterfaceC636340Oxc<C326310Cqj, C751680TeA> {
    public final AbstractC1623806Xk<Boolean> LL;
    public final C627660Ojc<C751680TeA> LLILLJJLI;

    public C326310Cqj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C326310Cqj)) {
            return false;
        }
        C326310Cqj c326310Cqj = (C326310Cqj) obj;
        return Intrinsics.LJFF(this.LL, c326310Cqj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c326310Cqj.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveModeratorState(isEmptyList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C751680TeA> getListItemState() {
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
    public final C627660Ojc<C751680TeA> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C326310Cqj(int i) {
        this(C491101vh.LIZ, new C627660Ojc(null, null, null, null, 15));
    }

    public C326310Cqj(AbstractC1623806Xk<Boolean> abstractC1623806Xk, C627660Ojc<C751680TeA> c627660Ojc) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c627660Ojc;
    }

    public static C326310Cqj LIZ(C326310Cqj c326310Cqj, AbstractC1623806Xk abstractC1623806Xk, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c326310Cqj.LL;
        }
        if ((i & 2) != 0) {
            c627660Ojc = c326310Cqj.LLILLJJLI;
        }
        c326310Cqj.getClass();
        return new C326310Cqj(abstractC1623806Xk, c627660Ojc);
    }
}

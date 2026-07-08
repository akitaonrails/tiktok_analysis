package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hoh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218610hoh implements InterfaceC636340Oxc<C1218610hoh, AbstractC1223800hx4> {
    public final C627660Ojc<AbstractC1223800hx4> LL;
    public final C291001Au<C1222560hv4> LLILLJJLI;
    public final List<C1224760hyc> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218610hoh)) {
            return false;
        }
        C1218610hoh c1218610hoh = (C1218610hoh) obj;
        return Intrinsics.LJFF(this.LL, c1218610hoh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218610hoh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218610hoh.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        List<C1224760hyc> list = this.LLILLL;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorTabContactListVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scrollToPositionEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", headersState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<AbstractC1223800hx4> getListItemState() {
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
    public final C627660Ojc<AbstractC1223800hx4> getListState() {
        return this.LL;
    }

    public C1218610hoh(C291001Au c291001Au, C627660Ojc c627660Ojc, List list) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = list;
    }

    public static C1218610hoh LIZ(C1218610hoh c1218610hoh, C627660Ojc c627660Ojc, C291001Au c291001Au, List list, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1218610hoh.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1218610hoh.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            list = c1218610hoh.LLILLL;
        }
        c1218610hoh.getClass();
        return new C1218610hoh(c291001Au, c627660Ojc, list);
    }
}

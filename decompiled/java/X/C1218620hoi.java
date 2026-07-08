package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218620hoi implements InterfaceC636340Oxc<C1218620hoi, AbstractC1223800hx4> {
    public final C627660Ojc<AbstractC1223800hx4> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Integer> LLILLL;

    public C1218620hoi() {
        this(7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218620hoi)) {
            return false;
        }
        C1218620hoi c1218620hoi = (C1218620hoi) obj;
        return Intrinsics.LJFF(this.LL, c1218620hoi.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1218620hoi.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1218620hoi.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Unit> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Integer> c291001Au2 = this.LLILLL;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorSearchPageVMState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scrollStateChangeEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", scrollToPositionEvent=");
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

    public /* synthetic */ C1218620hoi(int i, C627660Ojc c627660Ojc) {
        this(null, null, (i & 1) != 0 ? new C627660Ojc(null, null, null, null, 15) : c627660Ojc);
    }

    public C1218620hoi(C291001Au c291001Au, C291001Au c291001Au2, C627660Ojc c627660Ojc) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }

    public static C1218620hoi LIZ(C1218620hoi c1218620hoi, C627660Ojc c627660Ojc, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1218620hoi.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1218620hoi.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1218620hoi.LLILLL;
        }
        c1218620hoi.getClass();
        return new C1218620hoi(c291001Au, c291001Au2, c627660Ojc);
    }
}

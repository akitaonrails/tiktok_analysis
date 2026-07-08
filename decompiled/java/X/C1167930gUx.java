package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167930gUx implements InterfaceC636340Oxc<C1167930gUx, C1167940gUy> {
    public final C627660Ojc<C1167940gUy> LL;
    public final AbstractC1623806Xk<Unit> LLILLJJLI;
    public final AbstractC1623806Xk<Unit> LLILLL;
    public final C291001Au<Unit> LLILZ;

    public C1167930gUx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1167930gUx)) {
            return false;
        }
        C1167930gUx c1167930gUx = (C1167930gUx) obj;
        return Intrinsics.LJFF(this.LL, c1167930gUx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1167930gUx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1167930gUx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1167930gUx.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZ;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManagePlaylistState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadNewlyCreatedPlaylistAction=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", commitPlaylistReorderAction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", checkListSizeEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1167940gUy> getListItemState() {
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
    public final C627660Ojc<C1167940gUy> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1167930gUx(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, c491101vh, null);
    }

    public C1167930gUx(C627660Ojc<C1167940gUy> c627660Ojc, AbstractC1623806Xk<Unit> abstractC1623806Xk, AbstractC1623806Xk<Unit> abstractC1623806Xk2, C291001Au<Unit> c291001Au) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = abstractC1623806Xk2;
        this.LLILZ = c291001Au;
    }

    public static C1167930gUx LIZ(C1167930gUx c1167930gUx, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1167930gUx.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1167930gUx.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk2 = c1167930gUx.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c1167930gUx.LLILZ;
        }
        c1167930gUx.getClass();
        return new C1167930gUx(c627660Ojc, abstractC1623806Xk, abstractC1623806Xk2, c291001Au);
    }
}

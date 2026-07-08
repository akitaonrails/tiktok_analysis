package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hRx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204510hRx implements InterfaceC636340Oxc<C1204510hRx, InterfaceC1204490hRv> {
    public final C627660Ojc<InterfaceC1204490hRv> LL;
    public final AbstractC1623806Xk<C1204080hRG> LLILLJJLI;
    public final C1203960hR4 LLILLL;
    public final AbstractC1623806Xk<C1204080hRG> LLILZ;

    public C1204510hRx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1204510hRx)) {
            return false;
        }
        C1204510hRx c1204510hRx = (C1204510hRx) obj;
        return Intrinsics.LJFF(this.LL, c1204510hRx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1204510hRx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1204510hRx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1204510hRx.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C1203960hR4 c1203960hR4 = this.LLILLL;
        return ((iHashCode + (c1203960hR4 == null ? 0 : c1203960hR4.hashCode())) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyFeedState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadMoreAsync=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageLoadTracker=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", preloadAndRefresh=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1204490hRv> getListItemState() {
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
    public final C627660Ojc<InterfaceC1204490hRv> getListState() {
        return this.LL;
    }

    public /* synthetic */ C1204510hRx(int i) {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c627660Ojc, c491101vh, null, c491101vh);
    }

    public C1204510hRx(C627660Ojc<InterfaceC1204490hRv> c627660Ojc, AbstractC1623806Xk<C1204080hRG> abstractC1623806Xk, C1203960hR4 c1203960hR4, AbstractC1623806Xk<C1204080hRG> abstractC1623806Xk2) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = c1203960hR4;
        this.LLILZ = abstractC1623806Xk2;
    }

    public static C1204510hRx LIZ(C1204510hRx c1204510hRx, C627660Ojc c627660Ojc, AbstractC1623806Xk abstractC1623806Xk, C1203960hR4 c1203960hR4, C1623606Xi c1623606Xi, int i) {
        if ((i & 1) != 0) {
            c627660Ojc = c1204510hRx.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk = c1204510hRx.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1203960hR4 = c1204510hRx.LLILLL;
        }
        AbstractC1623806Xk<C1204080hRG> abstractC1623806Xk2 = c1623606Xi;
        if ((i & 8) != 0) {
            abstractC1623806Xk2 = c1204510hRx.LLILZ;
        }
        c1204510hRx.getClass();
        return new C1204510hRx(c627660Ojc, abstractC1623806Xk, c1203960hR4, abstractC1623806Xk2);
    }
}

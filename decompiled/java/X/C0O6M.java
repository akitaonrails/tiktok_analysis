package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O6M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O6M implements InterfaceC636340Oxc<C0O6M, C0O6P> {
    public final C627660Ojc<C0O6P> LL;
    public final C291001Au<Integer> LLILLJJLI;

    public C0O6M() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O6M)) {
            return false;
        }
        C0O6M c0o6m = (C0O6M) obj;
        return Intrinsics.LJFF(this.LL, c0o6m.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0o6m.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Integer> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaylistCollectionState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scrollToPositionEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C0O6P> getListItemState() {
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
    public final C627660Ojc<C0O6P> getListState() {
        return this.LL;
    }

    public /* synthetic */ C0O6M(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C0O6M(C291001Au c291001Au, C627660Ojc c627660Ojc) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c291001Au;
    }
}

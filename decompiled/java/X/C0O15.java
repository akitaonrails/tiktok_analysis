package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O15, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O15 implements InterfaceC636340Oxc<C0O15, C607950Nsv> {
    public final C291001Au<Integer> LL;
    public final C627660Ojc<C607950Nsv> LLILLJJLI;

    public C0O15() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O15)) {
            return false;
        }
        C0O15 c0o15 = (C0O15) obj;
        return Intrinsics.LJFF(this.LL, c0o15.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0o15.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<Integer> c291001Au = this.LL;
        return ((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovieVideoListState(scrollToPositionEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C607950Nsv> getListItemState() {
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
    public final C627660Ojc<C607950Nsv> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C0O15(int i) {
        this(null, new C627660Ojc(null, null, null, null, 15));
    }

    public C0O15(C291001Au<Integer> c291001Au, C627660Ojc<C607950Nsv> c627660Ojc) {
        this.LL = c291001Au;
        this.LLILLJJLI = c627660Ojc;
    }
}

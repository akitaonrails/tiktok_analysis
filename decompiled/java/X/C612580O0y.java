package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612580O0y implements InterfaceC636340Oxc<C612580O0y, C607730NsZ> {
    public final String LL;
    public final C627660Ojc<C607730NsZ> LLILLJJLI;

    public C612580O0y() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C612580O0y)) {
            return false;
        }
        C612580O0y c612580O0y = (C612580O0y) obj;
        return Intrinsics.LJFF(this.LL, c612580O0y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c612580O0y.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowInnerFeedState(uid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C607730NsZ> getListItemState() {
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
    public final C627660Ojc<C607730NsZ> getListState() {
        return this.LLILLJJLI;
    }

    public /* synthetic */ C612580O0y(String str, int i) {
        this((i & 1) != 0 ? null : str, (C627660Ojc<C607730NsZ>) ((i & 2) != 0 ? new C627660Ojc(null, null, null, null, 15) : null));
    }

    public C612580O0y(String str, C627660Ojc<C607730NsZ> c627660Ojc) {
        this.LL = str;
        this.LLILLJJLI = c627660Ojc;
    }
}

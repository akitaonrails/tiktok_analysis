package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325970CqB implements InterfaceC636340Oxc<C325970CqB, C0OAT> {
    public final C627660Ojc<C0OAT> LL;

    public C325970CqB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C325970CqB) && Intrinsics.LJFF(this.LL, ((C325970CqB) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicSearchDetailState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C0OAT> getListItemState() {
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
    public final C627660Ojc<C0OAT> getListState() {
        return this.LL;
    }

    public /* synthetic */ C325970CqB(int i) {
        this((C627660Ojc<C0OAT>) new C627660Ojc(null, null, null, null, 15));
    }

    public C325970CqB(C627660Ojc<C0OAT> c627660Ojc) {
        this.LL = c627660Ojc;
    }
}

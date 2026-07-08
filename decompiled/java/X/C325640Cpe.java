package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325640Cpe implements InterfaceC636340Oxc<C325640Cpe, C0OAT> {
    public final C627660Ojc<C0OAT> LL;
    public final boolean LLILLJJLI;

    public C325640Cpe() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C325640Cpe)) {
            return false;
        }
        C325640Cpe c325640Cpe = (C325640Cpe) obj;
        return Intrinsics.LJFF(this.LL, c325640Cpe.LL) && this.LLILLJJLI == c325640Cpe.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MovieFavoriteListState(listState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LLILLJJLI);
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

    public /* synthetic */ C325640Cpe(int i) {
        this(new C627660Ojc(null, null, null, null, 15), true);
    }

    public C325640Cpe(C627660Ojc<C0OAT> c627660Ojc, boolean z) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = z;
    }
}

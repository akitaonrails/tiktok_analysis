package X;

import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q9X, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q9X implements InterfaceC636340Oxc<C0Q9X, InterfaceC1891350zJl> {
    public final C0Q9U LL;
    public final SearchApiResult LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C627660Ojc<InterfaceC1891350zJl> LLILZ;

    public C0Q9X() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q9X)) {
            return false;
        }
        C0Q9X c0q9x = (C0Q9X) obj;
        return Intrinsics.LJFF(this.LL, c0q9x.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0q9x.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0q9x.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0q9x.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        SearchApiResult searchApiResult = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (searchApiResult == null ? 0 : searchApiResult.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLL;
        return ((iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCardListState(searchPageStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", searchCommonParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showNetworkToast=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC1891350zJl> getListItemState() {
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
    public final C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.LLILZ;
    }

    public /* synthetic */ C0Q9X(int i) {
        this(new C0Q9U(C0Q9S.DEFAULT, null, null, false, 14), null, null, new C627660Ojc(null, null, null, null, 15));
    }

    public C0Q9X(C0Q9U c0q9u, SearchApiResult searchApiResult, C291001Au<Boolean> c291001Au, C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        this.LL = c0q9u;
        this.LLILLJJLI = searchApiResult;
        this.LLILLL = c291001Au;
        this.LLILZ = c627660Ojc;
    }

    public static C0Q9X LIZ(C0Q9X c0q9x, C0Q9U c0q9u, SearchMix searchMix, C291001Au c291001Au, C627660Ojc c627660Ojc, int i) {
        if ((i & 1) != 0) {
            c0q9u = c0q9x.LL;
        }
        SearchApiResult searchApiResult = searchMix;
        if ((i & 2) != 0) {
            searchApiResult = c0q9x.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c0q9x.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc = c0q9x.LLILZ;
        }
        c0q9x.getClass();
        return new C0Q9X(c0q9u, searchApiResult, c291001Au, c627660Ojc);
    }
}

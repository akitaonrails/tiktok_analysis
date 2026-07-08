package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.fragment.SearchTabFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PZD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PZD implements InterfaceC111300bX {
    public final SearchResultParam LL;
    public final C19EG LLILLJJLI;
    public final SearchTabFragment LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PZD)) {
            return false;
        }
        C0PZD c0pzd = (C0PZD) obj;
        return Intrinsics.LJFF(this.LL, c0pzd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pzd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pzd.LLILLL) && this.LLILZ == c0pzd.LLILZ;
    }

    public final int hashCode() {
        SearchResultParam searchResultParam = this.LL;
        int iHashCode = (searchResultParam == null ? 0 : searchResultParam.hashCode()) * 31;
        C19EG c19eg = this.LLILLJJLI;
        return ((((iHashCode + (c19eg != null ? c19eg.hashCode() : 0)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchFragmentData(resultParam=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", activity=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", fragment=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PZD(SearchResultParam searchResultParam, C19EG c19eg, SearchTabFragment searchTabFragment, int i) {
        this.LL = searchResultParam;
        this.LLILLJJLI = c19eg;
        this.LLILLL = searchTabFragment;
        this.LLILZ = i;
    }
}

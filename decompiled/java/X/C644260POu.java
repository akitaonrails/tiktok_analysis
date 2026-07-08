package X;

import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;

/* JADX INFO: renamed from: X.0POu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644260POu extends AbstractCallableC643890PNj {
    public final SearchRequestParam LLILLL;
    public final /* synthetic */ C0PNQ LLILZ;

    @Override // X.AbstractCallableC643890PNj
    public final Object LIZIZ() {
        SearchApi searchApi = SearchApi.LIZ;
        SearchRequestParam searchRequestParam = this.LLILLL;
        searchApi.getClass();
        return SearchApi.LIZIZ(searchRequestParam);
    }

    public C644260POu(C0PNQ c0pnq, SearchRequestParam searchRequestParam) {
        this.LLILZ = c0pnq;
        this.LLILLL = searchRequestParam;
    }
}

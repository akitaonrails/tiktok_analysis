package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0PPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644400PPi extends AbstractCallableC643890PNj {
    public final SearchRequestParam LLILLL;
    public final /* synthetic */ C0PNK LLILZ;

    @Override // X.AbstractCallableC643890PNj
    public final Object LIZIZ() {
        SearchApi searchApi = SearchApi.LIZ;
        SearchRequestParam searchRequestParam = this.LLILLL;
        searchApi.getClass();
        try {
            return SearchApi.LIZ().searchChallengeList(searchRequestParam.cursor, searchRequestParam.keyword, searchRequestParam.enterFrom, searchRequestParam.count, searchRequestParam.hotSearch, "challenge", searchRequestParam.searchSource, searchRequestParam.searchId, searchRequestParam.lastSearchId, searchRequestParam.correctType, searchRequestParam.searchContext, searchRequestParam.personalContextInfo, searchRequestParam.isNonPersonalizedSearch, searchRequestParam.sugGenerateType, searchRequestParam.searchSessionId, searchRequestParam.endToEndSearchSessionId, searchRequestParam.LIZJ).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }

    public C644400PPi(C0PNK c0pnk, SearchRequestParam searchRequestParam) {
        this.LLILZ = c0pnk;
        this.LLILLL = searchRequestParam;
    }
}

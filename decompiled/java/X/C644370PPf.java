package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApi;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0PPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C644370PPf extends AbstractCallableC643890PNj {
    public final SearchRequestParam LLILLL;
    public final /* synthetic */ C0PNM LLILZ;

    @Override // X.AbstractCallableC643890PNj
    public final Object LIZIZ() throws InterruptedException {
        LinkedHashMap<String, String> linkedHashMap;
        SearchApi searchApi = SearchApi.LIZ;
        SearchRequestParam searchRequestParam = this.LLILLL;
        searchApi.getClass();
        boolean zLJI = MethodIDManager.LJI(202197);
        try {
            SearchApi.RealApi realApiLIZ = SearchApi.LIZ();
            long j = searchRequestParam.cursor;
            String str = searchRequestParam.keyword;
            String str2 = searchRequestParam.enterFrom;
            int i = searchRequestParam.count;
            int i2 = searchRequestParam.hotSearch;
            String str3 = searchRequestParam.searchSource;
            String str4 = searchRequestParam.searchId;
            String str5 = searchRequestParam.lastSearchId;
            int i3 = searchRequestParam.correctType;
            String str6 = searchRequestParam.channel;
            String str7 = searchRequestParam.sugUserId;
            String str8 = searchRequestParam.isRichSug;
            String str9 = searchRequestParam.searchContext;
            C0PSG c0psg = searchRequestParam.LIZ;
            int i4 = !(c0psg != null ? c0psg.isDefaultOption() : true) ? 1 : 0;
            C0PSG c0psg2 = searchRequestParam.LIZ;
            if (c0psg2 == null || (linkedHashMap = c0psg2.userToFieldRequestMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            SearchUserList searchUserList = realApiLIZ.searchUserList(j, str, str2, i, 1, i2, str3, str4, str5, i3, str6, str7, str8, str9, i4, linkedHashMap, searchRequestParam.personalContextInfo, searchRequestParam.isNonPersonalizedSearch, searchRequestParam.sugGenerateType, searchRequestParam.searchSessionId, searchRequestParam.endToEndSearchSessionId, searchRequestParam.bcmChain, searchRequestParam.LIZJ).get();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return searchUserList;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            RuntimeException compatibleException = AbstractC2126608Uu.getCompatibleException(e);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            throw compatibleException;
        }
    }

    public C644370PPf(C0PNM c0pnm, SearchRequestParam searchRequestParam) {
        this.LLILZ = c0pnm;
        this.LLILLL = searchRequestParam;
    }
}

package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PNQ extends C0PN2<SearchLiveStruct, SearchLiveList> {
    public String LLJJIJIL;
    public String LLJJJ;

    @Override // X.C0PN2
    public final int LJIJ() {
        return 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((SearchLiveList) t).hasMore;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0PN2, X.AbstractC666100QAu
    /* JADX INFO: renamed from: LJJI, reason: merged with bridge method [inline-methods] */
    public final void handleData(SearchLiveList searchLiveList) {
        List<SearchLiveStruct> listLJI;
        boolean z;
        LogPbBean logPbBean;
        super.handleData(searchLiveList);
        if (searchLiveList != 0) {
            listLJI = searchLiveList.LJI();
        } else {
            listLJI = null;
        }
        if (searchLiveList != 0 && !C086I.LIZIZ(listLJI)) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!z) {
            for (SearchLiveStruct searchLiveStruct : listLJI) {
                if (searchLiveStruct.getLiveAweme() != null) {
                    searchLiveStruct.getLiveAweme().setRequestId(this.LLJILJILJ);
                    if (searchLiveList != 0) {
                        logPbBean = searchLiveList.logPb;
                    } else {
                        logPbBean = null;
                    }
                    searchLiveStruct.setLogPbBean(logPbBean);
                }
            }
            int i = this.mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    LJJIFFI(searchLiveList);
                    return;
                }
                return;
            } else {
                this.mData = searchLiveList;
                searchLiveList.LL = new ArrayList();
                LJIL(listLJI);
                ((SearchLiveList) this.mData).hasMore = true;
                return;
            }
        }
        if (this.mListQueryType == 1) {
            this.mData = searchLiveList;
            LJIIL();
        }
        T t = this.mData;
        if (t != 0) {
            ((SearchLiveList) t).hasMore = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJIFFI(SearchLiveList searchLiveList) {
        boolean z;
        getItems().size();
        LJIIJ(searchLiveList.LJI());
        T t = this.mData;
        SearchLiveList searchLiveList2 = (SearchLiveList) t;
        if (searchLiveList.hasMore && ((SearchLiveList) t).hasMore) {
            z = true;
        } else {
            z = false;
        }
        searchLiveList2.hasMore = z;
        ((SearchLiveList) t).cursor = searchLiveList.cursor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        long j;
        Integer num;
        String strLJIILIIL = LJIILIIL(objArr);
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((SearchLiveList) this.mData).cursor;
        }
        String str = this.LLJJI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.LLJJJ;
        if (str3 != null) {
            str2 = str3;
        }
        int i = this.LLJILJIL;
        String str4 = this.LLJILLL;
        String str5 = this.LLJJIJIIJIL;
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        SearchRequestParam searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str4, "", i, 0, str, str5, j, 20, str2, null, null, null, null, null, "", null, null, null, null, null, null, null, null, "", null, num, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, null, null, C2097608Jq.LJ());
        C644260POu c644260POu = new C644260POu(this, searchRequestParam);
        c644260POu.LLILLJJLI = searchRequestParam.LIZIZ;
        this.LLIZLLLIL = c644260POu;
        C1BVK.LIZIZ().LIZ(this.mHandler, c644260POu, 0);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        Integer num;
        String strLJIILIIL = LJIILIIL(objArr);
        String str = this.LLJJJ;
        if (str == null) {
            str = "";
        }
        int i = this.LLJILJIL;
        String str2 = this.LLJILLL;
        String str3 = this.LLJJIJIIJIL;
        String str4 = this.LLJJIJIL;
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        SearchRequestParam searchRequestParam = new SearchRequestParam(strLJIILIIL, 0, str2, "", i, 0, "", str3, 0L, 20, str, null, null, null, null, str4, "", null, null, null, null, null, null, null, null, "", null, num, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, null, null, C2097608Jq.LJ());
        C644260POu c644260POu = new C644260POu(this, searchRequestParam);
        c644260POu.LLILLJJLI = searchRequestParam.LIZIZ;
        this.LLIZLLLIL = c644260POu;
        C1BVK.LIZIZ().LIZ(this.mHandler, c644260POu, 0);
    }
}

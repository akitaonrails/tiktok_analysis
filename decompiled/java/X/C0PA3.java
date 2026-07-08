package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0PA3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PA3 {
    public static void LIZ(SearchMixFeedList searchMixFeedList, SearchMixFeed searchMixFeed) {
        SearchMixFeed searchMixFeed2;
        EntityCardTitle entityCardTitle;
        if (searchMixFeedList == null) {
            return;
        }
        List<SearchMixFeed> list = searchMixFeedList.mItems;
        ArrayList arrayList = null;
        SearchMixFeed searchMixFeed3 = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (SearchMixFeed searchMixFeed4 : list) {
                SearchMixFeed searchMixFeed5 = searchMixFeed4;
                if (searchMixFeed5 != null && searchMixFeed5.getFeedType() == 200 && C642140PGq.LIZIZ(searchMixFeed5.getEntityCard()) && !searchMixFeed5.isWeakEntity()) {
                    searchMixFeed3 = searchMixFeed5;
                } else {
                    arrayList2.add(searchMixFeed4);
                }
            }
            searchMixFeed2 = searchMixFeed3;
            arrayList = new ArrayList(arrayList2);
        } else {
            searchMixFeed2 = null;
        }
        searchMixFeedList.mItems = arrayList;
        if (searchMixFeed == null) {
            searchMixFeed = searchMixFeed2;
            if (searchMixFeed2 == null) {
                return;
            }
        }
        SearchHubEntityCard entityCard = searchMixFeed.getEntityCard();
        if (entityCard != null && (entityCardTitle = entityCard.topCardInfo) != null) {
            entityCardTitle.setType(Integer.valueOf(searchMixFeed.getFeedType()));
            entityCardTitle.setDocType(searchMixFeed.docType);
            entityCardTitle.setUniversalRank(searchMixFeed.universalRank);
            C641720PFa.LIZ.getClass();
            entityCardTitle.setStandardCardId(C641720PFa.LIZ(searchMixFeed));
            searchMixFeedList.LLILZ = entityCardTitle;
            searchMixFeedList.LLILZIL = searchMixFeed;
        }
    }
}

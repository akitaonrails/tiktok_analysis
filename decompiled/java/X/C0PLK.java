package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.MixedCreativeCardStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0PLK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLK {
    public static final Integer LIZ(SearchMixFeed searchMixFeed) {
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct;
        List<? extends Aweme> list;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        MixedCreativeCardStruct mixedCreativeCardStruct;
        List<? extends Aweme> list2;
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct2 = searchMixFeed.multiAdCard;
        if ((searchInflowMultiAdCardStruct2 == null || (list2 = searchInflowMultiAdCardStruct2.awemeList) == null || list2.isEmpty()) && (searchInflowMultiAdCardStruct = searchMixFeed.multiAdCard) != null) {
            searchInflowMultiAdCardStruct.setAwemeList(C0R12.LIZIZ.LJJIFFI(searchInflowMultiAdCardStruct.awemeListRaw));
        }
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct3 = searchMixFeed.multiAdCard;
        if (searchInflowMultiAdCardStruct3 == null || (list = searchInflowMultiAdCardStruct3.awemeList) == null || (aweme = (Aweme) C13LP.LJJJLL(list)) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (mixedCreativeCardStruct = searchAdInfo.mixedCreativeCard) == null) {
            return null;
        }
        return Integer.valueOf(mixedCreativeCardStruct.getDisplayCardType());
    }
}

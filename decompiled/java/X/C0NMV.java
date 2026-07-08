package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;

/* JADX INFO: renamed from: X.0NMV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMV {
    public static final boolean LIZ(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        if (searchMixFeed == null || searchMixFeed.getFeedType() != 65280 || (aweme = searchMixFeed.getAweme()) == null) {
            return false;
        }
        if (aweme.isAd() && !C293500Beu.LIZIZ) {
            return false;
        }
        return true;
    }
}

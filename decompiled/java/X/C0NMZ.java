package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0NMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NMZ {
    public static final Aweme LIZ(SearchMixFeed searchMixFeed) {
        Aweme aweme;
        if (searchMixFeed == null) {
            return null;
        }
        List listLIZ = C0PH8.LIZ(searchMixFeed, C0NMY.GENERAL_SEARCH);
        if (listLIZ == null || (aweme = (Aweme) C13LP.LJJJLL(listLIZ)) == null) {
            return searchMixFeed.getAweme();
        }
        return aweme;
    }
}

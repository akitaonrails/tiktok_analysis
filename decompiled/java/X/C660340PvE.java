package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.KeyMoments;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0PvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660340PvE {
    public static final List<SearchKeyFramePoint> LIZ(SearchMixFeed searchMixFeed, boolean z) {
        KeyMoments keyMoments;
        List<SearchKeyFramePoint> list;
        if (z) {
            C660350PvF.LIZ.getClass();
            Aweme awemeLIZIZ = C660350PvF.LIZIZ(searchMixFeed);
            if (C660350PvF.LIZJ(awemeLIZIZ, searchMixFeed) || C660350PvF.LIZLLL(awemeLIZIZ)) {
                return null;
            }
        }
        SearchAwemeInfo searchAwemeInfo = searchMixFeed.searchAwemeInfo;
        if (searchAwemeInfo == null || (keyMoments = searchAwemeInfo.keyMomentList) == null || (list = keyMoments.moments) == null || !(!list.isEmpty())) {
            return null;
        }
        return list;
    }
}

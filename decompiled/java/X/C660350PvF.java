package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.KeyMoments;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0PvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660350PvF {
    public static final C660350PvF LIZ = new C660350PvF();

    public static Aweme LIZIZ(SearchMixFeed searchMixFeed) {
        SearchAwemeInfo searchAwemeInfo;
        KeyMoments keyMoments;
        List<SearchKeyFramePoint> list;
        if (searchMixFeed == null || (searchAwemeInfo = searchMixFeed.searchAwemeInfo) == null || (keyMoments = searchAwemeInfo.keyMomentList) == null || (list = keyMoments.moments) == null || !(!list.isEmpty())) {
            return null;
        }
        return searchMixFeed.getAweme();
    }

    public static boolean LIZLLL(Aweme aweme) {
        AwemeRiskModel awemeRiskModel;
        String url;
        if (aweme == null) {
            return true;
        }
        if (C07CY.LIZ() && C660360PvG.LIZ(aweme) && C729980SkG.LJIIJJI(aweme) && (awemeRiskModel = aweme.getAwemeRiskModel()) != null && awemeRiskModel.isWarn()) {
            AwemeRiskModel awemeRiskModel2 = aweme.getAwemeRiskModel();
            if (awemeRiskModel2 != null) {
                url = awemeRiskModel2.getUrl();
            } else {
                url = null;
            }
            if (TextUtils.isEmpty(url)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZ(Aweme aweme, SearchMixFeed searchMixFeed) {
        SearchAwemeInfo searchAwemeInfo;
        KeyMoments keyMoments;
        List list;
        if ((((Number) C04VX.LIZ.getValue()).intValue() != 1 && !C1EB1.LJI) || LIZLLL(aweme) || LIZJ(aweme, searchMixFeed) || aweme.isAd()) {
            return;
        }
        C10IT.LIZ.getClass();
        if (C10IT.LJIIL(aweme) || (searchAwemeInfo = searchMixFeed.searchAwemeInfo) == null || (keyMoments = searchAwemeInfo.keyMomentList) == null || keyMoments.moments == null) {
            return;
        }
        C0PCY<C0PYD> c0pcyY30 = C0Q3E.LIZJ(aweme).Y30();
        KeyMoments keyMoments2 = searchMixFeed.searchAwemeInfo.keyMomentList;
        if (keyMoments2 == null || (list = keyMoments2.moments) == null) {
            list = C13BV.INSTANCE;
        }
        c0pcyY30.LIZ(new C655450PnL(list));
    }

    public static boolean LIZJ(Aweme aweme, SearchMixFeed searchMixFeed) {
        if (aweme == null) {
            return true;
        }
        if (C07CY.LIZ() && C0RQ4.LIZIZ() > 0 && searchMixFeed.getCommentList() != null) {
            return true;
        }
        return false;
    }
}

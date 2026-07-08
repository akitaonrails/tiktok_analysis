package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641200PDa {
    public static final boolean LIZIZ(Aweme aweme) {
        String searchFeedType;
        if (aweme != null) {
            searchFeedType = AwemeBizExtKt.getSearchFeedType(aweme);
        } else {
            searchFeedType = null;
        }
        return Intrinsics.LJFF(searchFeedType, "search_aggregated_video");
    }

    public static final boolean LIZJ(Aweme aweme) {
        String searchFeedType;
        String searchFeedType2 = null;
        if (aweme != null) {
            searchFeedType = AwemeBizExtKt.getSearchFeedType(aweme);
        } else {
            searchFeedType = null;
        }
        if (!Intrinsics.LJFF(searchFeedType, "search_music_aggregated_video")) {
            if (aweme != null) {
                searchFeedType2 = AwemeBizExtKt.getSearchFeedType(aweme);
            }
            if (!Intrinsics.LJFF(searchFeedType2, "search_music_creation_aggregated_video")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final int LIZ(Aweme aweme, SearchMixFeed searchMixFeed) {
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        String aid;
        if (searchMixFeed != null) {
            int i = 0;
            if ((searchMixFeed.isAggregatedVideo() || searchMixFeed.isMusicAggregatedVideo()) && 1 != 0 && (aggregatedVideo = searchMixFeed.getAggregatedVideo()) != null && (list = aggregatedVideo.awemes) != null) {
                Iterator<Aweme> it2 = list.iterator();
                while (it2.hasNext()) {
                    String aid2 = it2.next().getAid();
                    if (aweme != null) {
                        aid = aweme.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid2, aid)) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }
}

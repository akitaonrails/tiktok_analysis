package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.KeyMoments;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchAwemeInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0H8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436140H8i {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(SearchAwemeInfo searchAwemeInfo, Aweme aweme) {
        boolean z;
        int size;
        KeyMoments keyMoments;
        List<SearchKeyFramePoint> list;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list2;
        if (aweme == null) {
            return false;
        }
        EnumC436120H8g.Companion.getClass();
        if (!C436130H8h.LIZIZ(searchAwemeInfo)) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video != null && (bigThumbs = video.getBigThumbs()) != null && (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) != null && (list2 = bigThumb.imgUrls) != null && (!list2.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (searchAwemeInfo != null && (keyMoments = searchAwemeInfo.keyMomentList) != null && (list = keyMoments.moments) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (!z || size < 4) {
            return false;
        }
        return true;
    }
}

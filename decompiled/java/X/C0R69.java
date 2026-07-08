package X;

import com.ss.android.ugc.aweme.feed.referral.FeedBannerAwemeHelper;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0R69, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R69 {
    public static FeedBannerAwemeHelper LIZ(String str) {
        if (str == null) {
            str = "";
        }
        HashMap<String, FeedBannerAwemeHelper> value = FeedBannerAwemeHelper.LIZLLL.getValue();
        FeedBannerAwemeHelper feedBannerAwemeHelper = value.get(str);
        if (feedBannerAwemeHelper == null) {
            feedBannerAwemeHelper = new FeedBannerAwemeHelper(str);
            value.put(str, feedBannerAwemeHelper);
        }
        return feedBannerAwemeHelper;
    }
}

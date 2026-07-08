package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.bytedance.android.livesdk.model.FeedBannerContainer;
import java.util.List;

/* JADX INFO: renamed from: X.0IhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473270IhB {
    public static FeedBannerContainer LIZ;
    public static boolean LIZIZ;

    public static BaseListResponse LIZ(BaseListResponse baseListResponse) {
        FeedExtra feedExtra;
        FeedBannerContainer feedBannerContainer;
        List<FeedBanner> list;
        if (baseListResponse != null && (feedExtra = (FeedExtra) baseListResponse.extra) != null && (feedBannerContainer = feedExtra.bannerContainer) != null && (list = feedBannerContainer.bannerList) != null && (!list.isEmpty())) {
            LIZ = ((FeedExtra) baseListResponse.extra).bannerContainer;
            return baseListResponse;
        }
        FeedBannerContainer feedBannerContainer2 = LIZ;
        if (feedBannerContainer2 != null) {
            if (baseListResponse == null) {
                BaseListResponse baseListResponse2 = new BaseListResponse();
                FeedExtra feedExtra2 = new FeedExtra();
                feedExtra2.bannerContainer = LIZ;
                baseListResponse2.extra = feedExtra2;
                return baseListResponse2;
            }
            R r = baseListResponse.extra;
            if (r == 0) {
                FeedExtra feedExtra3 = new FeedExtra();
                feedExtra3.bannerContainer = LIZ;
                baseListResponse.extra = feedExtra3;
            } else {
                ((FeedExtra) r).bannerContainer = feedBannerContainer2;
                return baseListResponse;
            }
        }
        return baseListResponse;
    }
}

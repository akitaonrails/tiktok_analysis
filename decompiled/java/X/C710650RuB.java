package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.HotReloadFeedParams;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0RuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710650RuB {
    public static final SessionUnconsumptionItem LIZ(Aweme aweme, long j) {
        HotReloadFeedParams hotReloadFeedParams;
        String string;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Long creativeId;
        AwemeRawAd awemeRawAdLJJIJLIJ2;
        Long adId;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        int awemeType = aweme.getAwemeType();
        boolean zIsAd = aweme.isAd();
        boolean zLJJJJZ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(aweme);
        boolean zIsLive = AwemeSaaSExtKt.isLive(aweme);
        LiveRoomStruct liveRoomStructLJI = C0J4Y.LJI(aweme);
        String string2 = null;
        if (liveRoomStructLJI != null) {
            hotReloadFeedParams = liveRoomStructLJI.hotReloadFeedParams;
        } else {
            hotReloadFeedParams = null;
        }
        if (aweme.isAd() && (awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme)) != null && (adId = awemeRawAdLJJIJLIJ2.getAdId()) != null) {
            string = adId.toString();
        } else {
            string = null;
        }
        if (aweme.isAd() && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (creativeId = awemeRawAdLJJIJLIJ.getCreativeId()) != null) {
            string2 = creativeId.toString();
        }
        return new SessionUnconsumptionItem(aid, awemeType, zIsAd, zLJJJJZ, j, 0, false, zIsLive, hotReloadFeedParams, string, string2);
    }
}

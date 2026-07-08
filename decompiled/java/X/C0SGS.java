package X;

import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonTailAction;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonUIStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SGS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SGS {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        BannerCommonTailAction.BannerActionType tailActionType;
        PaidContentInfo paidContentInfo;
        String bottomButtonText;
        BannerCommonUIStruct bannerCommonUIStruct;
        BannerCommonTailAction bannerCommonTailAction;
        BannerCommonStruct bannerCommonStructLIZ = C0SGU.LIZ(videoItemParams.getAweme());
        if (bannerCommonStructLIZ != null && (bannerCommonUIStruct = bannerCommonStructLIZ.bannerUIStruct) != null && (bannerCommonTailAction = bannerCommonUIStruct.tailAction) != null) {
            tailActionType = bannerCommonTailAction.getTailActionType();
        } else {
            tailActionType = null;
        }
        if ((!videoItemParams.getAweme().isPaidContent || (paidContentInfo = videoItemParams.getAweme().mPaidContentInfo) == null || !Intrinsics.LJFF(paidContentInfo.getShouldShowBottomButton(), Boolean.TRUE) || (bottomButtonText = paidContentInfo.getBottomButtonText()) == null || bottomButtonText.length() == 0 || (Intrinsics.LJFF(videoItemParams.mEventType, "paid_series_detail_page") && !C695070ROf.LIZ(videoItemParams.getAweme()))) && tailActionType == BannerCommonTailAction.BannerActionType.BANNER_ACTION_TYPE_CUSTOM) {
            return true;
        }
        return false;
    }
}

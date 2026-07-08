package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.spi.ISovPlaylistBannerService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S4M, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S4M {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        C2189821An6 c2189821An62;
        String playListId;
        StandardComponentInfo standardComponentInfo;
        List<BannerCommonStruct> banners;
        BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
        boolean zLJIILLIIL = C10EU.LJIILLIIL(videoItemParams.getAweme().getAuthor());
        if (baseFeedPageParams2 == null) {
            return false;
        }
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null && (standardComponentInfo = aweme.getStandardComponentInfo()) != null) {
            Aweme aweme2 = videoItemParams.getAweme();
            if (aweme2 != null) {
                banners = aweme2.getBanners();
            } else {
                banners = null;
            }
            if (!standardComponentInfo.shouldShowBanner(banners, "bottom_banner_playlist")) {
                return false;
            }
        }
        if ((C300940Bqu.LIZ() && Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot") && !zLJIILLIIL) || Intrinsics.LJFF(videoItemParams.mEventType, "playlist") || Intrinsics.LJFF(videoItemParams.mEventType, "subscription_privilege_page") || (((baseFeedPageParams = videoItemParams.baseFeedPageParams) != null && (c2189821An62 = baseFeedPageParams.param) != null && (playListId = c2189821An62.getPlayListId()) != null && playListId.length() != 0 && Intrinsics.LJFF(videoItemParams.mEventType, "deeplink")) || (((Boolean) C0RZ9.LIZ.getValue()).booleanValue() && Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot")))) {
            return false;
        }
        if (!videoItemParams.getAweme().isAd() && !ComplianceServiceProvider.LJIL().LJJIJIIJIL() && videoItemParams.getAweme().getPlaylist_info() != null && ((c2189821An6 = baseFeedPageParams2.param) == null || !c2189821An6.isFromDuetModeOrDuetModeDetail())) {
            return true;
        }
        ISovPlaylistBannerService iSovPlaylistBannerService = (ISovPlaylistBannerService) PluggableExtentionKt.pluggableSpi$default(ISovPlaylistBannerService.class, false, false, false, 14, null);
        if (iSovPlaylistBannerService == null || !iSovPlaylistBannerService.shouldShowSovPlaylistBanner(videoItemParams.getAweme(), videoItemParams.mEventType)) {
            return false;
        }
        return true;
    }
}

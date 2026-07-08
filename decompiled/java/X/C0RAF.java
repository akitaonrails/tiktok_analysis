package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RAF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAF {
    public static final VideoItemParams LIZ(C0RF0 c0rf0) {
        VideoItemParams videoItemParamsNewBuilder = VideoItemParams.newBuilder();
        videoItemParamsNewBuilder.setEventType(c0rf0.LJ.eventType);
        videoItemParamsNewBuilder.setMyProfile(c0rf0.LJ.isMyProfile);
        videoItemParamsNewBuilder.setPageType(c0rf0.LJ.pageType);
        videoItemParamsNewBuilder.setFromPostList(c0rf0.LJ.isFromPostList);
        videoItemParamsNewBuilder.setFragment(c0rf0.LIZJ);
        videoItemParamsNewBuilder.setBaseFeedParams(c0rf0.LJ);
        videoItemParamsNewBuilder.setFrom(c0rf0.LJ.param.getFrom());
        videoItemParamsNewBuilder.setAwemeFromPage(c0rf0.LJ.awemeFromPage);
        videoItemParamsNewBuilder.trackerData = c0rf0.LJ.param.getTracker();
        return videoItemParamsNewBuilder;
    }
}

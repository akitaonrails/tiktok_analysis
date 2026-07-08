package X;

import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.archive2.IStoryArchiveV2Service;
import com.ss.android.ugc.aweme.story.archive2.feed.BaseStoryArchiveV2FeedSharedViewModel;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AwS41S2100000_18;

/* JADX INFO: renamed from: X.0geL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173750geL {
    public static final C1173750geL LIZ = new C1173750geL();

    public static void LIZ(Context context, PowerCell powerCell, EnumC1173740geK enumC1173740geK, String str, String str2, Aweme aweme) {
        BaseStoryArchiveV2FeedSharedViewModel baseStoryArchiveV2FeedSharedViewModelLIZLLL;
        IStoryArchiveV2Service iStoryArchiveV2Service = (IStoryArchiveV2Service) PluggableExtentionKt.pluggableSpi$default(IStoryArchiveV2Service.class, false, false, false, 14, null);
        if (iStoryArchiveV2Service != null && (baseStoryArchiveV2FeedSharedViewModelLIZLLL = iStoryArchiveV2Service.LIZLLL(enumC1173740geK.getPageKey(), powerCell)) != null) {
            baseStoryArchiveV2FeedSharedViewModelLIZLLL.setState(new AwS41S2100000_18(baseStoryArchiveV2FeedSharedViewModelLIZLLL, (BaseStoryArchiveV2FeedSharedViewModel<InterfaceC1173760geM<Object, Object>, InterfaceC1891350zJl>) str, str2, (String) 7));
            if (((Boolean) C331501Qj.LIZ.getValue()).booleanValue()) {
                C316630Cb7.LIZ(Collections.singletonList(aweme));
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://story/detail");
            smartRouteBuildRoute.withParam("video_from", "STORY_ENTRANCE_ARCHIVE");
            smartRouteBuildRoute.withParam("enter_from", "story_archive");
            smartRouteBuildRoute.withParam("feed_param_extra", C2097608Jq.LJI(new Pair("enter_position", "video_cover"), new Pair("story_card_target_aid", str2), new Pair("story_archive_v2_page_key", enumC1173740geK.getPageKey())));
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str);
            smartRouteBuildRoute.withParam("story_cover_transition", true);
            smartRouteBuildRoute.open();
        }
    }
}

package X;

import com.bytedance.android.live.PollVisibleChannel;
import com.bytedance.android.live.gift.FastGiftVisibleChannel;
import com.bytedance.android.live.gift.GiftGuideWidgetVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CustomPollCardVisibility;
import com.bytedance.android.livesdk.dataChannel.CustomizedPerksCardVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.PublicScreenGiftPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNormalPollStateVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RemindFollowDialogVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.SubGoalCardVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL2SlotVisibilityChannel;
import com.bytedance.android.livesdk.slot.FrameL3SlotVisibilityChannel;
import com.bytedance.android.livesdkapi.depend.event.FollowGuideBottomCardShow;
import com.bytedance.android.livesdkapi.depend.event.FollowGuidePinCardShow;
import com.bytedance.android.livesdkapi.depend.event.LiveExploreDrawerShowChannel;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalPinCardVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.Channel;
import java.util.Set;

/* JADX INFO: renamed from: X.0KYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519440KYs {
    public static final Set<Class<? extends Channel<Boolean>>> LIZ = C13LQ.LJLIIL(new Class[]{FastGiftVisibleChannel.class, PollVisibleChannel.class, LiveExploreDrawerShowChannel.class, FrameL2SlotVisibilityChannel.class, FrameL3SlotVisibilityChannel.class, SubGoalCardVisibilityChannel.class, CustomPollCardVisibility.class, FullScreenSurveyShowing.class, PublicScreenNormalPollStateVisibilityChannel.class, PublicScreenGiftPollStateVisibilityChannel.class, FollowGuidePinCardShow.class, FollowGuideBottomCardShow.class, GiftGuideWidgetVisibilityChannel.class, CustomizedPerksCardVisibilityChannel.class, RemindFollowDialogVisibilityChannel.class, LiveEventCardVisibility.class, LiveGoalPinCardVisibilityChannel.class});
}

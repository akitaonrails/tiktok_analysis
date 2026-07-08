package Y;

import X.C0ZOJ;
import X.C910130Zn9;
import X.InterfaceC2217461Bqa;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.im.actionbar.api.list.ActionBarCell;
import com.ss.android.ugc.aweme.im.actionbar.api.protocol.RemoteIconAndTitleWithDotCell;
import com.ss.android.ugc.aweme.im.actionbar.common.display.ActionBarCommonDisplayManagerAssem;
import com.ss.android.ugc.aweme.im.actionbar.serviceimpl.ActionBarUIAssem;
import com.ss.android.ugc.aweme.im.actionbar.viewmodel.ActionBarViewModelImpl;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.ReportTitleBarRightAssem;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarRightAssem;
import com.ss.android.ugc.aweme.im.lightinteract.impl.nudge.ChatPageLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.messagelist.RecentActivityCardUISlot;
import com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedReplyMessageFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.viewmodel.MessageDraftViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.storyreaction.StoryV2AnimViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.AwemeCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.SocialActionBarDataFetchAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.common.ChatCommonAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.interactioncard.InteractionCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.messagelist.MessageListAndRelatedUIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.report.ChatReportAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.UnavailableCardCardAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.AwemeStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.report.ChatReportPageViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.unreadindicator.UnreadIndicatorAssemV2;
import com.ss.android.ugc.aweme.im.vm.ChatCommonViewModelImpl;
import com.ss.android.ugc.aweme.publicgroup.preview.ChatPreviewModeAssem;
import com.ss.android.ugc.aweme.publicgroup.preview.ChatPreviewModeVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AObjectS67S0000000_14 implements Function0 {
    public final int $t;

    public static final Object invoke$5(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            default:
                return null;
        }
    }

    public AObjectS67S0000000_14(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = InteractionCardAssem.LLIZ;
        return new MessageListViewModel();
    }

    public static final Object invoke$1(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        C0ZOJ c0zoj = SkeletonLayoutAssembler.LLJLLIL;
        return new MessageListViewModel();
    }

    public static final Object invoke$10(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        String str = DetailFeedReplyMessageFragment._pnsPageId;
        return new MessageDraftViewModelImpl();
    }

    public static final Object invoke$11(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatReportAssem.LLJJIII;
        return new ChatReportPageViewModelImpl();
    }

    public static final Object invoke$12(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatReportAssem.LLJJIII;
        return new MessageListViewModel();
    }

    public static final Object invoke$13(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMMessagePowerListAssem.LLLIIL;
        return new MessageListViewModel();
    }

    public static final Object invoke$14(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ReportTitleBarRightAssem.LLJJIJIIJIL;
        return new ChatReportPageViewModelImpl();
    }

    public static final Object invoke$15(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleTitleBarCenterAssem.LLLILZLLLI;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$16(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleTitleBarRightAssem.LLJLIL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$17(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SingleTitleBarRightAssem.LLJLIL;
        return new VibeFeedEntranceViewModel();
    }

    public static final Object invoke$18(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatCommonAssem.LLILZIL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$19(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RecentActivityCardUISlot.LLLI;
        return new AwemeStatusViewModel();
    }

    public static final Object invoke$2(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        C0ZOJ c0zoj = SkeletonLayoutAssembler.LLJLLIL;
        return new ChatPageLightInteractionViewModel();
    }

    public static final Object invoke$20(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ProfileReusedUISlot.LLLIIIL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$21(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ActionBarCell.LLILLL;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$22(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UnreadIndicatorAssemV2.LLJL;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$23(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UnreadIndicatorAssemV2.LLJL;
        return new MessageListViewModel();
    }

    public static final Object invoke$24(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        int i = RemoteIconAndTitleWithDotCell.LLJI;
        return new VibeFeedEntranceViewModel();
    }

    public static final Object invoke$25(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AwemeCardAssem.LLLLIILLL;
        return new AwemeStatusViewModel();
    }

    public static final Object invoke$26(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SocialActionBarDataFetchAssem.LLJJI;
        return new MessageListViewModel();
    }

    public static final Object invoke$27(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SocialActionBarDataFetchAssem.LLJJI;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$28(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SocialActionBarDataFetchAssem.LLJJI;
        return new VibeFeedEntranceViewModel();
    }

    public static final Object invoke$29(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SocialActionBarDataFetchAssem.LLJJI;
        return new ChatCommonViewModelImpl();
    }

    public static final Object invoke$3(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        C0ZOJ c0zoj = SkeletonLayoutAssembler.LLJLLIL;
        return new StoryV2AnimViewModel();
    }

    public static final Object invoke$30(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        C910130Zn9 c910130Zn9 = ActionBarCommonDisplayManagerAssem.LLJI;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$31(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ChatPreviewModeAssem.LLJIJIL;
        return new ChatPreviewModeVM();
    }

    public static final Object invoke$4(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        C0ZOJ c0zoj = SkeletonLayoutAssembler.LLJLLIL;
        return new ChatReportPageViewModelImpl();
    }

    public static final Object invoke$6(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ActionBarUIAssem.LLJJJJJIL;
        return new ActionBarViewModelImpl();
    }

    public static final Object invoke$7(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MessageListAndRelatedUIContentAssem.LLJJI;
        return new MessageListViewModel();
    }

    public static final Object invoke$8(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MessageListAndRelatedUIContentAssem.LLJJI;
        return new ChatPageLightInteractionViewModel();
    }

    public static final Object invoke$9(AObjectS67S0000000_14 aObjectS67S0000000_14) {
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = UnavailableCardCardAssem.LLJLLIL;
        return new AwemeStatusViewModel();
    }

    public AObjectS67S0000000_14(ActionBarCell actionBarCell, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(RemoteIconAndTitleWithDotCell remoteIconAndTitleWithDotCell, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(ActionBarCommonDisplayManagerAssem actionBarCommonDisplayManagerAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(ActionBarUIAssem actionBarUIAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(ReportTitleBarRightAssem reportTitleBarRightAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(SingleTitleBarCenterAssem singleTitleBarCenterAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(SingleTitleBarRightAssem singleTitleBarRightAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(RecentActivityCardUISlot recentActivityCardUISlot, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(IMMessagePowerListAssem iMMessagePowerListAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(DetailFeedReplyMessageFragment detailFeedReplyMessageFragment, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(AwemeCardAssem awemeCardAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(SocialActionBarDataFetchAssem socialActionBarDataFetchAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(SkeletonLayoutAssembler skeletonLayoutAssembler, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(ChatCommonAssem chatCommonAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(InteractionCardAssem interactionCardAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(MessageListAndRelatedUIContentAssem messageListAndRelatedUIContentAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(ChatReportAssem chatReportAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(UnavailableCardCardAssem unavailableCardCardAssem, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(ProfileReusedUISlot profileReusedUISlot, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(UnreadIndicatorAssemV2 unreadIndicatorAssemV2, int i) {
        this.$t = i;
    }

    public AObjectS67S0000000_14(ChatPreviewModeAssem chatPreviewModeAssem, int i) {
        this.$t = i;
    }
}

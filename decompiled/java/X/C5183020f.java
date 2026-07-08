package X;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC125100dl;
import Y.AfS148S0200000_12;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.model.CampaignBannerData;
import com.bytedance.android.live.broadcast.model.NewAnchorIncentiveBannerData;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.model.UnifiedBannerData;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.StickerPropsDataQueryStatus;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionCommon;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionResultsTeamInfo;
import com.bytedance.android.live.liveinteract.competition.model.CompetitionSettleEnd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseVmWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.WindowMaskAssem;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAbstractAvatarFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskEffectUpdateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.ICountDownForAllApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2EffectPreviewDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.end.GuestShowdownEndDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank.GuestShowdownRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownInPunishmentSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownOngoingSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.guest.GuestShowdownGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.more.PlaybookEditorMoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience.LiveShowAudienceViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowAudienceAndGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.MidLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.api.ITextHeaderApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.InteractionLynxContainerLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.EventParams$LayoutDidChange;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.EventParams$LinkedListChangedV2;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetMemoryInfoResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderPlayGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordUpdateResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.aireply.AIReplyAssistantFeedbackDialog;
import com.bytedance.android.livesdk.aireply.AIReplyAssistantProfileDialog;
import com.bytedance.android.livesdk.api.revenue.crm.CRMUseLynxWidget;
import com.bytedance.android.livesdk.api.revenue.crm.CRMUseLynxWidgetLazyLoad;
import com.bytedance.android.livesdk.broadcast.interaction.widget.CaptchaLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.broadcast.preview.PreviewECommerceGrowthTaskWidget;
import com.bytedance.android.livesdk.broadcast.preview.PreviewLiveJourneyBannerWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.MultiPreviewInviteGuestWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewIncentiveCampaignWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInviteGuestWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveGrowthMVPWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewNotLOPNewCreatorWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewShoppingManageLiveWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.boards.LiveBoardsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameDropsPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameEventPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameGpppaPreviewBanner;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewPartnershipWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestViewModel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewShoppingManageLiveSchemaSetting;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.viewmodule.BroadcastPreviewBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomStickerWrapperWidget;
import com.bytedance.android.livesdk.comp.api.game.GameAutoCoverChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.dataChannel.HashtagDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.PreviewPagerSelectedGameItem;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.game.broadcast.education.GameLiveNewBroadcastEducationBannerWidget;
import com.bytedance.android.livesdk.game.broadcast.highlight.PreviewHighLightVideoWidget;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.model.PartnershipBriefDrops;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverMarkWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.GiftLeafRootWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionAssem;
import com.bytedance.android.livesdk.grouplive.assem.timedcompetition.TimedCompetitionViewModel;
import com.bytedance.android.livesdk.grouplive.widget.GroupLiveAudienceWidget;
import com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget;
import com.bytedance.android.livesdk.hashtag.HashtagApi;
import com.bytedance.android.livesdk.hashtag.PreviewHashtagWidget2;
import com.bytedance.android.livesdk.impl.revenue.crm.widget.CRMGoalWidgetV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.incentive.IncentiveTaskWidgetV2;
import com.bytedance.android.livesdk.livesetting.broadcast.CountDownEffectEnablePreviewSetting;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.grouplive.GroupLiveConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuideEnableInviteModuleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.BugFixGuestShowdownAudienceContentVersion;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.LiveShowConfigChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.message.BackpackMessage;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.CompetitionMessage;
import com.bytedance.android.livesdk.model.message.CompetitionRankListMessage;
import com.bytedance.android.livesdk.model.message.CompetitionScoreChange;
import com.bytedance.android.livesdk.model.message.CompetitionStart;
import com.bytedance.android.livesdk.model.message.DonationInfoMessage;
import com.bytedance.android.livesdk.model.message.HotRoomData;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import com.bytedance.android.livesdk.model.message.RecommendComment;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditModel;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditTranslatedModel;
import com.ss.android.ugc.aweme.creatoredit.MTEditStatusEnum;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import com.ss.android.ugc.aweme.creatoredit.SubtitleEditInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.SkuImage;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.GuessRound;
import com.ss.android.ugc.aweme.feed.model.live.GuessWidget;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventGuestShareDialog;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.live.smoothhost.OpenLivePreparationTask;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectListFragment;
import com.ss.android.ugc.aweme.setting.model.BlackList;
import com.ss.android.ugc.aweme.sharer.model.MultiGuestLiveEventRegisteredUser;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.model.GetStoryOnThisDayInfoResponse;
import com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.MuteStripSettingService;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorLoadingVM;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS459S0200000_24;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;
import tikcast.api.anchor_tool.EffectListResponse;
import tikcast.linkmic.common.BackGroundImageState;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.controller.GetStateResp;
import ttpobfuscated.e3;
import webcast.api.creator.PreScheduleStream;
import webcast.api.feed.NoticeItem;
import webcast.api.partnership.AnchorInfoResponse;
import webcast.api.room.LivePodcastResponse;
import webcast.data.BagItem;
import webcast.data.EffectStruct;
import webcast.data.LinkedUserInfo;
import webcast.data.host_board.BoardCell;
import webcast.data.host_board.HostBoard;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play.TopGuestMetaContent;
import webcast.data.multi_guest_play.TransitionInfo;

/* JADX INFO: renamed from: X.020f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5183020f extends C09AY implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case 40:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case 43:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case 48:
                return invoke$48(this, obj);
            case 49:
                return invoke$49(this, obj);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            case 58:
                return invoke$58(this, obj);
            case 59:
                return invoke$59(this, obj);
            case 60:
                return invoke$60(this, obj);
            case 61:
                return invoke$61(this, obj);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj);
            case 63:
                return invoke$63(this, obj);
            case 64:
                return invoke$64(this, obj);
            case 65:
                return invoke$65(this, obj);
            case 66:
                return invoke$66(this, obj);
            case 67:
                return invoke$67(this, obj);
            case 68:
                return invoke$68(this, obj);
            case 69:
                return invoke$69(this, obj);
            case 70:
                return invoke$70(this, obj);
            case 71:
                return invoke$71(this, obj);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj);
            case 73:
                return invoke$73(this, obj);
            case 74:
                return invoke$74(this, obj);
            case 75:
                return invoke$75(this, obj);
            case 76:
                return invoke$76(this, obj);
            case 77:
                return invoke$77(this, obj);
            case 78:
                return invoke$78(this, obj);
            case 79:
                return invoke$79(this, obj);
            case 80:
                return invoke$80(this, obj);
            case 81:
                return invoke$81(this, obj);
            case 82:
                return invoke$82(this, obj);
            case 83:
                return invoke$83(this, obj);
            case 84:
                return invoke$84(this, obj);
            case 85:
                return invoke$85(this, obj);
            case 86:
                return invoke$86(this, obj);
            case 87:
                return invoke$87(this, obj);
            case 88:
                return invoke$88(this, obj);
            case 89:
                return invoke$89(this, obj);
            case 90:
                return invoke$90(this, obj);
            case 91:
                return invoke$91(this, obj);
            case 92:
                return invoke$92(this, obj);
            case 93:
                return invoke$93(this, obj);
            case 94:
                return invoke$94(this, obj);
            case 95:
                return invoke$95(this, obj);
            case 96:
                return invoke$96(this, obj);
            case 97:
                return invoke$97(this, obj);
            case 98:
                return invoke$98(this, obj);
            case 99:
                return invoke$99(this, obj);
            case 100:
                return invoke$100(this, obj);
            case 101:
                return invoke$101(this, obj);
            case 102:
                return invoke$102(this, obj);
            case 103:
                return invoke$103(this, obj);
            case 104:
                return invoke$104(this, obj);
            case 105:
                return invoke$105(this, obj);
            case 106:
                return invoke$106(this, obj);
            case 107:
                return invoke$107(this, obj);
            case 108:
                return invoke$108(this, obj);
            case 109:
                return invoke$109(this, obj);
            case 110:
                return invoke$110(this, obj);
            case 111:
                return invoke$111(this, obj);
            case 112:
                return invoke$112(this, obj);
            case 113:
                return invoke$113(this, obj);
            case 114:
                return invoke$114(this, obj);
            case 115:
                return invoke$115(this, obj);
            case 116:
                return invoke$116(this, obj);
            case 117:
                return invoke$117(this, obj);
            case 118:
                return invoke$118(this, obj);
            case 119:
                return invoke$119(this, obj);
            case 120:
                return invoke$120(this, obj);
            case 121:
                return invoke$121(this, obj);
            case 122:
                return invoke$122(this, obj);
            case 123:
                return invoke$123(this, obj);
            case 124:
                return invoke$124(this, obj);
            case 125:
                return invoke$125(this, obj);
            case 126:
                return invoke$126(this, obj);
            case 127:
                return invoke$127(this, obj);
            case 128:
                return invoke$128(this, obj);
            case 129:
                return invoke$129(this, obj);
            case 130:
                return invoke$130(this, obj);
            case 131:
                return invoke$131(this, obj);
            case 132:
                return invoke$132(this, obj);
            case 133:
                return invoke$133(this, obj);
            case 134:
                return invoke$134(this, obj);
            case 135:
                return invoke$135(this, obj);
            case 136:
                return invoke$136(this, obj);
            case 137:
                return invoke$137(this, obj);
            case 138:
                return invoke$138(this, obj);
            case 139:
                return invoke$139(this, obj);
            case 140:
                return invoke$140(this, obj);
            case 141:
                return invoke$141(this, obj);
            case 142:
                return invoke$142(this, obj);
            case 143:
                return invoke$143(this, obj);
            case 144:
                return invoke$144(this, obj);
            case 145:
                return invoke$145(this, obj);
            case 146:
                return invoke$146(this, obj);
            case 147:
                return invoke$147(this, obj);
            case 148:
                return invoke$148(this, obj);
            case 149:
                return invoke$149(this, obj);
            case 150:
                return invoke$150(this, obj);
            case 151:
                return invoke$151(this, obj);
            case 152:
                return invoke$152(this, obj);
            case 153:
                return invoke$153(this, obj);
            case 154:
                return invoke$154(this, obj);
            case 155:
                return invoke$155(this, obj);
            case 156:
                return invoke$156(this, obj);
            case 157:
                return invoke$157(this, obj);
            case 158:
                return invoke$158(this, obj);
            case 159:
                return invoke$159(this, obj);
            case 160:
                return invoke$160(this, obj);
            case 161:
                return invoke$161(this, obj);
            case 162:
                return invoke$162(this, obj);
            case 163:
                return invoke$163(this, obj);
            case 164:
                return invoke$164(this, obj);
            case 165:
                return invoke$165(this, obj);
            case 166:
                return invoke$166(this, obj);
            case 167:
                return invoke$167(this, obj);
            case 168:
                return invoke$168(this, obj);
            case 169:
                return invoke$169(this, obj);
            case 170:
                return invoke$170(this, obj);
            case 171:
                return invoke$171(this, obj);
            case 172:
                return invoke$172(this, obj);
            case 173:
                return invoke$173(this, obj);
            case 174:
                return invoke$174(this, obj);
            case 175:
                return invoke$175(this, obj);
            case 176:
                return invoke$176(this, obj);
            case 177:
                return invoke$177(this, obj);
            case 178:
                return invoke$178(this, obj);
            case 179:
                return invoke$179(this, obj);
            case 180:
                return invoke$180(this, obj);
            case 181:
                return invoke$181(this, obj);
            case 182:
                return invoke$182(this, obj);
            case 183:
                return invoke$183(this, obj);
            case 184:
                return invoke$184(this, obj);
            case 185:
                return invoke$185(this, obj);
            case 186:
                return invoke$186(this, obj);
            case 187:
                return invoke$187(this, obj);
            case 188:
                return invoke$188(this, obj);
            case 189:
                return invoke$189(this, obj);
            case 190:
                return invoke$190(this, obj);
            case 191:
                return invoke$191(this, obj);
            case 192:
                return invoke$192(this, obj);
            case 193:
                return invoke$193(this, obj);
            case 194:
                return invoke$194(this, obj);
            case 195:
                return invoke$195(this, obj);
            case 196:
                return invoke$196(this, obj);
            case 197:
                return invoke$197(this, obj);
            case 198:
                return invoke$198(this, obj);
            case 199:
                return invoke$199(this, obj);
            case 200:
                return invoke$200(this, obj);
            case 201:
                return invoke$201(this, obj);
            case 202:
                return invoke$202(this, obj);
            case 203:
                return invoke$203(this, obj);
            case 204:
                return invoke$204(this, obj);
            case 205:
                return invoke$205(this, obj);
            case 206:
                return invoke$206(this, obj);
            case 207:
                return invoke$207(this, obj);
            case 208:
                return invoke$208(this, obj);
            case 209:
                return invoke$209(this, obj);
            case 210:
                return invoke$210(this, obj);
            case 211:
                return invoke$211(this, obj);
            case 212:
                return invoke$212(this, obj);
            case 213:
                return invoke$213(this, obj);
            case 214:
                return invoke$214(this, obj);
            case 215:
                return invoke$215(this, obj);
            case 216:
                return invoke$216(this, obj);
            case 217:
                return invoke$217(this, obj);
            case 218:
                return invoke$218(this, obj);
            case 219:
                return invoke$219(this, obj);
            case 220:
                return invoke$220(this, obj);
            case 221:
                return invoke$221(this, obj);
            case 222:
                return invoke$222(this, obj);
            case 223:
                return invoke$223(this, obj);
            case 224:
                return invoke$224(this, obj);
            case 225:
                return invoke$225(this, obj);
            case 226:
                return invoke$226(this, obj);
            case 227:
                return invoke$227(this, obj);
            case 228:
                return invoke$228(this, obj);
            case 229:
                return invoke$229(this, obj);
            case 230:
                return invoke$230(this, obj);
            case 231:
                return invoke$231(this, obj);
            case 232:
                return invoke$232(this, obj);
            case 233:
                return invoke$233(this, obj);
            case 234:
                return invoke$234(this, obj);
            case 235:
                return invoke$235(this, obj);
            case 236:
                return invoke$236(this, obj);
            case 237:
                return invoke$237(this, obj);
            case 238:
                return invoke$238(this, obj);
            case 239:
                return invoke$239(this, obj);
            case 240:
                return invoke$240(this, obj);
            case 241:
                return invoke$241(this, obj);
            case 242:
                return invoke$242(this, obj);
            case 243:
                return invoke$243(this, obj);
            case 244:
                return invoke$244(this, obj);
            case 245:
                return invoke$245(this, obj);
            case 246:
                return invoke$246(this, obj);
            case 247:
                return invoke$247(this, obj);
            case 248:
                return invoke$248(this, obj);
            case 249:
                return invoke$249(this, obj);
            case 250:
                return invoke$250(this, obj);
            case 251:
                return invoke$251(this, obj);
            case 252:
                return invoke$252(this, obj);
            case 253:
                return invoke$253(this, obj);
            case 254:
                return invoke$254(this, obj);
            case 255:
                return invoke$255(this, obj);
            case 256:
                return invoke$256(this, obj);
            case 257:
                return invoke$257(this, obj);
            case 258:
                return invoke$258(this, obj);
            case 259:
                return invoke$259(this, obj);
            case 260:
                return invoke$260(this, obj);
            case 261:
                return invoke$261(this, obj);
            case 262:
                return invoke$262(this, obj);
            case 263:
                return invoke$263(this, obj);
            case 264:
                return invoke$264(this, obj);
            case 265:
                return invoke$265(this, obj);
            case 266:
                return invoke$266(this, obj);
            case 267:
                return invoke$267(this, obj);
            case 268:
                return invoke$268(this, obj);
            case 269:
                return invoke$269(this, obj);
            case 270:
                return invoke$270(this, obj);
            case 271:
                return invoke$271(this, obj);
            case 272:
                return invoke$272(this, obj);
            case 273:
                return invoke$273(this, obj);
            case 274:
                return invoke$274(this, obj);
            case 275:
                return invoke$275(this, obj);
            case 276:
                return invoke$276(this, obj);
            case 277:
                return invoke$277(this, obj);
            case 278:
                return invoke$278(this, obj);
            case 279:
                return invoke$279(this, obj);
            case 280:
                return invoke$280(this, obj);
            case 281:
                return invoke$281(this, obj);
            case 282:
                return invoke$282(this, obj);
            case 283:
                return invoke$283(this, obj);
            case 284:
                return invoke$284(this, obj);
            case 285:
                return invoke$285(this, obj);
            case 286:
                return invoke$286(this, obj);
            case 287:
                return invoke$287(this, obj);
            case 288:
                return invoke$288(this, obj);
            case 289:
                return invoke$289(this, obj);
            case 290:
                return invoke$290(this, obj);
            case 291:
                return invoke$291(this, obj);
            case 292:
                return invoke$292(this, obj);
            case 293:
                return invoke$293(this, obj);
            case 294:
                return invoke$294(this, obj);
            case 295:
                return invoke$295(this, obj);
            case 296:
                return invoke$296(this, obj);
            case 297:
                return invoke$297(this, obj);
            case 298:
                return invoke$298(this, obj);
            case 299:
                return invoke$299(this, obj);
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return invoke$300(this, obj);
            case 301:
                return invoke$301(this, obj);
            case 302:
                return invoke$302(this, obj);
            case 303:
                return invoke$303(this, obj);
            case 304:
                return invoke$304(this, obj);
            case 305:
                return invoke$305(this, obj);
            case 306:
                return invoke$306(this, obj);
            case 307:
                return invoke$307(this, obj);
            case 308:
                return invoke$308(this, obj);
            case 309:
                return invoke$309(this, obj);
            case 310:
                return invoke$310(this, obj);
            case 311:
                return invoke$311(this, obj);
            case 312:
                return invoke$312(this, obj);
            case 313:
                return invoke$313(this, obj);
            case 314:
                return invoke$314(this, obj);
            case 315:
                return invoke$315(this, obj);
            case 316:
                return invoke$316(this, obj);
            case 317:
                return invoke$317(this, obj);
            case 318:
                return invoke$318(this, obj);
            case 319:
                return invoke$319(this, obj);
            case 320:
                return invoke$320(this, obj);
            case 321:
                return invoke$321(this, obj);
            case 322:
                return invoke$322(this, obj);
            case 323:
                return invoke$323(this, obj);
            case 324:
                return invoke$324(this, obj);
            case 325:
                return invoke$325(this, obj);
            case 326:
                return invoke$326(this, obj);
            case 327:
                return invoke$327(this, obj);
            case 328:
                return invoke$328(this, obj);
            case 329:
                return invoke$329(this, obj);
            case 330:
                return invoke$330(this, obj);
            case 331:
                return invoke$331(this, obj);
            case 332:
                return invoke$332(this, obj);
            case 333:
                return invoke$333(this, obj);
            case 334:
                return invoke$334(this, obj);
            case 335:
                return invoke$335(this, obj);
            case 336:
                return invoke$336(this, obj);
            case 337:
                return invoke$337(this, obj);
            case 338:
                return invoke$338(this, obj);
            case 339:
                return invoke$339(this, obj);
            case 340:
                return invoke$340(this, obj);
            case 341:
                return invoke$341(this, obj);
            case 342:
                return invoke$342(this, obj);
            case 343:
                return invoke$343(this, obj);
            case 344:
                return invoke$344(this, obj);
            case 345:
                return invoke$345(this, obj);
            case 346:
                return invoke$346(this, obj);
            case 347:
                return invoke$347(this, obj);
            case 348:
                return invoke$348(this, obj);
            case 349:
                return invoke$349(this, obj);
            case 350:
                return invoke$350(this, obj);
            case 351:
                return invoke$351(this, obj);
            case 352:
                return invoke$352(this, obj);
            case 353:
                return invoke$353(this, obj);
            case 354:
                return invoke$354(this, obj);
            case 355:
                return invoke$355(this, obj);
            case 356:
                return invoke$356(this, obj);
            case 357:
                return invoke$357(this, obj);
            case 358:
                return invoke$358(this, obj);
            case 359:
                return invoke$359(this, obj);
            case 360:
                return invoke$360(this, obj);
            case 361:
                return invoke$361(this, obj);
            case 362:
                return invoke$362(this, obj);
            case 363:
                return invoke$363(this, obj);
            case 364:
                return invoke$364(this, obj);
            case 365:
                return invoke$365(this, obj);
            case 366:
                return invoke$366(this, obj);
            case 367:
                return invoke$367(this, obj);
            case 368:
                return invoke$368(this, obj);
            case 369:
                return invoke$369(this, obj);
            case 370:
                return invoke$370(this, obj);
            case 371:
                return invoke$371(this, obj);
            case 372:
                return invoke$372(this, obj);
            case 373:
                return invoke$373(this, obj);
            case 374:
                return invoke$374(this, obj);
            case 375:
                return invoke$375(this, obj);
            case 376:
                return invoke$376(this, obj);
            case 377:
                return invoke$377(this, obj);
            case 378:
                return invoke$378(this, obj);
            case 379:
                return invoke$379(this, obj);
            case 380:
                return invoke$380(this, obj);
            case 381:
                return invoke$381(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(int i) {
        super(1);
        this.$t = i;
        this.l0 = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C212100rn c212100rn, int i) {
        super(1);
        this.$t = i;
        this.l0 = c212100rn;
    }

    public static final Object invoke$0(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, c5183020f.l0));
    }

    public static final Object invoke$1(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Aweme) obj).getAid(), ((Aweme) c5183020f.l0).getAid()));
    }

    public static final Object invoke$10(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC20236714Gf.resumeWith(boolValueOf);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$100(X.C5183020f r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$100(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$101(C5183020f c5183020f, Object obj) {
        LiveMode liveModeLIZJ;
        C197400pQ c197400pQFy0;
        GameTag gameTag = (GameTag) obj;
        DataChannel dataChannel = ((GameEventPreviewBanner) c5183020f.l0).dataChannel;
        if (dataChannel != null) {
            liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
        } else {
            liveModeLIZJ = null;
        }
        if ((liveModeLIZJ == LiveMode.SCREEN_RECORD || liveModeLIZJ == LiveMode.THIRD_PARTY) && (c197400pQFy0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).fy0()) != null) {
            c197400pQFy0.LJI(liveModeLIZJ, String.valueOf(gameTag.id));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$102(C5183020f c5183020f, Object obj) {
        List<User> list = ((C0J9U) obj).LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<User> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().getId()));
        }
        C419301k7.LIZIZ("confirm", arrayList);
        ((LiveInviteGuestSheet) c5183020f.l0).close(1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$103(C5183020f c5183020f, Object obj) throws JSONException {
        String str = (String) obj;
        QuickCommentWidget quickCommentWidget = (QuickCommentWidget) c5183020f.l0;
        if ((quickCommentWidget.LLILZIL || quickCommentWidget.LLILZLL) && (!a0.LJJJIL(str)) && !((QuickCommentWidget) c5183020f.l0).LLIZLLLIL) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("senderUserName", str);
            QuickCommentWidget quickCommentWidget2 = (QuickCommentWidget) c5183020f.l0;
            C786410Ut5.LJLIIL(100L, quickCommentWidget2.LLJILLL, new RunnableC514501zT(quickCommentWidget2, jSONObject, 4));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$104(C5183020f c5183020f, Object obj) {
        C195900pB c195900pB;
        Text text;
        RecommendComment recommendComment = (RecommendComment) obj;
        if (recommendComment != null && recommendComment.recommendText != null) {
            QuickCommentWidget quickCommentWidget = (QuickCommentWidget) c5183020f.l0;
            if ((quickCommentWidget.LLILZIL || quickCommentWidget.LLILZLL) && !quickCommentWidget.LLIZLLLIL) {
                try {
                    text = recommendComment.recommendText;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (text != null) {
                    QuickChatContent quickChatContent = new QuickChatContent();
                    quickChatContent.type = 0;
                    quickChatContent.text = new Regex("\\p{C}").replace(C1133830fbx.LJIILIIL(text, "").toString(), "");
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(quickChatContent);
                    c195900pB = new C195900pB(false, recommendComment.duration, recommendComment.priority, arrayList, "10");
                } else {
                    c195900pB = null;
                }
                ((QuickCommentWidget) c5183020f.l0).A1(c195900pB);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$105(C5183020f c5183020f, Object obj) {
        ((QuickCommentWidget) c5183020f.l0).LLIZLLLIL = ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$106(C5183020f c5183020f, Object obj) {
        DataChannel dataChannel;
        List<C0U74<RoomSticker>> list = (List) obj;
        C342601Uq.LIZ = list;
        C342601Uq.LIZJ = null;
        ((ArrayList) ((RoomStickerWrapperWidget) c5183020f.l0).LLJJIJIIJIL).addAll(list);
        ((RoomStickerWrapperWidget) c5183020f.l0).getClass();
        C342601Uq.LJII();
        Iterator<C0U74<RoomSticker>> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0U74<RoomSticker> next = it2.next();
            if (!next.LIZIZ.isEmpty()) {
                if (next != null && (dataChannel = ((RoomStickerWrapperWidget) c5183020f.l0).dataChannel) != null) {
                    dataChannel.zW(StickerPropsDataQueryStatus.class, 2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$107(C5183020f c5183020f, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((RoomStickerWrapperWidget) c5183020f.l0), null, null, new C335301Rv(null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$108(C5183020f c5183020f, Object obj) {
        DataChannel dataChannel;
        List<C0U74<RoomSticker>> list = (List) obj;
        C342601Uq.LIZIZ = list;
        ((ArrayList) ((RoomStickerWrapperWidget) c5183020f.l0).LLJJIJIL).addAll(list);
        Iterator<C0U74<RoomSticker>> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0U74<RoomSticker> next = it2.next();
            if (!next.LIZIZ.isEmpty()) {
                if (next != null && (dataChannel = ((RoomStickerWrapperWidget) c5183020f.l0).dataChannel) != null) {
                    dataChannel.zW(StickerPropsDataQueryStatus.class, 2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$109(C5183020f c5183020f, Object obj) {
        ((GameLiveNewBroadcastEducationBannerWidget) c5183020f.l0).show();
        return Unit.LIZ;
    }

    public static final Object invoke$11(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC20236714Gf.resumeWith(boolValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$110(C5183020f c5183020f, Object obj) {
        String str;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) obj;
        PreviewHighLightVideoWidget previewHighLightVideoWidget = (PreviewHighLightVideoWidget) c5183020f.l0;
        previewHighLightVideoWidget.LLJIJIL = roomCreateInfo.hasFragment;
        previewHighLightVideoWidget.LLJILJIL = roomCreateInfo.lastFragment;
        C0UKZ.LJLJLLL.LJFF(Boolean.valueOf(roomCreateInfo.canShowFragment));
        GameLiveFragment gameLiveFragment = roomCreateInfo.lastFragment;
        if (gameLiveFragment != null) {
            str = gameLiveFragment.coverUrl;
        } else {
            str = null;
        }
        if (C500260Jjc.LJJIIZ(str)) {
            C1324610kZf url = C1819620xS4.LIZ().setUrl(roomCreateInfo.lastFragment.coverUrl);
            url.LJIIIZ = R.drawable.eqc;
            url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            url.LJJI(((PreviewHighLightVideoWidget) c5183020f.l0).LLJI);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        ((PreviewHighLightVideoWidget) c5183020f.l0).show();
        return Unit.LIZ;
    }

    public static final Object invoke$111(C5183020f c5183020f, Object obj) {
        long j;
        C019M c019m = (C019M) obj;
        C019Q c019q = C019Q.START;
        CompetitionMessage competitionMessage = (CompetitionMessage) ((IMessage) c5183020f.l0);
        CompetitionStart competitionStart = competitionMessage.start;
        CompetitionCommon competitionCommon = competitionMessage.bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        return C019M.LIZ(c019m, c019q, competitionStart, null, j, 4);
    }

    public static final Object invoke$112(C5183020f c5183020f, Object obj) {
        long j;
        C019M c019m = (C019M) obj;
        C019Q c019q = C019Q.SCORE_CHANGE;
        CompetitionMessage competitionMessage = (CompetitionMessage) ((IMessage) c5183020f.l0);
        CompetitionScoreChange competitionScoreChange = competitionMessage.scoreChange;
        CompetitionCommon competitionCommon = competitionMessage.bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        return C019M.LIZ(c019m, c019q, null, competitionScoreChange, j, 2);
    }

    public static final Object invoke$113(C5183020f c5183020f, Object obj) {
        long j;
        C019M c019m = (C019M) obj;
        C019Q c019q = C019Q.SETTLE_END;
        CompetitionCommon competitionCommon = ((CompetitionMessage) ((IMessage) c5183020f.l0)).bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        return C019M.LIZ(c019m, c019q, null, null, j, 6);
    }

    public static final Object invoke$114(C5183020f c5183020f, Object obj) {
        AnonymousClass0194 anonymousClass0194 = (AnonymousClass0194) obj;
        if (anonymousClass0194 != null) {
            C1121570fIB c1121570fIB = new C1121570fIB((User) null);
            c1121570fIB.LIZJ = "group_show_hp_avatar";
            c1121570fIB.LIZIZ = new C1130230fW9(anonymousClass0194.LIZ, anonymousClass0194.LIZIZ, anonymousClass0194.LIZJ);
            DataChannel dataChannel = ((TimedCompetitionAssem) c5183020f.l0).LLJI;
            if (dataChannel != null) {
                dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
            }
            AnonymousClass0193 anonymousClass0193 = ((TimedCompetitionAssem) c5183020f.l0).LLJILLL;
            if (anonymousClass0193 != null) {
                anonymousClass0193.LJFF = String.valueOf(anonymousClass0194.LIZ);
            }
            AnonymousClass0193 anonymousClass01932 = ((TimedCompetitionAssem) c5183020f.l0).LLJILLL;
            if (anonymousClass01932 != null) {
                AnonymousClass0192.LIZ(anonymousClass01932, "match_member");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$115(C5183020f c5183020f, Object obj) {
        long id;
        Room room;
        long jLongValue = ((Number) obj).longValue();
        AssemVMLazy assemVMLazy = ((TimedCompetitionAssem) c5183020f.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TimedCompetitionAssem.LLJJ;
        TimedCompetitionViewModel timedCompetitionViewModel = (TimedCompetitionViewModel) assemVMLazy.getValue();
        DataChannel dataChannel = ((TimedCompetitionAssem) c5183020f.l0).LLJI;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        timedCompetitionViewModel.vQ2(GroupLiveConfig.INSTANCE.getGetValue().matchConfig.checkResultRetryCount, id, jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$116(C5183020f c5183020f, Object obj) {
        long j;
        C081000Sa c081000Sa = (C081000Sa) obj;
        C00SX c00sx = C00SX.START;
        CompetitionMessage competitionMessage = (CompetitionMessage) ((IMessage) c5183020f.l0);
        CompetitionStart competitionStart = competitionMessage.start;
        CompetitionCommon competitionCommon = competitionMessage.bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        return C081000Sa.LIZ(c081000Sa, c00sx, competitionStart, null, null, j, 28);
    }

    public static final Object invoke$117(C5183020f c5183020f, Object obj) {
        long j;
        C081000Sa c081000Sa = (C081000Sa) obj;
        C00SX c00sx = C00SX.INCOMPETITION;
        CompetitionMessage competitionMessage = (CompetitionMessage) ((IMessage) c5183020f.l0);
        CompetitionScoreChange competitionScoreChange = competitionMessage.scoreChange;
        CompetitionCommon competitionCommon = competitionMessage.bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        return C081000Sa.LIZ(c081000Sa, c00sx, null, competitionScoreChange, null, j, 26);
    }

    public static final Object invoke$118(C5183020f c5183020f, Object obj) {
        long j;
        C081000Sa c081000Sa = (C081000Sa) obj;
        C00SX c00sx = C00SX.RESULT;
        CompetitionMessage competitionMessage = (CompetitionMessage) ((IMessage) c5183020f.l0);
        CompetitionSettleEnd competitionSettleEnd = competitionMessage.settleEnd;
        CompetitionCommon competitionCommon = competitionMessage.bizCommon;
        if (competitionCommon != null) {
            j = competitionCommon.competitionId;
        } else {
            j = 0;
        }
        return C081000Sa.LIZ(c081000Sa, c00sx, null, null, competitionSettleEnd, j, 22);
    }

    public static final Object invoke$119(C5183020f c5183020f, Object obj) {
        ((C062P) obj).LIZ = new C019D(((GroupLiveAudienceWidget) c5183020f.l0).dataChannel);
        return Unit.LIZ;
    }

    public static final Object invoke$12(C5183020f c5183020f, Object obj) {
        if (obj == EnumC754820TjE.FINISH) {
            ((GameEventPreviewBanner) c5183020f.l0).LLJILJILJ = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$120(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        Room room;
        Room room2;
        GameTag gameTag = (GameTag) obj;
        C480460Ism.LIZ().getClass();
        HashtagApi hashtagApi = (HashtagApi) C480460Ism.LIZLLL(HashtagApi.class);
        DataChannel dataChannel = ((BroadcastHashTagWidget) c5183020f.l0).dataChannel;
        Long lValueOf2 = null;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        DataChannel dataChannel2 = ((BroadcastHashTagWidget) c5183020f.l0).dataChannel;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        }
        C11NZ<R> c11nzLJIILIIL = hashtagApi.setHashtag(lValueOf, lValueOf2, 0L, gameTag.id).LJIILIIL(new C0UO0());
        BroadcastHashTagWidget broadcastHashTagWidget = (BroadcastHashTagWidget) c5183020f.l0;
        c11nzLJIILIIL.LJJLL(new AfS148S0200000_12(gameTag, broadcastHashTagWidget, 34), new C516201zk(broadcastHashTagWidget, 81));
        return Unit.LIZ;
    }

    public static final Object invoke$121(C5183020f c5183020f, Object obj) {
        Long l = ((RoomCreateInfo) obj).live_house_status;
        if (l != null && l.longValue() == 4) {
            ((PreviewHashtagWidget2) c5183020f.l0).hide();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$122(C5183020f c5183020f, Object obj) {
        String str;
        SparkContext sparkContext = (SparkContext) obj;
        if (((CRMGoalWidgetV2) c5183020f.l0).dataChannel.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW) {
            str = "true";
        } else {
            str = "false";
        }
        sparkContext.LJJJZ("full_screen_display", str);
        sparkContext.LJJJZ("broadcast_time", String.valueOf(((CRMGoalWidgetV2) c5183020f.l0).LLILLL));
        return Unit.LIZ;
    }

    public static final Object invoke$123(C5183020f c5183020f, Object obj) throws JSONException {
        EnumC1083260eIO enumC1083260eIO = (EnumC1083260eIO) obj;
        EnumC1083260eIO enumC1083260eIO2 = EnumC1083260eIO.SHOW;
        if (enumC1083260eIO == enumC1083260eIO2 || enumC1083260eIO == EnumC1083260eIO.HIDE) {
            int value = CRMUseLynxWidget.INSTANCE.getValue();
            boolean z = true;
            if (value != 1 ? value == 2 : CRMUseLynxWidgetLazyLoad.INSTANCE.needLazy()) {
                CRMGoalWidgetV2 cRMGoalWidgetV2 = (CRMGoalWidgetV2) c5183020f.l0;
                if (!cRMGoalWidgetV2.LL && cRMGoalWidgetV2.LLILLJJLI == null) {
                    cRMGoalWidgetV2.show();
                    ((CRMGoalWidgetV2) c5183020f.l0).x1();
                }
            }
            InterfaceC1541990qEH interfaceC1541990qEH = ((CRMGoalWidgetV2) c5183020f.l0).LLILLJJLI;
            if (interfaceC1541990qEH != null) {
                JSONObject jSONObject = new JSONObject();
                if (enumC1083260eIO != enumC1083260eIO2) {
                    z = false;
                }
                jSONObject.put("full_screen_display", z);
                if (Intrinsics.LJFF(enumC1083260eIO.getFrom(), "view_insight")) {
                    jSONObject.put("from", "view_insight");
                }
                interfaceC1541990qEH.LIZ("receive_full_screen_status_changed", jSONObject);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$124(C5183020f c5183020f, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(Long.valueOf(jLongValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$125(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) obj;
        List list = (List) c5183020f.l0;
        if (list.isEmpty()) {
            function1.invoke(Boolean.TRUE);
        } else {
            ((Function1) ListProtector.get(list, 0)).invoke(new C020W(function1, list, 49));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$126(C5183020f c5183020f, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C500260Jjc.LJJJJJ((IncentiveTaskWidgetV2) c5183020f.l0, C0PEM.LIZJ, new C352301Yj(null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$127(C5183020f c5183020f, Object obj) {
        C500260Jjc.LJJJJJ((IncentiveTaskWidgetV2) c5183020f.l0, C0PEM.LIZJ, new C352401Yk(null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$128(C5183020f c5183020f, Object obj) {
        C176600m4.LIZJ(new C020Y((List) obj, (List<BagItem>) c5183020f.l0, (BackpackMessage) 21));
        return Unit.LIZ;
    }

    public static final Object invoke$129(C5183020f c5183020f, Object obj) {
        List list = (List) obj;
        list.clear();
        list.addAll((Collection) c5183020f.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(C5183020f c5183020f, Object obj) {
        LiveMode liveModeLIZJ;
        C197400pQ c197400pQFy0;
        Long lValueOf;
        PartnershipGameEvent partnershipGameEvent;
        Long lValueOf2;
        boolean zBooleanValue;
        PartnershipGameEvent next;
        GameTag gameTag = (GameTag) obj;
        DataChannel dataChannel = ((GameEventPreviewBanner) c5183020f.l0).dataChannel;
        Long lValueOf3 = null;
        if (dataChannel != null) {
            liveModeLIZJ = C751980Tee.LIZJ(dataChannel);
        } else {
            liveModeLIZJ = null;
        }
        LiveMode liveMode = LiveMode.SCREEN_RECORD;
        if ((liveModeLIZJ == liveMode || liveModeLIZJ == LiveMode.THIRD_PARTY) && (c197400pQFy0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).fy0()) != null) {
            c197400pQFy0.LJI(liveModeLIZJ, String.valueOf(gameTag.id));
        }
        GameEventPreviewBanner gameEventPreviewBanner = (GameEventPreviewBanner) c5183020f.l0;
        if (gameEventPreviewBanner.LLJILJILJ) {
            PartnershipGameEvent partnershipGameEvent2 = gameEventPreviewBanner.LLJILLL;
            if (partnershipGameEvent2 != null) {
                lValueOf = Long.valueOf(partnershipGameEvent2.gameTagId);
            } else {
                lValueOf = null;
            }
            if (!Intrinsics.LJFF(lValueOf, gameTag.id)) {
                GameEventPreviewBanner gameEventPreviewBanner2 = (GameEventPreviewBanner) c5183020f.l0;
                gameEventPreviewBanner2.hide();
                gameEventPreviewBanner2.LLJIJIL = false;
            }
            if (liveModeLIZJ == liveMode || liveModeLIZJ == LiveMode.THIRD_PARTY) {
                GameEventPreviewBanner gameEventPreviewBanner3 = (GameEventPreviewBanner) c5183020f.l0;
                List<PartnershipGameEvent> list = gameEventPreviewBanner3.LLJILJIL;
                if (list != null) {
                    Iterator<PartnershipGameEvent> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            PartnershipGameEvent partnershipGameEvent3 = next;
                            long j = partnershipGameEvent3.gameTagId;
                            Long l = gameTag.id;
                            if (l != null && j == l.longValue() && !partnershipGameEvent3.anchorHasJoined) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    partnershipGameEvent = next;
                } else {
                    partnershipGameEvent = null;
                }
                gameEventPreviewBanner3.LLJILLL = partnershipGameEvent;
                C20337914i1<Map<Long, Boolean>> c20337914i1 = InterfaceC772390URp.T;
                Map<Long, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                PartnershipGameEvent partnershipGameEvent4 = ((GameEventPreviewBanner) c5183020f.l0).LLJILLL;
                if (partnershipGameEvent4 != null) {
                    lValueOf2 = Long.valueOf(partnershipGameEvent4.gameTagId);
                } else {
                    lValueOf2 = null;
                }
                Boolean bool = mapLIZIZ.get(lValueOf2);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (((GameEventPreviewBanner) c5183020f.l0).LLJILLL != null && !zBooleanValue) {
                    Map<Long, Boolean> mapLIZIZ2 = c20337914i1.LIZIZ();
                    PartnershipGameEvent partnershipGameEvent5 = ((GameEventPreviewBanner) c5183020f.l0).LLJILLL;
                    if (partnershipGameEvent5 != null) {
                        lValueOf3 = Long.valueOf(partnershipGameEvent5.gameTagId);
                    }
                    mapLIZIZ2.put(lValueOf3, Boolean.TRUE);
                    ((GameEventPreviewBanner) c5183020f.l0).P1("topic_show");
                }
            }
            ((GameEventPreviewBanner) c5183020f.l0).LLJILJILJ = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$130(C5183020f c5183020f, Object obj) {
        List list = (List) obj;
        list.clear();
        list.addAll((Collection) c5183020f.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$131(C5183020f c5183020f, Object obj) {
        File file = (File) c5183020f.l0;
        if (file != null && file.exists()) {
            try {
                if (file.isFile()) {
                    file.delete();
                } else if (file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$132(C5183020f c5183020f, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$133(C5183020f c5183020f, Object obj) {
        ILocationBaseServiceForMT iLocationBaseServiceForMT;
        Map<String, String> map = (Map) obj;
        Context context = (Context) c5183020f.l0;
        if (context != null && (iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null)) != null) {
            iLocationBaseServiceForMT.LJJIII(context, map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$134(C5183020f c5183020f, Object obj) {
        Function1 function1;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        T t = ((C259800zU) c5183020f.l0).element;
        if (t == 0) {
            function1 = null;
        } else {
            function1 = (Function1) t;
        }
        function1.invoke(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$135(C5183020f c5183020f, Object obj) {
        String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
        List list = (List) c5183020f.l0;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (a0.LJJIIZI((String) it2.next(), lowerCase, false)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$136(C5183020f c5183020f, Object obj) {
        Pair pair = (Pair) obj;
        Iterable iterable = (Iterable) pair.getSecond();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            try {
                arrayList.add((MultiGuestLiveEventRegisteredUser) C00S4.LIZ().LJII((String) it2.next(), MultiGuestLiveEventRegisteredUser.class));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        ((LiveEventGuestShareDialog) c5183020f.l0).LLILZIL = new Pair<>(pair.getFirst(), arrayList);
        ((LiveEventGuestShareDialog) c5183020f.l0).NR();
        return Unit.LIZ;
    }

    public static final Object invoke$137(C5183020f c5183020f, Object obj) {
        C291001Au c291001Au = new C291001Au((Aweme) c5183020f.l0);
        obj.getClass();
        return new C232100v1(c291001Au);
    }

    public static final Object invoke$138(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        String nickName;
        FollowInfo followInfo;
        ImageModel avatarThumb;
        List urls;
        Pair pair = (Pair) obj;
        Iterable<GetLiveEventUserResponse.RegisteredListUser> iterable = (Iterable) pair.getSecond();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        for (GetLiveEventUserResponse.RegisteredListUser registeredListUser : iterable) {
            User user = registeredListUser.user;
            String str = null;
            if (user != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            User user2 = registeredListUser.user;
            if (user2 != null) {
                nickName = user2.getNickName();
            } else {
                nickName = null;
            }
            User user3 = registeredListUser.user;
            int followStatus = 0;
            if (user3 != null && (avatarThumb = user3.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null) {
                str = (String) ListProtector.get(urls, 0);
            }
            User user4 = registeredListUser.user;
            if (user4 != null && (followInfo = user4.getFollowInfo()) != null) {
                followStatus = (int) followInfo.getFollowStatus();
            }
            Integer numValueOf = Integer.valueOf(followStatus);
            Long lValueOf2 = Long.valueOf(registeredListUser.registeredTime);
            boolean z = registeredListUser.alreadyRead;
            Long.valueOf(0L);
            arrayList.add(GsonProtectorUtils.toJson(C00S4.LIZ(), new MultiGuestLiveEventRegisteredUser(lValueOf, nickName, str, numValueOf, lValueOf2, z, "")));
        }
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(new Pair(pair.getFirst(), arrayList));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$139(C5183020f c5183020f, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        Pair pair = new Pair("prePodcast", "true");
        C189200o6.m2constructorimpl(pair);
        interfaceC20236714Gf.resumeWith(pair);
        return Unit.LIZ;
    }

    public static final Object invoke$14(C5183020f c5183020f, Object obj) {
        String str = (String) obj;
        if (str != null) {
            InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
            TemplateData templateDataLJII = TemplateData.LJII(C2097908Jt.LIZJ(new Pair("prefetch_data", C1741890vQh.LJIIJ(str))));
            C189200o6.m2constructorimpl(templateDataLJII);
            interfaceC1364105Vn.resumeWith(templateDataLJII);
        } else {
            InterfaceC1364105Vn interfaceC1364105Vn2 = (InterfaceC1364105Vn) c5183020f.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC1364105Vn2.resumeWith(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$140(C5183020f c5183020f, Object obj) {
        String str;
        PreScheduleStream preScheduleStream = (PreScheduleStream) obj;
        OpenLivePreparationTask.LIZ.getClass();
        OpenLivePreparationTask.LJFF = preScheduleStream;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        if (preScheduleStream != null) {
            str = preScheduleStream.sdkParams;
        } else {
            str = null;
        }
        Pair pair = new Pair("preSchedule", str);
        C189200o6.m2constructorimpl(pair);
        interfaceC20236714Gf.resumeWith(pair);
        return Unit.LIZ;
    }

    public static final Object invoke$141(C5183020f c5183020f, Object obj) {
        LivePodcastResponse.ResponseData responseData = (LivePodcastResponse.ResponseData) obj;
        OpenLivePreparationTask.LJIIIIZZ = responseData;
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        C189200o6.m2constructorimpl(responseData);
        interfaceC20236714Gf.resumeWith(responseData);
        return Unit.LIZ;
    }

    public static final Object invoke$142(C5183020f c5183020f, Object obj) {
        ((C062P) obj).LIZ = new C112000be((String) ((PoiCollectListFragment) c5183020f.l0).LLJI.getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$143(C5183020f c5183020f, Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        Object obj2 = ((Map) c5183020f.l0).get(ListProtector.get(matchResult.LIZ(), 1));
        if (obj2 == null) {
            return matchResult.getValue();
        }
        return obj2;
    }

    public static final Object invoke$144(C5183020f c5183020f, Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        Object obj2 = ((Map) c5183020f.l0).get(ListProtector.get(matchResult.LIZ(), 1));
        if (obj2 == null) {
            return matchResult.getValue();
        }
        return obj2;
    }

    public static final Object invoke$145(C5183020f c5183020f, Object obj) {
        ((MuteStripSettingService) c5183020f.l0).storeAutoMuteStripSetting(((C01XF) obj).LIZIZ.getValue());
        return Unit.LIZ;
    }

    public static final Object invoke$146(C5183020f c5183020f, Object obj) {
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        Playbook playbook;
        long j;
        String str;
        PlaybookAnchorViewModel playbookAnchorViewModel;
        Playbook playbook2;
        int iIntValue = ((Number) obj).intValue();
        BasePlaybookViewModel basePlaybookViewModel = ((C20384614pY) c5183020f.l0).LLILZIL;
        if (basePlaybookViewModel != null && (mutableLiveData = basePlaybookViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.LIZ) != null) {
            C20384614pY c20384614pY = (C20384614pY) c5183020f.l0;
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            C20379114of value2 = c20384614pY.LLILZIL.LLILLL.getValue();
            if (value2 != null && (playbook2 = value2.LIZ) != null) {
                j = playbook2.playbookId;
            } else {
                j = 0;
            }
            if (iIntValue == 2) {
                str = "off";
            } else {
                str = "on";
            }
            C978360bZC.LJJ("click", j, str, Integer.valueOf(playbook.playbookType), Boolean.valueOf(playbook.isMyCreation));
            BasePlaybookViewModel basePlaybookViewModel2 = c20384614pY.LLILZIL;
            if ((basePlaybookViewModel2 instanceof PlaybookAnchorViewModel) && (playbookAnchorViewModel = (PlaybookAnchorViewModel) basePlaybookViewModel2) != null) {
                playbookAnchorViewModel.TQ2(iIntValue, playbook);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$147(C5183020f c5183020f, Object obj) {
        Pair pair = (Pair) obj;
        return ((Function2) c5183020f.l0).invoke(pair.getFirst(), pair.getSecond());
    }

    public static final Object invoke$148(C5183020f c5183020f, Object obj) {
        Object obj2 = ListProtector.get(((MatchResult) obj).LIZ(), 1);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c5183020f.l0;
        Object objValueOf = linkedHashMap.get(obj2);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(obj2, objValueOf);
        }
        int iIntValue = ((Number) objValueOf).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        sbLIZ.append(iIntValue);
        sbLIZ.append(':');
        sbLIZ.append(EnumC1133850fbz.STRING.getTag());
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$149(C5183020f c5183020f, Object obj) {
        MatchResult matchResultFind$default;
        List<String> listLIZ;
        String str;
        String string;
        List listLJJLIIIJ;
        String str2 = (String) obj;
        JSONArray jSONArray = new JSONArray();
        Regex regex = (Regex) c5183020f.l0;
        if (str2 != null && (matchResultFind$default = Regex.find$default(regex, str2, 0, 2, null)) != null && (listLIZ = matchResultFind$default.LIZ()) != null && (str = (String) C13LP.LJJJLZIJ(1, listLIZ)) != null && (string = a0.LJLIIIL(str).toString()) != null && (listLJJLIIIJ = a0.LJJLIIIJ(string, new char[]{','}, false, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                jSONArray.put(it3.next());
            }
        }
        return jSONArray;
    }

    public static final Object invoke$15(C5183020f c5183020f, Object obj) {
        ((InterfaceC382501eB) c5183020f.l0).LIZLLL();
        return Unit.LIZ;
    }

    public static final Object invoke$150(C5183020f c5183020f, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((InterfaceC20236714Gf) c5183020f.l0).isActive()) {
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
            C189200o6.m2constructorimpl(boolValueOf);
            interfaceC20236714Gf.resumeWith(boolValueOf);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$151(C5183020f c5183020f, Object obj) {
        long jLongValue;
        Long l;
        ((Boolean) obj).booleanValue();
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) c5183020f.l0;
        DataChannel dataChannel = liveBroadcastPreviewFragment.LLILZLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        GameTag gameTag = (GameTag) dataChannel.gg0(PreviewPagerSelectedGameItem.class);
        if (gameTag != null && (l = gameTag.id) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C480460Ism.LIZ().getClass();
        ((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).fetchPartnershipAnchorInfo(jLongValue).LJIILIIL(new C0UO0()).LJJLL(new C516201zk(liveBroadcastPreviewFragment, 121), new C09JN() { // from class: X.00ol
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("LiveBroadcastPreviewFragment@146.doFetchPartnerShipAnchorGuideInfo$2");
                C20441214yg.LJII((Throwable) obj2);
                C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.doFetchPartnerShipAnchorGuideInfo$2");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$152(C5183020f c5183020f, Object obj) {
        int iLongValue = (int) ((((Number) obj).longValue() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 60));
        C447270HgL c447270HgL = ((C429901lp) c5183020f.l0).LLILZLL;
        if (c447270HgL != null) {
            c447270HgL.setText(C497740JfY.LJIJJ(2131843576, Integer.valueOf(iLongValue)));
        }
        C429901lp c429901lp = (C429901lp) c5183020f.l0;
        c429901lp.LLJ = iLongValue;
        c429901lp.e0(0);
        return Unit.LIZ;
    }

    public static final Object invoke$153(C5183020f c5183020f, Object obj) {
        List<BannerInRoom> list;
        BroadcastPreviewBannerWidget broadcastPreviewBannerWidget = (BroadcastPreviewBannerWidget) c5183020f.l0;
        BannerInRoomCollection.BannerInfo bannerInfo = ((RoomCreateInfo) obj).bannerInfo;
        broadcastPreviewBannerWidget.LLJILJILJ = bannerInfo;
        if (bannerInfo != null && (list = bannerInfo.bannerList) != null) {
            for (BannerInRoom bannerInRoom : list) {
                switch (bannerInRoom.bannerLocation) {
                    case 6:
                        ArrayList<BannerInRoom> arrayList = broadcastPreviewBannerWidget.LLJJI.get(LiveMode.VIDEO.logStreamingType);
                        if (arrayList != null) {
                            arrayList.add(bannerInRoom);
                        }
                        break;
                    case 7:
                        ArrayList<BannerInRoom> arrayList2 = broadcastPreviewBannerWidget.LLJJI.get(LiveMode.SCREEN_RECORD.logStreamingType);
                        if (arrayList2 != null) {
                            arrayList2.add(bannerInRoom);
                        }
                        break;
                    case 8:
                        ArrayList<BannerInRoom> arrayList3 = broadcastPreviewBannerWidget.LLJJI.get(LiveMode.THIRD_PARTY.logStreamingType);
                        if (arrayList3 != null) {
                            arrayList3.add(bannerInRoom);
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        ArrayList<BannerInRoom> arrayList4 = broadcastPreviewBannerWidget.LLJJI.get(LiveMode.LIVE_STUDIO.logStreamingType);
                        if (arrayList4 != null) {
                            arrayList4.add(bannerInRoom);
                        }
                        break;
                }
            }
        }
        ((BroadcastPreviewBannerWidget) c5183020f.l0).show();
        return Unit.LIZ;
    }

    public static final Object invoke$154(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C195900pB c195900pB = ((QuickCommentWidget) c5183020f.l0).LLJJ;
        if (c195900pB != null) {
            boolValueOf = Boolean.valueOf(c195900pB.LJFF);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (zBooleanValue) {
                QuickCommentWidget quickCommentWidget = (QuickCommentWidget) c5183020f.l0;
                if (!quickCommentWidget.LLIZ) {
                    quickCommentWidget.hide();
                }
            }
        } else if (zBooleanValue) {
            QuickCommentWidget quickCommentWidget2 = (QuickCommentWidget) c5183020f.l0;
            if (!quickCommentWidget2.LLILZLL) {
                quickCommentWidget2.x1();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$155(C5183020f c5183020f, Object obj) {
        if (!C500260Jjc.LJJJI(Boolean.valueOf(((Boolean) obj).booleanValue()))) {
            ((QuickCommentWidget) c5183020f.l0).x1();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$156(C5183020f c5183020f, Object obj) {
        String str;
        GetStateResp getStateResp = (GetStateResp) obj;
        if (getStateResp != null) {
            C490301vZ c490301vZ = (C490301vZ) c5183020f.l0;
            long j = getStateResp.version;
            LayoutState layoutState = getStateResp.layout;
            if (layoutState == null) {
                layoutState = ((C490301vZ) c5183020f.l0).LL.getState().LLILLJJLI.LIZ;
            }
            C489801vU c489801vU = new C489801vU(layoutState, C13BV.INSTANCE);
            List<LinkUserState> list = getStateResp.states;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<LinkUserState> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C0110001c.LIZ(it2.next()));
            }
            BackGroundImageState backGroundImageState = getStateResp.backGroundImage;
            if (backGroundImageState != null) {
                str = backGroundImageState.stickerId;
            } else {
                str = null;
            }
            c490301vZ.LIZ(new C490701vd(j, c489801vU, arrayList, str, (String) null, 40));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$157(C5183020f c5183020f, Object obj) {
        long jLongValue;
        Long l = (Long) ((HashMap) c5183020f.l0).get(obj);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        return Long.valueOf(jLongValue);
    }

    public static final Object invoke$158(C5183020f c5183020f, Object obj) {
        C1173560ge2 c1173560ge2 = (C1173560ge2) obj;
        GetStoryOnThisDayInfoResponse getStoryOnThisDayInfoResponse = c1173560ge2.LLILZIL;
        if (getStoryOnThisDayInfoResponse == null) {
            getStoryOnThisDayInfoResponse = (GetStoryOnThisDayInfoResponse) c5183020f.l0;
        }
        return C1173560ge2.LIZ(c1173560ge2, null, null, null, getStoryOnThisDayInfoResponse, 0L, false, false, false, null, 1007);
    }

    public static final Object invoke$159(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((List) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$16(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$160(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!((Set) c5183020f.l0).contains(((Map.Entry) obj).getKey()));
    }

    public static final Object invoke$161(C5183020f c5183020f, Object obj) {
        PlaybookUtilKt.LJIILIIL(((CountdownForAllConfigWrapper) c5183020f.l0).resourceId, C0UD4.LIZIZ, new C5185020h((InterfaceC1631620sYq) obj, (InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>) 18));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$162(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static final Object invoke$163(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!((Set) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$164(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!((Set) c5183020f.l0).contains(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$165(C5183020f c5183020f, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type=\"");
        sbLIZ.append((String) ((C259800zU) c5183020f.l0).element);
        sbLIZ.append('\"');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$166(C5183020f c5183020f, Object obj) {
        ((Number) obj).intValue();
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
        return unit;
    }

    public static final Object invoke$167(C5183020f c5183020f, Object obj) {
        C310501Ih.LIZLLL("faq");
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog = (CountDownForAllV2ScoreDialog) c5183020f.l0;
        C930540aK4.LJIJI(countDownForAllV2ScoreDialog.LLJLLL, countDownForAllV2ScoreDialog.getContext(), C924240a9u.LIZ().faqUrl, true, 16);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$168(C5183020f c5183020f, Object obj) {
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog = (CountDownForAllV2ScoreDialog) c5183020f.l0;
        C782110Um9 c782110Um9 = new C782110Um9(((View) obj).getContext());
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIIZILJ(2131853895);
        c782110Um9.LJII(2131853894);
        c782110Um9.LJIILIIL(2131853896, new C515201za((CountDownForAllV2ScoreDialog) c5183020f.l0, 5));
        c782110Um9.LJIIJ(2131853893, new InterfaceC743640TFa() { // from class: X.01K7
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC512701zB((CountDownForAllV2ScoreDialog) c5183020f.l0, 4);
        countDownForAllV2ScoreDialog.LLLIIL = c782110Um9.LIZ();
        LiveDialog liveDialog = ((CountDownForAllV2ScoreDialog) c5183020f.l0).LLLIIL;
        if (liveDialog != null) {
            C786410Ut5.E4(liveDialog);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$169(C5183020f c5183020f, Object obj) {
        String string;
        String string2;
        long j;
        Long lLJII;
        String string3;
        TransitionInfo transitionInfo;
        C782110Um9 c782110Um9 = new C782110Um9(((View) obj).getContext());
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131843348);
        c782110Um9.LJIILJJIL(C497740JfY.LJIJI(2131843347), new C515201za((C01HJ) c5183020f.l0, 6));
        c782110Um9.LJIIJJI(C497740JfY.LJIJI(2131843346), new C304701Gb());
        C786410Ut5.E4(c782110Um9.LIZ());
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            ShowListUser showListUserLJIILLIIL = interfaceC302601FgLIZ.LJIILLIIL();
            String str = "";
            if (showListUserLJIILLIIL == null || (string = Long.valueOf(showListUserLJIILLIIL.userId).toString()) == null) {
                string = "";
            }
            ShowListUser showListUserLJIILL = interfaceC302601FgLIZ.LJIILL();
            if (showListUserLJIILL == null || (string2 = Long.valueOf(showListUserLJIILL.userId).toString()) == null) {
                string2 = "";
            }
            ShowContent content = interfaceC302601FgLIZ.getContent();
            if (content != null && (transitionInfo = content.transitionInfo) != null) {
                j = transitionInfo.transitionDurationOfCurrent;
            } else {
                j = 0;
            }
            Map mapLIZ = C306901Gx.LIZ();
            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ2 != null && (lLJII = interfaceC302601FgLIZ2.LJII()) != null && (string3 = lLJII.toString()) != null) {
                str = string3;
            }
            mapLIZ.put("multiguest_liveshow_id", str);
            mapLIZ.put("next_uid", string);
            mapLIZ.put("last_uid", string2);
            mapLIZ.put("duration", String.valueOf(j));
            C306901Gx.LJIL("livesdk_multiguest_anchor_liveshow_skip_interval_click", mapLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$170(C5183020f c5183020f, Object obj) {
        String str;
        C01FD.LIZ("end_guest_show");
        Object[] objArr = new Object[2];
        objArr[0] = obj;
        ShowListUser showListUserLJJIIJ = C01FC.LJJIIJ(((C01FC) c5183020f.l0).LIZJ);
        if (showListUserLJJIIJ == null || (str = showListUserLJJIIJ.nickname) == null) {
            str = "";
        }
        objArr[1] = str;
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853819, objArr));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$171(X.C5183020f r3, java.lang.Object r4) {
        /*
            java.lang.String r0 = "end_guest_show"
            X.C01FD.LIZ(r0)
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r4
            java.lang.Object r0 = r3.l0
            X.01FC r0 = (X.C01FC) r0
            webcast.data.multi_guest_play.ShowContent r1 = r0.LIZJ
            if (r1 == 0) goto L34
            java.lang.Object r0 = r3.l0
            X.01FC r0 = (X.C01FC) r0
            r0.getClass()
            webcast.data.multi_guest_play.ShowListUser r0 = X.C01FC.LJJIIJ(r1)
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.nickname
            if (r1 == 0) goto L34
        L24:
            r0 = 1
            r2[r0] = r1
            r0 = 2131853819(0x7f1181fb, float:1.9341296E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r2)
            X.C766270U4b.LJIIJJI(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            java.lang.String r1 = ""
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$171(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$172(C5183020f c5183020f, Object obj) {
        ((C212100rn) c5183020f.l0).LIZIZ.invoke(obj);
        ((C212100rn) c5183020f.l0).LIZ();
        ((C212100rn) c5183020f.l0).LJFF.invoke(obj);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$173(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$174(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$175(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static final Object invoke$176(C5183020f c5183020f, Object obj) {
        return ((Function1) c5183020f.l0).invoke(Long.valueOf(((Number) obj).longValue() / 1));
    }

    public static final Object invoke$177(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$178(C5183020f c5183020f, Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        Object obj2 = ((Map) c5183020f.l0).get(ListProtector.get(matchResult.LIZ(), 1));
        if (obj2 == null) {
            return matchResult.getValue();
        }
        return obj2;
    }

    public static final Object invoke$179(C5183020f c5183020f, Object obj) {
        LiveInviteGuestViewModel liveInviteGuestViewModel = (LiveInviteGuestViewModel) ((LiveInviteGuestSheet) c5183020f.l0).LLJLLL.getValue();
        C13BV c13bv = C13BV.INSTANCE;
        liveInviteGuestViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveInviteGuestViewModel), null, null, new C312201Iy(liveInviteGuestViewModel, "go_live_page_suggest_refresh", c13bv, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(C5183020f c5183020f, Object obj) {
        Pair pair = (Pair) ((C291001Au) obj).LIZ;
        if (pair != null) {
            ((Function2) c5183020f.l0).invoke(pair.getFirst(), Long.valueOf(((Number) pair.getSecond()).longValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$180(C5183020f c5183020f, Object obj) {
        View view = ((CountDownForAllV2SettingsDialog) c5183020f.l0).LLJZ;
        if (view != null) {
            view.requestFocus();
        }
        C310501Ih.LIZLLL("faq");
        Context context = ((CountDownForAllV2SettingsDialog) c5183020f.l0).getContext();
        if (context != null) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, C924240a9u.LIZ().faqUrl, null);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.01kl] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$181(X.C5183020f r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$181(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$182(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf;
        boolean zEnable;
        View view = ((CountDownForAllV2SettingsDialog) c5183020f.l0).LLJZ;
        if (view != null) {
            view.requestFocus();
        }
        CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = (CountDownForAllV2SettingsDialog) c5183020f.l0;
        if (countDownForAllV2SettingsDialog.LLJLLL != null) {
            CountDownForAllV2EffectPreviewDialog countDownForAllV2EffectPreviewDialog = countDownForAllV2SettingsDialog.LLLLJ;
            if (countDownForAllV2EffectPreviewDialog != null) {
                boolValueOf = Boolean.valueOf(countDownForAllV2EffectPreviewDialog.isVisible());
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf)) {
                CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog2 = (CountDownForAllV2SettingsDialog) c5183020f.l0;
                DataChannel dataChannel = countDownForAllV2SettingsDialog2.LLJLLL;
                String str = countDownForAllV2SettingsDialog2.LLLL;
                if (a0.LJJJIL(str) || Intrinsics.LJFF(str, "")) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                if (!C937280aUw.LIZIZ(((CountDownForAllV2SettingsDialog) c5183020f.l0).LLLF) || C930540aK4.LIZJ()) {
                    zEnable = CountDownEffectEnablePreviewSetting.INSTANCE.enable();
                } else {
                    zEnable = false;
                }
                CountDownForAllV2EffectPreviewDialog countDownForAllV2EffectPreviewDialog2 = new CountDownForAllV2EffectPreviewDialog(dataChannel, str, zEnable, new C5185020h((CountDownForAllV2SettingsDialog) c5183020f.l0, 26));
                CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog3 = (CountDownForAllV2SettingsDialog) c5183020f.l0;
                countDownForAllV2SettingsDialog3.LLLLJ = countDownForAllV2EffectPreviewDialog2;
                countDownForAllV2EffectPreviewDialog2.wS(null, null, "CountDownForAllV2EffectPreviewDialog");
                C319501Lt.LIZJ(countDownForAllV2SettingsDialog3.LLL, "click_effect_select_panel", countDownForAllV2SettingsDialog3.BS());
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$183(C5183020f c5183020f, Object obj) {
        ((InterfaceC469401sC) c5183020f.l0).cancel();
        return Unit.LIZ;
    }

    public static final Object invoke$184(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        ((ArrayList) ((C1109300eyO) c5183020f.l0).LLILZ).add(Integer.valueOf(iIntValue));
        return Unit.LIZ;
    }

    public static final Object invoke$185(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$186(C5183020f c5183020f, Object obj) {
        return C786410Ut5.Td(C786410Ut5.ne((Context) obj), R.layout.fe4, (FrameLayout) c5183020f.l0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$187(C5183020f c5183020f, Object obj) {
        if (!Intrinsics.LJFF(obj, ((C259800zU) c5183020f.l0).element)) {
            ((C259800zU) c5183020f.l0).element = obj;
            if (Intrinsics.LJFF(obj, C01F5.LJIIIIZZ)) {
                LinkMicAbilityManager.LJIIIZ.getClass();
                InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
                if (interfaceC941720ac6LIZIZ != null) {
                    interfaceC941720ac6LIZIZ.LJIL(C01EL.END, "header");
                }
            } else {
                LinkMicAbilityManager.LJIIIZ.getClass();
                InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
                if (interfaceC941720ac6LIZIZ2 != null) {
                    interfaceC941720ac6LIZIZ2.LJIL(C01EL.START, "header");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$188(C5183020f c5183020f, Object obj) {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = obj;
        ShowListUser showListUser = (ShowListUser) c5183020f.l0;
        if (showListUser != null) {
            str = showListUser.nickname;
        } else {
            str = null;
        }
        objArr[1] = str;
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853819, objArr));
        return Unit.LIZ;
    }

    public static final Object invoke$189(C5183020f c5183020f, Object obj) {
        Pair pair = (Pair) obj;
        ((Function2) c5183020f.l0).invoke(pair.getFirst(), pair.getSecond());
        return Unit.LIZ;
    }

    public static final Object invoke$19(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue <= 0) {
            return ((Context) c5183020f.l0).getString(2131830182);
        }
        return ((Context) c5183020f.l0).getString(2131830183, String.valueOf(iIntValue));
    }

    public static final Object invoke$190(C5183020f c5183020f, Object obj) {
        return ((LinkedHashMap) c5183020f.l0).get(Long.valueOf(((Number) obj).longValue()));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.01kT] */
    public static final Object invoke$191(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        C422301kb c422301kb;
        C946060aj6 c946060aj6 = (C946060aj6) obj;
        C422301kb c422301kb2 = (C422301kb) c946060aj6.LIZ();
        if (c422301kb2 != null) {
            int i = C422001kY.LIZ[c422301kb2.LIZJ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    BaseVmWidget baseVmWidget = (BaseVmWidget) c5183020f.l0;
                    baseVmWidget.LLILLJJLI = c422301kb2;
                    C946050aj5 c946050aj5LIZIZ = c946060aj6.LIZIZ();
                    if (baseVmWidget.LLILLL == null && (c422301kb = baseVmWidget.LLILLJJLI) != null) {
                        baseVmWidget.LLILLL = new DialogC423101kj(baseVmWidget.context, baseVmWidget.LLILZIL, C497740JfY.LJIJJ(2131843215, C01E8.LJ(c422301kb.LIZIZ)));
                    }
                    DialogC423101kj dialogC423101kj = baseVmWidget.LLILLL;
                    if (dialogC423101kj != null) {
                        dialogC423101kj.show();
                        C785410UrT.LIZIZ(dialogC423101kj);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(dialogC423101kj);
                        C816490W1f.LIZ(dialogC423101kj);
                    }
                    if (c946050aj5LIZIZ != null) {
                        c946050aj5LIZIZ.LJFF(0);
                    }
                    DialogC423101kj dialogC423101kj2 = baseVmWidget.LLILLL;
                    if (dialogC423101kj2 != null) {
                        dialogC423101kj2.setOnDismissListener(new DialogInterfaceOnDismissListenerC512601zA(baseVmWidget, c946050aj5LIZIZ, 1));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                BaseVmWidget baseVmWidget2 = (BaseVmWidget) c5183020f.l0;
                baseVmWidget2.LLILLJJLI = c422301kb2;
                CountdownConfig countdownConfig = c422301kb2.LIZLLL;
                if (countdownConfig == null) {
                    countdownConfig = (CountdownConfig) baseVmWidget2.dataChannel.gg0(C956850b0V.class);
                }
                final BaseVmWidget baseVmWidget3 = (BaseVmWidget) c5183020f.l0;
                final C946050aj5 c946050aj5LIZIZ2 = c946060aj6.LIZIZ();
                final String str = c946060aj6.LIZIZ;
                final C334801Rq c334801Rq = c946060aj6.LJIILIIL;
                if (baseVmWidget3.LLILZ == null) {
                    Context context = baseVmWidget3.context;
                    ?? r7 = new InterfaceC422501kd() { // from class: X.01kT
                        @Override // X.InterfaceC422501kd
                        public final void LIZ(CountdownConfig countdownConfig2, boolean z) {
                            BaseVmWidget<BaseCountdownViewModel> baseVmWidget4 = baseVmWidget3;
                            C422301kb c422301kb3 = baseVmWidget4.LLILLJJLI;
                            if (c422301kb3 != null) {
                                C334801Rq c334801Rq2 = c334801Rq;
                                String str2 = str;
                                C01GT<C422301kb> c01gt = c946050aj5LIZIZ2;
                                VM vm = baseVmWidget4.LL;
                                if (vm != 0) {
                                    long j = c422301kb3.LIZ;
                                    String str3 = c422301kb3.LIZIZ;
                                    CountdownStartParams countdownStartParams = new CountdownStartParams();
                                    countdownStartParams.userId = j;
                                    countdownStartParams.linkmicId = str3;
                                    countdownStartParams.countdownConfig = countdownConfig2;
                                    countdownStartParams.channelId = vm.getChannelId();
                                    countdownStartParams.roomId = vm.yQ2();
                                    countdownStartParams.mgTraceInfo = C01IF.LIZ(c334801Rq2);
                                    InterfaceC421301kR interfaceC421301kRLIZIZ = C01EG.LIZIZ();
                                    if (interfaceC421301kRLIZIZ != null) {
                                        interfaceC421301kRLIZIZ.startOneCountdownPlay(countdownStartParams);
                                    }
                                    HashSet<String> hashSet = vm.LLILLL;
                                    if (z) {
                                        hashSet.add(str3);
                                    } else {
                                        hashSet.remove(str3);
                                    }
                                }
                                if (C937280aUw.LIZ(str2) && c01gt != null) {
                                    c01gt.LIZ(new C422301kb(c422301kb3.LIZ, c422301kb3.LIZIZ, c422301kb3.LIZJ, countdownConfig2));
                                }
                            }
                            DialogC20518615Qq dialogC20518615Qq = baseVmWidget3.LLILZ;
                            if (dialogC20518615Qq != null) {
                                dialogC20518615Qq.dismiss();
                                C785410UrT.LIZ(dialogC20518615Qq);
                            }
                        }
                    };
                    C422301kb c422301kb3 = baseVmWidget3.LLILLJJLI;
                    String str2 = null;
                    if (c422301kb3 != null) {
                        lValueOf = Long.valueOf(c422301kb3.LIZ);
                    } else {
                        lValueOf = null;
                    }
                    String strValueOf = String.valueOf(lValueOf);
                    C422301kb c422301kb4 = baseVmWidget3.LLILLJJLI;
                    if (c422301kb4 != null) {
                        str2 = c422301kb4.LIZIZ;
                    }
                    baseVmWidget3.LLILZ = new DialogC20518615Qq(context, r7, strValueOf, String.valueOf(str2), countdownConfig, baseVmWidget3.dataChannel);
                }
                DialogC20518615Qq dialogC20518615Qq = baseVmWidget3.LLILZ;
                if (dialogC20518615Qq != null) {
                    dialogC20518615Qq.show();
                    C785410UrT.LIZIZ(dialogC20518615Qq);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC20518615Qq);
                    C816490W1f.LIZ(dialogC20518615Qq);
                }
                DialogC20518615Qq dialogC20518615Qq2 = baseVmWidget3.LLILZ;
                if (dialogC20518615Qq2 != null) {
                    dialogC20518615Qq2.setOnDismissListener(new DialogInterfaceOnDismissListenerC512601zA(baseVmWidget3, c946050aj5LIZIZ2, 2));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$192(C5183020f c5183020f, Object obj) {
        ((Boolean) obj).booleanValue();
        ((C01IT) c5183020f.l0).LJIIJ("audience_enter_room_first", true);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$193(X.C5183020f r8, java.lang.Object r9) {
        /*
            java.lang.Number r9 = (java.lang.Number) r9
            long r2 = r9.longValue()
            java.lang.Object r0 = r8.l0
            X.01lx r0 = (X.DialogC430701lx) r0
            java.lang.String r0 = r0.LLJJI
            boolean r0 = X.C937280aUw.LIZIZ(r0)
            r7 = 60
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r0 != 0) goto L3c
            java.lang.Object r0 = r8.l0
            X.01lx r0 = (X.DialogC430701lx) r0
            r0.getClass()
            boolean r0 = X.DialogC430701lx.LJLILLLLZI()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r8.l0
            X.01lx r0 = (X.DialogC430701lx) r0
            X.01lz r5 = r0.LLJILJIL
            webcast.data.multi_guest_play.ShowConfig r4 = r0.LJLIIIL()
            long r0 = (long) r6
            long r2 = r2 / r0
            long r0 = (long) r7
            long r2 = r2 / r0
            r0 = 60
            long r2 = r2 * r0
            r4.durationPerGuest = r2
            r5.LJI(r4)
        L39:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            java.lang.Object r1 = r8.l0
            X.01lx r1 = (X.DialogC430701lx) r1
            r0 = 0
            r1.LJLI(r0)
            long r0 = (long) r6
            long r2 = r2 / r0
            long r0 = (long) r7
            long r2 = r2 / r0
            int r1 = (int) r2
            java.lang.Object r0 = r8.l0
            X.01lx r0 = (X.DialogC430701lx) r0
            r0.LJLJJLL(r1)
            java.lang.Object r0 = r8.l0
            X.01lx r0 = (X.DialogC430701lx) r0
            java.lang.String r0 = r0.LLJJI
            boolean r0 = X.C937280aUw.LIZIZ(r0)
            if (r0 != 0) goto L65
            java.lang.Object r0 = r8.l0
            X.01lx r0 = (X.DialogC430701lx) r0
            X.01lz r0 = r0.LLJILJIL
            r0.LJ(r1)
        L65:
            java.lang.Object r0 = r8.l0
            X.01lx r0 = (X.DialogC430701lx) r0
            X.01lz r1 = r0.LLJILJIL
            webcast.data.multi_guest_play.ShowConfig r0 = r0.LJLIIIL()
            r1.LIZJ(r0)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$193(X.020f, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$194(X.C5183020f r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$194(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$195(C5183020f c5183020f, Object obj) {
        C1389890mGx c1389890mGx = new C1389890mGx((View) c5183020f.l0);
        c1389890mGx.LJIIIZ(2131834380);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$196(C5183020f c5183020f, Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        Object obj2 = ((Map) c5183020f.l0).get(ListProtector.get(matchResult.LIZ(), 1));
        if (obj2 == null) {
            return matchResult.getValue();
        }
        return obj2;
    }

    public static final Object invoke$197(C5183020f c5183020f, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fFloatValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$198(C5183020f c5183020f, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fFloatValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$199(C5183020f c5183020f, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fFloatValue));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Long] */
    public static final Object invoke$2(C5183020f c5183020f, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        ((C259800zU) c5183020f.l0).element = Long.valueOf(jLongValue);
        return Unit.LIZ;
    }

    public static final Object invoke$20(C5183020f c5183020f, Object obj) {
        return ((C381901e5) c5183020f.l0).LIZIZ;
    }

    public static final Object invoke$200(C5183020f c5183020f, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fFloatValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$201(C5183020f c5183020f, Object obj) {
        ((SelectorLoadingVM) c5183020f.l0).getClass();
        return new C234300vN(new C291001Au(Boolean.FALSE));
    }

    public static final Object invoke$202(C5183020f c5183020f, Object obj) {
        ((Boolean) obj).booleanValue();
        ((C01JP) c5183020f.l0).LIZ(60L);
        return Unit.LIZ;
    }

    public static final Object invoke$203(C5183020f c5183020f, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$204(C5183020f c5183020f, Object obj) {
        String aid;
        String aid2 = ((Aweme) obj).getAid();
        Aweme aweme = (Aweme) c5183020f.l0;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(aid2, aid));
    }

    public static final Object invoke$205(C5183020f c5183020f, Object obj) {
        String aid;
        String aid2 = ((Aweme) obj).getAid();
        Aweme aweme = (Aweme) c5183020f.l0;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(aid2, aid));
    }

    public static final Object invoke$206(C5183020f c5183020f, Object obj) {
        String aid;
        String aid2 = ((Aweme) obj).getAid();
        Aweme aweme = (Aweme) c5183020f.l0;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(aid2, aid));
    }

    public static final Object invoke$207(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((Set) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$208(C5183020f c5183020f, Object obj) {
        ((C499301x1) c5183020f.l0).LIZIZ("return_foreground_compensator", (JSONObject) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$209(C5183020f c5183020f, Object obj) {
        ((C499301x1) c5183020f.l0).LIZIZ("ready_compensator", (JSONObject) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$21(C5183020f c5183020f, Object obj) {
        return ((C381901e5) c5183020f.l0).LIZJ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$210(C5183020f c5183020f, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            LiveDialog liveDialog = (LiveDialog) c5183020f.l0;
            if (liveDialog != null) {
                C786410Ut5.E4(liveDialog);
            }
        } else {
            LiveDialog liveDialog2 = (LiveDialog) c5183020f.l0;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
                C785410UrT.LIZ(liveDialog2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$211(C5183020f c5183020f, Object obj) {
        return ((Map) c5183020f.l0).get(obj);
    }

    public static final Object invoke$212(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!((List) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$213(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!((List) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$214(C5183020f c5183020f, Object obj) {
        boolean z;
        GuestShowdownUser guestShowdownUser = (GuestShowdownUser) obj;
        Iterator it2 = ((Set) c5183020f.l0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((GuestShowdownUser) next).linkmicId, guestShowdownUser.linkmicId)) {
                if (next != null) {
                    z = true;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public static final Object invoke$215(C5183020f c5183020f, Object obj) {
        Integer numValueOf;
        MutableLiveData<List<C00UM>> mutableLiveData;
        List<C00UM> value;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchRecordList success size:");
        sbLIZ.append(((List) obj).size());
        sbLIZ.append(" templateSize:");
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = ((TextHeaderListFragment) c5183020f.l0).LL;
        if (anchorTextHeaderViewModel != null && (mutableLiveData = anchorTextHeaderViewModel.LLJILJILJ) != null && (value = mutableLiveData.getValue()) != null) {
            numValueOf = Integer.valueOf(value.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderListFragment", 2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$216(C5183020f c5183020f, Object obj) {
        C01ZA c01za;
        List<C01ZA> value;
        List<C00UM> value2;
        MutableLiveData<List<C00UM>> mutableLiveData;
        MutableLiveData<List<C01ZA>> mutableLiveData2;
        MutableLiveData mutableLiveData3;
        ((Boolean) obj).booleanValue();
        TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) c5183020f.l0;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = textHeaderListFragment.LL;
        if (anchorTextHeaderViewModel != null && (mutableLiveData3 = anchorTextHeaderViewModel.LLILZLL) != null) {
            c01za = (C01ZA) mutableLiveData3.getValue();
        } else {
            c01za = null;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = ((TextHeaderListFragment) c5183020f.l0).LL;
        if (anchorTextHeaderViewModel2 == null || (mutableLiveData2 = anchorTextHeaderViewModel2.LLJILJIL) == null || (value = mutableLiveData2.getValue()) == null) {
            value = C13BV.INSTANCE;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel3 = ((TextHeaderListFragment) c5183020f.l0).LL;
        if (anchorTextHeaderViewModel3 == null || (mutableLiveData = anchorTextHeaderViewModel3.LLJILJILJ) == null || (value2 = mutableLiveData.getValue()) == null) {
            value2 = C13BV.INSTANCE;
        }
        textHeaderListFragment.PR(c01za, value, value2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$217(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static final Object invoke$218(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(((C291001Au) obj).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$219(C5183020f c5183020f, Object obj) {
        Map map = (Map) obj;
        Iterator<String> itKeys = ((JSONObject) c5183020f.l0).keys();
        JSONObject jSONObject = (JSONObject) c5183020f.l0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object objValueOf = jSONObject.get(next);
                if (objValueOf instanceof Boolean) {
                    objValueOf = Integer.valueOf(((Boolean) objValueOf).booleanValue() ? 1 : 0);
                }
                C189200o6.m2constructorimpl(map.put(next, objValueOf));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((Set) c5183020f.l0).contains(Integer.valueOf(((View) obj).getId())));
    }

    public static final Object invoke$220(C5183020f c5183020f, Object obj) {
        ((C216800sY) c5183020f.l0).getClass();
        throw null;
    }

    public static final Object invoke$221(C5183020f c5183020f, Object obj) {
        boolean z;
        User user = ((LinkedUserInfo) obj).userInfo;
        if (user != null && user.getId() == ((C1AF3) c5183020f.l0).LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(!z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$222(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static final Object invoke$223(C5183020f c5183020f, Object obj) {
        String aid;
        String aid2 = ((Aweme) obj).getAid();
        Aweme aweme = (Aweme) c5183020f.l0;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(aid2, aid));
    }

    public static final Object invoke$224(C5183020f c5183020f, Object obj) {
        String aid;
        String aid2 = ((Aweme) obj).getAid();
        Aweme aweme = (Aweme) c5183020f.l0;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(aid2, aid));
    }

    public static final Object invoke$225(C5183020f c5183020f, Object obj) {
        String aid;
        String aid2 = ((Aweme) obj).getAid();
        Aweme aweme = (Aweme) c5183020f.l0;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(aid2, aid));
    }

    public static final Object invoke$226(C5183020f c5183020f, Object obj) {
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) obj;
        DataChannel dataChannel = ((GameAutoCoverMarkWidget) c5183020f.l0).dataChannel;
        if (dataChannel != null) {
            boolean z = true;
            if (roomCreateInfo.screenShotCoverStatus != 1) {
                z = false;
            }
            dataChannel.zW(GameAutoCoverChannel.class, Boolean.valueOf(z));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$227(C5183020f c5183020f, Object obj) {
        Iterable iterable;
        List<Long> list = (List) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observe music gift ");
        sbLIZ.append(list);
        C20441214yg.LIZIZ("favoritegift", C2188811AlT.LIZIZ(sbLIZ));
        C212100rn c212100rnLJJLIIIJLJLI = ((C1128710fTh) c5183020f.l0).LJJLIIIJLJLI();
        AnonymousClass0206 anonymousClass0206 = AnonymousClass0206.get$arr$(389);
        c212100rnLJJLIIIJLJLI.LJ.invoke("music_favorite_event");
        ArrayList<GiftPage> arrayListInvoke = c212100rnLJJLIIIJLJLI.LIZ.invoke();
        C5183020f c5183020f2 = new C5183020f(c212100rnLJJLIIIJLJLI, 172);
        GiftPage giftPageLIZ = C177800mG.LIZ(arrayListInvoke);
        if (giftPageLIZ == null || (iterable = giftPageLIZ.favouriteGifts) == null) {
            iterable = C13BV.INSTANCE;
        }
        List listLLIIII = C13LP.LLIIII(iterable);
        C1128830fTt.LJI(arrayListInvoke, list, 18);
        List listLIZIZ = C177800mG.LIZIZ(arrayListInvoke);
        C177800mG.LIZLLL(arrayListInvoke);
        C177800mG.LIZJ(arrayListInvoke);
        IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
        if (iMusicGiftService != null) {
            iMusicGiftService.py1(list);
        }
        final C177900mH c177900mH = new C177900mH(arrayListInvoke, listLIZIZ, listLLIIII, c5183020f2, anonymousClass0206);
        C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        String strLJJJLL = a0.LJJJLL(e3.f, a0.LJJJJZ(e3.e, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list)));
        InterfaceC211900rl interfaceC211900rl = new InterfaceC211900rl() { // from class: X.00rk
            @Override // X.InterfaceC211900rl
            public final void LLJJIJIL() {
                c177900mH.invoke();
            }
        };
        giftRepository.getClass();
        C1129650fVD.LJ(currentUserId, strLJJJLL, interfaceC211900rl, 18);
        c212100rnLJJLIIIJLJLI.LIZIZ.invoke(arrayListInvoke);
        c212100rnLJJLIIIJLJLI.LIZ();
        c212100rnLJJLIIIJLJLI.LJFF.invoke(arrayListInvoke);
        return Unit.LIZ;
    }

    public static final Object invoke$228(C5183020f c5183020f, Object obj) {
        ((C1128710fTh) c5183020f.l0).LLLIL = (ArrayList) obj;
        return Unit.LIZ;
    }

    public static final Object invoke$229(C5183020f c5183020f, Object obj) {
        ((C1128710fTh) c5183020f.l0).LL((ArrayList) obj, false);
        return Unit.LIZ;
    }

    public static final Object invoke$23(C5183020f c5183020f, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C01SE c01se = (C01SE) c5183020f.l0;
            if (!c01se.LLILZLL) {
                C480460Ism.LIZ().getClass();
                c01se.LLIZ = (C11JF) ((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).addGamePartnershipBusinessStatus(1).LJIILIIL(new C0UO0()).LJJLIIIJJIZ(3L).LJJLL(new C516201zk(c01se, 21), new C09JN() { // from class: X.00qR
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("GamePartnershipBeforeVideoLiveSlotWidget@fc30.tryPlugGamesInVideoLive$2");
                        C20441214yg.LJI("GameCpVideoLive", (Throwable) obj2);
                        C1C7U.LIZIZ("GamePartnershipBeforeVideoLiveSlotWidget@fc30.tryPlugGamesInVideoLive$2");
                    }
                });
            }
        } else {
            C01SE c01se2 = (C01SE) c5183020f.l0;
            if (c01se2.LLILZLL) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01SC(c01se2, null), 2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$230(C5183020f c5183020f, Object obj) {
        ((C1128710fTh) c5183020f.l0).LJLJJI((Gift) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$231(C5183020f c5183020f, Object obj) {
        C01KP c01kp = (C01KP) obj;
        C01KK c01kk = ((C1127650fRz) c5183020f.l0).LLJILLL;
        if (c01kk != null) {
            long j = c01kp.LIZ;
            long j2 = c01kp.LIZIZ;
            List<Long> list = c01kp.LIZJ;
            if (!list.isEmpty()) {
                if (!c01kk.LIZJ.invoke().booleanValue()) {
                    C20441214yg.LIZIZ("CampaignProgressRefresher", "skip refresh: banner not visible");
                } else {
                    if (c01kk.LJIIIZ != j || c01kk.LJIIJ != j2) {
                        c01kk.LJII.clear();
                    }
                    c01kk.LJIIIZ = j;
                    c01kk.LJIIJ = j2;
                    c01kk.LJII.addAll(list);
                    long j3 = c01kk.LJIIJJI + 1;
                    c01kk.LJIIJJI = j3;
                    AnonymousClass0956 anonymousClass0956 = c01kk.LJIIIIZZ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c01kk.LJIIIIZZ = C23250099c.LIZLLL(c01kk.LIZ, c01kk.LJFF, null, new C01KN(c01kk, j3, null), 2);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$232(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((Set) c5183020f.l0).contains(Long.valueOf(((Gift) obj).id)));
    }

    public static final Object invoke$233(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((Set) c5183020f.l0).contains(Long.valueOf(((Gift) obj).id)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$234(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static final Object invoke$235(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((EmoteModel) obj).emoteId, ((EmoteModel) c5183020f.l0).emoteId));
    }

    public static final Object invoke$236(C5183020f c5183020f, Object obj) {
        boolean z;
        HotRoomData.HotRoomState hotRoomState = (HotRoomData.HotRoomState) obj;
        Iterator it2 = ((Set) c5183020f.l0).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (hotRoomState.reason == ((HotRoomData.HotRoomState) next).reason) {
                if (next == null) {
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public static final Object invoke$237(C5183020f c5183020f, Object obj) {
        boolean z;
        HotRoomData.HotRoomState hotRoomState = (HotRoomData.HotRoomState) obj;
        Iterator it2 = ((Set) c5183020f.l0).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (hotRoomState.reason == ((HotRoomData.HotRoomState) next).reason) {
                if (next == null) {
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public static final Object invoke$238(C5183020f c5183020f, Object obj) {
        C1842860y3Y c1842860y3Y = (C1842860y3Y) c5183020f.l0;
        int i = ((RankTabInfo) obj).rankType;
        c1842860y3Y.getClass();
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        return Boolean.valueOf(!(!Intrinsics.LJFF(C235000vU.LIZ(i, 0), RankTypeV2.LJJIJIIJI)));
    }

    public static final Object invoke$239(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(Integer.valueOf((int) (80 + (((Number) obj).floatValue() * 20))));
        return Unit.LIZ;
    }

    public static final Object invoke$24(C5183020f c5183020f, Object obj) {
        try {
            ((C928790aHF) c5183020f.l0).N5(Long.valueOf(((Number) obj).longValue()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C928790aHF) c5183020f.l0).getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ.append('_');
            sbLIZ.append("MultiGuestUpdateUserInfoHelper");
            sbLIZ.append('_');
            sbLIZ.append(76);
            C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "removeReservationCard failed", th.getMessage(), null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$240(C5183020f c5183020f, Object obj) {
        List list = (List) obj;
        final GiftWidgetKotlin giftWidgetKotlin = (GiftWidgetKotlin) c5183020f.l0;
        giftWidgetKotlin.getClass();
        ArrayList arrayList = (ArrayList) giftWidgetKotlin.LLLF;
        C1128830fTt.LJI(arrayList, list, 1);
        String strLJJJLL = a0.LJJJLL(e3.f, a0.LJJJJZ(e3.e, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list)));
        C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        InterfaceC211900rl interfaceC211900rl = new InterfaceC211900rl() { // from class: X.00rq
            @Override // X.InterfaceC211900rl
            public final void LLJJIJIL() {
                C766270U4b.LJFF(2131843764, giftWidgetKotlin.context);
            }
        };
        giftRepository.getClass();
        C1129650fVD.LJ(currentUserId, strLJJJLL, interfaceC211900rl, 1);
        GiftManager.inst().updateFavoriteGift(new ArrayList(arrayList));
        GiftLeafRootWidget giftLeafRootWidget = giftWidgetKotlin.LLILZIL;
        if (giftLeafRootWidget != null) {
            giftLeafRootWidget.LL.LIZ = arrayList;
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$241(C5183020f c5183020f, Object obj) {
        int i;
        View viewFindViewById = ((GiftWidgetKotlin) c5183020f.l0).contentView.findViewById(R.id.pbd);
        if (obj == EnumC1083260eIO.SHOW) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$242(C5183020f c5183020f, Object obj) {
        int i;
        View viewFindViewById = ((GiftWidgetKotlin) c5183020f.l0).contentView.findViewById(R.id.pbd);
        if (((Boolean) ((Pair) obj).getFirst()).booleanValue()) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$243(C5183020f c5183020f, Object obj) {
        Float f = (Float) obj;
        View viewFindViewById = ((GiftWidgetKotlin) c5183020f.l0).contentView.findViewById(R.id.pbd);
        if (f != null) {
            C786410Ut5.T4(viewFindViewById, f.floatValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$244(C5183020f c5183020f, Object obj) {
        GiftListResult giftListResult;
        List<GiftPage> list;
        Gift next;
        C007E c007e = (C007E) obj;
        if (((GiftWidgetKotlin) c5183020f.l0).B1() && (giftListResult = GiftManager.inst().getGiftListResult()) != null && (list = giftListResult.giftPages) != null) {
            Iterator<GiftPage> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator<Gift> it3 = it2.next().gifts.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (next.id == c007e.LIZ) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Gift gift = next;
                if (gift != null) {
                    gift.image = c007e.LIZIZ;
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$245(C5183020f c5183020f, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1)));
        sbLIZ.append('s');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TextView textView = ((C12VS) c5183020f.l0).LLLIL;
        if (textView == null) {
            textView = null;
        }
        textView.setText(strLIZIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$246(C5183020f c5183020f, Object obj) {
        Context context;
        View rootView = ((View) c5183020f.l0).getRootView();
        if (rootView != null && (context = rootView.getContext()) != null) {
            C01Z9.LIZLLL(context);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$247(C5183020f c5183020f, Object obj) {
        ((Number) obj).intValue();
        ((PlaybookEditorDialog) c5183020f.l0).LLLLL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$248(C5183020f c5183020f, Object obj) {
        ((Number) obj).intValue();
        ((PlaybookEditorDialog) c5183020f.l0).LLLLJI = null;
        return Unit.LIZ;
    }

    public static final Object invoke$249(C5183020f c5183020f, Object obj) {
        ((InterfaceC420801kM) c5183020f.l0).dispose();
        return Unit.LIZ;
    }

    public static final Object invoke$25(C5183020f c5183020f, Object obj) {
        CharSequence text;
        CharSequence charSequence = (CharSequence) obj;
        C16F5 c16f5 = (C16F5) c5183020f.l0;
        if (c16f5 != null) {
            c16f5.setText(charSequence);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTextForRightTagView ");
        C16F5 c16f52 = (C16F5) c5183020f.l0;
        if (c16f52 != null) {
            text = c16f52.getText();
        } else {
            text = null;
        }
        sbLIZ.append((Object) text);
        C20441214yg.LJIIIZ("RightTagViewUtils", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$250(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((List) c5183020f.l0).contains(Long.valueOf(((Number) obj).longValue())));
    }

    public static final Object invoke$251(C5183020f c5183020f, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
        return unit;
    }

    public static final Object invoke$252(C5183020f c5183020f, Object obj) {
        String str;
        GuessRound guessRound = ((GuessWidget) obj).guessRound;
        String str2 = null;
        if (guessRound != null) {
            str = guessRound.roundIdStr;
        } else {
            str = null;
        }
        GuessRound guessRound2 = ((GuessWidget) c5183020f.l0).guessRound;
        if (guessRound2 != null) {
            str2 = guessRound2.roundIdStr;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, str2));
    }

    public static final Object invoke$253(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(Integer.valueOf(((Number) obj).intValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$254(C5183020f c5183020f, Object obj) {
        LiveEffect liveEffect = (LiveEffect) obj;
        C336201Se c336201Se = ((C445880He6) c5183020f.l0).LLILLJJLI;
        AnonymousClass0956 anonymousClass0956 = c336201Se.LIZLLL;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856559));
        } else {
            C054G c054g = c336201Se.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            c336201Se.LIZLLL = C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C334301Rl(liveEffect, c336201Se, null), 2);
        }
        Function0<Unit> onDialogDismiss = ((C445880He6) c5183020f.l0).getOnDialogDismiss();
        if (onDialogDismiss != null) {
            onDialogDismiss.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$255(C5183020f c5183020f, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$256(C5183020f c5183020f, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$257(C5183020f c5183020f, Object obj) {
        int size;
        ImageModel avatarThumb;
        C0J9U c0j9u = (C0J9U) obj;
        if (C500260Jjc.LJJIJIIJI(c0j9u.LIZ)) {
            C445980HeG c445980HeG = ((MultiPreviewInviteGuestWidget) c5183020f.l0).LLILZIL;
            if (c445980HeG != null) {
                List<User> list = c0j9u.LIZ;
                List<? extends ImageModel> listLL = null;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (User user : list) {
                        if (user != null) {
                            avatarThumb = user.getAvatarThumb();
                        } else {
                            avatarThumb = null;
                        }
                        arrayList.add(avatarThumb);
                    }
                    listLL = C13LP.LL(arrayList, 3);
                }
                c445980HeG.setAvatarImages(listLL);
            }
            List<User> list2 = c0j9u.LIZ;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            String strLJIIL = C497740JfY.LJIIL(2131755918, size, Integer.valueOf(size));
            TuxTextView tuxTextView = ((MultiPreviewInviteGuestWidget) c5183020f.l0).LLILZLL;
            if (tuxTextView != null) {
                tuxTextView.setText(strLJIIL);
            }
        } else {
            C445980HeG c445980HeG2 = ((MultiPreviewInviteGuestWidget) c5183020f.l0).LLILZIL;
            if (c445980HeG2 != null) {
                c445980HeG2.setAvatarImages(C13BV.INSTANCE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$258(C5183020f c5183020f, Object obj) {
        Integer num = (Integer) obj;
        boolean z = true;
        if (num != null && num.intValue() == 1) {
            z = false;
        }
        if (MultiGuestGuideEnableInviteModuleSetting.INSTANCE.isEnable()) {
            z = ((MultiPreviewInviteGuestWidget) c5183020f.l0).LLIZ;
        }
        if (z) {
            ((MultiPreviewInviteGuestWidget) c5183020f.l0).show();
        } else {
            ((MultiPreviewInviteGuestWidget) c5183020f.l0).hide();
        }
        Function1<? super Boolean, Unit> function1 = ((MultiPreviewInviteGuestWidget) c5183020f.l0).LLILZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$259(C5183020f c5183020f, Object obj) {
        C308301Hl.LIZLLL(C308301Hl.LIZ, "party_ranking_page_end", "setting", null, null, null, null, 0L, 124);
        C01UR c01ur = ((GuestShowdownEndDialog) c5183020f.l0).LLLFF;
        if (c01ur != null) {
            c01ur.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(C5183020f c5183020f, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeForever AigcWallpaperStatus ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("LinkMicAbilityManager", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            ((LinkMicAbilityManager) c5183020f.l0).LJIL(C01EL.START, "aigc");
        } else {
            ((LinkMicAbilityManager) c5183020f.l0).LJIL(C01EL.END, "aigc");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$260(C5183020f c5183020f, Object obj) {
        C01UR c01ur = ((GuestShowdownEndDialog) c5183020f.l0).LLLFF;
        if (c01ur != null) {
            c01ur.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$261(C5183020f c5183020f, Object obj) {
        C308301Hl.LIZLLL(C308301Hl.LIZ, "party_ranking_page_end", "start_again", null, null, null, null, 0L, 124);
        GuestShowdownEndDialog guestShowdownEndDialog = (GuestShowdownEndDialog) c5183020f.l0;
        C01UR c01ur = guestShowdownEndDialog.LLLFF;
        if (c01ur != null) {
            c01ur.LIZIZ(guestShowdownEndDialog.LLLFFI);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$262(C5183020f c5183020f, Object obj) {
        C01Z9.LIZLLL(((GuestShowdownEndDialog) c5183020f.l0).getContext());
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$263(C5183020f c5183020f, Object obj) {
        C201600q6 c201600q6;
        List<C2757014x> list;
        C2757014x next;
        HostBoard hostBoard;
        HostBoard hostBoard2;
        boolean z;
        String strLJIJJ;
        DonationInfoMessage donationInfoMessage = (DonationInfoMessage) obj;
        C261600zm c261600zm = (C261600zm) c5183020f.l0;
        String strValueOf = String.valueOf(donationInfoMessage.fundraiserId);
        String str = donationInfoMessage.goalAmount;
        String str2 = donationInfoMessage.totalMoney;
        c261600zm.getClass();
        if (strValueOf.length() != 0 && Intrinsics.LJFF(strValueOf, c261600zm.LLILZ) && (c201600q6 = (C201600q6) ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).w71(C011V.BROADCAST, 0L).getValue()) != null && (list = c201600q6.LIZ) != null) {
            Iterator<C2757014x> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ.boardId, c261600zm.LLILZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C2757014x c2757014x = next;
            if (c2757014x != null && (hostBoard = c2757014x.LIZ) != null && (hostBoard2 = (HostBoard) GsonProtectorUtils.fromJson(new Gson(), GsonProtectorUtils.toJson(new Gson(), hostBoard), HostBoard.class)) != null) {
                BoardCell boardCell = (BoardCell) C13LP.LJJLIIIJJI(hostBoard2.cellList);
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    strLJIJJ = C497740JfY.LJIJJ(2131824911, str2, str, c261600zm.LLILLL);
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131824910, str2, c261600zm.LLILLL);
                }
                boardCell.text = strLJIJJ;
                ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).fR(hostBoard2, C011V.BROADCAST, 0L);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$264(C5183020f c5183020f, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        C419910GdJ c419910GdJ = (C419910GdJ) c5183020f.l0;
        if (c419910GdJ.LIZIZ < 0) {
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        C419910GdJ c419910GdJ2 = (C419910GdJ) c5183020f.l0;
        if (c419910GdJ2.LIZJ < 0) {
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        TuxIconView tuxIconView = new TuxIconView(viewGroup.getContext(), null, 0, 6, null == true ? 1 : 0);
        tuxIconView.setTuxIcon((C419910GdJ) c5183020f.l0);
        viewGroup.addView(tuxIconView, new FrameLayout.LayoutParams(-2, -2));
        return Unit.LIZ;
    }

    public static final Object invoke$265(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue < 1) {
            return ((Context) c5183020f.l0).getString(2131831419);
        }
        return ((Context) c5183020f.l0).getString(2131830166, String.valueOf(iIntValue));
    }

    public static final Object invoke$266(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        return ((Context) c5183020f.l0).getResources().getQuantityString(2131755191, iIntValue, String.valueOf(iIntValue));
    }

    public static final Object invoke$267(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(iIntValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$268(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Aweme) obj).getAid(), ((Aweme) c5183020f.l0).getAid()));
    }

    public static final Object invoke$269(C5183020f c5183020f, Object obj) {
        ((InterfaceC1631620sYq) obj).invoke("", "", (List) c5183020f.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$27(C5183020f c5183020f, Object obj) {
        Map<String, C01EL> map = (Map) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeForever, playStateMap: ");
        sbLIZ.append(map);
        C20441214yg.LIZIZ("MutexAbilityManager", C2188811AlT.LIZIZ(sbLIZ));
        LinkMicAbilityManager linkMicAbilityManager = (LinkMicAbilityManager) c5183020f.l0;
        for (Map.Entry<String, C01EL> entry : map.entrySet()) {
            if (linkMicAbilityManager.LJII.get(entry.getKey()) != entry.getValue()) {
                linkMicAbilityManager.LJIL(entry.getValue(), entry.getKey());
            }
        }
        ((LinkMicAbilityManager) c5183020f.l0).LJII = map;
        return Unit.LIZ;
    }

    public static final Object invoke$270(C5183020f c5183020f, Object obj) {
        ((InterfaceC1631620sYq) obj).invoke("", "", (List) c5183020f.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$271(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) ((WeakReference) c5183020f.l0).get();
        if (function1 != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$272(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) ((WeakReference) c5183020f.l0).get();
        if (function1 != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$273(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) ((WeakReference) c5183020f.l0).get();
        if (function1 != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$274(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) ((WeakReference) c5183020f.l0).get();
        if (function1 != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$275(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) ((WeakReference) c5183020f.l0).get();
        if (function1 != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$276(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) ((WeakReference) c5183020f.l0).get();
        if (function1 != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$277(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!((Set) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$278(C5183020f c5183020f, Object obj) {
        Object obj2 = ((Map) c5183020f.l0).get(((Map.Entry) obj).getKey());
        if (obj2 == null) {
            return Integer.MAX_VALUE;
        }
        return obj2;
    }

    public static final Object invoke$279(C5183020f c5183020f, Object obj) {
        ((C355501Zp) c5183020f.l0).LIZIZ("return_foreground_compensator", (JSONObject) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$28(C5183020f c5183020f, Object obj) {
        ((MultiGuestAbstractAvatarFragment) c5183020f.l0).dismiss();
        return Unit.LIZ;
    }

    public static final Object invoke$280(C5183020f c5183020f, Object obj) {
        ((C355501Zp) c5183020f.l0).LIZIZ("ready_compensator", (JSONObject) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$281(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$282(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        Context context = (Context) c5183020f.l0;
        if (iIntValue == 0) {
            return context.getString(2131831122, Integer.valueOf(iIntValue));
        }
        return context.getString(2131831121, Integer.valueOf(iIntValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$283(C5183020f c5183020f, Object obj) {
        Boolean bool = (Boolean) ((C291001Au) obj).LIZ;
        if (bool != null) {
            ((Function1) c5183020f.l0).invoke(Boolean.valueOf(bool.booleanValue()));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$284(C5183020f c5183020f, Object obj) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C434601ma((Fragment) c5183020f.l0, (String) obj, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$285(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$286(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        if (((GuestShowdownRankDialog) c5183020f.l0).LLLFF != 3) {
            C308301Hl c308301Hl = C308301Hl.LIZ;
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (interfaceC938530aWxLIZ != null) {
                lValueOf = Long.valueOf(interfaceC938530aWxLIZ.getPlayId());
            } else {
                lValueOf = null;
            }
            C308301Hl.LIZLLL(c308301Hl, "party_ranking_page", "setting", lValueOf, null, null, null, 0L, 120);
            C01MC c01mc = ((GuestShowdownRankDialog) c5183020f.l0).LLL;
            if (c01mc != null) {
                c01mc.LIZIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$287(C5183020f c5183020f, Object obj) {
        C01MC c01mc;
        GuestShowdownRankDialog guestShowdownRankDialog = (GuestShowdownRankDialog) c5183020f.l0;
        if (guestShowdownRankDialog.LLLFF != 3 && (c01mc = guestShowdownRankDialog.LLL) != null) {
            c01mc.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$288(C5183020f c5183020f, Object obj) {
        C01Z9.LIZLLL(((GuestShowdownRankDialog) c5183020f.l0).getContext());
        return Unit.LIZ;
    }

    public static final Object invoke$289(C5183020f c5183020f, Object obj) {
        long jLongValue;
        if (obj == C01FV.GUEST) {
            C972080bP4.LIZLLL("change role to guest requestGetPlayContent", "GuestTextHeaderModel", 2);
            C299901Ef c299901Ef = (C299901Ef) c5183020f.l0;
            TextHeaderPlayGetContentParams textHeaderPlayGetContentParams = new TextHeaderPlayGetContentParams();
            Long lLJIIJ = C930540aK4.LJIIJ();
            if (lLJIIJ != null) {
                jLongValue = lLJIIJ.longValue();
            } else {
                jLongValue = 0;
            }
            textHeaderPlayGetContentParams.roomId = jLongValue;
            c299901Ef.getClass();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((ITextHeaderApi) C480460Ism.LIZLLL(ITextHeaderApi.class)).playGetContent(textHeaderPlayGetContentParams), "GuestTextHeaderModel", "playGetContent").LJIILL(new C516201zk(c299901Ef, 294))).LJFF(new C0UO0()), (C11NJ) ((C299901Ef) c5183020f.l0).LJFF.getValue(), null, null, 30);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(C5183020f c5183020f, Object obj) {
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog;
        BaseSheetFragment baseSheetFragment = (BaseSheetFragment) obj;
        if ((baseSheetFragment instanceof CountDownForAllV2SettingsDialog) && ((CountDownForAllV2SettingsDialog) baseSheetFragment).LLLLL == EnumC311901Iv.BOTTOM_BUTTON && (countDownForAllV2ScoreDialog = ((CountDownForAllV2AnchorWidget) c5183020f.l0).LLILLJJLI) != null) {
            countDownForAllV2ScoreDialog.close(1);
        }
        ((CountDownForAllV2AnchorWidget) c5183020f.l0).LLIZ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$290(C5183020f c5183020f, Object obj) {
        AnonymousClass0041 anonymousClass0041 = (AnonymousClass0041) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkedListChangedV2 added=");
        sbLIZ.append(anonymousClass0041.LIZ);
        sbLIZ.append(" removed=");
        sbLIZ.append(anonymousClass0041.LIZIZ);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        InteractionLynxContainerLayout interactionLynxContainerLayout = (InteractionLynxContainerLayout) c5183020f.l0;
        C157000iu c157000iu = new C16A4() { // from class: X.00iu
            @Override // X.C16A4
            public final String getEventName() {
                return "liverevenue_cohost_event_common_linked_list_changed";
            }
        };
        List<C954460awe> listLJJLI = C915980Zwa.LJII().LJJLI();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLI, 10));
        Iterator<C954460awe> it2 = listLJJLI.iterator();
        while (it2.hasNext()) {
            arrayList.add(C963550bBJ.LIZ(it2.next()));
        }
        interactionLynxContainerLayout.up(c157000iu, new EventParams$LinkedListChangedV2(arrayList, anonymousClass0041.LIZ, anonymousClass0041.LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$291(C5183020f c5183020f, Object obj) {
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleInfoUpdated battleId=");
        sbLIZ.append(battleInfoResponse.battleId);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        ((InteractionLynxContainerLayout) c5183020f.l0).up(new C16A4() { // from class: X.00Wp
            @Override // X.C16A4
            public final String getEventName() {
                return "liverevenue_cohost_event_common_battle_info_updated";
            }
        }, battleInfoResponse);
        return Unit.LIZ;
    }

    public static final Object invoke$292(C5183020f c5183020f, Object obj) {
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", "LynxBattleResultAnimationEndChannel");
        InteractionLynxContainerLayout interactionLynxContainerLayout = (InteractionLynxContainerLayout) c5183020f.l0;
        C125000dk c125000dk = new C16A4() { // from class: X.00dk
            @Override // X.C16A4
            public final String getEventName() {
                return "liverevenue_gameplay_event_common_component_did_hide";
            }
        };
        final EnumC125100dl enumC125100dl = EnumC125100dl.BATTLE_RESULT_ANIMATION;
        interactionLynxContainerLayout.up(c125000dk, new Object(enumC125100dl) { // from class: com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.EventParams$ComponentDidHide

            @C09CT("component_type")
            public final EnumC125100dl componentType;

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof EventParams$ComponentDidHide) && this.componentType == ((EventParams$ComponentDidHide) obj2).componentType;
            }

            public final int hashCode() {
                return this.componentType.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ComponentDidHide(componentType=");
                sbLIZ.append(this.componentType);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.componentType = enumC125100dl;
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$293(C5183020f c5183020f, Object obj) {
        File fileLJIIJ = C1533790q13.LJIIJ((C1533790q13) obj);
        if (fileLJIIJ != null && fileLJIIJ.exists()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
            String absolutePath = fileLJIIJ.getAbsolutePath();
            C189200o6.m2constructorimpl(absolutePath);
            interfaceC20236714Gf.resumeWith(absolutePath);
        } else {
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c5183020f.l0;
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException("cannot find alpha player's video file"));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf2.resumeWith(c098200Yq);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$294(C5183020f c5183020f, Object obj) {
        ((C2632010c) c5183020f.l0).LLJ = !((C0IMR) obj).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$295(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((com.ss.android.ugc.aweme.profile.model.User) obj).getUid(), ((com.ss.android.ugc.aweme.profile.model.User) c5183020f.l0).getUid()));
    }

    public static final Object invoke$296(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(c5183020f.l0, ((Pair) obj).getFirst()));
    }

    public static final Object invoke$297(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(c5183020f.l0, ((Pair) obj).getFirst()));
    }

    public static final Object invoke$298(C5183020f c5183020f, Object obj) {
        C01Z9.LIZLLL(((View) c5183020f.l0).getContext());
        return Unit.LIZ;
    }

    public static final Object invoke$299(C5183020f c5183020f, Object obj) {
        C01Z9.LIZLLL(((View) c5183020f.l0).getContext());
        return Unit.LIZ;
    }

    public static final Object invoke$3(C5183020f c5183020f, Object obj) {
        Map<Long, UserPlayInfo> mapLJIIJ;
        UserPlayInfo userPlayInfo;
        List list = (List) obj;
        C15B9 c15b9 = (C15B9) c5183020f.l0;
        c15b9.getClass();
        StringBuilder sb = new StringBuilder("guestShowdownContentUpdateByPlayerListUpdate playerUidList:");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        sb.append(arrayList);
        c15b9.LJFF(sb.toString());
        GuestShowdownContent guestShowdownContent = c15b9.LJIIIIZZ;
        if (guestShowdownContent != null) {
            List<GuestShowdownUser> list2 = guestShowdownContent.runningPlayUsers;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (GuestShowdownUser guestShowdownUser : list2) {
                arrayList2.add(new Pair(Long.valueOf(guestShowdownUser.userId), Integer.valueOf(guestShowdownUser.userTag)));
            }
            boolean z = !Intrinsics.LJFF(arrayList2, list);
            StringBuilder sb2 = new StringBuilder("guestShowdownContentUpdateByPlayerListUpdate update:");
            sb2.append(z);
            sb2.append(" curList:");
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next());
            }
            sb2.append(arrayList3);
            sb2.append(' ');
            c15b9.LJFF(sb2.toString());
            if (z) {
                for (GuestShowdownUser guestShowdownUser2 : guestShowdownContent.runningPlayUsers) {
                    InterfaceC938250aWV interfaceC938250aWVLIZIZ = c15b9.LIZIZ();
                    if (interfaceC938250aWVLIZIZ != null && (mapLJIIJ = interfaceC938250aWVLIZIZ.LJIIJ()) != null && (userPlayInfo = mapLJIIJ.get(Long.valueOf(guestShowdownUser2.userId))) != null) {
                        guestShowdownUser2.userTag = userPlayInfo.userTag;
                        guestShowdownUser2.rank = userPlayInfo.rank;
                        guestShowdownUser2.score = userPlayInfo.score;
                    }
                }
                List<GuestShowdownUser> list3 = guestShowdownContent.runningPlayUsers;
                if (list3.size() > 1) {
                    C08XD.LJJ(list3, new C512401z8(0));
                }
                for (C15BT c15bt : (ArrayList) c15b9.LIZLLL) {
                    if (c15bt != null) {
                        c15bt.LIZJ(guestShowdownContent, "loserListUpdate", true);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$30(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf;
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel;
        C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> c310701Ij;
        List<LinkUser> listLIZLLL;
        CountdownForAllConfig countdownForAllConfig;
        boolean z;
        C946060aj6 c946060aj6 = (C946060aj6) obj;
        VM vm = ((CountDownForAllV2AnchorWidget) c5183020f.l0).LL;
        Fragment fragment = null;
        if (vm != 0) {
            if (vm.yQ2() != 1 && vm.yQ2() != 2) {
                z = false;
            } else {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget = (CountDownForAllV2AnchorWidget) c5183020f.l0;
            CountdownForAllConfigWrapper countdownForAllConfigWrapperLIZ = (CountdownForAllConfigWrapper) c946060aj6.LIZ();
            if (countdownForAllConfigWrapperLIZ == null) {
                CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel2 = (CountDownForAllV2AnchorViewModel) ((CountDownForAllV2AnchorWidget) c5183020f.l0).LL;
                if (countDownForAllV2AnchorViewModel2 != null && (countdownForAllConfig = (CountdownForAllConfig) countDownForAllV2AnchorViewModel2.LLILZIL.LJIJI.getValue()) != null) {
                    countdownForAllConfigWrapperLIZ = C01JD.LIZ(countdownForAllConfig);
                } else {
                    countdownForAllConfigWrapperLIZ = null;
                }
            }
            C334801Rq c334801Rq = c946060aj6.LJIILIIL;
            CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = countDownForAllV2AnchorWidget.LLIZ;
            if (countDownForAllV2SettingsDialog == null || !countDownForAllV2SettingsDialog.isVisible()) {
                if (countDownForAllV2AnchorWidget.LLIZ == null) {
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() <= 1) {
                        C766270U4b.LIZLLL(2131854064);
                    }
                    DataChannel dataChannel = countDownForAllV2AnchorWidget.dataChannel;
                    if (countdownForAllConfigWrapperLIZ == null) {
                        countdownForAllConfigWrapperLIZ = C01JD.LIZ(new CountdownForAllConfig());
                    }
                    CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog2 = new CountDownForAllV2SettingsDialog(dataChannel, 1, "playbook_entity", countdownForAllConfigWrapperLIZ, (C309901Ib) countDownForAllV2AnchorWidget.LLJI.getValue(), c334801Rq);
                    countDownForAllV2SettingsDialog2.LLJZIJLIL = new C5183020f(countDownForAllV2AnchorWidget, 376);
                    countDownForAllV2AnchorWidget.LLIZ = countDownForAllV2SettingsDialog2;
                }
                CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog3 = countDownForAllV2AnchorWidget.LLIZ;
                if (countDownForAllV2SettingsDialog3 != null) {
                    InterfaceC1097170eep interfaceC1097170eep = countDownForAllV2AnchorWidget.widgetCallback;
                    if (interfaceC1097170eep != null) {
                        fragment = interfaceC1097170eep.getFragment();
                    }
                    if (countDownForAllV2SettingsDialog3.wS(fragment, null, "CountDownForAllV2SettingsDialog") && (countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) countDownForAllV2AnchorWidget.LL) != null && (c310701Ij = countDownForAllV2AnchorViewModel.LLILZ) != null) {
                        c310701Ij.LIZIZ();
                    }
                }
            }
        } else {
            CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget2 = (CountDownForAllV2AnchorWidget) c5183020f.l0;
            countDownForAllV2AnchorWidget2.z1(new C310901Il(countDownForAllV2AnchorWidget2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$300(C5183020f c5183020f, Object obj) {
        C341401Ue c341401Ue = ((GuestShowdownInPunishmentSettingsDialog) c5183020f.l0).LLLFZ;
        if (c341401Ue != null) {
            new GuestShowdownConfig();
            long j = ((long) c341401Ue.LJIILIIL) * 60;
            ((GuestShowdownInPunishmentSettingsDialog) c5183020f.l0).LLLFF.LIZ(c341401Ue.LJIIZILJ, j);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$301(C5183020f c5183020f, Object obj) {
        ((GuestShowdownOngoingSettingsDialog) c5183020f.l0).wS(30L);
        return Unit.LIZ;
    }

    public static final Object invoke$302(C5183020f c5183020f, Object obj) {
        ((GuestShowdownOngoingSettingsDialog) c5183020f.l0).wS(60L);
        return Unit.LIZ;
    }

    public static final Object invoke$303(C5183020f c5183020f, Object obj) {
        ((GuestShowdownOngoingSettingsDialog) c5183020f.l0).wS(180L);
        return Unit.LIZ;
    }

    public static final Object invoke$304(C5183020f c5183020f, Object obj) {
        ((GuestShowdownOngoingSettingsDialog) c5183020f.l0).wS(300L);
        return Unit.LIZ;
    }

    public static final Object invoke$305(C5183020f c5183020f, Object obj) {
        GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog = (GuestShowdownOngoingSettingsDialog) c5183020f.l0;
        guestShowdownOngoingSettingsDialog.uS(guestShowdownOngoingSettingsDialog.LLLIZZ + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$306(C5183020f c5183020f, Object obj) {
        ((GuestShowdownOngoingSettingsDialog) c5183020f.l0).uS(r1.LLLIZZ - 1);
        return Unit.LIZ;
    }

    public static final Object invoke$307(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        boolean z;
        C308301Hl c308301Hl = C308301Hl.LIZ;
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        if (interfaceC938530aWxLIZ != null) {
            lValueOf = Long.valueOf(interfaceC938530aWxLIZ.getPlayId());
        } else {
            lValueOf = null;
        }
        C308301Hl.LIZLLL(c308301Hl, "ing_setting_page", "done", lValueOf, Long.valueOf(((GuestShowdownOngoingSettingsDialog) c5183020f.l0).LLLILZLLLI), null, null, 0L, 112);
        GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog = (GuestShowdownOngoingSettingsDialog) c5183020f.l0;
        InterfaceC341301Ud interfaceC341301Ud = guestShowdownOngoingSettingsDialog.LLLFF;
        long j = guestShowdownOngoingSettingsDialog.LLLILZLLLI;
        boolean z2 = false;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        int i = guestShowdownOngoingSettingsDialog.LLL.loserNum;
        int i2 = guestShowdownOngoingSettingsDialog.LLLIZZ;
        if (i != i2) {
            z2 = true;
        }
        interfaceC341301Ud.LIZ(i2, j, z, z2);
        return Unit.LIZ;
    }

    public static final Object invoke$308(C5183020f c5183020f, Object obj) {
        C341401Ue c341401Ue = (C341401Ue) c5183020f.l0;
        c341401Ue.LIZ(c341401Ue.LJIIZILJ + 1);
        return Unit.LIZ;
    }

    public static final Object invoke$309(C5183020f c5183020f, Object obj) {
        ((C341401Ue) c5183020f.l0).LIZ(r1.LJIIZILJ - 1);
        return Unit.LIZ;
    }

    public static final Object invoke$31(C5183020f c5183020f, Object obj) {
        ((CountDownForAllV2AnchorWidget) c5183020f.l0).getClass();
        C20441214yg.LIZIZ("CountDownForAllV2AnchorWidget", "CountDownForAllUpdatePlaySettingEvent");
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) ((CountDownForAllV2AnchorWidget) c5183020f.l0).LL;
        if (countDownForAllV2AnchorViewModel != null && countDownForAllV2AnchorViewModel.LLILZIL.LJIJI.getValue() == null) {
            GetUserPlaySettingsParams getUserPlaySettingsParams = new GetUserPlaySettingsParams();
            getUserPlaySettingsParams.settingKeys = C1697810uHb.LJIILJJIL("countdown_for_all_duration", "countdown_for_all_target_score", "countdown_for_all_resource_id");
            C01IU c01iu = countDownForAllV2AnchorViewModel.LLILZIL;
            c01iu.getClass();
            C480460Ism.LIZ().getClass();
            countDownForAllV2AnchorViewModel.LL.LIZ(C01NB.LIZ(C01NB.LIZIZ(((IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class)).getUserPlaySettings(getUserPlaySettingsParams), "CountDownForAllV2AnchorModel", "requestGetUserPlaySetting").LJFF(new C0UO0()).LJIILL(new C516201zk(c01iu, 351))).LJFF(new C0UO0()).LJJIIZ(new C516201zk(countDownForAllV2AnchorViewModel, 356), new C516201zk(countDownForAllV2AnchorViewModel, 357)));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$310(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        long jLongValue = ((Number) obj).longValue();
        int i = (int) ((jLongValue / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 60));
        C16FS c16fs = ((C341401Ue) c5183020f.l0).LJIIJJI;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIIL(2131755565, i, Integer.valueOf(i)));
        }
        ((C341401Ue) c5183020f.l0).LJIIL = Integer.valueOf(i);
        ((C341401Ue) c5183020f.l0).LIZIZ(0);
        C308301Hl c308301Hl = C308301Hl.LIZ;
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        if (interfaceC938530aWxLIZ != null) {
            lValueOf = Long.valueOf(interfaceC938530aWxLIZ.getPlayId());
        } else {
            lValueOf = null;
        }
        C308301Hl.LIZLLL(c308301Hl, "begin_set_time", "done", lValueOf, Long.valueOf(jLongValue), null, null, 0L, 112);
        return Unit.LIZ;
    }

    public static final Object invoke$311(C5183020f c5183020f, Object obj) {
        String str = (String) obj;
        Object objOpt = ((JSONObject) c5183020f.l0).opt(str);
        if (objOpt != null) {
            return new Pair(str, objOpt);
        }
        return null;
    }

    public static final Object invoke$312(C5183020f c5183020f, Object obj) {
        C1086960eOM c1086960eOM = C1086960eOM.LL;
        long id = ((Room) c5183020f.l0).getId();
        C01C1 c01c1 = new C01C1(((Room) c5183020f.l0).getId());
        c01c1.LJ = c1086960eOM.LIZIZ(c01c1.LIZ);
        C1086960eOM.LJIIJJI(id, c01c1);
        return Unit.LIZ;
    }

    public static final Object invoke$313(C5183020f c5183020f, Object obj) {
        for (EffectStruct effectStruct : ((EffectListResponse.Data) c5183020f.l0).collection) {
            if (Intrinsics.LJFF(effectStruct.effectId, obj)) {
                return effectStruct;
            }
        }
        return null;
    }

    public static final Object invoke$314(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iIntValue);
        sbLIZ.append(':');
        sbLIZ.append((String) ((Function1) c5183020f.l0).invoke(Integer.valueOf(iIntValue)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$315(C5183020f c5183020f, Object obj) {
        C422901kh c422901kh = (C422901kh) obj;
        if (C927800aFe.LIZIZ()) {
            InterfaceC491601vm interfaceC491601vm = (InterfaceC491601vm) ((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).get(c422901kh.LIZ);
            if (interfaceC491601vm != null) {
                interfaceC491601vm.LJIIJ(c422901kh.LIZIZ);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$316(C5183020f c5183020f, Object obj) {
        C421201kQ c421201kQ = (C421201kQ) obj;
        if (C927800aFe.LIZIZ()) {
            InterfaceC491601vm interfaceC491601vm = (InterfaceC491601vm) ((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).get(c421201kQ.LIZ);
            if (interfaceC491601vm != null) {
                interfaceC491601vm.LJIILL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$317(C5183020f c5183020f, Object obj) {
        C01E9 c01e9 = (C01E9) obj;
        if (C927800aFe.LIZIZ()) {
            InterfaceC491601vm interfaceC491601vm = (InterfaceC491601vm) ((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).get(c01e9.LIZIZ);
            if (interfaceC491601vm != null) {
                interfaceC491601vm.LJ(c01e9);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$318(C5183020f c5183020f, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcWallpaperPlayOrderUpdateEvent, maskAddedMap: ");
        sbLIZ.append(((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).size());
        C20441214yg.LIZIZ("AigcWallpaperLog", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            InterfaceC491601vm interfaceC491601vm = (InterfaceC491601vm) ((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).get(key);
            if (interfaceC491601vm != null) {
                interfaceC491601vm.LIZJ(iIntValue, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$319(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!Intrinsics.LJFF(obj, (View) c5183020f.l0));
    }

    public static final Object invoke$32(C5183020f c5183020f, Object obj) {
        CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = ((CountDownForAllV2AnchorWidget) c5183020f.l0).LLIZ;
        if (countDownForAllV2SettingsDialog != null) {
            countDownForAllV2SettingsDialog.PS();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$320(C5183020f c5183020f, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AigcWallpaperPlayOrderDismissEvent, dismiss: ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("AigcWallpaperLog", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = ((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC491601vm) it2.next()).LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$321(C5183020f c5183020f, Object obj) {
        Object next;
        Iterator it2 = ((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((InterfaceC938040aWA) next).LJIIIIZZ(), obj)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC491601vm interfaceC491601vm = (InterfaceC491601vm) next;
        if (interfaceC491601vm != null) {
            interfaceC491601vm.LJIIZILJ(false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$322(C5183020f c5183020f, Object obj) {
        C01H3 c01h3 = (C01H3) obj;
        if (!c01h3.LIZ) {
            Iterator it2 = ((HashMap) ((WindowMaskAssem) c5183020f.l0).LLJJJJ).values().iterator();
            while (it2.hasNext()) {
                ((InterfaceC491601vm) it2.next()).LJII();
            }
        } else {
            C01H9 c01h9 = c01h3.LIZIZ;
            if (c01h9 != null) {
                WindowMaskAssem windowMaskAssem = (WindowMaskAssem) c5183020f.l0;
                ShowListUser showListUser = c01h9.LIZ;
                if (showListUser != null) {
                    InterfaceC491601vm interfaceC491601vm = (InterfaceC491601vm) ((HashMap) windowMaskAssem.LLJJJJ).get(showListUser.linkmicIdStr);
                    if (interfaceC491601vm != null) {
                        interfaceC491601vm.LJIILIIL(showListUser.order, false);
                    }
                }
                List<ShowListUser> list = c01h9.LIZIZ;
                if (list != null) {
                    for (ShowListUser showListUser2 : list) {
                        InterfaceC491601vm interfaceC491601vm2 = (InterfaceC491601vm) ((HashMap) windowMaskAssem.LLJJJJ).get(showListUser2.linkmicIdStr);
                        if (interfaceC491601vm2 != null) {
                            interfaceC491601vm2.LJIILIIL(showListUser2.order, false);
                        }
                    }
                }
                List<ShowListUser> list2 = c01h9.LIZJ;
                if (list2 != null) {
                    for (ShowListUser showListUser3 : list2) {
                        InterfaceC491601vm interfaceC491601vm3 = (InterfaceC491601vm) ((HashMap) windowMaskAssem.LLJJJJ).get(showListUser3.linkmicIdStr);
                        if (interfaceC491601vm3 != null) {
                            interfaceC491601vm3.LJIILIIL(showListUser3.order, true);
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$323(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(!Intrinsics.LJFF(obj, (FrameLayout) c5183020f.l0));
    }

    public static final Object invoke$324(C5183020f c5183020f, Object obj) {
        long id;
        Room room;
        ((C780930UkF) c5183020f.l0).LIZ();
        C780930UkF c780930UkF = (C780930UkF) c5183020f.l0;
        c780930UkF.LIZIZ = null;
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        Text text = new Text();
        text.defaultPattern = C497740JfY.LJIJI(2131855728);
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.defaultPattern = C497740JfY.LJIJI(2131855734);
        capsuleMessage.buttonText = text2;
        capsuleMessage.scene = "restart_live";
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(0, new InterfaceC1112400f3O() { // from class: X.00wn
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage2, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage2) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage2) {
                if (Intrinsics.LJFF(capsuleMessage2.scene, "restart_live")) {
                    return R.attr.eta;
                }
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage2) {
                if (Intrinsics.LJFF(capsuleMessage2.scene, "restart_live")) {
                    return R.attr.cpl;
                }
                return -1;
            }
        });
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        DataChannel dataChannel = c780930UkF.LIZ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        Integer num = null;
        int i = 0;
        iPublicScreenService.Tn2(id, new C1112330f3H(capsuleMessage, num, num, i, i, new C5182020e(c780930UkF, 564), 30));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$325(C5183020f c5183020f, Object obj) {
        long j;
        List<CompetitionResultsTeamInfo> arrayList;
        CompetitionInfo.GroupShowInfo groupShowInfo;
        C081000Sa c081000Sa = (C081000Sa) obj;
        C00SX c00sx = C00SX.RESULT;
        CompetitionSettleEnd competitionSettleEnd = new CompetitionSettleEnd();
        CompetitionInfo competitionInfo = (CompetitionInfo) ((C470590Icr) c5183020f.l0).data;
        long j2 = 0;
        if (competitionInfo != null && (groupShowInfo = competitionInfo.groupShowInfo) != null) {
            j = groupShowInfo.actualEndTimestamp;
        } else {
            j = 0;
        }
        competitionSettleEnd.plannedFinishTime = j;
        if (competitionInfo == null || (arrayList = competitionInfo.teamInfos) == null) {
            arrayList = new ArrayList<>();
        }
        competitionSettleEnd.teamInfos = arrayList;
        CompetitionCommon competitionCommon = ((CompetitionInfo) ((C470590Icr) c5183020f.l0).data).bizCommon;
        if (competitionCommon != null) {
            j2 = competitionCommon.competitionId;
        }
        return C081000Sa.LIZ(c081000Sa, c00sx, null, null, competitionSettleEnd, j2, 22);
    }

    public static final Object invoke$326(C5183020f c5183020f, Object obj) {
        C1826670xdR c1826670xdR = (C1826670xdR) c5183020f.l0;
        c1826670xdR.LIZJ = (AbstractC1779240wOw) obj;
        c1826670xdR.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$327(C5183020f c5183020f, Object obj) {
        ((MutableLiveData) c5183020f.l0).postValue(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$328(C5183020f c5183020f, Object obj) {
        Integer remainingEditTimes;
        CreatorCaptionEditModel creatorCaptionEditModel = (CreatorCaptionEditModel) obj;
        List<CreatorCaptionEditData> subtitles = creatorCaptionEditModel.getSubtitles();
        if (subtitles == null || (remainingEditTimes = creatorCaptionEditModel.getRemainingEditTimes()) == null) {
            return null;
        }
        int iIntValue = remainingEditTimes.intValue();
        Boolean boolIsUnderReview = creatorCaptionEditModel.isUnderReview();
        if (boolIsUnderReview == null) {
            return null;
        }
        boolean zBooleanValue = boolIsUnderReview.booleanValue();
        int i = 0;
        for (CreatorCaptionEditData creatorCaptionEditData : subtitles) {
            int i2 = i + 1;
            if (i >= 0) {
                CreatorCaptionEditData creatorCaptionEditData2 = (CreatorCaptionEditData) ListProtector.get(subtitles, i);
                String text = creatorCaptionEditData.getText();
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < text.length(); i3++) {
                    char cCharAt = text.charAt(i3);
                    if (cCharAt != '\n' && cCharAt != '\r') {
                        sb.append(cCharAt);
                    }
                }
                creatorCaptionEditData2.setText(sb.toString());
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = (NewCreatorCaptionEditViewModel) c5183020f.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(subtitles, 10));
        Iterator<CreatorCaptionEditData> it2 = subtitles.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getText());
        }
        newCreatorCaptionEditViewModel.LL = arrayList;
        return new NewCreatorCaptionEditItem(subtitles, iIntValue, zBooleanValue);
    }

    public static final Object invoke$329(C5183020f c5183020f, Object obj) {
        List<CreatorCaptionEditData> editSubtitlesList;
        SubtitleEditInfo subtitleEditInfo;
        Integer remainingEditCount;
        boolean z;
        CreatorCaptionEditTranslatedModel creatorCaptionEditTranslatedModel = (CreatorCaptionEditTranslatedModel) obj;
        SubtitleEditInfo subtitleEditInfo2 = creatorCaptionEditTranslatedModel.getSubtitleEditInfo();
        if (subtitleEditInfo2 == null || (editSubtitlesList = subtitleEditInfo2.getEditSubtitlesList()) == null || (remainingEditCount = (subtitleEditInfo = creatorCaptionEditTranslatedModel.getSubtitleEditInfo()).getRemainingEditCount()) == null) {
            return null;
        }
        int iIntValue = remainingEditCount.intValue();
        if (subtitleEditInfo.getMTEditStatus() == MTEditStatusEnum.MT_EDIT_STATUS_UNDER_REVIEW) {
            z = true;
        } else {
            z = false;
        }
        int i = 0;
        for (CreatorCaptionEditData creatorCaptionEditData : editSubtitlesList) {
            int i2 = i + 1;
            if (i >= 0) {
                CreatorCaptionEditData creatorCaptionEditData2 = (CreatorCaptionEditData) ListProtector.get(editSubtitlesList, i);
                String text = creatorCaptionEditData.getText();
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < text.length(); i3++) {
                    char cCharAt = text.charAt(i3);
                    if (cCharAt != '\n' && cCharAt != '\r') {
                        sb.append(cCharAt);
                    }
                }
                creatorCaptionEditData2.setText(sb.toString());
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = (NewCreatorCaptionEditViewModel) c5183020f.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(editSubtitlesList, 10));
        Iterator<CreatorCaptionEditData> it2 = editSubtitlesList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getText());
        }
        newCreatorCaptionEditViewModel.LLILLJJLI = arrayList;
        return new NewCreatorCaptionEditItem(editSubtitlesList, iIntValue, z);
    }

    public static final Object invoke$33(C5183020f c5183020f, Object obj) {
        VM vm;
        Long lValueOf;
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog;
        CountdownForAllContent countdownForAllContent;
        CountdownForAllContent countdownForAllContent2 = (CountdownForAllContent) obj;
        BaseCountDownForAllV2Widget baseCountDownForAllV2Widget = (BaseCountDownForAllV2Widget) c5183020f.l0;
        String strA1 = baseCountDownForAllV2Widget.A1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("countDownForAllContent: ");
        sbLIZ.append(countdownForAllContent2);
        C20441214yg.LIZIZ(strA1, C2188811AlT.LIZIZ(sbLIZ));
        VM vm2 = baseCountDownForAllV2Widget.LL;
        boolean z = false;
        if ((vm2 != 0 && vm2.yQ2() == 1) || ((vm = baseCountDownForAllV2Widget.LL) != 0 && vm.yQ2() == 2)) {
            z = true;
        }
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog2 = baseCountDownForAllV2Widget.LLILLJJLI;
        Long lValueOf2 = null;
        if (countDownForAllV2ScoreDialog2 != null && (countdownForAllContent = countDownForAllV2ScoreDialog2.LLLFF) != null) {
            lValueOf = Long.valueOf(countdownForAllContent.playId);
        } else {
            lValueOf = null;
        }
        if (countdownForAllContent2 != null) {
            lValueOf2 = Long.valueOf(countdownForAllContent2.playId);
        }
        boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
        if (z && zLJFF && (countDownForAllV2ScoreDialog = baseCountDownForAllV2Widget.LLILLJJLI) != null) {
            countDownForAllV2ScoreDialog.LLLFF = countdownForAllContent2;
            countDownForAllV2ScoreDialog.zS();
        }
        DataChannel dataChannel = baseCountDownForAllV2Widget.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(PlayMaskEffectUpdateChannel.class, new C01IZ(1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$330(C5183020f c5183020f, Object obj) {
        Pair pair;
        C291001Au c291001Au = (C291001Au) obj;
        if (c291001Au != null && (pair = (Pair) c291001Au.LIZ) != null) {
            ((Function2) c5183020f.l0).invoke(pair.getFirst(), pair.getSecond());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$331(C5183020f c5183020f, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$332(C5183020f c5183020f, Object obj) {
        StackTraceElement stackTraceElement = ((StackTraceElement[]) c5183020f.l0)[((Number) obj).intValue()];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(stackTraceElement.getClassName());
        sbLIZ.append('.');
        sbLIZ.append(stackTraceElement.getMethodName());
        sbLIZ.append(':');
        sbLIZ.append(stackTraceElement.getLineNumber());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$333(C5183020f c5183020f, Object obj) {
        ((C01ZJ) c5183020f.l0).LJJ.invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$334(C5183020f c5183020f, Object obj) {
        int i;
        MultiGuestDataHolder multiGuestDataHolder;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((C01ZJ) c5183020f.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRoleChange, isAudience: ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", currentTime: ");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LIZIZ("TopGuestGamePlayGuestModel", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
            if (c01zrLIZIZ != null && c01zrLIZIZ.LIZLLL()) {
                C01ZJ c01zj = (C01ZJ) c5183020f.l0;
                c01zj.LJIILJJIL = "guest_end";
                C01ZN c01zn = c01zj.LJIJJ;
                TopGuestMetaContent topGuestMetaContent = c01zj.LJIIIIZZ;
                Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
                if ((objLJIIIZ instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) != null) {
                    i = multiGuestDataHolder.LJJIFFI;
                } else {
                    i = 0;
                }
                c01zn.LIZJ(topGuestMetaContent, i + 1, c01zj.LJIILJJIL);
                ((C01ZJ) c5183020f.l0).LJIIJ.remove(Long.valueOf(C950220apo.LJFF()));
                ((C01ZJ) c5183020f.l0).LJIIIZ.remove(Long.valueOf(C950220apo.LJFF()));
            }
            ((C01ZJ) c5183020f.l0).LJIJJ.LJ = false;
        } else {
            ((C01ZJ) c5183020f.l0).LJIJJ.LJ = true;
            C01ZR c01zrLIZIZ2 = C356501Zz.LIZIZ();
            if (c01zrLIZIZ2 != null && c01zrLIZIZ2.LIZLLL()) {
                if (((C01ZJ) c5183020f.l0).LJIIIZ.get(Long.valueOf(C950220apo.LJFF())) != null && ((C01ZJ) c5183020f.l0).LJIIJ.get(Long.valueOf(C950220apo.LJFF())) != null) {
                    ((C01ZJ) c5183020f.l0).LJIILJJIL(jCurrentTimeMillis);
                } else {
                    ((C01ZJ) c5183020f.l0).LJIL = true;
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$335(X.C5183020f r1, java.lang.Object r2) {
        /*
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r1.l0
            com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell r0 = (com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell) r0
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L26
            boolean r1 = X.C426750GoL.LIZLLL(r0)
            r0 = 1
            if (r1 != r0) goto L26
        L13:
            r1 = 35
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            return r0
        L26:
            r0 = 0
            goto L13
        L28:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$335(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$336(C5183020f c5183020f, Object obj) {
        Function1 function1 = (Function1) c5183020f.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$337(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue < 1) {
            return ((Context) c5183020f.l0).getString(2131831419);
        }
        return ((Context) c5183020f.l0).getString(2131830166, String.valueOf(iIntValue));
    }

    public static final Object invoke$338(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(C1533790q13.LJIIJ((C1533790q13) obj));
        return Unit.LIZ;
    }

    public static final Object invoke$339(C5183020f c5183020f, Object obj) {
        ((C311201Io) c5183020f.l0).LIZIZ("ready_compensator", (JSONObject) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$34(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        String strDQ2;
        CountdownForAllContent countdownForAllContentWQ2;
        User userCQ2;
        String strDQ22;
        User userCQ22;
        Long l = (Long) obj;
        BaseCountDownForAllV2Widget baseCountDownForAllV2Widget = (BaseCountDownForAllV2Widget) c5183020f.l0;
        String strA1 = baseCountDownForAllV2Widget.A1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("top1User: ");
        VM vm = baseCountDownForAllV2Widget.LL;
        if (vm != 0 && (userCQ22 = vm.CQ2()) != null) {
            lValueOf = Long.valueOf(userCQ22.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C20441214yg.LIZIZ(strA1, C2188811AlT.LIZIZ(sbLIZ));
        String strA12 = baseCountDownForAllV2Widget.A1();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("top1UserEffectId: ");
        VM vm2 = baseCountDownForAllV2Widget.LL;
        if (vm2 != 0) {
            strDQ2 = vm2.DQ2();
        } else {
            strDQ2 = null;
        }
        sbLIZ2.append(strDQ2);
        C20441214yg.LIZIZ(strA12, C2188811AlT.LIZIZ(sbLIZ2));
        String strA13 = baseCountDownForAllV2Widget.A1();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("extraDuration: ");
        sbLIZ3.append(l);
        C20441214yg.LIZIZ(strA13, C2188811AlT.LIZIZ(sbLIZ3));
        VM vm3 = baseCountDownForAllV2Widget.LL;
        if (vm3 != 0) {
            countdownForAllContentWQ2 = vm3.wQ2();
        } else {
            countdownForAllContentWQ2 = null;
        }
        VM vm4 = baseCountDownForAllV2Widget.LL;
        if (vm4 != 0) {
            userCQ2 = vm4.CQ2();
        } else {
            userCQ2 = null;
        }
        VM vm5 = baseCountDownForAllV2Widget.LL;
        if (vm5 != 0) {
            strDQ22 = vm5.DQ2();
        } else {
            strDQ22 = null;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(baseCountDownForAllV2Widget), C0PEM.LIZJ, null, new C01J1(strDQ22, countdownForAllContentWQ2, baseCountDownForAllV2Widget, userCQ2, l, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$340(C5183020f c5183020f, Object obj) {
        ((C311201Io) c5183020f.l0).LIZIZ("return_foreground_compensator", (JSONObject) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$341(C5183020f c5183020f, Object obj) {
        String str = (String) obj;
        if (str != null) {
            C262300zt c262300zt = (C262300zt) c5183020f.l0;
            c262300zt.LJFF = str;
            C11JF c11jf = c262300zt.LJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c262300zt.LJ = null;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$342(C5183020f c5183020f, Object obj) {
        String str;
        com.bytedance.android.livesdk.game.model.GuessRound guessRound = ((com.bytedance.android.livesdk.game.model.GuessWidget) obj).guessRound;
        String str2 = null;
        if (guessRound != null) {
            str = guessRound.roundIdStr;
        } else {
            str = null;
        }
        com.bytedance.android.livesdk.game.model.GuessRound guessRound2 = ((com.bytedance.android.livesdk.game.model.GuessWidget) c5183020f.l0).guessRound;
        if (guessRound2 != null) {
            str2 = guessRound2.roundIdStr;
        }
        return Boolean.valueOf(Intrinsics.LJFF(str, str2));
    }

    public static final Object invoke$343(C5183020f c5183020f, Object obj) {
        Integer num = (Integer) obj;
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() && C500260Jjc.LJJIL()) {
            if (num != null && num.intValue() == 1) {
                ((C394101g3) c5183020f.l0).LJJ(false);
            } else {
                ((C394101g3) c5183020f.l0).LJJ(true);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$344(C5183020f c5183020f, Object obj) {
        C394101g3 c394101g3 = (C394101g3) c5183020f.l0;
        boolean z = c394101g3.LJIIL;
        int i = ((C956380azk) obj).LIZ;
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else if (i == 1) {
            z = false;
        }
        c394101g3.LJIIL = z;
        if (!z && !c394101g3.LJIIJJI) {
            z2 = false;
        }
        c394101g3.LJJ(z2);
        return Unit.LIZ;
    }

    public static final Object invoke$345(C5183020f c5183020f, Object obj) {
        boolean z;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewCardCohostEvent: ");
        sbLIZ.append(zBooleanValue);
        C20441214yg.LIZIZ("pcs_audience_decoration", C2188811AlT.LIZIZ(sbLIZ));
        C394101g3 c394101g3 = (C394101g3) c5183020f.l0;
        c394101g3.LJIIL = zBooleanValue;
        if (!zBooleanValue && !c394101g3.LJIIJJI) {
            z = false;
        } else {
            z = true;
        }
        c394101g3.LJJ(z);
        return Unit.LIZ;
    }

    public static final Object invoke$346(C5183020f c5183020f, Object obj) {
        ((C09AE) c5183020f.l0).LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$347(C5183020f c5183020f, Object obj) {
        List list = (List) c5183020f.l0;
        Iterator it2 = ((HashMap) obj).entrySet().iterator();
        while (it2.hasNext()) {
            list.addAll((Collection) ((Map.Entry) it2.next()).getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$348(C5183020f c5183020f, Object obj) {
        Iterator it2 = ((HashMap) obj).entrySet().iterator();
        while (it2.hasNext()) {
            ((List) c5183020f.l0).addAll((Collection) ((Map.Entry) it2.next()).getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$349(C5183020f c5183020f, Object obj) {
        ((List) c5183020f.l0).addAll((Collection) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$35(C5183020f c5183020f, Object obj) {
        Pair pair = (Pair) obj;
        ((BaseCountDownForAllV2Widget) c5183020f.l0).C1(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$350(C5183020f c5183020f, Object obj) {
        ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue());
        return null;
    }

    public static final Object invoke$351(C5183020f c5183020f, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        try {
            C189200o6.m2constructorimpl(obj);
            interfaceC1364105Vn.resumeWith(obj);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$352(C5183020f c5183020f, Object obj) {
        return ((Function1) c5183020f.l0).invoke(ListProtector.get((List) obj, 0));
    }

    public static final Object invoke$353(C5183020f c5183020f, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        try {
            C189200o6.m2constructorimpl(obj);
            interfaceC1364105Vn.resumeWith(obj);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$354(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((List) ((C01GW) c5183020f.l0).getValue()).contains(obj));
    }

    public static final Object invoke$355(C5183020f c5183020f, Object obj) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) c5183020f.l0;
        RunnableC781530UlD runnableC781530UlD = multiLiveAsAnchorListDialogV2.LLLFF;
        if (runnableC781530UlD != null) {
            HandlerHook.viewPost(runnableC781530UlD, new RunnableC514801zW(multiLiveAsAnchorListDialogV2, 194));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$356(C5183020f c5183020f, Object obj) {
        CompetitionRankListMessage competitionRankListMessage = (CompetitionRankListMessage) c5183020f.l0;
        long j = competitionRankListMessage.dataVersion;
        long j2 = competitionRankListMessage.competitionId;
        String strLJIJI = C497740JfY.LJIJI(2131852650);
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        C2861018x c2861018x = new C2861018x(j, j2, strLJIJI);
        obj.getClass();
        return new AnonymousClass0190(c2861018x);
    }

    public static final Object invoke$357(C5183020f c5183020f, Object obj) {
        Iterator it2 = ((HashMap) obj).entrySet().iterator();
        while (it2.hasNext()) {
            ((List) c5183020f.l0).addAll((Collection) ((Map.Entry) it2.next()).getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$358(C5183020f c5183020f, Object obj) {
        boolean z;
        Reference reference = (Reference) obj;
        if (!Intrinsics.LJFF(reference.get(), (LiveData) c5183020f.l0) && reference.get() != null) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$359(C5183020f c5183020f, Object obj) {
        LiveDialog liveDialog = (LiveDialog) c5183020f.l0;
        liveDialog.dismiss();
        C785410UrT.LIZ(liveDialog);
        return Unit.LIZ;
    }

    public static final Object invoke$36(C5183020f c5183020f, Object obj) {
        boolean z;
        VM vm;
        long j;
        String str;
        C01IY c01iy = (C01IY) obj;
        String strA1 = ((BaseCountDownForAllV2Widget) c5183020f.l0).A1();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiGuestOpenCountDownForAllScoreDialogEvent, bannerType=");
        sbLIZ.append(c01iy.LIZ);
        sbLIZ.append(", playId=");
        sbLIZ.append(c01iy.LIZIZ);
        C20441214yg.LIZIZ(strA1, C2188811AlT.LIZIZ(sbLIZ));
        VM vm2 = ((BaseCountDownForAllV2Widget) c5183020f.l0).LL;
        if (vm2 != 0 && vm2.yQ2() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z || ((vm = ((BaseCountDownForAllV2Widget) c5183020f.l0).LL) != 0 && vm.yQ2() == 2)) {
            C310501Ih.LIZ(c01iy.LIZ);
            ((BaseCountDownForAllV2Widget) c5183020f.l0).z1(null);
        } else {
            String str2 = c01iy.LIZIZ;
            if (str2 != null && str2.length() != 0) {
                C310501Ih.LIZ(c01iy.LIZ);
                ((BaseCountDownForAllV2Widget) c5183020f.l0).D1(2, null, 0, null);
                C19487111Lx c19487111Lx = ((BaseCountDownForAllV2Widget) c5183020f.l0).LLILZ;
                if (c19487111Lx != null) {
                    c19487111Lx.dispose();
                }
                CountdownForAllGetContentParams countdownForAllGetContentParams = new CountdownForAllGetContentParams();
                countdownForAllGetContentParams.roomId = C01JX.LJII();
                countdownForAllGetContentParams.channelId = C01JX.LJI();
                try {
                    str = c01iy.LIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (str != null) {
                    j = CastLongProtector.parseLong(str);
                } else {
                    j = 0;
                }
                countdownForAllGetContentParams.playId = j;
                countdownForAllGetContentParams.getType = 1;
                BaseCountDownForAllV2Widget baseCountDownForAllV2Widget = (BaseCountDownForAllV2Widget) c5183020f.l0;
                C480460Ism.LIZ().getClass();
                baseCountDownForAllV2Widget.LLILZ = (C19487111Lx) new C11QI(C01NB.LIZIZ(((ICountDownForAllApi) C480460Ism.LIZLLL(ICountDownForAllApi.class)).getCountDownForAllContent(countdownForAllGetContentParams), ((BaseCountDownForAllV2Widget) c5183020f.l0).A1(), "requestGetCountDownForAllContent").LJFF(new C0UO0()).LJIILL(new C516201zk((BaseCountDownForAllV2Widget) c5183020f.l0, 36)).LJIIL(new C09JN() { // from class: X.00Kw
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                        C1C7U.LIZ("BaseCountDownForAllV2Widget@92b1.onCreate$5$2");
                        C1C7U.LIZIZ("BaseCountDownForAllV2Widget@92b1.onCreate$5$2");
                    }
                })).LJIILL().LJIIZILJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$360(C5183020f c5183020f, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5183020f.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        return Unit.LIZ;
    }

    public static final Object invoke$361(C5183020f c5183020f, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        sparkContext.LJJJZ("event_id", String.valueOf(((NoticeItem) c5183020f.l0).eventId));
        sparkContext.LJJJZ("enter_from", "live_activity_notification");
        return Unit.LIZ;
    }

    public static final Object invoke$362(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC1364105Vn.resumeWith(boolValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$363(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC1364105Vn.resumeWith(boolValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$364(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c5183020f.l0;
        C189200o6.m2constructorimpl(boolValueOf);
        interfaceC1364105Vn.resumeWith(boolValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$365(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(c5183020f.l0, ((Pair) obj).getFirst()));
    }

    public static final Object invoke$366(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$367(C5183020f c5183020f, Object obj) {
        ((Function1) c5183020f.l0).invoke(Boolean.valueOf(((Boolean) obj).booleanValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$368(C5183020f c5183020f, Object obj) {
        Map map = (Map) c5183020f.l0;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$369(C5183020f c5183020f, Object obj) {
        Object c098200Yq;
        try {
            c098200Yq = ((Context) c5183020f.l0).getResources().getString(((Number) obj).intValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            return "";
        }
        return c098200Yq;
    }

    public static final Object invoke$37(C5183020f c5183020f, Object obj) {
        Boolean boolValueOf;
        VM vm = ((CountDownForAllV2GuestWidget) c5183020f.l0).LL;
        if ((vm == 0 || vm.yQ2() != 0) && !C01HE.LIZJ()) {
            CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog = ((CountDownForAllV2GuestWidget) c5183020f.l0).LLILLJJLI;
            if (countDownForAllV2ScoreDialog != null) {
                boolValueOf = Boolean.valueOf(countDownForAllV2ScoreDialog.isVisible());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                ((CountDownForAllV2GuestWidget) c5183020f.l0).getClass();
                C20441214yg.LIZIZ("CountDownForAllV2GuestWidget", "audience call get_content when linkedGuestListChange");
                VM vm2 = ((CountDownForAllV2GuestWidget) c5183020f.l0).LL;
                if (vm2 != 0) {
                    vm2.EQ2("requestGetContentByUserChange");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$370(C5183020f c5183020f, Object obj) {
        return ((JSONArray) c5183020f.l0).get(((Number) obj).intValue()).toString();
    }

    public static final Object invoke$371(C5183020f c5183020f, Object obj) {
        InterfaceC201500q5 interfaceC201500q5;
        HostBoard hostBoardLIZ;
        List<BoardCell> list;
        C2757014x c2757014x = (C2757014x) obj;
        C011V c011v = ((C1103880epe) c5183020f.l0).getConfig().LIZJ;
        boolean z = true;
        if ((c2757014x.LIZIZ != null || (((interfaceC201500q5 = c2757014x.LIZJ) != null && ((hostBoardLIZ = interfaceC201500q5.LIZ()) == null || (list = hostBoardLIZ.cellList) == null || !list.isEmpty())) || !c2757014x.LIZ.cellList.isEmpty())) && (c2757014x.LJ || c011v == C011V.BROADCAST)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$372(C5183020f c5183020f, Object obj) {
        return C13LE.LIZ(ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue()).getClass()).LJI();
    }

    public static /* bridge */ /* synthetic */ Object invoke$373(C5183020f c5183020f, Object obj) {
        return C13LE.LIZ(ListProtector.get((List) c5183020f.l0, ((Number) obj).intValue()).getClass()).LJI();
    }

    public static final Object invoke$374(C5183020f c5183020f, Object obj) {
        ((Number) obj).intValue();
        ((C451201pG) c5183020f.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$375(C5183020f c5183020f, Object obj) {
        Object obj2 = ((Map) c5183020f.l0).get(obj);
        if (!(obj2 instanceof List)) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$376(X.C5183020f r4, java.lang.Object r5) {
        /*
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment r5 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment) r5
            boolean r0 = r5 instanceof com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog
            if (r0 == 0) goto L52
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog r5 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog) r5
            X.01Iv r1 = r5.LLLLL
            X.01Iv r0 = X.EnumC311901Iv.OTHER
            if (r1 != r0) goto L52
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget) r0
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel r3 = r0.LL
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel r3 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel) r3
            if (r3 == 0) goto L30
            webcast.data.multi_guest_play.CountdownForAllConfig r2 = new webcast.data.multi_guest_play.CountdownForAllConfig
            r2.<init>()
            long r0 = r5.ES()
            r2.duration = r0
            long r0 = r5.LLLILZ
            r2.targetScore = r0
            java.lang.String r0 = r5.LLLL
            r2.resourceId = r0
            X.01IU r0 = r3.LLILZIL
            r0.LJIILL(r2)
        L30:
            r1 = 2
        L31:
            java.lang.Object r0 = r4.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget) r0
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel r0 = r0.LL
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel) r0
            if (r0 == 0) goto L48
            X.01Ij<com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent, com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper> r0 = r0.LLILZ
            if (r0 == 0) goto L48
            X.0aj5 r0 = r0.LIZ()
            if (r0 == 0) goto L48
            r0.LIZIZ(r1)
        L48:
            java.lang.Object r1 = r4.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget r1 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget) r1
            r0 = 0
            r1.LLIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L52:
            r1 = 1
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$376(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$377(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((Set) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$378(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((Set) c5183020f.l0).contains(obj));
    }

    public static final Object invoke$379(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(((Set) c5183020f.l0).contains(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$38(X.C5183020f r10, java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$38(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$380(C5183020f c5183020f, Object obj) {
        Map<String, String> map = (Map) obj;
        Context context = (Context) c5183020f.l0;
        if (context != null) {
            ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIII(context, map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$381(C5183020f c5183020f, Object obj) {
        return C10EY.LJI((C10EY) obj, String.valueOf(((BlackList) c5183020f.l0).total));
    }

    public static final Object invoke$39(C5183020f c5183020f, Object obj) {
        C334801Rq c334801Rq = (C334801Rq) obj;
        if (C01ZC.LIZIZ()) {
            ((GuestShowdownAnchorWidget) c5183020f.l0).I1(c334801Rq);
        } else {
            ((GuestShowdownAnchorWidget) c5183020f.l0).H1(c334801Rq);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Reference) obj).get(), (Aweme) c5183020f.l0));
    }

    public static final Object invoke$40(C5183020f c5183020f, Object obj) {
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) ((GuestShowdownAnchorWidget) c5183020f.l0).LLILLL;
        if (guestShowdownAnchorViewModel != null) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GuestShowdownAnchorViewModel.LLJJIJI;
            guestShowdownAnchorViewModel.GQ2(true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(C5183020f c5183020f, Object obj) {
        GuestShowdownAnchorWidget guestShowdownAnchorWidget = (GuestShowdownAnchorWidget) c5183020f.l0;
        guestShowdownAnchorWidget.B1((C304801Gc) guestShowdownAnchorWidget.LLJJJJ.getValue(), true, null, null);
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.01IG] */
    public static final Object invoke$42(C5183020f c5183020f, Object obj) {
        C946050aj5 c946050aj5LIZIZ;
        C946060aj6 c946060aj6 = (C946060aj6) obj;
        C334801Rq c334801Rq = null;
        if (C01ZC.LIZIZ()) {
            GuestShowdownAnchorWidget guestShowdownAnchorWidget = (GuestShowdownAnchorWidget) c5183020f.l0;
            if (c946060aj6 != null) {
                c334801Rq = c946060aj6.LJIILIIL;
            }
            guestShowdownAnchorWidget.I1(c334801Rq);
        } else {
            GuestShowdownAnchorWidget guestShowdownAnchorWidget2 = (GuestShowdownAnchorWidget) c5183020f.l0;
            if (c946060aj6 != null) {
                c334801Rq = c946060aj6.LJIILIIL;
            }
            if (guestShowdownAnchorWidget2.H1(c334801Rq)) {
                if (c946060aj6 != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
                    c946050aj5LIZIZ.LJFF(0);
                }
                GuestShowdownAnchorWidget guestShowdownAnchorWidget3 = (GuestShowdownAnchorWidget) c5183020f.l0;
                if (guestShowdownAnchorWidget3.LLILZLL == null) {
                    final List listLJIIJJI = C1697810uHb.LJIIJJI("GuestShowdownIdleSettingsDialog", "GuestShowdownRankDialog", "GuestShowdownEndDialog");
                    final C5184020g c5184020g = new C5184020g((GuestShowdownAnchorWidget) c5183020f.l0, 0);
                    guestShowdownAnchorWidget3.LLILZLL = new InterfaceC20484915Dr() { // from class: X.01IG
                        @Override // X.InterfaceC20484915Dr
                        public final void LIZ(InterfaceC20484815Dq interfaceC20484815Dq) {
                        }

                        @Override // X.InterfaceC20484915Dr
                        public final void LIZIZ(InterfaceC20484815Dq interfaceC20484815Dq, int i) {
                            try {
                                if (C13LP.LJJJJ(interfaceC20484815Dq.gE(), listLJIIJJI)) {
                                    c5184020g.invoke(interfaceC20484815Dq.gE(), Integer.valueOf(i), Boolean.FALSE, interfaceC20484815Dq.lr());
                                    C19322110iZ.LJII(this);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c5184020g.invoke(interfaceC20484815Dq.gE(), Integer.valueOf(i), Boolean.TRUE, interfaceC20484815Dq.lr());
                                C19322110iZ.LJII(this);
                            }
                        }
                    };
                }
                C01IG c01ig = ((GuestShowdownAnchorWidget) c5183020f.l0).LLILZLL;
                C20484715Dp c20484715Dp = C464790IKn.LIZ;
                if (c01ig != null) {
                    ((CopyOnWriteArraySet) c20484715Dp.LIZJ).add(c01ig);
                } else {
                    c20484715Dp.getClass();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(C5183020f c5183020f, Object obj) {
        ((BaseGuestShowdownWidget) c5183020f.l0).B1(null, false, (GuestShowdownContent) obj, null);
        return Unit.LIZ;
    }

    public static final Object invoke$44(C5183020f c5183020f, Object obj) {
        Integer numAQ2;
        C334801Rq c334801Rq = (C334801Rq) obj;
        if (C01ZC.LIZIZ()) {
            ((GuestShowdownGuestWidget) c5183020f.l0).E1(c334801Rq);
        } else {
            VM vm = ((GuestShowdownGuestWidget) c5183020f.l0).LLILLL;
            if (vm != 0 && (numAQ2 = vm.AQ2()) != null && numAQ2.intValue() != 5 && numAQ2.intValue() != 0) {
                if (numAQ2.intValue() != 1 && numAQ2.intValue() != 2 && numAQ2.intValue() != 3) {
                    if (numAQ2.intValue() == 4) {
                        VM vm2 = ((GuestShowdownGuestWidget) c5183020f.l0).LLILLL;
                        if (vm2 != 0) {
                            vm2.EQ2(2);
                        }
                        ((GuestShowdownGuestWidget) c5183020f.l0).B1(null, false, null, null);
                    }
                } else {
                    VM vm3 = ((GuestShowdownGuestWidget) c5183020f.l0).LLILLL;
                    if (vm3 != 0) {
                        vm3.EQ2(1);
                    }
                    ((GuestShowdownGuestWidget) c5183020f.l0).D1(null);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$45(C5183020f c5183020f, Object obj) {
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class);
        if (bool == null || !bool.booleanValue()) {
            ((GuestShowdownGuestWidget) c5183020f.l0).B1(null, false, null, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$46(C5183020f c5183020f, Object obj) {
        InterfaceC938530aWx interfaceC938530aWxLIZ;
        VM vm;
        if (obj == C01FV.GUEST && (interfaceC938530aWxLIZ = C01IB.LIZ()) != null && interfaceC938530aWxLIZ.isRunning() && BugFixGuestShowdownAudienceContentVersion.INSTANCE.isEnable() && (vm = ((GuestShowdownGuestWidget) c5183020f.l0).LLILLL) != 0) {
            vm.EQ2(1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(C5183020f c5183020f, Object obj) {
        String str;
        PlaybookContent playbookContent;
        String str2;
        String str3;
        Playbook playbook = (Playbook) obj;
        PlaybookContent playbookContent2 = playbook.content;
        if (playbookContent2 != null && (str = playbookContent2.coverUrl) != null && str.length() > 0 && (playbookContent = playbook.content) != null && (str2 = playbookContent.coverUri) != null && a0.LJJJIL(str2)) {
            MutableLiveData<String> mutableLiveData = ((BasePlaybookEditorViewModel) c5183020f.l0).LLILLL.LIZJ;
            PlaybookContent playbookContent3 = playbook.content;
            if (playbookContent3 != null) {
                str3 = playbookContent3.coverUrl;
            } else {
                str3 = null;
            }
            mutableLiveData.postValue(str3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(C5183020f c5183020f, Object obj) {
        String str;
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) c5183020f.l0;
        String str2 = playbookEditorMoreDialog.LLLFF;
        Long lValueOf = Long.valueOf(playbookEditorMoreDialog.LLL.playbookId);
        if (Intrinsics.LJFF(((PlaybookEditorMoreDialog) c5183020f.l0).LLLFF, "create_preview")) {
            str = "create";
        } else {
            str = "edit";
        }
        C978360bZC.LJIJ(str2, "edit", lValueOf, str, ((PlaybookEditorMoreDialog) c5183020f.l0).LLLIIII.invoke().booleanValue(), null, null);
        ((PlaybookEditorMoreDialog) c5183020f.l0).close(1);
        ((PlaybookEditorMoreDialog) c5183020f.l0).LLLI.invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$49(C5183020f c5183020f, Object obj) {
        C19487111Lx c19487111Lx = ((LiveShowAnchorViewModel) c5183020f.l0).LLJJIII;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        ((LiveShowAnchorViewModel) c5183020f.l0).LLJJIII = null;
        return Unit.LIZ;
    }

    public static final Object invoke$5(C5183020f c5183020f, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, c5183020f.l0));
    }

    public static final Object invoke$50(C5183020f c5183020f, Object obj) {
        C19487111Lx c19487111Lx = ((LiveShowAnchorViewModel) c5183020f.l0).LLJJIJI;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        ((LiveShowAnchorViewModel) c5183020f.l0).LLJJIJI = null;
        return Unit.LIZ;
    }

    public static final Object invoke$51(C5183020f c5183020f, Object obj) {
        String str;
        C306601Gu c306601Gu = (C306601Gu) obj;
        if (c306601Gu.LIZIZ.length() > 0) {
            str = c306601Gu.LIZIZ;
        } else {
            str = "liveshow_banner";
        }
        C306901Gx.LJIIL(str);
        ((LiveShowAnchorWidget) c5183020f.l0).LLLLLLLLL("banner", new C334801Rq(c306601Gu.LIZJ, c306601Gu.LIZLLL, c306601Gu.LJ));
        return Unit.LIZ;
    }

    public static final Object invoke$52(C5183020f c5183020f, Object obj) {
        C946060aj6 c946060aj6 = (C946060aj6) obj;
        DataChannel dataChannel = ((LiveShowAnchorWidget) c5183020f.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveShowConfigChannel.class, c946060aj6);
        }
        ((LiveShowAnchorWidget) c5183020f.l0).getClass();
        if (C937280aUw.LIZIZ(c946060aj6.LIZIZ)) {
            C766270U4b.LIZLLL(2131854064);
            ((LiveShowAnchorWidget) c5183020f.l0).O1();
        } else {
            ((LiveShowAnchorWidget) c5183020f.l0).LLLLLLLLL(c946060aj6.LIZIZ, c946060aj6.LJIILIIL);
            LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) c5183020f.l0;
            System.currentTimeMillis();
            liveShowAnchorWidget.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(C5183020f c5183020f, Object obj) {
        ((LiveShowAnchorWidget) c5183020f.l0).M1();
        return Unit.LIZ;
    }

    public static final Object invoke$54(C5183020f c5183020f, Object obj) {
        Long lValueOf;
        ShowListUser next;
        ShowContent showContent = (ShowContent) obj;
        LiveShowAudienceViewModel liveShowAudienceViewModel = (LiveShowAudienceViewModel) c5183020f.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowSeiUpdateStart, this: ");
        sbLIZ.append(showContent);
        C20441214yg.LIZIZ("remain time test", C2188811AlT.LIZIZ(sbLIZ));
        ShowConfig showConfig = showContent.showConfig;
        if (showConfig != null) {
            lValueOf = Long.valueOf(showConfig.durationPerGuest);
        } else {
            lValueOf = null;
        }
        Iterator<ShowListUser> it2 = showContent.showingAndReadyList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.status == 2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        liveShowAudienceViewModel.CQ2(new C303501Fp(lValueOf, next, showContent.showingAndReadyList, showContent.finishedList));
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ != null) {
            interfaceC924740aAiLIZ.LIZ("live_show");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "live_show");
        }
        ((LiveShowAudienceViewModel) c5183020f.l0).getClass();
        if (BaseLiveShowViewModel.FQ2() != 0) {
            ((LiveShowAudienceViewModel) c5183020f.l0).HQ2(null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$55(C5183020f c5183020f, Object obj) {
        ((LiveShowAudienceViewModel) c5183020f.l0).LLJILLL.postValue(Boolean.TRUE);
        return Unit.LIZ;
    }

    public static final Object invoke$56(C5183020f c5183020f, Object obj) {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        InterfaceC302601Fg interfaceC302601FgLIZ2;
        List<LinkPlayerInfo> value;
        C01H9 value2;
        MutableLiveData<ShowConfig> mutableLiveData;
        ShowConfig value3;
        MutableLiveData<C01H9> mutableLiveData2;
        MutableLiveData<List<LinkPlayerInfo>> mutableLiveData3;
        LiveShowAudienceWidget liveShowAudienceWidget = (LiveShowAudienceWidget) c5183020f.l0;
        liveShowAudienceWidget.getClass();
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (!C923330a8R.LJIIIIZZ() && (((interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIIL() == 1) || ((interfaceC302601FgLIZ2 = C01FQ.LIZ()) != null && interfaceC302601FgLIZ2.LJIIL() == 2))) {
            C306901Gx.LJIL("livesdk_audience_multiguest_liveshow_panel_show", C306901Gx.LIZLLL());
            LiveShowAudienceViewModel liveShowAudienceViewModel = (LiveShowAudienceViewModel) liveShowAudienceWidget.LLILLJJLI;
            Long lValueOf = null;
            if (liveShowAudienceViewModel != null) {
                liveShowAudienceViewModel.HQ2(null);
            }
            if (liveShowAudienceWidget.LLJJJ == null) {
                Context context = liveShowAudienceWidget.context;
                C306101Gp c306101Gp = liveShowAudienceWidget.LLJJJIL;
                BaseLiveShowAudienceAndGuestViewModel baseLiveShowAudienceAndGuestViewModel = (BaseLiveShowAudienceAndGuestViewModel) liveShowAudienceWidget.LLILLJJLI;
                if (baseLiveShowAudienceAndGuestViewModel != null && (mutableLiveData3 = baseLiveShowAudienceAndGuestViewModel.LLJILJIL) != null) {
                    value = mutableLiveData3.getValue();
                } else {
                    value = null;
                }
                T t = liveShowAudienceWidget.LLILLJJLI;
                if (t != 0 && (mutableLiveData2 = t.LLILLJJLI) != null) {
                    value2 = mutableLiveData2.getValue();
                } else {
                    value2 = null;
                }
                DataChannel dataChannel = liveShowAudienceWidget.dataChannel;
                T t2 = liveShowAudienceWidget.LLILLJJLI;
                if (t2 != 0 && (mutableLiveData = t2.LLILZ) != null && (value3 = mutableLiveData.getValue()) != null) {
                    lValueOf = Long.valueOf(value3.durationPerGuest);
                }
                liveShowAudienceWidget.LLJJJ = new C01HL(context, c306101Gp, value, value2, dataChannel, lValueOf);
            }
            C01HL c01hl = liveShowAudienceWidget.LLJJJ;
            if (c01hl != null) {
                c01hl.show();
                C785410UrT.LIZIZ(c01hl);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(c01hl);
                C816490W1f.LIZ(c01hl);
            }
            C01HL c01hl2 = liveShowAudienceWidget.LLJJJ;
            if (c01hl2 != null) {
                c01hl2.setOnDismissListener(new DialogInterfaceOnDismissListenerC512701zB(liveShowAudienceWidget, 6));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(C5183020f c5183020f, Object obj) {
        C303501Fp c303501Fp = (C303501Fp) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowNextGuestEvent, this: ");
        sbLIZ.append((BaseLiveShowViewModel) c5183020f.l0);
        C20441214yg.LIZIZ("remain time test", C2188811AlT.LIZIZ(sbLIZ));
        ((BaseLiveShowViewModel) c5183020f.l0).CQ2(c303501Fp);
        ((BaseLiveShowViewModel) c5183020f.l0).AQ2(c303501Fp.LIZJ, c303501Fp.LIZLLL, true);
        return Unit.LIZ;
    }

    public static final Object invoke$58(C5183020f c5183020f, Object obj) {
        List<ShowListUser> list;
        ShowContent showContent = (ShowContent) obj;
        BaseLiveShowViewModel baseLiveShowViewModel = (BaseLiveShowViewModel) c5183020f.l0;
        List<ShowListUser> list2 = null;
        if (showContent != null) {
            list = showContent.showingAndReadyList;
            list2 = showContent.finishedList;
        } else {
            list = null;
        }
        baseLiveShowViewModel.AQ2(list, list2, true);
        return Unit.LIZ;
    }

    public static final Object invoke$59(C5183020f c5183020f, Object obj) {
        ShowContent showContent = (ShowContent) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowTransitionStartEvent, this: ");
        sbLIZ.append(showContent);
        C20441214yg.LIZIZ("remain time test", C2188811AlT.LIZIZ(sbLIZ));
        C01HA.LIZIZ(null);
        ((BaseLiveShowViewModel) c5183020f.l0).AQ2(showContent.showingAndReadyList, showContent.finishedList, true);
        ((BaseLiveShowViewModel) c5183020f.l0).LLILZIL.setValue(showContent);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(C5183020f c5183020f, Object obj) {
        return ((Function1) c5183020f.l0).invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
    }

    public static final Object invoke$60(C5183020f c5183020f, Object obj) {
        LiveDialog liveDialog = ((BaseLiveShowWidget) c5183020f.l0).LLJILJILJ;
        if (liveDialog != null) {
            C500260Jjc.LJJLIIIJL(liveDialog);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(C5183020f c5183020f, Object obj) {
        Integer numValueOf;
        Pair pair = (Pair) obj;
        BaseLiveShowWidget baseLiveShowWidget = (BaseLiveShowWidget) c5183020f.l0;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        ShowListUser showListUser = (ShowListUser) pair.getSecond();
        String str = null;
        if (showListUser != null) {
            numValueOf = Integer.valueOf(showListUser.order);
        } else {
            numValueOf = null;
        }
        ShowListUser showListUser2 = (ShowListUser) pair.getSecond();
        if (showListUser2 != null) {
            str = showListUser2.nickname;
        }
        baseLiveShowWidget.E1(iIntValue, numValueOf, str, (ShowListUser) pair.getSecond(), false);
        return Unit.LIZ;
    }

    public static final Object invoke$62(C5183020f c5183020f, Object obj) {
        ShowConfig showConfig;
        ShowContent showContent = (ShowContent) obj;
        ShowConfig value = ((MidLiveShowViewModel) c5183020f.l0).LLILZ.getValue();
        ShowConfig showConfig2 = null;
        if (showContent != null) {
            showConfig = showContent.showConfig;
        } else {
            showConfig = null;
        }
        if (!C01HA.LJFF(value, showConfig)) {
            MutableLiveData<ShowConfig> mutableLiveData = ((MidLiveShowViewModel) c5183020f.l0).LLILZ;
            if (showContent != null) {
                showConfig2 = showContent.showConfig;
            }
            mutableLiveData.setValue(showConfig2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$63(C5183020f c5183020f, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowEndEvent, source=");
        sbLIZ.append((String) obj);
        C20441214yg.LJIIIZ("MidLiveShowViewModel", C2188811AlT.LIZIZ(sbLIZ));
        ((MidLiveShowViewModel) c5183020f.l0).GQ2(null);
        return Unit.LIZ;
    }

    public static final Object invoke$64(C5183020f c5183020f, Object obj) {
        C19487111Lx c19487111Lx = ((LiveShowGuestViewModel) c5183020f.l0).LLJILLL;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        ((LiveShowGuestViewModel) c5183020f.l0).LLJILLL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$65(C5183020f c5183020f, Object obj) {
        ((LiveShowGuestWidget) c5183020f.l0).I1("banner");
        return Unit.LIZ;
    }

    public static final Object invoke$66(C5183020f c5183020f, Object obj) {
        ((LiveShowModeratorWidget) c5183020f.l0).y1();
        return Unit.LIZ;
    }

    public static final Object invoke$67(C5183020f c5183020f, Object obj) {
        String str;
        C306601Gu c306601Gu = (C306601Gu) obj;
        C306901Gx.LJIIJJI(c306601Gu.LIZ);
        if (C930540aK4.LJFF()) {
            C306901Gx.LJIILLIIL(c306601Gu.LIZ);
        } else {
            C306901Gx.LJIIL(c306601Gu.LIZ);
        }
        LiveShowModeratorWidget liveShowModeratorWidget = (LiveShowModeratorWidget) c5183020f.l0;
        if (Intrinsics.LJFF(c306601Gu.LIZ, "liveshow_banner")) {
            str = "banner";
        } else {
            str = "info_icon";
        }
        liveShowModeratorWidget.LLLLLLLLL(str, null);
        return Unit.LIZ;
    }

    public static final Object invoke$68(C5183020f c5183020f, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRecord failed ");
        sbLIZ.append(obj);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "AnchorTextHeaderCreationSheetFragment", 2);
        ((AnchorTextHeaderCreationSheetFragment) c5183020f.l0).zS();
        return Unit.LIZ;
    }

    public static final Object invoke$69(C5183020f c5183020f, Object obj) {
        TextHeaderPlayContent textHeaderPlayContent;
        GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo = (GetMemoryInfoResponse.ResponseData.MemoryInfo) obj;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = (AnchorTextHeaderViewModel) c5183020f.l0;
        if (memoryInfo != null) {
            textHeaderPlayContent = memoryInfo.textHeader;
        } else {
            textHeaderPlayContent = null;
        }
        anchorTextHeaderViewModel.HQ2(textHeaderPlayContent, "TextHeaderMemoryInfoChannel");
        return Unit.LIZ;
    }

    public static final Object invoke$7(C5183020f c5183020f, Object obj) {
        ((Function0) c5183020f.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$70(C5183020f c5183020f, Object obj) {
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = (AnchorTextHeaderViewModel) c5183020f.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBoardLokiFontList throwable:");
        sbLIZ.append(obj);
        anchorTextHeaderViewModel.NQ2(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$71(X.C5183020f r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$71(X.020f, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$72(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = ((AnchorTextHeaderCreationSheetFragment) c5183020f.l0).LLL;
        if (anchorTextHeaderViewModel != null) {
            C2469909m5.LIZ(iIntValue);
            MutableLiveData<C01F5> mutableLiveData = anchorTextHeaderViewModel.LLJJ;
            C01F5 value = mutableLiveData.getValue();
            if (value == null) {
                String str = null;
                value = new C01F5(str, str, 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, 255);
            }
            mutableLiveData.setValue(C01F5.LIZ(value, null, null, iIntValue, false, 0.0f, 251));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$73(C5183020f c5183020f, Object obj) {
        TextHeaderRecordCreateResponse.ResponseData responseData = (TextHeaderRecordCreateResponse.ResponseData) obj;
        ((AnchorTextHeaderCreationSheetFragment) c5183020f.l0).FS(responseData.success, responseData.textHeaderRecordInfo);
        return Unit.LIZ;
    }

    public static final Object invoke$74(C5183020f c5183020f, Object obj) {
        TextHeaderRecordUpdateResponse.ResponseData responseData = (TextHeaderRecordUpdateResponse.ResponseData) obj;
        ((AnchorTextHeaderCreationSheetFragment) c5183020f.l0).FS(responseData.success, responseData.textHeaderRecordInfo);
        return Unit.LIZ;
    }

    public static final Object invoke$75(C5183020f c5183020f, Object obj) {
        C354001Za c354001Za;
        boolean z;
        Boolean boolValueOf = null;
        if ((obj instanceof C354001Za) && (c354001Za = (C354001Za) obj) != null) {
            C01ZA c01za = (C01ZA) c5183020f.l0;
            if (c01za != null && c01za.LIZLLL == c354001Za.LIZIZ.LIZLLL) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        return Boolean.valueOf(C500260Jjc.LJJJI(boolValueOf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$76(C5183020f c5183020f, Object obj) {
        ((Number) obj).intValue();
        BaseTextHeaderViewModel baseTextHeaderViewModel = (BaseTextHeaderViewModel) c5183020f.l0;
        baseTextHeaderViewModel.GQ2((C01ZA) baseTextHeaderViewModel.LLILZ.getValue(), "LinkMicSceneChangeChannel");
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$77(C5183020f c5183020f, Object obj) {
        ((Number) obj).intValue();
        BaseTextHeaderViewModel baseTextHeaderViewModel = (BaseTextHeaderViewModel) c5183020f.l0;
        baseTextHeaderViewModel.GQ2((C01ZA) baseTextHeaderViewModel.LLILZ.getValue(), "LinkerModeChangeChannel");
        return Unit.LIZ;
    }

    public static final Object invoke$78(C5183020f c5183020f, Object obj) {
        EnumC976700bWW enumC976700bWW = (EnumC976700bWW) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxInteractiveStatusChannel status=");
        sbLIZ.append(enumC976700bWW);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        ((InteractionLynxContainerLayout) c5183020f.l0).lp(enumC976700bWW);
        return Unit.LIZ;
    }

    public static final Object invoke$79(C5183020f c5183020f, Object obj) {
        C092600Wm c092600Wm = (C092600Wm) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutDidChange trigger=");
        sbLIZ.append(c092600Wm.LIZ);
        sbLIZ.append(" layout=");
        sbLIZ.append(c092600Wm.LIZIZ);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        ((InteractionLynxContainerLayout) c5183020f.l0).up(new C16A4() { // from class: X.00Wo
            @Override // X.C16A4
            public final String getEventName() {
                return "liverevenue_cohost_event_common_layout_did_change";
            }
        }, new EventParams$LayoutDidChange(c092600Wm.LIZ, c092600Wm.LIZIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$8(C5183020f c5183020f, Object obj) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((BulletinBoardPageHybridAssem) c5183020f.l0), null, null, new C340201Ts((Runnable) obj, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$80(C5183020f c5183020f, Object obj) {
        ((AIReplyAssistantFeedbackDialog) c5183020f.l0).close(1);
        return Unit.LIZ;
    }

    public static final Object invoke$81(C5183020f c5183020f, Object obj) {
        ((AIReplyAssistantProfileDialog) c5183020f.l0).close(1);
        return Unit.LIZ;
    }

    public static final Object invoke$82(C5183020f c5183020f, Object obj) {
        boolean z;
        Sticker sticker = (Sticker) obj;
        int i = sticker.type;
        RoomSticker roomSticker = (RoomSticker) c5183020f.l0;
        if (i == roomSticker.type && sticker.id == roomSticker.id) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$83(C5183020f c5183020f, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            LiveDialog liveDialog = ((C782020Um0) c5183020f.l0).LLILZIL;
            if (liveDialog != null) {
                C786410Ut5.E4(liveDialog);
            }
        } else {
            LiveDialog liveDialog2 = ((C782020Um0) c5183020f.l0).LLILZIL;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
                C785410UrT.LIZ(liveDialog2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$84(C5183020f c5183020f, Object obj) {
        String string;
        User owner;
        SparkContext sparkContext = (SparkContext) obj;
        C782020Um0 c782020Um0 = (C782020Um0) c5183020f.l0;
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(c782020Um0.LLILLJJLI);
        if (roomLJJLIIIIJ == null || (owner = roomLJJLIIIIJ.getOwner()) == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        sparkContext.LJJJZ("anchor_id", string);
        sparkContext.LJJJZ("room_id", String.valueOf(C500260Jjc.LJJLIIIJ(c782020Um0.LLILLJJLI)));
        return Unit.LIZ;
    }

    public static final Object invoke$85(C5183020f c5183020f, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        CaptchaLiveWidget captchaLiveWidget = (CaptchaLiveWidget) c5183020f.l0;
        captchaLiveWidget.getClass();
        if (jLongValue != 0) {
            if (!captchaLiveWidget.isShowing()) {
                CaptchaLiveWidget captchaLiveWidget2 = (CaptchaLiveWidget) c5183020f.l0;
                captchaLiveWidget2.getClass();
                captchaLiveWidget2.LLILLL = new CountDownTimerC511401yy((CaptchaLiveWidget) c5183020f.l0, jLongValue * 1000, 0);
                ((CaptchaLiveWidget) c5183020f.l0).show();
                CountDownTimerC511401yy countDownTimerC511401yy = ((CaptchaLiveWidget) c5183020f.l0).LLILLL;
                if (countDownTimerC511401yy != null) {
                    countDownTimerC511401yy.start();
                }
            }
        } else if (((CaptchaLiveWidget) c5183020f.l0).isShowing()) {
            CaptchaLiveWidget captchaLiveWidget3 = (CaptchaLiveWidget) c5183020f.l0;
            captchaLiveWidget3.hide();
            CountDownTimerC511401yy countDownTimerC511401yy2 = captchaLiveWidget3.LLILLL;
            if (countDownTimerC511401yy2 != null) {
                countDownTimerC511401yy2.cancel();
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$86(C5183020f c5183020f, Object obj) {
        UnifiedBannerData unifiedBannerData;
        Integer num;
        LiveIconView liveIconView;
        View view;
        TextView textView;
        TextView textView2;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) obj;
        if (!((PreviewECommerceGrowthTaskWidget) c5183020f.l0).isShowing() && (unifiedBannerData = roomCreateInfo.ecomGrowthLineBanner) != null) {
            PreviewECommerceGrowthTaskWidget previewECommerceGrowthTaskWidget = (PreviewECommerceGrowthTaskWidget) c5183020f.l0;
            Integer num2 = C0UKZ.LLIZ.LIZIZ().get(unifiedBannerData.frequencyKey);
            if ((num2 == null || num2.intValue() < 3) && ((num = C0UKZ.LLIZLLLIL.LIZIZ().get(unifiedBannerData.frequencyKey)) == null || num.intValue() < 1)) {
                View view2 = previewECommerceGrowthTaskWidget.getView();
                if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.tv_title)) != null) {
                    textView2.setText(unifiedBannerData.title);
                }
                View view3 = previewECommerceGrowthTaskWidget.getView();
                if (view3 != null && (textView = (TextView) view3.findViewById(R.id.tv_subtitle)) != null) {
                    textView.setText(unifiedBannerData.subTitle);
                }
                if (C123100dR.LIZ(unifiedBannerData.title) || C123100dR.LIZ(unifiedBannerData.subTitle)) {
                    previewECommerceGrowthTaskWidget.show();
                    previewECommerceGrowthTaskWidget.LLILZIL = unifiedBannerData.frequencyKey;
                }
                if (C123100dR.LIZ(unifiedBannerData.schema) && (view = previewECommerceGrowthTaskWidget.getView()) != null) {
                    C786410Ut5.I7(new ViewOnClickListenerC511801z2(previewECommerceGrowthTaskWidget, unifiedBannerData, 2), view);
                }
                View view4 = previewECommerceGrowthTaskWidget.getView();
                if (view4 != null && (liveIconView = (LiveIconView) view4.findViewById(R.id.zdv)) != null) {
                    C786410Ut5.g8(liveIconView, new ViewOnClickListenerC511801z2(previewECommerceGrowthTaskWidget, unifiedBannerData, 3));
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$87(X.C5183020f r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$87(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$88(C5183020f c5183020f, Object obj) {
        MultiPreviewInviteGuestWidget multiPreviewInviteGuestWidget = (MultiPreviewInviteGuestWidget) c5183020f.l0;
        multiPreviewInviteGuestWidget.getClass();
        String str = LiveInviteGuestSheet._pnsPageId;
        Bundle bundle = new Bundle();
        LiveInviteGuestSheet liveInviteGuestSheet = new LiveInviteGuestSheet();
        liveInviteGuestSheet.setArguments(bundle);
        long jLJFF = C19322110iZ.LJFF((FragmentManager) multiPreviewInviteGuestWidget.dataChannel.gg0(C748880TZe.class), liveInviteGuestSheet, "inviteFriendsSheet", null, 0);
        if (jLJFF > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInviteGuestClick trigger LiveInviteFriendsSheet show: token = ");
            sbLIZ.append(jLJFF);
            C20441214yg.LIZIZ("MultiPreviewInviteGuestWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_auto_invite_setting_entrance");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJIIZI(C419301k7.LIZ());
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$89(C5183020f c5183020f, Object obj) {
        C16FV c16fv;
        LiveIconView liveIconView;
        TuxTextView tuxTextView;
        float f;
        TextView textView;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) obj;
        boolean z = true;
        if (roomCreateInfo.campaignBannerData != null && !((PreviewIncentiveCampaignWidget) c5183020f.l0).isShowing()) {
            ((PreviewIncentiveCampaignWidget) c5183020f.l0).show();
            PreviewIncentiveCampaignWidget previewIncentiveCampaignWidget = (PreviewIncentiveCampaignWidget) c5183020f.l0;
            CampaignBannerData campaignBannerData = roomCreateInfo.campaignBannerData;
            previewIncentiveCampaignWidget.getClass();
            previewIncentiveCampaignWidget.LLILZ = campaignBannerData.title;
            View view = previewIncentiveCampaignWidget.getView();
            if (view != null && (textView = (TextView) view.findViewById(R.id.brk)) != null) {
                textView.setText(previewIncentiveCampaignWidget.LLILZ);
            }
            View view2 = previewIncentiveCampaignWidget.getView();
            View viewFindViewById = null;
            if (view2 != null) {
                c16fv = (C16FV) view2.findViewById(R.id.brn);
            } else {
                c16fv = null;
            }
            if (campaignBannerData.imageText.length() <= 0) {
                z = false;
            }
            if (z) {
                if (c16fv != null) {
                    c16fv.setImageResource(R.drawable.ezi);
                    c16fv.setScaleType(ImageView.ScaleType.FIT_XY);
                }
                View view3 = previewIncentiveCampaignWidget.getView();
                if (view3 != null && (tuxTextView = (TuxTextView) view3.findViewById(R.id.kf1)) != null) {
                    tuxTextView.setText(campaignBannerData.imageText);
                    if (C497740JfY.LJJ()) {
                        f = -18.0f;
                    } else {
                        f = 18.0f;
                    }
                    C786410Ut5.Gb(tuxTextView, f);
                    C500260Jjc.LLFFF(tuxTextView);
                }
            } else {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(campaignBannerData.image);
                c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
                c1324610kZfLJIIIZ.LJJI(c16fv);
                View view4 = previewIncentiveCampaignWidget.getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.kf1);
                }
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
            if (previewIncentiveCampaignWidget.isShowing()) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_activity_banner_show");
                c474500IjALIZ.LJIJJLI(previewIncentiveCampaignWidget.dataChannel);
                c474500IjALIZ.LJJII("incentive_campaign_for_new_live_creators", "activity_name");
                c474500IjALIZ.LJJII("live_take_page", "banner_page");
                c474500IjALIZ.LIZ();
            }
            View view5 = previewIncentiveCampaignWidget.getView();
            if (view5 != null) {
                C786410Ut5.I7(new ViewOnClickListenerC511801z2(previewIncentiveCampaignWidget, campaignBannerData, 17), view5);
            }
            View view6 = previewIncentiveCampaignWidget.getView();
            if (view6 != null && (liveIconView = (LiveIconView) view6.findViewById(R.id.e1y)) != null) {
                C786410Ut5.g8(liveIconView, new ViewOnClickListenerC512201z6(previewIncentiveCampaignWidget, 55));
            }
        } else {
            ((PreviewIncentiveCampaignWidget) c5183020f.l0).hide();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(C5183020f c5183020f, Object obj) {
        List<String> list = ((SkuImage) obj).skuPropValueIds;
        if (list == null) {
            return Boolean.FALSE;
        }
        int size = list.size();
        String[] strArr = (String[]) c5183020f.l0;
        boolean z = false;
        if (size == strArr.length) {
            int length = strArr.length;
            ArrayList<Pair> arrayList = new ArrayList(Math.min(C15438062q.LJIJJ(list, 10), length));
            int i = 0;
            for (String str : list) {
                if (i >= length) {
                    break;
                }
                arrayList.add(new Pair(strArr[i], str));
                i++;
            }
            if (!arrayList.isEmpty()) {
                for (Pair pair : arrayList) {
                    String str2 = (String) pair.getFirst();
                    Object second = pair.getSecond();
                    if (!a0.LJJJIL(str2) && !Intrinsics.LJFF(str2, second)) {
                        break;
                    }
                }
                z = true;
            } else {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$90(C5183020f c5183020f, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        View view = ((PreviewInviteGuestWidget) c5183020f.l0).getView();
        if (view != null) {
            C0ULO.LIZ(view, iIntValue, "PreviewInviteGuestWidget", true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa A[PHI: r5
      0x01fa: PHI (r5v1 tikcast.api.anchor.GrowthJourneyBannerItem) = (r5v0 tikcast.api.anchor.GrowthJourneyBannerItem), (r5v4 tikcast.api.anchor.GrowthJourneyBannerItem) binds: [B:92:0x01f6, B:8:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$91(X.C5183020f r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$91(X.020f, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$92(C5183020f c5183020f, Object obj) {
        C16FV c16fv;
        View viewFindViewById;
        View viewFindViewById2;
        TextView textView;
        TextView textView2;
        NewAnchorIncentiveBannerData newAnchorIncentiveBannerData = ((RoomCreateInfo) obj).newAnchorIncentiveBannerData;
        if (newAnchorIncentiveBannerData != null) {
            PreviewNotLOPNewCreatorWidget previewNotLOPNewCreatorWidget = (PreviewNotLOPNewCreatorWidget) c5183020f.l0;
            previewNotLOPNewCreatorWidget.getClass();
            Boolean bool = C0UKZ.LLIILZL.LIZIZ().get(Long.valueOf(newAnchorIncentiveBannerData.subType));
            Boolean bool2 = Boolean.FALSE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                View view = previewNotLOPNewCreatorWidget.getView();
                if (view != null && (textView2 = (TextView) view.findViewById(R.id.bsc)) != null) {
                    textView2.setText(newAnchorIncentiveBannerData.title);
                }
                View view2 = previewNotLOPNewCreatorWidget.getView();
                if (view2 != null && (textView = (TextView) view2.findViewById(R.id.bs_)) != null) {
                    textView.setText(newAnchorIncentiveBannerData.subTitle);
                }
                View view3 = previewNotLOPNewCreatorWidget.getView();
                if (view3 != null) {
                    c16fv = (C16FV) view3.findViewById(R.id.brn);
                } else {
                    c16fv = null;
                }
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(newAnchorIncentiveBannerData.image);
                c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLJIIIZ.LJJ = bool2;
                View view4 = previewNotLOPNewCreatorWidget.getView();
                if (view4 != null) {
                    viewFindViewById = view4.findViewById(R.id.brn);
                } else {
                    viewFindViewById = null;
                }
                c1324610kZfLJIIIZ.LJJI(viewFindViewById);
                if (C497740JfY.LJJ() && c16fv != null) {
                    C786410Ut5.bc(c16fv, -1.0f);
                }
                View view5 = previewNotLOPNewCreatorWidget.getView();
                if (view5 != null) {
                    C500260Jjc.LJLIIIL(500L, view5, new C020W(previewNotLOPNewCreatorWidget, newAnchorIncentiveBannerData, 69));
                }
                View view6 = previewNotLOPNewCreatorWidget.getView();
                if (view6 != null && (viewFindViewById2 = view6.findViewById(R.id.e1y)) != null) {
                    C500260Jjc.LJLIIIL(500L, viewFindViewById2, new C020W(previewNotLOPNewCreatorWidget, newAnchorIncentiveBannerData, 70));
                }
                previewNotLOPNewCreatorWidget.show();
                C770220UJg c770220UJg = C770220UJg.LIZ;
                if (!C770220UJg.LJI(C13LE.LIZ(PreviewNotLOPNewCreatorWidget.class))) {
                    previewNotLOPNewCreatorWidget.H1(CardStruct.IStatusCode.DEFAULT, "priority", newAnchorIncentiveBannerData.metricsMap);
                } else {
                    previewNotLOPNewCreatorWidget.G1("livesdk_banner_show", newAnchorIncentiveBannerData.metricsMap);
                    previewNotLOPNewCreatorWidget.H1("1", null, newAnchorIncentiveBannerData.metricsMap);
                }
            } else {
                previewNotLOPNewCreatorWidget.H1(CardStruct.IStatusCode.DEFAULT, "already_click_close", newAnchorIncentiveBannerData.metricsMap);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$93(C5183020f c5183020f, Object obj) {
        String string;
        RoomCreateInfo roomCreateInfo;
        String string2;
        RoomCreateInfo roomCreateInfo2;
        View view = (View) obj;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("tiktokec_button_click");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        DataChannel dataChannel = ((PreviewShoppingManageLiveWidget) c5183020f.l0).dataChannel;
        if (dataChannel == null || (roomCreateInfo2 = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) == null || (string = Long.valueOf(roomCreateInfo2.mLastRoomId).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "room_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII("manage_live_button", "button_name");
        c474500IjALIZ.LJJII("live_take_page", "page_name");
        c474500IjALIZ.LIZ();
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = view.getContext();
        Uri.Builder builderBuildUpon = UriProtector.parse(PreviewShoppingManageLiveSchemaSetting.INSTANCE.getValue()).buildUpon();
        DataChannel dataChannel2 = ((PreviewShoppingManageLiveWidget) c5183020f.l0).dataChannel;
        if (dataChannel2 != null && (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) != null && (string2 = Long.valueOf(roomCreateInfo.mLastRoomId).toString()) != null) {
            iActionHandlerService.handle(context, builderBuildUpon.appendQueryParameter("room_id", string2).appendQueryParameter("is_living", "true").appendQueryParameter("manage_shopping_live", "true").build().toString());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$94(C5183020f c5183020f, Object obj) {
        ((LiveBoardsWidget) c5183020f.l0).X1((C470590Icr) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$95(C5183020f c5183020f, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        LiveBoardsWidget liveBoardsWidget = (LiveBoardsWidget) c5183020f.l0;
        if (jLongValue != 0) {
            AnonymousClass0956 anonymousClass0956 = liveBoardsWidget.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            liveBoardsWidget.LLJ = C23250099c.LIZLLL(liveBoardsWidget.LLIZLLLIL, C0PEM.LIZ, null, new C01QJ(jLongValue, liveBoardsWidget, null), 2);
        } else {
            AnonymousClass0956 anonymousClass09562 = liveBoardsWidget.LLJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$96(C5183020f c5183020f, Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            ((GameDropsPreviewBanner) c5183020f.l0).LLJILJIL = ((PartnershipBriefDrops) ListProtector.get(list, 0)).idStr;
            GameDropsPreviewBanner gameDropsPreviewBanner = (GameDropsPreviewBanner) c5183020f.l0;
            String str = ((PartnershipBriefDrops) ListProtector.get(list, 0)).idStr;
            gameDropsPreviewBanner.getClass();
            C20337914i1<String> c20337914i1 = InterfaceC772390URp.f129X;
            if (!Intrinsics.LJFF(c20337914i1.LIZIZ(), str)) {
                c20337914i1.LJFF(str);
                InterfaceC772390URp.W.LJFF(0L);
            }
            GameDropsPreviewBanner gameDropsPreviewBanner2 = (GameDropsPreviewBanner) c5183020f.l0;
            gameDropsPreviewBanner2.LLJIJIL = true;
            gameDropsPreviewBanner2.show();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$97(C5183020f c5183020f, Object obj) {
        boolean zLJFF;
        GameEventPreviewBanner gameEventPreviewBanner;
        DataChannel dataChannel;
        C193100oj c193100oj = (C193100oj) obj;
        DataChannel dataChannel2 = ((GameEventPreviewBanner) c5183020f.l0).dataChannel;
        if (dataChannel2 != null) {
            zLJFF = Intrinsics.LJFF(dataChannel2.gg0(C750300Tbw.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (c193100oj.LIZ && !zLJFF) {
            GameEventPreviewBanner gameEventPreviewBanner2 = (GameEventPreviewBanner) c5183020f.l0;
            DataChannel dataChannel3 = gameEventPreviewBanner2.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.BQ2(gameEventPreviewBanner2, HashtagDialogPageChannel.class, new C5183020f(gameEventPreviewBanner2, 12));
            }
            DataChannel dataChannel4 = gameEventPreviewBanner2.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.EQ2(gameEventPreviewBanner2, PreviewPagerSelectedGameItem.class, new C5183020f(gameEventPreviewBanner2, 13));
            }
            if (c193100oj.LIZIZ.isEmpty()) {
                GameEventPreviewBanner gameEventPreviewBanner3 = (GameEventPreviewBanner) c5183020f.l0;
                gameEventPreviewBanner3.getClass();
                C480460Ism.LIZ().getClass();
                ((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).requestEventInfo(1).LJIILIIL(new C0UO0()).LJJLL(new C516201zk(gameEventPreviewBanner3, 16), new C09JN() { // from class: X.00Jb
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("GameEventPreviewBanner@faaf.queryAvailableEvent$2");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("error in requestEventInfo: ");
                        sbLIZ.append(obj2);
                        C20441214yg.LJ("GameEventPreviewBanner", C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("GameEventPreviewBanner@faaf.queryAvailableEvent$2");
                    }
                });
            } else {
                GameEventPreviewBanner gameEventPreviewBanner4 = (GameEventPreviewBanner) c5183020f.l0;
                gameEventPreviewBanner4.LLJILJIL = c193100oj.LIZIZ;
                gameEventPreviewBanner4.N1();
            }
        }
        if (c193100oj.LIZ && zLJFF && (dataChannel = (gameEventPreviewBanner = (GameEventPreviewBanner) c5183020f.l0).dataChannel) != null) {
            dataChannel.BQ2(gameEventPreviewBanner, PreviewPagerSelectedGameItem.class, new C5183020f(gameEventPreviewBanner, 101));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$98(C5183020f c5183020f, Object obj) {
        AnchorInfoResponse.LabelFilterInfo labelFilterInfo = (AnchorInfoResponse.LabelFilterInfo) obj;
        if (labelFilterInfo != null && labelFilterInfo.gpppaAccount && C1533950q1J.LJ(labelFilterInfo.gpppaBanText)) {
            GameGpppaPreviewBanner gameGpppaPreviewBanner = (GameGpppaPreviewBanner) c5183020f.l0;
            gameGpppaPreviewBanner.LLJILJIL = true;
            TextView textView = gameGpppaPreviewBanner.LLJI;
            if (textView != null) {
                textView.setText(labelFilterInfo.gpppaBanText);
            }
            ((GameGpppaPreviewBanner) c5183020f.l0).show();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$99(X.C5183020f r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5183020f.invoke$99(X.020f, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C216800sY c216800sY, int i) {
        super(1);
        this.$t = i;
        this.l0 = c216800sY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(C259800zU c259800zU, C259800zU<Long> c259800zU2) {
        super(1);
        this.$t = c259800zU2;
        this.l0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C261600zm c261600zm, int i) {
        super(1);
        this.$t = i;
        this.l0 = c261600zm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C262300zt c262300zt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c262300zt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C2632010c c2632010c, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2632010c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C299901Ef c299901Ef, int i) {
        super(1);
        this.$t = i;
        this.l0 = c299901Ef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C300201Ei c300201Ei, int i) {
        super(1);
        this.$t = i;
        this.l0 = c300201Ei;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C01FC c01fc, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01fc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(C01GW c01gw, C01GW<? extends List<String>> c01gw2) {
        super(1);
        this.$t = c01gw2;
        this.l0 = c01gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C01HJ c01hj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01hj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C01IT c01it, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01it;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C311201Io c311201Io, int i) {
        super(1);
        this.$t = i;
        this.l0 = c311201Io;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C01JP c01jp, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01jp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C01SE c01se, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01se;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C341401Ue c341401Ue, int i) {
        super(1);
        this.$t = i;
        this.l0 = c341401Ue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C01ZA c01za, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01za;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C01ZJ c01zj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01zj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C355501Zp c355501Zp, int i) {
        super(1);
        this.$t = i;
        this.l0 = c355501Zp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C381901e5 c381901e5, int i) {
        super(1);
        this.$t = i;
        this.l0 = c381901e5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C382901eF c382901eF, int i) {
        super(1);
        this.$t = i;
        this.l0 = c382901eF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C394101g3 c394101g3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c394101g3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C429901lp c429901lp, int i) {
        super(1);
        this.$t = i;
        this.l0 = c429901lp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(DialogC430701lx dialogC430701lx, int i) {
        super(1);
        this.$t = i;
        this.l0 = dialogC430701lx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C451201pG c451201pG, int i) {
        super(1);
        this.$t = i;
        this.l0 = c451201pG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(InterfaceC469401sC interfaceC469401sC, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC469401sC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C490301vZ c490301vZ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c490301vZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C499301x1 c499301x1, int i) {
        super(1);
        this.$t = i;
        this.l0 = c499301x1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C020R c020r, int i) {
        super(1);
        this.$t = i;
        this.l0 = c020r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C020W c020w, int i) {
        super(1);
        this.$t = i;
        this.l0 = c020w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(AnonymousClass0956 anonymousClass0956, int i) {
        super(1);
        this.$t = i;
        this.l0 = anonymousClass0956;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C23260099m c23260099m, int i) {
        super(1);
        this.$t = i;
        this.l0 = c23260099m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C419910GdJ c419910GdJ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c419910GdJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C445880He6 c445880He6, int i) {
        super(1);
        this.$t = i;
        this.l0 = c445880He6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(C470590Icr c470590Icr, C470590Icr<CompetitionInfo> c470590Icr2) {
        super(1);
        this.$t = c470590Icr2;
        this.l0 = c470590Icr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C780930UkF c780930UkF, int i) {
        super(1);
        this.$t = i;
        this.l0 = c780930UkF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C782020Um0 c782020Um0, int i) {
        super(1);
        this.$t = i;
        this.l0 = c782020Um0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C0VSJ c0vsj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0vsj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C928790aHF c928790aHF, int i) {
        super(1);
        this.$t = i;
        this.l0 = c928790aHF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C1103880epe c1103880epe, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1103880epe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C1109300eyO c1109300eyO, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1109300eyO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C1127650fRz c1127650fRz, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1127650fRz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C1128710fTh c1128710fTh, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1128710fTh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C1826670xdR c1826670xdR, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1826670xdR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C1842860y3Y c1842860y3Y, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1842860y3Y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C11JF c11jf, int i) {
        super(1);
        this.$t = i;
        this.l0 = c11jf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C12VS c12vs, int i) {
        super(1);
        this.$t = i;
        this.l0 = c12vs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C20384614pY c20384614pY, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20384614pY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C15B9 c15b9, int i) {
        super(1);
        this.$t = i;
        this.l0 = c15b9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C16F5 c16f5, int i) {
        super(1);
        this.$t = i;
        this.l0 = c16f5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C1AF3 c1af3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1af3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(C2252611DEt c2252611DEt, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(FrameLayout frameLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(Fragment fragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(MutableLiveData mutableLiveData, MutableLiveData<AbstractC1779240wOw<Object>> mutableLiveData2) {
        super(1);
        this.$t = mutableLiveData2;
        this.l0 = mutableLiveData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(EmoteModel emoteModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = emoteModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveDialog liveDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LinkMicAbilityManager linkMicAbilityManager, int i) {
        super(1);
        this.$t = i;
        this.l0 = linkMicAbilityManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(BaseVmWidget baseVmWidget, BaseVmWidget<BaseCountdownViewModel> baseVmWidget2) {
        super(1);
        this.$t = baseVmWidget2;
        this.l0 = baseVmWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(WindowMaskAssem windowMaskAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = windowMaskAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(MultiGuestAbstractAvatarFragment multiGuestAbstractAvatarFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiGuestAbstractAvatarFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = countDownForAllV2AnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(BaseCountDownForAllV2Widget baseCountDownForAllV2Widget, BaseCountDownForAllV2Widget<VM> baseCountDownForAllV2Widget2) {
        super(1);
        this.$t = baseCountDownForAllV2Widget2;
        this.l0 = baseCountDownForAllV2Widget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = countDownForAllV2ScoreDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = countDownForAllV2SettingsDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CountDownForAllV2GuestWidget countDownForAllV2GuestWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = countDownForAllV2GuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GuestShowdownAnchorWidget guestShowdownAnchorWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownAnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(BaseGuestShowdownWidget baseGuestShowdownWidget, BaseGuestShowdownWidget<VM> baseGuestShowdownWidget2) {
        super(1);
        this.$t = baseGuestShowdownWidget2;
        this.l0 = baseGuestShowdownWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GuestShowdownEndDialog guestShowdownEndDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownEndDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GuestShowdownRankDialog guestShowdownRankDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownRankDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GuestShowdownInPunishmentSettingsDialog guestShowdownInPunishmentSettingsDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownInPunishmentSettingsDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownOngoingSettingsDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GuestShowdownGuestWidget guestShowdownGuestWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = guestShowdownGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BasePlaybookEditorViewModel basePlaybookEditorViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = basePlaybookEditorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PlaybookEditorDialog playbookEditorDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = playbookEditorDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PlaybookEditorMoreDialog playbookEditorMoreDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = playbookEditorMoreDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveShowAnchorViewModel liveShowAnchorViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveShowAnchorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveShowAnchorWidget liveShowAnchorWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveShowAnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveShowAudienceViewModel liveShowAudienceViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveShowAudienceViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveShowAudienceWidget liveShowAudienceWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveShowAudienceWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BaseLiveShowViewModel baseLiveShowViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseLiveShowViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(BaseLiveShowWidget baseLiveShowWidget, BaseLiveShowWidget<T> baseLiveShowWidget2) {
        super(1);
        this.$t = baseLiveShowWidget2;
        this.l0 = baseLiveShowWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(MidLiveShowViewModel midLiveShowViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = midLiveShowViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveShowGuestViewModel liveShowGuestViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveShowGuestViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveShowGuestWidget liveShowGuestWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveShowGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveShowModeratorWidget liveShowModeratorWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveShowModeratorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = anchorTextHeaderCreationSheetFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(AnchorTextHeaderViewModel anchorTextHeaderViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = anchorTextHeaderViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(TextHeaderListFragment textHeaderListFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = textHeaderListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BaseTextHeaderViewModel baseTextHeaderViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = baseTextHeaderViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiLiveAsAnchorListDialogV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(InteractionLynxContainerLayout interactionLynxContainerLayout, int i) {
        super(1);
        this.$t = i;
        this.l0 = interactionLynxContainerLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(AIReplyAssistantFeedbackDialog aIReplyAssistantFeedbackDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = aIReplyAssistantFeedbackDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(AIReplyAssistantProfileDialog aIReplyAssistantProfileDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = aIReplyAssistantProfileDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CaptchaLiveWidget captchaLiveWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = captchaLiveWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveBroadcastPreviewFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewECommerceGrowthTaskWidget previewECommerceGrowthTaskWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewECommerceGrowthTaskWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewLiveJourneyBannerWidget previewLiveJourneyBannerWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewLiveJourneyBannerWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(MultiPreviewInviteGuestWidget multiPreviewInviteGuestWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = multiPreviewInviteGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewIncentiveCampaignWidget previewIncentiveCampaignWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewIncentiveCampaignWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewInviteGuestWidget previewInviteGuestWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewInviteGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewLiveGrowthMVPWidget previewLiveGrowthMVPWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewLiveGrowthMVPWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewNotLOPNewCreatorWidget previewNotLOPNewCreatorWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewNotLOPNewCreatorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewShoppingManageLiveWidget previewShoppingManageLiveWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewShoppingManageLiveWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveBoardsWidget liveBoardsWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveBoardsWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GameDropsPreviewBanner gameDropsPreviewBanner, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameDropsPreviewBanner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GameEventPreviewBanner gameEventPreviewBanner, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameEventPreviewBanner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GameGpppaPreviewBanner gameGpppaPreviewBanner, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameGpppaPreviewBanner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewGameDropsWidget previewGameDropsWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewGameDropsWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewPartnershipWidget previewPartnershipWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewPartnershipWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveInviteGuestSheet liveInviteGuestSheet, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveInviteGuestSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BroadcastPreviewBannerWidget broadcastPreviewBannerWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = broadcastPreviewBannerWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(QuickCommentWidget quickCommentWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = quickCommentWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(RoomStickerWrapperWidget roomStickerWrapperWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = roomStickerWrapperWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GameLiveNewBroadcastEducationBannerWidget gameLiveNewBroadcastEducationBannerWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameLiveNewBroadcastEducationBannerWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewHighLightVideoWidget previewHighLightVideoWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewHighLightVideoWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(com.bytedance.android.livesdk.game.model.GuessWidget guessWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = guessWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GameAutoCoverMarkWidget gameAutoCoverMarkWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = gameAutoCoverMarkWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(TimedCompetitionAssem timedCompetitionAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = timedCompetitionAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GroupLiveAudienceWidget groupLiveAudienceWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = groupLiveAudienceWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BroadcastHashTagWidget broadcastHashTagWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = broadcastHashTagWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PreviewHashtagWidget2 previewHashtagWidget2, int i) {
        super(1);
        this.$t = i;
        this.l0 = previewHashtagWidget2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CRMGoalWidgetV2 cRMGoalWidgetV2, int i) {
        super(1);
        this.$t = i;
        this.l0 = cRMGoalWidgetV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(IncentiveTaskWidgetV2 incentiveTaskWidgetV2, int i) {
        super(1);
        this.$t = i;
        this.l0 = incentiveTaskWidgetV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CountdownForAllConfigWrapper countdownForAllConfigWrapper, int i) {
        super(1);
        this.$t = i;
        this.l0 = countdownForAllConfigWrapper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(RoomSticker roomSticker, int i) {
        super(1);
        this.$t = i;
        this.l0 = roomSticker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BackpackMessage backpackMessage, int i) {
        super(1);
        this.$t = i;
        this.l0 = backpackMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(CompetitionRankListMessage competitionRankListMessage, int i) {
        super(1);
        this.$t = i;
        this.l0 = competitionRankListMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GiftWidgetKotlin giftWidgetKotlin, int i) {
        super(1);
        this.$t = i;
        this.l0 = giftWidgetKotlin;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(Room room, int i) {
        super(1);
        this.$t = i;
        this.l0 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GuessWidget guessWidget, int i) {
        super(1);
        this.$t = i;
        this.l0 = guessWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(LiveEventGuestShareDialog liveEventGuestShareDialog, int i) {
        super(1);
        this.$t = i;
        this.l0 = liveEventGuestShareDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = bulletinBoardPageHybridAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = newCreatorCaptionEditViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(PoiCollectListFragment poiCollectListFragment, int i) {
        super(1);
        this.$t = i;
        this.l0 = poiCollectListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(com.ss.android.ugc.aweme.profile.model.User user, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BlackList blackList, int i) {
        super(1);
        this.$t = i;
        this.l0 = blackList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(GetStoryOnThisDayInfoResponse getStoryOnThisDayInfoResponse, int i) {
        super(1);
        this.$t = i;
        this.l0 = getStoryOnThisDayInfoResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(BotCenterCell botCenterCell, int i) {
        super(1);
        this.$t = i;
        this.l0 = botCenterCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(MuteStripSettingService muteStripSettingService, int i) {
        super(1);
        this.$t = i;
        this.l0 = muteStripSettingService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(SelectorLoadingVM selectorLoadingVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = selectorLoadingVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(IMessage iMessage, int i) {
        super(1);
        this.$t = i;
        this.l0 = iMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(Object obj, Object obj2) {
        super(1);
        this.$t = obj2;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(WeakReference weakReference, WeakReference<Function1<String, Unit>> weakReference2) {
        super(1);
        this.$t = weakReference2;
        this.l0 = weakReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(Collection collection, Collection<Object> collection2) {
        super(1);
        this.$t = collection2;
        this.l0 = collection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(HashMap map, HashMap<String, Long> map2) {
        super(1);
        this.$t = map2;
        this.l0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(LinkedHashMap linkedHashMap, LinkedHashMap<String, Integer> linkedHashMap2) {
        super(1);
        this.$t = linkedHashMap2;
        this.l0 = linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(List list, List<Function1<Function1<? super Boolean, Unit>, Unit>> list2) {
        super(1);
        this.$t = list2;
        this.l0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(Map map, Map<String, String> map2) {
        super(1);
        this.$t = map2;
        this.l0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(Set set, Set<Integer> set2) {
        super(1);
        this.$t = set2;
        this.l0 = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(Function0 function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(Function1 function1, Function1<? super Long, Object> function12) {
        super(1);
        this.$t = function12;
        this.l0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5183020f(Function2 function2, Function2<Object, Object, Object> function22) {
        super(1);
        this.$t = function22;
        this.l0 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(AwS459S0200000_24 awS459S0200000_24, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS459S0200000_24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(AwS641S0100000_27 awS641S0100000_27, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS641S0100000_27;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(Regex regex, int i) {
        super(1);
        this.$t = i;
        this.l0 = regex;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(JSONArray jSONArray, int i) {
        super(1);
        this.$t = i;
        this.l0 = jSONArray;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(JSONObject jSONObject, int i) {
        super(1);
        this.$t = i;
        this.l0 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(EffectListResponse.Data data, int i) {
        super(1);
        this.$t = i;
        this.l0 = data;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(NoticeItem noticeItem, int i) {
        super(1);
        this.$t = i;
        this.l0 = noticeItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(ShowListUser showListUser, int i) {
        super(1);
        this.$t = i;
        this.l0 = showListUser;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(StackTraceElement[] stackTraceElementArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = stackTraceElementArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5183020f(String[] strArr, int i) {
        super(1);
        this.$t = i;
        this.l0 = strArr;
    }
}

package X;

import Y.AfS184S0100000_15;
import Y.AfS186S0100000_17;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.api.TicketContentUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestMemoryInfoChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.common.ui.histroy.MultiGuestCountDownHistoryDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.gift.liveshow.LiveShowLeaveRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2Widget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.RefreshPlaybookListEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover.PlaybookEditorCoverDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.NoticeboardGuestController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.ui.NoticeboardEnlargeFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllStartResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetUserHistoryResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownStartResponse;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FanTicketRanklistResponse;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetLiveEventUserResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowRankResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetUserPlaySettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownCloseResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownFinishToPunishmentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownStartResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MaterialsGetImagesResponse;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchDetailResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookImageAIGenResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPublishResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookRepublishResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookReviewResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderPlayGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UserPlaySettingValue;
import com.bytedance.android.live.liveinteract.multilive.social.model.AvatarGetResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetAnchorSettingsResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GetLinkMicInfoResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightDisableResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.RightEnableResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.SoundWaveEffectListResp;
import com.bytedance.android.live.liveinteract.multilive.social.model.UpdateAnchorSettingsResp;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.boostcard.BoostedUsersPoint;
import com.bytedance.android.livesdk.boostcard.LiveGiftBoostCardUserStatusResponse;
import com.bytedance.android.livesdk.broadcast.GamePartnershipEntrance;
import com.bytedance.android.livesdk.broadcast.PartnershipDropsEntranceChannel;
import com.bytedance.android.livesdk.broadcast.PartnershipDropsV1ShowInfoChannel;
import com.bytedance.android.livesdk.broadcast.PartnershipEventPermissionChannel;
import com.bytedance.android.livesdk.broadcast.PartnershipVideoLivePermission;
import com.bytedance.android.livesdk.broadcast.PermissionApplyInfoChannel;
import com.bytedance.android.livesdk.broadcast.ShouldShowSafetyEducationDialogCppV2;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSeeMoreDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.GameEventPreviewBanner;
import com.bytedance.android.livesdk.chatroom.event.DonationBoardVisibleEvent;
import com.bytedance.android.livesdk.chatroom.model.GetUserStatusResp;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.GameFirstGoLiveTs;
import com.bytedance.android.livesdk.dataChannel.GameGuessMessageDisplayEvent;
import com.bytedance.android.livesdk.game.api.GameRevenueRetrofitApi;
import com.bytedance.android.livesdk.game.model.GuessRound;
import com.bytedance.android.livesdk.game.model.GuessWidget;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.gift.model.GiftFavouriteSaveResponse;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelViewModel;
import com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.android.livesdk.livesetting.clientai.LiveTriggerScaleProduceSettings;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.PlaybookUnPublishSuccessEvent;
import com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage;
import com.bytedance.android.livesdk.model.message.CompetitionRankListMessage;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.moderator.ModeratorOpsListSheet;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdk.rank.impl.boostcard.LiveBoostCardApi;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.promote.api.GetPromoteEntryControlResp;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionNameCheckResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.PaidSeriesLiveNumResponse;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviCreateResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitMapAssem;
import com.ss.android.ugc.aweme.setting.model.NeedSmsConsentResponse;
import com.ss.android.ugc.aweme.setting.model.SmsSettingItem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardFilterPanelComponentA2;
import com.ss.android.ugc.aweme.unifiedauth.service.PopupInfoServiceImpl;
import com.ss.android.ugc.aweme.unifiedauthapi.model.EdmSubscribeStatusResp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInfoData;
import com.ss.android.ugc.aweme.unifiedauthapi.model.SubscribeStatus;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupInfoResp;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.anchor.AdminOperationRecordItem;
import tikcast.api.anchor.AdminOperationRecordListResponse;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import webcast.api.activity_quiz.QueryUserIdentityResponse;
import webcast.api.battle.BattlePlaybookInfoResponse;
import webcast.api.game.AbandonGuessByRoomRequest;
import webcast.api.game.AbandonGuessByRoomResponse;
import webcast.api.game.TnsPiracyDetail;
import webcast.api.partnership.AnchorEventsResponse;
import webcast.api.partnership.AnchorInfoResponse;
import webcast.api.room.CppSafetyEducationResponse;
import webcast.data.host_board.HostBoard;
import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.CountdownUser;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.NoticeboardContent;
import webcast.data.multi_guest_play.PlayImage;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play.UserCountdownRecord;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.im.LinkStateMessage;

/* JADX INFO: renamed from: X.01zk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516201zk implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                accept$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                accept$34(this, obj);
                break;
            case 35:
                accept$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                accept$36(this, obj);
                break;
            case 37:
                accept$37(this, obj);
                break;
            case 38:
                accept$38(this, obj);
                break;
            case 39:
                accept$39(this, obj);
                break;
            case 40:
                accept$40(this, obj);
                break;
            case 41:
                accept$41(this, obj);
                break;
            case 42:
                accept$42(this, obj);
                break;
            case 43:
                accept$43(this, obj);
                break;
            case 44:
                accept$44(this, obj);
                break;
            case 45:
                accept$45(this, obj);
                break;
            case 46:
                accept$46(this, obj);
                break;
            case 47:
                accept$47(this, obj);
                break;
            case 48:
                accept$48(this, obj);
                break;
            case 49:
                accept$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                accept$50(this, obj);
                break;
            case 51:
                accept$51(this, obj);
                break;
            case 52:
                accept$52(this, obj);
                break;
            case 53:
                accept$53(this, obj);
                break;
            case 54:
                accept$54(this, obj);
                break;
            case 55:
                accept$55(this, obj);
                break;
            case 56:
                accept$56(this, obj);
                break;
            case 57:
                accept$57(this, obj);
                break;
            case 58:
                accept$58(this, obj);
                break;
            case 59:
                accept$59(this, obj);
                break;
            case 60:
                accept$60(this, obj);
                break;
            case 61:
                accept$61(this, obj);
                break;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                break;
            case 63:
                accept$63(this, obj);
                break;
            case 64:
                accept$64(this, obj);
                break;
            case 65:
                accept$65(this, obj);
                break;
            case 66:
                accept$66(this, obj);
                break;
            case 67:
                accept$67(this, obj);
                break;
            case 68:
                accept$68(this, obj);
                break;
            case 69:
                accept$69(this, obj);
                break;
            case 70:
                accept$70(this, obj);
                break;
            case 71:
                accept$71(this, obj);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                accept$72(this, obj);
                break;
            case 73:
                accept$73(this, obj);
                break;
            case 74:
                accept$74(this, obj);
                break;
            case 75:
                accept$75(this, obj);
                break;
            case 76:
                accept$76(this, obj);
                break;
            case 77:
                accept$77(this, obj);
                break;
            case 78:
                accept$78(this, obj);
                break;
            case 79:
                accept$79(this, obj);
                break;
            case 80:
                accept$80(this, obj);
                break;
            case 81:
                accept$81(this, obj);
                break;
            case 82:
                accept$82(this, obj);
                break;
            case 83:
                accept$83(this, obj);
                break;
            case 84:
                accept$84(this, obj);
                break;
            case 85:
                accept$85(this, obj);
                break;
            case 86:
                accept$86(this, obj);
                break;
            case 87:
                accept$87(this, obj);
                break;
            case 88:
                accept$88(this, obj);
                break;
            case 89:
                accept$89(this, obj);
                break;
            case 90:
                accept$90(this, obj);
                break;
            case 91:
                accept$91(this, obj);
                break;
            case 92:
                accept$92(this, obj);
                break;
            case 93:
                accept$93(this, obj);
                break;
            case 94:
                accept$94(this, obj);
                break;
            case 95:
                accept$95(this, obj);
                break;
            case 96:
                accept$96(this, obj);
                break;
            case 97:
                accept$97(this, obj);
                break;
            case 98:
                accept$98(this, obj);
                break;
            case 99:
                accept$99(this, obj);
                break;
            case 100:
                accept$100(this, obj);
                break;
            case 101:
                accept$101(this, obj);
                break;
            case 102:
                accept$102(this, obj);
                break;
            case 103:
                accept$103(this, obj);
                break;
            case 104:
                accept$104(this, obj);
                break;
            case 105:
                accept$105(this, obj);
                break;
            case 106:
                accept$106(this, obj);
                break;
            case 107:
                accept$107(this, obj);
                break;
            case 108:
                accept$108(this, obj);
                break;
            case 109:
                accept$109(this, obj);
                break;
            case 110:
                accept$110(this, obj);
                break;
            case 111:
                accept$111(this, obj);
                break;
            case 112:
                accept$112(this, obj);
                break;
            case 113:
                accept$113(this, obj);
                break;
            case 114:
                accept$114(this, obj);
                break;
            case 115:
                accept$115(this, obj);
                break;
            case 116:
                accept$116(this, obj);
                break;
            case 117:
                accept$117(this, obj);
                break;
            case 118:
                accept$118(this, obj);
                break;
            case 119:
                accept$119(this, obj);
                break;
            case 120:
                accept$120(this, obj);
                break;
            case 121:
                accept$121(this, obj);
                break;
            case 122:
                accept$122(this, obj);
                break;
            case 123:
                accept$123(this, obj);
                break;
            case 124:
                accept$124(this, obj);
                break;
            case 125:
                accept$125(this, obj);
                break;
            case 126:
                accept$126(this, obj);
                break;
            case 127:
                accept$127(this, obj);
                break;
            case 128:
                accept$128(this, obj);
                break;
            case 129:
                accept$129(this, obj);
                break;
            case 130:
                accept$130(this, obj);
                break;
            case 131:
                accept$131(this, obj);
                break;
            case 132:
                accept$132(this, obj);
                break;
            case 133:
                accept$133(this, obj);
                break;
            case 134:
                accept$134(this, obj);
                break;
            case 135:
                accept$135(this, obj);
                break;
            case 136:
                accept$136(this, obj);
                break;
            case 137:
                accept$137(this, obj);
                break;
            case 138:
                accept$138(this, obj);
                break;
            case 139:
                accept$139(this, obj);
                break;
            case 140:
                accept$140(this, obj);
                break;
            case 141:
                accept$141(this, obj);
                break;
            case 142:
                accept$142(this, obj);
                break;
            case 143:
                accept$143(this, obj);
                break;
            case 144:
                accept$144(this, obj);
                break;
            case 145:
                accept$145(this, obj);
                break;
            case 146:
                accept$146(this, obj);
                break;
            case 147:
                accept$147(this, obj);
                break;
            case 148:
                accept$148(this, obj);
                break;
            case 149:
                accept$149(this, obj);
                break;
            case 150:
                accept$150(this, obj);
                break;
            case 151:
                accept$151(this, obj);
                break;
            case 152:
                accept$152(this, obj);
                break;
            case 153:
                accept$153(this, obj);
                break;
            case 154:
                accept$154(this, obj);
                break;
            case 155:
                accept$155(this, obj);
                break;
            case 156:
                accept$156(this, obj);
                break;
            case 157:
                accept$157(this, obj);
                break;
            case 158:
                accept$158(this, obj);
                break;
            case 159:
                accept$159(this, obj);
                break;
            case 160:
                accept$160(this, obj);
                break;
            case 161:
                accept$161(this, obj);
                break;
            case 162:
                accept$162(this, obj);
                break;
            case 163:
                accept$163(this, obj);
                break;
            case 164:
                accept$164(this, obj);
                break;
            case 165:
                accept$165(this, obj);
                break;
            case 166:
                accept$166(this, obj);
                break;
            case 167:
                accept$167(this, obj);
                break;
            case 168:
                accept$168(this, obj);
                break;
            case 169:
                accept$169(this, obj);
                break;
            case 170:
                accept$170(this, obj);
                break;
            case 171:
                accept$171(this, obj);
                break;
            case 172:
                accept$172(this, obj);
                break;
            case 173:
                accept$173(this, obj);
                break;
            case 174:
                accept$174(this, obj);
                break;
            case 175:
                accept$175(this, obj);
                break;
            case 176:
                accept$176(this, obj);
                break;
            case 177:
                accept$177(this, obj);
                break;
            case 178:
                accept$178(this, obj);
                break;
            case 179:
                accept$179(this, obj);
                break;
            case 180:
                accept$180(this, obj);
                break;
            case 181:
                accept$181(this, obj);
                break;
            case 182:
                accept$182(this, obj);
                break;
            case 183:
                accept$183(this, obj);
                break;
            case 184:
                accept$184(this, obj);
                break;
            case 185:
                accept$185(this, obj);
                break;
            case 186:
                accept$186(this, obj);
                break;
            case 187:
                accept$187(this, obj);
                break;
            case 188:
                accept$188(this, obj);
                break;
            case 189:
                accept$189(this, obj);
                break;
            case 190:
                accept$190(this, obj);
                break;
            case 191:
                accept$191(this, obj);
                break;
            case 192:
                accept$192(this, obj);
                break;
            case 193:
                accept$193(this, obj);
                break;
            case 194:
                accept$194(this, obj);
                break;
            case 195:
                accept$195(this, obj);
                break;
            case 196:
                accept$196(this, obj);
                break;
            case 197:
                accept$197(this, obj);
                break;
            case 198:
                accept$198(this, obj);
                break;
            case 199:
                accept$199(this, obj);
                break;
            case 200:
                accept$200(this, obj);
                break;
            case 201:
                accept$201(this, obj);
                break;
            case 202:
                accept$202(this, obj);
                break;
            case 203:
                accept$203(this, obj);
                break;
            case 204:
                accept$204(this, obj);
                break;
            case 205:
                accept$205(this, obj);
                break;
            case 206:
                accept$206(this, obj);
                break;
            case 207:
                accept$207(this, obj);
                break;
            case 208:
                accept$208(this, obj);
                break;
            case 209:
                accept$209(this, obj);
                break;
            case 210:
                accept$210(this, obj);
                break;
            case 211:
                accept$211(this, obj);
                break;
            case 212:
                accept$212(this, obj);
                break;
            case 213:
                accept$213(this, obj);
                break;
            case 214:
                accept$214(this, obj);
                break;
            case 215:
                accept$215(this, obj);
                break;
            case 216:
                accept$216(this, obj);
                break;
            case 217:
                accept$217(this, obj);
                break;
            case 218:
                accept$218(this, obj);
                break;
            case 219:
                accept$219(this, obj);
                break;
            case 220:
                accept$220(this, obj);
                break;
            case 221:
                accept$221(this, obj);
                break;
            case 222:
                accept$222(this, obj);
                break;
            case 223:
                accept$223(this, obj);
                break;
            case 224:
                accept$224(this, obj);
                break;
            case 225:
                accept$225(this, obj);
                break;
            case 226:
                accept$226(this, obj);
                break;
            case 227:
                accept$227(this, obj);
                break;
            case 228:
                accept$228(this, obj);
                break;
            case 229:
                accept$229(this, obj);
                break;
            case 230:
                accept$230(this, obj);
                break;
            case 231:
                accept$231(this, obj);
                break;
            case 232:
                accept$232(this, obj);
                break;
            case 233:
                accept$233(this, obj);
                break;
            case 234:
                accept$234(this, obj);
                break;
            case 235:
                accept$235(this, obj);
                break;
            case 236:
                accept$236(this, obj);
                break;
            case 237:
                accept$237(this, obj);
                break;
            case 238:
                accept$238(this, obj);
                break;
            case 239:
                accept$239(this, obj);
                break;
            case 240:
                accept$240(this, obj);
                break;
            case 241:
                accept$241(this, obj);
                break;
            case 242:
                accept$242(this, obj);
                break;
            case 243:
                accept$243(this, obj);
                break;
            case 244:
                accept$244(this, obj);
                break;
            case 245:
                accept$245(this, obj);
                break;
            case 246:
                accept$246(this, obj);
                break;
            case 247:
                accept$247(this, obj);
                break;
            case 248:
                accept$248(this, obj);
                break;
            case 249:
                accept$249(this, obj);
                break;
            case 250:
                accept$250(this, obj);
                break;
            case 251:
                accept$251(this, obj);
                break;
            case 252:
                accept$252(this, obj);
                break;
            case 253:
                accept$253(this, obj);
                break;
            case 254:
                accept$254(this, obj);
                break;
            case 255:
                accept$255(this, obj);
                break;
            case 256:
                accept$256(this, obj);
                break;
            case 257:
                accept$257(this, obj);
                break;
            case 258:
                accept$258(this, obj);
                break;
            case 259:
                accept$259(this, obj);
                break;
            case 260:
                accept$260(this, obj);
                break;
            case 261:
                accept$261(this, obj);
                break;
            case 262:
                accept$262(this, obj);
                break;
            case 263:
                accept$263(this, obj);
                break;
            case 264:
                accept$264(this, obj);
                break;
            case 265:
                accept$265(this, obj);
                break;
            case 266:
                accept$266(this, obj);
                break;
            case 267:
                accept$267(this, obj);
                break;
            case 268:
                accept$268(this, obj);
                break;
            case 269:
                accept$269(this, obj);
                break;
            case 270:
                accept$270(this, obj);
                break;
            case 271:
                accept$271(this, obj);
                break;
            case 272:
                accept$272(this, obj);
                break;
            case 273:
                accept$273(this, obj);
                break;
            case 274:
                accept$274(this, obj);
                break;
            case 275:
                accept$275(this, obj);
                break;
            case 276:
                accept$276(this, obj);
                break;
            case 277:
                accept$277(this, obj);
                break;
            case 278:
                accept$278(this, obj);
                break;
            case 279:
                accept$279(this, obj);
                break;
            case 280:
                accept$280(this, obj);
                break;
            case 281:
                accept$281(this, obj);
                break;
            case 282:
                accept$282(this, obj);
                break;
            case 283:
                accept$283(this, obj);
                break;
            case 284:
                accept$284(this, obj);
                break;
            case 285:
                accept$285(this, obj);
                break;
            case 286:
                accept$286(this, obj);
                break;
            case 287:
                accept$287(this, obj);
                break;
            case 288:
                accept$288(this, obj);
                break;
            case 289:
                accept$289(this, obj);
                break;
            case 290:
                accept$290(this, obj);
                break;
            case 291:
                accept$291(this, obj);
                break;
            case 292:
                accept$292(this, obj);
                break;
            case 293:
                accept$293(this, obj);
                break;
            case 294:
                accept$294(this, obj);
                break;
            case 295:
                accept$295(this, obj);
                break;
            case 296:
                accept$296(this, obj);
                break;
            case 297:
                accept$297(this, obj);
                break;
            case 298:
                accept$298(this, obj);
                break;
            case 299:
                accept$299(this, obj);
                break;
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                accept$300(this, obj);
                break;
            case 301:
                accept$301(this, obj);
                break;
            case 302:
                accept$302(this, obj);
                break;
            case 303:
                accept$303(this, obj);
                break;
            case 304:
                accept$304(this, obj);
                break;
            case 305:
                accept$305(this, obj);
                break;
            case 306:
                accept$306(this, obj);
                break;
            case 307:
                accept$307(this, obj);
                break;
            case 308:
                accept$308(this, obj);
                break;
            case 309:
                accept$309(this, obj);
                break;
            case 310:
                accept$310(this, obj);
                break;
            case 311:
                accept$311(this, obj);
                break;
            case 312:
                accept$312(this, obj);
                break;
            case 313:
                accept$313(this, obj);
                break;
            case 314:
                accept$314(this, obj);
                break;
            case 315:
                accept$315(this, obj);
                break;
            case 316:
                accept$316(this, obj);
                break;
            case 317:
                accept$317(this, obj);
                break;
            case 318:
                accept$318(this, obj);
                break;
            case 319:
                accept$319(this, obj);
                break;
            case 320:
                accept$320(this, obj);
                break;
            case 321:
                accept$321(this, obj);
                break;
            case 322:
                accept$322(this, obj);
                break;
            case 323:
                accept$323(this, obj);
                break;
            case 324:
                accept$324(this, obj);
                break;
            case 325:
                accept$325(this, obj);
                break;
            case 326:
                accept$326(this, obj);
                break;
            case 327:
                accept$327(this, obj);
                break;
            case 328:
                accept$328(this, obj);
                break;
            case 329:
                accept$329(this, obj);
                break;
            case 330:
                accept$330(this, obj);
                break;
            case 331:
                accept$331(this, obj);
                break;
            case 332:
                accept$332(this, obj);
                break;
            case 333:
                accept$333(this, obj);
                break;
            case 334:
                accept$334(this, obj);
                break;
            case 335:
                accept$335(this, obj);
                break;
            case 336:
                accept$336(this, obj);
                break;
            case 337:
                accept$337(this, obj);
                break;
            case 338:
                accept$338(this, obj);
                break;
            case 339:
                accept$339(this, obj);
                break;
            case 340:
                accept$340(this, obj);
                break;
            case 341:
                accept$341(this, obj);
                break;
            case 342:
                accept$342(this, obj);
                break;
            case 343:
                accept$343(this, obj);
                break;
            case 344:
                accept$344(this, obj);
                break;
            case 345:
                accept$345(this, obj);
                break;
            case 346:
                accept$346(this, obj);
                break;
            case 347:
                accept$347(this, obj);
                break;
            case 348:
                accept$348(this, obj);
                break;
            case 349:
                accept$349(this, obj);
                break;
            case 350:
                accept$350(this, obj);
                break;
            case 351:
                accept$351(this, obj);
                break;
            case 352:
                accept$352(this, obj);
                break;
            case 353:
                accept$353(this, obj);
                break;
            case 354:
                accept$354(this, obj);
                break;
            case 355:
                accept$355(this, obj);
                break;
            case 356:
                accept$356(this, obj);
                break;
            case 357:
                accept$357(this, obj);
                break;
            case 358:
                accept$358(this, obj);
                break;
            case 359:
                accept$359(this, obj);
                break;
            case 360:
                accept$360(this, obj);
                break;
            case 361:
                accept$361(this, obj);
                break;
            case 362:
                accept$362(this, obj);
                break;
        }
    }

    public C516201zk(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public C516201zk(C5183020f c5183020f, int i) {
        this.$t = i;
        switch (i) {
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 187:
                this.l0 = c5183020f;
                break;
            default:
                this.l0 = c5183020f;
                break;
        }
    }

    public static final void accept$0(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MobileGameTnsSignalReporter@1c37.start$1$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJ("MobileGameTnsSignalReporter", Log.getStackTraceString(th));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tns_piracy_info_report_result");
        c474500IjALIZ.LJJII(((C471401sW) c516201zk.l0).LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(th.getMessage(), "error_message");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("MobileGameTnsSignalReporter@1c37.start$1$2");
    }

    public static final void accept$1(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MobileGameTnsSignalReporter@1c37.start$1");
        Map<String, Object> map = C1338270kvh.LIZ;
        Iterator<InterfaceC471501sX> it2 = ((C471401sW) c516201zk.l0).LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().start();
        }
        C11JF c11jf = C471201sU.LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = C471201sU.LIZJ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        long j = ((C471401sW) c516201zk.l0).LJ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C19488911Mp c19488911Mp = new C19488911Mp(C11NZ.LJLJJLL(j, timeUnit));
        C11RO c11ro = C11S5.LIZ;
        C471201sU.LIZIZ = (C11JF) c19488911Mp.LJJJLZIJ(c11ro).LJJLL(new C09JN() { // from class: X.01sV
            @Override // X.C09JN
            public final void accept(Object obj2) {
                TnsPiracyDetail tnsPiracyDetail;
                C1C7U.LIZ("MobileGameTnsSignalReporter@1c37.start$1$1");
                C471401sW c471401sW = C471201sU.LIZ;
                if (c471401sW != null) {
                    LinkedList<TnsPiracyDetail> linkedList = C471201sU.LIZLLL;
                    if (!linkedList.isEmpty()) {
                        tnsPiracyDetail = linkedList.removeFirst();
                    } else {
                        tnsPiracyDetail = new TnsPiracyDetail();
                    }
                    tnsPiracyDetail.recordTime = System.currentTimeMillis();
                    Iterator<InterfaceC471501sX> it3 = c471401sW.LIZLLL.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZ(tnsPiracyDetail);
                    }
                    if (C471201sU.LJ == null) {
                        C471201sU.LJ = new LinkedList<>();
                    }
                    LinkedList<TnsPiracyDetail> linkedList2 = C471201sU.LJ;
                    if (linkedList2 != null) {
                        if (linkedList2.size() >= c471401sW.LIZ) {
                            Map<String, Object> map2 = C1338270kvh.LIZ;
                            C471201sU.LIZIZ(linkedList2.remove(0));
                        }
                        linkedList2.add(tnsPiracyDetail);
                        Map<String, Object> map3 = C1338270kvh.LIZ;
                    }
                }
                C1C7U.LIZIZ("MobileGameTnsSignalReporter@1c37.start$1$1");
            }
        }, new C516201zk((C471401sW) c516201zk.l0, 0));
        C471201sU.LIZJ = (C11JF) new C19488911Mp(C11NZ.LJLJJLL(((C471401sW) c516201zk.l0).LJFF, timeUnit)).LJJJLZIJ(c11ro).LJJLL(new C09JN() { // from class: X.01sT
            /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C471101sT.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.00RR
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C1C7U.LIZ("MobileGameTnsSignalReporter@1c37.start$1$4");
                C20441214yg.LJ("MobileGameTnsSignalReporter", ((Throwable) obj2).getMessage());
                C1C7U.LIZIZ("MobileGameTnsSignalReporter@1c37.start$1$4");
            }
        });
        C1C7U.LIZIZ("MobileGameTnsSignalReporter@1c37.start$1");
    }

    public static final void accept$10(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SearchUtils@6a24.realSearch$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c516201zk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("SearchUtils@6a24.realSearch$2");
    }

    public static final void accept$100(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveCheckStateService@a608.fetchStatus$2");
        C018E c018e = (C018E) c516201zk.l0;
        if (c018e != null) {
            c018e.onFail();
        }
        C1C7U.LIZIZ("LiveCheckStateService@a608.fetchStatus$2");
    }

    public static final void accept$101(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PluginService@95b4.prefetchABSettings$2");
        ((Throwable) obj).getMessage();
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) c516201zk.l0).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("PluginService@95b4.prefetchABSettings$2");
    }

    public static final void accept$102(C516201zk c516201zk, Object obj) {
        boolean z;
        C1C7U.LIZ("SmsSettingServiceImpl@4945.getNeedShowSmsConsentAsync$1$1");
        NeedSmsConsentResponse needSmsConsentResponse = (NeedSmsConsentResponse) obj;
        if (needSmsConsentResponse != null) {
            Function1 function1 = (Function1) c516201zk.l0;
            if (needSmsConsentResponse.status_code == 0) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getNeedShowSmsConsentAsync(");
                sbLIZ.append(needSmsConsentResponse);
                sbLIZ.append(") success!");
                C2188811AlT.LIZIZ(sbLIZ);
                SmsSettingItem smsSettingItem = needSmsConsentResponse.data.get("primary_sms_auth");
                if (smsSettingItem != null && !Intrinsics.LJFF(smsSettingItem.disable, Boolean.TRUE) && Intrinsics.LJFF(smsSettingItem.field, "primary_sms_auth")) {
                    if (smsSettingItem.value == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    function1.invoke(Boolean.valueOf(z));
                }
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("SMS_consent", "getNeedShowSmsConsentAsync() fail!!!");
            }
        }
        C1C7U.LIZIZ("SmsSettingServiceImpl@4945.getNeedShowSmsConsentAsync$1$1");
    }

    public static final void accept$103(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("VideoPublishEditModelExtAPIKt@36de.musicPermissionCheck$1");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("VideoPublishEditModelExtAPIKt@36de.musicPermissionCheck$1");
    }

    public static final void accept$104(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LocalImageThumbnailUtils@4a0b.load$disposable$1");
        ((Function2) c516201zk.l0).invoke(obj, null);
        C1C7U.LIZIZ("LocalImageThumbnailUtils@4a0b.load$disposable$1");
    }

    public static final void accept$105(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LocalImageThumbnailUtils@4a0b.load$disposable$2");
        ((Function2) c516201zk.l0).invoke(null, obj);
        C1C7U.LIZIZ("LocalImageThumbnailUtils@4a0b.load$disposable$2");
    }

    public static final void accept$106(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PopupInfoServiceImpl@d3fe.fetchEdmSubscribeStatus$1");
        EdmSubscribeStatusResp edmSubscribeStatusResp = (EdmSubscribeStatusResp) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchEdmSubscribeStatus([");
        sbLIZ.append(edmSubscribeStatusResp.status_code);
        sbLIZ.append(']');
        sbLIZ.append(edmSubscribeStatusResp.data);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PopupInfoServiceImpl");
        if (edmSubscribeStatusResp.status_code == 0) {
            SubscribeStatus subscribeStatus = edmSubscribeStatusResp.data;
            if (subscribeStatus != null) {
                ((PopupInfoServiceImpl) c516201zk.l0).LIZJ(Intrinsics.LJFF(subscribeStatus.needShowAuthPopup, Boolean.TRUE));
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchEdmSubscribeStatus() - fail(");
            sbLIZ2.append(edmSubscribeStatusResp.status_code);
            sbLIZ2.append(", ");
            sbLIZ2.append(edmSubscribeStatusResp.status_msg);
            sbLIZ2.append(")!");
            C211000rc.LIZIZ("PopupInfoServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1C7U.LIZIZ("PopupInfoServiceImpl@d3fe.fetchEdmSubscribeStatus$1");
    }

    public static final void accept$107(C516201zk c516201zk, Object obj) {
        PopupInfoData popupInfoData;
        C1C7U.LIZ("PopupInfoServiceImpl@d3fe.fetchPopupInfo$3");
        UnifiedAuthPopupInfoResp unifiedAuthPopupInfoResp = (UnifiedAuthPopupInfoResp) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchPopupInfo([");
        sbLIZ.append(unifiedAuthPopupInfoResp.status_code);
        sbLIZ.append(']');
        sbLIZ.append(unifiedAuthPopupInfoResp.data);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PopupInfoServiceImpl");
        if (unifiedAuthPopupInfoResp.status_code == 0) {
            PopupInfoData popupInfoData2 = unifiedAuthPopupInfoResp.data;
            if (popupInfoData2 != null) {
                PopupInfoServiceImpl popupInfoServiceImpl = (PopupInfoServiceImpl) c516201zk.l0;
                int i = popupInfoData2.version;
                if (i < 0 || ((popupInfoData = popupInfoServiceImpl.LIZ) != null && i < popupInfoData.version)) {
                    C211000rc.LIZIZ("PopupInfoServiceImpl", "fetchPopupInfo() - Invalid version!");
                } else {
                    popupInfoServiceImpl.LIZ = popupInfoData2;
                    String strLIZLLL = C08JS.LIZLLL(popupInfoData2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("savePopupConfigs(");
                    sbLIZ2.append(strLIZLLL);
                    sbLIZ2.append(')');
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C211000rc.LIZ("PopupInfoServiceImpl");
                    C2822017k.LIZ.getClass();
                    C01GW c01gw = C2822017k.LIZIZ;
                    ((Keva) c01gw.getValue()).storeString("key_popup_info", strLIZLLL);
                    ((Keva) c01gw.getValue()).storeLong("key_popup_info_last_update_ts", System.currentTimeMillis());
                }
            } else {
                C211000rc.LIZIZ("PopupInfoServiceImpl", "fetchPopupInfo() - Empty info!");
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fetchPopupInfo() - fail(");
            sbLIZ3.append(unifiedAuthPopupInfoResp.status_code);
            sbLIZ3.append(", ");
            sbLIZ3.append(unifiedAuthPopupInfoResp.status_msg);
            sbLIZ3.append(")!");
            C211000rc.LIZIZ("PopupInfoServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
        }
        C1C7U.LIZIZ("PopupInfoServiceImpl@d3fe.fetchPopupInfo$3");
    }

    public static final void accept$108(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SetUpNicknameAssem@d47.initTextLengthSubject$1");
        C1389890mGx c1389890mGx = new C1389890mGx((View) c516201zk.l0);
        c1389890mGx.LJIIIZ(2131827367);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("SetUpNicknameAssem@d47.initTextLengthSubject$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$109(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InboxNotificationRouter@139a.openInboxNotification$1$2$5$2");
        Throwable th = (Throwable) obj;
        Fragment fragment = (Fragment) ((C259800zU) c516201zk.l0).element;
        if (fragment != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragment);
            c1389890mGx.LJIIJ(th.getMessage());
            c1389890mGx.LJIIJJI();
        }
        C1C7U.LIZIZ("InboxNotificationRouter@139a.openInboxNotification$1$2$5$2");
    }

    public static final void accept$11(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SearchUtils@6a24.realSearch$3");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c516201zk.l0;
        C13BV c13bv = C13BV.INSTANCE;
        C189200o6.m2constructorimpl(c13bv);
        interfaceC1364105Vn.resumeWith(c13bv);
        C1C7U.LIZIZ("SearchUtils@6a24.realSearch$3");
    }

    public static final void accept$110(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("UnifiedApiManager@2745.fetchDataBackground$4");
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C1C7U.LIZIZ("UnifiedApiManager@2745.fetchDataBackground$4");
    }

    public static final void accept$111(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PoiRevisitMapAssem@7d74.initObserver$10$disposable$1");
        ((PoiRevisitMapAssem) c516201zk.l0).uD0(((Integer) obj).intValue());
        C1C7U.LIZIZ("PoiRevisitMapAssem@7d74.initObserver$10$disposable$1");
    }

    public static final void accept$112(C516201zk c516201zk, Object obj) {
        RankListV2Response.RankView rankView;
        InterfaceC211300rf interfaceC211300rf = (InterfaceC211300rf) c516201zk.l0;
        C1C7U.LIZ("RankService@216.getRankRoomIds$1L");
        RankListV2Response.Data dataLIZ = C147700hP.LIZ((String) obj);
        if (dataLIZ != null && (rankView = dataLIZ.rankView) != null && rankView.ranks != null) {
            ArrayList<Long> arrayList = new ArrayList<>();
            Iterator<RankListV2Response.RankInfo> it2 = dataLIZ.rankView.ranks.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().roomId));
            }
            interfaceC211300rf.LIZ(arrayList);
        }
        C1C7U.LIZIZ("RankService@216.getRankRoomIds$1L");
    }

    public static final void accept$113(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ReplayUtil@64b2.requestRemux$2");
        ((Function1) c516201zk.l0).invoke(0);
        C1C7U.LIZIZ("ReplayUtil@64b2.requestRemux$2");
    }

    public static final void accept$114(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ReplayUtil@64b2.requestTranscode$2");
        ((Function1) c516201zk.l0).invoke(0);
        C1C7U.LIZIZ("ReplayUtil@64b2.requestTranscode$2");
    }

    public static final void accept$115(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardGuestController@b397.getBitmapFromServer$3");
        ((NoticeboardGuestController) c516201zk.l0).LJIIIIZZ = (C01G7) obj;
        C1C7U.LIZIZ("NoticeboardGuestController@b397.getBitmapFromServer$3");
    }

    public static final void accept$116(C516201zk c516201zk, Object obj) {
        FragmentManager fragmentManager;
        C1C7U.LIZ("NoticeboardGuestController@b397.showEnlargeDialog$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBitmapFromServer imageInfo=");
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("NoticeboardGuestController", C2188811AlT.LIZIZ(sbLIZ));
        Long l = ((NoticeboardGuestController) c516201zk.l0).LJFF;
        if (l != null) {
            C19322110iZ.LIZ(l.longValue());
        }
        DataChannel dataChannel = ((NoticeboardGuestController) c516201zk.l0).LIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C956970b0h.class, obj);
        }
        DataChannel dataChannel2 = ((NoticeboardGuestController) c516201zk.l0).LIZ;
        if (dataChannel2 != null && (fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class)) != null) {
            NoticeboardGuestController noticeboardGuestController = (NoticeboardGuestController) c516201zk.l0;
            SheetOptions sheetOptions = new SheetOptions();
            sheetOptions.LIZ(3, null);
            sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
            sheetOptions.draggable = false;
            noticeboardGuestController.LJFF = Long.valueOf(C19322110iZ.LIZLLL(fragmentManager, NoticeboardEnlargeFragment.class, "multi_guest_noticeboard_enlarge", sheetOptions, null));
        }
        C1C7U.LIZIZ("NoticeboardGuestController@b397.showEnlargeDialog$1");
    }

    public static final void accept$117(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCoHostHistoryResponseProcessor@2eb.<init>$1");
        ((AbstractC246700xN) c516201zk.l0).onEvent((C257100z3) obj);
        C1C7U.LIZIZ("BaseCoHostHistoryResponseProcessor@2eb.<init>$1");
    }

    public static final void accept$118(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PNSDeviceConsentDataManager@ba5c.fetchConsentConfig$2");
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C1C7U.LIZIZ("PNSDeviceConsentDataManager@ba5c.fetchConsentConfig$2");
    }

    public static final void accept$119(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PNSDeviceConsentDataManager@ba5c.fetchConsentConfig$3");
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("PNSDeviceConsentDataManager@ba5c.fetchConsentConfig$3");
    }

    public static final void accept$12(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SearchAidSurveyApiManager@cf3.getSearchAidSurveyInfo$2");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("SearchAidSurveyApiManager@cf3.getSearchAidSurveyInfo$2");
    }

    public static final void accept$120(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CompetitionAnchorLauncher@ecb7.checkValidation$3");
        C20441214yg.LJII((Throwable) obj);
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("CompetitionAnchorLauncher@ecb7.checkValidation$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$121(C516201zk c516201zk, Object obj) {
        AnchorInfoResponse.ResponseData responseData;
        C197400pQ c197400pQFy0;
        C197400pQ c197400pQFy02;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.doFetchPartnerShipAnchorGuideInfo$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData = (AnchorInfoResponse.ResponseData) baseResponse.data) != null) {
            if (responseData.liveTakeDecouple) {
                DataChannel dataChannel = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
                if (dataChannel == null) {
                    dataChannel = null;
                }
                dataChannel.SX0(C750300Tbw.class, Boolean.TRUE);
            }
            DataChannelGlobal.LLILZ.JQ2(C931380aLQ.class, new C193000oi(responseData.cameraPartnershipInfo, responseData.partnershipInfo));
            AnchorInfoResponse.PartnershipInfo partnershipInfo = responseData.partnershipInfo;
            if (partnershipInfo != null && partnershipInfo.permission) {
                DataChannel dataChannel2 = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
                if (dataChannel2 == null) {
                    dataChannel2 = null;
                }
                dataChannel2.zW(GamePartnershipEntrance.class, new C193200ok(responseData));
            }
            List<PartnershipGameEvent> list = responseData.enableEventList;
            if (list != null && !list.isEmpty()) {
                DataChannel dataChannel3 = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
                if (dataChannel3 == null) {
                    dataChannel3 = null;
                }
                List list2 = responseData.enableEventList;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                dataChannel3.zW(PartnershipEventPermissionChannel.class, new C193100oj(list2));
            }
            DataChannel dataChannel4 = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
            if (dataChannel4 == null) {
                dataChannel4 = null;
            }
            dataChannel4.zW(PartnershipVideoLivePermission.class, new C0UI2(responseData.shootPermission, responseData.businessPartnership, responseData));
            if (responseData.enableDropsList != null && (!r0.isEmpty())) {
                DataChannel dataChannel5 = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
                if (dataChannel5 == null) {
                    dataChannel5 = null;
                }
                Collection collection = responseData.enableDropsList;
                if (collection == null) {
                    collection = C13BV.INSTANCE;
                }
                dataChannel5.zW(PartnershipDropsV1ShowInfoChannel.class, collection);
            }
            AnchorInfoResponse.DropsEntrance dropsEntrance = responseData.dropsEntrance;
            if (dropsEntrance != null && dropsEntrance.permission) {
                DataChannel dataChannel6 = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
                if (dataChannel6 == null) {
                    dataChannel6 = null;
                }
                dataChannel6.zW(PartnershipDropsEntranceChannel.class, dropsEntrance);
            }
            ((LiveBroadcastPreviewFragment) c516201zk.l0).getClass();
            int i = responseData.toggleStatus;
            if (i != 0) {
                if (i == 2 && (c197400pQFy02 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).fy0()) != null) {
                    c197400pQFy02.LIZLLL(null, true);
                }
                if (responseData.toggleStatus == 1 && (c197400pQFy0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).fy0()) != null) {
                    c197400pQFy0.LIZLLL(null, false);
                }
            }
        }
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.doFetchPartnerShipAnchorGuideInfo$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$122(C516201zk c516201zk, Object obj) {
        LivePermissionApplyResponse livePermissionApplyResponse;
        LivePermissionApplyResponse.ResponseData responseData;
        Map<String, LivePermissionApplyResponse.PermissionApplyInfo> map;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.queryPermissionApplyInfo$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (livePermissionApplyResponse = (LivePermissionApplyResponse) baseResponse.data) != null && (responseData = livePermissionApplyResponse.data) != null && (map = responseData.permissionInfo) != null) {
            DataChannel dataChannel = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
            if (dataChannel == null) {
                dataChannel = null;
            }
            dataChannel.zW(PermissionApplyInfoChannel.class, map);
        }
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.queryPermissionApplyInfo$2");
    }

    public static final void accept$123(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GameLivePartnershipAnchorRouter@f60a.checkWithAnchorPartnershipTasks$2");
        Activity activityLIZ = C1388190mED.LIZ((Context) c516201zk.l0);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(R.string.jb4);
            c1389890mGx.LJIIJJI();
        }
        C1C7U.LIZIZ("GameLivePartnershipAnchorRouter@f60a.checkWithAnchorPartnershipTasks$2");
    }

    public static final void accept$124(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("QuickCommentWidget@bd17.queryQuickComments$1$2");
        QuickCommentWidget quickCommentWidget = (QuickCommentWidget) c516201zk.l0;
        RunnableC514801zW runnableC514801zW = new RunnableC514801zW(quickCommentWidget, 93);
        if (!quickCommentWidget.LLJJIJI) {
            runnableC514801zW.run();
        } else {
            ((ArrayList) quickCommentWidget.LLJJIII).add(runnableC514801zW);
        }
        C1C7U.LIZIZ("QuickCommentWidget@bd17.queryQuickComments$1$2");
    }

    public static final void accept$125(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveConsumeBoostCardPresenterOld@137f.onFlareStart$1");
        C11NJ c11nj = ((C1086270eNF) c516201zk.l0).LLJJL;
        C480460Ism.LIZ().getClass();
        c11nj.LIZ(((LiveBoostCardApi) C480460Ism.LIZLLL(LiveBoostCardApi.class)).queryUserStatus(((C1086270eNF) c516201zk.l0).LLJJIJIL, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS186S0100000_17((C1086270eNF) c516201zk.l0, 83), new C09JN() { // from class: X.00Mx
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("LiveConsumeBoostCardPresenterOld@137f.onFlareStart$1$2");
                C1C7U.LIZIZ("LiveConsumeBoostCardPresenterOld@137f.onFlareStart$1$2");
            }
        }));
        C1C7U.LIZIZ("LiveConsumeBoostCardPresenterOld@137f.onFlareStart$1");
    }

    public static final void accept$126(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveReceiveBoostCardPresenter@9139.onCreate$1");
        C251600yA c251600yA = (C251600yA) c516201zk.l0;
        c251600yA.LLILZ = true;
        if (c251600yA.LLILZIL) {
            c251600yA.LIZ();
        }
        C1C7U.LIZIZ("LiveReceiveBoostCardPresenter@9139.onCreate$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$127(C516201zk c516201zk, Object obj) throws JSONException {
        LiveGiftBoostCardUserStatusResponse liveGiftBoostCardUserStatusResponse;
        List<BoostedUsersPoint> list;
        C1C7U.LIZ("LiveConsumeBoostCardPresenter@7d3a.getChartDataList$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        ((AbstractC1086230eNB) c516201zk.l0).LLJJJJJIL.clear();
        if (baseResponse != null && (liveGiftBoostCardUserStatusResponse = (LiveGiftBoostCardUserStatusResponse) baseResponse.data) != null && (list = liveGiftBoostCardUserStatusResponse.mPoints) != null) {
            AbstractC1086230eNB abstractC1086230eNB = (AbstractC1086230eNB) c516201zk.l0;
            Iterator<BoostedUsersPoint> it2 = list.iterator();
            while (it2.hasNext()) {
                abstractC1086230eNB.LLJJJJJIL.add(Long.valueOf(it2.next().mTotalUsers));
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("points", ((AbstractC1086230eNB) c516201zk.l0).LLJJJJJIL.toString());
        C389001fE.LIZ("live_boost_card_event", jSONObject, System.currentTimeMillis(), false);
        C1C7U.LIZIZ("LiveConsumeBoostCardPresenter@7d3a.getChartDataList$1");
    }

    public static final void accept$128(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveConsumeBoostCardPresenter@7d3a.onCreate$6");
        if (((C248600xg) obj).LIZ) {
            AbstractC1086230eNB abstractC1086230eNB = (AbstractC1086230eNB) c516201zk.l0;
            abstractC1086230eNB.LLJJJJ = true;
            C11NJ c11nj = abstractC1086230eNB.LLJJIJI;
            C480460Ism.LIZ().getClass();
            c11nj.LIZ(((LiveBoostCardApi) C480460Ism.LIZLLL(LiveBoostCardApi.class)).queryUserStatus(abstractC1086230eNB.LLJJIJIL, true).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C516201zk(abstractC1086230eNB, 127), new C09JN() { // from class: X.00Mz
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                    C1C7U.LIZ("LiveConsumeBoostCardPresenter@7d3a.getChartDataList$2");
                    C1C7U.LIZIZ("LiveConsumeBoostCardPresenter@7d3a.getChartDataList$2");
                }
            }));
        } else {
            ((AbstractC1086230eNB) c516201zk.l0).LLJJJJ = false;
        }
        C1C7U.LIZIZ("LiveConsumeBoostCardPresenter@7d3a.onCreate$6");
    }

    public static final void accept$129(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ProfileEditNicknameFragment@44a0.initTextLengthSubject$1");
        C1389890mGx c1389890mGx = new C1389890mGx((View) c516201zk.l0);
        c1389890mGx.LJIIIZ(2131827367);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("ProfileEditNicknameFragment@44a0.initTextLengthSubject$1");
    }

    public static final void accept$13(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("FlowTypeRepository@cc0d.flowTypeStatus$2$1");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c516201zk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("FlowTypeRepository@cc0d.flowTypeStatus$2$1");
    }

    public static final void accept$130(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("VideoCaptionMentionSearchViewModel@1e86.toDeferred$1");
        ((C05XL) c516201zk.l0).LJIIZILJ(obj);
        C1C7U.LIZIZ("VideoCaptionMentionSearchViewModel@1e86.toDeferred$1");
    }

    public static final void accept$131(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestAvatarPreviewFragment@53ab.deleteFailedAvatar$1$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteFailedAvatar ");
        sbLIZ.append(((Avatar) c516201zk.l0).avatarId);
        sbLIZ.append(" suc");
        C20441214yg.LIZIZ("MultiGuestAvatarPreviewFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiGuestAvatarPreviewFragment@53ab.deleteFailedAvatar$1$1");
    }

    public static final void accept$132(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestAvatarPreviewFragment@53ab.deleteFailedAvatar$1$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteFailedAvatar ");
        sbLIZ.append(((Avatar) c516201zk.l0).avatarId);
        sbLIZ.append(" failed");
        C20441214yg.LJ("MultiGuestAvatarPreviewFragment", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("MultiGuestAvatarPreviewFragment@53ab.deleteFailedAvatar$1$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$133(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestVoiceWaveSettingSheet@3b71.disableRight$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((Function1) c516201zk.l0).invoke(((RightDisableResp.ResponseData) c470590Icr.data).soundWaveEffect);
        }
        C1C7U.LIZIZ("MultiGuestVoiceWaveSettingSheet@3b71.disableRight$1");
    }

    public static final void accept$134(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestVoiceWaveSettingSheet@3b71.disableRight$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJ("MultiGuestVoiceWaveSettingSheet", String.valueOf(th.getMessage()));
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("MultiGuestVoiceWaveSettingSheet@3b71.disableRight$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$135(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestVoiceWaveSettingSheet@3b71.enableRight$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((Function1) c516201zk.l0).invoke(((RightEnableResp.ResponseData) c470590Icr.data).soundWaveEffect);
        }
        C1C7U.LIZIZ("MultiGuestVoiceWaveSettingSheet@3b71.enableRight$1");
    }

    public static final void accept$136(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestVoiceWaveSettingSheet@3b71.enableRight$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJ("MultiGuestVoiceWaveSettingSheet", String.valueOf(th.getMessage()));
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("MultiGuestVoiceWaveSettingSheet@3b71.enableRight$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$137(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestVoiceWaveSettingSheet@3b71.getSoundWaveEffectList$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((Function1) c516201zk.l0).invoke(((SoundWaveEffectListResp.ResponseData) c470590Icr.data).soundWaveEffects);
        }
        C1C7U.LIZIZ("MultiGuestVoiceWaveSettingSheet@3b71.getSoundWaveEffectList$1");
    }

    public static final void accept$138(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestVoiceWaveSettingSheet@3b71.getSoundWaveEffectList$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJ("MultiGuestVoiceWaveSettingSheet", String.valueOf(th.getMessage()));
        ((Function1) c516201zk.l0).invoke(th);
        C1C7U.LIZIZ("MultiGuestVoiceWaveSettingSheet@3b71.getSoundWaveEffectList$2");
    }

    public static final void accept$139(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveGiftAbsViewHolderV2@b208.initObserver$1");
        C16F5 c16f5 = ((AbstractC1126560fQE) c516201zk.l0).LLJJJJ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131851337));
        }
        C1C7U.LIZIZ("LiveGiftAbsViewHolderV2@b208.initObserver$1");
    }

    public static final void accept$14(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("FlowTypeRepository@cc0d.flowTypeStatus$2$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c516201zk.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("FlowTypeRepository@cc0d.flowTypeStatus$2$2");
    }

    public static final void accept$140(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestV3Manager@4508.fetchAndDistributeMemoryInfoIfNeed$3");
        C919310a1x.LIZJ("OneVn_MultiGuestV3Manager", "get_memory_info failed", (Throwable) obj);
        ((DataChannel) c516201zk.l0).zW(MultiGuestMemoryInfoChannel.class, null);
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.fetchAndDistributeMemoryInfoIfNeed$3");
    }

    public static final void accept$141(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestV3Manager@4508.getGuestSetting$2");
        Function2 function2 = (Function2) c516201zk.l0;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, null);
        }
        C1C7U.LIZIZ("MultiGuestV3Manager@4508.getGuestSetting$2");
    }

    public static final void accept$142(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SearchPlayerBackgroundReleaseManager@fee2.init$1$1");
        if (((Boolean) obj).booleanValue()) {
            ((C0P5D) c516201zk.l0).getClass();
            try {
                C099G c099g = C0P5D.LIZIZ;
                if (c099g != null) {
                    c099g.LIZIZ(null);
                }
                C0P5D.LIZIZ = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C640590PAr(null), 3);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        } else {
            C099G c099g2 = C0P5D.LIZIZ;
            if (c099g2 != null) {
                c099g2.LIZIZ(null);
            }
        }
        C1C7U.LIZIZ("SearchPlayerBackgroundReleaseManager@fee2.init$1$1");
    }

    public static final void accept$143(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("EnigmaPurchaseService@d2d.getProductDetails$2");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("EnigmaPurchaseService@d2d.getProductDetails$2");
    }

    public static final void accept$144(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SetAvatarNicknameFragment@4954.initEditText$2");
        C1389890mGx c1389890mGx = new C1389890mGx((View) c516201zk.l0);
        c1389890mGx.LJIIIZ(2131829643);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("SetAvatarNicknameFragment@4954.initEditText$2");
    }

    public static final void accept$145(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SetNicknameFragment@6648.initTextLengthSubject$1");
        C1389890mGx c1389890mGx = new C1389890mGx((View) c516201zk.l0);
        c1389890mGx.LJIIIZ(2131829643);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("SetNicknameFragment@6648.initTextLengthSubject$1");
    }

    public static final void accept$146(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InboxAccountMixSearchService@8d44.toDeferred$disposable$1");
        ((C05XL) c516201zk.l0).LJIIZILJ(obj);
        C1C7U.LIZIZ("InboxAccountMixSearchService@8d44.toDeferred$disposable$1");
    }

    public static final void accept$147(C516201zk c516201zk, Object obj) {
        String str;
        C1C7U.LIZ("ProfileNaviCreatorViewModel@4472.createNewNavi$1");
        ProfileNaviCreateResponse profileNaviCreateResponse = (ProfileNaviCreateResponse) obj;
        if (profileNaviCreateResponse != null) {
            C19424410z4 c19424410z4 = (C19424410z4) c516201zk.l0;
            if (profileNaviCreateResponse.error_code == 0 && (str = profileNaviCreateResponse.naviId) != null) {
                c19424410z4.LIZ = str;
            }
        }
        C1C7U.LIZIZ("ProfileNaviCreatorViewModel@4472.createNewNavi$1");
    }

    public static final void accept$148(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("FollowDataCenter@4dad.initCacheData$3");
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("FollowDataCenter@4dad.initCacheData$3");
    }

    public static final void accept$149(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AlbumAiUtilsKt@ffbf.logPerformance$1");
        ((C238400w2) c516201zk.l0).element = System.currentTimeMillis();
        C1C7U.LIZIZ("AlbumAiUtilsKt@ffbf.logPerformance$1");
    }

    public static final void accept$15(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("TeamPairSoloLiveCountDownTimerImpl@c060.start$2");
        ((Function1) c516201zk.l0).invoke(Long.valueOf(((Number) obj).longValue()));
        C1C7U.LIZIZ("TeamPairSoloLiveCountDownTimerImpl@c060.start$2");
    }

    public static final void accept$150(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AlbumAiUtilsKt@ffbf.logPerformance$3");
        ((C238400w2) c516201zk.l0).element = System.currentTimeMillis();
        C1C7U.LIZIZ("AlbumAiUtilsKt@ffbf.logPerformance$3");
    }

    public static final void accept$151(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AlbumAiUtilsKt@ffbf.observeTotalCount$1");
        ((C118300cf) c516201zk.l0).element += ((List) obj).size();
        C1C7U.LIZIZ("AlbumAiUtilsKt@ffbf.observeTotalCount$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$152(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowAnchorModel@79a1.createShow$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((CreateShowResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FC) c516201zk.l0).LJJI(showContent, "onCreateShow");
        }
        C1C7U.LIZIZ("LiveShowAnchorModel@79a1.createShow$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$153(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowAnchorModel@79a1.endShow$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((EndShowResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FC) c516201zk.l0).LJJI(showContent, "onEndShow");
        }
        C1C7U.LIZIZ("LiveShowAnchorModel@79a1.endShow$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$154(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowAnchorModel@79a1.finishShowingGuest$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((FinishShowingGuestResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FC) c516201zk.l0).LJJI(showContent, "onFinishGuest");
        }
        C1C7U.LIZIZ("LiveShowAnchorModel@79a1.finishShowingGuest$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$155(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowAnchorModel@79a1.getShowContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((GetShowContentResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FC) c516201zk.l0).LJJI(showContent, "getShowContent");
        }
        C1C7U.LIZIZ("LiveShowAnchorModel@79a1.getShowContent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$156(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowAnchorModel@79a1.showAgainGuest$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((ShowAgainGuestResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FC) c516201zk.l0).LJJI(showContent, "onShowAgainGuest");
        }
        C1C7U.LIZIZ("LiveShowAnchorModel@79a1.showAgainGuest$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$157(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowAnchorModel@79a1.updateShowContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((UpdateShowContentResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FC) c516201zk.l0).LJJII(showContent, "updateShowContent");
        }
        C1C7U.LIZIZ("LiveShowAnchorModel@79a1.updateShowContent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$158(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.getShowSetting$1");
        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "get show setting successful");
        ShowConfig showConfig = ((GetShowSettingsResponse.ResponseData) ((BaseResponse) obj).data).showSettings;
        if (showConfig != null) {
            ((LiveShowAnchorViewModel) c516201zk.l0).LLILZ.setValue(showConfig);
        }
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.getShowSetting$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$159(C516201zk c516201zk, Object obj) {
        List<ShowListUser> list;
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.updateShowList$1");
        C20441214yg.LIZIZ("LiveShowAnchorViewModel", "updateShowList successful");
        LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) c516201zk.l0;
        ShowContent showContent = ((UpdateShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        List<ShowListUser> list2 = null;
        if (showContent != null) {
            list = showContent.showingAndReadyList;
            list2 = showContent.finishedList;
        } else {
            list = null;
        }
        liveShowAnchorViewModel.AQ2(list, list2, false);
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.updateShowList$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$16(C516201zk c516201zk, Object obj) {
        AnchorEventsResponse.ResponseData responseData;
        C1C7U.LIZ("GameEventPreviewBanner@faaf.queryAvailableEvent$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData = (AnchorEventsResponse.ResponseData) baseResponse.data) != null) {
            GameEventPreviewBanner gameEventPreviewBanner = (GameEventPreviewBanner) c516201zk.l0;
            gameEventPreviewBanner.LLJILJIL = responseData.eventInfoList;
            gameEventPreviewBanner.N1();
        }
        C1C7U.LIZIZ("GameEventPreviewBanner@faaf.queryAvailableEvent$1");
    }

    public static final void accept$160(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ChangAvatarActionStage@89ff.loadMusic$2$1$1$3");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c516201zk.l0;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        C1C7U.LIZIZ("ChangAvatarActionStage@89ff.loadMusic$2$1$1$3");
    }

    public static final void accept$161(C516201zk c516201zk, Object obj) {
        SmsSettingItem smsSettingItem;
        boolean z;
        Map<String, SmsSettingItem> map;
        C1C7U.LIZ("ChannelAuthPopupServiceImpl@2e77.canShowChannelAuthPopup$1");
        NeedSmsConsentResponse needSmsConsentResponse = (NeedSmsConsentResponse) obj;
        if (needSmsConsentResponse != null && (map = needSmsConsentResponse.data) != null) {
            smsSettingItem = map.get("primary_sms_auth");
        } else {
            smsSettingItem = null;
        }
        int i = 1;
        if (smsSettingItem != null && !Intrinsics.LJFF(smsSettingItem.disable, Boolean.TRUE) && Intrinsics.LJFF(smsSettingItem.field, "primary_sms_auth") && smsSettingItem.value == 0) {
            z = true;
        } else {
            z = false;
        }
        Function1 function1 = (Function1) c516201zk.l0;
        if (!z) {
            i = -1;
        }
        function1.invoke(Integer.valueOf(i));
        C1C7U.LIZIZ("ChannelAuthPopupServiceImpl@2e77.canShowChannelAuthPopup$1");
    }

    public static final void accept$162(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ChannelAuthPopupServiceImpl@2e77.canShowChannelAuthPopup$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needShowSmsConsent error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C211000rc.LIZIZ("ChannelAuthPopupService", C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) c516201zk.l0).invoke(-99);
        C1C7U.LIZIZ("ChannelAuthPopupServiceImpl@2e77.canShowChannelAuthPopup$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$163(C516201zk c516201zk, Object obj) {
        List<ShowListUser> list;
        List<ShowListUser> list2;
        C1C7U.LIZ("LiveShowAudienceModel@c1f0.getShowContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ShowContent showContent = ((GetShowContentResponse.ResponseData) c470590Icr.data).showContent;
            if (showContent != null && (list2 = showContent.showingAndReadyList) != null) {
                C01FB c01fb = (C01FB) c516201zk.l0;
                for (ShowListUser showListUser : list2) {
                    c01fb.LJIJJLI(showListUser.userId, showListUser.score, "getShowContent");
                }
            }
            ShowContent showContent2 = ((GetShowContentResponse.ResponseData) c470590Icr.data).showContent;
            if (showContent2 != null && (list = showContent2.finishedList) != null) {
                C01FB c01fb2 = (C01FB) c516201zk.l0;
                for (ShowListUser showListUser2 : list) {
                    c01fb2.LJIJJLI(showListUser2.userId, showListUser2.score, "getShowContent");
                }
            }
        }
        C1C7U.LIZIZ("LiveShowAudienceModel@c1f0.getShowContent$1");
    }

    public static final void accept$164(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountdownAudienceModel@9cd3.endOneCountdownPlay$2");
        ((C01E2) c516201zk.l0).LJJIFFI((Throwable) obj);
        C1C7U.LIZIZ("CountdownAudienceModel@9cd3.endOneCountdownPlay$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$165(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountdownAudienceModel@9cd3.fetchCountdownFanTicket$1");
        List listLIZJ = C01E8.LIZJ(((CountdownGetContentResponse.ResponseData) ((BaseResponse) obj).data).countdownContents);
        C01E2 c01e2 = (C01E2) c516201zk.l0;
        Iterator it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            c01e2.LJJIIZ((C01E9) it2.next());
        }
        C1AZW c1azw = C1AZW.LIZ;
        ((C01E2) c516201zk.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fanTicketList = ");
        sbLIZ.append(listLIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("CountdownAudienceModel", strLIZIZ, null, null);
        C1C7U.LIZIZ("CountdownAudienceModel@9cd3.fetchCountdownFanTicket$1");
    }

    public static final void accept$166(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountdownAudienceModel@9cd3.fetchCountdownFanTicket$2");
        ((C01E2) c516201zk.l0).LJJIFFI((Throwable) obj);
        C1C7U.LIZIZ("CountdownAudienceModel@9cd3.fetchCountdownFanTicket$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$167(C516201zk c516201zk, Object obj) {
        CountdownConfig countdownConfig;
        C1C7U.LIZ("CountdownAudienceModel@9cd3.startOneCountdownPlay$1");
        CountdownStartResponse.ResponseData responseData = (CountdownStartResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData.countdownExists) {
            C766270U4b.LIZLLL(2131843234);
        } else {
            DataChannel dataChannel = ((C01E2) c516201zk.l0).LIZ;
            if (dataChannel != null) {
                CountdownContent countdownContent = responseData.countdownContent;
                if (countdownContent != null) {
                    countdownConfig = countdownContent.countdownConfig;
                } else {
                    countdownConfig = null;
                }
                dataChannel.SX0(C956850b0V.class, countdownConfig);
            }
            C766270U4b.LIZLLL(2131843237);
        }
        C1AZW c1azw = C1AZW.LIZ;
        ((C01E2) c516201zk.l0).getClass();
        c1azw.getClass();
        C1AZW.LIZ("CountdownAudienceModel", "moderator startOneCountdownPlay", null, null);
        C1C7U.LIZIZ("CountdownAudienceModel@9cd3.startOneCountdownPlay$1");
    }

    public static final void accept$168(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountdownAudienceModel@9cd3.startOneCountdownPlay$2");
        ((C01E2) c516201zk.l0).LJJIFFI((Throwable) obj);
        C1C7U.LIZIZ("CountdownAudienceModel@9cd3.startOneCountdownPlay$2");
    }

    public static final void accept$169(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GameTopicLogic@8254.fetchTopics$4");
        Throwable th = (Throwable) obj;
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to fetch topics!  error: ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJ("GameTopicLogic", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("GameTopicLogic@8254.fetchTopics$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$17(C516201zk c516201zk, Object obj) {
        C234500vP c234500vP = (C234500vP) c516201zk.l0;
        c234500vP.getClass();
        C1C7U.LIZ("MemberMessageModel@4074.onConsume$1L$1L");
        GetUserStatusResp.Data data = (GetUserStatusResp.Data) ((BaseResponse) obj).data;
        c234500vP.LJJIIZ = data;
        if (data != null && c234500vP.LJJIIJZLJL >= c234500vP.LJJIIJ) {
            if (data.userInRoom) {
                c234500vP.LLL(false);
            }
            c234500vP.LJJIIZ = null;
        }
        C1C7U.LIZIZ("MemberMessageModel@4074.onConsume$1L$1L");
    }

    public static final void accept$170(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("TimedCompetitionScoreBarManager@2fad.doEndCompetition$1");
        ((C1099560eig) c516201zk.l0).LJII();
        C1C7U.LIZIZ("TimedCompetitionScoreBarManager@2fad.doEndCompetition$1");
    }

    public static final void accept$171(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("TimedCompetitionScoreBarManager@2fad.doEndCompetition$2");
        ((C1099560eig) c516201zk.l0).LJII();
        C1C7U.LIZIZ("TimedCompetitionScoreBarManager@2fad.doEndCompetition$2");
    }

    public static final void accept$172(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("RepostGuideRecordHelper@d17a.checkAndShowRepostTextGuide$2");
        ((Function2) c516201zk.l0).invoke(Boolean.FALSE, "error");
        C1C7U.LIZIZ("RepostGuideRecordHelper@d17a.checkAndShowRepostTextGuide$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$173(C516201zk c516201zk, Object obj) {
        CountdownUser countdownUser;
        String str;
        Long lLJIJJ;
        C01EB c01ebLIZ;
        int i;
        String str2;
        CountdownContent countdownContent;
        C1C7U.LIZ("BaseCountdownModel@e342.endOneCountdownPlay$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        CountdownEndResponse.ResponseData responseData = (CountdownEndResponse.ResponseData) baseResponse.data;
        Object obj2 = null;
        if (!responseData.success) {
            String strLJJ = ((C01E7) c516201zk.l0).LJJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endOneCountdownPlay, record exits = ");
            sbLIZ.append(((CountdownEndResponse.ResponseData) baseResponse.data).countdownContent);
            C1AZW.LJIIJ(12, strLJJ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        } else {
            CountdownContent countdownContent2 = responseData.countdownContent;
            if (countdownContent2 != null && (countdownUser = countdownContent2.countdownUser) != null && (str = countdownUser.linkmicId) != null && (lLJIJJ = ((C01E7) c516201zk.l0).LJIJJ(str)) != null) {
                long jLongValue = lLJIJJ.longValue();
                C01E5 c01e5 = ((C01E7) c516201zk.l0).LIZJ.get(str);
                if (c01e5 != null && (countdownContent = c01e5.LIZ) != null) {
                    c01ebLIZ = C01EF.LIZ(countdownContent.status);
                } else {
                    c01ebLIZ = null;
                }
                if (c01ebLIZ != C01EB.IDLE) {
                    String strLJJ2 = ((C01E7) c516201zk.l0).LJJ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("endOneCountdownPlay,remainTime = ");
                    sbLIZ2.append(jLongValue);
                    C1AZW.LJIIJ(12, strLJJ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    if (jLongValue > 0) {
                        C01E7 c01e7 = (C01E7) c516201zk.l0;
                        LinkerMediaChangeOperator linkerMediaChangeOperator = new LinkerMediaChangeOperator();
                        if (LinkCoreModelKt.currentUserIsAnchor()) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        linkerMediaChangeOperator.operatorType = i;
                        Iterator<T> it2 = c01e7.LIZJ.values().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            CountdownUser countdownUser2 = ((C01E5) next).LIZ.countdownUser;
                            if (countdownUser2 != null) {
                                str2 = countdownUser2.linkmicId;
                            } else {
                                str2 = null;
                            }
                            if (Intrinsics.LJFF(str2, str)) {
                                obj2 = next;
                                break;
                            }
                        }
                        C01E5 c01e52 = (C01E5) obj2;
                        if (c01e52 != null) {
                            c01e7.LJJIIZI(new C01E5(C00XQ.LIZ(c01e52.LIZ, 0), c01e52.LIZIZ, linkerMediaChangeOperator, 8));
                        }
                    } else {
                        ((C01E7) c516201zk.l0).LJJIIZI(new C01E5(countdownContent2, false, null, 14));
                    }
                }
            }
        }
        C1C7U.LIZIZ("BaseCountdownModel@e342.endOneCountdownPlay$1");
    }

    public static final void accept$174(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountdownModel@e342.endOneCountdownPlay$2");
        ((C01E7) c516201zk.l0).LJJIFFI((Throwable) obj);
        C1C7U.LIZIZ("BaseCountdownModel@e342.endOneCountdownPlay$2");
    }

    public static final void accept$175(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountdownModel@e342.getUserPlaySettings$2");
        ((Function1) c516201zk.l0).invoke(null);
        C1C7U.LIZIZ("BaseCountdownModel@e342.getUserPlaySettings$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$176(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountdownModel@e342.startOneCountdownPlay$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        CountdownStartResponse.ResponseData responseData = (CountdownStartResponse.ResponseData) baseResponse.data;
        if (responseData.countdownExists) {
            C766270U4b.LIZLLL(2131843234);
        } else {
            CountdownContent countdownContent = responseData.countdownContent;
            CountdownConfig countdownConfig = null;
            if (countdownContent != null) {
                ((C01E7) c516201zk.l0).LJJIIZI(new C01E5(countdownContent, false, null, 14));
            }
            DataChannel dataChannel = ((C01E7) c516201zk.l0).LIZ;
            if (dataChannel != null) {
                CountdownContent countdownContent2 = ((CountdownStartResponse.ResponseData) baseResponse.data).countdownContent;
                if (countdownContent2 != null) {
                    countdownConfig = countdownContent2.countdownConfig;
                }
                dataChannel.SX0(C956850b0V.class, countdownConfig);
            }
        }
        C1C7U.LIZIZ("BaseCountdownModel@e342.startOneCountdownPlay$1");
    }

    public static final void accept$177(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountdownModel@e342.startOneCountdownPlay$2");
        ((C01E7) c516201zk.l0).LJJIFFI((Throwable) obj);
        C1C7U.LIZIZ("BaseCountdownModel@e342.startOneCountdownPlay$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$178(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountdownModel@e342.getCountdownContents$1");
        List<CountdownContent> list = ((CountdownGetContentResponse.ResponseData) ((BaseResponse) obj).data).countdownContents;
        C01E7 c01e7 = (C01E7) c516201zk.l0;
        for (CountdownContent countdownContent : list) {
            c01e7.LJJIIZI(new C01E5(countdownContent, false, null, 14));
            C01E9 c01e9LIZIZ = C01E8.LIZIZ(countdownContent);
            if (c01e9LIZIZ != null) {
                c01e7.LJJIIZ(c01e9LIZIZ);
            }
        }
        C1C7U.LIZIZ("BaseCountdownModel@e342.getCountdownContents$1");
    }

    public static final void accept$179(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountdownModel@e342.getCountdownContents$2");
        ((C01E7) c516201zk.l0).LJJIFFI((Throwable) obj);
        C1C7U.LIZIZ("BaseCountdownModel@e342.getCountdownContents$2");
    }

    public static final void accept$18(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$4");
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(message);
        }
        C1C7U.LIZIZ("FamilyPairingServiceImpl@16fd.requestEngagementCount$4");
    }

    public static final void accept$180(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PipGuideDialogWidget@94fb.getPipConfig$2");
        C20441214yg.LJFF("PipGuideDialogWidget", "getPipConfig error", (Throwable) obj);
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("PipGuideDialogWidget@94fb.getPipConfig$2");
    }

    public static final void accept$181(C516201zk c516201zk, Object obj) {
        T t;
        Function1 function1;
        C1C7U.LIZ("MultiLiveUtil@5147.reportCreatedGroupId$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (t = baseResponse.data) != 0 && (function1 = (Function1) c516201zk.l0) != null) {
            function1.invoke(t);
        }
        C1C7U.LIZIZ("MultiLiveUtil@5147.reportCreatedGroupId$1");
    }

    public static final void accept$182(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveUtil@5147.reportCreatedGroupId$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportCreatedGroupId:");
        sbLIZ.append(((Throwable) obj).getMessage());
        C1AZW.LJFF("MultiLiveUtil", C2188811AlT.LIZIZ(sbLIZ), null, null);
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("MultiLiveUtil@5147.reportCreatedGroupId$2");
    }

    public static final void accept$183(C516201zk c516201zk, Object obj) {
        T t;
        Function1 function1;
        C1C7U.LIZ("MultiLiveUtil@5147.getGroupChatLiveEntrance$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (t = baseResponse.data) != 0 && (function1 = (Function1) c516201zk.l0) != null) {
            function1.invoke(t);
        }
        C1C7U.LIZIZ("MultiLiveUtil@5147.getGroupChatLiveEntrance$1");
    }

    public static final void accept$184(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveUtil@5147.getGroupChatLiveEntrance$2");
        Function0 function0 = (Function0) c516201zk.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGroupChatGuestDetails:");
        sbLIZ.append(((Throwable) obj).getMessage());
        C1AZW.LJFF("MultiLiveUtil", C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("MultiLiveUtil@5147.getGroupChatLiveEntrance$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$185(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveUtil@5147.getLinkMicInfo$2");
        GetLinkMicInfoResp.ResponseData responseData = (GetLinkMicInfoResp.ResponseData) ((BaseResponse) obj).data;
        int i = (int) responseData.guestCnt;
        String str = responseData.multiLayoutKey;
        Function2 function2 = (Function2) c516201zk.l0;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), str);
        }
        C1C7U.LIZIZ("MultiLiveUtil@5147.getLinkMicInfo$2");
    }

    public static final void accept$186(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveUtil@5147.getLinkMicInfo$3");
        Throwable th = (Throwable) obj;
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C20441214yg.LJFF("getLinkMicInfo", "request getLinkMicInfo, failed", th);
        C1C7U.LIZIZ("MultiLiveUtil@5147.getLinkMicInfo$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$187(C516201zk c516201zk, Object obj) {
        long id;
        C1C7U.LIZ("MultiLiveUtil@5147.getLiveEventUser$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        List<GetLiveEventUserResponse.InvitedListUser> list = ((GetLiveEventUserResponse.ResponseData) baseResponse.data).invitedUsers;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<GetLiveEventUserResponse.InvitedListUser> it2 = list.iterator();
        while (it2.hasNext()) {
            User user = it2.next().user;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            arrayList.add(Long.valueOf(id));
        }
        List<GetLiveEventUserResponse.RegisteredListUser> list2 = ((GetLiveEventUserResponse.ResponseData) baseResponse.data).registeredUsers;
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(new Pair(arrayList, list2));
        }
        C1C7U.LIZIZ("MultiLiveUtil@5147.getLiveEventUser$2");
    }

    public static final void accept$188(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveUtil@5147.inviteLiveEventUser$4");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("MultiLiveUtil@5147.inviteLiveEventUser$4");
    }

    public static final void accept$189(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LocalLottieBitmapAsset@1a0d.tryLoad$7");
        Throwable th = (Throwable) obj;
        C20441214yg.LJFF("LocalLottieBitmapAsset", "load failed:", th);
        ((Function2) c516201zk.l0).invoke(Boolean.FALSE, th);
        C1C7U.LIZIZ("LocalLottieBitmapAsset@1a0d.tryLoad$7");
    }

    public static final void accept$19(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("VideoCaptionMentionRemoteSearchChunk@558a.toDeferred$1");
        ((C05XL) c516201zk.l0).LJIIZILJ(obj);
        C1C7U.LIZIZ("VideoCaptionMentionRemoteSearchChunk@558a.toDeferred$1");
    }

    public static final void accept$190(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KidsAwemeGridViewModel@8f07.loadMore$3");
        Pair pair = (Pair) obj;
        if (((List) pair.getFirst()).isEmpty()) {
            ((KidsAwemeGridViewModel) c516201zk.l0).LLILZ.postValue(-1);
        } else {
            ((KidsAwemeGridViewModel) c516201zk.l0).LLILZ.postValue(0);
            ArrayList arrayList = new ArrayList();
            Collection value = ((KidsAwemeGridViewModel) c516201zk.l0).LLILLJJLI.getValue();
            if (value == null) {
                value = C13BV.INSTANCE;
            }
            arrayList.addAll(value);
            arrayList.addAll((Collection) pair.getFirst());
            ((KidsAwemeGridViewModel) c516201zk.l0).LLILLJJLI.postValue(arrayList);
        }
        C1C7U.LIZIZ("KidsAwemeGridViewModel@8f07.loadMore$3");
    }

    public static final void accept$191(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KidsAwemeGridViewModel@8f07.loadMore$4");
        ((KidsAwemeGridViewModel) c516201zk.l0).LLILZ.postValue(-2);
        C1C7U.LIZIZ("KidsAwemeGridViewModel@8f07.loadMore$4");
    }

    public static final void accept$192(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KidsAwemeGridViewModel@8f07.refresh$3");
        Pair pair = (Pair) obj;
        ((KidsAwemeGridViewModel) c516201zk.l0).LLILLL.postValue((Integer) pair.getSecond());
        if (((Number) pair.getSecond()).intValue() == 0) {
            if (((List) pair.getFirst()).isEmpty()) {
                ((KidsAwemeGridViewModel) c516201zk.l0).LLILLL.postValue(-1);
            } else {
                ((KidsAwemeGridViewModel) c516201zk.l0).LLILLJJLI.postValue(new ArrayList((Collection) pair.getFirst()));
            }
        }
        C1C7U.LIZIZ("KidsAwemeGridViewModel@8f07.refresh$3");
    }

    public static final void accept$193(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KidsAwemeGridViewModel@8f07.refresh$4");
        ((KidsAwemeGridViewModel) c516201zk.l0).LLILLL.postValue(-2);
        C1C7U.LIZIZ("KidsAwemeGridViewModel@8f07.refresh$4");
    }

    public static final void accept$194(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GameLinkV2GuestPresenter@40ad.changeState$2");
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C20441214yg.LJFF("GameLinkGuestPresenter", "changeState request failed:", th);
        C1C7U.LIZIZ("GameLinkV2GuestPresenter@40ad.changeState$2");
    }

    public static final void accept$195(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("RecSwipeCardListAdapter@e6db.bindWithNameAndAvatarReasonView$2");
        ((AppCompatImageView) ((View) c516201zk.l0).findViewById(R.id.lj_)).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("RecSwipeCardListAdapter@e6db.bindWithNameAndAvatarReasonView$2");
    }

    public static final void accept$196(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("RecSwipeCardListAdapter@e6db.bindWithNameAndAvatarReasonView$5");
        ((AppCompatImageView) ((View) c516201zk.l0).findViewById(R.id.lza)).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("RecSwipeCardListAdapter@e6db.bindWithNameAndAvatarReasonView$5");
    }

    public static final void accept$197(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("StrategySDKManager@738d.checkStrategy$2$1");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        Object obj2 = ((BaseResponse) obj).data;
        C189200o6.m2constructorimpl(obj2);
        interfaceC20236714Gf.resumeWith(obj2);
        C1C7U.LIZIZ("StrategySDKManager@738d.checkStrategy$2$1");
    }

    public static final void accept$198(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("StrategySDKManager@738d.checkStrategy$2$2");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C1C7U.LIZIZ("StrategySDKManager@738d.checkStrategy$2$2");
    }

    public static final void accept$199(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SubSpaceMemberVM@4a83.fetchMembers$2");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("SubSpaceMemberVM@4a83.fetchMembers$2");
    }

    public static final void accept$2(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MobileGameTnsSignalReporter@1c37.stop$1");
        Map<String, Object> map = C1338270kvh.LIZ;
        Iterator<InterfaceC471501sX> it2 = ((C471401sW) c516201zk.l0).LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
        C11JF c11jf = C471201sU.LIZJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = C471201sU.LIZIZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        C1C7U.LIZIZ("MobileGameTnsSignalReporter@1c37.stop$1");
    }

    public static final void accept$20(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("WorkBenchRepository@a4d7._operator$1$postUnsubscribeRequest$2");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("WorkBenchRepository@a4d7._operator$1$postUnsubscribeRequest$2");
    }

    public static final void accept$200(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("HorizontalMentionMixSearchService@7d75.toDeferred$1");
        ((C05XL) c516201zk.l0).LJIIZILJ(obj);
        C1C7U.LIZIZ("HorizontalMentionMixSearchService@7d75.toDeferred$1");
    }

    public static final void accept$201(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("FavoriteTabCountHelper@8c64.setupV2$3");
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("FavoriteTabCountHelper@8c64.setupV2$3");
    }

    public static final void accept$202(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ScaleTriggerManager@133.postPitayaTask$1");
        C01JP c01jp = (C01JP) c516201zk.l0;
        if (c01jp.LIZIZ != 0) {
            ((ILiveTriggerService) C1161920gLG.LIZJ(ILiveTriggerService.class)).NE(LiveTriggerScaleProduceSettings.INSTANCE.algoPkgName(), c01jp.LIZIZ, LiveClientTriggerConfig.INSTANCE.guideTriggerBusinessNames(), new C01JQ(c01jp), new C5183020f(c01jp, 202));
        }
        C1C7U.LIZIZ("ScaleTriggerManager@133.postPitayaTask$1");
    }

    public static final void accept$203(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PreviewDialogHelperKt@1da5.showBlockedDialog$2");
        C501540Jlg.LIZJ((Context) c516201zk.l0, (Throwable) obj);
        C1C7U.LIZIZ("PreviewDialogHelperKt@1da5.showBlockedDialog$2");
    }

    public static final void accept$204(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DrawRoomListProvider@3742.uploadUnreadForHotRefresh$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error on upload unread item (pre-loadmore) e = ");
        sbLIZ.append(obj);
        C20441214yg.LJ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("DrawRoomListProvider@3742.uploadUnreadForHotRefresh$2");
    }

    public static final void accept$205(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DrawRoomListProvider@3742.uploadUnreadWhenExpired$1$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Collecting unread room result, extra, statusCode: ");
        sbLIZ.append(((BaseResponse) obj).statusCode);
        sbLIZ.append('.');
        C20441214yg.LIZIZ("DrawRoomListProvider", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("DrawRoomListProvider@3742.uploadUnreadWhenExpired$1$1");
    }

    public static final void accept$206(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ArticleTitleEditorVM$Companion@59f.checkTitle$5");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("ArticleTitleEditorVM$Companion@59f.checkTitle$5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$207(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveSettingDialog@35b9.getSoundWaveActivityContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((Function1) c516201zk.l0).invoke(((SoundWaveEffectListResp.ResponseData) c470590Icr.data).guide);
        }
        C1C7U.LIZIZ("MultiLiveSettingDialog@35b9.getSoundWaveActivityContent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$208(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveSettingDialog@35b9.updateReplayLayout$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            C21411818qq c21411818qq = ((MultiLiveSettingDialog) c516201zk.l0).LLJJJJJIL;
            boolean z = false;
            if (c21411818qq != null) {
                c21411818qq.setLoading(false);
            }
            MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) c516201zk.l0;
            GetAnchorSettingsResp.ResponseData responseData = (GetAnchorSettingsResp.ResponseData) c470590Icr.data;
            if (responseData != null && responseData.shareRecordingToGuestsStatus == 2) {
                z = true;
            }
            multiLiveSettingDialog.s = z;
            MultiLiveSettingDialog multiLiveSettingDialog2 = (MultiLiveSettingDialog) c516201zk.l0;
            C21411818qq c21411818qq2 = multiLiveSettingDialog2.LLJJJJJIL;
            if (c21411818qq2 != null) {
                c21411818qq2.setChecked(multiLiveSettingDialog2.s);
            }
        }
        C1C7U.LIZIZ("MultiLiveSettingDialog@35b9.updateReplayLayout$1");
    }

    public static final void accept$209(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveSettingDialog@35b9.getSoundWaveActivityContent$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJ("MultiLiveAnchorSettingDialog", String.valueOf(th.getMessage()));
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("MultiLiveSettingDialog@35b9.getSoundWaveActivityContent$2");
    }

    public static final void accept$21(C516201zk c516201zk, Object obj) {
        MutableLiveData<String> mutableLiveData;
        C1C7U.LIZ("GamePartnershipBeforeVideoLiveSlotWidget@fc30.tryPlugGamesInVideoLive$1");
        if (((BaseResponse) obj).statusCode == 0) {
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((C01SE) c516201zk.l0).LL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
                mutableLiveData.postValue("1");
            }
            C01SE c01se = (C01SE) c516201zk.l0;
            c01se.getClass();
            c01se.LLILZLL = true;
            C01SE c01se2 = (C01SE) c516201zk.l0;
            c01se2.LLIZ = null;
            C01SD c01sd = c01se2.LLJILLL;
            if (c01sd != null) {
                c01sd.LIZIZ(LiveMode.VIDEO, "video_plug");
            }
        }
        C1C7U.LIZIZ("GamePartnershipBeforeVideoLiveSlotWidget@fc30.tryPlugGamesInVideoLive$1");
    }

    public static final void accept$210(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveSettingDialog@35b9.updateReplayLayout$2");
        C20441214yg.LJ("MultiLiveAnchorSettingDialog", String.valueOf(((Throwable) obj).getMessage()));
        C21411818qq c21411818qq = ((MultiLiveSettingDialog) c516201zk.l0).LLJJJJJIL;
        if (c21411818qq != null) {
            c21411818qq.setLoading(false);
        }
        ((MultiLiveSettingDialog) c516201zk.l0).s = false;
        C21411818qq c21411818qq2 = ((MultiLiveSettingDialog) c516201zk.l0).LLJJJJJIL;
        if (c21411818qq2 != null) {
            c21411818qq2.setChecked(false);
        }
        C1C7U.LIZIZ("MultiLiveSettingDialog@35b9.updateReplayLayout$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$211(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveSettingDialog@35b9.handleReplyEntranceClick$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && ((UpdateAnchorSettingsResp.ResponseData) c470590Icr.data).updateResult) {
            ((MultiLiveSettingDialog) c516201zk.l0).s = !r1.s;
        }
        MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) c516201zk.l0;
        C21411818qq c21411818qq = multiLiveSettingDialog.LLJJJJJIL;
        if (c21411818qq != null) {
            c21411818qq.setChecked(multiLiveSettingDialog.s);
        }
        C1C7U.LIZIZ("MultiLiveSettingDialog@35b9.handleReplyEntranceClick$2");
    }

    public static final void accept$212(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveSettingDialog@35b9.handleReplyEntranceClick$3");
        C20441214yg.LJ("MultiLiveAnchorSettingDialog", String.valueOf(((Throwable) obj).getMessage()));
        MultiLiveSettingDialog multiLiveSettingDialog = (MultiLiveSettingDialog) c516201zk.l0;
        C21411818qq c21411818qq = multiLiveSettingDialog.LLJJJJJIL;
        if (c21411818qq != null) {
            c21411818qq.setChecked(multiLiveSettingDialog.s);
        }
        C1C7U.LIZIZ("MultiLiveSettingDialog@35b9.handleReplyEntranceClick$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$213(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorModel@a0c3.requestClosePlay$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((C01II) c516201zk.l0).LJJ();
            GuestShowdownContent guestShowdownContent = ((GuestShowdownCloseResponse.ResponseData) c470590Icr.data).playContent;
            if (guestShowdownContent != null) {
                ((C01II) c516201zk.l0).LJIIIIZZ(guestShowdownContent, "requestClosePlay");
            }
        }
        C1C7U.LIZIZ("GuestShowdownAnchorModel@a0c3.requestClosePlay$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$214(C516201zk c516201zk, Object obj) {
        GuestShowdownContent guestShowdownContent;
        C1C7U.LIZ("GuestShowdownAnchorModel@a0c3.requestFinishToPunishment$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (guestShowdownContent = ((GuestShowdownFinishToPunishmentResponse.ResponseData) c470590Icr.data).playContent) != null) {
            ((C01II) c516201zk.l0).LJIIIIZZ(guestShowdownContent, "requestFinishToPunishment");
        }
        C1C7U.LIZIZ("GuestShowdownAnchorModel@a0c3.requestFinishToPunishment$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$215(C516201zk c516201zk, Object obj) {
        long jLongValue;
        int iLongValue;
        int iLongValue2;
        int iLongValue3;
        Integer numValueOf;
        int iLongValue4;
        C1C7U.LIZ("GuestShowdownAnchorModel@a0c3.requestGetUserPlaySetting$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((C01II) c516201zk.l0).getClass();
            C20441214yg.LIZIZ("GuestShowdownAnchorModel", "requestGetUserPlaySetting success.");
            C01II c01ii = (C01II) c516201zk.l0;
            GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
            Long l = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_duration");
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultDuration;
            }
            guestShowdownConfig.duration = jLongValue;
            Long l2 = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_loser_num");
            if (l2 != null) {
                iLongValue = (int) l2.longValue();
            } else {
                iLongValue = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultLoserNum;
            }
            guestShowdownConfig.loserNum = iLongValue;
            Long l3 = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_winner_num");
            if (l3 != null) {
                iLongValue2 = (int) l3.longValue();
            } else {
                iLongValue2 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultWinnerNum;
            }
            guestShowdownConfig.winnerNum = iLongValue2;
            Integer numValueOf2 = null;
            if (C01ZC.LIZIZ()) {
                numValueOf = null;
            } else {
                Long l4 = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_max_loser_num");
                if (l4 != null) {
                    iLongValue3 = (int) l4.longValue();
                } else {
                    iLongValue3 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().maxLoserNum;
                }
                numValueOf = Integer.valueOf(iLongValue3);
            }
            if (C01ZC.LIZIZ()) {
                Long l5 = ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data).settingsMap.get("guest_showdown_max_position");
                if (l5 != null) {
                    iLongValue4 = (int) l5.longValue();
                } else {
                    iLongValue4 = MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultMaxPosition;
                }
                numValueOf2 = Integer.valueOf(iLongValue4);
            }
            C305201Gg c305201Gg = new C305201Gg(guestShowdownConfig, numValueOf, numValueOf2);
            Iterator<InterfaceC305401Gi> it2 = ((C01II) c516201zk.l0).LJJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c305201Gg);
            }
            c01ii.LJIL = c305201Gg;
        }
        C1C7U.LIZIZ("GuestShowdownAnchorModel@a0c3.requestGetUserPlaySetting$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$216(C516201zk c516201zk, Object obj) {
        GuestShowdownContent guestShowdownContent;
        long j;
        int i;
        int i2;
        C1C7U.LIZ("GuestShowdownAnchorModel@a0c3.requestStartPlay$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (guestShowdownContent = ((GuestShowdownStartResponse.ResponseData) c470590Icr.data).playContent) != null) {
            C01II c01ii = (C01II) c516201zk.l0;
            c01ii.LJIIIIZZ(guestShowdownContent, "requestStartGuestShowdown");
            GuestShowdownConfig guestShowdownConfig = guestShowdownContent.playConfig;
            long j2 = 0;
            if (guestShowdownConfig != null) {
                j = guestShowdownConfig.duration;
            } else {
                j = 0;
            }
            c01ii.LJJI = j;
            c01ii.LJIILIIL = C445101oH.LIZ();
            if (!C01ZC.LIZIZ()) {
                long j3 = guestShowdownContent.playId;
                GuestShowdownConfig guestShowdownConfig2 = guestShowdownContent.playConfig;
                if (guestShowdownConfig2 != null) {
                    j2 = guestShowdownConfig2.duration;
                }
                if (guestShowdownConfig2 != null) {
                    i = guestShowdownConfig2.loserNum;
                } else {
                    i = 0;
                }
                if (guestShowdownConfig2 != null) {
                    i2 = guestShowdownConfig2.winnerNum;
                } else {
                    i2 = 1;
                }
                C308501Hn.LIZ(i, i2, j3, j2);
                InterfaceC934710aQn.fc.LJFF(Long.valueOf(guestShowdownContent.playId));
            }
        }
        C1C7U.LIZIZ("GuestShowdownAnchorModel@a0c3.requestStartPlay$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$217(C516201zk c516201zk, Object obj) {
        GuestShowdownContent guestShowdownContent;
        C1C7U.LIZ("GuestShowdownAnchorModel@a0c3.requestUpdateConfig$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (guestShowdownContent = ((GuestShowdownUpdateResponse.ResponseData) c470590Icr.data).playContent) != null) {
            ((C01II) c516201zk.l0).LJIIIIZZ(guestShowdownContent, "requestUpdateConfig");
        }
        C1C7U.LIZIZ("GuestShowdownAnchorModel@a0c3.requestUpdateConfig$1");
    }

    public static final void accept$218(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorModel@a0c3.updateUserPlaySettings$2");
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
            ((C01II) c516201zk.l0).getClass();
            C20441214yg.LIZIZ("GuestShowdownAnchorModel", "updateUserPlaySettings successfully");
        }
        C1C7U.LIZIZ("GuestShowdownAnchorModel@a0c3.updateUserPlaySettings$2");
    }

    public static final void accept$219(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestFinishToPunishment$1");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestFinishToPunishment successfully");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestFinishToPunishment$1");
    }

    public static final void accept$22(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("SubSpacePollMemberVM@12b5.fetchMembers$2");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("SubSpacePollMemberVM@12b5.fetchMembers$2");
    }

    public static final void accept$220(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestFinishToPunishment$2");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestFinishToPunishment failure");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestFinishToPunishment$2");
    }

    public static final void accept$221(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenCalculatingOrInPunishment$2");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "updateUserPlaySettings unsuccessfully");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenCalculatingOrInPunishment$2");
    }

    public static final void accept$222(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenReadyOrOngoing$1");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestUpdateConfig successfully");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenReadyOrOngoing$1");
    }

    public static final void accept$223(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenReadyOrOngoing$2");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestUpdateConfig failure");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenReadyOrOngoing$2");
    }

    public static final void accept$224(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BasePlaybookModel@464b.require$1");
        C20441214yg.LIZIZ(((AbstractC20384214pU) c516201zk.l0).LJIJJ(), "[require] getActiveContent successfully");
        C1C7U.LIZIZ("BasePlaybookModel@464b.require$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$225(C516201zk c516201zk, Object obj) {
        PlaybookFetchDetailResponse.ResponseData responseData;
        Playbook playbook;
        C1C7U.LIZ("BasePlaybookModel@464b.fetchDetail$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (PlaybookFetchDetailResponse.ResponseData) c470590Icr.data) != null && (playbook = responseData.playbook) != null) {
            AbstractC20384214pU.LJJ((AbstractC20384214pU) c516201zk.l0, playbook, "fetchDetailFromNet", false, null, 28);
        }
        C1C7U.LIZIZ("BasePlaybookModel@464b.fetchDetail$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$226(C516201zk c516201zk, Object obj) {
        String strLJJIIZI;
        C1C7U.LIZ("BasePlaybookModel@464b.review$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            String strLIZ = C01EI.LIZ(0, ((AbstractC20384214pU) c516201zk.l0).LJIJJ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("review success playbook = ");
            Playbook playbook = ((PlaybookReviewResponse.ResponseData) c470590Icr.data).playbook;
            if (playbook != null) {
                strLJJIIZI = PlaybookUtilKt.LJJIIZI(playbook);
            } else {
                strLJJIIZI = null;
            }
            sbLIZ.append(strLJJIIZI);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            ((AbstractC20384214pU) c516201zk.l0).LIZ.FQ2(RefreshPlaybookListEvent.class);
        }
        C1C7U.LIZIZ("BasePlaybookModel@464b.review$1");
    }

    public static final void accept$227(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BasePlaybookModel@464b.unpublish$1");
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
            C1AZW.LJIIJ(12, C01EI.LIZ(0, ((AbstractC20384214pU) c516201zk.l0).LJIJJ()), "unpublish success", null, null);
            ((AbstractC20384214pU) c516201zk.l0).LIZ.FQ2(RefreshPlaybookListEvent.class);
            ((AbstractC20384214pU) c516201zk.l0).LIZ.FQ2(PlaybookUnPublishSuccessEvent.class);
        }
        C1C7U.LIZIZ("BasePlaybookModel@464b.unpublish$1");
    }

    public static final void accept$228(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MiniDramaNetworkApiServiceImpl@2a59.reportSeriesFavoriteAction$1");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("MiniDramaNetworkApiServiceImpl@2a59.reportSeriesFavoriteAction$1");
    }

    public static final void accept$229(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("UserViolationHandler@4d0f.requestReason$2");
        C501540Jlg.LIZJ((Context) c516201zk.l0, (Throwable) obj);
        C1C7U.LIZIZ("UserViolationHandler@4d0f.requestReason$2");
    }

    public static final void accept$23(C516201zk c516201zk, Object obj) {
        String str;
        C1C7U.LIZ("CloudDraftItemManager@9865.prepareDraftRecord$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C477520Io2) {
            str = ((C477520Io2) th).getxTtLogId();
        } else {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareDraft api call fail throwable=");
        sbLIZ.append(th);
        sbLIZ.append(" logId=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("CloudDraftItemManager_Noticeboard", C2188811AlT.LIZIZ(sbLIZ));
        if (th instanceof C176800m6) {
            CloudDraftItemManager.LIZJ.put(Long.valueOf(((C916750Zxp) c516201zk.l0).LIZIZ), Boolean.TRUE);
        }
        C1C7U.LIZIZ("CloudDraftItemManager@9865.prepareDraftRecord$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$230(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowGuestModel@3905.finishShowingGuest$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((FinishShowingGuestResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FA) c516201zk.l0).LJJI(showContent, "onFinishGuest");
        }
        C1C7U.LIZIZ("LiveShowGuestModel@3905.finishShowingGuest$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$231(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowGuestModel@3905.getShowContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((GetShowContentResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01FA) c516201zk.l0).LJJI(showContent, "getShowContent");
        }
        C1C7U.LIZIZ("LiveShowGuestModel@3905.getShowContent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$232(C516201zk c516201zk, Object obj) {
        List<ShowListUser> list;
        C1C7U.LIZ("LiveShowGuestViewModel@6827.finishSelfLiveShow$1");
        LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) c516201zk.l0;
        ShowContent showContent = ((FinishShowingGuestResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        List<ShowListUser> list2 = null;
        if (showContent != null) {
            list = showContent.showingAndReadyList;
            list2 = showContent.finishedList;
        } else {
            list = null;
        }
        liveShowGuestViewModel.AQ2(list, list2, false);
        C20441214yg.LIZIZ("LiveShowGuestViewModel", "finish guest successful");
        C1C7U.LIZIZ("LiveShowGuestViewModel@6827.finishSelfLiveShow$1");
    }

    public static final void accept$233(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("StreamTranslationManager@2d8d.switchTranslation$2");
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("StreamTranslationManager@2d8d.switchTranslation$2");
    }

    public static final void accept$234(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("UserStore@9550.save$2");
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) c516201zk.l0).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        C1C7U.LIZIZ("UserStore@9550.save$2");
    }

    public static final void accept$235(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CCIProcess@f414.getPaymentAuth$job$2");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("CCIProcess@f414.getPaymentAuth$job$2");
    }

    public static final void accept$236(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LinkMicFeedCoverViewManager@d149.requestAwemeInfo$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestAwemeInfo error ");
        sbLIZ.append(((C1AF3) c516201zk.l0).LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("LinkMicFeedCoverViewManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("LinkMicFeedCoverViewManager@d149.requestAwemeInfo$3");
    }

    public static final void accept$237(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("TimerManager@b0e6.startRemoveMaskUiTimer$disposable$1");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("TimerManager@b0e6.startRemoveMaskUiTimer$disposable$1");
    }

    public static final void accept$238(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MirrorCastServiceHelper@b08f.resumeObserve$2");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("MirrorCastServiceHelper@b08f.resumeObserve$2");
    }

    public static final void accept$239(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MirrorCastServiceHelper@b08f.serviceCreateObserve$2");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("MirrorCastServiceHelper@b08f.serviceCreateObserve$2");
    }

    public static final void accept$24(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PopupActionProcessHelper@132b.doEdmSubscribe$disposable$1");
        com.ss.android.ugc.aweme.base.api.BaseResponse baseResponse = (com.ss.android.ugc.aweme.base.api.BaseResponse) obj;
        if (baseResponse != null) {
            Activity activity = (Activity) c516201zk.l0;
            if (baseResponse.status_code == 0) {
                int i = C2187451AjH.LIZ;
                IPopupInfoService iPopupInfoService = (IPopupInfoService) PluggableExtentionKt.pluggableSpi$default(IPopupInfoService.class, false, false, false, 14, null);
                if (iPopupInfoService != null) {
                    iPopupInfoService.LIZJ(false);
                }
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(activity, 22));
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("EDM_subscribe", "updateEdmSubscribeStatus(1) fail!!!");
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(activity, 23));
            }
        }
        C1C7U.LIZIZ("PopupActionProcessHelper@132b.doEdmSubscribe$disposable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$240(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseGuestShowdownModel@f7fd.requestGetContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            GuestShowdownContent guestShowdownContent = ((GuestShowdownGetContentResponse.ResponseData) c470590Icr.data).playContent;
            if (guestShowdownContent != null) {
                ((C01I4) c516201zk.l0).LJIIIIZZ(guestShowdownContent, "requestGetContent");
            }
        } else {
            String strLJIILL = ((C01I4) c516201zk.l0).LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestGetContent error: ");
            sbLIZ.append(c470590Icr);
            C20441214yg.LJ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("BaseGuestShowdownModel@f7fd.requestGetContent$1");
    }

    public static final void accept$241(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseGuestShowdownModel@f7fd.requestGetContent$2");
        String strLJIILL = ((C01I4) c516201zk.l0).LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestGetContent error: ");
        sbLIZ.append(obj);
        C20441214yg.LJ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("BaseGuestShowdownModel@f7fd.requestGetContent$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$242(C516201zk c516201zk, Object obj) {
        ShowContent showContent;
        C1C7U.LIZ("LiveShowModeratorModel@7922.finishShowingGuest$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((FinishShowingGuestResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01F9) c516201zk.l0).LJJI(showContent, "onFinishGuest");
        }
        C1C7U.LIZIZ("LiveShowModeratorModel@7922.finishShowingGuest$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$243(C516201zk c516201zk, Object obj) {
        Long lValueOf;
        ShowContent showContent;
        C1C7U.LIZ("LiveShowModeratorModel@7922.getShowContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateShowContent success version:");
        ShowContent showContent2 = ((GetShowContentResponse.ResponseData) c470590Icr.data).showContent;
        if (showContent2 != null) {
            lValueOf = Long.valueOf(showContent2.version);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (showContent = ((GetShowContentResponse.ResponseData) c470590Icr.data).showContent) != null) {
            ((C01F9) c516201zk.l0).LJJI(showContent, "getShowContent");
        }
        C1C7U.LIZIZ("LiveShowModeratorModel@7922.getShowContent$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$244(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.getShowSetting$1");
        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "get show setting successful");
        ShowConfig showConfig = ((GetShowSettingsResponse.ResponseData) ((BaseResponse) obj).data).showSettings;
        if (showConfig != null) {
            ((LiveShowModeratorViewModel) c516201zk.l0).LLILZ.setValue(showConfig);
        }
        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.getShowSetting$1");
    }

    public static final void accept$245(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.showAgainGuest$1");
        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "show again guest successful");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.showAgainGuest$1");
    }

    public static final void accept$246(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GiftPanelLeafV2@f893.initData$6");
        Gift gift = (Gift) ((LiveData) obj).getValue();
        if (gift != null) {
            ((C1128710fTh) c516201zk.l0).LJLJJI(gift);
        }
        C1C7U.LIZIZ("GiftPanelLeafV2@f893.initData$6");
    }

    public static final void accept$247(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GiftPanelBottomLeaf@1211.doOnParentStart$2");
        C20441214yg.LJII((Throwable) obj);
        C11JF c11jf = ((C1124290fMZ) c516201zk.l0).LLLFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((C1124290fMZ) c516201zk.l0).LLLFF = null;
        C1C7U.LIZIZ("GiftPanelBottomLeaf@1211.doOnParentStart$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$248(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GiftRepository@13a6.saveFavoriteGift$1");
        if (!((GiftFavouriteSaveResponse.Data) ((BaseResponse) obj).data).success) {
            ((InterfaceC211900rl) c516201zk.l0).LLJJIJIL();
        }
        C1C7U.LIZIZ("GiftRepository@13a6.saveFavoriteGift$1");
    }

    public static final void accept$249(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GiftRepository@13a6.saveFavoriteGift$2");
        ((InterfaceC211900rl) c516201zk.l0).LLJJIJIL();
        C1C7U.LIZIZ("GiftRepository@13a6.saveFavoriteGift$2");
    }

    public static final void accept$25(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PopupActionProcessHelper@132b.doEdmSubscribe$disposable$2");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateEdmSubscribeStatus(1) - error: ");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW((Activity) c516201zk.l0, 24));
        C1C7U.LIZIZ("PopupActionProcessHelper@132b.doEdmSubscribe$disposable$2");
    }

    public static final void accept$250(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("RecommendGiftWrapper@7109.getRealTimeRecommendGift$dispose$2");
        ((C012H) c516201zk.l0).LJII.LIZ = null;
        C1C7U.LIZIZ("RecommendGiftWrapper@7109.getRealTimeRecommendGift$dispose$2");
    }

    public static final void accept$251(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuardianAutographPresenter@8ef9.loadSavedAutograph$2");
        C20441214yg.LJFF("GuardianAutographPresenter", "queryGuardianAutograph: request failed", (Throwable) obj);
        ((Function1) c516201zk.l0).invoke(null);
        C1C7U.LIZIZ("GuardianAutographPresenter@8ef9.loadSavedAutograph$2");
    }

    public static final void accept$252(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PoiServiceImpl@62a1.getPoiDynamicShareInfo$1");
        PoiDetailApi.PoiShareMessageResponse poiShareMessageResponse = (PoiDetailApi.PoiShareMessageResponse) obj;
        if (poiShareMessageResponse.status_code == 0) {
            Function1 function1 = (Function1) c516201zk.l0;
            String contentPb = poiShareMessageResponse.getContentPb();
            if (contentPb == null) {
                contentPb = "";
            }
            function1.invoke(contentPb);
        }
        C1C7U.LIZIZ("PoiServiceImpl@62a1.getPoiDynamicShareInfo$1");
    }

    public static final void accept$253(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PoiServiceImpl@62a1.isReviewEligible$2");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchEligible - ");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        C1C7U.LIZIZ("PoiServiceImpl@62a1.isReviewEligible$2");
    }

    public static final void accept$254(C516201zk c516201zk, Object obj) {
        Function1 function1;
        C1C7U.LIZ("FollowUtil@2770.doFollow$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C501470JlZ) {
            C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
        } else {
            C766270U4b.LIZLLL(2131853482);
        }
        if (th != null && (function1 = (Function1) c516201zk.l0) != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("FollowUtil@2770.doFollow$2");
    }

    public static final void accept$255(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("FollowUtil@2770.observeFollowStateChangeEvent$3");
        C257100z3 c257100z3 = (C257100z3) obj;
        User userLIZJ = ((InterfaceC434201mW) c516201zk.l0).LIZJ();
        if (userLIZJ != null) {
            userLIZJ.setFollowStatus(c257100z3.LIZ.followStatus);
        }
        if (c257100z3.LIZ.LIZIZ()) {
            ((InterfaceC434201mW) c516201zk.l0).LIZ();
        } else {
            ((InterfaceC434201mW) c516201zk.l0).LIZIZ();
        }
        C1C7U.LIZIZ("FollowUtil@2770.observeFollowStateChangeEvent$3");
    }

    public static final void accept$256(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GameCreateInfoManager@c493.queryGameCreateInfo$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("throwable=");
        sbLIZ.append(th.getClass().getName());
        sbLIZ.append(", message");
        sbLIZ.append(th.getMessage());
        C163900k1.LIZ(-888888, C2188811AlT.LIZIZ(sbLIZ), false);
        ((DataChannel) c516201zk.l0).zW(GameFirstGoLiveTs.class, -2L);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onError. message: ");
        sbLIZ2.append(th.getMessage());
        C20441214yg.LJ("GameCreateInfoManager", C2188811AlT.LIZIZ(sbLIZ2));
        C1C7U.LIZIZ("GameCreateInfoManager@c493.queryGameCreateInfo$2");
    }

    public static final void accept$257(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("TemplateFetcher@4ce9.requestMergedTemplateDetail$2");
        String message = ((Throwable) obj).getMessage();
        if (message != null) {
            ((Function1) c516201zk.l0).invoke(message);
        }
        C1C7U.LIZIZ("TemplateFetcher@4ce9.requestMergedTemplateDetail$2");
    }

    public static final void accept$258(C516201zk c516201zk, Object obj) {
        Function2 function2;
        C1C7U.LIZ("TemplateFetcher@4ce9.requestTemplateDetail$4");
        String message = ((Throwable) obj).getMessage();
        if (message != null && (function2 = (Function2) c516201zk.l0) != null) {
            function2.invoke(message, "");
        }
        C1C7U.LIZIZ("TemplateFetcher@4ce9.requestTemplateDetail$4");
    }

    public static final void accept$259(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.obtainMultiTabPureListView$core$1$4");
        ((C1640830snh) c516201zk.l0).LJJIIZI.onNext(new Pair(obj, Boolean.TRUE));
        C1C7U.LIZIZ("InfoStickerView@d31b.obtainMultiTabPureListView$core$1$4");
    }

    public static final void accept$26(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("VideoPrivacySettingManager@a1d1.getVideoPrivacySettingRestriction$2");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("VideoPrivacySettingManager@a1d1.getVideoPrivacySettingRestriction$2");
    }

    public static final void accept$260(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initRecentListView$2$5");
        ((C1640830snh) c516201zk.l0).LJJIIZI.onNext(new Pair(obj, Boolean.FALSE));
        C1C7U.LIZIZ("InfoStickerView@d31b.initRecentListView$2$5");
    }

    public static final void accept$261(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.obtainMultiTabPureListView$core$1$5");
        ((C1640830snh) c516201zk.l0).LJJIIZI.onNext(new Pair(obj, Boolean.FALSE));
        C1C7U.LIZIZ("InfoStickerView@d31b.obtainMultiTabPureListView$core$1$5");
    }

    public static final void accept$262(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initRecommendCategoryListView$2$5");
        ((C1640830snh) c516201zk.l0).LJJIIZI.onNext(new Pair(obj, Boolean.FALSE));
        C1C7U.LIZIZ("InfoStickerView@d31b.initRecommendCategoryListView$2$5");
    }

    public static final void accept$263(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initEmojiListView$1$4");
        ((C1640830snh) c516201zk.l0).LJJIIZI.onNext(new Pair(obj, Boolean.TRUE));
        C1C7U.LIZIZ("InfoStickerView@d31b.initEmojiListView$1$4");
    }

    public static final void accept$264(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initEmojiListView$1$5");
        ((C1640830snh) c516201zk.l0).LJJIIZI.onNext(new Pair(obj, Boolean.FALSE));
        C1C7U.LIZIZ("InfoStickerView@d31b.initEmojiListView$1$5");
    }

    public static final void accept$265(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initMainPager$1$1");
        Pair pair = (Pair) obj;
        ((C1640830snh) c516201zk.l0).LJJIIJZLJL.onNext(new Pair(pair.getFirst(), Integer.valueOf(((Number) pair.getSecond()).intValue())));
        C1C7U.LIZIZ("InfoStickerView@d31b.initMainPager$1$1");
    }

    public static final void accept$266(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initStickerListView$5");
        ((C1640830snh) c516201zk.l0).LJJIIZI.onNext(new Pair(obj, Boolean.FALSE));
        C1C7U.LIZIZ("InfoStickerView@d31b.initStickerListView$5");
    }

    public static final void accept$267(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initProviderListView$1$3");
        ((C1640830snh) c516201zk.l0).LJJIJ.onNext(new Pair(obj, Boolean.TRUE));
        C1C7U.LIZIZ("InfoStickerView@d31b.initProviderListView$1$3");
    }

    public static final void accept$268(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InfoStickerView@d31b.initProviderListView$1$4");
        ((C1640830snh) c516201zk.l0).LJJIJ.onNext(new Pair(obj, Boolean.FALSE));
        C1C7U.LIZIZ("InfoStickerView@d31b.initProviderListView$1$4");
    }

    public static final void accept$269(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$3");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("WeakNetOptUtilsKt@9a83.delayReturnWhenError$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$27(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestCountDownHistoryDialog@31ff.getCountDownHistory$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        MultiGuestCountDownHistoryDialog multiGuestCountDownHistoryDialog = (MultiGuestCountDownHistoryDialog) c516201zk.l0;
        C16FZ c16fz = multiGuestCountDownHistoryDialog.LLILLJJLI;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, false);
        }
        RunnableC781530UlD runnableC781530UlD = multiGuestCountDownHistoryDialog.LL;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, true);
        }
        View view = multiGuestCountDownHistoryDialog.LLILLL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
        RunnableC781530UlD runnableC781530UlD2 = ((MultiGuestCountDownHistoryDialog) c516201zk.l0).LL;
        if (runnableC781530UlD2 != null) {
            C1117360fBO c1117360fBO = new C1117360fBO();
            c1117360fBO.LLLI(UserCountdownRecord.class, new C0J8P<UserCountdownRecord, C308101Hj>() { // from class: X.01Hg
                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, UserCountdownRecord userCountdownRecord) {
                    String strLJIJI;
                    C308101Hj c308101Hj = (C308101Hj) viewHolder;
                    UserCountdownRecord userCountdownRecord2 = userCountdownRecord;
                    C12ES.LJIILL(0, (View) c308101Hj.LL.getValue());
                    ((TextView) c308101Hj.LL.getValue()).setText(String.valueOf(C256800z0.LIZIZ(userCountdownRecord2)));
                    ((TextView) c308101Hj.LLILLJJLI.getValue()).setText(C256800z0.LIZ(userCountdownRecord2, ((View) c308101Hj.LLILLJJLI.getValue()).getContext()));
                    TextView textView = (TextView) c308101Hj.LLILLL.getValue();
                    if (userCountdownRecord2.achieved) {
                        strLJIJI = C497740JfY.LJIJI(2131843243);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131843247);
                    }
                    textView.setText(strLJIJI);
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C308101Hj(viewGroup);
                }
            });
            C410901il c410901il = new C410901il();
            c410901il.addAll(((CountdownGetUserHistoryResponse.ResponseData) baseResponse.data).records);
            c1117360fBO.LL = c410901il;
            runnableC781530UlD2.setAdapter(c1117360fBO);
        }
        int size = ((CountdownGetUserHistoryResponse.ResponseData) baseResponse.data).records.size();
        List<UserCountdownRecord> list = ((CountdownGetUserHistoryResponse.ResponseData) baseResponse.data).records;
        ArrayList arrayList = new ArrayList();
        for (UserCountdownRecord userCountdownRecord : list) {
            if (userCountdownRecord.achieved) {
                arrayList.add(userCountdownRecord);
            }
        }
        int size2 = arrayList.size();
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("user_type", C917520Zz4.LJIILL(UserService.getInstance().user().LJIJJLI()));
        map.put("countdown_cnt", String.valueOf(size));
        map.put("countdown_achieve_cnt", String.valueOf(size2));
        C0KX4.LIZ("livesdk_guest_countdown_history_show", map, null, true);
        C1C7U.LIZIZ("MultiGuestCountDownHistoryDialog@31ff.getCountDownHistory$2");
    }

    public static final void accept$270(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LayoutSettingRepository@176a.switchLayoutInternal$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchLayout error, error message: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("LayoutSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("LayoutSettingRepository@176a.switchLayoutInternal$2");
    }

    public static final void accept$271(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.getCreateInfo$2");
        Throwable th = (Throwable) obj;
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c516201zk.l0;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.getCreateInfo$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$272(C516201zk c516201zk, Object obj) {
        String strLJJIIZI;
        C1C7U.LIZ("PlaybookEditorModel@872e.publish$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publish success, playbook_id = ");
            Playbook playbook = ((PlaybookPublishResponse.ResponseData) c470590Icr.data).playbook;
            if (playbook != null) {
                strLJJIIZI = PlaybookUtilKt.LJJIIZI(playbook);
            } else {
                strLJJIIZI = null;
            }
            sbLIZ.append(strLJJIIZI);
            C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
            C403501hZ.LIZ(AnonymousClass0206.get$arr$(419));
            ((C20377814oS) c516201zk.l0).LIZ.FQ2(RefreshPlaybookListEvent.class);
        }
        C1C7U.LIZIZ("PlaybookEditorModel@872e.publish$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$273(C516201zk c516201zk, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.publishPlaybook$publishPlaybook$1$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        Playbook playbook = ((PlaybookPublishResponse.ResponseData) baseResponse.data).playbook;
        if (playbook != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        C20374514nv.LJIIIIZZ(0, "publishPlaybook", "success", String.valueOf(lValueOf), null);
        ((InterfaceC170900l9) c516201zk.l0).LIZ(((PlaybookPublishResponse.ResponseData) baseResponse.data).playbook);
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.publishPlaybook$publishPlaybook$1$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$274(C516201zk c516201zk, Object obj) {
        String strLJJIIZI;
        C1C7U.LIZ("PlaybookEditorModel@872e.republish$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("republish success, result = ");
            Playbook playbook = ((PlaybookRepublishResponse.ResponseData) c470590Icr.data).playbook;
            if (playbook != null) {
                strLJJIIZI = PlaybookUtilKt.LJJIIZI(playbook);
            } else {
                strLJJIIZI = null;
            }
            sbLIZ.append(strLJJIIZI);
            C1AZW.LJIIJ(12, "Editor_PlaybookEditorModel", C2188811AlT.LIZIZ(sbLIZ), null, null);
            ((C20377814oS) c516201zk.l0).LIZ.FQ2(RefreshPlaybookListEvent.class);
        }
        C1C7U.LIZIZ("PlaybookEditorModel@872e.republish$2");
    }

    public static final void accept$275(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.publishPlaybook$publishPlaybook$1$3");
        Throwable th = (Throwable) obj;
        C20374514nv.LJIIIIZZ(-2, "publishPlaybook", "error", String.valueOf(th.getMessage()), th);
        ((InterfaceC170900l9) c516201zk.l0).onFailed(th);
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.publishPlaybook$publishPlaybook$1$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$276(C516201zk c516201zk, Object obj) {
        Long lValueOf;
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.republishPlaybook$republishPlaybook$1$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        Playbook playbook = ((PlaybookRepublishResponse.ResponseData) baseResponse.data).playbook;
        if (playbook != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        } else {
            lValueOf = null;
        }
        C20374514nv.LJIIIIZZ(0, "republishPlaybook", "success", String.valueOf(lValueOf), null);
        ((InterfaceC170900l9) c516201zk.l0).LIZ(((PlaybookRepublishResponse.ResponseData) baseResponse.data).playbook);
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.republishPlaybook$republishPlaybook$1$2");
    }

    public static final void accept$277(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.republishPlaybook$republishPlaybook$1$3");
        Throwable th = (Throwable) obj;
        C20374514nv.LJIIIIZZ(-2, "republishPlaybook", "error", String.valueOf(th.getMessage()), th);
        ((InterfaceC170900l9) c516201zk.l0).onFailed(th);
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.republishPlaybook$republishPlaybook$1$3");
    }

    public static final void accept$278(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PlaybookEditorUtilsKt@e840.quickRePublishRequest$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quickPublish onError, error=");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJIIIZ("quickPublish", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC170900l9 interfaceC170900l9 = (InterfaceC170900l9) c516201zk.l0;
        if (interfaceC170900l9 != null) {
            interfaceC170900l9.onFailed(th);
        }
        C1C7U.LIZIZ("PlaybookEditorUtilsKt@e840.quickRePublishRequest$2");
    }

    public static final void accept$279(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiTopLiveDataManagerKt@596c.await$2$disposable$1");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
        C1C7U.LIZIZ("MultiTopLiveDataManagerKt@596c.await$2$disposable$1");
    }

    public static final void accept$28(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiGuestCountDownHistoryDialog@31ff.getCountDownHistory$3");
        MultiGuestCountDownHistoryDialog multiGuestCountDownHistoryDialog = (MultiGuestCountDownHistoryDialog) c516201zk.l0;
        C16FZ c16fz = multiGuestCountDownHistoryDialog.LLILLJJLI;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, false);
        }
        RunnableC781530UlD runnableC781530UlD = multiGuestCountDownHistoryDialog.LL;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, false);
        }
        View view = multiGuestCountDownHistoryDialog.LLILLL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, true);
        }
        C1C7U.LIZIZ("MultiGuestCountDownHistoryDialog@31ff.getCountDownHistory$3");
    }

    public static final void accept$280(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiTopLiveDataManagerKt@596c.await$2$disposable$2");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C1C7U.LIZIZ("MultiTopLiveDataManagerKt@596c.await$2$disposable$2");
    }

    public static final void accept$281(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AddYoursAvatarHelper@2b20.getWholeStickerStruct$2");
        ((Function2) c516201zk.l0).invoke(null, Boolean.FALSE);
        C1C7U.LIZIZ("AddYoursAvatarHelper@2b20.getWholeStickerStruct$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$282(C516201zk c516201zk, Object obj) {
        List<Playbook> list;
        C1C7U.LIZ("MatchFriendRankPlaybookFetcher@61a0.ensurePlaybookReady$1");
        BattlePlaybookInfoResponse.ResponseData responseData = (BattlePlaybookInfoResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData == null || (list = responseData.matchPlaybooks) == null) {
            list = C13BV.INSTANCE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch friend rank playbook success, size = ");
        sbLIZ.append(list.size());
        C20441214yg.LIZIZ("MatchFriendRankPlaybookFetcher", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF != null) {
            interfaceC975870bVBLJFF.LJIIIIZZ(list);
        }
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("MatchFriendRankPlaybookFetcher@61a0.ensurePlaybookReady$1");
    }

    public static final void accept$283(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MatchFriendRankPlaybookFetcher@61a0.ensurePlaybookReady$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch friend rank playbook failed: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJ("MatchFriendRankPlaybookFetcher", C2188811AlT.LIZIZ(sbLIZ));
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("MatchFriendRankPlaybookFetcher@61a0.ensurePlaybookReady$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$284(C516201zk c516201zk, Object obj) {
        String str;
        Playbook playbook;
        PlaybookContent playbookContent;
        C1C7U.LIZ("MatchRecommendedPlaybookRepo@923f.getFlowStr$1");
        Function1 function1 = (Function1) c516201zk.l0;
        PlaybookPopulateResponse.ResponseData responseData = (PlaybookPopulateResponse.ResponseData) ((BaseResponse) obj).data;
        if (responseData != null && (playbook = responseData.playbook) != null && (playbookContent = playbook.content) != null) {
            str = playbookContent.flowStr;
        } else {
            str = null;
        }
        function1.invoke(str);
        C1C7U.LIZIZ("MatchRecommendedPlaybookRepo@923f.getFlowStr$1");
    }

    public static final void accept$285(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PhotoTemplateRepo@4654.fetchItemAsset$1$3$onSuccess$2");
        ((InterfaceC2329309At) c516201zk.l0).onSuccess(obj);
        C1C7U.LIZIZ("PhotoTemplateRepo@4654.fetchItemAsset$1$3$onSuccess$2");
    }

    public static final void accept$286(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PhotoTemplateRepo@4654.fetchItemAsset$1$3$onSuccess$3");
        ((InterfaceC2329309At) c516201zk.l0).onError((Throwable) obj);
        C1C7U.LIZIZ("PhotoTemplateRepo@4654.fetchItemAsset$1$3$onSuccess$3");
    }

    public static final void accept$287(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("StoryGuideCardFilterPanelComponentA2@d7ef.reportDislikeGuideCard$1");
        C287210BNn.LIZLLL.storeLong("key_dislike_time_stamp", System.currentTimeMillis());
        ((StoryGuideCardFilterPanelComponentA2) c516201zk.l0).m324do(true);
        C1C7U.LIZIZ("StoryGuideCardFilterPanelComponentA2@d7ef.reportDislikeGuideCard$1");
    }

    public static final void accept$288(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PreviewSeeMoreDetailWidget@f1d1.setMonitorBtn$1$1$3");
        Throwable th = (Throwable) obj;
        DialogC780480UjW dialogC780480UjW = ((PreviewSeeMoreDetailWidget) c516201zk.l0).LLJIJIL;
        if (dialogC780480UjW != null) {
            C500260Jjc.LJJLIIIJL(dialogC780480UjW);
        }
        View view = ((PreviewSeeMoreDetailWidget) c516201zk.l0).getView();
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.00kP
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PreviewSeeMoreDetailWidget@f1d1.setMonitorBtn$1$1$3$1");
                    try {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842705));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PreviewSeeMoreDetailWidget@f1d1.setMonitorBtn$1$1$3$1");
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error = ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJIIIZ("PreviewSeeMoreDetailWidget", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("PreviewSeeMoreDetailWidget@f1d1.setMonitorBtn$1$1$3");
    }

    public static final void accept$289(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DonationStickerJsEventSubscriber@9cf1.observeEvent$3");
        List<HostBoard> list = ((C201100q1) obj).LIZ;
        C261600zm c261600zm = (C261600zm) c516201zk.l0;
        Iterator<HostBoard> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            HostBoard next = it2.next();
            if (Intrinsics.LJFF(next.boardId, c261600zm.LLILZ)) {
                if (next != null) {
                    ((C261600zm) c516201zk.l0).LJI();
                    C261600zm c261600zm2 = (C261600zm) c516201zk.l0;
                    c261600zm2.LLILZ = "";
                    c261600zm2.LLILLL = "";
                    DataChannel dataChannel = c261600zm2.LL;
                    if (dataChannel != null) {
                        dataChannel.LC0(DonationBoardVisibleEvent.class, Boolean.FALSE);
                    }
                }
            }
        }
        C1C7U.LIZIZ("DonationStickerJsEventSubscriber@9cf1.observeEvent$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$29(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowLeaveRankDialog@2465.showRankUserList$1$1$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        LiveShowLeaveRankDialog liveShowLeaveRankDialog = (LiveShowLeaveRankDialog) c516201zk.l0;
        C16FZ c16fz = liveShowLeaveRankDialog.LL;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, false);
        }
        RunnableC781530UlD runnableC781530UlD = liveShowLeaveRankDialog.LLILZ;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, true);
        }
        View view = liveShowLeaveRankDialog.LLILLJJLI;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
        View view2 = liveShowLeaveRankDialog.LLILLL;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, false);
        }
        RunnableC781530UlD runnableC781530UlD2 = ((LiveShowLeaveRankDialog) c516201zk.l0).LLILZ;
        if (runnableC781530UlD2 != null) {
            C1117360fBO c1117360fBO = new C1117360fBO();
            LiveShowLeaveRankDialog liveShowLeaveRankDialog2 = (LiveShowLeaveRankDialog) c516201zk.l0;
            c1117360fBO.LLLI(C307501Hd.class, new C0J8P<C307501Hd, C432301mD>() { // from class: X.01mA
                @Override // X.C0J8P
                public final void LIZJ(RecyclerView.ViewHolder viewHolder, C307501Hd c307501Hd) {
                    String strLJII;
                    C432301mD c432301mD = (C432301mD) viewHolder;
                    String str = c307501Hd.LIZ;
                    if (C1533950q1J.LJ(str)) {
                        ((TextView) c432301mD.LL.getValue()).setText(str);
                    }
                    MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                    if (multiGuestDataHolder != null) {
                        strLJII = multiGuestDataHolder.LJII();
                    } else {
                        strLJII = null;
                    }
                    if (strLJII != null) {
                        C1324610kZf url = C1819620xS4.LIZ().setUrl(strLJII);
                        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                            url.LJIIJJI = C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432301mD.itemView.getContext(), Integer.valueOf(c432301mD.I5().getWidth()), Integer.valueOf(c432301mD.I5().getHeight()));
                        } else {
                            url.LJIIIZ = R.drawable.emi;
                        }
                        url.LJIIL = new C987120bnK(7);
                        url.LJJI(c432301mD.I5());
                        return;
                    }
                    if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                        C1126540fQC c1126540fQCI5 = c432301mD.I5();
                        if (c1126540fQCI5 == null) {
                            return;
                        }
                        c1126540fQCI5.setImageDrawable(C930540aK4.LJJJJI(R.raw.icon_color_polygon_circle, c432301mD.itemView.getContext(), Integer.valueOf(c432301mD.I5().getWidth()), Integer.valueOf(c432301mD.I5().getHeight())));
                        return;
                    }
                    C1126540fQC c1126540fQCI52 = c432301mD.I5();
                    if (c1126540fQCI52 == null) {
                        return;
                    }
                    c1126540fQCI52.setActualImageResource(R.drawable.emi);
                }

                @Override // X.C0J8P
                /* JADX INFO: renamed from: LJ */
                public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    return new C432301mD(viewGroup);
                }
            });
            c1117360fBO.LLLI(GetShowRankResponse.ShowRankUser.class, new C15C4(liveShowLeaveRankDialog2.getContext()));
            C410901il c410901il = new C410901il();
            c410901il.add(new C307501Hd(0));
            c410901il.addAll(((GetShowRankResponse.ResponseData) baseResponse.data).showRankUsers);
            c1117360fBO.LL = c410901il;
            runnableC781530UlD2.setAdapter(c1117360fBO);
        }
        C1C7U.LIZIZ("LiveShowLeaveRankDialog@2465.showRankUserList$1$1$1$1");
    }

    public static final void accept$290(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DesignatedGiftRepository@4e7c.fetchAvailableGifts$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to fetch gifts with, error: ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJ("DesignatedGiftRepository", C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) c516201zk.l0).invoke(th);
        C1C7U.LIZIZ("DesignatedGiftRepository@4e7c.fetchAvailableGifts$2");
    }

    public static final void accept$291(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("UnbindUtils@e995.sendPhoneCode$1");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("UnbindUtils@e995.sendPhoneCode$1");
    }

    public static final void accept$292(C516201zk c516201zk, Object obj) {
        String message;
        C1C7U.LIZ("RankListUserViewBinder@be03.observeFollowStateChange$5");
        Throwable th = (Throwable) obj;
        ((C15C3) c516201zk.l0).getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_RankListUserViewBinder_");
        sbLIZ.append(456);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        C1AZW.LJFF(strLIZIZ, "throwable occurs:", message, null);
        C1C7U.LIZIZ("RankListUserViewBinder@be03.observeFollowStateChange$5");
    }

    public static final void accept$293(C516201zk c516201zk, Object obj) {
        FanTicketRanklistResponse.ResponseData responseData;
        List<FanTicketRanklistResponse.RanklistUser> list;
        C1C7U.LIZ("MultiGuestGiftContributeRankPresenter@6828.getRankUserListData$1");
        FanTicketRanklistResponse fanTicketRanklistResponse = (FanTicketRanklistResponse) obj;
        FanTicketRanklistResponse.ResponseData responseData2 = fanTicketRanklistResponse.data;
        if ((responseData2 != null && responseData2.ranklistUsers != null && responseData2 != null && (list = responseData2.ranklistUsers) != null && (!list.isEmpty())) || ((responseData = fanTicketRanklistResponse.data) != null && responseData.countdownInfo != null)) {
            ((InterfaceC058300Jh) c516201zk.l0).YD(fanTicketRanklistResponse);
        } else {
            ((InterfaceC058300Jh) c516201zk.l0).S6();
        }
        C1C7U.LIZIZ("MultiGuestGiftContributeRankPresenter@6828.getRankUserListData$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$294(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseTextHeaderModel@7171.requestGetPlayContent$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            ((AbstractC301401Eu) c516201zk.l0).LJII(((TextHeaderPlayGetContentResponse.ResponseData) c470590Icr.data).textHeaderContent, "requestGetPlayContent");
        }
        C1C7U.LIZIZ("BaseTextHeaderModel@7171.requestGetPlayContent$1");
    }

    public static final void accept$295(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseTextHeaderViewModel@d64a.getRecord$3");
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(obj);
        }
        C1C7U.LIZIZ("BaseTextHeaderViewModel@d64a.getRecord$3");
    }

    public static final void accept$296(C516201zk c516201zk, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("CreatorCaptionEditViewModel@caba.submitCaptions$1$disposable$1");
        com.ss.android.ugc.aweme.base.api.BaseResponse baseResponse = (com.ss.android.ugc.aweme.base.api.BaseResponse) obj;
        Function1 function1 = (Function1) c516201zk.l0;
        if (baseResponse != null) {
            numValueOf = Integer.valueOf(baseResponse.status_code);
        } else {
            numValueOf = null;
        }
        function1.invoke(numValueOf);
        C1C7U.LIZIZ("CreatorCaptionEditViewModel@caba.submitCaptions$1$disposable$1");
    }

    public static final void accept$297(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ReferralFeedUtils@824f.unzipGifLottie$2");
        File file = (File) obj;
        if (file != null && file.exists()) {
            ((Function1) c516201zk.l0).invoke(file);
        }
        C1C7U.LIZIZ("ReferralFeedUtils@824f.unzipGifLottie$2");
    }

    public static final void accept$298(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("UserLevelViewModel@cee4.updateUserLevelAttr$dispose$2");
        ((Function1) c516201zk.l0).invoke(Long.valueOf(System.currentTimeMillis()));
        C1C7U.LIZIZ("UserLevelViewModel@cee4.updateUserLevelAttr$dispose$2");
    }

    public static final void accept$299(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveStreamGoalPresenter@dd38.showNextMessage$4");
        ((C2632010c) c516201zk.l0).LJII(80);
        C1C7U.LIZIZ("LiveStreamGoalPresenter@dd38.showNextMessage$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(C516201zk c516201zk, Object obj) {
        GetFanTicketContentResponse.ResponseData responseData;
        LinkMicFanTicketMethod linkMicFanTicketMethod;
        FanTicketRoomNoticeContent fanTicketRoomNoticeContent;
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.requestFanTicketContent$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (GetFanTicketContentResponse.ResponseData) c470590Icr.data) != null && (linkMicFanTicketMethod = responseData.fanTicketMethod) != null && (fanTicketRoomNoticeContent = linkMicFanTicketMethod.fanTicketRoomNotice) != null) {
            C01IS c01is = (C01IS) c516201zk.l0;
            c01is.LIZ(fanTicketRoomNoticeContent);
            DataChannel dataChannel = c01is.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(TicketContentUpdateEvent.class, fanTicketRoomNoticeContent);
            }
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.requestFanTicketContent$2");
    }

    public static final void accept$30(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowLeaveRankDialog@2465.showRankUserList$1$1$1$2");
        LiveShowLeaveRankDialog liveShowLeaveRankDialog = (LiveShowLeaveRankDialog) c516201zk.l0;
        C16FZ c16fz = liveShowLeaveRankDialog.LL;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, false);
        }
        RunnableC781530UlD runnableC781530UlD = liveShowLeaveRankDialog.LLILZ;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, false);
        }
        View view = liveShowLeaveRankDialog.LLILLJJLI;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
        View view2 = liveShowLeaveRankDialog.LLILLL;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, true);
        }
        C1C7U.LIZIZ("LiveShowLeaveRankDialog@2465.showRankUserList$1$1$1$2");
    }

    public static final void accept$300(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BoardCcToggleUtil@183a.updateToggle$1");
        C197600pS.LIZ().fV1((CommercialContentToggle) c516201zk.l0);
        C1C7U.LIZIZ("BoardCcToggleUtil@183a.updateToggle$1");
    }

    public static final void accept$301(C516201zk c516201zk, Object obj) {
        Function1 function1 = (Function1) c516201zk.l0;
        C1C7U.LIZ("IAnrUploadApi$Companion@d94e.reportAnr$1L");
        function1.invoke(obj);
        C1C7U.LIZIZ("IAnrUploadApi$Companion@d94e.reportAnr$1L");
    }

    public static final void accept$302(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AltLoginForFailed3PHelper@b8fa.validateCodeForAltLogin$1");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("AltLoginForFailed3PHelper@b8fa.validateCodeForAltLogin$1");
    }

    public static final void accept$303(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AltLoginForFailed3PHelper@b8fa.validateCodeForAltLogin$2");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("AltLoginForFailed3PHelper@b8fa.validateCodeForAltLogin$2");
    }

    public static final void accept$304(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ScrollHandleConfiguration@13e2.getLiveVideoFrame$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        ((Function2) c516201zk.l0).invoke(baseResponse.data, Integer.valueOf(baseResponse.statusCode));
        C1C7U.LIZIZ("ScrollHandleConfiguration@13e2.getLiveVideoFrame$1");
    }

    public static final void accept$305(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.endBoard$2");
        ((Function1) c516201zk.l0).invoke(Boolean.TRUE);
        C1C7U.LIZIZ("NoticeboardUtils@5337.endBoard$2");
    }

    public static final void accept$306(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.endBoard$3");
        C953620avI.LJII((Throwable) obj);
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("NoticeboardUtils@5337.endBoard$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$307(C516201zk c516201zk, Object obj) {
        NoticeboardGetContentResponse.ResponseData responseData;
        NoticeboardContent noticeboardContent;
        C1C7U.LIZ("NoticeboardUtils@5337.getContent$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (responseData = (NoticeboardGetContentResponse.ResponseData) baseResponse.data) != null && (noticeboardContent = responseData.noticeboardContent) != null) {
            ((Function2) c516201zk.l0).invoke(noticeboardContent, "get_content");
        }
        C1C7U.LIZIZ("NoticeboardUtils@5337.getContent$2");
    }

    public static final void accept$308(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.getStubBitmap$1");
        C20441214yg.LIZIZ("NoticeboardUtils", "getStubBitmap success");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("NoticeboardUtils@5337.getStubBitmap$1");
    }

    public static final void accept$309(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.getStubBitmap$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getStubBitmap fail, ");
        sbLIZ.append(obj);
        C20441214yg.LIZIZ("NoticeboardUtils", C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) c516201zk.l0).invoke(null);
        C1C7U.LIZIZ("NoticeboardUtils@5337.getStubBitmap$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$31(C516201zk c516201zk, Object obj) {
        List<GuestInvitePanelResp.ListUser> list;
        C1C7U.LIZ("GuestInviteViewModel@bc2f.fetchGuestInvitePanelData$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            GuestInvitePanelResp.ResponseData responseData = (GuestInvitePanelResp.ResponseData) c470590Icr.data;
            List<GuestInvitePanelResp.ListUser> list2 = null;
            if (responseData != null) {
                list = responseData.guestInviteFriends;
                list2 = responseData.guestInviteSuggestUsers;
            } else {
                list = null;
            }
            String str = c470590Icr.LIZIZ;
            if (str == null) {
                str = "";
            }
            ((Function1) c516201zk.l0).invoke(new C00SI(list, list2, str));
        }
        C1C7U.LIZIZ("GuestInviteViewModel@bc2f.fetchGuestInvitePanelData$1");
    }

    public static final void accept$310(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.updateBoardPosition$2");
        ((Function1) c516201zk.l0).invoke(Boolean.TRUE);
        C1C7U.LIZIZ("NoticeboardUtils@5337.updateBoardPosition$2");
    }

    public static final void accept$311(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.updateBoardPosition$3");
        C953620avI.LJII((Throwable) obj);
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("NoticeboardUtils@5337.updateBoardPosition$3");
    }

    public static final void accept$312(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ProgrammedLiveFollowCardWidget@cec8.follow$1$1$1");
        ((User) c516201zk.l0).setFollowStatus(((FollowPair) obj).followStatus);
        C1C7U.LIZIZ("ProgrammedLiveFollowCardWidget@cec8.follow$1$1$1");
    }

    public static final void accept$313(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ProgrammedLiveFollowCardWidget@cec8.follow$1$1$3");
        ((User) c516201zk.l0).setFollowStatus(((FollowPair) obj).followStatus);
        C1C7U.LIZIZ("ProgrammedLiveFollowCardWidget@cec8.follow$1$1$3");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.ref.WeakReference] */
    public static final void accept$314(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("RootPageImpl@f0fe.monitorNextPageStayMs$1");
        C813430VvZ c813430VvZ = (C813430VvZ) obj;
        C259800zU c259800zU = (C259800zU) c516201zk.l0;
        if (c259800zU.element == 0) {
            c259800zU.element = new WeakReference(c813430VvZ.LIZ);
        }
        C1C7U.LIZIZ("RootPageImpl@f0fe.monitorNextPageStayMs$1");
    }

    public static final void accept$315(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CancelZoomMoreInterceptor@4230.updateSettings$2");
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("CancelZoomMoreInterceptor@4230.updateSettings$2");
    }

    public static final void accept$316(C516201zk c516201zk, Object obj) {
        LinkStateMessage linkStateMessage = (LinkStateMessage) c516201zk.l0;
        if (obj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendMessageAckRx Success ");
            sbLIZ.append(linkStateMessage.getMessageId());
            C919310a1x.LIZ("sendMessageAckRx", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void accept$317(C516201zk c516201zk, Object obj) {
        LinkStateMessage linkStateMessage = (LinkStateMessage) c516201zk.l0;
        Throwable th = (Throwable) obj;
        if (th != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendMessageAckRx failed ");
            sbLIZ.append(linkStateMessage.getMessageId());
            sbLIZ.append(" for ");
            sbLIZ.append(th.getMessage());
            C919310a1x.LIZ("sendMessageAckRx", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void accept$318(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LikeEffectServiceImpl@2a22.initAppQuitDel$subscribe$1");
        LikeEffectServiceImpl likeEffectServiceImpl = (LikeEffectServiceImpl) c516201zk.l0;
        if (likeEffectServiceImpl.LIZJ) {
            C23250099c.LIZLLL(likeEffectServiceImpl.LJ, null, null, new C361801aq(likeEffectServiceImpl, null), 3);
        }
        C1C7U.LIZIZ("LikeEffectServiceImpl@2a22.initAppQuitDel$subscribe$1");
    }

    public static final void accept$319(C516201zk c516201zk, Object obj) {
        long jLongValue;
        C1C7U.LIZ("GuessMessageDisplayManager@eb9f.handlePinGuideDisplay$1");
        C262300zt c262300zt = (C262300zt) c516201zk.l0;
        c262300zt.getClass();
        try {
            C0JT6<String> c0jt6 = InterfaceC772390URp.f133i0;
            String strLIZ = c0jt6.LIZ();
            if (strLIZ == null) {
                strLIZ = CardStruct.IStatusCode.DEFAULT;
            }
            Long lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            c0jt6.LIZJ(String.valueOf(jLongValue + 1));
            InterfaceC772390URp.j0.LIZJ(String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("GuessMessageDisplay", e);
        }
        if (c262300zt.LIZIZ) {
            DataChannel dataChannel = c262300zt.LIZ;
            if (dataChannel != null) {
                dataChannel.LC0(GameGuessMessageDisplayEvent.class, new C774740UaG(C497740JfY.LJIJI(2131853577), EnumC262400zu.GUESS_GUIDE_PIN.ordinal(), null, null, 10000L, 26));
            }
        } else {
            C766270U4b.LJIIIIZZ(10000L, ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopContext(), C497740JfY.LJIJI(2131853577));
        }
        C1C7U.LIZIZ("GuessMessageDisplayManager@eb9f.handlePinGuideDisplay$1");
    }

    public static final void accept$32(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestInviteViewModel@bc2f.fetchGuestInvitePanelData$2");
        C20441214yg.LJ("GuestInviteViewModel", String.valueOf(((Throwable) obj).getMessage()));
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("GuestInviteViewModel@bc2f.fetchGuestInvitePanelData$2");
    }

    public static final void accept$320(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuessMessageDisplayManager@eb9f.handleUserReqGuessMessageDisplayResult$3");
        C500260Jjc.LJJLIIIJILLIZJL(new C5182020e((C262300zt) c516201zk.l0, 619));
        C1C7U.LIZIZ("GuessMessageDisplayManager@eb9f.handleUserReqGuessMessageDisplayResult$3");
    }

    public static final void accept$321(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GameLiveGuessBoardManager@1365.abandonGuessesByRoomID$2");
        C1701940uOG.LIZIZ().LIZIZ(new RunnableC514801zW((AbandonGuessByRoomResponse) obj, (C258100zD) c516201zk.l0, 184));
        C1C7U.LIZIZ("GameLiveGuessBoardManager@1365.abandonGuessesByRoomID$2");
    }

    public static final void accept$322(C516201zk c516201zk, Object obj) {
        String str;
        GuessWidget guessWidget;
        GuessRound guessRound;
        C1C7U.LIZ("GameLiveGuessBoardManager@1365.registerBillboardClick$1$1");
        C260600zc c260600zc = (C260600zc) obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C258100zD c258100zD = (C258100zD) c516201zk.l0;
        if (jCurrentTimeMillis - c258100zD.LJIIIZ >= 500) {
            c258100zD.LJIIIZ = System.currentTimeMillis();
            if (Intrinsics.LJFF(c260600zc.LIZIZ.bizType, "game")) {
                Map<String, Object> map = C1338270kvh.LIZ;
                String str2 = c260600zc.LIZ;
                int iHashCode = str2.hashCode();
                EnumC258900zL enumC258900zL = null;
                if (iHashCode != -1289167206) {
                    if (iHashCode != 3148801) {
                        if (iHashCode == 94750088 && str2.equals("click")) {
                            C258100zD c258100zD2 = (C258100zD) c516201zk.l0;
                            if (c258100zD2.LIZ) {
                                C258100zD.LIZJ(c258100zD2, "click", "board", null, 4);
                            } else {
                                C258100zD.LIZLLL(c258100zD2, "click", "board", null, c258100zD2.LJIIJJI, 4);
                            }
                            String strValueOf = String.valueOf(System.currentTimeMillis());
                            C753430Tgz c753430Tgz = C753430Tgz.LIZ;
                            HashMap map2 = new HashMap();
                            C258100zD c258100zD3 = (C258100zD) c516201zk.l0;
                            map2.put("guess_scroll_id", "guessing");
                            map2.put("open_page_time", strValueOf);
                            if (c258100zD3.LIZ) {
                                C258200zE c258200zE = c258100zD3.LJFF;
                                if (c258200zE != null) {
                                    enumC258900zL = c258200zE.LIZJ;
                                }
                                if (enumC258900zL == EnumC258900zL.LONG_LIVING) {
                                    if (c258200zE == null || (guessWidget = c258200zE.LJIIIIZZ) == null || (guessRound = guessWidget.guessRound) == null || (str = guessRound.roundIdStr) == null) {
                                        str = "";
                                    }
                                    map2.put("current_round_id_str", str);
                                }
                            }
                            c753430Tgz.LJIILIIL("guessing_board", map2, ((C258100zD) c516201zk.l0).LIZIZ, C20642515q3.LIZ());
                        }
                    } else if (str2.equals("fold")) {
                        C258100zD c258100zD4 = (C258100zD) c516201zk.l0;
                        if (c258100zD4.LIZ) {
                            C258100zD.LIZJ(c258100zD4, "click", "fold", null, 4);
                        } else {
                            C258100zD.LIZLLL(c258100zD4, "click", "fold", null, c258100zD4.LJIIJJI, 4);
                        }
                    }
                } else if (str2.equals("expand")) {
                    C258100zD c258100zD5 = (C258100zD) c516201zk.l0;
                    if (c258100zD5.LIZ) {
                        C258100zD.LIZJ(c258100zD5, "click", "expand", null, 4);
                    } else {
                        C258100zD.LIZLLL(c258100zD5, "click", "expand", null, c258100zD5.LJIIJJI, 4);
                    }
                }
            }
        }
        C1C7U.LIZIZ("GameLiveGuessBoardManager@1365.registerBillboardClick$1$1");
    }

    public static final void accept$323(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GameLiveGuessBoardManager@1365.registerBillboardDelete$1$1");
        List<HostBoard> list = ((C260100zX) obj).LIZ;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<HostBoard> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                HostBoard next = it2.next();
                if (Intrinsics.LJFF(next.bizType, "game") && Intrinsics.LJFF(next.subBizType, "game_guess") && Intrinsics.LJFF(next.boardId, "game_guess")) {
                    Map<String, Object> map = C1338270kvh.LIZ;
                    C258100zD c258100zD = (C258100zD) c516201zk.l0;
                    Long lValueOf = null;
                    if (c258100zD.LIZ) {
                        C258100zD.LIZJ(c258100zD, "drag", null, null, 6);
                    }
                    C11JF c11jf = ((C258100zD) c516201zk.l0).LJI;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    C258100zD c258100zD2 = (C258100zD) c516201zk.l0;
                    c258100zD2.LJII = true;
                    c258100zD2.LIZJ = "INVALID";
                    if (c258100zD2.LIZ) {
                        DataChannel dataChannel = c258100zD2.LIZIZ;
                        if (dataChannel != null) {
                            lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
                        }
                        String strValueOf = String.valueOf(lValueOf);
                        if (C500260Jjc.LJJIIZ(strValueOf)) {
                            C480460Ism.LIZ().getClass();
                            GameRevenueRetrofitApi gameRevenueRetrofitApi = (GameRevenueRetrofitApi) C480460Ism.LIZLLL(GameRevenueRetrofitApi.class);
                            AbandonGuessByRoomRequest abandonGuessByRoomRequest = new AbandonGuessByRoomRequest();
                            abandonGuessByRoomRequest.roomIdStr = strValueOf;
                            gameRevenueRetrofitApi.abandonGuessesByRoomID(abandonGuessByRoomRequest).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C516201zk(c258100zD2, 321), new C09JN() { // from class: X.00xO
                                @Override // X.C09JN
                                public final void accept(Object obj2) {
                                    C1C7U.LIZ("GameLiveGuessBoardManager@1365.abandonGuessesByRoomID$3");
                                    C1701940uOG.LIZIZ().LIZIZ(new Runnable((Throwable) obj2) { // from class: X.00kT
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("GameLiveGuessBoardManager@1365.abandonGuessesByRoomID$3$1");
                                            try {
                                                Map<String, Object> map2 = C1338270kvh.LIZ;
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("GameLiveGuessBoardManager@1365.abandonGuessesByRoomID$3$1");
                                        }
                                    });
                                    C1C7U.LIZIZ("GameLiveGuessBoardManager@1365.abandonGuessesByRoomID$3");
                                }
                            });
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("GameLiveGuessBoardManager@1365.registerBillboardDelete$1$1");
    }

    public static final void accept$324(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GameLiveGuessInfoController@64b2.reportUserRequestGuessLimit$3");
        C500260Jjc.LJJLIIIJILLIZJL(new C5182020e((C262200zs) c516201zk.l0, 622));
        C1C7U.LIZIZ("GameLiveGuessInfoController@64b2.reportUserRequestGuessLimit$3");
    }

    public static final void accept$325(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownGuestModel@726c.parseSei$1$2");
        ((C01IJ) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownGuestModel", "requestGetPlayContent successfully");
        C1C7U.LIZIZ("GuestShowdownGuestModel@726c.parseSei$1$2");
    }

    public static final void accept$326(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownGuestModel@726c.parseSei$1$3");
        ((C01IJ) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownGuestModel", "requestGetPlayContent failure");
        C1C7U.LIZIZ("GuestShowdownGuestModel@726c.parseSei$1$3");
    }

    public static final void accept$327(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DynamicCardKitViewUtils@e22a.await$2$disposable$1");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
        C1C7U.LIZIZ("DynamicCardKitViewUtils@e22a.await$2$disposable$1");
    }

    public static final void accept$328(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DynamicCardKitViewUtils@e22a.await$2$disposable$2");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C1C7U.LIZIZ("DynamicCardKitViewUtils@e22a.await$2$disposable$2");
    }

    public static final void accept$329(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BatchGuestMediaManager@7923.manageGuests$1");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("BatchGuestMediaManager@7923.manageGuests$1");
    }

    public static final void accept$33(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestInviteViewModel@bc2f.guestInvite$2");
        C20441214yg.LJ("GuestInviteViewModel", String.valueOf(((Throwable) obj).getMessage()));
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("GuestInviteViewModel@bc2f.guestInvite$2");
    }

    public static final void accept$330(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BatchGuestMediaManager@7923.manageGuests$2");
        Throwable th = (Throwable) obj;
        C20441214yg.LJFF("BatchGuestMediaManager", "manageGuests error:", th);
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            function1.invoke(message);
        }
        C1C7U.LIZIZ("BatchGuestMediaManager@7923.manageGuests$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$331(X.C516201zk r6, java.lang.Object r7) {
        /*
            java.lang.String r5 = "MultiLiveAsAnchorListDialogV2@77b0.getRecordingToGuestsStatus$1"
            X.C1C7U.LIZ(r5)
            X.0Icr r7 = (X.C470590Icr) r7
            X.0aJy r0 = X.C930480aJy.LIZ
            r0.getClass()
            boolean r0 = X.C930480aJy.LJJIFFI(r7)
            if (r0 == 0) goto L32
            java.lang.Object r4 = r6.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2 r4 = (com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2) r4
            T r0 = r7.data
            com.bytedance.android.live.liveinteract.multilive.social.model.GetAnchorSettingsResp$ResponseData r0 = (com.bytedance.android.live.liveinteract.multilive.social.model.GetAnchorSettingsResp.ResponseData) r0
            if (r0 == 0) goto L36
            int r1 = r0.shareRecordingToGuestsStatus
            r0 = 1
            if (r1 != r0) goto L36
        L21:
            r4.n = r0
            if (r0 == 0) goto L32
            X.0UX6 r3 = X.C0UX6.MULTI_GUEST_SHARE_LIVE_REPLAY_DIRECT
            androidx.lifecycle.LifecycleOwner r2 = r4.LLJILJILJ
            android.view.View r1 = r4.LLLIIIL
            if (r1 != 0) goto L2e
            r1 = 0
        L2e:
            r0 = 0
            com.bytedance.android.live.uikit.reddot.RedDotExtensionKt.LJI(r1, r2, r0, r3, r0)
        L32:
            X.C1C7U.LIZIZ(r5)
            return
        L36:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C516201zk.accept$331(X.01zk, java.lang.Object):void");
    }

    public static final void accept$332(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveAsAnchorListDialogV2@77b0.onReminderCall$1");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = (MultiLiveAsAnchorListDialogV2) c516201zk.l0;
            if (multiLiveAsAnchorListDialogV2.g == null) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("realCall: ");
                sbLIZ.append(id);
                sbLIZ.append(", ");
                sbLIZ.append(ownerUserId);
                C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", C2188811AlT.LIZIZ(sbLIZ));
                C480460Ism.LIZ().getClass();
                multiLiveAsAnchorListDialogV2.g = (C11JF) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getMultiGuestBonus(id, ownerUserId).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(multiLiveAsAnchorListDialogV2, 247), new C516201zk(multiLiveAsAnchorListDialogV2, 333));
            }
        }
        C1C7U.LIZIZ("MultiLiveAsAnchorListDialogV2@77b0.onReminderCall$1");
    }

    public static final void accept$333(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveAsAnchorListDialogV2@77b0.realCall$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call error: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LIZIZ("MultiLiveAsAnchorListDialogV2", C2188811AlT.LIZIZ(sbLIZ));
        ((MultiLiveAsAnchorListDialogV2) c516201zk.l0).g = null;
        C1C7U.LIZIZ("MultiLiveAsAnchorListDialogV2@77b0.realCall$2");
    }

    public static final void accept$334(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MultiLiveAsAnchorListDialogV2@77b0.loadMoreSuggestUser$1$disposable$2");
        ((MultiLiveAsAnchorListDialogV2) c516201zk.l0).LJLILLLLZI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMoreSuggestUser error: ");
        sbLIZ.append(((Throwable) obj).getLocalizedMessage());
        C20441214yg.LJ("MultiLiveAsAnchorListDialogV2", C2188811AlT.LIZIZ(sbLIZ));
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856555));
        C1C7U.LIZIZ("MultiLiveAsAnchorListDialogV2@77b0.loadMoreSuggestUser$1$disposable$2");
    }

    public static final void accept$335(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("FeedDataManager@35a7.markDrawerUnReadToRemote$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Collecting unread room result, extra:");
        sbLIZ.append(((C467800IWc) c516201zk.l0).LIZIZ);
        sbLIZ.append(", statusCode: ");
        sbLIZ.append(((BaseResponse) obj).statusCode);
        sbLIZ.append('.');
        C20441214yg.LIZIZ("FeedDataManager", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("FeedDataManager@35a7.markDrawerUnReadToRemote$1");
    }

    public static final void accept$336(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AuthSequenceManager@5a17.updateAttributionPostLogin$1");
        ((C11NJ) c516201zk.l0).LJ();
        C1C7U.LIZIZ("AuthSequenceManager@5a17.updateAttributionPostLogin$1");
    }

    public static final void accept$337(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AuthSequenceManager@5a17.updateAttributionPostLogin$2");
        ((C11NJ) c516201zk.l0).LJ();
        C1C7U.LIZIZ("AuthSequenceManager@5a17.updateAttributionPostLogin$2");
    }

    public static final void accept$338(C516201zk c516201zk, Object obj) {
        String str;
        C1C7U.LIZ("ProfileAutoCreationHelper@8686.createNewNavi$1");
        ProfileNaviCreateResponse profileNaviCreateResponse = (ProfileNaviCreateResponse) obj;
        if (profileNaviCreateResponse != null) {
            Function1 function1 = (Function1) c516201zk.l0;
            if (profileNaviCreateResponse.error_code == 0 && (str = profileNaviCreateResponse.naviId) != null) {
                function1.invoke(str);
            }
        }
        C1C7U.LIZIZ("ProfileAutoCreationHelper@8686.createNewNavi$1");
    }

    public static final void accept$339(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ProfileAutoCreationHelper@8686.createNewNavi$2");
        ((Function1) c516201zk.l0).invoke("");
        C1C7U.LIZIZ("ProfileAutoCreationHelper@8686.createNewNavi$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$34(C516201zk c516201zk, Object obj) {
        ImageModel imageModel;
        C1C7U.LIZ("MultiGuestAvatarIntroFragment@b119.onViewCreated$4$1");
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        Avatar avatar = ((AvatarGetResp.ResponseData) ((BaseResponse) obj).data).avatar;
        if (avatar != null) {
            imageModel = avatar.image;
        } else {
            imageModel = null;
        }
        c0jbnLIZ.LJIIIZ(imageModel).LJJI(((View) c516201zk.l0).findViewById(R.id.bix));
        C1C7U.LIZIZ("MultiGuestAvatarIntroFragment@b119.onViewCreated$4$1");
    }

    public static final void accept$340(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ProfileHeaderRelationLabelComponent@f63d.displayMixedRelationLabel$1");
        ((TuxIconView) c516201zk.l0).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("ProfileHeaderRelationLabelComponent@f63d.displayMixedRelationLabel$1");
    }

    public static final void accept$341(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.exitFreeDrawGuess$2");
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C766270U4b.LIZLLL(2131854909);
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.exitFreeDrawGuess$2");
    }

    public static final void accept$342(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.requestFreeDrawGuess$2");
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.requestFreeDrawGuess$2");
    }

    public static final void accept$343(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.requestNewRound$2");
        C766270U4b.LIZLLL(2131854909);
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.requestNewRound$2");
    }

    public static final void accept$344(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("DrawGuessUtil@bdeb.requestNewSession$2");
        C766270U4b.LIZLLL(2131854909);
        ((Function1) c516201zk.l0).invoke(Boolean.FALSE);
        C1C7U.LIZIZ("DrawGuessUtil@bdeb.requestNewSession$2");
    }

    public static final void accept$345(C516201zk c516201zk, Object obj) {
        String key;
        String value;
        C1C7U.LIZ("LinkReportActiveMonitor@b072.startReportAudienceLinkMicActive$1");
        HashMap map = new HashMap();
        map.put(((EnumC147000hI) c516201zk.l0).getKey(), ((EnumC147000hI) c516201zk.l0).getValue());
        C00CH c00ch = C923780a9A.LIZIZ;
        String str = "";
        if (c00ch == null || (key = c00ch.getKey()) == null) {
            key = "";
        }
        C00CH c00ch2 = C923780a9A.LIZIZ;
        if (c00ch2 != null && (value = c00ch2.getValue()) != null) {
            str = value;
        }
        map.put(key, str);
        String strLLJJJJLIIL = C915980Zwa.LJI().LIZ().LLJJJJLIIL();
        if (!TextUtils.isEmpty(strLLJJJJLIIL)) {
            map.put("request_id", strLLJJJJLIIL);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("connection_onemin");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("LinkReportActiveMonitor@b072.startReportAudienceLinkMicActive$1");
    }

    public static final void accept$346(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("StickerEffectResourceRepository@b16f.fetchSearchSticker$2$1");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c516201zk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("StickerEffectResourceRepository@b16f.fetchSearchSticker$2$1");
    }

    public static final void accept$347(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("StickerEffectResourceRepository@b16f.fetchSearchSticker$2$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c516201zk.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("StickerEffectResourceRepository@b16f.fetchSearchSticker$2$2");
    }

    public static final void accept$348(C516201zk c516201zk, Object obj) {
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        C1C7U.LIZ("PaidSeriesBeforeLiveWidget@71.getSeriesNum$1");
        int i = ((PaidSeriesLiveNumResponse) obj).addedLiveSeriesCount;
        if (i > 0) {
            IIconSlot.SlotViewModel slotViewModel = ((C438601nE) c516201zk.l0).LLILZ;
            if (slotViewModel != null && (mutableLiveData2 = slotViewModel.LLILZLL) != null) {
                mutableLiveData2.setValue(String.valueOf(i));
            }
        } else {
            IIconSlot.SlotViewModel slotViewModel2 = ((C438601nE) c516201zk.l0).LLILZ;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLILZLL) != null) {
                mutableLiveData.setValue(null);
            }
        }
        C1C7U.LIZIZ("PaidSeriesBeforeLiveWidget@71.getSeriesNum$1");
    }

    public static final void accept$349(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BillboardView@81f9.onAttachedToWindow$2");
        C201100q1 c201100q1 = (C201100q1) obj;
        if (((C1103880epe) c516201zk.l0).getConfig().LIZLLL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            List<HostBoard> list = c201100q1.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<HostBoard> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().boardId);
            }
            List<HostBoard> list2 = c201100q1.LIZ;
            C1103880epe c1103880epe = (C1103880epe) c516201zk.l0;
            Iterator<HostBoard> it3 = list2.iterator();
            while (it3.hasNext()) {
                c1103880epe.LJ("close", it3.next());
            }
        }
        C1C7U.LIZIZ("BillboardView@81f9.onAttachedToWindow$2");
    }

    public static final void accept$35(C516201zk c516201zk, Object obj) {
        CountdownForAllContent countdownForAllContentWQ2;
        User userCQ2;
        String strDQ2;
        C1C7U.LIZ("BaseCountDownForAllV2Widget@92b1.onStatusChange$2");
        VM vm = ((BaseCountDownForAllV2Widget) c516201zk.l0).LL;
        if (vm != 0) {
            countdownForAllContentWQ2 = vm.wQ2();
        } else {
            countdownForAllContentWQ2 = null;
        }
        VM vm2 = ((BaseCountDownForAllV2Widget) c516201zk.l0).LL;
        if (vm2 != 0) {
            userCQ2 = vm2.CQ2();
        } else {
            userCQ2 = null;
        }
        VM vm3 = ((BaseCountDownForAllV2Widget) c516201zk.l0).LL;
        if (vm3 != 0) {
            strDQ2 = vm3.DQ2();
        } else {
            strDQ2 = null;
        }
        if (countdownForAllContentWQ2 != null) {
            BaseCountDownForAllV2Widget baseCountDownForAllV2Widget = (BaseCountDownForAllV2Widget) c516201zk.l0;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(baseCountDownForAllV2Widget), C0PEM.LIZJ, null, new C01J4(strDQ2, baseCountDownForAllV2Widget, countdownForAllContentWQ2, userCQ2, null), 2);
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Widget@92b1.onStatusChange$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$350(C516201zk c516201zk, Object obj) {
        CountdownForAllContent countdownForAllContent;
        C1C7U.LIZ("CountDownForAllV2AnchorModel@1340.requestEndCountDownForAll$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (countdownForAllContent = ((CountdownForAllEndResponse.ResponseData) c470590Icr.data).playContent) != null) {
            ((C01IU) c516201zk.l0).LJFF(countdownForAllContent, "requestEndCountDownForAll");
        }
        C1C7U.LIZIZ("CountDownForAllV2AnchorModel@1340.requestEndCountDownForAll$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$351(C516201zk c516201zk, Object obj) {
        UserPlaySettingValue userPlaySettingValue;
        String str;
        Map<String, UserPlaySettingValue> map;
        C1C7U.LIZ("CountDownForAllV2AnchorModel@1340.requestGetUserPlaySetting$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            C2252321DDq c2252321DDq = ((C01IU) c516201zk.l0).LJIJ;
            CountdownForAllConfig countdownForAllConfig = new CountdownForAllConfig();
            countdownForAllConfig.duration = C01JX.LJIIIZ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data, "countdown_for_all_duration", 180L);
            countdownForAllConfig.targetScore = C01JX.LJIIIZ((GetUserPlaySettingsResponse.ResponseData) c470590Icr.data, "countdown_for_all_target_score", 0L);
            GetUserPlaySettingsResponse.ResponseData responseData = (GetUserPlaySettingsResponse.ResponseData) c470590Icr.data;
            if (responseData != null && (map = responseData.settingsValueMap) != null) {
                userPlaySettingValue = map.get("countdown_for_all_resource_id");
            } else {
                userPlaySettingValue = null;
            }
            String str2 = "";
            if (userPlaySettingValue != null) {
                if (userPlaySettingValue.fieldType != 3) {
                    str = "";
                } else {
                    str = userPlaySettingValue.stringValue;
                    if (str != null) {
                    }
                }
                str2 = str;
            }
            countdownForAllConfig.resourceId = str2;
            c2252321DDq.setValue(countdownForAllConfig);
        }
        C1C7U.LIZIZ("CountDownForAllV2AnchorModel@1340.requestGetUserPlaySetting$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$352(C516201zk c516201zk, Object obj) {
        CountdownForAllConfig countdownForAllConfig;
        C1C7U.LIZ("CountDownForAllV2AnchorModel@1340.requestStartCountDownForAll$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            CountdownForAllContent countdownForAllContent = ((CountdownForAllStartResponse.ResponseData) c470590Icr.data).playContent;
            if (countdownForAllContent != null) {
                ((C01IU) c516201zk.l0).LJFF(countdownForAllContent, "requestStartCountDownForAll");
            }
            CountdownForAllContent countdownForAllContent2 = ((CountdownForAllStartResponse.ResponseData) c470590Icr.data).playContent;
            if (countdownForAllContent2 != null && (countdownForAllConfig = countdownForAllContent2.playConfig) != null) {
                ((C01IU) c516201zk.l0).LJIILL(countdownForAllConfig);
            }
        }
        C1C7U.LIZIZ("CountDownForAllV2AnchorModel@1340.requestStartCountDownForAll$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$353(C516201zk c516201zk, Object obj) {
        CountdownForAllContent countdownForAllContent;
        C1C7U.LIZ("CountDownForAllV2AnchorModel@1340.requestUpdateCountDownForAll$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (countdownForAllContent = ((CountdownForAllUpdateResponse.ResponseData) c470590Icr.data).playContent) != null) {
            ((C01IU) c516201zk.l0).LJFF(countdownForAllContent, "updateCountDownForAllSetting");
        }
        C1C7U.LIZIZ("CountDownForAllV2AnchorModel@1340.requestUpdateCountDownForAll$2");
    }

    public static final void accept$354(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.endCountDownForAll$1");
        ((CountDownForAllV2AnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "endCountDownForAll successfully");
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.endCountDownForAll$1");
    }

    public static final void accept$355(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.endCountDownForAll$2");
        ((CountDownForAllV2AnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "endCountDownForAll failure");
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.endCountDownForAll$2");
    }

    public static final void accept$356(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.requestGetUserPlaySettings$1");
        ((CountDownForAllV2AnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "getUserPlaySettings successfully");
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.requestGetUserPlaySettings$1");
    }

    public static final void accept$357(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CountDownForAllV2AnchorViewModel@4368.requestGetUserPlaySettings$2");
        ((CountDownForAllV2AnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "getUserPlaySettings failure");
        C1C7U.LIZIZ("CountDownForAllV2AnchorViewModel@4368.requestGetUserPlaySettings$2");
    }

    public static final void accept$358(C516201zk c516201zk, Object obj) {
        boolean z;
        C1C7U.LIZ("AdAutofillManagerV2@4585.updateAutofill$updateService$1");
        com.ss.android.ugc.aweme.base.api.BaseResponse baseResponse = (com.ss.android.ugc.aweme.base.api.BaseResponse) obj;
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            if (baseResponse.status_code == 0) {
                z = true;
            } else {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }
        C1C7U.LIZIZ("AdAutofillManagerV2@4585.updateAutofill$updateService$1");
    }

    public static final void accept$359(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AdAutofillManagerV2@4585.updateAutofill$updateService$2");
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("AdAutofillManagerV2@4585.updateAutofill$updateService$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$36(C516201zk c516201zk, Object obj) {
        CountdownForAllContent countdownForAllContent;
        CountDownForAllV2ScoreDialog countDownForAllV2ScoreDialog;
        C1C7U.LIZ("BaseCountDownForAllV2Widget@92b1.onCreate$5$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (countdownForAllContent = ((CountdownForAllGetContentResponse.ResponseData) c470590Icr.data).playContent) != null && (countDownForAllV2ScoreDialog = ((BaseCountDownForAllV2Widget) c516201zk.l0).LLILLJJLI) != null) {
            countDownForAllV2ScoreDialog.LLLFF = countdownForAllContent;
            countDownForAllV2ScoreDialog.zS();
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Widget@92b1.onCreate$5$1");
    }

    public static final void accept$360(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LocalLottieBitmapAsset@d70b.tryLoad$5");
        Throwable th = (Throwable) obj;
        C20441214yg.LJFF("LocalLottieBitmapAsset", "load failed:", th);
        ((Function2) c516201zk.l0).invoke(Boolean.FALSE, th);
        C1C7U.LIZIZ("LocalLottieBitmapAsset@d70b.tryLoad$5");
    }

    public static final void accept$361(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InviteChatGroupHelper@70d7.inviteOrCancelChatGroup$disposable$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("inviteChatGroup err:");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LIZIZ("InviteChatGroupHelper", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("InviteChatGroupHelper@70d7.inviteOrCancelChatGroup$disposable$2");
    }

    public static final void accept$362(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PoiWriteReviewPromptToast@3070.try2showPoiPublishPromptToast$2");
        ((C1191250h6Z) c516201zk.l0).LLILLJJLI = 2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchEligible - ");
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
        C1C7U.LIZIZ("PoiWriteReviewPromptToast@3070.try2showPoiPublishPromptToast$2");
    }

    public static final void accept$37(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.onStatusUpdated$2");
        GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) c516201zk.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GuestShowdownAnchorViewModel.LLJJIJI;
        guestShowdownAnchorViewModel.FQ2(0);
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.onStatusUpdated$2");
    }

    public static final void accept$38(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestClosePlay$1");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestClosePlay successfully");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestClosePlay$1");
    }

    public static final void accept$39(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestClosePlay$2");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "requestClosePlay failure");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestClosePlay$2");
    }

    public static final void accept$4(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.requestFanTicketContent$3");
        C20441214yg.LIZIZ(((C01IS) c516201zk.l0).LJIIIIZZ(), "requestFanTicketContentInternal successfully");
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.requestFanTicketContent$3");
    }

    public static final void accept$40(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestGetUserPlaySettings$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr)) {
            C500260Jjc.LJJLIIIJILLIZJL(new C020Y((GuestShowdownAnchorViewModel) c516201zk.l0, (GuestShowdownAnchorViewModel) c470590Icr, (C470590Icr<GetUserPlaySettingsResponse.ResponseData>) 4));
        }
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "getUserPlaySettings successfully");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestGetUserPlaySettings$1");
    }

    public static final void accept$41(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestGetUserPlaySettings$2");
        ((GuestShowdownAnchorViewModel) c516201zk.l0).getClass();
        C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "getUserPlaySettings unsuccessfully");
        C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestGetUserPlaySettings$2");
    }

    public static final void accept$42(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseGuestShowdownViewModel@b926.requestGetPlayContent$1");
        C20441214yg.LJIIIZ(((BaseGuestShowdownViewModel) c516201zk.l0).BQ2(), "requestGetPlayContent successfully");
        C1C7U.LIZIZ("BaseGuestShowdownViewModel@b926.requestGetPlayContent$1");
    }

    public static final void accept$43(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseGuestShowdownViewModel@b926.requestGetPlayContent$2");
        C20441214yg.LJIIIZ(((BaseGuestShowdownViewModel) c516201zk.l0).BQ2(), "requestGetPlayContent failure");
        C1C7U.LIZIZ("BaseGuestShowdownViewModel@b926.requestGetPlayContent$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$44(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.getCoverImages$1");
        ((InterfaceC170900l9) c516201zk.l0).LIZ(((MaterialsGetImagesResponse.ResponseData) ((BaseResponse) obj).data).playImages);
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.getCoverImages$1");
    }

    public static final void accept$45(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BasePlaybookEditorViewModel@d1fd.getCoverImages$2");
        ((InterfaceC170900l9) c516201zk.l0).onFailed((Throwable) obj);
        C1C7U.LIZIZ("BasePlaybookEditorViewModel@d1fd.getCoverImages$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$46(C516201zk c516201zk, Object obj) {
        List<C00UL> listLIZ;
        C1C7U.LIZ("PlaybookEditorCoverDialogV2@f26c.fetchAIPlaybookImage$2");
        C470590Icr c470590Icr = (C470590Icr) obj;
        PlayImage playImage = ((PlaybookImageAIGenResponse.ResponseData) c470590Icr.data).playImage;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && playImage != null) {
            PlaybookEditorCoverDialogV2 playbookEditorCoverDialogV2 = (PlaybookEditorCoverDialogV2) c516201zk.l0;
            List<C00UL> list = playbookEditorCoverDialogV2.LLLIIIIL;
            if (list != null) {
                listLIZ = C00UK.LIZ(list);
            } else {
                listLIZ = null;
            }
            playbookEditorCoverDialogV2.LLLIIIIL = listLIZ;
            if (listLIZ != null) {
                for (C00UL c00ul : listLIZ) {
                    Iterator<PlayImage> it2 = c00ul.LIZ.iterator();
                    int i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            PlayImage next = it2.next();
                            int i2 = i + 1;
                            if (i >= 0) {
                                if (next.type == 1) {
                                    ListProtector.set(c00ul.LIZ, i, playImage);
                                    break;
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                }
            }
            playbookEditorCoverDialogV2.FS();
            if (playImage.status == 1) {
                RunnableC514501zT runnableC514501zT = ((PlaybookEditorCoverDialogV2) c516201zk.l0).LLLJL;
                if (runnableC514501zT != null) {
                    C473410IhP.LIZ().removeCallbacks(runnableC514501zT);
                }
                PlaybookEditorCoverDialogV2 playbookEditorCoverDialogV22 = (PlaybookEditorCoverDialogV2) c516201zk.l0;
                RunnableC514501zT runnableC514501zT2 = new RunnableC514501zT(playbookEditorCoverDialogV22, playImage, 3);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("postDelayed fetchAIPlaybookImage, duration=");
                sbLIZ.append(((PlaybookImageAIGenResponse.ResponseData) c470590Icr.data).durationSecond);
                C20441214yg.LIZIZ("PlaybookEditorCoverDialogV2", C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJLIIL(((PlaybookImageAIGenResponse.ResponseData) c470590Icr.data).durationSecond * ((long) LSPassThroughRecordSizeConfig.DEFAULT), C473410IhP.LIZ(), runnableC514501zT2);
                playbookEditorCoverDialogV22.LLLJL = runnableC514501zT2;
            }
        } else {
            ((PlaybookEditorCoverDialogV2) c516201zk.l0).GS();
        }
        C1C7U.LIZIZ("PlaybookEditorCoverDialogV2@f26c.fetchAIPlaybookImage$2");
    }

    public static final void accept$47(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PlaybookEditorCoverDialogV2@f26c.fetchAIPlaybookImage$3");
        ((PlaybookEditorCoverDialogV2) c516201zk.l0).GS();
        C20441214yg.LJ("PlaybookEditorCoverDialogV2", "genPlaybookAIImage failure");
        C1C7U.LIZIZ("PlaybookEditorCoverDialogV2@f26c.fetchAIPlaybookImage$3");
    }

    public static final void accept$48(C516201zk c516201zk, Object obj) {
        C303501Fp value;
        HashSet<String> hashSetLJJJJJL;
        String str;
        MultiGuestDataHolder multiGuestDataHolderLIZJ;
        LinkPlayerInfo linkPlayerInfo;
        AbstractC928510aGn abstractC928510aGnLIZ;
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.checkMuteMicStatusAndMuteGuest$1");
        ShowConfig value2 = ((LiveShowAnchorViewModel) c516201zk.l0).LLILZ.getValue();
        if (value2 != null && (value = ((LiveShowAnchorViewModel) c516201zk.l0).LLILLL.getValue()) != null && !value2.allowOpenMicFreely) {
            String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (hashSetLJJJJJL = interfaceC954180awCLLJLL.LJJJJJL(strLJIIJ)) != null) {
                LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) c516201zk.l0;
                for (String str2 : hashSetLJJJJJL) {
                    ShowListUser showListUser = value.LIZIZ;
                    if (showListUser != null) {
                        str = showListUser.linkmicIdStr;
                    } else {
                        str = null;
                    }
                    if (!Intrinsics.LJFF(str2, str) && (multiGuestDataHolderLIZJ = C916490ZxP.LIZJ()) != null && Intrinsics.LJFF(multiGuestDataHolderLIZJ.LIZLLL(str2), Boolean.FALSE)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("anchor mute guest by back up, linkMicId: ");
                        sbLIZ.append(str2);
                        C20441214yg.LIZIZ("LiveShowAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        C930480aJy c930480aJy = C930480aJy.LIZ;
                        InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                            linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJIIZILJ(str2);
                        } else {
                            linkPlayerInfo = null;
                        }
                        C930480aJy.LJJIIZ(c930480aJy, null, linkPlayerInfo, 2, liveShowAnchorViewModel.EQ2(), C01G5.ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME, null, 32);
                    }
                }
            }
        }
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.checkMuteMicStatusAndMuteGuest$1");
    }

    public static final void accept$49(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.checkNextIMAfterCountDown$1");
        ((LiveShowAnchorViewModel) c516201zk.l0).LQ2(true);
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.checkNextIMAfterCountDown$1");
    }

    public static final void accept$5(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.requestFanTicketContent$4");
        C20441214yg.LJ(((C01IS) c516201zk.l0).LJIIIIZZ(), "requestFanTicketContentInternal failure");
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.requestFanTicketContent$4");
    }

    public static final void accept$50(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowAnchorViewModel@f562.checkZoomIMAfterCountDown$1");
        C304201Fw c304201Fw = ((LiveShowAnchorViewModel) c516201zk.l0).LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveShowAnchorViewModel.LLJJIJIL;
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
        if (interfaceC927510aFB != null) {
            interfaceC927510aFB.LJIIL();
        }
        C1C7U.LIZIZ("LiveShowAnchorViewModel@f562.checkZoomIMAfterCountDown$1");
    }

    public static final void accept$51(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowAudienceViewModel@fa2e.getShowList$2");
        C20441214yg.LIZIZ("LiveShowAudienceViewModel", "getShowList failed");
        InterfaceC302801Fi interfaceC302801Fi = (InterfaceC302801Fi) c516201zk.l0;
        if (interfaceC302801Fi != null) {
            interfaceC302801Fi.LIZIZ();
        }
        C1C7U.LIZIZ("LiveShowAudienceViewModel@fa2e.getShowList$2");
    }

    public static final void accept$52(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseLiveShowViewModel@af4e.checkAnimationStateAfterLiveShowEnd$1");
        C500260Jjc.LJJLIIIJJIZ(new C5182020e((BaseLiveShowViewModel) c516201zk.l0, 57));
        C20441214yg.LIZIZ("BaseLiveShowViewModel", "checkAnimationStateAfterLiveShowEnd, backup successfully");
        C1C7U.LIZIZ("BaseLiveShowViewModel@af4e.checkAnimationStateAfterLiveShowEnd$1");
    }

    public static final void accept$53(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MidLiveShowViewModel@a257.endLiveShow$1");
        C20441214yg.LIZIZ("MidLiveShowViewModel", "endShow successful");
        C01G3 c01g3 = (C01G3) c516201zk.l0;
        if (c01g3 != null) {
            c01g3.LIZ();
        }
        C1C7U.LIZIZ("MidLiveShowViewModel@a257.endLiveShow$1");
    }

    public static final void accept$54(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MidLiveShowViewModel@a257.endLiveShow$2");
        C20441214yg.LIZIZ("MidLiveShowViewModel", "endShow failed");
        C01G3 c01g3 = (C01G3) c516201zk.l0;
        if (c01g3 != null) {
            c01g3.LIZIZ();
        }
        C1C7U.LIZIZ("MidLiveShowViewModel@a257.endLiveShow$2");
    }

    public static final void accept$55(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MidLiveShowViewModel@a257.startLiveShow$2");
        C20441214yg.LIZIZ("MidLiveShowViewModel", "startLiveShow successful");
        ((C01G2) c516201zk.l0).LIZIZ();
        C1C7U.LIZIZ("MidLiveShowViewModel@a257.startLiveShow$2");
    }

    public static final void accept$56(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MidLiveShowViewModel@a257.startLiveShow$3");
        C20441214yg.LIZIZ("MidLiveShowViewModel", "startLiveShow failed");
        ((C01G2) c516201zk.l0).LIZ((Throwable) obj);
        C1C7U.LIZIZ("MidLiveShowViewModel@a257.startLiveShow$3");
    }

    public static final void accept$57(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowGuestViewModel@6827.checkZoomIMAfterCountDown$1");
        C304201Fw c304201Fw = ((LiveShowGuestViewModel) c516201zk.l0).LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LiveShowGuestViewModel.LLJJI;
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c304201Fw.LIZ();
        if (interfaceC927510aFB != null) {
            interfaceC927510aFB.LJIIL();
        }
        C1C7U.LIZIZ("LiveShowGuestViewModel@6827.checkZoomIMAfterCountDown$1");
    }

    public static final void accept$58(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.finishGuest$1");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "finish guest successful");
        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.finishGuest$1");
    }

    public static final void accept$59(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NoticeboardUtils@5337.updateBoard$3");
        Throwable th = (Throwable) obj;
        C953620avI.LJII(th);
        ((InterfaceC1631630sYr) c516201zk.l0).invoke(Boolean.FALSE, 0L, Integer.valueOf(PlaybookUtilKt.LJIIL(th)), 0L);
        C1C7U.LIZIZ("NoticeboardUtils@5337.updateBoard$3");
    }

    public static final void accept$6(C516201zk c516201zk, Object obj) {
        long j;
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.setEndIMBackup$1");
        if (((C01IS) c516201zk.l0).LIZIZ != null) {
            C01IS c01is = (C01IS) c516201zk.l0;
            CountdownForAllContent countdownForAllContent = c01is.LIZIZ;
            if (countdownForAllContent != null) {
                j = countdownForAllContent.playId;
            } else {
                j = 0;
            }
            c01is.LJIIL(j, "end_im_backup", null);
            ((C01IS) c516201zk.l0).LJIILJJIL = true;
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.setEndIMBackup$1");
    }

    public static final void accept$60(C516201zk c516201zk, Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.<init>$1");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj2 : list) {
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = (AnchorTextHeaderViewModel) c516201zk.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetchV2 success receive list.size:");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" realSize:");
        sbLIZ.append(arrayList.size());
        anchorTextHeaderViewModel.NQ2(C2188811AlT.LIZIZ(sbLIZ));
        ((AnchorTextHeaderViewModel) c516201zk.l0).LLJILLL.setValue(arrayList);
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.<init>$1");
    }

    public static final void accept$61(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.<init>$2");
        ((AnchorTextHeaderViewModel) c516201zk.l0).NQ2("prefetchV2 error");
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.<init>$2");
    }

    public static final void accept$62(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.createRecord$3");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.createRecord$3");
    }

    public static final void accept$63(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.endPlay$3");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.endPlay$3");
    }

    public static final void accept$64(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.deleteRecord$3");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.deleteRecord$3");
    }

    public static final void accept$65(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.fetchRecordList$3");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.fetchRecordList$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$66(C516201zk c516201zk, Object obj) {
        TextHeaderEndResponse.ResponseData responseData;
        TextHeaderPlayContent textHeaderPlayContent;
        C1C7U.LIZ("AnchorTextHeaderModel@c2b9.endPlay$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (TextHeaderEndResponse.ResponseData) c470590Icr.data) != null && (textHeaderPlayContent = responseData.textHeaderContent) != null) {
            ((C300201Ei) c516201zk.l0).LIZLLL(textHeaderPlayContent, "endPlay");
        }
        C1C7U.LIZIZ("AnchorTextHeaderModel@c2b9.endPlay$1");
    }

    public static final void accept$67(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AnchorTextHeaderViewModel@2fc0.updateRecord$3");
        Function0 function0 = (Function0) c516201zk.l0;
        if (function0 != null) {
            function0.invoke();
        }
        C1C7U.LIZIZ("AnchorTextHeaderViewModel@2fc0.updateRecord$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$68(C516201zk c516201zk, Object obj) {
        TextHeaderCreateResponse.ResponseData responseData;
        TextHeaderPlayContent textHeaderPlayContent;
        C1C7U.LIZ("AnchorTextHeaderModel@c2b9.startPlay$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (TextHeaderCreateResponse.ResponseData) c470590Icr.data) != null && (textHeaderPlayContent = responseData.textHeaderContent) != null) {
            ((C300201Ei) c516201zk.l0).LIZLLL(textHeaderPlayContent, "startPlay");
        }
        C1C7U.LIZIZ("AnchorTextHeaderModel@c2b9.startPlay$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$69(C516201zk c516201zk, Object obj) {
        TextHeaderUpdateResponse.ResponseData responseData;
        TextHeaderPlayContent textHeaderPlayContent;
        C1C7U.LIZ("AnchorTextHeaderModel@c2b9.updatePlay$1");
        C470590Icr c470590Icr = (C470590Icr) obj;
        C930480aJy.LIZ.getClass();
        if (C930480aJy.LJJIFFI(c470590Icr) && (responseData = (TextHeaderUpdateResponse.ResponseData) c470590Icr.data) != null && (textHeaderPlayContent = responseData.textHeaderContent) != null) {
            ((C300201Ei) c516201zk.l0).LIZLLL(textHeaderPlayContent, "updatePlay");
        }
        C1C7U.LIZIZ("AnchorTextHeaderModel@c2b9.updatePlay$1");
    }

    public static final void accept$7(C516201zk c516201zk, Object obj) {
        long j;
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.setRankSyncIMBackup$1");
        if (((C01IS) c516201zk.l0).LIZIZ != null) {
            C01IS c01is = (C01IS) c516201zk.l0;
            CountdownForAllContent countdownForAllContent = c01is.LIZIZ;
            if (countdownForAllContent != null) {
                j = countdownForAllContent.playId;
            } else {
                j = 0;
            }
            c01is.LJIIL(j, "rank_sync_im_backup", null);
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.setRankSyncIMBackup$1");
    }

    public static final void accept$70(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CoHostWindowView@cc83.onClick$2");
        Throwable th = (Throwable) obj;
        C500260Jjc.LJLJLJ(((ViewOnClickListenerC986770bml) c516201zk.l0).getViewFollowStatus(), true);
        if (th instanceof C501470JlZ) {
            C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
        } else {
            C766270U4b.LIZLLL(2131853482);
        }
        C1C7U.LIZIZ("CoHostWindowView@cc83.onClick$2");
    }

    public static final void accept$71(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("MatchSettingRepository@eb2c.fetchAvailableGifts$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to fetch gifts with, error: ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJ("MatchSettingRepository", C2188811AlT.LIZIZ(sbLIZ));
        ((Function1) c516201zk.l0).invoke(th);
        C1C7U.LIZIZ("MatchSettingRepository@eb2c.fetchAvailableGifts$2");
    }

    public static final void accept$72(C516201zk c516201zk, Object obj) {
        Object obj2;
        C1C7U.LIZ("GiftServiceKt@f898.commitV2Goal$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        C20441214yg.LJIIIZ("Commit V2 Goal", "Commit goal success!");
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            if (baseResponse != null) {
                obj2 = baseResponse.data;
            } else {
                obj2 = null;
            }
            function1.invoke(obj2);
        }
        C1C7U.LIZIZ("GiftServiceKt@f898.commitV2Goal$1");
    }

    public static final void accept$73(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GiftServiceKt@f898.commitV2Goal$2");
        Throwable th = (Throwable) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Commit goal failed! message: ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJ("Commit V2 Goal", C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) c516201zk.l0;
        if (function1 != null) {
            function1.invoke(th);
        }
        C1C7U.LIZIZ("GiftServiceKt@f898.commitV2Goal$2");
    }

    public static final void accept$74(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PerceptionMessageHelper$DialogClicked@9290.onClick$5");
        ((C782030Um1) c516201zk.l0).LIZLLL = false;
        C1C7U.LIZIZ("PerceptionMessageHelper$DialogClicked@9290.onClick$5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$75(C516201zk c516201zk, Object obj) {
        boolean z;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.querySafetyEducationStatus$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        DataChannel dataChannel = ((LiveBroadcastPreviewFragment) c516201zk.l0).LLILZLL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        CppSafetyEducationResponse.Data data = (CppSafetyEducationResponse.Data) baseResponse.data;
        if (data != null && data.examStatus == 0) {
            z = true;
        } else {
            z = false;
        }
        dataChannel.zW(ShouldShowSafetyEducationDialogCppV2.class, Boolean.valueOf(z));
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.querySafetyEducationStatus$1");
    }

    public static final void accept$76(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("PaidEventManager@f316.scheduleReportPreviewInfo$1");
        IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
        if (iHostUser != null) {
            iHostUser.reportData("live_room_paid_event");
        }
        ((Runnable) ((C0KAM) c516201zk.l0).LJII.getValue()).run();
        C1C7U.LIZIZ("PaidEventManager@f316.scheduleReportPreviewInfo$1");
    }

    public static final void accept$77(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GiftLimitNotificationManager@c802.setGiftLimit$2");
        C20441214yg.LIZIZ("GiftLimitNotificationManager", ((Throwable) obj).getMessage());
        ((InterfaceC250300xx) c516201zk.l0).onFailure();
        C1C7U.LIZIZ("GiftLimitNotificationManager@c802.setGiftLimit$2");
    }

    public static final void accept$78(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GroupLiveMvpSeatAssem@92f0.showResult$1");
        C500260Jjc.LJIILIIL((View) c516201zk.l0);
        C1C7U.LIZIZ("GroupLiveMvpSeatAssem@92f0.showResult$1");
    }

    public static final void accept$79(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GroupLiveMvpSeatAssem@92f0.showResult$2");
        C500260Jjc.LJIILIIL((View) c516201zk.l0);
        C1C7U.LIZIZ("GroupLiveMvpSeatAssem@92f0.showResult$2");
    }

    public static final void accept$8(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountDownForAllV2ViewModel@bc82.requestGetCountDownForAllContent$1");
        C20441214yg.LJIIIZ(((BaseCountDownForAllV2ViewModel) c516201zk.l0).BQ2(), "getCountDownForAllContent successfully");
        C1C7U.LIZIZ("BaseCountDownForAllV2ViewModel@bc82.requestGetCountDownForAllContent$1");
    }

    public static final void accept$80(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("GroupLiveRankingPanelViewModel@a567.imSubject$2$1$1");
        GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel = (GroupLiveRankingPanelViewModel) c516201zk.l0;
        groupLiveRankingPanelViewModel.getClass();
        groupLiveRankingPanelViewModel.withState(new C020W((CompetitionRankListMessage) obj, groupLiveRankingPanelViewModel, 94));
        C1C7U.LIZIZ("GroupLiveRankingPanelViewModel@a567.imSubject$2$1$1");
    }

    public static final void accept$81(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BroadcastHashTagWidget@2985.onLoad$2$2");
        C766270U4b.LJFF(2131841837, ((BroadcastHashTagWidget) c516201zk.l0).context);
        ((BroadcastHashTagWidget) c516201zk.l0).L1(0);
        C1C7U.LIZIZ("BroadcastHashTagWidget@2985.onLoad$2$2");
    }

    public static final void accept$82(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("I18nKevaManager@9da7.fetchHotKeyTranslation$2");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("I18nKevaManager@9da7.fetchHotKeyTranslation$2");
    }

    public static final void accept$83(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("I18nKevaManager@9da7.fetchHotKeyTranslation$3");
        ((Function1) c516201zk.l0).invoke(new LinkedHashMap());
        C1C7U.LIZIZ("I18nKevaManager@9da7.fetchHotKeyTranslation$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$84(C516201zk c516201zk, Object obj) {
        Integer numValueOf;
        List<AdminOperationRecordListResponse.Data.RoomRecord> list;
        List<AdminOperationRecordListResponse.Data.RoomRecord> list2;
        List<AdminOperationRecordItem> list3;
        ExpandableListView expandableListView;
        List<AdminOperationRecordListResponse.Data.RoomRecord> list4;
        C1C7U.LIZ("ModeratorOpsListSheet@77ff.fetchOperations$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch suc: ");
        AdminOperationRecordListResponse.Data data = (AdminOperationRecordListResponse.Data) baseResponse.data;
        if (data != null && (list4 = data.roomRecords) != null) {
            numValueOf = Integer.valueOf(list4.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("AdminMonitor#ops", C2188811AlT.LIZIZ(sbLIZ));
        ModeratorOpsListSheet moderatorOpsListSheet = (ModeratorOpsListSheet) c516201zk.l0;
        AdminOperationRecordListResponse.Data data2 = (AdminOperationRecordListResponse.Data) baseResponse.data;
        int size = 0;
        if (data2 != null && (list2 = data2.roomRecords) != null) {
            C01A6 c01a6 = moderatorOpsListSheet.LLJZ;
            if (c01a6 != null) {
                c01a6.LIZ.clear();
                c01a6.LIZ.addAll(list2);
                c01a6.notifyDataSetChanged();
            }
            AdminOperationRecordListResponse.Data.RoomRecord roomRecord = (AdminOperationRecordListResponse.Data.RoomRecord) C13LP.LJJJLZIJ(0, list2);
            if (roomRecord != null && (list3 = roomRecord.records) != null && list3.size() > 0 && (expandableListView = moderatorOpsListSheet.LLJLLL) != null) {
                expandableListView.expandGroup(0);
            }
        }
        AdminOperationRecordListResponse.Data data3 = (AdminOperationRecordListResponse.Data) baseResponse.data;
        if (data3 != null && (list = data3.roomRecords) != null) {
            size = list.size();
        }
        moderatorOpsListSheet.yS(size);
        C1C7U.LIZIZ("ModeratorOpsListSheet@77ff.fetchOperations$1");
    }

    public static final void accept$85(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("ModeratorOpsListSheet@77ff.fetchOperations$2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch fail: ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LIZIZ("AdminMonitor#ops", C2188811AlT.LIZIZ(sbLIZ));
        ((ModeratorOpsListSheet) c516201zk.l0).yS(-1);
        C1C7U.LIZIZ("ModeratorOpsListSheet@77ff.fetchOperations$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$86(C516201zk c516201zk, Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("ActQuizWidget@94df.onCreate$3");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("identity request succuss pk: ");
        QueryUserIdentityResponse queryUserIdentityResponse = (QueryUserIdentityResponse) baseResponse.data;
        if (queryUserIdentityResponse != null) {
            str = queryUserIdentityResponse.primaryId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ));
        ActQuizWidget actQuizWidget = (ActQuizWidget) c516201zk.l0;
        QueryUserIdentityResponse queryUserIdentityResponse2 = (QueryUserIdentityResponse) baseResponse.data;
        if (queryUserIdentityResponse2 == null || (str2 = queryUserIdentityResponse2.primaryId) == null) {
            str2 = "";
        }
        actQuizWidget.E1("identity", str2, "api");
        ActQuizWidget actQuizWidget2 = (ActQuizWidget) c516201zk.l0;
        QueryUserIdentityResponse queryUserIdentityResponse3 = (QueryUserIdentityResponse) baseResponse.data;
        ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage = new ActivityQuizUserIdentityMessage();
        activityQuizUserIdentityMessage.body = queryUserIdentityResponse3.body;
        activityQuizUserIdentityMessage.primaryId = queryUserIdentityResponse3.primaryId;
        activityQuizUserIdentityMessage.version = queryUserIdentityResponse3.version;
        activityQuizUserIdentityMessage.retainDeviceId = queryUserIdentityResponse3.retainDeviceId;
        activityQuizUserIdentityMessage.timestamp = queryUserIdentityResponse3.timestamp;
        actQuizWidget2.B1(activityQuizUserIdentityMessage);
        C1C7U.LIZIZ("ActQuizWidget@94df.onCreate$3");
    }

    public static final void accept$87(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KtUtil@f1ff.loadDataWithObservable$2$disposable$1");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
        C1C7U.LIZIZ("KtUtil@f1ff.loadDataWithObservable$2$disposable$1");
    }

    public static final void accept$88(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KtUtil@f1ff.loadDataWithObservable$2$disposable$2");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C1C7U.LIZIZ("KtUtil@f1ff.loadDataWithObservable$2$disposable$2");
    }

    public static final void accept$89(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KtUtil@f1ff.loadDataWithSingle$2$disposable$1");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
        C1C7U.LIZIZ("KtUtil@f1ff.loadDataWithSingle$2$disposable$1");
    }

    public static final void accept$9(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("BaseCountDownForAllV2ViewModel@bc82.requestGetCountDownForAllContent$2");
        C20441214yg.LJIIIZ(((BaseCountDownForAllV2ViewModel) c516201zk.l0).BQ2(), "getCountDownForAllContent failure");
        C1C7U.LIZIZ("BaseCountDownForAllV2ViewModel@bc82.requestGetCountDownForAllContent$2");
    }

    public static final void accept$90(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("KtUtil@f1ff.loadDataWithSingle$2$disposable$2");
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c516201zk.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
        C1C7U.LIZIZ("KtUtil@f1ff.loadDataWithSingle$2$disposable$2");
    }

    public static final void accept$91(C516201zk c516201zk, Object obj) {
        Integer num;
        C1C7U.LIZ("CommercePromoteService@6ab5.getPromoteEntryShowTypeAsync$disposable$1");
        GetPromoteEntryControlResp getPromoteEntryControlResp = (GetPromoteEntryControlResp) obj;
        Function1 function1 = (Function1) c516201zk.l0;
        if (getPromoteEntryControlResp != null) {
            num = getPromoteEntryControlResp.entryShowType;
        } else {
            num = null;
        }
        function1.invoke(num);
        C1C7U.LIZIZ("CommercePromoteService@6ab5.getPromoteEntryShowTypeAsync$disposable$1");
    }

    public static final void accept$92(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CommercePromoteService@6ab5.getPromoteEntryShowTypeAsync$disposable$2");
        ((Function1) c516201zk.l0).invoke(obj);
        C1C7U.LIZIZ("CommercePromoteService@6ab5.getPromoteEntryShowTypeAsync$disposable$2");
    }

    public static final void accept$93(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("NightScreenTimeApiManager@ca0a.updateSleepHourSettings$2");
        ((Function0) c516201zk.l0).invoke();
        C1C7U.LIZIZ("NightScreenTimeApiManager@ca0a.updateSleepHourSettings$2");
    }

    public static final void accept$94(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("AIDubbingSheetLayout@4825.fetchProductTranslationAbility$2");
        C127R c127r = (C127R) c516201zk.l0;
        c127r.LLILZLL = false;
        c127r.LIZ(c127r.LLJI);
        ((C127R) c516201zk.l0).LIZJ();
        C1C7U.LIZIZ("AIDubbingSheetLayout@4825.fetchProductTranslationAbility$2");
    }

    public static final void accept$95(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CollectionListMainUIAssem$CollectionVH@a3f0.onBindItemView$2$2$1");
        ((TuxIconView) c516201zk.l0).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("CollectionListMainUIAssem$CollectionVH@a3f0.onBindItemView$2$2$1");
    }

    public static final void accept$96(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CollectionListMainUIAssem$CollectionVHNew@519.bindCollaborativeAvatar$1$2$1");
        ((TuxIconView) c516201zk.l0).setImageBitmap((Bitmap) obj);
        C1C7U.LIZIZ("CollectionListMainUIAssem$CollectionVHNew@519.bindCollaborativeAvatar$1$2$1");
    }

    public static final void accept$97(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("CollectionContentFragment@3f31.onClickItemViewHolderToRemoveUnableVideos$1$1$1$invoke$2");
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) c516201zk.l0);
        c1389890mGx.LJIIIZ(2131834207);
        c1389890mGx.LJIIJJI();
        C1C7U.LIZIZ("CollectionContentFragment@3f31.onClickItemViewHolderToRemoveUnableVideos$1$1$1$invoke$2");
    }

    public static final void accept$98(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("EditCollectionFragment@5201.checkNameFromServer$2");
        ((Function1) c516201zk.l0).invoke(Boolean.valueOf(Intrinsics.LJFF(((CollectionNameCheckResponse) obj).isValid, Boolean.TRUE)));
        C1C7U.LIZIZ("EditCollectionFragment@5201.checkNameFromServer$2");
    }

    public static final void accept$99(C516201zk c516201zk, Object obj) {
        C1C7U.LIZ("InputNameSheetFragment@199e.checkNameFromServer$2");
        ((Function1) c516201zk.l0).invoke(Boolean.valueOf(Intrinsics.LJFF(((CollectionNameCheckResponse) obj).isValid, Boolean.TRUE)));
        C1C7U.LIZIZ("InputNameSheetFragment@199e.checkNameFromServer$2");
    }

    public C516201zk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

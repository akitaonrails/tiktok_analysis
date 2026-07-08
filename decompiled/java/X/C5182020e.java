package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.broadcast.model.AgeRestrictedConfig;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.LogGiftCloseToastShowEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.ApplyGuideViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.BizSpotInfoCenter;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.IMultiGuestPlayApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforall.ICountDownForAllApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.IGuestShowdownApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.end.GuestShowdownEndDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.rank.GuestShowdownRankDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownIdleSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownInPunishmentSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.ui.settings.GuestShowdownOngoingSettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.guest.GuestShowdownGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.BasePlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.PlaybookEditorDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.more.PlaybookEditorMoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.PGCPlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.tag.PlaybookEditorAddTagDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.ugc.UGCPlaybookEditorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderCreationSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.MultiHostInviteListFragmentV2;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownForAllUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.FinishShowingGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsParams;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowSettingsResponse;
import com.bytedance.android.live.liveinteract.multilive.model.GuestShowdownUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookReviewResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnpublishParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateUserPlaySettingsParams;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.broadcast.interaction.widget.BroadcastCountDownWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.MultiPreviewInviteGuestWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewInviteGuestWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livemode.PreviewLiveModeListSheetFragment;
import com.bytedance.android.livesdk.broadcast.preview.widget.partnership.PreviewGameDropsWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestSheet;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestViewModel;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameInGameRankDialog;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.gift.viewerwishes.api.ViewerWishesApi;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelViewModel;
import com.bytedance.android.livesdk.grouplive.inroomranking.panel.items.PanelRankingCell;
import com.bytedance.android.livesdk.grouplive.widget.GroupLiveAudienceWidget;
import com.bytedance.android.livesdk.hints.GiftHintsManager;
import com.bytedance.android.livesdk.livegoal.LiveGoalPinCardWidget;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.grouplive.GroupLiveConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.PartnershipDropsAnchorMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.UserPlayInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.viewer_picks.model.RestartParams;
import com.bytedance.android.livesdk.viewerwishes.common.viewmodel.ViewerWishesViewModel;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidgetKotlin;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.crash.Npth;
import com.bytedance.ies.sdk.datachannel.Channel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.edit.EditFundraiserPageFragment;
import com.ss.android.ugc.aweme.compliance.business.fundraiser.p006native.pages.edit.EditFundraiserPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentAssem;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.BubbleClickAction;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.PromotionBubble;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoritePowerViewPagerViewModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LiveAiSummaryWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessBoardWidget;
import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFYPViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestRootFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.artist.powerlist.ArtistMusicAwemeLisHintCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.detail.keyframe.viewmodel.TakoDetailKeyframeVM;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoViewLargeImageDialogFragment;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllConfigChange;
import webcast.data.multi_guest_play.CountdownForAllContent;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownConfigChange;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;

/* JADX INFO: renamed from: X.020e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5182020e extends C09AY implements Function0 {
    public final int $t;
    public Object l0;

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
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case 48:
                return invoke$48(this);
            case 49:
                return invoke$49(this);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case 85:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            case 97:
                return invoke$97(this);
            case 98:
                return invoke$98(this);
            case 99:
                return invoke$99(this);
            case 100:
                return invoke$100(this);
            case 101:
                return invoke$101(this);
            case 102:
                return invoke$102(this);
            case 103:
                return invoke$103(this);
            case 104:
                return invoke$104(this);
            case 105:
                return invoke$105(this);
            case 106:
                return invoke$106(this);
            case 107:
                return invoke$107(this);
            case 108:
                return invoke$108(this);
            case 109:
                return invoke$109(this);
            case 110:
                return invoke$110(this);
            case 111:
                return invoke$111(this);
            case 112:
                return invoke$112(this);
            case 113:
                return invoke$113(this);
            case 114:
                return invoke$114(this);
            case 115:
                return invoke$115(this);
            case 116:
                return invoke$116(this);
            case 117:
                return invoke$117(this);
            case 118:
                return invoke$118(this);
            case 119:
                return invoke$119(this);
            case 120:
                return invoke$120(this);
            case 121:
                return invoke$121(this);
            case 122:
                return invoke$122(this);
            case 123:
                return invoke$123(this);
            case 124:
                return invoke$124(this);
            case 125:
                return invoke$125(this);
            case 126:
                return invoke$126(this);
            case 127:
                return invoke$127(this);
            case 128:
                return invoke$128(this);
            case 129:
                return invoke$129(this);
            case 130:
                return invoke$130(this);
            case 131:
                return invoke$131(this);
            case 132:
                return invoke$132(this);
            case 133:
                return invoke$133(this);
            case 134:
                return invoke$134(this);
            case 135:
                return invoke$135(this);
            case 136:
                return invoke$136(this);
            case 137:
                return invoke$137(this);
            case 138:
                return invoke$138(this);
            case 139:
                return invoke$139(this);
            case 140:
                return invoke$140(this);
            case 141:
                return invoke$141(this);
            case 142:
                return invoke$142(this);
            case 143:
                return invoke$143(this);
            case 144:
                return invoke$144(this);
            case 145:
                return invoke$145(this);
            case 146:
                return invoke$146(this);
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$148(this);
            case 149:
                return invoke$149(this);
            case 150:
                return invoke$150(this);
            case 151:
                return invoke$151(this);
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$153(this);
            case 154:
                return invoke$154(this);
            case 155:
                return invoke$155(this);
            case 156:
                return invoke$156(this);
            case 157:
                return invoke$157(this);
            case 158:
                return invoke$158(this);
            case 159:
                return invoke$159(this);
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            case 163:
                return invoke$163(this);
            case 164:
                return invoke$164(this);
            case 165:
                return invoke$165(this);
            case 166:
                return invoke$166(this);
            case 167:
                return invoke$167(this);
            case 168:
                return invoke$168(this);
            case 169:
                return invoke$169(this);
            case 170:
                return invoke$170(this);
            case 171:
                return invoke$171(this);
            case 172:
                return invoke$172(this);
            case 173:
                return invoke$173(this);
            case 174:
                return invoke$174(this);
            case 175:
                return invoke$175(this);
            case 176:
                return invoke$176(this);
            case 177:
                return invoke$177(this);
            case 178:
                return invoke$178(this);
            case 179:
                return invoke$179(this);
            case 180:
                return invoke$180(this);
            case 181:
                return invoke$181(this);
            case 182:
                return invoke$182(this);
            case 183:
                return invoke$183(this);
            case 184:
                return invoke$184(this);
            case 185:
                return invoke$185(this);
            case 186:
                return invoke$186(this);
            case 187:
                return invoke$187(this);
            case 188:
                return invoke$188(this);
            case 189:
                return invoke$189(this);
            case 190:
                return invoke$190(this);
            case 191:
                return invoke$191(this);
            case 192:
                return invoke$192(this);
            case 193:
                return invoke$193(this);
            case 194:
                return invoke$194(this);
            case 195:
                return invoke$195(this);
            case 196:
                return invoke$196(this);
            case 197:
                return invoke$197(this);
            case 198:
                return invoke$198(this);
            case 199:
                return invoke$199(this);
            case 200:
                return invoke$200(this);
            case 201:
                return invoke$201(this);
            case 202:
                return invoke$202(this);
            case 203:
                return invoke$203(this);
            case 204:
                return invoke$204(this);
            case 205:
                return invoke$205(this);
            case 206:
                return invoke$206(this);
            case 207:
                return invoke$207(this);
            case 208:
                return invoke$208(this);
            case 209:
                return invoke$209(this);
            case 210:
                return invoke$210(this);
            case 211:
                return invoke$211(this);
            case 212:
                return invoke$212(this);
            case 213:
                return invoke$213(this);
            case 214:
                return invoke$214(this);
            case 215:
                return invoke$215(this);
            case 216:
                return invoke$216(this);
            case 217:
                return invoke$217(this);
            case 218:
                return invoke$218(this);
            case 219:
                return invoke$219(this);
            case 220:
                return invoke$220(this);
            case 221:
                return invoke$221(this);
            case 222:
                return invoke$222(this);
            case 223:
                return invoke$223(this);
            case 224:
                return invoke$224(this);
            case 225:
                return invoke$225(this);
            case 226:
                return invoke$226(this);
            case 227:
                return invoke$227(this);
            case 228:
                return invoke$228(this);
            case 229:
                return invoke$229(this);
            case 230:
                return invoke$230(this);
            case 231:
                return invoke$231(this);
            case 232:
                return invoke$232(this);
            case 233:
                return invoke$233(this);
            case 234:
                return invoke$234(this);
            case 235:
                return invoke$235(this);
            case 236:
                return invoke$236(this);
            case 237:
                return invoke$237(this);
            case 238:
                return invoke$238(this);
            case 239:
                return invoke$239(this);
            case 240:
                return invoke$240(this);
            case 241:
                return invoke$241(this);
            case 242:
                return invoke$242(this);
            case 243:
                return invoke$243(this);
            case 244:
                return invoke$244(this);
            case 245:
                return invoke$245(this);
            case 246:
                return invoke$246(this);
            case 247:
                return invoke$247(this);
            case 248:
                return invoke$248(this);
            case 249:
                return invoke$249(this);
            case 250:
                return invoke$250(this);
            case 251:
                return invoke$251(this);
            case 252:
                return invoke$252(this);
            case 253:
                return invoke$253(this);
            case 254:
                return invoke$254(this);
            case 255:
                return invoke$255(this);
            case 256:
                return invoke$256(this);
            case 257:
                return invoke$257(this);
            case 258:
                return invoke$258(this);
            case 259:
                return invoke$259(this);
            case 260:
                return invoke$260(this);
            case 261:
                return invoke$261(this);
            case 262:
                return invoke$262(this);
            case 263:
                return invoke$263(this);
            case 264:
                return invoke$264(this);
            case 265:
                return invoke$265(this);
            case 266:
                return invoke$266(this);
            case 267:
                return invoke$267(this);
            case 268:
                return invoke$268(this);
            case 269:
                return invoke$269(this);
            case 270:
                return invoke$270(this);
            case 271:
                return invoke$271(this);
            case 272:
                return invoke$272(this);
            case 273:
                return invoke$273(this);
            case 274:
                return invoke$274(this);
            case 275:
                return invoke$275(this);
            case 276:
                return invoke$276(this);
            case 277:
                return invoke$277(this);
            case 278:
                return invoke$278(this);
            case 279:
                return invoke$279(this);
            case 280:
                return invoke$280(this);
            case 281:
                return invoke$281(this);
            case 282:
                return invoke$282(this);
            case 283:
                return invoke$283(this);
            case 284:
                return invoke$284(this);
            case 285:
                return invoke$285(this);
            case 286:
                return invoke$286(this);
            case 287:
                return invoke$287(this);
            case 288:
                return invoke$288(this);
            case 289:
                return invoke$289(this);
            case 290:
                return invoke$290(this);
            case 291:
                return invoke$291(this);
            case 292:
                return invoke$292(this);
            case 293:
                return invoke$293(this);
            case 294:
                return invoke$294(this);
            case 295:
                return invoke$295(this);
            case 296:
                return invoke$296(this);
            case 297:
                return invoke$297(this);
            case 298:
                return invoke$298(this);
            case 299:
                return invoke$299(this);
            case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                return invoke$300(this);
            case 301:
                return invoke$301(this);
            case 302:
                return invoke$302(this);
            case 303:
                return invoke$303(this);
            case 304:
                return invoke$304(this);
            case 305:
                return invoke$305(this);
            case 306:
                return invoke$306(this);
            case 307:
                return invoke$307(this);
            case 308:
                return invoke$308(this);
            case 309:
                return invoke$309(this);
            case 310:
                return invoke$310(this);
            case 311:
                return invoke$311(this);
            case 312:
                return invoke$312(this);
            case 313:
                return invoke$313(this);
            case 314:
                return invoke$314(this);
            case 315:
                return invoke$315(this);
            case 316:
                return invoke$316(this);
            case 317:
                return invoke$317(this);
            case 318:
                return invoke$318(this);
            case 319:
                return invoke$319(this);
            case 320:
                return invoke$320(this);
            case 321:
                return invoke$321(this);
            case 322:
                return invoke$322(this);
            case 323:
                return invoke$323(this);
            case 324:
                return invoke$324(this);
            case 325:
                return invoke$325(this);
            case 326:
                return invoke$326(this);
            case 327:
                return invoke$327(this);
            case 328:
                return invoke$328(this);
            case 329:
                return invoke$329(this);
            case 330:
                return invoke$330(this);
            case 331:
                return invoke$331(this);
            case 332:
                return invoke$332(this);
            case 333:
                return invoke$333(this);
            case 334:
                return invoke$334(this);
            case 335:
                return invoke$335(this);
            case 336:
                return invoke$336(this);
            case 337:
                return invoke$337(this);
            case 338:
                return invoke$338(this);
            case 339:
                return invoke$339(this);
            case 340:
                return invoke$340(this);
            case 341:
                return invoke$341(this);
            case 342:
                return invoke$342(this);
            case 343:
                return invoke$343(this);
            case 344:
                return invoke$344(this);
            case 345:
                return invoke$345(this);
            case 346:
                return invoke$346(this);
            case 347:
                return invoke$347(this);
            case 348:
                return invoke$348(this);
            case 349:
                return invoke$349(this);
            case 350:
                return invoke$350(this);
            case 351:
                return invoke$351(this);
            case 352:
                return invoke$352(this);
            case 353:
                return invoke$353(this);
            case 354:
                return invoke$354(this);
            case 355:
                return invoke$355(this);
            case 356:
                return invoke$356(this);
            case 357:
                return invoke$357(this);
            case 358:
                return invoke$358(this);
            case 359:
                return invoke$359(this);
            case 360:
                return invoke$360(this);
            case 361:
                return invoke$361(this);
            case 362:
                return invoke$362(this);
            case 363:
                return invoke$363(this);
            case 364:
                return invoke$364(this);
            case 365:
                return invoke$365(this);
            case 366:
                return invoke$366(this);
            case 367:
                return invoke$367(this);
            case 368:
                return invoke$368(this);
            case 369:
                return invoke$369(this);
            case 370:
                return invoke$370(this);
            case 371:
                return invoke$371(this);
            case 372:
                return invoke$372(this);
            case 373:
                return invoke$373(this);
            case 374:
                return invoke$374(this);
            case 375:
                return invoke$375(this);
            case 376:
                return invoke$376(this);
            case 377:
                return invoke$377(this);
            case 378:
                return invoke$378(this);
            case 379:
                return invoke$379(this);
            case 380:
                return invoke$380(this);
            case 381:
                return invoke$381(this);
            case 382:
                return invoke$382(this);
            case 383:
                return invoke$383(this);
            case 384:
                return invoke$384(this);
            case 385:
                return invoke$385(this);
            case 386:
                return invoke$386(this);
            case 387:
                return invoke$387(this);
            case 388:
                return invoke$388(this);
            case 389:
                return invoke$389(this);
            case 390:
                return invoke$390(this);
            case 391:
                return invoke$391(this);
            case 392:
                return invoke$392(this);
            case 393:
                return invoke$393(this);
            case 394:
                return invoke$394(this);
            case 395:
                return invoke$395(this);
            case 396:
                return invoke$396(this);
            case 397:
                return invoke$397(this);
            case 398:
                return invoke$398(this);
            case 399:
                return invoke$399(this);
            case 400:
                return invoke$400(this);
            case 401:
                return invoke$401(this);
            case 402:
                return invoke$402(this);
            case 403:
                return invoke$403(this);
            case 404:
                return invoke$404(this);
            case 405:
                return invoke$405(this);
            case 406:
                return invoke$406(this);
            case 407:
                return invoke$407(this);
            case 408:
                return invoke$408(this);
            case 409:
                return invoke$409(this);
            case 410:
                return invoke$410(this);
            case 411:
                return invoke$411(this);
            case 412:
                return invoke$412(this);
            case 413:
                return invoke$413(this);
            case 414:
                return invoke$414(this);
            case 415:
                return invoke$415(this);
            case 416:
                return invoke$416(this);
            case 417:
                return invoke$417(this);
            case 418:
                return invoke$418(this);
            case 419:
                return invoke$419(this);
            case 420:
                return invoke$420(this);
            case 421:
                return invoke$421(this);
            case 422:
                return invoke$422(this);
            case 423:
                return invoke$423(this);
            case 424:
                return invoke$424(this);
            case 425:
                return invoke$425(this);
            case 426:
                return invoke$426(this);
            case 427:
                return invoke$427(this);
            case 428:
                return invoke$428(this);
            case 429:
                return invoke$429(this);
            case 430:
                return invoke$430(this);
            case 431:
                return invoke$431(this);
            case 432:
                return invoke$432(this);
            case 433:
                return invoke$433(this);
            case 434:
                return invoke$434(this);
            case 435:
                return invoke$435(this);
            case 436:
                return invoke$436(this);
            case 437:
                return invoke$437(this);
            case 438:
                return invoke$438(this);
            case 439:
                return invoke$439(this);
            case 440:
                return invoke$440(this);
            case 441:
                return invoke$441(this);
            case 442:
                return invoke$442(this);
            case 443:
                return invoke$443(this);
            case 444:
                return invoke$444(this);
            case 445:
                return invoke$445(this);
            case 446:
                return invoke$446(this);
            case 447:
                return invoke$447(this);
            case 448:
                return invoke$448(this);
            case 449:
                return invoke$449(this);
            case 450:
                return invoke$450(this);
            case 451:
                return invoke$451(this);
            case 452:
                return invoke$452(this);
            case 453:
                return invoke$453(this);
            case 454:
                return invoke$454(this);
            case 455:
                return invoke$455(this);
            case 456:
                return invoke$456(this);
            case 457:
                return invoke$457(this);
            case 458:
                return invoke$458(this);
            case 459:
                return invoke$459(this);
            case 460:
                return invoke$460(this);
            case 461:
                return invoke$461(this);
            case 462:
                return invoke$462(this);
            case 463:
                return invoke$463(this);
            case 464:
                return invoke$464(this);
            case 465:
                return invoke$465(this);
            case 466:
                return invoke$466(this);
            case 467:
                return invoke$467(this);
            case 468:
                return invoke$468(this);
            case 469:
                return invoke$469(this);
            case 470:
                return invoke$470(this);
            case 471:
                return invoke$471(this);
            case 472:
                return invoke$472(this);
            case 473:
                return invoke$473(this);
            case 474:
                return invoke$474(this);
            case 475:
                return invoke$475(this);
            case 476:
                return invoke$476(this);
            case 477:
                return invoke$477(this);
            case 478:
                return invoke$478(this);
            case 479:
                return invoke$479(this);
            case 480:
                return invoke$480(this);
            case 481:
                return invoke$481(this);
            case 482:
                return invoke$482(this);
            case 483:
                return invoke$483(this);
            case 484:
                return invoke$484(this);
            case 485:
                return invoke$485(this);
            case 486:
                return invoke$486(this);
            case 487:
                return invoke$487(this);
            case 488:
                return invoke$488(this);
            case 489:
                return invoke$489(this);
            case 490:
                return invoke$490(this);
            case 491:
                return invoke$491(this);
            case 492:
                return invoke$492(this);
            case 493:
                return invoke$493(this);
            case 494:
                return invoke$494(this);
            case 495:
                return invoke$495(this);
            case 496:
                return invoke$496(this);
            case 497:
                return invoke$497(this);
            case 498:
                return invoke$498(this);
            case 499:
                return invoke$499(this);
            case 500:
                return invoke$500(this);
            case 501:
                return invoke$501(this);
            case 502:
                return invoke$502(this);
            case 503:
                return invoke$503(this);
            case 504:
                return invoke$504(this);
            case 505:
                return invoke$505(this);
            case 506:
                return invoke$506(this);
            case 507:
                return invoke$507(this);
            case 508:
                return invoke$508(this);
            case 509:
                return invoke$509(this);
            case 510:
                return invoke$510(this);
            case 511:
                return invoke$511(this);
            case 512:
                return invoke$512(this);
            case 513:
                return invoke$513(this);
            case 514:
                return invoke$514(this);
            case 515:
                return invoke$515(this);
            case 516:
                return invoke$516(this);
            case 517:
                return invoke$517(this);
            case 518:
                return invoke$518(this);
            case 519:
                return invoke$519(this);
            case 520:
                return invoke$520(this);
            case 521:
                return invoke$521(this);
            case 522:
                return invoke$522(this);
            case 523:
                return invoke$523(this);
            case 524:
                return invoke$524(this);
            case 525:
                return invoke$525(this);
            case 526:
                return invoke$526(this);
            case 527:
                return invoke$527(this);
            case 528:
                return invoke$528(this);
            case 529:
                return invoke$529(this);
            case 530:
                return invoke$530(this);
            case 531:
                return invoke$531(this);
            case 532:
                return invoke$532(this);
            case 533:
                return invoke$533(this);
            case 534:
                return invoke$534(this);
            case 535:
                return invoke$535(this);
            case 536:
                return invoke$536(this);
            case 537:
                return invoke$537(this);
            case 538:
                return invoke$538(this);
            case 539:
                return invoke$539(this);
            case 540:
                return invoke$540(this);
            case 541:
                return invoke$541(this);
            case 542:
                return invoke$542(this);
            case 543:
                return invoke$543(this);
            case 544:
                return invoke$544(this);
            case 545:
                return invoke$545(this);
            case 546:
                return invoke$546(this);
            case 547:
                return invoke$547(this);
            case 548:
                return invoke$548(this);
            case 549:
                return invoke$549(this);
            case 550:
                return invoke$550(this);
            case 551:
                return invoke$551(this);
            case 552:
                return invoke$552(this);
            case 553:
                return invoke$553(this);
            case 554:
                return invoke$554(this);
            case 555:
                return invoke$555(this);
            case 556:
                return invoke$556(this);
            case 557:
                return invoke$557(this);
            case 558:
                return invoke$558(this);
            case 559:
                return invoke$559(this);
            case 560:
                return invoke$560(this);
            case 561:
                return invoke$561(this);
            case 562:
                return invoke$562(this);
            case 563:
                return invoke$563(this);
            case 564:
                return invoke$564(this);
            case 565:
                return invoke$565(this);
            case 566:
                return invoke$566(this);
            case 567:
                return invoke$567(this);
            case 568:
                return invoke$568(this);
            case 569:
                return invoke$569(this);
            case 570:
                return invoke$570(this);
            case 571:
                return invoke$571(this);
            case 572:
                return invoke$572(this);
            case 573:
                return invoke$573(this);
            case 574:
                return invoke$574(this);
            case 575:
                return invoke$575(this);
            case 576:
                return invoke$576(this);
            case 577:
                return invoke$577(this);
            case 578:
                return invoke$578(this);
            case 579:
                return invoke$579(this);
            case 580:
                return invoke$580(this);
            case 581:
                return invoke$581(this);
            case 582:
                return invoke$582(this);
            case 583:
                return invoke$583(this);
            case 584:
                return invoke$584(this);
            case 585:
                return invoke$585(this);
            case 586:
                return invoke$586(this);
            case 587:
                return invoke$587(this);
            case 588:
                return invoke$588(this);
            case 589:
                return invoke$589(this);
            case 590:
                return invoke$590(this);
            case 591:
                return invoke$591(this);
            case 592:
                return invoke$592(this);
            case 593:
                return invoke$593(this);
            case 594:
                return invoke$594(this);
            case 595:
                return invoke$595(this);
            case 596:
                return invoke$596(this);
            case 597:
                return invoke$597(this);
            case 598:
                return invoke$598(this);
            case 599:
                return invoke$599(this);
            case 600:
                return invoke$600(this);
            case 601:
                return invoke$601(this);
            case 602:
                return invoke$602(this);
            case 603:
                return invoke$603(this);
            case 604:
                return invoke$604(this);
            case 605:
                return invoke$605(this);
            case 606:
                return invoke$606(this);
            case 607:
                return invoke$607(this);
            case 608:
                return invoke$608(this);
            case 609:
                return invoke$609(this);
            case 610:
                return invoke$610(this);
            case 611:
                return invoke$611(this);
            case 612:
                return invoke$612(this);
            case 613:
                return invoke$613(this);
            case 614:
                return invoke$614(this);
            case 615:
                return invoke$615(this);
            case 616:
                return invoke$616(this);
            case 617:
                return invoke$617(this);
            case 618:
                return invoke$618(this);
            case 619:
                return invoke$619(this);
            case 620:
                return invoke$620(this);
            case 621:
                return invoke$621(this);
            case 622:
                return invoke$622(this);
            case 623:
                return invoke$623(this);
            case 624:
                return invoke$624(this);
            case 625:
                return invoke$625(this);
            case 626:
                return invoke$626(this);
            case 627:
                return invoke$627(this);
            case 628:
                return invoke$628(this);
            case 629:
                return invoke$629(this);
            case 630:
                return invoke$630(this);
            case 631:
                return invoke$631(this);
            case 632:
                return invoke$632(this);
            case 633:
                return invoke$633(this);
            case 634:
                return invoke$634(this);
            case 635:
                return invoke$635(this);
            case 636:
                return invoke$636(this);
            case 637:
                return invoke$637(this);
            case 638:
                return invoke$638(this);
            case 639:
                return invoke$639(this);
            case 640:
                return invoke$640(this);
            case 641:
                return invoke$641(this);
            case 642:
                return invoke$642(this);
            case 643:
                return invoke$643(this);
            case 644:
                return invoke$644(this);
            case 645:
                return invoke$645(this);
            case 646:
                return invoke$646(this);
            case 647:
                return invoke$647(this);
            case 648:
                return invoke$648(this);
            case 649:
                return invoke$649(this);
            case 650:
                return invoke$650(this);
            case 651:
                return invoke$651(this);
            case 652:
                return invoke$652(this);
            case 653:
                return invoke$653(this);
            case 654:
                return invoke$654(this);
            case 655:
                return invoke$655(this);
            case 656:
                return invoke$656(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C5182020e c5182020e) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C441801nk((C19EG) c5182020e.l0, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Failed to parse commerce lynx card: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$100(C5182020e c5182020e) {
        long jLongValue;
        Long l;
        RestartParams restartParams = new RestartParams();
        DataChannel dataChannel = ((ViewerWishesViewModel) c5182020e.l0).LL;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        restartParams.roomId = jLongValue;
        C480460Ism.LIZ().getClass();
        ((ViewerWishesApi) C480460Ism.LIZLLL(ViewerWishesApi.class)).restartViewerWishes(restartParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Mt
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ViewerWishesViewModel@1380.handleEndStatus$1$1");
                C1C7U.LIZIZ("ViewerWishesViewModel@1380.handleEndStatus$1$1");
            }
        }, new C09JN() { // from class: X.00Mu
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("ViewerWishesViewModel@1380.handleEndStatus$1$2");
                C1C7U.LIZIZ("ViewerWishesViewModel@1380.handleEndStatus$1$2");
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$101(C5182020e c5182020e) {
        return ((GiftWidgetKotlin) c5182020e.l0).LLLF;
    }

    public static final Object invoke$102(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((C018C) c5182020e.l0).LIZ.name());
        sbLIZ.append("_live_features_repo");
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final Object invoke$103(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ttmStarShipRunPitayaTask result:");
        sbLIZ.append(((C259800zU) c5182020e.l0).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$104(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startRequest: error:");
        sbLIZ.append((Throwable) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$105(C5182020e c5182020e) {
        Iterator it2 = ((List) c5182020e.l0).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$106(C5182020e c5182020e) {
        return new ViewModelProvider((EditFundraiserPageFragment) c5182020e.l0, new ViewModelProvider.Factory() { // from class: X.01O7
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends ViewModel> T create(Class<T> cls) {
                return new EditFundraiserPageViewModel();
            }
        }).get(EditFundraiserPageViewModel.class);
    }

    public static final Object invoke$107(C5182020e c5182020e) {
        if (((BubbleClickAction) c5182020e.l0).liveBagInfo != null) {
            try {
                return (Map) C08JS.LIZIZ().LJIIIIZZ(((BubbleClickAction) c5182020e.l0).liveBagInfo, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00W4
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static final Object invoke$108(C5182020e c5182020e) {
        if (((PromotionBubble) c5182020e.l0).daInfo != null) {
            try {
                return (Map) C08JS.LIZIZ().LJIIIIZZ(((PromotionBubble) c5182020e.l0).daInfo, new TypeToken<Map<String, ? extends Object>>() { // from class: X.00W5
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static final Object invoke$109(C5182020e c5182020e) {
        Object c098200Yq;
        try {
            c098200Yq = a0.LJJLIIIJILLIZJL(((Keva) ((FavoritePowerViewPagerViewModel) c5182020e.l0).LLIZ.getValue()).getString("key_favorite_zero_num_tabs", ""), new String[]{","}, 0, 6);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Iterable iterable = (Iterable) c098200Yq;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LLIIIZ(iterable);
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$110(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$111(C5182020e c5182020e) {
        IMessageManager iMessageManager;
        C1ACA c1acaZ1 = ((LiveAiSummaryWidget) c5182020e.l0).z1();
        if (c1acaZ1 != null && (iMessageManager = c1acaZ1.LJJIIZ) != null) {
            iMessageManager.needMessage();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$112(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$113(C5182020e c5182020e) {
        IMessageManager iMessageManager;
        C1ACA c1acaZ1 = ((PreviewGameGuessBoardWidget) c5182020e.l0).z1();
        if (c1acaZ1 != null && (iMessageManager = c1acaZ1.LJJIIZ) != null) {
            iMessageManager.needMessage();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$114(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$115(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$116(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$117(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$118(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$119(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$120(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$121(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$122(C5182020e c5182020e) throws JSONException {
        if (((LandscapeFYPViewModel) c5182020e.l0).LLIZ.length() > 0) {
            List<Object> list = JsonExtKt.toList(new JSONArray(((LandscapeFYPViewModel) c5182020e.l0).LLIZ));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toString());
            }
            return new ArrayList(arrayList);
        }
        return new ArrayList();
    }

    public static final Object invoke$123(C5182020e c5182020e) {
        ((MessageRequestRootFragment) c5182020e.l0).getClass();
        C0YOP.LIZ("enter_message_request_page", true, 0, null, 28);
        C880960YhC.LIZ.getClass();
        C23250099c.LIZLLL((InterfaceC497601wk) C880960YhC.LIZIZ.getValue(), null, null, new C427501lR(null), 3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$124(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$125(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$126(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$127(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$128(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$129(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$130(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$131(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$132(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$133(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$134(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$135(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$136(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$137(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$138(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$139(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$140(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$141(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareServerSortFilterTracker-report: ");
        sbLIZ.append((Map) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$142(C5182020e c5182020e) throws Throwable {
        C23250099c.LJ(C23271099x.INSTANCE, new C01L7((Function1) c5182020e.l0, null));
        return Unit.LIZ;
    }

    public static final Object invoke$143(C5182020e c5182020e) {
        return ((ArtistMusicAwemeLisHintCell) c5182020e.l0).itemView.findViewById(R.id.tv_selectFeaturedVideo_description);
    }

    public static final Object invoke$144(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load config failed: ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$145(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Coroutine error in selfPreload throwable:");
        sbLIZ.append((Throwable) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$146(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_detail_favorite_button_");
        sbLIZ.append(((View) c5182020e.l0).hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$147(C5182020e c5182020e) {
        ((C013C) c5182020e.l0).element = true;
        return Unit.LIZ;
    }

    public static final Object invoke$148(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_detail_shop_cta_assem_");
        sbLIZ.append(((View) c5182020e.l0).hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$149(C5182020e c5182020e) {
        User author;
        String uid;
        Aweme aweme = (Aweme) ((C01GW) c5182020e.l0).getValue();
        if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public static final Object invoke$15(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Before Call onPlayComplete CurrentPositionWithMatchedSourceIdResult= ");
        sbLIZ.append((Object) C189200o6.m9toStringimpl(c5182020e.l0));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$150(C5182020e c5182020e) {
        ((Function0) c5182020e.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$151(C5182020e c5182020e) {
        HashMap map = (HashMap) c5182020e.l0;
        if (map != null) {
            map.put("to_status", "disabled");
            C20684815ws.LJIILLIIL("disable_comment", (HashMap) c5182020e.l0);
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$152(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeData error: ");
        sbLIZ.append((Throwable) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$153(C5182020e c5182020e) {
        View view;
        Bitmap bitmap = ((TakoViewLargeImageDialogFragment) c5182020e.l0).LLILZIL;
        if (bitmap != null && !bitmap.isRecycled() && (view = ((TakoViewLargeImageDialogFragment) c5182020e.l0).getView()) != null) {
            TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment = (TakoViewLargeImageDialogFragment) c5182020e.l0;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(takoViewLargeImageDialogFragment.getViewLifecycleOwner()), C0PEM.LIZJ, null, new C464201rM(view.getContext(), bitmap, takoViewLargeImageDialogFragment, view, null), 2);
        }
        TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment2 = (TakoViewLargeImageDialogFragment) c5182020e.l0;
        takoViewLargeImageDialogFragment2.getClass();
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, takoViewLargeImageDialogFragment2.LLIZ, "save", "ai_drawing", null, takoViewLargeImageDialogFragment2.LLILLJJLI, null, 104);
        return Unit.LIZ;
    }

    public static final Object invoke$154(C5182020e c5182020e) {
        View view = ((TakoViewLargeImageDialogFragment) c5182020e.l0).getView();
        if (view != null) {
            TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment = (TakoViewLargeImageDialogFragment) c5182020e.l0;
            C12FK.LIZ(view, takoViewLargeImageDialogFragment.LL, takoViewLargeImageDialogFragment.LLILLJJLI, takoViewLargeImageDialogFragment.LLIZ, takoViewLargeImageDialogFragment.LLILLL, takoViewLargeImageDialogFragment.LLILZ);
        }
        TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment2 = (TakoViewLargeImageDialogFragment) c5182020e.l0;
        takoViewLargeImageDialogFragment2.getClass();
        C1862330yYx.LJLJJL(C1862330yYx.LIZ, takoViewLargeImageDialogFragment2.LLIZ, "post", "ai_drawing", null, takoViewLargeImageDialogFragment2.LLILLJJLI, null, 104);
        return Unit.LIZ;
    }

    public static final Object invoke$155(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("readySet = ");
        sbLIZ.append((List) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$156(C5182020e c5182020e) {
        return new Boolean[((InterfaceC346201Wa[]) c5182020e.l0).length];
    }

    public static final Object invoke$157(C5182020e c5182020e) {
        return Boolean.valueOf(C0UC4.LJJIII.containsKey(Long.valueOf(((LiveEffect) c5182020e.l0).getEffectId())));
    }

    public static final Object invoke$158(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create/load exception: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$159(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(C5182020e c5182020e) {
        C1819620xS4.LIZ().LJIJ(((PreviewGameDropsWidget) c5182020e.l0).J1().intValue()).LJJI((View) ((PreviewGameDropsWidget) c5182020e.l0).LLJIJIL.getValue());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$160(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$161(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$162(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$163(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$164(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$165(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$166(C5182020e c5182020e) {
        C20684815ws.LJIILLIIL("tool_performance_publish_check_cancel", ((C2344009Gk) c5182020e.l0).LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$167(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("comp visible error:");
        sbLIZ.append((JSONObject) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$168(C5182020e c5182020e) throws JSONException {
        Long lValueOf;
        JSONObject jSONObject = new JSONObject();
        ChatMessage chatMessage = (ChatMessage) ((IMessage) c5182020e.l0);
        jSONObject.put("message", chatMessage.content);
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.android.live.base.model.user.User user = chatMessage.userInfo;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        jSONObject2.put("uid", lValueOf);
        jSONObject.put("user", jSONObject2);
        return jSONObject;
    }

    public static final Object invoke$169(C5182020e c5182020e) throws JSONException {
        Long lValueOf;
        JSONObject jSONObject = new JSONObject();
        LikeMessage likeMessage = (LikeMessage) ((IMessage) c5182020e.l0);
        jSONObject.put("total_count", likeMessage.total);
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.android.live.base.model.user.User user = likeMessage.user;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        jSONObject2.put("uid", lValueOf);
        jSONObject.put("user", jSONObject2);
        return jSONObject;
    }

    public static final Object invoke$17(C5182020e c5182020e) {
        return new C513601zK((C310701Ij) c5182020e.l0, 0);
    }

    public static final Object invoke$170(C5182020e c5182020e) throws JSONException {
        Long lValueOf;
        JSONObject jSONObject = new JSONObject();
        SocialMessage socialMessage = (SocialMessage) ((IMessage) c5182020e.l0);
        jSONObject.put("total_share_count", socialMessage.shareCount);
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.android.live.base.model.user.User user = socialMessage.user;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        jSONObject2.put("uid", lValueOf);
        jSONObject.put("user", jSONObject2);
        return jSONObject;
    }

    public static final Object invoke$171(C5182020e c5182020e) throws JSONException {
        Long lValueOf;
        JSONObject jSONObject = new JSONObject();
        SocialMessage socialMessage = (SocialMessage) ((IMessage) c5182020e.l0);
        jSONObject.put("total_follow_count", socialMessage.followCount.longValue());
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.android.live.base.model.user.User user = socialMessage.user;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        jSONObject2.put("uid", lValueOf);
        jSONObject.put("user", jSONObject2);
        return jSONObject;
    }

    public static /* bridge */ /* synthetic */ Object invoke$172(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$173(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$174(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixVoListModelStore: refreshFromStartTypeByOrder: filter/sort request, check whitelist section types whitelist=");
        sbLIZ.append((List) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$175(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$176(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$177(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$178(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$179(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$18(C5182020e c5182020e) {
        C766270U4b.LJIIJJI(((C501470JlZ) ((Throwable) c5182020e.l0)).getPrompt());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$180(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$181(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$182(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$183(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$184(C5182020e c5182020e) {
        C248300xd c248300xd = (C248300xd) c5182020e.l0;
        final InterfaceC246900xP interfaceC246900xP = c248300xd.LIZIZ;
        final InterfaceC950820aqm interfaceC950820aqm = c248300xd.LIZJ;
        return new AbstractC246700xN(interfaceC246900xP, interfaceC950820aqm) { // from class: X.00xH
            public boolean LJII;
            public long LJI = -1;
            public int LJIIIIZZ = -1;

            @Override // X.AbstractC246700xN
            public final void LIZLLL() {
            }

            @Override // X.AbstractC246700xN, X.InterfaceC248400xe
            public final void release() {
                super.release();
                this.LJI = -1L;
                this.LJII = false;
                this.LJIIIIZZ = -1;
            }

            @Override // X.AbstractC246700xN
            public final void LIZJ(CohostHistoryResponse.ResponseData responseData) {
                List<CohostHistoryResponse.CohostSession> list;
                long j;
                long j2;
                List<CohostHistoryResponse.MatchRecord.Team.User> list2;
                if (responseData != null && (list = responseData.cohostSessions) != null) {
                    for (CohostHistoryResponse.CohostSession cohostSession : list) {
                        long j3 = cohostSession.startTimestampSec * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                        long j4 = this.LJI;
                        if (j4 <= 0 || !C963140bAe.LJ(j3, j4)) {
                            this.LJI = j3;
                            ((ArrayList) this.LIZJ).add(new C963070bAX(j3, !this.LJII));
                            this.LJII = true;
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        List<CohostHistoryResponse.MatchRecord> list3 = cohostSession.matchRecords;
                        ArrayList<CohostHistoryResponse.MatchRecord> arrayList = new ArrayList();
                        for (CohostHistoryResponse.MatchRecord matchRecord : list3) {
                            CohostHistoryResponse.MatchRecord matchRecord2 = matchRecord;
                            if (matchRecord2 != null && (matchRecord2.matchType == EnumC919170a1j.MATCH_TYPE_1V1.getType() || matchRecord2.matchType == EnumC919170a1j.MATCH_TYPE_2V2.getType() || matchRecord2.matchType == EnumC919170a1j.MATCH_TYPE_INDIVIDUAL.getType() || matchRecord2.matchType == EnumC919170a1j.MATCH_TYPE_1VN.getType())) {
                                arrayList.add(matchRecord);
                            }
                        }
                        for (CohostHistoryResponse.MatchRecord matchRecord3 : arrayList) {
                            CohostHistoryResponse.MatchRecord.Team team = matchRecord3.myTeam;
                            if (team != null && (list2 = team.users) != null) {
                                Iterator<CohostHistoryResponse.MatchRecord.Team.User> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    linkedHashSet.add(Long.valueOf(it2.next().userId));
                                }
                            }
                            Iterator<CohostHistoryResponse.MatchRecord.Team> it3 = matchRecord3.opposingTeams.iterator();
                            while (it3.hasNext()) {
                                Iterator<CohostHistoryResponse.MatchRecord.Team.User> it4 = it3.next().users.iterator();
                                while (it4.hasNext()) {
                                    linkedHashSet.add(Long.valueOf(it4.next().userId));
                                }
                            }
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        Iterator<CohostHistoryResponse.TakeTheStageRecord> it5 = cohostSession.takeTheStageRecords.iterator();
                        while (it5.hasNext()) {
                            Iterator<CohostHistoryResponse.TakeTheStageRecord.TakeTheStageUser> it6 = it5.next().otherTakeTheStageInfos.iterator();
                            while (it6.hasNext()) {
                                linkedHashSet2.add(Long.valueOf(it6.next().userId));
                            }
                        }
                        SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                        String str = simpleDateFormat2.format(new Date(j3));
                        if (linkedHashSet.size() > 0 && linkedHashSet2.size() > 0) {
                            CohostHistoryResponse.MatchRecord matchRecord4 = (CohostHistoryResponse.MatchRecord) C13LP.LJJJLZIJ(0, arrayList);
                            if (matchRecord4 != null) {
                                j = matchRecord4.startTimestampSec;
                            } else {
                                j = 0;
                            }
                            CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord = (CohostHistoryResponse.TakeTheStageRecord) C13LP.LJJJLZIJ(0, cohostSession.takeTheStageRecords);
                            if (takeTheStageRecord != null) {
                                j2 = takeTheStageRecord.startTimestampSec;
                            } else {
                                j2 = 0;
                            }
                            if (j >= j2) {
                                List<CohostHistoryResponse.CohostSession.Host> list4 = cohostSession.hosts;
                                ArrayList arrayList2 = new ArrayList();
                                for (CohostHistoryResponse.CohostSession.Host host : list4) {
                                    if (linkedHashSet.contains(Long.valueOf(host.userId))) {
                                        arrayList2.add(host);
                                    }
                                }
                                LJFF(j3, str, responseData, arrayList2, arrayList, null);
                                List<CohostHistoryResponse.CohostSession.Host> list5 = cohostSession.hosts;
                                ArrayList arrayList3 = new ArrayList();
                                for (CohostHistoryResponse.CohostSession.Host host2 : list5) {
                                    if (linkedHashSet2.contains(Long.valueOf(host2.userId))) {
                                        arrayList3.add(host2);
                                    }
                                }
                                LJFF(j3, str, responseData, arrayList3, null, cohostSession.takeTheStageRecords);
                            } else {
                                List<CohostHistoryResponse.CohostSession.Host> list6 = cohostSession.hosts;
                                ArrayList arrayList4 = new ArrayList();
                                for (CohostHistoryResponse.CohostSession.Host host3 : list6) {
                                    if (linkedHashSet2.contains(Long.valueOf(host3.userId))) {
                                        arrayList4.add(host3);
                                    }
                                }
                                LJFF(j3, str, responseData, arrayList4, null, cohostSession.takeTheStageRecords);
                                List<CohostHistoryResponse.CohostSession.Host> list7 = cohostSession.hosts;
                                ArrayList arrayList5 = new ArrayList();
                                for (CohostHistoryResponse.CohostSession.Host host4 : list7) {
                                    if (linkedHashSet.contains(Long.valueOf(host4.userId))) {
                                        arrayList5.add(host4);
                                    }
                                }
                                LJFF(j3, str, responseData, arrayList5, arrayList, null);
                            }
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            linkedHashSet3.addAll(linkedHashSet);
                            linkedHashSet3.addAll(linkedHashSet2);
                            if (linkedHashSet3.size() < cohostSession.hosts.size()) {
                                LJFF(j3, str, responseData, cohostSession.hosts, null, null);
                            }
                        } else if (arrayList.isEmpty()) {
                            LJFF(j3, str, responseData, cohostSession.hosts, null, cohostSession.takeTheStageRecords);
                        } else {
                            LJFF(j3, str, responseData, cohostSession.hosts, arrayList, null);
                        }
                    }
                }
            }

            public final void LJFF(long j, String str, CohostHistoryResponse.ResponseData responseData, List<CohostHistoryResponse.CohostSession.Host> list, List<CohostHistoryResponse.MatchRecord> list2, List<CohostHistoryResponse.TakeTheStageRecord> list3) {
                int size;
                int size2;
                boolean z;
                int size3;
                int size4;
                boolean z2;
                String string;
                String string2;
                CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord;
                CohostHistoryResponse.TakeTheStageRecord.TakeTheStageUser takeTheStageUser;
                List<C955670ayb> list4 = this.LIZJ;
                int i = 0;
                if (list2 != null) {
                    size = ((ArrayList) list2).size();
                } else {
                    size = 0;
                }
                if (list3 != null) {
                    size2 = list3.size();
                } else {
                    size2 = 0;
                }
                ((ArrayList) list4).add(new C963110bAb(size, size2, j));
                this.LJIIIIZZ++;
                C955810ayp c955810ayp = null;
                for (CohostHistoryResponse.CohostSession.Host host : list) {
                    CohostHistoryResponse.UserInfo userInfo = responseData.userInfos.get(Long.valueOf(host.userId));
                    if (userInfo != null) {
                        Room room = userInfo.room;
                        RivalExtraInfo rivalExtraInfo = userInfo.extraInfo;
                        if (room != null && rivalExtraInfo != null) {
                            int i2 = this.LJIIIIZZ;
                            long j2 = host.historyGroupChannelId;
                            if (list2 != null) {
                                string = Integer.valueOf(((ArrayList) list2).size()).toString();
                            } else {
                                string = null;
                            }
                            if (list3 != null && (takeTheStageRecord = (CohostHistoryResponse.TakeTheStageRecord) C13LP.LJJJLZIJ(i, list3)) != null && (takeTheStageUser = takeTheStageRecord.myTakeTheStageInfo) != null) {
                                string2 = Long.valueOf(takeTheStageUser.rank).toString();
                            } else {
                                string2 = null;
                            }
                            C955810ayp c955810ayp2 = new C955810ayp(room, rivalExtraInfo, i2, str, j2, string, string2);
                            ((ArrayList) this.LIZJ).add(c955810ayp2);
                            if (c955810ayp == null) {
                                c955810ayp2.LJJIIZ = true;
                            }
                            c955810ayp = c955810ayp2;
                            i = 0;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if ((list2 == null || ((ArrayList) list2).isEmpty()) && (list3 == null || list3.isEmpty())) {
                    if (c955810ayp != null) {
                        c955810ayp.LJJIIZI = true;
                        return;
                    }
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (list2 != null) {
                    z = true;
                    for (CohostHistoryResponse.MatchRecord matchRecord : (ArrayList) list2) {
                        C246300xJ c246300xJ = new C246300xJ(matchRecord, responseData.userInfos, this.LJIIIIZZ, str, matchRecord.historyGroupChannelId, z);
                        if (arrayList.size() < 2) {
                            arrayList.add(c246300xJ);
                        }
                        arrayList2.add(c246300xJ);
                        z = false;
                    }
                } else {
                    z = true;
                }
                if (list3 != null) {
                    for (CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord2 : list3) {
                        C246400xK c246400xK = new C246400xK(takeTheStageRecord2, responseData.userInfos, this.LJIIIIZZ, str, takeTheStageRecord2.historyGroupChannelId, z);
                        if (arrayList.size() < 2) {
                            arrayList.add(c246400xK);
                        }
                        arrayList2.add(c246400xK);
                        z = false;
                    }
                }
                List<C955670ayb> list5 = this.LIZJ;
                if (list2 != null) {
                    size3 = ((ArrayList) list2).size();
                } else {
                    size3 = 0;
                }
                if (list3 != null) {
                    size4 = list3.size();
                } else {
                    size4 = 0;
                }
                if (Math.max(size3, size4) <= 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ((ArrayList) list5).add(new C963060bAW(arrayList, arrayList2, z2));
            }
        };
    }

    public static final Object invoke$185(C5182020e c5182020e) {
        if (((InterfaceC20236714Gf) c5182020e.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5182020e.l0;
            Boolean bool = Boolean.TRUE;
            C189200o6.m2constructorimpl(bool);
            interfaceC20236714Gf.resumeWith(bool);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$186(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$187(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackerList = ");
        sbLIZ.append(C13LP.LJJLIIIJ((List) c5182020e.l0, ",", null, null, 0, null, null, 62));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$188(C5182020e c5182020e) {
        String aid;
        Aweme aweme = (Aweme) ((Function0) c5182020e.l0).invoke();
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    public static /* bridge */ /* synthetic */ Object invoke$189(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$190(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$191(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$192(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$193(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$194(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendEvent logParams: ");
        sbLIZ.append((Map) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$195(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openSeaPudoMap, dataMap = ");
        sbLIZ.append((HashMap) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$196(C5182020e c5182020e) {
        return ((C490301vZ) c5182020e.l0).LL.LJ();
    }

    public static final Object invoke$197(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: [WidgetsInfo] Failed to update widgets_info in shared_data: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$198(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixFloatingLayer: CartWidget: displayCartWidget error: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$199(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeniusAnimationController");
        sbLIZ.append(((C15B9) c5182020e.l0).hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$20(C5182020e c5182020e) {
        return (AbstractC405601hu) c5182020e.l0;
    }

    public static /* bridge */ /* synthetic */ Object invoke$200(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$201(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$202(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkRedirectSharedVideo - check result: ");
        sbLIZ.append((Pair) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$203(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkRedirectSharedVideo - redirect start: ");
        sbLIZ.append((Uri) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$204(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$205(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$206(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$207(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.TRUE, "");
        return Unit.LIZ;
    }

    public static final Object invoke$208(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.FALSE, "");
        return Unit.LIZ;
    }

    public static final Object invoke$209(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.TRUE, "");
        return Unit.LIZ;
    }

    public static final Object invoke$21(C5182020e c5182020e) {
        return (AbstractC405601hu) c5182020e.l0;
    }

    public static final Object invoke$210(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.FALSE, "");
        return Unit.LIZ;
    }

    public static final Object invoke$211(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.FALSE, "cancel");
        return Unit.LIZ;
    }

    public static final Object invoke$212(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.TRUE, "");
        return Unit.LIZ;
    }

    public static final Object invoke$213(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.FALSE, "");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$214(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$215(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$216(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$217(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$218(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$219(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$22(C5182020e c5182020e) {
        final C1100730ekZ c1100730ekZ = ((C404401hi) c5182020e.l0).LIZ;
        return new InterfaceC381401e0<C923800a9C, Unit>(c1100730ekZ) { // from class: X.0eka
            public final C1100730ekZ LIZ;
            public final int LIZIZ;
            public final String LIZJ;
            public final Function1<C923800a9C, Unit> LIZLLL;

            @Override // X.InterfaceC381401e0
            public final String getContext() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC381401e0
            public final int getType() {
                return this.LIZIZ;
            }

            {
                int iOrdinal = EnumC405401hs.COLLECT_DATA.ordinal();
                this.LIZ = c1100730ekZ;
                this.LIZIZ = iOrdinal;
                this.LIZJ = "IO";
                this.LIZLLL = null;
            }

            /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
            @Override // X.InterfaceC381401e0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ(X.C923800a9C r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
                /*
                    Method dump skipped, instruction units count: 404
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1100740eka.LIZ(java.lang.Object, X.05Vn):java.lang.Object");
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$220(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$221(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$222(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$223(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$224(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$225(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$226(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$227(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$228(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$229(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$23(C5182020e c5182020e) {
        List<TextPiece> list;
        TextPieceUser textPieceUser;
        Text text;
        CommonMessageData commonMessageData = ((RoomMessage) c5182020e.l0).baseMessage;
        if (commonMessageData != null && (text = commonMessageData.displayText) != null) {
            list = text.pieces;
        } else {
            list = null;
        }
        TextPiece textPieceLJI = C1133830fbx.LJI(list);
        if (textPieceLJI == null || (textPieceUser = textPieceLJI.userValue) == null) {
            return null;
        }
        return textPieceUser.user;
    }

    public static /* bridge */ /* synthetic */ Object invoke$230(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$231(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$232(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$233(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$234(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$235(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$236(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$237(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4m);
    }

    public static final Object invoke$238(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4u);
    }

    public static final Object invoke$239(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4r);
    }

    public static /* bridge */ /* synthetic */ Object invoke$24(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$240(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4v);
    }

    public static final Object invoke$241(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.zsd);
    }

    public static final Object invoke$242(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4t);
    }

    public static final Object invoke$243(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l3o);
    }

    public static final Object invoke$244(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l3s);
    }

    public static final Object invoke$245(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4w);
    }

    public static final Object invoke$246(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4x);
    }

    public static final Object invoke$247(C5182020e c5182020e) {
        return ((C431201m2) c5182020e.l0).itemView.findViewById(R.id.l4p);
    }

    public static final Object invoke$248(C5182020e c5182020e) {
        if (!((C369601c6) c5182020e.l0).LIZIZ().getBoolean("has_clear_cache", false)) {
            ((C369601c6) c5182020e.l0).LIZIZ().storeBoolean("has_clear_cache", true);
            ((C369601c6) c5182020e.l0).LIZIZ().erase("cahce_resource");
        }
        String string = ((C369601c6) c5182020e.l0).LIZIZ().getString("cahce_resource_new", "");
        HashMap map = new LinkedHashMap<String, String>() { // from class: X.083r
            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
                return getEntries();
            }

            public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
                return super.entrySet();
            }

            public /* bridge */ Set<String> getKeys() {
                return super.keySet();
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ Collection<String> getValues() {
                return super.values();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Set<String> keySet() {
                return getKeys();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ Collection<String> values() {
                return getValues();
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsKey(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsKey((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ boolean containsValue(Object obj) {
                if (!(obj instanceof String)) {
                    return false;
                }
                return containsValue((String) obj);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
                if (size() > 30) {
                    return true;
                }
                return false;
            }

            public /* bridge */ boolean containsKey(String str) {
                return super.containsKey((Object) str);
            }

            public /* bridge */ boolean containsValue(String str) {
                return super.containsValue((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String get(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return get((String) obj);
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            public final /* bridge */ String remove(Object obj) {
                if (!(obj instanceof String)) {
                    return null;
                }
                return remove((String) obj);
            }

            public /* bridge */ String get(String str) {
                return (String) super.get((Object) str);
            }

            public /* bridge */ String remove(String str) {
                return (String) super.remove((Object) str);
            }

            @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
            public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
                if (!(obj instanceof String)) {
                    return obj2;
                }
                return getOrDefault((String) obj, (String) obj2);
            }

            @Override // java.util.HashMap, java.util.Map
            public final /* bridge */ boolean remove(Object obj, Object obj2) {
                if (!(obj instanceof String) || !(obj2 instanceof String)) {
                    return false;
                }
                return remove((String) obj, (String) obj2);
            }

            public final /* bridge */ String getOrDefault(Object obj, String str) {
                if (!(obj instanceof String)) {
                    return str;
                }
                return getOrDefault((String) obj, str);
            }

            public /* bridge */ boolean remove(String str, String str2) {
                return super.remove((Object) str, (Object) str2);
            }

            public /* bridge */ String getOrDefault(String str, String str2) {
                return (String) super.getOrDefault((Object) str, str2);
            }
        };
        try {
            Type type = new TypeToken<List<? extends Pair<? extends String, ? extends String>>>() { // from class: X.00W2
            }.getType();
            C1227904rF.LIZ.getClass();
            for (Pair pair : (List) C1227904rF.LIZJ(string, type)) {
                map.put(pair.getFirst(), pair.getSecond());
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return map;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$249(C5182020e c5182020e) {
        ((C01HJ) c5182020e.l0).LLJJIJI.LJII();
        C306901Gx.LJIIJ("banner");
        InterfaceC934710aQn.Rb.LJFF(Boolean.TRUE);
        C01HJ c01hj = (C01HJ) c5182020e.l0;
        c01hj.dismiss();
        C785410UrT.LIZ(c01hj);
        return Unit.LIZ;
    }

    public static final Object invoke$25(C5182020e c5182020e) {
        Object objGg0;
        DataChannel dataChannel = ((C443301nz) c5182020e.l0).LLILLJJLI;
        if (dataChannel == null || (objGg0 = dataChannel.gg0(C749180Ta8.class)) == null) {
            return C13BV.INSTANCE;
        }
        return objGg0;
    }

    public static /* bridge */ /* synthetic */ Object invoke$250(C5182020e c5182020e) {
        C01HJ c01hj = (C01HJ) c5182020e.l0;
        c01hj.LLJJIJI.LJFF(c01hj.LJLIIL(), ((C01HJ) c5182020e.l0).LLJJJJLIIL);
        C01HJ c01hj2 = (C01HJ) c5182020e.l0;
        c01hj2.dismiss();
        C785410UrT.LIZ(c01hj2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$251(C5182020e c5182020e) {
        if (C930540aK4.LIZJ()) {
            C01HA.LIZIZ(null);
        }
        C01HJ c01hj = (C01HJ) c5182020e.l0;
        c01hj.dismiss();
        C785410UrT.LIZ(c01hj);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$252(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$253(C5182020e c5182020e) {
        Throwable th = (Throwable) c5182020e.l0;
        if (th instanceof C477520Io2) {
            if (C500260Jjc.LJJIIZ(((C501470JlZ) th).getPrompt())) {
                C766270U4b.LJIIJJI(((C501470JlZ) ((Throwable) c5182020e.l0)).getPrompt());
            }
        } else if ((th instanceof C1494450ozb) || (th instanceof C1494690ozz)) {
            C766270U4b.LIZLLL(2131852422);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$254(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("verify success ");
        sbLIZ.append(((List) c5182020e.l0).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$255(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("relationInfo = ");
        sbLIZ.append((Map) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$256(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("relation parse error = ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$257(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$258(C5182020e c5182020e) {
        RoomCreateInfo roomCreateInfo;
        DataChannel dataChannel;
        LiveMode liveMode;
        DataChannel dataChannel2 = (DataChannel) c5182020e.l0;
        boolean z = true;
        if (dataChannel2 == null || (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) == null || !roomCreateInfo.anchorCanOpenCaption || (dataChannel = (DataChannel) c5182020e.l0) == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || !C354201Zc.LJFF(liveMode)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$259(C5182020e c5182020e) {
        RoomCreateInfo roomCreateInfo;
        DataChannel dataChannel;
        LiveMode liveMode;
        DataChannel dataChannel2 = (DataChannel) c5182020e.l0;
        boolean z = true;
        if (dataChannel2 == null || (roomCreateInfo = (RoomCreateInfo) dataChannel2.gg0(RoomCreateInfoChannel.class)) == null || roomCreateInfo.streamTranslationState != 1 || (dataChannel = (DataChannel) c5182020e.l0) == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || !C354201Zc.LJFF(liveMode)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$26(C5182020e c5182020e) {
        C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131855747, ((PartnershipDropsAnchorMessage) ((IMessage) c5182020e.l0)).dropsName));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$260(X.C5182020e r2) {
        /*
            java.lang.Object r1 = r2.l0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = (com.bytedance.ies.sdk.datachannel.DataChannel) r1
            r2 = 0
            if (r1 == 0) goto L37
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveModeChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = (com.bytedance.android.livesdkapi.depend.model.live.LiveMode) r1
            if (r1 == 0) goto L38
            boolean r0 = X.C354201Zc.LJFF(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L19:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L35
            if (r1 == 0) goto L29
            boolean r0 = X.C354201Zc.LIZJ(r1)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L29:
            boolean r0 = X.C500260Jjc.LJJJI(r2)
            if (r0 != 0) goto L35
            r0 = 0
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L35:
            r0 = 1
            goto L30
        L37:
            r1 = r2
        L38:
            r0 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5182020e.invoke$260(X.020e):java.lang.Object");
    }

    public static final Object invoke$261(C5182020e c5182020e) {
        Boolean boolValueOf;
        RoomCreateInfo roomCreateInfo;
        DataChannel dataChannel = (DataChannel) c5182020e.l0;
        if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(roomCreateInfo.isNewAnchor);
        } else {
            boolValueOf = null;
        }
        return Boolean.valueOf(C500260Jjc.LJJIFFI(boolValueOf));
    }

    public static final Object invoke$262(C5182020e c5182020e) {
        LiveMode liveMode;
        boolean z;
        DataChannel dataChannel = (DataChannel) c5182020e.l0;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        if (C760180Trs.LJI() && (C781520UlC.LIZ(liveMode) || C781520UlC.LJIIIZ(liveMode))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$263(C5182020e c5182020e) {
        Boolean boolValueOf;
        RoomCreateInfo roomCreateInfo;
        AgeRestrictedConfig ageRestrictedConfig;
        DataChannel dataChannel = (DataChannel) c5182020e.l0;
        if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.gg0(RoomCreateInfoChannel.class)) != null && (ageRestrictedConfig = roomCreateInfo.ageRestrictedConfig) != null) {
            boolValueOf = Boolean.valueOf(ageRestrictedConfig.show);
        } else {
            boolValueOf = null;
        }
        return Boolean.valueOf(C500260Jjc.LJJJI(boolValueOf));
    }

    public static /* bridge */ /* synthetic */ Object invoke$264(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$265(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$266(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$267(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$268(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$269(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$27(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$270(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$271(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$272(C5182020e c5182020e) {
        if (((InterfaceC20236714Gf) c5182020e.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c5182020e.l0;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$273(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$274(C5182020e c5182020e) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        InterfaceC1541990qEH interfaceC1541990qEH2;
        C1537480q70 hybridContext;
        String strLIZIZ;
        C01CN c01cn = (C01CN) ((WeakReference) c5182020e.l0).get();
        if (c01cn != null && (interfaceC1541990qEH = c01cn.LIZIZ) != null && !interfaceC1541990qEH.T0()) {
            C01CN c01cn2 = (C01CN) ((WeakReference) c5182020e.l0).get();
            String strLJIJI = null;
            if (c01cn2 != null && (interfaceC1541990qEH2 = c01cn2.LIZIZ) != null && (hybridContext = interfaceC1541990qEH2.getHybridContext()) != null && (strLJIJI = hybridContext.LJIJI()) != null) {
                Uri uriLIZIZ = AnonymousClass0187.LIZIZ(strLJIJI);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZIZ, "url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZIZ, "surl");
                }
                if (C1533950q1J.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                    Uri uriLIZIZ2 = AnonymousClass0187.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    if (!uriLIZIZ2.isHierarchical()) {
                        strLIZIZ = uriLIZIZ2.toString();
                    } else {
                        try {
                            strLIZIZ = uriLIZIZ2.buildUpon().clearQuery().toString();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            strLIZIZ = uriLIZIZ2.toString();
                        }
                    }
                } else {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZIZ, "channel");
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLIZIZ, "bundle");
                    if (C1533950q1J.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) && C1533950q1J.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("lynxview://");
                        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                        sbLIZ.append('/');
                        sbLIZ.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        strLIZIZ = strLJIJI;
                        strLJIJI = strLIZIZ;
                    }
                }
                if (strLIZIZ != null) {
                    strLJIJI = strLIZIZ;
                }
            }
            ((WeakReference) c5182020e.l0).get();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("find hybrid memory leak, schema = ");
            sbLIZ2.append(strLJIJI);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C1AF0.LIZJ(strLIZIZ2);
            CopyOnWriteArrayList<WeakReference<C01CN>> copyOnWriteArrayList = C01CM.LIZ;
            try {
                Npth.reportBizException("HybridMemoryLeak", new Throwable(strLIZIZ2), strLIZIZ2, new HashMap());
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$275(C5182020e c5182020e) {
        final C429301lj c429301lj = (C429301lj) c5182020e.l0;
        return new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.01lk
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C429301lj c429301lj2 = c429301lj;
                View view = c429301lj2.LIZ;
                if (view != null) {
                    view.getWindowVisibleDisplayFrame(c429301lj2.LIZLLL);
                    int iLJIIIIZZ = C12ES.LJIIIIZZ(view.getContext());
                    int i = iLJIIIIZZ - c429301lj2.LIZLLL.bottom;
                    if (iLJIIIIZZ <= 0 || i == c429301lj2.LIZJ) {
                        return;
                    }
                    c429301lj2.LIZJ = i;
                    if (i > 200) {
                        Function2<? super Boolean, ? super Integer, Unit> function2 = c429301lj2.LIZIZ;
                        if (function2 != null) {
                            function2.invoke(Boolean.TRUE, Integer.valueOf(i));
                            return;
                        }
                        return;
                    }
                    Function2<? super Boolean, ? super Integer, Unit> function22 = c429301lj2.LIZIZ;
                    if (function22 != null) {
                        function22.invoke(Boolean.FALSE, Integer.valueOf(Math.abs(i)));
                    }
                }
            }
        };
    }

    public static final Object invoke$276(C5182020e c5182020e) {
        final C303401Fo c303401Fo = (C303401Fo) c5182020e.l0;
        return new AbstractC303101Fl() { // from class: X.01Fn
            @Override // X.AbstractC303101Fl, X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                if (c303401Fo.LIZIZ.size() != C921170a4x.LIZJ(interfaceC921200a50)) {
                    C303401Fo c303401Fo2 = c303401Fo;
                    List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
                    ArrayList arrayList = new ArrayList();
                    for (LinkPlayerInfo linkPlayerInfo : listLIZ) {
                        LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                        if (room == null) {
                            room = (Room) dataChannelGlobal.gg0(C930930aKh.class);
                        }
                        if (room == null || linkPlayerInfo2.mUser.getId() != room.getOwnerUserId()) {
                            arrayList.add(linkPlayerInfo);
                        }
                    }
                    c303401Fo2.LIZIZ = arrayList;
                    Function1<? super List<? extends LinkPlayerInfo>, Unit> function1 = c303401Fo.LIZJ;
                    if (function1 != null) {
                        function1.invoke(c303401Fo.LIZIZ);
                    }
                }
            }

            @Override // X.AbstractC303101Fl, X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                Long lValueOf;
                if (c303401Fo.LIZIZ.size() != C921170a4x.LIZJ(interfaceC921200a50)) {
                    List<LinkListUser> listLIZ = interfaceC921200a50.LIZ();
                    ArrayList<LinkListUser> arrayList = new ArrayList();
                    for (LinkListUser linkListUser : listLIZ) {
                        com.bytedance.android.live.base.model.user.User user = linkListUser.user;
                        Long lValueOf2 = null;
                        if (user != null) {
                            lValueOf = Long.valueOf(user.getId());
                        } else {
                            lValueOf = null;
                        }
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                        if (room != null || (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) != null) {
                            lValueOf2 = Long.valueOf(room.getOwnerUserId());
                        }
                        if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                            arrayList.add(linkListUser);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (LinkListUser linkListUser2 : arrayList) {
                        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
                        linkPlayerInfo.mUser = linkListUser2.user;
                        linkPlayerInfo.mInteractIdStr = linkListUser2.linkMicId;
                        arrayList2.add(linkPlayerInfo);
                    }
                    c303401Fo.LIZIZ = arrayList2;
                    Function1<? super List<? extends LinkPlayerInfo>, Unit> function1 = c303401Fo.LIZJ;
                    if (function1 != null) {
                        function1.invoke(c303401Fo.LIZIZ);
                    }
                }
            }
        };
    }

    public static final Object invoke$277(C5182020e c5182020e) {
        final C311401Iq c311401Iq = (C311401Iq) c5182020e.l0;
        return new C01HG() { // from class: X.01Ir
            @Override // X.C01HG
            public final void LIZ(boolean z) {
                Function1<? super Boolean, Unit> function1 = c311401Iq.LIZ;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        };
    }

    public static final Object invoke$278(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportImageEvent: ");
        sbLIZ.append((Map) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$279(C5182020e c5182020e) {
        long jLJII;
        C20337914i1<Long> c20337914i1 = InterfaceC1106030et7.b5;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ == null || (jLJII = interfaceC302601FgLIZ.LJII()) == null) {
            jLJII = 0L;
        }
        c20337914i1.LJFF(jLJII);
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c5182020e.l0;
        if (interfaceC927510aFB != null) {
            interfaceC927510aFB.LJIIIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(C5182020e c5182020e) {
        final ApplyGuideViewModel applyGuideViewModel = (ApplyGuideViewModel) c5182020e.l0;
        return new InterfaceC1145110fu9(applyGuideViewModel) { // from class: X.01JT
            public final ApplyGuideViewModel LIZ;

            @Override // X.InterfaceC1145110fu9
            public final List<String> LIZ() {
                return Collections.singletonList("multi_guest_apply_guide");
            }

            {
                this.LIZ = applyGuideViewModel;
            }

            @Override // X.InterfaceC1145110fu9
            public final void LIZIZ(String str, C01JS c01js) {
                this.LIZ.xQ2(str, c01js, c01js.LJFF);
            }
        };
    }

    public static final Object invoke$280(C5182020e c5182020e) {
        InterfaceC927510aFB interfaceC927510aFB = (InterfaceC927510aFB) c5182020e.l0;
        if (interfaceC927510aFB != null) {
            interfaceC927510aFB.LJIIIZ();
        }
        InterfaceC1106030et7.b5.LJFF(0L);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$281(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$282(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$283(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$284(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$285(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$286(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$287(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$288(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: findStartRefreshTypeForFilterSort: exception while finding startRefreshType: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$289(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: onNext: chunk received, index=");
        sbLIZ.append(((C118300cf) c5182020e.l0).element + 1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$29(C5182020e c5182020e) {
        DataChannel dataChannel = ((BizSpotInfoCenter) c5182020e.l0).LIZ;
        if (dataChannel != null) {
            return dataChannel.gg0(C776250Uch.class);
        }
        return null;
    }

    public static final Object invoke$290(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMixRefreshRepo: Failed to parse page data: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$291(C5182020e c5182020e) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = ((Map) ((C292501Bj) c5182020e.l0).LIZ.getValue()).keySet().iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), 0);
        }
        return linkedHashMap;
    }

    public static final Object invoke$292(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PackageExecutionNode result:");
        sbLIZ.append(((C259800zU) c5182020e.l0).element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$293(C5182020e c5182020e) {
        return String.valueOf(ListProtector.get((ArrayList) c5182020e.l0, 0));
    }

    public static /* bridge */ /* synthetic */ Object invoke$294(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$295(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$296(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$297(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$298(C5182020e c5182020e) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezq, ((View) c5182020e.l0).getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$299(C5182020e c5182020e) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ezt, ((View) c5182020e.l0).getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$30(C5182020e c5182020e) {
        return ((C432101mB) c5182020e.l0).itemView.findViewById(R.id.xva);
    }

    public static final Object invoke$300(C5182020e c5182020e) {
        CharSequence text;
        boolean z = false;
        if (((TuxTextView) c5182020e.l0).getVisibility() == 0 && (text = ((TuxTextView) c5182020e.l0).getText()) != null && text.length() != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$301(C5182020e c5182020e) {
        CharSequence text;
        boolean z = false;
        if (((TuxTextView) c5182020e.l0).getVisibility() == 0 && (text = ((TuxTextView) c5182020e.l0).getText()) != null && text.length() != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$302(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$303(C5182020e c5182020e) {
        return ((C308101Hj) c5182020e.l0).itemView.findViewById(R.id.ezl);
    }

    public static final Object invoke$304(C5182020e c5182020e) {
        return ((C308101Hj) c5182020e.l0).itemView.findViewById(R.id.ezo);
    }

    public static final Object invoke$305(C5182020e c5182020e) {
        return ((C308101Hj) c5182020e.l0).itemView.findViewById(R.id.ezq);
    }

    public static final Object invoke$306(C5182020e c5182020e) {
        final GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) c5182020e.l0;
        return new InterfaceC305401Gi() { // from class: X.01Ge
            @Override // X.InterfaceC305401Gi
            public final void LIZ(C305201Gg c305201Gg) {
                GuestShowdownConfig guestShowdownConfig = c305201Gg.LIZ;
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel2 = guestShowdownAnchorViewModel;
                long j = guestShowdownConfig.duration;
                int i = guestShowdownConfig.loserNum;
                int i2 = guestShowdownConfig.winnerNum;
                guestShowdownAnchorViewModel2.getClass();
                C500260Jjc.LJJLIIIJILLIZJL(new C304101Fv(guestShowdownAnchorViewModel2, j, i, i2));
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
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
    public static final Object invoke$307(C5182020e c5182020e) {
        ?? arrayList;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Long lValueOf;
        LiveData liveData = ((GuestShowdownAnchorViewModel) c5182020e.l0).LLJI;
        InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJJIII) {
                com.bytedance.android.live.base.model.user.User user = ((LinkPlayerInfo) obj).mUser;
                Long lValueOf2 = null;
                if (user != null) {
                    lValueOf = Long.valueOf(user.getId());
                } else {
                    lValueOf = null;
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room != null || (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) != null) {
                    lValueOf2 = Long.valueOf(room.getOwnerUserId());
                }
                if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        liveData.setValue(arrayList);
        return Unit.LIZ;
    }

    public static final Object invoke$308(C5182020e c5182020e) {
        final GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) c5182020e.l0;
        return new InterfaceC922630a7J() { // from class: X.01Fm
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel2 = guestShowdownAnchorViewModel;
                guestShowdownAnchorViewModel2.getClass();
                C500260Jjc.LJJLIIIJILLIZJL(new C5182020e(guestShowdownAnchorViewModel2, 307));
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel2 = guestShowdownAnchorViewModel;
                guestShowdownAnchorViewModel2.getClass();
                C500260Jjc.LJJLIIIJILLIZJL(new C5182020e(guestShowdownAnchorViewModel2, 307));
            }
        };
    }

    public static final Object invoke$309(C5182020e c5182020e) {
        ((GuestShowdownAnchorWidget) c5182020e.l0).LLJILJIL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$31(C5182020e c5182020e) {
        return ((C432101mB) c5182020e.l0).itemView.findViewById(R.id.yfp);
    }

    public static final Object invoke$310(C5182020e c5182020e) {
        ((GuestShowdownAnchorWidget) c5182020e.l0).LLJILLL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$311(C5182020e c5182020e) {
        ((GuestShowdownAnchorWidget) c5182020e.l0).LLJILJILJ = null;
        return Unit.LIZ;
    }

    public static final Object invoke$312(C5182020e c5182020e) {
        final BasePlaybookViewModel basePlaybookViewModel = (BasePlaybookViewModel) c5182020e.l0;
        return new InterfaceC500101x9() { // from class: X.01x8
            @Override // X.InterfaceC500101x9
            public final void LIZ(ActivePlaybook activePlaybook, C20379114of c20379114of) {
                BasePlaybookViewModel basePlaybookViewModel2 = basePlaybookViewModel;
                basePlaybookViewModel2.getClass();
                C500260Jjc.LJJLIIIJJIZ(new C499901x7(basePlaybookViewModel2, activePlaybook, c20379114of));
            }
        };
    }

    public static final Object invoke$313(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke("", null);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$314(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$315(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$316(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$317(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$318(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$319(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$32(C5182020e c5182020e) {
        return ((C432501mF) c5182020e.l0).itemView.findViewById(R.id.xva);
    }

    public static /* bridge */ /* synthetic */ Object invoke$320(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$321(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$322(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$323(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$324(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$325(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$326(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$327(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$328(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$329(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$33(C5182020e c5182020e) {
        return ((C432501mF) c5182020e.l0).itemView.findViewById(R.id.yec);
    }

    public static /* bridge */ /* synthetic */ Object invoke$330(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$331(C5182020e c5182020e) {
        CharSequence text;
        boolean z = false;
        if (((TuxTextView) c5182020e.l0).getVisibility() == 0 && (text = ((TuxTextView) c5182020e.l0).getText()) != null && text.length() != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$332(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$333(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$334(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$335(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$336(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$337(C5182020e c5182020e) {
        boolean z;
        List list = (List) c5182020e.l0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(!z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$338(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$339(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$34(C5182020e c5182020e) {
        final CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget = (CountDownForAllV2AnchorWidget) c5182020e.l0;
        return new InterfaceC423301kl() { // from class: X.01Ib
            @Override // X.InterfaceC423301kl
            public final void LIZ() {
            }

            @Override // X.InterfaceC423301kl
            public final void dismiss() {
                countDownForAllV2AnchorWidget.LLIZ = null;
            }

            @Override // X.InterfaceC423301kl
            public final void LIZIZ(final CountdownForAllConfig countdownForAllConfig, final int i, final C334801Rq c334801Rq) {
                final boolean z;
                List<LinkUser> listLIZLLL;
                C310701Ij<CountDownForAllEntryClickEvent, CountdownForAllConfigWrapper> c310701Ij;
                CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) countDownForAllV2AnchorWidget.LL;
                if (countDownForAllV2AnchorViewModel != null && (c310701Ij = countDownForAllV2AnchorViewModel.LLILZ) != null) {
                    CountdownForAllConfigWrapper countdownForAllConfigWrapperLIZ = C01JD.LIZ(countdownForAllConfig);
                    C946050aj5 c946050aj5LIZ = c310701Ij.LIZ();
                    if (c946050aj5LIZ != null) {
                        c946050aj5LIZ.LIZ(countdownForAllConfigWrapperLIZ);
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null && listLIZLLL.size() > 1) {
                    C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.J9;
                    Integer numLIZIZ = c20337914i1.LIZIZ();
                    C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
                    if (c01zrLIZIZ != null && c01zrLIZIZ.LIZLLL() && numLIZIZ.intValue() > 0) {
                        c20337914i1.LJFF(Integer.valueOf(numLIZIZ.intValue() - 1));
                        C782110Um9 c782110Um9 = new C782110Um9(countDownForAllV2AnchorWidget.context);
                        c782110Um9.LJIIZILJ(2131854741);
                        c782110Um9.LJII(2131854740);
                        c782110Um9.LJIILLIIL = true;
                        c782110Um9.LJIILL = true;
                        final CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget2 = countDownForAllV2AnchorWidget;
                        c782110Um9.LJIILIIL(2131854746, new InterfaceC743640TFa() { // from class: X.01Id
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget3 = countDownForAllV2AnchorWidget2;
                                CountdownForAllConfig countdownForAllConfig2 = countdownForAllConfig;
                                int i2 = i;
                                C334801Rq c334801Rq2 = c334801Rq;
                                boolean z2 = z;
                                CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel2 = (CountDownForAllV2AnchorViewModel) countDownForAllV2AnchorWidget3.LL;
                                if (countDownForAllV2AnchorViewModel2 != null) {
                                    countDownForAllV2AnchorViewModel2.GQ2(countdownForAllConfig2, c334801Rq2, new C310301If(countdownForAllConfig2, countDownForAllV2AnchorWidget3, z2, i2));
                                }
                                liveDialog.dismiss();
                            }
                        });
                        c782110Um9.LJIIJ(2131854745, new InterfaceC743640TFa() { // from class: X.01Ie
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.cancel();
                            }
                        });
                        C500260Jjc.LJJLIIIJLLLLLLLZ(c782110Um9.LIZ());
                        return;
                    }
                    CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget3 = countDownForAllV2AnchorWidget;
                    CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel2 = (CountDownForAllV2AnchorViewModel) countDownForAllV2AnchorWidget3.LL;
                    if (countDownForAllV2AnchorViewModel2 == null) {
                        return;
                    }
                    countDownForAllV2AnchorViewModel2.GQ2(countdownForAllConfig, c334801Rq, new C310301If(countdownForAllConfig, countDownForAllV2AnchorWidget3, z, i));
                    return;
                }
                CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget4 = countDownForAllV2AnchorWidget;
                CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel3 = (CountDownForAllV2AnchorViewModel) countDownForAllV2AnchorWidget4.LL;
                if (countDownForAllV2AnchorViewModel3 == null) {
                    return;
                }
                C310001Ic c310001Ic = new C310001Ic(z, countDownForAllV2AnchorWidget4);
                C01IU c01iu = countDownForAllV2AnchorViewModel3.LLILZIL;
                c01iu.getClass();
                C480460Ism.LIZ().getClass();
                IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
                UpdateUserPlaySettingsParams updateUserPlaySettingsParams = new UpdateUserPlaySettingsParams();
                HashMap map = new HashMap();
                map.put("countdown_for_all_target_score", Long.valueOf(countdownForAllConfig.targetScore));
                map.put("countdown_for_all_duration", Long.valueOf(countdownForAllConfig.duration));
                updateUserPlaySettingsParams.settingsMap = map;
                updateUserPlaySettingsParams.settingsStrMap = C2097608Jq.LJIIJ(new Pair("countdown_for_all_resource_id", countdownForAllConfig.resourceId));
                countDownForAllV2AnchorViewModel3.LL.LIZ(C01NB.LIZ(C01NB.LIZIZ(iMultiGuestPlayApi.updateUserPlaySettings(updateUserPlaySettingsParams), "CountDownForAllV2AnchorModel", "updateUserPlaySettings").LJFF(new C0UO0()).LJIILL(new C515801zg(c01iu, countdownForAllConfig, 70))).LJFF(new C0UO0()).LJJIIZ(new C515801zg(countDownForAllV2AnchorViewModel3, c310001Ic, 73), new C515801zg(countDownForAllV2AnchorViewModel3, c310001Ic, 74)));
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$340(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$341(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$342(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("medias from photo picker, total: ");
        sbLIZ.append(((List) c5182020e.l0).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$343(C5182020e c5182020e) {
        final C01I4 c01i4 = (C01I4) c5182020e.l0;
        return new InterfaceC941650abz() { // from class: X.01I5
            @Override // X.InterfaceC941650abz
            public final void LIZ(Map<Long, Long> map) {
            }

            @Override // X.InterfaceC941650abz
            public final void LIZIZ(Map<Long, C941850acJ> map) {
            }

            @Override // X.InterfaceC941650abz
            public final void LIZLLL(int i) {
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC941650abz
            public final void LIZJ(Map<Long, UserPlayInfo> map) {
                C01I4 c01i42 = c01i4;
                c01i42.getClass();
                if (!map.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                        long jLongValue = ((Number) entry.getKey()).longValue();
                        UserPlayInfo userPlayInfo = (UserPlayInfo) entry.getValue();
                        if (userPlayInfo != null && userPlayInfo.playScene == 12) {
                            arrayList.add(new Pair(Long.valueOf(jLongValue), userPlayInfo));
                        } else {
                            C320901Mh.LIZ(c01i42.LJIILL(), "return for playScene!= PlayScene.PLAY_SCENE_GUEST_SHOWDOWN");
                            return;
                        }
                    }
                    C320901Mh.LIZ(c01i42.LJIILL(), "start onPlayUserInfoUpdated logic");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Pair pair : C13LP.LJLLLL(new C512401z8(48), arrayList)) {
                        long jLongValue2 = ((Number) pair.getFirst()).longValue();
                        UserPlayInfo userPlayInfo2 = (UserPlayInfo) pair.getSecond();
                        if (userPlayInfo2.userTag != 0 && jLongValue2 != C950220apo.LJ()) {
                            arrayList5.add(new Pair(Long.valueOf(jLongValue2), Integer.valueOf(userPlayInfo2.userTag)));
                        }
                        c01i42.LJIJJLI(jLongValue2, userPlayInfo2.score, "onFanTicketMessageReceived");
                        int i = userPlayInfo2.userTag;
                        if (i != 2) {
                            if (i == 3) {
                                arrayList3.add(Long.valueOf(jLongValue2));
                            }
                        } else {
                            arrayList2.add(Long.valueOf(jLongValue2));
                        }
                        int i2 = userPlayInfo2.rank;
                        if (1 <= i2 && i2 < 4) {
                            arrayList4.add(Long.valueOf(jLongValue2));
                        }
                    }
                    String strLJIILL = c01i42.LJIILL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onGuestShowdownFanTicketMessageReceived, winnerUidList != winnerUidListFromIM: ");
                    sbLIZ.append(!Intrinsics.LJFF(c01i42.LIZJ, arrayList2));
                    sbLIZ.append(", winnerUidList: ");
                    sbLIZ.append(c01i42.LIZJ);
                    sbLIZ.append(", winnerUidListFromIM: ");
                    sbLIZ.append(arrayList2);
                    sbLIZ.append("; loserUidList != loserUidListFromIM: ");
                    sbLIZ.append(!Intrinsics.LJFF(c01i42.LIZLLL, arrayList3));
                    sbLIZ.append(", loserUidList: ");
                    sbLIZ.append(c01i42.LIZLLL);
                    sbLIZ.append(", loserUidListFromIM: ");
                    sbLIZ.append(arrayList3);
                    sbLIZ.append("; top3UidList != top3UidListFromIM: ");
                    sbLIZ.append(!Intrinsics.LJFF(c01i42.LJ, arrayList4));
                    sbLIZ.append(", top3UidList: ");
                    sbLIZ.append(c01i42.LJ);
                    sbLIZ.append(", top3UidListFromIM: ");
                    sbLIZ.append(arrayList4);
                    C320901Mh.LIZ(strLJIILL, C2188811AlT.LIZIZ(sbLIZ));
                    c01i42.LJIIJ(arrayList5);
                    c01i42.LJIIL(arrayList2, arrayList3);
                    c01i42.LJIIJJI(arrayList4);
                }
            }
        };
    }

    public static final Object invoke$344(C5182020e c5182020e) {
        ((BaseGuestShowdownWidget) c5182020e.l0).LLILLJJLI = null;
        return Unit.LIZ;
    }

    public static final Object invoke$345(C5182020e c5182020e) {
        ((BaseGuestShowdownWidget) c5182020e.l0).LL = null;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$346(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$347(C5182020e c5182020e) {
        ((LinkedHashMap) ((C1128710fTh) c5182020e.l0).LLLLJ.LIZJ).clear();
        return Unit.LIZ;
    }

    public static final Object invoke$348(C5182020e c5182020e) {
        return ((C1128710fTh) c5182020e.l0).LLLIL;
    }

    public static final Object invoke$349(C5182020e c5182020e) {
        C1128710fTh c1128710fTh = (C1128710fTh) c5182020e.l0;
        return Boolean.valueOf(c1128710fTh.LJLI(c1128710fTh.P1()));
    }

    public static final Object invoke$35(C5182020e c5182020e) {
        final CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget = (CountDownForAllV2AnchorWidget) c5182020e.l0;
        return new InterfaceC423301kl() { // from class: X.01Ia
            @Override // X.InterfaceC423301kl
            public final void LIZ() {
            }

            @Override // X.InterfaceC423301kl
            public final void dismiss() {
                countDownForAllV2AnchorWidget.LLIZ = null;
            }

            @Override // X.InterfaceC423301kl
            public final void LIZIZ(CountdownForAllConfig countdownForAllConfig, int i, C334801Rq c334801Rq) {
                int size;
                long j;
                Long lValueOf;
                Long lValueOf2;
                String str;
                String str2;
                CountdownForAllConfig countdownForAllConfig2;
                CountdownForAllConfig countdownForAllConfig3;
                CountdownForAllContent countdownForAllContentWQ2;
                CountdownForAllConfig countdownForAllConfig4;
                List<LinkUser> listLIZLLL;
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                boolean z = false;
                if (interfaceC954180awCLLJLL != null && (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) != null) {
                    size = listLIZLLL.size();
                } else {
                    size = 0;
                }
                if (size > 1) {
                    CountdownForAllConfig countdownForAllConfig5 = new CountdownForAllConfig();
                    CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget2 = countDownForAllV2AnchorWidget;
                    long j2 = countdownForAllConfig.duration;
                    VM vm = countDownForAllV2AnchorWidget2.LL;
                    if (vm != 0 && (countdownForAllContentWQ2 = vm.wQ2()) != null && (countdownForAllConfig4 = countdownForAllContentWQ2.playConfig) != null) {
                        j = countdownForAllConfig4.duration;
                    } else {
                        j = 0;
                    }
                    countdownForAllConfig5.duration = j2 - j;
                    countdownForAllConfig5.targetScore = countdownForAllConfig.targetScore;
                    countdownForAllConfig5.resourceId = countdownForAllConfig.resourceId;
                    CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) countDownForAllV2AnchorWidget.LL;
                    if (countDownForAllV2AnchorViewModel != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateCountDownForAll, duration: ");
                        sbLIZ.append(countdownForAllConfig5.duration);
                        sbLIZ.append(", targetScore: ");
                        sbLIZ.append(countdownForAllConfig5.targetScore);
                        C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        CountdownForAllContent countdownForAllContent = new CountdownForAllContent();
                        countdownForAllContent.roomId = C01JX.LJII();
                        countdownForAllContent.channelId = C01JX.LJI();
                        countdownForAllContent.playId = countDownForAllV2AnchorViewModel.xQ2();
                        countdownForAllContent.playConfig = countdownForAllConfig5;
                        if (countdownForAllConfig5.duration == 0) {
                            z = true;
                        }
                        boolean z2 = !z;
                        CountdownForAllContent countdownForAllContent2 = countDownForAllV2AnchorViewModel.LLILZIL.LIZIZ;
                        if (countdownForAllContent2 != null && (countdownForAllConfig3 = countdownForAllContent2.playConfig) != null) {
                            lValueOf = Long.valueOf(countdownForAllConfig3.targetScore);
                        } else {
                            lValueOf = null;
                        }
                        CountdownForAllConfig countdownForAllConfig6 = countdownForAllContent.playConfig;
                        if (countdownForAllConfig6 != null) {
                            lValueOf2 = Long.valueOf(countdownForAllConfig6.targetScore);
                        } else {
                            lValueOf2 = null;
                        }
                        boolean z3 = !Intrinsics.LJFF(lValueOf, lValueOf2);
                        CountdownForAllContent countdownForAllContent3 = countDownForAllV2AnchorViewModel.LLILZIL.LIZIZ;
                        if (countdownForAllContent3 != null && (countdownForAllConfig2 = countdownForAllContent3.playConfig) != null) {
                            str = countdownForAllConfig2.resourceId;
                        } else {
                            str = null;
                        }
                        CountdownForAllConfig countdownForAllConfig7 = countdownForAllContent.playConfig;
                        if (countdownForAllConfig7 != null) {
                            str2 = countdownForAllConfig7.resourceId;
                        } else {
                            str2 = null;
                        }
                        boolean z4 = !Intrinsics.LJFF(str, str2);
                        if (!z2 && !z3 && !z4) {
                            C20441214yg.LJIIIZ("CountDownForAllV2AnchorViewModel", "updateCountDownForAll no change");
                        } else {
                            C01IU c01iu = countDownForAllV2AnchorViewModel.LLILZIL;
                            c01iu.getClass();
                            C480460Ism.LIZ().getClass();
                            ICountDownForAllApi iCountDownForAllApi = (ICountDownForAllApi) C480460Ism.LIZLLL(ICountDownForAllApi.class);
                            CountdownForAllUpdateParams countdownForAllUpdateParams = new CountdownForAllUpdateParams();
                            countdownForAllUpdateParams.roomId = countdownForAllContent.roomId;
                            countdownForAllUpdateParams.channelId = countdownForAllContent.channelId;
                            countdownForAllUpdateParams.playId = countdownForAllContent.playId;
                            CountdownForAllConfigChange countdownForAllConfigChange = new CountdownForAllConfigChange();
                            countdownForAllConfigChange.countdownForAllConfig = countdownForAllContent.playConfig;
                            countdownForAllConfigChange.updateDuration = z2;
                            countdownForAllConfigChange.updateTargetScore = z3;
                            countdownForAllConfigChange.updateResourceId = z4;
                            countdownForAllUpdateParams.playConfigChange = countdownForAllConfigChange;
                            countDownForAllV2AnchorViewModel.LL.LIZ(C01NB.LIZ(C01NB.LIZIZ(iCountDownForAllApi.updateCountDownForAllSetting(countdownForAllUpdateParams), "CountDownForAllV2AnchorModel", "updateCountDownForAll").LJFF(new C0UO0()).LJIILL(new C516201zk(c01iu, 353))).LJFF(new C0UO0()).LJJIIZ(new C515801zg(countDownForAllV2AnchorViewModel, null, 71), new C515801zg(countDownForAllV2AnchorViewModel, null, 72)));
                        }
                    }
                }
                CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = countDownForAllV2AnchorWidget.LLIZ;
                if (countDownForAllV2SettingsDialog != null) {
                    countDownForAllV2SettingsDialog.close(1);
                }
            }
        };
    }

    public static final Object invoke$350(C5182020e c5182020e) {
        return Long.valueOf(((C1128710fTh) c5182020e.l0).LJJLJ());
    }

    public static final Object invoke$351(C5182020e c5182020e) {
        return new C212100rn(new C5182020e((C1128710fTh) c5182020e.l0, 348), new C5182020e((C1128710fTh) c5182020e.l0, 349), new C5182020e((C1128710fTh) c5182020e.l0, 350), new C5183020f((C1128710fTh) c5182020e.l0, 228), new AwS596S0100000_17((C1128710fTh) c5182020e.l0, 466), new C5183020f((C1128710fTh) c5182020e.l0, 229));
    }

    public static /* bridge */ /* synthetic */ Object invoke$352(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$353(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$354(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fileOperateScope err: ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$355(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((Aweme) c5182020e.l0).getAid());
        sbLIZ.append(" trigger download");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$356(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((Aweme) c5182020e.l0).getAid());
        sbLIZ.append(" download start");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$357(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loader: api verify failed ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$358(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check cache file failed: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        sbLIZ.append(", ");
        sbLIZ.append((Exception) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$359(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clean failed: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        sbLIZ.append(", ");
        sbLIZ.append((Exception) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$36(C5182020e c5182020e) {
        final GuestShowdownAnchorWidget guestShowdownAnchorWidget = (GuestShowdownAnchorWidget) c5182020e.l0;
        return new C01UR() { // from class: X.01Gc
            @Override // X.C01UR
            public final void LIZ() {
                GuestShowdownAnchorWidget guestShowdownAnchorWidget2 = guestShowdownAnchorWidget;
                GuestShowdownInPunishmentSettingsDialog guestShowdownInPunishmentSettingsDialog = guestShowdownAnchorWidget2.LLJILLL;
                if (C500260Jjc.LJJJI(guestShowdownInPunishmentSettingsDialog != null ? Boolean.valueOf(guestShowdownInPunishmentSettingsDialog.isVisible()) : null)) {
                    return;
                }
                GuestShowdownInPunishmentSettingsDialog guestShowdownInPunishmentSettingsDialog2 = new GuestShowdownInPunishmentSettingsDialog(guestShowdownAnchorWidget2.dataChannel, guestShowdownAnchorWidget2.F1(true), guestShowdownAnchorWidget2.G1(), (C303801Fs) guestShowdownAnchorWidget2.LLJJJ.getValue());
                guestShowdownInPunishmentSettingsDialog2.LLJZ = new C5182020e(guestShowdownAnchorWidget2, 310);
                guestShowdownAnchorWidget2.LLJILLL = guestShowdownInPunishmentSettingsDialog2;
                guestShowdownAnchorWidget2.A1(guestShowdownInPunishmentSettingsDialog2, "GuestShowdownInPunishmentSettingsDialog");
            }

            @Override // X.C01UR
            public final void LIZJ() {
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) guestShowdownAnchorWidget.LLILLL;
                if (guestShowdownAnchorViewModel != null) {
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GuestShowdownAnchorViewModel.LLJJIJI;
                    guestShowdownAnchorViewModel.FQ2(0);
                }
                GuestShowdownEndDialog guestShowdownEndDialog = guestShowdownAnchorWidget.LLILLJJLI;
                if (guestShowdownEndDialog != null) {
                    guestShowdownEndDialog.close(1);
                }
            }

            @Override // X.C01UR
            public final int LIZLLL() {
                List<LinkPlayerInfo> value;
                Integer numValueOf;
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) guestShowdownAnchorWidget.LLILLL;
                if (guestShowdownAnchorViewModel == null || (value = guestShowdownAnchorViewModel.LLJI.getValue()) == null || (numValueOf = Integer.valueOf(value.size())) == null) {
                    return 0;
                }
                return numValueOf.intValue();
            }

            @Override // X.C01UR
            public final void LIZIZ(C334801Rq c334801Rq) {
                GuestShowdownConfig value;
                long j;
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) guestShowdownAnchorWidget.LLILLL;
                if (guestShowdownAnchorViewModel != null && (value = guestShowdownAnchorViewModel.LLJIJIL.getValue()) != null) {
                    long j2 = value.duration;
                    int i = value.loserNum;
                    int i2 = value.winnerNum;
                    GuestShowdownContent guestShowdownContentZQ2 = guestShowdownAnchorViewModel.zQ2();
                    if (guestShowdownContentZQ2 != null) {
                        j = guestShowdownContentZQ2.playId;
                    } else {
                        j = 0;
                    }
                    guestShowdownAnchorViewModel.HQ2(j2, i, i2, j, true, c334801Rq, null);
                }
                GuestShowdownEndDialog guestShowdownEndDialog = guestShowdownAnchorWidget.LLILLJJLI;
                if (guestShowdownEndDialog != null) {
                    guestShowdownEndDialog.close(1);
                }
            }
        };
    }

    public static final Object invoke$360(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keepFiles failed: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        sbLIZ.append(", ");
        sbLIZ.append((Exception) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$361(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("persistentScope err: ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$362(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$363(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$364(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$365(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$366(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$367(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$368(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$369(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$37(C5182020e c5182020e) {
        return new C515301zb((GuestShowdownAnchorWidget) c5182020e.l0, 4);
    }

    public static /* bridge */ /* synthetic */ Object invoke$370(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$371(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$372(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$373(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$374(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$375(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$376(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$377(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$378(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$379(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$38(C5182020e c5182020e) {
        final GuestShowdownAnchorWidget guestShowdownAnchorWidget = (GuestShowdownAnchorWidget) c5182020e.l0;
        return new C01UX() { // from class: X.01IA
            @Override // X.C01UX
            public final void LIZ() {
            }

            @Override // X.C01UX
            public final void onDismiss() {
                guestShowdownAnchorWidget.LLJILJIL = null;
            }

            @Override // X.C01UX
            public final void LIZIZ(int i, long j) {
                C946060aj6 c946060aj6LIZIZ;
                C946050aj5 c946050aj5LIZIZ;
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) guestShowdownAnchorWidget.LLILLL;
                if (guestShowdownAnchorViewModel != null) {
                    guestShowdownAnchorViewModel.KQ2(i, 1, j);
                }
                DataChannel dataChannel = guestShowdownAnchorWidget.dataChannel;
                if (dataChannel != null && (c946060aj6LIZIZ = C01Z9.LIZIZ(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6LIZIZ.LIZIZ()) != null) {
                    GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
                    guestShowdownConfig.duration = j;
                    guestShowdownConfig.loserNum = i;
                    c946050aj5LIZIZ.LIZ(guestShowdownConfig);
                }
            }

            @Override // X.C01UX
            public final void LIZJ(long j, int i, C334801Rq c334801Rq) {
                String str;
                DataChannel dataChannel = guestShowdownAnchorWidget.dataChannel;
                if (dataChannel != null) {
                    C01Z9.LIZIZ(dataChannel);
                }
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) guestShowdownAnchorWidget.LLILLL;
                if (guestShowdownAnchorViewModel != null) {
                    guestShowdownAnchorViewModel.HQ2(j, i, 1, 0L, false, c334801Rq, null);
                }
                GuestShowdownAnchorWidget guestShowdownAnchorWidget2 = guestShowdownAnchorWidget;
                GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog = guestShowdownAnchorWidget2.LLJILJIL;
                if (guestShowdownIdleSettingsDialog != null && (str = guestShowdownIdleSettingsDialog.LLJJIJIIJIL) != null) {
                    guestShowdownAnchorWidget2.LLJJI.put(str, Long.valueOf(System.currentTimeMillis()));
                }
                GuestShowdownIdleSettingsDialog guestShowdownIdleSettingsDialog2 = guestShowdownAnchorWidget.LLJILJIL;
                if (guestShowdownIdleSettingsDialog2 != null) {
                    guestShowdownIdleSettingsDialog2.close(1);
                }
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$380(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$381(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$382(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$383(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$384(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$385(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$386(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$387(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$388(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$389(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$39(C5182020e c5182020e) {
        final GuestShowdownAnchorWidget guestShowdownAnchorWidget = (GuestShowdownAnchorWidget) c5182020e.l0;
        return new C01UV() { // from class: X.01Fs
            @Override // X.C01UV
            public final void LIZ(final int i, final long j) {
                C946060aj6 c946060aj6LIZIZ;
                C946050aj5 c946050aj5LIZIZ;
                final GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) guestShowdownAnchorWidget.LLILLL;
                if (guestShowdownAnchorViewModel != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestUpdateConfigWhenCalculatingOrInPunishment, updateLoserNum: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", duration: ");
                    sbLIZ.append(j);
                    C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    C01II c01ii = guestShowdownAnchorViewModel.LLJJIII;
                    c01ii.getClass();
                    C480460Ism.LIZ().getClass();
                    IMultiGuestPlayApi iMultiGuestPlayApi = (IMultiGuestPlayApi) C480460Ism.LIZLLL(IMultiGuestPlayApi.class);
                    UpdateUserPlaySettingsParams updateUserPlaySettingsParams = new UpdateUserPlaySettingsParams();
                    HashMap map = new HashMap();
                    map.put("guest_showdown_duration", Long.valueOf(j));
                    map.put("guest_showdown_loser_num", Long.valueOf(i));
                    updateUserPlaySettingsParams.settingsMap = map;
                    guestShowdownAnchorViewModel.wQ2().LIZ(C01NB.LIZ(C01NB.LIZIZ(iMultiGuestPlayApi.updateUserPlaySettings(updateUserPlaySettingsParams), "GuestShowdownAnchorModel", "updateUserPlaySettings").LJIILL(new C516201zk(c01ii, 218))).LJFF(new C0UO0()).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.01Ft
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenCalculatingOrInPunishment$1");
                            guestShowdownAnchorViewModel.getClass();
                            C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", "updateUserPlaySettings successfully");
                            GuestShowdownAnchorViewModel guestShowdownAnchorViewModel2 = guestShowdownAnchorViewModel;
                            long j2 = j;
                            int i2 = i;
                            guestShowdownAnchorViewModel2.getClass();
                            C500260Jjc.LJJLIIIJILLIZJL(new C304101Fv(guestShowdownAnchorViewModel2, j2, i2, 1));
                            C500260Jjc.LJJLIIIJILLIZJL(new C304001Fu(guestShowdownAnchorViewModel, j, i));
                            C1C7U.LIZIZ("GuestShowdownAnchorViewModel@8a83.requestUpdateConfigWhenCalculatingOrInPunishment$1");
                        }
                    }, new C516201zk(guestShowdownAnchorViewModel, 221)));
                }
                DataChannel dataChannel = guestShowdownAnchorWidget.dataChannel;
                if (dataChannel != null && (c946060aj6LIZIZ = C01Z9.LIZIZ(dataChannel)) != null && (c946050aj5LIZIZ = c946060aj6LIZIZ.LIZIZ()) != null) {
                    GuestShowdownConfig guestShowdownConfig = new GuestShowdownConfig();
                    guestShowdownConfig.duration = j;
                    guestShowdownConfig.loserNum = i;
                    c946050aj5LIZIZ.LIZ(guestShowdownConfig);
                }
                GuestShowdownInPunishmentSettingsDialog guestShowdownInPunishmentSettingsDialog = guestShowdownAnchorWidget.LLJILLL;
                if (guestShowdownInPunishmentSettingsDialog != null) {
                    guestShowdownInPunishmentSettingsDialog.close(1);
                }
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$390(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$391(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$392(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$393(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$394(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$395(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$396(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$397(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$398(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$399(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$40(C5182020e c5182020e) {
        final GuestShowdownAnchorWidget guestShowdownAnchorWidget = (GuestShowdownAnchorWidget) c5182020e.l0;
        return new InterfaceC341301Ud() { // from class: X.01EJ
            @Override // X.InterfaceC341301Ud
            public final void LIZ(int i, long j, boolean z, boolean z2) {
                long j2;
                GuestShowdownAnchorViewModel guestShowdownAnchorViewModel = (GuestShowdownAnchorViewModel) guestShowdownAnchorWidget.LLILLL;
                if (guestShowdownAnchorViewModel != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestUpdateConfig, updateLoserNum: ");
                    sbLIZ.append(z2);
                    sbLIZ.append(", loserNum: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", updateAddDuration: ");
                    sbLIZ.append(z);
                    sbLIZ.append(", duration: ");
                    sbLIZ.append(j);
                    C20441214yg.LJIIIZ("GuestShowdownAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    GuestShowdownUpdateParams guestShowdownUpdateParams = new GuestShowdownUpdateParams();
                    guestShowdownUpdateParams.roomId = C954140aw8.LIZJ();
                    guestShowdownUpdateParams.channelId = C954140aw8.LIZIZ();
                    GuestShowdownContent guestShowdownContent = guestShowdownAnchorViewModel.LLJJIII.LIZIZ;
                    if (guestShowdownContent != null) {
                        j2 = guestShowdownContent.playId;
                    } else {
                        j2 = 0;
                    }
                    guestShowdownUpdateParams.playId = j2;
                    guestShowdownUpdateParams.guestShowdownUpdateScene = 1;
                    GuestShowdownConfigChange guestShowdownConfigChange = new GuestShowdownConfigChange();
                    guestShowdownConfigChange.updateLoserNum = z2;
                    guestShowdownConfigChange.loserNum = i;
                    guestShowdownConfigChange.updateAddDuration = z;
                    guestShowdownConfigChange.addDuration = j;
                    guestShowdownUpdateParams.configChange = guestShowdownConfigChange;
                    C01II c01ii = guestShowdownAnchorViewModel.LLJJIII;
                    c01ii.getClass();
                    C480460Ism.LIZ().getClass();
                    guestShowdownAnchorViewModel.wQ2().LIZ(C01NB.LIZ(C01NB.LIZIZ(((IGuestShowdownApi) C480460Ism.LIZLLL(IGuestShowdownApi.class)).update(guestShowdownUpdateParams), "GuestShowdownAnchorModel", "update").LJIILL(new C516201zk(c01ii, 217))).LJFF(new C0UO0()).LJFF(new C0UO0()).LJJIIZ(new C516201zk(guestShowdownAnchorViewModel, 222), new C516201zk(guestShowdownAnchorViewModel, 223)));
                }
                GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog = guestShowdownAnchorWidget.LLJILJILJ;
                if (guestShowdownOngoingSettingsDialog != null) {
                    guestShowdownOngoingSettingsDialog.close(1);
                }
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$400(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$401(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$402(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$403(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$404(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$405(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$406(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$407(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$408(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$409(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$41(C5182020e c5182020e) {
        final GuestShowdownAnchorWidget guestShowdownAnchorWidget = (GuestShowdownAnchorWidget) c5182020e.l0;
        return new C01MC() { // from class: X.01GV
            @Override // X.C01MC
            public final void LIZ() {
                C782110Um9 c782110Um9 = new C782110Um9(guestShowdownAnchorWidget.context);
                c782110Um9.LJIIZILJ(2131852917);
                c782110Um9.LJII(2131852915);
                c782110Um9.LJIILIIL(2131852916, new C515201za(guestShowdownAnchorWidget, 0));
                c782110Um9.LJIIJ(2131852914, new InterfaceC743640TFa() { // from class: X.01EK
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                c782110Um9.LJIILL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
            }

            @Override // X.C01MC
            public final void LIZIZ() {
                GuestShowdownAnchorWidget guestShowdownAnchorWidget2 = guestShowdownAnchorWidget;
                GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog = guestShowdownAnchorWidget2.LLJILJILJ;
                if (C500260Jjc.LJJJI(guestShowdownOngoingSettingsDialog != null ? Boolean.valueOf(guestShowdownOngoingSettingsDialog.isVisible()) : null)) {
                    return;
                }
                GuestShowdownOngoingSettingsDialog guestShowdownOngoingSettingsDialog2 = new GuestShowdownOngoingSettingsDialog(guestShowdownAnchorWidget2.dataChannel, guestShowdownAnchorWidget2.F1(false), guestShowdownAnchorWidget2.G1(), (C01EJ) guestShowdownAnchorWidget2.LLJJIJIL.getValue());
                guestShowdownOngoingSettingsDialog2.LLJZ = new C5182020e(guestShowdownAnchorWidget2, 311);
                guestShowdownAnchorWidget2.LLJILJILJ = guestShowdownOngoingSettingsDialog2;
                guestShowdownAnchorWidget2.A1(guestShowdownOngoingSettingsDialog2, "GuestShowdownOngoingSettingsDialog");
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$410(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$411(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$412(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$413(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$414(C5182020e c5182020e) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e6, (Context) c5182020e.l0);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        return Integer.valueOf(iIntValue);
    }

    public static final Object invoke$415(C5182020e c5182020e) {
        C09MB.LIZLLL.remove((LifecycleOwner) c5182020e.l0);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C470801sQ(null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$416(C5182020e c5182020e) {
        return ((LiveData) ((C259800zU) c5182020e.l0).element).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$417(C5182020e c5182020e) {
        return ((LiveData) ((C259800zU) c5182020e.l0).element).getValue();
    }

    public static /* bridge */ /* synthetic */ Object invoke$418(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$419(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$42(C5182020e c5182020e) {
        return new C01ZB(((BaseGuestShowdownWidget) c5182020e.l0).context);
    }

    public static /* bridge */ /* synthetic */ Object invoke$420(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$421(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$422(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$423(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$424(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$425(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$426(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$427(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$428(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$429(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$43(C5182020e c5182020e) {
        return ((C432201mC) c5182020e.l0).itemView.findViewById(R.id.xva);
    }

    public static /* bridge */ /* synthetic */ Object invoke$430(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$431(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$432(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$433(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$434(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$435(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$436(C5182020e c5182020e) {
        return ((C432301mD) c5182020e.l0).itemView.findViewById(R.id.xva);
    }

    public static final Object invoke$437(C5182020e c5182020e) {
        return ((C432301mD) c5182020e.l0).itemView.findViewById(R.id.yec);
    }

    public static /* bridge */ /* synthetic */ Object invoke$438(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$439(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$44(C5182020e c5182020e) {
        return ((C432201mC) c5182020e.l0).itemView.findViewById(R.id.yec);
    }

    public static /* bridge */ /* synthetic */ Object invoke$440(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$441(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$442(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$443(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/tiktok/feed/explore/custom/topic/list/v1 explore topic feed fail ");
        sbLIZ.append((Map) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$444(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("explore topic feed fail ");
        sbLIZ.append((Map) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$445(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/tiktok/feed/explore/custom/topic/update/v1 explore topic feed fail ");
        sbLIZ.append((Map) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$446(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$447(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$448(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$449(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$45(C5182020e c5182020e) {
        return new C515301zb((GuestShowdownGuestWidget) c5182020e.l0, 5);
    }

    public static /* bridge */ /* synthetic */ Object invoke$450(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$451(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$452(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$453(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$454(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$455(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$456(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$457(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$458(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$459(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.01x0] */
    public static final Object invoke$46(C5182020e c5182020e) {
        if (!C500260Jjc.LJJIL() && Intrinsics.LJFF(((BasePlaybookService) c5182020e.l0).LL.gg0(C956690b0F.class), Boolean.TRUE)) {
            final BasePlaybookService basePlaybookService = (BasePlaybookService) c5182020e.l0;
            return new C499301x1(basePlaybookService.LL, new InterfaceC356301Zx() { // from class: X.01x0
                @Override // X.InterfaceC356301Zx
                public final boolean LIZJ() {
                    return false;
                }

                @Override // X.InterfaceC356301Zx
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC356301Zx
                public final Map LIZ(Map map) {
                    BasePlaybookService<BasePlaybookViewModel> basePlaybookService2 = basePlaybookService;
                    Map<String, ? extends Object> mapLJIILLIIL = null;
                    if (map != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value != null) {
                                arrayList.add(new Pair(key, value));
                            }
                        }
                        mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
                    }
                    return basePlaybookService2.LJJIJIIJIL("livesdk_multiguest_playbook_banner", mapLJIILLIIL);
                }

                @Override // X.InterfaceC356301Zx
                public final void LIZIZ(Function1<? super JSONObject, Unit> function1) {
                    function1.invoke(basePlaybookService.LJJIIZI(false));
                }
            });
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$460(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$461(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widget_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$462(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$463(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$464(C5182020e c5182020e) {
        Boolean boolValueOf;
        long ownerUserId;
        long id;
        LiveMode liveMode = (LiveMode) ((C919390a25) c5182020e.l0).LLILLJJLI.gg0(LiveModeChannel.class);
        if (liveMode != null) {
            boolValueOf = Boolean.valueOf(C354201Zc.LIZJ(liveMode));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            ((C919390a25) c5182020e.l0).getClass();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            ((C919390a25) c5182020e.l0).getClass();
            Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            return new C308901Hr(ownerUserId, id, ((C919390a25) c5182020e.l0).LLILZLL);
        }
        return new C309501Hx(((C919390a25) c5182020e.l0).getMultiGuestDataHolder(), ((C919390a25) c5182020e.l0).LLILZLL);
    }

    public static final Object invoke$465(C5182020e c5182020e) {
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_live_center_show");
        c474500IjALIZ.LJIJJLI(((PreviewLiveCenterWidget) c5182020e.l0).dataChannel);
        DataChannel dataChannel = ((PreviewLiveCenterWidget) c5182020e.l0).dataChannel;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        c474500IjALIZ.LJJII(C354201Zc.LIZ(liveMode), "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(((PreviewLiveCenterWidget) c5182020e.l0).S1())) ? 1 : 0), "have_red_dot");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$466(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitBodyResponse: error:");
        sbLIZ.append((Throwable) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$467(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("submitFirstScreenResponse: error:");
        sbLIZ.append((Throwable) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$468(C5182020e c5182020e) {
        return ((C431601m6) c5182020e.l0).itemView.findViewById(R.id.iet);
    }

    public static final Object invoke$469(C5182020e c5182020e) {
        return ((C431601m6) c5182020e.l0).itemView.findViewById(R.id.l4q);
    }

    public static final Object invoke$47(C5182020e c5182020e) {
        return ((BasePlaybookService) c5182020e.l0).LJJIJIIJI();
    }

    public static final Object invoke$470(C5182020e c5182020e) {
        return ((C431601m6) c5182020e.l0).itemView.findViewById(R.id.zsd);
    }

    public static final Object invoke$471(C5182020e c5182020e) {
        return ((C431601m6) c5182020e.l0).itemView.findViewById(R.id.zse);
    }

    public static final Object invoke$472(C5182020e c5182020e) {
        return ((C431601m6) c5182020e.l0).itemView.findViewById(R.id.zs1);
    }

    public static final Object invoke$473(C5182020e c5182020e) {
        return ((C431601m6) c5182020e.l0).itemView.findViewById(R.id.l4m);
    }

    public static final Object invoke$474(C5182020e c5182020e) {
        return ((C431601m6) c5182020e.l0).itemView.findViewById(R.id.zsk);
    }

    public static final Object invoke$475(C5182020e c5182020e) {
        final C01ZI c01zi = (C01ZI) c5182020e.l0;
        return new InterfaceC941900acO() { // from class: X.01Ya
            @Override // X.InterfaceC941900acO
            public final void LIZJ(C01EL c01el, String str) {
                C01ZI c01zi2 = c01zi;
                c01zi2.getClass();
                int iHashCode = str.hashCode();
                if (iHashCode != -983286850) {
                    if (iHashCode != 1008965232) {
                        if (iHashCode == 1886539686 && str.equals("guest_showdown")) {
                            c01zi2.LJ(c01el, str);
                        }
                    } else if (str.equals("live_show")) {
                        c01zi2.LJ(c01el, str);
                    }
                } else if (str.equals("count_down_for_all")) {
                    c01zi2.LJ(c01el, str);
                }
                if (Intrinsics.LJFF(str, "aigc")) {
                    C23250099c.LIZLLL(c01zi2.LJIIZILJ, null, null, new C328401Pe(c01zi2, null), 3);
                    return;
                }
                String strLJFF = c01zi2.LJFF();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("refreshBanner, do nothing. ability: ");
                sbLIZ.append(str);
                sbLIZ.append(", abilityState: ");
                sbLIZ.append(c01el);
                C20441214yg.LIZIZ(strLJFF, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public static final Object invoke$476(C5182020e c5182020e) {
        return C09IC.LJJIJIL(C09IC.LJIIIIZZ(((BaseTopGuestGamePlayViewModel) c5182020e.l0).vQ2().LIZIZ, ((BaseTopGuestGamePlayViewModel) c5182020e.l0).vQ2().LIZLLL, ((BaseTopGuestGamePlayViewModel) c5182020e.l0).vQ2().LJFF, new C356101Zv((BaseTopGuestGamePlayViewModel) c5182020e.l0, null)), ViewModelKt.getViewModelScope((BaseTopGuestGamePlayViewModel) c5182020e.l0), C1370905Yd.LIZ(C05YW.LIZ, Mp4ScreenVideoLoadTimeout.CONTROL, 2), new C356201Zw(0));
    }

    public static final Object invoke$477(C5182020e c5182020e) {
        return ((BaseTopGuestGamePlayViewModel) c5182020e.l0).vQ2().LJII;
    }

    public static final Object invoke$478(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobMixBubbleShow error:");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$479(C5182020e c5182020e) {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostTag UpvoteVideoAssemNew subscribeAvoidUpvoteState => ");
        C291001Au c291001Au = (C291001Au) c5182020e.l0;
        if (c291001Au != null) {
            obj = c291001Au.LIZ;
        } else {
            obj = null;
        }
        sbLIZ.append(obj);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$48(C5182020e c5182020e) {
        ((BasePlaybookService) c5182020e.l0).LLILZIL = null;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$480(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$481(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$482(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$483(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$484(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$485(X.C5182020e r3) {
        /*
            java.lang.Object r0 = r3.l0
            X.0ez9 r0 = (X.C1109770ez9) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.LJII
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String r2 = r0.roomCreateAbParam
            if (r2 == 0) goto L19
            int r0 = r2.length()
            if (r0 <= 0) goto L17
            r0 = 1
        L14:
            if (r0 == 0) goto L19
            goto L1a
        L17:
            r0 = 0
            goto L14
        L19:
            r2 = 0
        L1a:
            com.google.gson.Gson r1 = X.C19748512Ol.LIZIZ     // Catch: java.lang.Throwable -> L34
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r1 = r1.LJII(r2, r0)     // Catch: java.lang.Throwable -> L34
            com.google.gson.n r1 = (com.google.gson.n) r1     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L38
            java.lang.String r0 = "wave_optimize_strategy"
            com.google.gson.k r0 = r1.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L38
            int r3 = r0.LJIIJJI()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L38:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5182020e.invoke$485(X.020e):java.lang.Object");
    }

    public static final Object invoke$486(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke("", null);
        return Unit.LIZ;
    }

    public static final Object invoke$487(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache duplicated with fyp list ");
        sbLIZ.append(((Aweme) c5182020e.l0).getAid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$488(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$489(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkFirstPinchSkipOptionForTablets: ");
        sbLIZ.append((Boolean) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$49(C5182020e c5182020e) {
        final PlaybookEditorDialog playbookEditorDialog = (PlaybookEditorDialog) c5182020e.l0;
        return new InterfaceC20382214pA() { // from class: X.01xC
            @Override // X.InterfaceC20382214pA
            public final void LIZIZ() {
                PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel;
                PlaybookEditorDialog playbookEditorDialog2 = playbookEditorDialog;
                playbookEditorDialog2.getClass();
                C20441214yg.LJIIIZ("Editor_PlaybookEditorDialog", "showEditorSelectEntityDialog");
                PlaybookEditorAddTagDialog playbookEditorAddTagDialog = playbookEditorDialog2.LLLLJI;
                if (playbookEditorAddTagDialog == null || !playbookEditorAddTagDialog.isVisible()) {
                    BasePlaybookEditorViewModel basePlaybookEditorViewModelBS = playbookEditorDialog2.BS();
                    if (!(basePlaybookEditorViewModelBS instanceof PGCPlaybookEditorViewModel) || (pGCPlaybookEditorViewModel = (PGCPlaybookEditorViewModel) basePlaybookEditorViewModelBS) == null) {
                        return;
                    }
                    DataChannel dataChannel = playbookEditorDialog2.LLLIIIL;
                    BasePlaybookService<?> basePlaybookService = playbookEditorDialog2.LLLIIL;
                    if (dataChannel == null || basePlaybookService == null) {
                        return;
                    }
                    PlaybookEditorAddTagDialog playbookEditorAddTagDialog2 = new PlaybookEditorAddTagDialog(pGCPlaybookEditorViewModel, new C5183020f(playbookEditorDialog2, 248));
                    playbookEditorDialog2.LLLLJI = playbookEditorAddTagDialog2;
                    try {
                        C20484615Do c20484615Do = playbookEditorDialog2.LLJJIJIL;
                        if (c20484615Do != null) {
                            c20484615Do.LJIIJ(playbookEditorAddTagDialog2, "PlaybookEditorAddTagDialog");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C20441214yg.LJ("EditorUtils", th.getMessage());
                    }
                }
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$490(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$491(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$492(C5182020e c5182020e) {
        return ((C308201Hk) c5182020e.l0).itemView.findViewById(R.id.eyx);
    }

    public static final Object invoke$493(C5182020e c5182020e) {
        return ((C308201Hk) c5182020e.l0).itemView.findViewById(R.id.ezn);
    }

    public static final Object invoke$494(C5182020e c5182020e) {
        return ((C308201Hk) c5182020e.l0).itemView.findViewById(R.id.ezx);
    }

    public static final Object invoke$495(C5182020e c5182020e) {
        return ((C308201Hk) c5182020e.l0).itemView.findViewById(R.id.f0c);
    }

    public static final Object invoke$496(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeResource: error removing resource: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$497(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveResource: error saving resource: ");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$498(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$499(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$50(C5182020e c5182020e) {
        PlaybookEditorDialog playbookEditorDialog = (PlaybookEditorDialog) c5182020e.l0;
        final DataChannel dataChannel = playbookEditorDialog.LLLIIIL;
        final BasePlaybookService<?> basePlaybookService = playbookEditorDialog.LLLIIL;
        if (dataChannel != null && basePlaybookService != null) {
            final WeakReference weakReference = new WeakReference(playbookEditorDialog.getActivity());
            return ViewModelProviders.of(playbookEditorDialog, new ViewModelProvider.Factory(dataChannel, basePlaybookService, weakReference) { // from class: X.01O9
                public final DataChannel LIZ;
                public final BasePlaybookService<?> LIZIZ;
                public final WeakReference<Context> LIZJ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    if (cls.isAssignableFrom(BasePlaybookEditorViewModel.class)) {
                        if (C758560TpG.LIZ) {
                            return new PGCPlaybookEditorViewModel(this.LIZ, this.LIZIZ, this.LIZJ);
                        }
                        return new UGCPlaybookEditorViewModel(this.LIZ, this.LIZIZ, this.LIZJ);
                    }
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }

                {
                    this.LIZ = dataChannel;
                    this.LIZIZ = basePlaybookService;
                    this.LIZJ = weakReference;
                }
            }).get(BasePlaybookEditorViewModel.class);
        }
        return null;
    }

    public static final Object invoke$500(C5182020e c5182020e) {
        EnumC1120860fH2 tooltipType;
        GiftHintsManager giftHintsManager = GiftHintsManager.LL;
        GiftHintInfo giftHintInfo = (GiftHintInfo) c5182020e.l0;
        giftHintsManager.getClass();
        C01LG c01lg = C01LB.Companion;
        int i = giftHintInfo.hintId;
        c01lg.getClass();
        C01LB c01lb = C01LB.enumMap.get(Integer.valueOf(i));
        if (c01lb != null) {
            tooltipType = c01lb.getTooltipType();
        } else {
            tooltipType = null;
        }
        C784440Upu.LIZ().LIZIZ(new C01LF(giftHintInfo, tooltipType));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$501(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$502(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$503(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$504(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$505(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$506(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$507(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$508(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$509(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$51(C5182020e c5182020e) {
        final BasePlaybookEditorViewModel basePlaybookEditorViewModelBS = ((PlaybookEditorDialog) c5182020e.l0).BS();
        if (basePlaybookEditorViewModelBS != null) {
            final Context context = ((PlaybookEditorDialog) c5182020e.l0).getContext();
            return new InterfaceC1868340yie() { // from class: X.00li
                @Override // X.InterfaceC1868340yie
                public final void LIZ(int i) {
                    Context context2 = context;
                    if (context2 != null) {
                        PlaybookUtilKt.LJJIIJZLJL(context2, "Confirm to remove", "If you remove this first level tag, all the related second level tags will be removed as well!", C497740JfY.LJIJI(2131843826), new C020L(basePlaybookEditorViewModelBS, i, 5));
                    }
                }

                @Override // X.InterfaceC1868340yie
                public final void LIZIZ(int i, int i2) {
                    Playbook playbook;
                    PlaybookContent playbookContent;
                    List<PlaybookTagAggregation> list;
                    List<PlaybookTagInfo> list2;
                    BasePlaybookEditorViewModel basePlaybookEditorViewModel = basePlaybookEditorViewModelBS;
                    PlaybookTagAggregation playbookTagAggregation = null;
                    if ((basePlaybookEditorViewModel instanceof PGCPlaybookEditorViewModel) && basePlaybookEditorViewModel != null) {
                        Map<Integer, List<Integer>> value = basePlaybookEditorViewModel.LLILLL.LJIIIZ.getValue();
                        if (value != null) {
                            Integer numValueOf = Integer.valueOf(i);
                            List<Integer> arrayList = value.get(Integer.valueOf(i));
                            if (arrayList != null) {
                                arrayList.remove(Integer.valueOf(i2));
                            } else {
                                arrayList = new ArrayList<>();
                            }
                            value.put(numValueOf, arrayList);
                            basePlaybookEditorViewModel.LLILLL.LJIIIZ.postValue(value);
                        }
                        C20379114of value2 = basePlaybookEditorViewModel.LLILLL.LIZIZ.getValue();
                        if (value2 != null && (playbook = value2.LIZ) != null && (playbookContent = playbook.content) != null && (list = playbookContent.tagAggregations) != null) {
                            Iterator<PlaybookTagAggregation> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                PlaybookTagAggregation next = it2.next();
                                if (next.playbookFirstLevelTagType == i) {
                                    playbookTagAggregation = next;
                                    break;
                                }
                            }
                            PlaybookTagAggregation playbookTagAggregation2 = playbookTagAggregation;
                            if (playbookTagAggregation2 != null && (list2 = playbookTagAggregation2.tags) != null) {
                                C500260Jjc.LJJJLZIJ(list2, new C020M(i2, 8));
                            }
                        }
                    }
                }
            };
        }
        return null;
    }

    public static final Object invoke$510(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculateDiff error: ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$511(C5182020e c5182020e) {
        String str;
        long id;
        String str2;
        Long lLJIILIIL;
        C1108880exi c1108880exi = (C1108880exi) c5182020e.l0;
        c1108880exi.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            LiveMode streamType = room.getStreamType();
            DataChannel dataChannel = null;
            if (streamType != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            com.bytedance.android.live.base.model.user.User owner = room.getOwner();
            long jLongValue = 0;
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            long id2 = room.getId();
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            DataChannel dataChannel2 = c1108880exi.LL;
            if (dataChannel2 != null) {
                dataChannel = dataChannel2;
            }
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            String strLIZ = C2348909Ih.LIZ("stream_goal_id");
            if (strLIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ)) != null) {
                jLongValue = lLJIILIIL.longValue();
            }
            String strLJIJI = C497740JfY.LJIJI(2131842014);
            if (strLJIJI != null) {
                str3 = strLJIJI;
            }
            C238200w0.LIZ(str, id, id2, currentUserId, jLongValue, str2, "invite_pin", str3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$512(C5182020e c5182020e) {
        String str;
        long id;
        String str2;
        Long lLJIILIIL;
        LiveGoalPinCardWidget liveGoalPinCardWidget = (LiveGoalPinCardWidget) c5182020e.l0;
        liveGoalPinCardWidget.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            LiveMode streamType = room.getStreamType();
            if (streamType != null) {
                str = streamType.logStreamingType;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            com.bytedance.android.live.base.model.user.User owner = room.getOwner();
            long jLongValue = 0;
            if (owner != null) {
                id = owner.getId();
            } else {
                id = 0;
            }
            long id2 = room.getId();
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            if (C500260Jjc.LJIIZILJ(liveGoalPinCardWidget.dataChannel)) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            String strLIZ = C2348909Ih.LIZ("stream_goal_id");
            if (strLIZ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ)) != null) {
                jLongValue = lLJIILIIL.longValue();
            }
            String strLJIJI = C497740JfY.LJIJI(2131842014);
            if (strLJIJI != null) {
                str3 = strLJIJI;
            }
            C238200w0.LIZ(str, id, id2, currentUserId, jLongValue, str2, "invite_pin", str3);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$513(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$514(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$515(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mainListUIState update: ");
        sbLIZ.append(((List) c5182020e.l0).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$516(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mainListUIState update done: ");
        sbLIZ.append(((List) c5182020e.l0).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$517(X.C5182020e r1) {
        /*
            java.lang.Object r1 = r1.l0
            android.view.View r1 = (android.view.View) r1
            r0 = 2131389704(0x7f0a6d08, float:1.8399959E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof X.InterfaceC473301sp
            if (r0 == 0) goto L1f
            X.01sp r1 = (X.InterfaceC473301sp) r1
            if (r1 == 0) goto L1f
            boolean r1 = r1.check()
            r0 = 1
            if (r1 != r0) goto L1f
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1f:
            r0 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5182020e.invoke$517(X.020e):java.lang.Object");
    }

    public static final Object invoke$518(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchExpose_");
        sbLIZ.append(((View) c5182020e.l0).getTag(R.id.u_4));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$519(C5182020e c5182020e) {
        ((GuestShowdownRankDialog) c5182020e.l0).close(1);
        return Unit.LIZ;
    }

    public static final Object invoke$52(C5182020e c5182020e) {
        final PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel = (PGCPlaybookEditorViewModel) c5182020e.l0;
        return new InterfaceC20378014oU() { // from class: X.00lh
            @Override // X.InterfaceC20378014oU
            public final void LIZ(C20379114of c20379114of) {
                List arrayList;
                Playbook playbook;
                PlaybookContent playbookContent;
                if (!C500260Jjc.LJJIIJ()) {
                    pGCPlaybookEditorViewModel.LLILLL.LIZIZ.postValue(c20379114of);
                } else {
                    pGCPlaybookEditorViewModel.LLILLL.LIZIZ.setValue(c20379114of);
                }
                if (c20379114of == null || (playbook = c20379114of.LIZ) == null || (playbookContent = playbook.content) == null || (arrayList = playbookContent.tagAggregations) == null) {
                    arrayList = new ArrayList();
                }
                Map value = pGCPlaybookEditorViewModel.LLILLL.LJIIIZ.getValue();
                if (value == null) {
                    value = new LinkedHashMap();
                }
                ArrayList<PlaybookTagAggregation> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((PlaybookTagAggregation) obj).playbookFirstLevelTagType != 1) {
                        arrayList2.add(obj);
                    }
                }
                for (PlaybookTagAggregation playbookTagAggregation : arrayList2) {
                    Integer numValueOf = Integer.valueOf(playbookTagAggregation.playbookFirstLevelTagType);
                    List arrayList3 = (List) value.get(Integer.valueOf(playbookTagAggregation.playbookFirstLevelTagType));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    List<PlaybookTagInfo> list = playbookTagAggregation.tags;
                    ArrayList arrayList4 = new ArrayList();
                    for (PlaybookTagInfo playbookTagInfo : list) {
                        int i = playbookTagInfo.tagType;
                        if (i != 0 && !arrayList3.contains(Integer.valueOf(i))) {
                            arrayList4.add(playbookTagInfo);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(Integer.valueOf(((PlaybookTagInfo) it2.next()).tagType));
                    }
                    arrayList3.addAll(arrayList5);
                    value.put(numValueOf, arrayList3);
                }
                pGCPlaybookEditorViewModel.LLILLL.LJIIIZ.postValue((Map<Integer, List<Integer>>) value);
            }
        };
    }

    public static final Object invoke$520(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.l4m);
    }

    public static final Object invoke$521(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.l1h);
    }

    public static final Object invoke$522(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.iet);
    }

    public static final Object invoke$523(C5182020e c5182020e) {
        return new C433001mK((C1126540fQC) ((C431401m4) c5182020e.l0).LLJILJIL.getValue(), ((C431401m4) c5182020e.l0).LL);
    }

    public static final Object invoke$524(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.l4q);
    }

    public static final Object invoke$525(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.l4r);
    }

    public static final Object invoke$526(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.zsd);
    }

    public static final Object invoke$527(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.zse);
    }

    public static final Object invoke$528(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.l3o);
    }

    public static final Object invoke$529(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.i_g);
    }

    public static final Object invoke$53(C5182020e c5182020e) {
        final UGCPlaybookEditorViewModel uGCPlaybookEditorViewModel = (UGCPlaybookEditorViewModel) c5182020e.l0;
        return new InterfaceC20378014oU() { // from class: X.00ll
            @Override // X.InterfaceC20378014oU
            public final void LIZ(C20379114of c20379114of) {
                if (!C500260Jjc.LJJIIJ()) {
                    uGCPlaybookEditorViewModel.LLILLL.LIZIZ.postValue(c20379114of);
                } else {
                    uGCPlaybookEditorViewModel.LLILLL.LIZIZ.setValue(c20379114of);
                }
            }
        };
    }

    public static final Object invoke$530(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.l3t);
    }

    public static final Object invoke$531(C5182020e c5182020e) {
        return ((C431401m4) c5182020e.l0).itemView.findViewById(R.id.i_h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$532(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("taskEventKey: ");
        sbLIZ.append((String) ((C259800zU) c5182020e.l0).element);
        sbLIZ.append(" has been started, don't show referral banner");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$533(C5182020e c5182020e) {
        DataChannel dataChannel = ((C187900nt) c5182020e.l0).LIZ;
        if (dataChannel != null) {
            return dataChannel.gg0(RoomChannel.class);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$534(C5182020e c5182020e) {
        return new Boolean[((InterfaceC346201Wa[]) c5182020e.l0).length];
    }

    public static /* bridge */ /* synthetic */ Object invoke$535(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$536(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$537(C5182020e c5182020e) {
        C470301sL.LIZLLL.remove((LifecycleOwner) c5182020e.l0);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C470201sK(null), 2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$538(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$539(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$54(C5182020e c5182020e) {
        return new C1090610eUF(((LiveShowAnchorWidget) c5182020e.l0).getContext(), ((LiveShowAnchorWidget) c5182020e.l0).LLJJIJIL);
    }

    public static /* bridge */ /* synthetic */ Object invoke$540(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$541(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$542(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$543(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$544(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$545(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$546(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[handleAdaption] update widthScaleRegular ");
        sbLIZ.append((Double) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$547(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkHeroListAndPareFirst, json error e:");
        sbLIZ.append((Exception) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$548(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isBottombarEnterLiveQuickly  enableHero ");
        sbLIZ.append((Boolean) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$549(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$55(C5182020e c5182020e) {
        return new C1090610eUF(((LiveShowAudienceWidget) c5182020e.l0).getContext(), ((LiveShowAudienceWidget) c5182020e.l0).LLJJIJIL);
    }

    public static final Object invoke$550(C5182020e c5182020e) {
        String str;
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) c5182020e.l0;
        String str2 = playbookEditorMoreDialog.LLLFF;
        Long lValueOf = Long.valueOf(playbookEditorMoreDialog.LLL.playbookId);
        if (Intrinsics.LJFF(((PlaybookEditorMoreDialog) c5182020e.l0).LLLFF, "create_preview")) {
            str = "create";
        } else {
            str = "edit";
        }
        C978360bZC.LJIJ(str2, "delete_confirm", lValueOf, str, ((PlaybookEditorMoreDialog) c5182020e.l0).LLLIIII.invoke().booleanValue(), null, null);
        final PlaybookEditorMoreDialog playbookEditorMoreDialog2 = (PlaybookEditorMoreDialog) c5182020e.l0;
        BasePlaybookViewModel basePlaybookViewModel = playbookEditorMoreDialog2.LLLF;
        if (basePlaybookViewModel != null) {
            Playbook playbook = playbookEditorMoreDialog2.LLL;
            InterfaceC170900l9<Boolean> interfaceC170900l9 = new InterfaceC170900l9<Boolean>() { // from class: X.01rb
                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC170900l9
                public final void LIZ(Boolean bool) {
                    bool.booleanValue();
                    playbookEditorMoreDialog2.LLLII.invoke();
                }
            };
            AbstractC20384214pU abstractC20384214pUWQ2 = basePlaybookViewModel.wQ2();
            PlaybookUnpublishParams playbookUnpublishParams = new PlaybookUnpublishParams();
            playbookUnpublishParams.playbookId = playbook.playbookId;
            abstractC20384214pUWQ2.getClass();
            C480460Ism.LIZ().getClass();
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).unpublish(playbookUnpublishParams), abstractC20384214pUWQ2.LJIJJ(), "unpublish").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C516201zk(abstractC20384214pUWQ2, 227))).LJFF(new C0UO0()), basePlaybookViewModel.vQ2(), new C515801zg(basePlaybookViewModel, interfaceC170900l9, 38), new C515801zg(basePlaybookViewModel, interfaceC170900l9, 40), 24);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$551(C5182020e c5182020e) {
        final PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) c5182020e.l0;
        BasePlaybookViewModel basePlaybookViewModel = playbookEditorMoreDialog.LLLF;
        if (basePlaybookViewModel != null) {
            basePlaybookViewModel.BQ2(playbookEditorMoreDialog.LLL, 1, new InterfaceC170900l9<C470590Icr<PlaybookReviewResponse.ResponseData>>() { // from class: X.01xJ
                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookReviewResponse.ResponseData> c470590Icr) {
                    Function0<Unit> function0 = playbookEditorMoreDialog.LLLIIIIL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$552(C5182020e c5182020e) {
        final PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) c5182020e.l0;
        BasePlaybookViewModel basePlaybookViewModel = playbookEditorMoreDialog.LLLF;
        if (basePlaybookViewModel != null) {
            basePlaybookViewModel.BQ2(playbookEditorMoreDialog.LLL, 2, new InterfaceC170900l9<C470590Icr<PlaybookReviewResponse.ResponseData>>() { // from class: X.01xK
                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookReviewResponse.ResponseData> c470590Icr) {
                    Function0<Unit> function0 = playbookEditorMoreDialog.LLLIIIL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$553(C5182020e c5182020e) {
        final PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) c5182020e.l0;
        BasePlaybookViewModel basePlaybookViewModel = playbookEditorMoreDialog.LLLF;
        if (basePlaybookViewModel != null) {
            basePlaybookViewModel.BQ2(playbookEditorMoreDialog.LLL, 3, new InterfaceC170900l9<C470590Icr<PlaybookReviewResponse.ResponseData>>() { // from class: X.01xL
                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookReviewResponse.ResponseData> c470590Icr) {
                    Function0<Unit> function0 = playbookEditorMoreDialog.LLLIIL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$554(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$555(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$556(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$557(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCookiesInfo error:");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$558(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceShowShopTab_error: parse tt_mall_experiment, ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$559(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceShowShopTab_error: beforeABSaveCallback, ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$56(C5182020e c5182020e) {
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null) {
            multiGuestDataHolderLIZJ.LJIIIZ = true;
        }
        DataChannel dataChannel = ((BaseLiveShowWidget) c5182020e.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(MultiLiveGuestMuteAudioEvent.class, new C922430a6z(true, "business_mute_guest_confirm_host_invite"));
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131843456));
        return Unit.LIZ;
    }

    public static final Object invoke$560(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("forceShowShopTab_error: registerABResultCallbackWhenForceShowShopTab, ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$561(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lpp_delegate >>>>> origin actions: ");
        sbLIZ.append((List) c5182020e.l0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$562(C5182020e c5182020e) {
        ((Function2) c5182020e.l0).invoke(Boolean.TRUE, null);
        return Unit.LIZ;
    }

    public static final Object invoke$563(C5182020e c5182020e) {
        final C942040acc c942040acc = (C942040acc) c5182020e.l0;
        return new InterfaceC922630a7J() { // from class: X.01YD
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                C942040acc c942040acc2 = c942040acc;
                C23250099c.LIZLLL(c942040acc2.LLJIJIL, null, null, new C01YC(c942040acc2, null), 3);
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                C942040acc c942040acc2 = c942040acc;
                C23250099c.LIZLLL(c942040acc2.LLJIJIL, null, null, new C01YC(c942040acc2, null), 3);
            }
        };
    }

    public static final Object invoke$564(C5182020e c5182020e) {
        ((C780930UkF) c5182020e.l0).LIZJ("capsule_message");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$565(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$566(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$567(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$568(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$569(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$57(C5182020e c5182020e) {
        ((BaseLiveShowViewModel) c5182020e.l0).zQ2("checkAnimationStateAfterLiveShowEnd");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$570(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$571(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$572(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$573(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$574(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$575(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$576(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$577(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$578(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$579(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$58(C5182020e c5182020e) {
        ((BaseLiveShowViewModel) c5182020e.l0).LL.setValue(3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$580(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$581(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$582(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$583(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$584(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$585(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$586(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$587(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$588(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$589(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$59(C5182020e c5182020e) {
        ((BaseLiveShowViewModel) c5182020e.l0).LL.setValue(0);
        ((BaseLiveShowViewModel) c5182020e.l0).DQ2();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$590(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$591(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$592(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$593(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$594(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$595(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$596(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$597(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$598(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("monitorNextOpenPageActiveDuration->unregisterAndCallback: stay duration is ");
        sbLIZ.append(((C238400w2) c5182020e.l0).element);
        sbLIZ.append("ms");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Long] */
    public static final Object invoke$599(C5182020e c5182020e) {
        ((C259800zU) c5182020e.l0).element = Long.valueOf(System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$60(C5182020e c5182020e) {
        ((BaseLiveShowViewModel) c5182020e.l0).LL.setValue(2);
        ((BaseLiveShowViewModel) c5182020e.l0).DQ2();
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Long] */
    public static final Object invoke$600(C5182020e c5182020e) {
        ((C259800zU) c5182020e.l0).element = Long.valueOf(System.currentTimeMillis());
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$601(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$602(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$603(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$604(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$605(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$606(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$607(C5182020e c5182020e) {
        Function2 function2 = (Function2) c5182020e.l0;
        if (function2 != null) {
            Boolean bool = Boolean.TRUE;
            function2.invoke(bool, bool);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$608(C5182020e c5182020e) {
        Function2 function2 = (Function2) c5182020e.l0;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$609(C5182020e c5182020e) {
        Function2 function2 = (Function2) c5182020e.l0;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, Boolean.FALSE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$61(C5182020e c5182020e) {
        return new C1090610eUF(((LiveShowGuestWidget) c5182020e.l0).getContext(), ((LiveShowGuestWidget) c5182020e.l0).LLJJIJIL);
    }

    public static /* bridge */ /* synthetic */ Object invoke$610(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$611(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$612(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$613(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$614(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$615(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result=ResetExpanded scene=ResetState oldTranslationY=");
        sbLIZ.append((Float) c5182020e.l0);
        sbLIZ.append(" newTranslationY=0.0 state=Expanded");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$616(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$617(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$618(C5182020e c5182020e) {
        C501540Jlg.LIZJ(C497740JfY.LJII(), (Throwable) c5182020e.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$619(C5182020e c5182020e) {
        C11JF c11jf = ((C262300zt) c5182020e.l0).LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((C262300zt) c5182020e.l0).LIZLLL = null;
        return Unit.LIZ;
    }

    public static final Object invoke$62(C5182020e c5182020e) {
        final LiveShowGuestWidget liveShowGuestWidget = (LiveShowGuestWidget) c5182020e.l0;
        return new C01HO() { // from class: X.01Go
            @Override // X.C01HO
            public final void LIZ(long j) {
                AbstractC19484711Kz<C470590Icr<FinishShowingGuestResponse.ResponseData>> abstractC19484711KzFinishGuest;
                LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) liveShowGuestWidget.LLILLJJLI;
                if (liveShowGuestViewModel != null) {
                    FinishShowingGuestParams finishShowingGuestParams = new FinishShowingGuestParams();
                    finishShowingGuestParams.roomId = liveShowGuestViewModel.LLJ;
                    finishShowingGuestParams.channelId = liveShowGuestViewModel.getChannelId();
                    finishShowingGuestParams.showId = BaseLiveShowViewModel.FQ2();
                    finishShowingGuestParams.targetUserId = j;
                    InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
                    if (interfaceC302601FgLIZ != null && (abstractC19484711KzFinishGuest = interfaceC302601FgLIZ.finishGuest(finishShowingGuestParams)) != null) {
                        liveShowGuestViewModel.EQ2().LIZ(abstractC19484711KzFinishGuest.LJFF(new C0UO0()).LJJIIZ(new C516201zk(liveShowGuestViewModel, 232), new C09JN() { // from class: X.01Fd
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("LiveShowGuestViewModel@6827.finishSelfLiveShow$2");
                                C20441214yg.LIZIZ("LiveShowGuestViewModel", "finish guest failed");
                                C1C7U.LIZIZ("LiveShowGuestViewModel@6827.finishSelfLiveShow$2");
                            }
                        }));
                    }
                }
            }

            @Override // X.C01HO
            public final void LIZIZ(long j) {
                Room room;
                boolean z;
                boolean zBooleanValue;
                AbstractC928510aGn abstractC928510aGnLIZ;
                LinkListUser linkListUser;
                com.bytedance.android.live.base.model.user.User user;
                DataChannel dataChannel = liveShowGuestWidget.dataChannel;
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                    boolean z2 = true;
                    if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().isEnableGift()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean bool = (Boolean) liveShowGuestWidget.dataChannel.gg0(UserIsAnchorChannel.class);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0() <= 0) {
                        z2 = false;
                    }
                    EnumC1118300fCu enumC1118300fCuLIZIZ = C1118310fCv.LIZIZ(zBooleanValue, z2, z);
                    if (enumC1118300fCuLIZIZ != EnumC1118300fCu.GREY && enumC1118300fCuLIZIZ != EnumC1118300fCu.HIDE) {
                        InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                        if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (linkListUser = (LinkListUser) abstractC928510aGnLIZ.LJIILIIL(j)) != null && (user = linkListUser.user) != null) {
                            C1121570fIB c1121570fIB = new C1121570fIB(user);
                            c1121570fIB.LIZJ = "multiguest_liveshow_panel";
                            C930480aJy.LIZ.getClass();
                            c1121570fIB.LJI = C930480aJy.LJJIIZI();
                            c1121570fIB.LJII = C308401Hm.LIZ();
                            liveShowGuestWidget.dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
                            return;
                        }
                        return;
                    }
                    if (room.getRoomAuthStatus() != null && room.getRoomAuthStatus().getRoomAuthOffReasons() != null && room.getRoomAuthStatus().getRoomAuthOffReasons().getGift() != null) {
                        C766270U4b.LJIIJJI(room.getRoomAuthStatus().getRoomAuthOffReasons().getGift());
                        liveShowGuestWidget.dataChannel.LC0(LogGiftCloseToastShowEvent.class, Boolean.TRUE);
                    }
                }
            }
        };
    }

    public static final Object invoke$620(C5182020e c5182020e) {
        return new C262300zt(((C262200zs) c5182020e.l0).LLILZLL);
    }

    public static final Object invoke$621(C5182020e c5182020e) {
        return new AnonymousClass0100(((C262200zs) c5182020e.l0).LLILZLL);
    }

    public static final Object invoke$622(C5182020e c5182020e) {
        C11JF c11jf = ((C262200zs) c5182020e.l0).LLJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ((C262200zs) c5182020e.l0).LLJ = null;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$623(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$624(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$625(C5182020e c5182020e) {
        return Boolean.valueOf(!((List) c5182020e.l0).isEmpty());
    }

    public static final Object invoke$626(C5182020e c5182020e) {
        return Boolean.valueOf(!((List) c5182020e.l0).isEmpty());
    }

    public static final Object invoke$627(C5182020e c5182020e) {
        return new C389701fL((C395101gD) ((C394101g3) c5182020e.l0).LJIIIZ.getValue());
    }

    public static /* bridge */ /* synthetic */ Object invoke$628(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$629(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object invoke$63(C5182020e c5182020e) {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        AbstractC19484711Kz<C470590Icr<GetShowSettingsResponse.ResponseData>> showSetting;
        AbstractC19484711Kz<C470590Icr<GetShowContentResponse.ResponseData>> showContent;
        ArrayList arrayList;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        LiveShowModeratorWidget liveShowModeratorWidget = (LiveShowModeratorWidget) c5182020e.l0;
        LiveShowModeratorViewModel liveShowModeratorViewModel = liveShowModeratorWidget.LL;
        if (liveShowModeratorViewModel != null) {
            InterfaceC302601Fg interfaceC302601FgLIZ2 = C01FQ.LIZ();
            if (interfaceC302601FgLIZ2 != null && interfaceC302601FgLIZ2.LJIIL() == 0) {
                MutableLiveData<List<LinkPlayerInfo>> mutableLiveData = liveShowModeratorViewModel.LLJILJIL;
                InterfaceC917530Zz5 interfaceC917530Zz5 = (InterfaceC917530Zz5) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
                if (interfaceC917530Zz5 != null && (abstractC928510aGnLIZ = interfaceC917530Zz5.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                    arrayList = new ArrayList();
                    for (Object obj : listLJJIII) {
                        long id = ((LinkPlayerInfo) obj).mUser.getId();
                        Long lLJIILLIIL = C930540aK4.LJIILLIIL();
                        if (lLJIILLIIL == null || id != lLJIILLIIL.longValue()) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                mutableLiveData.postValue(arrayList);
            } else {
                GetShowContentParams getShowContentParams = new GetShowContentParams();
                getShowContentParams.showId = BaseLiveShowViewModel.FQ2();
                getShowContentParams.channelId = liveShowModeratorViewModel.getChannelId();
                getShowContentParams.roomId = liveShowModeratorViewModel.LLJ;
                C923330a8R c923330a8R = C923330a8R.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LiveShowModeratorViewModel_getShowList isUpdateShowingGuest: ");
                sbLIZ.append(false);
                C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
                if (interfaceC302601FgLIZ3 != null && (showContent = interfaceC302601FgLIZ3.getShowContent(getShowContentParams)) != null) {
                    liveShowModeratorViewModel.EQ2().LIZ(showContent.LJFF(new C0UO0()).LJJIIZ(new C515501zd(liveShowModeratorViewModel, false, 11), new C09JN() { // from class: X.00Sf
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            C1C7U.LIZ("LiveShowModeratorViewModel@48fd.getShowList$2");
                            C923330a8R c923330a8R2 = C923330a8R.LIZ;
                            C923330a8R.LJIILIIL("LiveShowModeratorViewModel_getShowList failed");
                            C20441214yg.LIZIZ("LiveShowModeratorViewModel", "getShowList failed");
                            C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.getShowList$2");
                        }
                    }));
                }
            }
        }
        InterfaceC302601Fg interfaceC302601FgLIZ4 = C01FQ.LIZ();
        if (interfaceC302601FgLIZ4 != null && interfaceC302601FgLIZ4.LJIIL() == 0 && liveShowModeratorWidget.LLILZIL) {
            liveShowModeratorWidget.LLILZIL = false;
            LiveShowModeratorViewModel liveShowModeratorViewModel2 = liveShowModeratorWidget.LL;
            if (liveShowModeratorViewModel2 != null && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && (showSetting = interfaceC302601FgLIZ.getShowSetting(new GetShowSettingsParams())) != null) {
                liveShowModeratorViewModel2.EQ2().LIZ(showSetting.LJFF(new C0UO0()).LJJIIZ(new C516201zk(liveShowModeratorViewModel2, 244), new C09JN() { // from class: X.00RO
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.getShowSetting$2");
                        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "get show setting failed");
                        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.getShowSetting$2");
                    }
                }));
            }
        }
        liveShowModeratorWidget.y1();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$630(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$631(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$632(C5182020e c5182020e) {
        return ((C497301wh) c5182020e.l0).itemView.findViewById(R.id.l4h);
    }

    public static final Object invoke$633(C5182020e c5182020e) {
        return ((C497301wh) c5182020e.l0).itemView.findViewById(R.id.l4i);
    }

    public static final Object invoke$634(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTextLandingFrag");
        sbLIZ.append(((View) c5182020e.l0).hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$635(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadBcmConfig from cache error, throwable: ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$636(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchBcmConfig parse error, throwable: ");
        sbLIZ.append(((Throwable) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$637(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$638(C5182020e c5182020e) {
        ((C094D) c5182020e.l0).LJIIJJI(new C386801es(-3100, "Co existed and user canceled"));
        return Unit.LIZ;
    }

    public static final Object invoke$639(C5182020e c5182020e) {
        Function1 function1 = (Function1) c5182020e.l0;
        if (function1 != null) {
            function1.invoke(new Throwable("has no device permission"));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(C5182020e c5182020e) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIIL(new C5182020e((ShowConfig) c5182020e.l0, 66));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$640(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$641(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$642(C5182020e c5182020e) {
        C766270U4b.LIZLLL(2131852013);
        ((Function1) c5182020e.l0).invoke(Boolean.FALSE);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$643(C5182020e c5182020e) throws JSONException {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("from", "info_collect");
            jSONObject.put("action", "enable");
            jSONObject.put("result", true);
            iEventCenter.LIZ("ec_checkout_guide_exit", C786410Ut5.J3(jSONObject));
        }
        ((GeneralPostPaymentAssem) c5182020e.l0).Lo();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$644(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$645(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bizum openCountryPicker failed: ");
        sbLIZ.append(((Exception) c5182020e.l0).getClass().getSimpleName());
        sbLIZ.append(", message=");
        sbLIZ.append(((Exception) c5182020e.l0).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$646(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$647(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$648(C5182020e c5182020e) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("@LinkRelation", "try showPrivacyNotice!");
        new C451201pG((C19EG) c5182020e.l0, true).LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$649(C5182020e c5182020e) {
        LiveMode liveMode;
        DataChannel dataChannel = (DataChannel) c5182020e.l0;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        return Boolean.valueOf(C781520UlC.LJIIJJI(liveMode));
    }

    public static final Object invoke$65(C5182020e c5182020e) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIIL(AnonymousClass0206.get$arr$(54));
        ((Function0) c5182020e.l0).invoke();
        return Unit.LIZ;
    }

    public static final Object invoke$650(C5182020e c5182020e) {
        LiveMode liveMode;
        DataChannel dataChannel = (DataChannel) c5182020e.l0;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        return Boolean.valueOf(C781520UlC.LJIIJJI(liveMode));
    }

    public static final Object invoke$651(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start to handle ");
        sbLIZ.append(((Set) c5182020e.l0).size());
        sbLIZ.append(" missed groups...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$652(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$653(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$654(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$655(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$656(C5182020e c5182020e) {
        return Boolean.valueOf(!((List) c5182020e.l0).isEmpty());
    }

    public static final Object invoke$66(C5182020e c5182020e) {
        ShowContent content;
        ShowConfig showConfig;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null && (content = interfaceC302601FgLIZ.getContent()) != null && (showConfig = content.showConfig) != null && showConfig.allowOpenMicFreely == ((ShowConfig) c5182020e.l0).allowOpenMicFreely) {
            ShowConfig showConfig2 = content.showConfig;
            if (showConfig2 == null || showConfig2.transitionDurationOfConfig != ((ShowConfig) c5182020e.l0).transitionDurationOfConfig) {
                C766270U4b.LIZLLL(2131853843);
            }
        } else {
            C766270U4b.LIZLLL(2131853842);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01Zq] */
    public static final Object invoke$67(C5182020e c5182020e) {
        final BaseTopGuestGamePlayWidget baseTopGuestGamePlayWidget = (BaseTopGuestGamePlayWidget) c5182020e.l0;
        return new C355501Zp(new InterfaceC356301Zx() { // from class: X.01Zq
            @Override // X.InterfaceC356301Zx
            public final Map LIZ(Map map) {
                return null;
            }

            @Override // X.InterfaceC356301Zx
            public final void LIZLLL() {
                C20441214yg.LIZIZ(baseTopGuestGamePlayWidget.y1(), "before send show event");
            }

            @Override // X.InterfaceC356301Zx
            public final boolean LIZJ() {
                C01ZR c01zrLIZIZ = C356501Zz.LIZIZ();
                return c01zrLIZIZ != null && c01zrLIZIZ.LIZLLL();
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0033 A[PHI: r2 r3
              0x0033: PHI (r2v1 int) = (r2v0 int), (r2v3 int), (r2v3 int) binds: [B:20:0x0030, B:13:0x0019, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]
              0x0033: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean), (r3v3 boolean) binds: [B:20:0x0030, B:13:0x0019, B:15:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC356301Zx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> r6) {
                /*
                    r5 = this;
                    com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget<com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel> r0 = r1
                    VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel r4 = r0.LL
                    r3 = 0
                    if (r4 == 0) goto L2f
                    X.01Zw r0 = r4.LL
                    if (r0 == 0) goto L2f
                    int r2 = r0.LIZ
                Ld:
                    X.01Zw r0 = r4.LL
                    if (r0 == 0) goto L17
                    boolean r1 = r0.LIZJ
                    r0 = 1
                    if (r1 != r0) goto L17
                    r3 = 1
                L17:
                    X.01Zw r0 = r4.LL
                    if (r0 == 0) goto L33
                    java.lang.Long r0 = r0.LIZIZ
                    if (r0 == 0) goto L33
                    long r0 = r0.longValue()
                L23:
                    com.bytedance.android.live.base.model.user.User r0 = X.C01JX.LJIIIIZZ(r0)
                    org.json.JSONObject r0 = X.C00FW.LIZ(r2, r0, r3)
                    r6.invoke(r0)
                    return
                L2f:
                    r2 = 0
                    if (r4 == 0) goto L33
                    goto Ld
                L33:
                    r0 = -1
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C355601Zq.LIZIZ(kotlin.jvm.functions.Function1):void");
            }
        });
    }

    public static final Object invoke$68(C5182020e c5182020e) {
        Fragment fragment;
        WeakReference<Fragment> weakReference = ((AnchorTextHeaderService) c5182020e.l0).LIZJ;
        C19EG c19eg = null;
        if (weakReference != null) {
            fragment = weakReference.get();
        } else {
            fragment = null;
        }
        WeakReference<C19EG> weakReference2 = ((AnchorTextHeaderService) c5182020e.l0).LIZLLL;
        if (weakReference2 != null) {
            c19eg = weakReference2.get();
        }
        if (fragment != null && fragment.isAdded() && !fragment.isRemoving() && !fragment.isDetached()) {
            final DataChannel dataChannel = ((AnchorTextHeaderService) c5182020e.l0).LIZIZ;
            return new ViewModelProvider(fragment, new ViewModelProvider.Factory(dataChannel) { // from class: X.01OE
                public final DataChannel LIZ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                {
                    this.LIZ = dataChannel;
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    if (cls.isAssignableFrom(AnchorTextHeaderViewModel.class)) {
                        return new AnchorTextHeaderViewModel(this.LIZ);
                    }
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }
            }).get(AnchorTextHeaderViewModel.class);
        }
        if (c19eg != null) {
            final DataChannel dataChannel2 = ((AnchorTextHeaderService) c5182020e.l0).LIZIZ;
            return new ViewModelProvider(c19eg, new ViewModelProvider.Factory(dataChannel2) { // from class: X.01OE
                public final DataChannel LIZ;

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                {
                    this.LIZ = dataChannel2;
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    if (cls.isAssignableFrom(AnchorTextHeaderViewModel.class)) {
                        return new AnchorTextHeaderViewModel(this.LIZ);
                    }
                    throw new IllegalArgumentException("Unknown ViewModel class");
                }
            }).get(AnchorTextHeaderViewModel.class);
        }
        return new AnchorTextHeaderViewModel(((AnchorTextHeaderService) c5182020e.l0).LIZIZ);
    }

    public static final Object invoke$69(C5182020e c5182020e) {
        final DataChannel dataChannel = (DataChannel) c5182020e.l0;
        return new AbstractC301401Eu(dataChannel) { // from class: X.01Ei
            public static final /* synthetic */ int LJI = 0;
            public final C01GW LJFF = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(58));

            @Override // X.AbstractC301401Eu
            public final String LJ() {
                return "AnchorTextHeaderModel";
            }

            @Override // X.AbstractC301401Eu
            public final void LJFF() {
                DataChannel dataChannel2 = this.LIZ;
                if (dataChannel2 != null) {
                    dataChannel2.CQ2(TextHeaderUsingRichTextChangeChannel.class, this, new C5183020f(this, 71));
                }
            }

            @Override // X.AbstractC301401Eu
            public final void LJI() {
                super.LJI();
                DataChannel dataChannel2 = this.LIZ;
                if (dataChannel2 != null) {
                    dataChannel2.zQ2(this);
                }
                ((C11NJ) this.LJFF.getValue()).LJ();
            }
        };
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$70(C5182020e c5182020e) {
        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment = (AnchorTextHeaderCreationSheetFragment) c5182020e.l0;
        anchorTextHeaderCreationSheetFragment.getClass();
        C972080bP4.LIZLLL("request failed", "AnchorTextHeaderCreationSheetFragment", 2);
        anchorTextHeaderCreationSheetFragment.ES();
        anchorTextHeaderCreationSheetFragment.close(1);
        return Unit.LIZ;
    }

    public static final Object invoke$71(C5182020e c5182020e) {
        AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment = (AnchorTextHeaderCreationSheetFragment) c5182020e.l0;
        anchorTextHeaderCreationSheetFragment.getClass();
        C972080bP4.LIZLLL("request failed", "AnchorTextHeaderCreationSheetFragment", 2);
        anchorTextHeaderCreationSheetFragment.ES();
        anchorTextHeaderCreationSheetFragment.close(1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$72(C5182020e c5182020e) {
        C01ZA c01za;
        List<C01ZA> value;
        List<C00UM> value2;
        MutableLiveData<List<C00UM>> mutableLiveData;
        MutableLiveData<List<C01ZA>> mutableLiveData2;
        MutableLiveData mutableLiveData3;
        TextHeaderListFragment textHeaderListFragment = (TextHeaderListFragment) c5182020e.l0;
        AnchorTextHeaderViewModel anchorTextHeaderViewModel = textHeaderListFragment.LL;
        if (anchorTextHeaderViewModel != null && (mutableLiveData3 = anchorTextHeaderViewModel.LLILZLL) != null) {
            c01za = (C01ZA) mutableLiveData3.getValue();
        } else {
            c01za = null;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel2 = ((TextHeaderListFragment) c5182020e.l0).LL;
        if (anchorTextHeaderViewModel2 == null || (mutableLiveData2 = anchorTextHeaderViewModel2.LLJILJIL) == null || (value = mutableLiveData2.getValue()) == null) {
            value = C13BV.INSTANCE;
        }
        AnchorTextHeaderViewModel anchorTextHeaderViewModel3 = ((TextHeaderListFragment) c5182020e.l0).LL;
        if (anchorTextHeaderViewModel3 == null || (mutableLiveData = anchorTextHeaderViewModel3.LLJILJILJ) == null || (value2 = mutableLiveData.getValue()) == null) {
            value2 = C13BV.INSTANCE;
        }
        textHeaderListFragment.PR(c01za, value, value2);
        return Unit.LIZ;
    }

    public static final Object invoke$73(C5182020e c5182020e) {
        return new C299901Ef((DataChannel) c5182020e.l0);
    }

    public static final Object invoke$74(C5182020e c5182020e) {
        return new C327801Oy(LifecycleOwnerKt.getLifecycleScope(((MultiHostInviteListFragmentV2) c5182020e.l0).getViewLifecycleOwner()), C0PEM.LIZ, AnonymousClass0206.get$arr$(288));
    }

    public static final Object invoke$75(C5182020e c5182020e) {
        ((BroadcastCountDownWidget) c5182020e.l0).hide();
        InterfaceC357101a5 interfaceC357101a5 = ((BroadcastCountDownWidget) c5182020e.l0).LL;
        if (interfaceC357101a5 != null) {
            interfaceC357101a5.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$76(C5182020e c5182020e) {
        return new ViewModelProvider(((MultiPreviewInviteGuestWidget) c5182020e.l0).widgetCallback.getFragment()).get(LiveInviteGuestViewModel.class);
    }

    public static final Object invoke$77(C5182020e c5182020e) {
        return ((PreviewInviteGuestWidget) c5182020e.l0).findViewById(R.id.op5);
    }

    public static final Object invoke$78(C5182020e c5182020e) {
        return new C784320Upi(C475510Ikn.LJ((PreviewLiveModeListSheetFragment) c5182020e.l0), new C5182020e((PreviewLiveModeListSheetFragment) c5182020e.l0, 79));
    }

    public static final Object invoke$79(C5182020e c5182020e) {
        View view = ((PreviewLiveModeListSheetFragment) c5182020e.l0).getView();
        if (view != null) {
            HandlerHook.viewPostDelay(view, new RunnableC514801zW((PreviewLiveModeListSheetFragment) c5182020e.l0, 35), 500L);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$80(C5182020e c5182020e) {
        View view = ((PreviewGameDropsWidget) c5182020e.l0).getView();
        if (view != null) {
            return view.findViewById(R.id.widget_icon);
        }
        return null;
    }

    public static final Object invoke$81(C5182020e c5182020e) {
        Context context = (Context) c5182020e.l0;
        if (C015V.LIZJ().oK0() != null) {
            C01GU.LIZ(context, C015V.LIZIZ());
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
        c474500IjALIZ.LJJIIZI(C015V.LIZIZ());
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$82(C5182020e c5182020e) {
        return new ViewModelProvider((LiveInviteGuestSheet) c5182020e.l0).get(LiveInviteGuestViewModel.class);
    }

    public static final Object invoke$83(C5182020e c5182020e) {
        return new RunnableC514801zW((C0KAM) c5182020e.l0, 37);
    }

    public static final Object invoke$84(C5182020e c5182020e) {
        View view = ((GameInGameRankDialog) c5182020e.l0).getView();
        if (view != null) {
            return view.findViewById(R.id.zqg);
        }
        return null;
    }

    public static final Object invoke$85(C5182020e c5182020e) {
        View view = ((GameInGameRankDialog) c5182020e.l0).getView();
        if (view != null) {
            return view.findViewById(R.id.zqm);
        }
        return null;
    }

    public static final Object invoke$86(C5182020e c5182020e) {
        View view = ((GameAutoCoverWidget) c5182020e.l0).getView();
        if (view != null) {
            return view.findViewById(R.id.y1o);
        }
        return null;
    }

    public static final Object invoke$87(C5182020e c5182020e) {
        View view = ((GameAutoCoverWidget) c5182020e.l0).getView();
        if (view != null) {
            return view.findViewById(R.id.wu9);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$88(C5182020e c5182020e) {
        int iIntValue;
        MutableLiveData mutableLiveData = (MutableLiveData) c5182020e.l0;
        Integer num = (Integer) mutableLiveData.getValue();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        mutableLiveData.setValue(Integer.valueOf(iIntValue + 1));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$89(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$90(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$91(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$92(C5182020e c5182020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assem_");
        sbLIZ.append(C09R7.LIZ((C13IQ) c5182020e.l0).getName());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$93(C5182020e c5182020e) {
        C11RK c11rk = new C11RK();
        GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel = (GroupLiveRankingPanelViewModel) c5182020e.l0;
        ((C11NJ) groupLiveRankingPanelViewModel.LLILLJJLI.getValue()).LIZ(c11rk.LJJLIIIJLLLLLLLZ(GroupLiveConfig.INSTANCE.getGetValue().rankingPanelConfig.throttleIntervalDuration, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(groupLiveRankingPanelViewModel, 80)));
        return c11rk;
    }

    public static final Object invoke$94(C5182020e c5182020e) {
        return ((PanelRankingCell) c5182020e.l0).itemView.findViewById(R.id.q2d);
    }

    public static final Object invoke$95(C5182020e c5182020e) {
        return ((PanelRankingCell) c5182020e.l0).itemView.findViewById(R.id.q2e);
    }

    public static final Object invoke$96(C5182020e c5182020e) {
        return ((PanelRankingCell) c5182020e.l0).itemView.findViewById(R.id.q2a);
    }

    public static final Object invoke$97(C5182020e c5182020e) {
        return ((PanelRankingCell) c5182020e.l0).itemView.findViewById(R.id.q2b);
    }

    public static final Object invoke$98(C5182020e c5182020e) {
        return ((PanelRankingCell) c5182020e.l0).itemView.findViewById(R.id.q2c);
    }

    public static final Object invoke$99(C5182020e c5182020e) {
        return new C00JG(((GroupLiveAudienceWidget) c5182020e.l0).dataChannel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l0 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C187900nt c187900nt, int i) {
        super(0);
        this.$t = i;
        this.l0 = c187900nt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C238400w2 c238400w2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c238400w2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C248300xd c248300xd, int i) {
        super(0);
        this.$t = i;
        this.l0 = c248300xd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(C259800zU c259800zU, C259800zU<JSONObject> c259800zU2) {
        super(0);
        this.$t = c259800zU2;
        this.l0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C262200zs c262200zs, int i) {
        super(0);
        this.$t = i;
        this.l0 = c262200zs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C262300zt c262300zt, int i) {
        super(0);
        this.$t = i;
        this.l0 = c262300zt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C013C c013c, int i) {
        super(0);
        this.$t = i;
        this.l0 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C018C c018c, int i) {
        super(0);
        this.$t = i;
        this.l0 = c018c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(C291001Au c291001Au, C291001Au<Boolean> c291001Au2) {
        super(0);
        this.$t = c291001Au2;
        this.l0 = c291001Au;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C292501Bj c292501Bj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c292501Bj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C303401Fo c303401Fo, int i) {
        super(0);
        this.$t = i;
        this.l0 = c303401Fo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(C01GW c01gw, C01GW<? extends Aweme> c01gw2) {
        super(0);
        this.$t = c01gw2;
        this.l0 = c01gw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C01HJ c01hj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c01hj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C308101Hj c308101Hj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c308101Hj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C308201Hk c308201Hk, int i) {
        super(0);
        this.$t = i;
        this.l0 = c308201Hk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C01I4 c01i4, int i) {
        super(0);
        this.$t = i;
        this.l0 = c01i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(C310701Ij c310701Ij, C310701Ij<Channel<C946060aj6<Object>>, Object> c310701Ij2) {
        super(0);
        this.$t = c310701Ij2;
        this.l0 = c310701Ij;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C311401Iq c311401Iq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c311401Iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C01ZI c01zi, int i) {
        super(0);
        this.$t = i;
        this.l0 = c01zi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C369601c6 c369601c6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c369601c6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C394101g3 c394101g3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c394101g3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C404401hi c404401hi, int i) {
        super(0);
        this.$t = i;
        this.l0 = c404401hi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(AbstractC405601hu abstractC405601hu, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC405601hu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C429301lj c429301lj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c429301lj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C431201m2 c431201m2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c431201m2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C431401m4 c431401m4, int i) {
        super(0);
        this.$t = i;
        this.l0 = c431401m4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C431601m6 c431601m6, int i) {
        super(0);
        this.$t = i;
        this.l0 = c431601m6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C432101mB c432101mB, int i) {
        super(0);
        this.$t = i;
        this.l0 = c432101mB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C432201mC c432201mC, int i) {
        super(0);
        this.$t = i;
        this.l0 = c432201mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C432301mD c432301mD, int i) {
        super(0);
        this.$t = i;
        this.l0 = c432301mD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C432501mF c432501mF, int i) {
        super(0);
        this.$t = i;
        this.l0 = c432501mF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C443301nz c443301nz, int i) {
        super(0);
        this.$t = i;
        this.l0 = c443301nz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C490301vZ c490301vZ, int i) {
        super(0);
        this.$t = i;
        this.l0 = c490301vZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C497301wh c497301wh, int i) {
        super(0);
        this.$t = i;
        this.l0 = c497301wh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C5182020e c5182020e, int i) {
        super(0);
        this.$t = i;
        this.l0 = c5182020e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C5185020h c5185020h, int i) {
        super(0);
        this.$t = i;
        this.l0 = c5185020h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C15505065f c15505065f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c15505065f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(C094D c094d, C094D<? super LiveEffect> c094d2) {
        super(0);
        this.$t = c094d2;
        this.l0 = c094d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C2344009Gk c2344009Gk, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2344009Gk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C0KAM c0kam, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0kam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C780930UkF c780930UkF, int i) {
        super(0);
        this.$t = i;
        this.l0 = c780930UkF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C919390a25 c919390a25, int i) {
        super(0);
        this.$t = i;
        this.l0 = c919390a25;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(InterfaceC927510aFB interfaceC927510aFB, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC927510aFB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C942040acc c942040acc, int i) {
        super(0);
        this.$t = i;
        this.l0 = c942040acc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C1108880exi c1108880exi, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1108880exi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C1109770ez9 c1109770ez9, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1109770ez9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C1128710fTh c1128710fTh, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1128710fTh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C13IQ c13iq, int i) {
        super(0);
        this.$t = i;
        this.l0 = c13iq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C15B9 c15b9, int i) {
        super(0);
        this.$t = i;
        this.l0 = c15b9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C19EG c19eg, int i) {
        super(0);
        this.$t = i;
        this.l0 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(C2252611DEt c2252611DEt, int i) {
        super(0);
        this.$t = i;
        this.l0 = c2252611DEt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Uri uri, int i) {
        super(0);
        this.$t = i;
        this.l0 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LifecycleOwner lifecycleOwner, int i) {
        super(0);
        this.$t = i;
        this.l0 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(MutableLiveData mutableLiveData, MutableLiveData<Integer> mutableLiveData2) {
        super(0);
        this.$t = mutableLiveData2;
        this.l0 = mutableLiveData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(ApplyGuideViewModel applyGuideViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = applyGuideViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(BizSpotInfoCenter bizSpotInfoCenter, int i) {
        super(0);
        this.$t = i;
        this.l0 = bizSpotInfoCenter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = countDownForAllV2AnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GuestShowdownAnchorViewModel guestShowdownAnchorViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = guestShowdownAnchorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GuestShowdownAnchorWidget guestShowdownAnchorWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = guestShowdownAnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(BaseGuestShowdownWidget baseGuestShowdownWidget, BaseGuestShowdownWidget<VM> baseGuestShowdownWidget2) {
        super(0);
        this.$t = baseGuestShowdownWidget2;
        this.l0 = baseGuestShowdownWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GuestShowdownRankDialog guestShowdownRankDialog, int i) {
        super(0);
        this.$t = i;
        this.l0 = guestShowdownRankDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GuestShowdownGuestWidget guestShowdownGuestWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = guestShowdownGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(BasePlaybookService basePlaybookService, BasePlaybookService<VM> basePlaybookService2) {
        super(0);
        this.$t = basePlaybookService2;
        this.l0 = basePlaybookService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(BasePlaybookViewModel basePlaybookViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = basePlaybookViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PlaybookEditorDialog playbookEditorDialog, int i) {
        super(0);
        this.$t = i;
        this.l0 = playbookEditorDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PlaybookEditorMoreDialog playbookEditorMoreDialog, int i) {
        super(0);
        this.$t = i;
        this.l0 = playbookEditorMoreDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = pGCPlaybookEditorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(UGCPlaybookEditorViewModel uGCPlaybookEditorViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = uGCPlaybookEditorViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveShowAnchorWidget liveShowAnchorWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShowAnchorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveShowAudienceWidget liveShowAudienceWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShowAudienceWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(BaseLiveShowViewModel baseLiveShowViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseLiveShowViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(BaseLiveShowWidget baseLiveShowWidget, BaseLiveShowWidget<T> baseLiveShowWidget2) {
        super(0);
        this.$t = baseLiveShowWidget2;
        this.l0 = baseLiveShowWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveShowGuestWidget liveShowGuestWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShowGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveShowModeratorWidget liveShowModeratorWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveShowModeratorWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(BaseTopGuestGamePlayViewModel baseTopGuestGamePlayViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseTopGuestGamePlayViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(BaseTopGuestGamePlayWidget baseTopGuestGamePlayWidget, BaseTopGuestGamePlayWidget<VM> baseTopGuestGamePlayWidget2) {
        super(0);
        this.$t = baseTopGuestGamePlayWidget2;
        this.l0 = baseTopGuestGamePlayWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(AnchorTextHeaderCreationSheetFragment anchorTextHeaderCreationSheetFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = anchorTextHeaderCreationSheetFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(AnchorTextHeaderService anchorTextHeaderService, int i) {
        super(0);
        this.$t = i;
        this.l0 = anchorTextHeaderService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(TextHeaderListFragment textHeaderListFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = textHeaderListFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(MultiHostInviteListFragmentV2 multiHostInviteListFragmentV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiHostInviteListFragmentV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(BroadcastCountDownWidget broadcastCountDownWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = broadcastCountDownWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(MultiPreviewInviteGuestWidget multiPreviewInviteGuestWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiPreviewInviteGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PreviewInviteGuestWidget previewInviteGuestWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = previewInviteGuestWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PreviewLiveCenterWidget previewLiveCenterWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = previewLiveCenterWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PreviewLiveModeListSheetFragment previewLiveModeListSheetFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = previewLiveModeListSheetFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PreviewGameDropsWidget previewGameDropsWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = previewGameDropsWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveInviteGuestSheet liveInviteGuestSheet, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveInviteGuestSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GameInGameRankDialog gameInGameRankDialog, int i) {
        super(0);
        this.$t = i;
        this.l0 = gameInGameRankDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GameAutoCoverWidget gameAutoCoverWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = gameAutoCoverWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GiftHintInfo giftHintInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = giftHintInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = groupLiveRankingPanelViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PanelRankingCell panelRankingCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = panelRankingCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GroupLiveAudienceWidget groupLiveAudienceWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = groupLiveAudienceWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveGoalPinCardWidget liveGoalPinCardWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveGoalPinCardWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(RoomMessage roomMessage, int i) {
        super(0);
        this.$t = i;
        this.l0 = roomMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(ViewerWishesViewModel viewerWishesViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewerWishesViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GiftWidgetKotlin giftWidgetKotlin, int i) {
        super(0);
        this.$t = i;
        this.l0 = giftWidgetKotlin;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveEffect liveEffect, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(TuxTextView tuxTextView, int i) {
        super(0);
        this.$t = i;
        this.l0 = tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(EditFundraiserPageFragment editFundraiserPageFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = editFundraiserPageFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(GeneralPostPaymentAssem generalPostPaymentAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = generalPostPaymentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(BubbleClickAction bubbleClickAction, int i) {
        super(0);
        this.$t = i;
        this.l0 = bubbleClickAction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PromotionBubble promotionBubble, int i) {
        super(0);
        this.$t = i;
        this.l0 = promotionBubble;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(FavoritePowerViewPagerViewModel favoritePowerViewPagerViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = favoritePowerViewPagerViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LiveAiSummaryWidget liveAiSummaryWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveAiSummaryWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(PreviewGameGuessBoardWidget previewGameGuessBoardWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = previewGameGuessBoardWidget;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(LandscapeFYPViewModel landscapeFYPViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = landscapeFYPViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Aweme aweme, int i) {
        super(0);
        this.$t = i;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(MessageRequestRootFragment messageRequestRootFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = messageRequestRootFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(ArtistMusicAwemeLisHintCell artistMusicAwemeLisHintCell, int i) {
        super(0);
        this.$t = i;
        this.l0 = artistMusicAwemeLisHintCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(TakoDetailKeyframeVM takoDetailKeyframeVM, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoDetailKeyframeVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = takoViewLargeImageDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(IMessage iMessage, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Boolean bool, int i) {
        super(0);
        this.$t = i;
        this.l0 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Double d, int i) {
        super(0);
        this.$t = i;
        this.l0 = d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Exception exc, int i) {
        super(0);
        this.$t = i;
        this.l0 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(WeakReference weakReference, WeakReference<C01CN> weakReference2) {
        super(0);
        this.$t = weakReference2;
        this.l0 = weakReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(ArrayList arrayList, ArrayList<String> arrayList2) {
        super(0);
        this.$t = arrayList2;
        this.l0 = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(HashMap map, HashMap<String, String> map2) {
        super(0);
        this.$t = map2;
        this.l0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(List list, List<Function0<Unit>> list2) {
        super(0);
        this.$t = list2;
        this.l0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(Map map, Map<String, String> map2) {
        super(0);
        this.$t = map2;
        this.l0 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(Set set, Set<Integer> set2) {
        super(0);
        this.$t = set2;
        this.l0 = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(Pair pair, Pair<Boolean, String> pair2) {
        super(0);
        this.$t = pair2;
        this.l0 = pair;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(Function0 function0, Function0<Unit> function02) {
        super(0);
        this.$t = function02;
        this.l0 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(Function1 function1, Function1<? super Throwable, Unit> function12) {
        super(0);
        this.$t = function12;
        this.l0 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5182020e(Function2 function2, Function2<? super Boolean, ? super String, Unit> function22) {
        super(0);
        this.$t = function22;
        this.l0 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.l0 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(ShowConfig showConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = showConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(InterfaceC346201Wa[] interfaceC346201WaArr, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC346201WaArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5182020e(Context context, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
    }
}

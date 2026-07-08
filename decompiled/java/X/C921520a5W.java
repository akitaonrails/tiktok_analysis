package X;

import Y.ARunnableS115S0100000_15;
import Y.AcS496S0100000_15;
import Y.AfS137S0000000_15;
import Y.AfS172S0100000_3;
import Y.AfS184S0100000_15;
import Y.AfS3S1100100_15;
import Y.AkS492S0100000_33;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.KaraokeStateChannel;
import com.bytedance.android.live.liveinteract.api.AnchorPermitGuestSuccessEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorCancelInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorKickOutGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.api.LinkMicUserJoinedEvent;
import com.bytedance.android.live.liveinteract.api.LinkedGuestCountChannel;
import com.bytedance.android.live.liveinteract.api.MaxMultiGuestMixModeApplyBubbleShowTimesChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStartEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAdStopEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorUserManangerEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestStopPlayAdEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestTalkStateChannel;
import com.bytedance.android.live.liveinteract.api.MuteMicViewStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.OnlyPushRtcEngineAlreadyCloseChannel;
import com.bytedance.android.live.liveinteract.api.RTCMixStreamSuccessWhenResumeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorBroadcastResolutionChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.LinkerModeChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoCaptureChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.ChangeLayoutForFloatPanelOnlyForLiveShow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.OneTapGoLiveEventV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.RestoreLayoutToFloatPanelOnlyForLiveShow;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorActivityBannerChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AnchorMuteGuestOp;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAcceptApplyChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestDisMissLinkMicManageDialogChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestQuickConnectStartChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestSendInviteChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestShowApplyManagerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3AnchorDestroyChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.QuickStartLayoutCreatedChannelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.TriggerListChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.CountDownService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorKickOutGuestByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition.GuestKickOutConditionTriggerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.LiveShowService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.zoom.ZoomServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.model.AudioPunishEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multihost.event.MultiGuestEndEvent;
import com.bytedance.android.live.liveinteract.multilive.model.FullPositionCancelPreApproveParams;
import com.bytedance.android.live.liveinteract.platform.common.api.LogReportApi;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorInProgressEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorInProgressEventWithCallback;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestShowMixModeApplyBubbleEvent;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.InviteBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.JoinDirectBizContent;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.MultiLiveContent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.BizContentWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageP2PParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageParam;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCP2PMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagChangedChannel;
import com.bytedance.android.livesdk.dataChannel.FeaturedHashTagCountDownRemindEvent;
import com.bytedance.android.livesdk.dataChannel.LiveTalkStateEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicSwitchClosedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCoHostMaxGuestCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutFullScreenEnd;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeSwitchRustFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceCancelInviteTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownTimerPlayModeConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicModeSwitchDiposeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkAnchorConnectionOverLeaveRoomCacheDataSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkCoHostStopMultiGuestOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMaxGuestCntOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiAddFetchUserListForChMgOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiInviteFromPublicScreenGuideReportSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiInviteMixModeOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorActivityInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSdkRtcInitErrorLinkOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSlardarMonitorOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorPermitLimitOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostCpuTotalPssOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableMixStreamTypeSetting;
import com.bytedance.android.livesdk.model.MultiGuestManageGuestOperationEvent;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.RegionalRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS100S1000000_15;
import kotlin.jvm.internal.AwS10S0200001_15;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS49S0100100_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;
import webcast.data.multi_guest_social_data.Avatar;
import webcast.data.multilive_biz.BizChangeLayoutParams;
import webcast.data.multilive_biz.BizInviteParams;

/* JADX INFO: renamed from: X.0a5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921520a5W extends AbstractC921450a5P implements OnMessageListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final Room LLILLL;
    public final DataChannel LLILZ;
    public boolean LLILZIL;
    public C922010a6J LLILZLL;
    public boolean LLIZ;
    public Boolean LLIZLLLIL;
    public boolean LLJ;
    public Map<String, String> LLJI;
    public final C01GW LLJIJIL;
    public final C304201Fw LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public C11JF LLJJIJIIJIL;
    public final AwS559S0100000_15 LLJJIJIL;
    public volatile boolean LLJJJ;
    public volatile boolean LLJJJIL;
    public final HashMap<String, Boolean> LLJJJJ;
    public final C11NJ LLJJJJJIL;
    public final List<Long> LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public long LLJLL;
    public final C921310a5B LLJLLIL;
    public C919640a2U LLJLLL;
    public final C921760a5u LLJZ;
    public final C01GW LLJZIJLIL;
    public boolean LLL;
    public final C916930Zy7 LLLF;
    public final C916880Zy2 LLLFF;
    public final EnumC1275250jI3 LLLFFI;

    @InterfaceC948490an1(name = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
    public InterfaceC302401Fe userManager;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C921520a5W.class, "zoomService", "getZoomService()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/zoom/common/IZoomInterface;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC919200a1m
    public final void LJIIJJI() {
    }

    public static void LJLIL() {
        Uri uri;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C772560USg c772560USg = (C772560USg) dataChannelGlobal.gg0(C930910aKf.class);
        if (c772560USg == null || (uri = c772560USg.LIZLLL) == null) {
            return;
        }
        C772560USg c772560USg2 = (C772560USg) dataChannelGlobal.gg0(C930910aKf.class);
        if (c772560USg2 != null) {
            c772560USg2.LIZLLL = null;
        }
        EnumC921560a5a enumC921560a5a = EnumC921560a5a.PLAYBOOK_MANAGE_SCHEMA;
        if (C1942307jB.LIZIZ(uri, enumC921560a5a.getStr()) == null && C1942307jB.LIZIZ(uri, EnumC921560a5a.PLAYBOOK_DETAIL_SCHEMA.getStr()) == null && C1942307jB.LIZIZ(uri, EnumC921560a5a.PLAYBOOK_ENTITY_SCHEMA.getStr()) == null && C1942307jB.LIZIZ(uri, EnumC921560a5a.PLAYBOOK_CREATE_SCHEMA.getStr()) == null && C1942307jB.LIZIZ(uri, "origin_schema") == null) {
            C20441214yg.LJIIIZ("MultiGuestV3AnchorPresenter", "parseSchemaDirect parameter not in playbook schema");
            return;
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme(C1942307jB.LIZIZ(uri, "origin_schema"));
        if (C1942307jB.LIZIZ(uri, enumC921560a5a.getStr()) != null) {
            builderScheme.authority(enumC921560a5a.getStr());
        } else {
            EnumC921560a5a enumC921560a5a2 = EnumC921560a5a.PLAYBOOK_DETAIL_SCHEMA;
            if (C1942307jB.LIZIZ(uri, enumC921560a5a2.getStr()) != null) {
                builderScheme.authority(enumC921560a5a2.getStr());
            } else {
                EnumC921560a5a enumC921560a5a3 = EnumC921560a5a.PLAYBOOK_ENTITY_SCHEMA;
                if (C1942307jB.LIZIZ(uri, enumC921560a5a3.getStr()) != null) {
                    builderScheme.authority(enumC921560a5a3.getStr());
                } else {
                    EnumC921560a5a enumC921560a5a4 = EnumC921560a5a.PLAYBOOK_CREATE_SCHEMA;
                    if (C1942307jB.LIZIZ(uri, enumC921560a5a4.getStr()) != null) {
                        builderScheme.authority(enumC921560a5a4.getStr());
                    }
                }
            }
        }
        for (String str : UriProtector.getQueryParameterNames(uri)) {
            builderScheme.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
        }
        Uri uriBuild = builderScheme.build();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("parseSchemaDirect originalUri=");
        sbLIZ.append(uriBuild);
        C20441214yg.LJIIIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, uriBuild);
        }
    }

    @Override // X.AbstractC921450a5P
    public final void LJJJLZIJ() {
        this.LLJLIL.getValue();
    }

    public final C920310a3Z LJJLIIIJL() {
        return (C920310a3Z) this.LLJL.getValue();
    }

    public final ILinkStateAbility LJJLIIIJLJLI() {
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q == null || (interfaceC665370Q7zF3 = interfaceC921460a5Q.F3()) == null) {
            return null;
        }
        return (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zF3, ILinkStateAbility.class, null);
    }

    public final Unit LJJLIIIJLLLLLLLZ() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                abstractC928510aGnLIZ.LJIJJLI();
            }
            interfaceC921460a5Q.OU0(null, null, C2097608Jq.LJ());
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        String strU3;
        String str;
        RtcUserInfo rtcUserInfoG0;
        if (InterfaceC1104970erP.I2.LIZIZ().booleanValue()) {
            C917290Zyh.LJIILIIL = "live_over";
            C917290Zyh.LJIIJJI();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(OnlyPushRtcEngineAlreadyCloseChannel.class, "anchor_widget_destroy");
        }
        if (!((ArrayList) this.LLJJJJLIIL).isEmpty()) {
            List<Long> list = this.LLJJJJLIIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null) {
                strU3 = "";
            }
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL2.G0()) == null || (str = rtcUserInfoG0.linkMicId) == null) {
                str = "";
            }
            C925600aC6.LJIILLIIL(strU3, str, this.LL.getStreamType().logStreamingType, arrayList);
        }
        C914580ZuK.LIZ = null;
        ((C922200a6c) this.LLJJ.getValue()).LIZIZ();
        C922820a7c.LIZJ(null);
        ((C922540a7A) this.LLJJI.getValue()).LIZIZ();
        C916580ZxY c916580ZxY = (C916580ZxY) this.LLJJIJI.getValue();
        if (c916580ZxY != null) {
            C915980Zwa.LJIIIIZZ().vq0(c916580ZxY.LIZJ);
            DataChannel dataChannel2 = c916580ZxY.LIZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(CurrentRealDisplayChannel.class, new Pair("", 0));
            }
            c916580ZxY.LIZ = null;
        }
        LJJLIIIJL().LIZJ();
        ((InterfaceC918930a1L) this.LLJLIL.getValue()).onDestroy();
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LJI("DATA_MULTI_GUEST_INVITE_ROUTING_CAPABILITY");
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJJIIJ(this.LLJLLIL);
        }
        InterfaceC302401Fe interfaceC302401Fe2 = this.userManager;
        if (interfaceC302401Fe2 != null) {
            interfaceC302401Fe2.release();
        }
        ((Map) C932140aMe.LIZIZ.getValue()).clear();
        C932140aMe.LJ().clear();
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        DataChannel dataChannel3 = this.LLILZ;
        if (dataChannel3 != null) {
            dataChannel3.zQ2(this);
        }
        C915980Zwa.LJIIIIZZ().a9(this.LLJZ);
        C915980Zwa.LJIIIIZZ().vq0(this.LLLFF);
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if (interfaceC923120a86LIZ != null) {
            interfaceC923120a86LIZ.LJJ(this.LLLF);
        }
        LJLJLLL();
        C1EOY.LIZ.LJIJJ();
        C921640a5i.LIZLLL();
        C917700ZzM.LIZ().clear();
        this.LLJJJJJIL.LJ();
        ((LinkedHashMap) C921640a5i.LLILZLL).clear();
        C920360a3e.LIZ.getClass();
        C920360a3e.LIZJ();
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        InterfaceC927510aFB zoomService = getZoomService();
        if (zoomService != null) {
            zoomService.destroy();
        }
        c948450amx.LJI("ZOOM_SERVICE");
        C20441214yg.LIZIZ("LiveShowService", "LiveShowService release");
        LiveShowService.LIZJ = true;
        c948450amx.LJI("LIVE_SHOW_SERVICE");
        C1AZW.LJIIJ(12, "CountdownService", "CountdownService release", null, null);
        CountDownService.LIZJ = true;
        c948450amx.LJI("COUNT_DOWN_SERVICE");
        ((List) C921330a5D.LIZ.getValue()).clear();
        super.detachView();
        DataChannelGlobal.LLILZ.zQ2(this);
        C946690ak7 c946690ak7 = (C946690ak7) this.LLJJL.getValue();
        c946690ak7.getClass();
        C1145050fu3.LIZIZ(c946690ak7);
        C915980Zwa.LJIIIIZZ().a9(c946690ak7.LJIIIIZZ);
        c946690ak7.LJ.LJ();
        c946690ak7.LJ();
        c946690ak7.LJIIJ = false;
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL3 != null) {
                interfaceC954180awCLLJLL3.LLJJJJ(EnumC965730bEp.INNER, null);
            }
        } else {
            InterfaceC954180awC interfaceC954180awCLLJLL4 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL4 != null) {
                interfaceC954180awCLLJLL4.LJJZ(null);
            }
        }
        this.userManager = null;
        C924810aAp.LJ().LJIIIIZZ = false;
        C923450a8d.LIZJ(this.dataChannel);
        C921920a6A.LJII = false;
        if (LiveSdkMaxGuestCntOptSetting.isEnable()) {
            C921920a6A.LJFF = 0;
        }
        ((C934030aPh) this.LLJZIJLIL.getValue()).LIZ = null;
    }

    public final MultiGuestDataHolder getMultiGuestDataHolder() {
        return (MultiGuestDataHolder) this.LLJIJIL.getValue();
    }

    public final InterfaceC927510aFB getZoomService() {
        C304201Fw c304201Fw = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        return (InterfaceC927510aFB) c304201Fw.LIZ();
    }

    public final void onEnterBackground() {
        AbstractC928510aGn abstractC928510aGnLIZ;
        C1AZW c1azw = C1AZW.LIZ;
        String strLogTAG = logTAG(1793);
        c1azw.getClass();
        C1AZW.LIZ(strLogTAG, "onEnterBackground", null, null);
        this.LLIZLLLIL = Boolean.TRUE;
        C924810aAp.LJ().LJIIJ = true;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.pause();
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.LIZJ("MultiGuestV3AnchorPresenter onEnterBackground");
        }
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe == null || (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) == null || C921170a4x.LIZJ(abstractC928510aGnLIZ) <= 0 || C915980Zwa.LJI().LIZ().LJJIJLIJ() || !C924810aAp.LJ().LJIIIIZZ) {
            return;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
        if (C921920a6A.LJII) {
            return;
        }
        C921920a6A.LJII = false;
        C921920a6A.LJIIIIZZ("anchor_pause", 0L, -1L, enumC918970a1PLJII, "liveEnd&turnOff", "", null);
    }

    public static String LJJLIIIJJIZ() {
        return C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
    }

    public final void LJLIIIL() {
        InterfaceC302401Fe interfaceC302401Fe;
        if (C917810ZzX.LJIIIIZZ() && LiveSdkMultiAddFetchUserListForChMgOptSetting.isEnable() && (interfaceC302401Fe = this.userManager) != null) {
            interfaceC302401Fe.LJJIJ("fetch_on_anchor_reject_audience", 1, null, null);
        }
    }

    public final void LJLJI() {
        Long l;
        if (C931790aM5.LIZIZ() || (l = (Long) this.dataChannel.gg0(C750050TbX.class)) == null) {
            return;
        }
        long jLongValue = l.longValue();
        if (jLongValue >= 0) {
            this.dataChannel.SX0(C750050TbX.class, -1L);
            ARunnableS115S0100000_15 aRunnableS115S0100000_15 = new ARunnableS115S0100000_15(this, 40);
            if (jLongValue == 0) {
                aRunnableS115S0100000_15.run();
            } else {
                this.LLJJJJJIL.LIZ(C11QJ.LL.LJ(jLongValue, TimeUnit.MILLISECONDS).LJIJJLI(C11S5.LIZ()).LJIILJJIL(C1701940uOG.LIZIZ()).LJIJ(new C987100bnI(aRunnableS115S0100000_15, 4)));
            }
        }
    }

    public final void LJLJLLL() {
        C11JF c11jf;
        if (LiveHostCpuTotalPssOpt.enable()) {
            return;
        }
        C922010a6J c922010a6J = this.LLILZLL;
        if (c922010a6J != null && (c11jf = c922010a6J.LJIIIIZZ) != null && !c11jf.isDisposed()) {
            c922010a6J.LJIIIIZZ.dispose();
        }
        this.LLILZLL = null;
    }

    public final void LJLLI() {
        final User user;
        Integer num;
        if (C917810ZzX.LJIIIIZZ()) {
            int iIntValue = 0;
            if (this.LLJLL == 0 && (user = (User) ((LinkedList) this.LLJJLIIIJLLLLLLLZ.getValue()).poll()) != null) {
                this.LLJLL = user.getId();
                DataChannel dataChannel = this.LLILZ;
                if (dataChannel != null) {
                    dataChannel.LC0(MultiGuestShowMixModeApplyBubbleEvent.class, new InterfaceC934510aQT() { // from class: X.0a6b
                        @Override // X.InterfaceC934510aQT
                        public final String LJ() {
                            return C497740JfY.LJIJJ(2131851855, C0KVU.LIZ(user));
                        }

                        @Override // X.InterfaceC934510aQT
                        public final void LIZIZ() {
                            C921520a5W c921520a5W = this;
                            c921520a5W.LLJLL = 0L;
                            c921520a5W.LJLLI();
                        }

                        @Override // X.InterfaceC934510aQT
                        public final List<ImageModel> LIZLLL() {
                            return Collections.singletonList(user.getAvatarThumb());
                        }

                        @Override // X.InterfaceC934510aQT
                        public final void LIZ(String str) {
                            C497030JeP.LIZ(user.getId(), "show", str);
                        }

                        @Override // X.InterfaceC934510aQT
                        public final void LIZJ(String str) {
                            String str2;
                            C497030JeP.LIZ(user.getId(), "click", str);
                            if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable()) {
                                C927240aEk c927240aEk = new C927240aEk("anchorLiveHome", "multiGuestPopup");
                                c927240aEk.LIZJ.put("link_page_entrance", "multi_guest_popup");
                                c927240aEk.LIZJ.put("request_page", "multi_guest_popup");
                                c927240aEk.LIZ();
                                C921520a5W c921520a5W = this;
                                c921520a5W.getClass();
                                InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(c921520a5W.LLILZ);
                                if ((interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) || C0UIM.LJFF()) {
                                    str2 = "more_panel";
                                } else {
                                    str2 = "interaction_panel";
                                }
                                c921520a5W.LJLJL("multi_guest_popup", str2, C2097608Jq.LJ());
                            } else {
                                this.LJJLIIIJLLLLLLLZ();
                            }
                            DataChannel dataChannel2 = this.LLILZ;
                            if (dataChannel2 != null) {
                                dataChannel2.SX0(C956700b0G.class, Boolean.TRUE);
                            }
                        }
                    });
                }
                DataChannel dataChannel2 = this.LLILZ;
                if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(MaxMultiGuestMixModeApplyBubbleShowTimesChannel.class)) != null) {
                    iIntValue = num.intValue();
                }
                DataChannel dataChannel3 = this.LLILZ;
                if (dataChannel3 != null) {
                    dataChannel3.zW(MaxMultiGuestMixModeApplyBubbleShowTimesChannel.class, Integer.valueOf(iIntValue - 1));
                }
            }
        }
    }

    public final void onAdStop() {
        if (C924810aAp.LJ().LJJJJ) {
            this.dataChannel.FQ2(MultiGuestStopPlayAdEvent.class);
            C766270U4b.LIZLLL(2131843203);
            C924810aAp.LJ().LJJJJ = false;
            C11JF c11jf = this.LLJJIJIIJIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            DataChannel dataChannel = this.LLILZ;
            MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
            C922550a7B.LIZ(dataChannel, "business_mute_by_play_ad", multiGuestDataHolder != null ? multiGuestDataHolder.LJIIL : false);
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.FQ2(MuteMicSwitchClosedEvent.class);
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.zW(MuteMicChannel.class, Boolean.valueOf(!(getMultiGuestDataHolder() != null ? r0.LJIIJJI : false)));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAdStop isAudioEnableBeforeAd:");
            MultiGuestDataHolder multiGuestDataHolder2 = getMultiGuestDataHolder();
            sbLIZ.append(multiGuestDataHolder2 != null ? Boolean.valueOf(multiGuestDataHolder2.LJIIJJI) : null);
            sbLIZ.append(", isVideoEnableBeforeAd:");
            MultiGuestDataHolder multiGuestDataHolder3 = getMultiGuestDataHolder();
            sbLIZ.append(multiGuestDataHolder3 != null ? Boolean.valueOf(multiGuestDataHolder3.LJIIL) : null);
            C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).du0("live_video_ads");
        }
    }

    @Override // X.AbstractC921450a5P
    public final InterfaceC302401Fe LJJL() {
        return this.userManager;
    }

    public static void LJJLIIJ(boolean z) {
        if (!z) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).We1("live_anchor_mute_mic", C2097608Jq.LJIIJ(new Pair("MuteMicState", CardStruct.IStatusCode.DEFAULT)));
        } else {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).du0("live_anchor_mute_mic");
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJIIZ("business_mute_source_audio_mute_punish", !z);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.LLIZLLLIL(Boolean.valueOf(!z), "Client.muteLocalAudio", "business_mute_source_audio_mute_punish", "just for fake audio capture");
        }
    }

    @Override // X.AbstractC921450a5P
    public final void LJJJLIIL(C918350a0P c918350a0P) {
        ((InterfaceC918930a1L) this.LLJLIL.getValue()).LIZIZ(c918350a0P);
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1
    /* JADX INFO: renamed from: LJJLIIIJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC921460a5Q interfaceC921460a5Q) {
        List<String> list;
        Context context;
        super.attachView(interfaceC921460a5Q);
        C924810aAp.LJ().LJIIIIZZ = true;
        C924810aAp.LJ().LJJIZ = false;
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe != null) {
            interfaceC302401Fe.LJIILJJIL(0);
            interfaceC302401Fe.LJJIJIL(this.LLJLLIL);
            interfaceC302401Fe.init();
        }
        C914580ZuK.LIZ = this.dataChannel;
        C916580ZxY c916580ZxY = (C916580ZxY) this.LLJJIJI.getValue();
        if (c916580ZxY != null) {
            C915980Zwa.LJIIIIZZ().VE2(c916580ZxY.LIZJ);
        }
        ((C922200a6c) this.LLJJ.getValue()).LIZ();
        ((C922540a7A) this.LLJJI.getValue()).LIZ();
        IMessageManager iMessageManager = (IMessageManager) this.LLILZ.gg0(C776250Uch.class);
        this.mMessageManager = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
        }
        IMessageManager iMessageManager2 = this.mMessageManager;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.LINK_MESSAGE.getIntType(), this);
            iMessageManager2.addMessageListener(C001A.LINK_MIC_SIGNAL.getIntType(), this);
            iMessageManager2.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
            if (C917860Zzc.LIZIZ()) {
                iMessageManager2.addMessageListener(C001A.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
            }
            iMessageManager2.addMessageListener(C001A.MULTI_GUEST_PUNISH_CENTER_ACTION_MSG.getIntType(), this);
            C925320aBe.LIZ.getClass();
            if (C925320aBe.LIZLLL()) {
                iMessageManager2.addMessageListener(C001A.MULTI_GUEST_PRE_APPROVE_MESSAGE.getIntType(), this);
            }
            iMessageManager2.addMessageListener(C001A.MULTI_GUEST_GUIDE_MESSAGE.getIntType(), this);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(AnchorMuteGuestOp.class, this, new AwS594S0100000_15(this, 194));
        dataChannelGlobal.CQ2(MultiGuestQuickConnectStartChannel.class, this, new AwS594S0100000_15(this, 195));
        dataChannelGlobal.CQ2(MultiGuestAcceptApplyChannel.class, this, new AwS594S0100000_15(this, 196));
        dataChannelGlobal.CQ2(MultiGuestSendInviteChannel.class, this, new AwS594S0100000_15(this, 197));
        dataChannelGlobal.DQ2(AudioPunishEvent.class, this, new AwS594S0100000_15(this, 198));
        dataChannelGlobal.DQ2(KaraokeStateChannel.class, this, AFwS250S0000000_15.get$arr$(42));
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkInRoomAnchorInviteGuestEvent.class, this, new AwS594S0100000_15(this, 174));
            dataChannel.CQ2(LinkInRoomAnchorCancelInviteGuestEvent.class, this, new AwS594S0100000_15(this, 175));
            dataChannel.CQ2(AnchorKickOutGuestByWindowEvent.class, this, new AwS594S0100000_15(this, 176));
            dataChannel.CQ2(MultiLiveAnchorMuteVideoEvent.class, this, new AwS594S0100000_15(this, 177));
            dataChannel.CQ2(LinkInGuestCountDownFinishChannel.class, this, new AwS594S0100000_15(this, 178));
            dataChannel.CQ2(LinkInRoomAnchorKickOutGuestEvent.class, this, new AwS594S0100000_15(this, 179));
            dataChannel.CQ2(TriggerListChangeEvent.class, this, new AwS594S0100000_15(this, 180));
            dataChannel.CQ2(LinkInRoomAnchorPermitGuestEvent.class, this, new AwS594S0100000_15(this, 181));
            dataChannel.CQ2(MultiGuestV3VideoCaptureChangeEvent.class, this, AFwS250S0000000_15.get$arr$(41));
            dataChannel.DQ2(MuteMicChannel.class, this, new AwS594S0100000_15(this, 182));
            dataChannel.CQ2(MultiGuestAdStartEvent.class, this, new AwS594S0100000_15(this, 183));
            dataChannel.CQ2(MultiGuestAdStopEvent.class, this, new AwS594S0100000_15(this, 184));
            dataChannel.CQ2(OneTapGoLiveEventV2.class, this, new AwS594S0100000_15(this, 185));
            dataChannel.CQ2(ChangeLayoutForFloatPanelOnlyForLiveShow.class, this, new AwS594S0100000_15(this, 186));
            dataChannel.CQ2(RestoreLayoutToFloatPanelOnlyForLiveShow.class, this, new AwS594S0100000_15(this, 187));
            dataChannel.CQ2(FeaturedHashTagCountDownRemindEvent.class, this, new AwS594S0100000_15(this, 188));
            dataChannel.CQ2(QuickStartLayoutCreatedChannelEvent.class, this, new AwS594S0100000_15(this, 190));
            dataChannel.CQ2(MultiGuestDisMissLinkMicManageDialogChannel.class, this, new AwS594S0100000_15(this, 192));
            dataChannel.CQ2(MultiGuestShowApplyManagerEvent.class, this, new AwS594S0100000_15(this, 193));
        }
        C915980Zwa.LJIIIIZZ().Fe(this.LLJZ);
        C915980Zwa.LJIIIIZZ().VE2(this.LLLFF);
        InterfaceC923120a86 interfaceC923120a86LIZ = C940770aaZ.LIZ();
        if (interfaceC923120a86LIZ != null) {
            interfaceC923120a86LIZ.LJIIZILJ(this.LLLF);
        }
        if (!C917810ZzX.LJIIIIZZ()) {
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.LLJJJJ(EnumC965730bEp.INNER, (C934030aPh) this.LLJZIJLIL.getValue());
                }
            } else {
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    interfaceC954180awCLLJLL2.LJJZ((C934030aPh) this.LLJZIJLIL.getValue());
                }
            }
        }
        if (!C917810ZzX.LJIIIIZZ()) {
            if (!MultiGuestFetchAnchorActivityInfoSetting.INSTANCE.isEnable()) {
                C20441214yg.LJIIIZ("MultiGuestV3AnchorPresenter", "MultiGuestFetchAnchorActivityInfoSetting is false, so return, do not request activity info");
            } else if (Intrinsics.LJFF(InterfaceC934710aQn.Wb.LIZIZ(), Boolean.FALSE)) {
                C20441214yg.LJIIIZ("MultiGuestV3AnchorPresenter", "local LIVE_SHOW_ACTIVITY_BANNER_FOR_ANCHOR is false, so return, do not request activity info");
            } else {
                C480460Ism.LIZ().getClass();
                ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).getMultiGuestActivityInfo("give_me_the_mic").LJFF(new C0UO0()).LIZLLL(autoDispose())).LIZ(new AfS184S0100000_15(this, 89), new AfS184S0100000_15(this, 90));
            }
            if (!DateUtils.isToday(InterfaceC934710aQn.Yb.LIZIZ().longValue())) {
                C480460Ism.LIZ().getClass();
                ((InterfaceC500100JjM) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).getMultiGuestActivityInfo("in_room_multi_guest").LJFF(new C0UO0()).LIZLLL(autoDispose())).LIZ(new AfS184S0100000_15(this, 86), new AfS184S0100000_15(this, 87));
            }
            long id = this.LLILLL.getId();
            InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
            if (interfaceC919320a1y != null && (context = interfaceC919320a1y.getContext()) != null) {
                C922550a7B.LIZIZ(id, context, this.dataChannel, new AwS559S0100000_15(this, 558));
            }
        }
        ((C946690ak7) this.LLJJL.getValue()).LIZJ();
        Long l = (Long) this.dataChannel.gg0(C750050TbX.class);
        if (l != null && l.longValue() >= 0) {
            LJLJI();
        }
        C925240aBW.LJIIZILJ(this.LL.getId(), this.LL.getOwnerUserId(), true);
        RegionalRestricted regionalRestricted = this.LLILLL.regionalRestricted;
        if (regionalRestricted != null && (list = regionalRestricted.blockList) != null && list.contains("VIEW_LIMIT")) {
            this.dataChannel.zW(IsViewerLimitedStatusChannel.class, Boolean.TRUE);
        }
        ((ArrayList) this.LLJJJJLIIL).clear();
        C20441214yg.LJIIIZ("multi_init", "MultiGuestV3AnchorPresenter attachView");
    }

    public final void LJJLIL(DirectJoinMessage directJoinMessage) {
        Integer numValueOf;
        Long l;
        BusinessContent businessContent;
        MultiLiveContent multiLiveContent;
        JoinDirectBizContent joinDirectBizContent;
        BizContentWrapper bizContentWrapper = directJoinMessage.customMessage.bizContentWrapper;
        if (bizContentWrapper != null && (businessContent = bizContentWrapper.bizContent) != null && (multiLiveContent = businessContent.multiLiveContent) != null && (joinDirectBizContent = multiLiveContent.joinDirectIMContent) != null) {
            numValueOf = Integer.valueOf(joinDirectBizContent.mgSourceRole);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1 && (l = directJoinMessage.joiner.userId) != null) {
            long jLongValue = l.longValue();
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe != null) {
                interfaceC302401Fe.LJIIIZ(jLongValue, "moderator");
            }
        }
        LJJLJ(directJoinMessage.toUnifiedReplyInviteMessage(), true);
    }

    public final void LJJLL(InviteMessage inviteMessage) {
        Long lValueOf;
        Long lValueOf2;
        BusinessContent businessContent;
        MultiLiveContent multiLiveContent;
        InviteBizContent inviteBizContent;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleReceiveModeratorInviteMessage, message=");
        sbLIZ.append(inviteMessage);
        C919310a1x.LIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
        User user = inviteMessage.inviteeUserInfo;
        User user2 = null;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        User user3 = inviteMessage.inviteeUserInfo;
        if (lValueOf != null && user3 != null) {
            long jLongValue = lValueOf.longValue();
            C921640a5i.LLILZLL.put(Long.valueOf(jLongValue), C0KVU.LIZ(user3));
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe != null) {
                interfaceC302401Fe.LJIIIZ(jLongValue, "moderator");
            }
        }
        C920310a3Z c920310a3ZLJJLIIIJL = LJJLIIIJL();
        User user4 = inviteMessage.inviteeUserInfo;
        if (user4 != null) {
            lValueOf2 = Long.valueOf(user4.getId());
        } else {
            lValueOf2 = null;
        }
        c920310a3ZLJJLIIIJL.LIZ(String.valueOf(lValueOf2));
        BizContentWrapper bizContentWrapper = inviteMessage.customMessage.bizContentWrapper;
        if (bizContentWrapper != null && (businessContent = bizContentWrapper.bizContent) != null && (multiLiveContent = businessContent.multiLiveContent) != null && (inviteBizContent = multiLiveContent.inviteIMContent) != null) {
            user2 = inviteBizContent.operatorUserInfo;
        }
        C01I3.LIZIZ(2131843145, "sent_invitation", user2, inviteMessage.inviteeUserInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZ(com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage r12) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921520a5W.LJJZ(com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZI(com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage r32) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921520a5W.LJJZZI(com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage):void");
    }

    public final void LJJZZIII(C919670a2X c919670a2X) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLIZJ;
        long id;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLinkInRoomAnchorInviteGuestEvent invite source:");
        sbLIZ.append(c919670a2X.LIZIZ);
        C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
        long id2 = 0;
        if (LiveSdkMultiInviteFromPublicScreenGuideReportSetting.INSTANCE.isEnable() && Intrinsics.LJFF(c919670a2X.LIZIZ, "comment_invitation_guide")) {
            C927240aEk c927240aEk = new C927240aEk("anchorInvite", "commentInvitation");
            c927240aEk.LIZJ.put("link_page", "comment_invitation_guide");
            c927240aEk.LIZJ.put("link_sub_reason", "user_comment");
            c927240aEk.LIZJ.put("link_reason", "room_viewer");
            User user = c919670a2X.LIZ;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            c927240aEk.LJ = String.valueOf(id);
            c927240aEk.LIZ();
        }
        User user2 = c919670a2X.LIZ;
        if (user2 != null) {
            id2 = user2.getId();
        }
        String str = c919670a2X.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        int iIntValue = -1;
        if (Intrinsics.LJFF(str, "panel_plus") || Intrinsics.LJFF(str, "panel_Golive")) {
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLIZJ = abstractC928510aGnLIZ.LIZJ()) != null) {
                iIntValue = ((Number) C500260Jjc.LJI(listLIZJ, new AwS30S0000100_15(id2, 1)).getSecond()).intValue();
            }
            iIntValue++;
        }
        LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.mUser = c919670a2X.LIZ;
        C918380a0S c918380a0SLIZIZ = C918390a0T.LIZIZ(linkPlayerInfo);
        String str3 = c919670a2X.LJ;
        if (str3 != null) {
            str2 = str3;
        }
        ((InterfaceC918930a1L) this.LLJLIL.getValue()).LIZIZ(new C918350a0P(c918380a0SLIZIZ, new C918410a0V(iIntValue, str2, str, c919670a2X.LIZLLL, str3, c919670a2X.LIZJ, c919670a2X.LJFF, "normal_invite", this.LLJI, c919670a2X.LJII, new AwS594S0100000_15(c919670a2X, 189), new AwS594S0100000_15(this, 191), new AwS629S0100000_15(this, 18), 1), (C918360a0Q) null, 12));
    }

    public final void LJLIIL(long j) {
        InterfaceC302401Fe interfaceC302401Fe;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC921460a5Q.ud1(j);
        }
        if (C917810ZzX.LJIIIIZZ() && LiveSdkMultiAddFetchUserListForChMgOptSetting.isEnable() && (interfaceC302401Fe = this.userManager) != null) {
            interfaceC302401Fe.LJJIJ("fetch_on_anchor_reject_audience", 1, null, null);
        }
    }

    @Override // X.AbstractC921450a5P
    public final void Lc2(C977800bYI c977800bYI) {
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC921460a5Q.Lc2(c977800bYI);
        }
    }

    public final String logTAG(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MultiGuestV3AnchorPresenter_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void onFirstRemoteVideoFrameRender(String str) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        String strLIZIZ;
        int i;
        ShowListUser showListUser;
        InterfaceC302601Fg interfaceC302601FgLIZ;
        InterfaceC302601Fg interfaceC302601FgLIZ2;
        ShowContent content;
        ShowConfig showConfig;
        String str2;
        InterfaceC919320a1y interfaceC919320a1y;
        LinkPlayerInfo linkPlayerInfoLJII;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        ShowContent content2;
        List<ShowListUser> list;
        ShowListUser next;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        AbstractC928510aGn abstractC928510aGnLIZ4;
        AbstractC928510aGn abstractC928510aGnLIZ5;
        if (this.mView == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:LinkIn_Anchor; interactId:");
        sbLIZ.append(str);
        C944240agA.LJI("OnFirstRemoteVideoFrame", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILLL.getValue().getClass();
        LinkPlayerInfo linkPlayerInfoLJIIIZ = null;
        LinkLayerRTCP2PMessage linkLayerRTCP2PMessage = new LinkLayerRTCP2PMessage("", null, Long.valueOf(C158B.LIZ()), "");
        linkLayerRTCP2PMessage.generateId();
        linkLayerRTCP2PMessage.setMethod("linkMicSDKFirstVideoFrameReceived");
        LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam = new LinkLayerRTCMessageP2PParam("");
        linkLayerRTCMessageP2PParam.setLinkMicId(str);
        linkLayerRTCP2PMessage.setParam(linkLayerRTCMessageP2PParam);
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkLayerRTCP2PMessage);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.sendUserMessage(str, json);
        }
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
            long jLJIILIIL = C921170a4x.LJIILIIL(abstractC928510aGnLIZ, str);
            if (jLJIILIIL > 0) {
                InterfaceC302401Fe interfaceC302401Fe2 = this.userManager;
                if (interfaceC302401Fe2 != null && (abstractC928510aGnLIZ5 = interfaceC302401Fe2.LIZ()) != null) {
                    linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ5, jLJIILIIL);
                }
                InterfaceC302401Fe interfaceC302401Fe3 = this.userManager;
                if (interfaceC302401Fe3 == null || (strLIZIZ = interfaceC302401Fe3.LIZIZ(jLJIILIIL)) == null) {
                    strLIZIZ = "";
                }
                InterfaceC302401Fe interfaceC302401Fe4 = this.userManager;
                if (interfaceC302401Fe4 != null && (abstractC928510aGnLIZ4 = interfaceC302401Fe4.LIZ()) != null) {
                    C921170a4x.LIZJ(abstractC928510aGnLIZ4);
                }
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
                C930480aJy.LIZ.getClass();
                int iLJIIJJI = C930480aJy.LJIIJJI(linkPlayerInfoLJIIIZ);
                InterfaceC302401Fe interfaceC302401Fe5 = this.userManager;
                if (interfaceC302401Fe5 != null && (abstractC928510aGnLIZ3 = interfaceC302401Fe5.LIZ()) != null) {
                    C921170a4x.LJIILL(abstractC928510aGnLIZ3, str);
                }
                C924810aAp c924810aAp = (C924810aAp) this.LLJILJILJ.getValue();
                if (c924810aAp != null && (multiLiveAnchorPanelSettings = c924810aAp.LJJIII) != null) {
                    i = multiLiveAnchorPanelSettings.applierSortSetting;
                } else {
                    i = 0;
                }
                C925600aC6.LJJIFFI(jLJIILIIL, enumC918970a1PLJII, str, strLJIILLIIL, iLJIIJJI, strLIZIZ, i, C930160aJS.LIZ(String.valueOf(jLJIILIIL)), this.dataChannel);
                C921640a5i.LJII(jLJIILIIL, false);
                new C497890Jfn();
                User owner = this.LL.getOwner();
                if (owner != null) {
                    owner.getId();
                }
                HashMap map = new HashMap();
                map.put("room_id", String.valueOf(this.LL.getId()));
                map.put("anchor_id", String.valueOf(this.LL.getOwner().getId()));
                map.put("channel_id", String.valueOf(this.LL.getId()));
                map.put("connection_type", "audience");
                String strLLJJJJLIIL = C915980Zwa.LJI().LIZ().LLJJJJLIIL();
                if (!TextUtils.isEmpty(strLLJJJJLIIL)) {
                    if (strLLJJJJLIIL != null) {
                        map.put("request_id", strLLJJJJLIIL);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(this.LLILLL.getId()))) {
                    String str3 = InterfaceC784590Uq9.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onFirstRemoteVideoFrameRender, mute: ");
                    sbLIZ2.append(str);
                    C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
                    LJJJJLI(linkPlayerInfoLJIIIZ, 3, false);
                }
                InterfaceC302601Fg interfaceC302601FgLIZ3 = C01FQ.LIZ();
                if (interfaceC302601FgLIZ3 != null && (content2 = interfaceC302601FgLIZ3.getContent()) != null && (list = content2.showingAndReadyList) != null) {
                    Iterator<ShowListUser> it2 = list.iterator();
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
                    showListUser = next;
                } else {
                    showListUser = null;
                }
                if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI() && (interfaceC302601FgLIZ2 = C01FQ.LIZ()) != null && (content = interfaceC302601FgLIZ2.getContent()) != null && (showConfig = content.showConfig) != null && !showConfig.allowOpenMicFreely) {
                    if (showListUser != null) {
                        str2 = showListUser.linkmicIdStr;
                    } else {
                        str2 = null;
                    }
                    if (!Intrinsics.LJFF(str2, str) && (interfaceC919320a1y = (InterfaceC919320a1y) this.mView) != null) {
                        C930480aJy c930480aJy = C930480aJy.LIZ;
                        Context context = interfaceC919320a1y.getContext();
                        InterfaceC302401Fe interfaceC302401Fe6 = this.userManager;
                        if (interfaceC302401Fe6 != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe6.LIZ()) != null) {
                            linkPlayerInfoLJII = C921170a4x.LJII(abstractC928510aGnLIZ2, str);
                        } else {
                            linkPlayerInfoLJII = null;
                        }
                        C930480aJy.LJJIIZ(c930480aJy, context, linkPlayerInfoLJII, 2, this.LLJJJJJIL, C01G5.ANCHOR_MUTE_AUDIO_WHEN_FIRST_FRAME, null, 32);
                    }
                }
                C924630aAX.LJJJJI(str, true);
                return;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onFirstRemoteVideoFrameRender return as there wasn't uid match for interactId:");
        sbLIZ3.append(str);
        sbLIZ3.append(' ');
        C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.AbstractC938410aWl
    public final void onLayoutChanged(C489801vU c489801vU) {
        Boolean boolValueOf;
        InterfaceC927510aFB interfaceC927510aFB;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
        if ((objLJIIIZ instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ) != null) {
            boolValueOf = Boolean.valueOf(interfaceC927510aFB.LJIIIIZZ());
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[layoutChanged] [");
        sbLIZ.append(c489801vU);
        sbLIZ.append("] [");
        sbLIZ.append(zLJJJI);
        sbLIZ.append("] handled by anchor");
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJJJI(c489801vU.LIZ.layoutId, zLJJJI, c489801vU.LIZIZ);
        }
        C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
        if (c1303170k15Y22 != null) {
            c1303170k15Y22.LJJL(0, c489801vU.LIZ.layoutId, new InterfaceC1303160k14() { // from class: X.0Zwg
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    Pair<Integer, Integer> pairLJIIIIZZ;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
                    String str;
                    InterfaceC665370Q7z interfaceC665370Q7z;
                    MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
                    C935540aS8 state;
                    Map<Integer, String> map2;
                    Map<Integer, String> map3;
                    if (layout == null || (pairLJIIIIZZ = C930540aK4.LJIIIIZZ(layout)) == null) {
                        return;
                    }
                    MultiGuestDataHolder multiGuestDataHolder = this.LIZ.getMultiGuestDataHolder();
                    if (multiGuestDataHolder != null) {
                        multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ();
                    } else {
                        multiLiveAnchorPanelSettingsLIZIZ = null;
                    }
                    if (!Intrinsics.LJFF(layout.layoutId, C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ)) && multiLiveAnchorPanelSettingsLIZIZ != null) {
                        C921520a5W c921520a5W = this.LIZ;
                        multiLiveAnchorPanelSettingsLIZIZ.layoutType = pairLJIIIIZZ.getFirst().intValue();
                        multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction = pairLJIIIIZZ.getSecond().intValue();
                        MultiGuestDataHolder multiGuestDataHolder2 = c921520a5W.getMultiGuestDataHolder();
                        if (multiGuestDataHolder2 != null) {
                            multiGuestDataHolder2.LJJ(multiLiveAnchorPanelSettingsLIZIZ);
                        }
                        if (!LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig.INSTANCE.isInFilter(layout.layoutId) && pairLJIIIIZZ.getSecond().intValue() == 0) {
                            if (pairLJIIIIZZ.getFirst().intValue() == 1) {
                                MultiGuestDataHolder multiGuestDataHolder3 = c921520a5W.getMultiGuestDataHolder();
                                if (multiGuestDataHolder3 != null && (map3 = multiGuestDataHolder3.LJIJJLI) != null) {
                                    ((ConcurrentHashMap) map3).put(1, layout.layoutId);
                                }
                            } else {
                                MultiGuestDataHolder multiGuestDataHolder4 = c921520a5W.getMultiGuestDataHolder();
                                if (multiGuestDataHolder4 != null && (map2 = multiGuestDataHolder4.LJIJJLI) != null) {
                                    ((ConcurrentHashMap) map2).put(2, layout.layoutId);
                                }
                            }
                        }
                        C480460Ism.LIZ().getClass();
                        MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
                        long id = c921520a5W.LLILLL.getId();
                        long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
                        long jLiveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
                        int i = multiLiveAnchorPanelSettingsLIZIZ.layoutType;
                        int i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
                        int i3 = multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq;
                        int i4 = multiLiveAnchorPanelSettingsLIZIZ.onlyAllowFollowerReq;
                        String str2 = layout.layoutId;
                        DataChannel dataChannel = c921520a5W.dataChannel;
                        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
                            str = null;
                            ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
                            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                                str = state.LLILZ;
                            }
                        } else {
                            str = null;
                        }
                        multiLiveApi.updateAnchorPanelSettings(id, jLJIILL, jLiveId, i, i2, i3, i4, str2, str, 0, multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting, multiLiveAnchorPanelSettingsLIZIZ.applierSortGiftScoreThreshold, multiLiveAnchorPanelSettingsLIZIZ.LIZ, multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFriends, multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFollowers, multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromOthers, 0, multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout, C924810aAp.LJ().LJJIIJ).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0TIc
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("MultiGuestV3AnchorPresenter@b85a.onLayoutChanged$1$onQueried$1$2");
                                Map<String, Object> map4 = C1338270kvh.LIZ;
                                C1C7U.LIZIZ("MultiGuestV3AnchorPresenter@b85a.onLayoutChanged$1$onQueried$1$2");
                            }
                        }, new C09JN() { // from class: X.0TId
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("MultiGuestV3AnchorPresenter@b85a.onLayoutChanged$1$onQueried$1$3");
                                Map<String, Object> map4 = C1338270kvh.LIZ;
                                C1C7U.LIZIZ("MultiGuestV3AnchorPresenter@b85a.onLayoutChanged$1$onQueried$1$3");
                            }
                        });
                    }
                }
            }, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r16) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921520a5W.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    public final void onUserJoined(String str) {
        Boolean boolValueOf;
        List<LinkPlayerInfo> listLJJIII;
        ?? LJFF;
        AbstractC928510aGn abstractC928510aGnLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:LinkIn_Anchor; interactId:");
        sbLIZ.append(str);
        C944240agA.LJI("OnUserJoined", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            boolValueOf = Boolean.valueOf(interfaceC954180awCLLJLL.ae());
        } else {
            boolValueOf = null;
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && LinkMicStateSetting.INSTANCE.enableRTCSend()) {
            LinkLayerRTCMessage linkLayerRTCMessage = new LinkLayerRTCMessage("", null, Long.valueOf(C158B.LIZ()), "", -1L, "", "");
            linkLayerRTCMessage.generateId();
            LinkLayerRTCMessageParam linkLayerRTCMessageParam = new LinkLayerRTCMessageParam("", 4, 1, new ArrayList(), null, "", true);
            ArrayList arrayList = new ArrayList();
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe == null || (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
                listLJJIII = C13BV.INSTANCE;
            }
            for (LinkPlayerInfo linkPlayerInfo : listLJJIII) {
                String str2 = linkPlayerInfo.mInteractIdStr;
                MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
                ?? LJFF2 = 0;
                if (multiGuestDataHolder != null) {
                    LJFF = Intrinsics.LJFF(multiGuestDataHolder.LIZLLL(linkPlayerInfo.mInteractIdStr), Boolean.TRUE);
                } else {
                    LJFF = 0;
                }
                MultiGuestDataHolder multiGuestDataHolder2 = getMultiGuestDataHolder();
                if (multiGuestDataHolder2 != null) {
                    LJFF2 = Intrinsics.LJFF(multiGuestDataHolder2.LJIILLIIL(linkPlayerInfo.mInteractIdStr), Boolean.TRUE);
                }
                arrayList.add(new LinkLayerRTCMessageUser(str2, -1, LJFF, LJFF2));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!Intrinsics.LJFF(((LinkLayerRTCMessageUser) obj).linkMicId, str)) {
                    arrayList2.add(obj);
                }
            }
            linkLayerRTCMessageParam.users.addAll(arrayList2);
            linkLayerRTCMessage.setParam(linkLayerRTCMessageParam);
            linkLayerRTCMessage.setMethod("linkMicSDKVideoMute");
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null) {
                interfaceC954180awCLLJLL2.sendRoomMessage(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkLayerRTCMessage));
            }
            linkLayerRTCMessage.setMethod("linkMicSDKAudioMute");
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL3 != null) {
                interfaceC954180awCLLJLL3.sendRoomMessage(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, linkLayerRTCMessage));
            }
        }
        C920360a3e.LIZ.getClass();
        C920360a3e.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b4  */
    @Override // X.AbstractC938410aWl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUserMediaStateListChanged(X.C922130a6V r19) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921520a5W.onUserMediaStateListChanged(X.0a6V):void");
    }

    @Override // X.AbstractC938410aWl
    public final void onLayoutChanged(String str) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public static final void LJJLJLI(C921520a5W c921520a5W, long j) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfoLJIIIZ;
        InterfaceC302401Fe interfaceC302401Fe = c921520a5W.userManager;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ, j)) != null) {
            long id = linkPlayerInfoLJIIIZ.mUser.getId();
            String secUid = linkPlayerInfoLJIIIZ.mUser.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            c921520a5W.LJIIIZ(id, secUid, "kickout_with_popup_confirm", null);
            return;
        }
        C1AZW.LJIILL(c921520a5W.logTAG(2178), "handlePerceptionMessage Failed, receive perception Message, but multi guest uid is unavailable", null, null);
    }

    public static void LJLJJL(final C921520a5W c921520a5W, final C918480a0c c918480a0c) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLIZJ;
        final String str = "normal_invite";
        c921520a5W.getClass();
        final long id = c918480a0c.LIZ.getId();
        C921640a5i.LIZ(1, String.valueOf(c918480a0c.LIZJ), id, "room");
        final int iIntValue = -1;
        if (Intrinsics.LJFF(c918480a0c.LIZJ, "panel_plus") || Intrinsics.LJFF(c918480a0c.LIZJ, "panel_Golive")) {
            InterfaceC302401Fe interfaceC302401Fe = c921520a5W.userManager;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLIZJ = abstractC928510aGnLIZ.LIZJ()) != null) {
                iIntValue = ((Number) C500260Jjc.LJI(listLIZJ, new AwS594S0100000_15(c918480a0c, 583)).getSecond()).intValue();
            }
            iIntValue++;
        }
        c921520a5W.LJJLIIIJL().LIZIZ(String.valueOf(id));
        C920400a3i c920400a3i = new C920400a3i(c918480a0c.LIZIZ, c918480a0c.LIZ.getId(), 0L, 60);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJJJLL(c920400a3i, new InterfaceC920680a4A<CancelInviteResult>() { // from class: X.0a0a
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(CancelInviteResult cancelInviteResult) {
                    String strLJIILIIL;
                    C921640a5i.LLILZLL.put(Long.valueOf(id), C0KVU.LIZ(c918480a0c.LIZ));
                    if (c918480a0c.LIZLLL != 4 || !C917860Zzc.LIZIZ()) {
                        List listLIZJ2 = C932140aMe.LIZJ(id);
                        List listLIZLLL = C932140aMe.LIZLLL(id);
                        long id2 = c918480a0c.LIZ.getId();
                        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                        C307001Gy.LIZ().getClass();
                        EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                        String str2 = str;
                        Gson gson = C19748512Ol.LIZJ;
                        String json = GsonProtectorUtils.toJson(gson, listLIZLLL);
                        String json2 = GsonProtectorUtils.toJson(gson, listLIZJ2);
                        int size = listLIZJ2.size();
                        int followStatus = (int) c918480a0c.LIZ.getFollowInfo().getFollowStatus();
                        int i = iIntValue;
                        MultiGuestDataHolder multiGuestDataHolder = c921520a5W.getMultiGuestDataHolder();
                        if (multiGuestDataHolder != null) {
                            strLJIILIIL = multiGuestDataHolder.LJIILIIL();
                        } else {
                            strLJIILIIL = null;
                        }
                        C925600aC6.LJIIJ(id2, enumC918970a1PLJII, str2, json, json2, size, followStatus, true, i, strLJIILIIL, true, false, CardStruct.IStatusCode.DEFAULT, false, c921520a5W.LLJI, c918480a0c.LJ, false);
                    }
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    C766270U4b.LIZLLL(2131843352);
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static void LJLJJLL(final C921520a5W c921520a5W, final C919670a2X c919670a2X) {
        String strLIZLLL;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLIZJ;
        final String str = "normal_invite";
        c921520a5W.getClass();
        if (LiveSdkMultiInviteMixModeOptSetting.isEnable() && C915980Zwa.LIZLLL().n30() && !C917810ZzX.LJIIIIZZ() && !C917810ZzX.LJIIJ()) {
            C766270U4b.LIZLLL(2131842740);
            return;
        }
        if (C931790aM5.LIZIZ()) {
            strLIZLLL = null;
        } else {
            strLIZLLL = C925150aBN.LIZLLL();
            if (strLIZLLL == null) {
                ?? r1 = c919670a2X.LJI;
                if (r1 == 0) {
                    return;
                }
                r1.invoke(Boolean.FALSE);
                return;
            }
        }
        long id = c921520a5W.LLILLL.getId();
        long id2 = c919670a2X.LIZ.getId();
        BizInviteParams bizInviteParams = new BizInviteParams();
        bizInviteParams.source = c919670a2X.LIZLLL;
        bizInviteParams.noticeConfirmed = c919670a2X.LIZJ;
        C949850apD c949850apD = new C949850apD(id, id2, bizInviteParams, strLIZLLL, c919670a2X.LJFF, LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.getValue(), c919670a2X.LIZLLL, null, null, 1792);
        final long id3 = c919670a2X.LIZ.getId();
        C921640a5i.LIZ(1, c919670a2X.LIZIZ, id3, "room");
        final int iIntValue = -1;
        if (Intrinsics.LJFF(c919670a2X.LIZIZ, "panel_plus") || Intrinsics.LJFF(c919670a2X.LIZIZ, "panel_Golive")) {
            InterfaceC302401Fe interfaceC302401Fe = c921520a5W.userManager;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (listLIZJ = abstractC928510aGnLIZ.LIZJ()) != null) {
                iIntValue = ((Number) C500260Jjc.LJI(listLIZJ, new AwS594S0100000_15(c919670a2X, 584)).getSecond()).intValue();
            }
            iIntValue++;
        }
        C924630aAX.LJJII(id3);
        c921520a5W.LJJLIIIJL().LIZ(String.valueOf(id3));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null) {
            return;
        }
        interfaceC954180awCLLJLL.LJLJJI(c949850apD, new InterfaceC920680a4A<InviteResult>() { // from class: X.0a0W
            /* JADX WARN: Type inference failed for: r1v0, types: [X.09AY, kotlin.jvm.functions.Function1] */
            @Override // X.InterfaceC920680a4A
            public final void onSuccess(InviteResult inviteResult) {
                int followStatus;
                String strLJIILIIL;
                FollowInfo followInfo;
                ?? r12 = c919670a2X.LJI;
                if (r12 != 0) {
                    r12.invoke(Boolean.TRUE);
                }
                C921640a5i.LLILZLL.put(Long.valueOf(id3), C0KVU.LIZ(c919670a2X.LIZ));
                if (c919670a2X.LIZLLL == 4 && C917860Zzc.LIZIZ()) {
                    InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                    if (interfaceC921460a5Q != null) {
                        interfaceC921460a5Q.yJ0(c919670a2X.LIZ.getId());
                    }
                } else {
                    C766270U4b.LIZLLL(2131842764);
                    List listLIZJ2 = C932140aMe.LIZJ(id3);
                    List listLIZLLL = C932140aMe.LIZLLL(id3);
                    c921520a5W.getMultiGuestDataHolder();
                    long id4 = c919670a2X.LIZ.getId();
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    EnumC918970a1P enumC918970a1PLJII = C927600aFK.LJII();
                    String str2 = str;
                    Gson gson = C19748512Ol.LIZJ;
                    String json = GsonProtectorUtils.toJson(gson, listLIZLLL);
                    String json2 = GsonProtectorUtils.toJson(gson, listLIZJ2);
                    int size = listLIZJ2.size();
                    User user = c919670a2X.LIZ;
                    if (user != null && (followInfo = user.getFollowInfo()) != null) {
                        followStatus = (int) followInfo.getFollowStatus();
                    } else {
                        followStatus = 0;
                    }
                    int i = iIntValue;
                    MultiGuestDataHolder multiGuestDataHolder = c921520a5W.getMultiGuestDataHolder();
                    if (multiGuestDataHolder != null) {
                        strLJIILIIL = multiGuestDataHolder.LJIILIIL();
                    } else {
                        strLJIILIIL = null;
                    }
                    C925600aC6.LJIIJ(id4, enumC918970a1PLJII, str2, json, json2, size, followStatus, true, i, strLJIILIIL, false, false, CardStruct.IStatusCode.DEFAULT, false, c921520a5W.LLJI, c919670a2X.LJII, false);
                }
                C924630aAX.LJJIII(id3);
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
            /* JADX WARN: Type inference failed for: r1v0, types: [X.09AY, kotlin.jvm.functions.Function1] */
            @Override // X.InterfaceC920680a4A
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError r8, java.lang.Throwable r9) {
                /*
                    r7 = this;
                    X.0a2X r0 = r1
                    X.09AY r1 = r0.LJI
                    if (r1 == 0) goto Lb
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    r1.invoke(r0)
                Lb:
                    boolean r0 = r9 instanceof X.C501470JlZ
                    r2 = 0
                    if (r0 == 0) goto L98
                    int r1 = r8.errorCode
                    r0 = 4004528(0x3d1ab0, float:5.611539E-39)
                    if (r1 != r0) goto L5a
                    X.0a5W r6 = r4
                    X.0a2X r0 = r1
                    com.bytedance.android.live.base.model.user.User r0 = r0.LIZ
                    java.lang.String r5 = X.C0KVU.LIZ(r0)
                    kotlin.jvm.internal.AwS416S0200000_15 r4 = new kotlin.jvm.internal.AwS416S0200000_15
                    X.0a2X r3 = r1
                    X.0a5W r1 = r4
                    r0 = 52
                    r4.<init>(r3, r1, r0)
                    r6.LJLJLJ(r5, r4)
                L2f:
                    long r0 = r2
                    X.C921640a5i.LJII(r0, r2)
                    X.0a2X r0 = r1
                    int r1 = r0.LIZLLL
                    r0 = 4
                    if (r1 != r0) goto L54
                    boolean r0 = X.C917860Zzc.LIZIZ()
                    if (r0 == 0) goto L54
                    X.0a5W r0 = r4
                    T extends X.0JSP r2 = r0.mView
                    X.0a5Q r2 = (X.InterfaceC921460a5Q) r2
                    if (r2 == 0) goto L54
                    X.0a2X r0 = r1
                    com.bytedance.android.live.base.model.user.User r0 = r0.LIZ
                    long r0 = r0.getId()
                    r2.TP1(r0, r9)
                L54:
                    long r0 = r2
                    X.C924630aAX.LJJIFFI(r0, r9)
                    return
                L5a:
                    r0 = 4004624(0x3d1b10, float:5.611673E-39)
                    if (r1 != r0) goto L90
                    X.0act r0 = X.C942210act.LIZ
                    r0.getClass()
                    int r1 = X.C942210act.LJ()
                    r0 = 8
                    if (r1 >= r0) goto L90
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "sendInvite errorCode="
                    r1.append(r0)
                    int r0 = r8.errorCode
                    r1.append(r0)
                    java.lang.String r0 = ", micCount="
                    r1.append(r0)
                    int r0 = X.C942210act.LJ()
                    r1.append(r0)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "MultiGuestV3AnchorPresenter"
                    X.C20441214yg.LJIIIZ(r0, r1)
                    goto L2f
                L90:
                    android.content.Context r0 = X.C497740JfY.LJII()
                    X.C501540Jlg.LIZJ(r0, r9)
                    goto L2f
                L98:
                    r0 = 1
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    X.0a2X r0 = r1
                    com.bytedance.android.live.base.model.user.User r0 = r0.LIZ
                    java.lang.String r0 = X.C0KVU.LIZ(r0)
                    r1[r2] = r0
                    r0 = 2131842749(0x7f1156bd, float:1.9318843E38)
                    java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
                    X.C766270U4b.LJIIJJI(r0)
                    goto L2f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C918420a0W.LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError, java.lang.Throwable):void");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // X.InterfaceC919200a1m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIZ(final java.lang.String r20, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921520a5W.LJJIIZ(java.lang.String, kotlin.jvm.functions.Function1):boolean");
    }

    public final void LJJLI(String str, boolean z) {
        int i;
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        LinkPlayerInfo linkPlayerInfoLJI;
        User user;
        AbstractC928510aGn abstractC928510aGnLIZ;
        MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJIJJLI(LJJLIIIJJIZ(), !z);
        }
        MultiGuestDataHolder multiGuestDataHolder2 = getMultiGuestDataHolder();
        if (multiGuestDataHolder2 != null) {
            multiGuestDataHolder2.LJJIIZI(z);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiGuestV3AnchorPresenter anchorMuteVideo ");
            sbLIZ.append(str);
            interfaceC954180awCLLJLL.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
            C769040UEs.LIZLLL(this.LLILZ);
            i = 1;
        } else {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
            C769040UEs.LIZ();
            i = 2;
        }
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        ImageModel avatarThumb = null;
        if (interfaceC921460a5Q != null) {
            interfaceC665370Q7zF3 = interfaceC921460a5Q.F3();
        } else {
            interfaceC665370Q7zF3 = null;
        }
        boolean z2 = !changeMediaState(interfaceC665370Q7zF3, 4, i);
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
            linkPlayerInfoLJI = C921170a4x.LJI(abstractC928510aGnLIZ, UserService.getInstance().user().getCurrentUserId());
        } else {
            linkPlayerInfoLJI = null;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            boolean z3 = !z;
            if (linkPlayerInfoLJI != null && (user = linkPlayerInfoLJI.mUser) != null) {
                avatarThumb = user.getAvatarThumb();
            }
            interfaceC954180awCLLJLL2.LJJLIIIJL(z3, avatarThumb, str, false, z2);
        }
    }

    public final void LJJLIIIIJ(C919530a2J c919530a2J, LinkPlayerInfo linkPlayerInfo) {
        String strU3;
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_invite_applied_audience");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILLL.getId()), "room_id");
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            strU3 = interfaceC954180awCLLJLL.U3();
        } else {
            strU3 = null;
        }
        c474500IjALIZ.LJJII(strU3, "channel_id");
        c474500IjALIZ.LJJII(linkPlayerInfo.mInteractIdStr, "link_mic_id");
        c474500IjALIZ.LIZ();
        long id = c919530a2J.LIZ.getId();
        String str = linkPlayerInfo.mInteractIdStr;
        if (c919530a2J.LIZJ) {
            i = 1;
        } else if (c919530a2J.LIZIZ) {
            i = 2;
        } else {
            i = 0;
        }
        LJIJI(id, str, 1, true, null, null, null, null, Integer.valueOf(i), c919530a2J.LIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJ(com.bytedance.android.livesdk.comp.api.linkcore.model.UnifiedReplyInviteMessage r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921520a5W.LJJLJ(com.bytedance.android.livesdk.comp.api.linkcore.model.UnifiedReplyInviteMessage, boolean):void");
    }

    public final void LJLJJI(final String str, final Function0<Unit> function0) {
        String strLIZ;
        Long lValueOf;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        int i;
        String str2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ3;
        MultiGuestDataHolder multiGuestDataHolder2;
        Map<Integer, String> map;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ4;
        Map<Integer, String> map2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestUpdateSetting layoutId:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            if (str != null && !LinkMicFilterLastLayoutIdMapUpdateByLayoutIdConfig.INSTANCE.isInFilter(str) && (multiGuestDataHolder = getMultiGuestDataHolder()) != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ2.fixMicNumAction == 0) {
                MultiGuestDataHolder multiGuestDataHolder3 = getMultiGuestDataHolder();
                if (multiGuestDataHolder3 != null && (multiLiveAnchorPanelSettingsLIZIZ4 = multiGuestDataHolder3.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ4.layoutType == 1) {
                    MultiGuestDataHolder multiGuestDataHolder4 = getMultiGuestDataHolder();
                    if (multiGuestDataHolder4 != null && (map2 = multiGuestDataHolder4.LJIJJLI) != null) {
                        ((ConcurrentHashMap) map2).put(1, str);
                    }
                } else {
                    MultiGuestDataHolder multiGuestDataHolder5 = getMultiGuestDataHolder();
                    if (multiGuestDataHolder5 != null && (multiLiveAnchorPanelSettingsLIZIZ3 = multiGuestDataHolder5.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ3.layoutType == 0 && (multiGuestDataHolder2 = getMultiGuestDataHolder()) != null && (map = multiGuestDataHolder2.LJIJJLI) != null) {
                        ((ConcurrentHashMap) map).put(2, str);
                    }
                }
            }
            InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLILZ.gg0(C956790b0P.class);
            Context context = null;
            if (interfaceC665370Q7z != null) {
                ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
                if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                    str2 = state.LLILZ;
                } else {
                    str2 = null;
                }
                strLIZ = C936270aTJ.LIZ(str2);
            } else {
                strLIZ = null;
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room == null && (room = (Room) dataChannelGlobal.gg0(C930930aKh.class)) == null) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(room.getId());
            }
            Long lValueOf2 = Long.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId());
            MultiGuestDataHolder multiGuestDataHolder6 = getMultiGuestDataHolder();
            if (multiGuestDataHolder6 != null) {
                multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder6.LIZIZ();
            } else {
                multiLiveAnchorPanelSettingsLIZIZ = null;
            }
            final String str3 = "change_layout";
            if (lValueOf != null && lValueOf2 != null && multiLiveAnchorPanelSettingsLIZIZ != null) {
                final long jLIZIZ = C963140bAe.LIZIZ();
                C480460Ism.LIZ().getClass();
                MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
                long jLongValue = lValueOf.longValue();
                long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
                long jLongValue2 = lValueOf2.longValue();
                int i2 = multiLiveAnchorPanelSettingsLIZIZ.layoutType;
                int i3 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
                int i4 = multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq;
                int i5 = multiLiveAnchorPanelSettingsLIZIZ.onlyAllowFollowerReq;
                int i6 = multiLiveAnchorPanelSettingsLIZIZ.applierSortSetting;
                int i7 = multiLiveAnchorPanelSettingsLIZIZ.LIZ;
                int i8 = multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFriends;
                int i9 = multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromFollowers;
                int i10 = multiLiveAnchorPanelSettingsLIZIZ.allowRequestFromOthers;
                int i11 = multiLiveAnchorPanelSettingsLIZIZ.enableShowMultiGuestLayout;
                if (C931790aM5.LIZIZ()) {
                    i = 4;
                } else {
                    i = 0;
                }
                multiLiveApi.updateAnchorPanelSettings(jLongValue, jLJIILL, jLongValue2, i2, i3, i4, i5, str, strLIZ, i, i6, 0L, i7, i8, i9, i10, 0, i11, C924810aAp.LJ().LJJIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.01HV
                    public final /* synthetic */ int LLILLL = 1;

                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        InterfaceC954180awC interfaceC954180awCLLJLL;
                        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
                        C1C7U.LIZ("MultiGuestV3AnchorPresenter@b85a.updateAnchorPanelSettings$2");
                        C01EX.LIZLLL(C963140bAe.LIZIZ() - jLIZIZ, "update_setting", ((BaseResponse) obj).LIZIZ, str3);
                        if (this.LLILLL == 1 && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                            interfaceC937900aVwLLIIJLIL.LJJJJIZL(str, false, false, true, false, function0);
                        }
                        C1C7U.LIZIZ("MultiGuestV3AnchorPresenter@b85a.updateAnchorPanelSettings$2");
                    }
                }, new AfS3S1100100_15(jLIZIZ, this, "change_layout", 1));
                return;
            }
            InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
            if (interfaceC919320a1y != null) {
                context = interfaceC919320a1y.getContext();
            }
            C501540Jlg.LIZLLL(context, new Throwable("param illegal."), 2131851936);
        }
    }

    public final void LJLJLJ(String str, Function0<Unit> function0) {
        Context context;
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
        if (interfaceC919320a1y != null && (context = interfaceC919320a1y.getContext()) != null) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LIZJ = u.LJJIFFI(context.getString(2131842406), "{0}", str, false);
            c782110Um9.LJII(2131840710);
            c782110Um9.LJFF(R.drawable.epr);
            c782110Um9.LJIILL = false;
            c782110Um9.LJIILL(context.getString(2131842404), new InterfaceC743640TFa() { // from class: X.0a0Y
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILLIIL(context.getString(2131842405), new AcS496S0100000_15(function0, 15));
            C786410Ut5.E4(c782110Um9.LIZ());
        }
    }

    public final void onUserLeft(String str, long j) {
        LinkPlayerInfo linkPlayerInfoLJII;
        User user;
        AbstractC928510aGn abstractC928510aGnLIZ;
        String idStr;
        if (this.mView == 0) {
            return;
        }
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        Long lValueOf = null;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
            linkPlayerInfoLJII = C921170a4x.LJII(abstractC928510aGnLIZ, str);
            if (linkPlayerInfoLJII != null) {
                User user2 = linkPlayerInfoLJII.mUser;
                if (user2 != null && (idStr = user2.getIdStr()) != null) {
                    LJJLIIIJL().LIZIZ(idStr);
                }
                User user3 = linkPlayerInfoLJII.mUser;
                if (user3 != null) {
                    if (j == 1) {
                        long id = user3.getId();
                        String secUid = linkPlayerInfoLJII.mUser.getSecUid();
                        if (secUid == null) {
                            secUid = "";
                        }
                        LJIIIZ(id, secUid, "kickout_with_rtc_user_leaved", null);
                    }
                    if (!linkPlayerInfoLJII.LIZLLL) {
                        C766270U4b.LIZLLL(2131852849);
                    }
                }
            }
        } else {
            linkPlayerInfoLJII = null;
        }
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC921460a5Q.CD();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("position:LinkIn_Anchor; interactId:");
        sbLIZ.append(str);
        C944240agA.LJI("OnUserLeaved", C2188811AlT.LIZIZ(sbLIZ));
        if (linkPlayerInfoLJII != null && (user = linkPlayerInfoLJII.mUser) != null) {
            lValueOf = Long.valueOf(user.getId());
        }
        C924630aAX.LJJJJZ(j, lValueOf, str, true);
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [X.0a5B] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0a5u] */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.0Zy7] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.0Zy2] */
    public C921520a5W(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        InterfaceC302401Fe interfaceC302401Fe;
        super(room, lifecycleOwner);
        this.LLILLL = room;
        this.LLILZ = dataChannel;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(57));
        this.LLJILJIL = new C304201Fw("ZOOM_SERVICE");
        this.LLJILJILJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(55));
        this.LLJILLL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(59));
        this.LLJJ = C930540aK4.LJJIJIL(new AwS416S0200000_15(lifecycleOwner, this, 16));
        this.LLJJI = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(58));
        this.LLJJIII = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 170));
        this.LLJJIJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 171));
        this.LLJJIJIL = new AwS559S0100000_15(this, 174);
        this.LLJJJJ = new HashMap<>();
        this.LLJJJJJIL = new C11NJ();
        this.LLJJJJLIIL = new ArrayList();
        this.LLJJL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 172));
        this.LLJJLIIIJLLLLLLLZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(54));
        this.LLJL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(56));
        this.LLJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 173));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 176));
        this.LLJLLIL = new C01G1() { // from class: X.0a5B
            public boolean LL = true;
            public int LLILLJJLI;

            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.LLILLL.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.k02();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
            @Override // X.InterfaceC922630a7J
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void L2(final X.InterfaceC921200a50<com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo, com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList> r20, int r21) {
                /*
                    Method dump skipped, instruction units count: 442
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C921310a5B.L2(X.0a50, int):void");
            }
        };
        this.LLJZ = new InterfaceC964770bDH() { // from class: X.0a5u
            public int LL = -1;

            @Override // X.InterfaceC964770bDH
            public final void LIZ(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJFF(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJII(long j, C1AZU c1azu, C969700bLE c969700bLE) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJ(String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIJJI(String str, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIIZILJ(String str, SurfaceView surfaceView) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJIJJLI(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJ(Map<String, String> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJI(long j, C1AZU c1azu) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIFFI(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJIIJ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIJIIJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIL(String str, boolean z) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJ(String str, float f, float f2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJJJZ(List<LinkUser> list, List<LinkUser> list2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJZI(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLIIL(JoinGroupDirectIMModel joinGroupDirectIMModel) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLL(C954780axA c954780axA) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJLZIJ(Map<String, MicPositionContentInfo> map) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJZ(int i, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJLJLI() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJZZI(C965210bDz c965210bDz) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLI(InterfaceC954180awC interfaceC954180awC, ReplyInviteGroupMessage replyInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLIIIL(InterfaceC954180awC interfaceC954180awC, InviteGroupMessage inviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLILLLLZI(InterfaceC954180awC interfaceC954180awC, DestroyChannelMessage destroyChannelMessage, Integer num, Integer num2) {
            }

            @Override // X.InterfaceC964770bDH
            public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
                return null;
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJLLL(int i, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLL(InterfaceC954180awC interfaceC954180awC, PermitApplyGroupMessage permitApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLILLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLL(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIILZL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIL(List<LinkUser> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLIZIL(InterfaceC954180awC interfaceC954180awC, CancelInviteGroupMessage cancelInviteGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLJI(String str, boolean z, boolean z2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIII(long j, InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLIILIL(InterfaceC954180awC interfaceC954180awC, CancelApplyGroupMessage cancelApplyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLLIL(LinkLayerRTCMessage linkLayerRTCMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJ() {
                DataChannel dataChannel2;
                this.LLILLJJLI.getClass();
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL == null || !interfaceC954180awCLLJLL.A0() || (dataChannel2 = this.LLILLJJLI.dataChannel) == null) {
                    return;
                }
                dataChannel2.FQ2(RTCMixStreamSuccessWhenResumeEvent.class);
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJ() {
                DataChannel dataChannel2 = this.LLILLJJLI.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(AnchorBroadcastResolutionChangeEvent.class);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIL() {
                DataChannel dataChannel2;
                DataChannel dataChannel3;
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && !C917850Zzb.LIZ(interfaceC954180awCLLJLL)) {
                    C944240agA.LJFF("onRtcErrorDestroyChannel", "return for is not isInInnerOrMixRoom");
                    return;
                }
                C921520a5W c921520a5W = this.LLILLJJLI;
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.Ul2();
                }
                C924790aAn.LIZLLL().LJII(0);
                DataChannel dataChannel4 = c921520a5W.LLILZ;
                if (dataChannel4 != null) {
                    dataChannel4.LC0(InteractStateChangeEvent.class, new C924400aAA(8));
                }
                DataChannel dataChannel5 = c921520a5W.LLILZ;
                if (dataChannel5 != null) {
                    dataChannel5.FQ2(MultiGuestV3AnchorDestroyChannel.class);
                }
                MultiGuestDataHolder multiGuestDataHolder = c921520a5W.getMultiGuestDataHolder();
                if (multiGuestDataHolder != null) {
                    multiGuestDataHolder.LJIL("destroy_channel");
                }
                if (C924810aAp.LJ().LJJJJJ && (dataChannel3 = c921520a5W.LLILZ) != null) {
                    dataChannel3.LC0(MuteMicViewStateChangeEvent.class, Boolean.TRUE);
                }
                if (MultiGuestFetchAnchorActivityInfoSetting.INSTANCE.isEnable() && (dataChannel2 = c921520a5W.LLILZ) != null) {
                    dataChannel2.zW(AnchorActivityBannerChannel.class, new C922290a6l(false, "", ""));
                }
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                C921920a6A.LJII(C927600aFK.LJII(), c921520a5W.LLILZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
            @Override // X.InterfaceC964770bDH
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJLIIIJJIZ(java.lang.String r5) {
                /*
                    r4 = this;
                    java.lang.String r1 = "MultiGuestV3AnchorPresenter"
                    java.lang.String r0 = "receive rtc turnOffEngine msg"
                    X.C919310a1x.LIZ(r1, r0)
                    X.0a5W r3 = r4.LLILLJJLI
                    com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r2 = r3.getMultiGuestDataHolder()
                    r1 = 1
                    if (r2 == 0) goto L2e
                    com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkAnchorMultiGuestShowOpenCameraOnLinkEndSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkAnchorMultiGuestShowOpenCameraOnLinkEndSetting.INSTANCE
                    boolean r0 = r0.isEnable()
                    if (r0 == 0) goto L34
                    com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r3.getMultiGuestDataHolder()
                    if (r0 == 0) goto L32
                    boolean r0 = r0.LJIIJ
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                L24:
                    boolean r0 = X.C500260Jjc.LJJIFFI(r0)
                    if (r0 == 0) goto L34
                    r0 = 0
                L2b:
                    r2.LJIIZILJ(r0)
                L2e:
                    X.C924630aAX.LJJJJLI(r5, r1)
                    return
                L32:
                    r0 = 0
                    goto L24
                L34:
                    r0 = 1
                    goto L2b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C921760a5u.LJJLIIIJJIZ(java.lang.String):void");
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
                if (!C917850Zzb.LIZ(interfaceC954180awC)) {
                    C944240agA.LJFF("onStartPushStream", "return for is not isInInnerOrMixRoom");
                    return;
                }
                C919310a1x.LIZ("MultiGuestV3AnchorPresenter", "receive rtc startPushStream msg");
                DataChannel dataChannel2 = this.LLILLJJLI.LLILZ;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(InteractStateChangeEvent.class, new C924400aAA(7));
                }
                C924630aAX.LJJJJL(true);
                TestDisableMixStreamTypeSetting.INSTANCE.getValue();
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InteractAudioVolumeInfo> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().linkMicId);
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InteractAudioVolumeInfo> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Boolean.valueOf(it3.next().isTalk()));
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InteractAudioVolumeInfo> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Integer.valueOf(it4.next().volume));
                }
                C921520a5W c921520a5W = this.LLILLJJLI;
                c921520a5W.getClass();
                if (!arrayList.isEmpty() && !arrayList2.isEmpty() && !arrayList3.isEmpty()) {
                    String strLIZLLL = C924810aAp.LJ().LIZLLL();
                    int size = arrayList.size();
                    boolean z = false;
                    int iIntValue = 0;
                    for (int i = 0; i < size; i++) {
                        String str = (String) ListProtector.get(arrayList, i);
                        MultiGuestDataHolder multiGuestDataHolder = c921520a5W.getMultiGuestDataHolder();
                        if (multiGuestDataHolder != null) {
                            ((ConcurrentHashMap) multiGuestDataHolder.LJJIIJZLJL).put(str, Integer.valueOf(((Number) ListProtector.get(arrayList3, i)).intValue()));
                        }
                        if (TextUtils.equals(str, strLIZLLL) && C500260Jjc.LJJJI((Boolean) ListProtector.get(arrayList2, i)) && ((Number) ListProtector.get(arrayList3, i)).intValue() > 0) {
                            iIntValue = ((Number) ListProtector.get(arrayList3, i)).intValue();
                        }
                    }
                    DataChannel dataChannel2 = c921520a5W.LLILZ;
                    if (iIntValue > 0) {
                        z = true;
                    }
                    dataChannel2.LC0(LiveTalkStateEvent.class, Boolean.valueOf(z));
                    InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                    if (interfaceC921460a5Q != null) {
                        interfaceC921460a5Q.Y6();
                    }
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(C930540aK4.LJJJJIZL((String) it5.next()));
                    }
                    C0U27 c0u27 = new C0U27(arrayList4, arrayList2, arrayList3);
                    DataChannel dataChannel3 = c921520a5W.LLILZ;
                    if (dataChannel3 != null) {
                        dataChannel3.zW(MultiGuestTalkStateChannel.class, c0u27);
                    }
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIIZI(String str, String str2) {
                DataChannel dataChannel2;
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && !C917850Zzb.LIZ(interfaceC954180awCLLJLL)) {
                    C944240agA.LJFF("onRtcExtraInfoReceived", "return for is not isInInnerOrMixRoom");
                    return;
                }
                Map<String, Object> map = C1338270kvh.LIZ;
                if (str2 != null && (dataChannel2 = this.LLILLJJLI.dataChannel) != null) {
                    dataChannel2.zW(RtcSeiReceivedChannel.class, str2);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIZ(String str, long j) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && !C917850Zzb.LIZIZ(interfaceC954180awCLLJLL, str)) {
                    C944240agA.LJFF("onUserLeft", "return for is not isInInnerOrMixRoom");
                } else {
                    this.LLILLJJLI.onUserLeft(str, j);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJL(int i, C965030bDh c965030bDh) {
                if (LinkMicModeSwitchRustFixSetting.enable() && i == 2) {
                    C1AZW.LJIILL(this.LLILLJJLI.logTAG(1142), "call from CoHost Linker. no need mode switch to MG", null, null);
                    return;
                }
                DataChannel dataChannel2 = this.LLILLJJLI.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(MultiGuestAnchorInProgressEventWithCallback.class, new ARunnableS115S0100000_15(c965030bDh, 42));
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && !C917850Zzb.LIZIZ(interfaceC954180awCLLJLL, str)) {
                    C944240agA.LJFF("onAvatarStateChanged", "return for is not isInInnerOrMixRoom");
                    return;
                }
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.LLILLJJLI.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.D2(avatar.avatarId, str);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLL(int i, int i2) {
                DataChannel dataChannel2;
                if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && (dataChannel2 = this.LLILLJJLI.LLILZ) != null) {
                    dataChannel2.zW(LinkerModeChangeChannel.class, Integer.valueOf(i2));
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
                InterfaceC302401Fe interfaceC302401FeLJJL;
                if (C917810ZzX.LJIIIIZZ() && (interfaceC302401FeLJJL = this.LLILLJJLI.LJJL()) != null) {
                    interfaceC302401FeLJJL.LJJIJ("fetch_on_mix_mode_p2p_group_chg_msg_receive", 27, null, null);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
                InterfaceC665370Q7z interfaceC665370Q7z;
                ISharedBgAbility iSharedBgAbility;
                MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
                C935540aS8 state;
                DataChannel dataChannel2 = this.LLILLJJLI.dataChannel;
                if (dataChannel2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) != null && (iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null)) != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null && state.LLILLL && c949400aoU != null) {
                    c949400aoU.LJIIJ = state.LLILZIL;
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                String strLIZLLL;
                C1275560jIY c1275560jIY;
                StreamUrl streamUrl;
                boolean zBooleanValue;
                boolean z = rtcStartResultMessage.startSuccess;
                if (z) {
                    C924810aAp.LJ().LJJIIZI = true;
                    C924810aAp.LJ().LJJIJIIJI = true;
                    boolean zNy1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(this.LLILLJJLI.LLILLL.getId()));
                    C921520a5W c921520a5W = this.LLILLJJLI;
                    if (zNy1) {
                        C20441214yg.LJIIIZ("MultiGuestV3AnchorPresenter", "onRtcStartResult: inPunish=true");
                        c921520a5W.getClass();
                        C921520a5W.LJJLIIJ(false);
                    }
                    C921520a5W c921520a5W2 = this.LLILLJJLI;
                    c921520a5W2.getClass();
                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL != null && interfaceC954180awCLLJLL.ae()) {
                        DataChannel dataChannel2 = c921520a5W2.dataChannel;
                        if (C500260Jjc.LJIIZILJ(dataChannel2)) {
                            MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                            Boolean boolLIZ = InterfaceC1106030et7.A6.LIZ();
                            if (boolLIZ != null) {
                                zBooleanValue = boolLIZ.booleanValue();
                            } else {
                                zBooleanValue = true;
                            }
                            if (multiGuestDataHolder != null) {
                                multiGuestDataHolder.LJJIIZI(zBooleanValue);
                            }
                            if (zBooleanValue) {
                                C784440Upu.LIZ().LIZIZ(new C465900IOu(40));
                            } else {
                                C784440Upu.LIZ().LIZIZ(new C465900IOu(41));
                            }
                            if (dataChannel2 != null) {
                                dataChannel2.LC0(MultiLiveAnchorMuteVideoEvent.class, new C0UI0(zBooleanValue, "business_mute_host_on_resume_with_guest"));
                            }
                            if (zBooleanValue && dataChannel2 != null) {
                                dataChannel2.LC0(AnchorOpenCameraEvent.class, new C927820aFg(false, "end_link_and_no_guest"));
                            }
                        }
                        DataChannel dataChannel3 = c921520a5W2.dataChannel;
                        Boolean boolLIZ2 = InterfaceC1106030et7.F7.LIZ();
                        if (boolLIZ2 != null && boolLIZ2.booleanValue() && dataChannel3 != null) {
                            dataChannel3.zW(MuteMicChannel.class, Boolean.TRUE);
                        }
                    }
                    C1EOY c1eoy = C1EOY.LIZ;
                    C930480aJy.LIZ.getClass();
                    AwS100S1000000_15 awS100S1000000_15LJIILIIL = C930480aJy.LJIILIIL();
                    if (!Intrinsics.LJFF(C1EOY.LJIILJJIL, "linkmic_anchor_period")) {
                        c1eoy.LJJI();
                        C1EOY.LJIILJJIL = "linkmic_anchor_period";
                        c1eoy.LJIIJJI(awS100S1000000_15LJIILIIL);
                        c1eoy.LJIILLIIL();
                    }
                    if (!LiveHostCpuTotalPssOpt.enable()) {
                        Room room2 = c921520a5W2.LL;
                        if (room2 == null || (streamUrl = room2.getStreamUrl()) == null || (strLIZLLL = streamUrl.LIZLLL()) == null) {
                            strLIZLLL = "";
                        }
                        long id = c921520a5W2.LL.getId();
                        String lowerCase = c921520a5W2.LLLFFI.name().toLowerCase(Locale.ROOT);
                        if (c921520a5W2.LL.getStreamUrlExtraSafely().anchorInteractProfile > 0) {
                            c1275560jIY = C1275560jIY.LJIIIZ;
                        } else {
                            c1275560jIY = C1275560jIY.LJIIIIZZ;
                        }
                        C922010a6J c922010a6J = new C922010a6J(c1275560jIY.LIZ, lowerCase, strLIZLLL, c1275560jIY.LIZIZ, id, c1275560jIY.LJFF, c1275560jIY.LJ);
                        c921520a5W2.LLILZLL = c922010a6J;
                        c922010a6J.LIZJ = C1469770oLn.LIZ() / 1024.0f;
                        c922010a6J.LJIIIIZZ = (C11JF) C19490011Na.LIZJ(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new AkS492S0100000_33(c922010a6J, 1)).LJJJ(new InterfaceC1487280oo2() { // from class: X.0XPO
                            @Override // X.InterfaceC1487280oo2
                            public final Object apply(Object obj) {
                                C480460Ism.LIZ().getClass();
                                return ((LogReportApi) C480460Ism.LIZLLL(LogReportApi.class)).logReport("a", obj);
                            }
                        }, false).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS137S0000000_15(6), new AfS137S0000000_15(7));
                    }
                    C20337914i1<Boolean> c20337914i1 = InterfaceC1104970erP.I2;
                    Boolean bool = Boolean.TRUE;
                    c20337914i1.LJFF(bool);
                    C922240a6g.LIZIZ(true, Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(KaraokeStateChannel.class), bool));
                    C924630aAX.LJJJJJL(true);
                    if (C978390bZF.LIZ() && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(c921520a5W2.dataChannel)) != null) {
                        playbookAnchorServiceV2LIZIZ.LJJII();
                        return;
                    }
                    return;
                }
                if (!z) {
                    LinkCoreError linkCoreError = rtcStartResultMessage.error;
                    if (linkCoreError == null) {
                        return;
                    }
                    C921520a5W c921520a5W3 = this.LLILLJJLI;
                    int i = linkCoreError.errorCode;
                    String str = linkCoreError.errorMsg;
                    if (c921520a5W3.mView == 0) {
                        return;
                    }
                    if (LinkMicLayoutFullScreenEnd.INSTANCE.isEnable()) {
                        C924810aAp.LJ().LJIIJJI(false);
                    }
                    C924810aAp.LJ().LJII();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("position:LinkIn_Anchor; code:");
                    sbLIZ.append(i);
                    sbLIZ.append("; desc:");
                    sbLIZ.append(str);
                    C944240agA.LJI("OnStartFailed", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W3.mView;
                    if (interfaceC921460a5Q != null) {
                        interfaceC921460a5Q.vk0();
                    }
                    DataChannel dataChannel4 = c921520a5W3.LLILZ;
                    if (dataChannel4 != null) {
                        dataChannel4.LC0(InteractStateChangeEvent.class, new C924400aAA(8));
                    }
                    C924630aAX.LJJJJIZL(i, str, true);
                    return;
                }
                throw new C1954807lC();
            }

            @Override // X.InterfaceC964770bDH
            public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
                if (!C917850Zzb.LIZ(interfaceC954180awC)) {
                    C944240agA.LJFF("onRtcError", "return for is not isInInnerOrMixRoom");
                    return;
                }
                C919310a1x.LIZ("MultiGuestV3AnchorPresenter", "receive rtcError msg");
                C921520a5W c921520a5W = this.LLILLJJLI;
                int i = linkCoreError.errorCode;
                String str = linkCoreError.errorMsg;
                if (c921520a5W.mView != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("position:LinkIn_Guest; code:");
                    sbLIZ.append(i);
                    sbLIZ.append("; message:");
                    sbLIZ.append(str);
                    C944240agA.LJI("OnError", C2188811AlT.LIZIZ(sbLIZ));
                    String strLogTAG = c921520a5W.logTAG(1974);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onError: ");
                    sbLIZ2.append(str);
                    C1AZW.LJFF(strLogTAG, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    C766270U4b.LIZLLL(2131843296);
                    EnumC921570a5b enumC921570a5b = EnumC921570a5b.RTC_ERROR;
                    c921520a5W.LLIZ = true;
                    if (enumC921570a5b != null) {
                        c921520a5W.LJLL(enumC921570a5b, CertProviderManagerKt.findCert("bpea-linkmic_anchorpre_onUnrecoverableErrorHappened", 1476788485), null);
                    }
                    C924630aAX.LJJJJ(i, str, true);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
                Map map;
                if (!C917850Zzb.LIZIZ(interfaceC954180awC, str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive guest[");
                    sbLIZ.append(str);
                    sbLIZ.append("] firstRemoteVideoFrame return.");
                    C919310a1x.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("receive guest[");
                sbLIZ2.append(str);
                sbLIZ2.append("] firstRemoteVideoFrame");
                C919310a1x.LIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ2));
                DataChannel dataChannel2 = this.LLILLJJLI.LLILZ;
                if (dataChannel2 != null && (map = (Map) dataChannel2.gg0(C749450TaZ.class)) != null) {
                    map.put(str, true);
                }
                this.LLILLJJLI.onFirstRemoteVideoFrameRender(str);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
                InterfaceC302401Fe interfaceC302401FeLJJL;
                Long l = applyMessage.applicant.userId;
                if (l != null) {
                    C921520a5W c921520a5W = this.LLILLJJLI;
                    long jLongValue = l.longValue();
                    InterfaceC302401Fe interfaceC302401FeLJJL2 = c921520a5W.LJJL();
                    if (interfaceC302401FeLJJL2 != null) {
                        interfaceC302401FeLJJL2.LJIJJ(jLongValue, "guest_apply_anchor");
                    }
                    if (C917810ZzX.LJIIIIZZ() && (interfaceC302401FeLJJL = this.LLILLJJLI.LJJL()) != null) {
                        interfaceC302401FeLJJL.LJJIJ("fetch_on_mix_mode_apply_msg_receive", 27, null, new AwS49S0100100_15(this.LLILLJJLI, jLongValue, 1));
                    }
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
                this.LLILLJJLI.LJJLIL(directJoinMessage);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
                this.LLILLJJLI.LJJLL(inviteMessage);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
                InterfaceC302401Fe interfaceC302401FeLJJL;
                Long l = cancelApplyMessage.applicant.userId;
                if (l != null) {
                    C921520a5W c921520a5W = this.LLILLJJLI;
                    long jLongValue = l.longValue();
                    if (C917810ZzX.LJIIIIZZ() && (interfaceC302401FeLJJL = c921520a5W.LJJL()) != null) {
                        interfaceC302401FeLJJL.LJJIJ("fetch_on_mix_mode_cancel_apply_msg_receive", 27, null, new AwS49S0100100_15(c921520a5W, jLongValue, 0));
                    }
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
                this.LLILLJJLI.LJJZ(kickOutMessage);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
                Player player = cancelInviteMessage.invitee;
                if (player != null) {
                    this.LLILLJJLI.LJJLIIIJL().LIZIZ(String.valueOf(player.uid));
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
                AbstractC928510aGn abstractC928510aGnLIZ;
                LinkPlayerInfo linkPlayerInfo;
                long followStatus;
                Long l = leaveMessage.leftUser.userId;
                if (l != null) {
                    long jLongValue = l.longValue();
                    this.LLILLJJLI.LJJLIIIJL().LIZIZ(String.valueOf(jLongValue));
                    InterfaceC302401Fe interfaceC302401FeLJJL = this.LLILLJJLI.LJJL();
                    if (interfaceC302401FeLJJL != null && (abstractC928510aGnLIZ = interfaceC302401FeLJJL.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJII(jLongValue)) != null) {
                        C921520a5W c921520a5W = this.LLILLJJLI;
                        FollowInfo followInfo = linkPlayerInfo.mUser.getFollowInfo();
                        if (followInfo != null) {
                            followStatus = followInfo.getFollowStatus();
                        } else {
                            followStatus = 0;
                        }
                        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                        C307001Gy.LIZ().getClass();
                        C921920a6A.LJFF(jLongValue, followStatus, C927600aFK.LJII(), c921520a5W.dataChannel);
                    }
                    InterfaceC302401Fe interfaceC302401FeLJJL2 = this.LLILLJJLI.LJJL();
                    if (interfaceC302401FeLJJL2 != null) {
                        interfaceC302401FeLJJL2.LJIIJJI(jLongValue);
                    }
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
                this.LLILLJJLI.LJJZZI(permitApplyMessage);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
                this.LLILLJJLI.LJJLJ(replyInviteMessage.toUnifiedReplyInviteMessage(), false);
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z, LinkCoreError linkCoreError) {
                DataChannel dataChannel2;
                Integer numValueOf;
                C919310a1x.LIZ("MultiGuestV3AnchorPresenter", "receive RTC engine end msg");
                this.LLILLJJLI.getClass();
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null && interfaceC954180awCLLJLL.A0() && (dataChannel2 = this.LLILLJJLI.dataChannel) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("rtc_end_");
                    if (linkCoreError != null) {
                        numValueOf = Integer.valueOf(linkCoreError.errorCode);
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    dataChannel2.zW(OnlyPushRtcEngineAlreadyCloseChannel.class, C2188811AlT.LIZIZ(sbLIZ));
                }
                if (z) {
                    C921520a5W c921520a5W = this.LLILLJJLI;
                    if (c921520a5W.mView != 0) {
                        C20441214yg.LJIIIZ(InterfaceC784590Uq9.LIZ, "onEngineEndSuccess");
                        if (LinkMicLayoutFullScreenEnd.INSTANCE.isEnable()) {
                            C924810aAp.LJ().LJIIJJI(false);
                        }
                        C924810aAp.LJ().LJII();
                        C944240agA.LJI("onEndSuccess", "position:LinkIn_Anchor");
                        c921520a5W.LJLJLLL();
                        C1EOY.LIZ.LJIJJ();
                        return;
                    }
                    return;
                }
                if (!z) {
                    if (linkCoreError == null) {
                        return;
                    }
                    C921520a5W c921520a5W2 = this.LLILLJJLI;
                    int i = linkCoreError.errorCode;
                    String str = linkCoreError.errorMsg;
                    c921520a5W2.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("position:LinkIn_Anchor; code:");
                    sbLIZ2.append(i);
                    sbLIZ2.append("; desc:");
                    sbLIZ2.append(str);
                    C944240agA.LJI("OnEndFailed", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                throw new C1954807lC();
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
                if (!C917850Zzb.LIZ(interfaceC954180awC)) {
                    C944240agA.LJFF("onUserJoined", "return for is not isInInnerOrMixRoom");
                    return;
                }
                C921520a5W c921520a5W = this.LLILLJJLI;
                String str = linkUser.linkMicId;
                if (str == null) {
                    str = "";
                }
                c921520a5W.onUserJoined(str);
                C924630aAX.LJJJJLL(linkUser.userId, linkUser.linkMicId, true);
                DataChannel dataChannel2 = this.LLILLJJLI.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(LinkMicUserJoinedEvent.class, 4);
                }
                String str2 = linkUser.linkMicId;
                if (str2 != null) {
                    C920830a4P.LJ.put(str2, Long.valueOf(SystemClock.uptimeMillis()));
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
                boolean z;
                List<LinkUser> listLIZIZ = C925600aC6.LIZIZ(this.LLILLJJLI.LLJJJJLIIL, interfaceC958070b2T.LIZLLL());
                C921520a5W c921520a5W = this.LLILLJJLI;
                for (LinkUser linkUser : (ArrayList) listLIZIZ) {
                    Long l = linkUser.userId;
                    long currentUserId = UserService.getInstance().user().getCurrentUserId();
                    if (l == null || l.longValue() != currentUserId) {
                        Long l2 = linkUser.userId;
                        if (l2 != null) {
                            long jLongValue = l2.longValue();
                            ((ArrayList) c921520a5W.LLJJJJLIIL).add(Long.valueOf(jLongValue));
                        }
                    }
                }
                if (C917740ZzQ.LIZJ(C924810aAp.LJ().LJJIII)) {
                    int iLJJIL = interfaceC958070b2T.LJJIL();
                    int i2 = this.LL;
                    if (i2 > 0) {
                        boolean z2 = false;
                        if (iLJJIL > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i2 > 1) {
                            z2 = true;
                        }
                        if (z != z2) {
                            C923210a8F.LIZ(C924810aAp.LJ().LJJIII);
                        }
                    }
                    this.LL = iLJJIL;
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
                DataChannel dataChannel2;
                int size = ((ArrayList) C948780anU.LIZ(c967130bH5.LIZLLL())).size();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onInnerUserListChange changeFlag=");
                sbLIZ.append(i);
                sbLIZ.append(", guestCount = ");
                sbLIZ.append(size);
                C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                if (C921770a5v.LIZ(i) && (dataChannel2 = this.LLILLJJLI.dataChannel) != null) {
                    dataChannel2.zW(LinkedGuestCountChannel.class, Integer.valueOf(size));
                }
                C931800aM6.LIZ.getClass();
                if (C931800aM6.LIZIZ()) {
                    LLJLLIL(interfaceC954180awC, i, c967130bH5, str, customLinkMessage);
                }
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
                DataChannel dataChannel2;
                int size = ((ArrayList) C948780anU.LIZ(interfaceC958070b2T.LIZLLL())).size();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onInnerUserListChange changeFlag=");
                sbLIZ.append(i);
                sbLIZ.append(", guestCount = ");
                sbLIZ.append(size);
                C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                if (C921770a5v.LIZ(i) && (dataChannel2 = this.LLILLJJLI.dataChannel) != null) {
                    dataChannel2.zW(LinkedGuestCountChannel.class, Integer.valueOf(size));
                }
            }
        };
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 175));
        this.LLLF = new InterfaceC940760aaY() { // from class: X.0Zy7
            @Override // X.InterfaceC940760aaY
            public final void LJFF(int i, String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJI(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJII(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIII(List<C957020b0m> list) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJ(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIJIIJIL(String str) {
            }

            @Override // X.InterfaceC940760aaY
            public final void LJJIIJZLJL(C942080acg c942080acg) {
                if (!this.LIZ.LLL) {
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJI()) {
                        DataChannel dataChannel2 = this.LIZ.dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.zW(FeaturedHashTagChangedChannel.class, Boolean.TRUE);
                        }
                        this.LIZ.LLL = true;
                    }
                }
                this.LIZ.getClass();
                C921520a5W.LJLIL();
            }

            @Override // X.InterfaceC940760aaY
            public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
                C942200acs.LJ(layoutState, "anchor onLayoutInfoUpdated");
                this.LIZ.getClass();
                C921520a5W.LJLIL();
            }
        };
        this.LLLFF = new InterfaceC958970b3v() { // from class: X.0Zy2
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return !C917810ZzX.LJIIIIZZ();
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
                if (!this.LL.LLL) {
                    C930480aJy.LIZ.getClass();
                    if (C930480aJy.LJJI()) {
                        DataChannel dataChannel2 = this.LL.dataChannel;
                        if (dataChannel2 != null) {
                            dataChannel2.zW(FeaturedHashTagChangedChannel.class, Boolean.TRUE);
                        }
                        this.LL.LLL = true;
                    }
                }
                this.LL.getClass();
                C921520a5W.LJLIL();
            }
        };
        this.LLLFFI = EnumC1275250jI3.BYTE;
        AnchorBusinessUserManager anchorBusinessUserManager = new AnchorBusinessUserManager(this.LL, C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ()), (IMessageManager) dataChannel.gg0(C776250Uch.class));
        anchorBusinessUserManager.setDataChannel(dataChannel);
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LJFF(anchorBusinessUserManager, "MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        dataChannel.FQ2(MultiGuestAnchorUserManangerEvent.class);
        if (C931790aM5.LIZIZ()) {
            c948450amx.LJFF(new ZoomServiceV2(dataChannel), "ZOOM_SERVICE");
        } else {
            c948450amx.LJFF(new ZoomService(dataChannel), "ZOOM_SERVICE");
        }
        if (MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            C20441214yg.LIZIZ("LiveShowService", "LiveShowService create");
            LiveShowService.LIZJ = false;
            c948450amx.LJFF(new LiveShowService(dataChannel), null);
        }
        if (LinkmicCountDownTimerPlayModeConfig.INSTANCE.isServiceEnable()) {
            C01EG.LIZ(dataChannel);
        }
        c948450amx.LIZJ(this);
        MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
        if (multiGuestDataHolder != null && (interfaceC302401Fe = this.userManager) != null) {
            interfaceC302401Fe.LJIILIIL(multiGuestDataHolder);
        }
    }

    @Override // X.AbstractC921450a5P
    public final void LJJJJLI(final LinkPlayerInfo linkPlayerInfo, final int i, boolean z) {
        String idStr;
        String str;
        Context context;
        InterfaceC302401Fe interfaceC302401Fe;
        String strLIZIZ;
        long id;
        User user;
        long id2;
        User user2;
        User user3;
        String strLIZ;
        String strLIZIZ2;
        long id3;
        User user4;
        long id4;
        User user5;
        String strLIZIZ3;
        long id5;
        User user6;
        long id6;
        User user7;
        String strLIZIZ4;
        long id7;
        User user8;
        long id8;
        User user9;
        User user10;
        Context context2;
        InterfaceC302401Fe interfaceC302401Fe2;
        String strLIZIZ5;
        long id9;
        User user11;
        long id10;
        User user12;
        User user13;
        String strLIZ2;
        String strLIZIZ6;
        long id11;
        User user14;
        long id12;
        User user15;
        String strLIZIZ7;
        long id13;
        User user16;
        long id14;
        User user17;
        String strLIZ3;
        String strLIZIZ8;
        long id15;
        User user18;
        long id16;
        User user19;
        User user20;
        User user21;
        User user22;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anchorMuteGuest->userid:");
        if (linkPlayerInfo != null && (user22 = linkPlayerInfo.mUser) != null) {
            idStr = user22.getIdStr();
        } else {
            idStr = null;
        }
        sbLIZ.append(idStr);
        sbLIZ.append(" , interactId:");
        if (linkPlayerInfo != null) {
            str = linkPlayerInfo.mInteractIdStr;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(" , status:");
        sbLIZ.append(i);
        sbLIZ.append(" , isOpCamera:");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("anchorMuteGuest/anchor", C2188811AlT.LIZIZ(sbLIZ));
        if (C922570a7D.LIZ(this.dataChannel) && !C922570a7D.LIZIZ(this.dataChannel)) {
            C20441214yg.LJIIIZ("anchorMuteGuest/anchor", "[anchorMuteGuest] isInViewerLimit");
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        if (getMultiGuestDataHolder() != null) {
            if (z) {
                C930480aJy c930480aJy = C930480aJy.LIZ;
                final MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
                if (multiGuestDataHolder == null) {
                    return;
                }
                InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
                if (interfaceC919320a1y != null) {
                    context2 = interfaceC919320a1y.getContext();
                } else {
                    context2 = null;
                }
                if (linkPlayerInfo != null && (user21 = linkPlayerInfo.mUser) != null) {
                    c930480aJy.getClass();
                    C930480aJy.LJIJI(user21);
                }
                final C11NJ c11nj = this.LLJJJJJIL;
                final WeakReference weakReference = new WeakReference(this.LLJJIJIL);
                c930480aJy.getClass();
                if (context2 != null) {
                    Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                    if (objLJIIIZ instanceof InterfaceC302401Fe) {
                        interfaceC302401Fe2 = (InterfaceC302401Fe) objLJIIIZ;
                    } else {
                        interfaceC302401Fe2 = null;
                    }
                    if (i == 0) {
                        Object[] objArr = new Object[1];
                        if (linkPlayerInfo != null && (user20 = linkPlayerInfo.mUser) != null) {
                            strLIZ3 = C0KVU.LIZ(user20);
                        } else {
                            strLIZ3 = null;
                        }
                        objArr[0] = strLIZ3;
                        C930480aJy.LJJIJIL(C497740JfY.LJIJJ(2131843479, objArr), "pm_multi_host_on_camera_access_fail_toast");
                        if (interfaceC302401Fe2 != null) {
                            if (linkPlayerInfo != null && (user19 = linkPlayerInfo.mUser) != null) {
                                id16 = user19.getId();
                            } else {
                                id16 = 0;
                            }
                            strLIZIZ8 = interfaceC302401Fe2.LIZIZ(id16);
                        } else {
                            strLIZIZ8 = null;
                        }
                        int iLIZ = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
                        String str2 = C920830a4P.LJI;
                        if (linkPlayerInfo != null && (user18 = linkPlayerInfo.mUser) != null) {
                            id15 = user18.getId();
                        } else {
                            id15 = 0;
                        }
                        C922800a7a.LIZ(i, iLIZ, strLIZIZ8, str2, "click", true, id15);
                        return;
                    }
                    if (C930480aJy.LJFF(linkPlayerInfo, i, true)) {
                        return;
                    }
                    if (i == 1) {
                        if (!InterfaceC1106030et7.i7.LIZIZ().booleanValue()) {
                            C930480aJy.LJJIIZ(c930480aJy, context2, linkPlayerInfo, 3, c11nj, null, weakReference, 16);
                            if (interfaceC302401Fe2 != null) {
                                if (linkPlayerInfo != null && (user17 = linkPlayerInfo.mUser) != null) {
                                    id14 = user17.getId();
                                } else {
                                    id14 = 0;
                                }
                                strLIZIZ7 = interfaceC302401Fe2.LIZIZ(id14);
                            } else {
                                strLIZIZ7 = null;
                            }
                            int iLIZ2 = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
                            String str3 = C920830a4P.LJI;
                            if (linkPlayerInfo != null && (user16 = linkPlayerInfo.mUser) != null) {
                                id13 = user16.getId();
                            } else {
                                id13 = 0;
                            }
                            C922800a7a.LIZ(i, iLIZ2, strLIZIZ7, str3, "panel_click", true, id13);
                            return;
                        }
                        if (linkPlayerInfo != null) {
                            user13 = linkPlayerInfo.mUser;
                        } else {
                            user13 = null;
                        }
                        C782110Um9 c782110Um9 = new C782110Um9(context2);
                        Object[] objArr2 = new Object[1];
                        if (user13 != null) {
                            strLIZ2 = C0KVU.LIZ(user13);
                        } else {
                            strLIZ2 = null;
                        }
                        objArr2[0] = strLIZ2;
                        c782110Um9.LIZJ = C497740JfY.LJIJJ(2131843483, objArr2);
                        c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131843482));
                        final Context context3 = context2;
                        final InterfaceC302401Fe interfaceC302401Fe3 = interfaceC302401Fe2;
                        c782110Um9.LJIILIIL(2131843485, new InterfaceC743640TFa() { // from class: X.01Hw
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                String strLIZIZ9;
                                User user23;
                                long id17;
                                User user24;
                                C930480aJy c930480aJy2 = C930480aJy.LIZ;
                                c930480aJy2.getClass();
                                InterfaceC1106030et7.i7.LJFF(Boolean.FALSE);
                                liveDialog.dismiss();
                                C930480aJy.LJJIIZ(c930480aJy2, context3, linkPlayerInfo, 3, c11nj, null, weakReference, 16);
                                InterfaceC302401Fe interfaceC302401Fe4 = interfaceC302401Fe3;
                                long id18 = 0;
                                if (interfaceC302401Fe4 != null) {
                                    LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                                    if (linkPlayerInfo2 != null && (user24 = linkPlayerInfo2.mUser) != null) {
                                        id17 = user24.getId();
                                    } else {
                                        id17 = 0;
                                    }
                                    strLIZIZ9 = interfaceC302401Fe4.LIZIZ(id17);
                                } else {
                                    strLIZIZ9 = null;
                                }
                                int i2 = i;
                                int iLIZ3 = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
                                String str4 = C920830a4P.LJI;
                                LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
                                if (linkPlayerInfo3 != null && (user23 = linkPlayerInfo3.mUser) != null) {
                                    id18 = user23.getId();
                                }
                                C922800a7a.LIZ(i2, iLIZ3, strLIZIZ9, str4, "click", true, id18);
                            }
                        });
                        c782110Um9.LJIIJ(2131843484, new InterfaceC743640TFa() { // from class: X.0a5c
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                            }
                        });
                        C786410Ut5.E4(c782110Um9.LIZ());
                        if (interfaceC302401Fe2 != null) {
                            if (linkPlayerInfo != null && (user15 = linkPlayerInfo.mUser) != null) {
                                id12 = user15.getId();
                            } else {
                                id12 = 0;
                            }
                            strLIZIZ6 = interfaceC302401Fe2.LIZIZ(id12);
                        } else {
                            strLIZIZ6 = null;
                        }
                        int iLIZ3 = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
                        String str4 = C920830a4P.LJI;
                        if (linkPlayerInfo != null && (user14 = linkPlayerInfo.mUser) != null) {
                            id11 = user14.getId();
                        } else {
                            id11 = 0;
                        }
                        C922800a7a.LIZ(i, iLIZ3, strLIZIZ6, str4, "show", true, id11);
                        return;
                    }
                    C930480aJy.LJJIIZ(c930480aJy, context2, linkPlayerInfo, 1, c11nj, null, weakReference, 16);
                    if (interfaceC302401Fe2 != null) {
                        if (linkPlayerInfo != null && (user12 = linkPlayerInfo.mUser) != null) {
                            id10 = user12.getId();
                        } else {
                            id10 = 0;
                        }
                        strLIZIZ5 = interfaceC302401Fe2.LIZIZ(id10);
                    } else {
                        strLIZIZ5 = null;
                    }
                    int iLIZ4 = C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
                    String str5 = C920830a4P.LJI;
                    if (linkPlayerInfo != null && (user11 = linkPlayerInfo.mUser) != null) {
                        id9 = user11.getId();
                    } else {
                        id9 = 0;
                    }
                    C922800a7a.LIZ(i, iLIZ4, strLIZIZ5, str5, "toast_show", true, id9);
                    return;
                }
                return;
            }
            C930480aJy c930480aJy2 = C930480aJy.LIZ;
            final MultiGuestDataHolder multiGuestDataHolder2 = getMultiGuestDataHolder();
            if (multiGuestDataHolder2 == null) {
                return;
            }
            InterfaceC919320a1y interfaceC919320a1y2 = (InterfaceC919320a1y) this.mView;
            if (interfaceC919320a1y2 != null) {
                context = interfaceC919320a1y2.getContext();
            } else {
                context = null;
            }
            if (linkPlayerInfo != null && (user10 = linkPlayerInfo.mUser) != null) {
                c930480aJy2.getClass();
                C930480aJy.LJIJI(user10);
            }
            final C11NJ c11nj2 = this.LLJJJJJIL;
            final WeakReference weakReference2 = new WeakReference(this.LLJJIJIL);
            c930480aJy2.getClass();
            if (context != null) {
                Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (objLJIIIZ2 instanceof InterfaceC302401Fe) {
                    interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ2;
                } else {
                    interfaceC302401Fe = null;
                }
                if (i == 3) {
                    C930480aJy.LJJIIZ(c930480aJy2, context, linkPlayerInfo, 4, c11nj2, null, weakReference2, 16);
                    if (interfaceC302401Fe != null) {
                        if (linkPlayerInfo != null && (user9 = linkPlayerInfo.mUser) != null) {
                            id8 = user9.getId();
                        } else {
                            id8 = 0;
                        }
                        strLIZIZ4 = interfaceC302401Fe.LIZIZ(id8);
                    } else {
                        strLIZIZ4 = null;
                    }
                    int iLIZJ = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                    String str6 = C920830a4P.LJI;
                    if (linkPlayerInfo != null && (user8 = linkPlayerInfo.mUser) != null) {
                        id7 = user8.getId();
                    } else {
                        id7 = 0;
                    }
                    C922800a7a.LIZ(iLIZJ, i, strLIZIZ4, str6, LiveCenterMockToolSwitch.PUNISH, false, id7);
                    return;
                }
                if (!C930480aJy.LJFF(linkPlayerInfo, i, false)) {
                    if (i == 1) {
                        if (!InterfaceC1106030et7.i7.LIZIZ().booleanValue()) {
                            C930480aJy.LJJIIZ(c930480aJy2, context, linkPlayerInfo, 2, c11nj2, null, weakReference2, 16);
                            if (interfaceC302401Fe != null) {
                                if (linkPlayerInfo != null && (user7 = linkPlayerInfo.mUser) != null) {
                                    id6 = user7.getId();
                                } else {
                                    id6 = 0;
                                }
                                strLIZIZ3 = interfaceC302401Fe.LIZIZ(id6);
                            } else {
                                strLIZIZ3 = null;
                            }
                            int iLIZJ2 = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                            String str7 = C920830a4P.LJI;
                            if (linkPlayerInfo != null && (user6 = linkPlayerInfo.mUser) != null) {
                                id5 = user6.getId();
                            } else {
                                id5 = 0;
                            }
                            C922800a7a.LIZ(iLIZJ2, i, strLIZIZ3, str7, "panel_click", false, id5);
                            return;
                        }
                        if (linkPlayerInfo != null) {
                            user3 = linkPlayerInfo.mUser;
                        } else {
                            user3 = null;
                        }
                        C782110Um9 c782110Um92 = new C782110Um9(context);
                        Object[] objArr3 = new Object[1];
                        if (user3 != null) {
                            strLIZ = C0KVU.LIZ(user3);
                        } else {
                            strLIZ = null;
                        }
                        objArr3[0] = strLIZ;
                        c782110Um92.LIZJ = C497740JfY.LJIJJ(2131843487, objArr3);
                        c782110Um92.LJIIIZ(C497740JfY.LJIJI(2131843486));
                        final Context context4 = context;
                        final InterfaceC302401Fe interfaceC302401Fe4 = interfaceC302401Fe;
                        c782110Um92.LJIILIIL(2131843485, new InterfaceC743640TFa() { // from class: X.01Hv
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                String strLIZIZ9;
                                User user23;
                                long id17;
                                User user24;
                                liveDialog.dismiss();
                                C930480aJy c930480aJy3 = C930480aJy.LIZ;
                                c930480aJy3.getClass();
                                InterfaceC1106030et7.i7.LJFF(Boolean.FALSE);
                                C930480aJy.LJJIIZ(c930480aJy3, context4, linkPlayerInfo, 2, c11nj2, null, weakReference2, 16);
                                InterfaceC302401Fe interfaceC302401Fe5 = interfaceC302401Fe4;
                                long id18 = 0;
                                if (interfaceC302401Fe5 != null) {
                                    LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                                    if (linkPlayerInfo2 != null && (user24 = linkPlayerInfo2.mUser) != null) {
                                        id17 = user24.getId();
                                    } else {
                                        id17 = 0;
                                    }
                                    strLIZIZ9 = interfaceC302401Fe5.LIZIZ(id17);
                                } else {
                                    strLIZIZ9 = null;
                                }
                                int iLIZJ3 = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                                int i2 = i;
                                String str8 = C920830a4P.LJI;
                                LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
                                if (linkPlayerInfo3 != null && (user23 = linkPlayerInfo3.mUser) != null) {
                                    id18 = user23.getId();
                                }
                                C922800a7a.LIZ(iLIZJ3, i2, strLIZIZ9, str8, "click", false, id18);
                            }
                        });
                        c782110Um92.LJIIJ(2131843484, new InterfaceC743640TFa() { // from class: X.0a5d
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                            }
                        });
                        C786410Ut5.E4(c782110Um92.LIZ());
                        if (interfaceC302401Fe != null) {
                            if (linkPlayerInfo != null && (user5 = linkPlayerInfo.mUser) != null) {
                                id4 = user5.getId();
                            } else {
                                id4 = 0;
                            }
                            strLIZIZ2 = interfaceC302401Fe.LIZIZ(id4);
                        } else {
                            strLIZIZ2 = null;
                        }
                        int iLIZJ3 = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                        String str8 = C920830a4P.LJI;
                        if (linkPlayerInfo != null && (user4 = linkPlayerInfo.mUser) != null) {
                            id3 = user4.getId();
                        } else {
                            id3 = 0;
                        }
                        C922800a7a.LIZ(iLIZJ3, i, strLIZIZ2, str8, "show", false, id3);
                        return;
                    }
                    C930480aJy.LJJIIZ(c930480aJy2, context, linkPlayerInfo, 0, c11nj2, null, weakReference2, 16);
                    if (interfaceC302401Fe != null) {
                        if (linkPlayerInfo != null && (user2 = linkPlayerInfo.mUser) != null) {
                            id2 = user2.getId();
                        } else {
                            id2 = 0;
                        }
                        strLIZIZ = interfaceC302401Fe.LIZIZ(id2);
                    } else {
                        strLIZIZ = null;
                    }
                    int iLIZJ4 = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder2);
                    String str9 = C920830a4P.LJI;
                    if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                        id = user.getId();
                    } else {
                        id = 0;
                    }
                    C922800a7a.LIZ(iLIZJ4, i, strLIZIZ, str9, "toast_show", false, id);
                }
            }
        }
    }

    @Override // X.AbstractC921450a5P
    public final void LJJJJLL(long j, C930380aJo c930380aJo, AwS10S0200001_15 awS10S0200001_15) {
        if (this.LLJJJIL) {
            return;
        }
        this.LLJJJIL = true;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.mView;
        if (lifecycleOwner == null) {
            return;
        }
        FullPositionCancelPreApproveParams fullPositionCancelPreApproveParams = new FullPositionCancelPreApproveParams();
        fullPositionCancelPreApproveParams.roomId = this.LL.getId();
        fullPositionCancelPreApproveParams.channelId = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        fullPositionCancelPreApproveParams.applyUserId = j;
        AwS381S0200000_15 awS381S0200000_15 = new AwS381S0200000_15(this, c930380aJo, 67);
        AwS381S0200000_15 awS381S0200000_152 = new AwS381S0200000_15(this, awS10S0200001_15, 68);
        C480460Ism.LIZ().getClass();
        ((InterfaceC500100JjM) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).cancelPreApprove(fullPositionCancelPreApproveParams).LJFF(new C0UO0()).LIZLLL(C11RD.LJ(lifecycleOwner))).LIZ(new AfS184S0100000_15(awS381S0200000_15, 132), new AfS172S0100000_3((Object) awS381S0200000_152, 45));
    }

    public final void LJJLIIIJILLIZJL(final MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, final String str, final Function0 function0) {
        C1303170k15 c1303170k15Y22;
        if (!C931790aM5.LIZIZ() && (c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22()) != null) {
            c1303170k15Y22.LJJL(0, str, new InterfaceC1303160k14() { // from class: X.0Zx7
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    int i;
                    Integer numLJIILJJIL;
                    AbstractC19486711Lt abstractC19486711LtLJIILLIIL;
                    String strLJIILIIL;
                    InterfaceC927510aFB zoomService;
                    if (layout != null) {
                        i = layout.micCount;
                    } else {
                        i = 9;
                    }
                    final C916290Zx5 c916290Zx5 = new C916290Zx5(this.LIZ, str, i, function0, multiLiveAnchorPanelSettings);
                    InterfaceC927510aFB zoomService2 = this.LIZ.getZoomService();
                    if (zoomService2 != null && zoomService2.LJIIIIZZ()) {
                        InterfaceC920110a3F interfaceC920110a3F = new InterfaceC920110a3F() { // from class: X.0Zx6
                            @Override // X.InterfaceC920110a3F
                            public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                            }

                            @Override // X.InterfaceC920110a3F
                            public final void LIZJ(String str2) {
                                c916290Zx5.invoke();
                            }

                            @Override // X.InterfaceC920110a3F
                            public final void LIZ(int i2, String str2, String str3, Throwable th) {
                                c916290Zx5.invoke();
                            }
                        };
                        C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                        boolean zLIZJ = C930540aK4.LIZJ();
                        c918060Zzw.getClass();
                        if (C918060Zzw.LIZ(zLIZJ)) {
                            InterfaceC927510aFB zoomService3 = this.LIZ.getZoomService();
                            if (zoomService3 != null) {
                                zoomService3.LJIIJJI(interfaceC920110a3F, str);
                                return;
                            }
                            return;
                        }
                        InterfaceC927510aFB zoomService4 = this.LIZ.getZoomService();
                        if (zoomService4 != null && (strLJIILIIL = zoomService4.LJIILIIL()) != null && (zoomService = this.LIZ.getZoomService()) != null) {
                            zoomService.LJI(strLJIILIIL, interfaceC920110a3F, false, false, true, true, EnumC919910a2v.FROM_MULTI_GUEST_MANAGE_PANEL, null);
                        }
                        InterfaceC927510aFB zoomService5 = this.LIZ.getZoomService();
                        if (zoomService5 != null && (numLJIILJJIL = zoomService5.LJIILJJIL()) != null) {
                            C921520a5W c921520a5W = this.LIZ;
                            int iIntValue = numLJIILJJIL.intValue();
                            InterfaceC927510aFB zoomService6 = c921520a5W.getZoomService();
                            if (zoomService6 != null && (abstractC19486711LtLJIILLIIL = zoomService6.LJIILLIIL(iIntValue, false)) != null) {
                                c921520a5W.LLJJJJJIL.LIZ(abstractC19486711LtLJIILLIIL.LJIILL().LJII(new C987100bnI(c916290Zx5, 12)).LJIILL().LJIIZILJ());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    c916290Zx5.invoke();
                }
            }, null);
        }
    }

    public final void LJLI(long j, String str, String str2) {
        int i;
        int i2;
        Object objGg0;
        LinkPlayerInfo linkPlayerInfoLJIIIZ;
        long jLongValue;
        int iIntValue;
        int i3;
        boolean z;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        AbstractC928510aGn abstractC928510aGnLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        InterfaceC302401Fe interfaceC302401Fe;
        User user = null;
        C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.MULTI_GUEST_START, null);
        if (C917810ZzX.LJIIIIZZ() && LiveSdkMultiAddFetchUserListForChMgOptSetting.isEnable() && (interfaceC302401Fe = this.userManager) != null) {
            interfaceC302401Fe.LJJIJ("fetch_on_anchor_accept_audience", 1, null, null);
        }
        this.LLJJJ = false;
        C919310a1x.LIZ("MultiGuestV3AnchorPresenter", "permit apply from guest succ");
        C20632086k.LIZ.LIZLLL(j, str);
        InterfaceC302401Fe interfaceC302401Fe2 = this.userManager;
        if (interfaceC302401Fe2 != null) {
            interfaceC302401Fe2.LJIJJ(j, "guest_apply_anchor");
        }
        InterfaceC302401Fe interfaceC302401Fe3 = this.userManager;
        if (interfaceC302401Fe3 != null) {
            interfaceC302401Fe3.LJIIIZ(j, "anchor");
        }
        MultiGuestDataHolder multiGuestDataHolder = getMultiGuestDataHolder();
        if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder.LIZIZ()) != null) {
            i = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
        } else {
            i = -1;
        }
        MultiGuestDataHolder multiGuestDataHolder2 = getMultiGuestDataHolder();
        if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder2.LIZIZ()) != null) {
            i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
        } else {
            i2 = -1;
        }
        EnumC918970a1P enumC918970a1PLJFF = C917140ZyS.LJFF(i, i2);
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC921460a5Q.Zh(j, false);
        }
        if (MultiGuestAnchorPermitLimitOptSetting.INSTANCE.enable()) {
            this.LLJJJJ.remove(str);
        }
        String strValueOf = String.valueOf(j);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C956880b0Y.class);
        } else {
            objGg0 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(strValueOf, objGg0);
        List listLIZJ = C932140aMe.LIZJ(j);
        InterfaceC302401Fe interfaceC302401Fe4 = this.userManager;
        if (interfaceC302401Fe4 != null && (abstractC928510aGnLIZ = interfaceC302401Fe4.LIZ()) != null) {
            linkPlayerInfoLJIIIZ = C921170a4x.LJIIIZ(abstractC928510aGnLIZ, j);
        } else {
            linkPlayerInfoLJIIIZ = null;
        }
        String strLJIILLIIL = C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ());
        Gson gson = C19748512Ol.LIZJ;
        String json = GsonProtectorUtils.toJson(gson, C932140aMe.LIZLLL(j));
        String json2 = GsonProtectorUtils.toJson(gson, listLIZJ);
        int size = listLIZJ.size();
        C930480aJy.LIZ.getClass();
        int iLJIIJJI = C930480aJy.LJIIJJI(linkPlayerInfoLJIIIZ);
        Long l = (Long) C925640aCA.LJI().get(Long.valueOf(j));
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        Integer num = (Integer) C925640aCA.LJII().get(Long.valueOf(j));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C924810aAp c924810aAp = (C924810aAp) this.LLJILJILJ.getValue();
        if (c924810aAp != null && (multiLiveAnchorPanelSettings = c924810aAp.LJJIII) != null) {
            i3 = multiLiveAnchorPanelSettings.applierSortSetting;
        } else {
            i3 = 0;
        }
        Map<String, String> mapLIZ = C930160aJS.LIZ(String.valueOf(j));
        if (linkPlayerInfoLJIIIZ != null && linkPlayerInfoLJIIIZ.linkUserType == 1) {
            z = true;
        } else {
            z = false;
        }
        C925600aC6.LJIIL(j, enumC918970a1PLJFF, zLJFF, str, strLJIILLIIL, json, json2, size, iLJIIJJI, jLongValue, iIntValue, i3, str2, mapLIZ, z, false, false, false, false, this.LLJI, this.dataChannel);
        C921920a6A.LJ(j, C921640a5i.LJI(j), str);
        if (zLJFF) {
            C921920a6A.LIZLLL(j);
        }
        C924630aAX.LJJJJJ(true);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.LC0(AnchorPermitGuestSuccessEvent.class, new C921610a5f(j));
        }
        C919640a2U c919640a2U = this.LLJLLL;
        if (c919640a2U != null) {
            if (linkPlayerInfoLJIIIZ != null) {
                user = linkPlayerInfoLJIIIZ.mUser;
            }
            String strLIZ = C0KVU.LIZ(user);
            Iterator it2 = ((LinkedHashMap) c919640a2U.LIZ).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (System.currentTimeMillis() - ((Number) entry.getValue()).longValue() > 10000) {
                    it2.remove();
                } else if (((Number) entry.getKey()).longValue() == j) {
                    C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131854579, strLIZ));
                    it2.remove();
                }
            }
        }
    }

    public final void LJLJL(String str, String str2, Map<String, String> map) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            InterfaceC302401Fe interfaceC302401Fe = this.userManager;
            if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                abstractC928510aGnLIZ.LJIJJLI();
            }
            interfaceC921460a5Q.OU0(str, str2, map);
        }
    }

    public final void LJLL(final EnumC921570a5b enumC921570a5b, Cert cert, final Runnable runnable) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && C917810ZzX.LJIIJ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C921520a5W.class.getSimpleName());
        sbLIZ.append("_trulyTurnOff source:");
        sbLIZ.append(enumC921570a5b);
        C20441214yg.LIZIZ("perception", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mView == 0) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C956900b0a.class, enumC921570a5b);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(MultiGuestEndEvent.class);
        }
        if (enumC921570a5b == EnumC921570a5b.USER_CLICK) {
            InterfaceC1104970erP.I2.LJFF(Boolean.FALSE);
        }
        String str = enumC921570a5b.value;
        C924810aAp.LJ().LJIIJJI(false);
        C924810aAp.LJ().LJII();
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
            interfaceC937900aVwLLIIJLIL.LLILII(null);
        }
        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
        if (interfaceC921460a5Q != null) {
            interfaceC921460a5Q.ul();
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.LLIIL(cert, str);
        }
        C920360a3e.LIZ.getClass();
        C920360a3e.LIZJ();
        if (!MultiGuestSdkRtcInitErrorLinkOptSetting.INSTANCE.isOpt() || enumC921570a5b != EnumC921570a5b.RTC_ERROR) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("finishServer, source=");
            sbLIZ2.append(enumC921570a5b);
            C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LLILZIL) {
                C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", "finishServer, isFinishingServer = true");
            } else {
                this.LLILZIL = true;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("roomId:");
                sbLIZ3.append(this.LL.getId());
                C944240agA.LJFF("LinkIn_finish", C2188811AlT.LIZIZ(sbLIZ3));
                final EnumC918970a1P enumC918970a1PLJIILIIL = C917520Zz4.LJIILIIL();
                String str2 = enumC921570a5b.value;
                if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                    JSONObject jSONObject = new JSONObject();
                    C0K04.LJFF("request_source", str2, jSONObject);
                    C924630aAX.LIZ.LJJJLIIL(0, "finish_request", jSONObject, true);
                    C924630aAX.LJ = System.currentTimeMillis();
                }
                InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL3 == null) {
                    C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", "finishServer, linkMicSession = null");
                }
                if (LinkmicModeSwitchDiposeSetting.INSTANCE.isEnable() && enumC921570a5b == EnumC921570a5b.INTERRUPT_BY_CO_HOST) {
                    C1AZW.LJIIJ(12, logTAG(3558), "dispose session immediately from mode switch", null, null);
                    InterfaceC954180awC interfaceC954180awCLLJLL4 = C915980Zwa.LJIIIIZZ().LLJLL();
                    if (interfaceC954180awCLLJLL4 != null) {
                        interfaceC954180awCLLJLL4.LJLJI(enumC921570a5b.value, EnumC965730bEp.INNER);
                    }
                }
                if (interfaceC954180awCLLJLL3 != null) {
                    interfaceC954180awCLLJLL3.LLJJJ(new C963720bBa(enumC921570a5b.finishReason, EnumC965730bEp.INNER), new InterfaceC920680a4A<DestroyChannelResult>() { // from class: X.0a5Y
                        @Override // X.InterfaceC920680a4A
                        public final void onSuccess(DestroyChannelResult destroyChannelResult) {
                            boolean z;
                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
                            boolean z2;
                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
                            Runnable runnable2;
                            DataChannel dataChannel3;
                            DataChannel dataChannel4;
                            boolean z3;
                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ3;
                            boolean z4;
                            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ4;
                            C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", "finishServer, onSuccess");
                            if (enumC921570a5b.finishReason == 10001) {
                                C766270U4b.LIZLLL(2131843590);
                            }
                            C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", "destroy channel succ");
                            C944240agA.LJ("LinkIn_finish_Success");
                            EnumC921570a5b enumC921570a5b2 = enumC921570a5b;
                            if (enumC921570a5b2 == EnumC921570a5b.USER_CLICK) {
                                if (C925150aBN.LJJIII()) {
                                    EnumC918790a17 enumC918790a17 = EnumC918790a17.CLOSE_MODE;
                                    MultiGuestDataHolder multiGuestDataHolder = this.getMultiGuestDataHolder();
                                    if (multiGuestDataHolder != null && (multiLiveAnchorPanelSettingsLIZIZ4 = multiGuestDataHolder.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ4.allowRequestFromOthers == 3) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    C917300Zyi.LIZ(enumC918790a17, z4, false);
                                } else {
                                    EnumC918790a17 enumC918790a172 = EnumC918790a17.CLOSE_MODE;
                                    MultiGuestDataHolder multiGuestDataHolder2 = this.getMultiGuestDataHolder();
                                    if (multiGuestDataHolder2 != null && (multiLiveAnchorPanelSettingsLIZIZ3 = multiGuestDataHolder2.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ3.allowViewerReq == 3) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    C917300Zyi.LIZ(enumC918790a172, z3, false);
                                }
                                C925640aCA.LJIIJ("manual_close", enumC918970a1PLJIILIIL);
                            } else if (enumC921570a5b2 == EnumC921570a5b.INTERRUPT_BY_CO_HOST) {
                                if (C925150aBN.LJJIII()) {
                                    EnumC918790a17 enumC918790a173 = EnumC918790a17.CLOSE_MODE;
                                    C917310Zyj.LIZ(enumC918790a173);
                                    C917320Zyk.LIZIZ(enumC918790a173);
                                    MultiGuestDataHolder multiGuestDataHolder3 = this.getMultiGuestDataHolder();
                                    if (multiGuestDataHolder3 != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder3.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ2.allowRequestFromOthers == 3) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    C917300Zyi.LIZ(enumC918790a173, z2, false);
                                } else {
                                    EnumC918790a17 enumC918790a174 = EnumC918790a17.CLOSE_MODE;
                                    MultiGuestDataHolder multiGuestDataHolder4 = this.getMultiGuestDataHolder();
                                    if (multiGuestDataHolder4 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder4.LIZIZ()) != null && multiLiveAnchorPanelSettingsLIZIZ.allowViewerReq == 3) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    C917300Zyi.LIZ(enumC918790a174, z, false);
                                }
                                C925640aCA.LJIIJ("accept_anchor_invite", enumC918970a1PLJIILIIL);
                            }
                            C921520a5W c921520a5W = this;
                            c921520a5W.LLILZIL = false;
                            InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) c921520a5W.mView;
                            if (interfaceC921460a5Q2 != null) {
                                interfaceC921460a5Q2.Ul2();
                            }
                            C924790aAn.LIZLLL().LJII(0);
                            DataChannel dataChannel5 = this.LLILZ;
                            if (dataChannel5 != null) {
                                dataChannel5.LC0(InteractStateChangeEvent.class, new C924400aAA(8));
                            }
                            DataChannel dataChannel6 = this.LLILZ;
                            if (dataChannel6 != null) {
                                dataChannel6.FQ2(MultiGuestV3AnchorDestroyChannel.class);
                            }
                            MultiGuestDataHolder multiGuestDataHolder5 = this.getMultiGuestDataHolder();
                            if (multiGuestDataHolder5 != null) {
                                multiGuestDataHolder5.LJIL("destroy_channel");
                            }
                            if (C924810aAp.LJ().LJJJJJ && (dataChannel4 = this.LLILZ) != null) {
                                dataChannel4.LC0(MuteMicViewStateChangeEvent.class, Boolean.TRUE);
                            }
                            if (MultiGuestFetchAnchorActivityInfoSetting.INSTANCE.isEnable() && (dataChannel3 = this.LLILZ) != null) {
                                dataChannel3.zW(AnchorActivityBannerChannel.class, new C922290a6l(false, "", ""));
                            }
                            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                            C307001Gy.LIZ().getClass();
                            C921920a6A.LJII(C927600aFK.LJII(), this.LLILZ);
                            if (LiveSdkCoHostStopMultiGuestOptSetting.isEnable() && (runnable2 = runnable) != null) {
                                runnable2.run();
                            }
                            String str3 = enumC921570a5b.value;
                            if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                                JSONObject jSONObject2 = new JSONObject();
                                C0K04.LJFF("request_source", str3, jSONObject2);
                                C0K04.LJ("cost", System.currentTimeMillis() - C924630aAX.LJ, jSONObject2);
                                C924630aAX.LIZ.LJJJLIIL(0, "finish_succeed", jSONObject2, true);
                            }
                        }

                        @Override // X.InterfaceC920680a4A
                        public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                            String message;
                            String message2;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("finishServer, onFail, error=");
                            sbLIZ4.append(linkCoreError);
                            sbLIZ4.append(", throwable = ");
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ4.append(message);
                            C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ4));
                            String strLogTAG = this.logTAG(1738);
                            if (th != null) {
                                message2 = th.getMessage();
                            } else {
                                message2 = null;
                            }
                            C1AZW.LJFF(strLogTAG, "destroy channel failed", message2, null);
                            if (th != null) {
                                this.logThrowable(th);
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("mUnrecoverableErrorHappened:");
                            sbLIZ5.append(this.LLIZ);
                            sbLIZ5.append("; throwable:");
                            sbLIZ5.append(th);
                            C944240agA.LJFF("LinkIn_finish_Failed", C2188811AlT.LIZIZ(sbLIZ5));
                            C921520a5W c921520a5W = this;
                            c921520a5W.LLILZIL = false;
                            if (!c921520a5W.LLIZ) {
                                InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) c921520a5W.mView;
                                if (interfaceC921460a5Q2 != null) {
                                    interfaceC921460a5Q2.FE0(th);
                                }
                            } else {
                                InterfaceC921460a5Q interfaceC921460a5Q3 = (InterfaceC921460a5Q) c921520a5W.mView;
                                if (interfaceC921460a5Q3 != null) {
                                    interfaceC921460a5Q3.Ul2();
                                }
                                C924790aAn.LIZLLL().LJII(0);
                                DataChannel dataChannel3 = this.LLILZ;
                                if (dataChannel3 != null) {
                                    dataChannel3.LC0(InteractStateChangeEvent.class, new C924400aAA(8));
                                }
                                DataChannel dataChannel4 = this.LLILZ;
                                if (dataChannel4 != null) {
                                    dataChannel4.FQ2(MultiGuestV3AnchorDestroyChannel.class);
                                }
                            }
                            String str3 = enumC921570a5b.value;
                            if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                                JSONObject jSONObject2 = new JSONObject();
                                C0K04.LJFF("request_source", str3, jSONObject2);
                                C0K04.LJ("cost", System.currentTimeMillis() - C924630aAX.LJ, jSONObject2);
                                C924630aAX c924630aAX = C924630aAX.LIZ;
                                C944730agx.LJIIL(th, jSONObject2);
                                c924630aAX.LJJJLIIL(1, "finish_failed", jSONObject2, true);
                            }
                        }
                    });
                }
            }
        }
        C924810aAp.LJ().LJIIIIZZ = false;
    }

    @Override // X.AbstractC921450a5P, X.InterfaceC919200a1m
    public final void LJIIIZ(final long j, String str, final String str2, final LinkPlayerInfo linkPlayerInfo) {
        List listLJJIII;
        AbstractC928510aGn abstractC928510aGnLIZ;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        final LinkPlayerInfo linkPlayerInfo2;
        if (this.mView == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("roomId:");
        sbLIZ.append(this.LL.getId());
        sbLIZ.append("; userId:");
        sbLIZ.append(j);
        sbLIZ.append("; secUserId:");
        sbLIZ.append(str);
        C944240agA.LJFF("LinkIn_kickOut", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveSdkAnchorConnectionOverLeaveRoomCacheDataSetting.INSTANCE.isEnable()) {
            this.dataChannel.SX0(C749290TaJ.class, C917810ZzX.LIZLLL());
        }
        if (linkPlayerInfo != null) {
            C924630aAX.LJJIIJZLJL(linkPlayerInfo.mUser.getId(), str2, linkPlayerInfo.mInteractIdStr);
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LLIIIL(new C920420a3k(AbstractC921450a5P.LJJJJZI(str2), this.LL.getId(), linkPlayerInfo.mUser.getId(), linkPlayerInfo.mInteractIdStr), new InterfaceC920680a4A<KickOutResult>() { // from class: X.0a1p
                    @Override // X.InterfaceC920680a4A
                    public final void onSuccess(KickOutResult kickOutResult) {
                        long followStatus;
                        if (Intrinsics.LJFF(str2, "kickout_with_popup_confirm")) {
                            this.LLILZ.FQ2(GuestKickOutConditionTriggerEvent.class);
                            this.LLILZ.FQ2(MultiGuestManageGuestOperationEvent.class);
                        }
                        C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", "kick out succ");
                        C944240agA.LJ("LinkIn_kickOut_Success");
                        C921520a5W c921520a5W = this;
                        c921520a5W.getClass();
                        LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo;
                        linkPlayerInfo3.LIZLLL = true;
                        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                        if (interfaceC921460a5Q != null) {
                            interfaceC921460a5Q.vP1(linkPlayerInfo3.mUser.getId());
                        }
                        User user = linkPlayerInfo.mUser;
                        if (user != null) {
                            followStatus = user.getFollowInfo().getFollowStatus();
                        } else {
                            followStatus = -1;
                        }
                        long id = linkPlayerInfo.mUser.getId();
                        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                        C307001Gy.LIZ().getClass();
                        C921920a6A.LIZ(id, followStatus, C927600aFK.LJII(), null);
                        C924630aAX.LJJIIZ(linkPlayerInfo.mUser.getId(), str2, linkPlayerInfo.mInteractIdStr);
                    }

                    @Override // X.InterfaceC920680a4A
                    public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                        String message;
                        Boolean boolValueOf;
                        String strLogTAG = this.logTAG(1623);
                        Context context = null;
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        C1AZW.LJFF(strLogTAG, "kick out failed", message, null);
                        if (th != null) {
                            this.logThrowable(th);
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("LinkIn_kickOut_Failed, throwable:");
                        sbLIZ2.append(th);
                        C944240agA.LJFF("legolas", C2188811AlT.LIZIZ(sbLIZ2));
                        C921520a5W c921520a5W = this;
                        c921520a5W.getClass();
                        InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                        if (interfaceC921460a5Q != null) {
                            interfaceC921460a5Q.Aw2(th);
                        }
                        InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) this.mView;
                        if (interfaceC921460a5Q2 != null) {
                            boolValueOf = Boolean.valueOf(interfaceC921460a5Q2.isViewValid());
                        } else {
                            boolValueOf = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf)) {
                            InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
                            if (interfaceC919320a1y != null) {
                                context = interfaceC919320a1y.getContext();
                            }
                            C501540Jlg.LIZLLL(context, th, 2131853456);
                        }
                        C924630aAX.LJJIIJ(th, str2, linkPlayerInfo.mInteractIdStr, linkPlayerInfo.mUser.getId());
                    }
                });
                return;
            }
            return;
        }
        InterfaceC302401Fe interfaceC302401Fe = this.userManager;
        if (interfaceC302401Fe != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo2 = (LinkPlayerInfo) abstractC928510aGnLIZ2.LJIILIIL(j)) != null) {
            C924630aAX.LJJIIJZLJL(j, str2, linkPlayerInfo2.mInteractIdStr);
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 == null) {
                return;
            }
            interfaceC954180awCLLJLL2.LLIIIL(new C920420a3k(AbstractC921450a5P.LJJJJZI(str2), this.LL.getId(), j, linkPlayerInfo2.mInteractIdStr), new InterfaceC920680a4A<KickOutResult>() { // from class: X.0a1q
                @Override // X.InterfaceC920680a4A
                public final void onSuccess(KickOutResult kickOutResult) {
                    long followStatus;
                    C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", "kick out succ");
                    C944240agA.LJ("LinkIn_kickOut_Success");
                    if (Intrinsics.LJFF(str2, "kickout_with_popup_confirm")) {
                        this.LLILZ.FQ2(GuestKickOutConditionTriggerEvent.class);
                        this.LLILZ.FQ2(MultiGuestManageGuestOperationEvent.class);
                    }
                    C921520a5W c921520a5W = this;
                    c921520a5W.getClass();
                    linkPlayerInfo2.LIZLLL = true;
                    InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                    if (interfaceC921460a5Q != null) {
                        interfaceC921460a5Q.vP1(j);
                    }
                    User user = linkPlayerInfo2.mUser;
                    if (user != null) {
                        followStatus = user.getFollowInfo().getFollowStatus();
                    } else {
                        followStatus = -1;
                    }
                    long j2 = j;
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    C921920a6A.LIZ(j2, followStatus, C927600aFK.LJII(), this.dataChannel);
                    C924630aAX.LJJIIZ(j, str2, linkPlayerInfo2.mInteractIdStr);
                }

                @Override // X.InterfaceC920680a4A
                public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                    String message;
                    Boolean boolValueOf;
                    String strLogTAG = this.logTAG(1623);
                    Context context = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    C1AZW.LJFF(strLogTAG, "kick out failed", message, null);
                    if (th != null) {
                        this.logThrowable(th);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("LinkIn_kickOut_Failed, throwable:");
                    sbLIZ2.append(th);
                    C944240agA.LJFF("legolas", C2188811AlT.LIZIZ(sbLIZ2));
                    C921520a5W c921520a5W = this;
                    c921520a5W.getClass();
                    InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                    if (interfaceC921460a5Q != null) {
                        interfaceC921460a5Q.Aw2(th);
                    }
                    InterfaceC921460a5Q interfaceC921460a5Q2 = (InterfaceC921460a5Q) this.mView;
                    if (interfaceC921460a5Q2 != null) {
                        boolValueOf = Boolean.valueOf(interfaceC921460a5Q2.isViewValid());
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
                        if (interfaceC919320a1y != null) {
                            context = interfaceC919320a1y.getContext();
                        }
                        C501540Jlg.LIZLLL(context, th, 2131853456);
                    }
                    C924630aAX.LJJIIJ(th, str2, linkPlayerInfo2.mInteractIdStr, j);
                }
            });
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("kick_out_failed, target user is null for uid:");
        sbLIZ2.append(j);
        sbLIZ2.append("， allLinkedUser:");
        InterfaceC302401Fe interfaceC302401Fe2 = this.userManager;
        if (interfaceC302401Fe2 != null && (abstractC928510aGnLIZ = interfaceC302401Fe2.LIZ()) != null) {
            listLJJIII = abstractC928510aGnLIZ.LJJIII();
        } else {
            listLJJIII = null;
        }
        sbLIZ2.append(listLJJIII);
        C20441214yg.LJ("legolas", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJJLIIIJJI(final int i, final int i2, final InterfaceC920680a4A interfaceC920680a4A, final String str) {
        Boolean boolValueOf;
        String strLJIILIIL;
        Integer numLJIILJJIL;
        AbstractC19486711Lt abstractC19486711LtLJIILLIIL;
        if (LiveAbLabelSetting.INSTANCE.getBooleanValue("multi_guest_skip_enlarge_check_in_change_layout")) {
            InterfaceC927510aFB zoomService = getZoomService();
            if (zoomService != null) {
                boolValueOf = Boolean.valueOf(zoomService.LJIIIIZZ());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                InterfaceC920110a3F interfaceC920110a3F = new InterfaceC920110a3F() { // from class: X.0ZxB
                    @Override // X.InterfaceC920110a3F
                    public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                    }

                    @Override // X.InterfaceC920110a3F
                    public final void LIZJ(String str2) {
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL != null) {
                            int i3 = i;
                            String str3 = str;
                            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                            bizChangeLayoutParams.displayId = i2;
                            interfaceC954180awCLLJLL.LLFF(new C920450a3n(i3, str3, bizChangeLayoutParams), interfaceC920680a4A);
                        }
                    }

                    @Override // X.InterfaceC920110a3F
                    public final void LIZ(int i3, String str2, String str3, Throwable th) {
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL != null) {
                            int i4 = i;
                            String str4 = str;
                            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                            bizChangeLayoutParams.displayId = i2;
                            interfaceC954180awCLLJLL.LLFF(new C920450a3n(i4, str4, bizChangeLayoutParams), interfaceC920680a4A);
                        }
                    }
                };
                C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                boolean zLIZJ = C930540aK4.LIZJ();
                c918060Zzw.getClass();
                if (C918060Zzw.LIZ(zLIZJ)) {
                    InterfaceC927510aFB zoomService2 = getZoomService();
                    if (zoomService2 != null) {
                        zoomService2.LJIIJJI(interfaceC920110a3F, str);
                        return;
                    }
                    return;
                }
                InterfaceC927510aFB zoomService3 = getZoomService();
                if (zoomService3 != null && (strLJIILIIL = zoomService3.LJIILIIL()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("restoreZoom in zoom ");
                    sbLIZ.append(strLJIILIIL);
                    C20441214yg.LIZIZ("MultiGuestV3AnchorPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC927510aFB zoomService4 = getZoomService();
                    if (zoomService4 != null) {
                        zoomService4.LJI(strLJIILIIL, interfaceC920110a3F, false, false, true, true, EnumC919910a2v.FROM_HOST_ZOOM_SELF, null);
                    }
                    InterfaceC927510aFB zoomService5 = getZoomService();
                    if (zoomService5 != null && (numLJIILJJIL = zoomService5.LJIILJJIL()) != null) {
                        int iIntValue = numLJIILJJIL.intValue();
                        InterfaceC927510aFB zoomService6 = getZoomService();
                        if (zoomService6 != null && (abstractC19486711LtLJIILLIIL = zoomService6.LJIILLIIL(iIntValue, false)) != null) {
                            abstractC19486711LtLJIILLIIL.LJIILL().LJII(new InterfaceC781210Ukh() { // from class: X.0ZxC
                                @Override // X.InterfaceC781210Ukh
                                public final void run() {
                                    InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                                    if (interfaceC954180awCLLJLL != null) {
                                        int i3 = i;
                                        String str2 = str;
                                        BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
                                        bizChangeLayoutParams.displayId = i2;
                                        interfaceC954180awCLLJLL.LLFF(new C920450a3n(i3, str2, bizChangeLayoutParams), interfaceC920680a4A);
                                    }
                                }
                            }).LJIILL().LJIIZILJ();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            BizChangeLayoutParams bizChangeLayoutParams = new BizChangeLayoutParams();
            bizChangeLayoutParams.displayId = i2;
            interfaceC954180awCLLJLL.LLFF(new C920450a3n(i, str, bizChangeLayoutParams), interfaceC920680a4A);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL(java.lang.Throwable r19, long r20, int r22, java.lang.String r23, java.lang.String r24, X.InterfaceC923280a8M r25, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r26) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C921520a5W.LJL(java.lang.Throwable, long, int, java.lang.String, java.lang.String, X.0a8M, com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo):void");
    }

    @Override // X.AbstractC921450a5P, X.InterfaceC919200a1m
    public final void LJIJI(long j, final String str, int i, boolean z, String str2, String str3, InterfaceC923280a8M interfaceC923280a8M, LinkPlayerInfo linkPlayerInfo, Integer num, Function1 function1) {
        if (this.mView == 0) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (i == 2) {
            LJLILLLLZI(this, j, str, 2, str2, null, null, null, null, null, function1, 496);
            return;
        }
        if (z) {
            if (this.LLJJJJ.containsKey(str)) {
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) this.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.of0(j, new Throwable("Current user is permitting"));
                }
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
            this.LLJJJJ.put(str, Boolean.TRUE);
            if (!MultiGuestAnchorPermitLimitOptSetting.INSTANCE.enable()) {
                C19487311Lz.LIZIZ(C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(5L).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LLJJJJJIL, new C09JN() { // from class: X.0N7P
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MultiGuestV3AnchorPresenter@b85a.permitCountDown$1");
                        if (((long) 5) - ((Number) obj).longValue() == 1) {
                            this.LL.LLJJJJ.remove(str);
                            this.LL.getClass();
                        }
                        C1C7U.LIZIZ("MultiGuestV3AnchorPresenter@b85a.permitCountDown$1");
                    }
                }, null, null, null, 60);
            }
        }
        this.LLJJJ = true;
        C20632086k.LIZ.LIZLLL(j, str);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(MultiGuestAnchorInProgressEvent.class);
        }
        C924810aAp c924810aAp = (C924810aAp) this.LLJILJILJ.getValue();
        if (c924810aAp != null) {
            c924810aAp.LJIIIIZZ(j);
        }
        if (this.mView != 0) {
            C924810aAp.LJ().LJJIIZI = true;
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            System.currentTimeMillis();
            c924810aApLJ.getClass();
        }
        LJLILLLLZI(this, j, str, i, str2, null, str3, interfaceC923280a8M, linkPlayerInfo, num, function1, 16);
    }

    public static void LJLILLLLZI(final C921520a5W c921520a5W, final long j, final String str, final int i, String str2, Boolean bool, String str3, InterfaceC923280a8M interfaceC923280a8M, LinkPlayerInfo linkPlayerInfo, Integer num, Function1 function1, int i2) {
        int i3;
        boolean zBooleanValue;
        int iIntValue;
        long jLongValue;
        String str4;
        final String str5 = str2;
        final Function1 function12 = function1;
        String strLIZLLL = str3;
        final InterfaceC923280a8M interfaceC923280a8M2 = interfaceC923280a8M;
        final LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
        if ((i2 & 8) != 0) {
            str5 = null;
        }
        if ((i2 & 16) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i2 & 32) != 0) {
            strLIZLLL = null;
        }
        if ((i2 & 64) != 0) {
            interfaceC923280a8M2 = null;
        }
        if ((i2 & 128) != 0) {
            linkPlayerInfo2 = null;
        }
        if ((i2 & 256) != 0) {
            num = null;
        }
        if ((i2 & 512) != 0) {
            function12 = null;
        }
        c921520a5W.getClass();
        if (i != 1) {
            if (i != 2) {
                i3 = 0;
            } else {
                i3 = 2;
            }
        } else {
            i3 = 1;
        }
        if (strLIZLLL == null) {
            strLIZLLL = C925150aBN.LIZLLL();
        }
        if (!C931790aM5.LIZIZ() && strLIZLLL == null) {
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (C917810ZzX.LJIIIIZZ() && i3 == 1) {
            C917810ZzX.LIZ.getClass();
            if (C917810ZzX.LJFF() == LinkMicCoHostMaxGuestCountSetting.INSTANCE.getValue()) {
                C766270U4b.LIZLLL(2131851854);
                c921520a5W.LLJJJJ.remove(str);
                if (function12 == null) {
                    return;
                }
                function12.invoke(Boolean.FALSE);
                return;
            }
        }
        if (C917810ZzX.LJIIIIZZ() && i3 == 1) {
            C917810ZzX.LIZ.getClass();
            if (!C917810ZzX.LIZIZ()) {
                C766270U4b.LIZLLL(2131851851);
                c921520a5W.LLJJJJ.remove(str);
                InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
                if (interfaceC921460a5Q != null) {
                    interfaceC921460a5Q.AF();
                }
                if (function12 == null) {
                    return;
                }
                function12.invoke(Boolean.FALSE);
                return;
            }
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        BizPermitParams bizPermitParams = new BizPermitParams(1800L, zBooleanValue, iIntValue);
        c921520a5W.LJJLIIIJL().LIZIZ(String.valueOf(j));
        Long lValueOf = Long.valueOf(j);
        if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
            JSONObject jSONObject = new JSONObject();
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            C0K04.LJ("guest_user_id", jLongValue, jSONObject);
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            C0K04.LJFF("guest_linkmic_id", str4, jSONObject);
            C924630aAX c924630aAX = C924630aAX.LIZ;
            C0K04.LJFF("live_type", C924630aAX.LJIIZILJ(), jSONObject);
            C924630aAX.LJIILL(lValueOf, str, jSONObject);
            c924630aAX.LJJJLIIL(0, "permit_request", jSONObject, true);
            C924630aAX.LIZJ = System.currentTimeMillis();
            C969360bKg c969360bKgLJIILLIIL = C924630aAX.LJIILLIIL();
            c969360bKgLJIILLIIL.LIZIZ(jSONObject);
            c969360bKgLJIILLIIL.LIZJ(str, "permit_request", null, null);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL == null) {
            return;
        }
        interfaceC954180awCLLJLL.LJJJJZ(new C920410a3j(c921520a5W.LL.getId(), j, strLIZLLL, str, i3, bizPermitParams, 64), new InterfaceC920680a4A<PermitResult>() { // from class: X.0a5X
            @Override // X.InterfaceC920680a4A
            public final void onSuccess(PermitResult permitResult) {
                InterfaceC923280a8M interfaceC923280a8M3;
                LinkPlayerInfo linkPlayerInfo3;
                InterfaceC921460a5Q interfaceC921460a5Q2;
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2EZ0;
                PermitResult permitResult2 = permitResult;
                Function1<Boolean, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(Boolean.TRUE);
                }
                int i4 = i;
                if (i4 == 2) {
                    C919310a1x.LIZ("MultiGuestV3AnchorPresenter", "reject apply from guest succ");
                    c921520a5W.LJLIIL(j);
                    long j2 = j;
                    String str6 = str;
                    if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                        JSONObject jSONObject2 = new JSONObject();
                        C0K04.LJ("guest_user_id", j2, jSONObject2);
                        C0K04.LJFF("guest_linkmic_id", str6, jSONObject2);
                        C0K04.LJ("cost", System.currentTimeMillis() - C924630aAX.LIZJ, jSONObject2);
                        C924630aAX.LJIILL(Long.valueOf(j2), str6, jSONObject2);
                        C969360bKg c969360bKgLJIILLIIL2 = C924630aAX.LJIILLIIL();
                        c969360bKgLJIILLIIL2.LIZJ(str6, "reject_apply_success", jSONObject2, null);
                        c969360bKgLJIILLIIL2.LIZ(1, str6);
                        return;
                    }
                    return;
                }
                if (i4 != 1) {
                    return;
                }
                C924810aAp.LJ().LJIIJJI(true);
                C919310a1x.LIZ("MultiGuestV3AnchorPresenter", "permit apply from guest succ");
                c921520a5W.LJLI(j, str, str5);
                C766270U4b.LIZLLL(2131843423);
                long j3 = j;
                String string = permitResult2.toString();
                String str7 = str;
                if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                    JSONObject jSONObject3 = new JSONObject();
                    C0K04.LJFF("response", string, jSONObject3);
                    C0K04.LJ("guest_user_id", j3, jSONObject3);
                    C0K04.LJFF("guest_linkmic_id", str7, jSONObject3);
                    C0K04.LJ("cost", System.currentTimeMillis() - C924630aAX.LIZJ, jSONObject3);
                    C924630aAX c924630aAX2 = C924630aAX.LIZ;
                    C924630aAX.LJIILL(Long.valueOf(j3), str7, jSONObject3);
                    c924630aAX2.LJJJLIIL(0, "permit_succeed", jSONObject3, true);
                    C924630aAX.LJIILLIIL().LIZJ(str7, "permit_succeed", null, null);
                }
                if (!C924990aB7.LIZIZ() || (interfaceC923280a8M3 = interfaceC923280a8M2) == null || (linkPlayerInfo3 = linkPlayerInfo2) == null || (interfaceC921460a5Q2 = (InterfaceC921460a5Q) c921520a5W.mView) == null || (multiLiveAsAnchorListDialogV2EZ0 = interfaceC921460a5Q2.eZ0()) == null) {
                    return;
                }
                interfaceC923280a8M3.LIZJ(linkPlayerInfo3, multiLiveAsAnchorListDialogV2EZ0, "accept", null);
            }

            @Override // X.InterfaceC920680a4A
            public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                Function1<Boolean, Unit> function13 = function12;
                if (function13 != null) {
                    function13.invoke(Boolean.FALSE);
                }
                C1AZW c1azw = C1AZW.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("permit onFail, errorCode=");
                sbLIZ.append(linkCoreError.errorCode);
                sbLIZ.append(", ");
                sbLIZ.append(linkCoreError.errorMsg);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1azw.getClass();
                C1AZW.LIZ("MultiGuestV3AnchorPresenter", strLIZIZ, null, null);
                int i4 = i;
                if (i4 == 2) {
                    c921520a5W.LJLIIIL();
                    long j2 = j;
                    String str6 = str;
                    if (MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                        JSONObject jSONObject2 = new JSONObject();
                        C0K04.LJ("guest_user_id", j2, jSONObject2);
                        C944730agx.LJIIL(th, jSONObject2);
                        C0K04.LJFF("guest_linkmic_id", str6, jSONObject2);
                        C0K04.LJ("cost", System.currentTimeMillis() - C924630aAX.LIZJ, jSONObject2);
                        C924630aAX.LJIILL(Long.valueOf(j2), str6, jSONObject2);
                        C969360bKg c969360bKgLJIILLIIL2 = C924630aAX.LJIILLIIL();
                        c969360bKgLJIILLIIL2.LIZJ(str6, "reject_apply_fail", jSONObject2, null);
                        c969360bKgLJIILLIIL2.LIZ(2, str6);
                        return;
                    }
                    return;
                }
                if (i4 != 1) {
                    return;
                }
                c921520a5W.LJL(th, j, i4, str, str5, interfaceC923280a8M2, linkPlayerInfo2);
                long j3 = j;
                String str7 = str;
                if (!MultiGuestSlardarMonitorOptSetting.INSTANCE.isEnable()) {
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                C0K04.LJ("error_code", 105L, jSONObject3);
                C0K04.LJFF("code", "105", jSONObject3);
                C924630aAX c924630aAX2 = C924630aAX.LIZ;
                C944730agx.LJIIL(th, jSONObject3);
                C0K04.LJ("guest_user_id", j3, jSONObject3);
                C0K04.LJFF("guest_linkmic_id", str7, jSONObject3);
                C0K04.LJ("cost", System.currentTimeMillis() - C924630aAX.LIZJ, jSONObject3);
                C924630aAX.LJIILL(Long.valueOf(j3), str7, jSONObject3);
                C969360bKg c969360bKgLJIILLIIL3 = C924630aAX.LJIILLIIL();
                c969360bKgLJIILLIIL3.LIZJ(str7, "permit_failed", C00Y6.LIZ(jSONObject3), null);
                c969360bKgLJIILLIIL3.LIZ(2, str7);
                c924630aAX2.LJJJLIIL(1, "permit_failed", jSONObject3, true);
            }
        });
    }
}

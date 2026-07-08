package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor;

import X.AbstractC922600a7G;
import X.AbstractC928510aGn;
import X.C001A;
import X.C01EI;
import X.C01GW;
import X.C01IB;
import X.C01ZE;
import X.C0IJ7;
import X.C0IJT;
import X.C0TF9;
import X.C0UI0;
import X.C1161920gLG;
import X.C11JF;
import X.C11JL;
import X.C1304660k3U;
import X.C13IQ;
import X.C13LE;
import X.C1555540qa8;
import X.C1558360qeg;
import X.C19487111Lx;
import X.C19719912Dl;
import X.C19EG;
import X.C1AZW;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C306501Gt;
import X.C307001Gy;
import X.C356501Zz;
import X.C452070Ho5;
import X.C452501pT;
import X.C465900IOu;
import X.C472820IgS;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501440JlW;
import X.C501540Jlg;
import X.C724750Sbp;
import X.C737770Swp;
import X.C748880TZe;
import X.C758560TpG;
import X.C766270U4b;
import X.C776250Uch;
import X.C784440Upu;
import X.C784920Uqg;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.C915980Zwa;
import X.C917720ZzO;
import X.C917750ZzR;
import X.C917810ZzX;
import X.C919310a1x;
import X.C920350a3d;
import X.C921180a4y;
import X.C921520a5W;
import X.C921860a64;
import X.C921920a6A;
import X.C922130a6V;
import X.C924220a9s;
import X.C924620aAW;
import X.C924810aAp;
import X.C926770aDz;
import X.C927150aEb;
import X.C927250aEl;
import X.C927310aEr;
import X.C927330aEt;
import X.C927560aFG;
import X.C927600aFK;
import X.C927820aFg;
import X.C927960aFu;
import X.C930480aJy;
import X.C930540aK4;
import X.C931790aM5;
import X.C931800aM6;
import X.C933510aOr;
import X.C934690aQl;
import X.C934770aQt;
import X.C934880aR4;
import X.C935380aRs;
import X.C935400aRu;
import X.C936430aTZ;
import X.C938400aWk;
import X.C939000aXi;
import X.C939490aYV;
import X.C940900aam;
import X.C941500abk;
import X.C941700ac4;
import X.C942160aco;
import X.C944240agA;
import X.C946690ak7;
import X.C946803n0;
import X.C948450amx;
import X.C953230auf;
import X.C956790b0P;
import X.C956860b0W;
import X.C977650bY3;
import X.C977800bYI;
import X.C978390bZF;
import X.C986270blx;
import X.C987103tV;
import X.DialogInterfaceOnDismissListenerC987010bn9;
import X.EnumC1102740eno;
import X.EnumC1102750enp;
import X.EnumC918970a1P;
import X.EnumC921570a5b;
import X.EnumC943760afO;
import X.InterfaceC1097170eep;
import X.InterfaceC302401Fe;
import X.InterfaceC305301Gh;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC915240ZvO;
import X.InterfaceC921460a5Q;
import X.InterfaceC924740aAi;
import X.InterfaceC924830aAr;
import X.InterfaceC926960aEI;
import X.InterfaceC927340aEu;
import X.InterfaceC927720aFW;
import X.InterfaceC934710aQn;
import X.InterfaceC937900aVw;
import X.InterfaceC938530aWx;
import X.InterfaceC942030acb;
import X.InterfaceC947260al2;
import X.InterfaceC954180awC;
import X.InterfaceC963450bB9;
import X.InterfaceC980100bc0;
import X.InterfaceViewOnClickListenerC1102800enu;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.KaraokeYouSingRequestMessageEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestDismissManagerListDialogEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestIsLinkedAsAnchorForMicRoomChangeChannel;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.api.event.ShowPlaybookPlayToolPage;
import com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.linkroom.toolbarsheet.MultiGuestToolAndPlayFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.LinkerModeChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.component.fanticket.sei.TicketWriterHelper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.ApplyGuideManageMoreAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.GuidenceAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IApplyGuideManageMoreAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.MultiGuestGuidenceViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenListDialogWithPositionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorResumeSharedBgEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.opencamera.MultiLiveAnchorOpenCameraDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.InvokeGiftPanelEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MixModeStateChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAnchorSideShowGuidenceEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestHideGuideLinkMicEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestMemoryInfoChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveDialogBackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveOpenModeratorListEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.MultiGuestLayoutContainerTopView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.anchor.CountdownAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor.MultiLiveInviterShareHelper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.BigFlyingGiftPathWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.animation.AnimationManagerImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.anchor.GuestShowdownAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.widget.KaraokeAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.anchor.TopGuestGamePlayAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AigcAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestAnchorShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ShareRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.anchor.LetsDanceAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.ThemeAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.SharedBgAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor.AnchorTextHeaderWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.wallpaper.ShareBgSwitchLayoutController;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.AnchorQuickConnectAbilityImpl;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.IAnchorQuickConnectAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CoHostBeInvitedDialogShow;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.CoHostInProgressChanged;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.KickOutAllMultiGuestGuestsEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkMicSceneChangeChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestOpenWaitingDialog;
import com.bytedance.android.live.liveinteract.platform.core.message.LinkMessageCenter;
import com.bytedance.android.live.liveinteract.platform.statemanager.LinkStatusViewModel;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.dataChannel.MultiGuestShowLayoutSettingDialogEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ExitVWForCHGMGPopupCloseChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyGuideContinueSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixCameraTurnOn;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutRefactorMisMatchCheck;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLiveShowAnimTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookRevertSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownTimerPlayModeConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicUserManagerReservationFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkCloseDialogWhenDisableMultiSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestToastWithAppLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestKaraokePhaseTwoSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreApproveConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRecommendRoomAb;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSdkRtcInitErrorLinkOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlaybookNonMultiGuestConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestAnchorQuickConnectSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestGuidenceBugFixEnabledSettings;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.ShowMultiGuestAnchorListChannel;
import com.bytedance.android.livesdk.model.message.LinkLayoutMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.dataChannel.ForceCloseLinkEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestV3AnchorWidget extends BaseMultiGuestV3AnchorWidget implements InterfaceC927340aEu {
    public final FrameLayout LL;
    public C921520a5W LLILLJJLI;
    public MultiLiveAsAnchorListDialogV2 LLILLL;
    public Room LLILZ;
    public MultiLiveAnchorOpenCameraDialog LLILZIL;
    public C927330aEt LLILZLL;
    public LiveShowAnchorWidget LLIZ;
    public LetsDanceAnchorWidget LLIZLLLIL;
    public CountDownForAllV2AnchorWidget LLJ;
    public CountdownAnchorWidget LLJI;
    public TopGuestGamePlayAnchorWidget LLJIJIL;
    public GuestShowdownAnchorWidget LLJILJIL;
    public C306501Gt LLJILJILJ;
    public AnchorTextHeaderWidget LLJILLL;
    public AigcAnchorWidget LLJJ;
    public KaraokeAnchorWidget LLJJI;
    public C938400aWk LLJJIII;
    public final C927250aEl LLJJIJI;
    public LinkDialog LLJJIJIIJIL;
    public final AwS594S0100000_15 LLJJIJIL;
    public MultiGuestThemeViewModel LLJJJ;
    public MultiGuestSharedBgAnchorViewModel LLJJJIL;
    public MultiGuestGuidenceViewModel LLJJJJ;
    public MultiGuestAnchorQuickConnectViewModel LLJJJJJIL;
    public MultiGuestV3AnchorWidget$loadBigFlyingGiftWidget$1 LLJJJJLIIL;
    public MultiGuestAnchorShareRevenueViewModel LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C927310aEr LLJZ;
    public C941500abk LLJZIJLIL;
    public C933510aOr LLL;
    public MultiGuestLayoutContainerTopView LLLF;
    public ApplyGuideManageMoreAbilityImpl LLLFF;

    @InterfaceC947260al2(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void Aw2(Throwable th) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hsw;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, com.bytedance.android.live.liveinteract.api.LinkMicAnchorWidget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void AF() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C500260Jjc.LJJLIIIJL(multiLiveAsAnchorListDialogV2);
        }
    }

    public final boolean B1() {
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        return (room != null ? room.getOwnerUserId() : 0L) == UserService.getInstance().user().getCurrentUserId();
    }

    public final void C1() {
        CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget;
        FrameLayout frameLayout = this.LL;
        if (C924220a9s.LIZJ()) {
            C20441214yg.LIZIZ("CountDownForAllWrapper", "[createAnchorWidget] v2");
            countDownForAllV2AnchorWidget = new CountDownForAllV2AnchorWidget(frameLayout);
        } else {
            C20441214yg.LIZIZ("CountDownForAllWrapper", "[createAnchorWidget] null");
            countDownForAllV2AnchorWidget = null;
        }
        this.LLJ = countDownForAllV2AnchorWidget;
        if (countDownForAllV2AnchorWidget == null) {
            return;
        }
        C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load countDownForAllWidget");
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        try {
            this.subWidgetManager.load(this.LLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e));
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.01Gt] */
    public final void E1() {
        FrameLayout frameLayout;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        if (MultiGuestLiveShowSetting.INSTANCE.isV1()) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "loadShowWidget");
            if (LinkMicLiveShowAnimTechSwitchSetting.INSTANCE.isEnable()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                ViewGroup viewGroupLLILLIZIL = null;
                if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                    viewGroupLLILLIZIL = interfaceC937900aVwLLIIJLIL.LLILLIZIL();
                }
                if (!(viewGroupLLILLIZIL instanceof FrameLayout) || (frameLayout = (FrameLayout) viewGroupLLILLIZIL) == null) {
                    frameLayout = this.LL;
                }
            } else {
                frameLayout = this.LL;
            }
            this.LLIZ = new LiveShowAnchorWidget(frameLayout);
            enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
            try {
                this.subWidgetManager.load(this.LLIZ);
                final LiveShowAnchorWidget liveShowAnchorWidget = this.LLIZ;
                if (liveShowAnchorWidget != null) {
                    this.LLJILJILJ = new InterfaceViewOnClickListenerC1102800enu(liveShowAnchorWidget) { // from class: X.01Gt
                        public final C01GZ LL;
                        public InterfaceC1103130eoR LLILLJJLI;

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final void J() {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void LLILLJJLI() {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void LLILZ() {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void dK(DataChannel dataChannel) {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ boolean dj() {
                            return true;
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ boolean f1() {
                            return false;
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ long g0() {
                            return 500L;
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void mx(DataChannel dataChannel) {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void onHide() {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void onShow() {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ void qG(boolean z) {
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final /* synthetic */ boolean x0(View view) {
                            return false;
                        }

                        {
                            this.LL = liveShowAnchorWidget;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C306901Gx.LJIIJJI("");
                            C306901Gx.LJIIL("liveshow_icon");
                            this.LL.LLLLLLLLL("info_icon", null);
                        }

                        @Override // X.InterfaceViewOnClickListenerC1102800enu
                        public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
                            this.LLILLJJLI = interfaceC1103130eoR;
                        }
                    };
                }
                C306501Gt c306501Gt = this.LLJILJILJ;
                if (c306501Gt != null) {
                    EnumC1102750enp.MULTI_GUEST_LIVE_SHOW.load(this.dataChannel, c306501Gt, false);
                }
                EnumC943760afO.MULTI_GUEST_SHOW.setVisibility(false);
                C924810aAp.LJ().LJII = new InterfaceC924830aAr() { // from class: X.0aEp
                    public int LIZ;

                    @Override // X.InterfaceC924830aAr
                    public final void LIZ(int i) {
                        int i2 = this.LIZ;
                        if (i2 == i) {
                            return;
                        }
                        if (i2 == 0) {
                            if (i > 0) {
                                MultiGuestV3AnchorWidget multiGuestV3AnchorWidget = this.LIZIZ;
                                multiGuestV3AnchorWidget.getClass();
                                if (!C924230a9t.LIZ(2) && MultiGuestLiveShowSetting.INSTANCE.isV1()) {
                                    if (multiGuestV3AnchorWidget.LLIZ == null) {
                                        multiGuestV3AnchorWidget.E1();
                                    }
                                    multiGuestV3AnchorWidget.dataChannel.zW(MultiGuestToolAndPlayFragment.LiveShowIconShowChannel.class, Boolean.TRUE);
                                }
                            }
                        } else if (i2 > 0 && i == 0) {
                            MultiGuestV3AnchorWidget multiGuestV3AnchorWidget2 = this.LIZIZ;
                            multiGuestV3AnchorWidget2.getClass();
                            if (MultiGuestLiveShowSetting.INSTANCE.isV1()) {
                                multiGuestV3AnchorWidget2.dataChannel.zW(MultiGuestToolAndPlayFragment.LiveShowIconShowChannel.class, Boolean.FALSE);
                            }
                        }
                        this.LIZ = i;
                    }
                };
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e));
            }
        }
    }

    @Override // X.InterfaceC921460a5Q
    public final InterfaceC665370Q7z F3() {
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            return C1555540qa8.LJ(frameLayout);
        }
        return null;
    }

    public final void G1() {
        C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load text header widget");
        this.LLJILLL = new AnchorTextHeaderWidget();
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        try {
            this.subWidgetManager.load(this.LLJILLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e));
        }
    }

    public final void H1() {
        C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load topGuestGamePlayWidget");
        this.LLJIJIL = new TopGuestGamePlayAnchorWidget();
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        try {
            this.subWidgetManager.load(this.LLJIJIL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC934310aQ9
    public final void LJ() {
        C921520a5W c921520a5W = this.LLILLJJLI;
        if (c921520a5W != null) {
            C766270U4b.LIZLLL(2131841441);
            c921520a5W.dataChannel.zW(MultiGuestIsLinkedAsAnchorForMicRoomChangeChannel.class, Boolean.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BE1()));
            c921520a5W.LJLL(EnumC921570a5b.MIC_ROOM, CertProviderManagerKt.findCert("bpea-linkmic_anchorpre_onMicRoomStart", 1476788483), null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.LinkMicAnchorWidget, X.InterfaceC944150ag1
    public final void LLJJJJLIIL() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            interfaceC926960aEILIZJ.LJIIIZ(this.subWidgetManager);
        }
        MultiGuestLiveShowSetting multiGuestLiveShowSetting = MultiGuestLiveShowSetting.INSTANCE;
        if (multiGuestLiveShowSetting.isV1() && this.LLIZ != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoadLiveShowWidget");
            if (multiGuestLiveShowSetting.isV1()) {
                this.dataChannel.zW(MultiGuestToolAndPlayFragment.LiveShowIconShowChannel.class, Boolean.FALSE);
            }
            this.subWidgetManager.unload(this.LLIZ);
            EnumC1102750enp.MULTI_GUEST_LIVE_SHOW.unload(this.dataChannel);
            this.LLIZ = null;
            this.LLJILJILJ = null;
        }
        if (LinkmicCountDownTimerPlayModeConfig.INSTANCE.isServiceEnable() && this.LLJI != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoad countdownWidget");
            this.subWidgetManager.unload(this.LLJI);
            this.LLJI = null;
        }
        MultiGuestV3AnchorWidget$loadBigFlyingGiftWidget$1 multiGuestV3AnchorWidget$loadBigFlyingGiftWidget$1 = this.LLJJJJLIIL;
        if (multiGuestV3AnchorWidget$loadBigFlyingGiftWidget$1 != null) {
            this.subWidgetManager.unload(multiGuestV3AnchorWidget$loadBigFlyingGiftWidget$1);
        }
        this.LLJJJJLIIL = null;
        N1();
        if (this.LLJ != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoad countDownForAllWidget");
            this.subWidgetManager.unload(this.LLJ);
            this.LLJ = null;
        }
        C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoad TopGuestGamePlayWidget");
        TopGuestGamePlayAnchorWidget topGuestGamePlayAnchorWidget = this.LLJIJIL;
        if (topGuestGamePlayAnchorWidget != null) {
            this.subWidgetManager.unload(topGuestGamePlayAnchorWidget);
            this.LLJIJIL = null;
        }
        M1();
        if (C986270blx.LIZ() && this.LLJILJIL != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoad LivePartyWidget");
            this.subWidgetManager.unload(this.LLJILJIL);
            this.LLJILJIL = null;
        }
        if (C942160aco.LIZ() && this.LLIZLLLIL != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "MultiGuestV3AnchorWidget unLoad LetsDanceAnchorWidget");
            this.subWidgetManager.unload(this.LLIZLLLIL);
            this.LLIZLLLIL = null;
        }
        InterfaceC926960aEI interfaceC926960aEILIZJ2 = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ2 != null) {
            interfaceC926960aEILIZJ2.LJII();
        }
    }

    public final void N1() {
        if (MultiGuestKaraokePhaseTwoSwitcherSetting.INSTANCE.isEnable() && this.LLJJI != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoad KaraokeWidget Widget");
            this.subWidgetManager.unload(this.LLJJI);
            C917720ZzO c917720ZzO = C917720ZzO.LIZ;
            c917720ZzO.getClass();
            DataChannelGlobal.LLILZ.zQ2(c917720ZzO);
            C917720ZzO.LIZJ = null;
            C917720ZzO.LIZLLL = null;
            C917720ZzO.LJ = null;
            this.LLJJI = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void Ul2() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.LLD();
            if (multiLiveAsAnchorListDialogV2.isShowing()) {
                multiLiveAsAnchorListDialogV2.dismiss();
                C785410UrT.LIZ(multiLiveAsAnchorListDialogV2);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void Y6() {
        IWindowAbility iWindowAbilityLIZJ;
        C941500abk c941500abk = this.LLJZIJLIL;
        if (c941500abk != null) {
            c941500abk.LIZ().LJIILJJIL();
        }
        C927250aEl c927250aEl = this.LLJJIJI;
        if (c927250aEl == null || (iWindowAbilityLIZJ = c927250aEl.LIZJ()) == null) {
            return;
        }
        iWindowAbilityLIZJ.dp2();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void on2() {
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.LLILZIL;
        if (multiLiveAnchorOpenCameraDialog == null || !multiLiveAnchorOpenCameraDialog.isShowing()) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder == null) {
                multiGuestDataHolder = null;
            }
            if (multiGuestDataHolder.LJIIJ || C924810aAp.LJ().LJJJJ) {
                return;
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV2 != null) {
                multiLiveAsAnchorListDialogV2.dismiss();
                C785410UrT.LIZ(multiLiveAsAnchorListDialogV2);
            }
            MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = new MultiLiveAnchorOpenCameraDialog(this.context, this.dataChannel, this);
            this.LLILZIL = multiLiveAnchorOpenCameraDialog2;
            multiLiveAnchorOpenCameraDialog2.show();
            C785410UrT.LIZIZ(multiLiveAnchorOpenCameraDialog2);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(multiLiveAnchorOpenCameraDialog2);
            C816490W1f.LIZ(multiLiveAnchorOpenCameraDialog2);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        LinkStatusViewModel linkStatusViewModel;
        InterfaceC305301Gh interfaceC305301Gh;
        C921520a5W c921520a5W;
        IMessageManager iMessageManager;
        LinkMessageCenter linkMessageCenter;
        C944240agA.LJ("LinkIn_Anchor_Widget_onDestroy");
        C948450amx c948450amx = C948450amx.LIZIZ;
        Object objLJIIIZ = c948450amx.LJIIIZ("LINK_MESSAGE_CENTER");
        if ((objLJIIIZ instanceof LinkMessageCenter) && (linkMessageCenter = (LinkMessageCenter) objLJIIIZ) != null) {
            linkMessageCenter.LJ(this);
        }
        C941500abk c941500abk = this.LLJZIJLIL;
        if (c941500abk != null) {
            c941500abk.LIZ().LIZJ();
        }
        C933510aOr c933510aOr = this.LLL;
        if (c933510aOr != null) {
            C11JF c11jf = c933510aOr.LLILZLL;
            if (c11jf != null && !c11jf.isDisposed()) {
                C11JF c11jf2 = c933510aOr.LLILZLL;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                c933510aOr.LLILZLL = null;
            }
            LinkControlDataHolder linkControlDataHolder = (LinkControlDataHolder) c948450amx.LJIIJJI("LINK_CONTROL_DATA_HOLDER");
            if (linkControlDataHolder != null) {
                linkControlDataHolder.LIZ.remove(c933510aOr.LLILLL.getValue());
            }
            AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) c948450amx.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (abstractC922600a7G != null) {
                abstractC922600a7G.LJJIIJ(c933510aOr.LLILZ);
            }
            if (MultiGuestGuidenceBugFixEnabledSettings.INSTANCE.isEnable() && (iMessageManager = (IMessageManager) c933510aOr.LL.gg0(C776250Uch.class)) != null) {
                iMessageManager.removeMessageListener(C001A.MULTI_GUEST_SUGGEST_MESSAGE.getIntType(), (OnMessageListener) c933510aOr.LLILZIL.getValue());
            }
            if (c933510aOr.LLILLJJLI.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                Lifecycle.State currentState = c933510aOr.LLILLJJLI.getCurrentState();
                Lifecycle.State state = Lifecycle.State.DESTROYED;
                if (currentState != state) {
                    c933510aOr.LLILLJJLI.setCurrentState(state);
                }
            }
        }
        if (LinkMicFixCameraTurnOn.INSTANCE.enable()) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder == null) {
                multiGuestDataHolder = null;
            }
            if (!multiGuestDataHolder.LJIIJ && (c921520a5W = this.LLILLJJLI) != null) {
                c921520a5W.LJJLI("anchor widget destroy", true);
            }
        }
        C921520a5W c921520a5W2 = this.LLILLJJLI;
        if (c921520a5W2 != null) {
            c921520a5W2.detachView();
        }
        C927250aEl c927250aEl = this.LLJJIJI;
        if (c927250aEl != null) {
            c927250aEl.LIZ();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C924810aAp.LJ().LJIILIIL(this.LLJZ);
        x1();
        C501440JlW c501440JlW = (C501440JlW) this.LLJLLL.getValue();
        c501440JlW.getClass();
        if (MultiGuestRecommendRoomAb.INSTANCE.isEnable()) {
            C11JF c11jf3 = c501440JlW.LIZIZ;
            if (c11jf3 != null) {
                c11jf3.dispose();
            }
            c501440JlW.LIZIZ = null;
            C11JL c11jl = c501440JlW.LIZJ;
            if (c11jl != null) {
                c11jl.dispose();
            }
            c501440JlW.LIZJ = null;
        } else {
            C472820IgS.LIZ("not in ab group!");
        }
        DataChannelGlobal.LLILZ.zQ2(this);
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            MultiGuestThemeViewModel multiGuestThemeViewModel = this.LLJJJ;
            if (multiGuestThemeViewModel != null) {
                multiGuestThemeViewModel.eB1(C1555540qa8.LIZLLL(frameLayout));
            }
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = this.LLJJJIL;
            if (multiGuestSharedBgAnchorViewModel != null) {
                multiGuestSharedBgAnchorViewModel.eB1(C1555540qa8.LIZLLL(frameLayout));
            }
            if (this.LLJJJJ != null) {
                C1555540qa8.LIZLLL(frameLayout);
            }
            MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel = this.LLJJL;
            if (multiGuestAnchorShareRevenueViewModel != null) {
                multiGuestAnchorShareRevenueViewModel.eB1(C1555540qa8.LIZLLL(frameLayout));
            }
            MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = this.LLJJJJJIL;
            if (multiGuestAnchorQuickConnectViewModel != null) {
                multiGuestAnchorQuickConnectViewModel.eB1(C1555540qa8.LIZLLL(frameLayout));
            }
            if (C1555540qa8.LIZIZ(C1555540qa8.LIZLLL(frameLayout), IThemeAbility.class, null) != null) {
                C1555540qa8.LJFF(frameLayout, IThemeAbility.class);
            }
            if (C1555540qa8.LIZIZ(C1555540qa8.LIZLLL(frameLayout), ISharedBgAbility.class, null) != null) {
                C1555540qa8.LJFF(frameLayout, ISharedBgAbility.class);
            }
            if (C1555540qa8.LIZIZ(C1555540qa8.LIZLLL(frameLayout), IAnchorQuickConnectAbility.class, null) != null) {
                C1555540qa8.LJFF(frameLayout, IAnchorQuickConnectAbility.class);
            }
        }
        EnumC1102740eno.MULTI_GUEST_PLAY.unload(this.dataChannel);
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable()) {
            EnumC1102740eno.MULTI_GUEST_PLAY_BOOK.unload(this.dataChannel);
        }
        if (this.LLJJ != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoad aigc wallpaper Widget");
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.unload(this.LLJJ);
            }
            this.LLJJ = null;
        }
        N1();
        M1();
        if (this.LLJILLL != null) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "unLoad text header Widget");
            RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
            if (recyclableWidgetManager2 != null) {
                recyclableWidgetManager2.unload(this.LLJILLL);
            }
            this.LLJILLL = null;
        }
        C927150aEb.LL.getViewModelStore().clear();
        C939000aXi.LIZ.getClass();
        C939000aXi.LJFF();
        C924810aAp.LJ().LIZIZ(Boolean.FALSE);
        C924810aAp.LJ().LJII = null;
        SwitchLayoutPanelController switchLayoutPanelController = (SwitchLayoutPanelController) this.LLJLL.getValue();
        DataChannel dataChannel2 = switchLayoutPanelController.LIZ;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(switchLayoutPanelController);
        }
        switchLayoutPanelController.LIZLLL.LJ();
        if (C758560TpG.LIZ()) {
            ShareBgSwitchLayoutController shareBgSwitchLayoutController = (ShareBgSwitchLayoutController) this.LLJLILLLLZIIL.getValue();
            shareBgSwitchLayoutController.LJFF.LJ();
            DataChannel dataChannel3 = shareBgSwitchLayoutController.LIZ;
            if (dataChannel3 != null) {
                dataChannel3.zQ2(shareBgSwitchLayoutController);
            }
        }
        if (C927560aFG.LIZIZ()) {
            C921860a64 c921860a64 = (C921860a64) this.LLJLLIL.getValue();
            c921860a64.getClass();
            C915980Zwa.LJIIIIZZ().a9(c921860a64.LIZIZ);
        }
        if (MultiguestNoticeboardV2Setting.INSTANCE.templateEnable()) {
            C953230auf.LIZ.getClass();
            C953230auf.LIZIZ();
        }
        this.LLLF = null;
        if (!C01ZE.LIZ() && (interfaceC305301Gh = (InterfaceC305301Gh) c948450amx.LJIIJJI("MULTI_GUEST_TICKET_SEI_WRITER")) != null) {
            interfaceC305301Gh.onDestroy();
        }
        ApplyGuideManageMoreAbilityImpl applyGuideManageMoreAbilityImpl = this.LLLFF;
        if (applyGuideManageMoreAbilityImpl != null) {
            C20441214yg.LIZIZ("ApplyGuideStatAbilityImpl", "destroy");
            applyGuideManageMoreAbilityImpl.LL.zQ2(applyGuideManageMoreAbilityImpl);
            C19487111Lx c19487111Lx = applyGuideManageMoreAbilityImpl.LLILLJJLI;
            if (c19487111Lx != null) {
                c19487111Lx.dispose();
            }
            C11JL c11jl2 = applyGuideManageMoreAbilityImpl.LLILLL;
            if (c11jl2 != null) {
                c11jl2.dispose();
            }
            applyGuideManageMoreAbilityImpl.LLILLJJLI = null;
            applyGuideManageMoreAbilityImpl.LLILLL = null;
        }
        C931800aM6.LIZ.getClass();
        if ((C931800aM6.LIZIZ() || C917810ZzX.LJIIIIZZ()) && (interfaceC665370Q7zF3 = F3()) != null) {
            C938400aWk c938400aWk = this.LLJJIII;
            if (c938400aWk != null) {
                c938400aWk.LIZIZ();
            }
            this.LLJJIII = null;
            InterfaceC494301wD interfaceC494301wDLIZIZ = C1555540qa8.LIZIZ(interfaceC665370Q7zF3, ILinkStateAbility.class, null);
            if ((interfaceC494301wDLIZIZ instanceof LinkStatusViewModel) && (linkStatusViewModel = (LinkStatusViewModel) interfaceC494301wDLIZIZ) != null) {
                linkStatusViewModel.eB1(interfaceC665370Q7zF3);
            }
        }
        C934690aQl.LIZ.LIZIZ();
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.zW(MultiGuestMemoryInfoChannel.class, null);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        C941500abk c941500abk;
        if (((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).isMatchFloatWindowLib()) {
            Handler handler = (Handler) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS115S0100000_15(this, 39));
            }
        } else {
            C921520a5W c921520a5W = this.LLILLJJLI;
            if (c921520a5W != null) {
                c921520a5W.onEnterBackground();
            }
            if (C931790aM5.LIZIZ() && (c941500abk = this.LLJZIJLIL) != null) {
                c941500abk.LIZ().LJIIJJI();
            }
        }
        super.onStop();
    }

    @Override // X.InterfaceC921460a5Q
    public final boolean qa0() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        return multiLiveAsAnchorListDialogV2 != null && multiLiveAsAnchorListDialogV2.isShowing();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void ul() {
        C927250aEl c927250aEl;
        IWindowAbility iWindowAbilityLIZJ;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C927600aFK.LJII() == EnumC918970a1P.NORMAL || (c927250aEl = this.LLJJIJI) == null || (iWindowAbilityLIZJ = c927250aEl.LIZJ()) == null) {
            return;
        }
        iWindowAbilityLIZJ.Cc2();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void vk0() {
        C930480aJy.LJJIJIIJI(2131853457, "ttlive_live_interact_list_permit_error", "");
        C921520a5W c921520a5W = this.LLILLJJLI;
        if (c921520a5W != null) {
            c921520a5W.LJLL(EnumC921570a5b.RTC_ERROR, CertProviderManagerKt.findCert("bpea-linkmic_anchor_anchorwidget_onStartInteractFailed", 1476788485), null);
        }
    }

    public final void x1() {
        LinkDialog linkDialog = this.LLJJIJIIJIL;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C500260Jjc.LJJLIIIJL(multiLiveAsAnchorListDialogV2);
        }
        this.LLJJIJIIJIL = null;
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.LLILZIL;
        if (multiLiveAnchorOpenCameraDialog != null) {
            multiLiveAnchorOpenCameraDialog.LJL();
            this.LLILZIL = null;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(ExitVWForCHGMGPopupCloseChannel.class);
        }
    }

    public final void y1() {
        LinkMessageCenter linkMessageCenter;
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("LINK_MESSAGE_CENTER");
        if (!(objLJIIIZ instanceof LinkMessageCenter) || (linkMessageCenter = (LinkMessageCenter) objLJIIIZ) == null) {
            return;
        }
        linkMessageCenter.LIZ(this);
    }

    public final void A1() {
        Fragment fragmentLIZ;
        Fragment fragmentLIZ2;
        if (C917810ZzX.LJIIIIZZ()) {
            new LinkMicScope(this.LL);
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if ((interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) && (fragmentLIZ = C946803n0.LIZ(getView())) == null) {
                return;
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(LinkStatusViewModel.class);
            LinkStatusViewModel linkStatusViewModel = (LinkStatusViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ), C724750Sbp.LJIIIZ(fragmentLIZ), new C940900aam(), new AwS134S0110000_16(fragmentLIZ, 7), new AwS134S0110000_16(fragmentLIZ, 6), new C987103tV(fragmentLIZ, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ);
            InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
            if ((interfaceC1097170eep2 == null || (fragmentLIZ2 = interfaceC1097170eep2.getFragment()) == null) && (fragmentLIZ2 = C946803n0.LIZ(getView())) == null) {
                return;
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ2, "linkMicScope");
            C926770aDz.LIZ(interfaceC665370Q7zLJFF, true);
            linkStatusViewModel.iT0(interfaceC665370Q7zLJFF);
            C938400aWk c938400aWk = new C938400aWk(linkStatusViewModel, this.dataChannel, null);
            this.LLJJIII = c938400aWk;
            c938400aWk.LIZLLL(linkStatusViewModel);
        }
    }

    public final void D1() {
        FrameLayout frameLayout;
        InterfaceC938530aWx interfaceC938530aWxLIZ;
        if (C986270blx.LIZ()) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load LivePartyWidget");
            GuestShowdownAnchorWidget guestShowdownAnchorWidget = new GuestShowdownAnchorWidget();
            MultiGuestLayoutContainerTopView multiGuestLayoutContainerTopView = this.LLLF;
            if (multiGuestLayoutContainerTopView != null && (frameLayout = multiGuestLayoutContainerTopView.LLILLJJLI) != null && (interfaceC938530aWxLIZ = C01IB.LIZ()) != null) {
                interfaceC938530aWxLIZ.LIZJ(frameLayout);
            }
            this.LLJILJIL = guestShowdownAnchorWidget;
            enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
            try {
                this.subWidgetManager.load(this.LLJILJIL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e));
            }
        }
    }

    public final void F1() {
        if (C758560TpG.LIZ() && C784920Uqg.LIZIZ(this.dataChannel) == null && !C978390bZF.LIZ()) {
            C1AZW.LJIIJ(12, C01EI.LIZ(835, "MultiGuestV3AnchorWidget"), "loadPlaybookService", null, null);
            DataChannel dataChannel = this.dataChannel;
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            C0TF9.LIZ(dataChannel, interfaceC1097170eep != null ? interfaceC1097170eep.getFragment() : null, null, this, true);
            return;
        }
        String strLIZ = C01EI.LIZ(832, "MultiGuestV3AnchorWidget");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadPlaybookService return, enable=");
        sbLIZ.append(C758560TpG.LIZ());
        sbLIZ.append(", service=");
        sbLIZ.append(C784920Uqg.LIZIZ(this.dataChannel));
        sbLIZ.append(", nonMultiGuestEnable=");
        sbLIZ.append(C978390bZF.LIZ());
        C1AZW.LJIILL(strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    public final void L1() {
        Room room;
        Creator creator;
        Creator creator2;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        if (!C758560TpG.LIZ() || C784920Uqg.LIZIZ(this.dataChannel) == null || C978390bZF.LIZ() || !LinkMicPlaybookNonMultiGuestConfigSetting.INSTANCE.isCodeTechSwitchForAndroidEnable() || (room = this.LLILZ) == null || (((creator = room.creator) != null && creator.roomContinue == 0) || (creator2 = room.creator) == null || Integer.valueOf(creator2.roomContinue) == null)) {
            C1AZW.LJIILL(C01EI.LIZ(832, "MultiGuestV3AnchorWidget"), "resumePlaybook return", null, null);
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) == null) {
            return;
        }
        playbookAnchorServiceV2LIZIZ.LIZLLL();
    }

    public final void M1() {
        if (!C758560TpG.LIZ() || C784920Uqg.LIZIZ(this.dataChannel) == null || C978390bZF.LIZ()) {
            return;
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(843, "MultiGuestV3AnchorWidget"), "unLoadPlaybookService", null, null);
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(this.dataChannel);
        if (playbookAnchorServiceV2LIZIZ != null) {
            playbookAnchorServiceV2LIZIZ.destroy();
        }
    }

    public final void O1() {
        if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            View view = this.contentView;
            TextView textView = view != null ? (TextView) view.findViewById(R.id.tv_test_layout) : null;
            C917810ZzX c917810ZzX = C917810ZzX.LIZ;
            DataChannel dataChannel = this.dataChannel;
            c917810ZzX.getClass();
            C917810ZzX.LJIILJJIL(dataChannel, textView, null);
        }
    }

    public final void P1() {
        if (C924810aAp.LJ().LJJII <= 0 || C917810ZzX.LJIIIIZZ()) {
            EnumC1102740eno.MULTI_GUEST_PLAY.unload(this.dataChannel);
        } else {
            EnumC1102740eno.load$default(EnumC1102740eno.MULTI_GUEST_PLAY, this.dataChannel, (C935380aRs) this.LLJL.getValue(), false, 4, null);
        }
        LiveSdkMultiGuestIconInCoHostOptSetting liveSdkMultiGuestIconInCoHostOptSetting = LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE;
        if (!liveSdkMultiGuestIconInCoHostOptSetting.isEnable() || LinkMicPlaybookRevertSetting.INSTANCE.getValue()) {
            return;
        }
        if (!liveSdkMultiGuestIconInCoHostOptSetting.isEnable() || C924810aAp.LJ().LJJII <= 0 || C917810ZzX.LJIIIIZZ()) {
            EnumC1102740eno.MULTI_GUEST_PLAY_BOOK.unload(this.dataChannel);
        } else {
            EnumC1102740eno.load$default(EnumC1102740eno.MULTI_GUEST_PLAY_BOOK, this.dataChannel, (C935400aRu) this.LLJLIL.getValue(), false, 4, null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void k02() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        if (!isViewValid() || (multiLiveAsAnchorListDialogV2 = this.LLILLL) == null) {
            return;
        }
        multiLiveAsAnchorListDialogV2.isShowing();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget$loadBigFlyingGiftWidget$1] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Fragment fragmentLIZ;
        MultiGuestThemeViewModel multiGuestThemeViewModel;
        Fragment fragmentLIZ2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel;
        Fragment fragmentLIZ3;
        MultiGuestGuidenceViewModel multiGuestGuidenceViewModel;
        C921520a5W c921520a5W;
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        ILinkStateAbility iLinkStateAbility;
        ViewGroup viewGroup;
        C941500abk c941500abk;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        k kVarLJJIIZ;
        Boolean boolValueOf;
        InterfaceC665370Q7z interfaceC665370Q7z;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        Fragment fragmentLIZ4;
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel;
        Fragment fragmentLIZ5;
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragmentLIZ6;
        Fragment fragmentLIZ7;
        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel;
        Fragment fragmentLIZ8;
        ISharedRevenueAbility iSharedRevenueAbility;
        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModelKn1;
        IMessageManager iMessageManager;
        MultiGuestGuidenceViewModel viewModel;
        MultiGuestGuidenceViewModel viewModel2;
        MultiGuestGuidenceViewModel viewModel3;
        Fragment fragmentLIZ9;
        Fragment fragmentLIZ10;
        Fragment fragmentLIZ11;
        Fragment fragmentLIZ12;
        boolean zLJI = MethodIDManager.LJI(71904);
        super.onCreate();
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ != null) {
            interfaceC926960aEILIZJ.LJ(this);
        }
        C944240agA.LJ("LinkIn_Anchor_Widget_onCreate");
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.SX0(C956860b0W.class, this.context);
        }
        DataChannel dataChannel5 = this.dataChannel;
        this.LLILZ = dataChannel5 != null ? (Room) dataChannel5.gg0(RoomChannel.class) : null;
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            InterfaceC1097170eep interfaceC1097170eep2 = this.widgetCallback;
            dataChannel6.SX0(C956790b0P.class, ((interfaceC1097170eep2 == null || (fragmentLIZ12 = interfaceC1097170eep2.getFragment()) == null) && (fragmentLIZ12 = C946803n0.LIZ(getView())) == null) ? null : C1558360qeg.LJFF(fragmentLIZ12, "linkMicScope"));
        }
        InterfaceC1097170eep interfaceC1097170eep3 = this.widgetCallback;
        if (interfaceC1097170eep3 == null || (fragmentLIZ = interfaceC1097170eep3.getFragment()) == null) {
            fragmentLIZ = C946803n0.LIZ(getView());
        }
        if (fragmentLIZ != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiGuestThemeViewModel.class);
            multiGuestThemeViewModel = (MultiGuestThemeViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ), C724750Sbp.LJIIIZ(fragmentLIZ), new C940900aam(), new AwS134S0110000_16(fragmentLIZ, 7), new AwS134S0110000_16(fragmentLIZ, 6), new C987103tV(fragmentLIZ, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ);
            InterfaceC1097170eep interfaceC1097170eep4 = this.widgetCallback;
            if ((interfaceC1097170eep4 != null && (fragmentLIZ11 = interfaceC1097170eep4.getFragment()) != null) || (fragmentLIZ11 = C946803n0.LIZ(getView())) != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ11, "linkMicScope");
                C1555540qa8.LIZ(interfaceC665370Q7zLJFF, new ThemeAbilityImpl(multiGuestThemeViewModel), IThemeAbility.class, null);
                multiGuestThemeViewModel.iT0(interfaceC665370Q7zLJFF);
            }
        } else {
            multiGuestThemeViewModel = null;
        }
        this.LLJJJ = multiGuestThemeViewModel;
        InterfaceC1097170eep interfaceC1097170eep5 = this.widgetCallback;
        if ((interfaceC1097170eep5 == null || (fragmentLIZ2 = interfaceC1097170eep5.getFragment()) == null) && (fragmentLIZ2 = C946803n0.LIZ(getView())) == null) {
            multiGuestSharedBgAnchorViewModel = null;
        } else {
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MultiGuestSharedBgAnchorViewModel.class);
            multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ2, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ2), C724750Sbp.LJIIIZ(fragmentLIZ2), new C940900aam(), new AwS134S0110000_16(fragmentLIZ2, 7), new AwS134S0110000_16(fragmentLIZ2, 6), new C987103tV(fragmentLIZ2, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ2);
            InterfaceC1097170eep interfaceC1097170eep6 = this.widgetCallback;
            if ((interfaceC1097170eep6 != null && (fragmentLIZ10 = interfaceC1097170eep6.getFragment()) != null) || (fragmentLIZ10 = C946803n0.LIZ(getView())) != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLIZ10, "linkMicScope");
                C1555540qa8.LIZ(interfaceC665370Q7zLJFF2, new SharedBgAbilityImpl(multiGuestSharedBgAnchorViewModel, null), ISharedBgAbility.class, null);
                multiGuestSharedBgAnchorViewModel.iT0(interfaceC665370Q7zLJFF2);
            }
        }
        this.LLJJJIL = multiGuestSharedBgAnchorViewModel;
        InterfaceC1097170eep interfaceC1097170eep7 = this.widgetCallback;
        if ((interfaceC1097170eep7 == null || (fragmentLIZ3 = interfaceC1097170eep7.getFragment()) == null) && (fragmentLIZ3 = C946803n0.LIZ(getView())) == null) {
            multiGuestGuidenceViewModel = null;
        } else {
            C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MultiGuestGuidenceViewModel.class);
            multiGuestGuidenceViewModel = (MultiGuestGuidenceViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ3, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ3), C724750Sbp.LJIIIZ(fragmentLIZ3), new C940900aam(), new AwS134S0110000_16(fragmentLIZ3, 7), new AwS134S0110000_16(fragmentLIZ3, 6), new C987103tV(fragmentLIZ3, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ3);
            InterfaceC1097170eep interfaceC1097170eep8 = this.widgetCallback;
            if ((interfaceC1097170eep8 != null && (fragmentLIZ9 = interfaceC1097170eep8.getFragment()) != null) || (fragmentLIZ9 = C946803n0.LIZ(getView())) != null) {
                C1555540qa8.LIZ(C1558360qeg.LJFF(fragmentLIZ9, "linkMicScope"), new GuidenceAbilityImpl(multiGuestGuidenceViewModel), IGuidenceAbility.class, null);
            }
        }
        this.LLJJJJ = multiGuestGuidenceViewModel;
        if (C931790aM5.LIZIZ()) {
            DataChannel dataChannel7 = this.dataChannel;
            C933510aOr c933510aOr = new C933510aOr(dataChannel7);
            c933510aOr.LLILLJJLI.setCurrentState(Lifecycle.State.STARTED);
            InterfaceC665370Q7z interfaceC665370Q7z2 = (InterfaceC665370Q7z) dataChannel7.gg0(C956790b0P.class);
            c933510aOr.LLIZLLLIL = interfaceC665370Q7z2 != null ? (IGuidenceAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z2, IGuidenceAbility.class, null) : null;
            if (C930540aK4.LIZJ()) {
                IGuidenceAbility iGuidenceAbility = c933510aOr.LLIZLLLIL;
                if (iGuidenceAbility != null && (viewModel3 = iGuidenceAbility.getViewModel()) != null) {
                    MultiGuestGuidenceViewModel.vQ2(viewModel3, new C2217371BqR() { // from class: X.0aOo
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C933680aP8) obj).LL;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C933680aP8) obj).LL = (C933460aOm) obj2;
                        }
                    }, c933510aOr, new AwS594S0100000_15(c933510aOr, 689));
                }
                IGuidenceAbility iGuidenceAbility2 = c933510aOr.LLIZLLLIL;
                if (iGuidenceAbility2 != null && (viewModel2 = iGuidenceAbility2.getViewModel()) != null) {
                    MultiGuestGuidenceViewModel.vQ2(viewModel2, new C2217371BqR() { // from class: X.0aOz
                        @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C933680aP8) obj).LLILLJJLI;
                        }

                        @Override // X.C2217371BqR, X.AbstractC2217331BqN
                        public final void set(Object obj, Object obj2) {
                            ((C933680aP8) obj).LLILLJJLI = (C933690aP9) obj2;
                        }
                    }, c933510aOr, new AwS594S0100000_15(c933510aOr, 692));
                }
                IGuidenceAbility iGuidenceAbility3 = c933510aOr.LLIZLLLIL;
                if (iGuidenceAbility3 != null && (viewModel = iGuidenceAbility3.getViewModel()) != null) {
                    MultiGuestGuidenceViewModel.vQ2(viewModel, new C2217381BqS() { // from class: X.0aOv
                        @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                        public final Object get(Object obj) {
                            return ((C933680aP8) obj).LLILLL;
                        }
                    }, c933510aOr, new AwS594S0100000_15(c933510aOr, 695));
                }
                C20441214yg.LIZIZ("live_guidence", "AnchorInviteGuideHelper_observe MultiGuestAnchorSideShowGuidenceEvent");
                C948450amx c948450amx = C948450amx.LIZIZ;
                LinkControlDataHolder linkControlDataHolder = (LinkControlDataHolder) c948450amx.LJIIJJI("LINK_CONTROL_DATA_HOLDER");
                if (linkControlDataHolder != null) {
                    linkControlDataHolder.LIZ.add((InterfaceC927720aFW) c933510aOr.LLILLL.getValue());
                }
                dataChannel7.BQ2(c933510aOr, MultiGuestAnchorSideShowGuidenceEvent.class, new AwS594S0100000_15(c933510aOr, 697));
                dataChannel7.BQ2(c933510aOr, MultiGuestHideGuideLinkMicEvent.class, new AwS594S0100000_15(c933510aOr, 684));
                dataChannel7.BQ2(c933510aOr, LinkInRoomAnchorInviteGuestEvent.class, new AwS594S0100000_15(c933510aOr, 686));
                AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) c948450amx.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (abstractC922600a7G != null) {
                    abstractC922600a7G.LJJIJIL(c933510aOr.LLILZ);
                }
            }
            if (MultiGuestGuidenceBugFixEnabledSettings.INSTANCE.isEnable() && (iMessageManager = (IMessageManager) dataChannel7.gg0(C776250Uch.class)) != null) {
                iMessageManager.addMessageListener(C001A.MULTI_GUEST_SUGGEST_MESSAGE.getIntType(), (OnMessageListener) c933510aOr.LLILZIL.getValue());
            }
            this.LLL = c933510aOr;
        }
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel2 = this.LLJJJIL;
        if (multiGuestSharedBgAnchorViewModel2 != null) {
            multiGuestSharedBgAnchorViewModel2.LL = this.dataChannel;
        }
        if (C917750ZzR.LJI(true)) {
            InterfaceC1097170eep interfaceC1097170eep9 = this.widgetCallback;
            if ((interfaceC1097170eep9 == null || (fragmentLIZ7 = interfaceC1097170eep9.getFragment()) == null) && (fragmentLIZ7 = C946803n0.LIZ(getView())) == null) {
                multiGuestAnchorShareRevenueViewModel = null;
            } else {
                C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MultiGuestAnchorShareRevenueViewModel.class);
                multiGuestAnchorShareRevenueViewModel = (MultiGuestAnchorShareRevenueViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ4, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ7), C724750Sbp.LJIIIZ(fragmentLIZ7), new C940900aam(), new AwS134S0110000_16(fragmentLIZ7, 7), new AwS134S0110000_16(fragmentLIZ7, 6), new C987103tV(fragmentLIZ7, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ4);
                InterfaceC1097170eep interfaceC1097170eep10 = this.widgetCallback;
                if ((interfaceC1097170eep10 != null && (fragmentLIZ8 = interfaceC1097170eep10.getFragment()) != null) || (fragmentLIZ8 = C946803n0.LIZ(getView())) != null) {
                    InterfaceC665370Q7z interfaceC665370Q7zLJFF3 = C1558360qeg.LJFF(fragmentLIZ8, "linkMicScope");
                    C1555540qa8.LIZ(interfaceC665370Q7zLJFF3, new ShareRevenueAbility(multiGuestAnchorShareRevenueViewModel, null), ISharedRevenueAbility.class, null);
                    multiGuestAnchorShareRevenueViewModel.iT0(interfaceC665370Q7zLJFF3);
                    if (C917810ZzX.LJIIIIZZ() && (iSharedRevenueAbility = (ISharedRevenueAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zLJFF3, ISharedRevenueAbility.class, null)) != null && (multiGuestAnchorShareRevenueViewModelKn1 = iSharedRevenueAbility.Kn1()) != null) {
                        MultiGuestAnchorShareRevenueViewModel.vQ2(multiGuestAnchorShareRevenueViewModelKn1, multiGuestAnchorShareRevenueViewModel, AFwS250S0000000_15.get$arr$(40));
                    }
                }
            }
            this.LLJJL = multiGuestAnchorShareRevenueViewModel;
        }
        if (LinkMicApplyGuideContinueSetting.INSTANCE.enable() && (((interfaceC1097170eep = this.widgetCallback) != null && (fragmentLIZ6 = interfaceC1097170eep.getFragment()) != null) || (fragmentLIZ6 = C946803n0.LIZ(getView())) != null)) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF4 = C1558360qeg.LJFF(fragmentLIZ6, "linkMicScope");
            ApplyGuideManageMoreAbilityImpl applyGuideManageMoreAbilityImpl = new ApplyGuideManageMoreAbilityImpl(this.dataChannel);
            this.LLLFF = applyGuideManageMoreAbilityImpl;
            C1555540qa8.LIZ(interfaceC665370Q7zLJFF4, applyGuideManageMoreAbilityImpl, IApplyGuideManageMoreAbility.class, null);
        }
        if (MultiGuestAnchorQuickConnectSetting.INSTANCE.isEnable()) {
            InterfaceC1097170eep interfaceC1097170eep11 = this.widgetCallback;
            if ((interfaceC1097170eep11 == null || (fragmentLIZ4 = interfaceC1097170eep11.getFragment()) == null) && (fragmentLIZ4 = C946803n0.LIZ(getView())) == null) {
                multiGuestAnchorQuickConnectViewModel = null;
            } else {
                C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(MultiGuestAnchorQuickConnectViewModel.class);
                multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) C737770Swp.LIZ(new AwS560S0100000_16((C13IQ) c19719912DlLIZ5, 659), new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ4), C724750Sbp.LJIIIZ(fragmentLIZ4), new C940900aam(), new AwS134S0110000_16(fragmentLIZ4, 7), new AwS134S0110000_16(fragmentLIZ4, 6), new C987103tV(fragmentLIZ4, false), AFwS250S0000000_15.get$arr$(134), c19719912DlLIZ5);
                InterfaceC1097170eep interfaceC1097170eep12 = this.widgetCallback;
                if ((interfaceC1097170eep12 != null && (fragmentLIZ5 = interfaceC1097170eep12.getFragment()) != null) || (fragmentLIZ5 = C946803n0.LIZ(getView())) != null) {
                    InterfaceC665370Q7z interfaceC665370Q7zLJFF5 = C1558360qeg.LJFF(fragmentLIZ5, "linkMicScope");
                    C1555540qa8.LIZ(interfaceC665370Q7zLJFF5, new AnchorQuickConnectAbilityImpl(multiGuestAnchorQuickConnectViewModel), IAnchorQuickConnectAbility.class, null);
                    multiGuestAnchorQuickConnectViewModel.LL = this.dataChannel;
                    multiGuestAnchorQuickConnectViewModel.iT0(interfaceC665370Q7zLJFF5);
                }
            }
            this.LLJJJJJIL = multiGuestAnchorQuickConnectViewModel;
        }
        DataChannelGlobal.LLILZ.CQ2(MultiGuestOpenWaitingDialog.class, this, new AwS594S0100000_15(this, 154));
        DataChannelGlobal.LLILZ.BQ2(this, this, MultiGuestLiveSuspended.class, new AwS594S0100000_15(this, 155));
        DataChannel dataChannel8 = this.dataChannel;
        if (dataChannel8 != null) {
            dataChannel8.BQ2(this, ToolsTypeStateUpdateEvent.class, new AwS594S0100000_15(this, 156));
        }
        DataChannel dataChannel9 = this.dataChannel;
        if (dataChannel9 != null) {
            dataChannel9.CQ2(InteractStateChangeEvent.class, this, this.LLJJIJIL);
            dataChannel9.BQ2(this, ForceCloseLinkEvent.class, new AwS594S0100000_15(this, 157));
            dataChannel9.BQ2(this, CoHostInProgressChanged.class, new AwS594S0100000_15(this, 158));
            dataChannel9.BQ2(this, KickOutAllMultiGuestGuestsEvent.class, new AwS594S0100000_15(this, 159));
            dataChannel9.BQ2(this, MultiLiveDialogBackEvent.class, new AwS594S0100000_15(this, 160));
            dataChannel9.CQ2(AnchorOpenListDialogWithPositionEvent.class, this, new AwS594S0100000_15(this, 161));
            dataChannel9.BQ2(this, CoHostBeInvitedDialogShow.class, new AwS594S0100000_15(this, 162));
            dataChannel9.CQ2(ShowUserListDialog.class, this, new AwS594S0100000_15(this, 163));
            dataChannel9.BQ2(this, PlayerPauseLiveForAnchorDialogEvent.class, new AwS594S0100000_15(this, 164));
            dataChannel9.BQ2(this, AudioStateChangeEvent.class, new AwS594S0100000_15(this, 165));
            dataChannel9.BQ2(this, LinkInGuestCountDownFinishChannel.class, new AwS594S0100000_15(this, 166));
            dataChannel9.BQ2(this, MultiLiveOpenModeratorListEvent.class, new AwS594S0100000_15(this, 167));
            dataChannel9.BQ2(this, MultiGuestShowLayoutSettingDialogEvent.class, new AwS594S0100000_15(this, 168));
            dataChannel9.BQ2(this, AnchorResumeSharedBgEvent.class, new AwS594S0100000_15(this, 169));
            dataChannel9.BQ2(this, MultiGuestToolAndPlayFragment.LiveShowIconShowChannel.class, new AwS594S0100000_15(this, 170));
            dataChannel9.BQ2(this, ZoomedPositionsUpdateEvent.class, new AwS594S0100000_15(this, 171));
            dataChannel9.BQ2(this, ShowMultiGuestAnchorListChannel.class, new AwS594S0100000_15(this, 172));
            dataChannel9.BQ2(this, MultiGuestDismissManagerListDialogEvent.class, new AwS594S0100000_15(this, 173));
        }
        if (C931790aM5.LIZIZ() && (dataChannel3 = this.dataChannel) != null) {
            dataChannel3.BQ2(this, InvokeGiftPanelEvent.class, new AwS594S0100000_15(this, 148));
        }
        if (LiveSdkMultiGuestEnableMixModeSetting.isEnable() && (dataChannel2 = this.dataChannel) != null) {
            dataChannel2.EQ2(this, LinkerModeChangeChannel.class, new AwS594S0100000_15(this, 149));
            dataChannel2.EQ2(this, LinkMicSceneChangeChannel.class, new AwS594S0100000_15(this, 150));
        }
        if (LiveSdkCloseDialogWhenDisableMultiSetting.isEnable() && (dataChannel = this.dataChannel) != null) {
            dataChannel.CQ2(MixModeStateChangeChannel.class, this, new AwS594S0100000_15(this, 151));
        }
        Room room = this.LLILZ;
        if (room != null) {
            this.LLILLJJLI = new C921520a5W(room, this.dataChannel, this);
        }
        C921520a5W c921520a5W2 = this.LLILLJJLI;
        if (c921520a5W2 != null) {
            c921520a5W2.attachView(this);
        }
        if (!C01ZE.LIZ()) {
            new TicketWriterHelper(this.dataChannel);
        }
        C930480aJy.LJJIJIIJI(2131840941, "pm_allow_requests_toast", "");
        FrameLayout frameLayout = this.LL;
        DataChannel dataChannel10 = this.dataChannel;
        new AnimationManagerImpl(frameLayout, this, (dataChannel10 == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel10.gg0(C956790b0P.class)) == null) ? null : (IThemeAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IThemeAbility.class, null)).LLJI = false;
        if (LinkMicLayoutRefactorMisMatchCheck.INSTANCE.enable()) {
            k kVar = GsonProtectorUtils.parse(new p(), SettingsManager.INSTANCE.getStringValue("live_ab_label", LiveAbLabelSetting.DEFAULT));
            if (kVar != null && (kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ("linkmic_sdk_layout_refactor")) != null && (boolValueOf = Boolean.valueOf(kVarLJJIIZ.LJ())) != null && !Intrinsics.LJFF(boolValueOf, Boolean.valueOf(C931790aM5.LIZIZ()))) {
                C1304660k3U c1304660k3U = C1304660k3U.LIZ;
                StringBuilder sb = new StringBuilder("link mic layout refactor setting check failed: ");
                Room room2 = this.LLILZ;
                sb.append(room2 != null ? Long.valueOf(room2.getId()) : null);
                sb.append(" setting: ");
                sb.append(boolValueOf);
                sb.append(" room ab: ");
                sb.append(C931790aM5.LIZIZ());
                c1304660k3U.LIZ(513, sb.toString(), null);
            }
        }
        if (C931790aM5.LIZIZ()) {
            FrameLayout frameLayout2 = this.LL;
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                ViewGroup viewGroupLLILLIZIL = (interfaceC954180awCLLJLL == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) == null) ? null : interfaceC937900aVwLLIIJLIL.LLILLIZIL();
                boolean z = viewGroupLLILLIZIL instanceof FrameLayout;
                viewGroup = viewGroupLLILLIZIL;
                if (!z || viewGroupLLILLIZIL == null) {
                    FrameLayout frameLayout3 = new FrameLayout(this.LL.getContext());
                    frameLayout3.setId(R.id.b4_);
                    C786410Ut5.a6(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
                    this.LL.addView(frameLayout3);
                    viewGroup = frameLayout3;
                }
            } else {
                FrameLayout frameLayout4 = new FrameLayout(this.LL.getContext());
                frameLayout4.setId(R.id.b4_);
                C786410Ut5.a6(frameLayout4, new FrameLayout.LayoutParams(-1, -1));
                this.LL.addView(frameLayout4);
                viewGroup = frameLayout4;
            }
            C939490aYV c939490aYV = new C939490aYV(frameLayout2, viewGroup, this.dataChannel);
            Map<String, InterfaceC942030acb> mapLIZLLL = c939490aYV.LIZLLL("live_room");
            if (C946803n0.LIZ(this.LL) != null) {
                if (C931800aM6.LIZIZ()) {
                    C921520a5W c921520a5W3 = this.LLILLJJLI;
                    c941500abk = new C941500abk(true, c921520a5W3 != null ? c921520a5W3.LJJL() : null, frameLayout2, viewGroup, this.dataChannel, mapLIZLLL, c939490aYV);
                } else if (C917810ZzX.LJIIIIZZ()) {
                    c941500abk = null;
                } else {
                    C921520a5W c921520a5W4 = this.LLILLJJLI;
                    c941500abk = new C941500abk(true, c921520a5W4 != null ? c921520a5W4.LJJL() : null, frameLayout2, viewGroup, this.dataChannel, mapLIZLLL, c939490aYV);
                }
                this.LLJZIJLIL = c941500abk;
                if (c941500abk != null) {
                    c941500abk.LIZ().LIZ();
                }
            }
        } else {
            C927250aEl c927250aEl = this.LLJJIJI;
            if (c927250aEl != null) {
                FrameLayout frameLayout5 = this.LL;
                C921520a5W c921520a5W5 = this.LLILLJJLI;
                c927250aEl.LIZLLL(this, frameLayout5, c921520a5W5 != null ? c921520a5W5.LJJL() : null, true);
            }
        }
        this.LLLF = new MultiGuestLayoutContainerTopView(this.LL, this);
        C931800aM6.LIZ.getClass();
        if ((C931800aM6.LIZIZ() || !C917810ZzX.LJIIIIZZ()) && (c921520a5W = this.LLILLJJLI) != null && (interfaceC665370Q7zF3 = F3()) != null && (iLinkStateAbility = (ILinkStateAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zF3, ILinkStateAbility.class, null)) != null) {
            c921520a5W.subscribeStateChange(iLinkStateAbility);
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC934710aQn.Hb;
        if (!Intrinsics.LJFF(c20337914i1.LIZIZ(), Boolean.valueOf(C927560aFG.LIZIZ()))) {
            c20337914i1.LJFF(Boolean.valueOf(C927560aFG.LIZIZ()));
            if (!C927560aFG.LIZIZ()) {
                C766270U4b.LIZLLL(2131851253);
                String strLJIJI = C497740JfY.LJIJI(2131851253);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
                C924620aAW.LJIILIIL(c474500IjALIZ);
                c474500IjALIZ.LJJII("anchor", "user_type");
                c474500IjALIZ.LJJII(strLJIJI, "msg_content");
                c474500IjALIZ.LJJII("ttlive_audioModeMultiGuest_creatorScreen_cameraAvailableToast", "msg_id");
                c474500IjALIZ.LJJII("mg_downgrade_only_audio", "extra");
                c474500IjALIZ.LIZ();
            }
        }
        Room room3 = this.LLILZ;
        C19EG c19egLJ = C500260Jjc.LJ(this.context);
        DataChannel dataChannel11 = this.dataChannel;
        C921520a5W c921520a5W6 = this.LLILLJJLI;
        if (room3 != null && c19egLJ != null && dataChannel11 != null) {
            if (c921520a5W6 != null) {
                c921520a5W6.LJJJLZIJ();
            }
            C948450amx.LIZIZ.LJFF(new MultiLiveInviterShareHelper(c921520a5W6), null);
        }
        E1();
        if (LinkmicCountDownTimerPlayModeConfig.INSTANCE.isServiceEnable()) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load countdown widget");
            this.LLJI = new CountdownAnchorWidget();
            enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
            try {
                this.subWidgetManager.load(this.LLJI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e));
            }
        }
        C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load aigc awidget");
        this.LLJJ = new AigcAnchorWidget(this.LLJJJIL);
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        try {
            this.subWidgetManager.load(this.LLJJ);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e2));
        }
        if (MultiGuestKaraokePhaseTwoSwitcherSetting.INSTANCE.isEnable()) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load karaoke widget");
            this.LLJJI = new KaraokeAnchorWidget();
            enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
            try {
                this.subWidgetManager.load(this.LLJJI);
                C917720ZzO c917720ZzO = C917720ZzO.LIZ;
                KaraokeAnchorWidget karaokeAnchorWidget = this.LLJJI;
                DataChannel dataChannel12 = this.dataChannel;
                c917720ZzO.getClass();
                C917720ZzO.LJ = karaokeAnchorWidget;
                if (dataChannel12 != null) {
                    DataChannelGlobal.LLILZ.CQ2(KaraokeYouSingRequestMessageEvent.class, c917720ZzO, new AwS594S0100000_15(dataChannel12, 1152));
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e3));
            }
        }
        final FrameLayout frameLayout6 = this.LL;
        this.LLJJJJLIIL = new BigFlyingGiftPathWidget(frameLayout6) { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget$loadBigFlyingGiftWidget$1
            @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.BigFlyingGiftPathWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                super.onStateChanged(lifecycleOwner, event);
            }

            @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.BigFlyingGiftPathWidget
            public final String y1(long j) {
                AbstractC928510aGn abstractC928510aGnLIZ;
                LinkPlayerInfo linkPlayerInfo;
                InterfaceC302401Fe interfaceC302401Fe = (InterfaceC302401Fe) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
                if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJIILIIL(j)) != null) {
                    return linkPlayerInfo.mInteractIdStr;
                }
                return null;
            }
        };
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        try {
            this.subWidgetManager.load(this.LLJJJJLIIL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(th));
        }
        C1();
        if (C942160aco.LIZ()) {
            C20441214yg.LIZIZ("MultiGuestV3AnchorWidget", "load let's dance widget");
            this.LLIZLLLIL = new LetsDanceAnchorWidget();
            enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
            try {
                this.subWidgetManager.load(this.LLIZLLLIL);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                C20441214yg.LJ("MultiGuestV3AnchorWidget", String.valueOf(e4));
            }
        }
        if (C356501Zz.LIZ(this.dataChannel)) {
            H1();
        }
        F1();
        L1();
        D1();
        G1();
        P1();
        y1();
        C924810aAp.LJ().LJFF(this.LLJZ);
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC926960aEI interfaceC926960aEILIZJ2 = C941700ac4.LIZJ();
        if (interfaceC926960aEILIZJ2 != null) {
            interfaceC926960aEILIZJ2.LJFF(this.subWidgetManager);
        }
        ((SwitchLayoutPanelController) this.LLJLL.getValue()).LIZ();
        if (C758560TpG.LIZ()) {
            ((ShareBgSwitchLayoutController) this.LLJLILLLLZIIL.getValue()).LIZ();
        }
        if (C927560aFG.LIZIZ()) {
            ((C921860a64) this.LLJLLIL.getValue()).LIZ();
        }
        z1();
        A1();
        C20441214yg.LJIIIZ("multi_init", "MultiGuestV3AnchorWidget onCreate");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        C941500abk c941500abk;
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        IWindowAbility iWindowAbility;
        InterfaceC924740aAi interfaceC924740aAiLIZ;
        super.onResume();
        C921520a5W c921520a5W = this.LLILLJJLI;
        if (c921520a5W != null) {
            C1AZW c1azw = C1AZW.LIZ;
            String strLogTAG = c921520a5W.logTAG(1777);
            c1azw.getClass();
            C1AZW.LIZ(strLogTAG, "onEnterForeground", null, null);
            if (C500260Jjc.LJJIJIL(c921520a5W.LLIZLLLIL)) {
                String strLogTAG2 = c921520a5W.logTAG(1780);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onEnterForegroundLogic, isEnterBackground: ");
                sbLIZ.append(c921520a5W.LLIZLLLIL);
                C1AZW.LJFF(strLogTAG2, C2188811AlT.LIZIZ(sbLIZ), null, null);
                c921520a5W.LLIZLLLIL = Boolean.FALSE;
                C924810aAp.LJ().LJIIJ = false;
                InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL != null) {
                    interfaceC954180awCLLJLL.resume();
                }
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    interfaceC954180awCLLJLL2.LIZJ("MultiGuestV3AnchorPresenter onEnterForeground");
                }
                C921920a6A.LIZ = System.currentTimeMillis();
                if (PlayRecordManager.LIZLLL != null && (interfaceC924740aAiLIZ = C920350a3d.LIZ()) != null) {
                    interfaceC924740aAiLIZ.LJII();
                }
            }
            InterfaceC921460a5Q interfaceC921460a5Q = (InterfaceC921460a5Q) c921520a5W.mView;
            if (interfaceC921460a5Q != null && (interfaceC665370Q7zF3 = interfaceC921460a5Q.F3()) != null && (iWindowAbility = (IWindowAbility) C1555540qa8.LIZIZ(interfaceC665370Q7zF3, IWindowAbility.class, null)) != null) {
                iWindowAbility.LLLZZ();
            }
            C946690ak7 c946690ak7 = (C946690ak7) c921520a5W.LLJJL.getValue();
            c946690ak7.getClass();
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS115S0100000_15(c946690ak7, 162));
        }
        if (C931790aM5.LIZIZ() && (c941500abk = this.LLJZIJLIL) != null) {
            c941500abk.LIZ().LJIILIIL();
        }
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.LLILZIL;
        if (multiLiveAnchorOpenCameraDialog != null && multiLiveAnchorOpenCameraDialog.isShowing()) {
            MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = this.LLILZIL;
            if (multiLiveAnchorOpenCameraDialog2 != null) {
                multiLiveAnchorOpenCameraDialog2.LJL();
                return;
            }
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL3 == null || interfaceC954180awCLLJLL3.LIZIZ() == 0) {
            InterfaceC954180awC interfaceC954180awCLLJLL4 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL4 == null || !interfaceC954180awCLLJLL4.ae()) {
                MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
                if (multiGuestDataHolder == null) {
                    multiGuestDataHolder = null;
                }
                multiGuestDataHolder.LJJIIZI(true);
                InterfaceC954180awC interfaceC954180awCLLJLL5 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL5 != null) {
                    interfaceC954180awCLLJLL5.LJJL(Boolean.FALSE, "business_mute_host_on_resume_and_no_guest", null);
                }
                C784440Upu.LIZ().LIZIZ(new C465900IOu(40));
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LC0(MultiLiveAnchorMuteVideoEvent.class, new C0UI0(true, "business_mute_host_on_resume_and_no_guest"));
                }
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(AnchorOpenCameraEvent.class, new C927820aFg(false, "end_link_and_no_guest"));
                }
            }
        }
    }

    public final void z1() {
        DataChannel dataChannel;
        if (!C758560TpG.LIZ() || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.BQ2(this, ShowPlaybookPlayToolPage.class, new AwS594S0100000_15(this, 152));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final MultiLiveAsAnchorListDialogV2 eZ0() {
        return this.LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0aEr] */
    public MultiGuestV3AnchorWidget(FrameLayout frameLayout) throws IllegalAccessException {
        C927250aEl c927250aEl;
        this.LL = frameLayout;
        if (!C931790aM5.LIZIZ() && !C917810ZzX.LJIIIIZZ()) {
            c927250aEl = new C927250aEl();
            C936430aTZ.LIZ = true;
        } else {
            c927250aEl = null;
        }
        this.LLJJIJI = c927250aEl;
        this.LLJJIJIL = new AwS594S0100000_15(this, 153);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(50));
        this.LLJL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(53));
        this.LLJLIL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(52));
        this.LLJLILLLLZIIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 168));
        this.LLJLL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 169));
        this.LLJLLIL = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 167));
        this.LLJLLL = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(51));
        this.LLJZ = new InterfaceC915240ZvO() { // from class: X.0aEr
            @Override // X.InterfaceC915240ZvO
            public final void LIZ(int i) {
                this.LIZ.P1();
            }
        };
        C948450amx.LIZIZ.LIZLLL(this);
    }

    @Override // X.InterfaceC921460a5Q
    public final void B2(List<LinkPlayerInfo> list) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22;
        if (isViewValid() && (multiLiveAsAnchorListDialogV2 = this.LLILLL) != null && multiLiveAsAnchorListDialogV2.isShowing() && (multiLiveAsAnchorListDialogV22 = this.LLILLL) != null) {
            multiLiveAsAnchorListDialogV22.B2(list);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void FE0(Throwable th) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.LLD();
            C501540Jlg.LIZLLL(multiLiveAsAnchorListDialogV2.getContext(), th, 2131853465);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void Gv(String str) {
        C930480aJy.LJJIJIL(C497740JfY.LJIJJ(2131842749, str), "pm_live_guestrejectnoti");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void Lc2(C977800bYI c977800bYI) {
        FragmentManager fragmentManager;
        LinkDialog linkDialog;
        if (this.LLJJIJIIJIL == null) {
            LinkDialog linkDialogLJ = C977650bY3.LJ(this, c977800bYI);
            this.LLJJIJIIJIL = linkDialogLJ;
            linkDialogLJ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 2));
        }
        C919310a1x.LIZ("MultiGuestV3AnchorWidget", "showLayoutSettingDialog");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (linkDialog = this.LLJJIJIIJIL) != null) {
            linkDialog.show(fragmentManager, "LinkDialog");
        }
    }

    @Override // X.InterfaceC927340aEu
    public final void N(LinkLayoutMessage linkLayoutMessage) {
        MultiLiveSettingDialog multiLiveSettingDialog;
        if (linkLayoutMessage.channelId != C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ())) {
            return;
        }
        LinkDialog linkDialog = this.LLJJIJIIJIL;
        if (linkDialog != null) {
            InterfaceC980100bc0 interfaceC980100bc0OR = linkDialog.OR();
            InteractDialogFragmentBaseContract$AbsView<?> interactDialogFragmentBaseContract$AbsViewLIZLLL = null;
            if (interfaceC980100bc0OR != null) {
                interactDialogFragmentBaseContract$AbsViewLIZLLL = interfaceC980100bc0OR.LIZLLL();
            }
            if ((interactDialogFragmentBaseContract$AbsViewLIZLLL instanceof MultiLiveSettingDialog) && (multiLiveSettingDialog = (MultiLiveSettingDialog) interactDialogFragmentBaseContract$AbsViewLIZLLL) != null) {
                multiLiveSettingDialog.yS(linkLayoutMessage);
                return;
            }
            return;
        }
        InterfaceC963450bB9 interfaceC963450bB9 = new InterfaceC963450bB9() { // from class: X.0aEq
            @Override // X.InterfaceC963450bB9
            public final void Ja(InterfaceC21506019Ek interfaceC21506019Ek) {
            }

            @Override // X.InterfaceC963450bB9
            public final void Rn(EnumC977660bY4 enumC977660bY4, AbstractC934930aR9 abstractC934930aR9) {
            }

            @Override // X.InterfaceC963450bB9
            public final void Vh(C978980baC c978980baC) {
            }

            @Override // X.InterfaceC963450bB9
            public final void dismiss() {
            }

            @Override // X.InterfaceC963450bB9
            public final View getRootView() {
                return null;
            }

            @Override // X.InterfaceC963450bB9
            public final Window getWindow() {
                return null;
            }

            @Override // X.InterfaceC963450bB9
            public final void uC(int i, int i2) {
            }

            @Override // X.InterfaceC963450bB9
            public final void vd(int i) {
            }

            @Override // X.InterfaceC963450bB9
            public final LifecycleOwner getLifecycleOwner() {
                return this.LL;
            }
        };
        DataChannel dataChannel = this.dataChannel;
        C934880aR4 c934880aR4 = new C934880aR4();
        c934880aR4.LIZIZ = false;
        c934880aR4.LIZJ = false;
        if (dataChannel != null) {
            c934880aR4.LIZ = dataChannel;
        }
        C934770aQt.LIZ(interfaceC963450bB9, c934880aR4).yS(linkLayoutMessage);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void VP0(C922130a6V c922130a6V) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        if (c922130a6V != null && (multiLiveAsAnchorListDialogV2 = this.LLILLL) != null) {
            multiLiveAsAnchorListDialogV2.onEvent(c922130a6V);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void rM0(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.rM0(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void ud1(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.ud1(j);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void vP1(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null && multiLiveAsAnchorListDialogV2.LLIZLLLIL) {
            multiLiveAsAnchorListDialogV2.s = true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void yJ0(long j) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null && multiLiveAsAnchorListDialogV2.LLIZLLLIL && multiLiveAsAnchorListDialogV2.isShowing()) {
            multiLiveAsAnchorListDialogV2.dismiss();
            C785410UrT.LIZ(multiLiveAsAnchorListDialogV2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void D2(long j, String str) {
        IWindowAbility iWindowAbilityLIZJ;
        C941500abk c941500abk;
        if (C931790aM5.LIZIZ() && (c941500abk = this.LLJZIJLIL) != null) {
            c941500abk.LIZ().D2(j, str);
        }
        C927250aEl c927250aEl = this.LLJJIJI;
        if (c927250aEl != null && (iWindowAbilityLIZJ = c927250aEl.LIZJ()) != null) {
            iWindowAbilityLIZJ.D2(j, str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void TP1(long j, Throwable th) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.TP1(j, th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q, X.InterfaceC921510a5V
    public final void Zh(long j, boolean z) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.Zh(j, z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void of0(long j, Throwable th) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
        if (multiLiveAsAnchorListDialogV2 != null) {
            multiLiveAsAnchorListDialogV2.of0(j, th);
        }
    }

    public final void I1(String str, String str2, Map<String, String> map) {
        if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup() && str.length() > 0) {
            C921520a5W c921520a5W = this.LLILLJJLI;
            if (c921520a5W != null) {
                c921520a5W.LJLJL(str, str2, map);
                return;
            }
            return;
        }
        C921520a5W c921520a5W2 = this.LLILLJJLI;
        if (c921520a5W2 == null) {
            return;
        }
        c921520a5W2.LJJLIIIJLLLLLLLZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1(com.bytedance.android.livesdkapi.depend.model.live.Room r12, boolean r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget.J1(com.bytedance.android.livesdkapi.depend.model.live.Room, boolean, java.lang.String):void");
    }

    @Override // X.InterfaceC921460a5Q
    public final void OU0(String str, String str2, Map map) {
        C921520a5W c921520a5W;
        int i;
        DataChannel dataChannel;
        InterfaceC302401Fe interfaceC302401FeLJJL;
        C921520a5W c921520a5W2;
        if (isViewValid() && (c921520a5W = this.LLILLJJLI) != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder == null) {
                multiGuestDataHolder = null;
            }
            C927330aEt c927330aEt = this.LLILZLL;
            if (c927330aEt != null) {
                i = c927330aEt.LIZ;
            } else {
                i = -1;
            }
            multiGuestDataHolder.LJJJJJ = i;
            if (this.LLILLL == null) {
                Context context = this.context;
                C921520a5W c921520a5W3 = this.LLILLJJLI;
                if (c921520a5W3 != null) {
                    dataChannel = c921520a5W3.LLILZ;
                } else {
                    dataChannel = null;
                }
                LifecycleOwner rootLifeCycleOwner = this.widgetCallback.getRootLifeCycleOwner();
                if (LinkmicUserManagerReservationFixSetting.INSTANCE.isEnabled() && (c921520a5W2 = this.LLILLJJLI) != null) {
                    interfaceC302401FeLJJL = c921520a5W2.LJJL();
                } else {
                    interfaceC302401FeLJJL = null;
                }
                this.LLILLL = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c921520a5W, rootLifeCycleOwner, interfaceC302401FeLJJL, 8);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV2 != null) {
                multiLiveAsAnchorListDialogV2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 12));
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV22 != null) {
                multiLiveAsAnchorListDialogV22.LLJJJJLIIL(str);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV23 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV23 != null) {
                multiLiveAsAnchorListDialogV23.LLJJIJIIJIL(str2, map);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[QC_BATCH_INVITE_V1] widget showDialog requestPage=");
            sbLIZ.append(str);
            sbLIZ.append(" enterFrom=");
            sbLIZ.append(str2);
            C20441214yg.LJIIIZ("MultiGuestV3AnchorWidget", C2188811AlT.LIZIZ(sbLIZ));
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV24 = this.LLILLL;
            if (multiLiveAsAnchorListDialogV24 != null) {
                C786410Ut5.G4(multiLiveAsAnchorListDialogV24);
            }
            C921520a5W c921520a5W4 = this.LLILLJJLI;
            if (c921520a5W4 != null) {
                c921520a5W4.LLJI = map;
            }
            this.LLILZLL = null;
            C501440JlW c501440JlW = (C501440JlW) this.LLJLLL.getValue();
            c501440JlW.getClass();
            if (!MultiGuestRecommendRoomAb.INSTANCE.isEnable()) {
                C472820IgS.LIZ("not in ab group!");
            } else {
                c501440JlW.LIZ();
                c501440JlW.LIZ++;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.BaseMultiGuestV3AnchorWidget, X.InterfaceC921460a5Q
    public final void XP(String str, String str2, String str3) {
        String str4;
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null || str2 == null) {
            return;
        }
        C766270U4b.LJIIIIZZ(((long) MultiGuestPreApproveConfigSetting.getAnchorToastDuration()) * 1000, contextLJII, str2);
        if (LiveSdkMultiGuestToastWithAppLogSetting.INSTANCE.isEnable()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
            c474500IjALIZ.LJJII(C930540aK4.LJIIJ(), "room_id");
            C930480aJy.LIZ.getClass();
            c474500IjALIZ.LJJII(Long.valueOf(C930480aJy.LJIIIZ()), "anchor_id");
            if (C930540aK4.LIZJ()) {
                str4 = "anchor";
            } else {
                str4 = "user";
            }
            c474500IjALIZ.LJJII(str4, "user_type");
            c474500IjALIZ.LJJII(str, "msg_id");
            c474500IjALIZ.LJJII(str2, "msg_content");
            c474500IjALIZ.LJJII(str3, "extra");
            c474500IjALIZ.LJJII(Integer.valueOf(C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ())), "guest_cnt");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC934310aQ9
    public final void f0(String str, String str2, Map<String, String> map) {
        I1("guest_icon", str2, map);
        if (C915980Zwa.LJIIIIZZ().LLJLL() == null) {
            C1304660k3U c1304660k3U = C1304660k3U.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hasOpt: ");
            sbLIZ.append(MultiGuestSdkRtcInitErrorLinkOptSetting.INSTANCE.isOpt());
            sbLIZ.append("; isRust: true");
            c1304660k3U.LIZ(604, C2188811AlT.LIZIZ(sbLIZ), null);
            C927960aFu.LIZ("anchorSessionNull");
        }
    }
}

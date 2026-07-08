package X;

import X.InterfaceC917640ZzG;
import Y.AObjectS530S0100000_15;
import Y.ARunnableS112S0100000_12;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.os.Parcel;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractCallPlayerEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplyFailedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestReplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestStartRtcJoinChannelEvent;
import com.bytedance.android.live.liveinteract.api.LinkMicAudienceCancelEvent;
import com.bytedance.android.live.liveinteract.gamelink.api.GameLinkApi;
import com.bytedance.android.live.liveinteract.gamelink.fragment.GameLinkMediaManagePanel;
import com.bytedance.android.live.liveinteract.gamelink.helper.ViewerLimitViolation;
import com.bytedance.android.live.liveinteract.gamelink.model.DobDialogCanceledEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.EditBirthFailedWithoutConfirm;
import com.bytedance.android.live.liveinteract.gamelink.model.EditBirthSucc;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkDataHolder;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkStateChangeEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.GuestDisconnectByWindowEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.ShowGuestDisconnectDialogEvent;
import com.bytedance.android.live.liveinteract.gamelink.utils.GameLinkPreviewPanelCloseEvent;
import com.bytedance.android.live.liveinteract.gamelink.utils.GameLinkPreviewPanelOpenEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3GuestOpenLiveSettingEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.AnchorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestJoinChannelWhenAnchorPermitEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestReplyAnchorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.RealGoLivePreviewDestroyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.BeInvitedDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.room.GuestCopyrightViolationEvent;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.dataChannel.LimitRoomVisibilityData;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionOptDelaySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionOptInitSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteBluetoothPermissionRequestGuestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.MultiGuestCallPlayerEventOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestPauseTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestDisconnectFeedbackUrlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLinkButtonSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS299S0000000_15;
import kotlin.jvm.internal.AwS155S0110000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.StateReqCommon;
import tikcast.linkmic.controller.AckStateReq;
import tikcast.linkmic.controller.ChangeStateReq;
import webcast.im.LinkStateMessage;

/* JADX INFO: renamed from: X.0a98, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923760a98 extends AbstractC923750a97 implements OnMessageListener, WeakHandler.IHandler {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public final InterfaceC924460aAG LL;
    public final DataChannel LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public InterfaceC923890a9L LLILZLL;
    public WeakHandler LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C923950a9R LLJI;
    public final C11PQ<Boolean> LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public Boolean LLJJI;
    public EnumC923180a8C LLJJIII;
    public InterfaceC920780a4K LLJJIJI;
    public final C924790aAn LLJJIJIIJIL;
    public GameLinkMediaManagePanel LLJJIJIL;
    public MultiGuestV3GuestBeInvitedDialog LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public C924440aAE LLJJL;
    public C925480aBu LLJJLIIIJLLLLLLLZ;
    public final AtomicLong LLJL;
    public int LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public C923840a9G LLJLL;
    public final C505701y3 LLJLLIL;
    public final C923530a8l LLJLLL;
    public final C923590a8r LLJZ;

    @InterfaceC948490an1(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
    public InterfaceC917640ZzG userManager;

    public final StateReqCommon LJJJJLI() {
        String strU3;
        Long lLJIILIIL;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        StateReqCommon stateReqCommon = new StateReqCommon();
        stateReqCommon.scene = this.LL.scene();
        InterfaceC954180awC interfaceC954180awCLLJLL = this.LL.LLJLL();
        stateReqCommon.channelId = (interfaceC954180awCLLJLL == null || (strU3 = interfaceC954180awCLLJLL.U3()) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) == null) ? 0L : lLJIILIIL.longValue();
        stateReqCommon.appId = iHostAppContext.appId();
        stateReqCommon.liveId = iHostAppContext.liveId();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        stateReqCommon.myself = new Player(roomLJJLI != null ? roomLJJLI.getId() : 0L, UserService.getInstance().user().getCurrentUserId());
        return stateReqCommon;
    }

    public final GameLinkDataHolder LJJJLZIJ() {
        return (GameLinkDataHolder) this.LLILZ.getValue();
    }

    public final void detachGoLiveOptPresenter() {
        C924440aAE c924440aAE = this.LLJJL;
        if ((c924440aAE instanceof AbstractC945390ai1) && c924440aAE != null) {
            c924440aAE.detachView();
        }
        C925480aBu c925480aBu = this.LLJJLIIIJLLLLLLLZ;
        if (!(c925480aBu instanceof AbstractC945390ai1) || c925480aBu == null) {
            return;
        }
        c925480aBu.detachView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        C20441214yg.LJIIIZ("GameLinkGuestPresenter", "detachView");
        if (C924250a9v.LIZ().LJJLIIIJLLLLLLLZ == 0) {
            C924810aAp.LJ().LJIIIIZZ = false;
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null) {
            num.intValue();
        }
        InterfaceC923040a7y interfaceC923040a7yHe = this.LL.He();
        if (interfaceC923040a7yHe != null) {
            interfaceC923040a7yHe.LJ(this.LLJLLL);
        }
        ((C11NJ) this.LLJLILLLLZIIL.getValue()).LJ();
        this.LLILLJJLI.zQ2(this);
        detachGoLiveOptPresenter();
        C474640IjO.LIZIZ = null;
        C474640IjO.LIZJ = null;
        C474640IjO.LIZLLL = null;
        C474640IjO.LJ = null;
        C474640IjO.LJFF = null;
        C474640IjO.LIZ = null;
        if (C924250a9v.LIZ().LJJLIIIJLLLLLLLZ == 0) {
            stopInteract("leave_with_detach_view", false, false, 0);
            resetStateToNormal();
        }
        WeakHandler weakHandler = this.LLIZ;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        C923840a9G c923840a9G = this.LLJLL;
        if (c923840a9G != null) {
            C944640ago c944640ago = (C944640ago) this.LLILZIL.getValue();
            if (((ArrayList) c944640ago.LL).contains(c923840a9G)) {
                ((ArrayList) c944640ago.LL).remove(c923840a9G);
            }
        }
        C944640ago c944640ago2 = (C944640ago) this.LLILZIL.getValue();
        C505701y3 c505701y3 = this.LLJLLIL;
        if (((ArrayList) c944640ago2.LL).contains(c505701y3)) {
            ((ArrayList) c944640ago2.LL).remove(c505701y3);
        }
        ((C0J9Y) this.LLJ.getValue()).LIZLLL(this.LLJI);
        ((C0J9Y) this.LLJ.getValue()).LJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameLinkGuestPresenter");
        sbLIZ.append(hashCode());
        C0IK5.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
        super.detachView();
    }

    public final void dismissGuestBeInvitedDialog() {
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = this.LLJJJ;
        boolean z = false;
        if (multiGuestV3GuestBeInvitedDialog != null && multiGuestV3GuestBeInvitedDialog.isShowing()) {
            z = true;
        }
        if (z) {
            MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2 = this.LLJJJ;
            if (multiGuestV3GuestBeInvitedDialog2 != null) {
                multiGuestV3GuestBeInvitedDialog2.dismiss();
            }
            this.LLJJJ = null;
        }
        this.LLJJJJ = null;
        this.LLJJJIL = null;
    }

    public final String getInteractId() {
        RtcUserInfo rtcUserInfoG0;
        InterfaceC954180awC interfaceC954180awCLLJLL = this.LL.LLJLL();
        if (interfaceC954180awCLLJLL == null || (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) == null) {
            return null;
        }
        return rtcUserInfoG0.linkMicId;
    }

    @Override // X.AbstractC923750a97
    public final Unit getWaitingList() {
        C20441214yg.LIZIZ("GameLinkGuestPresenter", "we don't need this");
        return Unit.LIZ;
    }

    public final boolean isEngineOn() {
        return this.LL.LLJLLIL() == 5 || this.LL.LLJLLIL() == 4;
    }

    @Override // X.AbstractC923750a97
    public final void onEnterBackground() throws JSONException {
        C20441214yg.LJIIIZ("GameLinkGuestPresenter", "onEnterBackground");
        this.LLJILLL = true;
        this.LLJJ = false;
        if (isEngineOn()) {
            C20441214yg.LJFF("GameLinkGuestPresenter", "onEnterBackground, isEngineOn: true", null);
            LJJJLZIJ().getClass();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.LC0(GameLinkGuestMuteAudioEvent.class, new C922430a6z(false, "business_mute_enter_background"));
            }
            InterfaceC954180awC interfaceC954180awCLLJLL = this.LL.LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.pause();
            }
            InterfaceC923890a9L interfaceC923890a9L = this.LLILZLL;
            if (interfaceC923890a9L != null) {
                interfaceC923890a9L.LJIILL(CertProviderManagerKt.findCert("bpea-game_linkmic_guestpre_onenterbackground", 1476788484));
            }
            C944720agw.LJIIJ("guest_pause");
            C923850a9H.LIZ("guest_pause");
        } else {
            C20441214yg.LJFF("GameLinkGuestPresenter", "onEnterBackground, isEngineOn: false", null);
        }
        if (C500260Jjc.LJJIJIIJIL(this.LLJJI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEnterBackgroundExecuteOncePart, hadEnterBackgroundOnce: ");
            sbLIZ.append(this.LLJJI);
            C20441214yg.LJFF("GameLinkGuestPresenter", C2188811AlT.LIZIZ(sbLIZ), null);
            this.LLJJI = Boolean.TRUE;
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) this.mView;
            boolean zLJJJI = C500260Jjc.LJJJI(interfaceC923600a8s != null ? Boolean.valueOf(interfaceC923600a8s.md()) : null);
            Room room = this.room;
            if (C924810aAp.LJ().LJJII > 0 && !zLJJJI) {
                C923050a7z.LIZIZ(null, room, 3);
            }
            if (isEngineOn()) {
                C20441214yg.LJFF("GameLinkGuestPresenter", "sendMsgCloseInteractDelayed", null);
                WeakHandler weakHandler = this.LLIZ;
                if (weakHandler != null) {
                    weakHandler.sendEmptyMessageDelayed(140000, LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    @Override // X.AbstractC923750a97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEnterForeground() {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923760a98.onEnterForeground():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0011 A[PHI: r1
      0x0011: PHI (r1v1 X.0a9L) = (r1v0 X.0a9L), (r1v14 X.0a9L) binds: [B:3:0x0002, B:5:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pushStreamForPreviewAhead() {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923760a98.pushStreamForPreviewAhead():void");
    }

    @Override // X.AbstractC923750a97
    public final void releaseLiveVideoClient() {
        InterfaceC923890a9L interfaceC923890a9L = this.LLILZLL;
        if (interfaceC923890a9L != null) {
            interfaceC923890a9L.release(CertProviderManagerKt.findCert("bpea-game_linkmic_guestpre_releaselivevideoclient", 1476788483));
        }
        this.LLILZLL = null;
    }

    public final void resetStateToNormal() {
        this.LLILLJJLI.LC0(MultiGuestCallPlayerEventOptSetting.getValue() ? InteractCallPlayerEvent.class : InteractStateChangeEvent.class, new C924400aAA(4));
        C924790aAn.LIZLLL().LJII(0);
        T t = this.mView;
        if (t == 0) {
            return;
        }
        this.LLIZLLLIL = false;
        InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) t;
        if (interfaceC923600a8s != null) {
            interfaceC923600a8s.FG2();
        }
    }

    public final InterfaceC923890a9L LJJJLIIL() {
        InterfaceC923870a9J interfaceC923870a9J;
        if (LJJJLZIJ().LJJJJZ != null) {
            InterfaceC923890a9L interfaceC923890a9L = LJJJLZIJ().LJJJJZ;
            if ((interfaceC923890a9L instanceof InterfaceC923870a9J) && (interfaceC923870a9J = (InterfaceC923870a9J) interfaceC923890a9L) != null && !interfaceC923870a9J.LJFF()) {
                this.LLILZLL = LJJJLZIJ().LJJJJZ;
                return LJJJLZIJ().LJJJJZ;
            }
        }
        LJJJLZIJ();
        C758340Tou c758340Tou = new C758340Tou();
        C924790aAn.LIZLLL();
        c758340Tou.LIZ = C924790aAn.LIZLLL().LJFF;
        c758340Tou.LIZLLL = 1;
        c758340Tou.LJFF = false;
        c758340Tou.LJ = false;
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null) {
            return null;
        }
        InterfaceC923890a9L interfaceC923890a9LCreateLinkVideoView = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createLinkVideoView(contextLJII, c758340Tou, null, this.dataChannel);
        this.LLILZLL = interfaceC923890a9LCreateLinkVideoView;
        return interfaceC923890a9LCreateLinkVideoView;
    }

    public final long getUserId() {
        return UserService.getInstance().user().getCurrentUserId();
    }

    public final void turnOffEngine() {
        C924810aAp.LJ().LJII();
        C944230ag9.LIZIZ("LinkIn_turnOffEngine", "");
        if (C924650aAZ.LJ != null) {
            HashMap map = new HashMap();
            C924650aAZ.LIZ(map);
            map.put("trigger", "connection_end");
            EnumC918970a1P enumC918970a1P = C924650aAZ.LJ;
            C924650aAZ.LJ = null;
            map.put("layout_setting", C924650aAZ.LJ().getFirst());
            map.put("window_setting", C924650aAZ.LJ().getSecond());
            map.put("duration", String.valueOf(System.currentTimeMillis() - C924650aAZ.LJFF));
            C924650aAZ.LJIILLIIL("livesdk_multilive_mode_connection_duration", null, map);
            if (enumC918970a1P != C924650aAZ.LIZJ) {
                C924650aAZ.LJIILJJIL("connection_end", enumC918970a1P);
            }
        }
        releaseLiveVideoClient();
    }

    @Override // X.AbstractC923750a97
    public final InterfaceC917640ZzG getUserManager() {
        return this.userManager;
    }

    public static String LJJJZ(Throwable th) {
        if (!(th instanceof C501470JlZ)) {
            if (th != null) {
                return th.getMessage();
            }
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errMsg:");
        C501470JlZ c501470JlZ = (C501470JlZ) th;
        sbLIZ.append(c501470JlZ.getMessage());
        sbLIZ.append(", errCode:");
        sbLIZ.append(c501470JlZ.getErrorCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.0a9G, java.lang.Object] */
    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1
    public final void attachView(InterfaceC923600a8s interfaceC923600a8s) {
        Context context;
        Context context2;
        DataChannel dataChannel;
        Pair pair;
        AbstractC923560a8o abstractC923560a8oLIZ;
        super.attachView(interfaceC923600a8s);
        C20441214yg.LJIIIZ("GameLinkGuestPresenter", "attachView");
        this.LLIZ = new WeakHandler(this);
        InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
        if (interfaceC919320a1y != null) {
            context = interfaceC919320a1y.getContext();
        } else {
            context = null;
        }
        C924440aAE c924440aAE = new C924440aAE(context, this.LL, this);
        c924440aAE.attachView(interfaceC923600a8s);
        this.LLJJL = c924440aAE;
        C925480aBu c925480aBu = new C925480aBu(this.LL, this);
        c925480aBu.attachView(interfaceC923600a8s);
        this.LLJJLIIIJLLLLLLLZ = c925480aBu;
        C924810aAp.LJ().LJIIIIZZ = true;
        InterfaceC923040a7y interfaceC923040a7yHe = this.LL.He();
        if (interfaceC923040a7yHe != null) {
            interfaceC923040a7yHe.LIZJ(this.LLJLLL);
        }
        InterfaceC923040a7y interfaceC923040a7yHe2 = this.LL.He();
        if (interfaceC923040a7yHe2 != null && interfaceC923040a7yHe2.isInit()) {
            InterfaceC923040a7y interfaceC923040a7yHe3 = this.LL.He();
            if (interfaceC923040a7yHe3 != null && (abstractC923560a8oLIZ = interfaceC923040a7yHe3.LIZ()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = abstractC923560a8oLIZ.LIZLLL().iterator();
                while (it2.hasNext()) {
                    arrayList.add(C925050aBD.LIZ((LinkListUser) it2.next()));
                }
                InterfaceC923600a8s interfaceC923600a8s2 = (InterfaceC923600a8s) this.mView;
                if (interfaceC923600a8s2 != null) {
                    interfaceC923600a8s2.B2(arrayList);
                }
            }
        } else {
            InterfaceC923040a7y interfaceC923040a7yHe4 = this.LL.He();
            if (interfaceC923040a7yHe4 != null) {
                interfaceC923040a7yHe4.init();
            }
        }
        IMessageManager iMessageManager = (IMessageManager) this.LLILLJJLI.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.PERCEPTION_MESSAGE.getIntType(), this);
        }
        ?? r1 = new C924150a9l() { // from class: X.0a9G
            /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[PHI: r5
              0x0081: PHI (r5v1 java.lang.Long) = (r5v0 java.lang.Long), (r5v4 java.lang.Long) binds: [B:23:0x007e, B:8:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC944660agq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(com.bytedance.android.livesdk.model.message.LinkMessage r9) {
                /*
                    Method dump skipped, instruction units count: 503
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C923840a9G.LIZIZ(com.bytedance.android.livesdk.model.message.LinkMessage):void");
            }
        };
        this.LLJLL = r1;
        ((ArrayList) ((C944640ago) this.LLILZIL.getValue()).LL).add(r1);
        ((ArrayList) ((C944640ago) this.LLILZIL.getValue()).LL).add(this.LLJLLIL);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.mView;
        if (lifecycleOwner != null) {
            DataChannelGlobal.LLILZ.BQ2(lifecycleOwner, lifecycleOwner, MultiGuestLiveSuspended.class, new AwS594S0100000_15(this, 759));
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        dataChannel2.CQ2(LinkInRoomGuestStartRtcJoinChannelEvent.class, this, new AwS594S0100000_15(this, 760));
        dataChannel2.CQ2(MultiGuestV3GuestOpenLiveSettingEvent.class, this, new AwS594S0100000_15(this, 761));
        dataChannel2.CQ2(LinkInRoomGuestReplySucceedEvent.class, this, new AwS594S0100000_15(this, 762));
        dataChannel2.CQ2(LinkInRoomGuestReplyFailedEvent.class, this, new AwS594S0100000_15(this, 763));
        dataChannel2.CQ2(LinkMicAudienceCancelEvent.class, this, new AwS594S0100000_15(this, 764));
        dataChannel2.CQ2(GameLinkGuestMuteAudioEvent.class, this, new AwS594S0100000_15(this, 745));
        dataChannel2.CQ2(GuestDisconnectByWindowEvent.class, this, new AwS594S0100000_15(this, 746));
        dataChannel2.CQ2(ShowGuestDisconnectDialogEvent.class, this, new AwS594S0100000_15(this, 747));
        dataChannel2.CQ2(DobDialogCanceledEvent.class, this, new AwS594S0100000_15(this, 748));
        dataChannel2.CQ2(EditBirthSucc.class, this, new AwS594S0100000_15(this, 749));
        dataChannel2.CQ2(EditBirthFailedWithoutConfirm.class, this, new AwS594S0100000_15(this, 750));
        dataChannel2.CQ2(LiveEndEvent.class, this, new AwS594S0100000_15(this, 751));
        dataChannel2.CQ2(AnchorPermitGuestEvent.class, this, new AwS594S0100000_15(this, 752));
        dataChannel2.CQ2(GuestReplyAnchorEvent.class, this, new AwS594S0100000_15(this, 753));
        dataChannel2.CQ2(GuestJoinChannelWhenAnchorPermitEvent.class, this, new AwS594S0100000_15(this, 754));
        dataChannel2.CQ2(GameLinkPreviewPanelOpenEvent.class, this, new AwS594S0100000_15(this, 755));
        dataChannel2.CQ2(GameLinkPreviewPanelCloseEvent.class, this, new AwS594S0100000_15(this, 756));
        dataChannel2.CQ2(RealGoLivePreviewDestroyEvent.class, this, new AwS594S0100000_15(this, 757));
        dataChannel2.CQ2(GuestCopyrightViolationEvent.class, this, new AwS594S0100000_15(this, 758));
        User owner = this.room.getOwner();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((LinkApi) C480460Ism.LIZLLL(LinkApi.class)).isShowGuestLinkHint(this.room.getId(), owner.getId(), owner.getSecUid(), true).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(autoDispose())).LIZ(new AfS184S0100000_15(this, 138), new C09JN() { // from class: X.00Kj
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GameLinkV2GuestPresenter@40ad.requestGuestLinkHintSetting$2");
                C1C7U.LIZIZ("GameLinkV2GuestPresenter@40ad.requestGuestLinkHintSetting$2");
            }
        });
        this.LL.Fe(this.LLJZ);
        if (!LiveGameLinkButtonSetting.INSTANCE.isExperimentGroup() && (dataChannel = this.dataChannel) != null && (pair = (Pair) dataChannel.gg0(C956720b0I.class)) != null) {
            this.LLJZ.LLJJL((InterfaceC954180awC) pair.getFirst(), (InviteMessage) pair.getSecond());
        }
        long id = this.room.getId();
        long ownerUserId = this.room.getOwnerUserId();
        int i = C944850ah9.LIZ;
        if (C1127020fQy.LIZ(0.1f, "ttlive_multi_guest_v3_open_record")) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("live_type", "live_studio", jSONObject);
            C0K04.LJFF("use_role", "audience", jSONObject);
            C0K04.LJFF("version", String.valueOf(3), jSONObject);
            C0K04.LJFF("room_id", String.valueOf(id), jSONObject);
            C0K04.LJFF("anchor_id", String.valueOf(ownerUserId), jSONObject);
            C1CC2.LJIIIIZZ("ttlive_multi_guest_v3_open_record", 0, jSONObject);
        }
        if (DeleteBluetoothPermissionRequestGuestSetting.INSTANCE.enable()) {
            if (DeleteBluetoothPermissionOptInitSetting.INSTANCE.disable()) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 323);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GameLinkGuestPresenter");
                sbLIZ.append(hashCode());
                C486790J7d.LIZLLL(aRunnableS112S0100000_12, C2188811AlT.LIZIZ(sbLIZ), DeleteBluetoothPermissionOptDelaySetting.INSTANCE.delayDuration());
            }
        } else {
            C779660UiC.LIZ.LJI();
        }
        C0J9Y c0j9y = (C0J9Y) this.LLJ.getValue();
        if (interfaceC923600a8s != null && (context2 = interfaceC923600a8s.getContext()) != null) {
            c0j9y.LIZIZ(context2);
            ((C0J9Y) this.LLJ.getValue()).LIZ(this.LLJI);
        }
    }

    @Override // X.AbstractC923750a97
    public final void cancel(String str) {
        if (!this.LLJILJIL && this.mView != 0) {
            this.LLJILJIL = true;
            BizCancelApplyParams bizCancelApplyParams = new BizCancelApplyParams(this.room.getOwner().getId());
            InterfaceC954180awC interfaceC954180awCLLJLL = this.LL.LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.LJJJJIZL(new C920430a3l(bizCancelApplyParams, 23), new C987190bnR(this, 8));
            }
        }
    }

    @Override // X.AbstractC923750a97
    public final InterfaceC500100JjM<C470590Icr<MultiLiveGuestInfoList>> fetchUserListData(boolean z) {
        long id;
        long ownerUserId;
        boolean z2;
        long jLongValue;
        String strU3;
        Long lLJIILIIL;
        if (this.mView == 0) {
            return null;
        }
        try {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
                ownerUserId = room.getOwnerUserId();
            } else {
                id = 0;
                ownerUserId = 0;
            }
            if (id != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (ownerUserId != 0) {
                    C480460Ism.LIZ().getClass();
                    GameLinkApi gameLinkApi = (GameLinkApi) C480460Ism.LIZLLL(GameLinkApi.class);
                    InterfaceC954180awC interfaceC954180awCLLJLL = this.LL.LLJLL();
                    if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = -1;
                    }
                    return (InterfaceC500100JjM) gameLinkApi.getListByType(id, ownerUserId, jLongValue, C1697810uHb.LJIIJJI(1, 2).toString(), 0, 12).LIZLLL(autoDisposeWithTransformer());
                }
                throw new IllegalStateException("Check failed.");
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Boolean boolValueOf;
        InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) this.mView;
        if (interfaceC923600a8s != null) {
            boolValueOf = Boolean.valueOf(interfaceC923600a8s.isViewValid());
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIJIIJIL(boolValueOf) && message != null && 140000 == message.what) {
            C20441214yg.LJFF("GameLinkGuestPresenter", "handleMsgCloseInteract", null);
            AbstractC923750a97.exitInteractInNormalWay$default(this, "leave_with_background", false, 10013, 2, null);
        }
    }

    public final void leaveAction(boolean z) {
        if (this.mView == 0) {
            return;
        }
        InterfaceC920780a4K interfaceC920780a4K = this.LLJJIJI;
        if (interfaceC920780a4K != null) {
            interfaceC920780a4K.mh();
        }
        C924790aAn.LIZLLL().LIZLLL = 0L;
        resetStateToNormal();
        DataChannel dataChannel = this.dataChannel;
        if (!C925050aBD.LJIIJJI(C925050aBD.LJFF())) {
            C925050aBD.LJII(dataChannel);
        }
        if (z) {
            C924810aAp.LJ().getClass();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        PerceptionMessage perceptionMessage;
        int i;
        PerceptionDialogInfo perceptionDialogInfo;
        InterfaceC919320a1y interfaceC919320a1y;
        C0THQ c0thq;
        Context context;
        boolean z;
        boolean z2;
        PerceptionDialogInfo perceptionDialogInfo2;
        PunishEventInfo punishEventInfo;
        PunishEventInfo punishEventInfo2;
        Integer num;
        long j;
        C0THQ c0thq2 = null;
        LifecycleOwner lifecycleOwner = null;
        if ((iMessage instanceof PerceptionMessage) && (perceptionMessage = (PerceptionMessage) iMessage) != null) {
            DataChannel dataChannel = this.LLILLJJLI;
            PerceptionMessage perceptionMessage2 = (PerceptionMessage) iMessage;
            boolean z3 = true;
            if (perceptionMessage2 != null && (punishEventInfo2 = perceptionMessage2.publicEventInfo) != null && (num = punishEventInfo2.punishTypeId) != null && num.intValue() == 70) {
                PerceptionDialogInfo perceptionDialogInfo3 = perceptionMessage2.dialog;
                if (perceptionDialogInfo3 != null && perceptionDialogInfo3.scene == 21) {
                    if (dataChannel != null) {
                        dataChannel.LC0(LimitRoomVisibilityData.class, Boolean.TRUE);
                        dataChannel.zW(ViewerLimitViolation.class, 0L);
                        dataChannel.zW(IsViewerLimitedStatusChannel.class, Boolean.FALSE);
                    }
                    i = 2;
                } else {
                    if (dataChannel != null) {
                        dataChannel.LC0(LimitRoomVisibilityData.class, Boolean.FALSE);
                        PunishEventInfo punishEventInfo3 = perceptionMessage2.publicEventInfo;
                        if (punishEventInfo3 != null) {
                            j = punishEventInfo3.violationUid;
                        } else {
                            j = 0;
                        }
                        dataChannel.zW(ViewerLimitViolation.class, Long.valueOf(j));
                        dataChannel.zW(IsViewerLimitedStatusChannel.class, Boolean.TRUE);
                    }
                    i = 1;
                }
            } else {
                i = 0;
            }
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onViewerLimitTrigger] res=");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ("ViewerLimit", strLIZIZ, null, null);
            if (i == 1) {
                if (!this.LLIZLLLIL) {
                    return;
                }
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                InterfaceC919320a1y interfaceC919320a1y2 = (InterfaceC919320a1y) this.mView;
                if (interfaceC919320a1y2 != null) {
                    context = interfaceC919320a1y2.getContext();
                } else {
                    context = null;
                }
                T t = this.mView;
                if (t instanceof LifecycleOwner) {
                    lifecycleOwner = (LifecycleOwner) t;
                }
                InterfaceC777420Uea taskDispatcher = getTaskDispatcher();
                AwS629S0100000_15 awS629S0100000_15 = new AwS629S0100000_15(this, 71);
                AFwS299S0000000_15 aFwS299S0000000_15 = AFwS299S0000000_15.get$arr$(25);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[onViewerLimitDialogProcess] context=");
                if (context != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ2.append(z);
                sbLIZ2.append(", lifecycle=");
                if (lifecycleOwner != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sbLIZ2.append(z2);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1azw.getClass();
                C1AZW.LIZ("ViewerLimit", strLIZIZ2, null, null);
                if (context != null && lifecycleOwner != null) {
                    if (currentUserId == 0 || (punishEventInfo = perceptionMessage2.publicEventInfo) == null || punishEventInfo.violationUid != currentUserId) {
                        z3 = false;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[onViewerLimitDialogProcess] isAnchor=");
                    sbLIZ3.append(false);
                    sbLIZ3.append(", selfViolation=");
                    sbLIZ3.append(z3);
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    c1azw.getClass();
                    C1AZW.LIZ("ViewerLimit", strLIZIZ3, null, null);
                    if (!z3 && (perceptionDialogInfo2 = perceptionMessage2.dialog) != null) {
                        C782130UmB.LIZLLL(perceptionDialogInfo2, context, lifecycleOwner, taskDispatcher, awS629S0100000_15, aFwS299S0000000_15, new AwS155S0110000_15(perceptionMessage2, 5), 64);
                        return;
                    }
                    return;
                }
                return;
            }
            if (perceptionMessage2 != null && (perceptionDialogInfo = perceptionMessage2.dialog) != null) {
                int i2 = perceptionDialogInfo.scene;
                if ((i2 != 4 && i2 != 5 && i2 != 7) || (interfaceC919320a1y = (InterfaceC919320a1y) this.mView) == null) {
                    return;
                }
                if (i2 == 7) {
                    c0thq2 = new C0THQ(getUserId(), this.room.getId(), this.dataChannel);
                }
                this.copyrightPerceptionHelper = c0thq2;
                PerceptionDialogInfo perceptionDialogInfo4 = perceptionMessage.dialog;
                if (perceptionDialogInfo4 != null) {
                    C782130UmB.LIZJ(perceptionDialogInfo4, interfaceC919320a1y.getContext(), (LifecycleOwner) this.mView, getTaskDispatcher(), new AObjectS530S0100000_15(this, 5), new AObjectS530S0100000_15(this, 6), new AwS451S0200000_15(perceptionMessage, iMessage, 16), this.dataChannel);
                }
                PerceptionDialogInfo perceptionDialogInfo5 = perceptionMessage2.dialog;
                if (perceptionDialogInfo5 == null || (c0thq = this.copyrightPerceptionHelper) == null) {
                    return;
                }
                c0thq.LIZIZ(perceptionDialogInfo5.countDownTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
        }
    }

    @Override // X.AbstractC923750a97
    public final void setDialogView(InterfaceC920780a4K interfaceC920780a4K) {
        this.LLJJIJI = interfaceC920780a4K;
    }

    @Override // X.AbstractC923750a97
    public final void setUserManager(InterfaceC917640ZzG interfaceC917640ZzG) {
        this.userManager = interfaceC917640ZzG;
    }

    public final void LJJJJLL(ChangeStateReq changeStateReq, Function1<? super Boolean, Unit> function1) {
        changeStateReq.common = LJJJJLI();
        changeStateReq.clientTime = C158B.LIZ();
        C480460Ism.LIZ().getClass();
        ((C0J1N) ((GameLinkApi) C480460Ism.LIZLLL(GameLinkApi.class)).changeState(changeStateReq).LJJLIIIJLJLI(new C23081092p(this.LLJIJIL)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(autoDispose())).LIZ(new C516701zp(function1, this, changeStateReq, 5), new C516201zk(function1, 194));
    }

    @Override // X.AbstractC923750a97
    public final void checkPermissionRealTime$liveinteract_impl_release(int i, C925770aCN c925770aCN) {
        if (i == 1) {
            LJJJJZI(this, 1, false, new AwS629S0100000_15(this, 72), 30);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJL(com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo r13, android.content.Context r14, androidx.lifecycle.LifecycleOwner r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923760a98.LJJL(com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo, android.content.Context, androidx.lifecycle.LifecycleOwner):void");
    }

    @Override // X.AbstractC923750a97
    public final void exitInteractInNormalWay(String str, boolean z, int i) {
        boolean z2;
        C20441214yg.LJIIIZ("GameLinkGuestPresenter", "exitInteractInNormalWay");
        if (this.mView == 0) {
            return;
        }
        if (!Intrinsics.LJFF(str, "leave_source_user_click_cancel_in_preview") && !Intrinsics.LJFF(str, "leave_source_user_timeout_cancel_in_preview")) {
            z2 = false;
        } else {
            z2 = true;
        }
        stopInteract(str, z, z2, i);
    }

    @Override // X.AbstractC923750a97
    public final void exitInteractInNormalWayAfterFeedback(@InterfaceC924010a9X String str, String str2, int i) throws JSONException {
        String str3;
        String strLJIILJJIL;
        InterfaceC924010a9X.LJIIIZ.getClass();
        if (Intrinsics.LJFF(str, "profile_page")) {
            str3 = "quick_leave_normally";
        } else {
            str3 = "leave_normally";
        }
        this.LLJJJJLIIL = str3;
        C924560aAQ c924560aAQ = C924560aAQ.LJIIJ;
        if (c924560aAQ != null) {
            C923920a9O c923920a9O = new C923920a9O(str);
            MultiGuestDisconnectFeedbackUrlSetting multiGuestDisconnectFeedbackUrlSetting = MultiGuestDisconnectFeedbackUrlSetting.INSTANCE;
            boolean zLJJIIZ = C500260Jjc.LJJIIZ(multiGuestDisconnectFeedbackUrlSetting.getUrl());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("canShowFeedbackDialogBeforeDisconnected ");
            sbLIZ.append(zLJJIIZ);
            sbLIZ.append(' ');
            sbLIZ.append(true);
            sbLIZ.append(' ');
            C20441214yg.LJIIIZ("MultiGuestFeedbackController", C2188811AlT.LIZIZ(sbLIZ));
            if (zLJJIIZ) {
                Room room = c924560aAQ.LIZ;
                User user = c924560aAQ.LIZIZ;
                MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c924560aAQ.LJ.getValue();
                if (multiGuestDataHolder != null) {
                    strLJIILJJIL = multiGuestDataHolder.LJIILJJIL();
                } else {
                    strLJIILJJIL = "none";
                }
                c923920a9O.LIZIZ = String.valueOf(user.getId());
                c923920a9O.LIZJ = C0KVU.LIZ(room.getOwner());
                c923920a9O.LIZLLL = String.valueOf(room.getOwnerUserId());
                String idStr = room.getIdStr();
                if (idStr == null) {
                    idStr = "";
                }
                c923920a9O.LJ = idStr;
                c923920a9O.LIZ = 484;
                c923920a9O.LJFF = strLJIILJJIL;
                c923920a9O.LJI = 1;
                C760370TsB c760370TsBLIZIZ = C0KYL.LIZIZ(multiGuestDisconnectFeedbackUrlSetting.getUrl());
                int i2 = c923920a9O.LIZ;
                EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
                c760370TsBLIZIZ.LJIIIZ(i2, enumC760350Ts9);
                c760370TsBLIZIZ.LJIJI(8, enumC760350Ts9);
                c760370TsBLIZIZ.LJJIFFI("guest_id", c923920a9O.LIZIZ);
                c760370TsBLIZIZ.LJJIFFI("room_id", c923920a9O.LJ);
                c760370TsBLIZIZ.LJJIFFI("anchor_id", c923920a9O.LIZLLL);
                c760370TsBLIZIZ.LJJIFFI("disconnection_type", str);
                c760370TsBLIZIZ.LJJIFFI("guest_permission", String.valueOf(c923920a9O.LJFF));
                c760370TsBLIZIZ.LJJIFFI("username", c923920a9O.LIZJ);
                c760370TsBLIZIZ.LJJIFFI("multi_guest_disconnect_feedback", String.valueOf(c923920a9O.LJI));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("linkmic_id", c924560aAQ.LJI);
                jSONObject.put("channel_id", c924560aAQ.LJFF);
                jSONObject.put("room_id", c923920a9O.LJ);
                c760370TsBLIZIZ.LJJIFFI("track_info", C786410Ut5.J3(jSONObject));
                c760370TsBLIZIZ.LJIJJLI("bottom");
                c760370TsBLIZIZ.LJIIIIZZ("bottom");
                c760370TsBLIZIZ.LJIIL(2);
                ((HashMap) c760370TsBLIZIZ.LIZ).put("keyboard_compat", "1");
                Uri uriLIZ = c760370TsBLIZIZ.LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("showFeedbackLynxDialog ");
                sbLIZ2.append(uriLIZ);
                C20441214yg.LJIIIZ("MultiGuestFeedbackController", C2188811AlT.LIZIZ(sbLIZ2));
                c924560aAQ.LIZ();
                c924560aAQ.LJIIIIZZ = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(c924560aAQ.LIZJ, uriLIZ.toString(), null);
                InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) this.mView;
                if (interfaceC923600a8s != null) {
                    interfaceC923600a8s.l9();
                    return;
                }
                return;
            }
        }
        AbstractC923750a97.exitInteractInNormalWay$default(this, String.valueOf(this.LLJJJJLIIL), false, i, 2, null);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.01y3] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0a8l] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0a9R] */
    public C923760a98(LifecycleOwner lifecycleOwner, InterfaceC924460aAG interfaceC924460aAG, final Room room, DataChannel dataChannel) {
        long jLongValue;
        String strU3;
        Long lLJIILIIL;
        super(room, dataChannel, lifecycleOwner);
        this.LL = interfaceC924460aAG;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(290));
        this.LLILZIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(289));
        this.LLJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(282));
        this.LLJI = new InterfaceC473790Ii1() { // from class: X.0a9R
            @Override // X.InterfaceC473790Ii1
            public final void LIZ(EnumC804620VhM enumC804620VhM) {
                this.LIZ.LLJIJIL.onNext(Boolean.valueOf(enumC804620VhM.isAvailable()));
            }
        };
        this.LLJIJIL = new C11PQ<>();
        if (interfaceC924460aAG.He() == null) {
            interfaceC924460aAG.Oe(lifecycleOwner, dataChannel);
        }
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        InterfaceC954180awC interfaceC954180awCLLJLL = interfaceC924460aAG.LLJLL();
        if (interfaceC954180awCLLJLL != null && (strU3 = interfaceC954180awCLLJLL.U3()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strU3)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LJFF(new GuestBusinessUserManager(room, jLongValue, iMessageManager, lifecycleOwner), "MULTI_GUEST_V3_GUEST_USER_MANAGER");
        c948450amx.LIZJ(this);
        LJJJLZIJ().LJJJLL = 2;
        InterfaceC917640ZzG interfaceC917640ZzG = this.userManager;
        if (interfaceC917640ZzG != null) {
            interfaceC917640ZzG.LJIILIIL(LJJJLZIJ());
        }
        this.LLJJIII = EnumC923180a8C.NONE;
        this.LLJJIJIIJIL = C924790aAn.LIZLLL();
        this.LLJJJJJIL = "";
        this.LLJL = new AtomicLong(0L);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(287));
        this.LLJLLIL = new InterfaceC505801y4() { // from class: X.01y3
            @Override // X.InterfaceC505801y4
            public final void LJIILLIIL(LinkStateMessage linkStateMessage) {
                AbstractC923560a8o abstractC923560a8oLIZ;
                User user;
                C923760a98 c923760a98 = this.LIZ;
                if (c923760a98.LLJL.get() < linkStateMessage.version) {
                    c923760a98.LLILLJJLI.LC0(GameLinkStateChangeEvent.class, linkStateMessage);
                    for (LinkUserState linkUserState : linkStateMessage.userStates) {
                        String str = linkUserState.linkmicId;
                        Room room2 = c923760a98.room;
                        InterfaceC923040a7y interfaceC923040a7yHe = c923760a98.LL.He();
                        if (interfaceC923040a7yHe != null && (abstractC923560a8oLIZ = interfaceC923040a7yHe.LIZ()) != null) {
                            LinkListUser linkListUserLIZJ = C923010a7v.LIZJ(abstractC923560a8oLIZ, str);
                            boolean z = false;
                            if (linkListUserLIZJ != null && (user = linkListUserLIZJ.user) != null && room2.getOwnerUserId() == user.getId()) {
                                if (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(c923760a98.room.getId())) && linkUserState.audioMuted == 2) {
                                    z = true;
                                }
                                c923760a98.LLILLJJLI.zW(MuteMicChannel.class, Boolean.valueOf(z));
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("userState:");
                        sbLIZ.append(linkUserState);
                        sbLIZ.append("[linkmic_id=");
                        sbLIZ.append(linkUserState.linkmicId);
                        sbLIZ.append(", audioMuted=");
                        sbLIZ.append(linkUserState.audioMuted);
                        sbLIZ.append(", onlineUserState=");
                        sbLIZ.append(linkUserState.onlineUserState);
                        C20441214yg.LJIIIZ("GameLinkGuestPresenter", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                if (linkStateMessage.needAck == 1) {
                    C923760a98 c923760a982 = this.LIZ;
                    c923760a982.getClass();
                    long messageId = linkStateMessage.getMessageId();
                    C480460Ism.LIZ().getClass();
                    GameLinkApi gameLinkApi = (GameLinkApi) C480460Ism.LIZLLL(GameLinkApi.class);
                    AckStateReq ackStateReq = new AckStateReq();
                    ackStateReq.common = c923760a982.LJJJJLI();
                    ackStateReq.msgId = messageId;
                    ackStateReq.msgType = 1;
                    ackStateReq.clientReceiveTime = System.currentTimeMillis();
                    gameLinkApi.sendMessageAck(ackStateReq).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.00Kk
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("GameLinkV2GuestPresenter@40ad.sendMessageAck$2");
                            C1C7U.LIZIZ("GameLinkV2GuestPresenter@40ad.sendMessageAck$2");
                        }
                    }, new C09JN() { // from class: X.01y2
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("GameLinkV2GuestPresenter@40ad.sendMessageAck$3");
                            C20441214yg.LJFF("GameLinkGuestPresenter", "sendMessageAck request failed:", (Throwable) obj);
                            C1C7U.LIZIZ("GameLinkV2GuestPresenter@40ad.sendMessageAck$3");
                        }
                    });
                }
            }
        };
        this.LLJLLL = new AbstractC923540a8m() { // from class: X.0a8l
            @Override // X.InterfaceC922930a7n
            public final void LIZ(AbstractC923560a8o abstractC923560a8o) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = abstractC923560a8o.LIZLLL().iterator();
                while (it2.hasNext()) {
                    arrayList.add(C925050aBD.LIZ((LinkListUser) it2.next()));
                }
                C924810aAp.LJ().LJJIJLIJ = C923010a7v.LIZLLL(abstractC923560a8o);
                InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) this.LIZ.mView;
                if (interfaceC923600a8s != null) {
                    interfaceC923600a8s.B2(arrayList);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC922930a7n
            public final void LIZIZ(AbstractC923560a8o abstractC923560a8o, boolean z) {
                MultiLiveGuestInfoList multiLiveGuestInfoList;
                if (z && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) abstractC923560a8o.LIZ) != null) {
                    Integer numValueOf = Integer.valueOf(multiLiveGuestInfoList.requestUserStatus);
                    if (C1697810uHb.LJIIJJI(2, 3, 4).contains(Integer.valueOf(numValueOf.intValue()))) {
                        Room room2 = room;
                        C923760a98 c923760a98 = this.LIZ;
                        numValueOf.intValue();
                        BizLeaveParams bizLeaveParams = new BizLeaveParams(room2.getOwner().getId());
                        InterfaceC954180awC interfaceC954180awCLLJLL2 = c923760a98.LL.LLJLL();
                        if (interfaceC954180awCLLJLL2 != null) {
                            interfaceC954180awCLLJLL2.LJJLIIIJILLIZJL(new C923520a8k("leave_source_when_enter_room", bizLeaveParams, 10011), new C987180bnQ(c923760a98, abstractC923560a8o, 8));
                        }
                    }
                }
                InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) this.LIZ.mView;
                if (interfaceC923600a8s != null) {
                    interfaceC923600a8s.B2(abstractC923560a8o.LIZLLL());
                }
            }
        };
        this.LLJZ = new C923590a8r(this, room);
    }

    public static void LJJLIIIIJ(final C923760a98 c923760a98, boolean z, boolean z2, BeInvitedDialogUICtrlCmd beInvitedDialogUICtrlCmd) {
        IHostAppContext iHostAppContext;
        IHostAction iHostAction;
        C19EG topFragmentActivity;
        FragmentManager supportFragmentManager;
        c923760a98.LLJJJ = null;
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog = (MultiGuestV3GuestBeInvitedDialog) C926630aDl.LIZIZ(MultiGuestV3GuestBeInvitedDialog.Companion.LIZ(MultiGuestV3GuestBeInvitedDialog.Companion, new MultiGuestV3GuestBeInvitedDialog.Companion.OnInviteResultListener() { // from class: com.bytedance.android.live.liveinteract.gamelink.v2.presenter.GameLinkV2GuestPresenter$showInvitedDialog$1
            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
            }

            @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.guest.MultiGuestV3GuestBeInvitedDialog.Companion.OnInviteResultListener
            public final void fw() {
                InterfaceC917640ZzG userManager = this.LL.getUserManager();
                if (userManager != null) {
                    userManager.LJIJJ(this.LL.getUserId(), "anchor_invite_guest");
                }
            }
        }, false, "", "", beInvitedDialogUICtrlCmd, false, "", 0L, null, 0L, c923760a98.LLILLJJLI, z, false, false, null, 0, 0L, 126976), 1, false, false, false, C1697810uHb.LJIIJJI(2, 3), 0, 218);
        c923760a98.LLJJJ = multiGuestV3GuestBeInvitedDialog;
        if (multiGuestV3GuestBeInvitedDialog != null) {
            multiGuestV3GuestBeInvitedDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(c923760a98, 16));
        }
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(c923760a98, 765);
        MultiGuestV3GuestBeInvitedDialog multiGuestV3GuestBeInvitedDialog2 = c923760a98.LLJJJ;
        if (multiGuestV3GuestBeInvitedDialog2 != null) {
            multiGuestV3GuestBeInvitedDialog2.isJoinDirectInvitedDialog = false;
        }
        Object objGg0 = c923760a98.LLILLJJLI.gg0(C748880TZe.class);
        if (!c923760a98.LLJJ && (iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)) != null && !iHostAppContext.isAppBackground() && (iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class)) != null && (topFragmentActivity = iHostAction.getTopFragmentActivity()) != null && (supportFragmentManager = topFragmentActivity.getSupportFragmentManager()) != null) {
            objGg0 = supportFragmentManager;
        }
        FragmentManager fragmentManager = (FragmentManager) objGg0;
        if (fragmentManager != null) {
            C929860aIy.LIZ.LJIILIIL(fragmentManager, c923760a98.LLJJJ, awS594S0100000_15, null, false);
            if (!z2) {
                LJJJJZI(c923760a98, 2, false, null, 62);
            }
        }
        int i = C924250a9v.LIZ().LJJIFFI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_receive_anchor_apply");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("anchor_invite_guest", "guest_connection_type");
        c474500IjALIZ.LJJII("live_studio", "live_type");
        c474500IjALIZ.LJJII("room", "receive_invitation_platform");
        c474500IjALIZ.LJJII("others", "anchor_invite_position");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "connected_guest_cnt");
        c474500IjALIZ.LJJII(C924650aAZ.LJ().getFirst(), "layout_setting");
        c474500IjALIZ.LJJII(C924650aAZ.LJ().getSecond(), "window_setting");
        c474500IjALIZ.LIZ();
    }

    public final void LJJLI(LinkListUser linkListUser, boolean z, String str, boolean z2) {
        String strLIZIZ;
        long id;
        User user;
        C924650aAZ c924650aAZ = C924650aAZ.LIZ;
        InterfaceC923040a7y interfaceC923040a7yHe = this.LL.He();
        if (interfaceC923040a7yHe != null) {
            if (linkListUser != null && (user = linkListUser.user) != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            strLIZIZ = interfaceC923040a7yHe.LIZIZ(id);
        } else {
            strLIZIZ = null;
        }
        c924650aAZ.LJIIIIZZ(C925050aBD.LIZJ(linkListUser, LJJJLZIJ()), strLIZIZ, str, "normal");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void stopInteract(java.lang.String r7, final boolean r8, boolean r9, int r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C923760a98.stopInteract(java.lang.String, boolean, boolean, int):void");
    }

    public static void LJJJJZI(C923760a98 c923760a98, int i, boolean z, AwS629S0100000_15 awS629S0100000_15, int i2) {
        InterfaceC923620a8u interfaceC923620a8u;
        AwS629S0100000_15 awS629S0100000_152 = awS629S0100000_15;
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            awS629S0100000_152 = null;
        }
        T t = c923760a98.mView;
        if ((t instanceof InterfaceC923620a8u) && (interfaceC923620a8u = (InterfaceC923620a8u) t) != null) {
            C925070aBF.LIZIZ(c923760a98.room, c923760a98.LLILLJJLI, interfaceC923620a8u, i, z2, null, null, null, awS629S0100000_152);
        }
    }
}

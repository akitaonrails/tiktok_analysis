package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.extendedscreen.ExtendedScreenWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.notify.IBusinessAvoidConflictNotifyService;
import com.bytedance.android.live.notify.ILiveNotifyService;
import com.bytedance.android.live.profile.service.ILiveProfileService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.qa.IQAService;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.LivesdkMockBackgroundWhiteSetting;
import com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService;
import com.bytedance.android.livesdk.broadcast.interaction.function.BroadcastMessagePresenter;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.dataChannel.LiveCenterDismissEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendScreenCloseEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.PrivilegeAnnouncementEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomNotifyEvent;
import com.bytedance.android.livesdk.dataChannel.TopEffectEvent;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.DeleteRepeatRequestSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveAvoidNotifySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.PostponeRequestBatchShareListSetting;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.model.message.HostBoardMessage;
import com.bytedance.android.livesdk.model.message.OperateToastMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdk.model.message.PrivilegeDynamicEffectMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.AutoShareLiveCardToBulletinBoard;
import webcast.data.SubSplitStatus;
import webcast.data.host_board.MultiHostBoard;

/* JADX INFO: renamed from: X.0UkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780980UkK implements C0JSP, InterfaceC781280Uko, InterfaceC781170Ukd, C0IGR, InterfaceC780650Ujn {
    public final Context LL;
    public final BaseFragment LLILLJJLI;
    public final InterfaceC781090UkV LLILLL;
    public final View LLILZ;
    public final RecyclableWidgetManager LLILZIL;
    public C474770Ijb LLILZLL;
    public C474810Ijf LLIZ;
    public final TextView LLIZLLLIL;
    public final InterfaceC782440Umg LLJ;
    public final View LLJI;
    public DataChannel LLJIJIL;
    public Room LLJILJIL;
    public final C11NJ LLJILJILJ = new C11NJ();
    public IPublicScreenHolderWidget LLJILLL;
    public LiveRecyclableWidget LLJJ;
    public InterfaceC781200Ukg LLJJI;
    public final C781020UkO LLJJIII;
    public InterfaceC780810Uk3 LLJJIJI;
    public C0JSX LLJJIJIIJIL;
    public BroadcastMessagePresenter LLJJIJIL;
    public C781000UkM LLJJJ;
    public final C01GW LLJJJIL;
    public C781050UkR LLJJJJ;
    public AbstractC781140Uka LLJJJJJIL;
    public ExtendedScreenWidget LLJJJJLIIL;
    public boolean LLJJL;
    public final ReentrantLock LLJJLIIIJLLLLLLLZ;
    public Object LLJL;
    public boolean LLJLIL;

    @Override // X.InterfaceC780650Ujn
    public final void onDestroyView() {
        this.LLJJL = false;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null) {
            iInteractService.d70(null);
        }
        BaseFragment baseFragment = this.LLILLJJLI;
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        C1145060fu4.LIZIZ(baseFragment, dataChannel);
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C0UX8 c0ux8 = C0UX8.EVENT_PAGE_BROADCAST;
        C1113800f5e.LJIILJJIL(c0ux8);
        C781000UkM c781000UkM = this.LLJJJ;
        if (c781000UkM != null) {
            IMessageManager iMessageManager = c781000UkM.LLILLL;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(c781000UkM);
            }
            c781000UkM.LL = null;
        }
        C0JSX c0jsx = this.LLJJIJIIJIL;
        if (c0jsx != null) {
            c0jsx.detachView();
        }
        InterfaceC780810Uk3 interfaceC780810Uk3 = this.LLJJIJI;
        if (interfaceC780810Uk3 != null) {
            interfaceC780810Uk3.onDestroy();
        }
        BroadcastMessagePresenter broadcastMessagePresenter = this.LLJJIJIL;
        if (broadcastMessagePresenter != null) {
            broadcastMessagePresenter.onDestroy();
        }
        EnumC1087550ePJ.INSTANCE.stop();
        this.LLJILJILJ.LJ();
        this.LLILZIL.unload(this.LLJILLL);
        C781050UkR c781050UkR = this.LLJJJJ;
        if (c781050UkR != null) {
            IMessageManager iMessageManager2 = c781050UkR.LLILLJJLI;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(c781050UkR);
            }
            c781050UkR.LLILLJJLI = null;
            c781050UkR.LL = null;
        }
        this.LLJJJJ = null;
        IMessageService iMessageServiceLJIILLIIL = C781270Ukn.LJIILLIIL();
        Room room = this.LLJILJIL;
        if (room == null) {
            room = null;
        }
        IMessageManager iMessageManager3 = iMessageServiceLJIILLIIL.get(room.getId());
        if (iMessageManager3 != null) {
            iMessageManager3.removeEventListener(this.LLILZLL);
        }
        IMessageService iMessageServiceLJIILLIIL2 = C781270Ukn.LJIILLIIL();
        Room room2 = this.LLJILJIL;
        if (room2 == null) {
            room2 = null;
        }
        IMessageManager iMessageManager4 = iMessageServiceLJIILLIIL2.get(room2.getId());
        if (iMessageManager4 != null) {
            iMessageManager4.removeEventListener(this.LLIZ);
        }
        IMessageService iMessageServiceLJIILLIIL3 = C781270Ukn.LJIILLIIL();
        Room room3 = this.LLJILJIL;
        if (room3 == null) {
            room3 = null;
        }
        IMessageManager iMessageManager5 = iMessageServiceLJIILLIIL3.get(room3.getId());
        if (iMessageManager5 != null) {
            iMessageManager5.stopMessage(new C2222371ByV(0));
        }
        this.LLILZLL = null;
        InterfaceC782440Umg interfaceC782440Umg = this.LLJ;
        if (interfaceC782440Umg != null) {
            interfaceC782440Umg.LLLJIL();
        }
        IRoomFunctionService iRoomFunctionServiceLJIL = C781270Ukn.LJIL();
        DataChannel dataChannel2 = this.LLJIJIL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        Room room4 = this.LLJILJIL;
        if (room4 == null) {
            room4 = null;
        }
        iRoomFunctionServiceLJIL.LLLF(room4, dataChannel2);
        IRoomFunctionService iRoomFunctionServiceLJIL2 = C781270Ukn.LJIL();
        Room room5 = this.LLJILJIL;
        if (room5 == null) {
            room5 = null;
        }
        iRoomFunctionServiceLJIL2.Kp1(room5);
        IBannerService iBannerServiceLIZJ = C781270Ukn.LIZJ();
        DataChannel dataChannel3 = this.LLJIJIL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        Room room6 = this.LLJILJIL;
        if (room6 == null) {
            room6 = null;
        }
        iBannerServiceLIZJ.LLLF(room6, dataChannel3);
        C781270Ukn.LJIL().tk0();
        IPublicScreenService iPublicScreenServiceLJIJI = C781270Ukn.LJIJI();
        DataChannel dataChannel4 = this.LLJIJIL;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        Room room7 = this.LLJILJIL;
        if (room7 == null) {
            room7 = null;
        }
        iPublicScreenServiceLJIJI.LLLF(room7, dataChannel4);
        IPublicScreenService iPublicScreenServiceLJIJI2 = C781270Ukn.LJIJI();
        Room room8 = this.LLJILJIL;
        if (room8 == null) {
            room8 = null;
        }
        iPublicScreenServiceLJIJI2.Ac2(room8);
        C781270Ukn.LJJIII().pa();
        DataChannel dataChannel5 = this.LLJIJIL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        C1108110ewT.LJ(dataChannel5);
        C781270Ukn.LJIJ().pa().LIZJ();
        C781270Ukn.LJJIIZ().tf1();
        ((ILiveDecisionService) C781270Ukn.LJJJJLI.getValue()).leaveLive();
        C781290Ukp.LIZ.clear();
        C782710Un7.LIZ.getClass();
        if (c0ux8 == C782710Un7.LJFF) {
            C782710Un7.LJIILJJIL();
        }
        if (LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            C1102420enI.LJII(c0ux8);
            Room room9 = this.LLJILJIL;
            if (room9 == null) {
                room9 = null;
            }
            C1102420enI.LJIIIIZZ(c0ux8, room9.getId());
        }
        ILiveNotifyService iLiveNotifyService = (ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class);
        DataChannel dataChannel6 = this.LLJIJIL;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        iLiveNotifyService.ma(dataChannel6);
        ((HashSet) C0IH1.LIZ).clear();
        DataChannel dataChannel7 = this.LLJIJIL;
        C1081890eGB.LIZJ(dataChannel7 != null ? dataChannel7 : null);
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(false);
    }

    public final void LIZLLL() {
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        if (dataChannel.gg0(LiveExtendedScreenStatus.class) != null) {
            DataChannel dataChannel2 = this.LLJIJIL;
            if ((dataChannel2 != null ? dataChannel2 : null).gg0(LiveExtendedScreenStatus.class) != EnumC1083260eIO.HIDE) {
                return;
            }
        }
        this.LLILLL.Xp();
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C781270Ukn.LJI.getValue();
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        if (dataChannel.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW) {
            DataChannel dataChannel2 = this.LLJIJIL;
            (dataChannel2 != null ? dataChannel2 : null).FQ2(LiveExtendScreenCloseEvent.class);
            return true;
        }
        DataChannel dataChannel3 = this.LLJIJIL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        if (dataChannel3.gg0(LiveCenterStatusChannel.class) == C0UVH.SHOWING) {
            DataChannel dataChannel4 = this.LLJIJIL;
            (dataChannel4 != null ? dataChannel4 : null).FQ2(LiveCenterDismissEvent.class);
            return true;
        }
        if (iHostCreativeTool == null || !iHostCreativeTool.isShowStickerView()) {
            C784440Upu.LIZ().LIZIZ(new C465900IOu(8));
            return true;
        }
        iHostCreativeTool.hideStickerView();
        return true;
    }

    @Override // X.InterfaceC780650Ujn
    public final void onDestroy() {
        RoomAuthStatus roomAuthStatus;
        Integer numValueOf;
        C1105740ese c1105740eseLIZ = C1105770esh.LIZ();
        c1105740eseLIZ.LIZ.clear();
        c1105740eseLIZ.LIZJ.removeCallbacksAndMessages(null);
        c1105740eseLIZ.LIZLLL = null;
        EnumC1087550ePJ.INSTANCE.stop();
        IBarrageService iBarrageServiceLIZLLL = C781270Ukn.LIZLLL();
        Room room = this.LLJILJIL;
        if (room == null) {
            room = null;
        }
        iBarrageServiceLIZLLL.Dh0(room.getId());
        DataChannel dataChannel = this.LLJIJIL;
        if (dataChannel == null) {
            dataChannel = null;
        }
        dataChannel.zQ2(this);
        InterfaceC465400IMw interfaceC465400IMw = (InterfaceC465400IMw) this.LLJJJIL.getValue();
        if (interfaceC465400IMw != null) {
            Room room2 = this.LLJILJIL;
            if (room2 == null) {
                room2 = null;
            }
            interfaceC465400IMw.LIZ(room2.getId());
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_end_rankings_status");
        DataChannel dataChannel2 = this.LLJIJIL;
        if (dataChannel2 == null) {
            dataChannel2 = null;
        }
        c474500IjALIZ.LJIJJLI(dataChannel2);
        DataChannel dataChannel3 = this.LLJIJIL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        Room room3 = (Room) dataChannel3.gg0(RoomChannel.class);
        c474500IjALIZ.LJJII((room3 == null || (roomAuthStatus = room3.getRoomAuthStatus()) == null || (numValueOf = Integer.valueOf(roomAuthStatus.getGiftRankSwitchStatus())) == null || numValueOf.intValue() != 2) ? "open" : "close", "ranking_status");
        c474500IjALIZ.LIZ();
        C473050Igp.LIZIZ().LJI();
        ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).S91();
        IToolbarService iToolbarServiceLJJIIJ = C781270Ukn.LJJIIJ();
        DataChannel dataChannel4 = this.LLJIJIL;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        iToolbarServiceLJJIIJ.Ok(dataChannel4);
        if (LiveAvoidNotifySetting.INSTANCE.enable()) {
            IBusinessAvoidConflictNotifyService iBusinessAvoidConflictNotifyService = (IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class);
            DataChannel dataChannel5 = this.LLJIJIL;
            if (dataChannel5 == null) {
                dataChannel5 = null;
            }
            iBusinessAvoidConflictNotifyService.iq(dataChannel5);
        }
        IBusinessAvoidanceService iBusinessAvoidanceService = (IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class);
        DataChannel dataChannel6 = this.LLJIJIL;
        iBusinessAvoidanceService.iq(dataChannel6 != null ? dataChannel6 : null);
        C781270Ukn.LJJIIZ().tf1();
        ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).Kl1(C011V.BROADCAST, 0L);
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).wL2();
    }

    @Override // X.InterfaceC781280Uko
    public final void JF(BaseMessage baseMessage) {
        String strLIZIZ;
        if (baseMessage == null) {
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
            return;
        }
        Room room = null;
        DataChannel dataChannel = null;
        DataChannel dataChannel2 = null;
        DataChannel dataChannel3 = null;
        if (baseMessage instanceof RoomNotifyMessage) {
            DataChannel dataChannel4 = this.LLJIJIL;
            if (dataChannel4 != null) {
                dataChannel = dataChannel4;
            }
            dataChannel.LC0(RoomNotifyEvent.class, baseMessage);
            return;
        }
        if (baseMessage instanceof PrivilegeAdvanceMessage) {
            DataChannel dataChannel5 = this.LLJIJIL;
            if (dataChannel5 != null) {
                dataChannel2 = dataChannel5;
            }
            dataChannel2.LC0(PrivilegeAnnouncementEvent.class, baseMessage);
            return;
        }
        if (baseMessage instanceof PrivilegeDynamicEffectMessage) {
            DataChannel dataChannel6 = this.LLJIJIL;
            if (dataChannel6 != null) {
                dataChannel3 = dataChannel6;
            }
            dataChannel3.LC0(TopEffectEvent.class, baseMessage);
            return;
        }
        if (baseMessage instanceof OperateToastMessage) {
            OperateToastMessage operateToastMessage = (OperateToastMessage) baseMessage;
            if (operateToastMessage.supportDisplayText()) {
                C1091120eV4.LIZJ(operateToastMessage);
                Text text = operateToastMessage.baseMessage.displayText;
                String str = text.defaultPattern;
                String str2 = text.key;
                if (!TextUtils.isEmpty(str2)) {
                    C1124870fNV.LIZJ().getClass();
                    strLIZIZ = C1124870fNV.LIZIZ(str2);
                } else {
                    strLIZIZ = null;
                }
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    str = strLIZIZ;
                }
                Spannable spannableLJIILJJIL = C1133830fbx.LJIILJJIL(str, text, null);
                if (operateToastMessage.delayDuration > 0) {
                    C786410Ut5.LJLIIL(operateToastMessage.delayDuration, new BPEAHandler(Looper.getMainLooper()), new ARunnableS45S0300000_12(this, spannableLJIILJJIL, operateToastMessage, 8));
                } else {
                    LJ(spannableLJIILJJIL, operateToastMessage);
                }
            } else {
                C1091120eV4.LIZ(operateToastMessage, "characterParsingError");
            }
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
            return;
        }
        if (baseMessage instanceof HostBoardMessage) {
            IBillboardService iBillboardService = (IBillboardService) C1161920gLG.LIZJ(IBillboardService.class);
            MultiHostBoard multiHostBoard = ((HostBoardMessage) baseMessage).board;
            C011V c011v = C011V.BROADCAST;
            Room room2 = this.LLJILJIL;
            if (room2 != null) {
                room = room2;
            }
            iBillboardService.yw2(multiHostBoard, c011v, room);
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
            return;
        }
        EnumC1087550ePJ.INSTANCE.onMessageFinish();
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02cb  */
    @Override // X.InterfaceC780650Ujn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780980UkK.LIZIZ(android.os.Bundle):void");
    }

    public final void LIZJ(IBannerService iBannerService) {
        if (this.LLJJ == null) {
            this.LLJJ = this.LLILZIL.load(R.id.yci, iBannerService.qv0(), true, new Object[]{new C780920UkE(SystemClock.elapsedRealtime())});
        }
        BaseFragment baseFragment = this.LLILLJJLI;
        Room room = this.LLJILJIL;
        if (room == null) {
            room = null;
        }
        iBannerService.YT0(baseFragment, room.getId(), true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    @Override // X.InterfaceC781170Ukd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ON(com.bytedance.android.livesdk.model.message.ControlMessage r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780980UkK.ON(com.bytedance.android.livesdk.model.message.ControlMessage):void");
    }

    @Override // X.InterfaceC780650Ujn
    public final void LIZ(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka) {
        this.LLJILJIL = (Room) dataChannel.gg0(RoomChannel.class);
        Boolean bool = Boolean.FALSE;
        dataChannel.SX0(C0U4T.class, bool);
        dataChannel.zW(CommentOrMessageData.class, bool);
        dataChannel.SX0(C0TZM.class, Boolean.TRUE);
        dataChannel.SX0(C780690Ujr.class, Boolean.valueOf(ToolBarButtonWithTextExperiment.hasText()));
        this.LLJIJIL = dataChannel;
        this.LLJJJJJIL = abstractC781140Uka;
        C472950Igf.LIZ = true;
        C0IUA.LIZLLL();
        Room room = this.LLJILJIL;
        DataChannel dataChannel2 = null;
        if (room == null) {
            room = null;
        }
        long id = room.getId();
        Room room2 = this.LLJILJIL;
        if (room2 == null) {
            room2 = null;
        }
        long ownerUserId = room2.getOwnerUserId();
        C0IUA.LJI = id;
        C0IUA.LJII = ownerUserId;
        Room room3 = this.LLJILJIL;
        if (room3 == null) {
            room3 = null;
        }
        OfficialChannelInfo officialChannelInfo = room3.officialChannelInfo;
        if (officialChannelInfo != null) {
            DataChannel dataChannel3 = this.LLJIJIL;
            if (dataChannel3 == null) {
                dataChannel3 = null;
            }
            dataChannel3.SX0(C781160Ukc.class, new C0IGM(officialChannelInfo.linkmicType));
            DataChannel dataChannel4 = this.LLJIJIL;
            if (dataChannel4 != null) {
                dataChannel2 = dataChannel4;
            }
            dataChannel2.SX0(C781150Ukb.class, new C497690JfT(officialChannelInfo.roleType, officialChannelInfo.existLinkmic));
        }
    }

    public final void LJ(CharSequence charSequence, OperateToastMessage operateToastMessage) {
        String str;
        Text text;
        List<C0U4S> listGT = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).gT(operateToastMessage.scene);
        if (listGT != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<C0U4S> it2 = listGT.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(operateToastMessage, linkedHashMap);
            }
            DataChannel dataChannel = null;
            if (!linkedHashMap.isEmpty()) {
                C0U4R c0u4r = new C0U4R();
                c0u4r.LIZIZ = charSequence.toString();
                c0u4r.LIZ = C497740JfY.LJII();
                CommonMessageData commonMessageData = operateToastMessage.baseMessage;
                if (commonMessageData != null && (text = commonMessageData.displayText) != null) {
                    str = text.key;
                } else {
                    str = null;
                }
                c0u4r.LIZJ = str;
                c0u4r.LJ = operateToastMessage.displayDuration;
                c0u4r.LJFF = true;
                c0u4r.LJI = linkedHashMap;
                DataChannel dataChannel2 = this.LLJIJIL;
                if (dataChannel2 != null) {
                    dataChannel = dataChannel2;
                }
                c0u4r.LJII = dataChannel;
                C766270U4b.LJIIJ(c0u4r);
                return;
            }
        }
        C766270U4b.LJIIIIZZ(operateToastMessage.displayDuration, C497740JfY.LJII(), charSequence.toString());
    }

    @Override // X.InterfaceC780650Ujn
    public final void onViewCreated(View view, Bundle bundle) {
        Room room;
        int i;
        int i2;
        SubSplitStatus subSplitStatus;
        int i3;
        SubscribeInfo subscribeInfo;
        int shareCount;
        Room room2;
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
        DataChannel dataChannel = null;
        if (LiveAvoidNotifySetting.INSTANCE.enable()) {
            IBusinessAvoidConflictNotifyService iBusinessAvoidConflictNotifyService = (IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class);
            BaseFragment baseFragment = this.LLILLJJLI;
            DataChannel dataChannel2 = this.LLJIJIL;
            if (dataChannel2 == null) {
                dataChannel2 = null;
            }
            iBusinessAvoidConflictNotifyService.Cg0(baseFragment, dataChannel2);
        }
        ILiveNotifyService iLiveNotifyService = (ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class);
        Context context = this.LL;
        DataChannel dataChannel3 = this.LLJIJIL;
        if (dataChannel3 == null) {
            dataChannel3 = null;
        }
        iLiveNotifyService.wg1(context, dataChannel3, new AwS591S0100000_12(this, 175), AFwS296S0000000_12.get$arr$(5), new InterfaceC1077970e9r() { // from class: X.0UkX
            @Override // X.InterfaceC1077970e9r
            public final String getEventPage() {
                return "live_take_detail";
            }
        }, new InterfaceC1097730efj() { // from class: X.0UkQ
            @Override // X.InterfaceC1097730efj
            public final boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LIZ(DataChannel dataChannel4) {
                long id;
                IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
                Room room3 = (Room) dataChannel4.gg0(RoomChannel.class);
                if (room3 != null) {
                    id = room3.getId();
                } else {
                    id = 0;
                }
                InterfaceC1085480eLy interfaceC1085480eLyO41 = iBarrageService.O41(id);
                if (interfaceC1085480eLyO41 == null || !interfaceC1085480eLyO41.LJJI()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LIZIZ(DataChannel dataChannel4) {
                IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
                if (iProgrammedLiveService == null || !iProgrammedLiveService.hU((Room) dataChannel4.gg0(RoomChannel.class))) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LIZJ(DataChannel dataChannel4) {
                IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
                if (iMicRoomService == null || !iMicRoomService.n42((Room) dataChannel4.gg0(RoomChannel.class))) {
                    return false;
                }
                return true;
            }
        });
        IBusinessAvoidanceService iBusinessAvoidanceService = (IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class);
        DataChannel dataChannel4 = this.LLJIJIL;
        if (dataChannel4 == null) {
            dataChannel4 = null;
        }
        iBusinessAvoidanceService.A82(dataChannel4);
        if (LivesdkMockBackgroundWhiteSetting.INSTANCE.getValue()) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        C0IR2.LJ("portrait");
        C924790aAn.LIZLLL().LJII(0);
        C773220UUu c773220UUu = C773220UUu.LIZ;
        C0UWF c0uwf = new C0UWF();
        c773220UUu.getClass();
        C773220UUu.LJIIL(c0uwf);
        C158B.LIZLLL(this.LL);
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        Handler handlerLIZ = C0IK5.LIZ();
        C0UX8 c0ux8 = C0UX8.EVENT_PAGE_BROADCAST;
        DataChannel dataChannel5 = this.LLJIJIL;
        if (dataChannel5 == null) {
            dataChannel5 = null;
        }
        C1113800f5e.LJIIJJI(handlerLIZ, c0ux8, dataChannel5);
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        BaseFragment baseFragment2 = this.LLILLJJLI;
        DataChannel dataChannel6 = this.LLJIJIL;
        if (dataChannel6 == null) {
            dataChannel6 = null;
        }
        c782710Un7.getClass();
        C782710Un7.LJIIJJI(baseFragment2, c0ux8, dataChannel6);
        IToolbarService iToolbarServiceLJJIIJ = C781270Ukn.LJJIIJ();
        Context context2 = this.LL;
        BaseFragment baseFragment3 = this.LLILLJJLI;
        DataChannel dataChannel7 = this.LLJIJIL;
        if (dataChannel7 == null) {
            dataChannel7 = null;
        }
        iToolbarServiceLJJIIJ.xV(context2, baseFragment3, dataChannel7);
        if (LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
            HashMap<Long, MsgNotifyQuota> map2 = C1102420enI.LIZ;
            Room room3 = this.LLJILJIL;
            if (room3 == null) {
                room2 = null;
            } else {
                room2 = room3;
            }
            Map<Long, MsgNotifyQuota> map3 = room2.quotaConfig;
            if (room3 == null) {
                room3 = null;
            }
            C1102420enI.LJFF(map3, null, null, 0L, c0ux8, room3.getId());
        }
        boolean z = C1102370enD.LIZ;
        Room room4 = this.LLJILJIL;
        if (room4 == null) {
            room = null;
        } else {
            room = room4;
        }
        NotifyFCConfig notifyFCConfig = room.noticeFcConfig;
        if (room4 == null) {
            room4 = null;
        }
        long id = room4.getId();
        AbstractC1102390enF abstractC1102390enF = (AbstractC1102390enF) C1102370enD.LIZJ().get(1);
        if (abstractC1102390enF != null) {
            abstractC1102390enF.LJIIJJI(notifyFCConfig, 2, id);
        }
        IToolbarService iToolbarServiceLJJIIJ2 = C781270Ukn.LJJIIJ();
        Context context3 = this.LL;
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enable()) {
            i = 5;
        } else {
            i = 7;
        }
        iToolbarServiceLJJIIJ2.ba0(i, context3);
        view.setFitsSystemWindows(true);
        HandlerHook.viewPost(view, new ARunnableS81S0200000_12(this, view, 28));
        Room room5 = this.LLJILJIL;
        if (room5 == null) {
            room5 = null;
        }
        if (room5.getMosaicStatus() == 1) {
            C786410Ut5.LLIL(this.LLIZLLLIL, 0);
        }
        if (this.LLJJJJ == null) {
            C781050UkR c781050UkRUJ2 = C781270Ukn.LJJI().uJ2();
            DataChannel dataChannel8 = this.LLJIJIL;
            if (dataChannel8 == null) {
                dataChannel8 = null;
            }
            IMessageService iMessageServiceLJIILLIIL = C781270Ukn.LJIILLIIL();
            Room room6 = this.LLJILJIL;
            if (room6 == null) {
                room6 = null;
            }
            IMessageManager iMessageManager = iMessageServiceLJIILLIIL.get(room6.getId());
            Room room7 = this.LLJILJIL;
            if (room7 == null) {
                room7 = null;
            }
            RoomStats stats = room7.getStats();
            if (stats != null) {
                shareCount = stats.getShareCount();
            } else {
                shareCount = 0;
            }
            c781050UkRUJ2.LIZ(dataChannel8, iMessageManager, shareCount);
            this.LLJJJJ = c781050UkRUJ2;
        }
        Room room8 = this.LLJILJIL;
        if (room8 == null) {
            room8 = null;
        }
        RoomAuthStatus roomAuthStatus = room8.getRoomAuthStatus();
        if (roomAuthStatus != null && roomAuthStatus.chatSubOnly) {
            IFansClubService iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class);
            Room room9 = this.LLJILJIL;
            if (room9 == null) {
                room9 = null;
            }
            User owner = room9.getOwner();
            if (owner != null && (subscribeInfo = owner.getSubscribeInfo()) != null) {
                subSplitStatus = subscribeInfo.subSplitStatus;
            } else {
                subSplitStatus = null;
            }
            if (iFansClubService.pY1(subSplitStatus)) {
                i3 = 2131856580;
            } else {
                i3 = 2131844402;
            }
            C766270U4b.LIZLLL(i3);
        }
        IUserManageService iUserManageService = (IUserManageService) C781270Ukn.LJJIJ.getValue();
        BaseFragment baseFragment4 = this.LLILLJJLI;
        DataChannel dataChannel9 = this.LLJIJIL;
        if (dataChannel9 == null) {
            dataChannel9 = null;
        }
        this.LLJJI = iUserManageService.Re1(baseFragment4, dataChannel9, this.LLJILJILJ);
        ILiveProfileService iLiveProfileServiceLJJIIZ = C781270Ukn.LJJIIZ();
        Context context4 = this.LL;
        BaseFragment baseFragment5 = this.LLILLJJLI;
        DataChannel dataChannel10 = this.LLJIJIL;
        if (dataChannel10 == null) {
            dataChannel10 = null;
        }
        iLiveProfileServiceLJJIIZ.hd2(context4, baseFragment5, dataChannel10, true, baseFragment5);
        BaseFragment baseFragment6 = this.LLILLJJLI;
        DataChannel dataChannel11 = this.LLJIJIL;
        if (dataChannel11 == null) {
            dataChannel11 = null;
        }
        new C473580Ihg(baseFragment6, dataChannel11);
        IBrowserService iBrowserServiceLJFF = C781270Ukn.LJFF();
        BaseFragment baseFragment7 = this.LLILLJJLI;
        DataChannel dataChannel12 = this.LLJIJIL;
        if (dataChannel12 == null) {
            dataChannel12 = null;
        }
        iBrowserServiceLJFF.uv1(baseFragment7, dataChannel12, true, baseFragment7);
        IBarrageService iBarrageServiceLIZLLL = C781270Ukn.LIZLLL();
        BaseFragment baseFragment8 = this.LLILLJJLI;
        DataChannel dataChannel13 = this.LLJIJIL;
        if (dataChannel13 == null) {
            dataChannel13 = null;
        }
        iBarrageServiceLIZLLL.dJ0(baseFragment8, dataChannel13, this.LLJ);
        BaseFragment baseFragment9 = this.LLILLJJLI;
        DataChannel dataChannel14 = this.LLJIJIL;
        if (dataChannel14 == null) {
            dataChannel14 = null;
        }
        new C784430Upt(baseFragment9, dataChannel14);
        InterfaceC771640UOs interfaceC771640UOsLJII = C768460UCm.LJII();
        DataChannel dataChannel15 = this.LLJIJIL;
        if (dataChannel15 == null) {
            dataChannel15 = null;
        }
        interfaceC771640UOsLJII.LJIIIZ(this.LLILLJJLI, dataChannel15);
        if (C520010KaN.LJIIJJI(this.LL)) {
            InterfaceC465400IMw interfaceC465400IMw = (InterfaceC465400IMw) this.LLJJJIL.getValue();
            if (interfaceC465400IMw != null) {
                interfaceC465400IMw.LIZIZ(this.LLILLJJLI.getChildFragmentManager());
            }
            InterfaceC465400IMw interfaceC465400IMw2 = (InterfaceC465400IMw) this.LLJJJIL.getValue();
            if (interfaceC465400IMw2 != null) {
                Room room10 = this.LLJILJIL;
                if (room10 == null) {
                    room10 = null;
                }
                interfaceC465400IMw2.LIZJ(room10.getId());
            }
        }
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        Room room11 = this.LLJILJIL;
        if (room11 == null) {
            room11 = null;
        }
        long id2 = room11.getId();
        Room room12 = this.LLJILJIL;
        if (room12 == null) {
            room12 = null;
        }
        room12.getOwnerUserId();
        iPerformanceManager.Jp2(id2);
        IRoomFunctionService iRoomFunctionServiceLJIL = C781270Ukn.LJIL();
        BaseFragment baseFragment10 = this.LLILLJJLI;
        DataChannel dataChannel16 = this.LLJIJIL;
        if (dataChannel16 == null) {
            dataChannel16 = null;
        }
        Room room13 = this.LLJILJIL;
        if (room13 == null) {
            room13 = null;
        }
        iRoomFunctionServiceLJIL.rV0(baseFragment10, room13, dataChannel16, false);
        IRoomFunctionService iRoomFunctionServiceLJIL2 = C781270Ukn.LJIL();
        BaseFragment baseFragment11 = this.LLILLJJLI;
        DataChannel dataChannel17 = this.LLJIJIL;
        if (dataChannel17 == null) {
            dataChannel17 = null;
        }
        Room room14 = this.LLJILJIL;
        if (room14 == null) {
            room14 = null;
        }
        iRoomFunctionServiceLJIL2.oe1(baseFragment11, room14, dataChannel17);
        IBannerService iBannerServiceLIZJ = C781270Ukn.LIZJ();
        DataChannel dataChannel18 = this.LLJIJIL;
        if (dataChannel18 == null) {
            dataChannel18 = null;
        }
        Room room15 = this.LLJILJIL;
        if (room15 == null) {
            room15 = null;
        }
        iBannerServiceLIZJ.k70(room15, dataChannel18);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initPublicScreenConfiguration();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).initPublicScreenConfiguration();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).initPublicScreenConfiguration();
        ((IQAService) C1161920gLG.LIZJ(IQAService.class)).initPublicScreenConfiguration();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).initPublicScreenConfiguration();
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).pa().LIZLLL();
        ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).initPublicScreenConfiguration();
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).pa().LIZIZ();
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).initPublicScreenConfiguration();
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).My2();
        ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Ft0();
        IPublicScreenService iPublicScreenServiceLJIJI = C781270Ukn.LJIJI();
        BaseFragment baseFragment12 = this.LLILLJJLI;
        DataChannel dataChannel19 = this.LLJIJIL;
        if (dataChannel19 == null) {
            dataChannel19 = null;
        }
        Room room16 = this.LLJILJIL;
        if (room16 == null) {
            room16 = null;
        }
        iPublicScreenServiceLJIJI.gu(room16, dataChannel19, baseFragment12);
        IPublicScreenService iPublicScreenServiceLJIJI2 = C781270Ukn.LJIJI();
        DataChannel dataChannel20 = this.LLJIJIL;
        if (dataChannel20 == null) {
            dataChannel20 = null;
        }
        Room room17 = this.LLJILJIL;
        if (room17 == null) {
            room17 = null;
        }
        iPublicScreenServiceLJIJI2.gu1(room17, dataChannel20);
        C781270Ukn.LJJIII().pa();
        BaseFragment baseFragment13 = this.LLILLJJLI;
        DataChannel dataChannel21 = this.LLJIJIL;
        if (dataChannel21 == null) {
            dataChannel21 = null;
        }
        Room room18 = this.LLJILJIL;
        if (room18 == null) {
            room18 = null;
        }
        C1108110ewT.LIZIZ(room18, dataChannel21, baseFragment13);
        C781270Ukn.LJIJ().pa().getClass();
        if (this.LLJJIII != null) {
            int value = PostponeRequestBatchShareListSetting.INSTANCE.getValue();
            if (value <= 0) {
                C781020UkO c781020UkO = this.LLJJIII;
                Room room19 = this.LLJILJIL;
                if (room19 == null) {
                    room19 = null;
                }
                c781020UkO.LIZ(room19.getId(), this.LLILLJJLI, null);
            } else {
                HandlerHook.viewPostDelay(view, new ARunnableS112S0100000_12(this, 50), TimeUnit.SECONDS.toMillis(value));
            }
        }
        DataChannel dataChannel22 = this.LLJIJIL;
        if (dataChannel22 == null) {
            dataChannel22 = null;
        }
        HashMap map4 = (HashMap) dataChannel22.gg0(C755790Tkn.class);
        if (map4 == null) {
            map4 = new HashMap();
            DataChannel dataChannel23 = this.LLJIJIL;
            if (dataChannel23 != null) {
                dataChannel = dataChannel23;
            }
            dataChannel.SX0(C755790Tkn.class, map4);
        }
        map4.put("param_live_slot_start_time_long", String.valueOf(SystemClock.uptimeMillis()));
        C473050Igp c473050IgpLIZIZ = C473050Igp.LIZIZ();
        c473050IgpLIZIZ.LJI();
        c473050IgpLIZIZ.LIZ = true;
        C20441214yg.LIZIZ("BBToolTip", "start delay");
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
        if (autoShareLiveCardToBulletinBoard != null && (i2 = autoShareLiveCardToBulletinBoard.switchStatus) > 0) {
            C0UF5.LJI = 1;
            if (i2 == 2) {
                C473410IhP.LIZJ(new ARunnableS112S0100000_12(this, 51), 10000L);
            }
        }
    }

    @Override // X.InterfaceC780650Ujn
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        C780870Uk9 c780870Uk9;
        BroadcastMessagePresenter broadcastMessagePresenter = this.LLJJIJIL;
        if (broadcastMessagePresenter != null && (c780870Uk9 = broadcastMessagePresenter.LLILLJJLI) != null) {
            c780870Uk9.LIZLLL.LJII(i, i2, intent);
        }
    }

    public C780980UkK(Context context, BaseFragment baseFragment, InterfaceC781090UkV interfaceC781090UkV, View view, RecyclableWidgetManager recyclableWidgetManager) {
        C781020UkO c781020UkO;
        this.LL = context;
        this.LLILLJJLI = baseFragment;
        this.LLILLL = interfaceC781090UkV;
        this.LLILZ = view;
        this.LLILZIL = recyclableWidgetManager;
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.n3_);
        this.LLJ = interfaceC781090UkV.LLLLJI();
        this.LLJI = view.findViewById(R.id.b2t);
        if (DeleteRepeatRequestSetting.INSTANCE.enable()) {
            c781020UkO = null;
        } else {
            c781020UkO = new C781020UkO();
        }
        this.LLJJIII = c781020UkO;
        this.LLJJJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(49));
        this.LLJJLIIIJLLLLLLLZ = new ReentrantLock();
    }
}

package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS45S0300000_12;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
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
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostBackPressInterceptTime;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostBackPressOpt;
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
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.avoidance.IBusinessAvoidanceService;
import com.bytedance.android.livesdkapi.depend.model.live.MsgNotifyQuota;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyFCConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.AutoShareLiveCardToBulletinBoard;

/* JADX INFO: renamed from: X.0UkL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780990UkL implements InterfaceC780650Ujn, C0JSP, InterfaceC781280Uko, InterfaceC781170Ukd {
    public final Context LL;
    public final InterfaceC781090UkV LLILLJJLI;
    public final InterfaceC780590Ujh LLILLL;
    public final Room LLILZ;
    public final DataChannel LLILZIL;
    public final RecyclableWidgetManager LLILZLL;
    public boolean LLIZ;
    public C781050UkR LLIZLLLIL;
    public final BaseFragment LLJ;
    public final InterfaceC782440Umg LLJI;
    public final C781020UkO LLJIJIL;
    public final C11NJ LLJILJIL;
    public Object LLJILJILJ;
    public BroadcastMessagePresenter LLJILLL;
    public C781000UkM LLJJ;
    public InterfaceC781200Ukg LLJJI;
    public C474770Ijb LLJJIII;
    public C0JSX LLJJIJI;
    public boolean LLJJIJIIJIL;
    public InterfaceC780810Uk3 LLJJIJIL;
    public AbstractC781140Uka LLJJJ;
    public final ReentrantLock LLJJJIL;
    public C474810Ijf LLJJJJ;
    public long LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // X.InterfaceC780650Ujn
    public final void onDestroyView() {
        this.LLJJIJIIJIL = false;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService != null) {
            iInteractService.d70(null);
        }
        C1145060fu4.LIZIZ(this.LLJ, this.LLILZIL);
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C0UX8 c0ux8 = C0UX8.EVENT_PAGE_BROADCAST;
        C1113800f5e.LJIILJJIL(c0ux8);
        C781000UkM c781000UkM = this.LLJJ;
        if (c781000UkM != null) {
            IMessageManager iMessageManager = c781000UkM.LLILLL;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(c781000UkM);
            }
            c781000UkM.LL = null;
        }
        C0JSX c0jsx = this.LLJJIJI;
        if (c0jsx != null) {
            c0jsx.detachView();
        }
        InterfaceC780810Uk3 interfaceC780810Uk3 = this.LLJJIJIL;
        if (interfaceC780810Uk3 != null) {
            interfaceC780810Uk3.onDestroy();
        }
        BroadcastMessagePresenter broadcastMessagePresenter = this.LLJILLL;
        if (broadcastMessagePresenter != null) {
            broadcastMessagePresenter.onDestroy();
        }
        EnumC1087550ePJ.INSTANCE.stop();
        this.LLJILJIL.LJ();
        C781050UkR c781050UkR = this.LLIZLLLIL;
        if (c781050UkR != null) {
            IMessageManager iMessageManager2 = c781050UkR.LLILLJJLI;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(c781050UkR);
            }
            c781050UkR.LLILLJJLI = null;
            c781050UkR.LL = null;
        }
        this.LLIZLLLIL = null;
        IMessageManager iMessageManager3 = C781270Ukn.LJIILLIIL().get(this.LLILZ.getId());
        if (iMessageManager3 != null) {
            iMessageManager3.removeEventListener(this.LLJJIII);
        }
        IMessageManager iMessageManager4 = C781270Ukn.LJIILLIIL().get(this.LLILZ.getId());
        if (iMessageManager4 != null) {
            iMessageManager4.removeEventListener(this.LLJJJJ);
        }
        IMessageManager iMessageManager5 = C781270Ukn.LJIILLIIL().get(this.LLILZ.getId());
        if (iMessageManager5 != null) {
            iMessageManager5.stopMessage(new C2222371ByV(0));
        }
        this.LLJJIII = null;
        InterfaceC782440Umg interfaceC782440Umg = this.LLJI;
        if (interfaceC782440Umg != null) {
            interfaceC782440Umg.LLLJIL();
        }
        C781270Ukn.LJIL().LLLF(this.LLILZ, this.LLILZIL);
        C781270Ukn.LJIL().Kp1(this.LLILZ);
        C781270Ukn.LIZJ().LLLF(this.LLILZ, this.LLILZIL);
        C781270Ukn.LJIL().tk0();
        C781270Ukn.LJIJI().LLLF(this.LLILZ, this.LLILZIL);
        C781270Ukn.LJIJI().Ac2(this.LLILZ);
        C781270Ukn.LJJIII().pa();
        C1108110ewT.LJ(this.LLILZIL);
        C781270Ukn.LJIJ().pa().LIZJ();
        C781270Ukn.LJJIIZ().tf1();
        ((ILiveDecisionService) C781270Ukn.LJJJJLI.getValue()).leaveLive();
        C781290Ukp.LIZ.clear();
        C0UF3.LIZ = false;
        C0UF3.LIZIZ = false;
        C782710Un7.LIZ.getClass();
        if (c0ux8 == C782710Un7.LJFF) {
            C782710Un7.LJIILJJIL();
        }
        if (LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
            HashMap<Long, MsgNotifyQuota> map = C1102420enI.LIZ;
            C1102420enI.LJII(c0ux8);
            C1102420enI.LJIIIIZZ(c0ux8, this.LLILZ.getId());
        }
        ((ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class)).ma(this.LLILZIL);
        ((HashSet) C0IH1.LIZ).clear();
        C1081890eGB.LIZJ(this.LLILZIL);
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(false);
    }

    public final void LIZJ() {
        if (this.LLILZIL.gg0(LiveExtendedScreenStatus.class) == null || this.LLILZIL.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.HIDE) {
            this.LLILLJJLI.Xp();
        }
    }

    @Override // X.InterfaceC780650Ujn
    public final boolean onBackPressed() {
        IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) C781270Ukn.LJI.getValue();
        if (this.LLILZIL.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW) {
            this.LLILZIL.FQ2(LiveExtendScreenCloseEvent.class);
            return true;
        }
        if (this.LLILZIL.gg0(LiveCenterStatusChannel.class) == C0UVH.SHOWING) {
            this.LLILZIL.FQ2(LiveCenterDismissEvent.class);
            return true;
        }
        if (iHostCreativeTool != null && iHostCreativeTool.isShowStickerView()) {
            iHostCreativeTool.hideStickerView();
            return true;
        }
        if (!LiveHostBackPressOpt.enable()) {
            C784440Upu.LIZ().LIZIZ(new C465900IOu(8));
            return true;
        }
        if (System.currentTimeMillis() - this.LLJJJJJIL < LiveHostBackPressInterceptTime.interceptTime()) {
            C784440Upu.LIZ().LIZIZ(new C465900IOu(8));
            return true;
        }
        C766270U4b.LIZLLL(2131857058);
        this.LLJJJJJIL = System.currentTimeMillis();
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
        C781270Ukn.LIZLLL().Dh0(this.LLILZ.getId());
        this.LLILZIL.zQ2(this);
        C1119120fEE c1119120fEEXI2 = C781270Ukn.LJIJJLI().XI2();
        if (c1119120fEEXI2 != null) {
            c1119120fEEXI2.LIZ(this.LLILZ.getId());
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_end_rankings_status");
        c474500IjALIZ.LJIJJLI(this.LLILZIL);
        Room room = (Room) this.LLILZIL.gg0(RoomChannel.class);
        c474500IjALIZ.LJJII((room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (numValueOf = Integer.valueOf(roomAuthStatus.getGiftRankSwitchStatus())) == null || numValueOf.intValue() != 2) ? "open" : "close", "ranking_status");
        c474500IjALIZ.LIZ();
        C473050Igp.LIZIZ().LJI();
        ((IShortTouchService) C1161920gLG.LIZJ(IShortTouchService.class)).S91();
        C781270Ukn.LJJIIJ().Ok(this.LLILZIL);
        if (LiveAvoidNotifySetting.INSTANCE.enable()) {
            ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).iq(this.LLILZIL);
        }
        ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).iq(this.LLILZIL);
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
        if (baseMessage instanceof RoomNotifyMessage) {
            this.LLILZIL.LC0(RoomNotifyEvent.class, baseMessage);
            return;
        }
        if (baseMessage instanceof PrivilegeAdvanceMessage) {
            this.LLILZIL.LC0(PrivilegeAnnouncementEvent.class, baseMessage);
            return;
        }
        if (baseMessage instanceof PrivilegeDynamicEffectMessage) {
            this.LLILZIL.LC0(TopEffectEvent.class, baseMessage);
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
                    C786410Ut5.LJLIIL(operateToastMessage.delayDuration, new BPEAHandler(Looper.getMainLooper()), new ARunnableS45S0300000_12(this, spannableLJIILJJIL, operateToastMessage, 9));
                } else {
                    LIZLLL(spannableLJIILJJIL, operateToastMessage);
                }
            } else {
                C1091120eV4.LIZ(operateToastMessage, "characterParsingError");
            }
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
            return;
        }
        if (baseMessage instanceof HostBoardMessage) {
            ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).yw2(((HostBoardMessage) baseMessage).board, C011V.BROADCAST, this.LLILZ);
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
        } else {
            EnumC1087550ePJ.INSTANCE.onMessageFinish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0194  */
    @Override // X.InterfaceC780650Ujn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780990UkL.LIZIZ(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    @Override // X.InterfaceC781170Ukd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ON(com.bytedance.android.livesdk.model.message.ControlMessage r8) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C780990UkL.ON(com.bytedance.android.livesdk.model.message.ControlMessage):void");
    }

    @Override // X.InterfaceC780650Ujn
    public final void LIZ(DataChannel dataChannel, AbstractC781140Uka abstractC781140Uka) {
        this.LLJJJ = abstractC781140Uka;
    }

    public final void LIZLLL(CharSequence charSequence, OperateToastMessage operateToastMessage) {
        Text text;
        List<C0U4S> listGT = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).gT(operateToastMessage.scene);
        if (listGT != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<C0U4S> it2 = listGT.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(operateToastMessage, linkedHashMap);
            }
            String str = null;
            if (!linkedHashMap.isEmpty()) {
                C0U4R c0u4r = new C0U4R();
                c0u4r.LIZIZ = charSequence.toString();
                c0u4r.LIZ = C497740JfY.LJII();
                CommonMessageData commonMessageData = operateToastMessage.baseMessage;
                if (commonMessageData != null && (text = commonMessageData.displayText) != null) {
                    str = text.key;
                }
                c0u4r.LIZJ = str;
                c0u4r.LJ = operateToastMessage.displayDuration;
                c0u4r.LJFF = true;
                c0u4r.LJI = linkedHashMap;
                c0u4r.LJII = this.LLILZIL;
                C766270U4b.LJIIJ(c0u4r);
                return;
            }
        }
        C766270U4b.LJIIIIZZ(operateToastMessage.displayDuration, C497740JfY.LJII(), charSequence.toString());
    }

    @Override // X.InterfaceC780650Ujn
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean boolValueOf;
        int i;
        int i2;
        int shareCount;
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
        DataChannel dataChannel = this.LLILZIL;
        Boolean bool = Boolean.FALSE;
        dataChannel.SX0(C0U4T.class, bool);
        dataChannel.zW(CommentOrMessageData.class, bool);
        dataChannel.SX0(C0TZM.class, Boolean.TRUE);
        dataChannel.SX0(C780690Ujr.class, Boolean.valueOf(ToolBarButtonWithTextExperiment.hasText()));
        OfficialChannelInfo officialChannelInfo = this.LLILZ.officialChannelInfo;
        if (officialChannelInfo != null) {
            dataChannel.SX0(C781160Ukc.class, new C0IGM(officialChannelInfo.linkmicType));
            dataChannel.SX0(C781150Ukb.class, new C497690JfT(officialChannelInfo.roleType, officialChannelInfo.existLinkmic));
        }
        if (bundle != null) {
            boolValueOf = Boolean.valueOf(bundle.getBoolean("is_from_try_mode", false));
        } else {
            boolValueOf = null;
        }
        this.LLIZ = C500260Jjc.LJJJI(boolValueOf);
        C472950Igf.LIZ = true;
        C0IUA.LIZLLL();
        long id = this.LLILZ.getId();
        long ownerUserId = this.LLILZ.getOwnerUserId();
        C0IUA.LJI = id;
        C0IUA.LJII = ownerUserId;
        if (LiveAvoidNotifySetting.INSTANCE.enable()) {
            ((IBusinessAvoidConflictNotifyService) C1161920gLG.LIZJ(IBusinessAvoidConflictNotifyService.class)).Cg0(this.LLJ, this.LLILZIL);
        }
        ((ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class)).wg1(this.LL, this.LLILZIL, new AwS591S0100000_12(this, 169), AFwS296S0000000_12.get$arr$(4), new InterfaceC1077970e9r() { // from class: X.0UkW
            @Override // X.InterfaceC1077970e9r
            public final String getEventPage() {
                return "live_take_detail";
            }
        }, new InterfaceC1097730efj() { // from class: X.0UkP
            @Override // X.InterfaceC1097730efj
            public final boolean LJII() {
                return false;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LJIIIIZZ() {
                return true;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LIZ(DataChannel dataChannel2) {
                long id2;
                IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
                Room room = (Room) dataChannel2.gg0(RoomChannel.class);
                if (room != null) {
                    id2 = room.getId();
                } else {
                    id2 = 0;
                }
                InterfaceC1085480eLy interfaceC1085480eLyO41 = iBarrageService.O41(id2);
                if (interfaceC1085480eLyO41 == null || !interfaceC1085480eLyO41.LJJI()) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LIZIZ(DataChannel dataChannel2) {
                IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
                if (iProgrammedLiveService == null || !iProgrammedLiveService.hU((Room) dataChannel2.gg0(RoomChannel.class))) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC1097730efj
            public final boolean LIZJ(DataChannel dataChannel2) {
                IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
                if (iMicRoomService == null || !iMicRoomService.n42((Room) dataChannel2.gg0(RoomChannel.class))) {
                    return false;
                }
                return true;
            }
        });
        ((IBusinessAvoidanceService) C1161920gLG.LIZJ(IBusinessAvoidanceService.class)).A82(this.LLILZIL);
        if (LivesdkMockBackgroundWhiteSetting.INSTANCE.getValue()) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        C0IR2.LJ("portrait");
        C924790aAn.LIZLLL().LJII(0);
        C158B.LIZLLL(this.LL);
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        Handler handlerLIZ = C0IK5.LIZ();
        C0UX8 c0ux8 = C0UX8.EVENT_PAGE_BROADCAST;
        C1113800f5e.LJIIJJI(handlerLIZ, c0ux8, this.LLILZIL);
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        BaseFragment baseFragment = this.LLJ;
        DataChannel dataChannel2 = this.LLILZIL;
        c782710Un7.getClass();
        C782710Un7.LJIIJJI(baseFragment, c0ux8, dataChannel2);
        C781270Ukn.LJJIIJ().xV(this.LL, this.LLJ, this.LLILZIL);
        if (LiveNotifyMessageFrequencySetting.INSTANCE.enable()) {
            HashMap<Long, MsgNotifyQuota> map2 = C1102420enI.LIZ;
            Room room = this.LLILZ;
            C1102420enI.LJFF(room.quotaConfig, null, null, 0L, c0ux8, room.getId());
        }
        boolean z = C1102370enD.LIZ;
        Room room2 = this.LLILZ;
        NotifyFCConfig notifyFCConfig = room2.noticeFcConfig;
        long id2 = room2.getId();
        AbstractC1102390enF abstractC1102390enF = (AbstractC1102390enF) C1102370enD.LIZJ().get(1);
        if (abstractC1102390enF != null) {
            abstractC1102390enF.LJIIJJI(notifyFCConfig, 2, id2);
        }
        IToolbarService iToolbarServiceLJJIIJ = C781270Ukn.LJJIIJ();
        Context context = this.LL;
        if (LiveToolbarReuseOptimizeSetting.INSTANCE.enable()) {
            i = 5;
        } else {
            i = 7;
        }
        iToolbarServiceLJJIIJ.ba0(i, context);
        if (this.LLIZLLLIL == null) {
            C781050UkR c781050UkRUJ2 = C781270Ukn.LJJI().uJ2();
            DataChannel dataChannel3 = this.LLILZIL;
            IMessageManager iMessageManager = C781270Ukn.LJIILLIIL().get(this.LLILZ.getId());
            RoomStats stats = this.LLILZ.getStats();
            if (stats != null) {
                shareCount = stats.getShareCount();
            } else {
                shareCount = 0;
            }
            c781050UkRUJ2.LIZ(dataChannel3, iMessageManager, shareCount);
            this.LLIZLLLIL = c781050UkRUJ2;
        }
        this.LLJJI = ((IUserManageService) C781270Ukn.LJJIJ.getValue()).Re1(this.LLJ, this.LLILZIL, this.LLJILJIL);
        ILiveProfileService iLiveProfileServiceLJJIIZ = C781270Ukn.LJJIIZ();
        Context context2 = this.LL;
        BaseFragment baseFragment2 = this.LLJ;
        iLiveProfileServiceLJJIIZ.hd2(context2, baseFragment2, this.LLILZIL, true, baseFragment2);
        new C473580Ihg(this.LLJ, this.LLILZIL);
        IBrowserService iBrowserServiceLJFF = C781270Ukn.LJFF();
        BaseFragment baseFragment3 = this.LLJ;
        iBrowserServiceLJFF.uv1(baseFragment3, this.LLILZIL, true, baseFragment3);
        C781270Ukn.LIZLLL().dJ0(this.LLJ, this.LLILZIL, this.LLJI);
        new C784430Upt(this.LLJ, this.LLILZIL);
        C768460UCm.LJII().LJIIIZ(this.LLJ, this.LLILZIL);
        if (C520010KaN.LJIIJJI(this.LL)) {
            C1119120fEE c1119120fEEXI2 = C781270Ukn.LJIJJLI().XI2();
            if (c1119120fEEXI2 != null) {
                c1119120fEEXI2.LL = this.LLJ.getChildFragmentManager();
            }
            C1119120fEE c1119120fEEXI22 = C781270Ukn.LJIJJLI().XI2();
            if (c1119120fEEXI22 != null) {
                c1119120fEEXI22.LIZJ(this.LLILZ.getId());
            }
        }
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        long id3 = this.LLILZ.getId();
        this.LLILZ.getOwnerUserId();
        iPerformanceManager.Jp2(id3);
        C781270Ukn.LJIL().rV0(this.LLJ, this.LLILZ, this.LLILZIL, false);
        C781270Ukn.LJIL().oe1(this.LLJ, this.LLILZ, this.LLILZIL);
        C781270Ukn.LIZJ().k70(this.LLILZ, this.LLILZIL);
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initPublicScreenConfiguration();
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).initPublicScreenConfiguration();
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).initPublicScreenConfiguration();
        ((IQAService) C1161920gLG.LIZJ(IQAService.class)).initPublicScreenConfiguration();
        ((IGameService) C1161920gLG.LIZJ(IGameService.class)).initPublicScreenConfiguration();
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).pa().LIZLLL();
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).pa().LIZIZ();
        ((IStarCommentService) C1161920gLG.LIZJ(IStarCommentService.class)).initPublicScreenConfiguration();
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).initPublicScreenConfiguration();
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).My2();
        ((IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class)).Ft0();
        C781270Ukn.LJIJI().gu(this.LLILZ, this.LLILZIL, this.LLJ);
        C781270Ukn.LJIJI().gu1(this.LLILZ, this.LLILZIL);
        C781270Ukn.LJJIII().pa();
        C1108110ewT.LIZIZ(this.LLILZ, this.LLILZIL, this.LLJ);
        C781270Ukn.LJIJ().pa().getClass();
        if (this.LLJIJIL != null) {
            int value = PostponeRequestBatchShareListSetting.INSTANCE.getValue();
            if (value <= 0) {
                this.LLJIJIL.LIZ(this.LLILZ.getId(), this.LLJ, null);
            } else {
                HandlerHook.viewPostDelay(view, new ARunnableS112S0100000_12(this, 47), TimeUnit.SECONDS.toMillis(value));
            }
        }
        HashMap map3 = (HashMap) this.LLILZIL.gg0(C755790Tkn.class);
        if (map3 == null) {
            map3 = new HashMap();
            this.LLILZIL.SX0(C755790Tkn.class, map3);
        }
        map3.put("param_live_slot_start_time_long", String.valueOf(SystemClock.uptimeMillis()));
        C473050Igp c473050IgpLIZIZ = C473050Igp.LIZIZ();
        c473050IgpLIZIZ.LJI();
        c473050IgpLIZIZ.LIZ = true;
        C20441214yg.LIZIZ("BBToolTip", "start delay");
        AutoShareLiveCardToBulletinBoard autoShareLiveCardToBulletinBoard = C0UF5.LJFF;
        if (autoShareLiveCardToBulletinBoard != null && (i2 = autoShareLiveCardToBulletinBoard.switchStatus) > 0) {
            C0UF5.LJI = 1;
            if (i2 == 2) {
                C473410IhP.LIZJ(new ARunnableS112S0100000_12(this, 48), 10000L);
            }
        }
    }

    @Override // X.InterfaceC780650Ujn
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        C780870Uk9 c780870Uk9;
        BroadcastMessagePresenter broadcastMessagePresenter = this.LLJILLL;
        if (broadcastMessagePresenter != null && (c780870Uk9 = broadcastMessagePresenter.LLILLJJLI) != null) {
            c780870Uk9.LIZLLL.LJII(i, i2, intent);
        }
    }

    public C780990UkL(Context context, InterfaceC781090UkV interfaceC781090UkV, InterfaceC780590Ujh interfaceC780590Ujh, Room room, DataChannel dataChannel, RecyclableWidgetManager recyclableWidgetManager) {
        C781020UkO c781020UkO;
        this.LL = context;
        this.LLILLJJLI = interfaceC781090UkV;
        this.LLILLL = interfaceC780590Ujh;
        this.LLILZ = room;
        this.LLILZIL = dataChannel;
        this.LLILZLL = recyclableWidgetManager;
        this.LLJ = interfaceC781090UkV.getFragment();
        this.LLJI = interfaceC781090UkV.LLLLJI();
        if (DeleteRepeatRequestSetting.INSTANCE.enable()) {
            c781020UkO = null;
        } else {
            c781020UkO = new C781020UkO();
        }
        this.LLJIJIL = c781020UkO;
        this.LLJILJIL = new C11NJ();
        this.LLJJJIL = new ReentrantLock();
    }
}

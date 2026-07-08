package X;

import android.view.SurfaceView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.TicketContentUpdateEvent;
import com.bytedance.android.live.liveinteract.api.TicketInfoUpdateByFeedEvent;
import com.bytedance.android.live.liveinteract.api.TicketInfoUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperCountDownEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperPlayOrderDismissEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperPlayOrderUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveUserMediaEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorAndGuestEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForMaskEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.MultiGuestLayoutRenderV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.CountDownNormalEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.CountDownPlayTimerEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.CountdownFanTicketEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.RemoveCountDownPlayMaskEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayMaskScoreUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayStatusChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.setting.MultiGuestLayoutLayerAddPaneSizeTechSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownRestoreFanTicketCountEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownUpdateFanTicketCountToPlayEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowAnchorTransitionCountDownEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowBeginStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowCountDownEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowEndStatusEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowMaskOrderEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.LiveShowMatchTotalScoreUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.tool.NetworkStateTipsHelperManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DirectJoinMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.GroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InteractAudioVolumeInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinGroupDirectIMModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRoomDirectMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ListChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.P2PGroupChangeMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFixCrashForLayoutRenderSetting;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.Avatar;

/* JADX INFO: renamed from: X.0aWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938220aWS implements LifecycleOwner {
    public static final C938380aWi LLJJI = new C938380aWi(new C938370aWh((int) C497740JfY.LIZIZ(4.0f), (int) C497740JfY.LIZIZ(4.0f), 0, 0), new C938370aWh(0, (int) C497740JfY.LIZIZ(4.0f), (int) C497740JfY.LIZIZ(4.0f), 0), new C938370aWh(0, 0, (int) C497740JfY.LIZIZ(4.0f), (int) C497740JfY.LIZIZ(4.0f)), new C938370aWh((int) C497740JfY.LIZIZ(4.0f), 0, 0, (int) C497740JfY.LIZIZ(4.0f)));
    public static final C938380aWi LLJJIII = new C938380aWi(new C938370aWh((int) C497740JfY.LIZIZ(3.0f), (int) C497740JfY.LIZIZ(3.0f), 0, 0), new C938370aWh(0, (int) C497740JfY.LIZIZ(3.0f), (int) C497740JfY.LIZIZ(3.0f), 0), new C938370aWh((int) C497740JfY.LIZIZ(2.0f), 0, (int) C497740JfY.LIZIZ(3.0f), (int) C497740JfY.LIZIZ(3.0f)), new C938370aWh((int) C497740JfY.LIZIZ(3.0f), 0, 0, (int) C497740JfY.LIZIZ(3.0f)));
    public final DataChannel LL;
    public final boolean LLILLJJLI;
    public final InterfaceC921620a5g LLILLL;
    public final InterfaceC920220a3Q LLILZ;
    public final boolean LLILZIL;
    public final LifecycleRegistry LLILZLL;
    public final C01GW LLIZ;
    public final C937330aV1 LLIZLLLIL;
    public final C01GW LLJ;
    public final C11PQ<Integer> LLJI;
    public final C01GW LLJIJIL;
    public InterfaceC938250aWV LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C934010aPf LLJILLL;
    public final ConcurrentHashMap<String, C938230aWT> LLJJ;

    public final void LIZ() {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJJIII2;
        this.LLILZLL.setCurrentState(Lifecycle.State.STARTED);
        this.LL.BQ2(this, MultiGuestLayoutRenderV2.RoleChannel.class, new AwS594S0100000_15(this, 232));
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJZZIII(this.LLJILLL);
        }
        InterfaceC921620a5g interfaceC921620a5g = this.LLILLL;
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIJIL(this.LLIZLLLIL);
        }
        C751900TeW c751900TeW = (C751900TeW) this.LLIZ.getValue();
        if (c751900TeW != null) {
            if (c751900TeW.LIZ) {
                InterfaceC921620a5g interfaceC921620a5g2 = c751900TeW.LIZIZ;
                if ((interfaceC921620a5g2 instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) interfaceC921620a5g2) != null && (abstractC928510aGnLIZ2 = interfaceC302401Fe.LIZ()) != null && (listLJJIII2 = abstractC928510aGnLIZ2.LJJIII()) != null) {
                    Iterator it2 = listLJJIII2.iterator();
                    while (it2.hasNext()) {
                        long id = ((LinkPlayerInfo) it2.next()).mUser.getId();
                        Long l = (Long) C742890TCd.LIZ(id).LJLZ();
                        if (l != null && l.longValue() == -1) {
                            c751900TeW.LIZ(id);
                        }
                    }
                }
            } else {
                InterfaceC921620a5g interfaceC921620a5g3 = c751900TeW.LIZIZ;
                if ((interfaceC921620a5g3 instanceof InterfaceC917640ZzG) && (interfaceC917640ZzG = (InterfaceC917640ZzG) interfaceC921620a5g3) != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (listLJJIII = abstractC928510aGnLIZ.LJJIII()) != null) {
                    Iterator it3 = listLJJIII.iterator();
                    while (it3.hasNext()) {
                        User user = ((LinkListUser) it3.next()).user;
                        if (user != null) {
                            long id2 = user.getId();
                            Long l2 = (Long) C742890TCd.LIZ(id2).LJLZ();
                            if (l2 != null && l2.longValue() == -1) {
                                c751900TeW.LIZ(id2);
                            }
                        }
                    }
                }
            }
            InterfaceC921620a5g interfaceC921620a5g4 = c751900TeW.LIZIZ;
            if (interfaceC921620a5g4 != null) {
                interfaceC921620a5g4.LJJIJIL(c751900TeW.LJ);
            }
            C19487311Lz.LIZ(new C11IW(UserService.getInstance().user().LJFF().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0aNh
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    C742890TCd.LIZ(((FollowPair) obj).LIZ).onNext(Long.valueOf(r4.followStatus));
                    return Unit.LIZ;
                }
            })).LJIILL(), c751900TeW.LIZLLL, null, null, 30);
        }
        this.LL.BQ2(this, MultiLiveUserMediaEvent.class, new AwS594S0100000_15(this, 233));
        this.LL.BQ2(this, PlayerPauseLiveForAnchorAndGuestEvent.class, new AwS594S0100000_15(this, 234));
        this.LL.BQ2(this, PlayerPauseLiveForMaskEvent.class, new AwS594S0100000_15(this, 235));
        this.LL.BQ2(this, NetworkStateTipsHelperManager.NetworkStateInfoEvent.class, new AwS594S0100000_15(this, 236));
        DataChannel dataChannel = this.LL;
        dataChannel.BQ2(this, LiveShowMaskOrderEvent.class, new AwS594S0100000_15(this, 237));
        dataChannel.BQ2(this, LiveShowCountDownEvent.class, new AwS594S0100000_15(this, 238));
        dataChannel.BQ2(this, LiveShowAnchorTransitionCountDownEvent.class, new AwS594S0100000_15(this, 239));
        dataChannel.BQ2(this, AigcWallpaperCountDownEvent.class, new AwS594S0100000_15(this, 240));
        dataChannel.EQ2(this, AigcWallpaperPlayOrderUpdateEvent.class, new AwS594S0100000_15(this, 226));
        dataChannel.BQ2(this, AigcWallpaperPlayOrderDismissEvent.class, new AwS594S0100000_15(this, 227));
        dataChannel.BQ2(this, CountDownPlayTimerEvent.class, new AwS594S0100000_15(this, 228));
        dataChannel.BQ2(this, CountDownNormalEndEvent.class, new AwS594S0100000_15(this, 229));
        dataChannel.BQ2(this, RemoveCountDownPlayMaskEvent.class, new AwS594S0100000_15(this, 230));
        dataChannel.BQ2(this, CountdownFanTicketEvent.class, new AwS594S0100000_15(this, 231));
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWVLIZ = C927810aFf.LIZ();
            this.LLJILJIL = interfaceC938250aWVLIZ;
            if (interfaceC938250aWVLIZ != null) {
                ((C941600abu) interfaceC938250aWVLIZ).LJI((C938320aWc) this.LLJILJILJ.getValue());
                return;
            }
            return;
        }
        C938210aWR c938210aWRLJII = LJII();
        c938210aWRLJII.LLILZIL.setCurrentState(Lifecycle.State.STARTED);
        InterfaceC921620a5g interfaceC921620a5g5 = c938210aWRLJII.LLILLL;
        if (interfaceC921620a5g5 != null) {
            interfaceC921620a5g5.LJJIJIL(c938210aWRLJII.LLJIJIL);
        }
        IMessageManager iMessageManager = (IMessageManager) c938210aWRLJII.LL.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addStickyMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), c938210aWRLJII.LLJI);
        }
        DataChannel dataChannel2 = c938210aWRLJII.LL;
        dataChannel2.BQ2(c938210aWRLJII, LiveShowBeginStatusEvent.class, new AwS594S0100000_15(c938210aWRLJII, 707));
        dataChannel2.BQ2(c938210aWRLJII, LiveShowEndStatusEvent.class, new AwS594S0100000_15(c938210aWRLJII, 709));
        dataChannel2.BQ2(c938210aWRLJII, LiveShowMatchTotalScoreUpdateEvent.class, new AwS594S0100000_15(c938210aWRLJII, 711));
        dataChannel2.BQ2(c938210aWRLJII, PlayMaskScoreUpdateEvent.class, new AwS594S0100000_15(c938210aWRLJII, 712));
        dataChannel2.BQ2(c938210aWRLJII, GuestShowdownRestoreFanTicketCountEvent.class, new AwS594S0100000_15(c938210aWRLJII, 714));
        dataChannel2.BQ2(c938210aWRLJII, GuestShowdownUpdateFanTicketCountToPlayEvent.class, new AwS594S0100000_15(c938210aWRLJII, 683));
        dataChannel2.BQ2(c938210aWRLJII, PlayStatusChangeEvent.class, new AwS594S0100000_15(c938210aWRLJII, 685));
        dataChannel2.BQ2(c938210aWRLJII, TicketInfoUpdateEvent.class, new AwS594S0100000_15(c938210aWRLJII, 687));
        dataChannel2.BQ2(c938210aWRLJII, TicketInfoUpdateByFeedEvent.class, new AwS594S0100000_15(c938210aWRLJII, 688));
        dataChannel2.BQ2(c938210aWRLJII, TicketContentUpdateEvent.class, new AwS594S0100000_15(c938210aWRLJII, 706));
    }

    public final void LIZIZ() {
        Lifecycle.State currentState = this.LLILZLL.getCurrentState();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (currentState.isAtLeast(state)) {
            Lifecycle.State currentState2 = this.LLILZLL.getCurrentState();
            Lifecycle.State state2 = Lifecycle.State.DESTROYED;
            if (currentState2 != state2) {
                this.LLILZLL.setCurrentState(state2);
            }
        }
        this.LL.zQ2(this);
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLIFFJFJJ(this.LLJILLL);
        }
        InterfaceC921620a5g interfaceC921620a5g = this.LLILLL;
        if (interfaceC921620a5g != null) {
            interfaceC921620a5g.LJJIIJ(this.LLIZLLLIL);
        }
        C751900TeW c751900TeW = (C751900TeW) this.LLIZ.getValue();
        if (c751900TeW != null) {
            C751900TeW.LJFF.clear();
            c751900TeW.LIZJ.clear();
            c751900TeW.LIZLLL.LJ();
            InterfaceC921620a5g interfaceC921620a5g2 = c751900TeW.LIZIZ;
            if (interfaceC921620a5g2 != null) {
                interfaceC921620a5g2.LJJIIJ(c751900TeW.LJ);
            }
        }
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWV = this.LLJILJIL;
            if (interfaceC938250aWV != null) {
                interfaceC938250aWV.LJII((C938320aWc) this.LLJILJILJ.getValue());
            }
        } else {
            C938210aWR c938210aWRLJII = LJII();
            if (c938210aWRLJII.LLILZIL.getCurrentState().isAtLeast(state)) {
                Lifecycle.State currentState3 = c938210aWRLJII.LLILZIL.getCurrentState();
                Lifecycle.State state3 = Lifecycle.State.DESTROYED;
                if (currentState3 != state3) {
                    c938210aWRLJII.LLILZIL.setCurrentState(state3);
                }
            }
            InterfaceC921620a5g interfaceC921620a5g3 = c938210aWRLJII.LLILLL;
            if (interfaceC921620a5g3 != null) {
                interfaceC921620a5g3.LJJIIJ(c938210aWRLJII.LLJIJIL);
            }
            IMessageManager iMessageManager = (IMessageManager) c938210aWRLJII.LL.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(c938210aWRLJII.LLJI);
            }
            c938210aWRLJII.LL.zQ2(c938210aWRLJII);
        }
        this.LLJJ.clear();
    }

    public final C11PQ<C938380aWi> LJ() {
        return (C11PQ) this.LLJIJIL.getValue();
    }

    public final C938210aWR LJII() {
        return (C938210aWR) this.LLJ.getValue();
    }

    public final EnumC934000aPe LJIIIIZZ() {
        return C937310aUz.LIZIZ(this.LL);
    }

    public final void LJIIJJI() {
        C2262071DgL c2262071DgL;
        for (C938230aWT c938230aWT : this.LLJJ.values()) {
            List<C2262071DgL> listLJLZ = c938230aWT.LJ.LJLZ();
            if (listLJLZ != null && (c2262071DgL = (C2262071DgL) C13LP.LJJJLL(listLJLZ)) != null) {
                C940260aZk c940260aZkLJIIIZ = LJIIIZ(Long.valueOf(c2262071DgL.getId()), c938230aWT.LJFF);
                if (!Intrinsics.LJFF(c938230aWT.LJI.LJLZ(), c940260aZkLJIIIZ)) {
                    c938230aWT.LJI.onNext(c940260aZkLJIIIZ);
                }
            }
        }
    }

    public final void LJIIL() {
        C11PQ<List<Integer>> c11pq;
        Iterator<Map.Entry<String, C938230aWT>> it2 = this.LLJJ.entrySet().iterator();
        while (it2.hasNext()) {
            String key = it2.next().getKey();
            MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
            if (multiGuestDataHolderLIZJ != null) {
                int iLJIILL = multiGuestDataHolderLIZJ.LJIILL(key);
                C938230aWT c938230aWTLIZJ = LIZJ(key, false, false);
                if (c938230aWTLIZJ != null && (c11pq = c938230aWTLIZJ.LJIILIIL) != null) {
                    c11pq.onNext(Collections.singletonList(Integer.valueOf(iLJIILL)));
                }
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZLL;
    }

    public final LinkPlayerInfo LJI(String str) {
        InterfaceC917640ZzG interfaceC917640ZzG;
        AbstractC928510aGn abstractC928510aGnLIZ;
        List listLJJIII;
        Object next;
        InterfaceC917640ZzG interfaceC917640ZzG2;
        AbstractC928510aGn abstractC928510aGnLIZ2;
        List listLJIJJLI;
        Object next2;
        InterfaceC302401Fe interfaceC302401Fe;
        AbstractC928510aGn abstractC928510aGnLIZ3;
        List listLJJIII2;
        InterfaceC302401Fe interfaceC302401Fe2;
        AbstractC928510aGn abstractC928510aGnLIZ4;
        List listLJIJJLI2;
        Object obj = null;
        if (LJIIIIZZ() == EnumC934000aPe.ANCHOR) {
            if (MultiGuestLayoutLayerAddPaneSizeTechSetting.INSTANCE.isEnable() && C917910Zzh.LIZ(true)) {
                InterfaceC921620a5g interfaceC921620a5g = this.LLILLL;
                if (!(interfaceC921620a5g instanceof InterfaceC302401Fe) || (interfaceC302401Fe2 = (InterfaceC302401Fe) interfaceC921620a5g) == null || (abstractC928510aGnLIZ4 = interfaceC302401Fe2.LIZ()) == null || (listLJIJJLI2 = abstractC928510aGnLIZ4.LJIJJLI()) == null) {
                    return null;
                }
                Iterator it2 = listLJIJJLI2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next3 = it2.next();
                    if (Intrinsics.LJFF(((LinkPlayerInfo) next3).mInteractIdStr, str)) {
                        obj = next3;
                        break;
                    }
                }
                return (LinkPlayerInfo) obj;
            }
            InterfaceC921620a5g interfaceC921620a5g2 = this.LLILLL;
            if (!(interfaceC921620a5g2 instanceof InterfaceC302401Fe) || (interfaceC302401Fe = (InterfaceC302401Fe) interfaceC921620a5g2) == null || (abstractC928510aGnLIZ3 = interfaceC302401Fe.LIZ()) == null || (listLJJIII2 = abstractC928510aGnLIZ3.LJJIII()) == null) {
                return null;
            }
            Iterator it3 = listLJJIII2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next4 = it3.next();
                if (Intrinsics.LJFF(((LinkPlayerInfo) next4).mInteractIdStr, str)) {
                    obj = next4;
                    break;
                }
            }
            return (LinkPlayerInfo) obj;
        }
        if (LJIIIIZZ() != EnumC934000aPe.GUEST && LJIIIIZZ() != EnumC934000aPe.AUDIENCE) {
            return null;
        }
        if (MultiGuestLayoutLayerAddPaneSizeTechSetting.INSTANCE.isEnable() && C917910Zzh.LIZ(false)) {
            InterfaceC921620a5g interfaceC921620a5g3 = this.LLILLL;
            if (!(interfaceC921620a5g3 instanceof InterfaceC917640ZzG) || (interfaceC917640ZzG2 = (InterfaceC917640ZzG) interfaceC921620a5g3) == null || (abstractC928510aGnLIZ2 = interfaceC917640ZzG2.LIZ()) == null || (listLJIJJLI = abstractC928510aGnLIZ2.LJIJJLI()) == null) {
                return null;
            }
            Iterator it4 = listLJIJJLI.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (Intrinsics.LJFF(((LinkListUser) next2).linkMicId, str)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            LinkListUser linkListUser = (LinkListUser) next2;
            if (linkListUser == null) {
                return null;
            }
            return C930540aK4.LIZ(linkListUser);
        }
        InterfaceC921620a5g interfaceC921620a5g4 = this.LLILLL;
        if (!(interfaceC921620a5g4 instanceof InterfaceC917640ZzG) || (interfaceC917640ZzG = (InterfaceC917640ZzG) interfaceC921620a5g4) == null || (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) == null || (listLJJIII = abstractC928510aGnLIZ.LJJIII()) == null) {
            return null;
        }
        Iterator it5 = listLJJIII.iterator();
        while (true) {
            if (it5.hasNext()) {
                next = it5.next();
                if (Intrinsics.LJFF(((LinkListUser) next).linkMicId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LinkListUser linkListUser2 = (LinkListUser) next;
        if (linkListUser2 == null) {
            return null;
        }
        return C930540aK4.LIZ(linkListUser2);
    }

    public final String LJIIJ(long j) {
        List<UserFanTicket> list;
        UserFanTicket next;
        String str;
        String strLJ;
        if (C01ZE.LIZ()) {
            InterfaceC938250aWV interfaceC938250aWV = this.LLJILJIL;
            if (interfaceC938250aWV != null && (strLJ = interfaceC938250aWV.LJ(j)) != null) {
                return strLJ;
            }
        } else {
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = LJII().LLIZLLLIL;
            if (fanTicketRoomNoticeContent != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
                Iterator<UserFanTicket> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.userId == j) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                UserFanTicket userFanTicket = next;
                if (userFanTicket != null && (str = userFanTicket.ticketUiStyleV2) != null) {
                    return str;
                }
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            java.lang.String r5 = "renderFirstFrameArrivedByRole linkmicId="
            r0.append(r5)
            r0.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            java.lang.String r4 = "MultiGuestInfoCenter"
            X.C937310aUz.LIZLLL(r4, r0)
            X.0aPe r1 = r7.LJIIIIZZ()
            X.0aPe r0 = X.EnumC934000aPe.AUDIENCE
            r3 = 1
            if (r1 == r0) goto L8e
            X.0aPe r1 = r7.LJIIIIZZ()
            X.0aPe r0 = X.EnumC934000aPe.GUEST
            if (r1 == r0) goto L8e
            X.0aPe r1 = r7.LJIIIIZZ()
            X.0aPe r0 = X.EnumC934000aPe.ANCHOR
            if (r1 != r0) goto La8
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            r6 = 0
            if (r0 == 0) goto La8
            com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo r0 = r0.G0()
            if (r0 == 0) goto La8
            java.lang.String r2 = r0.linkMicId
            if (r2 == 0) goto La8
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r8)
            if (r0 != 0) goto L8e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            r1.append(r8)
            java.lang.String r0 = " currentLinkmicId="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " map="
            r1.append(r0)
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L6e
            java.util.HashSet r6 = r0.LJJJJJL(r2)
        L6e:
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C937310aUz.LIZLLL(r4, r0)
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto La8
            java.util.HashSet r0 = r0.LJJJJJL(r2)
            if (r0 == 0) goto La8
            boolean r0 = r0.contains(r8)
            if (r0 != r3) goto La8
        L8e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            r1.append(r8)
            java.lang.String r0 = " result="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C937310aUz.LIZLLL(r4, r0)
            return r3
        La8:
            r3 = 0
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938220aWS.LJIILIIL(java.lang.String):boolean");
    }

    public final void LJIILJJIL(C942080acg c942080acg) {
        boolean zLJ = this.LLILZ.LJ();
        int iIntValue = 0;
        if (C917910Zzh.LIZ(this.LLILLJJLI) && zLJ) {
            if (MultiGuestFixCrashForLayoutRenderSetting.INSTANCE.enable()) {
                Iterator<C957020b0m> it2 = c942080acg.LIZ.LIZLLL.iterator();
                if (it2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(it2.next().getWidth());
                    while (it2.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(it2.next().getWidth());
                        if (numValueOf.compareTo(numValueOf2) > 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    }
                }
            } else {
                Iterator<C957020b0m> it3 = c942080acg.LIZ.LIZLLL.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(it3.next().getWidth());
                    while (it3.hasNext()) {
                        Integer numValueOf4 = Integer.valueOf(it3.next().getWidth());
                        if (numValueOf3.compareTo(numValueOf4) > 0) {
                            numValueOf3 = numValueOf4;
                        }
                    }
                    iIntValue = numValueOf3.intValue();
                } else {
                    throw new NoSuchElementException();
                }
            }
            C20441214yg.LIZIZ("MultiGuestInfoCenter", "updateLinkMicLayoutRender minWidth:" + iIntValue);
            if (iIntValue <= C439101nJ.LIZ(85)) {
                LJ().onNext(LLJJIII);
                this.LLJI.onNext(1);
                return;
            } else {
                LJ().onNext(LLJJI);
                this.LLJI.onNext(0);
                return;
            }
        }
        LJ().onNext(LLJJI);
        this.LLJI.onNext(0);
    }

    public final C940260aZk LJIIIZ(Long l, String str) {
        long id;
        User user;
        long jLIZLLL;
        int iLIZJ;
        String strLJFF;
        String strLJIIIZ;
        String strLJ;
        int iLJIIIIZZ;
        int iLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getScoreBizViewData linkMicId:");
        sbLIZ.append(str);
        sbLIZ.append(" nullableUserId:");
        sbLIZ.append(l);
        C20441214yg.LIZIZ("MultiGuestInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
        if (C01ZE.LIZ()) {
            long version = 0;
            if (l != null) {
                id = l.longValue();
            } else {
                LinkPlayerInfo linkPlayerInfoLJI = LJI(str);
                if (linkPlayerInfoLJI != null && (user = linkPlayerInfoLJI.mUser) != null) {
                    id = user.getId();
                } else {
                    id = 0;
                }
            }
            InterfaceC938250aWV interfaceC938250aWV = this.LLJILJIL;
            if (interfaceC938250aWV != null) {
                jLIZLLL = interfaceC938250aWV.LIZLLL(id);
            } else {
                jLIZLLL = 0;
            }
            InterfaceC938250aWV interfaceC938250aWV2 = this.LLJILJIL;
            if (interfaceC938250aWV2 != null) {
                iLIZJ = interfaceC938250aWV2.LIZJ();
            } else {
                iLIZJ = 1;
            }
            InterfaceC938250aWV interfaceC938250aWV3 = this.LLJILJIL;
            String str2 = null;
            if (interfaceC938250aWV3 != null) {
                strLJFF = interfaceC938250aWV3.LJFF(id);
            } else {
                strLJFF = null;
            }
            InterfaceC938250aWV interfaceC938250aWV4 = this.LLJILJIL;
            if (interfaceC938250aWV4 != null) {
                strLJIIIZ = interfaceC938250aWV4.LJIIIZ(id);
            } else {
                strLJIIIZ = null;
            }
            InterfaceC938250aWV interfaceC938250aWV5 = this.LLJILJIL;
            if (interfaceC938250aWV5 != null) {
                strLJ = interfaceC938250aWV5.LJ(id);
            } else {
                strLJ = null;
            }
            InterfaceC938250aWV interfaceC938250aWV6 = this.LLJILJIL;
            if (interfaceC938250aWV6 != null) {
                iLJIIIIZZ = interfaceC938250aWV6.LJIIIIZZ(id);
            } else {
                iLJIIIIZZ = 0;
            }
            InterfaceC938250aWV interfaceC938250aWV7 = this.LLJILJIL;
            if (interfaceC938250aWV7 != null) {
                iLIZ = interfaceC938250aWV7.LIZ(id);
            } else {
                iLIZ = 0;
            }
            InterfaceC938250aWV interfaceC938250aWV8 = this.LLJILJIL;
            if (interfaceC938250aWV8 != null) {
                version = interfaceC938250aWV8.getVersion();
            }
            if (strLJIIIZ != null && strLJIIIZ.length() != 0) {
                str2 = strLJIIIZ;
            }
            return new C940260aZk(jLIZLLL, iLJIIIIZZ, iLIZJ, strLJFF, str2, strLJ, iLIZ, version);
        }
        return new C940260aZk(0L, 0, 1, null, null, "", 0, 0L);
    }

    public /* synthetic */ C938220aWS(DataChannel dataChannel, boolean z, InterfaceC921620a5g interfaceC921620a5g) {
        this(dataChannel, z, interfaceC921620a5g, C940770aaZ.LIZ().getDataSource(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C938230aWT LIZJ(java.lang.String r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C938220aWS.LIZJ(java.lang.String, boolean, boolean):X.0aWT");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0aPf] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0aV1] */
    public C938220aWS(DataChannel dataChannel, boolean z, InterfaceC921620a5g interfaceC921620a5g, InterfaceC920220a3Q interfaceC920220a3Q, boolean z2) {
        this.LL = dataChannel;
        this.LLILLJJLI = z;
        this.LLILLL = interfaceC921620a5g;
        this.LLILZ = interfaceC920220a3Q;
        this.LLILZIL = z2;
        this.LLILZLL = new LifecycleRegistry(this);
        this.LLIZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 224));
        this.LLIZLLLIL = new InterfaceC922630a7J() { // from class: X.0aV1
            @Override // X.InterfaceC922630a7J
            public final void Ue(Throwable th) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFetchFailed t=");
                sbLIZ.append(th.getMessage());
                C937310aUz.LJFF("MultiGuestInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC922630a7J
            public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                C938230aWT c938230aWTLIZJ;
                Long lValueOf;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onListChangeByFetch source=");
                sbLIZ.append(i);
                C937310aUz.LIZLLL("MultiGuestInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                List<LinkPlayerInfo> listLIZ = interfaceC921200a50.LIZ();
                C938220aWS c938220aWS = this.LL;
                for (LinkPlayerInfo linkPlayerInfo : listLIZ) {
                    String str = linkPlayerInfo.mInteractIdStr;
                    if (str != null) {
                        if (c938220aWS.LLILZIL) {
                            c938230aWTLIZJ = c938220aWS.LIZJ(str, true, false);
                        } else {
                            c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
                        }
                        if (c938230aWTLIZJ != null) {
                            c938230aWTLIZJ.LJ.onNext(Collections.singletonList(new C2262071DgL(linkPlayerInfo.mUser, linkPlayerInfo.blurredAvatar)));
                            if (C01ZE.LIZ()) {
                                User user = linkPlayerInfo.mUser;
                                if (user != null) {
                                    lValueOf = Long.valueOf(user.getId());
                                } else {
                                    lValueOf = null;
                                }
                                C940260aZk c940260aZkLJIIIZ = c938220aWS.LJIIIZ(lValueOf, str);
                                if (!Intrinsics.LJFF(c940260aZkLJIIIZ, c938230aWTLIZJ.LJI.LJLZ())) {
                                    c938230aWTLIZJ.LJI.onNext(c940260aZkLJIIIZ);
                                }
                            }
                        }
                    }
                }
            }

            @Override // X.InterfaceC922630a7J
            public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                User user;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onListChangeByIM source=");
                sbLIZ.append(i);
                C937310aUz.LIZLLL("MultiGuestInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                List<LinkListUser> listLIZ = interfaceC921200a50.LIZ();
                C938220aWS c938220aWS = this.LL;
                for (LinkListUser linkListUser : listLIZ) {
                    String str = linkListUser.linkMicId;
                    C938230aWT c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false);
                    if (c938230aWTLIZJ != null && (user = linkListUser.user) != null) {
                        c938230aWTLIZJ.LJ.onNext(Collections.singletonList(new C2262071DgL(user, linkListUser.blurredAvatar)));
                        if (C01ZE.LIZ()) {
                            C940260aZk c940260aZkLJIIIZ = c938220aWS.LJIIIZ(Long.valueOf(user.getId()), str);
                            if (!Intrinsics.LJFF(c940260aZkLJIIIZ, c938230aWTLIZJ.LJI.LJLZ())) {
                                c938230aWTLIZJ.LJI.onNext(c940260aZkLJIIIZ);
                            }
                        }
                    }
                }
            }
        };
        this.LLJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 223));
        C11PQ<Integer> c11pq = new C11PQ<>();
        c11pq.onNext(0);
        this.LLJI = c11pq;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(74));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 222));
        this.LLJILLL = new InterfaceC964770bDH() { // from class: X.0aPf
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
            public final void LJIJJLI(String str, boolean z3) {
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
            public final void LJJIIZI(String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIJIIJIL(String str, boolean z3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIL(String str, boolean z3) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJIZ(String str, long j) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJ() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJ(String str, float f, float f2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJJJJL(int i, C965030bDh c965030bDh) {
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
            public final void LJJLIIIJILLIZJL(Avatar avatar, String str) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LJJLIIIJJIZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIIIJLJLI() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLIL() {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLJLI(C966020bFI c966020bFI, ListChangeMessage listChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJLL(int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJJZZI(C965210bDz c965210bDz) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJL(InterfaceC954180awC interfaceC954180awC, P2PGroupChangeMessage p2PGroupChangeMessage) {
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
            public final void LJLJI(InterfaceC954180awC interfaceC954180awC, C949400aoU c949400aoU) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJJI(InterfaceC954180awC interfaceC954180awC, boolean z3, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final InterfaceC965500bES LJLJJLL(InterfaceC954180awC interfaceC954180awC) {
                return null;
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLJL(InterfaceC954180awC interfaceC954180awC, RtcStartResultMessage rtcStartResultMessage) {
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
            public final void LJLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJZI(InterfaceC954180awC interfaceC954180awC, JoinRoomDirectMessage joinRoomDirectMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LL(InterfaceC954180awC interfaceC954180awC, LinkCoreError linkCoreError) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLFZ(InterfaceC954180awC interfaceC954180awC, LeaveGroupMessage leaveGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIII(InterfaceC954180awC interfaceC954180awC, GroupChangeMessage groupChangeMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIJ(InterfaceC954180awC interfaceC954180awC, ApplyMessage applyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIZ(InterfaceC954180awC interfaceC954180awC, int i) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIL(InterfaceC954180awC interfaceC954180awC, DirectJoinMessage directJoinMessage) {
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
            public final void LLILLJJLI(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIZLLLIL(InterfaceC954180awC interfaceC954180awC, String str, String str2) {
            }

            @Override // X.InterfaceC964770bDH
            @InterfaceC1294060jmO
            public final void LLJI(String str, boolean z3, boolean z4) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJIJIL(InterfaceC954180awC interfaceC954180awC, CancelApplyMessage cancelApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJIJIIJIL(InterfaceC954180awC interfaceC954180awC, KickOutMessage kickOutMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJJJ(InterfaceC954180awC interfaceC954180awC, CreateChannelMessage createChannelMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJJL(InterfaceC954180awC interfaceC954180awC, InviteMessage inviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJLLIL(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLJZ(InterfaceC954180awC interfaceC954180awC, int i, int i2) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLL(InterfaceC954180awC interfaceC954180awC, int i, C967130bH5 c967130bH5, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLFFI(InterfaceC954180awC interfaceC954180awC, int i, InterfaceC958070b2T interfaceC958070b2T, String str, CustomLinkMessage customLinkMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLII(InterfaceC954180awC interfaceC954180awC, LinkUser linkUser, CustomLinkMessage customLinkMessage) {
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
            public final void LLLILZJ(InterfaceC954180awC interfaceC954180awC) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLL(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLIL(InterfaceC954180awC interfaceC954180awC, CancelInviteMessage cancelInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLIL(InterfaceC954180awC interfaceC954180awC, LeaveMessage leaveMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLJ(InterfaceC954180awC interfaceC954180awC, PermitApplyMessage permitApplyMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLL(InterfaceC954180awC interfaceC954180awC, ReplyInviteMessage replyInviteMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLLLL(List<InteractAudioVolumeInfo> list) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLLZZ(InterfaceC954180awC interfaceC954180awC, ApplyGroupMessage applyGroupMessage) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LLLLLZ(String str) {
            }

            @Override // X.InterfaceC964770bDH
            public final void LJLLLL(InterfaceC954180awC interfaceC954180awC, String str) {
                C11PQ<Boolean> c11pq2;
                C938230aWT c938230aWTLIZJ = this.LL.LIZJ(str, false, false);
                if (c938230aWTLIZJ != null && (c11pq2 = c938230aWTLIZJ.LJIIL) != null) {
                    c11pq2.onNext(Boolean.TRUE);
                }
                this.LL.LL.zW(LinkInGuestCountDownFinishChannel.class, str);
            }

            @Override // X.InterfaceC964770bDH
            public final void LLIIIILZ(InterfaceC954180awC interfaceC954180awC, String str) {
                C11PQ<Boolean> c11pq2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onRemoteRender linkMicId=");
                sbLIZ.append(str);
                C937310aUz.LIZLLL("MultiGuestInfoCenter", C2188811AlT.LIZIZ(sbLIZ));
                C938230aWT c938230aWTLIZJ = this.LL.LIZJ(str, false, false);
                if (c938230aWTLIZJ != null && (c11pq2 = c938230aWTLIZJ.LJIIL) != null) {
                    c11pq2.onNext(Boolean.TRUE);
                }
                this.LL.LL.zW(LinkInGuestCountDownFinishChannel.class, str);
            }
        };
        this.LLJJ = new ConcurrentHashMap<>();
    }
}

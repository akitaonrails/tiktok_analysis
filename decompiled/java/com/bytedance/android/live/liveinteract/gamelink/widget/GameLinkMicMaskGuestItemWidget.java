package com.bytedance.android.live.liveinteract.gamelink.widget;

import X.C001A;
import X.C01GW;
import X.C0IJT;
import X.C0IXT;
import X.C0J1N;
import X.C11NZ;
import X.C11PQ;
import X.C11RD;
import X.C1701940uOG;
import X.C1848410yCV;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C776250Uch;
import X.C920910a4X;
import X.C924650aAZ;
import X.C924790aAn;
import X.C930940aKi;
import X.C936540aTk;
import X.C936570aTn;
import X.C936590aTp;
import X.C936610aTr;
import X.C941300abQ;
import X.EnumC920920a4Y;
import X.InterfaceC500500Jk0;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkPlayerMuteAudioEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.GameLinkStateChangeEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.RealGoLivePreviewDestroyEvent;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkMicMaskGuestItemWidget;
import com.bytedance.android.livesdk.comp.api.game.linkmic.GameLinkMicViewSmallStyle;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import com.bytedance.android.livesdk.model.message.UserFanTicket;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import mf.a;
import qo2.w;

/* JADX INFO: loaded from: classes16.dex */
public final class GameLinkMicMaskGuestItemWidget extends LiveWidget {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C936540aTk LL;
    public final C941300abQ LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 124));
    public final C11PQ<Boolean> LLILZ = C11PQ.LJLLLLLL(Boolean.FALSE);
    public final C936610aTr LLILZIL = new OnIMMessageListener() { // from class: X.0aTr
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "count-down-for-all-message-channel";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            User user;
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent;
            List<UserFanTicket> list;
            if (iMessage == null) {
                return;
            }
            boolean z = iMessage instanceof LinkMicFanTicketMethod;
            if (z || (iMessage instanceof LinkMicMessage)) {
                GameLinkMicMaskGuestItemWidget gameLinkMicMaskGuestItemWidget = this.LL;
                gameLinkMicMaskGuestItemWidget.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("message is ");
                sbLIZ.append(iMessage.getClass().getSimpleName());
                C20441214yg.LIZIZ("test_lzk_gamelink_gift", C2188811AlT.LIZIZ(sbLIZ));
                if (C0IXT.LIZ()) {
                    if (z && (fanTicketRoomNoticeContent = ((LinkMicFanTicketMethod) iMessage).fanTicketRoomNotice) != null && (list = fanTicketRoomNoticeContent.userFanTicket) != null) {
                        for (UserFanTicket userFanTicket : list) {
                            User user2 = gameLinkMicMaskGuestItemWidget.LL.LIZ.mUser;
                            if (user2 != null && userFanTicket.userId == user2.getId()) {
                                gameLinkMicMaskGuestItemWidget.LL.LJFF.onNext(Long.valueOf(userFanTicket.fanTicket));
                            }
                        }
                        return;
                    }
                    return;
                }
                if ((iMessage instanceof LinkMicMessage) && (user = gameLinkMicMaskGuestItemWidget.LL.LIZ.mUser) != null && user.getId() == ((LinkMicMessage) iMessage).userId) {
                    LinkMicMessage linkMicMessage = (LinkMicMessage) iMessage;
                    if (linkMicMessage.mType == 8) {
                        gameLinkMicMaskGuestItemWidget.LL.LJFF.onNext(Long.valueOf(linkMicMessage.fanTicket));
                    }
                }
            }
        }
    };

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        DataChannel dataChannel;
        super.onCreate();
        if (((Boolean) this.LLILLL.getValue()).booleanValue() && (dataChannel = this.dataChannel) != null) {
            dataChannel.EQ2(this, GameLinkMicViewSmallStyle.class, new AwS594S0100000_15(this, 110));
        }
        C941300abQ c941300abQ = this.LLILLJJLI;
        Boolean boolLJLZ = this.LLILZ.LJLZ();
        c941300abQ.LJ(boolLJLZ != null ? boolLJLZ.booleanValue() : false, ((Boolean) this.LLILLL.getValue()).booleanValue(), this.LL);
        ((C0J1N) C11NZ.LJIIJ(this.LL.LJI.LJJIFFI(), this.LLILZ, new InterfaceC500500Jk0() { // from class: X.0aTo
            @Override // X.InterfaceC500500Jk0
            public final Object apply(Object obj, Object obj2) {
                return 1;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS184S0100000_15(this, 14));
        if (this.LL.LIZ()) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.EQ2(this, GameLinkGuestMuteAudioEvent.class, new AwS594S0100000_15(this, 111));
                dataChannel2.BQ2(this, RealGoLivePreviewDestroyEvent.class, new AwS594S0100000_15(this, 112));
            }
        } else {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.EQ2(this, GameLinkPlayerMuteAudioEvent.class, new AwS594S0100000_15(this, 113));
            }
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.EQ2(this, GameLinkStateChangeEvent.class, new AwS594S0100000_15(this, 114));
            }
        }
        C936540aTk c936540aTk = this.LL;
        this.LLILLJJLI.setUserInfo((User) c936540aTk.LIZJ.getValue());
        C941300abQ c941300abQ2 = this.LLILLJJLI;
        Long lLJLZ = c936540aTk.LJFF.LJLZ();
        c941300abQ2.setCoinNum(lLJLZ != null ? lLJLZ.longValue() : 0L);
        this.LLILLJJLI.setState(c936540aTk.LIZLLL);
        C941300abQ c941300abQ3 = this.LLILLJJLI;
        Boolean boolLJLZ2 = c936540aTk.LJ.LJLZ();
        c941300abQ3.setMuteState(boolLJLZ2 != null ? boolLJLZ2.booleanValue() : false);
        this.LLILLJJLI.LJFF(C920910a4X.LIZ(c936540aTk.LJII));
        y1(c936540aTk.LJII);
        ((C0J1N) this.LL.LJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS184S0100000_15(this, 15));
        ((C0J1N) this.LL.LJFF.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS184S0100000_15(this, 16));
        if (C0IXT.LIZ()) {
            DataChannel dataChannel5 = this.dataChannel;
            if (dataChannel5 != null && (iMessageManager = (IMessageManager) dataChannel5.gg0(C776250Uch.class)) != null) {
                iMessageManager.addMessageListener(C001A.LINK_MIC_FAN_TICKET_METHOD.getIntType(), (OnIMMessageListener) this.LLILZIL);
            }
        } else {
            DataChannel dataChannel6 = this.dataChannel;
            if (dataChannel6 != null && (iMessageManager2 = (IMessageManager) dataChannel6.gg0(C776250Uch.class)) != null) {
                iMessageManager2.addMessageListener(C001A.LINK_MIC.getIntType(), (OnIMMessageListener) this.LLILZIL);
            }
        }
        C941300abQ c941300abQ4 = this.LLILLJJLI;
        View.OnClickListener aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(this, 43);
        if (C1848410yCV.LIZ) {
            aCListenerS150S0100000_15 = new f(aCListenerS150S0100000_15);
        }
        a aVar = new a(aCListenerS150S0100000_15);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c941300abQ4);
        }
        c941300abQ4.setOnClickListener(aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        if (C0IXT.LIZ()) {
            try {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
                    iMessageManager.removeMessageListener((OnIMMessageListener) this.LLILZIL);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
        } else {
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && (iMessageManager2 = (IMessageManager) dataChannel3.gg0(C776250Uch.class)) != null) {
                iMessageManager2.removeMessageListener((OnIMMessageListener) this.LLILZIL);
            }
        }
        C500260Jjc.LJJJLL(this.LLILLJJLI);
    }

    @Override // com.bytedance.android.widget.Widget
    public final View getView() {
        return this.LLILLJJLI;
    }

    public final void y1(int i) {
        User owner;
        boolean z;
        int i2 = this.LL.LJII;
        if (i2 == i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GameLinkMicMaskGuestItemWidget_updateNetworkState return as networkState is the same as old ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("GameLinkMicMaskGuestItemWidget", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        EnumC920920a4Y enumC920920a4YLIZ = C920910a4X.LIZ(i2);
        this.LL.LJII = i;
        EnumC920920a4Y enumC920920a4YLIZ2 = C920910a4X.LIZ(i);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("GameLinkMicMaskGuestItemWidget_updateNetworkState state = ");
        sbLIZ2.append(enumC920920a4YLIZ2);
        C20441214yg.LIZIZ("GameLinkMicMaskGuestItemWidget", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLILLJJLI.LJFF(enumC920920a4YLIZ2);
        if (enumC920920a4YLIZ != enumC920920a4YLIZ2) {
            C20441214yg.LIZIZ("NetworkStateTips", "GameLinkMicMaskGuestItemWidget_reportCurrentNetworkState");
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null) {
                owner = room.getOwner();
            } else {
                owner = null;
            }
            int i3 = 0;
            if (owner != null && owner.getId() == userLJIJJLI.getId() && userLJIJJLI.getId() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                long id = ((User) this.LL.LIZJ.getValue()).getId();
                HashMap map = new HashMap();
                C924650aAZ.LIZ(map);
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room2 != null) {
                    map.put("room_id", room2.getIdStr());
                    map.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                    map.put("guest_id", String.valueOf(id));
                }
                map.put("net_speed_level", String.valueOf(i));
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_anchor_guest_netspeed_stuck_icon_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJJIIZI(map);
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
                return;
            }
            long id2 = ((User) this.LL.LIZJ.getValue()).getId();
            HashMap map2 = new HashMap();
            C924650aAZ.LIZ(map2);
            Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room3 != null) {
                map2.put("room_id", room3.getIdStr());
                map2.put("anchor_id", String.valueOf(room3.getOwnerUserId()));
            }
            map2.put("show_guest_id", String.valueOf(id2));
            if (id2 == UserService.getInstance().user().getCurrentUserId()) {
                i3 = 1;
            }
            map2.put("is_self", String.valueOf(i3));
            map2.put("net_speed_level", String.valueOf(i));
            C924650aAZ.LJIILLIIL("livesdk_guest_netspeed_stuck_icon_show", null, map2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0aTr] */
    public GameLinkMicMaskGuestItemWidget(C936540aTk c936540aTk, C941300abQ c941300abQ) {
        this.LL = c936540aTk;
        this.LLILLJJLI = c941300abQ;
    }

    public final void x1(int i, boolean z) {
        User user;
        Long lValueOf;
        String str;
        long jLongValue;
        if (this.LLILLJJLI.LIZLLL(i, z) && (user = this.LL.LIZ.mUser) != null && (lValueOf = Long.valueOf(user.getId())) != null) {
            lValueOf.longValue();
            if (C924790aAn.LIZLLL().LJFF()) {
                str = "guest";
            } else {
                str = "viewer";
            }
            C936570aTn c936570aTn = new C936570aTn(str);
            long jLongValue2 = lValueOf.longValue();
            c936570aTn.LIZJ = jLongValue2;
            c936570aTn.LIZLLL = "guest";
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(jLongValue2);
            sbLIZ.append('-');
            sbLIZ.append("guest");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C01GW c01gw = C936590aTp.LIZ;
            Long l = (Long) ((Map) c01gw.getValue()).get(strLIZIZ);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jLongValue >= 60000) {
                ((Map) c01gw.getValue()).put(strLIZIZ, Long.valueOf(jCurrentTimeMillis));
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("anchor_audio_guest_voice_wave_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                c474500IjALIZIZ.LJJII(Long.valueOf(c936570aTn.LIZJ), "user_id");
                c474500IjALIZIZ.LJJII(c936570aTn.LIZLLL, "user_type");
                c474500IjALIZIZ.LJJII(Long.valueOf(c936570aTn.LIZIZ), "to_user_id");
                c474500IjALIZIZ.LJJII(c936570aTn.LIZ, "to_user_type");
                c474500IjALIZIZ.LJJII(c936570aTn.LJ, "show_position");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                    c474500IjALIZIZ.LJIL();
                    c474500IjALIZIZ.LIZ();
                } else {
                    c474500IjALIZIZ.LJJIJLIJ();
                    w.LIZ.getClass();
                    c474500IjALIZIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
                    c474500IjALIZIZ.LJJIJL();
                }
            }
        }
    }
}

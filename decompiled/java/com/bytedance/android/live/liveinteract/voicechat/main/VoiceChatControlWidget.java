package com.bytedance.android.live.liveinteract.voicechat.main;

import X.AbstractC1143290frD;
import X.C00S0;
import X.C0J1N;
import X.C1143300frE;
import X.C11RD;
import X.C20441214yg;
import X.C20632086k;
import X.C2188811AlT;
import X.C465900IOu;
import X.C500260Jjc;
import X.C784440Upu;
import X.C917610ZzD;
import X.C917860Zzc;
import X.C920830a4P;
import X.C923330a8R;
import X.C923340a8S;
import X.C924500aAK;
import X.C924630aAX;
import X.C924660aAa;
import X.C924790aAn;
import X.C924810aAp;
import X.C925150aBN;
import X.C925640aCA;
import X.C926240aD8;
import X.C926520aDa;
import X.C927610aFL;
import X.C927880aFm;
import X.C927970aFv;
import X.C930540aK4;
import X.C934330aQB;
import X.C945320ahu;
import X.C948450amx;
import X.C949950apN;
import X.C956950b0f;
import X.C956960b0g;
import X.EnumC1102750enp;
import X.EnumC918970a1P;
import X.InterfaceC926780aE0;
import X.InterfaceC927530aFD;
import X.InterfaceC927740aFY;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestApplyNumChangedEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3AnchorDestroyChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAudienceNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.RequestFrequencyEndEvent;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget;
import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.live.room.FollowAnchorStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.AudienceInteractionDialogLinkHostClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBizSpotInfoCenterSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMemoryLeakOptSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatControlWidget extends AbsVoiceChatControlWidget implements InterfaceC927530aFD {
    public final InterfaceC926780aE0 LL;
    public AbsVoiceChatWidget LLILLJJLI;
    public C934330aQB LLILLL;
    public final C927610aFL LLILZ = new C927610aFL();
    public Room LLILZIL;

    @Override // X.InterfaceC927530aFD
    public final void Fv1() {
        Integer num;
        C949950apN.LIZJ(2);
        C924810aAp.LJ().LIZIZ(Boolean.TRUE);
        AbsVoiceChatSubWidget absVoiceChatSubWidgetLIZJ = this.LL.LIZJ();
        AbsVoiceChatWidget absVoiceChatWidget = absVoiceChatSubWidgetLIZJ instanceof AbsVoiceChatWidget ? (AbsVoiceChatWidget) absVoiceChatSubWidgetLIZJ : null;
        this.LLILLJJLI = absVoiceChatWidget;
        if (absVoiceChatWidget != null) {
            absVoiceChatWidget.LL = this.LL;
        }
        int iIntValue = 0;
        C934330aQB c934330aQB = new C934330aQB(this, absVoiceChatWidget != null && absVoiceChatWidget.y1());
        AbsVoiceChatWidget absVoiceChatWidget2 = this.LLILLJJLI;
        if (absVoiceChatWidget2 != null && absVoiceChatWidget2.y1()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (num = (Integer) dataChannel.gg0(MultiGuestAudienceNumChangedEvent.class)) != null) {
                iIntValue = num.intValue();
            }
            C925640aCA.LJIL(iIntValue, "panel_plus_guide", "button_icon", false);
        }
        EnumC1102750enp.MULTIGUEST.load(this.dataChannel, c934330aQB, C930540aK4.LIZJ());
        c934330aQB.LLJI = new ACListenerS150S0100000_15(this, 231);
        if (!C930540aK4.LIZJ()) {
            C925150aBN.LJII(this.dataChannel);
        }
        this.LLILLL = c934330aQB;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC925160aBO
    public final void DT0() {
        C925150aBN.LIZIZ(this.dataChannel);
    }

    @Override // X.InterfaceC925160aBO
    public final void bl1() {
        VoiceChatWatchWidget voiceChatWatchWidget;
        AbsVoiceChatWidget absVoiceChatWidget = this.LLILLJJLI;
        if (absVoiceChatWidget == null || absVoiceChatWidget.y1()) {
            return;
        }
        AbsVoiceChatWidget absVoiceChatWidget2 = this.LLILLJJLI;
        if (!(absVoiceChatWidget2 instanceof VoiceChatWatchWidget) || (voiceChatWatchWidget = (VoiceChatWatchWidget) absVoiceChatWidget2) == null) {
            return;
        }
        voiceChatWatchWidget.n(false, true);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        InterfaceC927740aFY interfaceC927740aFYLIZIZ;
        AbsVoiceChatWidget absVoiceChatWidget = this.LLILLJJLI;
        if (absVoiceChatWidget != null) {
            this.LL.LIZIZ(absVoiceChatWidget);
        }
        this.LLILZ.detachView();
        if (C500260Jjc.LJJJI((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class))) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LJI("MultiGuestAsAnchorModeratorHelper", "clear");
            C923340a8S.LIZ = null;
        } else {
            C923330a8R.LIZ.LIZJ();
        }
        if (MultiGuestBizSpotInfoCenterSetting.INSTANCE.enable() && (interfaceC927740aFYLIZIZ = C00S0.LIZIZ()) != null) {
            interfaceC927740aFYLIZIZ.LIZIZ();
        }
        C948450amx c948450amx = C948450amx.LIZIZ;
        Room room = this.LLILZIL;
        c948450amx.LIZ(room != null ? Long.valueOf(room.getId()) : null, "VoiceChatControlWidget#onDestroy");
        y1("onDestroy");
        if (MultiGuestMemoryLeakOptSetting.isEnable()) {
            EnumC1102750enp.MULTIGUEST.unload(this.dataChannel);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        super.onCreate();
        C927970aFv.LIZ.getClass();
        C927970aFv.LIZIZ = null;
        y1("onCreate");
        if (C500260Jjc.LJJJI((Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class))) {
            DataChannel dataChannel = this.dataChannel;
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LJI("MultiGuestAsAnchorModeratorHelper", "init");
            C923340a8S.LIZ = dataChannel;
        } else {
            C923330a8R.LIZ.LJIIJ(this.dataChannel);
        }
        C948450amx c948450amx = C948450amx.LIZIZ;
        if (c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER") == null) {
            MultiGuestDataHolder multiGuestDataHolder = new MultiGuestDataHolder();
            c948450amx.LJFF(multiGuestDataHolder, "MULTI_GUEST_DATA_HOLDER");
            C920830a4P.LIZ = multiGuestDataHolder;
        }
        c948450amx.LJFF(new LinkControlDataHolder(), "LINK_CONTROL_DATA_HOLDER");
        if (MultiGuestBizSpotInfoCenterSetting.INSTANCE.enable()) {
            C00S0.LIZ(this.dataChannel);
        }
        C924500aAK c924500aAK = new C924500aAK();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C956950b0f.class, c924500aAK);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.SX0(C956960b0g.class, c924500aAK);
        }
        this.LLILZ.attachView(this);
        new C927880aFm();
        C930540aK4.LIZJ();
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(RequestFrequencyEndEvent.class, this, new AwS594S0100000_15(this, 527));
            dataChannel4.CQ2(MultiGuestApplyNumChangedEvent.class, this, new AwS594S0100000_15(this, 528));
            dataChannel4.CQ2(AudienceInteractionDialogLinkHostClickEvent.class, this, new AwS594S0100000_15(this, 529));
            dataChannel4.CQ2(MultiGuestV3AnchorDestroyChannel.class, this, new AwS594S0100000_15(this, 530));
            dataChannel4.CQ2(FollowAnchorStateChangeEvent.class, this, new AwS594S0100000_15(this, 531));
        }
        c948450amx.LJFF(new MultiGuestDialogManager(this), null);
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null && (room = (Room) dataChannel5.gg0(RoomChannel.class)) != null) {
            this.LLILZIL = room;
            DataChannel dataChannel6 = this.dataChannel;
            C926520aDa.LIZ(dataChannel6 != null ? Intrinsics.LJFF(dataChannel6.gg0(UserIsAnchorChannel.class), Boolean.TRUE) : false, room);
        }
        ((C0J1N) C784440Upu.LIZ().LJ(C926240aD8.class).LIZJ(C11RD.LJ(this))).LIZJ(new AfS184S0100000_15(this, 78));
        C20441214yg.LJIIIZ("VoiceChatControlWidget", "onCreate");
    }

    public VoiceChatControlWidget(InterfaceC926780aE0 interfaceC926780aE0) {
        this.LL = interfaceC926780aE0;
    }

    public final void AC(long j) {
        C924660aAa.LJIJJ("other");
        if (j != 0 && j != 10004) {
            C924660aAa.LJIJJLI("connection_over");
        }
        if (!C930540aK4.LIZJ()) {
            C917610ZzD.LIZ("others", EnumC918970a1P.NORMAL);
        }
        C924810aAp.LJ().LIZIZ(Boolean.FALSE);
        C20632086k.LIZ.LIZJ("multi-guest turn off");
    }

    @Override // X.InterfaceC927530aFD
    public final void Yq(LinkMessage linkMessage) {
        if (isViewValid() && linkMessage.scene == 4) {
            String str = linkMessage.extraStr;
            long jLongValue = -1;
            if (str != null) {
                try {
                    jLongValue = CastLongProtector.valueOf(str).longValue();
                    C917860Zzc.LIZIZ = jLongValue;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (C930540aK4.LIZJ()) {
                AC(jLongValue);
                return;
            }
            AbsVoiceChatWidget absVoiceChatWidget = this.LLILLJJLI;
            if (absVoiceChatWidget != null) {
                InterfaceC926780aE0 interfaceC926780aE0 = absVoiceChatWidget.LL;
                if (interfaceC926780aE0 != null) {
                    interfaceC926780aE0.LIZIZ(absVoiceChatWidget);
                }
                absVoiceChatWidget.LL = null;
            }
            C924660aAa.LJIJJ("other");
            if (jLongValue != 0 && jLongValue != 10004) {
                C924660aAa.LJIJJLI("connection_over");
            }
            C924630aAX.LJJJJZI();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatControlWidget
    public final void x1(C945320ahu c945320ahu) {
        AbsVoiceChatWidget absVoiceChatWidget = this.LLILLJJLI;
        if (absVoiceChatWidget != null) {
            absVoiceChatWidget.A1(c945320ahu);
        }
    }

    public final void y1(String str) {
        Room room;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reset data holder ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("VoiceChatControlWidget", C2188811AlT.LIZIZ(sbLIZ));
        C949950apN.LIZJ(0);
        C924810aAp c924810aApLJ = C924810aAp.LJ();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        c924810aApLJ.LJI(room, str);
        C20632086k.LIZ.LIZJ(str);
        C924790aAn.LIZLLL().LJIIIIZZ();
    }

    @Override // X.InterfaceC925160aBO
    public final void z31(boolean z) {
        VoiceChatWatchWidget voiceChatWatchWidget;
        C925150aBN.LJIIZILJ(this.dataChannel);
        AbsVoiceChatWidget absVoiceChatWidget = this.LLILLJJLI;
        if (absVoiceChatWidget != null && !absVoiceChatWidget.y1()) {
            AbsVoiceChatWidget absVoiceChatWidget2 = this.LLILLJJLI;
            if ((absVoiceChatWidget2 instanceof VoiceChatWatchWidget) && (voiceChatWatchWidget = (VoiceChatWatchWidget) absVoiceChatWidget2) != null) {
                voiceChatWatchWidget.n(z, false);
            }
        }
    }

    @Override // X.InterfaceC781470Ul7
    public final boolean LLIIJLIL(Runnable runnable, boolean z, boolean z2, C465900IOu c465900IOu, String str, boolean z3, EnterRoomConfig enterRoomConfig) {
        AbsVoiceChatWidget absVoiceChatWidget;
        AbsVoiceChatWidget absVoiceChatWidget2 = this.LLILLJJLI;
        if (absVoiceChatWidget2 == null || absVoiceChatWidget2.y1() || (absVoiceChatWidget = this.LLILLJJLI) == null) {
            return false;
        }
        return absVoiceChatWidget.x1(runnable, z2, c465900IOu, z3);
    }
}

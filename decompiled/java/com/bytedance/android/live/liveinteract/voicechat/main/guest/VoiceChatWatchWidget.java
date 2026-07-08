package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.AbstractC1143290frD;
import X.AbstractC928510aGn;
import X.C013C;
import X.C01GW;
import X.C01Z4;
import X.C09R3;
import X.C0KVU;
import X.C0KX4;
import X.C0UZN;
import X.C1143300frE;
import X.C1161920gLG;
import X.C11JF;
import X.C11NJ;
import X.C1303170k15;
import X.C1308910kAL;
import X.C1338270kvh;
import X.C13LE;
import X.C1555540qa8;
import X.C19748512Ol;
import X.C1AZW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C292401Bi;
import X.C304201Fw;
import X.C307001Gy;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501540Jlg;
import X.C520010KaN;
import X.C748880TZe;
import X.C766270U4b;
import X.C782110Um9;
import X.C783550UoT;
import X.C784550Uq5;
import X.C785410UrT;
import X.C786410Ut5;
import X.C914230Ztl;
import X.C915980Zwa;
import X.C919390a25;
import X.C920830a4P;
import X.C921170a4x;
import X.C921180a4y;
import X.C922030a6L;
import X.C922510a77;
import X.C922850a7f;
import X.C923330a8R;
import X.C923650a8x;
import X.C924410aAB;
import X.C924660aAa;
import X.C924670aAb;
import X.C924790aAn;
import X.C924810aAp;
import X.C925090aBH;
import X.C925150aBN;
import X.C925250aBX;
import X.C925490aBv;
import X.C925600aC6;
import X.C925640aCA;
import X.C925700aCG;
import X.C925770aCN;
import X.C925820aCS;
import X.C926410aDP;
import X.C926520aDa;
import X.C926530aDb;
import X.C926630aDl;
import X.C926760aDy;
import X.C926940aEG;
import X.C927600aFK;
import X.C927950aFt;
import X.C927960aFu;
import X.C929810aIt;
import X.C930540aK4;
import X.C931780aM4;
import X.C933010aO3;
import X.C933070aO9;
import X.C933100aOC;
import X.C933150aOH;
import X.C934690aQl;
import X.C935270aRh;
import X.C945320ahu;
import X.C945770aid;
import X.C946803n0;
import X.C948450amx;
import X.C951390arh;
import X.C963140bAe;
import X.DialogInterfaceOnDismissListenerC987010bn9;
import X.EnumC784580Uq8;
import X.EnumC926600aDi;
import X.EnumC926990aEL;
import X.InterfaceC1097170eep;
import X.InterfaceC1106030et7;
import X.InterfaceC143800gm;
import X.InterfaceC2217461Bqa;
import X.InterfaceC517220KQe;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import X.InterfaceC777420Uea;
import X.InterfaceC922040a6M;
import X.InterfaceC923350a8T;
import X.InterfaceC923660a8y;
import X.InterfaceC923890a9L;
import X.InterfaceC923940a9Q;
import X.InterfaceC926480aDW;
import X.InterfaceC926580aDg;
import X.InterfaceC926780aE0;
import X.InterfaceC933880aPS;
import Y.AcS105S0101000_12;
import Y.AcS15S0001000_12;
import Y.AcS354S0200000_15;
import Y.AcS496S0100000_15;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.audience.guide.ApplyGuideViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.HasMultiGuestV3GuestModeratorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.OpenMultiGuestModeratorsManageDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DobDialogCanceledEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthSucc;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestLinkPlayerListChange;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.MultiGuestAsGuestModeratorsWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestGuestShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyHangupSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyOptDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStatFieldSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVoiceChatBgOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractAudienceTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatAppBgLinkOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatPermissionMgrDetachOpt;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS19S1110000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes16.dex */
public final class VoiceChatWatchWidget extends AbsVoiceChatWidget implements InterfaceC923660a8y {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public C923650a8x LLILLJJLI;
    public Room LLILLL;
    public MultiGuestAsGuestModeratorsWidget LLILZ;
    public LiveDialog LLIZLLLIL;
    public C925700aCG LLJILJIL;
    public VoiceChatGuestUserInfoDialog LLJILJILJ;
    public C925770aCN LLJILLL;
    public VoiceChatGuestWidget LLJJIII;
    public LiveDialog LLJJIJI;
    public Runnable LLJJIJIIJIL;
    public VoiceChatGoLiveFragment LLJJIJIL;
    public C922850a7f LLJJJ;
    public MultiGuestGuestShareRevenueViewModel LLJJJIL;
    public ApplyGuideViewModel LLJJJJ;
    public final C304201Fw LLILZIL = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
    public final C304201Fw LLILZLL = new C304201Fw("DATA_MULTI_LIVE_DEEP_LINK_ENTER_ROOM");
    public final C01GW LLIZ = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 535));
    public final C01GW LLJ = C292401Bi.LIZ(new AwS559S0100000_15(this, 533));
    public final C01GW LLJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 532));
    public final C926410aDP LLJIJIL = new InterfaceC923350a8T() { // from class: X.0aDP
        @Override // X.InterfaceC923350a8T
        public final void LIZ(boolean z) {
            this.LL.I1(z);
        }
    };
    public EnumC926600aDi LLJJ = EnumC926600aDi.SEND_REQUEST;
    public final C01GW LLJJI = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 534));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VoiceChatWatchWidget.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VoiceChatWatchWidget.class, "deepLinkEnterMultiLiveRoomHandler", "getDeepLinkEnterMultiLiveRoomHandler()Lcom/bytedance/android/live/liveinteract/platform/common/monitor/DeepLinkEnterMultiLiveRoomDataHandler;", 0);
        c09r3.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hsv;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean y1() {
        return false;
    }

    public final void B1() {
        if (this.LLJILLL == null) {
            this.LLJILLL = new C925770aCN(-1, 1, 0, false, 0, false, 0, 0L, null, 0L, null, 8188);
        }
        DataChannel dataChannel = this.dataChannel;
        C925700aCG c925700aCG = this.LLJILJIL;
        WeakReference<C923650a8x> weakReference = new WeakReference<>(this.LLILLJJLI);
        EnumC926600aDi enumC926600aDi = this.LLJJ;
        C925770aCN c925770aCN = this.LLJILLL;
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog = new VoiceChatGuestUserInfoDialog();
        voiceChatGuestUserInfoDialog.dataChannel = dataChannel;
        voiceChatGuestUserInfoDialog.LL = c925700aCG;
        voiceChatGuestUserInfoDialog.LLILLJJLI = weakReference;
        voiceChatGuestUserInfoDialog.LLILLL = enumC926600aDi;
        voiceChatGuestUserInfoDialog.LLILZ = c925770aCN;
        this.LLJILJILJ = voiceChatGuestUserInfoDialog;
        C20441214yg.LIZIZ("VoiceChatWatchWidget", "buildDialog");
    }

    @Override // X.InterfaceC923660a8y
    public final void MA2() {
        LiveDialog liveDialog = this.LLIZLLLIL;
        if (liveDialog == null || !liveDialog.isShowing()) {
            return;
        }
        LiveDialog liveDialog2 = this.LLIZLLLIL;
        if (liveDialog2 != null) {
            liveDialog2.dismiss();
            C785410UrT.LIZ(liveDialog2);
        }
        this.LLIZLLLIL = null;
    }

    @Override // X.InterfaceC923660a8y
    public final void l9() {
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog2 = this.LLJILJILJ;
        if (voiceChatGuestUserInfoDialog2 == null || !voiceChatGuestUserInfoDialog2.isShowing() || (voiceChatGuestUserInfoDialog = this.LLJILJILJ) == null) {
            return;
        }
        voiceChatGuestUserInfoDialog.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instruction units count: 975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget.onCreate():void");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        String str;
        super.onResume();
        C923650a8x c923650a8x = this.LLILLJJLI;
        if (c923650a8x != null) {
            c923650a8x.LLILZ = false;
            if (C500260Jjc.LJJJI(c923650a8x.LLJLIL)) {
                C924660aAa.LJIJ(c923650a8x.dataChannel, null, false);
            }
            if (C500260Jjc.LJJIJIL(c923650a8x.LLJLIL)) {
                c923650a8x.LLJLIL = Boolean.FALSE;
            }
            VoiceChatAppBgLinkOptSetting voiceChatAppBgLinkOptSetting = VoiceChatAppBgLinkOptSetting.INSTANCE;
            if (voiceChatAppBgLinkOptSetting.isV3() && c923650a8x.LLJJJJ) {
                c923650a8x.LLJJJJ = false;
                C925770aCN c925770aCN = new C925770aCN(null, 0, 7, false, 0, false, 0, 0L, null, 0L, null, 8187);
                C1AZW.LJIILL(c923650a8x.logTAG(1204), "auto send apply while back to foreground", null, null);
                DataChannel dataChannel = c923650a8x.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LC0(GuestApplyEvent.class, c925770aCN);
                }
            }
            if (voiceChatAppBgLinkOptSetting.enableBgLinkMic() && c923650a8x.LLILZLL) {
                long jLIZIZ = C963140bAe.LIZIZ();
                Long l = c923650a8x.LLILZIL;
                long jLongValue = jLIZIZ - (l != null ? l.longValue() : 0L);
                if (c923650a8x.LLILZIL == null || jLongValue <= LiveInteractAudienceTimeOutSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT) {
                    c923650a8x.LLILZLL = false;
                    PthreadTimer pthreadTimer = c923650a8x.LLJLILLLLZIIL;
                    if (pthreadTimer != null) {
                        pthreadTimer.cancel();
                    }
                    if (!voiceChatAppBgLinkOptSetting.enableBgTimeOut() || C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) >= 3) {
                        C1AZW.LJIILL(c923650a8x.logTAG(1230), "showPreViewDialog while back to foreground", null, null);
                        InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) c923650a8x.mView;
                        if (interfaceC923660a8y != null) {
                            interfaceC923660a8y.i51(1);
                            return;
                        }
                        return;
                    }
                } else {
                    String strLogTAG = c923650a8x.logTAG(1220);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("linkmic in background, but overtime while back to foreground, permitMsgCreateTs:");
                    sbLIZ.append(c923650a8x.LLILZIL);
                    sbLIZ.append(", diffTime:");
                    sbLIZ.append(jLongValue);
                    C1AZW.LJIILL(strLogTAG, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    c923650a8x.LLILZIL = null;
                    c923650a8x.LLILZLL = false;
                    if (!voiceChatAppBgLinkOptSetting.enableBgTimeOut() || C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) >= 3) {
                        c923650a8x.stopInteract("play_pip_window", false, true, 10023);
                    }
                }
            }
            LinkMicApplyOptDurationSetting linkMicApplyOptDurationSetting = LinkMicApplyOptDurationSetting.INSTANCE;
            if (linkMicApplyOptDurationSetting.enable() && c923650a8x.LLJJJJJIL > 0) {
                if (System.currentTimeMillis() - c923650a8x.LLJJJJJIL <= ((long) ((linkMicApplyOptDurationSetting.duration() - 1) * 60)) * 1000 && (str = c923650a8x.LLJJJJLIIL) != null) {
                    c923650a8x.LLJJ = "anchor_invite_guest";
                    c923650a8x.tryToShowInvitedDialogForFirstFrameTimeout(str, false);
                    InterfaceC923660a8y interfaceC923660a8y2 = (InterfaceC923660a8y) c923650a8x.mView;
                    if (interfaceC923660a8y2 != null) {
                        interfaceC923660a8y2.MA2();
                    }
                }
                c923650a8x.LLJJJJJIL = 0L;
                c923650a8x.LLJJJJLIIL = null;
            }
            C922510a77.LIZ("onEnterForeground");
            C924670aAb c924670aAb = c923650a8x.LLJJJIL;
            if (c924670aAb != null) {
                C924670aAb.LIZJ(c924670aAb);
            }
        }
    }

    @Override // X.InterfaceC923660a8y
    public final void tg() {
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog2 = this.LLJILJILJ;
        if (voiceChatGuestUserInfoDialog2 == null || !voiceChatGuestUserInfoDialog2.isShowing()) {
            return;
        }
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog3 = this.LLJILJILJ;
        if (((voiceChatGuestUserInfoDialog3 != null ? voiceChatGuestUserInfoDialog3.LLILZIL : null) instanceof VoiceChatUserInfoFragment) && this.LLJJ == EnumC926600aDi.GO_LIVE && (voiceChatGuestUserInfoDialog = this.LLJILJILJ) != null) {
            voiceChatGuestUserInfoDialog.dismiss();
        }
    }

    public final FrameLayout D1() {
        View view = getView();
        if (view instanceof FrameLayout) {
            return (FrameLayout) view;
        }
        return null;
    }

    public final void M1() {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("VoiceChatWatchWidget", "unLoadMultiGuestV3GuestModeratorsWidget");
        MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget = this.LLILZ;
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (multiGuestAsGuestModeratorsWidget != null && recyclableWidgetManager != null) {
            recyclableWidgetManager.unload(multiGuestAsGuestModeratorsWidget);
            this.LLILZ = null;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(HasMultiGuestV3GuestModeratorWidget.class, Boolean.FALSE);
                return;
            }
            return;
        }
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMultiGuestV3GuestModeratorsWidget, widget is ");
        sbLIZ.append(multiGuestAsGuestModeratorsWidget);
        sbLIZ.append(", subWidgetManager is ");
        sbLIZ.append(recyclableWidgetManager);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZLLL("VoiceChatWatchWidget", strLIZIZ);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        Room roomLJIIIZ = C930540aK4.LJIIIZ();
        C914230Ztl.LIZIZ(roomLJIIIZ != null ? Long.valueOf(roomLJIIIZ.getId()) : null);
        C922510a77.LIZIZ();
        M1();
        C923330a8R c923330a8R = C923330a8R.LIZ;
        C923330a8R.LJIILJJIL(this.LLJIJIL);
        C923650a8x c923650a8x = this.LLILLJJLI;
        if (c923650a8x != null) {
            c923650a8x.detachView();
        }
        if (VoiceChatPermissionMgrDetachOpt.INSTANCE.getValue()) {
            C925090aBH.LIZ = false;
            C925090aBH.LIZIZ = false;
            C925090aBH.LIZJ = null;
            ((C11NJ) C925090aBH.LIZLLL.getValue()).LJ();
        }
        ((C951390arh) this.LLIZ.getValue()).LJFF();
        C922850a7f c922850a7f = this.LLJJJ;
        if (c922850a7f != null) {
            c922850a7f.LIZ();
        }
        FrameLayout frameLayoutD1 = D1();
        if (frameLayoutD1 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZLLL = C1555540qa8.LIZLLL(frameLayoutD1);
            MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel = this.LLJJJIL;
            if (multiGuestGuestShareRevenueViewModel != null) {
                multiGuestGuestShareRevenueViewModel.eB1(interfaceC665370Q7zLIZLLL);
            }
            ApplyGuideViewModel applyGuideViewModel = this.LLJJJJ;
            if (applyGuideViewModel != null) {
                applyGuideViewModel.eB1(interfaceC665370Q7zLIZLLL);
            }
        }
        C927950aFt c927950aFt = (C927950aFt) this.LLJI.getValue();
        C11JF c11jf = c927950aFt.LIZLLL;
        if (c11jf != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = c927950aFt.LIZLLL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            c927950aFt.LIZLLL = null;
        }
        ((C924410aAB) this.LLJJI.getValue()).LJJIJLIJ(D1());
        C934690aQl.LIZ.LIZIZ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C923650a8x c923650a8x = this.LLILLJJLI;
        if (c923650a8x != null) {
            c923650a8x.LLILZ = true;
            if (C500260Jjc.LJJIJIIJIL(c923650a8x.LLJLIL)) {
                c923650a8x.LLJLIL = Boolean.TRUE;
                DataChannel dataChannel = c923650a8x.dataChannel;
                C924660aAa.LJIIZILJ(dataChannel != null ? C500260Jjc.LJJLIIIIJ(dataChannel) : null, c923650a8x.dataChannel, false);
                if (C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) != 5) {
                    C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ());
                }
                InterfaceC923940a9Q interfaceC923940a9Q = (InterfaceC923940a9Q) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_REVIEW_MANAGER");
                if (interfaceC923940a9Q != null) {
                    interfaceC923940a9Q.LJI();
                }
            }
            C922510a77.LIZIZ();
            C924670aAb c924670aAb = c923650a8x.LLJJJIL;
            if (c924670aAb != null) {
                c924670aAb.LIZ();
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
    }

    public static void J1(ViewGroup viewGroup) {
        Context context;
        Integer numLIZJ;
        if (LinkMicVoiceChatBgOptSetting.INSTANCE.opt() && (context = viewGroup.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.c95, context)) != null) {
            viewGroup.setBackgroundColor(numLIZJ.intValue());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void A1(C945320ahu c945320ahu) {
        C919390a25 c919390a25;
        C923650a8x c923650a8x = this.LLILLJJLI;
        if (c923650a8x != null) {
            ((InterfaceC926480aDW) c923650a8x.LLJJLIIIJLLLLLLLZ.getValue()).LIZIZ(c945320ahu);
        }
        MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget = this.LLILZ;
        if (multiGuestAsGuestModeratorsWidget != null && (c919390a25 = multiGuestAsGuestModeratorsWidget.LLILZ) != null) {
            ((InterfaceC143800gm) c919390a25.LLJILJILJ.getValue()).LIZ();
        }
    }

    @Override // X.InterfaceC923660a8y
    public final void B2(List<? extends LinkPlayerInfo> list) {
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        DataChannel dataChannel;
        if (isViewValid() && (voiceChatGuestUserInfoDialog = this.LLJILJILJ) != null && voiceChatGuestUserInfoDialog.isShowing() && (dataChannel = this.dataChannel) != null) {
            dataChannel.LC0(GuestLinkPlayerListChange.class, new C926760aDy(list, false));
        }
    }

    public final void E1(String str) {
        String str2;
        if (!LinkMicStatFieldSetting.enable()) {
            return;
        }
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (multiGuestDataHolder != null) {
            jCurrentTimeMillis -= multiGuestDataHolder.LJI;
        }
        if (C929810aIt.LIZ()) {
            MultiGuestDataHolder multiGuestDataHolder2 = C920830a4P.LIZ;
            if (multiGuestDataHolder2 != null) {
                jCurrentTimeMillis = multiGuestDataHolder2.LJII;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            str2 = "reservation";
        } else {
            str2 = "apply";
        }
        C925640aCA.LJIIZILJ(str, System.currentTimeMillis() - jCurrentTimeMillis, C929810aIt.LIZLLL, str2, null, null, 0, 0, null, "leave_room", null, 1520);
    }

    @Override // X.InterfaceC923660a8y
    public final void FL2(boolean z) {
        InterfaceC923890a9L interfaceC923890a9L = null;
        if (z) {
            C923650a8x c923650a8x = this.LLILLJJLI;
            if (c923650a8x != null) {
                interfaceC923890a9L = c923650a8x.LLILLL;
            }
            VoiceChatGuestWidget voiceChatGuestWidget = new VoiceChatGuestWidget(interfaceC923890a9L);
            InterfaceC926780aE0 interfaceC926780aE0 = this.LL;
            if (interfaceC926780aE0 != null) {
                interfaceC926780aE0.LIZ(voiceChatGuestWidget);
            }
            this.LLJJIII = voiceChatGuestWidget;
            return;
        }
        VoiceChatGuestWidget voiceChatGuestWidget2 = this.LLJJIII;
        if (voiceChatGuestWidget2 != null) {
            voiceChatGuestWidget2.LLILLL = true;
            InterfaceC926780aE0 interfaceC926780aE02 = this.LL;
            if (interfaceC926780aE02 != null) {
                interfaceC926780aE02.LIZIZ(voiceChatGuestWidget2);
            }
            voiceChatGuestWidget2.LLILLL = false;
        }
        this.LLJJIII = null;
        Runnable runnable = this.LLJJIJIIJIL;
        if (runnable != null) {
            runnable.run();
        }
        this.LLJJIJIIJIL = null;
    }

    public final void I1(boolean z) {
        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onModeratorAbilityChange, hasModeratorAbility=");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1143300frELJIIJJI.getClass();
        AbstractC1143290frD.LIZ("VoiceChatWatchWidget", strLIZIZ);
        if (z) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("VoiceChatWatchWidget", "loadMultiGuestV3GuestModeratorsWidget");
            enableSubWidgetManager();
            Room room = this.LLILLL;
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (room != null && recyclableWidgetManager != null) {
                MultiGuestAsGuestModeratorsWidget multiGuestAsGuestModeratorsWidget = new MultiGuestAsGuestModeratorsWidget(room, null);
                this.LLILZ = multiGuestAsGuestModeratorsWidget;
                recyclableWidgetManager.load(multiGuestAsGuestModeratorsWidget);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.zW(HasMultiGuestV3GuestModeratorWidget.class, Boolean.TRUE);
                }
            } else {
                C1143300frE c1143300frELJIIJJI2 = C1143300frE.LJIIJJI();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("loadMultiGuestV3GuestModeratorsWidget, room is ");
                sbLIZ2.append(room);
                sbLIZ2.append(", subWidgetManager is ");
                sbLIZ2.append(recyclableWidgetManager);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c1143300frELJIIJJI2.getClass();
                AbstractC1143290frD.LIZLLL("VoiceChatWatchWidget", strLIZIZ2);
            }
        } else {
            M1();
        }
        C925150aBN.LJII(this.dataChannel);
    }

    public final void L1(String str) {
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LJIILLIIL = true;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIIIZ(str);
        c782110Um9.LJIILIIL(2131843699, new InterfaceC743640TFa() { // from class: X.0aDM
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // X.InterfaceC923660a8y
    public final void MQ0(boolean z) {
        LiveDialog liveDialog;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
            return;
        }
        LiveDialog liveDialog2 = this.LLIZLLLIL;
        int i = 2131843140;
        if (liveDialog2 == null) {
            C782110Um9 c782110Um9 = new C782110Um9(this.context);
            if (!z) {
                i = 2131843473;
            }
            c782110Um9.LJII(i);
            c782110Um9.LJIILIIL(2131842635, new InterfaceC743640TFa() { // from class: X.0aDL
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog3) {
                    liveDialog3.dismiss();
                }
            });
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            this.LLIZLLLIL = liveDialogLIZ;
            liveDialogLIZ.setCanceledOnTouchOutside(false);
        } else {
            if (!z) {
                i = 2131843473;
            }
            liveDialog2.LJLLILLLL(liveDialog2.getContext().getResources().getString(i));
        }
        LiveDialog liveDialog3 = this.LLIZLLLIL;
        if (liveDialog3 != null && (liveDialog = (LiveDialog) C926630aDl.LIZ(liveDialog3, 6, false, false, false, 122)) != null) {
            C786410Ut5.E4(liveDialog);
        }
        l9();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    @Override // X.InterfaceC923660a8y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void St0(X.C925250aBX r6) {
        /*
            r5 = this;
            java.lang.Long r0 = r6.LIZ
            r2 = 0
            if (r0 == 0) goto Lae
            long r3 = r0.longValue()
            int r0 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto Lae
            int r1 = r3.intValue()
            r0 = 20048(0x4e50, float:2.8093E-41)
            if (r1 != r0) goto L3f
            android.content.Context r1 = r5.context
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            X.C783550UoT.LIZLLL(r1, r0)
        L1f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "CheckPermissionFailed, errorCode="
            r1.append(r0)
            java.lang.Long r0 = r6.LIZ
            r1.append(r0)
            java.lang.String r0 = ", errorPrompt="
            r1.append(r0)
            java.lang.String r0 = r6.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C927960aFu.LIZ(r0)
            return
        L3f:
            int r1 = r3.intValue()
            r0 = 31011(0x7923, float:4.3456E-41)
            if (r1 != r0) goto L4d
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            X.C783550UoT.LIZ(r5, r0)
            goto L1f
        L4d:
            int r1 = r3.intValue()
            r0 = 4003037(0x3d14dd, float:5.60945E-39)
            if (r1 != r0) goto L6a
            android.content.Context r4 = r5.context
            X.0Uq8 r3 = X.EnumC784580Uq8.BAN_FOR_BROADCASTING
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.dataChannel
            if (r1 == 0) goto L66
            java.lang.Class<X.0UmC> r0 = X.C782140UmC.class
            java.lang.Object r2 = r1.gg0(r0)
            X.0Uea r2 = (X.InterfaceC777420Uea) r2
        L66:
            X.C784550Uq5.LIZIZ(r4, r5, r3, r2)
            goto L1f
        L6a:
            int r1 = r3.intValue()
            r0 = 4003036(0x3d14dc, float:5.609448E-39)
            if (r1 != r0) goto L7e
            r0 = 2131842868(0x7f115734, float:1.9319084E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
            X.C766270U4b.LJIIJJI(r0)
            goto L1f
        L7e:
            int r1 = r3.intValue()
            r0 = 4003088(0x3d1510, float:5.609521E-39)
            if (r1 != r0) goto L91
            int r2 = r6.LIZJ
            android.content.Context r1 = r5.context
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            X.C783550UoT.LIZJ(r1, r0, r2)
            goto L1f
        L91:
            int r1 = r3.intValue()
            r0 = 4003089(0x3d1511, float:5.609522E-39)
            if (r1 != r0) goto La5
            int r2 = r6.LIZJ
            android.content.Context r1 = r5.context
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.dataChannel
            X.C783550UoT.LIZIZ(r1, r0, r2)
            goto L1f
        La5:
            int r1 = r3.intValue()
            r0 = 4004515(0x3d1aa3, float:5.611521E-39)
            if (r1 == r0) goto L1f
        Lae:
            android.content.Context r1 = r5.context
            java.lang.String r0 = r6.LIZIZ
            X.C501540Jlg.LIZIZ(r1, r0, r2)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget.St0(X.0aBX):void");
    }

    @Override // X.InterfaceC923660a8y
    public final void changeOnlineUserState(int i) {
        C922030a6L c922030a6L;
        InterfaceC665370Q7z interfaceC665370Q7zF3;
        VoiceChatGuestWidget voiceChatGuestWidget = this.LLJJIII;
        if (voiceChatGuestWidget != null && (c922030a6L = voiceChatGuestWidget.LLILZ) != null) {
            InterfaceC922040a6M interfaceC922040a6M = (InterfaceC922040a6M) c922030a6L.mView;
            if (interfaceC922040a6M != null) {
                interfaceC665370Q7zF3 = interfaceC922040a6M.F3();
            } else {
                interfaceC665370Q7zF3 = null;
            }
            c922030a6L.changeOnlineUserState(interfaceC665370Q7zF3, 2);
        }
    }

    @Override // X.InterfaceC923660a8y
    public final void i51(int i) {
        FragmentManager fragmentManager;
        C923650a8x c923650a8x;
        l9();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (c923650a8x = this.LLILLJJLI) != null) {
            VoiceChatGoLiveFragment voiceChatGoLiveFragment = new VoiceChatGoLiveFragment();
            voiceChatGoLiveFragment.LLILZLL = Integer.valueOf(i);
            voiceChatGoLiveFragment.LLIZ = c923650a8x;
            this.LLJJIJIL = voiceChatGoLiveFragment;
            C926630aDl.LIZIZ(voiceChatGoLiveFragment, 3, true, true, false, null, 0, 240);
            VoiceChatGoLiveFragment voiceChatGoLiveFragment2 = this.LLJJIJIL;
            if (voiceChatGoLiveFragment2 != null) {
                voiceChatGoLiveFragment2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(this, 11));
            }
            VoiceChatGoLiveFragment voiceChatGoLiveFragment3 = this.LLJJIJIL;
            if (voiceChatGoLiveFragment3 != null) {
                voiceChatGoLiveFragment3.show(fragmentManager, "VoiceChatGoLiveFragment");
            }
        }
    }

    @Override // X.InterfaceC923660a8y
    public final void od1(C925820aCS c925820aCS) {
        Room room;
        long j;
        Throwable th = c925820aCS.LIZ;
        if (!(th instanceof C501470JlZ)) {
            C501540Jlg.LIZJ(this.context, th);
        }
        C501470JlZ c501470JlZ = (C501470JlZ) th;
        final int i = 0;
        User owner = null;
        LifecycleOwner lifecycleOwner = null;
        switch (c501470JlZ.getErrorCode()) {
            case 20048:
                C783550UoT.LIZLLL(getContext(), this.dataChannel);
                break;
            case 31002:
                CheckPermissionExtra checkPermissionExtra = (CheckPermissionExtra) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, c501470JlZ.getExtra(), CheckPermissionExtra.class);
                if (checkPermissionExtra != null) {
                    List<LinkPayPlan> list = checkPermissionExtra.payPlans;
                    String str = checkPermissionExtra.payHint;
                    if (list != null && !list.isEmpty()) {
                        C304201Fw c304201Fw = this.LLILZIL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
                        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) c304201Fw.LIZ();
                        if (multiGuestDataHolder != null) {
                            j = multiGuestDataHolder.LJJJZ;
                        } else {
                            j = 0;
                        }
                        Pg(list, j, true, str);
                    } else {
                        C766270U4b.LIZLLL(2131853073);
                    }
                }
                break;
            case 31011:
                C783550UoT.LIZ(this, this.dataChannel);
                break;
            case 4003036:
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842868));
                break;
            case 4003037:
                C923650a8x c923650a8x = this.LLILLJJLI;
                if (c923650a8x != null) {
                    Context context = this.context;
                    EnumC784580Uq8 enumC784580Uq8 = EnumC784580Uq8.BAN_FOR_BROADCASTING;
                    T t = c923650a8x.mView;
                    if (t instanceof LifecycleOwner) {
                        lifecycleOwner = (LifecycleOwner) t;
                    }
                    C784550Uq5.LIZIZ(context, lifecycleOwner, enumC784580Uq8, (InterfaceC777420Uea) c923650a8x.LLJJIJIL.getValue());
                }
                break;
            case 4003088:
                Context contextLJJIIZI = C520010KaN.LJJIIZI(this.context, false);
                if (contextLJJIIZI != null) {
                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showGuideBirthdayEditDialog(contextLJJIIZI, "live_co_host", C925600aC6.LJI(0), new C0UZN() { // from class: X.0UoX
                        @Override // X.C0UZN
                        public final Unit LJJIFFI() {
                            C20441214yg.LIZIZ("VoiceChatWatchWidget", "canceled dialog for edit dob");
                            C925600aC6.LJJIJIIJI(i);
                            DataChannel dataChannel = this.dataChannel;
                            if (dataChannel != null) {
                                dataChannel.FQ2(DobDialogCanceledEvent.class);
                            }
                            return Unit.LIZ;
                        }

                        @Override // X.C0UZN
                        public final Unit onFailed(String str2) {
                            DataChannel dataChannel;
                            if (Intrinsics.LJFF(str2, "") && i == 2 && (dataChannel = this.dataChannel) != null) {
                                dataChannel.FQ2(EditBirthFailedWithoutConfirm.class);
                            }
                            this.getClass();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("edit dob failed and msg:");
                            sbLIZ.append(str2);
                            C1AZW.LJFF("VoiceChatWatchWidget", C2188811AlT.LIZIZ(sbLIZ), null, null);
                            return Unit.LIZ;
                        }

                        @Override // X.C0UZN
                        public final Unit LJJI(String str2, String str3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(" enter edit dob succeed and dob:");
                            sbLIZ.append(str2);
                            sbLIZ.append(", appealUrl:");
                            sbLIZ.append(str3);
                            C20441214yg.LIZIZ("VoiceChatWatchWidget", C2188811AlT.LIZIZ(sbLIZ));
                            C2764015e.LIZ = true;
                            C2764015e.LIZIZ = true;
                            DataChannel dataChannel = this.dataChannel;
                            if (dataChannel != null) {
                                dataChannel.LC0(EditBirthSucc.class, Integer.valueOf(i));
                            }
                            return Unit.LIZ;
                        }
                    });
                    C925600aC6.LJJIJIL(0);
                }
                break;
            case 4003089:
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
                C782110Um9 c782110Um9 = new C782110Um9(this.context);
                c782110Um9.LJIILLIIL = false;
                c782110Um9.LJIILL = false;
                c782110Um9.LIZJ = C497740JfY.LJIJJ(2131840926, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
                String strLJJIFFI = u.LJJIFFI(C497740JfY.LJIJI(2131840925), "{username}", "%s", false);
                Object[] objArr = new Object[1];
                if (room != null) {
                    owner = room.getOwner();
                }
                objArr[0] = C0KVU.LIZ(owner);
                c782110Um9.LJIIIZ(C786410Ut5.j4(strLJJIFFI, Arrays.copyOf(objArr, 1)));
                c782110Um9.LJIIJ(2131843824, new AcS15S0001000_12(0, 2));
                c782110Um9.LJIILIIL(2131851997, new AcS105S0101000_12(0, this, 3));
                C786410Ut5.E4(c782110Um9.LIZ());
                C925600aC6.LJJIIZ(0);
                break;
            case 4004515:
                break;
            default:
                C501540Jlg.LIZJ(this.context, th);
                break;
        }
    }

    public final void G1(String str, boolean z) {
        MultiGuestDataHolder multiGuestDataHolder;
        MultiGuestDataHolder multiGuestDataHolder2;
        Long l;
        Long l2;
        C923650a8x c923650a8x;
        C1303170k15 c1303170k15Y22;
        String str2;
        DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ();
        if (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ != null) {
            deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZJ();
        }
        for (InterfaceC926580aDg interfaceC926580aDg : (InterfaceC926580aDg[]) this.LLJ.getValue()) {
            if (interfaceC926580aDg.LIZ(str)) {
                C20441214yg.LJ("VoiceChatWatchWidget", "intercept interact icon click");
                return;
            }
        }
        String str3 = null;
        if (z) {
            this.LLJILLL = null;
        }
        if (!C931780aM4.LIZ() && LinkMicSdkGeckoDslDownloadSetting.getValue() && (c923650a8x = this.LLILLJJLI) != null && (c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22()) != null && (str2 = c923650a8x.LLJJI) != null && !c1303170k15Y22.LJ(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("do not have layoutId:");
            sbLIZ.append(str2);
            C20441214yg.LJ("VoiceChatWatchPresenter", C2188811AlT.LIZIZ(sbLIZ));
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841089));
            C927960aFu.LIZ("currentDslLayoutExistsIfLink");
            C20441214yg.LJ("VoiceChatWatchWidget", "layoutId not exists");
            return;
        }
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        C923650a8x c923650a8x2 = this.LLILLJJLI;
        if (c923650a8x2 != null) {
            AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(c923650a8x2, 1096);
            MultiGuestDataHolder multiGuestDataHolder3 = c923650a8x2.getMultiGuestDataHolder();
            if ((multiGuestDataHolder3 != null && (l2 = multiGuestDataHolder3.LJJL) != null && l2.longValue() == 0) || (((multiGuestDataHolder = c923650a8x2.getMultiGuestDataHolder()) == null || multiGuestDataHolder.LJJJLL != -1) && ((multiGuestDataHolder2 = c923650a8x2.getMultiGuestDataHolder()) == null || multiGuestDataHolder2.LJJJLL != 0))) {
                MultiGuestDataHolder multiGuestDataHolder4 = c923650a8x2.getMultiGuestDataHolder();
                if (multiGuestDataHolder4 != null) {
                    awS594S0100000_15.invoke(Integer.valueOf(multiGuestDataHolder4.LJJJLL));
                    return;
                }
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings = c923650a8x2.LL.multiLiveUserSettings;
            if (multiLiveUserSettings != null && multiLiveUserSettings.isMultiGuestPermissionInfoAudienceSideNotNull()) {
                MultiGuestDataHolder multiGuestDataHolder5 = c923650a8x2.getMultiGuestDataHolder();
                if (multiGuestDataHolder5 != null) {
                    l = multiGuestDataHolder5.LJJL;
                } else {
                    l = null;
                }
                MultiGuestDataHolder multiGuestDataHolder6 = c923650a8x2.getMultiGuestDataHolder();
                if (multiGuestDataHolder6 != null) {
                    str3 = multiGuestDataHolder6.LJJLI;
                }
                C925250aBX c925250aBX = new C925250aBX(0, l, str3);
                InterfaceC923660a8y interfaceC923660a8y = (InterfaceC923660a8y) c923650a8x2.mView;
                if (interfaceC923660a8y == null) {
                    return;
                }
                interfaceC923660a8y.St0(c925250aBX);
                return;
            }
            boolean z2 = C925090aBH.LIZ;
            C925090aBH.LIZIZ(c923650a8x2.LL, c923650a8x2.dataChannel, (InterfaceC923660a8y) c923650a8x2.mView, 0, false, null, null, new AwS451S0200000_15(c923650a8x2, awS594S0100000_15, 20), null);
        }
    }

    public final void n(boolean z, boolean z2) {
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        if (!z && (voiceChatGuestUserInfoDialog = this.LLJILJILJ) != null && voiceChatGuestUserInfoDialog.isShowing()) {
            VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog2 = this.LLJILJILJ;
            if (voiceChatGuestUserInfoDialog2 != null) {
                voiceChatGuestUserInfoDialog2.dismiss();
            }
            if (z2) {
                L1(C497740JfY.LJIJI(2131844525));
            } else {
                L1(C497740JfY.LJIJI(2131854217));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void z1(String str, boolean z) {
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            H1(str, z, true);
        } else {
            C926530aDb.LIZJ(this.LLILLL, new AwS19S1110000_15(this, z, str, 2));
        }
    }

    public final void F1(String str, boolean z, boolean z2) {
        Fragment fragmentLIZ;
        C20441214yg.LIZIZ("VoiceChatWatchWidget", "onInteractIconClick");
        if (!z2 && C925150aBN.LJJIII() && C925150aBN.LJIJ(this.dataChannel)) {
            return;
        }
        if (C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) == 5) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep == null || (fragmentLIZ = interfaceC1097170eep.getFragment()) == null) {
                fragmentLIZ = C946803n0.LIZ(getView());
            }
            C935270aRh c935270aRh = new C935270aRh(C520010KaN.LJJIJIIJI(fragmentLIZ, true));
            C933010aO3 c933010aO3 = new C933010aO3();
            c933010aO3.LIZ = C497740JfY.LJIJI(2131843832);
            c933010aO3.LIZJ = new InterfaceC933880aPS() { // from class: X.0Zzk
                @Override // X.InterfaceC933880aPS
                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                    User owner;
                    boolean z3;
                    String strLJIJI;
                    Fragment fragmentLIZ2;
                    AbstractC928510aGn abstractC928510aGnLIZ;
                    Map<Long, Long> mapLJJIIZI;
                    Long l;
                    Room room;
                    liveActionSheetDialog.dismiss();
                    C785410UrT.LIZ(liveActionSheetDialog);
                    VoiceChatWatchWidget voiceChatWatchWidget = this.LIZ;
                    Object[] objArr = new Object[1];
                    DataChannel dataChannel = voiceChatWatchWidget.dataChannel;
                    if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                        owner = room.getOwner();
                    } else {
                        owner = null;
                    }
                    objArr[0] = C0KVU.LIZLLL(owner);
                    String strLJIJJ = C497740JfY.LJIJJ(2131841439, objArr);
                    InterfaceC917640ZzG interfaceC917640ZzG = (InterfaceC917640ZzG) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER");
                    if (interfaceC917640ZzG != null && (abstractC928510aGnLIZ = interfaceC917640ZzG.LIZ()) != null && (mapLJJIIZI = abstractC928510aGnLIZ.LJJIIZI()) != null && (l = mapLJJIIZI.get(Long.valueOf(C950220apo.LJFF()))) != null && l.longValue() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean zJq1 = C915980Zwa.LIZLLL().jq1();
                    C924810aAp c924810aApLJ = C924810aAp.LJ();
                    if (c924810aApLJ != null && c924810aApLJ.LJJIIJ == 3 && !zJq1 && !z3) {
                        strLJIJI = C497740JfY.LJIJI(2131836674);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131842392);
                    }
                    InterfaceC1097170eep interfaceC1097170eep2 = voiceChatWatchWidget.widgetCallback;
                    if (interfaceC1097170eep2 == null || (fragmentLIZ2 = interfaceC1097170eep2.getFragment()) == null) {
                        fragmentLIZ2 = C946803n0.LIZ(voiceChatWatchWidget.getView());
                    }
                    Context contextLJJIJIIJI = C520010KaN.LJJIJIIJI(fragmentLIZ2, true);
                    if (contextLJJIJIIJI != null) {
                        C782110Um9 c782110Um9 = new C782110Um9(contextLJJIJIIJI);
                        c782110Um9.LJIILLIIL = false;
                        c782110Um9.LJIILL = false;
                        c782110Um9.LIZJ = strLJIJJ;
                        c782110Um9.LJIIIZ(strLJIJI);
                        c782110Um9.LJIILIIL(2131843832, new AcS496S0100000_15(voiceChatWatchWidget, 65));
                        c782110Um9.LJIIJ(2131843838, new InterfaceC743640TFa() { // from class: X.0Zzl
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                            }
                        });
                        C786410Ut5.E4(c782110Um9.LIZ());
                    }
                }
            };
            c935270aRh.LIZIZ(Collections.singletonList(new C933070aO9(c933010aO3)));
            C933100aOC c933100aOC = new C933100aOC();
            c933100aOC.LIZ = C497740JfY.LJIJI(2131851480);
            c933100aOC.LIZJ = new InterfaceC933880aPS() { // from class: X.0Zzp
                @Override // X.InterfaceC933880aPS
                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                    liveActionSheetDialog.dismiss();
                    C785410UrT.LIZ(liveActionSheetDialog);
                }
            };
            c935270aRh.LIZLLL = new C933150aOH(c933100aOC);
            C786410Ut5.F4(c935270aRh.LIZ());
            return;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        if (C923330a8R.LJFF()) {
            if (z) {
                this.LLJILLL = null;
            }
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
            C925770aCN c925770aCN = this.LLJILLL;
            c927600aFKLIZ.getClass();
            if (C927600aFK.LJIILJJIL(c925770aCN)) {
                G1(str, z);
                return;
            }
            DeepLinkEnterMultiLiveRoomDataHandler deepLinkEnterMultiLiveRoomDataHandlerLIZIZ = C926520aDa.LIZIZ();
            if (deepLinkEnterMultiLiveRoomDataHandlerLIZIZ != null) {
                deepLinkEnterMultiLiveRoomDataHandlerLIZIZ.LIZJ();
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null) {
                return;
            }
            dataChannel.LC0(OpenMultiGuestModeratorsManageDialogEvent.class, new C926940aEG(EnumC926990aEL.TOOLBAR, 0, 6));
            return;
        }
        G1(str, z);
    }

    public final void H1(String str, boolean z, boolean z2) {
        long followStatus;
        FollowInfo followInfo;
        String strLIZIZ = C926530aDb.LIZIZ(z);
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        Room room = this.LLILLL;
        if (room != null) {
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            C925640aCA.LJIJJ(strLIZIZ, followStatus, ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1(), C925640aCA.LJFF(C924810aAp.LJ().LJJII), this.dataChannel, "liveHome", "multiguestBtn");
            F1(str, true, z2);
            return;
        }
        C766270U4b.LIZLLL(2131851936);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(Runnable runnable, boolean z, String str, boolean z2) {
        int i;
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && 1 == num.intValue() && LinkMicApplyHangupSetting.isEnable()) {
            C924660aAa.LJ(this.dataChannel);
        }
        this.LLJJIJIIJIL = runnable;
        C923650a8x c923650a8x = this.LLILLJJLI;
        if (c923650a8x != null) {
            if (z) {
                i = 10005;
            } else {
                i = 10003;
            }
            c923650a8x.exitInteractInNormalWay(str, false, i);
        }
        if (z2) {
            C924660aAa.LJIJJLI("live_over");
            C924660aAa.LJIJJ("live_over");
        } else {
            C924660aAa.LJIJJLI("connection_over");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC923660a8y
    public final void Pg(List list, long j, boolean z, String str) {
        Room room;
        int iLIZJ;
        FragmentManager fragmentManager;
        C925770aCN c925770aCN;
        GuestBusinessUserManager guestBusinessUserManager;
        AbstractC928510aGn<LinkListUser, LinkMessage> abstractC928510aGnLJJJZ;
        C925490aBv c925490aBv;
        C923650a8x c923650a8x = this.LLILLJJLI;
        if (c923650a8x != null && (c925490aBv = c923650a8x.LLJJIII) != null) {
            c925490aBv.LJJIL(j);
        }
        EnumC926600aDi enumC926600aDi = EnumC926600aDi.SEND_REQUEST;
        this.LLJJ = enumC926600aDi;
        C945770aid.LIZ.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        C20441214yg.LIZIZ("VoiceChatWatchWidget", "showMultiGuestUserInfoDialog");
        C923650a8x c923650a8x2 = this.LLILLJJLI;
        VoiceChatUserInfoFragment voiceChatUserInfoFragmentMR = null;
        if (c923650a8x2 != null) {
            room = c923650a8x2.LL;
        } else {
            room = null;
        }
        if (c923650a8x2 != null && (guestBusinessUserManager = c923650a8x2.LLJILJILJ) != null && (abstractC928510aGnLJJJZ = guestBusinessUserManager.LJJJZ()) != null) {
            iLIZJ = C921170a4x.LIZJ(abstractC928510aGnLJJJZ);
        } else {
            iLIZJ = 0;
        }
        this.LLJILJIL = new C925700aCG(c923650a8x2, room, z, list, iLIZJ, this.dataChannel);
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog = this.LLJILJILJ;
        if (voiceChatGuestUserInfoDialog != null && voiceChatGuestUserInfoDialog.isShowing()) {
            return;
        }
        B1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog2 = this.LLJILJILJ;
        if (voiceChatGuestUserInfoDialog2 != null) {
            EnumC926600aDi enumC926600aDi2 = this.LLJJ;
            C925770aCN c925770aCN2 = this.LLJILLL;
            voiceChatGuestUserInfoDialog2.LLILLL = enumC926600aDi2;
            voiceChatGuestUserInfoDialog2.LLILZ = c925770aCN2;
        }
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C927600aFK c927600aFKLIZ = C307001Gy.LIZ();
        C925770aCN c925770aCN3 = this.LLJILLL;
        c927600aFKLIZ.getClass();
        if (C927600aFK.LJIILJJIL(c925770aCN3) && this.LLJJ == enumC926600aDi && ((Number) C924790aAn.LIZLLL().LIZIZ).intValue() < 1) {
            if (!InterfaceC1106030et7.M5.LIZIZ().booleanValue() && (c925770aCN = this.LLJILLL) != null && c925770aCN.LIZJ == 1) {
                final C013C c013c = new C013C();
                C782110Um9 c782110Um9 = new C782110Um9(this.context);
                c782110Um9.LIZJ = C497740JfY.LJIJI(2131842127);
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131842125));
                c782110Um9.LJIILIIL(2131842123, new AcS354S0200000_15(c013c, this, 23));
                c782110Um9.LJIIJ(2131842124, new AcS496S0100000_15(c013c, 67));
                LiveDialog liveDialogLIZ = c782110Um9.LIZ();
                liveDialogLIZ.setCanceledOnTouchOutside(false);
                liveDialogLIZ.LJLILLLLZI(new InterfaceC517220KQe() { // from class: X.0Tgv
                    @Override // X.InterfaceC517220KQe
                    public final View LIZ(Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
                        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ht_, viewGroup, false);
                        C20744116Fj c20744116Fj = (C20744116Fj) viewTd.findViewById(R.id.oxk);
                        c20744116Fj.setChecked(true);
                        c013c.element = c20744116Fj.isChecked();
                        c20744116Fj.setText(C497740JfY.LJIJI(2131842126));
                        C786410Ut5.z7(c20744116Fj, new C785990UsP(c013c, 37));
                        return viewTd;
                    }
                });
                C786410Ut5.E4(liveDialogLIZ);
                HashMap map2 = new HashMap();
                C01Z4.LIZ(null, map2);
                C0KX4.LIZ("livesdk_guest_connection_apply_first_popup_show", map2, null, true);
            } else if (this.LLJILJILJ != null && getContext() != null) {
                VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog3 = this.LLJILJILJ;
                if (voiceChatGuestUserInfoDialog3 != null) {
                    voiceChatUserInfoFragmentMR = voiceChatGuestUserInfoDialog3.MR();
                }
                if ((voiceChatUserInfoFragmentMR instanceof VoiceChatUserInfoFragment) && voiceChatUserInfoFragmentMR != null) {
                    voiceChatUserInfoFragmentMR.RR(getContext());
                }
            }
        } else {
            C925770aCN c925770aCN4 = this.LLJILLL;
            if (c925770aCN4 != null) {
                c925770aCN4.LJFF = false;
            }
            VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog4 = this.LLJILJILJ;
            if (voiceChatGuestUserInfoDialog4 != null) {
                voiceChatGuestUserInfoDialog4.show(fragmentManager, "VoiceChatGuestUserInfoDialog");
            }
        }
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog5 = this.LLJILJILJ;
        if (voiceChatGuestUserInfoDialog5 == null) {
            return;
        }
        C926630aDl.LIZIZ(voiceChatGuestUserInfoDialog5, 2, false, false, false, null, 0, 250);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x1(final java.lang.Runnable r8, boolean r9, final X.C465900IOu r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget.x1(java.lang.Runnable, boolean, X.0IOu, boolean):boolean");
    }
}

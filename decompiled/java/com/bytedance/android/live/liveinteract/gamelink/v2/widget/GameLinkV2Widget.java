package com.bytedance.android.live.liveinteract.gamelink.v2.widget;

import X.AbstractC923750a97;
import X.C01GW;
import X.C0IJ7;
import X.C0IJT;
import X.C0KVU;
import X.C0KXJ;
import X.C0UZN;
import X.C1161920gLG;
import X.C11NJ;
import X.C1388190mED;
import X.C1548820qPI;
import X.C19748512Ol;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C452501pT;
import X.C465900IOu;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C501540Jlg;
import X.C520010KaN;
import X.C748880TZe;
import X.C766270U4b;
import X.C782110Um9;
import X.C784540Uq4;
import X.C785410UrT;
import X.C786410Ut5;
import X.C919690a2Z;
import X.C919700a2a;
import X.C922410a6x;
import X.C923050a7z;
import X.C923760a98;
import X.C924250a9v;
import X.C924440aAE;
import X.C924560aAQ;
import X.C924650aAZ;
import X.C924790aAn;
import X.C924810aAp;
import X.C925050aBD;
import X.C925070aBF;
import X.C925120aBK;
import X.C925130aBL;
import X.C925480aBu;
import X.C925720aCI;
import X.C925770aCN;
import X.C926390aDN;
import X.C926630aDl;
import X.C926930aEF;
import X.C929860aIy;
import X.C930940aKi;
import X.C933010aO3;
import X.C933070aO9;
import X.C933100aOC;
import X.C933150aOH;
import X.C935270aRh;
import X.C945320ahu;
import X.C951350ard;
import X.EnumC1102750enp;
import X.EnumC784580Uq8;
import X.EnumC926600aDi;
import X.InterfaceC665370Q7z;
import X.InterfaceC743640TFa;
import X.InterfaceC777420Uea;
import X.InterfaceC919320a1y;
import X.InterfaceC923600a8s;
import X.InterfaceC923620a8u;
import X.InterfaceC924460aAG;
import X.InterfaceC926480aDW;
import X.InterfaceC926560aDe;
import X.InterfaceC926590aDh;
import X.InterfaceC933880aPS;
import Y.AcS105S0101000_12;
import Y.AcS15S0001000_12;
import Y.AcS187S0300000_15;
import Y.AcS354S0200000_15;
import Y.AcS494S0100000_7;
import Y.AcS495S0100000_12;
import Y.AcS496S0100000_15;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.DobDialogCanceledEvent;
import com.bytedance.android.live.liveinteract.gamelink.model.EditBirthFailedWithoutConfirm;
import com.bytedance.android.live.liveinteract.gamelink.model.EditBirthSucc;
import com.bytedance.android.live.liveinteract.gamelink.model.GuestLinkPlayerListChange;
import com.bytedance.android.live.liveinteract.gamelink.model.TapToGoLiveEvent;
import com.bytedance.android.live.liveinteract.gamelink.v2.widget.GameLinkV2Widget;
import com.bytedance.android.live.liveinteract.gamelink.widget.GameLinkMicViewMaskWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.ApplyDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.BeInvitedDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.PreviewDialogUICtrlCmd;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv1.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiguestPauseTimeoutIntervalSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.data.multi_guest_play.ShowContent;

/* JADX INFO: loaded from: classes16.dex */
public final class GameLinkV2Widget extends LiveWidget implements InterfaceC923620a8u, InterfaceC926590aDh, WeakHandler.IHandler {
    public final InterfaceC924460aAG LL;
    public MultiLiveGuestUserInfoDialog LLILLJJLI;
    public C925720aCI LLILLL;
    public GameLinkMicViewMaskWidget LLILZ;
    public ViewGroup LLILZIL;
    public C923760a98 LLILZLL;
    public WeakHandler LLIZ;
    public boolean LLIZLLLIL;
    public LiveDialog LLJ;
    public C925770aCN LLJI;
    public Runnable LLJIJIL;
    public Room LLJILLL;
    public EnumC926600aDi LLJILJIL = EnumC926600aDi.SEND_REQUEST;
    public final AwS594S0100000_15 LLJILJILJ = new AwS594S0100000_15(this, 107);
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 120));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 123));
    public final C01GW LLJJIII = C292401Bi.LIZ(new AwS559S0100000_15(this, 121));

    public final void A1() {
        InterfaceC923620a8u interfaceC923620a8u;
        if (this.LL.LLJLLIL() == 5) {
            C935270aRh c935270aRh = new C935270aRh(this.context);
            C933010aO3 c933010aO3 = new C933010aO3();
            c933010aO3.LIZ = C497740JfY.LJIJI(2131843832);
            c933010aO3.LIZJ = new InterfaceC933880aPS() { // from class: X.0JSm
                @Override // X.InterfaceC933880aPS
                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog) {
                    User owner;
                    Room room;
                    liveActionSheetDialog.dismiss();
                    C785410UrT.LIZ(liveActionSheetDialog);
                    GameLinkV2Widget gameLinkV2Widget = this.LIZ;
                    Object[] objArr = new Object[1];
                    DataChannel dataChannel = gameLinkV2Widget.dataChannel;
                    if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
                        owner = room.getOwner();
                    } else {
                        owner = null;
                    }
                    objArr[0] = C0KVU.LIZLLL(owner);
                    String strLJIJJ = C497740JfY.LJIJJ(2131841439, objArr);
                    C782110Um9 c782110Um9 = new C782110Um9(gameLinkV2Widget.context);
                    c782110Um9.LIZJ = strLJIJJ;
                    c782110Um9.LJII(2131842392);
                    c782110Um9.LJIILIIL(2131843832, new AcS494S0100000_7(gameLinkV2Widget, 4));
                    c782110Um9.LJIIJ(2131843838, new InterfaceC743640TFa() { // from class: X.0JSn
                        @Override // X.InterfaceC743640TFa
                        public final void LIZ(LiveDialog liveDialog) {
                            liveDialog.dismiss();
                        }
                    });
                    C786410Ut5.E4(c782110Um9.LIZ());
                }
            };
            c935270aRh.LIZIZ(Collections.singletonList(new C933070aO9(c933010aO3)));
            C933100aOC c933100aOC = new C933100aOC();
            c933100aOC.LIZ = C497740JfY.LJIJI(2131851480);
            c933100aOC.LIZJ = new InterfaceC933880aPS() { // from class: X.0Zzo
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
        for (InterfaceC926560aDe interfaceC926560aDe : (InterfaceC926560aDe[]) this.LLJJIII.getValue()) {
            if (interfaceC926560aDe.LJIILIIL()) {
                return;
            }
        }
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(c923760a98, 766);
            Long l = c923760a98.LJJJLZIJ().LJJL;
            if ((l != null && l.longValue() == 0) || (c923760a98.LJJJLZIJ().LJJJLL != -1 && c923760a98.LJJJLZIJ().LJJJLL != 0)) {
                awS594S0100000_15.invoke(Integer.valueOf(c923760a98.LJJJLZIJ().LJJJLL));
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings = c923760a98.room.multiLiveUserSettings;
            if (multiLiveUserSettings == null || !multiLiveUserSettings.isMultiGuestPermissionInfoAudienceSideNotNull()) {
                T t = c923760a98.mView;
                if (!(t instanceof InterfaceC923620a8u) || (interfaceC923620a8u = (InterfaceC923620a8u) t) == null) {
                    return;
                }
                C925070aBF.LIZIZ(c923760a98.room, c923760a98.LLILLJJLI, interfaceC923620a8u, 0, false, null, null, new AwS451S0200000_15(c923760a98, awS594S0100000_15, 17), null);
                return;
            }
            C925130aBL c925130aBL = new C925130aBL(0, c923760a98.LJJJLZIJ().LJJL, c923760a98.LJJJLZIJ().LJJLI);
            InterfaceC923600a8s interfaceC923600a8s = (InterfaceC923600a8s) c923760a98.mView;
            if (interfaceC923600a8s != null) {
                interfaceC923600a8s.MD(c925130aBL);
            }
        }
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void D2(long j, String str) {
    }

    @Override // X.InterfaceC923600a8s
    public final InterfaceC665370Q7z F3() {
        return null;
    }

    @Override // X.InterfaceC923600a8s
    public final void KU0(long j) {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void Pg(List list, long j, boolean z, String str) {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void QJ2(ShowContent showContent) {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void Ue2() {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void Y6() {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void YX1() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hzy;
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void hI1() {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void iZ1() {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void jW() {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void mm1(String str) {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void nu1() {
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void oY() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC923600a8s
    public final /* synthetic */ void pz1(Boolean bool) {
    }

    @Override // X.InterfaceC923600a8s
    public final void tF2(C919690a2Z c919690a2Z) {
    }

    @Override // X.InterfaceC923600a8s
    public final void zP(C919700a2a c919700a2a) {
    }

    @Override // X.InterfaceC923600a8s
    public final void FG2() {
        Runnable runnable = this.LLJIJIL;
        if (runnable != null) {
            runnable.run();
        }
        this.LLJIJIL = null;
        GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = this.LLILZ;
        if (gameLinkMicViewMaskWidget != null) {
            Iterator it2 = ((HashMap) gameLinkMicViewMaskWidget.LLJJI).entrySet().iterator();
            while (it2.hasNext()) {
                C500260Jjc.LJJJLL((View) ((Map.Entry) it2.next()).getValue());
            }
            ((HashMap) gameLinkMicViewMaskWidget.LLJJI).clear();
            C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", "becomeNormalAudience");
        }
    }

    @Override // X.InterfaceC923600a8s
    public final void Jq2() {
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            AbstractC923750a97.exitInteractInNormalWay$default(c923760a98, "rtc_error", false, 10032, 2, null);
        }
    }

    @Override // X.InterfaceC923600a8s
    public final boolean Wc2() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog == null || !multiLiveGuestUserInfoDialog.isShowing()) {
            return false;
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
        return (multiLiveGuestUserInfoDialog2 != null ? multiLiveGuestUserInfoDialog2.mCurrentFragment : null) instanceof MultiGuestUserInfoFragment;
    }

    @Override // X.InterfaceC923600a8s
    public final void iO() {
        if (this.LLILZ != null) {
            C20441214yg.LJIIIZ("GameLinkMicViewMaskWidget", "becomeGuest");
        }
    }

    @Override // X.InterfaceC923600a8s
    public final void l9() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog2 == null || !multiLiveGuestUserInfoDialog2.isShowing() || (multiLiveGuestUserInfoDialog = this.LLILLJJLI) == null) {
            return;
        }
        multiLiveGuestUserInfoDialog.dismiss();
    }

    @Override // X.InterfaceC923600a8s
    public final boolean md() {
        Activity activityLIZ;
        Context context = this.context;
        boolean zIsInPictureInPictureMode = false;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    zIsInPictureInPictureMode = activityLIZ.isInPictureInPictureMode();
                    return zIsInPictureInPictureMode;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return zIsInPictureInPictureMode;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        C951350ard c951350ard = (C951350ard) this.LLJJ.getValue();
        c951350ard.getClass();
        C20441214yg.LJIIIZ("GameLinkToolbar", "onWidgetDestroy");
        c951350ard.LIZIZ.a9(c951350ard.LJFF);
        if (C951350ard.LJI) {
            c951350ard.LIZJ();
        }
        Iterator it2 = ((ArrayList) c951350ard.LJ).iterator();
        while (it2.hasNext()) {
            ((ValueAnimator) it2.next()).cancel();
        }
        ((ArrayList) c951350ard.LJ).clear();
        View view = EnumC1102750enp.MULTIGUEST.getView(c951350ard.LIZ);
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
            C925050aBD.LJII(c951350ard.LIZ);
        }
        if (C924250a9v.LIZ().LJJLIIIJLLLLLLLZ == 0) {
            C924250a9v.LIZ().LJL = null;
            Room room = this.LLJILLL;
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLJFF = C925050aBD.LJFF();
            if (C925050aBD.LJIIJJI(multiLiveAnchorPanelSettingsLJFF) && ((multiLiveAnchorPanelSettingsLJFF == null || multiLiveAnchorPanelSettingsLJFF.onlyAllowFollowerReq != 3 || multiLiveAnchorPanelSettingsLJFF.allowViewerReq != 3 || (room != null && (((int) room.getOwner().getFollowInfo().getFollowStatus()) == 1 || ((int) room.getOwner().getFollowInfo().getFollowStatus()) == 2))) && C923050a7z.LIZ > 0)) {
                long jUptimeMillis = SystemClock.uptimeMillis() - C923050a7z.LIZ;
                Map mapLIZ = C923050a7z.LIZ(null);
                String str = C923050a7z.LIZLLL;
                if (str == null) {
                    str = "live_over";
                }
                HashMap map = (HashMap) mapLIZ;
                map.put("trigger", str);
                C923050a7z.LJFF(null);
                C924650aAZ.LIZIZ(mapLIZ);
                map.put("duration", String.valueOf(jUptimeMillis));
                map.put("permission_type", C925050aBD.LJ());
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_guest_connection_mode_view_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJJIIZI(mapLIZ);
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
                C923050a7z.LIZ = 0L;
            }
            if (C924810aAp.LJ().LJJII > 0) {
                C923050a7z.LIZIZ(null, this.LLJILLL, 3);
            }
            C924810aAp.LJ().LIZIZ(Boolean.FALSE);
        }
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            c923760a98.detachView();
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.LLILLJJLI) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        LiveDialog liveDialog = this.LLJ;
        if (liveDialog != null && liveDialog.isShowing()) {
            LiveDialog liveDialog2 = this.LLJ;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
                C785410UrT.LIZ(liveDialog2);
            }
            this.LLJ = null;
        }
        C924560aAQ c924560aAQ = C924560aAQ.LJIIJ;
        if (c924560aAQ != null) {
            C1548820qPI.LJIIIIZZ("Multi_guest_feedback_submit", c924560aAQ.LJIIIZ);
            ((C11NJ) c924560aAQ.LJII.getValue()).LJ();
            c924560aAQ.LIZ();
        }
        C924560aAQ.LJIIJ = null;
        MultiGuestDialogManager multiGuestDialogManagerLIZ = C922410a6x.LIZ();
        if (multiGuestDialogManagerLIZ != null) {
            multiGuestDialogManagerLIZ.yQ2(AFwS250S0000000_15.get$arr$(79));
        }
        synchronized (C926390aDN.LIZ) {
            C926390aDN.LIZIZ.clear();
        }
        super.onDestroy();
        C20441214yg.LJIIIZ("GameLinkWidget", "onDestroy");
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        WeakHandler weakHandler;
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null && c923760a98.isEngineOn() && (weakHandler = this.LLIZ) != null) {
            weakHandler.sendEmptyMessageDelayed(140000, LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT);
        }
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        C20441214yg.LJIIIZ("GameLinkWidget", "onStop->onEnterBackground");
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            c923760a98.onEnterBackground();
        }
        super.onStop();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C20441214yg.LJIIIZ("GameLinkWidget", "onCreate");
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        DataChannel dataChannel = this.dataChannel;
        this.LLJILLL = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        C951350ard c951350ard = (C951350ard) this.LLJJ.getValue();
        c951350ard.getClass();
        C20441214yg.LJIIIZ("GameLinkToolbar", "onWidgetCreate");
        c951350ard.LIZIZ.Fe(c951350ard.LJFF);
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(InteractStateChangeEvent.class, this, this.LLJILJILJ);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, TapToGoLiveEvent.class, new AwS594S0100000_15(this, 108));
        }
        Room room = this.LLJILLL;
        if (room != null) {
            this.LLILZLL = new C923760a98(this, this.LL, room, this.dataChannel);
            InterfaceC924460aAG interfaceC924460aAG = this.LL;
            GameLinkMicViewMaskWidget gameLinkMicViewMaskWidget = new GameLinkMicViewMaskWidget(interfaceC924460aAG, interfaceC924460aAG.He());
            this.LLILZ = gameLinkMicViewMaskWidget;
            this.subWidgetManager.load(R.id.widget_mask_view, gameLinkMicViewMaskWidget);
        }
        Room room2 = this.LLJILLL;
        User userLIZIZ = C0KXJ.LIZIZ();
        Context context = this.context;
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 122);
        if (room2 == null || userLIZIZ == null || context == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get null: ");
            sbLIZ.append(room2);
            sbLIZ.append(", ");
            sbLIZ.append(userLIZIZ);
            sbLIZ.append(' ');
            sbLIZ.append(context);
            C20441214yg.LJIIIZ("MultiGuestFeedbackController", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C924560aAQ c924560aAQ = new C924560aAQ(room2, userLIZIZ, context, awS559S0100000_15);
            C924560aAQ.LJIIJ = c924560aAQ;
            C1548820qPI.LIZLLL("Multi_guest_feedback_submit", c924560aAQ.LJIIIZ);
        }
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            c923760a98.attachView((InterfaceC923600a8s) this);
        }
        this.LLIZ = new WeakHandler(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        super.onDetachWidget();
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            C20441214yg.LJIIIZ("GameLinkGuestPresenter", "onDetachWidget");
            c923760a98.LLILLJJLI.zQ2(c923760a98);
            DataChannelGlobal.LLILZ.zQ2(c923760a98);
            c923760a98.LL.a9(c923760a98.LLJZ);
            c923760a98.LLILLJJLI.zW(MuteMicChannel.class, Boolean.FALSE);
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.LLILLJJLI) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        super.onResume();
        C20441214yg.LJIIIZ("GameLinkWidget", "onResume");
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131842085, Integer.valueOf(LiveSdkMultiguestPauseTimeoutIntervalSetting.INSTANCE.getValue() / 60)));
        }
        WeakHandler weakHandler = this.LLIZ;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            c923760a98.onEnterForeground();
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog2 != null && multiLiveGuestUserInfoDialog2.isShowing() && (multiLiveGuestUserInfoDialog = this.LLILLJJLI) != null) {
            multiLiveGuestUserInfoDialog.onResume();
        }
        if (C924250a9v.LIZ().LJJLIIIJLLLLLLLZ != 1) {
            if (C924250a9v.LIZ().LJJLIIIJLLLLLLLZ == 2) {
                C924250a9v.LIZ().LJJLIIIJLLLLLLLZ = 0;
                A1();
                return;
            }
            return;
        }
        C924250a9v.LIZ().LJJLIIIJLLLLLLLZ = 0;
        BeInvitedDialogUICtrlCmd beInvitedDialogUICtrlCmd = C924250a9v.LIZ().LJJLIIJ;
        C924250a9v.LIZ().LJJLIIJ = null;
        C923760a98 c923760a982 = this.LLILZLL;
        if (c923760a982 != null) {
            C923760a98.LJJLIIIIJ(c923760a982, true, true, beInvitedDialogUICtrlCmd);
        }
    }

    @Override // X.InterfaceC923600a8s
    public final void tg() {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        if (Wc2() && this.LLJILJIL == EnumC926600aDi.GO_LIVE && (multiLiveGuestUserInfoDialog = this.LLILLJJLI) != null) {
            multiLiveGuestUserInfoDialog.dismiss();
        }
    }

    public GameLinkV2Widget(InterfaceC924460aAG interfaceC924460aAG) {
        this.LL = interfaceC924460aAG;
    }

    public final void B1(boolean z) {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        if (!z && (multiLiveGuestUserInfoDialog = this.LLILLJJLI) != null && multiLiveGuestUserInfoDialog.isShowing()) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
            if (multiLiveGuestUserInfoDialog2 != null) {
                multiLiveGuestUserInfoDialog2.dismiss();
            }
            E1(C497740JfY.LJIJI(2131841098));
        }
    }

    @Override // X.InterfaceC923600a8s
    public final void B2(List<LinkPlayerInfo> list) {
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        DataChannel dataChannel;
        if (isViewValid() && (multiLiveGuestUserInfoDialog = this.LLILLJJLI) != null && multiLiveGuestUserInfoDialog.isShowing() && (dataChannel = this.dataChannel) != null) {
            dataChannel.LC0(GuestLinkPlayerListChange.class, list);
        }
    }

    @Override // X.InterfaceC923600a8s
    public final void B81(long j) {
        ApplyDialogUICtrlCmd applyDialogUICtrlCmdLJJIL;
        C925480aBu c925480aBu;
        C923760a98 c923760a98 = this.LLILZLL;
        PreviewDialogUICtrlCmd previewDialogUICtrlCmd = null;
        if (c923760a98 != null && (c925480aBu = c923760a98.LLJJLIIIJLLLLLLLZ) != null) {
            applyDialogUICtrlCmdLJJIL = c925480aBu.LJJIL(j);
        } else {
            applyDialogUICtrlCmdLJJIL = null;
        }
        this.LLJILJIL = EnumC926600aDi.SEND_REQUEST;
        if (applyDialogUICtrlCmdLJJIL != null) {
            previewDialogUICtrlCmd = applyDialogUICtrlCmdLJJIL.previewDialogUICtrlCmd;
        }
        D1(applyDialogUICtrlCmdLJJIL, previewDialogUICtrlCmd);
    }

    public final void C1(C945320ahu c945320ahu) {
        ((InterfaceC926480aDW) this.LLJJI.getValue()).LIZIZ(c945320ahu);
    }

    public final void E1(String str) {
        C782110Um9 c782110Um9 = new C782110Um9(this.context);
        c782110Um9.LJIILLIIL = true;
        c782110Um9.LJIILL = false;
        c782110Um9.LJIIIZ(str);
        c782110Um9.LJIILIIL(2131843699, new InterfaceC743640TFa() { // from class: X.0aDK
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // X.InterfaceC923600a8s
    public final void FZ(C925120aBK c925120aBK) {
        CheckPermissionExtra checkPermissionExtra;
        Throwable th = c925120aBK.LIZ;
        if (!(th instanceof C501470JlZ)) {
            C501540Jlg.LIZJ(this.context, th);
            return;
        }
        C501470JlZ c501470JlZ = (C501470JlZ) th;
        if (c501470JlZ.getErrorCode() == 31002 && (checkPermissionExtra = (CheckPermissionExtra) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, c501470JlZ.getExtra(), CheckPermissionExtra.class)) != null) {
            List<LinkPayPlan> list = checkPermissionExtra.payPlans;
            if (list != null && !list.isEmpty()) {
                B81(C924250a9v.LIZ().LJJJZ);
            } else {
                C766270U4b.LIZLLL(2131853073);
            }
        }
        y1(0, null, th, c501470JlZ.getErrorCode());
    }

    @Override // X.InterfaceC923600a8s
    public final void MD(C925130aBL c925130aBL) {
        int iLongValue;
        int i = c925130aBL.LIZJ;
        Long l = c925130aBL.LIZ;
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 1;
        }
        y1(i, c925130aBL.LIZIZ, null, iLongValue);
    }

    @Override // X.InterfaceC926590aDh
    public final void U0(ViewGroup viewGroup) {
        this.LLILZIL = viewGroup;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (isViewValid() && 140000 == message.what) {
            this.LLIZLLLIL = true;
        }
    }

    @Override // X.InterfaceC923600a8s
    public final void jW0(PreviewDialogUICtrlCmd previewDialogUICtrlCmd) {
        InterfaceC924460aAG interfaceC924460aAG;
        Room room;
        int iIntValue;
        FragmentManager fragmentManager;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog;
        Integer num;
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        Fragment fragment4;
        MultiGuestPreviewFragment multiGuestPreviewFragment;
        C929860aIy c929860aIy = C929860aIy.LIZ;
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
        c929860aIy.getClass();
        boolean zLJI = C929860aIy.LJI(multiLiveGuestUserInfoDialog2);
        Fragment fragment5 = null;
        if (zLJI) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog3 = this.LLILLJJLI;
            if (multiLiveGuestUserInfoDialog3 != null) {
                fragment = multiLiveGuestUserInfoDialog3.mCurrentFragment;
            } else {
                fragment = null;
            }
            if (fragment instanceof MultiGuestUserInfoFragment) {
                c929860aIy.LIZ(multiLiveGuestUserInfoDialog3);
            } else {
                if (multiLiveGuestUserInfoDialog3 != null) {
                    fragment2 = multiLiveGuestUserInfoDialog3.mCurrentFragment;
                } else {
                    fragment2 = null;
                }
                if (fragment2 instanceof MultiGuestPreviewFragment) {
                    if (multiLiveGuestUserInfoDialog3 != null) {
                        fragment3 = multiLiveGuestUserInfoDialog3.mCurrentFragment;
                    } else {
                        fragment3 = null;
                    }
                    if (((BaseFragment) fragment3).mStatusViewValid) {
                        EnumC926600aDi enumC926600aDi = EnumC926600aDi.GO_LIVE;
                        this.LLJILJIL = enumC926600aDi;
                        if (multiLiveGuestUserInfoDialog3 != null) {
                            C925770aCN c925770aCN = this.LLJI;
                            multiLiveGuestUserInfoDialog3.mApplyType = enumC926600aDi;
                            multiLiveGuestUserInfoDialog3.mApplyInfo = c925770aCN;
                            if (previewDialogUICtrlCmd != null) {
                                multiLiveGuestUserInfoDialog3.previewOptUICtrlCmd = previewDialogUICtrlCmd;
                            }
                            fragment4 = multiLiveGuestUserInfoDialog3.mCurrentFragment;
                        } else {
                            fragment4 = null;
                        }
                        if ((fragment4 instanceof MultiGuestPreviewFragment) && (multiGuestPreviewFragment = (MultiGuestPreviewFragment) fragment4) != null) {
                            multiGuestPreviewFragment.uiCtrlCmd = previewDialogUICtrlCmd;
                        }
                        if (multiLiveGuestUserInfoDialog3 != null) {
                            fragment5 = multiLiveGuestUserInfoDialog3.mCurrentFragment;
                        }
                        ((MultiGuestPreviewFragment) fragment5).HS();
                        return;
                    }
                }
                c929860aIy.LIZ(multiLiveGuestUserInfoDialog3);
            }
        }
        this.LLJILJIL = EnumC926600aDi.GO_LIVE;
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            interfaceC924460aAG = c923760a98.LL;
            room = c923760a98.room;
        } else {
            interfaceC924460aAG = null;
            room = null;
        }
        this.LLILLL = new C925720aCI(interfaceC924460aAG, c923760a98, room, this.dataChannel);
        C925770aCN c925770aCN2 = this.LLJI;
        if (c925770aCN2 != null && (num = c925770aCN2.LIZ) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialogLIZ = C926930aEF.LIZ(MultiLiveGuestUserInfoDialog.Companion, this.dataChannel, this.LLILLL, new WeakReference(this.LLILZLL), this.LLJILJIL, new C925770aCN(Integer.valueOf(iIntValue), 1, 0, false, 0, false, 0, 0L, null, 0L, null, 8188), "permit", 0, false, 128);
        this.LLILLJJLI = multiLiveGuestUserInfoDialogLIZ;
        C926630aDl.LIZIZ(multiLiveGuestUserInfoDialogLIZ, 2, false, false, false, null, 0, 250);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null && (multiLiveGuestUserInfoDialog = this.LLILLJJLI) != null) {
            EnumC926600aDi enumC926600aDi2 = this.LLJILJIL;
            C925770aCN c925770aCN3 = this.LLJI;
            multiLiveGuestUserInfoDialog.mApplyType = enumC926600aDi2;
            multiLiveGuestUserInfoDialog.mApplyInfo = c925770aCN3;
            if (previewDialogUICtrlCmd != null) {
                multiLiveGuestUserInfoDialog.previewOptUICtrlCmd = previewDialogUICtrlCmd;
            }
            multiLiveGuestUserInfoDialog.show(fragmentManager, "MultiGuestUserInfoFragment");
        }
        C924650aAZ c924650aAZ = C924650aAZ.LIZ;
        HashMap map = new HashMap();
        Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room2 != null) {
            map.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
            map.put("room_id", room2.getIdStr());
            map.put("guest_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        }
        map.put("guest_invite_type", "guest_apply_anchor");
        map.put("connection_status", CardStruct.IStatusCode.DEFAULT);
        C924650aAZ.LIZJ(c924650aAZ, map);
        C924650aAZ.LJIILLIIL("livesdk_guest_preview_page_show", null, map);
    }

    @Override // X.InterfaceC923600a8s
    public final void jd0(Throwable th) {
        C501540Jlg.LIZJ(this.context, th);
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            AbstractC923750a97.exitInteractInNormalWay$default(c923760a98, "join_channel_error", false, 10022, 2, null);
        }
    }

    public final void D1(ApplyDialogUICtrlCmd applyDialogUICtrlCmd, PreviewDialogUICtrlCmd previewDialogUICtrlCmd) {
        InterfaceC924460aAG interfaceC924460aAG;
        Room room;
        FragmentManager fragmentManager;
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            interfaceC924460aAG = c923760a98.LL;
            room = c923760a98.room;
        } else {
            interfaceC924460aAG = null;
            room = null;
        }
        this.LLILLL = new C925720aCI(interfaceC924460aAG, c923760a98, room, this.dataChannel);
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog != null && multiLiveGuestUserInfoDialog.isShowing()) {
            return;
        }
        if (this.LLJI == null) {
            this.LLJI = new C925770aCN(-1, 1, 0, false, 0, false, 0, 0L, null, 0L, null, 8188);
        }
        this.LLILLJJLI = C926930aEF.LIZ(MultiLiveGuestUserInfoDialog.Companion, this.dataChannel, this.LLILLL, new WeakReference(this.LLILZLL), this.LLJILJIL, this.LLJI, "permit", 0, false, 128);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
            if (multiLiveGuestUserInfoDialog2 != null) {
                EnumC926600aDi enumC926600aDi = this.LLJILJIL;
                C925770aCN c925770aCN = this.LLJI;
                multiLiveGuestUserInfoDialog2.mApplyType = enumC926600aDi;
                multiLiveGuestUserInfoDialog2.mApplyInfo = c925770aCN;
                if (applyDialogUICtrlCmd != null) {
                    multiLiveGuestUserInfoDialog2.applyOptUICtrlCmd = applyDialogUICtrlCmd;
                }
                if (previewDialogUICtrlCmd != null) {
                    multiLiveGuestUserInfoDialog2.previewOptUICtrlCmd = previewDialogUICtrlCmd;
                }
            }
            C925770aCN c925770aCN2 = this.LLJI;
            if (c925770aCN2 != null) {
                c925770aCN2.LJFF = false;
            }
            if (multiLiveGuestUserInfoDialog2 != null) {
                multiLiveGuestUserInfoDialog2.show(fragmentManager, "MultiGuestUserInfoFragment");
            }
            MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog3 = this.LLILLJJLI;
            if (multiLiveGuestUserInfoDialog3 != null) {
                C926630aDl.LIZIZ(multiLiveGuestUserInfoDialog3, 2, false, false, false, null, 0, 250);
            }
        }
    }

    @Override // X.InterfaceC923600a8s
    public final void R70(int i, boolean z) {
        Fragment fragment;
        LiveDialog liveDialog;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(PIPStatusData.class), Boolean.TRUE)) {
            return;
        }
        if (this.LLJ == null) {
            C782110Um9 c782110Um9 = new C782110Um9(this.context);
            c782110Um9.LJII(2131843473);
            c782110Um9.LJIILIIL(2131843699, new InterfaceC743640TFa() { // from class: X.0aDR
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog2) {
                    liveDialog2.dismiss();
                }
            });
            this.LLJ = c782110Um9.LIZ();
        }
        LiveDialog liveDialog2 = this.LLJ;
        if (liveDialog2 != null && (liveDialog = (LiveDialog) C926630aDl.LIZ(liveDialog2, 6, false, false, false, 122)) != null) {
            C786410Ut5.E4(liveDialog);
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog != null && !multiLiveGuestUserInfoDialog.isShowing()) {
            return;
        }
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog2 = this.LLILLJJLI;
        if (multiLiveGuestUserInfoDialog2 != null) {
            fragment = multiLiveGuestUserInfoDialog2.mCurrentFragment;
        } else {
            fragment = null;
        }
        if (!(fragment instanceof MultiGuestPreviewFragment) || multiLiveGuestUserInfoDialog2 == null) {
            return;
        }
        multiLiveGuestUserInfoDialog2.dismiss();
    }

    @Override // X.InterfaceC923600a8s
    public final void uq1(int i, long j) {
        PreviewDialogUICtrlCmd previewDialogUICtrlCmdLJJIJIL;
        C924440aAE c924440aAE;
        if (i == 1) {
            C923760a98 c923760a98 = this.LLILZLL;
            if (c923760a98 != null && (c924440aAE = c923760a98.LLJJL) != null) {
                previewDialogUICtrlCmdLJJIJIL = c924440aAE.LJJIJIL(j, false);
            } else {
                previewDialogUICtrlCmdLJJIJIL = null;
            }
            if (Wc2()) {
                l9();
            }
            if (previewDialogUICtrlCmdLJJIJIL instanceof PreviewDialogUICtrlCmd) {
                this.LLJILJIL = EnumC926600aDi.GO_LIVE;
                D1(null, previewDialogUICtrlCmdLJJIJIL);
            } else {
                this.LLJILJIL = EnumC926600aDi.GO_LIVE;
                D1(null, null);
            }
        }
    }

    public final void x1(Runnable runnable, boolean z) {
        int i;
        this.LLJIJIL = runnable;
        C923760a98 c923760a98 = this.LLILZLL;
        if (c923760a98 != null) {
            if (z) {
                i = 10005;
            } else {
                i = 10003;
            }
            AbstractC923750a97.exitInteractInNormalWay$default(c923760a98, "live_end", false, i, 2, null);
        }
        C923050a7z.LJI("live_over");
        C923050a7z.LJFF("live_over");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z1(Runnable runnable, boolean z, C465900IOu c465900IOu) {
        Integer numValueOf;
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null && 1 == num.intValue()) {
            C782110Um9 c782110Um9 = new C782110Um9(getContext());
            c782110Um9.LJIIZILJ(2131842116);
            c782110Um9.LJII(2131842115);
            c782110Um9.LIZIZ = this;
            c782110Um9.LJIILIIL(2131842113, new AcS187S0300000_15(this, c465900IOu, runnable, 9));
            c782110Um9.LJIIJ(2131842114, new AcS496S0100000_15(c465900IOu, 39));
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            liveDialogLIZ.setCanceledOnTouchOutside(false);
            C786410Ut5.E4(liveDialogLIZ);
            if (c465900IOu != null) {
                numValueOf = Integer.valueOf(c465900IOu.LIZ);
            } else {
                numValueOf = null;
            }
            C924650aAZ.LJIIJ(false, numValueOf, false);
        } else {
            Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
            if (num2 == null || 2 != num2.intValue()) {
                return false;
            }
            if (z) {
                C782110Um9 c782110Um92 = new C782110Um9(getContext());
                c782110Um92.LJII(2131853461);
                c782110Um92.LJIILIIL(2131854999, new AcS354S0200000_15(this, runnable, 18));
                c782110Um92.LJIIJ(2131851524, new InterfaceC743640TFa() { // from class: X.0aDQ
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                C786410Ut5.E4(c782110Um92.LIZ());
            } else {
                x1(runnable, true);
            }
        }
        return true;
    }

    public final void y1(final int i, String str, Throwable th, int i2) {
        Room room;
        InterfaceC919320a1y interfaceC919320a1y;
        String str2;
        String str3 = "multi_live_apply";
        User owner = null;
        LifecycleOwner lifecycleOwner = null;
        switch (i2) {
            case 20048:
                String strJ4 = C786410Ut5.j4(C497740JfY.LJIJI(2131842781), Arrays.copyOf(new Object[]{String.valueOf(LiveAudienceLinkmicLowestAgeSetting.INSTANCE.getValue())}, 1));
                C782110Um9 c782110Um9 = new C782110Um9(getContext());
                c782110Um9.LJIILLIIL = true;
                c782110Um9.LJIIIZ(strJ4);
                c782110Um9.LJIILIIL(2131851997, new AcS495S0100000_12(this, 56));
                c782110Um9.LJIIJ(2131851998, new InterfaceC743640TFa() { // from class: X.0Toe
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                        HashMap map = new HashMap();
                        map.put("choose_type", "dismiss");
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("guest_connection_underage_popup");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJIIZI(map);
                        c474500IjALIZ.LJ("click");
                        c474500IjALIZ.LIZ();
                    }
                });
                C786410Ut5.E4(c782110Um9.LIZ());
                C474500IjA c474500IjALIZ = C0IJT.LIZ("guest_connection_underage_popup");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(null);
                c474500IjALIZ.LJ("show");
                c474500IjALIZ.LIZ();
                break;
            case 31011:
                C923760a98 c923760a98 = this.LLILZLL;
                if (c923760a98 != null && (interfaceC919320a1y = (InterfaceC919320a1y) c923760a98.mView) != null) {
                    Context context = interfaceC919320a1y.getContext();
                    InterfaceC777420Uea taskDispatcher = c923760a98.getTaskDispatcher();
                    new AwS591S0100000_12(c923760a98, 924);
                    C784540Uq4.LIZ(context, interfaceC919320a1y, 13, taskDispatcher);
                    break;
                }
                break;
            case 4003036:
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842868));
                break;
            case 4003037:
                C923760a98 c923760a982 = this.LLILZLL;
                if (c923760a982 != null) {
                    Context context2 = this.context;
                    EnumC784580Uq8 enumC784580Uq8 = EnumC784580Uq8.BAN_FOR_BROADCASTING;
                    if (enumC784580Uq8 != null) {
                        T t = c923760a982.mView;
                        if (t instanceof LifecycleOwner) {
                            lifecycleOwner = (LifecycleOwner) t;
                        }
                        int i3 = enumC784580Uq8.type;
                        InterfaceC777420Uea taskDispatcher2 = c923760a982.getTaskDispatcher();
                        new AwS221S0300000_12(c923760a982, context2, lifecycleOwner, 22);
                        C784540Uq4.LIZ(context2, lifecycleOwner, i3, taskDispatcher2);
                    }
                }
                break;
            case 4003088:
                Context contextLJJIIZI = C520010KaN.LJJIIZI(this.context, false);
                if (contextLJJIIZI != null) {
                    IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                    if (i == 0) {
                        str2 = "multi_live_apply";
                    } else {
                        str2 = "multi_live_accept";
                    }
                    iBroadcastService.showGuideBirthdayEditDialog(contextLJJIIZI, "live_co_host", str2, new C0UZN() { // from class: X.0UoW
                        @Override // X.C0UZN
                        public final Unit LJJIFFI() {
                            C20441214yg.LIZIZ("GameLinkWidget", "canceled dialog for edit dob");
                            int i4 = i;
                            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_add_birth_popup_window_click");
                            c474500IjALIZ2.LJJII(i4 == 0 ? "multi_live_apply" : "multi_live_accept", "request_page");
                            c474500IjALIZ2.LJJII("cancel", "click_type");
                            c474500IjALIZ2.LJIL();
                            c474500IjALIZ2.LIZ();
                            DataChannel dataChannel = this.dataChannel;
                            if (dataChannel != null) {
                                dataChannel.FQ2(DobDialogCanceledEvent.class);
                            }
                            return Unit.LIZ;
                        }

                        @Override // X.C0UZN
                        public final Unit onFailed(String str4) {
                            DataChannel dataChannel;
                            if (Intrinsics.LJFF(str4, "") && i == 2 && (dataChannel = this.dataChannel) != null) {
                                dataChannel.FQ2(EditBirthFailedWithoutConfirm.class);
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("edit dob failed and msg:");
                            sbLIZ.append(str4);
                            C20441214yg.LJ("GameLinkWidget", C2188811AlT.LIZIZ(sbLIZ));
                            return Unit.LIZ;
                        }

                        @Override // X.C0UZN
                        public final Unit LJJI(String str4, String str5) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(" enter edit dob succeed and dob:");
                            sbLIZ.append(str4);
                            sbLIZ.append(", appealUrl:");
                            sbLIZ.append(str5);
                            C20441214yg.LIZIZ("GameLinkWidget", C2188811AlT.LIZIZ(sbLIZ));
                            C2764015e.LIZ = true;
                            C2764015e.LIZIZ = true;
                            DataChannel dataChannel = this.dataChannel;
                            if (dataChannel != null) {
                                dataChannel.LC0(EditBirthSucc.class, Integer.valueOf(i));
                            }
                            return Unit.LIZ;
                        }
                    });
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_add_birth_popup_window_show");
                    if (i != 0) {
                        str3 = "multi_live_accept";
                    }
                    c474500IjALIZ2.LJJII(str3, "request_page");
                    c474500IjALIZ2.LJIL();
                    c474500IjALIZ2.LIZ();
                }
                break;
            case 4003089:
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
                C782110Um9 c782110Um92 = new C782110Um9(this.context);
                c782110Um92.LJIILLIIL = false;
                c782110Um92.LJIILL = false;
                c782110Um92.LIZJ = C497740JfY.LJIJJ(2131840926, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
                String strLJJIFFI = u.LJJIFFI(C497740JfY.LJIJI(2131840925), "{username}", "%s", false);
                Object[] objArr = new Object[1];
                if (room != null) {
                    owner = room.getOwner();
                }
                objArr[0] = C0KVU.LIZ(owner);
                c782110Um92.LJIIIZ(C786410Ut5.j4(strLJJIFFI, Arrays.copyOf(objArr, 1)));
                c782110Um92.LJIIJ(2131843824, new AcS15S0001000_12(i, 1));
                c782110Um92.LJIILIIL(2131851997, new AcS105S0101000_12(i, this, 2));
                C786410Ut5.E4(c782110Um92.LIZ());
                C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_appeal_popup_window_show");
                if (i != 0) {
                    str3 = "multi_live_accept";
                }
                c474500IjALIZ3.LJJII(str3, "request_page");
                c474500IjALIZ3.LJIL();
                c474500IjALIZ3.LIZ();
                break;
            default:
                if (str != null && str.length() == 0) {
                    C501540Jlg.LIZJ(this.context, th);
                } else {
                    C501540Jlg.LIZIZ(this.context, str, null);
                }
                break;
        }
    }
}

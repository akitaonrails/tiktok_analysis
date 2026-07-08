package X;

import Y.ALAdapterS10S0200000_15;
import Y.ARunnableS115S0100000_15;
import Y.AUListenerS150S0300000_15;
import Y.AfS151S0200000_15;
import Y.AfS41S1200000_15;
import Y.AfS65S0400000_15;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenCoHostPanelEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.AnchorClickMultiCoHostIconChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.liveinteract.api.LinkerStateChannel;
import com.bytedance.android.live.liveinteract.api.MultiCoHostApplyCountChannel;
import com.bytedance.android.live.liveinteract.api.MultiCoHostInteractionShowChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.LinkerModeChangeChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostInviteCountDownUpdateChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostCountDownEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostStateChannel;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostOnboardPermitChannel;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostPunishPermissionChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostFullChannel;
import com.bytedance.android.live.liveinteract.multihost.event.ReserveListStateChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.KickOutAllMultiGuestGuestsEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdk.dataChannel.CoHostIsClickInvite;
import com.bytedance.android.livesdk.dataChannel.CoHostQuickPairEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UnLockCoHostLopEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostInviteListPreloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.EnableCoHostAvoidCohostIconSetForResumeLive;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostAllowQuickInviteWithManualInviteSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.RivalSectionConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveDirectMatchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTeamPairSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveCoHostForSubscribersOnlyLiveSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdkapi.depend.model.live.RegionalRestricted;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS131S1200000_15;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.AwS249S0000000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ahA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944860ahA implements InterfaceViewOnClickListenerC1102800enu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final InterfaceC934580aQa LL;
    public final LifecycleOwner LLILLJJLI;
    public final C934440aQM LLILLL;
    public final Object LLILZ = new Object();
    public long LLILZIL;
    public InterfaceC1103130eoR LLILZLL;
    public Context LLIZ;
    public C1126540fQC LLIZLLLIL;
    public C16F5 LLJ;
    public ImageView LLJI;
    public C1099610eil LLJIJIL;
    public C1099610eil LLJILJIL;
    public C1099610eil LLJILJILJ;
    public View LLJILLL;
    public C1324720kZq LLJJ;
    public C1324720kZq LLJJI;
    public C1324720kZq LLJJIII;
    public C1126540fQC LLJJIJI;
    public C16F5 LLJJIJIIJIL;
    public C16FV LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public C20743416Fc LLJJJJJIL;
    public C1126540fQC LLJJJJLIIL;
    public C1143920fsE LLJJL;
    public DataChannel LLJJLIIIJLLLLLLLZ;
    public C11JF LLJL;
    public C11JF LLJLIL;
    public C11JF LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C20136513qd LLJLLIL;
    public C2183111AcH LLJLLL;
    public DataChannel LLJZ;
    public boolean LLJZIJLIL;
    public final CoHostFriendNoticeService LLL;
    public final C11NJ LLLF;
    public boolean LLLFF;
    public final Map<String, TextView> LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public EnumC919210a1n LLLII;
    public boolean LLLIIII;
    public int LLLIIIIL;
    public final C944920ahG LLLIIIL;
    public int LLLIIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C944860ahA.class, "tooltipToken", "getTooltipToken()J", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217371BqR};
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
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
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

    public final View LJI() {
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LLJZ);
        boolean z = false;
        if (interfaceC1088880eRSMn1 != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES)) {
            z = true;
        }
        if (z || C0UIM.LJFF()) {
            InterfaceC1088880eRS interfaceC1088880eRSMn12 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LLJZ);
            if (interfaceC1088880eRSMn12 == null) {
                return null;
            }
            return interfaceC1088880eRSMn12.LJIIZILJ(this.LLJZ, EnumC1102750enp.MORE);
        }
        InterfaceC1088880eRS interfaceC1088880eRSMn13 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.LLJZ);
        if (interfaceC1088880eRSMn13 == null) {
            return null;
        }
        return interfaceC1088880eRSMn13.LJIIZILJ(this.LLJZ, EnumC1102750enp.INTERACTION_FEATURES);
    }

    public final long LJII() {
        return ((Number) this.LLJLLIL.getValue(this, LLLIILIL[0])).longValue();
    }

    public final void LJIIJJI() {
        Context context;
        String string;
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_INTERACTIVE_MIC);
        int i = this.LLLIIIIL;
        if (i == 0) {
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            C1324720kZq c1324720kZq = this.LLJJ;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            ImageView imageView = this.LLJI;
            if (imageView != null) {
                C786410Ut5.LJZI(8, imageView);
            }
            LJJ("onLinkCrossRoomStateChanged_0");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setLinkDrawable, linkcrossroom state idle. linkCrossRoomState:");
            sbLIZ.append(this.LLLIIIIL);
            C944240agA.LJFF("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
            LJIIZILJ();
            return;
        }
        if (i == 1) {
            if (LiveCohostAllowQuickInviteWithManualInviteSetting.INSTANCE.isEnable()) {
                return;
            }
            C20441214yg.LJIIIZ("ToolbarCoHostBehavior", "Updated to waiting state");
            if (LiveMatchTeamPairSetting.INSTANCE.isEnable() && C915980Zwa.LJIIIZ().LJFF() == EnumC958840b3i.TEAM_PAIR) {
                C20441214yg.LJIIIZ("ToolbarCoHostBehavior", "Team pair does not need to update UI. Skip");
                return;
            }
            if (LiveDirectMatchSetting.INSTANCE.isEnabled() && C915980Zwa.LJIIIZ().LJFF() == EnumC958840b3i.QUICK_BATTLE) {
                C20441214yg.LJIIIZ("ToolbarCoHostBehavior", "Quick Battle does not need to update UI. Skip");
                return;
            }
            LJIJ(false);
            C2183111AcH c2183111AcH = this.LLJLLL;
            if (c2183111AcH != null) {
                c2183111AcH.LIZ(null);
            }
            View view = this.LLJILLL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (C917860Zzc.LIZIZ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setLinkDrawable, linkCrossRoomConnected. linkCrossRoomState:");
                sbLIZ2.append(this.LLLIIIIL);
                C944240agA.LJFF("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ2));
                LJIIZILJ();
            } else {
                LJIJJ();
            }
            C16F5 c16f52 = this.LLJ;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
            C1324720kZq c1324720kZq2 = this.LLJJ;
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 8);
            }
            ImageView imageView2 = this.LLJI;
            if (imageView2 != null) {
                C786410Ut5.LJZI(8, imageView2);
            }
            LJJ("onLinkCrossRoomStateChanged_2");
            InterfaceC1103130eoR interfaceC1103130eoR = this.LLILZLL;
            if (interfaceC1103130eoR == null || interfaceC1103130eoR.getVisibility() != 0 || InterfaceC960800b6s.LLJJLIIIJLLLLLLLZ.LIZIZ().booleanValue() || (context = this.LLIZ) == null || (string = context.getString(2131841246)) == null) {
                return;
            }
            final AFwS203S0000000_15 aFwS203S0000000_15 = AFwS203S0000000_15.get$arr$(319);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
            InterfaceC1103130eoR interfaceC1103130eoR2 = this.LLILZLL;
            C785230UrB c785230UrB = new C785230UrB(interfaceC1103130eoR2 != null ? interfaceC1103130eoR2.LJ() : null);
            c785230UrB.LJIJJ = string;
            c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0ahJ
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    aFwS203S0000000_15.invoke();
                    DataChannel dataChannel = this.LLJZ;
                    if (dataChannel != null) {
                        dataChannel.SX0(C956920b0c.class, Boolean.TRUE);
                    }
                }
            };
            c785230UrB.LJIILLIIL = new C987200bnS(this, 4);
            c1113800f5e2.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.ANCHOR_INTERACTIVE_MIC, this.LLJZ);
        }
    }

    public final void LJIJJ() {
        Boolean bool;
        if (!this.LLLII.isMultiCoHost() || !C915980Zwa.LJII().LLFFF()) {
            Context context = this.LLIZ;
            LJIILL(new C20743516Fd(context != null ? C14MI.LIZ(context, R.drawable.eo0) : null));
            return;
        }
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(MultiCoHostFullChannel.class)) != null && bool.booleanValue()) {
            LJIILJJIL(R.drawable.ep2);
        } else if (this.LLJJJJ) {
            LJIILLIIL(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "live_cohost_entrance_linked.webp");
        } else {
            LJIILLIIL(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "live_cohost_entrance_linked_without_title.webp");
        }
    }

    public final void LIZJ() {
        Integer num;
        View view;
        View viewLJI = LJI();
        Object parent = viewLJI != null ? viewLJI.getParent() : null;
        if ((parent instanceof View) && (view = (View) parent) != null) {
            C0GZA.LIZIZ(view);
        }
        if (this.LLLI) {
            int iIntValue = 0;
            this.LLLI = false;
            C955400ayA c955400ayA = C955400ayA.LIZ;
            DataChannel dataChannel = this.LLJZ;
            HashMap map = new HashMap();
            map.put("reservation_type", "cohost");
            map.put("position", C955400ayA.LJJJJLL(dataChannel));
            if (dataChannel != null && (num = (Integer) dataChannel.gg0(MultiCoHostApplyCountChannel.class)) != null) {
                iIntValue = num.intValue();
            }
            map.put("reservation_anchor_cnts", String.valueOf(iIntValue));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_reservation_dot_click");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJIIZILJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLinkDrawable, linkCrossRoomState:");
        sbLIZ.append(this.LLLIIIIL);
        C944240agA.LJFF("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LLJJLIIIJLLLLLLLZ;
        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE) || C915980Zwa.LJII().LLI().isLinked()) {
            LJIILJJIL(R.drawable.eo2);
        }
    }

    public final void LJ(Map<String, String> map) {
        C943870afZ c943870afZ;
        String str;
        String str2 = "connection_icon";
        if (this.LLJJJIL) {
            this.LLJJJIL = false;
            if (map != null && (str = map.get("enter_from")) != null) {
                str2 = str;
            }
            c943870afZ = new C943870afZ(str2);
        } else if (this.LLJJJ) {
            c943870afZ = new C943870afZ("pk_pairing_popup");
        } else if (C915980Zwa.LJIIIZ().Jf()) {
            c943870afZ = new C943870afZ("random_match_countdown");
        } else {
            DataChannel dataChannel = this.LLJZ;
            if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C956770b0N.class), Boolean.TRUE)) {
                c943870afZ = new C943870afZ("online_friend_icon");
            } else {
                c943870afZ = new C943870afZ("connection_icon");
            }
        }
        final String strValueOf = String.valueOf(System.currentTimeMillis());
        Map<String, C955440ayE> map2 = C956080azG.LIZ;
        if (C956080azG.LIZLLL) {
            C956080azG.LIZ.put(strValueOf, new C955440ayE());
            C786410Ut5.LJLIIL(240000L, C956080azG.LIZIZ, new Runnable() { // from class: X.0ahH
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CoHostInvitationListMonitorHelper@9429.pluginLoadStart$1");
                    try {
                        Map<String, C955440ayE> map3 = C956080azG.LIZ;
                        C956080azG.LIZJ(strValueOf, "timeOut", false);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CoHostInvitationListMonitorHelper@9429.pluginLoadStart$1");
                }
            });
        }
        int i = C944970ahL.LIZ[EnumC944990ahN.AVAILABLE.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    InterfaceC927900aFo interfaceC927900aFoLIZ = C927890aFn.LIZ();
                    if (interfaceC927900aFoLIZ != null) {
                        interfaceC927900aFoLIZ.LIZJ(new AwS131S1200000_15(strValueOf, this, c943870afZ, 7));
                    } else {
                        C956080azG.LIZJ(strValueOf, "LinkMicAppBundleUtil_is_null", false);
                        this.LL.l0(c943870afZ, null, "from_cohost_icon", null);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                new AwS131S1200000_15(strValueOf, this, c943870afZ, 6).invoke();
            }
        } else {
            C956080azG.LIZJ(strValueOf, "", true);
            this.LL.l0(c943870afZ, null, "from_cohost_icon", map);
        }
        C1143920fsE c1143920fsE = this.LLJJL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C16F5 c16f5 = this.LLJJIJIIJIL;
        if (c16f5 != null) {
            C439101nJ.LJI(c16f5);
        }
        LIZJ();
    }

    public final void LJIIIZ(C945060ahU c945060ahU) {
        DataChannel dataChannel;
        EnumC952640ati enumC952640ati;
        CoHostInviteListPreloadSetting coHostInviteListPreloadSetting = CoHostInviteListPreloadSetting.INSTANCE;
        if (!coHostInviteListPreloadSetting.isEnable() || !coHostInviteListPreloadSetting.isFetchWhenCapsuleShowEnabled() || (dataChannel = this.LLJZ) == null) {
            return;
        }
        long j = c945060ahU.LIZ;
        if (j == 0) {
            return;
        }
        if (C946270ajR.LIZLLL) {
            C20441214yg.LIZIZ("ToolbarCoHostBehavior", "skip capsule preload, panel already opened");
            return;
        }
        long fetchValidTimeMillis = coHostInviteListPreloadSetting.getFetchValidTimeMillis();
        if (fetchValidTimeMillis > 0 && SystemClock.uptimeMillis() - this.LLILZIL > fetchValidTimeMillis) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip capsule preload, out of valid window, validTime=");
            sbLIZ.append(fetchValidTimeMillis);
            C20441214yg.LIZIZ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (c945060ahU.LIZIZ) {
            enumC952640ati = EnumC952640ati.FRIENDS;
        } else {
            enumC952640ati = EnumC952640ati.RECOMMEND;
        }
        if (!coHostInviteListPreloadSetting.getRivalSectionOpenPreloadList().contains(Integer.valueOf(enumC952640ati.getValue()))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("skip capsule preload, section not opted into preload, section=");
            sbLIZ2.append(enumC952640ati.name());
            C20441214yg.LIZIZ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("preload on capsule show, uid=");
        sbLIZ3.append(j);
        sbLIZ3.append(", section=");
        sbLIZ3.append(enumC952640ati.name());
        C20441214yg.LJIIIZ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ3));
        C960940b76.LIZ(dataChannel, "preload_when_load_widget", Collections.singletonList(enumC952640ati), false);
    }

    public final void LJIIL(String str) {
        Boolean bool;
        long id;
        FragmentManager fragmentManager;
        Room room;
        C955440ayE c955440ayE = new C955440ayE();
        c955440ayE.LJIIL("from_cohost_icon", "source", true);
        c955440ayE.LJIIL(str, "sec_source", true);
        c955440ayE.LJIJJLI("cohost_icon_click");
        CoHostFriendNoticeService coHostFriendNoticeService = this.LLL;
        coHostFriendNoticeService.getClass();
        C20441214yg.LIZIZ("CoHostFriendNoticeService", "onCoHostBtnNoticeClicked");
        coHostFriendNoticeService.LLJ = 1;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService.getRequestControl() != null) {
            C1ALS.LIZ();
        }
        DataChannel dataChannel = this.LLJZ;
        C914590ZuL c914590ZuL = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(CoHostOnboardPermitChannel.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJIFFI(bool)) {
            DataChannel dataChannel2 = this.LLJZ;
            if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
                C766270U4b.LIZLLL(2131844624);
                new C955440ayE().LJJIL("from_cohost_icon", str, "pre_viewer_limited");
                return;
            }
            DataChannel dataChannel3 = this.LLJZ;
            if (dataChannel3 != null && (fragmentManager = (FragmentManager) dataChannel3.gg0(C748880TZe.class)) != null) {
                DataChannel dataChannel4 = this.LLJZ;
                if (dataChannel4 != null && (room = (Room) dataChannel4.gg0(RoomChannel.class)) != null) {
                    numValueOf = Integer.valueOf(room.cppVersion);
                }
                if (numValueOf == 2) {
                    iBroadcastService.showCppUnlockGuideDialogV2(C497740JfY.LJIJI(2131842920), "cohost", Boolean.FALSE, fragmentManager);
                } else {
                    iBroadcastService.showCppUnlockGuideDialog(C497740JfY.LJIJI(2131842920), "cohost", Boolean.FALSE, fragmentManager);
                }
            }
            C955400ayA.LLIFFJFJJ("connection_invite", null, null, null, null, 30);
            new C955440ayE().LJJIL("from_cohost_icon", str, "pre_onboard_permit");
            return;
        }
        DataChannel dataChannel5 = this.LLJZ;
        if (dataChannel5 != null) {
            c914590ZuL = (C914590ZuL) dataChannel5.gg0(CoHostPunishPermissionChannel.class);
        }
        if (!C915980Zwa.LJIIIZ().Jf() && !C915980Zwa.LJI().LJIIJ().LIZ() && c914590ZuL != null && c914590ZuL.LIZ) {
            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            C925610aC7.LIZ(this.LLJZ, id, null, null, new AwS164S1100000_15(this, str, 10), true, this.LLIZ);
            new C955440ayE().LJJIL("from_cohost_icon", str, "pre_punish_validate");
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sec_source", str);
        LJ(linkedHashMap);
    }

    public final void LJIILIIL(boolean z) {
        Room room;
        Integer numValueOf;
        if (this.LLLIIII != z) {
            this.LLLIIII = z;
            C931800aM6.LIZ.getClass();
            int i = 0;
            if (C931800aM6.LIZIZ() && EnableCoHostAvoidCohostIconSetForResumeLive.INSTANCE.enable() && !this.LLLFZ && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isResumeLiveForAnchor, room.creator.roomContinue = ");
                Creator creator = room.creator;
                if (creator != null) {
                    numValueOf = Integer.valueOf(creator.roomContinue);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C20441214yg.LIZIZ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
                Creator creator2 = room.creator;
                if (creator2 != null && creator2.roomContinue > 0) {
                    C20441214yg.LIZIZ("ToolbarCoHostBehavior", "onCrossRoomPermissionChanged return for in guest scene");
                    this.LLLFZ = true;
                    return;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onCrossRoomPermissionChanged call, canLinkCrossRoom = ");
            sbLIZ2.append(this.LLLIIII);
            C20441214yg.LIZIZ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ2));
            if (!this.LLLIIII) {
                i = 8;
            }
            LJIJJLI(i);
        }
    }

    public final void LJIILJJIL(int i) {
        if (this.LLJJJJ) {
            C1126540fQC c1126540fQC = this.LLIZLLLIL;
            if (c1126540fQC != null) {
                c1126540fQC.clearAnimation();
            }
            C1126540fQC c1126540fQC2 = this.LLIZLLLIL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setImageDrawable(null);
            }
            LJIJ(true);
            C1126540fQC c1126540fQC3 = this.LLJJJJLIIL;
            if (c1126540fQC3 != null) {
                c1126540fQC3.setImageResource(i);
            }
        } else {
            LJIJ(true);
            C1126540fQC c1126540fQC4 = this.LLIZLLLIL;
            if (c1126540fQC4 != null) {
                c1126540fQC4.clearAnimation();
            }
            C1126540fQC c1126540fQC5 = this.LLIZLLLIL;
            if (c1126540fQC5 != null) {
                c1126540fQC5.setImageResource(i);
            }
        }
        C1143920fsE c1143920fsE = this.LLJJL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
    }

    public final void LJIILL(Drawable drawable) {
        if (this.LLJJJJ) {
            C1126540fQC c1126540fQC = this.LLIZLLLIL;
            if (c1126540fQC != null) {
                c1126540fQC.clearAnimation();
            }
            C1126540fQC c1126540fQC2 = this.LLIZLLLIL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setImageDrawable(null);
            }
            LJIJ(true);
            C1126540fQC c1126540fQC3 = this.LLJJJJLIIL;
            if (c1126540fQC3 != null) {
                c1126540fQC3.setImageDrawable(drawable);
                return;
            }
            return;
        }
        C1126540fQC c1126540fQC4 = this.LLIZLLLIL;
        if (c1126540fQC4 != null) {
            c1126540fQC4.clearAnimation();
        }
        C1126540fQC c1126540fQC5 = this.LLIZLLLIL;
        if (c1126540fQC5 == null) {
            return;
        }
        c1126540fQC5.setImageDrawable(drawable);
    }

    public final void LJIJ(boolean z) {
        if (this.LLJJJJ) {
            C20441214yg.LJIIIIZZ("Toolbar icon set invisible");
            C1126540fQC c1126540fQC = this.LLJJJJLIIL;
            if (c1126540fQC != null) {
                C500260Jjc.LJLJLJ(c1126540fQC, z);
                return;
            }
            return;
        }
        C1126540fQC c1126540fQC2 = this.LLIZLLLIL;
        if (c1126540fQC2 == null) {
            return;
        }
        C500260Jjc.LJLJLJ(c1126540fQC2, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Long] */
    public final void LJIJI(long j) {
        C20136513qd c20136513qd = this.LLJLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        c20136513qd.LL = Long.valueOf(j);
    }

    public final void LJIJJLI(int i) {
        boolean z;
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLILZLL;
        if (interfaceC1103130eoR != null) {
            if (i == 0) {
                if (!LiveCoHostForSubscribersOnlyLiveSetting.INSTANCE.isEnabled() && C494680Jac.LJIILL(this.LLJZ)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!this.LLLIIII || z) {
                    return;
                }
            }
            if (!this.LLILLL.LIZJ && this.LLLIIII && i == 0) {
                C925240aBW.LJIILLIIL(1L, r1.LIZ());
                this.LLILLL.LIZJ = true;
            }
            interfaceC1103130eoR.setVisibility(i);
            if (i == 0 && !this.LLJZIJLIL) {
                this.LLJZIJLIL = true;
                C925600aC6.LJIIIIZZ("connecton_icon");
            }
        }
    }

    public final void LJIL(long j) {
        ViewParent parent;
        Integer num;
        View viewLJI = LJI();
        View view = null;
        if (viewLJI != null) {
            parent = viewLJI.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            view = (View) parent;
        }
        int iIntValue = 0;
        if (view != null) {
            float fLIZIZ = (int) C497740JfY.LIZIZ(8.0f);
            float fLIZIZ2 = (int) C497740JfY.LIZIZ(8.0f);
            if (LiveToolbarUIConfig.noText()) {
                fLIZIZ = (int) C497740JfY.LIZIZ(14.0f);
                fLIZIZ2 = (int) C497740JfY.LIZIZ(6.0f);
            }
            C0GZA.LIZ(view, (int) j, fLIZIZ, fLIZIZ2);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).setClipChildren(false);
            }
        }
        this.LLLI = true;
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            dataChannel.zW(MultiCoHostApplyCountChannel.class, Integer.valueOf((int) j));
        }
        C955400ayA c955400ayA = C955400ayA.LIZ;
        DataChannel dataChannel2 = this.LLJZ;
        HashMap map = new HashMap();
        map.put("reservation_type", "cohost");
        map.put("position", C955400ayA.LJJJJLL(dataChannel2));
        if (dataChannel2 != null && (num = (Integer) dataChannel2.gg0(MultiCoHostApplyCountChannel.class)) != null) {
            iIntValue = num.intValue();
        }
        map.put("reservation_anchor_cnts", String.valueOf(iIntValue));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_reservation_dot_show");
        c474500IjALIZ.LJIJJLI(dataChannel2);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public final void LJJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopRefreshPreviewAvatar, source=");
        sbLIZ.append(str);
        C20441214yg.LJ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
        C2183111AcH c2183111AcH = this.LLJLLL;
        if (c2183111AcH != null) {
            c2183111AcH.LIZIZ();
        }
        C1099610eil c1099610eil = this.LLJIJIL;
        if (c1099610eil != null) {
            C786410Ut5.LLLJ(c1099610eil, 8);
        }
        C1099610eil c1099610eil2 = this.LLJILJIL;
        if (c1099610eil2 != null) {
            C786410Ut5.LLLJ(c1099610eil2, 8);
        }
        C1099610eil c1099610eil3 = this.LLJILJILJ;
        if (c1099610eil3 != null) {
            C786410Ut5.LLLJ(c1099610eil3, 8);
        }
        View view = this.LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
    }

    public final void LJJI(EnumC944960ahK enumC944960ahK) {
        EnumC950120ape enumC950120apeLLI;
        int i = C944970ahL.LIZJ[enumC944960ahK.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    DataChannel dataChannel = this.LLJZ;
                    if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
                        mx(this.LLJZ);
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            LJIIZILJ();
            return;
        }
        if (C915980Zwa.LJIIIZ().Jf()) {
            C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.VIEWER_LIMIT, null);
        }
        IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        if (iMultiHostServiceLJII != null && (enumC950120apeLLI = iMultiHostServiceLJII.LLI()) != null && enumC950120apeLLI.isLinked()) {
            return;
        }
        mx(this.LLJZ);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void dK(DataChannel dataChannel) {
        C16FV c16fv = this.LLJJIJIL;
        if (c16fv != null) {
            C786410Ut5.LLJJJJJIL(c16fv, 8);
        }
        if (this.LLLIIIIL != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setLinkDrawable, enableToolbarbutton. linkCrossRoomState:");
            sbLIZ.append(this.LLLIIIIL);
            C944240agA.LJFF("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
            LJIIZILJ();
            return;
        }
        LJIJJ();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void mx(DataChannel dataChannel) {
        Room room;
        DataChannel dataChannel2 = this.LLJZ;
        if (dataChannel2 != null) {
            dataChannel = dataChannel2;
        }
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.cppVersion == 2 && !Intrinsics.LJFF(dataChannel.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
            if (!this.LLLFF) {
                if (this.LLJJIJIL != null) {
                    C1143680frq.LJI(this.LLJJIJIL, C1143780fs0.LJIIJ("tiktok_live_broadcast_demand_4", "ttlive_ic_cpp_lock_v1.png"), null, true);
                    C16FV c16fv = this.LLJJIJIL;
                    if (c16fv != null) {
                        C786410Ut5.LLJJJJJIL(c16fv, 0);
                    }
                }
                C16FV c16fv2 = this.LLJJIJIL;
                if (c16fv2 != null) {
                    C500260Jjc.LLFFF(c16fv2);
                    return;
                }
                return;
            }
            return;
        }
        Drawable drawable = null;
        if (this.LLJJJJ) {
            Drawable drawableLIZ = C0UDZ.LIZ(R.drawable.eo2);
            if (drawableLIZ != null) {
                drawableLIZ.setAlpha(102);
                drawable = drawableLIZ;
            }
            LJIILL(new C20743516Fd(drawable));
            C20743416Fc c20743416Fc = this.LLJJJJJIL;
            if (c20743416Fc == null) {
                return;
            }
            C786410Ut5.m5(c20743416Fc, 0.4f);
            return;
        }
        Drawable drawableLIZ2 = C0UDZ.LIZ(R.drawable.eo1);
        if (drawableLIZ2 != null) {
            drawableLIZ2.setAlpha(102);
            drawable = drawableLIZ2;
        }
        LJIILL(new C20743516Fd(drawable));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LJIIL("cohost_icon_click");
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C473410IhP.LIZ().removeCallbacksAndMessages(this.LLILZ);
        C946270ajR.LIZ();
        C952690atn.LIZ.getClass();
        C952690atn.LIZ();
        dataChannel.zQ2(this);
        LJJ("onUnload");
        C11JF c11jf = this.LLJL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LLJLIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LLLF.dispose();
        C2183111AcH c2183111AcH = this.LLJLLL;
        if (c2183111AcH != null) {
            c2183111AcH.LIZIZ();
        }
        this.LLJLLL = null;
        C1143920fsE c1143920fsE = this.LLJJL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C16F5 c16f5 = this.LLJJIJIIJIL;
        if (c16f5 != null) {
            C439101nJ.LJI(c16f5);
        }
        LIZJ();
        this.LLJZ = null;
        CoHostFriendNoticeService coHostFriendNoticeService = this.LLL;
        coHostFriendNoticeService.getClass();
        C20441214yg.LIZIZ("CoHostFriendNoticeService", "onUnload");
        coHostFriendNoticeService.LLILLJJLI.clear();
        coHostFriendNoticeService.LLJIJIL.clear();
        C11JF c11jf3 = coHostFriendNoticeService.LLIZLLLIL;
        if (c11jf3 != null) {
            C500260Jjc.LJJLIIIJLJLI(c11jf3);
        }
        coHostFriendNoticeService.LLJ = 0;
        coHostFriendNoticeService.LLJI = 0;
        coHostFriendNoticeService.LLILZLL = null;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.zQ2(this);
        dataChannelGlobal.JQ2(C944060afs.class, null);
        C924810aAp.LJ().LJI.remove(this.LLLIIIL);
        C934020aPg.LIZ.getClass();
        C934020aPg.LIZIZ(2);
        ((LinkedHashMap) this.LLLFFI).clear();
    }

    public final void LIZ(View view, String str) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewParent parent;
        if (!C952600ate.LIZ) {
            return;
        }
        ViewParent parent2 = null;
        if (view != null && (parent = view.getParent()) != null) {
            parent2 = parent.getParent();
        }
        if ((parent2 instanceof FrameLayout) && (viewGroup = (ViewGroup) parent2) != null) {
            View view2 = (View) ((LinkedHashMap) this.LLLFFI).get("MixMode");
            View view3 = view2;
            if (view2 == null) {
                C20743416Fc c20743416Fc = new C20743416Fc(view.getContext());
                c20743416Fc.setTextAppearance(R.style.a77);
                c20743416Fc.setText(str);
                C786410Ut5.LLJJJJLIIL(c20743416Fc, 0);
                this.LLLFFI.put("MixMode", c20743416Fc);
                view3 = c20743416Fc;
            }
            if (Intrinsics.LJFF(view3.getParent(), viewGroup)) {
                return;
            }
            ViewParent parent3 = view3.getParent();
            if ((parent3 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent3) != null) {
                C786410Ut5.LJJJLZIJ(view3, viewGroup2);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 21;
            viewGroup.addView(view3, layoutParams);
        }
    }

    public final void LIZIZ(long j, Throwable th) {
        if (th instanceof C501470JlZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onInviteFailed extra = ");
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            sbLIZ.append(c501470JlZ.getExtra());
            C944240agA.LJFF("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
            DataChannel dataChannel = this.LLJZ;
            if (dataChannel != null) {
                dataChannel.LC0(ReserveListStateChangeEvent.class, new Object() { // from class: X.0ahY
                });
            }
        }
    }

    public final void LJIILLIIL(String str, String str2) {
        if (this.LLJJJJ) {
            C1126540fQC c1126540fQC = this.LLIZLLLIL;
            if (c1126540fQC != null) {
                c1126540fQC.clearAnimation();
            }
            C1126540fQC c1126540fQC2 = this.LLIZLLLIL;
            if (c1126540fQC2 != null) {
                c1126540fQC2.setImageDrawable(null);
            }
            LJIJ(true);
            C1126540fQC c1126540fQC3 = this.LLJJJJLIIL;
            if (c1126540fQC3 != null) {
                c1126540fQC3.LLJILJIL = C1143780fs0.LJIIJ(str, str2);
            }
            C1126540fQC c1126540fQC4 = this.LLJJJJLIIL;
            if (c1126540fQC4 != null) {
                c1126540fQC4.LJII();
                return;
            }
            return;
        }
        C1126540fQC c1126540fQC5 = this.LLIZLLLIL;
        if (c1126540fQC5 != null) {
            c1126540fQC5.clearAnimation();
        }
        C1126540fQC c1126540fQC6 = this.LLIZLLLIL;
        if (c1126540fQC6 != null) {
            c1126540fQC6.LLJILJIL = C1143780fs0.LJIIJ(str, str2);
        }
        C1126540fQC c1126540fQC7 = this.LLIZLLLIL;
        if (c1126540fQC7 == null) {
            return;
        }
        c1126540fQC7.LJII();
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        boolean zBooleanValue;
        List list;
        RivalSectionConfig rivalSectionConfig;
        RegionalRestricted regionalRestricted;
        this.LLILZLL = interfaceC1103130eoR;
        this.LLIZ = interfaceC1103130eoR.getContext();
        this.LLJZ = dataChannel;
        this.LLILZIL = SystemClock.uptimeMillis();
        C946270ajR.LIZLLL = false;
        this.LLIZLLLIL = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.l8k);
        this.LLJI = (ImageView) interfaceC1103130eoR.findViewById(R.id.lsl);
        this.LLJIJIL = (C1099610eil) interfaceC1103130eoR.findViewById(R.id.lsi);
        this.LLJILJIL = (C1099610eil) interfaceC1103130eoR.findViewById(R.id.lsj);
        this.LLJILJILJ = (C1099610eil) interfaceC1103130eoR.findViewById(R.id.lsk);
        this.LLJILLL = interfaceC1103130eoR.findViewById(R.id.lsh);
        this.LLJ = (C16F5) interfaceC1103130eoR.findViewById(R.id.zfx);
        C16F5 c16f5 = (C16F5) interfaceC1103130eoR.findViewById(R.id.zfx);
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        C1324720kZq c1324720kZq = (C1324720kZq) interfaceC1103130eoR.findViewById(R.id.l9h);
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        } else {
            c1324720kZq = null;
        }
        this.LLJJ = c1324720kZq;
        this.LLJJI = (C1324720kZq) interfaceC1103130eoR.findViewById(R.id.l9s);
        this.LLJJIII = (C1324720kZq) interfaceC1103130eoR.findViewById(R.id.l9o);
        this.LLJJIJI = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.lq_);
        this.LLJJIJIIJIL = (C16F5) interfaceC1103130eoR.findViewById(R.id.tv_red_dot_num);
        this.LLJJIJIL = (C16FV) interfaceC1103130eoR.findViewById(R.id.ldx);
        Boolean bool = (Boolean) dataChannel.gg0(C780690Ujr.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJJJJ = zBooleanValue;
        this.LLJJL = new C1143920fsE();
        this.LLJJLIIIJLLLLLLLZ = dataChannel;
        this.LLLI = false;
        if (this.LLJJJJ) {
            C20743416Fc c20743416Fc = (C20743416Fc) interfaceC1103130eoR.findViewById(R.id.y7s);
            this.LLJJJJJIL = c20743416Fc;
            if (c20743416Fc != null) {
                c20743416Fc.setText(C497740JfY.LJIJI(2131843401));
            }
            this.LLJJJJLIIL = (C1126540fQC) interfaceC1103130eoR.findViewById(R.id.y74);
        }
        if (!LiveCohostAllowQuickInviteWithManualInviteSetting.INSTANCE.isEnable()) {
            this.LLJLLL = new C2183111AcH(this.LLJILJIL, this.LLJILJILJ, true, Float.valueOf(24.0f), null, dataChannel, "toolbar");
        }
        LJIIZILJ();
        dataChannel.BQ2(this.LLILLJJLI, CoHostInviteCountDownUpdateChannel.class, new AwS594S0100000_15(this, 812));
        dataChannel.BQ2(this.LLILLJJLI, LinkerStateChannel.class, new AwS594S0100000_15(this, 813));
        dataChannel.BQ2(this.LLILLJJLI, MultiCoHostFullChannel.class, new AwS594S0100000_15(this, 814));
        dataChannel.BQ2(this.LLILLJJLI, KickOutAllMultiGuestGuestsEvent.class, new AwS594S0100000_15(this, 815));
        dataChannel.BQ2(this.LLILLJJLI, IsViewerLimitedStatusChannel.class, new AwS594S0100000_15(this, 816));
        dataChannel.BQ2(this.LLILLJJLI, CoHostQuickPairEvent.class, new AwS381S0200000_15(this, dataChannel, 110));
        dataChannel.BQ2(this.LLILLJJLI, QuickCoHostStateChannel.class, new AwS594S0100000_15(this, 817));
        dataChannel.BQ2(this.LLILLJJLI, QuickCoHostCountDownEvent.class, new AwS594S0100000_15(this, 818));
        dataChannel.BQ2(this.LLILLJJLI, UnLockCoHostLopEvent.class, new AwS594S0100000_15(this, StrategyCenter.ENABLE_SMART_SERVICE));
        dataChannel.BQ2(this.LLILLJJLI, AnchorClickMultiCoHostIconChannel.class, new AwS594S0100000_15(this, 809));
        dataChannel.BQ2(this.LLILLJJLI, MultiCoHostInteractionShowChannel.class, new AwS594S0100000_15(this, 810));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.BQ2(this, this.LLILLJJLI, BroadcastSchemaOpenCoHostPanelEvent.class, new AwS594S0100000_15(this, 811));
        C924810aAp.LJ().LJI.add(this.LLLIIIL);
        if (!LiveCoHostForSubscribersOnlyLiveSetting.INSTANCE.isEnabled() && C494680Jac.LJIILIIL()) {
            LJIJJLI(8);
        }
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null || (regionalRestricted = room.regionalRestricted) == null || (list = regionalRestricted.blockList) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.contains("VIEW_LIMIT")) {
            dataChannel.zW(IsViewerLimitedStatusChannel.class, Boolean.TRUE);
        }
        C934020aPg c934020aPg = C934020aPg.LIZ;
        View viewFindViewById = interfaceC1103130eoR.findViewById(R.id.tv_red_dot_num);
        c934020aPg.getClass();
        C934020aPg.LIZ(2, viewFindViewById, true);
        CoHostFriendNoticeService coHostFriendNoticeService = this.LLL;
        LifecycleOwner lifecycleOwner = this.LLILLJJLI;
        coHostFriendNoticeService.getClass();
        C20441214yg.LIZIZ("CoHostFriendNoticeService", "onLoad");
        coHostFriendNoticeService.LLILZLL = dataChannel;
        ((InterfaceC964460bCm) coHostFriendNoticeService.LLILZ.getValue()).LIZ(coHostFriendNoticeService.LL, new AwS559S0100000_15(coHostFriendNoticeService, 761), new AwS249S0000000_15(coHostFriendNoticeService, 3));
        DataChannel dataChannel2 = coHostFriendNoticeService.LLILZLL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(lifecycleOwner, CoHostIsClickInvite.class, new AwS594S0100000_15(coHostFriendNoticeService, 768));
        }
        if (LiveSdkMultiGuestEnableMixModeSetting.isEnable()) {
            dataChannel.DQ2(LinkerModeChangeChannel.class, this, new AwS381S0200000_15(this, interfaceC1103130eoR, 109));
        }
        CoHostInviteListPreloadSetting coHostInviteListPreloadSetting = CoHostInviteListPreloadSetting.INSTANCE;
        if (!coHostInviteListPreloadSetting.isEnable() || (rivalSectionConfig = coHostInviteListPreloadSetting.getRivalSectionConfig(EnumC952640ati.BANNERS.getValue())) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start preload post, delay=");
        sbLIZ.append(rivalSectionConfig.preloadDelay);
        C20441214yg.LIZIZ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLIIIL(C473410IhP.LIZ(), new ARunnableS115S0100000_15(dataChannel, 148), this.LLILZ, SystemClock.uptimeMillis() + rivalSectionConfig.preloadDelay);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0ahG] */
    public C944860ahA(InterfaceC934580aQa interfaceC934580aQa, LifecycleOwner lifecycleOwner, C934440aQM c934440aQM) {
        this.LL = interfaceC934580aQa;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = c934440aQM;
        C769700UHg.LIZ.getClass();
        this.LLJLLIL = new C20136513qd();
        this.LLL = new CoHostFriendNoticeService();
        this.LLLF = new C11NJ();
        this.LLLFFI = new LinkedHashMap();
        this.LLLII = EnumC919210a1n.NONE;
        this.LLLIIIL = new InterfaceC915740ZwC() { // from class: X.0ahG
            @Override // X.InterfaceC915740ZwC
            public final void LIZ(boolean z) {
                if (C917860Zzc.LIZIZ() && z && !C915980Zwa.LJII().LJJLIIIJJI()) {
                    this.LIZ.LJIILJJIL(R.drawable.eoy);
                    this.LIZ.LLJLL = true;
                    C20441214yg.LIZIZ("ToolbarCoHostBehavior", "setCohostIconInMultiGuest, multi-guest start");
                } else {
                    if (C915980Zwa.LJIIIZ().Jf()) {
                        return;
                    }
                    this.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setLinkDrawable, multi-guest close. linkCrossRoomState:");
                    sbLIZ.append(this.LIZ.LLLIIIIL);
                    C20441214yg.LIZIZ("ToolbarCoHostBehavior", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZ.LJIIZILJ();
                    this.LIZ.LLJLL = false;
                }
            }
        };
    }

    public final void LIZLLL(final Room room, HashMap<String, Object> map, ReserveInfo reserveInfo) {
        C955400ayA.LL(room, "apply", null, null, null, reserveInfo, null, null, null, null, false, 2012);
        long id = room.getId();
        long ownerUserId = room.getOwnerUserId();
        long jLJIILIIL = C950220apo.LJIILIIL(room);
        long jLJIIL = C950220apo.LJIIL(room);
        long value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add("apply_reserve_bubble");
        C915980Zwa.LJII().LJJII(new C950000apS(1, id, ownerUserId, jLJIILIIL, jLJIIL, value, null, map, "apply_reserve_bubble", arrayList, 64), new InterfaceC950010apT<C920620a44>(this) { // from class: X.0ahC
            public final /* synthetic */ C944860ahA LIZIZ;

            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                C955400ayA c955400ayA = C955400ayA.LIZ;
                C955400ayA.LLF(room, "apply", null, null, null, null, null, false, null, 508);
            }

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                if (!(th instanceof MultiCoHostViolationException)) {
                    C501540Jlg.LIZJ(C497740JfY.LJII(), th);
                }
                if (th != null) {
                    this.LIZIZ.LIZIZ(room.getId(), th);
                    C501540Jlg.LJ(C497740JfY.LJII(), th);
                    C1304660k3U.LIZ.LIZIZ(201, "apply multi_cohost link mic failed", th, null);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ahE] */
    public final void LJIIJ(User user, final EnumC943790afR enumC943790afR, final String str) {
        final C1126540fQC c1126540fQC;
        final C1324720kZq c1324720kZq;
        final C1324720kZq c1324720kZq2;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() || (c1126540fQC = this.LLJJIJI) == null || (c1324720kZq = this.LLJJI) == null || (c1324720kZq2 = this.LLJJIII) == null) {
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        final ?? r2 = new C1143950fsH() { // from class: X.0ahE
            @Override // X.C1143950fsH
            public final void LJ(Animatable animatable) {
                DataChannel dataChannel = this.LIZ.LLJZ;
                if (dataChannel != null) {
                    dataChannel.SX0(C956770b0N.class, Boolean.TRUE);
                }
                this.LIZ.LLJL = (C11JF) C11NZ.LJLJJLL(8L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS41S1200000_15(this.LIZ, enumC943790afR, str, 5));
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [T, X.01kM] */
            @Override // X.C1143950fsH
            public final void LJFF(Animatable animatable) {
                C12ES.LJIILL(4, c1324720kZq2);
                C12ES.LJIILL(4, c1126540fQC);
                C1126540fQC c1126540fQC2 = this.LIZ.LLIZLLLIL;
                if (c1126540fQC2 != null) {
                    C12ES.LJIILL(0, c1126540fQC2);
                }
                if (EnumC943790afR.FRIEND_RESERVE == enumC943790afR) {
                    long j = C955580ayS.LIZIZ;
                    if (j > 0) {
                        C944860ahA c944860ahA = this.LIZ;
                        C16F5 c16f5 = c944860ahA.LLJJIJIIJIL;
                        if (c16f5 != null) {
                            c16f5.setText(String.valueOf(j));
                        }
                        C16F5 c16f52 = c944860ahA.LLJJIJIIJIL;
                        if (c16f52 != null) {
                            C786410Ut5.LLJJJJ(c16f52, 0);
                        }
                    }
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                C1324720kZq c1324720kZq3 = c1324720kZq;
                C1324720kZq c1324720kZq4 = c1324720kZq2;
                C944860ahA c944860ahA2 = this.LIZ;
                valueAnimatorOfFloat.setRepeatCount(0);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS150S0300000_15(c1324720kZq3, c1324720kZq4, c944860ahA2, 0));
                valueAnimatorOfFloat.addListener(new ALAdapterS10S0200000_15(c1324720kZq3, c1324720kZq4, 3));
                valueAnimatorOfFloat.start();
                c259800zU.element = C11NZ.LJLJJLL(150L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS151S0200000_15(this.LIZ, c259800zU, 45));
                DataChannel dataChannel = this.LIZ.LLJZ;
                if (dataChannel != null) {
                    dataChannel.SX0(C956770b0N.class, Boolean.FALSE);
                }
            }
        };
        C0IYA c0iya = new C0IYA() { // from class: X.0ahF
            @Override // X.C0IYA
            public final void LJ(boolean z) {
                C1126540fQC c1126540fQC2;
                if (z) {
                    C786410Ut5.Yb(c1324720kZq, 0.0f);
                    C786410Ut5.xc(c1324720kZq, 0.0f);
                    C12ES.LJIILL(0, c1324720kZq);
                    C944860ahA c944860ahA = this;
                    if (c944860ahA.LLJJJJ && (c1126540fQC2 = c944860ahA.LLJJJJLIIL) != null) {
                        C12ES.LJIILL(4, c1126540fQC2);
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    C1324720kZq c1324720kZq3 = c1324720kZq;
                    final C1324720kZq c1324720kZq4 = c1324720kZq2;
                    final C944860ahA c944860ahA2 = this;
                    final C1126540fQC c1126540fQC3 = c1126540fQC;
                    final C944900ahE c944900ahE = r2;
                    final EnumC943790afR enumC943790afR2 = enumC943790afR;
                    valueAnimatorOfFloat.setRepeatCount(0);
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS150S0300000_15(c1324720kZq3, c1324720kZq4, c944860ahA2, 1));
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0ahD
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            int i;
                            super.onAnimationEnd(animator);
                            C12ES.LJIILL(0, c1126540fQC3);
                            C12ES.LJIILL(0, c1324720kZq4);
                            C1126540fQC c1126540fQC4 = c944860ahA2.LLIZLLLIL;
                            if (c1126540fQC4 != null) {
                                C439101nJ.LJI(c1126540fQC4);
                            }
                            C944860ahA c944860ahA3 = c944860ahA2;
                            C1126540fQC c1126540fQC5 = c1126540fQC3;
                            C944900ahE c944900ahE2 = c944900ahE;
                            EnumC943790afR enumC943790afR3 = enumC943790afR2;
                            c944860ahA3.getClass();
                            if (enumC943790afR3 == EnumC943790afR.FRIEND_LIVING) {
                                i = 4;
                            } else {
                                i = 1;
                            }
                            C1143920fsE c1143920fsE = c944860ahA3.LLJJL;
                            if (c1143920fsE == null) {
                                c1143920fsE = null;
                            }
                            c1143920fsE.LIZ = c1126540fQC5;
                            c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1");
                            c1143920fsE.LIZJ = "interact_request_enhanced.webp";
                            c1143920fsE.LJFF = true;
                            c1143920fsE.LJI = i;
                            c1143920fsE.LJIIJJI = true;
                            c1143920fsE.LJ = c944900ahE2;
                            c1143920fsE.LIZLLL();
                        }
                    });
                    valueAnimatorOfFloat.start();
                }
            }
        };
        ImageModel avatarThumb = user.getAvatarThumb();
        C1121670fIL.LJ(avatarThumb).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS65S0400000_15(this, c0iya, avatarThumb, c1324720kZq, 2), new AfS151S0200000_15(c0iya, avatarThumb, 46));
        this.LLL.LIZ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(final com.bytedance.android.livesdkapi.depend.model.live.Room r34, java.util.HashMap<java.lang.String, java.lang.Object> r35, com.bytedance.android.livesdk.model.message.ReserveInfo r36, com.bytedance.android.livesdk.model.message.OptPairInfo r37) {
        /*
            r33 = this;
            r21 = r36
            r5 = r34
            if (r21 != 0) goto L23
            r11 = r37
            if (r11 != 0) goto Lb
            return
        Lb:
            if (r21 != 0) goto L23
            if (r11 == 0) goto L23
            r26 = 1
            java.lang.String r6 = "invite"
            r7 = 0
            r28 = 0
            r15 = 0
            r16 = 1980(0x7bc, float:2.775E-42)
            r8 = r7
            r9 = r7
            r10 = r7
            r12 = r7
            r13 = r7
            r14 = r7
            X.C955400ayA.LL(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L3f
        L23:
            r26 = 0
            java.lang.String r17 = "invite"
            r18 = 0
            r28 = 0
            r15 = 0
            r27 = 2012(0x7dc, float:2.82E-42)
            r16 = r5
            r19 = r18
            r20 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r18
            X.C955400ayA.LL(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L3f:
            long r18 = r5.getId()
            long r20 = r5.getOwnerUserId()
            long r22 = X.C950220apo.LJIILIIL(r5)
            long r24 = X.C950220apo.LJIIL(r5)
            com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting.INSTANCE
            int r0 = r0.getValue()
            long r3 = (long) r0
            java.lang.String r2 = "invite_pairing_bubble"
            java.lang.String r1 = "invite_reserve_bubble"
            if (r26 == 0) goto L8e
            r30 = r2
        L5e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r26 == 0) goto L8a
            r0.add(r2)
        L68:
            r32 = 64
            X.0apS r1 = new X.0apS
            r29 = r35
            r16 = r1
            r17 = r15
            r26 = r3
            r31 = r0
            r16.<init>(r17, r18, r20, r22, r24, r26, r28, r29, r30, r31, r32)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r3 = X.C915980Zwa.LJII()
            X.0ahB r2 = new X.0ahB
            r0 = r33
            r2.<init>()
            X.0ZvQ r0 = X.C915260ZvQ.LIZ
            r3.LJLJLJ(r1, r2, r0)
            return
        L8a:
            r0.add(r1)
            goto L68
        L8e:
            r30 = r1
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944860ahA.LJFF(com.bytedance.android.livesdkapi.depend.model.live.Room, java.util.HashMap, com.bytedance.android.livesdk.model.message.ReserveInfo, com.bytedance.android.livesdk.model.message.OptPairInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.bytedance.android.live.base.model.user.User r25, final long r26, final com.bytedance.android.livesdk.model.message.ReserveInfo r28, final com.bytedance.android.livesdk.model.message.OptPairInfo r29) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C944860ahA.LJIIIIZZ(com.bytedance.android.live.base.model.user.User, long, com.bytedance.android.livesdk.model.message.ReserveInfo, com.bytedance.android.livesdk.model.message.OptPairInfo):void");
    }
}

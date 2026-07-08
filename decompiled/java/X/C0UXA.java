package X;

import Y.ACListenerS147S0100000_12;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ShowInteractGuideEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiCoHostIconGroupChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestApplyCountChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIconGroupChangeChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestApplyNumChangedEvent;
import com.bytedance.android.live.toolbar.BroadcastToolbarLoadEvent;
import com.bytedance.android.live.toolbar.BroadcastToolbarUnloadEvent;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.dataChannel.RefreshMoreRedDotEvent;
import com.bytedance.android.livesdk.dataChannel.ShowInteractionFeatureDialogEvent;
import com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesSheet;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.goodybag.GoodyBagFansClubSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkCohostWithGuestDataTrackOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2EventTrackingOpt;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UXA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UXA implements InterfaceViewOnClickListenerC1102800enu {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public DataChannel LL;
    public long LLILLJJLI;
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(139));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 306));
    public C054G LLILZLL;
    public AnonymousClass0956 LLIZ;
    public InterfaceC1103130eoR LLIZLLLIL;
    public final C01GW LLJ;
    public boolean LLJI;
    public String LLJIJIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C0UXA.class, "tooltipToken", "getTooltipToken()J", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217371BqR};
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

    public final boolean LIZ() {
        return PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && !C500260Jjc.LJJJIL(this.LL) && C781520UlC.LJIIJJI(C751980Tee.LIZJ(this.LL));
    }

    public final void LIZIZ() {
        Integer num;
        String str;
        C927390aEz c927390aEz;
        Integer num2;
        String str2 = this.LLJI ? "long_press" : "click";
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
        DataChannel dataChannel = this.LL;
        Map map2 = dataChannel != null ? (Map) dataChannel.gg0(C754590Tir.class) : null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (map != null) {
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                if (Intrinsics.LJFF(map.get(Long.valueOf(jLongValue)), Boolean.TRUE)) {
                    arrayList.add(Long.valueOf(jLongValue));
                }
            }
        }
        if (map2 != null) {
            Iterator it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                long jLongValue2 = ((Number) it3.next()).longValue();
                if (Intrinsics.LJFF(map2.get(Long.valueOf(jLongValue2)), Boolean.TRUE)) {
                    arrayList2.add(Long.valueOf(jLongValue2));
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interaction_entrance_click");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJII(this.LLILZ.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LLILZIL.getValue()).longValue()), "room_id");
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.INTERACTION_FEATURES;
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(enumC1102750enp.isRedDotShowing(this.LL))) ? 1 : 0), "has_red_dot");
        c474500IjALIZ.LJJII(this.LLILLL ? "more" : "toolbar", "position");
        c474500IjALIZ.LJJII(str2, "method");
        c474500IjALIZ.LJJII(arrayList.toString(), "envelope_permission");
        c474500IjALIZ.LJJII(arrayList2.toString(), "goody_bag_permission");
        c474500IjALIZ.LJJII(Integer.valueOf(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJII()), "guest_cnt");
        int iIntValue = 0;
        if (LiveSdkCohostWithGuestDataTrackOptSetting.isEnable()) {
            DataChannel dataChannel2 = this.LL;
            int iIntValue2 = (dataChannel2 == null || (num2 = (Integer) dataChannel2.gg0(MultiGuestApplyCountChannel.class)) == null) ? 0 : num2.intValue();
            DataChannel dataChannel3 = this.LL;
            if (dataChannel3 != null && (c927390aEz = (C927390aEz) dataChannel3.gg0(MultiGuestApplyNumChangedEvent.class)) != null) {
                iIntValue = c927390aEz.LIZIZ;
            }
            iIntValue = Math.max(iIntValue2, iIntValue);
        } else {
            DataChannel dataChannel4 = this.LL;
            if (dataChannel4 != null && (num = (Integer) dataChannel4.gg0(MultiGuestApplyCountChannel.class)) != null) {
                iIntValue = num.intValue();
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "red_dot_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(enumC1102750enp.isRedDotShowing(this.LL))) ? 1 : 0), "is_red_dot");
        if (C500260Jjc.LJJJIL(this.LL)) {
            c474500IjALIZ.LJJII(this.LLJIJIL, "click_type");
        }
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).xt1(c474500IjALIZ);
        if (CohostWithGuestPhase2EventTrackingOpt.INSTANCE.isEnabled()) {
            int iUh = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Uh();
            if (iUh != 0) {
                str = iUh == 1 ? "guest" : "normal";
            }
            c474500IjALIZ.LJJII(str, "connection_type");
        }
        c474500IjALIZ.LIZ();
        this.LLJIJIL = "normal_click_icon";
    }

    public final void LIZLLL() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LL;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        String str = LiveInteractionFeaturesSheet._pnsPageId;
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.draggable = true;
        C19322110iZ.LIZLLL(fragmentManager, LiveInteractionFeaturesSheet.class, "foundation_anchor_interaction", sheetOptions, null);
    }

    public C0UXA() {
        C769700UHg.LIZ.getClass();
        new C20136513qd();
        this.LLJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 305));
        this.LLJIJIL = "normal_click_icon";
    }

    public static final void LIZJ(C0UX6 c0ux6) {
        c0ux6.setValid(true);
        String currentId = c0ux6.getCurrentId();
        if (currentId.length() != 0 || (currentId = (String) C13LQ.LJJIIZ(0, c0ux6.getIds())) != null) {
            RedDotExtensionKt.LJIIL(c0ux6, "3", currentId);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.INTERACTION_FEATURES;
        if (enumC1102750enp.isRedDotShowing(this.LL)) {
            RedDotExtensionKt.LIZIZ(C0UX6.LIVE_BROADCAST_INTERACT);
            RedDotExtensionKt.LIZIZ(C0UX6.LIVE_BROADCAST_PLAYBOOK_INTERACT);
            RedDotExtensionKt.LIZIZ(C0UX6.RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLILLJJLI >= 500) {
            this.LLILLJJLI = jUptimeMillis;
            if (C0UID.LJIIJ(this.LL) && TryModeGuidanceSetting.INSTANCE.isV3()) {
                C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC772600USk.Hf;
                c20337914i1.LIZIZ().put("interact_guidance", Boolean.FALSE);
                c20337914i1.LIZJ();
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_TRY_MODE_INTERACT_GUIDE);
            }
            LIZIZ();
            this.LLJI = false;
            if (C500260Jjc.LJJJIL(this.LL) && C474650IjP.LIZ() && InterfaceC772600USk.Df.LIZIZ().booleanValue() && !TryModeGuidanceSetting.INSTANCE.isV3()) {
                FragmentManager fragmentManagerLJII = C500260Jjc.LJII(this.LL);
                if (fragmentManagerLJII != null) {
                    ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createTryModeEducationDialogFragment("interact", new ACListenerS147S0100000_12(this, 210)).show(fragmentManagerLJII, "try_mode_interaction_education_sheet");
                }
            } else {
                LIZLLL();
                if (!this.LLILLL) {
                    enumC1102750enp.hideRedDot(this.LL);
                }
            }
        }
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (view2 = (View) this.LLJ.getValue()) != null) {
            C0GZA.LIZIZ(view2);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void qG(boolean z) {
        if (z) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interaction_red_dot_show");
            c474500IjALIZ.LJIJJLI(this.LL);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean x0(View view) {
        this.LLJI = true;
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C054G c054g = this.LLILZLL;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        if (dataChannel != null) {
            dataChannel.LC0(BroadcastToolbarUnloadEvent.class, EnumC1102750enp.INTERACTION_FEATURES);
            dataChannel.FQ2(RefreshMoreRedDotEvent.class);
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        boolean z;
        RoomAuthStatus roomAuthStatus;
        boolean z2;
        String str;
        DataChannel dataChannel2;
        C758750TpZ c758750TpZ;
        LifecycleOwner lifecycleOwnerLJJIFFI;
        int i;
        RoomAuthStatus roomAuthStatus2;
        RoomAuthStatus roomAuthStatus3;
        Long l;
        Room roomLJJLIIIIJ;
        RoomAuthStatus roomAuthStatus4;
        Room roomLJJLIIIIJ2;
        RoomAuthStatus roomAuthStatus5;
        Room roomLJJLIIIIJ3;
        RoomAuthStatus roomAuthStatus6;
        DataChannel dataChannel3;
        InterfaceC1088880eRS interfaceC1088880eRSMn1;
        this.LLIZLLLIL = interfaceC1103130eoR;
        this.LL = dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(ShowInteractionFeatureDialogEvent.class, this, new AwS591S0100000_12(this, 576));
            dataChannel.LC0(BroadcastToolbarLoadEvent.class, EnumC1102750enp.INTERACTION_FEATURES);
        }
        if (C0UIM.LJFF() || ((interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(dataChannel)) != null && interfaceC1088880eRSMn1.LIZIZ(EnumC1102750enp.INTERACTION_FEATURES))) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLL = z;
        if (z) {
            RedDotExtensionKt.LJIILL(C0UX6.LIVE_BROADCAST_KARAOKE_MORE, !InterfaceC766480U4w.LJJZ.LIZIZ().booleanValue());
            RedDotExtensionKt.LJIILL(C0UX6.LIVE_BROADCAST_KARAOKE_INTERACT, false);
            LiveIconView liveIconView = (LiveIconView) interfaceC1103130eoR.findViewById(R.id.y74);
            if (liveIconView != null) {
                liveIconView.setIcon(R.drawable.eyu);
            }
        } else {
            RedDotExtensionKt.LJIILL(C0UX6.LIVE_BROADCAST_KARAOKE_MORE, false);
            RedDotExtensionKt.LJIILL(C0UX6.LIVE_BROADCAST_KARAOKE_INTERACT, !InterfaceC766480U4w.LJJZ.LIZIZ().booleanValue());
            Room roomLJJLIIIIJ4 = C500260Jjc.LJJLIIIIJ(dataChannel);
            if (roomLJJLIIIIJ4 != null && (roomAuthStatus = roomLJJLIIIIJ4.getRoomAuthStatus()) != null && roomAuthStatus.pictionarybubble == 1 && C0JGR.w2.LIZIZ().booleanValue()) {
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C785230UrB c785230UrB = new C785230UrB(interfaceC1103130eoR.LJ());
                c785230UrB.LIZLLL(2131841388);
                c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0JhU
                    @Override // X.InterfaceC254600ye
                    public final void onShow() {
                        C0JGR.w2.LJFF(Boolean.FALSE);
                    }
                };
                c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.ANCHOR_DRAW_GUESS, dataChannel);
            }
            if (C0JGR.u2.LIZIZ().booleanValue() && LivePollSetting.INSTANCE.enable(dataChannel)) {
                View viewLJ = interfaceC1103130eoR.LJ();
                EnumC1120860fH2 enumC1120860fH2 = EnumC1120860fH2.ANCHOR_POLL;
                C498930JhT c498930JhT = new C498930JhT(this);
                C785230UrB c785230UrB2 = new C785230UrB(viewLJ);
                c785230UrB2.LIZLLL(2131843815);
                c785230UrB2.LJIILL = new C786300Usu(c498930JhT, 18);
                C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB2), enumC1120860fH2, dataChannel);
            }
        }
        if (C0UID.LJIIJ(this.LL) && TryModeGuidanceSetting.INSTANCE.isV3() && (dataChannel3 = this.LL) != null) {
            dataChannel3.CQ2(ShowInteractGuideEvent.class, this, new AwS378S0200000_12(this, interfaceC1103130eoR, 29));
        }
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.INTERACTION_FEATURES;
        if (C162200jk.LIZ > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        enumC1102750enp.setRedDotVisible(dataChannel, z2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interaction_entrance_show");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(enumC1102750enp.isRedDotShowing(this.LL))) ? 1 : 0), "has_red_dot");
        if (this.LLILLL) {
            str = "more";
        } else {
            str = "toolbar";
        }
        c474500IjALIZ.LJJII(str, "position");
        c474500IjALIZ.LIZ();
        if (!enumC1102750enp.isRedDotShowing(dataChannel)) {
            C20441214yg.LIZIZ("ToolbarInteractionFeatureBehavior", "onLoad, observe RedDot.LIVE_BROADCAST_INTERACT");
            if (!C0UIM.LJFF()) {
                RedDotExtensionKt.LJII(C0UX6.RED_DOT_LIVE_BROADCAST_POLL_AND_GIFT_VOTE_DIRECT, null, null, null, new AwS591S0100000_12(dataChannel, 577), false);
            }
            C0UX6.LIVE_PLAYBOOK_BROADCAST_GUIDE.setValid(LIZ());
            if (dataChannel != null && (roomLJJLIIIIJ3 = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (roomAuthStatus6 = roomLJJLIIIIJ3.getRoomAuthStatus()) != null && roomAuthStatus6.viewerwishes == 1 && !C500260Jjc.LJJJIL(dataChannel) && C781520UlC.LJIIJJI(C751980Tee.LIZJ(dataChannel))) {
                C0UX6.LIVE_VIEWER_WISHES_BROADCAST_GUIDE.setValid(Intrinsics.LJFF(C0UKZ.LJLJJLL.LIZIZ(), Boolean.FALSE));
            }
            RedDotExtensionKt.LJII(C0UX6.LIVE_BROADCAST_INTERACT, null, null, null, new AwS591S0100000_12(dataChannel, 578), false);
        }
        if (C0UIM.LIZIZ() && (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (roomAuthStatus5 = roomLJJLIIIIJ2.getRoomAuthStatus()) != null && roomAuthStatus5.guessEntranceForHost) {
            C0UX6 c0ux6 = C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING;
            c0ux6.setValid(true);
            String currentId = c0ux6.getCurrentId();
            if (currentId.length() == 0) {
                currentId = (String) C13LQ.LJIL(c0ux6.getIds());
            }
            RedDotExtensionKt.LJIIL(c0ux6, "3", currentId);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RedDot.RED_DOT_LIVE_BROADCAST_INTERACT_GUESSING refresh, id: ");
            sbLIZ.append(currentId);
            C20441214yg.LIZIZ("ToolbarInteractionFeatureBehavior", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C0UIM.LIZJ() && !C0UIM.LJFF() && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (roomAuthStatus4 = roomLJJLIIIIJ.getRoomAuthStatus()) != null) {
            if (roomAuthStatus4.customizablegiftpoll == 1) {
                LIZJ(C0UX6.RED_DOT_LIVE_BROADCAST_CUSTOM_GIFT_VOTE);
            }
            if (roomAuthStatus4.enableGiftPoll == 1) {
                LIZJ(C0UX6.RED_DOT_LIVE_BROADCAST_QUICK_GIFT_VOTE);
            }
            if (roomAuthStatus4.emotepoll == 1) {
                LIZJ(C0UX6.RED_DOT_LIVE_BROADCAST_EMOTE_POLL);
            } else {
                C0UX6.RED_DOT_LIVE_BROADCAST_EMOTE_POLL.setValid(false);
            }
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room != null && C0KWM.LIZIZ(room) && (((roomAuthStatus2 = room.getRoomAuthStatus()) != null && roomAuthStatus2.customizablegiftpoll == 1) || ((roomAuthStatus3 = room.getRoomAuthStatus()) != null && (l = roomAuthStatus3.customizablepoll) != null && l.longValue() == 1))) {
            RedDotExtensionKt.LJIILL(C0UX6.RED_DOT_LIVE_BROADCAST_CUSTOM_POLL_TEMPLATE_OPTIMIZATION_SELECT, true);
        }
        if (C0UXQ.LIZ(C500260Jjc.LJJLIIIIJ(dataChannel))) {
            C0UX6 c0ux62 = C0UX6.RED_DOT_LIVE_BROADCAST_INTERACT_PLAY_TOGETHER;
            c0ux62.setValid(true);
            String currentId2 = c0ux62.getCurrentId();
            if (currentId2.length() != 0 || (currentId2 = (String) C13LQ.LJJIIZ(0, c0ux62.getIds())) != null) {
                RedDotExtensionKt.LJIIL(c0ux62, "1", currentId2);
            }
        }
        if (C0UIM.LIZ() && !this.LLILLL) {
            boolean zEnableRedEnvelope = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelope();
            boolean zUl2 = ((IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class)).ul2(dataChannel);
            if (!Intrinsics.LJFF(C0JGR.B2.LIZ(), Boolean.TRUE) && (zEnableRedEnvelope || zUl2)) {
                C785230UrB c785230UrB3 = new C785230UrB(interfaceC1103130eoR.LJ());
                if (zEnableRedEnvelope) {
                    if (zUl2) {
                        i = 2131842197;
                    } else {
                        i = 2131842199;
                    }
                } else {
                    i = 2131842198;
                }
                c785230UrB3.LIZLLL(i);
                c785230UrB3.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                c785230UrB3.LJIIIZ = true;
                c785230UrB3.LJIILL = new InterfaceC254600ye() { // from class: X.0JhV
                    @Override // X.InterfaceC254600ye
                    public final void onShow() {
                        C0JGR.B2.LIZJ(Boolean.TRUE);
                    }
                };
                C1113800f5e.LIZ.LJ(new C785270UrF(c785230UrB3), EnumC1120860fH2.TREASURE_BOX_GOODY_BAG_TO_INTERACT, dataChannel);
            }
        }
        C0UX6.LIVE_BROADCAST_INTERACT_GOODYBAG.setValid(GoodyBagFansClubSetting.INSTANCE.getValue());
        if (LIZ() && !C0KPJ.Te.LIZIZ().booleanValue() && (c758750TpZ = (C758750TpZ) dataChannelGlobal.gg0(C168L.class)) != null && c758750TpZ.LIZIZ != 0 && c758750TpZ.LIZ && c758750TpZ.LIZJ) {
            AnonymousClass0956 anonymousClass0956 = this.LLIZ;
            AnonymousClass0956 anonymousClass0956LIZLLL = null;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            C20337914i1<Boolean> c20337914i1 = C0KPJ.Se;
            if (!c20337914i1.LIZIZ().booleanValue()) {
                if (this.LLILZLL == null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    this.LLILZLL = C2296808zG.LIZ(C2107308Nj.LIZ.plus(C2296908zH.LIZ()));
                }
                C054G c054g = this.LLILZLL;
                if (c054g != null) {
                    anonymousClass0956LIZLLL = C23250099c.LIZLLL(c054g, null, null, new C498850JhL(interfaceC1103130eoR, this, null), 3);
                }
                this.LLIZ = anonymousClass0956LIZLLL;
            }
            if (c20337914i1.LIZIZ().booleanValue() && (lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(interfaceC1103130eoR.getContext(), false)) != null) {
                RedDotExtensionKt.LJI(interfaceC1103130eoR.findViewById(R.id.y7r), lifecycleOwnerLJJIFFI, null, C0UX6.LIVE_BROADCAST_PLAYBOOK_INTERACT, null);
            }
        }
        DataChannel dataChannel4 = this.LL;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(MultiCoHostIconGroupChangeChannel.class, this, new AwS378S0200000_12(this, interfaceC1103130eoR, 94));
        }
        if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (dataChannel2 = this.LL) != null) {
            dataChannel2.CQ2(MultiGuestIconGroupChangeChannel.class, this, new AwS378S0200000_12(this, interfaceC1103130eoR, 95));
        }
    }
}

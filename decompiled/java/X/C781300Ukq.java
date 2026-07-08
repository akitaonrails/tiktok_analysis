package X;

import Y.ACListenerS147S0100000_12;
import Y.ACListenerS79S0300000_12;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.ATListenerS339S0200000_12;
import Y.ATListenerS446S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessStartGameEvent;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.livesdk.api.revenue.crm.FullScreenCsCompanionSetting;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCompanionExtendedScreenShowGuide;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenCloseGuide;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenShowGuide;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenShowMarkViewerGuide;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenCloseGuide;
import com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenShowGuide;
import com.bytedance.android.livesdk.dataChannel.LiveNotShowGuideAgain;
import com.bytedance.android.livesdk.dataChannel.MemberMessageChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterGuideOpt;
import com.bytedance.android.livesdk.livesetting.other.LiveMarkViewerOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Ukq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781300Ukq implements C0UU3 {
    public static final /* synthetic */ int LJIJJ = 0;
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public int LJFF;
    public final C16F5 LJII;
    public final C16F5 LJIIIIZZ;
    public final C1324720kZq LJIIIZ;
    public final C1295960jpS LJIIJ;
    public final C1324720kZq LJIIJJI;
    public final C1324720kZq LJIIL;
    public final C0UZ0 LJIJI;
    public boolean LJI = true;
    public final C01GW LJIILIIL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(100));
    public final ARunnableS112S0100000_12 LJIILJJIL = new ARunnableS112S0100000_12(this, 115);
    public final ARunnableS112S0100000_12 LJIILL = new ARunnableS112S0100000_12(this, 113);
    public final ARunnableS112S0100000_12 LJIILLIIL = new ARunnableS112S0100000_12(this, 114);
    public final ARunnableS112S0100000_12 LJIIZILJ = new ARunnableS112S0100000_12(this, 112);
    public final ARunnableS112S0100000_12 LJIJ = new ARunnableS112S0100000_12(this, 116);

    public final LinkedList<Runnable> LIZ() {
        return (LinkedList) this.LJIILIIL.getValue();
    }

    public final void LIZJ() {
        if (LiveMarkViewerOptimizationSetting.INSTANCE.getValue() || this.LJFF > 0 || LiveHostAutoAdaptiveParams.disableGuideAnimation()) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.o3;
        if (c20337914i1.LIZIZ().booleanValue()) {
            C786410Ut5.LJLLLLLL(0, this.LIZJ);
            this.LIZJ.setClickable(true);
            View view = this.LJ;
            if (view != null) {
                C786410Ut5.T4(view, 0.2f);
            }
            C473410IhP.LJFF(LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask(), LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache());
            final C1143920fsE c1143920fsE = new C1143920fsE();
            c1143920fsE.LIZ = this.LJIIIZ;
            c1143920fsE.LIZIZ = "tiktok_live_broadcast_demand_2";
            c1143920fsE.LJFF = true;
            c1143920fsE.LJI = 3;
            c1143920fsE.LJIILIIL = true;
            c1143920fsE.LJ = new C1143950fsH() { // from class: X.0Uks
                @Override // X.C1143950fsH
                public final void LJFF(Animatable animatable) {
                    View view2 = this.LIZ.LIZJ;
                    if (view2 != null) {
                        view2.setClickable(false);
                    }
                    View view3 = this.LIZ.LIZJ;
                    if (view3 != null) {
                        C786410Ut5.LJLLLLLL(8, view3);
                    }
                    View view4 = this.LIZ.LJ;
                    if (view4 != null) {
                        C786410Ut5.T4(view4, 1.0f);
                    }
                    LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12(c1143920fsE, 224));
                }
            };
            if (C497740JfY.LJJ()) {
                c1143920fsE.LIZJ = "ttlive_livecenter_guide_hand_rtl.webp";
                C1143680frq.LJIIIIZZ(c1143920fsE);
            } else {
                c1143920fsE.LIZJ = "ttlive_livecenter_guide_hand_opt.webp";
                C1143680frq.LJIIIIZZ(c1143920fsE);
            }
            this.LJII.LJJJI(R.style.a8q);
            this.LJII.setText(C497740JfY.LJIJI(2131841265));
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJII, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(180L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LJII, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(180L);
            duration2.setStartDelay(696L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2);
            animatorSet.start();
            this.LIZJ.setClickable(true);
            C786410Ut5.I7(new ACListenerS79S0300000_12(this, animatorSet, c1143920fsE, 6), this.LIZJ);
            c20337914i1.LJFF(Boolean.FALSE);
        }
    }

    public final void LJIIJJI() {
        if (this.LJFF <= 0 && LIZ().size() > 0) {
            Runnable runnablePoll = LIZ().poll();
            if (LiveCenterGuideOpt.INSTANCE.enable() && C781520UlC.LJIIJJI(C751980Tee.LIZJ(this.LIZ))) {
                C473410IhP.LIZJ(new ARunnableS112S0100000_12(runnablePoll, 117), Mp4ScreenVideoLoadTimeout.CONTROL);
            } else if (runnablePoll != null) {
                runnablePoll.run();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        if (this.LJFF > 0 || LiveHostAutoAdaptiveParams.disableGuideAnimation()) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.r3;
        if (!C500260Jjc.LJJIFFI(c20337914i1.LIZIZ()) && LJ(z, this.LJIIZILJ, C497740JfY.LJIJI(2131854908), "view_companion_tools", null)) {
            c20337914i1.LJFF(Boolean.FALSE);
        }
    }

    public final void LIZLLL(boolean z) {
        int i;
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        if (this.LJFF > 0 || LiveHostAutoAdaptiveParams.disableGuideAnimation()) {
            return;
        }
        C20337914i1<Integer> c20337914i1 = InterfaceC772190UQv.p3;
        Integer numLIZIZ = c20337914i1.LIZIZ();
        if (LiveMarkViewerOptimizationSetting.INSTANCE.getValue()) {
            i = 1;
        } else {
            i = 5;
        }
        if (numLIZIZ.intValue() >= i) {
            this.LJI = false;
        } else if (this.LJI && LJ(z, this.LJIILL, C497740JfY.LJIJI(2131841266), "", null)) {
            c20337914i1.LJFF(Integer.valueOf(numLIZIZ.intValue() + 1));
        }
    }

    public final void LJI(boolean z) {
        C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.j;
        if (c20337914i1.LIZIZ().booleanValue() && LJ(z, this.LJIILLIIL, C497740JfY.LJIJI(2131841266), "", null)) {
            c20337914i1.LJFF(Boolean.FALSE);
        }
    }

    public final void LJII(boolean z) {
        if (this.LIZ.gg0(LiveExtendedScreenStatus.class) != EnumC1083260eIO.HIDE) {
            return;
        }
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        if (this.LJFF > 0 || LiveHostAutoAdaptiveParams.disableGuideAnimation()) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.f126m3;
        if (c20337914i1.LIZIZ().booleanValue()) {
            if (LIZ().size() == 0 || z) {
                c20337914i1.LJFF(Boolean.FALSE);
                C786410Ut5.LJLLLLLL(0, this.LIZJ);
                this.LIZJ.setClickable(true);
                C473410IhP.LJFF(LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask(), LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache());
                final C1143920fsE c1143920fsE = new C1143920fsE();
                final C1143920fsE c1143920fsE2 = new C1143920fsE();
                c1143920fsE.LIZ = this.LJIIIZ;
                c1143920fsE.LIZIZ = "tiktok_live_broadcast_demand_2";
                c1143920fsE.LJFF = true;
                c1143920fsE.LJ = new C1143950fsH() { // from class: X.0Ukt
                    @Override // X.C1143950fsH
                    public final void LJFF(Animatable animatable) {
                        View view = this.LIZ.LIZJ;
                        if (view != null) {
                            view.setClickable(false);
                        }
                        C786410Ut5.LJLLLLLL(8, this.LIZ.LIZJ);
                        c1143920fsE2.LIZ();
                        this.LIZ.LJIIJJI();
                        LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12(c1143920fsE, 225));
                    }
                };
                c1143920fsE2.LIZ = this.LJIIJJI;
                c1143920fsE2.LIZIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
                c1143920fsE2.LJFF = true;
                c1143920fsE2.LJ = new C1143950fsH() { // from class: X.0Ukv
                    @Override // X.C1143950fsH
                    public final void LJFF(Animatable animatable) {
                        View view = this.LIZ.LIZJ;
                        if (view != null) {
                            view.setClickable(false);
                        }
                        LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12(c1143920fsE2, 226));
                    }
                };
                if (C497740JfY.LJJ()) {
                    c1143920fsE.LIZJ = "ttlive_livecenter_guide_hand_rtl.webp";
                    c1143920fsE2.LIZJ = "ttlive_livecenter_guide_black_line_rtl.webp";
                    C1143680frq.LJIIIIZZ(c1143920fsE);
                    C1143680frq.LJIIIIZZ(c1143920fsE2);
                } else {
                    c1143920fsE.LIZJ = "ttlive_livecenter_guide_hand_opt.webp";
                    c1143920fsE2.LIZJ = "ttlive_livecenter_guide_black_line.webp";
                    C1143680frq.LJIIIIZZ(c1143920fsE);
                    C1143680frq.LJIIIIZZ(c1143920fsE2);
                }
                this.LJII.LJJJI(R.style.a8q);
                this.LJII.setText(C497740JfY.LJIJI(2131842697));
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJII, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(180L);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LJII, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(180L);
                duration2.setStartDelay(2808L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(duration, duration2);
                animatorSet.start();
                this.LIZJ.setClickable(true);
                C786410Ut5.I7(new ACListenerS79S0300000_12(this, animatorSet, c1143920fsE, 7), this.LIZJ);
            }
            if (!LIZ().contains(this.LJIILJJIL) && !z) {
                LIZ().add(this.LJIILJJIL);
            }
        }
    }

    public final void LJIIIIZZ(boolean z) {
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        if (LiveHostAutoAdaptiveParams.disableGuideAnimation()) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.f126m3;
        if (!c20337914i1.LIZIZ().booleanValue() || ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).kg2()) {
            return;
        }
        if (this.LJFF > 0) {
            if (!LIZ().contains(this.LJIILJJIL)) {
                LIZ().add(this.LJIILJJIL);
                return;
            }
            return;
        }
        if (LIZ().size() == 0 || z) {
            c20337914i1.LJFF(Boolean.FALSE);
            LJIIJ(C497740JfY.LJIJI(2131855625), false, null);
        }
        if (!LIZ().contains(this.LJIILJJIL) && !z) {
            LIZ().add(this.LJIILJJIL);
        }
    }

    public final void LJIIIZ(boolean z) {
        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().isMockPopup();
        if (this.LJFF > 0 || LiveHostAutoAdaptiveParams.disableGuideAnimation()) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.q3;
        if (!C500260Jjc.LJJIFFI(c20337914i1.LIZIZ()) && LJ(z, this.LJIJ, C497740JfY.LJIJI(2131853664), "markviewer_tab", new ATListenerS446S0100000_12(this, 11))) {
            c20337914i1.LJFF(Boolean.FALSE);
            C20337914i1<Integer> c20337914i12 = InterfaceC772190UQv.p3;
            c20337914i12.LJFF(Integer.valueOf(c20337914i12.LIZIZ().intValue() + 1));
        }
    }

    public final void LJIIJ(String str, boolean z, View.OnTouchListener onTouchListener) {
        C786410Ut5.LJLLLLLL(0, this.LIZLLL);
        this.LIZLLL.setClickable(true);
        C500260Jjc.LLFFF(this.LJIIJ);
        C786410Ut5.f5(this.LJIIJ, 0.0f);
        this.LJIIJ.animate().alpha(1.0f).setDuration(200L).start();
        this.LJIIJ.setRepeatCount(2);
        if (z) {
            if (C497740JfY.LJJ()) {
                this.LJIIJ.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_left_device);
            } else {
                this.LJIIJ.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_right_device);
            }
        } else if (C497740JfY.LJJ()) {
            this.LJIIJ.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_right_device);
        } else {
            this.LJIIJ.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_swipe_left_device);
        }
        this.LJIIJ.addAnimatorListener(new ALAdapterS9S0100000_12(this, 13));
        this.LJIIJ.playAnimation();
        this.LJIIIIZZ.setText(str);
        C786410Ut5.k5(this.LJIIIIZZ, 0.0f);
        this.LJIIIIZZ.animate().alpha(1.0f).setDuration(200L).start();
        if (onTouchListener == null) {
            C786410Ut5.I7(null, this.LIZLLL);
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 177), this.LIZLLL);
        } else {
            this.LIZLLL.setOnTouchListener(new ATListenerS339S0200000_12(this, onTouchListener, 0));
            C786410Ut5.I7(null, this.LIZLLL);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0UZ0, java.lang.Object] */
    public C781300Ukq(DataChannel dataChannel, LifecycleOwner lifecycleOwner, View view, View view2, View view3) {
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = view;
        this.LIZLLL = view2;
        this.LJ = view3;
        this.LJII = (C16F5) view.findViewById(R.id.jdm);
        this.LJIIIIZZ = (C16F5) view2.findViewById(R.id.jdo);
        this.LJIIIZ = (C1324720kZq) view.findViewById(R.id.jch);
        this.LJIIJ = (C1295960jpS) view2.findViewById(R.id.jci);
        this.LJIIJJI = (C1324720kZq) view.findViewById(R.id.c2s);
        this.LJIIL = (C1324720kZq) view.findViewById(R.id.vy_);
        ?? r3 = new InterfaceC20484915Dr() { // from class: X.0UZ0
            @Override // X.InterfaceC20484915Dr
            public final void LIZ(InterfaceC20484815Dq interfaceC20484815Dq) {
                this.LIZ.LJFF++;
            }

            @Override // X.InterfaceC20484915Dr
            public final void LIZIZ(InterfaceC20484815Dq interfaceC20484815Dq, int i) {
                r1.LJFF--;
                this.LIZ.LJIIJJI();
            }
        };
        this.LJIJI = r3;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.REAL_TIME_PERFORMANCE_PAGE_MESSAGE.getIntType(), new C786110Usb(this, 3));
        }
        dataChannel.BQ2(lifecycleOwner, DrawGuessStartGameEvent.class, new AwS591S0100000_12(this, 999));
        dataChannel.BQ2(lifecycleOwner, DrawGuessExitGameEvent.class, new AwS591S0100000_12(this, LSPassThroughRecordSizeConfig.DEFAULT));
        dataChannel.BQ2(lifecycleOwner, DrawGuessFreelyStartChannel.class, new AwS591S0100000_12(this, 1001));
        dataChannel.EQ2(lifecycleOwner, LiveCenterStatusChannel.class, new AwS591S0100000_12(this, 1002));
        dataChannel.BQ2(lifecycleOwner, MemberMessageChannel.class, new AwS591S0100000_12(this, 1003));
        dataChannel.BQ2(lifecycleOwner, LiveExtendedScreenShowGuide.class, new AwS591S0100000_12(this, 1004));
        dataChannel.BQ2(lifecycleOwner, LiveExtendedScreenCloseGuide.class, new AwS591S0100000_12(this, 1005));
        dataChannel.BQ2(lifecycleOwner, LiveCompanionExtendedScreenShowGuide.class, new AwS591S0100000_12(this, 1006));
        dataChannel.BQ2(lifecycleOwner, LiveNotShowGuideAgain.class, new AwS591S0100000_12(this, 991));
        dataChannel.BQ2(lifecycleOwner, LiveExtendedScreenStatus.class, new AwS591S0100000_12(this, 992));
        dataChannel.BQ2(lifecycleOwner, StickerSelectedEvent.class, new AwS591S0100000_12(this, 993));
        dataChannel.BQ2(lifecycleOwner, StickerCancelChannel.class, new AwS591S0100000_12(this, 995));
        dataChannel.BQ2(lifecycleOwner, LiveExtendedScreenShowMarkViewerGuide.class, new AwS591S0100000_12(this, 996));
        if (C781520UlC.LJI(C751980Tee.LIZJ(dataChannel))) {
            dataChannel.BQ2(lifecycleOwner, LiveGameExtendedScreenShowGuide.class, new AwS591S0100000_12(this, 997));
            dataChannel.BQ2(lifecycleOwner, LiveGameExtendedScreenCloseGuide.class, new AwS591S0100000_12(this, 998));
        }
        if (C781520UlC.LJIIJJI(C751980Tee.LIZJ(dataChannel))) {
            ((CopyOnWriteArraySet) C464790IKn.LIZ.LIZJ).add(r3);
        }
    }

    public final boolean LJ(boolean z, Runnable runnable, String str, String str2, View.OnTouchListener onTouchListener) {
        LiveMode streamType;
        if (LIZ().size() != 0 && !z) {
            if (!LIZ().contains(runnable)) {
                LIZ().add(runnable);
            }
            return false;
        }
        this.LJI = false;
        String strLIZ = null;
        if (LiveMarkViewerOptimizationSetting.INSTANCE.getValue()) {
            LJIIJ(str, true, onTouchListener);
        } else {
            this.LIZJ.setClickable(true);
            C786410Ut5.LJLLLLLL(0, this.LIZJ);
            final C1143920fsE c1143920fsE = new C1143920fsE();
            final C1143920fsE c1143920fsE2 = new C1143920fsE();
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = 2;
            C473410IhP.LJFF(LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask(), LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache());
            c1143920fsE.LIZ = this.LJIIIZ;
            c1143920fsE.LIZIZ = "tiktok_live_broadcast_demand_2";
            c1143920fsE.LJFF = false;
            c1143920fsE.LJI = 3;
            c1143920fsE.LJIILIIL = true;
            c1143920fsE.LJ = new C1143950fsH() { // from class: X.0Ukr
                @Override // X.C1143950fsH
                public final void LIZLLL() {
                    C118300cf c118300cf2 = c118300cf;
                    C1143920fsE c1143920fsE3 = c1143920fsE;
                    C1143920fsE c1143920fsE4 = c1143920fsE2;
                    int i = c118300cf2.element - 1;
                    c118300cf2.element = i;
                    if (i == 0) {
                        c1143920fsE3.LJFF();
                        c1143920fsE4.LJFF();
                    }
                }

                @Override // X.C1143950fsH
                public final void LJFF(Animatable animatable) {
                    View view = this.LIZJ;
                    if (view != null) {
                        view.setClickable(false);
                    }
                    C786410Ut5.LJLLLLLL(8, this.LIZJ);
                    c1143920fsE2.LIZ();
                    this.LJIIJJI();
                    LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12(c1143920fsE, 876));
                }
            };
            c1143920fsE2.LIZ = this.LJIIL;
            c1143920fsE2.LIZIZ = C0IPN.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1");
            c1143920fsE2.LJFF = false;
            c1143920fsE2.LJI = 3;
            c1143920fsE2.LJIILIIL = true;
            c1143920fsE2.LJ = new C1143950fsH() { // from class: X.0Uku
                @Override // X.C1143950fsH
                public final void LIZLLL() {
                    C118300cf c118300cf2 = c118300cf;
                    C1143920fsE c1143920fsE3 = c1143920fsE;
                    C1143920fsE c1143920fsE4 = c1143920fsE2;
                    int i = c118300cf2.element - 1;
                    c118300cf2.element = i;
                    if (i == 0) {
                        c1143920fsE3.LJFF();
                        c1143920fsE4.LJFF();
                    }
                }

                @Override // X.C1143950fsH
                public final void LJFF(Animatable animatable) {
                    View view = this.LIZJ;
                    if (view != null) {
                        view.setClickable(false);
                    }
                    LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12(c1143920fsE2, 877));
                }
            };
            if (C497740JfY.LJJ()) {
                c1143920fsE.LIZJ = "ttlive_livecenter_guide_hand_opt.webp";
                c1143920fsE2.LIZJ = "ttlive_livecenter_guide_black_line.webp";
                C1143680frq.LJIIIIZZ(c1143920fsE);
                C1143680frq.LJIIIIZZ(c1143920fsE2);
            } else {
                c1143920fsE.LIZJ = "ttlive_livecenter_guide_hand_rtl.webp";
                c1143920fsE2.LIZJ = "ttlive_livecenter_guide_black_line_rtl.webp";
                C1143680frq.LJIIIIZZ(c1143920fsE);
                C1143680frq.LJIIIIZZ(c1143920fsE2);
            }
            this.LJII.LJJJI(R.style.a8q);
            if (FullScreenCsCompanionSetting.INSTANCE.getValue(null) > 0) {
                try {
                    C21382118m3.LIZIZ(this.LJII, 15, 24, 1, 1);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LJII.setMaxLines(3);
            }
            this.LJII.setText(str);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJII, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(180L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LJII, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(180L);
            duration2.setStartDelay(2808L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(duration, duration2);
            animatorSet.start();
            this.LIZJ.setClickable(true);
            C786410Ut5.I7(new ACListenerS79S0300000_12(this, animatorSet, c1143920fsE, 20), this.LIZJ);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_extended_comment_filed_guidence");
        c474500IjALIZ.LJIJJLI(this.LIZ);
        if (str2.length() > 0) {
            c474500IjALIZ.LJJII(str2, "guidence_type");
        }
        Room room = (Room) this.LIZ.gg0(RoomChannel.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            strLIZ = C354201Zc.LIZ(streamType);
        }
        c474500IjALIZ.LJJ(strLIZ);
        c474500IjALIZ.LIZ();
        this.LIZ.SX0(C752680Tfm.class, Long.valueOf(SystemClock.elapsedRealtime()));
        return true;
    }
}

package com.bytedance.android.live.effect.karaoke;

import X.C01GW;
import X.C03A5;
import X.C0IJT;
import X.C0IUA;
import X.C0JG7;
import X.C0U0Z;
import X.C0U17;
import X.C0U1C;
import X.C0U1H;
import X.C0U20;
import X.C0U21;
import X.C0U22;
import X.C0U28;
import X.C0U3I;
import X.C0U3P;
import X.C0U3Q;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C1161920gLG;
import X.C11LS;
import X.C11NN;
import X.C11S5;
import X.C1324720kZq;
import X.C13BV;
import X.C1602160rnK;
import X.C20337914i1;
import X.C20441214yg;
import X.C21561119Zp;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C465900IOu;
import X.C473410IhP;
import X.C474500IjA;
import X.C497700JfU;
import X.C497740JfY;
import X.C500260Jjc;
import X.C763810Txj;
import X.C765410U0t;
import X.C765700U1w;
import X.C765720U1y;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC768840UDy;
import X.InterfaceC1273910jFt;
import X.InterfaceC497710JfV;
import X.InterfaceC766480U4w;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AUListenerS220S0200000_12;
import Y.AfS181S0100000_12;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.effect.api.KaraokeModeStatusChannel;
import com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget;
import com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiGuestTalkStateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestPauseStatusChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.RtcSeiReceivedChannel;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorWidgetLazyInit;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeCommerceRenewSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeGuestVolumeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMicDetectionPhase1Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMicDetectionPhase2Setting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMicDetectionSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSeiDelaySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSeiTimerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestKtvSeiIntervalTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestKtvSwitcherSetting;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeHoverWidget extends KaraokeRecyclableWidget {
    public KaraokeViewModel LL;
    public C0U3I LLILLJJLI;
    public RunnableC781530UlD LLILLL;
    public C1324720kZq LLILZ;
    public volatile int LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public InterfaceC1273910jFt LLJILJIL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIJI;
    public C0U1C LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C03A5 LLJJJ;
    public final AwS591S0100000_12 LLJJJJ;
    public int LLJJJJJIL;
    public C11LS LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final int LLJLIL;
    public final int LLJLILLLLZIIL;
    public final int LLJLL;
    public List<Integer> LLJLLIL;
    public volatile boolean LLJLLL;
    public volatile boolean LLJZ;
    public boolean LLJZIJLIL;
    public volatile long LLL;
    public C11LS LLLF;
    public volatile long LLLFF;
    public C0U22 LLILZIL = C0U22.LJIJ;
    public long LLIZ = -1;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(17));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 42));
    public long LLJILLL = -1;
    public long LLJJIII = -1;
    public long LLJJJIL = 200;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gwc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        y1(false);
        this.LL = null;
        this.LLJILJIL = null;
        C500260Jjc.LJJLIIIJLJLI(this.LLLF);
        C497700JfU c497700JfU = C497700JfU.LIZ;
        C497700JfU.LIZLLL(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        C01GW c01gw = C765700U1w.LIZIZ;
        c01gw.getValue().getClass();
        ((C765720U1y) c01gw.getValue()).LIZ = null;
        C0U1C c0u1c = this.LLJJIJIIJIL;
        if (c0u1c != null) {
            c0u1c.LIZ();
        }
        this.LLJJIJIIJIL = null;
    }

    public final void z1() {
        this.LLJZIJLIL = false;
        C11LS c11ls = this.LLLF;
        if (c11ls != null) {
            C500260Jjc.LJJLIIIJLJLI(c11ls);
        }
        this.LLLF = null;
    }

    public final JSONObject A1() {
        return (JSONObject) this.LLJILJILJ.getValue();
    }

    public final void D1() {
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        this.LLLF = (C11LS) C11NN.LJII(this.LLJJJIL, TimeUnit.MILLISECONDS).LJIIJ(C11S5.LIZ()).LJIIL(new AfS181S0100000_12(this, 41));
    }

    public KaraokeHoverWidget() {
        MultiGuestKtvSeiIntervalTimeSetting.INSTANCE.getValue();
        this.LLJJJJ = new AwS591S0100000_12(this, 65);
        int counter = LiveKaraokeMicDetectionPhase1Setting.INSTANCE.getCounter();
        this.LLJLIL = counter;
        this.LLJLILLLLZIIL = counter + LiveKaraokeMicDetectionPhase2Setting.INSTANCE.getCounter();
        this.LLJLL = LiveKaraokeGuestVolumeThresholdSetting.INSTANCE.getValue();
        this.LLJLLIL = C13BV.INSTANCE;
        this.LLLFF = 200L;
    }

    public final void E1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("testing: ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C20441214yg.LIZIZ("KDetect#terminate", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJLIIIJLLLLLLLZ = false;
        C497700JfU c497700JfU = C497700JfU.LIZ;
        C497700JfU.LIZLLL(this);
        this.LLJJL = 0;
        C11LS c11ls = this.LLJJJJLIIL;
        if (c11ls != null) {
            C500260Jjc.LJJLIIIJLJLI(c11ls);
        }
    }

    public final void F1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("testing: ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        C20441214yg.LIZIZ("KDetect#trigger", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJLIIIJLLLLLLLZ) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = false;
        C497700JfU c497700JfU = C497700JfU.LIZ;
        C497700JfU.LIZJ.put(this, new InterfaceC497710JfV() { // from class: X.0U26
            @Override // X.InterfaceC497710JfV
            public final void LIZ(EnumC768840UDy enumC768840UDy, EnumC768840UDy enumC768840UDy2) {
                int i;
                KaraokeHoverWidget karaokeHoverWidget = this.LIZ;
                if (enumC768840UDy == EnumC768840UDy.MULTI_GUEST) {
                    i = 1;
                } else {
                    i = 0;
                }
                karaokeHoverWidget.LLJJJJJIL = i;
            }
        });
        this.dataChannel.EQ2(this, MultiGuestTalkStateChannel.class, new AwS591S0100000_12(this, 66));
        EnumC768840UDy enumC768840UDyLIZ = c497700JfU.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("scene: ");
        sbLIZ2.append(enumC768840UDyLIZ);
        C20441214yg.LIZIZ("KDetect#multi", C2188811AlT.LIZIZ(sbLIZ2));
        this.LLJJJJJIL = enumC768840UDyLIZ != EnumC768840UDy.MULTI_GUEST ? 0 : 1;
        this.LLJJL = 0;
        this.LLJJJJLIIL = (C11LS) C11NN.LJII(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJIIJ(C11S5.LIZ()).LJIIL(new AfS181S0100000_12(this, 236));
    }

    public final void G1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideAnim Role: ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", posY: ");
        C20337914i1<Float> c20337914i1 = InterfaceC766480U4w.LJJLJ;
        sbLIZ.append(c20337914i1.LIZIZ());
        sbLIZ.append(", shown: ");
        C20337914i1<Boolean> c20337914i12 = InterfaceC766480U4w.LJJLI;
        sbLIZ.append(c20337914i12.LIZIZ());
        C20441214yg.LIZIZ("KLyric", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("GuideAnim posY: ");
        sbLIZ2.append(Intrinsics.LIZLLL(c20337914i1.LIZIZ(), -1.0f));
        C20441214yg.LIZIZ("KLyric", C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LLILZLL == 1 && Intrinsics.LIZLLL(c20337914i1.LIZIZ(), -1.0f) && !c20337914i12.LIZIZ().booleanValue()) {
            C20441214yg.LIZIZ("KLyric", "GuideAnim test 1");
            final C1324720kZq c1324720kZq = this.LLILZ;
            if (c1324720kZq != null) {
                if (C497740JfY.LJJ()) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
                    c1324720kZq.setRotationY(180.0f);
                }
                C1324720kZq c1324720kZq2 = this.LLILZ;
                if (c1324720kZq2 != null) {
                    C786410Ut5.LLJJIII(c1324720kZq2, 0);
                }
                C473410IhP.LJFF(LiveBroadcastPictureMemOpt.getCleanFrescoAnimationCacheTask(), LiveBroadcastPictureMemOpt.optGeckoWebPAnimationCache());
                final C1143920fsE c1143920fsE = new C1143920fsE();
                C20441214yg.LIZIZ("KLyric", "GuideAnim test 2");
                c1143920fsE.LIZIZ = "tiktok_live_broadcast_demand_1";
                c1143920fsE.LIZJ = "karaoke_drag_guide_hoverball_only.webp";
                c1143920fsE.LJIILIIL = true;
                c1143920fsE.LIZ = c1324720kZq;
                c1143920fsE.LJI = 1;
                c1143920fsE.LJFF = true;
                c1143920fsE.LJIIIZ = ((long) LSPassThroughRecordSizeConfig.DEFAULT) * 2500;
                c1143920fsE.LJ = new C1143950fsH() { // from class: X.0U2B
                    @Override // X.C1143950fsH
                    public final void LIZLLL() {
                        C20441214yg.LIZIZ("KLyric", "GuideAnim onResourceReady");
                    }

                    @Override // X.C1143950fsH
                    public final void LJ(Animatable animatable) {
                        C20441214yg.LIZIZ("KLyric", "GuideAnim onStart");
                        InterfaceC766480U4w.LJJLI.LJFF(Boolean.TRUE);
                        C1324720kZq c1324720kZq3 = this.LIZ.LLILZ;
                        if (c1324720kZq3 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq3, 0);
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-1.0f, 1.0f);
                        C1324720kZq c1324720kZq4 = c1324720kZq;
                        KaraokeHoverWidget karaokeHoverWidget = this.LIZ;
                        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        valueAnimatorOfFloat.setDuration(2500L);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS220S0200000_12(c1324720kZq4, karaokeHoverWidget, 4));
                        valueAnimatorOfFloat.start();
                    }

                    @Override // X.C1143950fsH
                    public final void LJFF(Animatable animatable) {
                        C20441214yg.LIZIZ("KLyric", "GuideAnim onResourceReady");
                        C1324720kZq c1324720kZq3 = this.LIZ.LLILZ;
                        if (c1324720kZq3 != null) {
                            C786410Ut5.LLJJIII(c1324720kZq3, 8);
                        }
                        C0U3I c0u3i = this.LIZ.LLILLJJLI;
                        if (c0u3i != null) {
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0u3i);
                            c0u3i.setTranslationY(0.0f);
                        }
                        LiveBroadcastPictureMemOpt.cleanGeckoWebPResources(new AwS556S0100000_12(c1143920fsE, 846));
                    }
                };
                C1143680frq.LJIIIIZZ(c1143920fsE);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(KaraokeModeStatusChannel.class, Boolean.FALSE);
        }
        C20441214yg.LIZIZ("KLyric", "onHide");
        InterfaceC766480U4w.LJJJZ.LJFF(Boolean.FALSE);
        if (this.LLILZLL == 1 && this.LLJJIII != -1) {
            C0U17 c0u17 = C0U17.LIZ;
            DataChannel dataChannel2 = this.dataChannel;
            boolean z = this.LLJJI;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJIII;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_floating_panel_use_time");
            c474500IjALIZ.LJIJJLI(dataChannel2);
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_live_take_default");
            c474500IjALIZ.LJJII(Integer.valueOf((int) (jCurrentTimeMillis / 1000)), "use_time");
            C0U17.LIZ(c0u17, c474500IjALIZ);
            c474500IjALIZ.LIZ();
        }
        ILinkMicInteractAbilityService iLinkMicInteractAbilityService = (ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class);
        if (iLinkMicInteractAbilityService != null) {
            iLinkMicInteractAbilityService.En0(false);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        KaraokeViewModel karaokeViewModel = this.LL;
        if (karaokeViewModel != null) {
            karaokeViewModel.pause(false);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        KaraokeViewModel karaokeViewModel;
        super.onResume();
        C20441214yg.LIZIZ("KLyric", "onResume");
        DataChannel dataChannel = this.dataChannel;
        if ((dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(PauseLiveChannel.class), Boolean.TRUE)) && (karaokeViewModel = this.LL) != null) {
            if (karaokeViewModel.LLJJLIIIJLLLLLLLZ) {
                C0U1H c0u1hIQ2 = karaokeViewModel.IQ2();
                c0u1hIQ2.LJII(c0u1hIQ2.LIZIZ, false);
            }
            karaokeViewModel.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C20441214yg.LIZIZ("KLyric", "onShow");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJJIII = jCurrentTimeMillis;
        C0U17.LIZLLL = jCurrentTimeMillis;
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJJZ;
        Boolean bool = Boolean.TRUE;
        c20337914i1.LJFF(bool);
        if (this.LLILZLL == 2) {
            C0U17 c0u17 = C0U17.LIZ;
            DataChannel dataChannel = this.dataChannel;
            boolean z = this.LLJLLL;
            int i = this.LLJJIJI;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_audience_floating_panel_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C0U17.LIZ(c0u17, c474500IjALIZ);
            c474500IjALIZ.LJJII(z ? "guest" : "audience", "user_type");
            c474500IjALIZ.LJJII(i != 2 ? i != 3 ? "empty" : "pause" : "play", "karaoke_status");
            c474500IjALIZ.LIZ();
        } else {
            C0U17 c0u172 = C0U17.LIZ;
            DataChannel dataChannel2 = this.dataChannel;
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(this.LLJJI || Intrinsics.LJFF(C0IUA.LJIJI, "h5_karaoke")));
            String str = C0IUA.LJIJI;
            KaraokeViewModel karaokeViewModel = this.LL;
            boolean z2 = karaokeViewModel != null ? karaokeViewModel.LLJJL : false;
            boolean z3 = this.LLJJI;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_karaoke_floating_panel_start");
            c474500IjALIZ2.LJIJJLI(dataChannel2);
            c474500IjALIZ2.LJJII(Integer.valueOf(zLJJJI ? 1 : 0), "is_live_take_default");
            c474500IjALIZ2.LJJII(str, "enter_from");
            c474500IjALIZ2.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_h5_entry");
            c474500IjALIZ2.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "is_remembered");
            C0U17.LIZ(c0u172, c474500IjALIZ2);
            c474500IjALIZ2.LIZ();
        }
        ILinkMicInteractAbilityService iLinkMicInteractAbilityService = (ILinkMicInteractAbilityService) C1161920gLG.LIZJ(ILinkMicInteractAbilityService.class);
        if (iLinkMicInteractAbilityService != null) {
            iLinkMicInteractAbilityService.En0(true);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.zW(KaraokeModeStatusChannel.class, bool);
        }
    }

    public final void B1(boolean z) {
        this.LLJJIJIL = z;
        C21561119Zp lyricView = null;
        if (z) {
            C0U3I c0u3i = this.LLILLJJLI;
            if (c0u3i != null) {
                lyricView = c0u3i.getLyricView();
            }
            C500260Jjc.LJIILLIIL(lyricView);
            C0U3I c0u3i2 = this.LLILLJJLI;
            if (c0u3i2 != null) {
                c0u3i2.h0();
            }
            this.LLJJIJI = 3;
            KaraokeViewModel karaokeViewModel = this.LL;
            if (karaokeViewModel != null) {
                karaokeViewModel.cR2(new C765410U0t(false, this.LLILZIL.LIZ));
                return;
            }
            return;
        }
        if (!this.LLJI) {
            return;
        }
        C0U3I c0u3i3 = this.LLILLJJLI;
        if (c0u3i3 != null) {
            lyricView = c0u3i3.getLyricView();
        }
        C500260Jjc.LLFFF(lyricView);
    }

    public final void C1(boolean z) throws JSONException {
        this.LLJI = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Setting Lyric Switch: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LyricSEI", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJZ) {
            A1().put("lyric_status", !this.LLJI ? 1 : 0);
        }
        C21561119Zp lyricView = null;
        if (this.LLJI) {
            if (!this.LLJJIJIL) {
                C0U3I c0u3i = this.LLILLJJLI;
                if (c0u3i != null) {
                    lyricView = c0u3i.getLyricView();
                }
                C500260Jjc.LLFFF(lyricView);
                return;
            }
            return;
        }
        C0U3I c0u3i2 = this.LLILLJJLI;
        if (c0u3i2 != null) {
            lyricView = c0u3i2.getLyricView();
        }
        C500260Jjc.LJIILLIIL(lyricView);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) throws JSONException {
        int i;
        boolean z;
        C0U3I c0u3i;
        KaraokeViewModel karaokeViewModel;
        C20441214yg.LIZIZ("KLyric", "onLoad");
        hide();
        boolean z2 = true;
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            i = 1;
        } else {
            i = 2;
        }
        this.LLILZLL = i;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ND(UserService.getInstance().user().LJIJJLI()) == C0JG7.GUEST_AUDIENCE) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLLL = z;
        C0U3I c0u3i2 = this.LLILLJJLI;
        if (c0u3i2 != null) {
            c0u3i2.setRole(this.LLILZLL);
        }
        this.LLIZ = C500260Jjc.LJJLIIIJ(this.dataChannel);
        Fragment fragment = this.widgetCallback.getFragment();
        if (fragment.getActivity() != null) {
            this.LL = C765700U1w.LIZJ(this.dataChannel);
            if (!this.LLILZIL.LJIIJJI() && !this.LLJJ && (karaokeViewModel = this.LL) != null) {
                C0U22 c0u22 = this.LLILZIL;
                C763810Txj.LIZ(Integer.valueOf(this.LLILZLL));
                karaokeViewModel.cR2(new C0U0Z(c0u22));
            }
            C0U3I c0u3i3 = this.LLILLJJLI;
            if (c0u3i3 != null) {
                c0u3i3.LLJJIJI = new AwS591S0100000_12(this, 960);
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C0U20(this, null), 3);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C0U21(this, null), 3);
        }
        if (MultiGuestKtvSwitcherSetting.INSTANCE.isEnable()) {
            C20441214yg.LIZIZ("KaraokeMulti", "on Second Phase Karaoke");
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.DQ2(RtcSeiReceivedChannel.class, this, new AwS591S0100000_12(this, 961));
            }
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, PauseLiveChannel.class, new AwS591S0100000_12(this, 962));
        }
        if (!C763810Txj.LIZ(Integer.valueOf(this.LLILZLL))) {
            C20441214yg.LIZIZ("KaraokeMulti", "MultiPause register");
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.BQ2(this, MultiGuestPauseStatusChannel.class, new AwS591S0100000_12(this, 963));
                dataChannel3.BQ2(this, LiveEndEvent.class, new AwS591S0100000_12(this, 964));
            }
        } else if (LiveKaraokeMicDetectionSetting.INSTANCE.enabled() && !this.LLILZIL.LJIIJJI() && this.LLJJIJI == 2) {
            F1();
        }
        C784440Upu.LIZ().LIZJ(this, C465900IOu.class).LIZJ(new AfS181S0100000_12(this, 235));
        C0U3I c0u3i4 = this.LLILLJJLI;
        if (c0u3i4 != null && c0u3i4.getCurRedDotCount() > 0 && (c0u3i = this.LLILLJJLI) != null) {
            c0u3i.setRedDot(0);
        }
        this.LLJJJIL = LiveKaraokeSeiTimerSetting.INSTANCE.getValue();
        this.LLLFF = LiveKaraokeSeiDelaySetting.INSTANCE.getValue();
        if (this.LLILZLL == 1) {
            C1(InterfaceC766480U4w.LJJLIIIJJI.LIZIZ().booleanValue());
            if (LiveKaraokeCommerceRenewSetting.INSTANCE.getValue()) {
                ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
                C0U3P.LIZJ(C0U3Q.KARAOKE, this.LLJJJJ);
            }
        } else if (this.LLILZLL == 3) {
            C1(InterfaceC766480U4w.LJJLIIJ.LIZIZ().booleanValue());
        } else {
            C1(false);
        }
        C765720U1y c765720U1y = (C765720U1y) C765700U1w.LIZIZ.getValue();
        DataChannel dataChannel4 = this.dataChannel;
        if (C500260Jjc.LJIIZILJ(dataChannel4) && (!C500260Jjc.LJIIZILJ(this.dataChannel) || !LiveAnchorWidgetLazyInit.INSTANCE.enable())) {
            z2 = false;
        }
        C0U1C c0u1c = c765720U1y.LIZ;
        if (c0u1c == null) {
            c0u1c = new C0U1C(this, dataChannel4, z2);
            c765720U1y.LIZ = c0u1c;
        }
        this.LLJJIJIIJIL = c0u1c;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        int i;
        RunnableC781530UlD runnableC781530UlD;
        super.setContentView(view);
        this.LLILZ = (C1324720kZq) findViewById(R.id.g_l);
        this.LLILLL = (RunnableC781530UlD) findViewById(R.id.fgp);
        if (InterfaceC766480U4w.LJJLL.LIZIZ().booleanValue() && (runnableC781530UlD = this.LLILLL) != null) {
            C786410Ut5.LLLILZJ(runnableC781530UlD, 0);
            C03A5 c03a5 = new C03A5();
            this.LLJJJ = c03a5;
            runnableC781530UlD.setAdapter(c03a5);
            runnableC781530UlD.setLayoutManager(new LinearLayoutManager(this.context, 1, false));
        }
        C0U3I c0u3i = (C0U3I) findViewById(R.id.m20);
        c0u3i.setRole(this.LLILZLL);
        C21561119Zp lyricView = c0u3i.getLyricView();
        if (lyricView != null) {
            if (this.LLJI) {
                i = 0;
            } else {
                i = 8;
            }
            int visibility = lyricView.getVisibility();
            lyricView.setVisibility(i);
            C1602160rnK.LIZIZ(visibility, i, lyricView);
        }
        DataChannel dataChannel = this.dataChannel;
        c0u3i.LLJJIII = dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C0U28.class, 0);
        }
        this.LLILLJJLI = c0u3i;
        findViewById(R.id.s9w);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e3 A[Catch: Exception -> 0x0118, TryCatch #0 {Exception -> 0x0118, blocks: (B:14:0x002b, B:16:0x0036, B:18:0x0052, B:20:0x005c, B:22:0x0064, B:24:0x0073, B:25:0x007f, B:27:0x0083, B:29:0x0089, B:30:0x008d, B:32:0x0093, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:38:0x00ae, B:40:0x00b7, B:42:0x00bb, B:44:0x00bf, B:52:0x00ce, B:54:0x00d2, B:55:0x00d5, B:57:0x00d9, B:58:0x00e3, B:60:0x00e7, B:61:0x00ea, B:63:0x00ee, B:64:0x00f7, B:68:0x0103, B:70:0x0107, B:72:0x010b, B:74:0x0115), top: B:79:0x002b }] */
    @Override // com.bytedance.android.live.effect.api.effect.KaraokeRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.KaraokeHoverWidget.x1(java.lang.String):void");
    }

    public final void y1(boolean z) {
        CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList;
        C0U3I c0u3i;
        this.LLJ = false;
        this.LLJJ = false;
        C0U3I c0u3i2 = this.LLILLJJLI;
        if (c0u3i2 != null) {
            ValueAnimator valueAnimator = c0u3i2.LLJJ;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            c0u3i2.LLJJ = null;
            C21561119Zp c21561119Zp = c0u3i2.LLILLJJLI;
            if (c21561119Zp != null) {
                c21561119Zp.LLILZ = 0;
                c21561119Zp.LLILLJJLI = 0L;
                c21561119Zp.LLJI = 0;
                c21561119Zp.LLILZIL.clear();
                c21561119Zp.LLJJJJ = null;
                c21561119Zp.invalidate();
            }
            C1324720kZq c1324720kZq = c0u3i2.LLILLL;
            if (c1324720kZq != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1324720kZq);
                c1324720kZq.setRotation(0.0f);
                c1324720kZq.setImageResource(R.color.a1d);
                c1324720kZq.setBackgroundResource(R.drawable.ezz);
            }
            DataChannel dataChannel = c0u3i2.LLJJIII;
            if (dataChannel != null) {
                dataChannel.SX0(C0U28.class, 0);
            }
        }
        this.LLILZIL = C0U22.LJIJ;
        if (z && (c0u3i = this.LLILLJJLI) != null) {
            c0u3i.setRedDot(0);
        }
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        C0U3Q c0u3q = C0U3Q.KARAOKE;
        AwS591S0100000_12 awS591S0100000_12 = this.LLJJJJ;
        ConcurrentHashMap<C0U3Q, CopyOnWriteArrayList<Function1<Boolean, Unit>>> concurrentHashMap = C0U3P.LIZIZ;
        CopyOnWriteArrayList<Function1<Boolean, Unit>> copyOnWriteArrayList2 = concurrentHashMap.get(c0u3q);
        if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.contains(awS591S0100000_12) && (copyOnWriteArrayList = concurrentHashMap.get(c0u3q)) != null) {
            copyOnWriteArrayList.remove(awS591S0100000_12);
        }
        this.LLJJIJI = 0;
        z1();
        E1();
    }
}

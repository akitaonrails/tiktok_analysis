package com.bytedance.android.live.publicscreen.impl.widget;

import X.AbstractC1110520f0M;
import X.AbstractC1110790f0n;
import X.AbstractC1110800f0o;
import X.AbstractC1111600f26;
import X.AbstractC1111810f2R;
import X.AbstractC1136060ffY;
import X.AbstractC1338480kw2;
import X.AbstractC1585810rMx;
import X.AbstractC21673719rz;
import X.C0GRV;
import X.C0IJT;
import X.C0J1N;
import X.C0J3Y;
import X.C0KAJ;
import X.C0KYR;
import X.C1088080eQA;
import X.C1096670ee1;
import X.C1099280eiE;
import X.C1102070emj;
import X.C1109770ez9;
import X.C1110810f0p;
import X.C1111050f1D;
import X.C1111110f1J;
import X.C1111440f1q;
import X.C1111560f22;
import X.C1111590f25;
import X.C1111930f2d;
import X.C1111960f2g;
import X.C1111990f2j;
import X.C1112010f2l;
import X.C1112370f3L;
import X.C1112390f3N;
import X.C1112410f3P;
import X.C1112590f3h;
import X.C1112760f3y;
import X.C1112910f4D;
import X.C1113460f56;
import X.C1114110f69;
import X.C1114120f6A;
import X.C1114920f7S;
import X.C1121670fIL;
import X.C1143300frE;
import X.C1148240fzC;
import X.C1161920gLG;
import X.C11JF;
import X.C11RD;
import X.C1300480jwk;
import X.C1324720kZq;
import X.C1602160rnK;
import X.C16FJ;
import X.C16FK;
import X.C16G1;
import X.C181500mr;
import X.C1848410yCV;
import X.C1EOY;
import X.C20441214yg;
import X.C2095008Iq;
import X.C21341918fZ;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2252331DDr;
import X.C227800uK;
import X.C468250IXv;
import X.C472860IgW;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C750140Tbg;
import X.C751340Tdc;
import X.C775900Uc8;
import X.C776700UdQ;
import X.C781550UlF;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1087130eOd;
import X.EnumC1101430elh;
import X.EnumC19356910oB;
import X.EnumC584680MwU;
import X.EnumC776080UcQ;
import X.InterfaceC1097170eep;
import X.InterfaceC1109090ey3;
import X.InterfaceC1112020f2m;
import X.InterfaceC1112050f2p;
import X.InterfaceC1112060f2q;
import X.InterfaceC1112320f3G;
import X.InterfaceC1112700f3s;
import X.InterfaceC1112810f43;
import X.InterfaceC482090IvP;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS152S0100000_17;
import Y.ALAdapterS13S0100000_17;
import Y.AObjectS350S0100000_7;
import Y.AObjectS360S0100000_17;
import Y.AObjectS392S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS28S0101000_17;
import Y.ARunnableS36S0110000_17;
import Y.ATListenerS450S0100000_17;
import Y.AfS186S0100000_17;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.dynamicstrategy.LiveStrategyPublicScreenAnimationDuration;
import com.bytedance.android.live.dynamicstrategy.PublicScreenSlideTimesChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.publicscreen.api.PublicScreenLoadedEvent;
import com.bytedance.android.live.publicscreen.api.WarningInfoVisibilityEvent;
import com.bytedance.android.live.publicscreen.api.WidgetReadyEvent;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.chatroom.behavior.ScrollHeaderBehavior;
import com.bytedance.android.livesdk.chatroom.behavior.SuctionBottomBehavior;
import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenConfig;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.DoSendMessageChannelEvent;
import com.bytedance.android.livesdk.dataChannel.LiveHostAutoAdaptiveChannel;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.dataChannel.PreShowKeyboardEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenNewMessageVisible;
import com.bytedance.android.livesdk.dataChannel.PublicScreenShrinkChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTnsSafetyTools;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageFirstScreenAnimation;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAnimEnableSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenChatHolderCacheConfigSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenShadowOptimizationAnchorSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenShadowOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenXmlLayerOptSetting;
import com.bytedance.android.livesdk.model.message.RichChatMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.event.FollowGuideBottomCardVisibilityAnimInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AwS104S0110000_17;
import kotlin.jvm.internal.AwS141S0201000_17;
import kotlin.jvm.internal.AwS157S0101000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS44S0102000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import mf.a;

/* JADX INFO: loaded from: classes18.dex */
public abstract class PublicScreenWidget extends IPublicScreenHolderWidget implements InterfaceC1112050f2p {
    public boolean LL;
    public C16FK LLILLJJLI;
    public C472860IgW LLILLL;
    public ViewStub LLILZ;
    public View LLILZIL;
    public ObjectAnimator LLILZLL;
    public ObjectAnimator LLIZ;
    public ObjectAnimator LLIZLLLIL;
    public MainScreenCommentPinnedWidget LLJ;
    public FrameLayout LLJI;
    public ViewStub LLJIJIL;
    public C1112410f3P LLJILJIL;
    public C1111930f2d LLJILJILJ;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC1112810f43 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C11JF LLJJJ;
    public String LLJJJIL;
    public C1088080eQA LLJJJJ;
    public Room LLJJJJJIL;
    public InterfaceC1112060f2q LLJL;
    public AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> LLJLIL;
    public C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>> LLJLILLLLZIIL;
    public C1112390f3N LLJLLIL;
    public C16FJ LLJLLL;
    public C1114120f6A LLJZ;
    public EnumC1087130eOd LLJILLL = EnumC1087130eOd.NORMAL;
    public final BPEAHandler LLJJJJLIIL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJJL = false;
    public final boolean LLJJLIIIJLLLLLLLZ = LiveMessageFirstScreenAnimation.enableOpt();
    public boolean LLJLL = false;
    public int LLJZIJLIL = 0;
    public int LLL = 0;

    public void A1() {
    }

    @Override // X.InterfaceC1112050f2p
    public final void Cr() {
    }

    public /* synthetic */ boolean L1() {
        return false;
    }

    public void LLJZ(MotionEvent motionEvent) {
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private void Y1() {
        C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1111050f1D;
        View view;
        if (this.LLJILLL != EnumC1087130eOd.NORMAL || (c1111050f1D = this.LLJLILLLLZIIL) == null || (view = c1111050f1D.itemView) == null) {
            return;
        }
        C786410Ut5.ed(view, -view.getHeight());
    }

    public final void B1() {
        InterfaceC1112060f2q interfaceC1112060f2q = this.LLJL;
        if (interfaceC1112060f2q != null) {
            InterfaceC1112060f2q interfaceC1112060f2q2 = this.LLJLILLLLZIIL.LLILLJJLI;
            if (interfaceC1112060f2q2 != interfaceC1112060f2q) {
                if (interfaceC1112060f2q instanceof AbstractC1110790f0n) {
                    ((AbstractC1110790f0n) interfaceC1112060f2q).LIZJ(this.LLJILJILJ.LLLJL);
                }
                this.LLJLIL.LJIILIIL(this.LLJLILLLLZIIL, this.LLJL, Collections.emptyList());
                if (interfaceC1112060f2q2 != null) {
                    interfaceC1112060f2q2.LJJJJL(false);
                }
                this.LLJL.onAttach();
            }
            this.LLJL = null;
        }
    }

    public void BE2() {
        C786410Ut5.LJLLLLLL(8, (View) this.LLJJIJIIJIL);
        MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget = this.LLJ;
        if (mainScreenCommentPinnedWidget != null) {
            mainScreenCommentPinnedWidget.hide();
        }
    }

    public final boolean D1() {
        DataChannel dataChannel;
        return !((BadPhonesWatchLiveCommonUIOptSetting.INSTANCE.getRemoveInsertMessageAnimation() || this.LLJJL) && ((dataChannel = this.dataChannel) == null || !Boolean.TRUE.equals(dataChannel.gg0(UserIsAnchorChannel.class)) || this.LLJJL)) && LivePublicScreenAnimEnableSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC1112050f2p
    public final void DH2() {
        C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1111050f1D = this.LLJLILLLLZIIL;
        if (c1111050f1D != null) {
            C786410Ut5.LJLLLLLL(8, c1111050f1D.itemView);
        }
    }

    public void G1() {
        Room room = this.LLJJJJJIL;
        if (room != null) {
            this.LLJJIJI = room.getStreamType() == LiveMode.THIRD_PARTY;
        }
        T1(C227800uK.class);
        T1(C1112910f4D.class);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, PreShowKeyboardEvent.class, new AObjectS360S0100000_17(this, 166));
        dataChannel.BQ2(this, FollowGuideBottomCardVisibilityAnimInfo.class, new AObjectS350S0100000_7(this, 100));
        dataChannel.EQ2(this, PublicScreenShrinkChannel.class, new AObjectS360S0100000_17(this, 167));
        dataChannel.EQ2(this, LiveStrategyPublicScreenAnimationDuration.class, new AObjectS360S0100000_17(this, 168));
    }

    public void H1() {
        C1112390f3N c1112390f3N = this.LLJLLIL;
        C1111590f25 c1111590f25 = new C1111590f25(C500260Jjc.LJIIZILJ(this.dataChannel));
        c1112390f3N.LIZJ = c1111590f25;
        C781550UlF c781550UlF = c1112390f3N.LIZ;
        if (c781550UlF != null) {
            c781550UlF.setAdapter(c1111590f25);
        }
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        SmoothLinearLayoutManager smoothLinearLayoutManager = new SmoothLinearLayoutManager(this.context);
        c1112390f3N2.LIZLLL = smoothLinearLayoutManager;
        C781550UlF c781550UlF2 = c1112390f3N2.LIZ;
        if (c781550UlF2 != null) {
            c781550UlF2.setLayoutManager(smoothLinearLayoutManager);
        }
        Boolean.TRUE.equals(this.dataChannel.gg0(UserIsAnchorChannel.class));
        LivePublicScreenConfig livePublicScreenConfig = C1111930f2d.LLZZZIL;
        SmoothLinearLayoutManager smoothLinearLayoutManager2 = this.LLJLLIL.LIZLLL;
        if (smoothLinearLayoutManager2 != null) {
            smoothLinearLayoutManager2.setStackFromEnd(true);
        }
        C1112390f3N c1112390f3N3 = this.LLJLLIL;
        SmoothLinearLayoutManager smoothLinearLayoutManager3 = c1112390f3N3.LIZLLL;
        if (smoothLinearLayoutManager3 != null) {
            smoothLinearLayoutManager3.LL = 1.0f;
            smoothLinearLayoutManager3.mRecycleChildrenOnDetach = true;
            smoothLinearLayoutManager3.LLILLJJLI = true;
        }
        C1114920f7S c1114920f7S = new C1114920f7S((int) C497740JfY.LIZIZ(0.0f));
        C781550UlF c781550UlF3 = c1112390f3N3.LIZ;
        if (c781550UlF3 != null) {
            c781550UlF3.addItemDecoration(c1114920f7S);
        }
        C781550UlF c781550UlF4 = this.LLJLLIL.LIZ;
        if (c781550UlF4 != null) {
            c781550UlF4.setHasFixedSize(true);
        }
    }

    public final void I1() {
        if (this.LLILZLL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZIL, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            this.LLILZLL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(240L);
            this.LLILZLL.addListener(new ALAdapterS13S0100000_17(this, 9));
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void Ie1() {
        float f = 1;
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLJLLIL.LIZLLL;
        if (smoothLinearLayoutManager != null) {
            smoothLinearLayoutManager.LL = f;
        }
    }

    public final void J1() {
        C472860IgW c472860IgW = this.LLILLL;
        View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(this, 183);
        if (C1848410yCV.LIZ) {
            aCListenerS152S0100000_17 = new f(aCListenerS152S0100000_17);
        }
        a aVar = new a(aCListenerS152S0100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c472860IgW);
        }
        c472860IgW.setOnClickListener(aVar);
    }

    public void KB() {
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJIIJIL);
        MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget = this.LLJ;
        if (mainScreenCommentPinnedWidget != null) {
            mainScreenCommentPinnedWidget.show();
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void LJFF() {
        C781550UlF c781550UlF = this.LLJLLIL.LIZ;
        if (c781550UlF != null) {
            c781550UlF.stopScroll();
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void Oc2() {
        C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1111050f1D = this.LLJLILLLLZIIL;
        if (c1111050f1D == null || this.LLJLL || c1111050f1D.itemView.getVisibility() == 0) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LLJLILLLLZIIL.itemView);
    }

    public AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> P1() {
        return new C1111560f22(true);
    }

    public void R1() {
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("panel_public_screen_auto_slide");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
        }
    }

    public void S1() {
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("panel_public_screen_auto_slide");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void Sk0() {
        View view = this.LLILZIL;
        if (view == null || view.getVisibility() == 8) {
            if (!this.LLJLLIL.LIZ()) {
                return;
            }
            b2(this.LLJJ, false);
            return;
        }
        if (this.LLIZLLLIL == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZIL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            this.LLIZLLLIL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(240L);
        }
        if (this.LLIZLLLIL.isRunning()) {
            return;
        }
        C786410Ut5.Pd(this.LLIZLLLIL);
        this.LLILZIL.setEnabled(false);
        this.LLIZLLLIL.removeAllListeners();
        this.LLIZLLLIL.addListener(new ALAdapterS13S0100000_17(this, 8));
    }

    public final void W1() {
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            C1111930f2d c1111930f2d = this.LLJILJILJ;
            InterfaceC1112320f3G interfaceC1112320f3G = c1111930f2d.LLLLIL;
            if (interfaceC1112320f3G != null) {
                c1111930f2d.uH1(interfaceC1112320f3G, true);
                C786410Ut5.LJLIIL(C1111930f2d.c, c1111930f2d.LLLLII, c1111930f2d.LLZLLIL);
            }
            if (this.LLJILJILJ.LLLII.isEmpty()) {
                return;
            }
            N1(true);
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void WI0() {
        C1111930f2d c1111930f2d = this.LLJILJILJ;
        if (c1111930f2d == null || c1111930f2d.LLLJL == null) {
            return;
        }
        d2(EnumC1087130eOd.NORMAL, true);
        b2(0, false);
        AbstractC1111600f26 abstractC1111600f26 = this.LLJLLIL.LIZJ;
        int itemCount = (abstractC1111600f26 != null ? abstractC1111600f26.getItemCount() : 0) - 1;
        C1112390f3N c1112390f3N = this.LLJLLIL;
        c1112390f3N.getClass();
        c1112390f3N.LIZIZ(new AwS157S0101000_17(c1112390f3N, itemCount, 6));
        this.LLJJI = itemCount;
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 279);
        C781550UlF c781550UlF = c1112390f3N2.LIZ;
        if (c781550UlF != null) {
            HandlerHook.viewPost(c781550UlF, aRunnableS117S0100000_17);
        }
        Y1();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3  */
    @Override // X.InterfaceC1112050f2p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X50() {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget.X50():void");
    }

    @Override // X.InterfaceC1112050f2p
    public final void eQ0() {
        C1112410f3P c1112410f3P = this.LLJILJIL;
        if (c1112410f3P != null) {
            int visibility = c1112410f3P.getVisibility();
            c1112410f3P.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1112410f3P);
            this.LLJJJIL = "";
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(WarningInfoVisibilityEvent.class, Boolean.FALSE);
            }
        }
        C1111930f2d c1111930f2d = this.LLJILJILJ;
        if (c1111930f2d != null) {
            C1102070emj c1102070emj = C1102070emj.LIZ;
            DataChannel dataChannel2 = this.dataChannel;
            C1099280eiE c1099280eiE = C1099280eiE.LL;
            C1096670ee1 c1096670ee1 = c1111930f2d.LLJ;
            C0KAJ c0kaj = C0KAJ.AUTO_TERMINATE;
            c1102070emj.getClass();
            C1102070emj.LJIILJJIL(c1102070emj, dataChannel2, c1099280eiE, c1096670ee1, c0kaj, null, null, 112);
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final Fragment ex1() {
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            return interfaceC1097170eep.getFragment();
        }
        return null;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        boolean zEnableLayerOpt = LivePublicScreenXmlLayerOptSetting.INSTANCE.enableLayerOpt(C500260Jjc.LJIIZILJ(this.dataChannel));
        this.LL = zEnableLayerOpt;
        return zEnableLayerOpt ? R.layout.h3o : R.layout.h3n;
    }

    @Override // X.InterfaceC1112050f2p
    public final C1112760f3y pw() {
        int iFindLastCompletelyVisibleItemPosition;
        C1112760f3y c1112760f3y = new C1112760f3y();
        int iLJFF = this.LLJLLIL.LJFF();
        int iLIZLLL = 0;
        int iLJ = iLJFF > 0 ? (iLJFF - this.LLJLLIL.LJ()) + 1 : 0;
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLJLLIL.LIZLLL;
        if (smoothLinearLayoutManager != null && (iFindLastCompletelyVisibleItemPosition = smoothLinearLayoutManager.findLastCompletelyVisibleItemPosition()) > 0) {
            iLIZLLL = (iFindLastCompletelyVisibleItemPosition - this.LLJLLIL.LIZLLL()) + 1;
        }
        C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1111050f1D = this.LLJLILLLLZIIL;
        if (c1111050f1D != null && c1111050f1D.itemView.getVisibility() == 0) {
            if (this.LLJLILLLLZIIL.itemView.getTranslationY() != 0.0f) {
                iLJ++;
            }
            if (this.LLJLILLLLZIIL.itemView.getTranslationY() == (-this.LLJLILLLLZIIL.itemView.getHeight())) {
                iLIZLLL++;
            }
        }
        c1112760f3y.LIZ = iLJ;
        c1112760f3y.LIZIZ = iLIZLLL;
        return c1112760f3y;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget
    public final C1109770ez9 y1() {
        return this.LLJILJILJ.LLLJL;
    }

    public final int E1() {
        if (getView() != null) {
            return getView().getWidth();
        }
        return 0;
    }

    public final void U1() {
        if (!D1()) {
            this.LLJLLIL.LJII(null);
            return;
        }
        C1114120f6A c1114120f6A = new C1114120f6A(new ARunnableS117S0100000_17(this, 277), new ARunnableS117S0100000_17(this, 278));
        c1114120f6A.LLIZ = false;
        c1114120f6A.LJJIL(false);
        c1114120f6A.LLJJJIL = new AObjectS392S0100000_17(this, 42);
        this.LLJZ = c1114120f6A;
        this.LLJLLIL.LJII(c1114120f6A);
    }

    public final void V1() {
        if (SystemClock.elapsedRealtime() - 0 < 0) {
            this.LLJLLL.setOverScrollMode(EnumC19356910oB.ALWAYS);
        } else if (this.LLJLLL.getScrollMode() == EnumC584680MwU.REFRESH) {
            this.LLJLLL.setOverScrollMode(EnumC19356910oB.ONLY_TOP);
        } else {
            this.LLJLLL.setOverScrollMode(EnumC19356910oB.NONE);
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final View getContentView() {
        return getView();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        C1111930f2d c1111930f2d = this.LLJILJILJ;
        if (c1111930f2d != null) {
            c1111930f2d.start(2);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        super.onStop();
        C1111930f2d c1111930f2d = this.LLJILJILJ;
        if (c1111930f2d != null) {
            c1111930f2d.QA0(2);
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final EnumC1087130eOd LLLIIIL() {
        return this.LLJILLL;
    }

    public static void z1(PublicScreenWidget publicScreenWidget) {
        publicScreenWidget.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_new_message_click");
        c474500IjALIZ.LJ("click");
        c474500IjALIZ.LJIJJLI(publicScreenWidget.dataChannel);
        c474500IjALIZ.LJJII(C0KYR.LIZIZ(publicScreenWidget.LLJJJJJIL, publicScreenWidget.dataChannel), "admin_type");
        c474500IjALIZ.LJJII(0, "is_floating");
        c474500IjALIZ.LIZ();
        if (publicScreenWidget.isViewValid()) {
            if (C468250IXv.LIZ(publicScreenWidget.dataChannel)) {
                C468250IXv.LJ(publicScreenWidget.dataChannel, "msg");
                return;
            }
            MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget = publicScreenWidget.LLJ;
            if (mainScreenCommentPinnedWidget != null) {
                mainScreenCommentPinnedWidget.z1(true);
            }
            publicScreenWidget.d2(EnumC1087130eOd.NORMAL, true);
            publicScreenWidget.Y1();
        }
    }

    public final void C1(int i) {
        C1111930f2d c1111930f2d = this.LLJILJILJ;
        if (!c1111930f2d.LLLJL.LJI && this.LLL != 0 && this.LLJLLIL.LIZIZ) {
            int i2 = this.LLJZIJLIL + i;
            this.LLJZIJLIL = i2;
            if (i2 >= 10) {
                C1111990f2j<InterfaceC1112060f2q> c1111990f2j = c1111930f2d.LLJLL;
                c1111990f2j.getClass();
                C1111990f2j<InterfaceC1112060f2q> c1111990f2j2 = new C1111990f2j<>(c1111990f2j.LIZ);
                c1111990f2j2.LIZIZ.addAll(c1111990f2j.LIZIZ);
                c1111990f2j2.LIZJ.addAll(c1111990f2j.LIZJ);
                c1111990f2j2.LJFF.addAll(c1111990f2j.LJFF);
                c1111990f2j2.LJI = c1111990f2j.LJI;
                c1111930f2d.LLJLL = c1111990f2j2;
                this.LLJLLIL.LIZIZ = false;
            }
        }
    }

    public final void F1(View view) {
        ScrollHeaderBehavior scrollHeaderBehavior = (ScrollHeaderBehavior) ((C16G1) this.LLJLLIL.LIZ.getLayoutParams()).LIZ;
        if (scrollHeaderBehavior != null) {
            scrollHeaderBehavior.LIZ = new AObjectS360S0100000_17(this, 160);
        }
        SuctionBottomBehavior suctionBottomBehavior = (SuctionBottomBehavior) ((C16G1) view.getLayoutParams()).LIZ;
        if (suctionBottomBehavior != null) {
            suctionBottomBehavior.LJFF = true;
            suctionBottomBehavior.LIZIZ = true;
            suctionBottomBehavior.LJ = true;
            if (C1111930f2d.LJJLJLI(this.LLJILJILJ.LLLJL.LJI).LIZIZ()) {
                suctionBottomBehavior.LJIIIIZZ = 2;
            }
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void Is2(int i) {
        b2(this.LLJJ + i, true);
    }

    public final void M1(String str) {
        String str2;
        HashMap map = new HashMap();
        map.put("event_name", "TEXT_MESSAGE_WIDGET_STATUS");
        map.put("reason", str);
        if (isShowing()) {
            str2 = "visible";
        } else {
            str2 = "gone";
        }
        map.put("view_status", str2);
        C1143300frE.LJIIJJI().LIZIZ("ttlive_msg", map);
    }

    public final void N1(boolean z) {
        int iFindLastCompletelyVisibleItemPosition;
        if (!this.LLJILJILJ.LLLII.isEmpty()) {
            SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLJLLIL.LIZLLL;
            if (smoothLinearLayoutManager != null) {
                iFindLastCompletelyVisibleItemPosition = smoothLinearLayoutManager.findLastCompletelyVisibleItemPosition();
            } else {
                iFindLastCompletelyVisibleItemPosition = 0;
            }
            ArrayList arrayList = new ArrayList();
            for (int iLIZLLL = this.LLJLLIL.LIZLLL(); iLIZLLL <= iFindLastCompletelyVisibleItemPosition; iLIZLLL++) {
                Object objLJI = this.LLJLLIL.LJI(iLIZLLL);
                if (objLJI instanceof InterfaceC1112700f3s) {
                    InterfaceC1112320f3G interfaceC1112320f3GI4 = ((InterfaceC1112700f3s) objLJI).i4();
                    if (interfaceC1112320f3GI4 instanceof InterfaceC1112320f3G) {
                        if (z && !interfaceC1112320f3GI4.LJJJIL().LIZ) {
                            C1112390f3N c1112390f3N = this.LLJLLIL;
                            C1111440f1q c1111440f1q = new C1111440f1q(true);
                            c1112390f3N.getClass();
                            c1112390f3N.LIZIZ(new AwS141S0201000_17(c1112390f3N, iLIZLLL, c1111440f1q, 3));
                        } else {
                            this.LLJILJILJ.LJIILJJIL(interfaceC1112320f3GI4);
                        }
                        if (interfaceC1112320f3GI4.LJJIJL() != null) {
                            arrayList.add(interfaceC1112320f3GI4);
                            ((LinkedList) this.LLJILJILJ.LLLII).remove(interfaceC1112320f3GI4);
                        }
                    }
                }
            }
            this.LLJILJILJ.LJ(arrayList);
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void Oq0(boolean z) {
        this.LLJLL = z;
    }

    @Override // X.InterfaceC1112050f2p
    public final void PF1(boolean z) {
        Long lLJIILIIL;
        Long lLJIILIIL2;
        Long lLJIILIIL3;
        Long lLJIILIIL4;
        if (!this.LLJILJILJ.LLLJL.LJI && this.LLJJLIIIJLLLLLLLZ && this.LLJZ != null) {
            C1114120f6A c1114120f6A = null;
            if (D1()) {
                if (z) {
                    if (Intrinsics.LJFF(this.LLJZ.LLJJJJJIL, "none")) {
                        C1114120f6A c1114120f6A2 = this.LLJZ;
                        C20441214yg.LJIIIZ("PublicScreenWidget", "handleFirstConsume");
                        Map<String, String> map = c1114120f6A2.LLJJJJ;
                        map.put("state_add_duration", String.valueOf(c1114120f6A2.LLILLL));
                        map.put("state_change_duration", String.valueOf(c1114120f6A2.LLILZLL));
                        map.put("state_move_duration", String.valueOf(c1114120f6A2.LLILZIL));
                        map.put("state_remove_duration", String.valueOf(c1114120f6A2.LLILZ));
                        map.put("state_add_opt", String.valueOf(c1114120f6A2.LLJJJJLIIL));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("saveAnimateState ");
                        sbLIZ.append(c1114120f6A2.LLJJJJ);
                        C20441214yg.LJIIIZ("TranslateAddAnimator", C2188811AlT.LIZIZ(sbLIZ));
                        long jDuration = LiveMessageFirstScreenAnimation.duration();
                        if (LiveMessageFirstScreenAnimation.noAnimation()) {
                            this.LLJLLIL.LJII(null);
                        } else if (LiveMessageFirstScreenAnimation.alphaAnimation()) {
                            c1114120f6A2.LJJIL(true);
                            c1114120f6A2.LJIL(jDuration);
                            c1114120f6A2.LJIJJ(jDuration);
                        } else if (LiveMessageFirstScreenAnimation.moveAnimation()) {
                            c1114120f6A2.LJIL(jDuration);
                            c1114120f6A2.LJIJJ(jDuration);
                        }
                        c1114120f6A2.LLJJJJJIL = "save";
                        return;
                    }
                    return;
                }
            } else if (z) {
                return;
            }
            if (!Intrinsics.LJFF(this.LLJZ.LLJJJJJIL, "save")) {
                return;
            }
            C1114120f6A c1114120f6A3 = this.LLJZ;
            C20441214yg.LJIIIZ("PublicScreenWidget", "handleNonFirstConsume");
            c1114120f6A3.LLJJJJJIL = "none";
            if (!c1114120f6A3.LLJJL) {
                c1114120f6A = c1114120f6A3;
            }
            a2(c1114120f6A);
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1114120f6A3.LLJJJJ;
            String str = (String) linkedHashMap.get("state_add_duration");
            if (str != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(str)) != null) {
                c1114120f6A3.LJIJJ(lLJIILIIL4.longValue());
            }
            String str2 = (String) linkedHashMap.get("state_change_duration");
            if (str2 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str2)) != null) {
                c1114120f6A3.LJIJJLI(lLJIILIIL3.longValue());
            }
            String str3 = (String) linkedHashMap.get("state_move_duration");
            if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
                c1114120f6A3.LJIL(lLJIILIIL2.longValue());
            }
            String str4 = (String) linkedHashMap.get("state_remove_duration");
            if (str4 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str4)) != null) {
                c1114120f6A3.LJJ(lLJIILIIL.longValue());
            }
            String str5 = (String) linkedHashMap.get("state_add_opt");
            if (str5 != null) {
                c1114120f6A3.LJJIL(Boolean.parseBoolean(str5));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("restoreAnimateState ");
            sbLIZ2.append(c1114120f6A3.LLJJJJ);
            C20441214yg.LJIIIZ("TranslateAddAnimator", C2188811AlT.LIZIZ(sbLIZ2));
            ((LinkedHashMap) c1114120f6A3.LLJJJJ).clear();
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void QA0(int i) {
        this.LLL = i | this.LLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("background-- visibility：");
        boolean z = false;
        if (this.LLL == 0) {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append("--isExtendScreen：");
        sbLIZ.append(L1());
        C20441214yg.LJ("PublicScreenOpt", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final <T> void T1(Class<T> cls) {
        ((C0J1N) C784440Upu.LIZ().LJ(cls).LIZJ(C11RD.LJ(this))).LIZJ(new AfS186S0100000_17(this, 184));
    }

    @Override // X.InterfaceC1112050f2p
    public final void UD1(boolean z) {
        C16FJ c16fj = this.LLJLLL;
        if (c16fj != null) {
            c16fj.LJI(false, z);
            if (!this.LLJILJILJ.LJLIIIL()) {
                this.LLJLLL.setScrollMode(EnumC584680MwU.NONE);
                V1();
            }
        }
    }

    public void Wd0(int i) {
        int itemCount;
        GU0(i, 1);
        AbstractC1111600f26 abstractC1111600f26 = this.LLJLLIL.LIZJ;
        int itemCount2 = 0;
        if (abstractC1111600f26 != null) {
            itemCount = abstractC1111600f26.getItemCount();
        } else {
            itemCount = 0;
        }
        if (i != itemCount) {
            C1112390f3N c1112390f3N = this.LLJLLIL;
            AbstractC1111600f26 abstractC1111600f262 = c1112390f3N.LIZJ;
            if (abstractC1111600f262 != null) {
                itemCount2 = abstractC1111600f262.getItemCount();
            }
            c1112390f3N.LIZIZ(new AwS44S0102000_17(c1112390f3N, i, itemCount2 - i, 0));
            return;
        }
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        c1112390f3N2.getClass();
        c1112390f3N2.LIZIZ(new AwS157S0101000_17(c1112390f3N2, i, 5));
    }

    public final void X1(boolean z) {
        if (z) {
            C781550UlF c781550UlF = this.LLJLLIL.LIZ;
            if (c781550UlF != null) {
                c781550UlF.setVerticalFadingEdgeEnabled(true);
            }
            this.LLJLLL.setVerticalFadingEdgeEnabled(true);
            return;
        }
        C781550UlF c781550UlF2 = this.LLJLLIL.LIZ;
        if (c781550UlF2 != null) {
            c781550UlF2.setVerticalFadingEdgeEnabled(false);
        }
        this.LLJLLL.setVerticalFadingEdgeEnabled(false);
    }

    public final void a2(C1114120f6A c1114120f6A) {
        C1114120f6A c1114120f6A2;
        boolean z;
        if (!this.LLJILJILJ.LLLJL.LJI && this.LLJJLIIIJLLLLLLLZ && (c1114120f6A2 = this.LLJZ) != null && c1114120f6A2.LLJJJJJIL.equals("save")) {
            C1114120f6A c1114120f6A3 = this.LLJZ;
            if (c1114120f6A == null) {
                z = true;
            } else {
                z = false;
            }
            c1114120f6A3.getClass();
            c1114120f6A3.LJJIJL(Boolean.valueOf(z), "state_clear", new AwS104S0110000_17(c1114120f6A3, z, 4));
            return;
        }
        C1112390f3N c1112390f3N = this.LLJLLIL;
        if (!D1()) {
            c1114120f6A = null;
        }
        c1112390f3N.LJII(c1114120f6A);
    }

    public final void c2(EnumC1087130eOd enumC1087130eOd) {
        d2(enumC1087130eOd, true);
    }

    @Override // X.InterfaceC1112050f2p
    public final void cO0(int i) {
        C1112390f3N c1112390f3N = this.LLJLLIL;
        c1112390f3N.getClass();
        c1112390f3N.LIZIZ(new AwS157S0101000_17(c1112390f3N, i, 7));
        this.LLJJI = i;
    }

    public final void e2(boolean z) {
        int childCount;
        View childAt;
        int childAdapterPosition;
        C1109770ez9 c1109770ez9 = this.LLJILJILJ.LLLJL;
        if (c1109770ez9 != null) {
            boolean z2 = c1109770ez9.LJJIIZI;
            c1109770ez9.LJJIIZI = z;
            if (!z2 && z) {
                int i = 0;
                while (true) {
                    SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLJLLIL.LIZLLL;
                    if (smoothLinearLayoutManager != null) {
                        childCount = smoothLinearLayoutManager.getChildCount();
                    } else {
                        childCount = 0;
                    }
                    if (i < childCount) {
                        SmoothLinearLayoutManager smoothLinearLayoutManager2 = this.LLJLLIL.LIZLLL;
                        if (smoothLinearLayoutManager2 != null && (childAt = smoothLinearLayoutManager2.getChildAt(i)) != null && (childAdapterPosition = this.LLJLLIL.LIZ.getChildAdapterPosition(childAt)) != -1) {
                            C1112390f3N c1112390f3N = this.LLJLLIL;
                            C1111110f1J c1111110f1J = new C1111110f1J(z);
                            c1112390f3N.getClass();
                            c1112390f3N.LIZIZ(new AwS141S0201000_17(c1112390f3N, childAdapterPosition, c1111110f1J, 3));
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void ei0(int i) {
        C1112390f3N c1112390f3N = this.LLJLLIL;
        c1112390f3N.getClass();
        c1112390f3N.LIZIZ(new AwS157S0101000_17(c1112390f3N, i, 5));
        if (EnumC1087130eOd.NORMAL == this.LLJILLL || this.LLJJIII) {
            this.LLJJIII = true;
            WI0();
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void hR(boolean z) {
        C16FJ c16fj = this.LLJLLL;
        if (c16fj != null) {
            if (z) {
                EnumC584680MwU scrollMode = c16fj.getScrollMode();
                EnumC584680MwU enumC584680MwU = EnumC584680MwU.REFRESH;
                if (scrollMode != enumC584680MwU) {
                    this.LLJLLL.setScrollMode(enumC584680MwU);
                    V1();
                    return;
                }
                return;
            }
            EnumC584680MwU scrollMode2 = this.LLJLLL.getScrollMode();
            EnumC584680MwU enumC584680MwU2 = EnumC584680MwU.NONE;
            if (scrollMode2 == enumC584680MwU2) {
                return;
            }
            this.LLJLLL.setScrollMode(enumC584680MwU2);
            V1();
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final boolean hr1(int i) {
        AbstractC21673719rz itemAnimator;
        C1112390f3N c1112390f3N = this.LLJLLIL;
        if (c1112390f3N == null) {
            return false;
        }
        C781550UlF c781550UlF = c1112390f3N.LIZ;
        if (c781550UlF != null) {
            c781550UlF.stopScroll();
        }
        C781550UlF c781550UlF2 = this.LLJLLIL.LIZ;
        if (c781550UlF2 != null && (itemAnimator = c781550UlF2.getItemAnimator()) != null) {
            itemAnimator.LJIIL();
        }
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        ARunnableS28S0101000_17 aRunnableS28S0101000_17 = new ARunnableS28S0101000_17(i, this, 13);
        C781550UlF c781550UlF3 = c1112390f3N2.LIZ;
        if (c781550UlF3 != null) {
            HandlerHook.viewPost(c781550UlF3, aRunnableS28S0101000_17);
        }
        if (i >= this.LLJLLIL.LIZLLL()) {
            return false;
        }
        return true;
    }

    public void onEvent(C227800uK c227800uK) {
        RichChatMessage richChatMessage = c227800uK.LIZ;
        if (richChatMessage != null && "6".equals(richChatMessage.actionType)) {
            this.dataChannel.LC0(DoSendMessageChannelEvent.class, new C1113460f56(richChatMessage.actionContent));
            C1111930f2d c1111930f2d = this.LLJILJILJ;
            if (c1111930f2d != null && c1111930f2d.mView != 0) {
                for (int i = 0; i < c1111930f2d.LLJLL.LJFF(); i++) {
                    InterfaceC1112060f2q interfaceC1112060f2qLIZJ = c1111930f2d.LLJLL.LIZJ(i);
                    if ((interfaceC1112060f2qLIZJ instanceof AbstractC1110800f0o) && richChatMessage == ((AbstractC1110800f0o) interfaceC1112060f2qLIZJ).LJIL) {
                        c1111930f2d.LJZ(i);
                        ((InterfaceC1112050f2p) c1111930f2d.mView).WI0();
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object... objArr) {
        this.LLJJJJ = new C1088080eQA();
        this.LLILLJJLI = (C16FK) findViewById(R.id.o_h);
        C16FJ c16fj = (C16FJ) findViewById(R.id.t23);
        this.LLJLLL = c16fj;
        c16fj.setNestedHeader(new C0GRV(this.context));
        this.LLJLLIL = new C1112390f3N((C781550UlF) findViewById(R.id.o_g));
        if (this.LL) {
            this.LLJJIJIIJIL = (InterfaceC1112810f43) findViewById(R.id.xoz);
            this.LLILZ = (ViewStub) findViewById(R.id.o_f);
            this.LLJIJIL = (ViewStub) findViewById(R.id.warning_info);
        } else {
            this.LLJJIJIIJIL = (InterfaceC1112810f43) findViewById(R.id.xoz);
            this.LLILLL = (C472860IgW) findViewById(R.id.o_f);
            J1();
            this.LLJILJIL = (C1112410f3P) findViewById(R.id.warning_info);
        }
        this.LLJJIJIIJIL.setEnableFixedSize(true);
        this.LLJLIL = P1();
        this.LLJI = (FrameLayout) findViewById(R.id.idr);
        this.LLJLLL.setBottomFadingListener(this.LLILLJJLI);
        H1();
        C1112390f3N c1112390f3N = this.LLJLLIL;
        AbstractC1585810rMx abstractC1585810rMx = new AbstractC1585810rMx() { // from class: X.0f3J
            public int LL = -1;
            public boolean LLILLJJLI;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                DataChannel dataChannel;
                this.LLILLL.Q1(recyclerView, i);
                if (i == 1) {
                    this.LLILLJJLI = true;
                    this.LLILLL.LLJJIII = false;
                } else if (i == 0) {
                    if (this.LLILLJJLI && (dataChannel = this.LLILLL.dataChannel) != null) {
                        this.LLILLJJLI = false;
                        dataChannel.FQ2(PublicScreenSlideTimesChannel.class);
                    }
                    if (!C1111450f1r.LIZ) {
                        this.LLILLL.N1(true);
                        PublicScreenWidget publicScreenWidget = this.LLILLL;
                        if (publicScreenWidget.LLJILLL == EnumC1087130eOd.NORMAL) {
                            publicScreenWidget.W1();
                        }
                    }
                    boolean z = !recyclerView.canScrollVertically(1);
                    boolean zLIZ = C468250IXv.LIZ(this.LLILLL.dataChannel);
                    if (z && !zLIZ) {
                        PublicScreenWidget publicScreenWidget2 = this.LLILLL;
                        publicScreenWidget2.LLJILLL = EnumC1087130eOd.NORMAL;
                        publicScreenWidget2.b2(0, false);
                    }
                }
                PublicScreenWidget publicScreenWidget3 = this.LLILLL;
                C1088080eQA c1088080eQA = publicScreenWidget3.LLJJJJ;
                if (c1088080eQA != null) {
                    String strLIZIZ = C0KYR.LIZIZ(publicScreenWidget3.LLJJJJJIL, publicScreenWidget3.dataChannel);
                    if (i == 1) {
                        c1088080eQA.LIZ(strLIZIZ, true);
                    } else {
                        c1088080eQA.LIZ(strLIZIZ, false);
                    }
                }
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                int iFindLastCompletelyVisibleItemPosition;
                PublicScreenWidget publicScreenWidget = this.LLILLL;
                if (publicScreenWidget.LLJILLL == EnumC1087130eOd.NORMAL && (!C1111450f1r.LIZ) && !publicScreenWidget.D1()) {
                    PublicScreenWidget publicScreenWidget2 = this.LLILLL;
                    if (publicScreenWidget2.LLJJIJIL) {
                        return;
                    }
                    if (!publicScreenWidget2.LLJILJILJ.LLLII.isEmpty() && i2 >= 0) {
                        SmoothLinearLayoutManager smoothLinearLayoutManager = this.LLILLL.LLJLLIL.LIZLLL;
                        if (smoothLinearLayoutManager != null) {
                            iFindLastCompletelyVisibleItemPosition = smoothLinearLayoutManager.findLastCompletelyVisibleItemPosition();
                        } else {
                            iFindLastCompletelyVisibleItemPosition = 0;
                        }
                        if (iFindLastCompletelyVisibleItemPosition == this.LL) {
                            return;
                        }
                        this.LL = iFindLastCompletelyVisibleItemPosition;
                        for (int iLIZLLL = this.LLILLL.LLJLLIL.LIZLLL(); iLIZLLL <= iFindLastCompletelyVisibleItemPosition; iLIZLLL++) {
                            RecyclerView.ViewHolder viewHolderLJI = this.LLILLL.LLJLLIL.LJI(iLIZLLL);
                            if (viewHolderLJI instanceof C1111130f1L) {
                                C1111130f1L c1111130f1L = (C1111130f1L) viewHolderLJI;
                                InterfaceC1112320f3G interfaceC1112320f3G = c1111130f1L.LLILLJJLI;
                                if ((interfaceC1112320f3G instanceof InterfaceC1112320f3G) && !interfaceC1112320f3G.LJJJIL().LIZ) {
                                    c1111130f1L.LLZLLLL(false);
                                }
                            }
                        }
                    }
                }
                if (recyclerView.canScrollVertically(1)) {
                    PublicScreenWidget publicScreenWidget3 = this.LLILLL;
                    if (publicScreenWidget3.LLJJIII) {
                        return;
                    }
                    int iLJFF = publicScreenWidget3.LLJLLIL.LJFF();
                    PublicScreenWidget publicScreenWidget4 = this.LLILLL;
                    int i3 = publicScreenWidget4.LLJJI;
                    if (iLJFF > i3) {
                        publicScreenWidget4.b2(publicScreenWidget4.LLJJ - (iLJFF - i3), false);
                        this.LLILLL.LLJJI = iLJFF;
                    }
                    View view = this.LLILLL.LLILZIL;
                    if (view != null && view.getVisibility() == 0) {
                        int iLIZLLL2 = this.LLILLL.LLJLLIL.LIZLLL();
                        int iLJJLL = this.LLILLL.LLJILJILJ.LJJLL();
                        if (iLJJLL != -1) {
                            if (iLJJLL < iLIZLLL2) {
                                C786410Ut5.LJLLLLLL(0, this.LLILLL.findViewById(R.id.yt1));
                            } else {
                                C786410Ut5.LJLLLLLL(8, this.LLILLL.findViewById(R.id.yt1));
                            }
                        }
                    }
                    this.LLILLL.d2(EnumC1087130eOd.FOCUS, true);
                } else if (!C468250IXv.LIZ(this.LLILLL.dataChannel)) {
                    this.LLILLL.d2(EnumC1087130eOd.NORMAL, false);
                }
                C1088080eQA c1088080eQA = this.LLILLL.LLJJJJ;
                if (c1088080eQA != null && c1088080eQA.LIZIZ) {
                    c1088080eQA.LIZ += i2;
                }
            }
        };
        C781550UlF c781550UlF = c1112390f3N.LIZ;
        if (c781550UlF != null) {
            c781550UlF.addOnScrollListener(abstractC1585810rMx);
        }
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: X.0een
            public float LL;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MainScreenCommentPinnedWidget mainScreenCommentPinnedWidget;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 && motionEvent.getY() - this.LL != 0.0f && (mainScreenCommentPinnedWidget = this.LLILLJJLI.LLJ) != null) {
                        mainScreenCommentPinnedWidget.z1(true);
                    }
                } else {
                    this.LL = motionEvent.getY();
                    PublicScreenWidget publicScreenWidget = this.LLILLJJLI;
                    if (publicScreenWidget.LLJILLL == EnumC1087130eOd.NORMAL) {
                        publicScreenWidget.N1(false);
                        return false;
                    }
                }
                return false;
            }
        };
        C781550UlF c781550UlF2 = c1112390f3N2.LIZ;
        if (c781550UlF2 != null) {
            c781550UlF2.setOnDispatchTouchEventListener(onTouchListener);
        }
        C1112390f3N c1112390f3N3 = this.LLJLLIL;
        ATListenerS450S0100000_17 aTListenerS450S0100000_17 = new ATListenerS450S0100000_17(this, 14);
        C781550UlF c781550UlF3 = c1112390f3N3.LIZ;
        if (c781550UlF3 != null) {
            c781550UlF3.setOnTouchListener(aTListenerS450S0100000_17);
        }
        C1112390f3N c1112390f3N4 = this.LLJLLIL;
        AbstractC1338480kw2 abstractC1338480kw2 = new AbstractC1338480kw2() { // from class: X.0f3V
            @Override // X.AbstractC1338480kw2
            public final boolean LIZ(int i, int i2) {
                if (i2 == 0) {
                    if (!this.LIZ.LLJLLIL.LIZ()) {
                        this.LIZ.d2(EnumC1087130eOd.NORMAL, true);
                    } else {
                        this.LIZ.d2(EnumC1087130eOd.FOCUS, true);
                        int iLJFF = this.LIZ.LLJLLIL.LJFF();
                        PublicScreenWidget publicScreenWidget = this.LIZ;
                        int i3 = publicScreenWidget.LLJJI;
                        if (iLJFF > i3) {
                            publicScreenWidget.b2(publicScreenWidget.LLJJ - (iLJFF - i3), false);
                            this.LIZ.LLJJI = iLJFF;
                            return false;
                        }
                    }
                }
                return false;
            }
        };
        C781550UlF c781550UlF4 = c1112390f3N4.LIZ;
        if (c781550UlF4 != null) {
            c781550UlF4.setOnFlingListener(abstractC1338480kw2);
        }
        final View view = getView();
        if (view != null) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0f2x
                public int LL;
                public int LLILLJJLI;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int i9;
                    int i10;
                    if (this.LL == 0 || this.LLILLJJLI == 0) {
                        Object parent = view.getParent();
                        if (parent instanceof View) {
                            View view3 = (View) parent;
                            this.LL = view3.getWidth();
                            this.LLILLJJLI = view3.getHeight();
                        }
                    }
                    int i11 = i3 - i;
                    int i12 = i4 - i2;
                    C1111930f2d c1111930f2d = this.LLILZ.LLJILJILJ;
                    if (c1111930f2d != null && (i9 = this.LL) > 0 && (i10 = this.LLILLJJLI) > 0 && i11 > 0 && i12 > 0) {
                        Iterator it2 = ((ArrayList) c1111930f2d.LL.LJFF).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1112100f2u) it2.next()).LJIJJ(i11, i12, i9, i10);
                        }
                    }
                }
            });
        }
        C1112390f3N c1112390f3N5 = this.LLJLLIL;
        c1112390f3N5.LIZ.setRecyclerPreDetachListener(new AObjectS360S0100000_17(this, 165));
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        ArrayList<InterfaceC1112060f2q> arrayList;
        InterfaceC1112060f2q interfaceC1112060f2q;
        this.dataChannel.zQ2(this);
        BPEAHandler bPEAHandler = this.LLJJJJLIIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LLJJL = false;
        M1("onUnload");
        C1111930f2d c1111930f2d = this.LLJILJILJ;
        if (c1111930f2d != null) {
            c1111930f2d.LLLZL = recycleSource;
            c1111930f2d.detachView();
            C1111960f2g c1111960f2g = c1111930f2d.LLZ;
            if (c1111960f2g.LIZIZ()) {
                c1111960f2g.LJIIJ = 1;
                c1111960f2g.LJIIJJI = recycleSource;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDetach: ");
                sbLIZ.append(recycleSource);
                C2188811AlT.LIZIZ(sbLIZ);
                if (recycleSource == RecycleSource.FROM_CONFIG_CHANGE) {
                    arrayList = new ArrayList();
                    int size = C1111960f2g.LJIIZILJ.getValue().size();
                    for (int i = 0; i < size; i++) {
                        Object obj = ListProtector.get(C1111960f2g.LJIIZILJ.getValue(), i);
                        if (Intrinsics.LJFF(obj, "chat")) {
                            if (!((ArrayList) c1111960f2g.LJIIL).isEmpty()) {
                                arrayList.addAll(c1111960f2g.LJIIL);
                            }
                        } else {
                            C1112590f3h c1112590f3h = c1111960f2g.LJIILLIIL.get(obj);
                            if (c1112590f3h != null && (interfaceC1112060f2q = c1112590f3h.LIZ) != null) {
                                arrayList.add(interfaceC1112060f2q);
                            }
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("flushBufferList size1: ");
                    sbLIZ2.append(arrayList.size());
                    C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    arrayList = null;
                }
                ((ArrayList) c1111960f2g.LJIIL).clear();
                Iterator<Map.Entry<String, C1112590f3h>> it2 = c1111960f2g.LJIILLIIL.entrySet().iterator();
                while (it2.hasNext()) {
                    it2.next().getValue().LIZ = null;
                }
                if (arrayList != null) {
                    for (InterfaceC1112060f2q interfaceC1112060f2q2 : arrayList) {
                        if (interfaceC1112060f2q2 != null && ((PriorityQueue) c1111930f2d.LLJJJJLIIL).size() < c1111930f2d.LLJJJIL) {
                            ((PriorityQueue) c1111930f2d.LLJJJJLIIL).add(interfaceC1112060f2q2);
                            c1111930f2d.LJLJLJ(interfaceC1112060f2q2);
                            c1111930f2d.LL.LJ(interfaceC1112060f2q2, ((PriorityQueue) c1111930f2d.LLJJJJLIIL).size());
                        }
                    }
                }
            }
            ((LinkedList) this.LLJILJILJ.LLLII).clear();
        }
        C11JF c11jf = this.LLJJJ;
        if (c11jf != null) {
            c11jf.dispose();
            this.LLJJJ = null;
        }
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        eQ0();
        this.LLJL = null;
        this.LLJILLL = EnumC1087130eOd.NORMAL;
        this.LLJJ = 0;
        this.LLJJI = 0;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJLL = false;
        DH2();
        this.LLJJIJIL = false;
        this.LLJZIJLIL = 0;
        this.LLJJJJ.LIZJ = null;
        LiveInnerDowngradeAdaptExp liveInnerDowngradeAdaptExp = LiveInnerDowngradeAdaptExp.INSTANCE;
        if (liveInnerDowngradeAdaptExp.getExpValue().getEnablePublicScreenAnim()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.PUBLIC_SCREEN_ANIM);
        }
        if (liveInnerDowngradeAdaptExp.getExpValue().getEnablePublicScreenFadingEdge()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.PUBLIC_SCREEN_FADING_EDGE);
        }
        C1110810f0p c1110810f0p = C1110810f0p.LIZ;
        DataChannel dataChannel = this.dataChannel;
        c1110810f0p.getClass();
        if (dataChannel != null) {
            C20441214yg.LIZLLL("OperationStateMessageNotifyHandler detach");
            C1110810f0p.LIZIZ.remove(dataChannel);
            C1110810f0p.LIZJ.remove(dataChannel);
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void start(int i) {
        boolean z;
        this.LLL = (~i) & this.LLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("foreground-- visibility： ");
        if (this.LLL == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append("--isExtendScreen：");
        sbLIZ.append(L1());
        C20441214yg.LJ("PublicScreenOpt", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLL == 0 && !this.LLJLLIL.LIZIZ) {
            B1();
            this.LLJZIJLIL = 0;
            C1112390f3N c1112390f3N = this.LLJLLIL;
            c1112390f3N.LIZIZ = true;
            List<InterfaceC1112060f2q> listLIZLLL = this.LLJILJILJ.LLJLL.LIZLLL();
            AbstractC1111600f26 abstractC1111600f26 = c1112390f3N.LIZJ;
            if (abstractC1111600f26 != null) {
                abstractC1111600f26.LL = listLIZLLL;
            }
            C1112390f3N c1112390f3N2 = this.LLJLLIL;
            c1112390f3N2.getClass();
            c1112390f3N2.LIZIZ(new AwS561S0100000_17(c1112390f3N2, 643));
            if (this.LLJILLL == EnumC1087130eOd.NORMAL) {
                C1112390f3N c1112390f3N3 = this.LLJLLIL;
                ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 281);
                C781550UlF c781550UlF = c1112390f3N3.LIZ;
                if (c781550UlF != null) {
                    HandlerHook.viewPostDelay(c781550UlF, aRunnableS117S0100000_17, 100L);
                }
            }
        }
    }

    public void w10(InterfaceC1112060f2q interfaceC1112060f2q) {
        O1(interfaceC1112060f2q, null);
    }

    public void onEvent(C1112910f4D c1112910f4D) {
        EnumC1087130eOd enumC1087130eOd = EnumC1087130eOd.NORMAL;
        this.LLJILLL = enumC1087130eOd;
        c2(enumC1087130eOd);
    }

    public void GU0(int i, int i2) {
        C1112390f3N c1112390f3N = this.LLJLLIL;
        c1112390f3N.getClass();
        c1112390f3N.LIZIZ(new AwS44S0102000_17(c1112390f3N, i, i2, 2));
        C1(i2);
    }

    public final void O1(InterfaceC1112060f2q interfaceC1112060f2q, Object obj) {
        SuctionBottomBehavior suctionBottomBehavior;
        if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
            InterfaceC1112060f2q interfaceC1112060f2q2 = this.LLJLILLLLZIIL.LLILLJJLI;
            if (interfaceC1112060f2q2 != null && interfaceC1112060f2q2 != interfaceC1112060f2q) {
                interfaceC1112060f2q2.dispose();
            }
            SuctionBottomBehavior suctionBottomBehavior2 = (SuctionBottomBehavior) ((C16G1) this.LLJI.getLayoutParams()).LIZ;
            if (this.LLJLLIL.LIZIZ) {
                if (this.LLJLILLLLZIIL.itemView.getTranslationY() != 0.0f || this.LLJLILLLLZIIL.itemView.getVisibility() != 0 || (suctionBottomBehavior2 != null && suctionBottomBehavior2.LIZJ)) {
                    ArrayList arrayList = new ArrayList();
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                    this.LLJLIL.LJIILIIL(this.LLJLILLLLZIIL, interfaceC1112060f2q, arrayList);
                    if (interfaceC1112060f2q2 != null && interfaceC1112060f2q2 != interfaceC1112060f2q) {
                        interfaceC1112060f2q2.LJJJJL(false);
                    }
                    interfaceC1112060f2q.onAttach();
                    this.LLJL = null;
                } else {
                    C1112010f2l c1112010f2l = this.LLJILJILJ.LL;
                    if (!c1112010f2l.LJII) {
                        Iterator it2 = ((ArrayList) c1112010f2l.LJ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1112020f2m) it2.next()).LJIIIIZZ(interfaceC1112060f2q);
                        }
                    }
                    this.LLJL = interfaceC1112060f2q;
                }
            } else {
                this.LLJL = interfaceC1112060f2q;
            }
        }
        if (this.LLJILLL == EnumC1087130eOd.FOCUS && (suctionBottomBehavior = (SuctionBottomBehavior) ((C16G1) this.LLJI.getLayoutParams()).LIZ) != null) {
            suctionBottomBehavior.LJFF = false;
        }
        if (this.LLJLILLLLZIIL.itemView.getVisibility() != 0 && !this.LLJLL) {
            C786410Ut5.LJLLLLLL(0, this.LLJLILLLLZIIL.itemView);
        }
    }

    public void Q1(RecyclerView recyclerView, int i) {
        if (i == 0) {
            C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("panel_public_screen_slide");
            if (c1300480jwkLIZIZ != null) {
                c1300480jwkLIZIZ.stop();
                return;
            }
            return;
        }
        C1300480jwk c1300480jwkLIZIZ2 = C1EOY.LIZ.LIZIZ("panel_public_screen_slide");
        if (c1300480jwkLIZIZ2 == null) {
            return;
        }
        c1300480jwkLIZIZ2.LIZJ(null);
    }

    public final void b2(int i, boolean z) {
        String strValueOf;
        float fMeasureText;
        if (!isViewValid()) {
            return;
        }
        if ((z || EnumC1087130eOd.NORMAL != this.LLJILLL) && i > 0) {
            this.LLJJ = i;
            View view = this.LLILZIL;
            if (view != null && view.getVisibility() == 0) {
                return;
            }
            if (i < 100) {
                strValueOf = String.valueOf(i);
            } else {
                strValueOf = "99+";
            }
            if (this.LLILLL == null) {
                this.LLILLL = (C472860IgW) C786410Ut5.LJLLLL(this.LLILZ);
                J1();
                this.LLILLL.LJJLIIIJLJLI(Collections.singletonList("+"));
            }
            if (strValueOf != this.LLILLL.getText()) {
                C472860IgW c472860IgW = this.LLILLL;
                String strLJIIL = C497740JfY.LJIIL(2131755505, i, strValueOf);
                float paddingStart = this.LLILLL.getPaddingStart() + this.LLILLL.getPaddingEnd();
                if (!c472860IgW.getAlreadyMeasureGivenText()) {
                    c472860IgW.LJJLIIIJLLLLLLLZ();
                }
                boolean z2 = !Intrinsics.LJFF(c472860IgW.LLJLLIL, c472860IgW.getText());
                if (z2 || !Intrinsics.LJFF(strLJIIL, c472860IgW.getText())) {
                    String strLJJIII = u.LJJIII(strLJIIL, strValueOf, "", false);
                    boolean zLJFF = true ^ Intrinsics.LJFF(strLJJIII, c472860IgW.LLLFFI);
                    boolean zLJJLIIJ = c472860IgW.LJJLIIJ(strValueOf);
                    Float f = (Float) ((LinkedHashMap) c472860IgW.LLLFZ).get(strLJJIII);
                    if (f != null) {
                        fMeasureText = f.floatValue();
                    } else {
                        fMeasureText = c472860IgW.getPaint().measureText(strLJJIII);
                        c472860IgW.LLLFZ.put(strLJJIII, Float.valueOf(fMeasureText));
                    }
                    float drawableWidth = paddingStart + c472860IgW.getDrawableWidth();
                    if (z2 || zLJFF || zLJJLIIJ) {
                        int i2 = (int) (fMeasureText + c472860IgW.getCurrentNumberFormatStringAnalysisResult().LIZLLL + drawableWidth);
                        int textMeasureMaxWidth = c472860IgW.getTextMeasureMaxWidth();
                        if (i2 > textMeasureMaxWidth) {
                            i2 = textMeasureMaxWidth;
                        }
                        if (i2 != c472860IgW.getLayoutParams().width) {
                            c472860IgW.getLayoutParams().width = i2;
                            ViewGroup.LayoutParams layoutParams = c472860IgW.getLayoutParams();
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c472860IgW);
                            c472860IgW.setLayoutParams(layoutParams);
                        }
                    }
                    c472860IgW.setCurrentText(strLJIIL);
                    c472860IgW.setCurrentNumberFormatString(strValueOf);
                    c472860IgW.LLLFFI = strLJJIII;
                    c472860IgW.setText(strLJIIL);
                }
            }
            if (this.LLILLL.getVisibility() != 0) {
                C786410Ut5.LJJZZIII(this.LLJJJJLIIL, new ARunnableS36S0110000_17(this, z, 6));
                return;
            }
            return;
        }
        C472860IgW c472860IgW2 = this.LLILLL;
        if (c472860IgW2 != null && c472860IgW2.getVisibility() == 0) {
            this.dataChannel.zW(PublicScreenNewMessageVisible.class, Boolean.FALSE);
            C472860IgW c472860IgW3 = this.LLILLL;
            int visibility = c472860IgW3.getVisibility();
            c472860IgW3.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c472860IgW3);
        }
        this.LLJJ = 0;
    }

    public final void d2(EnumC1087130eOd enumC1087130eOd, boolean z) {
        if (this.LLJILLL == enumC1087130eOd) {
            return;
        }
        this.LLJILLL = enumC1087130eOd;
        if (EnumC1087130eOd.NORMAL == enumC1087130eOd) {
            b2(0, false);
            if (z) {
                WI0();
                Y1();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
        int i;
        C1112390f3N c1112390f3N;
        AbstractC1111600f26 abstractC1111600f26;
        AbstractC1111600f26 abstractC1111600f262;
        this.LLJJJJ.LIZJ = this.dataChannel;
        C472860IgW c472860IgW = this.LLILLL;
        if (c472860IgW != null) {
            c472860IgW.LJJLIIIJLJLI(Collections.singletonList("+"));
        }
        eQ0();
        A1();
        this.LLJLLIL.LIZIZ = true;
        this.LLJLL = false;
        this.LLL = 0;
        Boolean bool = (Boolean) this.dataChannel.gg0(UserIsAnchorChannel.class);
        if (this.dataChannel.gg0(C776700UdQ.class) != null) {
            this.LLJILJILJ = (C1111930f2d) this.dataChannel.gg0(C776700UdQ.class);
        } else if (this.dataChannel.gg0(C751340Tdc.class) == null) {
            return;
        } else {
            this.LLJILJILJ = new C1111930f2d(Boolean.TRUE.equals(bool));
        }
        C16FJ c16fj = this.LLJLLL;
        if (c16fj != null) {
            c16fj.setContentScrollWhenRefreshDone(true);
            hR(this.LLJILJILJ.LJLIIIL());
            if (C500260Jjc.LJIJI(this.dataChannel)) {
                this.LLJLLL.setOnRefreshListener(this.LLJILJILJ);
            }
        }
        this.LLJILJILJ.LLLZL = recycleSource;
        this.LLJILJILJ.attachView(this);
        this.dataChannel.SX0(C776700UdQ.class, this.LLJILJILJ);
        U1();
        this.LLJJJJJIL = (Room) this.dataChannel.gg0(RoomChannel.class);
        G1();
        b2(0, false);
        M1("onLoad");
        this.dataChannel.FQ2(WidgetReadyEvent.class);
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        C1109770ez9 c1109770ez9 = this.LLJILJILJ.LLLJL;
        AbstractC1111600f26 abstractC1111600f263 = c1112390f3N2.LIZJ;
        if (abstractC1111600f263 != null) {
            abstractC1111600f263.LLILLL = c1109770ez9;
        }
        AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> abstractC1111810f2R = this.LLJLIL;
        abstractC1111810f2R.LIZIZ = c1109770ez9;
        if (this.LLJLILLLLZIIL == null) {
            int iLJIIIIZZ = abstractC1111810f2R.LJIIIIZZ();
            if (LivePublicScreenXmlLayerOptSetting.INSTANCE.enablePreLoadOpt(C500260Jjc.LJJJI(bool))) {
                View viewLJI = C0J3Y.LIZ.LJI(iLJIIIIZZ);
                if (viewLJI == null) {
                    viewLJI = C500260Jjc.LJIILL(iLJIIIIZZ, this.LLJI, false);
                }
                this.LLJI.addView(viewLJI);
                this.LLJLILLLLZIIL = (C1111050f1D) this.LLJLIL.LJIILJJIL(this.LLJI);
            } else {
                C1114110f69.LIZIZ(iLJIIIIZZ);
                this.LLJLILLLLZIIL = (C1111050f1D) this.LLJLIL.LJIILJJIL(C786410Ut5.Sd(iLJIIIIZZ, C786410Ut5.ne(getContext()), this.LLJI));
                C1114110f69.LIZ(iLJIIIIZZ);
            }
        }
        F1(this.LLJI);
        C786410Ut5.U4(this.LLJI, 1.0f);
        InterfaceC1112060f2q interfaceC1112060f2q = this.LLJILJILJ.LLLLIILLL;
        if (interfaceC1112060f2q != null) {
            w10(interfaceC1112060f2q);
        }
        AbstractC1111600f26 abstractC1111600f264 = this.LLJLLIL.LIZJ;
        if (abstractC1111600f264 != null) {
            abstractC1111600f264.LLLIL();
        }
        List<InterfaceC1109090ey3> listIS0 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).IS0();
        if (!listIS0.isEmpty()) {
            for (InterfaceC1109090ey3 interfaceC1109090ey3 : listIS0) {
                if (interfaceC1109090ey3 != null && (abstractC1111600f262 = this.LLJLLIL.LIZJ) != null) {
                    interfaceC1109090ey3.LJ(abstractC1111600f262);
                }
            }
        }
        C1112390f3N c1112390f3N3 = this.LLJLLIL;
        List<InterfaceC1112060f2q> listLIZLLL = this.LLJILJILJ.LLJLL.LIZLLL();
        AbstractC1111600f26 abstractC1111600f265 = c1112390f3N3.LIZJ;
        if (abstractC1111600f265 != null) {
            abstractC1111600f265.LL = listLIZLLL;
        }
        if (this.LLJILJILJ.LLJLL.LJ() > 0) {
            this.LLJJIJIL = true;
        }
        int cacheSize = LivePublicScreenChatHolderCacheConfigSetting.getCacheSize();
        if (cacheSize > 0 && !this.LLJILJILJ.LLLJL.LJI && (abstractC1111600f26 = (c1112390f3N = this.LLJLLIL).LIZJ) != null) {
            c1112390f3N.LIZ.getRecycledViewPool().setMaxRecycledViews(abstractC1111600f26.LLILLJJLI.LIZLLL(AbstractC1110520f0M.class), cacheSize);
        }
        C1112390f3N c1112390f3N4 = this.LLJLLIL;
        c1112390f3N4.getClass();
        c1112390f3N4.LIZIZ(new AwS561S0100000_17(c1112390f3N4, 643));
        C1112390f3N c1112390f3N5 = this.LLJLLIL;
        ARunnableS117S0100000_17 aRunnableS117S0100000_17 = new ARunnableS117S0100000_17(this, 286);
        C781550UlF c781550UlF = c1112390f3N5.LIZ;
        if (c781550UlF != null) {
            HandlerHook.viewPostDelay(c781550UlF, aRunnableS117S0100000_17, 100L);
        }
        LiveInnerDowngradeAdaptExp liveInnerDowngradeAdaptExp = LiveInnerDowngradeAdaptExp.INSTANCE;
        if (liveInnerDowngradeAdaptExp.getExpValue().getEnablePublicScreenAnim()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.PUBLIC_SCREEN_ANIM, new InterfaceC482090IvP() { // from class: X.0f3U
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    PublicScreenWidget publicScreenWidget = this.LIZ;
                    if (((Integer) c0is4.LIZ).intValue() != 0) {
                        publicScreenWidget.a2(null);
                        publicScreenWidget.LLJLLIL.LIZJ();
                        publicScreenWidget.LLJJL = true;
                    } else {
                        publicScreenWidget.a2(publicScreenWidget.LLJZ);
                        publicScreenWidget.LLJJL = false;
                    }
                }
            });
        } else if (ScalableDowngradeSetting.disablePublicScreenAnimAndFadingEdge()) {
            this.dataChannel.EQ2(this, LowDevicePerfScalableChannel.class, new AObjectS360S0100000_17(this, 157));
        }
        C1109770ez9 c1109770ez92 = this.LLJILJILJ.LLLJL;
        if (c1109770ez92 != null && c1109770ez92.LJI) {
            AObjectS360S0100000_17 aObjectS360S0100000_17 = new AObjectS360S0100000_17(this, 158);
            EnumC776080UcQ enumC776080UcQ = EnumC776080UcQ.FADING_EDGE_BLOCK;
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LJ(enumC776080UcQ, false, new AwS618S0100000_4(aObjectS360S0100000_17, 62), 14);
            C775900Uc8.LJ(EnumC776080UcQ.ANIM_BLOCK, false, new AwS618S0100000_4(new AObjectS360S0100000_17(this, 159), 61), 14);
            C775900Uc8.LJ(EnumC776080UcQ.ICON_PRELOAD_BLOCK, false, AFwS301S0000000_17.get$arr$(18), 14);
        }
        if (liveInnerDowngradeAdaptExp.getExpValue().getEnablePublicScreenFadingEdge()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.PUBLIC_SCREEN_FADING_EDGE, new InterfaceC482090IvP() { // from class: X.0eOW
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    if (((Integer) c0is4.LIZ).intValue() != 0) {
                        this.LIZ.X1(false);
                    } else {
                        this.LIZ.X1(true);
                    }
                }
            });
        } else if (ScalableDowngradeSetting.disablePublicScreenFadingEdge()) {
            this.dataChannel.EQ2(this, LowDevicePerfScalableChannel.class, new AObjectS360S0100000_17(this, 161));
        }
        if (this.LLJILJILJ.LLLJL.LJI && LiveHostPerfAutoAdaptiveSetting.enable()) {
            this.dataChannel.BQ2(this, LiveHostAutoAdaptiveChannel.class, new AObjectS360S0100000_17(this, 162));
        }
        if (C500260Jjc.LJJJIL(this.dataChannel)) {
            C1111930f2d c1111930f2d = this.LLJILJILJ;
            Boolean bool2 = Boolean.TRUE;
            if (bool2.equals(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class))) {
                i = 2131853242;
            } else if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable()) {
                i = 2131855371;
            } else {
                i = 2131842611;
            }
            RoomMessage roomMessageLJ = C181500mr.LJ(0L, C497740JfY.LJIJI(i));
            roomMessageLJ.isWelcome = true;
            c1111930f2d.LJLILLLLZI(null, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(roomMessageLJ), true);
            this.LLJILJILJ.LJLILLLLZI(null, ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(C181500mr.LJ(0L, C497740JfY.LJIJI(2131842612))), false);
            if (LiveBroadcastTnsSafetyTools.enableSolutionA() && bool2.equals(this.dataChannel.gg0(C750140Tbg.class))) {
                Fragment fragment = this.widgetCallback.getFragment();
                C1112370f3L c1112370f3L = new C1112370f3L(fragment, this.LLJILJILJ, this.dataChannel);
                if (fragment != null) {
                    fragment.getLifecycle().addObserver(new NewCreatorOnboardingMsg$start$1(c1112370f3L));
                    C786410Ut5.LJLIIL(2000L, c1112370f3L.LIZLLL, c1112370f3L.LJ);
                }
            }
        }
        if (((Boolean.TRUE.equals(bool) && LivePublicScreenShadowOptimizationAnchorSetting.INSTANCE.getValue()) || LivePublicScreenShadowOptimizationSetting.INSTANCE.getValue()) && !L1()) {
            if (this.LLJJJJJIL.getStreamType() == LiveMode.LIVE_STUDIO || this.LLJJJJJIL.getStreamType() == LiveMode.THIRD_PARTY || this.LLJJJJJIL.getStreamType() == LiveMode.SCREEN_RECORD) {
                this.dataChannel.EQ2(this, VideoOrientationChangeChannel.class, new AObjectS360S0100000_17(this, 163));
            }
            this.dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AObjectS360S0100000_17(this, 164));
        }
        this.dataChannel.FQ2(PublicScreenLoadedEvent.class);
        if (getView() != null) {
            C1110810f0p c1110810f0p = C1110810f0p.LIZ;
            DataChannel dataChannel = this.dataChannel;
            View rootView = getView().getRootView();
            c1110810f0p.getClass();
            if (dataChannel != null && rootView != null) {
                C20441214yg.LIZLLL("OperationStateMessageNotifyHandler attach");
                C1110810f0p.LIZJ.put(dataChannel, new WeakReference<>(rootView));
            }
        }
    }

    public void qe1(InterfaceC1112060f2q interfaceC1112060f2q, Object obj) {
        O1(interfaceC1112060f2q, obj);
    }

    @Override // X.InterfaceC1112050f2p
    public final void rm1(C21341918fZ c21341918fZ, List list) {
        a2(null);
        C1112390f3N c1112390f3N = this.LLJLLIL;
        AbstractC1111600f26 abstractC1111600f26 = c1112390f3N.LIZJ;
        if (abstractC1111600f26 != null) {
            abstractC1111600f26.LL = list;
        }
        c1112390f3N.getClass();
        c1112390f3N.LIZIZ(new AwS418S0200000_17(c1112390f3N, c21341918fZ, 130));
        C781550UlF c781550UlF = this.LLJLLIL.LIZ;
        if (c781550UlF != null) {
            c781550UlF.setVerticalFadingEdgeEnabled(false);
        }
        WI0();
    }

    @Override // X.InterfaceC1112050f2p
    public final void s11(int i, Object obj) {
        C1112390f3N c1112390f3N = this.LLJLLIL;
        c1112390f3N.getClass();
        c1112390f3N.LIZIZ(new AwS141S0201000_17(c1112390f3N, i, obj, 3));
        if (EnumC1087130eOd.NORMAL == this.LLJILLL || this.LLJJIII) {
            this.LLJJIII = true;
            WI0();
        }
    }

    @Override // X.InterfaceC1112050f2p
    public final void uH1(InterfaceC1112320f3G interfaceC1112320f3G, boolean z) {
        C472860IgW c472860IgW = this.LLILLL;
        if (c472860IgW != null && c472860IgW.getVisibility() != 8) {
            this.dataChannel.zW(PublicScreenNewMessageVisible.class, Boolean.FALSE);
            C472860IgW c472860IgW2 = this.LLILLL;
            int visibility = c472860IgW2.getVisibility();
            c472860IgW2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c472860IgW2);
        }
        if (this.LLILZIL == null) {
            View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) findViewById(R.id.o_b));
            this.LLILZIL = viewLJLLLL;
            C786410Ut5.LJLLLLLL(4, viewLJLLLL);
        }
        if (this.LLILZIL.getVisibility() != 0) {
            I1();
            C786410Ut5.Pd(this.LLILZLL);
            C786410Ut5.LJLLLLLL(0, this.LLILZIL);
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_mention_remind_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
            c474500IjALIZIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZIZ.LIZ();
        } else if (z) {
            I1();
            if (this.LLIZ == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLILZIL, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                this.LLIZ = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(240L);
                this.LLIZ.addListener(new ALAdapterS13S0100000_17(this, 92));
            }
            ObjectAnimator objectAnimator = this.LLIZLLLIL;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.LLIZLLLIL.removeAllListeners();
                this.LLIZLLLIL.addListener(new ALAdapterS13S0100000_17(this, 10));
            } else if (!this.LLIZ.isRunning()) {
                C786410Ut5.Pd(this.LLIZ);
            }
        }
        C786410Ut5.LJJZZIII(this.LLJJJJLIIL, new ARunnableS117S0100000_17(this, 287));
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 16), this.LLILZIL);
        C1324720kZq c1324720kZq = (C1324720kZq) findViewById(R.id.b_3);
        if (c1324720kZq != null) {
            Drawable drawableLJJLIIIJLLLLLLLZ = interfaceC1112320f3G.LJJLIIIJLLLLLLLZ();
            if (drawableLJJLIIIJLLLLLLLZ != null) {
                c1324720kZq.getLayoutParams().width = (int) C497740JfY.LIZIZ(14.0f);
                c1324720kZq.getLayoutParams().height = (int) C497740JfY.LIZIZ(14.0f);
                c1324720kZq.requestLayout();
                c1324720kZq.setImageDrawable(drawableLJJLIIIJLLLLLLLZ);
                ((TextView) findViewById(R.id.b_9)).setMaxWidth(E1());
                return;
            }
            if (interfaceC1112320f3G.LJJI() != null) {
                C1121670fIL.LJI(interfaceC1112320f3G.LJJI(), c1324720kZq);
                ((TextView) findViewById(R.id.b_9)).setMaxWidth(E1());
                c1324720kZq.getLayoutParams().width = (int) C497740JfY.LIZIZ(16.0f);
                c1324720kZq.getLayoutParams().height = (int) C497740JfY.LIZIZ(16.0f);
                c1324720kZq.requestLayout();
                return;
            }
            User userLJIL = interfaceC1112320f3G.LJIL();
            if (userLJIL == null) {
                return;
            }
            C1121670fIL.LJI(userLJIL.getAvatarThumb(), c1324720kZq);
            ((TextView) findViewById(R.id.b_9)).setMaxWidth(E1());
            c1324720kZq.getLayoutParams().width = (int) C497740JfY.LIZIZ(16.0f);
            c1324720kZq.getLayoutParams().height = (int) C497740JfY.LIZIZ(16.0f);
            c1324720kZq.requestLayout();
        }
    }

    public void cr1(int i, int i2, boolean z) {
        C781550UlF c781550UlF;
        C781550UlF c781550UlF2;
        boolean zLIZ = C468250IXv.LIZ(this.dataChannel);
        C1112390f3N c1112390f3N = this.LLJLLIL;
        c1112390f3N.getClass();
        c1112390f3N.LIZIZ(new AwS44S0102000_17(c1112390f3N, i, i2, 1));
        if (!z) {
            if (!zLIZ) {
                b2(this.LLJJ + i2, false);
            }
        } else {
            this.LLJJI += i2;
            a2(null);
        }
        if (D1() && this.LLJILLL == EnumC1087130eOd.NORMAL && !z && (c781550UlF2 = this.LLJLLIL.LIZ) != null) {
            c781550UlF2.LLJIJIL = true;
        }
        if (this.LLJJ >= 300 && !zLIZ) {
            this.LLJILLL = EnumC1087130eOd.NORMAL;
            b2(0, false);
            Y1();
        }
        if (EnumC1087130eOd.NORMAL == this.LLJILLL || this.LLJJIII) {
            this.LLJJIII = true;
            if (!z) {
                if (this.LLJZ != null && (((c781550UlF = this.LLJLLIL.LIZ) == null || c781550UlF.getItemAnimator() == null) && D1())) {
                    a2(this.LLJZ);
                }
                WI0();
            }
        }
        C1(i2);
    }
}

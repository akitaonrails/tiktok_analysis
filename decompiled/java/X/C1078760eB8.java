package X;

import Y.ARunnableS117S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.WidgetFunctionInfo;
import com.bytedance.android.livesdk.chatroom.ui.widgetload.setting.WidgetPhaseInfo;
import com.bytedance.android.livesdk.dataChannel.ToolbarCanShowEvent;
import com.bytedance.android.livesdk.dataChannel.WidgetLoadChannel;
import com.bytedance.android.livesdk.livesetting.performance.WidgetCustomLoadOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpec;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LayeredElementManager;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0eB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078760eB8 implements InterfaceC1077630e9J {
    public final String LIZ;
    public final C1078060eA0 LIZIZ;
    public final WidgetPhaseInfo LIZJ;
    public final WidgetManager LIZLLL;
    public final LayeredElementManager<?> LJ;
    public final InterfaceC1078780eBA LJFF;
    public final InterfaceC1077860e9g LJI;
    public final InterfaceC1078810eBD LJII;
    public int LJIIIIZZ = -1;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public ElementSpecImpl LJIILL;
    public boolean LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final Object LJIL;
    public final C1078770eB9 LJJ;

    @Override // X.InterfaceC1077630e9J
    public final void LIZ() {
        this.LJIIJJI = true;
        if (this.LJIILIIL) {
            return;
        }
        if (!this.LJIIIZ || this.LJIIL) {
            LJIIIZ();
        }
    }

    public final void LJIIIZ() {
        DataChannel dataChannel;
        this.LJIILIIL = true;
        if (WidgetCustomLoadOptSetting.INSTANCE.enableTogetherShow()) {
            Iterator it2 = ((List) this.LJIJI.getValue()).iterator();
            while (it2.hasNext()) {
                ((Widget) it2.next()).show();
            }
        } else {
            int i = this.LJIIIIZZ;
            if (i != -1 && (dataChannel = this.LIZIZ.LIZJ) != null) {
                dataChannel.zW(WidgetLoadChannel.class, new C1078800eBC(i, true));
            }
        }
        this.LJFF.LIZIZ(this.LIZJ);
        if (LJII().contains("Toolbar")) {
            DataChannel dataChannel2 = this.LIZIZ.LIZJ;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C1082800eHe.class, Boolean.FALSE);
            }
            DataChannel dataChannel3 = this.LIZIZ.LIZJ;
            if (dataChannel3 != null) {
                dataChannel3.FQ2(ToolbarCanShowEvent.class);
            }
        }
    }

    @Override // X.InterfaceC1077630e9J
    public final boolean LIZIZ() {
        return this.LIZJ.runAfterFrameDraw;
    }

    @Override // X.InterfaceC1077630e9J
    public final long LJFF() {
        return this.LIZJ.delayTimes;
    }

    @Override // X.InterfaceC1077630e9J
    public final boolean LJI() {
        return this.LIZJ.loadMode == 1;
    }

    public final List<String> LJII() {
        return (List) this.LJIIZILJ.getValue();
    }

    public final void LJIIJ() {
        if (!((List) this.LJIJ.getValue()).isEmpty() || this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        this.LJFF.LIZLLL(this.LIZJ);
        if (this.LJIILIIL) {
            return;
        }
        if (!this.LJIIJ || this.LJIIJJI) {
            LJIIIZ();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1077630e9J
    public final void load() {
        Long l;
        Room room;
        Room room2;
        Room room3;
        Room room4;
        Room room5;
        Room room6;
        Room room7;
        RecyclableWidgetManager recyclableWidgetManager;
        if (this.LIZIZ.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start load ");
            sbLIZ.append(this.LIZ);
            C20441214yg.LJ("matao-test", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJIILJJIL) {
            return;
        }
        this.LJFF.LIZJ(this.LIZJ);
        this.LJIILJJIL = true;
        WidgetManager widgetManager = this.LIZLLL;
        if ((widgetManager instanceof RecyclableWidgetManager) && (recyclableWidgetManager = (RecyclableWidgetManager) widgetManager) != null) {
            recyclableWidgetManager.addRecyclableWidgetEventListener(this.LJJ);
        }
        if ((this.LJIIIZ || this.LJIIJ) && !WidgetCustomLoadOptSetting.INSTANCE.enableTogetherShow()) {
            int iGenerateViewId = View.generateViewId();
            this.LJIIIIZZ = iGenerateViewId;
            ElementSpecImpl elementSpecImpl = new ElementSpecImpl(iGenerateViewId);
            elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C1078800eBC, WidgetLoadChannel>() { // from class: X.0eBB
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<WidgetLoadChannel> getType() {
                    return WidgetLoadChannel.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1078800eBC c1078800eBC) {
                    ValueAnimator valueAnimatorOfFloat;
                    C1078800eBC c1078800eBC2 = c1078800eBC;
                    int i = c1078800eBC2.LIZ;
                    C1078760eB8 c1078760eB8 = this.LIZ;
                    if (i == c1078760eB8.LJIIIIZZ) {
                        if (c1078760eB8.LIZJ.animateShow == 1) {
                            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.setDuration(200L);
                            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 118));
                            valueAnimatorOfFloat.addListener(new C1078320eAQ() { // from class: X.0eAS
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                }
                            });
                        } else {
                            valueAnimatorOfFloat = null;
                        }
                        if (c1078800eBC2.LIZIZ) {
                            constraintProperty.visibility(0);
                            if (valueAnimatorOfFloat != null) {
                                valueAnimatorOfFloat.start();
                                return;
                            }
                            return;
                        }
                        constraintProperty.visibility(8);
                    }
                }
            });
            this.LJIILL = elementSpecImpl;
            this.LJ.registerGroup(elementSpecImpl);
            DataChannel dataChannel = this.LIZIZ.LIZJ;
            if (dataChannel != null) {
                dataChannel.zW(WidgetLoadChannel.class, new C1078800eBC(this.LJIIIIZZ, false));
            }
            if (this.LIZIZ.LJFF) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append(" will together show");
                C20441214yg.LJ("matao-test", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        for (WidgetFunctionInfo widgetFunctionInfo : this.LIZJ.funcList) {
            if (widgetFunctionInfo.bannedScene != null && (!r0.isEmpty())) {
                C1078060eA0 c1078060eA0 = this.LIZIZ;
                List<String> list = widgetFunctionInfo.bannedScene;
                c1078060eA0.getClass();
                if (list != null && !list.isEmpty()) {
                    for (String str : list) {
                        switch (str.hashCode()) {
                            case -1618089424:
                                if (!str.equals("video_live") || (room = c1078060eA0.LIZIZ) == null || !C781520UlC.LJIIL(room)) {
                                }
                                break;
                            case -1363386321:
                                if (!str.equals("programme_live") || !((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1()) {
                                }
                                break;
                            case -1336380852:
                                if (!str.equals("screen_share") || (room2 = c1078060eA0.LIZIZ) == null || !C781520UlC.LJII(room2)) {
                                }
                                break;
                            case -1035774839:
                                if (!str.equals("live_studio") || (room3 = c1078060eA0.LIZIZ) == null || !C781520UlC.LIZLLL(room3)) {
                                }
                                break;
                            case -871980573:
                                if (str.equals("official_activity")) {
                                    Room room8 = c1078060eA0.LIZIZ;
                                    if ((room8 != null ? room8.getStreamType() : null) == LiveMode.OFFICIAL_ACTIVITY) {
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 108103:
                                if (!str.equals("mic") || !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS()) {
                                }
                                break;
                            case 3165170:
                                if (!str.equals("game") || (room4 = c1078060eA0.LIZIZ) == null || !C781520UlC.LIZIZ(room4)) {
                                }
                                break;
                            case 93166550:
                                if (str.equals("audio")) {
                                    Room room9 = c1078060eA0.LIZIZ;
                                    if ((room9 != null ? room9.getStreamType() : null) == LiveMode.AUDIO) {
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 439491086:
                                if (!str.equals("third_party") || (room5 = c1078060eA0.LIZIZ) == null || !C781520UlC.LJIIJ(room5)) {
                                }
                                break;
                            case 1115078005:
                                if (!str.equals("e_commerce") || (room6 = c1078060eA0.LIZIZ) == null || !C00FN.LIZJ(room6)) {
                                }
                                break;
                            case 1216123935:
                                if (!str.equals("live_voice") || (room7 = c1078060eA0.LIZIZ) == null || !C781520UlC.LJFF(room7)) {
                                }
                                break;
                        }
                    }
                }
            }
            LJII().add(widgetFunctionInfo.funcName);
            Map<String, ? extends Map<String, Long>> map = this.LIZJ.componentDelay;
            Map<String, Long> map2 = map != null ? map.get("android") : null;
            long jLongValue = (map2 == null || (l = map2.get(widgetFunctionInfo.funcName)) == null) ? 0L : l.longValue();
            AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(this, widgetFunctionInfo, 107);
            if (jLongValue <= 0) {
                awS418S0200000_17.invoke();
            } else {
                C08D5.LIZIZ((Handler) this.LJIJJ.getValue(), new ARunnableS117S0100000_17(awS418S0200000_17, 258), this.LJIL, jLongValue);
            }
        }
        this.LJIILLIIL = true;
        LJIIJ();
        if (this.LIZIZ.LJFF) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LIZ);
            sbLIZ3.append(" load ");
            sbLIZ3.append(LJII());
            C20441214yg.LJ("matao-test", C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LJFF.LIZ(this.LIZJ);
    }

    @Override // X.InterfaceC1077630e9J
    public final void release() {
        RecyclableWidgetManager recyclableWidgetManager;
        ((Handler) this.LJIJJ.getValue()).removeCallbacksAndMessages(this.LJIL);
        WidgetManager widgetManager = this.LIZLLL;
        if ((widgetManager instanceof RecyclableWidgetManager) && (recyclableWidgetManager = (RecyclableWidgetManager) widgetManager) != null) {
            recyclableWidgetManager.removeRecyclableWidgetEventListener(this.LJJ);
        }
        if (WidgetCustomLoadOptSetting.INSTANCE.enableTogetherShow()) {
            ((List) this.LJIJI.getValue()).clear();
        } else {
            this.LJ.unregisterGroup(this.LJIILL, (List) this.LJIJJLI.getValue());
            ((List) this.LJIJJLI.getValue()).clear();
            this.LJIIIIZZ = -1;
            this.LJIILL = null;
        }
        LJII().clear();
        ((List) this.LJIJ.getValue()).clear();
    }

    @Override // X.InterfaceC1077630e9J
    public final boolean LIZJ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1077630e9J
    public final boolean LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1077630e9J
    public final boolean LJ() {
        return this.LJIIJ;
    }

    public final void LJIIIIZZ(Widget widget) {
        String landscapeWidgetFunction;
        DataChannel dataChannel;
        if (this.LJIILLIIL) {
            return;
        }
        if (this.LIZIZ.LIZLLL) {
            InterfaceC1078810eBD interfaceC1078810eBD = this.LJII;
            if (interfaceC1078810eBD != null) {
                landscapeWidgetFunction = interfaceC1078810eBD.getPortraitWidgetFunction(widget.getClass().getSimpleName());
            } else {
                return;
            }
        } else {
            InterfaceC1078810eBD interfaceC1078810eBD2 = this.LJII;
            if (interfaceC1078810eBD2 != null) {
                landscapeWidgetFunction = interfaceC1078810eBD2.getLandscapeWidgetFunction(widget.getClass().getSimpleName());
            } else {
                return;
            }
        }
        if (landscapeWidgetFunction != null) {
            if (LJII().contains(landscapeWidgetFunction)) {
                ((List) this.LJIJ.getValue()).add(widget.getClass().getSimpleName());
            }
            if (LJII().contains("Toolbar") && (dataChannel = this.LIZIZ.LIZJ) != null) {
                dataChannel.SX0(C1082800eHe.class, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0eB9] */
    public C1078760eB8(String str, C1078060eA0 c1078060eA0, WidgetPhaseInfo widgetPhaseInfo, WidgetManager widgetManager, LayeredElementManager layeredElementManager, C1077590e9F c1077590e9F, InterfaceC1077860e9g interfaceC1077860e9g, InterfaceC1078810eBD interfaceC1078810eBD) {
        this.LIZ = str;
        this.LIZIZ = c1078060eA0;
        this.LIZJ = widgetPhaseInfo;
        this.LIZLLL = widgetManager;
        this.LJ = layeredElementManager;
        this.LJFF = c1077590e9F;
        this.LJI = interfaceC1077860e9g;
        this.LJII = interfaceC1078810eBD;
        this.LJIIIZ = widgetPhaseInfo.showStrategy == 1;
        this.LJIIJ = widgetPhaseInfo.waitLastPhaseShow;
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1269));
        this.LJIJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1270));
        this.LJIJI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(298));
        this.LJIJJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(590));
        this.LJIJJLI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(297));
        this.LJIL = new Object();
        this.LJJ = new RecyclableWidgetEventListener() { // from class: X.0eB9
            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJFF(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJ(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIJJI(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                C1078300eAO.LJIIL(this, c0ulm, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onPostCreate(C0ULM c0ulm, Widget widget) {
                if (((List) this.LIZ.LJIJ.getValue()).contains(widget.getClass().getSimpleName())) {
                    C1078760eB8 c1078760eB8 = this.LIZ;
                    if (!c1078760eB8.LJIILIIL) {
                        WidgetPhaseInfo widgetPhaseInfo2 = c1078760eB8.LIZJ;
                        if (widgetPhaseInfo2.showStrategy == 1 || widgetPhaseInfo2.waitLastPhaseShow) {
                            if (WidgetCustomLoadOptSetting.INSTANCE.enableTogetherShow()) {
                                widget.hide();
                                ((List) this.LIZ.LJIJI.getValue()).add(widget);
                            } else {
                                ElementSpec elementById = this.LIZ.LJ.getElementById(widget.getId());
                                if (elementById != null) {
                                    C1078760eB8 c1078760eB82 = this.LIZ;
                                    c1078760eB82.LJ.bindGroup(elementById, c1078760eB82.LJIIIIZZ);
                                    ((List) c1078760eB82.LJIJJLI.getValue()).add(elementById);
                                }
                            }
                        }
                        ((List) this.LIZ.LJIJ.getValue()).remove(widget.getClass().getSimpleName());
                        C1078760eB8 c1078760eB83 = this.LIZ;
                        if (!c1078760eB83.LJIILLIIL) {
                            return;
                        }
                        c1078760eB83.LJIIJ();
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onHide(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPostDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreate(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreCreateView(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onPreDestroy(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final /* bridge */ /* synthetic */ void onShow(C0ULM c0ulm, Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onWidgetPreRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
                C1078760eB8 c1078760eB8 = this.LIZ;
                if (c1078760eB8.LIZLLL.mEnableScatterLoad) {
                    c1078760eB8.LJIIIIZZ(widget);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
            public final void onWidgetRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
                C1078760eB8 c1078760eB8 = this.LIZ;
                if (c1078760eB8.LIZLLL.mEnableScatterLoad) {
                    return;
                }
                c1078760eB8.LJIIIIZZ(widget);
            }
        };
    }
}

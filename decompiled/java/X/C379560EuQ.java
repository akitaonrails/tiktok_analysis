package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS38S0300000_5;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EuQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379560EuQ extends AbstractC2255721DQs<InterfaceC372680EjK> implements InterfaceC372680EjK, InterfaceC379610EuV {
    public static final C379600EuU LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C1DRG LL;
    public final C1455260nyO LLILLJJLI;
    public InterfaceC377480Er4 LLILZIL;
    public C0EVQ LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C379550EuP LLJLILLLLZIIL;
    public final GestureInteractItem LLJLL;
    public final C01GW LLJLLIL;
    public final InterfaceC372680EjK LLILLL = this;
    public final C560530Lyd<Unit> LLILZ = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1452130ntL.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC377540ErA.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459560o5K.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC379590EuT.class, null);
    public final C01GW LLJILJILJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS549S0100000_5((InterfaceC379610EuV) this, 946));
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), VideoEditContainerScene.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1414530muh.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EQY.class, null);
    public final Handler LLJJIJIL = new BPEAHandler(Looper.getMainLooper());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 945));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 944));

    @Override // X.InterfaceC372680EjK
    public void QT1() {
        this.LLJJJIL = false;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0EuU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C379560EuQ.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C379560EuQ.class, "gestureComponent", "getGestureComponent()Lcom/ss/android/ugc/gamora/editor/gesture/EditGestureApi;", 0), new C2217381BqS(C379560EuQ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C379560EuQ.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C379560EuQ.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0), new C2217381BqS(C379560EuQ.class, "recommendEffectApi", "getRecommendEffectApi()Lcom/ss/android/ugc/gamora/editor/recommendeffect/RecommendEffectApi;", 0), new C2217381BqS(C379560EuQ.class, "templatePreProcessApi", "getTemplatePreProcessApi()Lcom/ss/android/ugc/gamora/ugctemplate/TemplatePreProcessApi;", 0), new C2217381BqS(C379560EuQ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C379560EuQ.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C379560EuQ.class, "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoEditContainerScene;", 0), new C2217381BqS(C379560EuQ.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0), new C2217381BqS(C379560EuQ.class, "mixEditingMaterialApi", "getMixEditingMaterialApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0), new C2217381BqS(C379560EuQ.class, "video2ImageApi", "getVideo2ImageApi()Lcom/ss/android/ugc/aweme/image/switchmode/separate/Video2ImageSwitchWithoutMixEditingApi;", 0)};
        LLJLLL = new Object() { // from class: X.0EuU
        };
        LLJZIJLIL = 8;
    }

    private final C0EQY H3() {
        return (C0EQY) this.LLJJIJIIJIL.getValue(this, LLJZ[12]);
    }

    private final C0EOK T2() {
        return (C0EOK) this.LLJI.getValue(this, LLJZ[4]);
    }

    private final InterfaceC1455850nzL Z1() {
        return (InterfaceC1455850nzL) this.LLJJ.getValue(this, LLJZ[8]);
    }

    private final InterfaceC1461390o8H c3() {
        return (InterfaceC1461390o8H) this.LLILZLL.getValue(this, LLJZ[0]);
    }

    private final InterfaceC1414530muh i3() {
        return (InterfaceC1414530muh) this.LLJJIJI.getValue(this, LLJZ[11]);
    }

    public final C379570EuR B3() {
        return (C379570EuR) this.LLJLLIL.getValue();
    }

    public final InterfaceC379590EuT E3() {
        return (InterfaceC379590EuT) this.LLJILJIL.getValue(this, LLJZ[6]);
    }

    public final InterfaceC1460000o62 G2() {
        return (InterfaceC1460000o62) this.LLJILJILJ.getValue();
    }

    public final InterfaceC377540ErA H2() {
        return (InterfaceC377540ErA) this.LLJ.getValue(this, LLJZ[3]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLIZLLLIL.getValue(this, LLJZ[2]);
    }

    public final VideoEditContainerScene O3() {
        return (VideoEditContainerScene) this.LLJJI.getValue(this, LLJZ[9]);
    }

    public final C377510Er7 W1() {
        return (C377510Er7) this.LLJLIL.getValue();
    }

    public final InterfaceC1452130ntL W2() {
        return (InterfaceC1452130ntL) this.LLIZ.getValue(this, LLJZ[1]);
    }

    @Override // X.InterfaceC372680EjK
    public void Yg0() {
        C0EVQ c0evq = this.LLJJJ;
        if (c0evq != null) {
            c0evq.LLILLL.cancel();
            int visibility = c0evq.getVisibility();
            c0evq.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0evq);
        }
    }

    @Override // X.InterfaceC372680EjK
    public boolean lu() {
        return this.LLJJJJ || this.LLJJJJJIL;
    }

    public final VideoPublishEditModel m3() {
        return (VideoPublishEditModel) this.LLJILLL.getValue(this, LLJZ[7]);
    }

    public final List<View> o2() {
        return (List) this.LLJL.getValue();
    }

    public final void o4() {
        if (this.LLJJJJLIIL) {
            return;
        }
        if (!C363750ENx.LIZIZ("has_show_slide_guide_v2")) {
            C363750ENx.LJ("has_show_slide_guide_v2");
        }
        this.LLJJJJLIIL = true;
    }

    @Override // X.InterfaceC372680EjK
    public ViewGroup rs0() {
        return (ViewGroup) this.LLILLJJLI.findViewById(R.id.ma9);
    }

    public final InterfaceC1459560o5K v3() {
        return (InterfaceC1459560o5K) this.LLJIJIL.getValue(this, LLJZ[5]);
    }

    public final InterfaceC1453430nvR w2() {
        return (InterfaceC1453430nvR) this.LLJJIII.getValue(this, LLJZ[10]);
    }

    public final boolean Q3() {
        return m3().getEditorProModel().isAdvancedEdit();
    }

    public final void e4() {
        InterfaceC1414530muh interfaceC1414530muhI3 = i3();
        if (interfaceC1414530muhI3 != null) {
            interfaceC1414530muhI3.be(false);
        }
        C0EQY c0eqyH3 = H3();
        if (c0eqyH3 != null) {
            c0eqyH3.be(false);
        }
        System.currentTimeMillis();
        C1455260nyO.w(this.LLILLJJLI, false, false, true, false, false, false, true, null, 312);
        System.currentTimeMillis();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        c3().LIZIZ(this.LLJLL);
        this.LLILZIL = H2().b72();
        this.LLJJLIIIJLLLLLLLZ = ((Boolean) C0B90.LIZ.getValue()).booleanValue();
        ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1460000o62.class, new AwS584S0100000_5(this, 790));
        JY0().Yh().observe(this, new AObserverS209S0100000_5(this, 117));
        JY0().ww2().observe(this, new AObserverS209S0100000_5(this, 118));
        Z1().AT().LIZ(this, new AObjectS240S0100000_5(this, 147));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIJIL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC372680EjK
    public boolean Rh1() {
        return this.LLJJJIL;
    }

    public InterfaceC372680EjK X1() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC372680EjK
    public /* bridge */ /* synthetic */ LiveEvent gK1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C560530Lyd<Unit> q3() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC372680EjK
    public void pk1(boolean z) {
        ViewGroup viewGroupRs0;
        C1DRG c1drgLJIIIZ;
        InterfaceC379580EuS interfaceC379580EuS;
        ViewGroup.MarginLayoutParams marginLayoutParamsZN1;
        if ((!H2().Xc2() || z) && (viewGroupRs0 = rs0()) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParamsEj = JY0().ej();
            int height = ((viewGroupRs0.getHeight() - marginLayoutParamsEj.height) - marginLayoutParamsEj.topMargin) + C354870Dvh.LIZ(28);
            if (height < C354870Dvh.LIZ(48)) {
                height = C354870Dvh.LIZ(60);
            }
            C1462070o9N c1462070o9NLLLLLJIL = this.LLILLJJLI.LLLLLJIL();
            if (c1462070o9NLLLLLJIL != null && (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1462070o9NLLLLLJIL)) != null && (interfaceC379580EuS = (InterfaceC379580EuS) c1drgLJIIIZ.LJIIL(null, InterfaceC379580EuS.class)) != null && (marginLayoutParamsZN1 = interfaceC379580EuS.zN1()) != null) {
                height = C354870Dvh.LIZ(24) + marginLayoutParamsZN1.bottomMargin + marginLayoutParamsZN1.height;
            }
            C0EVQ c0evq = new C0EVQ(this.LLILLJJLI.requireSceneContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.bottomMargin = height;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0evq);
            c0evq.setLayoutParams(layoutParams);
            viewGroupRs0.addView(c0evq);
            int visibility = c0evq.getVisibility();
            c0evq.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c0evq);
            C786410Ut5.Pd(c0evq.LLILLL);
            this.LLJJJ = c0evq;
            this.LLJJJIL = true;
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJJIJIL, new ARunnableS38S0300000_5(c0evq, viewGroupRs0, this, 4));
            VideoPublishEditModel videoPublishEditModelM3 = m3();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", videoPublishEditModelM3.mShootWay);
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelM3));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelM3));
            c0lab.LJ("creation_id", videoPublishEditModelM3.getCreationId());
            C20684815ws.LJIILLIIL("show_slide_enter_ep_hint", c0lab.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0EuP, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener] */
    public C379560EuQ(C1DRG c1drg, C1455260nyO c1455260nyO) {
        this.LL = c1drg;
        this.LLILLJJLI = c1455260nyO;
        ?? r2 = new C0FUM() { // from class: X.0EuP
            public boolean LL;
            public boolean LLILLJJLI;
            public float LLILLL;
            public float LLILZ;
            public float LLILZIL;
            public VelocityTracker LLILZLL;
            public boolean LLIZ;
            public boolean LLIZLLLIL;
            public float LLJ;
            public final int LLJI;
            public final int LLJIJIL;
            public final int LLJILJIL;
            public boolean LLJILJILJ = true;

            {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(this.LLJILLL.LLILLJJLI.requireSceneContext());
                this.LLJI = viewConfiguration.getScaledMinimumFlingVelocity();
                this.LLJIJIL = viewConfiguration.getScaledMaximumFlingVelocity();
                this.LLJILJIL = viewConfiguration.getScaledTouchSlop();
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onDown(android.view.MotionEvent r4) {
                /*
                    Method dump skipped, instruction units count: 258
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C379550EuP.onDown(android.view.MotionEvent):boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onUp(android.view.MotionEvent r9) {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C379550EuP.onUp(android.view.MotionEvent):boolean");
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (this.LLILLJJLI && !this.LLJILJILJ) {
                    InterfaceC1459560o5K interfaceC1459560o5KV3 = this.LLJILLL.v3();
                    if (interfaceC1459560o5KV3 != null) {
                        interfaceC1459560o5KV3.Rr1(true);
                    }
                    return this.LLILLJJLI;
                }
                return false;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                VelocityTracker velocityTracker;
                C348100Dkm c348100DkmLIZIZ;
                NLEEditor nLEEditor;
                NLEModel model;
                Object c098200Yq;
                float fFloatValue;
                int i;
                Integer numValueOf;
                Integer numLIZJ;
                boolean z;
                if (this.LLJILJILJ) {
                    return false;
                }
                if (Intrinsics.LJFF(this.LLJILLL.w2().kJ0().getValue(), Boolean.TRUE)) {
                    this.LLJILJILJ = true;
                    return false;
                }
                if (!this.LLILLJJLI) {
                    if (f2 < 0.0f) {
                        return false;
                    }
                    this.LLILLL += f2;
                    if (Math.abs(f2) > Math.abs(f) && this.LLILLL > this.LLJILJIL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLILLJJLI = z;
                }
                if (!this.LLILLJJLI) {
                    return false;
                }
                if (!this.LL) {
                    this.LLIZLLLIL = true;
                    C1456220nzw c1456220nzwLLLLZLL = this.LLJILLL.LLILLJJLI.LLLLZLL(false);
                    this.LLJILLL.o4();
                    if (c1456220nzwLLLLZLL.LIZ) {
                        this.LLJILLL.LLILZ.LJIIJ(Unit.LIZ);
                        C1455260nyO.LLLLZIL(this.LLJILLL.LLILLJJLI, false, false, c1456220nzwLLLLZLL, null, null, 50);
                        this.LLJILJILJ = true;
                        return false;
                    }
                    InterfaceC1452170ntP value = this.LLJILLL.JY0().g().getValue();
                    if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null && (model = nLEEditor.getModel()) != null && model.getMainTrack() != null) {
                        C1458390o3R.LIZ.getClass();
                        C1458390o3R.LJJIIJZLJL(15);
                        this.LLJILLL.e4();
                        this.LLIZ = true;
                        this.LLJILLL.H2().uj2();
                        C0EVQ c0evq = this.LLJILLL.LLJJJ;
                        if (c0evq != null) {
                            c0evq.LLILLL.cancel();
                            int visibility = c0evq.getVisibility();
                            c0evq.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility, 8, c0evq);
                        }
                        this.LLILZ = 0.0f;
                        this.LLILZIL = 0.0f;
                        this.LLJILLL.LLJJJJJIL = true;
                        VelocityTracker velocityTrackerObtain = this.LLILZLL;
                        if (velocityTrackerObtain == null) {
                            velocityTrackerObtain = VelocityTracker.obtain();
                        }
                        this.LLILZLL = velocityTrackerObtain;
                        if (velocityTrackerObtain != null) {
                            velocityTrackerObtain.clear();
                        }
                        C379560EuQ c379560EuQ = this.LLJILLL;
                        c379560EuQ.LLJLL.LLILZIL = true;
                        InterfaceC1459560o5K interfaceC1459560o5KV3 = c379560EuQ.v3();
                        if (interfaceC1459560o5KV3 != null) {
                            interfaceC1459560o5KV3.Rr1(false);
                        }
                        C372180EiW c372180EiWHk2 = this.LLJILLL.H2().hk2();
                        C379560EuQ c379560EuQ2 = this.LLJILLL;
                        int iVF0 = c379560EuQ2.JY0().VF0();
                        int i2 = c379560EuQ2.JY0().ej().topMargin;
                        if (iVF0 != 0) {
                            this.LLILZIL = (i2 + iVF0) - (c372180EiWHk2.LIZIZ + c372180EiWHk2.LIZ);
                        }
                        C377510Er7 c377510Er7W1 = c379560EuQ2.W1();
                        SurfaceView value2 = c379560EuQ2.JY0().ge().getValue();
                        C372830EjZ c372830EjZYh0 = c379560EuQ2.H2().Yh0();
                        List<View> listO2 = c379560EuQ2.o2();
                        c377510Er7W1.LJFF = value2;
                        c377510Er7W1.LJI = c372830EjZYh0;
                        c377510Er7W1.LJ = listO2;
                        c377510Er7W1.LJII = null;
                        c377510Er7W1.LJIIIIZZ = null;
                        int iLIZ = C0EGL.LIZ();
                        Context contextLIZIZ = C545820Lau.LIZIZ(c379560EuQ2.LLILLJJLI);
                        if (contextLIZIZ != null && (numLIZJ = C1308910kAL.LIZJ(iLIZ, contextLIZIZ)) != null) {
                            int iIntValue = numLIZJ.intValue();
                            VideoEditContainerScene videoEditContainerSceneO3 = c379560EuQ2.O3();
                            if (videoEditContainerSceneO3 != null) {
                                videoEditContainerSceneO3.LLLLLLIL(iIntValue);
                            }
                        }
                        C372830EjZ c372830EjZYh02 = c379560EuQ2.H2().Yh0();
                        if (c372830EjZYh02 != null) {
                            C377510Er7 c377510Er7W12 = c379560EuQ2.W1();
                            int i3 = c372180EiWHk2.LIZIZ;
                            int i4 = c372180EiWHk2.LIZ;
                            InterfaceC1446740nke interfaceC1446740nkeJY0 = c379560EuQ2.JY0();
                            c377510Er7W12.getClass();
                            int iK52 = interfaceC1446740nkeJY0.k52();
                            if (iK52 < 1) {
                                iK52 = 1;
                            }
                            int iVF02 = interfaceC1446740nkeJY0.VF0();
                            if (iVF02 < 1) {
                                iVF02 = 1;
                            }
                            float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(C301770BsF.LIZ()));
                            try {
                                c098200Yq = Float.valueOf(iK52 / iVF02);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            Float f3 = (Float) c098200Yq;
                            if (f3 != null) {
                                fFloatValue = f3.floatValue();
                            } else {
                                fFloatValue = 1.0f;
                            }
                            int[] iArr = new int[2];
                            SurfaceView value3 = interfaceC1446740nkeJY0.ge().getValue();
                            if (value3 != null) {
                                value3.getLocationOnScreen(iArr);
                            }
                            float f4 = i3;
                            float f5 = fFloatValue * f4;
                            float f6 = f4 / iVF02;
                            float f7 = f5 / iK52;
                            C0ET3.LIZ.getClass();
                            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ep_caption_panel_in_editing", true) != 0 && C295900Bim.LIZ() && C338630DPh.LIZ()) {
                                ViewGroup.MarginLayoutParams marginLayoutParamsEj = interfaceC1446740nkeJY0.ej();
                                if ((marginLayoutParamsEj instanceof ViewGroup.MarginLayoutParams) && marginLayoutParamsEj != null) {
                                    i = marginLayoutParamsEj.topMargin;
                                } else {
                                    i = iArr[1];
                                }
                            } else {
                                i = iArr[1];
                            }
                            float f8 = (((iVF02 - i3) / 2.0f) + i) - i4;
                            c377510Er7W12.LIZLLL = 0.0f;
                            int i5 = c372830EjZYh02.getControlLayout().getLayoutParams().height;
                            ViewGroup.MarginLayoutParams marginLayoutParamsEj2 = interfaceC1446740nkeJY0.ej();
                            if ((marginLayoutParamsEj2 instanceof ViewGroup.MarginLayoutParams) && marginLayoutParamsEj2 != null) {
                                numValueOf = Integer.valueOf(marginLayoutParamsEj2.topMargin);
                            } else {
                                numValueOf = null;
                            }
                            C563650M8t c563650M8t = C563650M8t.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("resetParam SlideData surfaceViewHeight:");
                            sbLIZ.append(iVF02);
                            sbLIZ.append(" videoHeight: ");
                            sbLIZ.append(i3);
                            sbLIZ.append(" locationOnsen[1] ");
                            sbLIZ.append(iArr[1]);
                            sbLIZ.append(" topToWindow:");
                            sbLIZ.append(i4);
                            sbLIZ.append(" controlOffset:");
                            sbLIZ.append(i5);
                            sbLIZ.append(" surfaceViewMarginTop");
                            sbLIZ.append(numValueOf);
                            C201955140j.LIZLLL(c563650M8t, "SlideAnimHelper", C2188811AlT.LIZIZ(sbLIZ));
                            float f9 = i5;
                            c377510Er7W12.LIZJ = new C377520Er8(new Pair(Float.valueOf(1.0f), Float.valueOf(f7)), new Pair(Float.valueOf(1.0f), Float.valueOf(f6)), new Pair(Float.valueOf(0.0f), Float.valueOf(-f8)), new Pair(Float.valueOf(f9), Float.valueOf(0.0f)), new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f)), new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f)), new Pair(Float.valueOf(fLIZIZ), Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(20.0f)))));
                            C372830EjZ c372830EjZ = c377510Er7W12.LJI;
                            if (c372830EjZ != null) {
                                C786410Ut5.ed(c372830EjZ.getControlLayout(), f9);
                                FrameLayout grabberView = c372830EjZ.getGrabberView();
                                if (grabberView != null) {
                                    C786410Ut5.fd(grabberView, f9);
                                }
                                C372820EjY.LIZJ(c372830EjZ, 0.0f);
                            }
                        }
                        c379560EuQ2.W2().aB1(false);
                        InterfaceC377480Er4 interfaceC377480Er4 = c379560EuQ2.LLILZIL;
                        if (interfaceC377480Er4 != null) {
                            interfaceC377480Er4.LIZIZ(EnumC377550ErB.SLIDE_IN);
                        }
                        this.LL = true;
                        return this.LLILLJJLI;
                    }
                    this.LLJILJILJ = true;
                    return false;
                }
                if (motionEvent2 != null && (velocityTracker = this.LLILZLL) != null) {
                    velocityTracker.addMovement(motionEvent2);
                }
                this.LLJ += Math.abs(f2);
                if (f2 > 100.0f) {
                    return this.LLILLJJLI;
                }
                float fMax = Math.max(0.0f, Math.min(this.LLILZ + f2, this.LLILZIL));
                float f10 = this.LLILZ;
                float f11 = this.LLILZIL;
                if (f10 >= f11 && fMax >= f11) {
                    return this.LLILLJJLI;
                }
                this.LLILZ = fMax;
                if (this.LLIZLLLIL) {
                    this.LLJILLL.H2().Q70();
                    this.LLIZLLLIL = false;
                }
                this.LLJILLL.W1().LIZLLL(this.LLILZ / this.LLILZIL);
                return this.LLILLJJLI;
            }
        };
        this.LLJLILLLLZIIL = r2;
        this.LLJLL = new GestureInteractItem(0, r2);
        this.LLJLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 947));
    }
}

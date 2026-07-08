package X;

import Y.ACListenerS140S0100000_5;
import Y.ALAdapterS2S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS8S0210000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import avg.f;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0Ekr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373630Ekr extends AbstractC381020Ewm<C0EFV> implements C0EFV, InterfaceC379610EuV {
    public static final C373690Ekx LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final C372830EjZ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public C373660Eku LLIZLLLIL;
    public boolean LLJ;
    public final Handler LLJI;
    public Boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public final C0EGA LLJJ;
    public final C354000DuI LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C0EIE LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Ekx] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C373630Ekr.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C373630Ekr.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0)};
        LLJJIJIL = new Object() { // from class: X.0Ekx
        };
        LLJJJIL = 8;
    }

    @Override // X.C0EFV, X.C0EIO
    public boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        return false;
    }

    @Override // X.C0EFV, X.C0EIO
    public boolean LLJJ() {
        return false;
    }

    @Override // X.C0EFV, X.C0EIO
    public boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EFV, X.C0EIO
    public boolean LLLZZIL(List<String> list) {
        return false;
    }

    public C0EFV Z1() {
        return this;
    }

    @Override // X.C0EFV
    public void hg() {
    }

    private final Observer<Long> G2() {
        return (Observer) this.LLJILLL.getValue();
    }

    private final Observer<C0E5A> H2() {
        return (Observer) this.LLJJIII.getValue();
    }

    private final C0E5S T2() {
        return (C0E5S) this.LLIZ.getValue(this, LLJJJ[1]);
    }

    private final void c3() {
        ViewGroup viewGroup;
        if (this.LLIZLLLIL != null) {
            return;
        }
        C373660Eku c373660Eku = new C373660Eku(this.LLILZ.requireSceneContext());
        c373660Eku.setId(R.id.f7q);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c373660Eku);
        c373660Eku.setLayoutParams(layoutParams);
        View.OnClickListener aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(this, 104);
        if (C1848410yCV.LIZ) {
            aCListenerS140S0100000_5 = new f(aCListenerS140S0100000_5);
        }
        a aVar = new a(aCListenerS140S0100000_5);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c373660Eku);
        }
        c373660Eku.setOnClickListener(aVar);
        this.LLIZLLLIL = c373660Eku;
        View view = this.LLILZ.mView;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        viewGroup.addView(c373660Eku);
    }

    private final boolean i3() {
        return C351230Dpp.LIZIZ() && !C363750ENx.LIZIZ("keyframe_guide_show");
    }

    private final InterfaceC1737690vJv w2() {
        return (InterfaceC1737690vJv) this.LLJJIJI.getValue();
    }

    @Override // X.C0EFV
    public boolean L5() {
        return (this.LLIZLLLIL == null || this.LLJ) ? false : true;
    }

    public final VideoPublishEditModel LJJJLIIL() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        EditModelProvider editModelProvider = (EditModelProvider) C364210EPr.LIZLLL(EditModelProvider.class);
        if (editModelProvider != null) {
            return editModelProvider.getEditModel();
        }
        return null;
    }

    public final void O3() {
        View previewLayout;
        View viewXg;
        C368680Ecs c368680Ecs;
        MutableLiveData mutableLiveDataLIZ;
        this.LLJI.removeCallbacksAndMessages(null);
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (mutableLiveDataLIZ = c0e48W1.S7().LIZ("video_position_event")) != null) {
            mutableLiveDataLIZ.removeObserver(G2());
        }
        C372830EjZ c372830EjZ = this.LLILZIL;
        if (c372830EjZ == null || (previewLayout = c372830EjZ.getPreviewLayout()) == null || (viewXg = T2().xg()) == null || (c368680Ecs = (C368680Ecs) viewXg.findViewById(R.id.u2j)) == null) {
            return;
        }
        C373660Eku c373660Eku = this.LLIZLLLIL;
        if (c373660Eku != null) {
            c373660Eku.setPinchGestureMask(previewLayout);
        }
        c368680Ecs.LLJILJIL.remove(this.LLJJ);
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            C361680EFy.LJJLI(2, videoPublishEditModelLJJJLIIL, W1());
        }
        C0E48 c0e48W12 = W1();
        if (c0e48W12 != null) {
            c0e48W12.fj(this.LLJJI);
        }
        C786410Ut5.LJLIIL(3000L, this.LLJI, new ARunnableS105S0100000_5(this, 71));
    }

    public final void Q3() {
        C368010Ebn c368010Ebn;
        C368220Ec8 selectTrackItem;
        View viewXg;
        C368680Ecs c368680Ecs;
        MutableLiveData mutableLiveDataLIZ;
        this.LLJI.removeCallbacksAndMessages(null);
        View viewXg2 = T2().xg();
        if (viewXg2 == null || (c368010Ebn = (C368010Ebn) viewXg2.findViewById(R.id.onq)) == null || (selectTrackItem = c368010Ebn.getSelectTrackItem()) == null || (viewXg = T2().xg()) == null || (c368680Ecs = (C368680Ecs) viewXg.findViewById(R.id.u2j)) == null) {
            return;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (mutableLiveDataLIZ = c0e48W1.S7().LIZ("video_position_event")) != null) {
            mutableLiveDataLIZ.observe(this, G2());
        }
        C373660Eku c373660Eku = this.LLIZLLLIL;
        if (c373660Eku != null) {
            c373660Eku.LIZJ(selectTrackItem, c368680Ecs);
        }
        c368680Ecs.LLJILJIL.add(this.LLJJ);
        C786410Ut5.LJLIIL(3000L, this.LLJI, new ARunnableS105S0100000_5(this, 72));
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            C361680EFy.LJJLI(1, videoPublishEditModelLJJJLIIL, W1());
        }
    }

    public final void X1() {
        C368680Ecs c368680Ecs;
        MutableLiveData mutableLiveDataLIZ;
        MutableLiveData mutableLiveDataLIZ2;
        if (this.LLIZLLLIL == null || this.LLJ) {
            return;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.Ej(this.LLJJI);
        }
        C0E48 c0e48W12 = W1();
        if (c0e48W12 != null && (mutableLiveDataLIZ2 = c0e48W12.S7().LIZ("video_position_event")) != null) {
            mutableLiveDataLIZ2.removeObserver(G2());
        }
        C0E48 c0e48W13 = W1();
        if (c0e48W13 != null && (mutableLiveDataLIZ = c0e48W13.S7().LIZ("select_slot_fake")) != null) {
            mutableLiveDataLIZ.removeObserver(H2());
        }
        C1447800nmM.LIZIZ(this.LLILZ).LLLLLLLZIL(w2());
        View viewXg = T2().xg();
        if (viewXg != null && (c368680Ecs = (C368680Ecs) viewXg.findViewById(R.id.u2j)) != null) {
            c368680Ecs.LLJILJIL.remove(this.LLJJ);
        }
        E3(this, false, 0L, new AwS549S0100000_5(this, 911));
        this.LLJ = true;
    }

    public final void m3() {
        if (C363750ENx.LIZIZ("keyframe_guide_show")) {
            return;
        }
        C363750ENx.LJ("keyframe_guide_show");
    }

    public final InterfaceC360800ECo o2() {
        return (InterfaceC360800ECo) this.LLILZLL.getValue(this, LLJJJ[0]);
    }

    private final void B3() {
        c3();
        C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 915));
        C1447800nmM.LIZIZ(this.LLILZ).LLLIILIL(this, w2());
        C363750ENx.LJ("keyframe_guide_show");
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            C361680EFy.LJJLI(0, videoPublishEditModelLJJJLIIL, W1());
        }
        this.LLJILJILJ = true;
    }

    private final void W2() {
        InterfaceC351610DqR interfaceC351610DqROg;
        MutableLiveData mutableLiveDataLLJIJIL;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (interfaceC351610DqROg = c0e48W1.og()) == null || (mutableLiveDataLLJIJIL = interfaceC351610DqROg.LLJIJIL()) == null) {
            return;
        }
        mutableLiveDataLLJIJIL.observe(this, new AObserverS209S0100000_5(this, 101));
    }

    private final void Xi() {
        InterfaceC351610DqR interfaceC351610DqROg;
        MutableLiveData mutableLiveDataLLJIJIL;
        MutableLiveData mutableLiveDataLIZ;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (mutableLiveDataLIZ = c0e48W1.S7().LIZ("select_slot_fake")) != null) {
            mutableLiveDataLIZ.observe(this, H2());
        }
        C0E48 c0e48W12 = W1();
        if (c0e48W12 == null || (interfaceC351610DqROg = c0e48W12.og()) == null || (mutableLiveDataLLJIJIL = interfaceC351610DqROg.LLJIJIL()) == null) {
            return;
        }
        mutableLiveDataLLJIJIL.observe(this, new AObserverS209S0100000_5(this, 102));
    }

    @Override // X.C0EFV, X.C0EIO
    public boolean LLLLLLL() {
        return !i3();
    }

    @Override // X.C0EFV
    /* JADX INFO: renamed from: if */
    public boolean mo25if() {
        boolean zI3 = i3();
        if (zI3) {
            Xi();
        }
        this.LLJIJIL = Boolean.valueOf(zI3);
        return zI3;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (!C363750ENx.LIZIZ("keyframe_guide_show")) {
            W2();
        }
        o2().fD2(EnumC373450EkZ.KEY_FRAME).observe(this, new AObserverS209S0100000_5(this, 103));
        o2().P42(new InterfaceC373540Eki() { // from class: X.0Ekw
            @Override // X.InterfaceC373540Eki
            public void onEvent(C0E2F c0e2f) {
                this.LIZ.q3(c0e2f);
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            c0e48W1.Ej(this.LLJJI);
        }
        this.LLJI.removeCallbacksAndMessages(null);
    }

    public final void v3() {
        int i = o2().ox().LIZJ() == EnumC373340EkO.ADD_KEYFRAME ? 1 : 0;
        boolean zL5 = L5();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, W1(), new Pair(-1, -1));
            c0labLJFF.LIZ(i, "is_add_or_delete");
            c0labLJFF.LIZ(zL5 ? 1 : 0, "is_new_guidance");
            C363500EMy.LIZ.getClass();
            c0labLJFF.LIZ(C363500EMy.LJIIJ(videoPublishEditModelLJJJLIIL) ? 1 : 0, "is_from_create_template");
            C20684815ws.LJIILLIIL("keyframe_button_show", c0labLJFF.LIZ);
        }
    }

    @Override // X.C0EFV
    public boolean Dl() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0EFV, X.C0EIO
    public C0EIE getType() {
        return this.LLJJIJIIJIL;
    }

    private final boolean o4(C0E5A c0e5a) {
        EnumC373670Ekv curStepState;
        NLETrack nLETrack;
        C373660Eku c373660Eku = this.LLIZLLLIL;
        if (c373660Eku != null) {
            curStepState = c373660Eku.getCurStepState();
        } else {
            curStepState = null;
        }
        if (curStepState != null || !c0e5a.LIZJ || c0e5a.LIZIZ == null) {
            return false;
        }
        NLETrack nLETrack2 = c0e5a.LIZ;
        if ((nLETrack2 == null || !C351220Dpo.LLLLJ(nLETrack2)) && ((nLETrack = c0e5a.LIZ) == null || !C351220Dpo.LLILLJJLI(nLETrack))) {
            return false;
        }
        B3();
        Xi();
        return true;
    }

    public final void e4(View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.6f);
        valueAnimatorOfFloat.setStartDelay(300L);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 12));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 12));
        C786410Ut5.T4(view, 0.0f);
        view.animate().setInterpolator(new LinearInterpolator()).setDuration(150L).alpha(1.0f).setStartDelay(500L).withEndAction(new ARunnableS105S0100000_5(valueAnimatorOfFloat, 73)).start();
    }

    public final void q3(C0E2F c0e2f) {
        C0E2G c0e2g = C0E2G.LIZ;
        if (!C1697810uHb.LJIIJJI(c0e2g, C0E2K.LIZ).contains(c0e2f)) {
            return;
        }
        boolean zLJFF = Intrinsics.LJFF(c0e2f, c0e2g);
        boolean zL5 = L5();
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, W1(), new Pair(-1, -1));
            c0labLJFF.LIZ(zLJFF ? 1 : 0, "is_add_or_delete");
            c0labLJFF.LIZ(zL5 ? 1 : 0, "is_new_guidance");
            C363500EMy.LIZ.getClass();
            c0labLJFF.LIZ(C363500EMy.LJIIJ(videoPublishEditModelLJJJLIIL) ? 1 : 0, "is_from_create_template");
            C20684815ws.LJIILLIIL("click_keyframe", c0labLJFF.LIZ);
        }
    }

    @Override // X.C0EFV, X.C0EIO
    public boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return o4(c0e5a);
    }

    public C373630Ekr(C1DRG c1drg, C19A3 c19a3, C372830EjZ c372830EjZ) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c19a3;
        this.LLILZIL = c372830EjZ;
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 913));
        this.LLJJ = new C0EGA() { // from class: X.0Eks
            @Override // X.C0EGA
            public final void LIZ(C0E6I c0e6i, int i) {
                EnumC373670Ekv curStepState;
                InterfaceC351610DqR interfaceC351610DqROg;
                MutableLiveData<NLETimeSpaceNode> mutableLiveDataLJJJJL;
                InterfaceC351610DqR interfaceC351610DqROg2;
                MutableLiveData<NLETimeSpaceNode> mutableLiveDataLJJJJL2;
                C373660Eku c373660Eku = this.LIZ.LLIZLLLIL;
                EnumC373670Ekv curStepState2 = null;
                if (c373660Eku != null) {
                    curStepState = c373660Eku.getCurStepState();
                } else {
                    curStepState = null;
                }
                EnumC373670Ekv enumC373670Ekv = EnumC373670Ekv.TRACK_MASK;
                if (curStepState == enumC373670Ekv && c0e6i == C0E6I.DRAGGING) {
                    C373630Ekr.E3(this.LIZ, false, 500L, null);
                    this.LIZ.LLJI.removeCallbacksAndMessages(null);
                }
                C373660Eku c373660Eku2 = this.LIZ.LLIZLLLIL;
                if (c373660Eku2 != null) {
                    curStepState2 = c373660Eku2.getCurStepState();
                }
                if (curStepState2 == enumC373670Ekv) {
                    C0E48 c0e48W1 = this.LIZ.W1();
                    if (c0e48W1 == null || (interfaceC351610DqROg2 = c0e48W1.og()) == null || (mutableLiveDataLJJJJL2 = interfaceC351610DqROg2.LJJJJL()) == null || mutableLiveDataLJJJJL2.getValue() == null) {
                        C0E48 c0e48W12 = this.LIZ.W1();
                        if ((c0e48W12 == null || (interfaceC351610DqROg = c0e48W12.og()) == null || (mutableLiveDataLJJJJL = interfaceC351610DqROg.LJJJJL()) == null || mutableLiveDataLJJJJL.getValue() == null) && c0e6i == C0E6I.IDLE) {
                            C373630Ekr.E3(this.LIZ, true, 500L, null);
                            this.LIZ.O3();
                        }
                    }
                }
            }
        };
        this.LLJJI = new C354000DuI() { // from class: X.0Ekt
            @Override // X.C354000DuI
            public final void LIZ() {
                NLEEditor nLEEditorLJI;
                C373660Eku c373660Eku = this.LIZ.LLIZLLLIL;
                if ((c373660Eku != null ? c373660Eku.getCurStepState() : null) == EnumC373670Ekv.GESTURE_MASK) {
                    this.LIZ.X1();
                    C0E48 c0e48W1 = this.LIZ.W1();
                    if (c0e48W1 == null || (nLEEditorLJI = c0e48W1.LLFII().LJI()) == null) {
                        return;
                    }
                    nLEEditorLJI.removeConsumer(this);
                }
            }
        };
        this.LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 914));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 912));
        this.LLJJIJIIJIL = C0EIE.KEYFRAME;
    }

    public static final void E3(C373630Ekr c373630Ekr, boolean z, long j, Function0 function0) {
        float f;
        C373660Eku c373660Eku = c373630Ekr.LLIZLLLIL;
        if (c373660Eku != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = c373660Eku.animate();
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            viewPropertyAnimatorAnimate.alpha(f).setInterpolator(new LinearInterpolator()).setStartDelay(j).setDuration(150L).withEndAction(new ARunnableS8S0210000_5(c373660Eku, function0, z, 4)).start();
        }
    }
}

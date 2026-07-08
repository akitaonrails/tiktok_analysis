package X;

import Y.ALAdapterS2S0200000_5;
import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import zoo.b;

/* JADX INFO: renamed from: X.0EVO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EVO extends AbstractC381020Ewm<InterfaceC362230EIb> implements InterfaceC362230EIb, InterfaceC379610EuV, C0EIO {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final C372830EjZ LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final C0EIE LLIZLLLIL;
    public final h0<Integer> LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public int LLJJIII;
    public C0EVQ LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public int LLJJJIL;
    public final C01GW LLJJJJ;
    public final Handler LLJJJJJIL;
    public final C0EVP LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EVO.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EVO.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EVO.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EVO.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0EVO.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0EVO.class, "generatingApi", "getGeneratingApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/i2v/I2vTrackGeneratingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0EVO.class, "epPanelApi", "getEpPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/panel/EPPanelApiComponent;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    @Override // X.C0EIO
    public boolean LLJJ() {
        return false;
    }

    @Override // X.C0EIO
    public boolean LLJLILLLLZIIL(C0E5A c0e5a, List<String> list) {
        return false;
    }

    @Override // X.C0EIO
    public boolean LLLIILIL() {
        return false;
    }

    @Override // X.C0EIO
    public boolean LLLZZIL(List<String> list) {
        return false;
    }

    public InterfaceC362230EIb o2() {
        return this;
    }

    @Override // X.InterfaceC362230EIb
    public C0EIO sV() {
        return this;
    }

    private final C0E5S B3() {
        return (C0E5S) this.LLJIJIL.getValue(this, LLJJL[1]);
    }

    private final C0EY2 H2() {
        return (C0EY2) this.LLJILJIL.getValue(this, LLJJL[2]);
    }

    private final C0EB6 T2() {
        return (C0EB6) this.LLJJI.getValue(this, LLJJL[6]);
    }

    private final InterfaceC359950E9h W2() {
        return (InterfaceC359950E9h) this.LLJILJILJ.getValue(this, LLJJL[3]);
    }

    private final C0EVV m3() {
        return (C0EVV) this.LLJJJ.getValue();
    }

    private final Observer<Boolean> w2() {
        return (Observer) this.LLJJIJIL.getValue();
    }

    public final void E3() {
        final C372830EjZ c372830EjZ = this.LLILZIL;
        c372830EjZ.setGrabberViewStateChangeListener(new InterfaceC372900Ejg() { // from class: X.0EVS
            public boolean LIZ;

            @Override // X.InterfaceC372900Ejg
            public final void LIZ(int i, boolean z) {
                C0E48 c0e48W1 = this.W1();
                if (c0e48W1 == null) {
                    return;
                }
                if (i != 0) {
                    if (i == 1) {
                        if (c0e48W1.getPlayer().isPlaying()) {
                            this.LIZ = true;
                            c0e48W1.getPlayer().pause(false);
                        }
                        this.X1(false);
                        return;
                    }
                    return;
                }
                C0E12 c0e12 = C363750ENx.LIZ;
                C363750ENx.LJFF(c372830EjZ.getControlAreaHeight());
                if (this.LIZ) {
                    this.LIZ = false;
                    c0e48W1.getPlayer().LLIL(false);
                }
                this.X1(true);
            }
        });
        c372830EjZ.setControlHeightChangeListener(new InterfaceC372920Eji(this) { // from class: X.0EVR
            public final C01GW LIZ;
            public final /* synthetic */ C0EVO LIZJ;

            @Override // X.InterfaceC372920Eji
            public final void LIZ(int i) {
                this.LIZJ.LLJ.LJII(Integer.valueOf(i));
                View viewFindViewById = this.LIZIZ.findViewById(R.id.ygy);
                if (viewFindViewById != null) {
                    viewFindViewById.getLayoutParams().height = (i - C0ES3.LIZ) - C0ES4.LIZJ;
                    viewFindViewById.requestLayout();
                }
                if (((View) this.LIZ.getValue()).getScrollY() > ((AbstractC368670Ecr) this.LIZ.getValue()).getMaxScrollY()) {
                    ((View) this.LIZ.getValue()).scrollTo(((View) this.LIZ.getValue()).getScrollX(), ((AbstractC368670Ecr) this.LIZ.getValue()).getMaxScrollY());
                }
            }

            {
                this.LIZJ = this;
                this.LIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this.LIZIZ, 943));
            }
        });
        c372830EjZ.setGrabberLevelChangeListener(C373030Ejt.LIZ);
        c372830EjZ.setPreviewHeightChangeListener(new InterfaceC372920Eji() { // from class: X.0ELs
            public boolean LIZ = true;

            @Override // X.InterfaceC372920Eji
            public final void LIZ(int i) {
                PairIntInt pairIntInt;
                SurfaceView surfaceViewLJIJJLI;
                int width;
                INLEMediaRuntime mediaRuntimeApi;
                C0E48 c0e48W1 = this.LIZIZ.W1();
                if (c0e48W1 == null || !c0e48W1.Ls()) {
                    return;
                }
                INLEMediaSession iNLEMediaSessionF1 = c0e48W1.f1();
                if (iNLEMediaSessionF1 == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi.getInitSize()) == null) {
                    pairIntInt = new PairIntInt(0, 0);
                }
                if (pairIntInt.getFirst() != 0 && pairIntInt.getSecond() != 0 && (surfaceViewLJIJJLI = this.LIZIZ.q3().LJIJJLI()) != null && (width = surfaceViewLJIJJLI.getWidth()) != 0 && i != 0) {
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPreviewHeightChange video w ");
                    sbLIZ.append(pairIntInt.getFirst());
                    sbLIZ.append(" h ");
                    sbLIZ.append(pairIntInt.getSecond());
                    sbLIZ.append(" display w ");
                    sbLIZ.append(width);
                    sbLIZ.append(" h ");
                    sbLIZ.append(i);
                    C201955140j.LJIILL(c563650M8t, "EditorProScene", C2188811AlT.LIZIZ(sbLIZ));
                    if (!this.LIZ) {
                        C0E9V.LIZ(c0e48W1, pairIntInt.getFirst(), pairIntInt.getSecond(), width, i, this.LIZIZ.q3().LJIJJLI(), this.LIZIZ.LLJJIII);
                        C0EOK c0eokV3 = this.LIZIZ.v3();
                        if (c0eokV3 != null) {
                            c0eokV3.sq(Integer.valueOf(i), Float.valueOf(0.0f), Float.valueOf(0.0f));
                        }
                        InterfaceC363160ELq interfaceC363160ELqI3 = this.LIZIZ.i3();
                        if (interfaceC363160ELqI3 != null) {
                            interfaceC363160ELqI3.Dc1(Integer.valueOf(i), Float.valueOf(0.0f), Float.valueOf(0.0f));
                        }
                    }
                    this.LIZ = false;
                    this.LIZIZ.q3().DN0(this.LIZIZ.LLJJIII);
                }
            }
        });
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            C0EB6 c0eb6T2 = T2();
            LiveData<Boolean> liveDataLJI = c0eb6T2 != null ? c0eb6T2.LJI() : c0e48W1.S7().LIZ("is_bottom_panel_showing");
            if (liveDataLJI != null) {
                liveDataLJI.observe(this, w2());
            }
        }
    }

    @Override // X.InterfaceC362230EIb
    public void HI0() {
        this.LLILZIL.LJIIIZ();
    }

    @Override // X.C0EIO
    public boolean LLLLLLL() {
        return C363750ENx.LIZIZ("has_show_slide_adjust_guide");
    }

    public final C0EVW c3() {
        return (C0EVW) this.LLJJJJ.getValue();
    }

    @Override // X.InterfaceC362230EIb
    public int ft2() {
        return this.LLILZIL.getControlAreaHeight();
    }

    public final InterfaceC363160ELq i3() {
        return (InterfaceC363160ELq) this.LLJJ.getValue(this, LLJJL[5]);
    }

    @Override // X.InterfaceC362230EIb
    public EnumC362260EIe pg0() {
        return this.LLILZIL.getCurSortedControlHeightIndex() == 0 ? EnumC362260EIe.MIN : EnumC362260EIe.MAX;
    }

    public final InterfaceC361710EGb q3() {
        return (InterfaceC361710EGb) this.LLJI.getValue(this, LLJJL[0]);
    }

    public final C0EOK v3() {
        return (C0EOK) this.LLJILLL.getValue(this, LLJJL[4]);
    }

    public final C0ELJ G2() {
        LiveData<C0EHI> liveDataZu2;
        C0EHI value;
        C0EY2 c0ey2H2 = H2();
        if (c0ey2H2 == null || (liveDataZu2 = c0ey2H2.zu2()) == null || (value = liveDataZu2.getValue()) == null) {
            return null;
        }
        return value.LJ;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventDx0;
        LiveData<Boolean> liveDataQO0;
        super.onCreate();
        InterfaceC359950E9h interfaceC359950E9hW2 = W2();
        if (interfaceC359950E9hW2 != null && (liveDataQO0 = interfaceC359950E9hW2.QO0()) != null) {
            liveDataQO0.observe(this, new AObserverS209S0100000_5(this, 115));
        }
        InterfaceC359950E9h interfaceC359950E9hW22 = W2();
        if (interfaceC359950E9hW22 == null || (liveEventDx0 = interfaceC359950E9hW22.Dx0()) == null) {
            return;
        }
        liveEventDx0.LIZ(this, new AObjectS240S0100000_5(this, 146));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJJJJIL.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC362230EIb
    public void yP0() {
        C368000Ebm c368000Ebm;
        View viewXg = B3().xg();
        if (!(viewXg instanceof C368000Ebm) || (c368000Ebm = (C368000Ebm) viewXg) == null) {
            return;
        }
        c368000Ebm.scrollToSelectSlotTrack();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0EIO
    public C0EIE getType() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC362230EIb
    public C385670FAf<Integer> my1() {
        return this.LLJ;
    }

    @Override // X.InterfaceC362230EIb
    public int qG1() {
        return this.LLJJJIL;
    }

    public final void H3(int i) {
        ViewGroup viewGroup;
        this.LLJJIJIIJIL = true;
        int iLIZ = i - (C0FU0.LIZ(12.0f) * 2);
        C0EVQ c0evq = new C0EVQ(this.LLILZ.requireSceneContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = C0FU0.LIZ(12.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0evq);
        c0evq.setLayoutParams(layoutParams);
        TuxTextView textView = c0evq.getTextView();
        textView.setGravity(17);
        textView.setMaxWidth(iLIZ);
        textView.setTuxFont(52);
        textView.setText(C1664590tQ1.LJII(this).getString(2131835088));
        ViewGroup.LayoutParams layoutParams2 = c0evq.getGuideIcon().getLayoutParams();
        layoutParams2.width = C0FU0.LIZ(20.0f);
        layoutParams2.height = C0FU0.LIZ(20.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0evq);
        c0evq.setAlpha(0.0f);
        View previewLayout = this.LLILZIL.getPreviewLayout();
        if ((previewLayout instanceof ViewGroup) && (viewGroup = (ViewGroup) previewLayout) != null) {
            viewGroup.addView(c0evq);
        }
        c0evq.animate().alpha(1.0f).setDuration(300L).start();
        this.LLJJIJI = c0evq;
        C363750ENx.LJ("has_show_slide_adjust_guide");
        ((ArrayList) this.LLILZIL.LLJJIII).add(m3());
        C786410Ut5.LJLIIL(3000L, this.LLJJJJJIL, new ARunnableS105S0100000_5(this, 77));
    }

    @Override // X.InterfaceC362230EIb
    public void RH1(boolean z) {
        C368000Ebm c368000Ebm;
        View viewXg = B3().xg();
        if ((viewXg instanceof C368000Ebm) && (c368000Ebm = (C368000Ebm) viewXg) != null) {
            c368000Ebm.scrollSelectTrackToFirst(z);
        }
    }

    public final void X1(boolean z) {
        B3().yV(new AwS20S0010000_5(z, 44));
    }

    @Override // X.InterfaceC362230EIb
    public void hm0(boolean z) {
        ViewGroup viewGroup;
        C0EVQ c0evq = this.LLJJIJI;
        if (c0evq != null) {
            this.LLJJIJI = null;
            ((ArrayList) this.LLILZIL.LLJJIII).remove(m3());
            this.LLJJJJJIL.removeCallbacksAndMessages(null);
            if (!z) {
                c0evq.animate().cancel();
                View previewLayout = this.LLILZIL.getPreviewLayout();
                if ((previewLayout instanceof ViewGroup) && (viewGroup = (ViewGroup) previewLayout) != null) {
                    C786410Ut5.LJJJLZIJ(c0evq, viewGroup);
                    return;
                }
                return;
            }
            c0evq.animate().alpha(0.0f).setDuration(300L).setListener(new ALAdapterS2S0200000_5(this, c0evq, 7)).start();
        }
    }

    @Override // X.InterfaceC362230EIb
    public void td1(EnumC362260EIe enumC362260EIe) {
        this.LLILZIL.LJII(enumC362260EIe.getValue(), c3());
    }

    @Override // X.C0EIO
    public boolean LLILLIZIL(List<String> list, C0ELJ c0elj) {
        LiveState<Size> canvasSize = q3().getCanvasSize();
        if (canvasSize != null) {
            canvasSize.LJIIIZ(this, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 789));
        }
        C363750ENx.LJ("has_show_slide_adjust_guide");
        return true;
    }

    @Override // X.InterfaceC362230EIb
    public void T81(EnumC362260EIe enumC362260EIe, final Function0<Unit> function0) {
        this.LLILZIL.LJII(enumC362260EIe.getValue(), new InterfaceC372900Ejg() { // from class: X.0EVT
            @Override // X.InterfaceC372900Ejg
            public final void LIZ(int i, boolean z) {
                C0EVO c0evo = this.LIZ;
                c0evo.LLJJJIL = i;
                if (i == 0) {
                    if (z) {
                        C0E12 c0e12 = C363750ENx.LIZ;
                        C363750ENx.LJFF(c0evo.LLILZIL.getControlAreaHeight());
                    }
                    this.LIZ.X1(true);
                    function0.invoke();
                }
            }
        });
    }

    public final boolean Z1(MotionEvent motionEvent, View view) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int i = iArr[0];
        int i2 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i;
        int measuredHeight = iArr[1] + view.getMeasuredHeight();
        if (i2 > rawY || rawY > measuredHeight || i > rawX || rawX > measuredWidth) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC362230EIb
    public void Dq1(int i, boolean z, Function0<Unit> function0) {
        this.LLILZIL.LJIIIIZZ(i, z, function0);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0EVP] */
    public C0EVO(C1DRG c1drg, C19A3 c19a3, C372830EjZ c372830EjZ, int i, int i2) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c19a3;
        this.LLILZIL = c372830EjZ;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = C0EIE.CANVAS_ADJUST;
        this.LLJ = new h0<>(Integer.valueOf(C363750ENx.LIZ()));
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC363160ELq.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EB6.class, null);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 940));
        this.LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 942));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 941));
        this.LLJJJJJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJJLIIL = new AbstractC385780FAq() { // from class: X.0EVP
            public final int LL = C0EVU.ADJUST_CANVAS.getPriority();
            public boolean LLILLJJLI;
            public MotionEvent LLILLL;

            @Override // X.AbstractC385780FAq
            public final int getPriority() {
                return this.LL;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJIJJ(MotionEvent motionEvent) {
                Integer numValueOf;
                if (this.LLILLJJLI) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(3, 1);
                    if (motionEvent != null) {
                        numValueOf = Integer.valueOf(motionEvent.getActionMasked());
                    } else {
                        numValueOf = null;
                    }
                    if (C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
                        this.LLILLJJLI = false;
                        C0EVO c0evo = this.LLILZ;
                        c0evo.LLILZIL.LJFF(c0evo.c3());
                    }
                }
                this.LLILLL = null;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJJIJIIJIL(MotionEvent motionEvent) {
                this.LLILLL = motionEvent;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                PointF pointF;
                if (bVar == null || (pointF = bVar.LJIIJJI) == null) {
                    return false;
                }
                float f = pointF.y;
                int top = (int) (this.LLILZ.LLILZIL.getControlLayout().getTop() + f);
                int height = this.LLILZ.LLILZIL.getHeight();
                C0EVO c0evo = this.LLILZ;
                int i3 = c0evo.LLIZ;
                int i4 = C372830EjZ.LLJJJJ;
                int i5 = C372830EjZ.LLJJL;
                int i6 = height - (i3 + i5);
                int height2 = c0evo.LLILZIL.getHeight();
                C0EVO c0evo2 = this.LLILZ;
                int i7 = height2 - (c0evo2.LLILZLL - i5);
                if (i6 > top || top > i7) {
                    return true;
                }
                c0evo2.LLILZIL.LJ(top, (int) f);
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                float y;
                C0EVO c0evo = this.LLILZ;
                C372830EjZ c372830EjZ2 = c0evo.LLILZIL;
                c372830EjZ2.LLJIJIL = c372830EjZ2.LLIZLLLIL;
                if (!c372830EjZ2.getDraggable()) {
                    return false;
                }
                MotionEvent motionEvent = this.LLILLL;
                if (motionEvent != null) {
                    y = motionEvent.getY();
                } else {
                    y = f2;
                }
                if (y - f2 >= 0.0f && c372830EjZ2.getControlAreaHeight() <= c0evo.LLILZLL) {
                    return false;
                }
                this.LLILLJJLI = true;
                this.LLILZ.X1(false);
                return true;
            }
        };
    }
}

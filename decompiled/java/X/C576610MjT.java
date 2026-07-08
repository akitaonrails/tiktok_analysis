package X;

import Y.AObjectS241S0100000_8;
import Y.AObserverS212S0100000_8;
import Y.AfS144S0200000_8;
import Y.AfS177S0100000_8;
import Y.AkS472S0100000_8;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import ge.i;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import lnn.q;

/* JADX INFO: renamed from: X.0MjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576610MjT extends i<InterfaceC576680Mja, C576420MjA, C576510MjJ, C576450MjD> implements InterfaceC576680Mja, InterfaceC379610EuV {
    public static final C576670MjZ LLJLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public static final int LLJZIJLIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final C11NJ LLJJLIIIJLLLLLLLZ;
    public final C11PQ<C576590MjR> LLJL;
    public final C11PQ<Boolean> LLJLIL;
    public final C11RK<Unit> LLJLILLLLZIIL;
    public final ShortVideoContext LLJLL;
    public final C576650MjX LLJLLIL;

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0MjZ] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C576610MjT.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C576610MjT.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C576610MjT.class, "planCUIComponent", "getPlanCUIComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C576610MjT.class, "lighteningControlProgressComponent", "getLighteningControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C576610MjT.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C576610MjT.class, "cameraGestureComponent", "getCameraGestureComponent()Lcom/bytedance/creativex/recorder/gesture/RecordGestureLogicComponent;", 0), new C2217381BqS(C576610MjT.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0), new C2217381BqS(C576610MjT.class, "layoutWorkspaceComponent", "getLayoutWorkspaceComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutWorkspaceApiComponent;", 0), new C2217381BqS(C576610MjT.class, "layoutCaptureFlowComponent", "getLayoutCaptureFlowComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutCaptureFlowApiComponent;", 0), new C2217381BqS(C576610MjT.class, "layoutGoNextComponent", "getLayoutGoNextComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutGoNextApiComponent;", 0), new C2217381BqS(C576610MjT.class, "cameraNLEComponent", "getCameraNLEComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutNLEApiComponent;", 0), new C2217381BqS(C576610MjT.class, "layoutToolbarComponent", "getLayoutToolbarComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutToolbarApiComponent;", 0)};
        LLJLLL = new Object() { // from class: X.0MjZ
        };
        LLJZIJLIL = 8;
    }

    private final void C5() {
        this.LLJJLIIIJLLLLLLLZ.LIZ(K4().c90().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS144S0200000_8(this, new C013C(), 6)));
        n5().LLZIL().LIZ(this, new AObjectS241S0100000_8(this, 72));
    }

    private final void D5() {
        this.LLJJLIIIJLLLLLLLZ.LIZ(this.LLJLILLLLZIIL.LJIL(3L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 70)));
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 748);
        getStickerApiComponent().dN1().LIZ(this, new AObjectS241S0100000_8(awS552S0100000_8, 73));
        Z4().V5().observe(this, new AObserverS212S0100000_8(awS552S0100000_8, 72));
        n5().Lg1().LIZ(this, new AObjectS241S0100000_8(this, 74));
    }

    private final void H5() {
        this.LLJJLIIIJLLLLLLLZ.LIZ(C11NZ.LJIIJ(this.LLJL, this.LLJLIL, new InterfaceC500500Jk0<T1, T2, R>() { // from class: X.0MjS
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
            @Override // X.InterfaceC500500Jk0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final R apply(T1 r3, T2 r4) {
                /*
                    r2 = this;
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r0 = r4.booleanValue()
                    r1 = 0
                    if (r0 == 0) goto L5c
                    X.01GW r0 = X.C266920Ad8.LIZ
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L45
                    X.0MjT r0 = r2.LIZ
                    X.19A3 r0 = r0.LLJILJILJ
                    X.15ii r0 = X.C20622515mp.LJ(r0)
                    if (r0 == 0) goto L43
                    X.198H r0 = r0.LC()
                L25:
                    boolean r0 = r0 instanceof com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene
                    if (r0 != 0) goto L3b
                    X.0MjT r0 = r2.LIZ
                    X.19A3 r0 = r0.LLJILJILJ
                    X.15ii r0 = X.C20622515mp.LJ(r0)
                    if (r0 == 0) goto L37
                    X.198H r1 = r0.LC()
                L37:
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.image.ui.ImageEditRootScene
                    if (r0 == 0) goto L45
                L3b:
                    java.lang.String r1 = "CameraLayoutGridComponent"
                    java.lang.String r0 = "avoid hiding reuse surface view in edit page"
                    X.C576730Mjf.LJIIIZ(r1, r0)
                L42:
                    return r3
                L43:
                    r0 = r1
                    goto L25
                L45:
                    X.0MjT r0 = r2.LIZ
                    X.0t2r r0 = r0.getCameraApiComponent()
                    android.view.View r1 = r0.getPreviewView()
                    boolean r0 = r1 instanceof android.view.SurfaceView
                    if (r0 == 0) goto L42
                    android.view.SurfaceView r1 = (android.view.SurfaceView) r1
                    if (r1 == 0) goto L42
                    r0 = 4
                    X.C786410Ut5.LLIIII(r1, r0)
                    return r3
                L5c:
                    X.0MjT r0 = r2.LIZ
                    X.0t2r r0 = r0.getCameraApiComponent()
                    android.view.View r1 = r0.getPreviewView()
                    boolean r0 = r1 instanceof android.view.SurfaceView
                    if (r0 == 0) goto L72
                    android.view.SurfaceView r1 = (android.view.SurfaceView) r1
                    if (r1 == 0) goto L72
                    r0 = 0
                    X.C786410Ut5.LLIIII(r1, r0)
                L72:
                    X.0MjR r3 = new X.0MjR
                    X.0MjT r0 = r2.LIZ
                    X.0t2r r0 = r0.getCameraApiComponent()
                    android.view.View r0 = r0.getPreviewView()
                    android.view.SurfaceView r0 = (android.view.SurfaceView) r0
                    android.view.SurfaceHolder r0 = r0.getHolder()
                    android.view.Surface r0 = r0.getSurface()
                    r3.<init>(r0)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C576600MjS.apply(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }).LJJLJLI(new AfS177S0100000_8(this, 71)));
        this.LLJJLIIIJLLLLLLLZ.LIZ(C576730Mjf.LJIILIIL(T4().r6(), this).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0MjW
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return Boolean.valueOf(!(obj instanceof C579270Mnl));
            }
        }).LJJIFFI().LJJJIL(new AkS472S0100000_8(this, 12)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJLIIIL(new AkS472S0100000_8(this, 13)).LJJLJLI(new AfS177S0100000_8(this, 72)));
    }

    private final InterfaceC577060MkC Z4() {
        return (InterfaceC577060MkC) this.LLJJL.getValue(this, LLJZ[11]);
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJJI.getValue(this, LLJZ[1]);
    }

    public final C1650260t2u H4() {
        return (C1650260t2u) this.LLJJIJIL.getValue(this, LLJZ[5]);
    }

    public final InterfaceC576620MjU K4() {
        return (InterfaceC576620MjU) this.LLJJJJLIIL.getValue(this, LLJZ[10]);
    }

    public final InterfaceC576630MjV O4() {
        return (InterfaceC576630MjV) this.LLJJJJ.getValue(this, LLJZ[8]);
    }

    public final InterfaceC576660MjY P4() {
        return (InterfaceC576660MjY) this.LLJJJJJIL.getValue(this, LLJZ[9]);
    }

    public final InterfaceC576770Mjj T4() {
        return (InterfaceC576770Mjj) this.LLJJJ.getValue(this, LLJZ[6]);
    }

    public final InterfaceC576780Mjk d5() {
        return (InterfaceC576780Mjk) this.LLJJJIL.getValue(this, LLJZ[7]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJJ.getValue(this, LLJZ[0]);
    }

    public final q getStickerApiComponent() {
        return (q) this.LLJJIJIIJIL.getValue(this, LLJZ[4]);
    }

    public final InterfaceC1630630sXF k5() {
        return (InterfaceC1630630sXF) this.LLJJIJI.getValue(this, LLJZ[3]);
    }

    public final a n5() {
        return (a) this.LLJJIII.getValue(this, LLJZ[2]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C576510MjJ> o2() {
        return new AwS552S0100000_8(this, 747);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C576450MjD> w2() {
        return new AwS552S0100000_8(this, 749);
    }

    private final void E5() {
        getRecordControlApi().cJ0().LIZ(this, new AObjectS241S0100000_8(this, 75));
    }

    private final void t5() {
        getCameraApiComponent().xF1().LIZ(this, new AObjectS241S0100000_8(this, 70));
        getCameraApiComponent().tS1().LIZ(this, new AObjectS241S0100000_8(this, 71));
    }

    private final void v5() {
        this.LLJJLIIIJLLLLLLLZ.LIZ(O4().PT().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 66)));
        this.LLJJLIIIJLLLLLLLZ.LIZ(O4().Zr1().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 67)));
        this.LLJJLIIIJLLLLLLLZ.LIZ(O4().FQ1().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 68)));
    }

    public final void M5() {
        C0MSJ c0msj;
        if (T4().r6().getValue() instanceof C579290Mnn) {
            boolean z = false;
            if (C540010LFv.LIZIZ() == EnumC540020LFw.NLE) {
                InterfaceC576620MjU interfaceC576620MjUK4 = K4();
                List<LayoutItemMedia> listKG2 = d5().KG2();
                if (!(listKG2 instanceof Collection) || !listKG2.isEmpty()) {
                    Iterator<LayoutItemMedia> it2 = listKG2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().mediaType != LayoutMediaType.PHOTO) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                interfaceC576620MjUK4.TY0(z);
                return;
            }
            C0MSO c0mso = C0MSO.LJFF;
            c0mso.getClass();
            C0MSP.LIZ("call alignTimeLinePlay() begin...");
            if (c0mso.LIZJ.isEmpty()) {
                C0MSP.LIZ("ignore alignTimeLinePlay() by observeTargets.isEmpty()");
                return;
            }
            c0mso.LJ(null);
            if (c0mso.LIZJ.isEmpty()) {
                C0MSP.LIZ("ignore alignTimeLinePlay() by observeTargets.isEmpty() after trimInternal");
                return;
            }
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            synchronized (c0mso) {
                try {
                    for (WeakReference weakReference : c0mso.LIZJ) {
                        if (weakReference != null && (c0msj = (C0MSJ) weakReference.get()) != null) {
                            copyOnWriteArraySet.add(c0msj);
                            z |= true;
                        }
                    }
                    if (z) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            C0MSL<?> c0msl = ((C0MSJ) it3.next()).LLILZIL;
                            if (c0msl != null) {
                                c0msl.LIZ();
                            }
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        v5();
        C5();
        H5();
        E5();
        D5();
        t5();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJLIIIJLLLLLLLZ.dispose();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        pausePlay();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        M5();
    }

    public final void pausePlay() {
        C0MSJ c0msj;
        if (C540010LFv.LIZIZ() == EnumC540020LFw.NLE) {
            K4().mv0();
            return;
        }
        C0MSO c0mso = C0MSO.LJFF;
        c0mso.getClass();
        C0MSP.LIZ("call global pause() begin...");
        if (c0mso.LIZJ.isEmpty()) {
            C0MSP.LIZ("ignore pause() by observeTargets.isEmpty()");
            return;
        }
        c0mso.LJ(null);
        if (c0mso.LIZJ.isEmpty()) {
            C0MSP.LIZ("ignore pause() by observeTargets.isEmpty() after trimInternal()");
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        synchronized (c0mso) {
            try {
                for (WeakReference weakReference : c0mso.LIZJ) {
                    if (weakReference != null && (c0msj = (C0MSJ) weakReference.get()) != null) {
                        copyOnWriteArraySet.add(c0msj);
                    }
                }
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    C0MSL<?> c0msl = ((C0MSJ) it2.next()).LLILZIL;
                    if (c0msl != null) {
                        c0msl.pause();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void x5() {
        this.LLJJLIIIJLLLLLLLZ.LIZ(P4().u01().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 69)));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View F4(com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia r8) {
        /*
            r7 = this;
            X.0LFw r1 = X.C540010LFv.LIZIZ()
            X.0LFw r0 = X.EnumC540020LFw.NLE
            r6 = 0
            r3 = 1
            if (r1 == r0) goto L58
            int r1 = r8.layoutIndex
            X.0Mjj r0 = r7.T4()
            X.0MkB r0 = r0.G8()
            if (r0 == 0) goto L54
            int r0 = r0.LIZJ
            int r0 = r0 - r3
        L19:
            if (r1 >= r0) goto L58
            r5 = 0
        L1c:
            android.content.Context r2 = X.C1664590tQ1.LJIIIZ(r7)
            X.0LFw r0 = X.C540010LFv.LIZIZ()
            int[] r1 = X.C540030LFx.LIZ
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 != r3) goto L4e
            X.0LDI r4 = new X.0LDI
            r0 = 0
            r4.<init>(r2, r0, r6)
        L34:
            X.0MjU r0 = r7.K4()
            android.graphics.Rect r3 = r0.dA2()
            X.0MjU r0 = r7.K4()
            com.bytedance.ies.nle.editor_jni.NLEModel r2 = r0.LLZ()
            Y.ARunnableS27S0110000_8 r1 = new Y.ARunnableS27S0110000_8
            r0 = 5
            r1.<init>(r7, r5, r0)
            r4.LIZLLL(r8, r2, r3, r1)
            return r4
        L4e:
            X.0MSJ r4 = new X.0MSJ
            r4.<init>(r2)
            goto L34
        L54:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L19
        L58:
            r5 = 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C576610MjT.F4(com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia):android.view.View");
    }

    public final void N5(boolean z) {
        i3(new AwS23S0010000_8(z, 11));
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.0MjX] */
    public C576610MjT(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C1650260t2u.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576780Mjk.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576630MjV.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576660MjY.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576620MjU.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC577060MkC.class, null);
        this.LLJJLIIIJLLLLLLLZ = new C11NJ();
        this.LLJL = new C11PQ<>();
        this.LLJLIL = new C11PQ<>();
        this.LLJLILLLLZIIL = new C11RK<>();
        this.LLJLL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
        this.LLJLLIL = new InterfaceC1650280t2w() { // from class: X.0MjX
            @Override // X.InterfaceC1650280t2w
            public final void le(MotionEvent motionEvent) {
            }
        };
    }
}

package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS246S0100000_25;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.nows.experiment.AIGCPhotoGenerationOptimization;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.aigc.abtest.AIGCEffectPathRedesignExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VETouchPointer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0sOC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1625020sOC extends AbstractC2255721DQs<InterfaceC540250LGt> implements InterfaceC540250LGt, InterfaceC379610EuV {
    public static final C1625050sOF LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public InterfaceC524950KiL LLJIJIL;
    public boolean LLJILJIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 660));
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
    public final InterfaceC540250LGt LLJI = this;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(323));
    public final C1625030sOD LLJILLL = new InterfaceC362610EJn() { // from class: X.0sOD
        @Override // X.InterfaceC362610EJn
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LL.LLILLJJLI);
            if (navigationSceneLIZ == null || !C523910Kgf.LIZIZ(navigationSceneLIZ, C1665410tRL.class)) {
                return false;
            }
            if (i == 4) {
                this.LL.reset();
                this.LL.i3();
                return true;
            }
            return true;
        }
    };
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(322));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 659));

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0sOF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1625020sOC.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1625020sOC.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1625020sOC.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1625020sOC.class, "lightingRecordControlApi", "getLightingRecordControlApi()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C1625020sOC.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C2217381BqS(C1625020sOC.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0)};
        LLJJIII = new Object() { // from class: X.0sOF
        };
        LLJJIJIIJIL = 8;
    }

    private final void W1() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLILLJJLI);
        if (navigationSceneLIZ != null && C523910Kgf.LIZIZ(navigationSceneLIZ, C1665410tRL.class)) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C526820KlM(navigationSceneLIZ, null), 2);
            if (AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled()) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C527860Kn2(this, null), 3);
        }
    }

    private final C1623740sM8 X1() {
        return (C1623740sM8) this.LLJILJILJ.getValue();
    }

    private final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLIZLLLIL.getValue(this, LLJJIJI[4]);
    }

    @Override // X.InterfaceC540250LGt
    public C01S9<Object> Fc() {
        return (C01S9) this.LLJJI.getValue();
    }

    public final C05YC<Object> T2() {
        return (C05YC) this.LLJJ.getValue();
    }

    public final void W2() {
        NavigationScene navigationSceneLIZ;
        if (AIGCPhotoGenerationOptimization.INSTANCE.isEnabled() && (navigationSceneLIZ = C1447800nmM.LIZ(this.LLILLJJLI)) != null && C523910Kgf.LIZIZ(navigationSceneLIZ, C1665410tRL.class)) {
            List<Scene> sceneList = navigationSceneLIZ.getSceneList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) sceneList) {
                if (obj instanceof C1665410tRL) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                navigationSceneLIZ.remove((Scene) it2.next());
            }
            getCameraApiComponent().Zl0(new C1663770tOh(true, false, false));
        }
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZ.getValue(this, LLJJIJI[1]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZIL.getValue(this, LLJJIJI[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue();
    }

    public final q getStickerApiComponent() {
        return (q) this.LLILLL.getValue(this, LLJJIJI[0]);
    }

    public final C1631190sY9 o2() {
        return (C1631190sY9) this.LLJ.getValue(this, LLJJIJI[5]);
    }

    public final InterfaceC1630630sXF w2() {
        return (InterfaceC1630630sXF) this.LLIZ.getValue(this, LLJJIJI[3]);
    }

    public final void i3() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C532740Kuu(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1648510t05 gestureApiComponent;
        super.onCreate();
        InterfaceC527980KnE interfaceC527980KnE = (InterfaceC527980KnE) getDiContainer().LJIIL(null, InterfaceC527980KnE.class);
        if (interfaceC527980KnE != null) {
            interfaceC527980KnE.hB0(this);
        }
        this.LLJIJIL = C0MWZ.LIZ(this.LLILLJJLI);
        LiveEvent<InterfaceC1623780sMC> liveEventJN1 = getStickerApiComponent().jN1();
        Lifecycle.State state = Lifecycle.State.CREATED;
        liveEventJN1.LJII(this, state, new AObjectS246S0100000_25(this, 604));
        getRecordControlApi().pU1().LJII(this, state, new AObjectS246S0100000_25(this, 605));
        getRecordControlApi().EP().LJII(this, state, new AObjectS246S0100000_25(this, 606));
        getStickerApiComponent().dN1().LJII(this, state, new AObjectS246S0100000_25(this, 607));
        getStickerApiComponent().SO().LJII(this, Lifecycle.State.RESUMED, new AObjectS245S0100000_22(this, 262));
        if (!AIGCEffectPathRedesignExperiment.INSTANCE.isEnabled() || (gestureApiComponent = getGestureApiComponent()) == null) {
            return;
        }
        gestureApiComponent.AL1(new AbstractC21664519qV() { // from class: X.0sMR
            @Override // X.AbstractC21664519qV
            public final void LJIILL(VETouchPointer vETouchPointer, int i) {
                Effect effectLIZIZ = C1624010sMZ.LIZIZ(this.LL.getStickerApiComponent());
                if (effectLIZIZ != null && C1449600npG.LJFF(effectLIZIZ)) {
                    this.LL.getShortVideoContext().creativeModel.aigcMetadataModel.generationTriggerType = C0LXV.TAP_SCREEN.getType();
                }
            }
        }, 25, 50);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC527980KnE interfaceC527980KnE = (InterfaceC527980KnE) getDiContainer().LJIIL(null, InterfaceC527980KnE.class);
        if (interfaceC527980KnE != null) {
            interfaceC527980KnE.hB0(null);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        InterfaceC524950KiL interfaceC524950KiL;
        super.onStart();
        if (!AIGCPhotoGenerationOptimization.INSTANCE.isEnabled() || (interfaceC524950KiL = this.LLJIJIL) == null) {
            return;
        }
        interfaceC524950KiL.kF(this.LLJILLL);
    }

    public final void reset() {
        getCameraApiComponent().Zl0(new C1663770tOh(true, false, false));
        getStickerApiComponent().bM2();
        Vv0(false);
        C1623740sM8 c1623740sM8X1 = X1();
        C0TBD c0tbd = new C0TBD(null, true, 3);
        c1623740sM8X1.getClass();
        C1623740sM8.LIZ(c0tbd);
    }

    public InterfaceC540250LGt Z1() {
        return this.LLJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final void c3(final NavigationScene navigationScene) {
        if (!C523910Kgf.LIZIZ(navigationScene, C11AM.class)) {
            getCameraApiComponent().Zl0(new C1663770tOh(false, false, false));
            C1665410tRL c1665410tRL = new C1665410tRL(new AwS569S0100000_25(this, 661));
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZ = true;
            navigationScene.LLLLLLLLLL(c1665410tRL, c569760MWg.LIZ());
            navigationScene.LLLIILIL(this, new InterfaceC1737690vJv() { // from class: X.0sOE
                @Override // X.InterfaceC1737690vJv
                public final boolean onBackPressed() {
                    this.LL.getStickerApiComponent().bM2();
                    navigationScene.LLLLLLLZIL(this);
                    return false;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String G2(InterfaceC1624480sNK interfaceC1624480sNK) {
        C1449000noI c1449000noI;
        MutableLiveData mutableLiveDataLJ;
        InterfaceC1625470sOv interfaceC1625470sOvLJII = interfaceC1624480sNK.LJII();
        Effect effectLLILIL = null;
        if (interfaceC1625470sOvLJII != null && (mutableLiveDataLJ = interfaceC1625470sOvLJII.LJ()) != null) {
            c1449000noI = (C1449000noI) mutableLiveDataLJ.getValue();
        } else {
            c1449000noI = null;
        }
        if (c1449000noI == null) {
            q stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null) {
                effectLLILIL = stickerApiComponent.C0().LLILIL();
            }
            if (C1625940sPg.LJIIL(interfaceC1624480sNK, effectLLILIL)) {
                return String.valueOf(interfaceC1624480sNK.LJI() + 1);
            }
            interfaceC1624480sNK.LJI();
            return "";
        }
        if (c1449000noI.LIZLLL) {
            return "";
        }
        return String.valueOf(c1449000noI.LIZJ);
    }

    public final String H2(InterfaceC1624480sNK interfaceC1624480sNK) {
        return C1449370not.LIZ(interfaceC1624480sNK, C1449370not.LIZJ(interfaceC1624480sNK));
    }

    public final void Vv0(boolean z) {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LLILLJJLI);
        if (navigationSceneLIZ == null) {
            return;
        }
        if (z) {
            T2().LIZJ(C0LZ5.LIZ);
            c3(navigationSceneLIZ);
            T2().LIZJ(C0LZ3.LIZ);
        } else {
            T2().LIZJ(C0LZ4.LIZ);
            W1();
            T2().LIZJ(C0LZ2.LIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0sOD] */
    public C1625020sOC(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }
}

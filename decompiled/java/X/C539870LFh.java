package X;

import Y.AObjectS241S0100000_8;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import mn3.e0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0LFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539870LFh extends AbstractC1664470tPp<InterfaceC539890LFj, Unit, Unit> implements InterfaceC539890LFj, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C19A3 LLILLL;
    public final C1DRG LLILZ;
    public InterfaceC531040KsA LLJ;
    public C0LFT LLJI;
    public boolean LLJILJILJ;
    public final InterfaceC539890LFj LLILZIL = this;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0LFR.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), C0MGL.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC531050KsB.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final Function0<Unit> LLJJ = AFwS194S0000000_8.get$arr$(165);
    public final Function0<Unit> LLJJI = AFwS194S0000000_8.get$arr$(166);
    public final C539840LFe LLJJIII = new InterfaceC1655950tC5() { // from class: X.0LFe
        @Override // X.InterfaceC1655950tC5
        public final boolean LIZ(String str) {
            return false;
        }

        @Override // X.InterfaceC1655950tC5
        public final boolean LIZIZ() {
            return false;
        }

        @Override // X.InterfaceC1655950tC5
        public final boolean LIZJ() {
            InterfaceC531040KsA interfaceC531040KsA;
            InterfaceC531040KsA interfaceC531040KsA2;
            if (C539900LFk.LJFF(this.LIZ.getShortVideoContext()) || (!this.LIZ.getShortVideoContext().LJI().isEmpty()) || ((interfaceC531040KsA = this.LIZ.LLJ) != null && interfaceC531040KsA.Fh() && (interfaceC531040KsA2 = this.LIZ.LLJ) != null && interfaceC531040KsA2.r30())) {
                C539870LFh c539870LFh = this.LIZ;
                c539870LFh.F4(new AwS552S0100000_8(c539870LFh, 333));
                return true;
            }
            this.LIZ.B3().fg0();
            EventBus.LIZLLL().LJIILL(new C522440KeI(this.LIZ.B3().oB2(), this.LIZ.B3().VO1(), false));
            this.LIZ.H3();
            return false;
        }

        @Override // X.InterfaceC1655950tC5
        public final void destroy() {
            C201955140j.LIZJ(C1398350mUb.LIZIZ, "CameraVideoTemplaRootComponent destroy");
            this.LIZ.o4();
        }
    };

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C539870LFh.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C539870LFh.class, "videoTemplateSlotBottomApi", "getVideoTemplateSlotBottomApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/IVideoTemplateSlotBottomApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C539870LFh.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C539870LFh.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C539870LFh.class, "vtFlowApi", "getVtFlowApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/VideoTemplateFlowApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C539870LFh.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJIJIIJIL = 8;
    }

    private final void Q3() {
        if (this.LLJI == null && getDiContainer().LIZJ(C0LFT.class)) {
            whenReadyOrThrowInternal(getDiContainer(), C0LFT.class, new AwS587S0100000_8(this, 219));
        }
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZLL.getValue(this, LLJJIJI[0]);
    }

    private final C0MGL v3() {
        return (C0MGL) this.LLJIJIL.getValue(this, LLJJIJI[3]);
    }

    public final C0LFR B3() {
        return (C0LFR) this.LLIZ.getValue(this, LLJJIJI[1]);
    }

    public final InterfaceC531050KsB E3() {
        return (InterfaceC531050KsB) this.LLJILJIL.getValue(this, LLJJIJI[4]);
    }

    public final void e4() {
        if (this.LLJ == null && getDiContainer().LIZJ(InterfaceC531040KsA.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC531040KsA.class, new AwS587S0100000_8(this, 220));
        }
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZLLLIL.getValue(this, LLJJIJI[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJILLL.getValue(this, LLJJIJI[5]);
    }

    public final void o4() {
        InterfaceC531040KsA interfaceC531040KsA = this.LLJ;
        if (interfaceC531040KsA != null) {
            interfaceC531040KsA.YS();
        }
        C194304110c c194304110c = C539880LFi.LIZ;
        if (c194304110c != null) {
            c194304110c.release();
        }
        C539880LFi.LIZ = null;
    }

    private final void O3() {
        e4();
        Q3();
        getRecordControlApi().Hu2().LIZ(this, new AObjectS241S0100000_8(this, 19));
    }

    private final void nD1() {
        getRecordControlApi().cJ0().LIZ(this, new AObjectS241S0100000_8(this, 20));
        getRecordControlApi().sb0().LIZ(this, new AObjectS241S0100000_8(this, 21));
    }

    private final boolean z4() {
        return C298870BnZ.LIZ() && C539900LFk.LIZ(getShortVideoContext());
    }

    public final void H3() {
        View previewView;
        InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent();
        if (!(cameraApiComponent instanceof e0) || cameraApiComponent == null || (previewView = cameraApiComponent.getPreviewView()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, previewView);
    }

    public final void H4() {
        B3().Xf2(false);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (z4()) {
            getCameraApiComponent().xF1().LIZ(this, new AObjectS241S0100000_8(this, 22));
            C0MGL c0mglV3 = v3();
            if (c0mglV3 != null) {
                c0mglV3.TH1(true);
            }
            C0MGL c0mglV32 = v3();
            if (c0mglV32 != null) {
                c0mglV32.lW1(this.LLJJIII);
            }
        }
        uf1(true);
        O3();
        nD1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        uf1(false);
        this.LLJILJILJ = false;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    public final C19A3 getParentScene() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return this.LLJJ;
    }

    public InterfaceC539890LFj q3() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLJJI;
    }

    public final boolean F4(Function0<Unit> function0) {
        C1397580mTM c1397580mTM = new C1397580mTM(C1664590tQ1.LJIIIZ(this));
        c1397580mTM.LJII = false;
        c1397580mTM.LIZ(2131850079);
        C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(function0, (Function0<Unit>) 221));
        new C1397510mTF(c1397580mTM).LIZLLL();
        return true;
    }

    @Override // X.InterfaceC539890LFj
    public void uf1(boolean z) {
        E3().d51(z);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0LFe] */
    public C539870LFh(C19A3 c19a3, C1DRG c1drg) {
        this.LLILLL = c19a3;
        this.LLILZ = c1drg;
    }
}

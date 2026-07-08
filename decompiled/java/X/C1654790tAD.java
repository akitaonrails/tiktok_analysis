package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS14S0101100_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0tAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654790tAD extends AbstractC1664470tPp<InterfaceC531050KsB, Unit, Unit> implements InterfaceC531050KsB, InterfaceC1654890tAN, InterfaceC379610EuV {
    public static final C1654900tAO LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LLILLL;
    public final InterfaceC531050KsB LLILZ = this;
    public final Function0<Unit> LLILZIL = AFwS214S0000000_25.get$arr$(146);
    public final Function0<Unit> LLILZLL = AFwS214S0000000_25.get$arr$(147);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1630630sXF.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1654860tAK.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1631190sY9.class, "lazyControlProgressConfig");
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1649820t2C.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C0LFR.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZ(getDiContainer(), C0MGL.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1642510sqP.class, null);
    public final C11NJ LLJJIJI = new C11NJ();
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 295));

    @Override // X.InterfaceC1654890tAN
    public void LLLLZ() {
        Qv1(true);
    }

    @Override // X.InterfaceC1654890tAN
    public void g0() {
        if (!C1631200sYA.LIZ(O3())) {
            Eq().W9(true);
        } else if (getDiContainer().LIZJ(InterfaceC1649820t2C.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1649820t2C.class, new AwS265S0000000_25(6));
        }
        if (o4()) {
            P4(3, 0L);
        } else {
            O4(3, getShortVideoContext().cameraComponentModel.mMaxDuration, getShortVideoContext().cameraComponentModel.mMaxDuration);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0tAO] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1654790tAD.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1654790tAD.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C2217381BqS(C1654790tAD.class, "lighteningControlProgressComponent", "getLighteningControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C2217381BqS(C1654790tAD.class, "countDownApi", "getCountDownApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/IVideoTemplateCountDownApi;", 0), new C2217381BqS(C1654790tAD.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0), new C2217381BqS(C1654790tAD.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new C2217381BqS(C1654790tAD.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1654790tAD.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/ugctemplate/v2t/IVideoTemplateSlotBottomApi;", 0), new C2217381BqS(C1654790tAD.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0), new C2217381BqS(C1654790tAD.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1654790tAD.class, "filterPanelApiComponent", "getFilterPanelApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterPanelApi;", 0)};
        LLJJIJIL = new Object() { // from class: X.0tAO
        };
        LLJJJIL = 8;
    }

    private final C0MGL E3() {
        return (C0MGL) this.LLJJ.getValue(this, LLJJJ[8]);
    }

    private final InterfaceC1649820t2C Eq() {
        return (InterfaceC1649820t2C) this.LLJILJIL.getValue(this, LLJJJ[5]);
    }

    private final InterfaceC1642510sqP H3() {
        return (InterfaceC1642510sqP) this.LLJJIII.getValue(this, LLJJJ[10]);
    }

    private final C1631190sY9 O3() {
        return (C1631190sY9) this.LLJIJIL.getValue(this, LLJJJ[4]);
    }

    private final C1654800tAE e4() {
        return (C1654800tAE) this.LLJJIJIIJIL.getValue();
    }

    private final q getStickerApiComponent() {
        return (q) this.LLJJI.getValue(this, LLJJJ[9]);
    }

    public final InterfaceC1654860tAK B3() {
        return (InterfaceC1654860tAK) this.LLJI.getValue(this, LLJJJ[3]);
    }

    public final void K4() {
        C1644050sst c1644050sst = new C1644050sst("record end");
        c1644050sst.LJI = true;
        getRecordControlApi().h81(c1644050sst);
    }

    @Override // X.InterfaceC1654890tAN
    public void LLJJJIL() {
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "VideoTemplateCame_FlowComponent onCountDownStart");
        Qv1(false);
    }

    public final InterfaceC1630630sXF Q3() {
        return (InterfaceC1630630sXF) this.LLJ.getValue(this, LLJJJ[2]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLIZLLLIL.getValue(this, LLJJJ[1]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLIZ.getValue(this, LLJJJ[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJILJILJ.getValue(this, LLJJJ[6]);
    }

    public final C0LFR v3() {
        return (C0LFR) this.LLJILLL.getValue(this, LLJJJ[7]);
    }

    private final boolean o4() {
        return getShortVideoContext().shootMode == 16;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        getStickerApiComponent().dN1().LIZ(this, new AObjectS246S0100000_25(this, 171));
        H3().Vm2().observe(this, new AObserverS227S0100000_25(this, 15));
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> o2() {
        return this.LLILZIL;
    }

    public InterfaceC531050KsB q3() {
        return this.LLILZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLILZLL;
    }

    public C1654790tAD(C1DRG c1drg) {
        this.LLILLL = c1drg;
    }

    @Override // X.InterfaceC531050KsB
    public void Qv1(boolean z) {
        v3().Xf2(z);
    }

    @Override // X.InterfaceC531050KsB
    public void d51(boolean z) {
        if (z) {
            B3().x91(this, false);
            C1654800tAE c1654800tAEE4 = e4();
            c1654800tAEE4.LIZIZ.nL1(c1654800tAEE4);
            c1654800tAEE4.LIZIZ.dd1(true);
            return;
        }
        B3().vg1(this);
        C1654800tAE c1654800tAEE42 = e4();
        c1654800tAEE42.LIZIZ.nL1(null);
        c1654800tAEE42.LIZIZ.hF2(true, true);
        c1654800tAEE42.LIZIZ.dd1(false);
    }

    @Override // X.InterfaceC531050KsB
    public void dG1(boolean z) {
        Eq().V2(z);
    }

    public final void z4(C1654800tAE c1654800tAE) {
        c1654800tAE.LJIIIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 17));
        c1654800tAE.LJIIJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 18));
        c1654800tAE.LJIIJJI.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 19));
        C371780Ehs.LIZ(this.LLJJIJI, c1654800tAE.LJIIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 20)));
    }

    public static final void F4(C1654790tAD c1654790tAD, boolean z) {
        if (!z) {
            if (C1448790nnx.LIZ) {
                C1448790nnx.LIZ = false;
                C1448790nnx.LIZJ("record_start");
            }
            c1654790tAD.getRecordControlApi().l60(null);
        }
    }

    private final void P4(int i, long j) {
        getRecordControlApi().bz(false);
        if (C1631200sYA.LIZ(O3())) {
            if (getDiContainer().LIZJ(InterfaceC1649820t2C.class)) {
                whenReadyOrThrowInternal(getDiContainer(), InterfaceC1649820t2C.class, new AwS265S0000000_25(7));
            }
        } else {
            Eq().W9(true);
        }
        AwS14S0101100_25 awS14S0101100_25 = new AwS14S0101100_25(this, i, j, 1);
        if (getPlanCUIApiComponent().LJ2() && getPlanCUIApiComponent().X80() != null) {
            Function1<Function0<Unit>, Unit> function1X80 = getPlanCUIApiComponent().X80();
            if (function1X80 != null) {
                function1X80.invoke(awS14S0101100_25);
                return;
            }
            return;
        }
        awS14S0101100_25.invoke();
    }

    @Override // X.InterfaceC531050KsB
    public void wK2(boolean z, Boolean bool) {
        getPlanCUIApiComponent().m10(z);
        if (bool != null) {
            E3().GN2(bool.booleanValue());
        }
    }

    private final void O4(int i, long j, long j2) {
        getRecordControlApi().bz(false);
        getRecordControlApi().l60(new C1448290nn9(EnumC1448830no1.COUNT_DOWN, i, j2, 8));
        InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) getDiContainer().LJIIL(null, InterfaceC1649820t2C.class);
        if (interfaceC1649820t2C != null) {
            interfaceC1649820t2C.W9(true);
            interfaceC1649820t2C.tv(1);
            interfaceC1649820t2C.dd(true);
            interfaceC1649820t2C.T5();
        }
        getRecordControlApi().z80(j);
    }
}

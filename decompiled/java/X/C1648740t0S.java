package X;

import Y.AObjectS246S0100000_25;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t0S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1648740t0S extends AbstractC1648750t0T<InterfaceC1648780t0W> implements InterfaceC1648780t0W {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LLILZ;
    public final EnumC1653870t8j LLILZIL;
    public final Function2<InterfaceC1653800t8c, InterfaceC1653990t8v, Unit> LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1648740t0S.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1648740t0S.class, "cameraViewVisibilityControl", "getCameraViewVisibilityControl()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/CameraViewControlBridgeApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1648740t0S.class, "conflictsManagementApi", "getConflictsManagementApi()Lcom/ss/android/ugc/aweme/shortvideo/conflicts/RecordConflictsManagementApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1648740t0S.class, "recordApi", "getRecordApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJILJIL = 8;
    }

    @Override // X.InterfaceC1653990t8v
    public void LLLLLILLIL(C1648770t0V c1648770t0V) {
    }

    public InterfaceC1648780t0W o2() {
        return this;
    }

    private final InterfaceC1648590t0D G2() {
        return (InterfaceC1648590t0D) this.LLJ.getValue(this, LLJIJIL[2]);
    }

    private final void Xi() {
        if (getDiContainer().LIZJ(InterfaceC1648570t0B.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1648570t0B.class, new AwS265S0000000_25(11));
        }
    }

    private final InterfaceC1648760t0U w2() {
        return (InterfaceC1648760t0U) this.LLIZLLLIL.getValue(this, LLJIJIL[1]);
    }

    public final InterfaceC1648570t0B H2() {
        return (InterfaceC1648570t0B) this.LLJI.getValue(this, LLJIJIL[3]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJIJIL[0]);
    }

    @Override // X.AbstractC1648750t0T, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
        InterfaceC1648590t0D interfaceC1648590t0DG2 = G2();
        if (interfaceC1648590t0DG2 != null) {
            interfaceC1648590t0DG2.ur0().LIZ(this, new AObjectS246S0100000_25(this, 228));
        }
    }

    @Override // X.InterfaceC1653990t8v
    public EnumC1653870t8j LJIIJJI() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1648750t0T
    public Function2<InterfaceC1653800t8c, InterfaceC1653990t8v, Unit> W1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZ;
    }

    private final void Z1(boolean z) {
        C1648150szV c1648150szV = new C1648150szV(true);
        c1648150szV.LIZLLL = z;
        c1648150szV.LIZJ = 2;
        X1().configSwitchDuration(c1648150szV);
    }

    @Override // X.InterfaceC1653990t8v
    public void LJIILIIL(C1648770t0V c1648770t0V) {
        getShortVideoContext().shootMode = 29;
        boolean z = false;
        w2().mD(new C1658370tFz(false, 15));
        if (getDiContainer().LIZJ(InterfaceC1646220swO.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1646220swO.class, new AwS604S0100000_25(c1648770t0V, 260));
        }
        if (getDiContainer().LIZJ(InterfaceC1647420syK.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC1647420syK.class, new AwS265S0000000_25(12));
        }
        if (c1648770t0V.LIZ == null) {
            z = true;
        }
        Z1(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1648740t0S(C1DRG c1drg, EnumC1653870t8j enumC1653870t8j, Function2<? super InterfaceC1653800t8c, ? super InterfaceC1653990t8v, Unit> function2) {
        super(function2);
        this.LLILZ = c1drg;
        this.LLILZIL = enumC1653870t8j;
        this.LLILZLL = function2;
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648760t0U.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648590t0D.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    }
}

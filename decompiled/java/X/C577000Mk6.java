package X;

import Y.AObjectS241S0100000_8;
import Y.AfS177S0100000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577000Mk6 extends AbstractC2255721DQs<InterfaceC576870Mjt> implements InterfaceC576870Mjt, InterfaceC379610EuV {
    public static final C577020Mk8 LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final InterfaceC576870Mjt LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576770Mjj.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC576630MjV.class, null);
    public final C11NJ LLILZIL = new C11NJ();
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final C557050Lt1 LLIZLLLIL = new C557050Lt1(false);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 754));

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Mk8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C577000Mk6.class, "layoutStateComponent", "getLayoutStateComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutStateApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C577000Mk6.class, "layoutCaptureFlowComponent", "getLayoutCaptureFlowComponent()Lcom/ss/android/ugc/gamora/recorder/layout/CameraLayoutCaptureFlowApiComponent;", 0), new C2217381BqS(C577000Mk6.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C577000Mk6.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0)};
        LLJI = new Object() { // from class: X.0Mk8
        };
        LLJILJIL = 8;
    }

    private final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZLL.getValue(this, LLJIJIL[2]);
    }

    @Override // X.InterfaceC576870Mjt
    public void D62() {
        this.LLIZLLLIL.LIZJ(true);
        C0MGL c0mglLIZJ = getRecordAdapterApi().Vt2().LIZJ();
        if (c0mglLIZJ != null) {
            c0mglLIZJ.GN2(true);
        }
    }

    public final InterfaceC576630MjV X1() {
        return (InterfaceC576630MjV) this.LLILZ.getValue(this, LLJIJIL[1]);
    }

    public final InterfaceC576770Mjj Z1() {
        return (InterfaceC576770Mjj) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    public final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLIZ.getValue(this, LLJIJIL[3]);
    }

    @Override // X.InterfaceC576870Mjt
    public void hQ2() {
        this.LLIZLLLIL.LIZJ(false);
    }

    public final InterfaceC1655950tC5 o2() {
        return (InterfaceC1655950tC5) this.LLJ.getValue();
    }

    private final void w2() {
        C371780Ehs.LIZ(this.LLILZIL, C576730Mjf.LJIILIIL(Z1().r6(), this).LJJIL(new InterfaceC19483011Ki() { // from class: X.0Mk7
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                if (!(obj instanceof C579270Mnl) && !(obj instanceof C579290Mnn)) {
                    return false;
                }
                return true;
            }
        }).LJJLJLI(new AfS177S0100000_8(this, 73)));
        getRecordControlApi().Vt0().LIZ(this, new AObjectS241S0100000_8(this, 76));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        w2();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZIL.dispose();
    }

    public InterfaceC576870Mjt W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C577000Mk6(C1DRG c1drg) {
        this.LL = c1drg;
    }
}

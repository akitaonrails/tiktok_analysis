package X;

import Y.AObjectS241S0100000_8;
import androidx.lifecycle.LiveData;

/* JADX INFO: renamed from: X.0Lgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549490Lgp extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final C549580Lgy LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C550940LjA.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C549540Lgu.class, null);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Lgy] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C549490Lgp.class, "generationComponent", "getGenerationComponent()Lcom/ss/android/ugc/aweme/theater/creation/generation/component/test/AITheaterGenerationStressTestLogicComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C549490Lgp.class, "creationSlotHolder", "getCreationSlotHolder()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/AICreationScene$CreationSlotHolder;", 0)};
        LLILZIL = new Object() { // from class: X.0Lgy
        };
    }

    private final C549540Lgu W1() {
        return (C549540Lgu) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    private final C550940LjA X1() {
        return (C550940LjA) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC549200LgM interfaceC549200LgM;
        LiveData<C548260Leq> liveDataVs;
        super.onCreate();
        InterfaceC549570Lgx<InterfaceC549200LgM> interfaceC549570LgxLIZ = W1().LIZ();
        if (interfaceC549570LgxLIZ == null || (interfaceC549200LgM = (InterfaceC549200LgM) interfaceC549570LgxLIZ.getApi()) == null || (liveDataVs = interfaceC549200LgM.vs()) == null) {
            return;
        }
        liveDataVs.observe(this, new AObjectS241S0100000_8(this, 38));
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C549490Lgp(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void Z1(C548260Leq c548260Leq) {
        X1().Q3(c548260Leq);
    }
}

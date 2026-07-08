package X;

/* JADX INFO: renamed from: X.0sTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628570sTv extends AbstractC2255721DQs<InterfaceC1628780sUG> implements InterfaceC1628780sUG, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1628780sUG LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1628590sTx.class, null);
    public final C05YD<Boolean> LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1628570sTv.class, "chooseMusicComponent", "getChooseMusicComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    private final InterfaceC1628590sTx X1() {
        return (InterfaceC1628590sTx) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.InterfaceC1628780sUG
    public void LIZ() {
        X1().nc1(true);
    }

    @Override // X.InterfaceC1628780sUG
    public C05YD<Boolean> JA1() {
        return this.LLILZ;
    }

    public InterfaceC1628780sUG W1() {
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

    public C1628570sTv(C1DRG c1drg) {
        this.LL = c1drg;
        C1698270uIL c1698270uIL = new C1698270uIL(C540970LJn.LIZ(X1().Vz1()), 6);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ);
        C05YW.LIZ.getClass();
        this.LLILZ = C09IC.LJJIJIL(c1698270uIL, c054gLIZ, C1370905Yd.LIZIZ, Boolean.FALSE);
    }
}

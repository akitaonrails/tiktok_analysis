package X;

import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0tHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659410tHf extends AbstractC2255721DQs<InterfaceC1659440tHi> implements InterfaceC1659440tHi, InterfaceC379610EuV {
    public static final C1659450tHj LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public static final String LLJI;
    public final C1DRG LL;
    public int LLILZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(267));
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0MFK.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(266));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(265));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tHj] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659410tHf.class, "recordTooltipComponent", "getRecordTooltipComponent()Lcom/ss/android/ugc/gamora/recorder/tooltip/RecordTooltipApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = new Object() { // from class: X.0tHj
        };
        LLJ = 8;
        LLJI = "RecordAITheaterComponent";
    }

    public InterfaceC1659440tHi X1() {
        return this;
    }

    @Override // X.InterfaceC1659440tHi
    public void sw1(EnumC2011907uP enumC2011907uP) {
    }

    private final InterfaceC558600LvW W1() {
        return (InterfaceC558600LvW) this.LLILZLL.getValue();
    }

    private final InterfaceC1659430tHh Z1() {
        return (InterfaceC1659430tHh) this.LLILZIL.getValue();
    }

    private final C0MFK o2() {
        return (C0MFK) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final C1659420tHg w2() {
        return (C1659420tHg) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1659440tHi
    public void b2() {
        this.LLILZ++;
    }

    private final void G2() {
        InterfaceC1659430tHh interfaceC1659430tHhZ1;
        if (cs() && (interfaceC1659430tHhZ1 = Z1()) != null) {
            if (this.LLILZ > 0) {
                interfaceC1659430tHhZ1.LJIJ(interfaceC1659430tHhZ1.LJIJI() + this.LLILZ);
                interfaceC1659430tHhZ1.LJII(0);
            } else {
                interfaceC1659430tHhZ1.LJII(interfaceC1659430tHhZ1.LJIIJ() + 1);
            }
            int iLJIJI = interfaceC1659430tHhZ1.LJIJI();
            InterfaceC558600LvW interfaceC558600LvWW1 = W1();
            if (iLJIJI >= (interfaceC558600LvWW1 != null ? interfaceC558600LvWW1.LIZJ() : 1)) {
                interfaceC1659430tHhZ1.LJIIZILJ();
            } else {
                int iLJIIJ = interfaceC1659430tHhZ1.LJIIJ();
                InterfaceC558600LvW interfaceC558600LvWW12 = W1();
                if (iLJIIJ >= (interfaceC558600LvWW12 != null ? interfaceC558600LvWW12.LJIILJJIL() : 3)) {
                    interfaceC1659430tHhZ1.LJIILJJIL();
                    interfaceC1659430tHhZ1.LJII(0);
                }
            }
            C201955140j.LIZLLL(C542840LQs.LIZIZ, LLJI, "update ai theater banner keva");
        }
    }

    @Override // X.InterfaceC1659440tHi
    public boolean cs() {
        return ((Boolean) w2().LLILLL.getValue()).booleanValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C0MFK c0mfkO2 = o2();
        if (c0mfkO2 != null) {
            c0mfkO2.ig(w2());
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        G2();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1659410tHf(C1DRG c1drg) {
        this.LL = c1drg;
    }
}

package X;

import Y.AObjectS246S0100000_25;

/* JADX INFO: renamed from: X.0tD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656610tD9 extends AbstractC2255721DQs<InterfaceC1656640tDC> implements InterfaceC379610EuV, InterfaceC1656640tDC {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final InterfaceC332260D0u<EnumC1656620tDA> LLILLL;
    public final C1656610tD9 LLILZ;
    public final InterfaceC332260D0u<EnumC1656620tDA> LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1656610tD9.class, "recordControlApiComponent", "getRecordControlApiComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = 8;
    }

    private final InterfaceC1648570t0B X1() {
        return (InterfaceC1648570t0B) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    @Override // X.InterfaceC1656640tDC
    public EnumC1656620tDA IK0() {
        return this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1656640tDC
    public void TV0() {
        this.LLILLL.LIZJ(EnumC1656620tDA.NOT_RECORDING);
    }

    public C1656610tD9 W1() {
        return this.LLILZ;
    }

    public InterfaceC332260D0u<EnumC1656620tDA> Z1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1656640tDC
    public /* bridge */ /* synthetic */ C01S9 hx0() {
        return this.LLILZIL;
    }

    public C1656610tD9(C1DRG c1drg) {
        this.LL = c1drg;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC1656620tDA.NOT_RECORDING);
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = this;
        this.LLILZIL = c2252321DDqLIZ;
        X1().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 242));
        X1().lC2().LIZ(this, new AObjectS246S0100000_25(this, 243));
        X1().rr0().LIZ(this, new AObjectS246S0100000_25(this, 244));
        X1().xM2().LIZ(this, new AObjectS246S0100000_25(this, 245));
        X1().kT0().LIZ(this, new AObjectS246S0100000_25(this, 246));
        X1().pU1().LIZ(this, new AObjectS246S0100000_25(this, 247));
        X1().Vt0().LIZ(this, new AObjectS246S0100000_25(this, 248));
    }
}

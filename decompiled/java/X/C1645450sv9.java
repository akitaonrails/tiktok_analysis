package X;

import Y.AObjectS246S0100000_25;

/* JADX INFO: renamed from: X.0sv9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645450sv9 extends AbstractC2255721DQs<InterfaceC1646290swV> implements InterfaceC1646290swV, InterfaceC379610EuV, C0F1U {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final C1DRG LL;
    public String LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC1645470svB LLILZ;
    public final C385670FAf<Boolean> LLILZIL;
    public boolean LLIZ;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650190t2n.class, null);
    public final C1645450sv9 LLIZLLLIL = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645450sv9.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final InterfaceC1650190t2n X1() {
        return (InterfaceC1650190t2n) this.LLILZLL.getValue(this, LLJ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (this.LLILLL) {
            int i = C1645460svA.LIZ[this.LLILZ.ordinal()];
            if (i == 1) {
                X1().xF1().LIZ(this, new AObjectS246S0100000_25(this, 4));
            } else {
                if (i != 2) {
                    throw new C1954807lC();
                }
                this.LLILZIL.LIZ(this, new AObjectS246S0100000_25(this, 5));
            }
        }
    }

    @Override // X.InterfaceC1646290swV
    public String M1() {
        return this.LLILLJJLI;
    }

    public C1645450sv9 W1() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1646290swV
    public boolean a20() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1646290swV
    public void GR0(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.InterfaceC1646290swV
    public void n3(String str) {
        this.LLILLJJLI = str;
    }

    public C1645450sv9(C1DRG c1drg, String str, boolean z, EnumC1645470svB enumC1645470svB, C385670FAf<Boolean> c385670FAf) {
        this.LL = c1drg;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = enumC1645470svB;
        this.LLILZIL = c385670FAf;
    }
}

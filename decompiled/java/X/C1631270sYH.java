package X;

import Y.AObjectS246S0100000_25;

/* JADX INFO: renamed from: X.0sYH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631270sYH extends AbstractC2255721DQs<InterfaceC1631290sYJ> implements InterfaceC1631290sYJ, InterfaceC379610EuV, C0F1U {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final EnumC1641560sos LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650190t2n.class, null);
    public final C1631270sYH LLILZ = this;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1631270sYH.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CommonCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    private final InterfaceC1650190t2n X1() {
        return (InterfaceC1650190t2n) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        int i = C1631260sYG.LIZ[this.LLILLJJLI.ordinal()];
        if (i == 1) {
            X1().xF1().LIZ(this, new AObjectS246S0100000_25(this, 217));
            return;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        C1453870nw9 c1453870nw9 = (C1453870nw9) getDiContainer().LJIIL(null, C1453870nw9.class);
        if (c1453870nw9 != null) {
            c1453870nw9.LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS246S0100000_25(this, 218));
        } else {
            getDiContainer().LJIIJ(InterfaceC1631280sYI.class);
            getDiContainer().LJIIL(null, InterfaceC1649820t2C.class);
        }
    }

    public C1631270sYH W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1631270sYH(C1DRG c1drg, EnumC1641560sos enumC1641560sos) {
        this.LL = c1drg;
        this.LLILLJJLI = enumC1641560sos;
    }
}

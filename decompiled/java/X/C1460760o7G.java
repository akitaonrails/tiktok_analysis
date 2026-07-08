package X;

import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0o7G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1460760o7G extends C1462970oAp implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public static final int LLLIIL;
    public final C1DRG LLLFF;
    public final C19A3 LLLFFI;
    public final int LLLFZ;
    public final int LLLI;
    public final InterfaceC1462140o9U LLLII;
    public final C01GW LLLIIII;
    public final InterfaceC1731706qJ LLLIIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1460760o7G.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIL = 8;
    }

    private final C0FVY X1() {
        return (C0FVY) this.LLLIIIIL.getValue(this, LLLIIIL[0]);
    }

    private final C1462080o9O Z1() {
        return (C1462080o9O) this.LLLIIII.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W1();
        mF1(Z1());
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLLFF;
    }

    public C1460760o7G(C1DRG c1drg, C19A3 c19a3, int i, int i2, InterfaceC1462140o9U interfaceC1462140o9U) {
        super(c1drg);
        this.LLLFF = c1drg;
        this.LLLFFI = c19a3;
        this.LLLFZ = i;
        this.LLLI = i2;
        this.LLLII = interfaceC1462140o9U;
        this.LLLIIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 189));
        this.LLLIIIIL = new C1466810oH1(this, 3);
        C1462080o9O c1462080o9OZ1 = Z1();
        c1462080o9OZ1.LLJJJJLIIL = (InterfaceC1461390o8H) getDiContainer().LJII(InterfaceC1461390o8H.class, null);
        c1462080o9OZ1.LLJJL = (C121O) getDiContainer().LJII(C121O.class, null);
        c1462080o9OZ1.LLLIIL = (InterfaceC384890F7f) getDiContainer().LJII(InterfaceC384890F7f.class, null);
        c19a3.add(i, c1462080o9OZ1, "EditStickerScene");
    }
}

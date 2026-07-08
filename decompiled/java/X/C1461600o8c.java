package X;

/* JADX INFO: renamed from: X.0o8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461600o8c implements InterfaceC1660130tIp<C1678290tm7>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final AnonymousClass0951 LLILLJJLI = C09IC.LIZIZ(C1BNE.LIZ(new C1461630o8f()));
    public final C1664740tQG LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461600o8c.class, "editToolBarClickCallbacksApiComponent", "getEditToolBarClickCallbacksApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/business/EditToolBarClickCallbacksApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        InterfaceC1455360nyY interfaceC1455360nyY = (InterfaceC1455360nyY) this.LLILLL.getValue(this, LLILZ[0]);
        if (interfaceC1455360nyY != null) {
            interfaceC1455360nyY.Qh2();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<InterfaceC1461640o8g<C1678290tm7>> getState() {
        return this.LLILLJJLI;
    }

    public C1461600o8c(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455360nyY.class, null);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}

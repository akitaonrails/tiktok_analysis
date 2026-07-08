package X;

/* JADX INFO: renamed from: X.0tIE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659760tIE implements InterfaceC1660130tIp<C1659900tIS>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final InterfaceC332260D0u<C1647450syN> LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659760tIE.class, "beautyComponent", "getBeautyComponent()Lcom/ss/android/ugc/aweme/social/creation/record/launch/component/SocialBeautyApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        ((InterfaceC1647320syA) this.LLILLJJLI.getValue(this, LLILZ[0])).dh2();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final /* bridge */ /* synthetic */ C05YD getState() {
        return this.LLILLL;
    }

    public C1659760tIE(C1DRG c1drg) {
        this.LL = c1drg;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1647320syA.class, null);
        this.LLILLJJLI = c1664750tQHLIZ;
        this.LLILLL = ((InterfaceC1647320syA) c1664750tQHLIZ.getValue(this, LLILZ[0])).q52();
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}

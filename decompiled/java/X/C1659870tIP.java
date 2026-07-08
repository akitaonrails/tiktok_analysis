package X;

/* JADX INFO: renamed from: X.0tIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659870tIP implements InterfaceC1660130tIp<C1659930tIV>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final AnonymousClass0951 LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659870tIP.class, "socialMusicApiComponent", "getSocialMusicApiComponent()Lcom/ss/android/ugc/aweme/social/creation/record/launch/component/SocialMusicApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        ((InterfaceC1628780sUG) this.LLILLJJLI.getValue(this, LLILZ[0])).LIZ();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C1659880tIQ> getState() {
        return this.LLILLL;
    }

    public C1659870tIP(C1DRG c1drg) {
        this.LL = c1drg;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1628780sUG.class, null);
        this.LLILLJJLI = c1664750tQHLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        C1698270uIL c1698270uIL = new C1698270uIL(((InterfaceC1628780sUG) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).JA1(), 18);
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ);
        C05YW.LIZ.getClass();
        this.LLILLL = C09IC.LJJIJIL(c1698270uIL, c054gLIZ, C1370905Yd.LIZIZ, new C1659880tIQ(((InterfaceC1628780sUG) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).JA1().getValue().booleanValue()));
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}

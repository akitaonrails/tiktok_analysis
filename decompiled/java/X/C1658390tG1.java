package X;

/* JADX INFO: renamed from: X.0tG1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658390tG1 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1DRG LL;
    public final AnonymousClass0951 LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1658390tG1.class, "toolbarComponent", "getToolbarComponent()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/toolbar/ToolbarApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1658390tG1.class, "guideComponent", "getGuideComponent()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/CameraGuideApi;", 0);
        c09r3.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1658390tG1(C1DRG c1drg) {
        this.LL = c1drg;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1658490tGB.class, null);
        C1664750tQH c1664750tQHLIZ2 = C1664770tQJ.LIZ(c1drg, InterfaceC1657420tES.class, null);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        C414301jJ c414301jJ = new C414301jJ(((InterfaceC1658490tGB) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0])).getState(), ((InterfaceC1657420tES) c1664750tQHLIZ2.getValue(this, interfaceC2217461BqaArr[1])).getState(), new C1658410tG3(null));
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ);
        C05YW.LIZ.getClass();
        this.LLILLJJLI = C09IC.LJJIJIL(c414301jJ, c054gLIZ, C1370905Yd.LIZIZ, new C1658500tGC(null, null, 7));
    }
}

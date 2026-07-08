package X;

/* JADX INFO: renamed from: X.0tG4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658420tG4 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1698260uIK LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1658420tG4.class, "backComponent", "getBackComponent()Lcom/ss/android/ugc/aweme/social/creation/record/back/BackComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1658420tG4.class, "tabConfigs", "getTabConfigs()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/tabs/TabConfigurationSource;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1658420tG4(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, C1446070njZ.class, null);
        this.LLILLL = new C1698260uIK(((C1657360tEM) C1664770tQJ.LIZ(c1drg, C1657360tEM.class, null).getValue(this, LLILZ[1])).LLILZ, this, 5);
    }
}

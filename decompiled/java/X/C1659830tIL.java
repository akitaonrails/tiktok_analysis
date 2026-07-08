package X;

/* JADX INFO: renamed from: X.0tIL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1659830tIL implements InterfaceC1660130tIp<C1659940tIW>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final AnonymousClass0951 LLILLL = C09IC.LIZIZ(C1BNE.LIZ(new InterfaceC1461640o8g<C1659940tIW>() { // from class: X.0tIM
    }));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1659830tIL.class, "cameraComponent", "getCameraComponent()Lcom/ss/android/ugc/aweme/social/creation/record/launch/component/SocialCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        ((InterfaceC1659790tIH) this.LLILLJJLI.getValue(this, LLILZ[0])).Cw2();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C1659840tIM> getState() {
        return this.LLILLL;
    }

    public C1659830tIL(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, InterfaceC1659790tIH.class, null);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}

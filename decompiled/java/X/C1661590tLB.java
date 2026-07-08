package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0tLB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661590tLB implements InterfaceC1660130tIp<C1678280tm6>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C05YD<C1661600tLC> LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1661590tLB.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1661590tLB.class, "editToolBarClickCallbacksApiComponent", "getEditToolBarClickCallbacksApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/business/EditToolBarClickCallbacksApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1661590tLB.class, "musicApi", "getMusicApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditMusicApi;", 0);
        c09r3.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        InterfaceC1455360nyY interfaceC1455360nyY = (InterfaceC1455360nyY) this.LLILLJJLI.getValue(this, LLILZ[1]);
        if (interfaceC1455360nyY != null) {
            interfaceC1455360nyY.Ch0();
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<C1661600tLC> getState() {
        return this.LLILLL;
    }

    public C1661590tLB(C1DRG c1drg) {
        C05YD<C1661600tLC> c05ydLIZ;
        InterfaceC332260D0u<Boolean> interfaceC332260D0u;
        this.LL = c1drg;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455360nyY.class, null);
        C1664740tQG c1664740tQGLIZIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1422030n6n.class, null);
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        InterfaceC1422030n6n interfaceC1422030n6n = (InterfaceC1422030n6n) c1664740tQGLIZIZ.getValue(this, interfaceC2217461BqaArr[2]);
        C1422020n6m c1422020n6m = interfaceC1422030n6n instanceof C1422020n6m ? (C1422020n6m) interfaceC1422030n6n : null;
        if (c1422020n6m != null && (interfaceC332260D0u = c1422020n6m.LLILLL) != null) {
            C1698270uIL c1698270uIL = new C1698270uIL(interfaceC332260D0u, 19);
            C1DFH c1dfh = C0PEM.LIZ;
            C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
            C05YW.LIZ.getClass();
            c05ydLIZ = C09IC.LJJIJIL(c1698270uIL, c054gLIZ, C1370905Yd.LIZIZ, new C1661600tLC(false));
        } else {
            c05ydLIZ = C1BNE.LIZ(new C1661600tLC(C1430550nKX.LIZ((VideoPublishEditModel) c1664750tQHLIZ.getValue(this, interfaceC2217461BqaArr[0]))));
        }
        this.LLILLL = c05ydLIZ;
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}

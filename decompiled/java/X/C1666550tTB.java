package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0tTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666550tTB implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1698260uIK LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1666550tTB.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1666550tTB.class, "socialEditTopComponent", "getSocialEditTopComponent()Lcom/ss/android/ugc/aweme/social/creation/edit/component/toparea/SocialEditTopUIApi;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1666550tTB(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, InterfaceC1456870o0z.class, null);
        this.LLILLL = c1664750tQHLIZ;
        this.LLILZ = new C1698260uIK(((InterfaceC1456870o0z) c1664750tQHLIZ.getValue(this, LLILZIL[1])).getState(), this, 11);
    }
}

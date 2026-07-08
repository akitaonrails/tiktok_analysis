package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MmO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578420MmO implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664750tQH LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C578420MmO.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C578420MmO.class, "imageEditPageData", "getImageEditPageData()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C578420MmO.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C578420MmO.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public C578420MmO(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, C1439810nZT.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1452360nti.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
    }
}

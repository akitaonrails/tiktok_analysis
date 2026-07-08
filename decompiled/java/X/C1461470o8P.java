package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0o8P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461470o8P implements InterfaceC1660130tIp<C1678240tm2>, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C2252321DDq LLILLJJLI = C1BNE.LIZ(new C1461630o8f());
    public final C1664740tQG LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461470o8P.class, "storyEditFilterApi", "getStoryEditFilterApi()Lcom/ss/android/ugc/aweme/social/creation/api/edit/StoryEditFilterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1461470o8P.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1461470o8P.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        C1664740tQG c1664740tQG = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        InterfaceC1453020num interfaceC1453020num = (InterfaceC1453020num) c1664740tQG.getValue(this, interfaceC2217461BqaArr[0]);
        if (interfaceC1453020num != null) {
            interfaceC1453020num.H52(true);
        }
        C1456140nzo.LIZIZ((InterfaceC1455860nzM) this.LLILZ.getValue(this, interfaceC2217461BqaArr[1]), false, false, false, false, 12);
        C1402610mbT.LJJII((VideoPublishEditModel) this.LLILZIL.getValue(this, interfaceC2217461BqaArr[2]), null, false, 14);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<InterfaceC1461640o8g<C1678240tm2>> getState() {
        return this.LLILLJJLI;
    }

    public C1461470o8P(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453020num.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}

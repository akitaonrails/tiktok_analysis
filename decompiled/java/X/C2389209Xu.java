package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.09Xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2389209Xu implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public InterfaceC1452170ntP LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2389209Xu.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C2389209Xu.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C2389209Xu.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public final VideoPublishEditModel LIZ() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C2389209Xu(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, C19GS.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
    }
}

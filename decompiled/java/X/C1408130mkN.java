package X;

import Y.AObjectS245S0100000_22;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408130mkN extends AbstractC2255721DQs<InterfaceC1408140mkO> implements InterfaceC1408140mkO, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453200nv4.class, null);
    public String LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1408130mkN.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1408130mkN.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1408130mkN.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZ = 8;
    }

    public InterfaceC1408140mkO W1() {
        return this;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    private final InterfaceC1453200nv4 X1() {
        return (InterfaceC1453200nv4) this.LLILZ.getValue(this, LLILZLL[2]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        JY0().ww2().observe(this, new AObjectS245S0100000_22(this, 113));
    }

    @Override // X.InterfaceC1408140mkO
    public void qc() {
        LiveEvent<AVMusic> liveEventB7;
        InterfaceC1453200nv4 interfaceC1453200nv4X1 = X1();
        if (interfaceC1453200nv4X1 == null || (liveEventB7 = interfaceC1453200nv4X1.b7()) == null) {
            return;
        }
        liveEventB7.LIZ(this, new AObjectS245S0100000_22(this, 112));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1408130mkN(C1DRG c1drg) {
        this.LL = c1drg;
    }
}

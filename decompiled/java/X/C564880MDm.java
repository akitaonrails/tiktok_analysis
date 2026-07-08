package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564880MDm extends AbstractC2255721DQs<InterfaceC1460680o78> implements InterfaceC1460680o78, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final InterfaceC1460680o78 LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453630nvl.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C564880MDm.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C564880MDm.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLIZ = 8;
    }

    private final InterfaceC1453630nvl W1() {
        return (InterfaceC1453630nvl) this.LLILZIL.getValue(this, LLILZLL[1]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.InterfaceC1460680o78
    public boolean RL2() {
        return getEditModel().getAILivePhotoModel().pageDataCache.hasShowBanner || C0MDL.LIZIZ(getEditModel()) || C0MDL.LJIIIIZZ(getEditModel()) || C0MDL.LJIIIZ(getEditModel()) || getEditModel().getAILivePhotoModel().hasAutoShow;
    }

    public InterfaceC1460680o78 X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C564880MDm(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
    }
}

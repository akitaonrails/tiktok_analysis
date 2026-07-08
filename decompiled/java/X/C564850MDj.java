package X;

import Y.AObserverS212S0100000_8;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564850MDj extends AbstractC2255721DQs<C0MEF> implements C0MEF, InterfaceC379610EuV {
    public static final C0MEM LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC564820MDg.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564970MDv.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0MEI.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0MEH.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460680o78.class, null);

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0MEM] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C564850MDj.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C564850MDj.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0), new C2217381BqS(C564850MDj.class, "aiLivePromptApi", "getAiLivePromptApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePromptApi;", 0), new C2217381BqS(C564850MDj.class, "imageAILiveToolbarApi", "getImageAILiveToolbarApi()Lcom/ss/android/ugc/gamora/editor/ailive/ImageAILiveToolbarApi;", 0), new C2217381BqS(C564850MDj.class, "imageAILiveCoreApi", "getImageAILiveCoreApi()Lcom/ss/android/ugc/gamora/editor/ailive/ImageAILiveCoreApi;", 0), new C2217381BqS(C564850MDj.class, "aiLiveQuotaApi", "getAiLiveQuotaApi()Lcom/ss/android/ugc/gamora/editor/ailive/quota/AILiveQuotaLogicApi;", 0), new C2217381BqS(C564850MDj.class, "aiLiveGuideApi", "getAiLiveGuideApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveGuideApi;", 0)};
        LLJI = new Object() { // from class: X.0MEM
        };
        LLJILJIL = 8;
    }

    public C0MEF o2() {
        return this;
    }

    private final C0MEI G2() {
        return (C0MEI) this.LLIZ.getValue(this, LLJIJIL[4]);
    }

    private final InterfaceC564970MDv H2() {
        return (InterfaceC564970MDv) this.LLILZLL.getValue(this, LLJIJIL[3]);
    }

    private final InterfaceC1460680o78 W1() {
        return (InterfaceC1460680o78) this.LLJ.getValue(this, LLJIJIL[6]);
    }

    private final InterfaceC1451050nrb w2() {
        return (InterfaceC1451050nrb) this.LLILZ.getValue(this, LLJIJIL[1]);
    }

    public final InterfaceC564820MDg X1() {
        return (InterfaceC564820MDg) this.LLILZIL.getValue(this, LLJIJIL[2]);
    }

    public final C0MEH Z1() {
        return (C0MEH) this.LLIZLLLIL.getValue(this, LLJIJIL[5]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    private final void T2() {
        c3(C0MDL.LJII(getEditModel()));
    }

    private final void Xi() {
        C0EHK.LJIIJ(w2().gJ(), this, new AObserverS212S0100000_8(this, 58));
    }

    @Override // X.C0MEF
    public C385670FAf<Boolean> Sf() {
        return H2().Sf();
    }

    public final void W2() {
        VideoPublishEditModel editModel = getEditModel();
        if (C0MDL.LJIIIZ(editModel)) {
            editModel.getAILivePhotoModel().hasAutoShow = true;
            Os(new C565000MDy(0));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        T2();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1453630nvl
    public void Os(AbstractC564980MDw abstractC564980MDw) {
        C0MEH c0mehZ1 = Z1();
        if (c0mehZ1 != null && c0mehZ1.Of0()) {
            return;
        }
        abstractC564980MDw.getClass();
        if ((abstractC564980MDw instanceof C565010MDz) && ((C565010MDz) abstractC564980MDw).LIZ == EnumC564910MDp.TOOLBAR) {
            getEditModel().getAILivePhotoModel().mobParam.generateSidebarType = 1;
            H2().hM(abstractC564980MDw);
            C564410MBr c564410MBr = C564410MBr.LIZ;
            VideoPublishEditModel editModel = getEditModel();
            c564410MBr.getClass();
            C564410MBr.LJIIIIZZ(editModel);
            return;
        }
        G2().Kb2(abstractC564980MDw);
    }

    public final void c3(PromptModel promptModel) {
        new AwS587S0100000_8(promptModel, 370).invoke(getEditModel().getAILivePhotoModel().pageDataCache);
    }

    public C564850MDj(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
    }
}

package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564870MDl extends AbstractC2255721DQs<InterfaceC1455680nz4> implements InterfaceC1455680nz4, InterfaceC379610EuV {
    public static final C0MEN LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC1455680nz4 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564900MDo.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C0MEL.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0ME3.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0ME1.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C0MEG.class, null);

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0MEN] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C564870MDl.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C564870MDl.class, "innerRootApi", "getInnerRootApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveInnerRootApi;", 0), new C2217381BqS(C564870MDl.class, "aiLiveEntranceApi", "getAiLiveEntranceApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveEntranceApi;", 0), new C2217381BqS(C564870MDl.class, "aiLiveDialogApi", "getAiLiveDialogApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveDialogApi;", 0), new C2217381BqS(C564870MDl.class, "aiLiveDraftApi", "getAiLiveDraftApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveDraftApi;", 0), new C2217381BqS(C564870MDl.class, "aiLiveResultTipApi", "getAiLiveResultTipApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveResultTipApi;", 0)};
        LLJ = new Object() { // from class: X.0MEN
        };
        LLJIJIL = 8;
        C1446930nkx.LIZIZ("tiktok_ai_live_photo", new C559590Lx7());
        C1446930nkx.LJI("tiktok_ai_live_photo", AFwS239S0000000_8.get$arr$(186));
    }

    private final InterfaceC564900MDo G2() {
        return (InterfaceC564900MDo) this.LLILZ.getValue(this, LLJI[1]);
    }

    private final C0ME3 W1() {
        return (C0ME3) this.LLILZLL.getValue(this, LLJI[3]);
    }

    private final C0ME1 X1() {
        return (C0ME1) this.LLIZ.getValue(this, LLJI[4]);
    }

    private final C0MEL Z1() {
        return (C0MEL) this.LLILZIL.getValue(this, LLJI[2]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJI[0]);
    }

    private final C0MEG o2() {
        return (C0MEG) this.LLIZLLLIL.getValue(this, LLJI[5]);
    }

    @Override // X.InterfaceC1455680nz4
    public void Oq2() {
        ProgressModel progressModelLIZIZ = getEditModel().getAILivePhotoModel().LJIIIIZZ() ? getEditModel().getAILivePhotoModel().LIZIZ() : getEditModel().getAILivePhotoModel().lastFailProgressModel;
        if (progressModelLIZIZ != null) {
            o2().Od2(Integer.valueOf(progressModelLIZIZ.errorCode), progressModelLIZIZ.step, progressModelLIZIZ.failReasonMsg);
        }
    }

    @Override // X.InterfaceC1455680nz4
    public void Ym() {
        G2().Ym();
    }

    @Override // X.InterfaceC1455680nz4
    public C385670FAf<C529150Kp7> Zn() {
        return G2().Zn();
    }

    @Override // X.InterfaceC1455680nz4
    public void bt() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_ai_alive_retry_strategy", true) > 0) {
            G2().bt();
        } else {
            G2().Sc(false);
        }
    }

    @Override // X.InterfaceC1455680nz4
    public LiveEvent<Unit> xh() {
        return G2().xh();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public InterfaceC1455680nz4 w2() {
        return this.LLILLJJLI;
    }

    public C564870MDl(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1455680nz4
    public void H51(Function0<Unit> function0) {
        if (function0 == null) {
            W1().WC2();
        } else {
            W1().uh0(new AwS552S0100000_8(function0, (Function0<Unit>) 585));
        }
    }

    @Override // X.InterfaceC1453630nvl
    public void Os(AbstractC564980MDw abstractC564980MDw) {
        Z1().Os(abstractC564980MDw);
    }

    @Override // X.InterfaceC1455680nz4
    public void Sc(boolean z) {
        G2().Sc(false);
    }

    @Override // X.InterfaceC1455680nz4
    public void h6(Function0<Unit> function0) {
        X1().h6(new AwS552S0100000_8(function0, (Function0<Unit>) 584));
    }

    @Override // X.InterfaceC1455680nz4
    public void nh(boolean z) {
        G2().nh(z);
    }

    @Override // X.InterfaceC1455680nz4
    public void Qu(boolean z, Function0<Unit> function0) {
        W1().Qu(z, function0);
    }
}

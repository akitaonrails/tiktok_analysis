package X;

import Y.AfS177S0100000_8;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MCV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MCV extends AbstractC2255721DQs<C0MD7> implements C0MD7, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C11NJ LLILLL = new C11NJ();
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(258));
    public final C11PQ<PromptRequestState> LLILZIL = new C11PQ<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MCV.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = 8;
    }

    public C0MD7 W1() {
        return this;
    }

    private final AILivePhotoPromptManager X1() {
        return (AILivePhotoPromptManager) this.LLILZ.getValue();
    }

    @Override // X.C0MD7
    public C11NZ<PromptRequestState> Xn() {
        C11PQ<PromptRequestState> c11pq = this.LLILZIL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    @Override // X.C0MD7
    public void init() {
        C201955140j.LIZLLL(C0L76.LIZIZ, "AILivePresetPromptV2Component", "init");
        C11NJ c11nj = this.LLILLL;
        C11PQ<PromptRequestState> c11pq = X1().LJII;
        c11pq.getClass();
        c11nj.LIZ(new C19475711Hn(c11pq).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS177S0100000_8(this, 29)));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_live_new_prompt_page_default_prompt_enable", true, false)) {
            X1().LJIIJ();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C11NJ c11nj = this.LLILLL;
        if (!c11nj.LLILLJJLI) {
            c11nj.dispose();
        }
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

    public C0MCV(C1DRG c1drg) {
        this.LL = c1drg;
    }
}

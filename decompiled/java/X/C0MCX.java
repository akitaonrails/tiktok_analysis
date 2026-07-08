package X;

import Y.AfS177S0100000_8;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.ailive.BlipData;
import com.ss.android.ugc.aweme.creative.model.ailive.PageDataCache;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestState;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptRequestStateType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.prompt.AILivePhotoPromptManager;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MCX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MCX extends AbstractC2255721DQs<InterfaceC564820MDg> implements InterfaceC564820MDg, InterfaceC379610EuV {
    public static final C564510MCb LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 581));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 582));
    public final C11NJ LLILZLL = new C11NJ();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(270));
    public final C11PQ<PromptRequestState> LLIZLLLIL = new C11PQ<>();
    public final C11PQ<PromptRequestState> LLJ = new C11PQ<>();
    public final C11PQ<PromptModel> LLJI = new C11PQ<>();
    public boolean LLJIJIL;
    public InterfaceC420801kM LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0MCb] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MCX.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0MCX.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};
        LLJILJILJ = new Object() { // from class: X.0MCb
        };
        LLJJ = 8;
    }

    public InterfaceC564820MDg W1() {
        return this;
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLL.getValue(this, LLJILLL[1]);
    }

    public final NLEModel LLZ() {
        return (NLEModel) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC564820MDg
    public C11NZ<PromptRequestState> Xn() {
        C11PQ<PromptRequestState> c11pq = this.LLJ;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC564820MDg
    public void YU1() {
        C1403010mc7.LIZ.getMusicService().al();
        C11NZ<String> c11nzLJ = C2275708vr.LJ();
        if (c11nzLJ == null) {
            C559010LwB.LIZ("AILivePromptComponent", "uploadFrameTask null");
            return;
        }
        InterfaceC420801kM interfaceC420801kM = this.LLJILJIL;
        if (interfaceC420801kM != null) {
            this.LLILZLL.LIZJ(interfaceC420801kM);
        }
        InterfaceC420801kM interfaceC420801kMLJJLJLI = c11nzLJ.LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS177S0100000_8(this, 37));
        this.LLJILJIL = interfaceC420801kMLJJLJLI;
        this.LLILZLL.LIZ(interfaceC420801kMLJJLJLI);
    }

    @Override // X.InterfaceC564820MDg
    public C11NZ<PromptModel> bw2() {
        C11PQ<PromptModel> c11pq = this.LLJI;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJILLL[0]);
    }

    public final NLEEditor o2() {
        return (NLEEditor) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC564820MDg
    public C11NZ<PromptRequestState> q92() {
        C11PQ<PromptRequestState> c11pq = this.LLIZLLLIL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    public final AILivePhotoPromptManager w2() {
        return (AILivePhotoPromptManager) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC564820MDg
    public void Eo2() {
        if (Sr0()) {
            a81();
        }
        if (zV1()) {
            YU1();
        }
    }

    @Override // X.InterfaceC564820MDg
    public void Fc1() {
        PageDataCache pageDataCache = getEditModel().getAILivePhotoModel().pageDataCache;
        pageDataCache.blip = new BlipData("", "", "");
        pageDataCache.gptPromptRequestState = new PromptRequestState(null, null, false, null, 15, null);
        w2().LIZLLL(null, pageDataCache.blip, null, pageDataCache.gptPromptRequestState);
        C559010LwB.LIZIZ("AILivePromptComponent", "clearGptPrompt");
    }

    @Override // X.InterfaceC564820MDg
    public boolean QZ0() {
        List<PromptModel> list;
        return zV1() || (list = getEditModel().getAILivePhotoModel().pageDataCache.gptPromptRequestState.prompts) == null || list.isEmpty();
    }

    @Override // X.InterfaceC564820MDg
    public void Qr0() {
        PromptRequestState promptRequestStateLJLZ;
        AILivePhotoPromptManager aILivePhotoPromptManagerW2 = w2();
        if (!aILivePhotoPromptManagerW2.LJ.LIZJ().booleanValue()) {
            aILivePhotoPromptManagerW2.LJ.LJII(Boolean.TRUE);
            return;
        }
        PromptRequestState promptRequestStateLJLZ2 = aILivePhotoPromptManagerW2.LJI.LJLZ();
        if ((promptRequestStateLJLZ2 == null || promptRequestStateLJLZ2.state != PromptRequestStateType.FAIL) && ((promptRequestStateLJLZ = aILivePhotoPromptManagerW2.LJII.LJLZ()) == null || promptRequestStateLJLZ.state != PromptRequestStateType.FAIL)) {
            return;
        }
        aILivePhotoPromptManagerW2.LJIIJJI();
    }

    @Override // X.InterfaceC564820MDg
    public void R72() {
        w2().LJIIJJI();
    }

    @Override // X.InterfaceC564820MDg
    public boolean Sr0() {
        List<PromptModel> list = getEditModel().getAILivePhotoModel().pageDataCache.presetPromptRequestState.prompts;
        return list == null || list.isEmpty() || this.LLJIJIL;
    }

    @Override // X.InterfaceC564820MDg
    public void Xi() {
        w2().LJ(this, this.LLJIJIL);
        if (C564500MCa.LIZ() && Sr0()) {
            C11NJ c11nj = this.LLILZLL;
            C11PQ<PromptRequestState> c11pq = w2().LJII;
            c11pq.getClass();
            c11nj.LIZ(new C19475711Hn(c11pq).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS177S0100000_8(this, 33)));
            if (this.LLJIJIL) {
                C11NJ c11nj2 = this.LLILZLL;
                C11PQ<PromptModel> c11pq2 = w2().LJIIIIZZ;
                c11pq2.getClass();
                c11nj2.LIZ(new C19475711Hn(c11pq2).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS177S0100000_8(this, 34)));
            }
        }
        if (QZ0()) {
            C11NJ c11nj3 = this.LLILZLL;
            C11PQ<PromptRequestState> c11pq3 = w2().LJI;
            c11pq3.getClass();
            c11nj3.LIZ(new C19475711Hn(c11pq3).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS177S0100000_8(this, 35)));
        }
        if (zV1()) {
            C11NJ c11nj4 = this.LLILZLL;
            C11PQ<BlipData> c11pq4 = w2().LJFF;
            c11pq4.getClass();
            c11nj4.LIZ(new C19475711Hn(c11pq4).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new AfS177S0100000_8(this, 36)));
        }
    }

    @Override // X.InterfaceC564820MDg
    public void a81() {
        if (C564500MCa.LIZ()) {
            w2().LJIIJ();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C11NJ c11nj = this.LLILZLL;
        if (!c11nj.LLILLJJLI) {
            c11nj.dispose();
        }
    }

    @Override // X.InterfaceC564820MDg
    public boolean zV1() {
        String str;
        BlipData blipData = getEditModel().getAILivePhotoModel().pageDataCache.blip;
        return blipData == null || (str = blipData.blip) == null || str.length() == 0;
    }

    public final C11NJ X1() {
        return this.LLILZLL;
    }

    public final boolean Z1() {
        return this.LLJIJIL;
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

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public C0MCX(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC564820MDg
    public void CQ(boolean z) {
        PageDataCache pageDataCache = getEditModel().getAILivePhotoModel().pageDataCache;
        w2().LIZLLL(pageDataCache.curPrompt, pageDataCache.blip, pageDataCache.presetPromptRequestState, pageDataCache.gptPromptRequestState);
        this.LLJIJIL = z;
    }

    public final void G2(boolean z) {
        this.LLJIJIL = z;
    }
}

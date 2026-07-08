package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;

/* JADX INFO: renamed from: X.0E9P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9P implements C0EMV, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E9P.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0E9P(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1446740nke.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        AudioEffectParam veAudioEffectParam;
        InterfaceC1455860nzM interfaceC1455860nzM;
        AbstractC1452680nuE abstractC1452680nuEGc;
        VideoPublishEditModel videoPublishEditModel = c0emo.LIZJ;
        if (videoPublishEditModel != null && (veAudioEffectParam = videoPublishEditModel.getVeAudioEffectParam()) != null && (interfaceC1455860nzM = (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLILLL[0])) != null && (abstractC1452680nuEGc = interfaceC1455860nzM.gc()) != null) {
            abstractC1452680nuEGc.LJJIII(veAudioEffectParam);
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }
}

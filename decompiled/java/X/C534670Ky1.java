package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;

/* JADX INFO: renamed from: X.0Ky1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534670Ky1 extends AbstractC2255721DQs<InterfaceC534680Ky2> implements InterfaceC534680Ky2, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC534680Ky2 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C534670Ky1.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    private final VideoPublishEditModel X1() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZ[0]);
    }

    @Override // X.InterfaceC534680Ky2
    public void oj0() {
        if (X1().creativeModel.aigcOfflineModel.isOfflineAIGCEffectGenerated) {
            C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update aigc offline effect: ");
            sbLIZ.append(X1().getCreationId());
            C201955140j.LIZLLL(c552700Lm0, "AlbumAiEditComponent", C2188811AlT.LIZIZ(sbLIZ));
            AlbumAiContentService.LIZ.getClass();
            AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
            if (albumAiContentServiceLIZ != null) {
                albumAiContentServiceLIZ.LIZ(X1().getCreationId(), null);
            }
        }
    }

    public InterfaceC534680Ky2 W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C534670Ky1(C1DRG c1drg) {
        this.LL = c1drg;
    }
}

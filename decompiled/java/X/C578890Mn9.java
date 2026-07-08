package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import lnn.q;
import mn3.e0;

/* JADX INFO: renamed from: X.0Mn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578890Mn9 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1DRG LL;
    public final C19EG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664750tQH LLIZ;
    public final C1664750tQH LLIZLLLIL;
    public boolean LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C578890Mn9.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C578890Mn9.class, "recordComponent", "getRecordComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C578890Mn9.class, "recordStage", "getRecordStage()Lcom/ss/android/ugc/aweme/shortvideo/ui/creationflow/RecordStage;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C578890Mn9.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C578890Mn9.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C578890Mn9.class, "recordControlCompatBridge", "getRecordControlCompatBridge()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/bridge/RecordControlCompatBridge;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public final e0 LIZ() {
        return (e0) this.LLILZLL.getValue(this, LLJI[3]);
    }

    public final InterfaceC1648570t0B LIZIZ() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLJI[1]);
    }

    public final ShortVideoContext LIZJ() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLJI[0]);
    }

    public final void LIZLLL() {
        if (this.LLJ) {
            LIZIZ().yF2(true);
            ((C1656610tD9) this.LLIZLLLIL.getValue(this, LLJI[5])).TV0();
        }
        this.LLJ = false;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C578890Mn9(C19EG c19eg, C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = c19eg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1648570t0B.class, null);
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C580090Mp5.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, e0.class, null);
        this.LLIZ = C1664770tQJ.LIZ(c1drg, q.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(c1drg, C1656610tD9.class, null);
    }
}

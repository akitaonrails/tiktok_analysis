package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoMemoryState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450220nqG extends AbstractC2255721DQs<InterfaceC1450250nqJ> implements InterfaceC1450250nqJ, InterfaceC379610EuV {
    public static final C1450270nqL LLJJI = new Object() { // from class: X.0nqL
    };
    public static final int LLJJIII = 8;
    public final C1DRG LL;
    public final SingleImageData LLILLJJLI;
    public final InterfaceC1451050nrb LLILLL;
    public final ImageAlbumData LLILZ;
    public final InterfaceC1450260nqK LLILZIL;
    public final VideoPublishEditModel LLILZLL;
    public final C1450090nq3 LLIZ;
    public final InterfaceC1450310nqP LLIZLLLIL;
    public C1450290nqN LLJ;
    public C1450330nqR LLJI;
    public C1450320nqQ LLJIJIL;
    public C1450190nqD LLJILJIL;
    public final InterfaceC1461350o8D LLJILJILJ = (InterfaceC1461350o8D) getDiContainer().LJIIL(null, InterfaceC1461350o8D.class);
    public final InterfaceC1450280nqM LLJILLL = (InterfaceC1450280nqM) getDiContainer().LJIIL(null, InterfaceC1450280nqM.class);
    public final C1450220nqG LLJJ = this;

    private final AbstractC1450210nqF X1() {
        LivePhotoPreviewMode livePhotoPreviewMode;
        SrcLiveVideoInfo srcLiveInfo = this.LLILLJJLI.getSrcLiveInfo();
        if (srcLiveInfo != null && (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) != null) {
            int i = C1413270msf.LIZ[livePhotoPreviewMode.ordinal()];
            if (i == 1) {
                C1450330nqR c1450330nqR = this.LLJI;
                return c1450330nqR == null ? new C1450330nqR() : c1450330nqR;
            }
            if (i == 2) {
                C1450290nqN c1450290nqN = this.LLJ;
                return c1450290nqN == null ? new C1450290nqN() : c1450290nqN;
            }
            if (i == 3) {
                C1450320nqQ c1450320nqQ = this.LLJIJIL;
                return c1450320nqQ == null ? new C1450320nqQ() : c1450320nqQ;
            }
        }
        C1450290nqN c1450290nqN2 = this.LLJ;
        return c1450290nqN2 == null ? new C1450290nqN() : c1450290nqN2;
    }

    @Override // X.InterfaceC1450250nqJ
    public String Gq() {
        AbstractC1450210nqF abstractC1450210nqF;
        String strLIZIZ;
        C1450190nqD c1450190nqD = this.LLJILJIL;
        return (c1450190nqD == null || (abstractC1450210nqF = c1450190nqD.LIZ) == null || (strLIZIZ = abstractC1450210nqF.LIZIZ()) == null) ? "" : strLIZIZ;
    }

    @Override // X.InterfaceC1450250nqJ
    public void MP2() {
        AbstractC1450210nqF abstractC1450210nqF;
        C1450190nqD c1450190nqD = this.LLJILJIL;
        if (c1450190nqD == null || (abstractC1450210nqF = c1450190nqD.LIZ) == null) {
            return;
        }
        abstractC1450210nqF.LIZJ(c1450190nqD.LIZIZ);
    }

    @Override // X.InterfaceC1450250nqJ
    public void Mj() {
        C1450190nqD c1450190nqD;
        this.LLILLJJLI.setSrcLiveInfo(null);
        C1450290nqN c1450290nqN = this.LLJ;
        if (c1450290nqN != null && (c1450190nqD = this.LLJILJIL) != null) {
            c1450190nqD.LIZJ(c1450290nqN, this.LLIZLLLIL);
        }
        InterfaceC1450260nqK interfaceC1450260nqK = this.LLILZIL;
        if (interfaceC1450260nqK != null) {
            interfaceC1450260nqK.b82(false);
        }
        InterfaceC1450280nqM interfaceC1450280nqM = this.LLJILLL;
        if (interfaceC1450280nqM != null) {
            interfaceC1450280nqM.lq1();
        }
    }

    @Override // X.InterfaceC1450250nqJ
    public void Zw1() {
        LivePhotoModel livePhotoModel = this.LLILZLL.creativeModel.livePhotoModel;
        if (livePhotoModel != null && livePhotoModel.memoryState == null) {
            livePhotoModel.memoryState = new LivePhotoMemoryState(false, false, false, true);
        }
        this.LLJ = new C1450290nqN();
        this.LLJI = new C1450330nqR();
        this.LLJIJIL = new C1450320nqQ();
        AbstractC1450210nqF abstractC1450210nqFX1 = X1();
        SingleImageData singleImageData = this.LLILLJJLI;
        ImageAlbumData imageAlbumData = this.LLILZ;
        VideoPublishEditModel videoPublishEditModel = this.LLILZLL;
        this.LLJILJIL = new C1450190nqD(abstractC1450210nqFX1, new C1450180nqC(singleImageData, imageAlbumData, videoPublishEditModel.creativeModel, videoPublishEditModel.getVideoLength(), this.LLILLL.g().getValue(), this.LLIZ, 64));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    @Override // X.InterfaceC1450250nqJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode cm() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1450220nqG.cm():com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode");
    }

    @Override // X.InterfaceC1450250nqJ
    public void di() {
        C1450190nqD c1450190nqD;
        C1450290nqN c1450290nqN = this.LLJ;
        if (c1450290nqN == null || (c1450190nqD = this.LLJILJIL) == null) {
            return;
        }
        AbstractC1450210nqF.LJII(c1450190nqD.LIZIZ);
        c1450290nqN.LIZ(c1450190nqD.LIZIZ);
        AbstractC1450210nqF.LJI(c1450190nqD.LIZIZ, true);
    }

    @Override // X.InterfaceC1450250nqJ
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public LivePhotoPreviewMode mo49do() {
        SrcLiveVideoInfo srcLiveInfo = this.LLILLJJLI.getSrcLiveInfo();
        if (srcLiveInfo != null) {
            return srcLiveInfo.getLivePhotoPreviewMode();
        }
        return null;
    }

    @Override // X.InterfaceC1450250nqJ
    public void release() {
        AbstractC1450210nqF abstractC1450210nqF;
        C1450190nqD c1450190nqD = this.LLJILJIL;
        if (c1450190nqD == null || (abstractC1450210nqF = c1450190nqD.LIZ) == null) {
            return;
        }
        abstractC1450210nqF.LJ(c1450190nqD.LIZIZ);
    }

    public C1450220nqG W1() {
        return this.LLJJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1450250nqJ
    public void SN2(C348100Dkm c348100Dkm) {
        long duration;
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        if (this.LLJ != null) {
            C1450190nqD c1450190nqD = this.LLJILJIL;
            if (c1450190nqD != null) {
                C1450190nqD.LIZIZ(c1450190nqD, false, false, null, false, 30);
            }
            InterfaceC1452170ntP value = this.LLILLL.g().getValue();
            if (value != null) {
                duration = value.getDuration();
            } else {
                duration = 0;
            }
            InterfaceC1452170ntP value2 = this.LLILLL.g().getValue();
            if (value2 != null) {
                value2.jg();
            }
            if (c348100Dkm != null && (iNLEMediaSession = c348100Dkm.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                playerApi.pause();
            }
            InterfaceC1452170ntP value3 = this.LLILLL.g().getValue();
            if (value3 != null) {
                value3.bg((int) C351220Dpo.LLLLLLJ(duration), new InterfaceC1464140oCi() { // from class: X.0nqI
                    @Override // X.InterfaceC1464140oCi
                    public final int onGetImageData(byte[] bArr, int i, int i2, int i3, float f) {
                        return 0;
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1450250nqJ
    public void Hd0(InterfaceC1450310nqP interfaceC1450310nqP, boolean z) {
        C1450190nqD c1450190nqD = this.LLJILJIL;
        if (c1450190nqD != null) {
            C1450190nqD.LIZIZ(c1450190nqD, z, false, interfaceC1450310nqP, false, 22);
        }
    }

    public C1450220nqG(C1DRG c1drg, SingleImageData singleImageData, InterfaceC1451050nrb interfaceC1451050nrb, ImageAlbumData imageAlbumData, InterfaceC1450260nqK interfaceC1450260nqK, VideoPublishEditModel videoPublishEditModel, C1450090nq3 c1450090nq3, InterfaceC1450310nqP interfaceC1450310nqP) {
        this.LL = c1drg;
        this.LLILLJJLI = singleImageData;
        this.LLILLL = interfaceC1451050nrb;
        this.LLILZ = imageAlbumData;
        this.LLILZIL = interfaceC1450260nqK;
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = c1450090nq3;
        this.LLIZLLLIL = interfaceC1450310nqP;
    }
}

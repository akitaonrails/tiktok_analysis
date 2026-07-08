package X;

import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EXS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXS implements InterfaceC379610EuV, C0EMV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C1664740tQG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664740tQG LLILZ;
    public final C1664740tQG LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EXS.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EXS.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EXS.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EXS.class, "audioEditApi", "getAudioEditApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/AudioEditApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final InterfaceC1461350o8D LJI() {
        return ((InterfaceC1455850nzL) this.LLILLL.getValue(this, LLILZLL[1])).TI1().LIZJ();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0EXS(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455500nym.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLILZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455720nz8.class, null);
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        NLEModel nLEModelLIZ;
        C366310EXt c366310EXt;
        int duration;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        VideoPublishEditModel videoPublishEditModel = c0emo.LIZJ;
        if (videoPublishEditModel != null && (nLEModelLIZ = c0emo.LIZ()) != null && (c366310EXt = c0emo.LIZLLL) != null) {
            boolean z = c366310EXt.LIZJ;
            C1664740tQG c1664740tQG = this.LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
            InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) c1664740tQG.getValue(this, interfaceC2217461BqaArr[2]);
            if (interfaceC1455860nzM != null && (liveDataG = interfaceC1455860nzM.g()) != null && (value = liveDataG.getValue()) != null) {
                duration = value.getDuration();
            } else {
                duration = 0;
            }
            InterfaceC1455500nym interfaceC1455500nym = (InterfaceC1455500nym) this.LLILLJJLI.getValue(this, interfaceC2217461BqaArr[0]);
            if (interfaceC1455500nym != null) {
                interfaceC1455500nym.Tj(duration);
                interfaceC1455500nym.Qh();
                interfaceC1455500nym.aH(true);
                interfaceC1455500nym.LLLL(duration);
            }
            InterfaceC1455860nzM interfaceC1455860nzM2 = (InterfaceC1455860nzM) this.LLILZ.getValue(this, interfaceC2217461BqaArr[2]);
            if (interfaceC1455860nzM2 != null) {
                AbstractC1452680nuE abstractC1452680nuEGc = interfaceC1455860nzM2.gc();
                AbstractC1452680nuE abstractC1452680nuEGc2 = interfaceC1455860nzM2.gc();
                if (abstractC1452680nuEGc2 != null) {
                    int iLJIJJ = abstractC1452680nuEGc2.LJIJJ();
                    if (abstractC1452680nuEGc != null) {
                        InterfaceC1461350o8D interfaceC1461350o8DLJI = LJI();
                        if (interfaceC1461350o8DLJI != null) {
                            interfaceC1461350o8DLJI.l0(new Pair<>(Integer.valueOf(iLJIJJ), Integer.valueOf(duration)));
                        }
                        if (z) {
                            boolean zLIZIZ = C0EKP.LIZIZ(videoPublishEditModel, nLEModelLIZ);
                            InterfaceC1461350o8D interfaceC1461350o8DLJI2 = LJI();
                            if (interfaceC1461350o8DLJI2 != null) {
                                interfaceC1461350o8DLJI2.v1(duration, !zLIZIZ);
                            }
                        }
                        InterfaceC1461350o8D interfaceC1461350o8DLJI3 = LJI();
                        if (interfaceC1461350o8DLJI3 != null) {
                            interfaceC1461350o8DLJI3.u1();
                        }
                    }
                    InterfaceC1455720nz8 interfaceC1455720nz8 = (InterfaceC1455720nz8) this.LLILZIL.getValue(this, interfaceC2217461BqaArr[3]);
                    if (interfaceC1455720nz8 != null) {
                        interfaceC1455720nz8.SS1();
                    }
                }
            }
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

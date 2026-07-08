package X;

import Y.AObjectS245S0100000_22;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0oDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464480oDG extends AbstractC2255721DQs<InterfaceC1455730nz9> implements InterfaceC1455730nz9, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public C19762612Tw LLILZ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final C560530Lyd<Unit> LLIZLLLIL;
    public final LiveEvent<Unit> LLJ;
    public boolean LLJI;
    public final MutableLiveData<Boolean> LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1464480oDG.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1464480oDG.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1464480oDG.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJILJILJ = 8;
    }

    public InterfaceC1455730nz9 W1() {
        return this;
    }

    @Override // X.InterfaceC1455730nz9
    public void LJJJJIZL() {
        C19762612Tw c19762612Tw = this.LLILZ;
        if (c19762612Tw != null) {
            c19762612Tw.LLLLIILL(false);
        }
    }

    @Override // X.InterfaceC1455730nz9
    public void LLJJJJ() {
        this.LLIZLLLIL.LJIIJ(Unit.LIZ);
    }

    public final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLIZ.getValue(this, LLJILJIL[2]);
    }

    public final InterfaceC1418580n1E Z1() {
        return (InterfaceC1418580n1E) this.LLILZLL.getValue(this, LLJILJIL[1]);
    }

    @Override // X.InterfaceC1455730nz9, X.InterfaceC1456070nzh
    public void c4() {
        InterfaceC1452170ntP interfaceC1452170ntP;
        C19762612Tw c19762612Tw = this.LLILZ;
        if (c19762612Tw != null && (this.LLJI || ((interfaceC1452170ntP = c19762612Tw.LLJILJIL) != null && c19762612Tw.LLJILJILJ != interfaceC1452170ntP.getDuration()))) {
            this.LLJI = false;
            C19A3 c19a3 = this.LLILLJJLI;
            C19762612Tw c19762612Tw2 = this.LLILZ;
            if (c19762612Tw2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            c19a3.remove(c19762612Tw2);
            this.LLILZ = null;
        }
        if (this.LLILZ == null) {
            C19762612Tw c19762612Tw3 = new C19762612Tw(getDiContainer());
            this.LLILZ = c19762612Tw3;
            this.LLILLJJLI.add(this.LLILLL, c19762612Tw3, "EditAudioRecordScene");
        }
        C19762612Tw c19762612Tw4 = this.LLILZ;
        if (c19762612Tw4 != null) {
            c19762612Tw4.LLLLIILL(true);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJILJIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        EZ().LIZ(this, new AObjectS245S0100000_22(this, 50));
    }

    @Override // X.InterfaceC1455730nz9
    public LiveEvent<Unit> EZ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1455730nz9
    public LiveData<Boolean> g5() {
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

    public final boolean o2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1455730nz9
    public void Fd0(boolean z) {
        this.LLJIJIL.setValue(Boolean.valueOf(z));
    }

    public final void w2(boolean z) {
        this.LLJI = z;
    }

    @Override // X.InterfaceC1455730nz9
    public void zp(float f, float f2) {
        if (getEditModel().isStitchMode()) {
            if (getEditModel().isMuted()) {
                X1().EY0(VEVolumeChangeOp.ofVoice(0.0f));
                X1().EY0(VEVolumeChangeOp.ofMusic(f));
                return;
            } else {
                X1().EY0(VEVolumeChangeOp.ofVoice(f2));
                X1().EY0(VEVolumeChangeOp.ofMusic(f));
                return;
            }
        }
        if ((getEditModel().isFastImport() || getEditModel().hasOriginalSound()) && !getEditModel().isMuted()) {
            if (f2 != -1.0f) {
                X1().EY0(VEVolumeChangeOp.ofVoice(f2));
            }
            if (getEditModel().getMMusicPath() == null || f == -1.0f) {
                return;
            }
            X1().EY0(VEVolumeChangeOp.ofMusic(f));
            return;
        }
        if (f == -1.0f) {
            return;
        }
        X1().EY0(VEVolumeChangeOp.ofMusic(f));
    }

    public C1464480oDG(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLIZLLLIL = c560530Lyd;
        this.LLJ = c560530Lyd;
        this.LLJIJIL = new MutableLiveData<>();
    }
}

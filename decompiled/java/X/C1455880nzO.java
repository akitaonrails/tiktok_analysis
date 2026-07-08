package X;

import android.graphics.Bitmap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.ReplayLiveData;
import dmt.av.video.StoredLiveData;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0nzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455880nzO implements InterfaceC19558511fb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJFF;
    public final InterfaceC379610EuV LIZ;
    public final C1664750tQH LIZIZ;
    public final C1664740tQG LIZJ;
    public final C1664750tQH LIZLLL;
    public final MutableLiveData<Boolean> LJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1455880nzO.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1455880nzO.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1455880nzO.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LJFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public C1455880nzO() {
        this(0);
    }

    @Override // X.InterfaceC19558511fb
    public final AbstractC214814194y LJI() {
        return (AbstractC214814194y) this.LIZLLL.getValue(this, LJFF[2]);
    }

    public final InterfaceC1446740nke LJIIJ() {
        return (InterfaceC1446740nke) this.LIZIZ.getValue(this, LJFF[0]);
    }

    @Override // X.InterfaceC19558511fb
    public final LiveData<C1452720nuI> G9() {
        return LJIIJ().G9();
    }

    @Override // X.InterfaceC19558511fb
    public final MutableLiveData<C1453160nv0> LIZ() {
        return LJIIJ().MW1();
    }

    @Override // X.InterfaceC19558511fb
    public final LiveData<InterfaceC1452170ntP> LIZIZ() {
        return LJIIJ().g();
    }

    @Override // X.InterfaceC19558511fb
    public final void LIZJ() {
        if (LJIIJ().LJJJLIIL().getVeAudioEffectParam() != null) {
            LJIIJ().tH1(C364410EQl.LIZ(true, LJIIJ().LJJJLIIL().getVeAudioEffectParam()));
        }
    }

    @Override // X.InterfaceC19558511fb
    public final ReplayLiveData<C0EYM> LIZLLL() {
        return LJIIJ().dS1();
    }

    @Override // X.InterfaceC19558511fb
    public final MutableLiveData<C1452730nuJ> LJFF() {
        return LJIIJ().vW1();
    }

    @Override // X.InterfaceC19558511fb
    public final StoredLiveData<C1452720nuI> LJII() {
        return LJIIJ().ZB2();
    }

    @Override // X.InterfaceC19558511fb
    public final LiveData<Boolean> LJIIIIZZ() {
        return LJIIJ().sc1();
    }

    @Override // X.InterfaceC19558511fb
    public final VideoPublishEditModel LJJJLIIL() {
        return LJIIJ().LJJJLIIL();
    }

    @Override // X.InterfaceC19558511fb
    public final MutableLiveData<Boolean> Ps() {
        return LJIIJ().Ps();
    }

    @Override // X.InterfaceC19558511fb
    public final ArrayList<EffectPointModel> dt() {
        return LJIIJ().dt();
    }

    @Override // X.InterfaceC19558511fb
    public final MutableLiveData<Bitmap> lk() {
        return LJIIJ().lk();
    }

    @Override // X.InterfaceC19558511fb
    public final MutableLiveData<Boolean> LJIIIZ() {
        return this.LJ;
    }

    public C1455880nzO(InterfaceC379610EuV interfaceC379610EuV) {
        this.LIZ = interfaceC379610EuV;
        this.LIZIZ = C1664770tQJ.LIZ(interfaceC379610EuV.getDiContainer(), InterfaceC1446740nke.class, null);
        this.LIZJ = C1664770tQJ.LIZIZ(interfaceC379610EuV.getDiContainer(), InterfaceC1418580n1E.class, null);
        this.LIZLLL = C1664770tQJ.LIZ(interfaceC379610EuV.getDiContainer(), AbstractC214814194y.class, null);
        this.LJ = new MutableLiveData<>();
    }

    @Override // X.InterfaceC19558511fb
    public final void LJ(VEVolumeChangeOp vEVolumeChangeOp) {
        InterfaceC1418580n1E interfaceC1418580n1E = (InterfaceC1418580n1E) this.LIZJ.getValue(this, LJFF[1]);
        if (interfaceC1418580n1E != null) {
            if (vEVolumeChangeOp.mType == 0) {
                interfaceC1418580n1E.N81(vEVolumeChangeOp.mVolume);
                return;
            } else {
                interfaceC1418580n1E.A10(vEVolumeChangeOp.mVolume);
                return;
            }
        }
        LJIIJ().EY0(vEVolumeChangeOp);
    }

    public /* synthetic */ C1455880nzO(int i) {
        this(new InterfaceC379610EuV() { // from class: X.0o0a
            @Override // X.InterfaceC379610EuV
            public final C1DRG getDiContainer() {
                return new C1DRG(new C1DRF[0]);
            }
        });
    }
}

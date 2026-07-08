package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0ncz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441990ncz extends AbstractC2255721DQs<InterfaceC1453620nvk> implements InterfaceC1453620nvk, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public C1442000nd0 LLILZIL;
    public final InterfaceC1453620nvk LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 463));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1441990ncz.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = 8;
    }

    private final int Z1() {
        return ((Number) this.LLILZLL.getValue()).intValue();
    }

    private final VideoPublishEditModel o2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZ[0]);
    }

    @Override // X.InterfaceC1453620nvk
    public void L60() {
        VideoPublishEditModel videoPublishEditModelO2 = o2();
        C1442000nd0 c1442000nd0 = new C1442000nd0(this, videoPublishEditModelO2);
        this.LLILZIL = c1442000nd0;
        MutableLiveData<C348470DlN> mutableLiveDataX21 = X1().X21();
        c1442000nd0.LIZJ = mutableLiveDataX21;
        if (mutableLiveDataX21 != null) {
            mutableLiveDataX21.postValue(C1441290nbr.LIZ(videoPublishEditModelO2, false, 3));
        }
        Vw0(C1428470nHB.LJIIJ(o2()), false);
    }

    public final InterfaceC1455860nzM X1() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue();
    }

    public InterfaceC1453620nvk W1() {
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

    public C1441990ncz(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1453620nvk
    public void Vw0(boolean z, boolean z2) {
        int iZ1;
        if (z) {
            VideoPublishEditModel videoPublishEditModelO2 = o2();
            if (C0MH2.LIZ(o2(), z2)) {
                o2().creativeModel.editVideoEnhanceModel.useHdrV2 = true;
                iZ1 = Z1();
            } else {
                o2().creativeModel.editVideoEnhanceModel.useHdrV2 = false;
                iZ1 = 2;
            }
            videoPublishEditModelO2.setAutoEnhanceType(iZ1);
        }
        C1442000nd0 c1442000nd0 = this.LLILZIL;
        if (c1442000nd0 != null) {
            VideoPublishEditModel videoPublishEditModel = c1442000nd0.LIZIZ;
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData != null) {
                    imageAlbumData.setAutoEnhanceOn(z);
                }
            } else {
                videoPublishEditModel.setAutoEnhanceOn(z);
            }
            MutableLiveData<C348470DlN> mutableLiveData = c1442000nd0.LIZJ;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(C1441290nbr.LIZ(c1442000nd0.LIZIZ, z2, 1));
            }
            C2265108u9.LIZ(Boolean.valueOf(z), "hdr_enabled");
        }
    }
}

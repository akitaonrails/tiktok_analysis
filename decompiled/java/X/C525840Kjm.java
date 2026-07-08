package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.builtin.AlbumDefaultBottomActionBarConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Kjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525840Kjm extends i<InterfaceC525720Kja, C526030Kk5, C525750Kjd, C1260004wQ> implements InterfaceC525720Kja, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final Function0<C525750Kjd> LLJJIJIIJIL;
    public final Function0<C1260004wQ> LLJJIJIL;
    public final Function0<C526030Kk5> LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525840Kjm.class, "configure", "getConfigure()Lcom/ss/android/ugc/aweme/shortvideo/album/api/config/builtin/AlbumDefaultBottomActionBarConfig;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525840Kjm.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ChooseMediaViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C525840Kjm.class, "selectionConfig", "getSelectionConfig()Lcom/ss/android/ugc/aweme/shortvideo/album/api/config/AlbumSelectionConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C525840Kjm.class, "albumSelectionDataApi", "getAlbumSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C525840Kjm.class, "nextStepApi", "getNextStepApi()Lcom/ss/android/ugc/aweme/shortvideo/album/nextstep/AlbumNextStepApi;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    private final InterfaceC525680KjW K4() {
        return (InterfaceC525680KjW) this.LLJJIJI.getValue(this, LLJJJIL[4]);
    }

    public final InterfaceC525880Kjq F4() {
        return (InterfaceC525880Kjq) this.LLJJIII.getValue(this, LLJJJIL[3]);
    }

    public final AlbumDefaultBottomActionBarConfig H4() {
        return (AlbumDefaultBottomActionBarConfig) this.LLJILLL.getValue(this, LLJJJIL[0]);
    }

    public final AlbumSelectionConfig O4() {
        return (AlbumSelectionConfig) this.LLJJI.getValue(this, LLJJJIL[2]);
    }

    public final ChooseMediaViewModel P4() {
        return (ChooseMediaViewModel) this.LLJJ.getValue(this, LLJJJIL[1]);
    }

    public final void T4() {
        K4().qM0(C0L99.NEXT_BTN, false, AFwS239S0000000_8.get$arr$(60));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526270KkT(this, null), 3);
    }

    @Override // ge.i
    public Function0<C526030Kk5> E3() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C525750Kjd> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1260004wQ> w2() {
        return this.LLJJIJIL;
    }

    public C525840Kjm(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), AlbumDefaultBottomActionBarConfig.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), ChooseMediaViewModel.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), AlbumSelectionConfig.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525880Kjq.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525680KjW.class, null);
        this.LLJJIJIIJIL = AFwS194S0000000_8.get$arr$(124);
        this.LLJJIJIL = new AwS552S0100000_8(this, 168);
        this.LLJJJ = new AwS552S0100000_8(this, 169);
    }
}

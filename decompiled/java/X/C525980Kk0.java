package X;

import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Kk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525980Kk0 extends AbstractC1664510tPt<InterfaceC525910Kjt> implements InterfaceC525910Kjt {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final C1664680tQA<C525990Kk1> LLJJ;
    public final int LLJJI;
    public final C05XL<Unit> LLJJIII;
    public InterfaceC525900Kjs LLJJIJI;
    public InterfaceC525720Kja LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525980Kk0.class, "selectMaterialContext", "getSelectMaterialContext()Lcom/ss/android/ugc/aweme/shortvideo/album/SelectMaterialContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525980Kk0.class, "selectionConfig", "getSelectionConfig()Lcom/ss/android/ugc/aweme/shortvideo/album/api/config/AlbumSelectionConfig;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C525980Kk0.class, "albumPlatformService", "getAlbumPlatformService()Lcom/ss/android/ugc/aweme/shortvideo/album/service/CreationAlbumPlatformService;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    private final C524000Kgo F4() {
        return (C524000Kgo) this.LLJILJIL.getValue(this, LLJJIJIL[0]);
    }

    @Override // X.AbstractC1664510tPt
    public C19A3 H2() {
        return new C526020Kk4(q3(), this.LLJJ);
    }

    public final AlbumSelectionConfig H4() {
        return (AlbumSelectionConfig) this.LLJILJILJ.getValue(this, LLJJIJIL[1]);
    }

    public final CreationAlbumPlatformService z4() {
        return (CreationAlbumPlatformService) this.LLJILLL.getValue(this, LLJJIJIL[2]);
    }

    @Override // X.InterfaceC525910Kjt
    public InterfaceC525900Kjs ZU0() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC525910Kjt
    public InterfaceC525720Kja ot2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664510tPt
    public int q3() {
        return this.LLJJI;
    }

    public void K4(InterfaceC525720Kja interfaceC525720Kja) {
        this.LLJJIJIIJIL = interfaceC525720Kja;
    }

    public void O4(InterfaceC525900Kjs interfaceC525900Kjs) {
        this.LLJJIJI = interfaceC525900Kjs;
    }

    @Override // X.InterfaceC525910Kjt
    public Object g40(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJLIIIL = this.LLJJIII.LJLIIIL(interfaceC1364105Vn);
        if (objLJLIIIL == C099R.LJFF()) {
            return objLJLIIIL;
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC1664510tPt
    public void o2(C19A3 c19a3) {
        InterfaceC525900Kjs interfaceC525900Kjs;
        InterfaceC523990Kgn<?> interfaceC523990Kgn = F4().LJFF;
        T2("AlbumBottomBarGroupComponent", new AwS587S0100000_8(interfaceC523990Kgn, (InterfaceC523990Kgn<?>) 93));
        C1DRG c1drgLJFF = X1("AlbumBottomBarGroupComponent", new AwS217S0300000_8(this, (C525980Kk0) c19a3, (C19A3) interfaceC523990Kgn, (InterfaceC523990Kgn<?>) 13)).LIZ.LJFF();
        InterfaceC525720Kja interfaceC525720Kja = null;
        if (c1drgLJFF != null) {
            interfaceC525900Kjs = (InterfaceC525900Kjs) c1drgLJFF.LJIIL(null, InterfaceC525900Kjs.class);
        } else {
            interfaceC525900Kjs = null;
        }
        this.LLJJIJI = interfaceC525900Kjs;
        if (c1drgLJFF != null) {
            interfaceC525720Kja = (InterfaceC525720Kja) c1drgLJFF.LJIIL(null, InterfaceC525720Kja.class);
        }
        this.LLJJIJIIJIL = interfaceC525720Kja;
        this.LLJJIII.LJIIZILJ(Unit.LIZ);
    }

    @Override // X.InterfaceC525910Kjt
    public void setBackgroundColor(int i) {
        this.LLJJ.LIZLLL(new AwS23S0001000_8(i, 2), true);
    }

    public C525980Kk0(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), C524000Kgo.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), AlbumSelectionConfig.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), CreationAlbumPlatformService.class, null);
        this.LLJJ = new C1664680tQA<>(new C525990Kk1(R.attr.bx, !C524930KiJ.LIZJ()));
        this.LLJJI = R.layout.emt;
        this.LLJJIII = C090F.LIZIZ();
    }
}

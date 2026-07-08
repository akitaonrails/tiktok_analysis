package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.shortvideo.album.bottombar.util.AlbumCenterLayoutManager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Kkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526450Kkl extends i<InterfaceC525900Kjs, C526720KlC, C526500Kkq, C526100KkC> implements InterfaceC525900Kjs, InterfaceC523480Kfy, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public InterfaceC526470Kkn LLJJI;
    public final Function0<C526500Kkq> LLJJIII;
    public final Function0<C526100KkC> LLJJIJI;
    public C526720KlC LLJJIJIIJIL;
    public final Function0<C526720KlC> LLJJIJIL;
    public final C05YC<InterfaceC526090KkB> LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C526450Kkl.class, "albumSelectionDataApi", "getAlbumSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C526450Kkl.class, "livePhotoSyncManager", "getLivePhotoSyncManager()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/model/LivePhotoSyncManager;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    private final C525190Kij K4() {
        return (C525190Kij) this.LLJJ.getValue(this, LLJJJIL[1]);
    }

    public final InterfaceC525880Kjq F4() {
        return (InterfaceC525880Kjq) this.LLJILLL.getValue(this, LLJJJIL[0]);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C526360Kkc(this, null), 3);
        K4().LIZIZ(this);
    }

    @Override // ge.i
    public Function0<C526720KlC> E3() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC525900Kjs
    public /* bridge */ /* synthetic */ InterfaceC346201Wa E72() {
        return this.LLJJJ;
    }

    public C05YC<InterfaceC526090KkB> H4() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C526500Kkq> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C526100KkC> w2() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC525900Kjs
    public View HF0(TikTokMediaModel tikTokMediaModel) {
        C529450Kpb c529450Kpb;
        int iLLLJL;
        AlbumCenterLayoutManager albumCenterLayoutManager;
        C526720KlC c526720KlC = this.LLJJIJIIJIL;
        if (c526720KlC != null && (c529450Kpb = c526720KlC.LLJJJJ) != null && (iLLLJL = c529450Kpb.LLLJL(tikTokMediaModel)) >= 0 && (albumCenterLayoutManager = c526720KlC.LLJJJJJIL) != null) {
            return albumCenterLayoutManager.findViewByPosition(iLLLJL);
        }
        return null;
    }

    @Override // X.InterfaceC525900Kjs
    public void KX1(List<? extends TikTokMediaModel> list) {
        i3(new AwS587S0100000_8(list, (List<MentionDataItem>) 97));
    }

    @Override // X.InterfaceC523480Kfy
    public void LLJLL(TikTokMediaModel tikTokMediaModel) {
        if (!tikTokMediaModel.LJIIJJI()) {
            return;
        }
        i3(new AwS587S0100000_8(tikTokMediaModel, 96));
    }

    @Override // X.InterfaceC525900Kjs
    public void Zq2(InterfaceC526470Kkn interfaceC526470Kkn) {
        this.LLJJI = interfaceC526470Kkn;
    }

    @Override // X.InterfaceC525900Kjs
    public void oe(int i) {
        i3(new AwS23S0001000_8(i, 3));
    }

    public C526450Kkl(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525880Kjq.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C525190Kij.class, null);
        this.LLJJI = new InterfaceC526470Kkn() { // from class: X.0Kkm
            @Override // X.InterfaceC526470Kkn
            public final boolean LIZ(List<? extends TikTokMediaModel> list) {
                return !list.isEmpty();
            }
        };
        this.LLJJIII = AFwS194S0000000_8.get$arr$(125);
        this.LLJJIJI = new AwS552S0100000_8(this, 170);
        this.LLJJIJIL = new AwS552S0100000_8(this, 171);
        this.LLJJJ = C09IR.LIZIZ(0, 0, null, 7);
    }
}

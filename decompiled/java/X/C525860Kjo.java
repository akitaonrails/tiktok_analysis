package X;

import Y.AObserverS212S0100000_8;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionConfig;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSelectionMode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0Kjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525860Kjo implements InterfaceC522120Kdm, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C1DRG LL;
    public final InterfaceC497601wk LLILLJJLI;
    public final View LLILLL;
    public final ChooseMediaViewModel LLILZ;
    public AbstractC528270Knh LLILZIL;
    public AbstractC528270Knh LLILZLL;
    public AbstractC528270Knh LLIZ;
    public AbstractC528270Knh LLIZLLLIL;
    public AbstractC528270Knh LLJ;
    public AbstractC528270Knh LLJI;
    public final C1664750tQH LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public final C1664750tQH LLJILJILJ;
    public final C1664750tQH LLJILLL;
    public final AnonymousClass0951 LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525860Kjo.class, "selectionDataApi", "getSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C525860Kjo.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/shortvideo/album/bottombar/AlbumBottomBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C525860Kjo.class, "nextStepApi", "getNextStepApi()Lcom/ss/android/ugc/aweme/shortvideo/album/nextstep/AlbumNextStepApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C525860Kjo.class, "selectionConfig", "getSelectionConfig()Lcom/ss/android/ugc/aweme/shortvideo/album/api/config/AlbumSelectionConfig;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJFF() {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJI(LifecycleOwner lifecycleOwner, AObserverS212S0100000_8 aObserverS212S0100000_8) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC522120Kdm
    public final C0HZQ LJIIJJI() {
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIL() {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIILIIL(int i) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIILL(View view, boolean z) {
    }

    @Override // X.InterfaceC522120Kdm
    public final View LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJ(boolean z) {
    }

    @Override // X.InterfaceC522120Kdm
    public final CutSameVideoImageExtraData LJIJI() {
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJJLI(LifecycleOwner lifecycleOwner, AObserverS212S0100000_8 aObserverS212S0100000_8) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJ(View view, String str) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJI() {
    }

    @Override // X.InterfaceC522120Kdm
    public final int LJJIFFI() {
        return -1;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIJ(boolean z) {
    }

    @Override // X.InterfaceC522120Kdm
    public final boolean LJJIIZ() {
        return false;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIZI(Map<String, LivePhotoInfo> map) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJIIJIL(boolean z) {
    }

    @Override // X.InterfaceC522120Kdm
    public final int LJJIJIL(int i, int i2) {
        return 0;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJLIJ(int i) {
    }

    @Override // X.InterfaceC522120Kdm
    public final void onPause() {
    }

    @Override // X.InterfaceC522120Kdm
    public final View LIZLLL() {
        View view = this.LLILLL;
        if (view != null) {
            return view.findViewById(R.id.xp);
        }
        return null;
    }

    @Override // X.InterfaceC522120Kdm
    public final ArrayList<TikTokMediaModel> LJ() {
        return new ArrayList<>();
    }

    @Override // X.InterfaceC522120Kdm
    public final ArrayList<TikTokMediaModel> LJIL() {
        return new ArrayList<>(LJJJ().m02());
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIL() {
        ((InterfaceC525680KjW) this.LLJILJILJ.getValue(this, LLJJI[2])).qM0(C0L99.NEXT_BTN, false, AFwS239S0000000_8.get$arr$(60));
    }

    public final InterfaceC525910Kjt LJJIZ() {
        return (InterfaceC525910Kjt) this.LLJILJIL.getValue(this, LLJJI[1]);
    }

    public final InterfaceC525880Kjq LJJJ() {
        return (InterfaceC525880Kjq) this.LLJIJIL.getValue(this, LLJJI[0]);
    }

    public final void LJJJI() {
        AbstractC528270Knh abstractC528270Knh = this.LLILZIL;
        if (abstractC528270Knh != null) {
            abstractC528270Knh.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh2 = this.LLJ;
        if (abstractC528270Knh2 != null) {
            abstractC528270Knh2.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh3 = this.LLILZLL;
        if (abstractC528270Knh3 != null) {
            abstractC528270Knh3.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh4 = this.LLIZ;
        if (abstractC528270Knh4 != null) {
            abstractC528270Knh4.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh5 = this.LLIZLLLIL;
        if (abstractC528270Knh5 != null) {
            abstractC528270Knh5.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh6 = this.LLJI;
        if (abstractC528270Knh6 != null) {
            abstractC528270Knh6.LLLLLLJ();
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final List<TikTokMediaModel> LIZJ() {
        return LJJJ().m02();
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIIJ() {
        LJJJ().xR();
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJ() {
        LJJIZ().show();
    }

    @Override // X.InterfaceC522120Kdm
    public final C05YD<Boolean> LJIILJJIL() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC522120Kdm
    public final void LIZIZ(C0L90 c0l90) {
        if (C524430KhV.LIZ[c0l90.ordinal()] == 2) {
            LJJIL();
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJII(C522090Kdj c522090Kdj) {
        int i;
        this.LLILZIL = c522090Kdj.LJIIJJI;
        this.LLJ = c522090Kdj.LJIILL;
        this.LLJI = c522090Kdj.LJIILLIIL;
        this.LLILZLL = c522090Kdj.LJIIL;
        this.LLIZ = c522090Kdj.LJIILIIL;
        this.LLIZLLLIL = c522090Kdj.LJIILJJIL;
        C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C526210KkN(this, c522090Kdj, null), 3);
        C23250099c.LIZLLL(this.LLILLJJLI, null, null, new C526230KkP(this, c522090Kdj, null), 3);
        ChooseMediaViewModel chooseMediaViewModel = this.LLILZ;
        if (chooseMediaViewModel != null) {
            AlbumSelectionMode albumSelectionMode = ((AlbumSelectionConfig) this.LLJILLL.getValue(this, LLJJI[3])).mode;
            if (albumSelectionMode instanceof AlbumSelectionMode.Single) {
                i = 1;
            } else if (albumSelectionMode instanceof AlbumSelectionMode.Multiple) {
                i = ((AlbumSelectionMode.Multiple) albumSelectionMode).minCount;
            } else {
                throw new C1954807lC();
            }
            chooseMediaViewModel.yR2(new C529080Kp0(i, null, false, false, false, false, false, false, false));
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final View LJIIIZ(TikTokMediaModel tikTokMediaModel) {
        InterfaceC525900Kjs interfaceC525900KjsZU0;
        View viewHF0;
        if (tikTokMediaModel == null || (interfaceC525900KjsZU0 = LJJIZ().ZU0()) == null || (viewHF0 = interfaceC525900KjsZU0.HF0(tikTokMediaModel)) == null) {
            return null;
        }
        return viewHF0.findViewById(R.id.video_cover);
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJIJJ(TikTokMediaModel tikTokMediaModel) {
        throw new IllegalStateException("Should not call unselectMedia in new bottom bar, use AlbumSelectionDataApi directly");
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJII(boolean z) {
        if (z) {
            LJJIZ().show();
        } else {
            LJJIZ().hide();
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIII(Function0<Unit> function0) {
        if (!LJJJ().m02().isEmpty()) {
            LJJJ().xR();
            function0.invoke();
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIJL(List<? extends TikTokMediaModel> list) {
        InterfaceC525900Kjs interfaceC525900KjsZU0 = LJJIZ().ZU0();
        if (interfaceC525900KjsZU0 != null) {
            interfaceC525900KjsZU0.KX1(list);
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void oe(int i) {
        InterfaceC525900Kjs interfaceC525900KjsZU0 = LJJIZ().ZU0();
        if (interfaceC525900KjsZU0 != null) {
            interfaceC525900KjsZU0.oe(i);
        }
    }

    @Override // X.InterfaceC522120Kdm
    public final void LIZ(int i, int i2) {
        LJJJ().Cv1(i, i2);
    }

    public C525860Kjo(C1DRG c1drg, LifecycleCoroutineScope lifecycleCoroutineScope, View view, ChooseMediaViewModel chooseMediaViewModel) {
        this.LL = c1drg;
        this.LLILLJJLI = lifecycleCoroutineScope;
        this.LLILLL = view;
        this.LLILZ = chooseMediaViewModel;
        this.LLJIJIL = C1664770tQJ.LIZ(c1drg, InterfaceC525880Kjq.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, InterfaceC525910Kjt.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, InterfaceC525680KjW.class, null);
        this.LLJILLL = C1664770tQJ.LIZ(c1drg, AlbumSelectionConfig.class, null);
        this.LLJJ = C09IC.LJJIJIL(new C581160Mqo(LJJJ().G72(), 4), lifecycleCoroutineScope, C1370905Yd.LIZ(C05YW.LIZ, 3000L, 2), Boolean.valueOf(!LIZJ().isEmpty()));
    }

    @Override // X.InterfaceC522120Kdm
    public final int LJIILLIIL(TikTokMediaModel tikTokMediaModel, boolean z, boolean z2, C0L90 c0l90) {
        if (tikTokMediaModel == null) {
            return 0;
        }
        if (z) {
            LJJJ().qJ(tikTokMediaModel, c0l90);
        } else {
            LJJJ().QG(tikTokMediaModel);
        }
        return LJJJ().m02().size();
    }

    @Override // X.InterfaceC522120Kdm
    public final void LJJIIJZLJL(View view, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C0L99 c0l99;
        if (z) {
            c0l99 = C0L99.EDITOR_PRO;
        } else if (z5) {
            c0l99 = C0L99.EDIT_PHOTO;
        } else if (z4) {
            c0l99 = C0L99.ALBUM_GRID;
        } else if (z6) {
            c0l99 = C0L99.PRIVACY_ALBUM;
        } else {
            c0l99 = C0L99.NEXT_BTN;
        }
        ((InterfaceC525680KjW) this.LLJILJILJ.getValue(this, LLJJI[2])).qM0(c0l99, z2, AFwS239S0000000_8.get$arr$(60));
    }
}

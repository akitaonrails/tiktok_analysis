package X;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel;
import com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumService;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0KiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525020KiS extends AbstractC2255721DQs<InterfaceC525060KiW> implements InterfaceC525060KiW, InterfaceC379610EuV {
    public static final C525040KiU LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AIPortraitCustomizeViewModel.class, null);
    public final MutableLiveData<Intent> LLILZIL;
    public final LiveData<Intent> LLILZLL;
    public final C01GW LLIZ;
    public final InterfaceC525060KiW LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0KiU] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C525020KiS.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C525020KiS.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/portrait/customize/AIPortraitCustomizeViewModel;", 0)};
        LLJ = new Object() { // from class: X.0KiU
        };
        LLJIJIL = 8;
    }

    private final InterfaceC484050IyZ W1() {
        return (InterfaceC484050IyZ) this.LLIZ.getValue();
    }

    private final C19EG Z1() {
        return (C19EG) this.LLILLL.getValue(this, LLJI[0]);
    }

    @Override // X.InterfaceC525060KiW
    public void LLLLIILL() {
        C524310KhJ c524310KhJLIZ;
        CreationAlbumService creationAlbumService = (CreationAlbumService) PluggableExtentionKt.pluggableSpi$default(CreationAlbumService.class, false, false, false, 14, null);
        if (creationAlbumService == null || (c524310KhJLIZ = creationAlbumService.LIZ("ai_portrait", new AwS587S0100000_8(this, 79))) == null) {
            return;
        }
        c524310KhJLIZ.LIZIZ(Z1(), new C524320KhK(10105));
    }

    public final AIPortraitCustomizeViewModel w2() {
        return (AIPortraitCustomizeViewModel) this.LLILZ.getValue(this, LLJI[1]);
    }

    private final InterfaceC524950KiL o2() {
        InterfaceC524950KiL interfaceC524950KiL;
        InterfaceC1670800ta2 interfaceC1670800ta2Z1 = Z1();
        if ((interfaceC1670800ta2Z1 instanceof InterfaceC524950KiL) && (interfaceC524950KiL = (InterfaceC524950KiL) interfaceC1670800ta2Z1) != null) {
            return interfaceC524950KiL;
        }
        InterfaceC524950KiL interfaceC524950KiL2 = (InterfaceC524950KiL) getDiContainer().LJIIL(null, InterfaceC524950KiL.class);
        return interfaceC524950KiL2 == null ? C0MWZ.LIZ(this.LLILLJJLI) : interfaceC524950KiL2;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC524950KiL interfaceC524950KiLO2 = o2();
        if (interfaceC524950KiLO2 != null) {
            interfaceC524950KiLO2.Qh(W1());
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC524950KiL interfaceC524950KiLO2 = o2();
        if (interfaceC524950KiLO2 != null) {
            interfaceC524950KiLO2.T4(W1());
        }
        super.onDestroy();
    }

    @Override // X.InterfaceC525060KiW
    public LiveData<Intent> Fs1() {
        return this.LLILZLL;
    }

    public InterfaceC525060KiW X1() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C525020KiS(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        MutableLiveData<Intent> mutableLiveData = new MutableLiveData<>();
        this.LLILZIL = mutableLiveData;
        this.LLILZLL = mutableLiveData;
        this.LLIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 149));
        this.LLIZLLLIL = this;
    }
}

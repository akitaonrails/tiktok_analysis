package X;

import Y.AfS194S0100000_25;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.presenter.handler.GameStickerHandler;
import com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624840sNu extends AbstractC2255721DQs<InterfaceC1624950sO5> implements InterfaceC1624950sO5, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public InterfaceC1622080sJS LLIZLLLIL;
    public final InterfaceC1624950sO5 LLILLJJLI = this;
    public final C560530Lyd<AbstractC1881107Yj> LLILLL = new C560530Lyd<>();
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1625000sOA.class, null);
    public final C19EG LLILZIL = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final ShortVideoContext LLILZLL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C1645380sv2.class, "lazyBeautyFilter");
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 606));
    public final C11NJ LLJI = new C11NJ();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1624840sNu.class, "stickerApiComponent", "getStickerApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerCoreApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1624840sNu.class, "lazyBeautyFilterLogic", "getLazyBeautyFilterLogic()Lcom/ss/android/ugc/aweme/property/BeautyFilterConfig;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILJIL = 8;
    }

    private final InterfaceC1637800sio Z1() {
        return (InterfaceC1637800sio) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1624950sO5
    public boolean Cq2() {
        View viewFindViewById = this.LLILZIL.findViewById(R.id.mb4);
        return viewFindViewById != null && viewFindViewById.getVisibility() == 0;
    }

    public final InterfaceC1625000sOA nq() {
        return (InterfaceC1625000sOA) this.LLILZ.getValue(this, LLJIJIL[0]);
    }

    public final C1645380sv2 o2() {
        return (C1645380sv2) this.LLIZ.getValue(this, LLJIJIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Scene scene = (Scene) getDiContainer().LJIIL(null, AbstractC214814194y.class);
        this.LLJI.LIZ(nq().WJ0().LJJLL(new AfS194S0100000_25((GameResultViewModel) (scene != null ? C1659630tI1.LJIIIIZZ(scene, null, null, 6) : ViewModelProviders.of(this.LLILZIL)).get(GameResultViewModel.class), 58), C09HN.LIZ));
        C094000Xa c094000XaLIZJ = nq().C0().getStickerRepository().LIZ().LIZJ();
        c094000XaLIZJ.LIZLLL(AFwS266S0000000_25.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        ShortVideoContext shortVideoContext = this.LLILZLL;
        if (shortVideoContext.LJJLL() || shortVideoContext.LJJIII() || shortVideoContext.cameraComponentModel.isRetakeMode || shortVideoContext.LJJJJLL() || shortVideoContext.LJJJJZ()) {
            c094000XaLIZJ.LIZ(new C1621260sI8());
        }
        c094000XaLIZJ.LIZIZ();
        InterfaceC1625410sOp interfaceC1625410sOpW4 = nq().w4();
        interfaceC1625410sOpW4.LIZIZ(new C1625620sPA(this.LLILZIL, nq().dN1(), this.LLILZLL, new AwS604S0100000_25(interfaceC1625410sOpW4, 380)));
        InterfaceC1624870sNx c1624880sNy = (InterfaceC1624870sNx) getDiContainer().LJIIL(null, InterfaceC1624870sNx.class);
        if (c1624880sNy == null) {
            c1624880sNy = new C1624880sNy(getDiContainer());
        }
        GameStickerHandler gameStickerHandlerLIZ = c1624880sNy.LIZ(nq(), Z1());
        this.LLIZLLLIL = gameStickerHandlerLIZ;
        if (gameStickerHandlerLIZ != null) {
            nq().sk(gameStickerHandlerLIZ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJI.LJ();
        InterfaceC1622080sJS interfaceC1622080sJS = this.LLIZLLLIL;
        if (interfaceC1622080sJS != null) {
            nq().sb(interfaceC1622080sJS);
        }
    }

    public InterfaceC1624950sO5 W1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1624950sO5
    public /* bridge */ /* synthetic */ LiveEvent Wh2() {
        return this.LLILLL;
    }

    public C560530Lyd<AbstractC1881107Yj> X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1624840sNu(C1DRG c1drg) {
        this.LL = c1drg;
    }
}

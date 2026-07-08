package X;

import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0spU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641940spU extends AbstractC1643610ssB<EffectInfoViewModel> implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ;
    public final C1664750tQH LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 415));
    public final AwS569S0100000_25 LLJILJIL = new AwS569S0100000_25(this, 416);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1641940spU.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior;
        C1641890spP c1641890spP = (C1641890spP) this.LLJIJIL.getValue();
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = c1641890spP.LLJJI;
        if ((viewPagerBottomSheetBehavior2 == null || viewPagerBottomSheetBehavior2.getState() != 5) && (viewPagerBottomSheetBehavior = c1641890spP.LLJJI) != null) {
            viewPagerBottomSheetBehavior.setState(5);
        }
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        InterfaceC1639210sl5 interfaceC1639210sl5;
        C1641890spP c1641890spP = (C1641890spP) this.LLJIJIL.getValue();
        C19A3 c19a3 = this.LLIZLLLIL;
        int i = this.LLJ;
        c1641890spP.getClass();
        if (!c19a3.isAdded(c1641890spP)) {
            c19a3.add(i, c1641890spP, "EffectInfoScene");
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = c1641890spP.LLJJI;
        if (viewPagerBottomSheetBehavior == null || viewPagerBottomSheetBehavior.getState() != 3) {
            c19a3.show(c1641890spP);
            if (C0CHQ.LIZ().getAccountService().LIZ() && (interfaceC1639210sl5 = c1641890spP.LLJILLL) != null) {
                interfaceC1639210sl5.D22(false);
            }
            InterfaceC1639210sl5 interfaceC1639210sl52 = c1641890spP.LLJILLL;
            if (interfaceC1639210sl52 != null) {
                interfaceC1639210sl52.D22(false);
            }
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = c1641890spP.LLJJI;
            if (viewPagerBottomSheetBehavior2 != null) {
                viewPagerBottomSheetBehavior2.setState(3);
            }
        }
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(c1641890spP);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.AH(c1641890spP);
            interfaceC524950KiLLIZ.Qh(c1641890spP);
        }
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        if (((Boolean) C1637150shl.LIZ.getValue()).booleanValue() || C1647240sy2.LIZ().lazyLoadComponentV2) {
            return;
        }
        ((q) this.LLJI.getValue(this, LLJILJILJ[0])).sk(new EffectInfoStickerHandler(this, this.LLIZ));
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<EffectInfoViewModel> W1() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C1641940spU(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJ = i;
        this.LLJI = C1664770tQJ.LIZ(c1drg, q.class, null);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }
}

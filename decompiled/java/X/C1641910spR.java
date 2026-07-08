package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.prop.fragment.EffectDiscoverAwemeListFragment;
import com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverViewModel;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import duk.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0spR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641910spR extends AbstractC1643610ssB<EffectDiscoverViewModel> implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final int LLJ = R.id.sz7;
    public final int LLJI = C1631130sY3.LIZIZ();
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 272));
    public final AwS569S0100000_25 LLJILJIL = new AwS569S0100000_25(this, 273);

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        C1641900spQ c1641900spQ = (C1641900spQ) this.LLJIJIL.getValue();
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = c1641900spQ.LLJJJJLIIL;
        if (viewPagerBottomSheetBehavior == null) {
            viewPagerBottomSheetBehavior = null;
        }
        if (viewPagerBottomSheetBehavior.getState() != 5) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = c1641900spQ.LLJJJJLIIL;
            (viewPagerBottomSheetBehavior2 != null ? viewPagerBottomSheetBehavior2 : null).setState(5);
        }
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        View viewFindViewById;
        C1641900spQ c1641900spQ = (C1641900spQ) this.LLJIJIL.getValue();
        C19A3 c19a3 = this.LLIZLLLIL;
        int i = this.LLJ;
        c1641900spQ.getClass();
        if (!c19a3.isAdded(c1641900spQ)) {
            c19a3.add(i, c1641900spQ, "EffectDiscoverScene");
        }
        if (C1621950sJF.LIZ() && (viewFindViewById = c19a3.findViewById(i)) != null) {
            viewFindViewById.bringToFront();
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = c1641900spQ.LLJJJJLIIL;
        if (viewPagerBottomSheetBehavior == null) {
            viewPagerBottomSheetBehavior = null;
        }
        if (viewPagerBottomSheetBehavior.getState() != 3) {
            c19a3.show(c1641900spQ);
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = c1641900spQ.LLJJJJLIIL;
            if (viewPagerBottomSheetBehavior2 == null) {
                viewPagerBottomSheetBehavior2 = null;
            }
            viewPagerBottomSheetBehavior2.setState(3);
        }
        FragmentManager supportFragmentManager = ((C19EG) c1641900spQ.requireActivity()).getSupportFragmentManager();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("creation_id", c1641900spQ.LLLIIIIL().getCreationId(), bundle);
        C786410Ut5.LJJJI("shoot_way", c1641900spQ.LLLIIIIL().shootWay, bundle);
        C786410Ut5.LJJJI("shoot_tab_name", c1641900spQ.LLLIIIIL().LJIJJLI(), bundle);
        if (supportFragmentManager.LJJJJZI("EffectDiscoverVideoFragment") == null) {
            IPropReuseService iPropReuseService = (IPropReuseService) ServiceManager.get().getService(IPropReuseService.class);
            p pVarLJJJJIZL = c1641900spQ.LLLIILIL().C0().LJJJJIZL();
            int i2 = pVarLJJJJIZL != null ? pVarLJJJJIZL.LIZIZ : 0;
            p pVarLJJJJIZL2 = c1641900spQ.LLLIILIL().C0().LJJJJIZL();
            EffectDiscoverAwemeListFragment effectDiscoverAwemeListFragmentLJIIIIZZ = iPropReuseService.LJIIIIZZ(bundle, i2, pVarLJJJJIZL2 != null ? pVarLJJJJIZL2.LIZJ().LJL(C11S5.LIZIZ).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.00Gt
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    return ((Pair) obj).getSecond();
                }
            }) : C11IR.LL);
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.gvx, effectDiscoverAwemeListFragmentLJIIIIZZ, "EffectDiscoverVideoFragment");
            c19ehLJIIJ.LJIIIZ();
        }
        c1641900spQ.LLLII().IU1().LIZLLL(EnumC545560LaU.EFFECT_DISCOVER_SCENE, C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_EFFECT_DISCOVERY_OPEN, EnumC1641610sox.PAGE_INVISIBLE));
        C1664740tQG c1664740tQG = c1641900spQ.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1641900spQ.LLJZ;
        InterfaceC1650930t3z interfaceC1650930t3z = (InterfaceC1650930t3z) c1664740tQG.getValue(c1641900spQ, interfaceC2217461BqaArr[3]);
        if (interfaceC1650930t3z != null) {
            interfaceC1650930t3z.e31();
        }
        if (C1624200sMs.LJIILIIL(c1641900spQ.LLLIILIL().C0().LLILIL())) {
            c1641900spQ.LLLII().St2().LJLL();
        } else {
            InterfaceC1624370sN9 interfaceC1624370sN9 = (InterfaceC1624370sN9) c1641900spQ.LLJJIJI.getValue(c1641900spQ, interfaceC2217461BqaArr[6]);
            if (interfaceC1624370sN9 != null) {
                interfaceC1624370sN9.ya2(true);
            }
            InterfaceC1652470t6T interfaceC1652470t6T = (InterfaceC1652470t6T) c1641900spQ.LLJJI.getValue(c1641900spQ, interfaceC2217461BqaArr[4]);
            if (interfaceC1652470t6T != null) {
                interfaceC1652470t6T.rZ0(null, false);
            }
        }
        InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(c1641900spQ);
        if (interfaceC524950KiLLIZ != null) {
            interfaceC524950KiLLIZ.AH(c1641900spQ);
            interfaceC524950KiLLIZ.Qh(c1641900spQ);
        }
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<EffectDiscoverViewModel> W1() {
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

    public C1641910spR(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
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

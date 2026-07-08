package X;

import Y.ACListenerS159S0100000_25;
import Y.AObjectS246S0100000_25;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ui_component.UiState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionPanelState;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0sqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642430sqH extends Scene implements InterfaceC1166920gTK, InterfaceC362610EJn, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LLJI;
    public final l0 LLJILJIL;
    public final ShortVideoContext LLJILJILJ;
    public C1641930spT LLJILLL;
    public BottomSheetBehavior<View> LLJJ;
    public InterfaceC524950KiL LLJJI;
    public Effect LLJJIII;
    public C1645710svZ LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public WeakReference<OptionCategoryPanelFragment> LLJJIJIL;
    public InterfaceC1642470sqL LLJJJ;
    public final C1664740tQG LLJJJIL;
    public final C1664740tQG LLJJJJ;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS426S0200000_25(this, C13LE.LIZ(OptionSceneViewModel.class), 15));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 59));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1642430sqH.class, "slideSlipBottomStickerComponent", "getSlideSlipBottomStickerComponent()Lcom/ss/android/ugc/slideslip/SlideSlipEffectApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1642430sqH.class, "lazyControlProgressConfig", "getLazyControlProgressConfig()Lcom/ss/android/ugc/aweme/property/LazyLoadControlProgressComponentConfig;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final OptionSceneViewModel LLLIIIIL() {
        return (OptionSceneViewModel) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C1645710svZ c1645710svZ = this.LLJJIJI;
        if (c1645710svZ != null) {
            C786410Ut5.C1(c1645710svZ, 8);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        WeakReference<OptionCategoryPanelFragment> weakReference;
        OptionCategoryPanelFragment optionCategoryPanelFragment;
        super.onResume();
        Effect effect = this.LLJJIII;
        if (effect == null || !C1624550sNR.LIZLLL(effect) || (weakReference = this.LLJJIJIL) == null || (optionCategoryPanelFragment = weakReference.get()) == null) {
            return;
        }
        OptionCategoryPanelViewModel optionCategoryPanelViewModel = optionCategoryPanelFragment.LLIZ;
        if (optionCategoryPanelViewModel == null) {
            optionCategoryPanelViewModel = null;
        }
        for (C1643080srK c1643080srK : (ArrayList) optionCategoryPanelViewModel.LLILZIL.LJFF) {
            for (C1643300srg c1643300srg : c1643080srK.LJ) {
                if (c1643300srg.LJFF != null && c1643300srg.LJIIJ) {
                    optionCategoryPanelViewModel.LLILZIL.LIZJ(new C1643220srY(c1643080srK.LIZ, -1, "", -1, c1643300srg), null, false);
                }
            }
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1642430sqH(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILJIL = (l0) c1drg.LJIIL(null, l0.class);
        this.LLJILJILJ = (ShortVideoContext) c1drg.LJII(ShortVideoContext.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC577400Mkk.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(c1drg, C1631190sY9.class, "lazyControlProgressConfig");
    }

    public final void LLLII(BottomSheetBehavior<View> bottomSheetBehavior) {
        boolean z;
        String str;
        Effect effect;
        String str2;
        boolean z2;
        String name;
        OptionCategoryPanelFragment optionCategoryPanelFragment;
        List<C1621190sI1> listHc;
        Effect effect2 = this.LLJJIII;
        if (effect2 != null && C1624550sNR.LJ(effect2)) {
            z = true;
        } else {
            z = false;
        }
        OptionCategoryPanelViewModel optionCategoryPanelViewModel = null;
        if (z) {
            LLLIIIIL().qR2();
            effect2 = LLLIIIIL().LLIZLLLIL;
            effect = this.LLJJIII;
            l0 l0Var = this.LLJILJIL;
            if (l0Var != null && (listHc = l0Var.hc()) != null && (!listHc.isEmpty())) {
                str2 = ((C1621190sI1) ListProtector.get(listHc, 0)).LIZ;
            } else {
                str2 = null;
            }
            str = "mix_other_effects";
        } else {
            str = "prop_click";
            effect = null;
            str2 = null;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("enter_method", "click");
        Effect effect3 = this.LLJJIII;
        if (effect3 != null && C1624550sNR.LJ(effect3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0lab.LJFF("is_stackable", z2);
        Effect effect4 = this.LLJJIII;
        if (effect4 != null) {
            name = effect4.getName();
        } else {
            name = null;
        }
        c0lab.LJ("entry_effect_identifier", name);
        C1449260noi.LJ("click_mix_other_effects", c0lab.LIZ);
        C1641930spT c1641930spT = this.LLJILLL;
        if (c1641930spT != null) {
            c1641930spT.show();
        }
        if (C1621950sJF.LIZ() && !C1443960ngA.LJIIL(this.LLJILJILJ)) {
            if (C1631200sYA.LIZ((C1631190sY9) this.LLJJJJ.getValue(this, LLJJJJLIIL[1]))) {
                ((C0ETY) this.LLJI.LJII(C0ETY.class, null)).Sd(InterfaceC1630630sXF.class, new AwS265S0000000_25(3));
            } else {
                InterfaceC1649820t2C interfaceC1649820t2C = (InterfaceC1649820t2C) getDiContainer().LJIIL(null, InterfaceC1630630sXF.class);
                if (interfaceC1649820t2C != null) {
                    interfaceC1649820t2C.W9(false);
                }
            }
        }
        if (effect2 != null) {
            FragmentManager supportFragmentManager = ((C19EG) requireActivity()).getSupportFragmentManager();
            InterfaceC524950KiL interfaceC524950KiL = this.LLJJI;
            if (interfaceC524950KiL != null) {
                interfaceC524950KiL.AH(this);
                interfaceC524950KiL.Qh((InterfaceC484050IyZ) this.LLJJJJJIL.getValue());
            }
            WeakReference<OptionCategoryPanelFragment> weakReference = this.LLJJIJIL;
            if (weakReference != null && (optionCategoryPanelFragment = weakReference.get()) != null) {
                OptionCategoryPanelViewModel optionCategoryPanelViewModel2 = optionCategoryPanelFragment.LLIZ;
                if (optionCategoryPanelViewModel2 != null) {
                    optionCategoryPanelViewModel = optionCategoryPanelViewModel2;
                }
                optionCategoryPanelViewModel.wQ2();
            } else {
                OptionCategoryPanelFragment optionCategoryPanelFragment2 = new OptionCategoryPanelFragment(this.LLJILJIL, this.LLJILJILJ);
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIZ(bundle, "panel_effect", effect2);
                C786410Ut5.LJJIZ(bundle, "stackable_effect", effect);
                C786410Ut5.LJJJI("selected_image_path", str2, bundle);
                optionCategoryPanelFragment2.setArguments(bundle);
                optionCategoryPanelFragment2.LLJILJIL = new AwS391S0200000_25(this, optionCategoryPanelFragment2, 35);
                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.ppw, optionCategoryPanelFragment2, "OptionListScene");
                c19ehLJIIJ.LJIIIZ();
                this.LLJJIJIL = new WeakReference<>(optionCategoryPanelFragment2);
            }
        }
        C1641930spT c1641930spT2 = this.LLJILLL;
        if (c1641930spT2 != null) {
            c1641930spT2.LLLII(8);
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(3);
        }
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        InterfaceC1642470sqL interfaceC1642470sqL = this.LLJJJ;
        if (interfaceC1642470sqL != null) {
            interfaceC1642470sqL.LIZLLL(this.LLJJ, this.LLJJIJI);
            return false;
        }
        return false;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C19A3 c19a3;
        C1641930spT c1641930spT;
        super.onViewCreated(view, bundle);
        Scene scene = this.mParentScene;
        C1645710svZ c1645710svZ = null;
        if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null && (c1641930spT = (C1641930spT) c19a3.findSceneByTag("RecordStickerPanelScene")) != null) {
            c1641930spT.LLJILJILJ = new AwS604S0100000_25(this, 49);
            this.LLJILLL = c1641930spT;
        }
        this.LLJJI = C0MWZ.LIZ(this);
        View viewFindViewById = findViewById(R.id.md6);
        if (viewFindViewById != null) {
            BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            this.LLJJ = bottomSheetBehaviorFrom;
            if (bottomSheetBehaviorFrom != null) {
                bottomSheetBehaviorFrom.setHideable(true);
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.LLJJ;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setPeekHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(272)));
            }
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.LLJJ;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0sqM
                    @Override // X.AbstractC1177930gl5
                    public final void LIZJ(View view2, float f) {
                    }

                    @Override // X.AbstractC1177930gl5
                    public final void LIZLLL(int i, View view2) {
                        if (i != 3) {
                            if (i == 5) {
                                this.LIZ.LLLIIIIL().rR2(false);
                                return;
                            }
                            return;
                        }
                        this.LIZ.LLLIIIIL().rR2(true);
                    }
                });
            }
        }
        this.LLJJIJIIJIL = (TuxTextView) findViewById(R.id.q1d);
        C1645710svZ c1645710svZ2 = (C1645710svZ) findViewById(R.id.pqb);
        if (c1645710svZ2 != null) {
            C786410Ut5.Sa(c1645710svZ2, new ACListenerS159S0100000_25(this, 0));
            c1645710svZ = c1645710svZ2;
        }
        this.LLJJIJI = c1645710svZ;
        LLLIIIIL().LLJI.LIZ(this, new AObjectS246S0100000_25(this, 3));
        C11EA.LJIIIIZZ(this, LLLIIIIL(), new C2217381BqS() { // from class: X.0sq0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((UiState) obj).getUi();
            }
        }, new C2217381BqS() { // from class: X.0spy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((OptionPanelState) obj).getEffect();
            }
        }, new AwS674S0100000_25(this, 2));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.er1, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}

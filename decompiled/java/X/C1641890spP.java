package X;

import Y.ACListenerS159S0100000_25;
import Y.AObjectS246S0100000_25;
import Y.ATListenerS457S0100000_25;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoPanelState;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS632S0100000_18;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0spP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641890spP extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV, InterfaceC362610EJn, InterfaceC484050IyZ {
    public final C1DRG LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS426S0200000_25(this, C13LE.LIZ(EffectInfoViewModel.class), 77));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 417));
    public final InterfaceC1635700sfQ LLJILJILJ;
    public final InterfaceC1639210sl5 LLJILLL;
    public C1639050skp LLJJ;
    public ViewPagerBottomSheetBehavior<View> LLJJI;
    public final q LLJJIII;

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

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return true;
    }

    public final EffectInfoViewModel LLLII() {
        return (EffectInfoViewModel) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C1639050skp c1639050skp = this.LLJJ;
        if (c1639050skp != null) {
            C790060Uyy.LIZLLL(c1639050skp);
            this.LLJJ = null;
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1641890spP(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILJILJ = (InterfaceC1635700sfQ) c1drg.LJIIL(null, InterfaceC1635700sfQ.class);
        this.LLJILLL = (InterfaceC1639210sl5) c1drg.LJIIL(null, InterfaceC1639210sl5.class);
        this.LLJJIII = (q) c1drg.LJIIL(null, q.class);
    }

    public final void LLLIIIIL(Effect effect) {
        UrlModel iconUrl;
        String name;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.mar);
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.m83);
        if (constraintLayout2 != null) {
            C786410Ut5.LL(0, constraintLayout2);
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) findViewById(R.id.m81);
        if (constraintLayout3 != null) {
            C786410Ut5.LL(0, constraintLayout3);
        }
        TextView textView = (TextView) findViewById(R.id.mac);
        ImageUrlModel imageUrlModel = null;
        if (textView != null) {
            if (effect != null) {
                name = effect.getName();
            } else {
                name = null;
            }
            textView.setText(name);
        }
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.mab);
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
            if (effect != null && (iconUrl = effect.getIconUrl()) != null) {
                imageUrlModel = new ImageUrlModel(iconUrl.getUri(), iconUrl.getUrlList());
            }
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
            c1331670kl3LJIIIIZZ.LJIJJLI = smartImageView.getResources().getDrawable(R.drawable.a97, smartImageView.getContext().getTheme());
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0sl3
                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    this.LL.LLLII().kR2(C1639020skm.LIZ);
                }
            });
        }
    }

    public final void LLLIILIL(boolean z, boolean z2) {
        Pair pair;
        if (z2) {
            if (z) {
                pair = new Pair(Integer.valueOf(R.attr.a1h), Integer.valueOf(R.string.cpj));
            } else {
                pair = new Pair(Integer.valueOf(R.attr.a1p), Integer.valueOf(R.string.cpa));
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            Integer numLIZ = C1308910kAL.LIZ(iIntValue, requireSceneContext());
            if (numLIZ != null) {
                int iIntValue3 = numLIZ.intValue();
                TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.mav);
                if (tuxIconView != null) {
                    tuxIconView.setTintColor(iIntValue3);
                }
            }
            TextView textView = (TextView) findViewById(R.id.maw);
            if (textView != null) {
                textView.setText(requireSceneContext().getString(iIntValue2));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.mau);
            if (constraintLayout != null) {
                C786410Ut5.LL(0, constraintLayout);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.mau);
        if (constraintLayout2 == null) {
            return;
        }
        C786410Ut5.LL(8, constraintLayout2);
    }

    @Override // X.InterfaceC362610EJn
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            LLLII().kR2(C1639070skr.LIZ);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Uyz, X.0skp] */
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        super.onViewCreated(view, bundle);
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehaviorFrom = ViewPagerBottomSheetBehavior.from(findViewById(R.id.fpl));
        viewPagerBottomSheetBehaviorFrom.setPeekHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(390)));
        viewPagerBottomSheetBehaviorFrom.setHideable(true);
        viewPagerBottomSheetBehaviorFrom.setBottomSheetCallback(new C16BV() { // from class: X.0sl4
            @Override // X.C16BV
            public final void LIZIZ(View view2, float f) {
            }

            @Override // X.C16BV
            public final void LIZJ(int i, View view2) {
                InterfaceC1639210sl5 interfaceC1639210sl5;
                C19A3 c19a3;
                if (i == 5) {
                    C1641890spP c1641890spP = this.LIZ;
                    Scene scene = c1641890spP.mParentScene;
                    if ((scene instanceof C19A3) && (c19a3 = (C19A3) scene) != null) {
                        c19a3.hide(c1641890spP);
                    }
                    if (C0CHQ.LIZ().getAccountService().LIZ() && (interfaceC1639210sl5 = c1641890spP.LLJILLL) != null) {
                        interfaceC1639210sl5.D22(true);
                    }
                    InterfaceC524950KiL interfaceC524950KiLLIZ = C0MWZ.LIZ(c1641890spP);
                    if (interfaceC524950KiLLIZ != null) {
                        interfaceC524950KiLLIZ.b8(c1641890spP);
                        interfaceC524950KiLLIZ.T4(c1641890spP);
                    }
                }
            }
        });
        this.LLJJI = viewPagerBottomSheetBehaviorFrom;
        View viewFindViewById = findViewById(R.id.mh2);
        if (viewFindViewById != null) {
            viewFindViewById.setOnTouchListener(new ATListenerS457S0100000_25(this, 3));
        }
        View viewFindViewById2 = findViewById(R.id.mau);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 25), viewFindViewById2);
        }
        View viewFindViewById3 = findViewById(R.id.ma4);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 26), viewFindViewById3);
        }
        View viewFindViewById4 = findViewById(R.id.meb);
        if (viewFindViewById4 != null) {
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 27), viewFindViewById4);
        }
        View viewFindViewById5 = findViewById(R.id.m91);
        if (viewFindViewById5 != null) {
            C786410Ut5.I7(new ACListenerS159S0100000_25(this, 28), viewFindViewById5);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.ma_);
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS159S0100000_25(this, 29));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.mar);
        if (constraintLayout2 != null) {
            C786410Ut5.Y7(constraintLayout2, new ACListenerS159S0100000_25(this, 30));
        }
        C790060Uyy.LIZIZ(requireSceneContext());
        ?? r0 = new InterfaceC790070Uyz() { // from class: X.0skp
            public boolean LIZ = true;

            @Override // X.InterfaceC790070Uyz
            public final void LIZ() {
                this.LIZ = false;
            }

            @Override // X.InterfaceC790070Uyz
            public final void LIZIZ() {
                if (this.LIZ) {
                    return;
                }
                this.LIZIZ.LLLII().kR2(C1639040sko.LIZ);
                this.LIZ = true;
            }
        };
        this.LLJJ = r0;
        C790060Uyy.LIZJ(r0);
        EffectInfoViewModel effectInfoViewModelLLLII = LLLII();
        C11EA.LJII(this, effectInfoViewModelLLLII, new C2217381BqS() { // from class: X.0soP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EffectInfoPanelState) obj).getEffect();
            }
        }, new AwS639S0100000_25(this, 56));
        C11EA.LJII(this, effectInfoViewModelLLLII, new C2217381BqS() { // from class: X.0soR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EffectInfoPanelState) obj).getCreatorName();
            }
        }, new AwS632S0100000_18(this, 198));
        C11EA.LJIIIIZZ(this, effectInfoViewModelLLLII, new C2217381BqS() { // from class: X.0soQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isFavorite());
            }
        }, new C2217381BqS() { // from class: X.0soN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isFavoriteVisible());
            }
        }, new AwS674S0100000_25(this, 20));
        if (C1621950sJF.LIZ() && (constraintLayout = (ConstraintLayout) findViewById(R.id.ste)) != null) {
            C786410Ut5.LL(0, constraintLayout);
        }
        C1641260soO c1641260soO = new C2217381BqS() { // from class: X.0soO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isDiscoverVisible());
            }
        };
        C1765020w20 c1765020w20 = new C1765020w20();
        c1765020w20.LIZLLL = false;
        c1765020w20.LIZJ = true;
        C11EA.LJI(this, effectInfoViewModelLLLII, c1641260soO, c1765020w20, new AwS632S0100000_18(this, 199));
        C1641240soM c1641240soM = new C2217381BqS() { // from class: X.0soM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((EffectInfoPanelState) obj).isReportAndBlockVisible());
            }
        };
        C1765020w20 c1765020w202 = new C1765020w20();
        c1765020w202.LIZLLL = false;
        c1765020w202.LIZJ = true;
        C11EA.LJI(this, effectInfoViewModelLLLII, c1641240soM, c1765020w202, new AwS632S0100000_18(this, 197));
        effectInfoViewModelLLLII.LLJJIII.LIZ(effectInfoViewModelLLLII, new AObjectS246S0100000_25(this, 293));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.epr, viewGroup, false);
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

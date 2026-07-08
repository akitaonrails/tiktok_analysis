package X;

import Y.AObserverS218S0100000_14;
import Y.AObserverS231S0100000_29;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;
import pyl.s;

/* JADX INFO: renamed from: X.12Uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19765512Uz extends AbstractC1170430gYz implements InterfaceC1166920gTK {
    public C12V4 LLJI;
    public C19771612Xi LLJIJIL;
    public CutMultiVideoViewModel LLJILJILJ;
    public CutVideoSpeedViewModel LLJILLL;
    public float LLJJ;
    public boolean LLJILJIL = true;
    public s LLJJI = s.NORMAL;

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

    public void LLLIIIIL() {
        C19771612Xi c19771612Xi = this.LLJIJIL;
        if (c19771612Xi == null) {
            c19771612Xi = null;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c19771612Xi.getLayoutParams();
        layoutParams.bottomMargin = (int) this.LLJJ;
        C19771612Xi c19771612Xi2 = this.LLJIJIL;
        C19771612Xi c19771612Xi3 = c19771612Xi2 != null ? c19771612Xi2 : null;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19771612Xi3);
        c19771612Xi3.setLayoutParams(layoutParams);
    }

    public static s LLLII(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return s.FAST;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown view: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return s.NORMAL;
        }
        return s.SLOW;
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CutVideoSpeedViewModel cutVideoSpeedViewModel = null;
        this.LLJILJILJ = (CutMultiVideoViewModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(CutMultiVideoViewModel.class);
        this.LLJILLL = (CutVideoSpeedViewModel) C1659640tI2.LIZLLL(this).LIZ(CutVideoSpeedViewModel.class);
        C1659640tI2.LIZLLL(this).LIZ(CutVideoViewModel.class);
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.LLJILLL;
        if (cutVideoSpeedViewModel2 == null) {
            cutVideoSpeedViewModel2 = null;
        }
        selectNonNullSubscribe(cutVideoSpeedViewModel2, new C2217381BqS() { // from class: X.12V2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoSpeedState) obj).getEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 115));
        CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.LLJILLL;
        if (cutVideoSpeedViewModel3 == null) {
            cutVideoSpeedViewModel3 = null;
        }
        selectNonNullSubscribe(cutVideoSpeedViewModel3, new C2217381BqS() { // from class: X.12V3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoSpeedState) obj).getVisible();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 116));
        CutVideoSpeedViewModel cutVideoSpeedViewModel4 = this.LLJILLL;
        if (cutVideoSpeedViewModel4 == null) {
            cutVideoSpeedViewModel4 = null;
        }
        ((LiveData) cutVideoSpeedViewModel4.LLILZLL.getValue()).observe(this, new AObserverS218S0100000_14(this, 33));
        CutVideoSpeedViewModel cutVideoSpeedViewModel5 = this.LLJILLL;
        if (cutVideoSpeedViewModel5 == null) {
            cutVideoSpeedViewModel5 = null;
        }
        ((LiveData) cutVideoSpeedViewModel5.LLILZIL.getValue()).observe(this, new AObserverS231S0100000_29(this, 211));
        CutVideoSpeedViewModel cutVideoSpeedViewModel6 = this.LLJILLL;
        if (cutVideoSpeedViewModel6 != null) {
            cutVideoSpeedViewModel = cutVideoSpeedViewModel6;
        }
        ((LiveData) cutVideoSpeedViewModel.LLIZ.getValue()).observe(this, new AObserverS231S0100000_29(this, 212));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJ = C0GTQ.LIZ(163.0f, view.getContext());
        C19771612Xi c19771612Xi = (C19771612Xi) view;
        this.LLJIJIL = c19771612Xi;
        c19771612Xi.LIZ(getString(2131848341));
        c19771612Xi.LIZ(getString(2131848761));
        c19771612Xi.LIZ(getString(2131834423));
        C19771612Xi c19771612Xi2 = this.LLJIJIL;
        C19771612Xi c19771612Xi3 = null;
        if (c19771612Xi2 == null) {
            c19771612Xi2 = null;
        }
        c19771612Xi2.setCurrentItem(1);
        C19771612Xi c19771612Xi4 = this.LLJIJIL;
        if (c19771612Xi4 != null) {
            c19771612Xi3 = c19771612Xi4;
        }
        c19771612Xi3.setOnItemChangeListener(new InterfaceC19771712Xj() { // from class: X.12V0
            @Override // X.InterfaceC19771712Xj
            public final void LIZ(int i) {
                C19765512Uz c19765512Uz = this.LIZ;
                if (c19765512Uz.LLJILJIL) {
                    c19765512Uz.LLJJI = C19765512Uz.LLLII(i);
                    CutMultiVideoViewModel cutMultiVideoViewModel = this.LIZ.LLJILJILJ;
                    if (cutMultiVideoViewModel == null) {
                        cutMultiVideoViewModel = null;
                    }
                    cutMultiVideoViewModel.LLILZIL.setValue(Float.valueOf(C19765512Uz.LLLII(i).value()));
                }
            }

            @Override // X.InterfaceC19771712Xj
            public final boolean LIZIZ(int i) {
                float fLLIIJLIL;
                C19765512Uz c19765512Uz = this.LIZ;
                if (!c19765512Uz.LLJILJIL || c19765512Uz.LLJI == null) {
                    return false;
                }
                int i2 = C12VL.LIZIZ;
                long jLIZIZ = C566050MHz.LIZIZ();
                C12V4 c12v4 = this.LIZ.LLJI;
                if (c12v4 != null) {
                    fLLIIJLIL = c12v4.LLIIJLIL();
                } else {
                    fLLIIJLIL = 0.0f;
                }
                float fValue = this.LIZ.LLJJI.value();
                this.LIZ.getClass();
                float fValue2 = C19765512Uz.LLLII(i).value();
                float f = jLIZIZ / 1000.0f;
                if ((fLLIIJLIL * fValue) / fValue2 >= f) {
                    return true;
                }
                String string = this.LIZ.requireActivity().getResources().getString(2131858136, Integer.valueOf((int) ((f * fValue2) / fValue)));
                Activity activity = this.LIZ.mActivity;
                if (activity == null) {
                    return false;
                }
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(string);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZ(activity, 3067, creativeToastBuilder);
                return false;
            }
        });
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.enl, viewGroup, false);
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

package X;

import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.12Wg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19768812Wg extends AbstractC1170430gYz implements InterfaceC1166920gTK {
    public ImageView LLJI;
    public C197039127h LLJIJIL;
    public CutVideoViewModel LLJILJIL;
    public CutVideoTitleBarViewModel LLJILJILJ;

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

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJILJIL = (CutVideoViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoViewModel.class);
        this.LLJILJILJ = (CutVideoTitleBarViewModel) C1659650tI3.LIZ((C19EG) this.mActivity).LIZ(CutVideoTitleBarViewModel.class);
        CutVideoViewModel cutVideoViewModel = this.LLJILJIL;
        ImageView imageView = null;
        if (cutVideoViewModel == null) {
            cutVideoViewModel = null;
        }
        if (!cutVideoViewModel.mR2()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mView.getLayoutParams();
            layoutParams.topMargin = ((int) C12ES.LIZJ(25.0f, this.mActivity)) + ScreenUtils.getStatusBarHeight(this.mActivity);
            C786410Ut5.W5(this.mView, layoutParams);
        } else {
            View view = this.mView;
            if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                layoutParams2.topMargin = ScreenUtils.getStatusBarHeight(this.mActivity);
                C786410Ut5.W5(view, layoutParams2);
            } else if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams3.topMargin = ScreenUtils.getStatusBarHeight(this.mActivity);
                C786410Ut5.W5(view, layoutParams3);
            }
        }
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LLJILJILJ;
        if (cutVideoTitleBarViewModel == null) {
            cutVideoTitleBarViewModel = null;
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel, new C2217381BqS() { // from class: X.12X7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoTitleBarState) obj).getBackVisible();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 128));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.LLJILJILJ;
        if (cutVideoTitleBarViewModel2 == null) {
            cutVideoTitleBarViewModel2 = null;
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel2, new C2217381BqS() { // from class: X.12X8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoTitleBarState) obj).getNextVisible();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 130));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel3 = this.LLJILJILJ;
        if (cutVideoTitleBarViewModel3 == null) {
            cutVideoTitleBarViewModel3 = null;
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel3, new C2217381BqS() { // from class: X.12X9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoTitleBarState) obj).getBackEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 133));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel4 = this.LLJILJILJ;
        if (cutVideoTitleBarViewModel4 == null) {
            cutVideoTitleBarViewModel4 = null;
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel4, new C2217381BqS() { // from class: X.12XA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoTitleBarState) obj).getNextEnable();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 136));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel5 = this.LLJILJILJ;
        if (cutVideoTitleBarViewModel5 == null) {
            cutVideoTitleBarViewModel5 = null;
        }
        selectNonNullSubscribe(cutVideoTitleBarViewModel5, new C2217381BqS() { // from class: X.12XB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((CutVideoTitleBarState) obj).isV2VEffect();
            }
        }, new C1765020w20(), new AwS643S0100000_29(this, 123));
        CutVideoViewModel cutVideoViewModel2 = this.LLJILJIL;
        if (cutVideoViewModel2 == null) {
            cutVideoViewModel2 = null;
        }
        if (cutVideoViewModel2.lR2().LJIIZILJ.newVideoPipelineExtraModel.isNewVideoPipelineEnabled) {
            C786410Ut5.x3(this.mView.getViewTreeObserver(), new C12YW(this, 16));
        }
        ImageView imageView2 = this.LLJI;
        if (imageView2 != null) {
            imageView = imageView2;
        }
        C786410Ut5.Q7(imageView, new ACListenerS163S0100000_29(this, 278));
        C197039127h c197039127h = this.LLJIJIL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new AkS95S0100000_29(this, 86));
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJI = (ImageView) requireViewById(R.id.l5k);
        this.LLJIJIL = (C197039127h) requireViewById(R.id.z4t);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.enm, viewGroup, false);
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

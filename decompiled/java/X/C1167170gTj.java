package X;

import Y.ACListenerS153S0100000_18;
import Y.AObjectS302S0200000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import nv7.c0;

/* JADX INFO: renamed from: X.0gTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1167170gTj extends Scene implements InterfaceC1166920gTK {
    public final C1170020gYK LLJI;
    public final C385670FAf<Boolean> LLJIJIL;
    public final Function2<String, Long, Unit> LLJILJIL;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(611));

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
    public final void onViewCreated(View view, Bundle bundle) {
        int iLIZIZ;
        View viewLIZIZ;
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.xh_);
        View viewRequireViewById = requireViewById(R.id.xiq);
        C418740GbQ c418740GbQ = (C418740GbQ) findViewById(R.id.kgb);
        if (c418740GbQ != null) {
            C786410Ut5.Ua(c418740GbQ, new ACListenerS153S0100000_18(this, 126));
        }
        this.LLJIJIL.LIZ(this, new AObjectS302S0200000_5(viewRequireViewById, this, 2));
        InterfaceC1167150gTh interfaceC1167150gTh = (InterfaceC1167150gTh) this.LLJILJILJ.getValue();
        if (interfaceC1167150gTh != null && (viewLIZIZ = interfaceC1167150gTh.LIZIZ(requireSceneContext(), this, this.LLJI)) != null) {
            C786410Ut5.W5(viewLIZIZ, new FrameLayout.LayoutParams(-1, -2));
            if (viewGroup != null) {
                viewGroup.addView(viewLIZIZ);
            }
        }
        if (C1462920oAk.LIZLLL()) {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                iLIZIZ = c1660590tJZ.LIZIZ();
            } else {
                iLIZIZ = 0;
            }
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = iLIZIZ + iLIZIZ2;
                    C786410Ut5.W5(viewGroup, layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public C1167170gTj(C1170020gYK c1170020gYK, C385670FAf c385670FAf, C1168830gWP c1168830gWP) {
        this.LLJI = c1170020gYK;
        this.LLJIJIL = c385670FAf;
        this.LLJILJIL = c1168830gWP;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.d58, viewGroup, false);
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

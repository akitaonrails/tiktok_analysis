package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0gTI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166900gTI {
    public static void LIZ(JediViewModel jediViewModel, final LifecycleOwner lifecycleOwner, C2217381BqS c2217381BqS, Function2 function2) {
        C1170060gYO.LIZIZ(new InterfaceC1166920gTK() { // from class: X.0gTH
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

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return lifecycleOwner.getLifecycle();
            }

            @Override // X.C11E9
            public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
                return function1.invoke(vm1.FQ2());
            }

            @Override // X.C11E9
            public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel2, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function22) {
                return C11EA.LJIIJJI(this, jediViewModel2, c1765020w20, function22);
            }

            @Override // X.InterfaceC1166920gTK
            public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel2, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function22) {
                C1170060gYO.LIZIZ(this, jediViewModel2, interfaceC2217241BqE, c1765020w20, function22);
            }

            @Override // X.C11E9
            public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel2, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function22) {
                return C11EA.LJI(this, jediViewModel2, interfaceC2217241BqE, c1765020w20, function22);
            }

            @Override // X.InterfaceC1166920gTK
            public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel2, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function22) {
                C1170060gYO.LIZLLL(this, jediViewModel2, interfaceC2217241BqE, c1765020w20, function22);
            }

            @Override // X.C11E9
            public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel2, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
                return C11EA.LJFF(this, jediViewModel2, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
            }

            @Override // X.C11E9
            public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel2, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function22, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function23) {
                return C11EA.LIZ(this, jediViewModel2, interfaceC2217241BqE, c1765020w20, function22, function1, function23);
            }

            @Override // X.C11E9
            public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel2, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
                return C11EA.LJ(this, jediViewModel2, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
            }

            @Override // X.C11E9
            public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel2, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
                return C11EA.LIZLLL(this, jediViewModel2, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
            }
        }, jediViewModel, c2217381BqS, new C1765020w20(), function2);
    }
}

package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S0400000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS490S0200000_29;

/* JADX INFO: renamed from: X.11EA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11EA {
    public static void LJIIL(C11E9 c11e9, JediViewModel jediViewModel, Function2 function2) {
        c11e9.subscribe(jediViewModel, new C1765020w20(), function2);
    }

    public static InterfaceC420801kM LJII(C11E9 c11e9, JediViewModel jediViewModel, InterfaceC2217241BqE interfaceC2217241BqE, Function2 function2) {
        return c11e9.selectSubscribe(jediViewModel, interfaceC2217241BqE, new C1765020w20(), function2);
    }

    public static <RECEIVER extends InterfaceC874803bO, S extends C004I> InterfaceC420801kM LJIIJJI(C11E9<? extends RECEIVER> c11e9, JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super RECEIVER, ? super S, Unit> function2) {
        C11DL<RECEIVER> receiverHolder = c11e9.getReceiverHolder();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        C11ED.LIZ(c11e9, c1765020w20);
        return C11ED.LJI(jediViewModel, lifecycleOwner, c1765020w20, new AwS395S0200000_29((C11DL) receiverHolder, (C11DL<Object>) function2, (Function2<Object, ? super Throwable, Unit>) 80));
    }

    public static <RECEIVER extends InterfaceC874803bO, S extends C004I, A> InterfaceC420801kM LJI(C11E9<? extends RECEIVER> c11e9, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super RECEIVER, ? super A, Unit> function2) {
        C11DL<RECEIVER> receiverHolder = c11e9.getReceiverHolder();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        C11ED.LIZ(c11e9, c1765020w20);
        return C11ED.LJFF(jediViewModel, lifecycleOwner, interfaceC2217241BqE, c1765020w20, new AwS395S0200000_29((C11DL) receiverHolder, (C11DL<Object>) function2, (Function2<Object, ? super Throwable, Unit>) 79));
    }

    public static InterfaceC420801kM LJIIIIZZ(C11E9 c11e9, JediViewModel jediViewModel, C2217381BqS c2217381BqS, C2217381BqS c2217381BqS2, InterfaceC1631620sYq interfaceC1631620sYq) {
        return c11e9.selectSubscribe(jediViewModel, c2217381BqS, c2217381BqS2, new C1765020w20(), interfaceC1631620sYq);
    }

    public static <RECEIVER extends InterfaceC874803bO, S extends C004I, A, B> InterfaceC420801kM LJFF(C11E9<? extends RECEIVER> c11e9, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super RECEIVER, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        C11DL<RECEIVER> receiverHolder = c11e9.getReceiverHolder();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        C11ED.LIZ(c11e9, c1765020w20);
        return C11ED.LJ(jediViewModel, lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, new AwS464S0200000_29(receiverHolder, interfaceC1631620sYq, 11));
    }

    public static void LJIIJ(C11E9 c11e9, JediViewModel jediViewModel, C2217381BqS c2217381BqS, C2217381BqS c2217381BqS2, C2217381BqS c2217381BqS3, InterfaceC1631630sYr interfaceC1631630sYr) {
        c11e9.selectSubscribe(jediViewModel, c2217381BqS, c2217381BqS2, c2217381BqS3, new C1765020w20(), interfaceC1631630sYr);
    }

    public static <RECEIVER extends InterfaceC874803bO, S extends C004I, T> InterfaceC420801kM LIZ(C11E9<? extends RECEIVER> c11e9, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super RECEIVER, ? super Throwable, Unit> function2, Function1<? super RECEIVER, Unit> function1, Function2<? super RECEIVER, ? super T, Unit> function22) {
        C11DL<RECEIVER> receiverHolder = c11e9.getReceiverHolder();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        C11ED.LIZ(c11e9, c1765020w20);
        return C11ED.LJFF(jediViewModel, lifecycleOwner, interfaceC2217241BqE, c1765020w20, new AwS124S0400000_29(function1, function2, function22, receiverHolder, 4));
    }

    public static void LIZIZ(C11E9 c11e9, JediViewModel jediViewModel, C2217381BqS c2217381BqS, Function2 function2, Function1 function1, Function2 function22, int i) {
        C1765020w20 c1765020w20;
        Function1 function12 = function1;
        Function2 function23 = function2;
        Function2 function24 = null;
        if ((i & 2) != 0) {
            c1765020w20 = new C1765020w20();
        } else {
            c1765020w20 = null;
        }
        if ((i & 4) != 0) {
            function23 = null;
        }
        if ((i & 8) != 0) {
            function12 = null;
        }
        if ((i & 16) == 0) {
            function24 = function22;
        }
        c11e9.asyncSubscribe(jediViewModel, c2217381BqS, c1765020w20, function23, function12, function24);
    }

    public static <RECEIVER extends InterfaceC874803bO, S extends C004I, A, B, C> InterfaceC420801kM LJ(C11E9<? extends RECEIVER> c11e9, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super RECEIVER, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        C11DL<RECEIVER> receiverHolder = c11e9.getReceiverHolder();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        C11ED.LIZ(c11e9, c1765020w20);
        return C11ED.LIZLLL(jediViewModel, lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, new AwS490S0200000_29(receiverHolder, interfaceC1631630sYr, 3));
    }

    public static void LJIIIZ(C11E9 c11e9, JediViewModel jediViewModel, C2217381BqS c2217381BqS, C2217381BqS c2217381BqS2, C2217381BqS c2217381BqS3, C2217381BqS c2217381BqS4, InterfaceC1685420txc interfaceC1685420txc) {
        c11e9.selectSubscribe(jediViewModel, c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, new C1765020w20(), interfaceC1685420txc);
    }

    public static <RECEIVER extends InterfaceC874803bO, S extends C004I, A, B, C, D> InterfaceC420801kM LIZLLL(C11E9<? extends RECEIVER> c11e9, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        C11DL<RECEIVER> receiverHolder = c11e9.getReceiverHolder();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        C11ED.LIZ(c11e9, c1765020w20);
        return C11ED.LIZJ(jediViewModel, lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, new C19775712Yx(receiverHolder, interfaceC1685420txc, 0));
    }

    public static <RECEIVER extends InterfaceC874803bO, S extends C004I, A, B, C, D, E> InterfaceC420801kM LIZJ(C11E9<? extends RECEIVER> c11e9, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1765020w20<C11EE<A, B, C, D, E>> c1765020w20, InterfaceC1685430txd<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        C11DL<RECEIVER> receiverHolder = c11e9.getReceiverHolder();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        C11ED.LIZ(c11e9, c1765020w20);
        return C11ED.LIZIZ(jediViewModel, lifecycleOwner, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1765020w20, new C11EB(receiverHolder, interfaceC1685430txd));
    }
}

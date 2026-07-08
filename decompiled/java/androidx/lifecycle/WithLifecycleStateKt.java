package androidx.lifecycle;

import X.AbstractC2238408pq;
import X.AbstractC2252651DEx;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0PEM;
import X.C189200o6;
import X.C1DFH;
import X.C2107308Nj;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2252611DEt;
import X.C23271099x;
import X.InterfaceC1364105Vn;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class WithLifecycleStateKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.lifecycle.WithLifecycleStateKt$withStateAtLeastUnchecked$2, reason: invalid class name */
    public final class AnonymousClass2<R> implements Function0<R> {
        public final /* synthetic */ Function0<R> $block;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function0<? extends R> function0) {
            this.$block = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
    }

    public static final <R> Object withCreated$$forInline(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        lifecycleOwner.getLifecycle();
        C1DFH c1dfh = C0PEM.LIZ;
        C2107308Nj.LIZ.LLIILII();
        throw null;
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
    }

    public static final <R> Object withResumed$$forInline(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        lifecycleOwner.getLifecycle();
        C1DFH c1dfh = C0PEM.LIZ;
        C2107308Nj.LIZ.LLIILII();
        throw null;
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
    }

    public static final <R> Object withStarted$$forInline(LifecycleOwner lifecycleOwner, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        lifecycleOwner.getLifecycle();
        C1DFH c1dfh = C0PEM.LIZ;
        C2107308Nj.LIZ.LLIILII();
        throw null;
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
    }

    public static final <R> Object withCreated$$forInline(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        C2107308Nj.LIZ.LLIILII();
        throw null;
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
    }

    public static final <R> Object withResumed$$forInline(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        C2107308Nj.LIZ.LLIILII();
        throw null;
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
    }

    public static final <R> Object withStarted$$forInline(Lifecycle lifecycle, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        C2107308Nj.LIZ.LLIILII();
        throw null;
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
            boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return function0.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("target state must be CREATED or greater, found ");
        sbLIZ.append(state);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final <R> Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        lifecycleOwner.getLifecycle();
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            C2107308Nj.LIZ.LLIILII();
            throw null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("target state must be CREATED or greater, found ");
        sbLIZ.append(state);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    return function0.invoke();
                }
            } else {
                throw new LifecycleDestroyedException();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
    }

    public static final <R> Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        C2107308Nj.LIZ.LLIILII();
        throw null;
    }

    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
            boolean zIsDispatchNeeded = abstractC2238408pqLLIILII.isDispatchNeeded(interfaceC1364105Vn.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                    if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                        return function0.invoke();
                    }
                } else {
                    throw new LifecycleDestroyedException();
                }
            }
            return suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, abstractC2238408pqLLIILII, new AnonymousClass2(function0), interfaceC1364105Vn);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("target state must be CREATED or greater, found ");
        sbLIZ.append(state);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final <R> Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        if (state.compareTo(Lifecycle.State.CREATED) >= 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            C2107308Nj.LIZ.LLIILII();
            throw null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("target state must be CREATED or greater, found ");
        sbLIZ.append(state);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.LifecycleObserver, androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, boolean z, final AbstractC2252651DEx abstractC2252651DEx, final Function0<? extends R> function0, InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        final ?? r2 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Object c098200Yq;
                if (event == Lifecycle.Event.Companion.upTo(state)) {
                    lifecycle.removeObserver(this);
                    InterfaceC1364105Vn interfaceC1364105Vn2 = c2252611DEt;
                    try {
                        c098200Yq = function0.invoke();
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    interfaceC1364105Vn2.resumeWith(c098200Yq);
                    return;
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    InterfaceC1364105Vn interfaceC1364105Vn3 = c2252611DEt;
                    Object c098200Yq2 = new C098200Yq(new LifecycleDestroyedException());
                    C189200o6.m2constructorimpl(c098200Yq2);
                    interfaceC1364105Vn3.resumeWith(c098200Yq2);
                }
            }
        };
        if (z) {
            abstractC2252651DEx.dispatch(C23271099x.INSTANCE, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1__run$___twin___() {
                    lifecycle.addObserver(r2);
                }

                public static void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1) {
                    try {
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1.androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        } else {
            lifecycle.addObserver(r2);
        }
        c2252611DEt.LJJII(new Function1<Throwable, Unit>() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                AbstractC2252651DEx abstractC2252651DEx2 = abstractC2252651DEx;
                C23271099x c23271099x = C23271099x.INSTANCE;
                if (abstractC2252651DEx2.isDispatchNeeded(c23271099x)) {
                    AbstractC2252651DEx abstractC2252651DEx3 = abstractC2252651DEx;
                    final Lifecycle lifecycle2 = lifecycle;
                    final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = r2;
                    abstractC2252651DEx3.dispatch(c23271099x, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public final void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1__run$___twin___() {
                            lifecycle2.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
                        }

                        public static void androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                            try {
                                anonymousClass1.androidx_lifecycle_WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2$1__run$___twin___();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (!C2179971ATj.LIZ(th2)) {
                                    throw th2;
                                }
                            }
                        }
                    });
                    return;
                }
                lifecycle.removeObserver(r2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.LIZ;
            }
        });
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }
}

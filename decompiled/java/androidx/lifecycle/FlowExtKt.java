package androidx.lifecycle;

import X.AnonymousClass0955;
import X.C094D;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C09IC;
import X.C155000ia;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
    public final class AnonymousClass1<T> extends C09AX implements Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Lifecycle $lifecycle;
        public final /* synthetic */ Lifecycle.State $minActiveState;
        public final /* synthetic */ InterfaceC346201Wa<T> $this_flowWithLifecycle;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC346201Wa<? extends T> interfaceC346201Wa, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = interfaceC346201Wa;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC1364105Vn);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C094D<? super T> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        @C09DV(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {90}, m = "invokeSuspend")
        public final class C00031 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ C094D<T> $$this$callbackFlow;
            public final /* synthetic */ InterfaceC346201Wa<T> $this_flowWithLifecycle;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00031(InterfaceC346201Wa<? extends T> interfaceC346201Wa, C094D<? super T> c094d, InterfaceC1364105Vn<? super C00031> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$this_flowWithLifecycle = interfaceC346201Wa;
                this.$$this$callbackFlow = c094d;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C00031(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                Object objLJFF = C099R.LJFF();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    InterfaceC346201Wa<T> interfaceC346201Wa = this.$this_flowWithLifecycle;
                    final C094D<T> c094d = this.$$this$callbackFlow;
                    InterfaceC346701Wf<? super T> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // X.InterfaceC346701Wf
                        public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                            Object objLJIJI = c094d.LJIJI(t, interfaceC1364105Vn);
                            if (objLJIJI == C099R.LJFF()) {
                                return objLJIJI;
                            }
                            return Unit.LIZ;
                        }
                    };
                    this.label = 1;
                    if (interfaceC346201Wa.collect(interfaceC346701Wf, this) == objLJFF) {
                        return objLJFF;
                    }
                }
                return Unit.LIZ;
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass0955 anonymousClass0955;
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AnonymousClass0955 anonymousClass09552 = (AnonymousClass0955) this.L$0;
                    C155000ia.LIZIZ(obj);
                    anonymousClass0955 = anonymousClass09552;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C094D c094d = (C094D) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C00031 c00031 = new C00031(this.$this_flowWithLifecycle, c094d, null);
                this.L$0 = c094d;
                this.label = 1;
                anonymousClass0955 = c094d;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c00031, this) == objLJFF) {
                    return objLJFF;
                }
            }
            anonymousClass0955.LJIIJJI(null);
            return Unit.LIZ;
        }
    }

    public static final <T> InterfaceC346201Wa<T> flowWithLifecycle(InterfaceC346201Wa<? extends T> interfaceC346201Wa, Lifecycle lifecycle, Lifecycle.State state) {
        return C09IC.LJ(new AnonymousClass1(lifecycle, state, interfaceC346201Wa, null));
    }
}

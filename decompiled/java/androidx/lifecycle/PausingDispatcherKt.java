package androidx.lifecycle;

import X.C099R;
import X.C09AE;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes7.dex */
public final class PausingDispatcherKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend")
    public final class AnonymousClass2<T> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super T>, Object> {
        public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super T>, Object> $block;
        public final /* synthetic */ Lifecycle.State $minState;
        public final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = function2;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC1364105Vn);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        lifecycleController = (LifecycleController) this.L$0;
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    C09AE c09ae = (C09AE) ((InterfaceC497601wk) this.L$0).getCoroutineContext().get(C09AE.LJJLJ);
                    if (c09ae != null) {
                        PausingDispatcher pausingDispatcher = new PausingDispatcher();
                        lifecycleController = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, c09ae);
                        try {
                            Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super T>, Object> function2 = this.$block;
                            this.L$0 = lifecycleController;
                            this.label = 1;
                            obj = C23250099c.LJI(this, pausingDispatcher, function2);
                            if (obj == objLJFF) {
                                return objLJFF;
                            }
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                            lifecycleController.finish();
                            throw th;
                        }
                    } else {
                        "when[State] methods should have a parent job".toString();
                        throw new IllegalStateException("when[State] methods should have a parent job");
                    }
                }
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @InterfaceC1294060jmO
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return whenCreated(lifecycleOwner.getLifecycle(), function2, interfaceC1364105Vn);
    }

    @InterfaceC1294060jmO
    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return whenResumed(lifecycleOwner.getLifecycle(), function2, interfaceC1364105Vn);
    }

    @InterfaceC1294060jmO
    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return whenStarted(lifecycleOwner.getLifecycle(), function2, interfaceC1364105Vn);
    }

    @InterfaceC1294060jmO
    public static final <T> Object whenCreated(Lifecycle lifecycle, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, function2, interfaceC1364105Vn);
    }

    @InterfaceC1294060jmO
    public static final <T> Object whenResumed(Lifecycle lifecycle, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, function2, interfaceC1364105Vn);
    }

    @InterfaceC1294060jmO
    public static final <T> Object whenStarted(Lifecycle lifecycle, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, function2, interfaceC1364105Vn);
    }

    @InterfaceC1294060jmO
    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C1DFH c1dfh = C0PEM.LIZ;
        return C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ.LLIILII(), new AnonymousClass2(lifecycle, state, function2, null));
    }
}

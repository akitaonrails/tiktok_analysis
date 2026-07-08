package androidx.lifecycle;

import X.AnonymousClass0958;
import X.C099R;
import X.C09AE;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes4.dex */
public final class BlockRunner<T> {
    public final Function2<LiveDataScope<T>, InterfaceC1364105Vn<? super Unit>, Object> block;
    public C09AE cancellationJob;
    public final CoroutineLiveData<T> liveData;
    public final Function0<Unit> onDone;
    public C09AE runningJob;
    public final InterfaceC497601wk scope;
    public final long timeoutInMs;

    public final void cancel() {
        if (this.cancellationJob != null) {
            "Cancel call cannot happen without a maybeRun".toString();
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        InterfaceC497601wk interfaceC497601wk = this.scope;
        C1DFH c1dfh = C0PEM.LIZ;
        this.cancellationJob = C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ.LLIILII(), null, new AnonymousClass1(this, null), 2);
    }

    public final void maybeRun() {
        C09AE c09ae = this.cancellationJob;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = C23250099c.LIZLLL(this.scope, null, null, new C2325421(this, null), 3);
    }

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$cancel$1, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {180}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BlockRunner<T> blockRunner, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.this$0 = blockRunner;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass1(this.this$0, interfaceC1364105Vn);
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
                long j = this.this$0.timeoutInMs;
                this.label = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    return objLJFF;
                }
            }
            if (!this.this$0.liveData.hasActiveObservers()) {
                C09AE c09ae = this.this$0.runningJob;
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                this.this$0.runningJob = null;
            }
            return Unit.LIZ;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.BlockRunner$maybeRun$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {168}, m = "invokeSuspend")
    public final class C2325421 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325421(BlockRunner<T> blockRunner, InterfaceC1364105Vn<? super C2325421> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.this$0 = blockRunner;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            C2325421 c2325421 = new C2325421(this.this$0, interfaceC1364105Vn);
            c2325421.L$0 = obj;
            return c2325421;
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
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(this.this$0.liveData, ((InterfaceC497601wk) this.L$0).getCoroutineContext());
                Function2<LiveDataScope<T>, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.this$0.block;
                this.label = 1;
                if (function2.invoke(liveDataScopeImpl, this) == objLJFF) {
                    return objLJFF;
                }
            }
            this.this$0.onDone.invoke();
            return Unit.LIZ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BlockRunner(CoroutineLiveData<T> coroutineLiveData, Function2<? super LiveDataScope<T>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, long j, InterfaceC497601wk interfaceC497601wk, Function0<Unit> function0) {
        this.liveData = coroutineLiveData;
        this.block = function2;
        this.timeoutInMs = j;
        this.scope = interfaceC497601wk;
        this.onDone = function0;
    }
}

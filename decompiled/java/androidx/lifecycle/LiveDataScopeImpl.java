package androidx.lifecycle;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC2238208po;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    public final CoroutineContext coroutineContext;
    public CoroutineLiveData<T> target;

    @Override // androidx.lifecycle.LiveDataScope
    public T getLatestValue() {
        return this.target.getValue();
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_release() {
        return this.target;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emit$2, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {98}, m = "invokeSuspend")
    public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ T $value;
        public int label;
        public final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LiveDataScopeImpl<T> liveDataScopeImpl, T t, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.this$0 = liveDataScopeImpl;
            this.$value = t;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass2(this.this$0, this.$value, interfaceC1364105Vn);
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
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                this.label = 1;
                if (target$lifecycle_livedata_release.clearSource$lifecycle_livedata_release(this) == objLJFF) {
                    return objLJFF;
                }
            }
            this.this$0.getTarget$lifecycle_livedata_release().setValue(this.$value);
            return Unit.LIZ;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveDataScopeImpl$emitSource$2, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", l = {92}, m = "invokeSuspend")
    public final class C2325462 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC2238208po>, Object> {
        public final /* synthetic */ LiveData<T> $source;
        public int label;
        public final /* synthetic */ LiveDataScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325462(LiveDataScopeImpl<T> liveDataScopeImpl, LiveData<T> liveData, InterfaceC1364105Vn<? super C2325462> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.this$0 = liveDataScopeImpl;
            this.$source = liveData;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new C2325462(this.this$0, this.$source, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super InterfaceC2238208po> interfaceC1364105Vn) {
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
                CoroutineLiveData<T> target$lifecycle_livedata_release = this.this$0.getTarget$lifecycle_livedata_release();
                LiveData<T> liveData = this.$source;
                this.label = 1;
                obj = target$lifecycle_livedata_release.emitSource$lifecycle_livedata_release(liveData, this);
                if (obj == objLJFF) {
                    return objLJFF;
                }
            }
            return obj;
        }
    }

    public final void setTarget$lifecycle_livedata_release(CoroutineLiveData<T> coroutineLiveData) {
        this.target = coroutineLiveData;
    }

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, CoroutineContext coroutineContext) {
        this.target = coroutineLiveData;
        C1DFH c1dfh = C0PEM.LIZ;
        this.coroutineContext = coroutineContext.plus(C2107308Nj.LIZ.LLIILII());
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, this.coroutineContext, new AnonymousClass2(this, t, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public Object emitSource(LiveData<T> liveData, InterfaceC1364105Vn<? super InterfaceC2238208po> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, this.coroutineContext, new C2325462(this, liveData, null));
    }
}

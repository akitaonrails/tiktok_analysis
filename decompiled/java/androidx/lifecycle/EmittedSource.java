package androidx.lifecycle;

import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0PEM;
import X.C155000ia;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC2238208po;
import X.InterfaceC497601wk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes4.dex */
public final class EmittedSource implements InterfaceC2238208po {
    public boolean disposed;
    public final MediatorLiveData<?> mediator;
    public final LiveData<?> source;

    @Override // X.InterfaceC2238208po
    public void dispose() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new AnonymousClass1(null), 3);
    }

    public final void removeSource() {
        if (this.disposed) {
            return;
        }
        this.mediator.removeSource(this.source);
        this.disposed = true;
    }

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$dispose$1, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return EmittedSource.this.new AnonymousClass1(interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C099R.LJFF();
            if (this.label == 0) {
                C155000ia.LIZIZ(obj);
                EmittedSource.this.removeSource();
                return Unit.LIZ;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.EmittedSource$disposeNow$2, reason: invalid class name */
    @C09DV(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return EmittedSource.this.new AnonymousClass2(interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C099R.LJFF();
            if (this.label == 0) {
                C155000ia.LIZIZ(obj);
                EmittedSource.this.removeSource();
                return Unit.LIZ;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object disposeNow(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ.LLIILII(), new AnonymousClass2(null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public EmittedSource(LiveData<?> liveData, MediatorLiveData<?> mediatorLiveData) {
        this.source = liveData;
        this.mediator = mediatorLiveData;
    }
}

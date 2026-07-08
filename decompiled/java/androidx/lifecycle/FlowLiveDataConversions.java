package androidx.lifecycle;

import X.AbstractC2238408pq;
import X.AnonymousClass0958;
import X.C05YD;
import X.C08D9;
import X.C094D;
import X.C099R;
import X.C09AM;
import X.C09AX;
import X.C09DV;
import X.C09IC;
import X.C0PEM;
import X.C155000ia;
import X.C1DFH;
import X.C2107308Nj;
import X.C2197108jB;
import X.C23250099c;
import X.C23271099x;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import androidx.room.RoomTrackingLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.time.Duration;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowLiveDataConversions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    @C09DV(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, 108}, m = "invokeSuspend")
    public final class AnonymousClass1<T> extends C09AX implements Function2<C094D<? super T>, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ LiveData<T> $this_asFlow;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LiveData<T> liveData, InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$this_asFlow = liveData;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, interfaceC1364105Vn);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C094D<? super T> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        @C09DV(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public final class C00051 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ Observer<T> $observer;
            public final /* synthetic */ LiveData<T> $this_asFlow;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(LiveData<T> liveData, Observer<T> observer, InterfaceC1364105Vn<? super C00051> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new C00051(this.$this_asFlow, this.$observer, interfaceC1364105Vn);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C099R.LJFF();
                if (this.label == 0) {
                    C155000ia.LIZIZ(obj);
                    this.$this_asFlow.observeForever((Observer<? super T>) this.$observer);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
        @C09DV(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public final /* synthetic */ Observer<T> $observer;
            public final /* synthetic */ LiveData<T> $this_asFlow;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LiveData<T> liveData, Observer<T> observer, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new AnonymousClass2(this.$this_asFlow, this.$observer, interfaceC1364105Vn);
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
                    this.$this_asFlow.removeObserver(this.$observer);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Observer observer;
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.L$0;
                            C155000ia.LIZIZ(obj);
                            throw th;
                        }
                        observer = (Observer) this.L$0;
                        C155000ia.LIZIZ(obj);
                        throw new C2197108jB();
                    }
                    observer = (Observer) this.L$0;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    final C094D c094d = (C094D) this.L$0;
                    observer = new Observer() { // from class: X.01Yy
                        @Override // androidx.lifecycle.Observer
                        public final void onChanged(Object obj2) {
                            c094d.LJIIIIZZ(obj2);
                        }
                    };
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
                    C00051 c00051 = new C00051(this.$this_asFlow, observer, null);
                    this.L$0 = observer;
                    this.label = 1;
                    if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c00051) == objLJFF) {
                        return objLJFF;
                    }
                }
                this.L$0 = observer;
                this.label = 2;
                if (AnonymousClass0958.LIZ(this) == objLJFF) {
                    return objLJFF;
                }
                throw new C2197108jB();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1DFH c1dfh2 = C0PEM.LIZ;
                CoroutineContext coroutineContextPlus = C2107308Nj.LIZ.LLIILII().plus(C09AM.LL);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, observer, null);
                this.L$0 = th2;
                this.label = 3;
                if (C23250099c.LJI(this, coroutineContextPlus, anonymousClass2) == objLJFF) {
                    return objLJFF;
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
    public final class C2325431<T> extends C09AX implements Function2<LiveDataScope<T>, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ InterfaceC346201Wa<T> $this_asLiveData;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C2325431(InterfaceC346201Wa<? extends T> interfaceC346201Wa, InterfaceC1364105Vn<? super C2325431> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$this_asLiveData = interfaceC346201Wa;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            C2325431 c2325431 = new C2325431(this.$this_asLiveData, interfaceC1364105Vn);
            c2325431.L$0 = obj;
            return c2325431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<T> liveDataScope, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(liveDataScope, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
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
                final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                InterfaceC346201Wa<T> interfaceC346201Wa = this.$this_asLiveData;
                InterfaceC346701Wf<? super T> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        Object objEmit = liveDataScope.emit(t, interfaceC1364105Vn);
                        if (objEmit == C099R.LJFF()) {
                            return objEmit;
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

    public static final <T> InterfaceC346201Wa<T> asFlow(LiveData<T> liveData) {
        return C09IC.LJIIJJI(C09IC.LJ(new AnonymousClass1(liveData, null)));
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC346201Wa<? extends T> interfaceC346201Wa) {
        return asLiveData(interfaceC346201Wa, C23271099x.INSTANCE, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC346201Wa<? extends T> interfaceC346201Wa, CoroutineContext coroutineContext) {
        return asLiveData(interfaceC346201Wa, coroutineContext, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(InterfaceC346201Wa<? extends T> interfaceC346201Wa, CoroutineContext coroutineContext, long j) {
        RoomTrackingLiveData roomTrackingLiveData = (LiveData<T>) CoroutineLiveDataKt.liveData(coroutineContext, j, new C2325431(interfaceC346201Wa, null));
        if (interfaceC346201Wa instanceof C05YD) {
            if (C08D9.LIZLLL().LIZIZ()) {
                roomTrackingLiveData.setValue(((C05YD) interfaceC346201Wa).getValue());
            } else {
                roomTrackingLiveData.postValue(((C05YD) interfaceC346201Wa).getValue());
                return roomTrackingLiveData;
            }
        }
        return roomTrackingLiveData;
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC346201Wa<? extends T> interfaceC346201Wa, Duration duration, CoroutineContext coroutineContext) {
        return asLiveData(interfaceC346201Wa, coroutineContext, Api26Impl.INSTANCE.toMillis(duration));
    }
}

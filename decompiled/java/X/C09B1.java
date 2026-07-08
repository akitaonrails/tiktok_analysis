package X;

import com.bytedance.als.CoroutineLiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09B1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.als.CoroutineLiveData$cancelRun$1", f = "CoroutineLiveData.kt", l = {57}, m = "invokeSuspend")
public final class C09B1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CoroutineLiveData<T> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09B1(CoroutineLiveData<T> coroutineLiveData, InterfaceC1364105Vn<? super C09B1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = coroutineLiveData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09B1(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CoroutineLiveData@6c58.cancelRun$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.timeoutInMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("CoroutineLiveData@6c58.cancelRun$1");
                return objLJFF;
            }
        }
        if (!this.LLILLJJLI.hasActiveObservers()) {
            C09AE c09ae = this.LLILLJJLI.runningJob;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLILLJJLI.runningJob = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoroutineLiveData@6c58.cancelRun$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

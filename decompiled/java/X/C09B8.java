package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09B8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.network.core.retry.CoroutineToRxAdapter$requestWithRetryAsObservable$1$job$1", f = "CoroutineToRxAdapter.kt", l = {29}, m = "invokeSuspend")
public final class C09B8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09BB LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super T>, Object> LLILZIL;
    public final /* synthetic */ AtomicBoolean LLILZLL;
    public final /* synthetic */ C09AJ<T> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09B8(C09BB c09bb, String str, Map<String, String> map, Function1<? super InterfaceC1364105Vn<? super T>, ? extends Object> function1, AtomicBoolean atomicBoolean, C09AJ<T> c09aj, InterfaceC1364105Vn<? super C09B8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09bb;
        this.LLILLL = str;
        this.LLILZ = map;
        this.LLILZIL = function1;
        this.LLILZLL = atomicBoolean;
        this.LLIZ = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09B8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        C1C7U.LIZ("CoroutineToRxAdapter@82b6.requestWithRetryAsObservable$1$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0NR7 c0nr7 = this.LLILLJJLI.LIZ;
            String str = this.LLILLL;
            Map<String, String> map = this.LLILZ;
            Function1 function1 = this.LLILZIL;
            this.LL = 1;
            objLIZIZ = c0nr7.LIZIZ(str, map, this, function1);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("CoroutineToRxAdapter@82b6.requestWithRetryAsObservable$1$job$1");
                return objLJFF;
            }
        }
        AtomicBoolean atomicBoolean = this.LLILZLL;
        C09AJ<T> c09aj = this.LLIZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZIZ);
        if (thM5exceptionOrNullimpl == null) {
            if (!atomicBoolean.get() && !c09aj.isDisposed()) {
                c09aj.onNext((T) objLIZIZ);
                c09aj.onComplete();
                atomicBoolean.set(true);
            }
        } else if (!atomicBoolean.get() && !c09aj.isDisposed()) {
            c09aj.onError(thM5exceptionOrNullimpl);
            atomicBoolean.set(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoroutineToRxAdapter@82b6.requestWithRetryAsObservable$1$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

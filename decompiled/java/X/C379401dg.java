package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.performance.metrics.autoadaptive.TaskExecutor$joinExecute$job$5", f = "TaskExecutor.kt", l = {102}, m = "invokeSuspend")
public final class C379401dg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C380401dq LLILLJJLI;
    public final /* synthetic */ Function2<CoroutineContext, Long, C189200o6<Object>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C379401dg(C380401dq c380401dq, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c380401dq;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C379401dg(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskExecutor@d14b.joinExecute$job$5");
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
            CoroutineContext coroutineContextPlus = C0PEM.LIZ.plus(this.LLILLJJLI.LIZIZ);
            C379501dh c379501dh = new C379501dh(null, coroutineContextPlus, this.LLILLL);
            this.LL = 1;
            if (C23250099c.LJI(this, coroutineContextPlus, c379501dh) == objLJFF) {
                C1C7U.LIZIZ("TaskExecutor@d14b.joinExecute$job$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskExecutor@d14b.joinExecute$job$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

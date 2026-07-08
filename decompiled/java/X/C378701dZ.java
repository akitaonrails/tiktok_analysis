package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.performance.metrics.autoadaptive.TaskExecutor$joinExecute$job$1$1", f = "TaskExecutor.kt", l = {}, m = "invokeSuspend")
public final class C378701dZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<CoroutineContext, Long, C189200o6<Object>> LL;
    public final /* synthetic */ CoroutineContext LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C378701dZ(InterfaceC1364105Vn interfaceC1364105Vn, CoroutineContext coroutineContext, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = coroutineContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C378701dZ(interfaceC1364105Vn, this.LLILLJJLI, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskExecutor@d14b.joinExecute$job$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI, C2286608xc.LJFF(Mp4ScreenVideoLoadTimeout.CONTROL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskExecutor@d14b.joinExecute$job$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

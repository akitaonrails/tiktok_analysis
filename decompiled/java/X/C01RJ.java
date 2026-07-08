package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.01RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.hybrid.impl.AbsAdHybridSparkLoader$optimizeTaskExecute$2$result$1", f = "AbsAdHybridSparkLoader.kt", l = {}, m = "invokeSuspend")
public final class C01RJ<T> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super T>, Object> {
    public final /* synthetic */ Function0<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01RJ(Function0<? extends T> function0, InterfaceC1364105Vn<? super C01RJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        T tInvoke;
        C1C7U.LIZ("AbsAdHybridSparkLoader@ddb.optimizeTaskExecute$2$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            tInvoke = this.LL.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "CommerceFluencyOptimization_isOptimizeRenderCreateViewAtSubThread");
            tInvoke = null;
        }
        C1C7U.LIZIZ("AbsAdHybridSparkLoader@ddb.optimizeTaskExecute$2$result$1");
        return tInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
        return ((a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }
}

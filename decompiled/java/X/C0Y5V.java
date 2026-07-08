package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y5V, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.metric.InitMetricsHelper$reportFailure$1", f = "InitMetricsHelper.kt", l = {}, m = "invokeSuspend")
public final class C0Y5V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0YCR LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y5V(C0YCR c0ycr, InterfaceC1364105Vn<? super C0Y5V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ycr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y5V(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InitMetricsHelper@8acf.reportFailure$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InitMetricsHelper@8acf.reportFailure$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

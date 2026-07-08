package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0d9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.metric.CommerceLandPageLpvMetrics$triggerStateChange$1", f = "CommerceLandPageLpvMetrics.kt", l = {}, m = "invokeSuspend")
public final class C1039480d9m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1040940dC8 LL;
    public final /* synthetic */ EnumC1039490d9n LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039480d9m(C1040940dC8 c1040940dC8, EnumC1039490d9n enumC1039490d9n, InterfaceC1364105Vn<? super C1039480d9m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1040940dC8;
        this.LLILLJJLI = enumC1039490d9n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1039480d9m(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceLandPageLpvMetrics@c675.triggerStateChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LL.LIZIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceLandPageLpvMetrics@c675.triggerStateChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

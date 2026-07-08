package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS596S0100000_17;
import njp.a;

/* JADX INFO: renamed from: X.0g2D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.TaxUtils$refreshDefaultLocation$1", f = "TaxUtils.kt", l = {}, m = "invokeSuspend")
public final class C1150110g2D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C1270404y6, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1150110g2D(Function1<? super C1270404y6, Unit> function1, InterfaceC1364105Vn<? super C1150110g2D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1150110g2D(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaxUtils@26c4.refreshDefaultLocation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1150090g2B.LIZ.getClass();
        if (!C1150090g2B.LJII()) {
            C1150090g2B.LIZJ = C1150090g2B.LIZLLL();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TaxUtils@26c4.refreshDefaultLocation$1");
            return unit;
        }
        C1150090g2B.LJFF(new AwS596S0100000_17(this.LL, (Function1<? super C1270404y6, Unit>) 336));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TaxUtils@26c4.refreshDefaultLocation$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.pipo.ttpay.recharge.RechargeViewmodel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0utv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.ttpay.recharge.RechargeViewmodel$consultRecharge$2$2$1", f = "RechargeViewmodel.kt", l = {}, m = "invokeSuspend")
public final class C1721570utv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RechargeViewmodel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1721570utv(RechargeViewmodel rechargeViewmodel, InterfaceC1364105Vn<? super C1721570utv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = rechargeViewmodel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1721570utv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeViewmodel@cc63.consultRecharge$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.DQ2(EnumC488160JCk.ERROR, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeViewmodel@cc63.consultRecharge$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05l7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.supplier.FcpPolicySupplierImpl$handleReset$1$1$1", f = "FcpPolicySupplierImpl.kt", l = {}, m = "invokeSuspend")
public final class C1444705l7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1444205l2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444705l7(InterfaceC1444205l2 interfaceC1444205l2, InterfaceC1364105Vn<? super C1444705l7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1444205l2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1444705l7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FcpPolicySupplierImpl@c44d.handleReset$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpPolicySupplierImpl@c44d.handleReset$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

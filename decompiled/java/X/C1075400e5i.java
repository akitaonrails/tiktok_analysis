package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.HybridKit$Companion$createLiteKitView$1$3", f = "HybridKit.kt", l = {}, m = "invokeSuspend")
public final class C1075400e5i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1537480q70 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075400e5i(C1537480q70 c1537480q70, InterfaceC1364105Vn<? super C1075400e5i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1537480q70;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1075400e5i(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1538820q9A interfaceC1538820q9ALIZIZ;
        C1C7U.LIZ("HybridKit$Companion@c399.createLiteKitView$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1537480q70 c1537480q70 = this.LL;
        C01GW<C1075480e5q> c01gw = C1075480e5q.LIZIZ;
        InterfaceC1075390e5h interfaceC1075390e5h = (InterfaceC1075390e5h) C1075530e5v.LIZIZ().LIZIZ(InterfaceC1075390e5h.class, this.LL.bidFrom);
        if (interfaceC1075390e5h != null) {
            interfaceC1538820q9ALIZIZ = interfaceC1075390e5h.LIZIZ();
        } else {
            interfaceC1538820q9ALIZIZ = null;
        }
        c1537480q70.LJJ(InterfaceC1538820q9A.class, interfaceC1538820q9ALIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridKit$Companion@c399.createLiteKitView$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

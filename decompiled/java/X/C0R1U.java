package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0R1U, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.HybridKit$Companion$createLiteKitView$1$2", f = "HybridKit.kt", l = {}, m = "invokeSuspend")
public final class C0R1U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1537480q70 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R1U(C1537480q70 c1537480q70, InterfaceC1364105Vn<? super C0R1U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1537480q70;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0R1U(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HybridKit$Companion@c399.createLiteKitView$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJ(C1309760kBi.class, new C1309760kBi());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridKit$Companion@c399.createLiteKitView$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

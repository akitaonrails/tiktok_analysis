package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.amg.minigameruntime.common.platform_misc.StorageKevaService$onExitAsync$1", f = "StorageKevaService.kt", l = {}, m = "invokeSuspend")
public final class C454201pk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05XL<Boolean> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454201pk(C05XL<Boolean> c05xl, InterfaceC1364105Vn<? super C454201pk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C454201pk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StorageKevaService@753b.onExitAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIZILJ(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StorageKevaService@753b.onExitAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

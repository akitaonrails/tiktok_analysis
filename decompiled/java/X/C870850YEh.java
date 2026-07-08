package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.metric.ImSDKMonitorHelper$switchToBackground$1", f = "ImSDKMonitorHelper.kt", l = {}, m = "invokeSuspend")
public final class C870850YEh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C870880YEk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C870850YEh(C870880YEk c870880YEk, InterfaceC1364105Vn<? super C870850YEh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c870880YEk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C870850YEh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImSDKMonitorHelper@d970.switchToBackground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C868780Y6i.LJIILJJIL(this.LL.LIZ.LIZLLL(), "ImSDKMonitorHelper", "switchToBackground coroutine start", 4);
        if (this.LL.LIZ.LJ().LJ().isAppBackground()) {
            this.LL.LIZLLL.getDomain().LIZJ().LJJIJIIJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImSDKMonitorHelper@d970.switchToBackground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

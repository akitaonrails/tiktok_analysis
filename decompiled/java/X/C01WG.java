package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01WG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.live.render.utils.CoroutineHelper$runWithCoroutine$1", f = "CoroutineHelper.kt", l = {}, m = "invokeSuspend")
public final class C01WG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WG(Runnable runnable, InterfaceC1364105Vn<? super C01WG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CoroutineHelper@8e34.runWithCoroutine$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoroutineHelper@8e34.runWithCoroutine$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

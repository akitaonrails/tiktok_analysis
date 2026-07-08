package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixSparkAbility$preloadScrollSparkViews$2$1$1", f = "MixSparkAbility.kt", l = {}, m = "invokeSuspend")
public final class C349101Xd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C349101Xd(Runnable runnable, InterfaceC1364105Vn<? super C349101Xd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C349101Xd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixSparkAbility@64fa.preloadScrollSparkViews$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixSparkAbility@64fa.preloadScrollSparkViews$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

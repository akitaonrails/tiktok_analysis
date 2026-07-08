package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.preload.ExplorePerfPreloadInit$asyncRun$1", f = "ExplorePerfPreloadInit.kt", l = {}, m = "invokeSuspend")
public final class C05CY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05CY(Runnable runnable, InterfaceC1364105Vn<? super C05CY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExplorePerfPreloadInit@1ace.asyncRun$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExplorePerfPreloadInit@1ace.asyncRun$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

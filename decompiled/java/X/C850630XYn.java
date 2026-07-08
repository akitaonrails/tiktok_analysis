package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.reactive.SessionLessReactiveAccountImpl$handleReactiveClick$1$onError$1", f = "SessionLessReactiveAccountImpl.kt", l = {}, m = "invokeSuspend")
public final class C850630XYn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;
    public final /* synthetic */ C850590XYj LLILLJJLI;
    public final /* synthetic */ C850680XYs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C850630XYn(C850680XYs c850680XYs, C850590XYj c850590XYj, Runnable runnable, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
        this.LLILLJJLI = c850590XYj;
        this.LLILLL = c850680XYs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        Runnable runnable = this.LL;
        return new C850630XYn(this.LLILLL, this.LLILLJJLI, runnable, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SessionLessReactiveAccountImpl@cbb1.handleReactiveClick$1$onError$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Runnable runnable = this.LL;
        if (runnable != null) {
            runnable.run();
        }
        this.LLILLJJLI.LJIIL(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionLessReactiveAccountImpl@cbb1.handleReactiveClick$1$onError$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

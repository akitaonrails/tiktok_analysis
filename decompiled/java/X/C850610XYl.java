package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.reactive.SessionLessReactiveAccountImpl$handleReactiveClick$1$onSuccess$1", f = "SessionLessReactiveAccountImpl.kt", l = {}, m = "invokeSuspend")
public final class C850610XYl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C850680XYs LL;
    public final /* synthetic */ C850590XYj LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C850610XYl(C850680XYs c850680XYs, C850590XYj c850590XYj, Runnable runnable, InterfaceC1364105Vn<? super C850610XYl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c850680XYs;
        this.LLILLJJLI = c850590XYj;
        this.LLILLL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C850610XYl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SessionLessReactiveAccountImpl@cbb1.handleReactiveClick$1$onSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C850680XYs c850680XYs = this.LL;
        if (c850680XYs != null) {
            this.LLILLJJLI.LJIIJJI(c850680XYs);
        }
        Runnable runnable = this.LLILLL;
        if (runnable != null) {
            runnable.run();
        }
        this.LLILLJJLI.LJIIL(this.LL);
        this.LLILLJJLI.LIZ.finish();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SessionLessReactiveAccountImpl@cbb1.handleReactiveClick$1$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

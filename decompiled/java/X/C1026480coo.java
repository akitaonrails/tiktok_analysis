package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0coo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.router.impl.observer.CRouterGlobalBusinessObserver$schemaLinkProcessorStart$1", f = "CRouterGlobalBusinessObserver.kt", l = {}, m = "invokeSuspend")
public final class C1026480coo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1026550cov LL;
    public final /* synthetic */ C1026800cpK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026480coo(C1026550cov c1026550cov, C1026800cpK c1026800cpK, InterfaceC1364105Vn<? super C1026480coo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1026550cov;
        this.LLILLJJLI = c1026800cpK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1026480coo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("CRouterGlobalBusinessObserver@ee5c.schemaLinkProcessorStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.LJ().LJIIJ(this.LLILLJJLI.LIZ.LIZLLL);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C1026550cov c1026550cov = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c1026550cov.LJ().LJJ(thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CRouterGlobalBusinessObserver@ee5c.schemaLinkProcessorStart$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

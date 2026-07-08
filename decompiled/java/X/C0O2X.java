package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aweme.optimize.AwemeCacheService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aweme.optimize.AwemeCacheService$cacheAwemesInLocal$1", f = "AwemeCacheService.kt", l = {}, m = "invokeSuspend")
public final class C0O2X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeCacheService LL;
    public final /* synthetic */ List<C0VL3> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O2X(AwemeCacheService awemeCacheService, List<C0VL3> list, String str, InterfaceC1364105Vn<? super C0O2X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeCacheService;
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0O2X(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("AwemeCacheService@66f6.cacheAwemesInLocal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeCacheService awemeCacheService = this.LL;
        List<C0VL3> list = this.LLILLJJLI;
        String str = this.LLILLL;
        try {
            InterfaceC612860O2a interfaceC612860O2aLJIIIIZZ = awemeCacheService.LJIIIIZZ();
            if (interfaceC612860O2aLJIIIIZZ != null) {
                interfaceC612860O2aLJIIIIZZ.LIZ(list);
            }
            awemeCacheService.LJFF(str);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("AwemeCacheNetworkInterceptor", "cacheAwemesInLocal error:" + thM5exceptionOrNullimpl.getMessage());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeCacheService@66f6.cacheAwemesInLocal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

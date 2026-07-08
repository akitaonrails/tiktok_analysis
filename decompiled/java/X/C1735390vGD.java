package X;

import com.bytedance.router.RouteIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$onInterceptRoute$3$enter$1", f = "StoreInterceptor.kt", l = {178, 179}, m = "invokeSuspend")
public final class C1735390vGD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RouteIntent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735390vGD(RouteIntent routeIntent, InterfaceC1364105Vn<? super C1735390vGD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = routeIntent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735390vGD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreInterceptor@c22c.onInterceptRoute$3$enter$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoreInterceptor@c22c.onInterceptRoute$3$enter$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (C2151808bs.LIZIZ(this) == objLJFF) {
                C1C7U.LIZIZ("StoreInterceptor@c22c.onInterceptRoute$3$enter$1");
                return objLJFF;
            }
        }
        C1735100vFk c1735100vFk = C1735100vFk.LIZ;
        String url = this.LLILLJJLI.getUrl();
        this.LL = 2;
        if (c1735100vFk.LIZ("showcase", url, null, null, null, this) == objLJFF) {
            C1C7U.LIZIZ("StoreInterceptor@c22c.onInterceptRoute$3$enter$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoreInterceptor@c22c.onInterceptRoute$3$enter$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

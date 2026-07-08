package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$onInterceptRoute$3$1$1", f = "StoreInterceptor.kt", l = {198}, m = "invokeSuspend")
public final class C324140CnE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Application LLILLJJLI;
    public final /* synthetic */ WeakReference<Context> LLILLL;
    public final /* synthetic */ RouteIntent LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324140CnE(Application application, WeakReference<Context> weakReference, RouteIntent routeIntent, InterfaceC1364105Vn<? super C324140CnE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = application;
        this.LLILLL = weakReference;
        this.LLILZ = routeIntent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324140CnE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreInterceptor@c22c.onInterceptRoute$3$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            StoreInterceptor storeInterceptor = StoreInterceptor.LL;
            Application application = this.LLILLJJLI;
            WeakReference<Context> weakReference = this.LLILLL;
            RouteIntent routeIntent = this.LLILZ;
            this.LL = 1;
            storeInterceptor.getClass();
            if (StoreInterceptor.LIZIZ(application, weakReference, routeIntent, this) == objLJFF) {
                C1C7U.LIZIZ("StoreInterceptor@c22c.onInterceptRoute$3$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreInterceptor@c22c.onInterceptRoute$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

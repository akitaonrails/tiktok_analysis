package X;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.bytedance.router.SmartRouter;
import com.google.gson.n;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.TEARouterInterceptor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.TEARouterInterceptorConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.TEARouterInterceptor$onInterceptRouteRedirect$3", f = "TEARouterInterceptor.kt", l = {169}, m = "invokeSuspend")
public final class C438610HHv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1390130mHL LLILLJJLI;
    public final /* synthetic */ TEARouterInterceptor LLILLL;
    public final /* synthetic */ C259800zU<ViewGroup> LLILZ;
    public final /* synthetic */ List<TEARouterInterceptorConfig.Interceptor> LLILZIL;
    public final /* synthetic */ Uri LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438610HHv(C1390130mHL c1390130mHL, TEARouterInterceptor tEARouterInterceptor, C259800zU<ViewGroup> c259800zU, List<TEARouterInterceptorConfig.Interceptor> list, Uri uri, Context context, InterfaceC1364105Vn<? super C438610HHv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1390130mHL;
        this.LLILLL = tEARouterInterceptor;
        this.LLILZ = c259800zU;
        this.LLILZIL = list;
        this.LLILZLL = uri;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438610HHv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TEARouterInterceptor@3442.onInterceptRouteRedirect$3");
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
            this.LLILLJJLI.setMessage(R.string.txr);
            C786410Ut5.LLZ(this.LLILLJJLI, 0);
            TEARouterInterceptor tEARouterInterceptor = this.LLILLL;
            this.LL = 1;
            tEARouterInterceptor.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C0NSQ(null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TEARouterInterceptor@3442.onInterceptRouteRedirect$3");
                return objLJFF;
            }
        }
        n nVar = (n) obj;
        ViewGroup viewGroup = this.LLILZ.element;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(this.LLILLJJLI, viewGroup);
        }
        TEARouterInterceptor tEARouterInterceptor2 = this.LLILLL;
        List<TEARouterInterceptorConfig.Interceptor> list = this.LLILZIL;
        Uri uri = this.LLILZLL;
        tEARouterInterceptor2.getClass();
        SmartRouter.buildRoute(this.LLIZ, TEARouterInterceptor.LJ(list, uri, nVar)).open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TEARouterInterceptor@3442.onInterceptRouteRedirect$3");
        return unit;
    }
}

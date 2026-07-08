package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.search.performance.core.config.LandingPagePreloadConfig;
import com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PB6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper$SearchLandingPagePreloadInterceptor$onInterceptRoute$1", f = "SearchLandingPagePreloadHelper.kt", l = {102}, m = "invokeSuspend")
public final class C0PB6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RouteIntent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PB6(RouteIntent routeIntent, InterfaceC1364105Vn<? super C0PB6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = routeIntent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PB6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLandingPagePreloadHelper$SearchLandingPagePreloadInterceptor@e747.onInterceptRoute$1");
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
            LifecycleOwner lifecycleOwnerLIZLLL = C651290Pgd.LIZLLL();
            if (((LandingPagePreloadConfig) C0PB5.LIZIZ.getValue()).enableOnlySearchJump && lifecycleOwnerLIZLLL == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchLandingPagePreloadHelper$SearchLandingPagePreloadInterceptor@e747.onInterceptRoute$1");
                return unit;
            }
            SearchLandingPagePreloadHelper searchLandingPagePreloadHelper = SearchLandingPagePreloadHelper.LIZ;
            RouteIntent routeIntent = this.LLILLJJLI;
            searchLandingPagePreloadHelper.getClass();
            String strLIZ = SearchLandingPagePreloadHelper.LIZ(routeIntent);
            if (strLIZ.length() > 0) {
                this.LL = 1;
                if (searchLandingPagePreloadHelper.LIZIZ(0L, strLIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchLandingPagePreloadHelper$SearchLandingPagePreloadInterceptor@e747.onInterceptRoute$1");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchLandingPagePreloadHelper$SearchLandingPagePreloadInterceptor@e747.onInterceptRoute$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

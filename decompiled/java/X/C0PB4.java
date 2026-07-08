package X;

import com.ss.android.ugc.aweme.search.performance.core.config.LandingPagePreloadConfig;
import com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0PB4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper$onShowFirstScreen$1", f = "SearchLandingPagePreloadHelper.kt", l = {44}, m = "invokeSuspend")
public final class C0PB4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0PB4(InterfaceC1364105Vn<? super C0PB4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PB4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLandingPagePreloadHelper@c853.onShowFirstScreen$1");
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
            C01GW c01gw = C0PB5.LIZIZ;
            if (!((LandingPagePreloadConfig) c01gw.getValue()).enableTriggerAfterFirstScreen) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchLandingPagePreloadHelper@c853.onShowFirstScreen$1");
                return unit;
            }
            SearchLandingPagePreloadHelper searchLandingPagePreloadHelper = SearchLandingPagePreloadHelper.LIZ;
            long j = ((LandingPagePreloadConfig) c01gw.getValue()).timeTriggerAfterFirstScreen;
            this.LL = 1;
            if (searchLandingPagePreloadHelper.LIZIZ(j, "aweme/detail", this) == objLJFF) {
                C1C7U.LIZIZ("SearchLandingPagePreloadHelper@c853.onShowFirstScreen$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchLandingPagePreloadHelper@c853.onShowFirstScreen$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0PB4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

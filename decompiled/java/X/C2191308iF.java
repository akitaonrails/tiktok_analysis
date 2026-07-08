package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08iF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.standard.SearchStandardMonitorHelper$monitorRankAndAvoid$1", f = "SearchStandardMonitorHelper.kt", l = {}, m = "invokeSuspend")
public final class C2191308iF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchMixFeedList LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191308iF(SearchMixFeedList searchMixFeedList, int i, String str, InterfaceC1364105Vn<? super C2191308iF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchMixFeedList;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2191308iF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchStandardMonitorHelper@ed9.monitorRankAndAvoid$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C641720PFa c641720PFa = C641720PFa.LIZ;
            SearchMixFeedList searchMixFeedList = this.LL;
            int i = this.LLILLJJLI;
            String str = this.LLILLL;
            c641720PFa.getClass();
            C641720PFa.LIZIZ(searchMixFeedList, i, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(new Throwable(e), "SearchStandardMonitorHelper");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchStandardMonitorHelper@ed9.monitorRankAndAvoid$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

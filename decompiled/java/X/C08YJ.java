package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.metrics.SearchResultDataMonitor$report$1", f = "SearchResultDataMonitor.kt", l = {}, m = "invokeSuspend")
public final class C08YJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0P66 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<SearchMixFeed> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C08YJ(C0P66 c0p66, String str, List<? extends SearchMixFeed> list, InterfaceC1364105Vn<? super C08YJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0p66;
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08YJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchResultDataMonitor@230e.report$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C0P66 c0p66 = this.LL;
            String str = this.LLILLJJLI;
            List<SearchMixFeed> list = this.LLILLL;
            c0p66.getClass();
            C0P66.LIZ(str, list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C844470XAv c844470XAv = C844470XAv.LIZ;
            EnumC2143908ab enumC2143908ab = EnumC2143908ab.SEARCH_DEBUG_INFO;
            c844470XAv.getClass();
            enumC2143908ab.name();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchResultDataMonitor@230e.report$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

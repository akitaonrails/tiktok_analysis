package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.standard.SearchStandardMonitorHelper$monitorCardHeight$onLayoutChangeListener$1$onLayoutChange$1", f = "SearchStandardMonitorHelper.kt", l = {}, m = "invokeSuspend")
public final class C2215708mB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SearchMixFeed LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215708mB(String str, SearchMixFeed searchMixFeed, int i, int i2, InterfaceC1364105Vn<? super C2215708mB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = searchMixFeed;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2215708mB(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchStandardMonitorHelper@ed9.monitorCardHeight$onLayoutChangeListener$1$onLayoutChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("search_id", this.LL);
        C641720PFa c641720PFa = C641720PFa.LIZ;
        SearchMixFeed searchMixFeed = this.LLILLJJLI;
        c641720PFa.getClass();
        c2344009Gk.LJIIIIZZ("card", C641720PFa.LIZ(searchMixFeed));
        c2344009Gk.LIZJ(this.LLILLL, "card_height");
        c2344009Gk.LIZJ(this.LLILZ, "screen_height");
        C20684815ws.LJIILLIIL("search_result_height_error", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchStandardMonitorHelper@ed9.monitorCardHeight$onLayoutChangeListener$1$onLayoutChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

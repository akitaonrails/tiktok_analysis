package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PAs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment$onViewDrawEnd$3$1", f = "SearchJediMixFeedFragment.kt", l = {}, m = "invokeSuspend")
public final class C640600PAs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchJediMixFeedFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C640600PAs(SearchJediMixFeedFragment searchJediMixFeedFragment, InterfaceC1364105Vn<? super C640600PAs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchJediMixFeedFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640600PAs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<SearchMixFeed> items;
        C1C7U.LIZ("SearchJediMixFeedFragment@aa43.onViewDrawEnd$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchJediMixFeedFragment searchJediMixFeedFragment = this.LL;
        String str = SearchJediMixFeedFragment._pnsPageId;
        C0PN8 c0pn8HU = searchJediMixFeedFragment.HU(false);
        if (c0pn8HU != null) {
            items = c0pn8HU.getItems();
        } else {
            items = null;
        }
        searchJediMixFeedFragment.oV(items);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchJediMixFeedFragment@aa43.onViewDrawEnd$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

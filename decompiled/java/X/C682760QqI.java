package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.model.SearchMinisItemDataModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core.SearchMinisAllResultsActivity$loadMoreItems$1$4$1", f = "SearchMinisAllResultsActivity.kt", l = {}, m = "invokeSuspend")
public final class C682760QqI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchMinisAllResultsActivity LL;
    public final /* synthetic */ List<SearchMinisItemDataModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C682760QqI(SearchMinisAllResultsActivity searchMinisAllResultsActivity, List<SearchMinisItemDataModel> list, InterfaceC1364105Vn<? super C682760QqI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchMinisAllResultsActivity;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C682760QqI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMinisAllResultsActivity@ae04.loadMoreItems$1$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20600815jK<InterfaceC1891350zJl> state = this.LL.LLLLZI().getState();
        Unit unit = null;
        if (state != null) {
            state.LIZLLL(this.LLILLJJLI, null);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("SearchMinisAllResultsActivity@ae04.loadMoreItems$1$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

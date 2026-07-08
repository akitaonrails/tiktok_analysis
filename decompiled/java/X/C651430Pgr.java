package X;

import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.model.SearchHorizontalData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.core.viewmodel.SearchLynxAwemeListRepoViewModel;
import defpackage.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Pgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.communicate.utils.SearchCommonHorizontalLoadMoreUtil$executeLoadMoreRequest$1$1$1", f = "SearchCommonHorizontalLoadMoreUtil.kt", l = {}, m = "invokeSuspend")
public final class C651430Pgr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ j.d LL;
    public final /* synthetic */ SearchHorizontalData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C651430Pgr(j.d dVar, SearchHorizontalData searchHorizontalData, InterfaceC1364105Vn<? super C651430Pgr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dVar;
        this.LLILLJJLI = searchHorizontalData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C651430Pgr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCommonHorizontalLoadMoreUtil@9b2e.executeLoadMoreRequest$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchLynxAwemeListRepoViewModel searchLynxAwemeListRepoViewModelLIZ = C0PK2.LIZ();
        Unit unit = null;
        String searchResultId = null;
        if (searchLynxAwemeListRepoViewModelLIZ != null) {
            j.d dVar = this.LL;
            if (dVar != null) {
                searchResultId = dVar.getSearchResultId();
            }
            j.d dVar2 = this.LL;
            if (dVar2 != null) {
                dVar2.getTokenType();
            }
            searchLynxAwemeListRepoViewModelLIZ.xQ2(searchResultId, this.LLILLJJLI);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("SearchCommonHorizontalLoadMoreUtil@9b2e.executeLoadMoreRequest$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

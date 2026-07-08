package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model.SearchReviewAggregationLoadMoreResponse;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS8S1301000_10;
import njp.a;

/* JADX INFO: renamed from: X.0Q9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchReviewAggregationDetailVideoVM$searchLoadMore$3", f = "SearchReviewAggregationDetailVideoVM.kt", l = {191}, m = "invokeSuspend")
public final class C665770Q9n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>>, Object> {
    public int LL;
    public final /* synthetic */ SearchReviewAggregationDetailVideoVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<Map<?, ?>> LLILZ;
    public final /* synthetic */ C665810Q9r LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ List<Aweme> LLIZLLLIL;
    public final /* synthetic */ Function2<List<? extends Map<?, ?>>, Integer, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C665770Q9n(SearchReviewAggregationDetailVideoVM searchReviewAggregationDetailVideoVM, String str, List<? extends Map<?, ?>> list, C665810Q9r c665810Q9r, int i, int i2, List<? extends Aweme> list2, Function2<? super List<? extends Map<?, ?>>, ? super Integer, Unit> function2, InterfaceC1364105Vn<? super C665770Q9n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchReviewAggregationDetailVideoVM;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = c665810Q9r;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = list2;
        this.LLJ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C665770Q9n(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        int iIntValue;
        int iIntValue2;
        Integer num;
        Object objLIZJ = obj;
        C1C7U.LIZ("SearchReviewAggregationDetailVideoVM@e114.searchLoadMore$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            Integer num2 = ((C665760Q9m) this.LLILLJJLI.getState()).LLILZ.get(this.LLILLL);
            if (num2 != null) {
                size = num2.intValue();
            } else {
                size = this.LLILZ.size();
            }
            C0QAO c0qao = C0QAO.LIZ;
            C665810Q9r c665810Q9r = this.LLILZIL;
            Integer numLJ = C2286608xc.LJ(size);
            Integer numLJ2 = C2286608xc.LJ((this.LLILZLL + this.LLIZ) - this.LLIZLLLIL.size());
            String str = c665810Q9r.LIZ;
            Integer num3 = c665810Q9r.LIZIZ;
            String str2 = c665810Q9r.LJ;
            Map<String, Object> linkedHashMap = c665810Q9r.LJFF;
            c0qao.getClass();
            InterfaceC665790Q9p interfaceC665790Q9p = C0QAO.LIZIZ;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            C11NZ<SearchReviewAggregationLoadMoreResponse> c11nzLIZIZ = interfaceC665790Q9p.LIZIZ(str, num3, numLJ, numLJ2, str2, linkedHashMap);
            this.LL = 1;
            objLIZJ = C11UD.LIZJ(c11nzLIZIZ, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("SearchReviewAggregationDetailVideoVM@e114.searchLoadMore$3");
                return objLJFF;
            }
        }
        SearchReviewAggregationLoadMoreResponse searchReviewAggregationLoadMoreResponse = (SearchReviewAggregationLoadMoreResponse) objLIZJ;
        if (searchReviewAggregationLoadMoreResponse != null && (num = searchReviewAggregationLoadMoreResponse.cursor) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num4 = searchReviewAggregationLoadMoreResponse.hasMore;
        if (num4 != null) {
            iIntValue2 = num4.intValue();
        } else {
            iIntValue2 = 1;
        }
        List<Map<?, ?>> items = searchReviewAggregationLoadMoreResponse.getItems();
        if (items == null) {
            items = C13BV.INSTANCE;
        }
        List<Aweme> listFQ2 = this.LLILLJJLI.FQ2(items);
        String str3 = this.LLILLL;
        if (str3 != null && str3.length() > 0 && str3 != null) {
            SearchReviewAggregationDetailVideoVM searchReviewAggregationDetailVideoVM = this.LLILLJJLI;
            Integer numLJ3 = C2286608xc.LJ(iIntValue);
            searchReviewAggregationDetailVideoVM.getClass();
            List listBQ2 = SearchReviewAggregationDetailVideoVM.BQ2(searchReviewAggregationDetailVideoVM.FQ2(items));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listBQ2, 10));
            Iterator it2 = ((ArrayList) listBQ2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C209900rR) it2.next()).LL.getAid());
            }
            if (str3.length() > 0) {
                searchReviewAggregationDetailVideoVM.setState(new AwS8S1301000_10(str3, (String) items, (List<? extends Map<?, ?>>) listFQ2, (List<? extends Aweme>) numLJ3, (Integer) iIntValue2, 1));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.LLILZ);
        arrayList2.addAll(items);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.LLIZLLLIL);
        arrayList3.addAll(listFQ2);
        SearchReviewAggregationDetailVideoVM searchReviewAggregationDetailVideoVM2 = this.LLILLJJLI;
        int i2 = this.LLILZLL;
        int i3 = this.LLIZ;
        Function2<List<? extends Map<?, ?>>, Integer, Unit> function2 = this.LLJ;
        searchReviewAggregationDetailVideoVM2.getClass();
        AbstractC316870CbV abstractC316870CbVEQ2 = SearchReviewAggregationDetailVideoVM.EQ2(i2, i3, arrayList2, arrayList3, iIntValue2, function2);
        C1C7U.LIZIZ("SearchReviewAggregationDetailVideoVM@e114.searchLoadMore$3");
        return abstractC316870CbVEQ2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

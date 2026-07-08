package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.photosearch.viewmodel.SearchPhotoDynamicViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.photosearch.viewmodel.SearchPhotoDynamicViewModel$refreshSearchDataList$1", f = "SearchPhotoDynamicViewModel.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
public final class C644410PPj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchRequestParam LLILLJJLI;
    public final /* synthetic */ SearchPhotoDynamicViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C644410PPj(SearchRequestParam searchRequestParam, SearchPhotoDynamicViewModel searchPhotoDynamicViewModel, InterfaceC1364105Vn<? super C644410PPj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchRequestParam;
        this.LLILLL = searchPhotoDynamicViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C644410PPj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int sortType;
        int filterBy;
        LinkedHashMap<String, Integer> linkedHashMap;
        C1C7U.LIZ("SearchPhotoDynamicViewModel@8831.refreshSearchDataList$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            SearchRequestParam searchRequestParam = this.LLILLJJLI;
            InterfaceC614410O7z interfaceC614410O7z = (InterfaceC614410O7z) ((InterfaceC736910SvR) C0O81.LIZ.getValue()).getOperator();
            String str = searchRequestParam.keyword;
            long j = searchRequestParam.cursor;
            int i3 = searchRequestParam.count;
            String str2 = searchRequestParam.source;
            String str3 = searchRequestParam.searchSource;
            int i4 = searchRequestParam.hotSearch;
            String str4 = searchRequestParam.searchId;
            String str5 = searchRequestParam.lastSearchId;
            int i5 = searchRequestParam.correctType;
            C0PSG c0psg = searchRequestParam.LIZ;
            if (c0psg != null && !c0psg.isDefaultOption()) {
                i = 1;
            } else {
                i = 0;
            }
            C0PSG c0psg2 = searchRequestParam.LIZ;
            if (c0psg2 != null) {
                sortType = c0psg2.getSortType();
            } else {
                sortType = 0;
            }
            C0PSG c0psg3 = searchRequestParam.LIZ;
            if (c0psg3 != null) {
                filterBy = c0psg3.getFilterBy();
            } else {
                filterBy = 0;
            }
            String str6 = searchRequestParam.enterFrom;
            String str7 = searchRequestParam.searchChannel;
            String str8 = searchRequestParam.showResultsSource;
            String str9 = searchRequestParam.searchContext;
            C0PSG c0psg4 = searchRequestParam.LIZ;
            if (c0psg4 == null || (linkedHashMap = c0psg4.activityToFieldMap()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            C861640Xr8 c861640Xr8 = new C861640Xr8(new C644500PPs(this.LLILLL, null), C09IC.LJIL(interfaceC614410O7z.LLJZIJLIL(str, j, i3, str2, str3, i4, str4, str5, i5, i, sortType, filterBy, str6, str7, str8, str9, linkedHashMap, searchRequestParam.personalContextInfo, searchRequestParam.isNonPersonalizedSearch, searchRequestParam.sugGenerateType, searchRequestParam.searchSessionId, searchRequestParam.LIZJ, searchRequestParam.endToEndSearchSessionId, searchRequestParam.screenReaderEnable), C0PEM.LIZJ));
            this.LL = 1;
            if (C09IC.LJI(c861640Xr8, this) == objLJFF) {
                C1C7U.LIZIZ("SearchPhotoDynamicViewModel@8831.refreshSearchDataList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchPhotoDynamicViewModel@8831.refreshSearchDataList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

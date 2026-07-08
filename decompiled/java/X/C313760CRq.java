package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.preload.SugInputTracker$processSugSuccess$1", f = "SugInputTracker.kt", l = {}, m = "invokeSuspend")
public final class C313760CRq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SearchSugResponse LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313760CRq(SearchSugResponse searchSugResponse, InterfaceC1364105Vn<? super C313760CRq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = searchSugResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313760CRq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<SearchSugEntity> list;
        List<SearchSugEntity> list2;
        SearchSugEntity searchSugEntity;
        String str;
        SearchSugEntity searchSugEntity2;
        C1C7U.LIZ("SugInputTracker@89a0.processSugSuccess$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchSugResponse searchSugResponse = this.LL;
        if (searchSugResponse != null && (list = searchSugResponse.sugList) != null && list.size() >= 1) {
            SearchSugResponse searchSugResponse2 = this.LL;
            if (searchSugResponse2 != null && (list2 = searchSugResponse2.sugList) != null && (searchSugEntity = (SearchSugEntity) ListProtector.get(list2, 0)) != null) {
                SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
                double d = 0.0d;
                if (sugExtraInfo != null) {
                    double predictCtrScore = sugExtraInfo.getPredictCtrScore();
                    if (predictCtrScore >= 0.0d && predictCtrScore <= 1.0d) {
                        d = predictCtrScore;
                    }
                }
                SearchSugResponse searchSugResponse3 = this.LL;
                if (d > ((Number) C274250Aox.LIZ.getValue()).floatValue()) {
                    ArrayList arrayList = (ArrayList) C0QNZ.LJII;
                    if (!arrayList.contains(String.valueOf(C0QNZ.LJFF))) {
                        List<SearchSugEntity> list3 = searchSugResponse3.sugList;
                        if (list3 != null && (searchSugEntity2 = (SearchSugEntity) ListProtector.get(list3, 0)) != null) {
                            str = searchSugEntity2.content;
                        } else {
                            str = null;
                        }
                        C0QNZ.LJFF = String.valueOf(str);
                        if (C0QNZ.LJ) {
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("SugInputTracker@89a0.processSugSuccess$1");
                            return unit;
                        }
                        C0QNZ.LIZ(String.valueOf(C0QNZ.LJFF));
                        arrayList.add(String.valueOf(C0QNZ.LJFF));
                    }
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SugInputTracker@89a0.processSugSuccess$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SugInputTracker@89a0.processSugSuccess$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

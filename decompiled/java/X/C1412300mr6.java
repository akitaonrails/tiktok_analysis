package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editeffect.search.middleware.trending.EditEffectSearchTrendingItem;
import com.ss.android.ugc.aweme.editeffect.search.middleware.trending.EditEffectSearchTrendingListResponse;
import com.ss.android.ugc.aweme.editeffect.search.middleware.trending.EditEffectTrendingSearchApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0mr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.search.middleware.trending.EditEffectSearchTrendingComponent$initTrendingList$1", f = "EditEffectSearchTrendingComponent.kt", l = {103, 129}, m = "invokeSuspend")
public final class C1412300mr6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1424450nAh LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ C1426100nDM LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412300mr6(C1424450nAh c1424450nAh, long j, C1426100nDM c1426100nDM, InterfaceC1364105Vn<? super C1412300mr6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1424450nAh;
        this.LLILZ = j;
        this.LLILZIL = c1426100nDM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1412300mr6 c1412300mr6 = new C1412300mr6(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1412300mr6.LLILLJJLI = obj;
        return c1412300mr6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int iIntValue;
        String strValueOf;
        ArrayList arrayList;
        List<EditEffectSearchTrendingItem> list;
        Integer num;
        Integer num2;
        Integer num3;
        Integer numLJ;
        List<EditEffectSearchTrendingItem> list2;
        Integer num4;
        boolean z;
        C1C7U.LIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = false;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1424450nAh c1424450nAh = this.LLILLL;
            this.LL = 1;
            int customOrdinal = EnumC035000Ai.ASSET_TYPE_EFFECT.getCustomOrdinal();
            EditEffectTrendingSearchApi editEffectTrendingSearchApi = (EditEffectTrendingSearchApi) c1424450nAh.LIZ.getValue();
            if (editEffectTrendingSearchApi != null) {
                obj = editEffectTrendingSearchApi.fetchEditEffectSearchTrendingList(10, customOrdinal, "142710f02c3a11e8b42429f14557854a", this);
                if (obj != C099R.LJFF()) {
                    obj = (EditEffectSearchTrendingListResponse) obj;
                }
            } else {
                obj = null;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1");
                return objLJFF;
            }
        }
        EditEffectSearchTrendingListResponse editEffectSearchTrendingListResponse = (EditEffectSearchTrendingListResponse) obj;
        if (editEffectSearchTrendingListResponse != null && (num4 = editEffectSearchTrendingListResponse.statusCode) != null && num4.intValue() == 0) {
            List<EditEffectSearchTrendingItem> list3 = editEffectSearchTrendingListResponse.trendingList;
            if (list3 == null || list3.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c098200Yq = (EditEffectSearchTrendingListResponse) obj;
                C189200o6.m2constructorimpl(c098200Yq);
                long j = this.LLILZ;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl == null) {
                    EditEffectSearchTrendingListResponse editEffectSearchTrendingListResponse2 = (EditEffectSearchTrendingListResponse) c098200Yq;
                    C1413450msx c1413450msx = C1413450msx.LIZ;
                    if (editEffectSearchTrendingListResponse2 != null && (num2 = editEffectSearchTrendingListResponse2.statusCode) != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 1;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                    if (editEffectSearchTrendingListResponse2 != null && (num = editEffectSearchTrendingListResponse2.statusCode) != null && num.intValue() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        strValueOf = null;
                    } else {
                        strValueOf = String.valueOf(editEffectSearchTrendingListResponse2);
                    }
                    c1413450msx.getClass();
                    C1413450msx.LJIL(iIntValue, jCurrentTimeMillis, strValueOf);
                    if (editEffectSearchTrendingListResponse2 != null && (list = editEffectSearchTrendingListResponse2.trendingList) != null) {
                        arrayList = new ArrayList();
                        for (EditEffectSearchTrendingItem editEffectSearchTrendingItem : list) {
                            if (!a0.LJJJIL(editEffectSearchTrendingItem.title)) {
                                arrayList.add(editEffectSearchTrendingItem);
                            }
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C1412310mr7 c1412310mr7 = new C1412310mr7(this.LLILZIL, arrayList, null);
                    this.LL = 2;
                    if (C23250099c.LJI(this, abstractC2238408pq, c1412310mr7) == objLJFF) {
                        C1C7U.LIZIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1");
                        return objLJFF;
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1");
                    return unit2;
                }
                C1413450msx c1413450msx2 = C1413450msx.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                String string = thM5exceptionOrNullimpl.toString();
                c1413450msx2.getClass();
                C1413450msx.LJIL(1, jCurrentTimeMillis2, string);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("EditEffectSearchTrendingComponent@95c2.initTrendingList$1");
                return unit3;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch trending list failed statusCode:");
        if (editEffectSearchTrendingListResponse == null) {
            num3 = null;
        } else {
            num3 = editEffectSearchTrendingListResponse.statusCode;
        }
        sbLIZ.append(num3);
        sbLIZ.append(", size:");
        if (editEffectSearchTrendingListResponse == null || (list2 = editEffectSearchTrendingListResponse.trendingList) == null) {
            numLJ = null;
        } else {
            numLJ = C2286608xc.LJ(list2.size());
        }
        sbLIZ.append(numLJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

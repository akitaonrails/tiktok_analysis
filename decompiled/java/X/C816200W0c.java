package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchTrendingListResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0W0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateTrendingCacheManager$maybeStartLoad$1", f = "TemplateTrendingCacheManager.kt", l = {134, 167}, m = "invokeSuspend")
public final class C816200W0c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TemplateSearchNetApi LLILLL;
    public final /* synthetic */ InterfaceC816210W0d<TemplateSearchNetApi> LLILZ;
    public final /* synthetic */ C1422960n8I LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C816200W0c(TemplateSearchNetApi templateSearchNetApi, InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0d, C1422960n8I c1422960n8I, InterfaceC1364105Vn<? super C816200W0c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = templateSearchNetApi;
        this.LLILZ = interfaceC816210W0d;
        this.LLILZIL = c1422960n8I;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C816200W0c c816200W0c = new C816200W0c(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c816200W0c.LLILLJJLI = obj;
        return c816200W0c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        ArrayList arrayList;
        Integer numLJ;
        Object objFetchTemplateSearchTrendingList = obj;
        C1C7U.LIZ("TemplateTrendingCacheManager@2c89.maybeStartLoad$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objFetchTemplateSearchTrendingList);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TemplateTrendingCacheManager@2c89.maybeStartLoad$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objFetchTemplateSearchTrendingList);
        } else {
            C155000ia.LIZIZ(objFetchTemplateSearchTrendingList);
            TemplateSearchNetApi templateSearchNetApi = this.LLILLL;
            InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0d = this.LLILZ;
            int iLIZIZ = interfaceC816210W0d.LIZIZ();
            String accessKey = interfaceC816210W0d.getAccessKey();
            String first = interfaceC816210W0d.LIZ().getFirst();
            String second = interfaceC816210W0d.LIZ().getSecond();
            String strLIZJ = interfaceC816210W0d.LIZJ();
            this.LL = 1;
            objFetchTemplateSearchTrendingList = templateSearchNetApi.fetchTemplateSearchTrendingList(10, iLIZIZ, accessKey, first, second, strLIZJ, this);
            if (objFetchTemplateSearchTrendingList == objLJFF) {
                C1C7U.LIZIZ("TemplateTrendingCacheManager@2c89.maybeStartLoad$1");
                return objLJFF;
            }
        }
        TemplateSearchTrendingListResponse templateSearchTrendingListResponse = (TemplateSearchTrendingListResponse) objFetchTemplateSearchTrendingList;
        Integer num = templateSearchTrendingListResponse.statusCode;
        if (num != null && num.intValue() == 0) {
            List<TemplateSearchTrendingItem> list = templateSearchTrendingListResponse.trendingList;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (!z) {
                c098200Yq = (TemplateSearchTrendingListResponse) objFetchTemplateSearchTrendingList;
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl == null) {
                    Collection collection = ((TemplateSearchTrendingListResponse) c098200Yq).trendingList;
                    if (collection == null) {
                        collection = C13BV.INSTANCE;
                    }
                    arrayList = new ArrayList(collection);
                    if (((Boolean) C0BO1.LIZ.getValue()).booleanValue()) {
                        C844470XAv c844470XAv = C844470XAv.LIZ;
                        EnumC2143908ab enumC2143908ab = EnumC2143908ab.SEARCH_DEBUG_INFO;
                        c844470XAv.getClass();
                        enumC2143908ab.name();
                    }
                } else {
                    C201955140j.LJIIJ(C1398350mUb.LIZIZ, "fetch search trending error", thM5exceptionOrNullimpl);
                    arrayList = null;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C805230ViL c805230ViL = new C805230ViL(arrayList, this.LLILZIL, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c805230ViL) == objLJFF) {
                    C1C7U.LIZIZ("TemplateTrendingCacheManager@2c89.maybeStartLoad$1");
                    return objLJFF;
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TemplateTrendingCacheManager@2c89.maybeStartLoad$1");
                return unit2;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch search trending error, statusCode=");
        sbLIZ.append(templateSearchTrendingListResponse.statusCode);
        sbLIZ.append(", size=");
        List<TemplateSearchTrendingItem> list2 = templateSearchTrendingListResponse.trendingList;
        if (list2 != null) {
            numLJ = C2286608xc.LJ(list2.size());
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

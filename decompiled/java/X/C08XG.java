package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08XG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.communicate.AbsSearchService$preloadOtherProductImage$1", f = "AbsSearchService.kt", l = {}, m = "invokeSuspend")
public final class C08XG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SearchMixFeed LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08XG(SearchMixFeed searchMixFeed, InterfaceC1364105Vn<? super C08XG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchMixFeed;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C08XG c08xg = new C08XG(this.LLILLJJLI, interfaceC1364105Vn);
        c08xg.LL = obj;
        return c08xg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsSearchService@8881.preloadOtherProductImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SearchMixFeed searchMixFeed = this.LLILLJJLI;
        if (searchMixFeed != null) {
            try {
                DynamicPatch dynamicPatch = searchMixFeed.getDynamicPatch();
                if (dynamicPatch != null && dynamicPatch.getOriginType() == 9) {
                    EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
                    HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C1741890vQh.LJIIIIZZ(searchMixFeed));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("/data_product/self_define");
                    sbLIZ.append(EnumC1993307rP.GENERAL_SEARCH_STREAM.getPath());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    ecomResourceBystander.getClass();
                    EcomResourceBystander.LJIILLIIL(mapLJIIJ, strLIZIZ, null, null, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsSearchService@8881.preloadOtherProductImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

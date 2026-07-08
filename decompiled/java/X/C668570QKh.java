package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import com.ss.android.ugc.aweme.search.pages.sug.core.repo.SearchSugApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.core.cache.SugTireCacheManager$prepareSugCacheDataBase$1", f = "SugTireCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C668570QKh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C668570QKh(InterfaceC1364105Vn<? super C668570QKh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C668570QKh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<SearchSugEntity> list;
        C1C7U.LIZ("SugTireCacheManager@5e35.prepareSugCacheDataBase$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            String str = SearchSugApi.LIZ().LIZ().execute().LIZIZ;
            str.toString();
            if (!TextUtils.isEmpty(str)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C668560QKg.LIZ.getClass();
                SearchSugResponse searchSugResponseLIZJ = C668560QKg.LIZJ(str);
                if (searchSugResponseLIZJ != null && (list = searchSugResponseLIZJ.sugList) != null && !list.isEmpty()) {
                    C668560QKg.LIZ().storeLong("cache_time", System.currentTimeMillis());
                    C669390QNl.LIZ.LIZ(searchSugResponseLIZJ.sugList);
                    C668560QKg.LIZLLL = true;
                    C668560QKg.LJ = false;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchSugCacheCall Cost:");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    C668560QKg.LJ = false;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SugTireCacheManager@5e35.prepareSugCacheDataBase$1");
                    return unit;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C668560QKg.LJ = false;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SugTireCacheManager@5e35.prepareSugCacheDataBase$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C668570QKh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.core.cache.SugHistoryCache$migrateKevaToDatabaseIfNeeded$1", f = "SugHistoryCache.kt", l = {}, m = "invokeSuspend")
public final class C313710CRl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C313710CRl(InterfaceC1364105Vn<? super C313710CRl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C313710CRl c313710CRl = new C313710CRl(interfaceC1364105Vn);
        c313710CRl.LL = obj;
        return c313710CRl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SearchSugResponse searchSugResponse;
        List<SearchSugEntity> list;
        C1C7U.LIZ("SugHistoryCache@3084.migrateKevaToDatabaseIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        synchronized (this.LL) {
            try {
                C313720CRm.LIZ.getClass();
                C01GW c01gw = C313720CRm.LJI;
                if (!((Keva) c01gw.getValue()).getBoolean("is_migrated_to_db", false)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        String string = ((Keva) c01gw.getValue()).getString("history_sug_response", "");
                        if (string.length() > 0 && (searchSugResponse = (SearchSugResponse) C7740030o.LIZ().getGson().LJII(string, SearchSugResponse.class)) != null && (list = searchSugResponse.sugList) != null && !list.isEmpty()) {
                            C0QOI.LIZ.LIZ(list);
                        }
                        ((Keva) c01gw.getValue()).storeBoolean("is_migrated_to_db", true);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Keva to Database migration has been marked as complete, cost ");
                        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugHistoryCache@3084.migrateKevaToDatabaseIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

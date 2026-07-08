package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CRk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.sug.core.cache.SugHistoryCache$addSugList$3", f = "SugHistoryCache.kt", l = {143}, m = "invokeSuspend")
public final class C313700CRk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C313700CRk(InterfaceC1364105Vn<? super C313700CRk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313700CRk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        C1C7U.LIZ("SugHistoryCache@3084.addSugList$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C272010AlL.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("SugHistoryCache@3084.addSugList$3");
                return objLJFF;
            }
        }
        C313720CRm c313720CRm = C313720CRm.LIZ;
        c313720CRm.getClass();
        if (!C301430Brh.LIZ() && C0BQT.LIZ() && !C313720CRm.LJFF) {
            synchronized (c313720CRm) {
                try {
                    try {
                        System.currentTimeMillis();
                        SearchSugResponse searchSugResponse = (SearchSugResponse) C7740030o.LIZ().getGson().LJII(C7740030o.LIZ().getGson().LJIILL(C313720CRm.LIZLLL), SearchSugResponse.class);
                        List<SearchSugEntity> list = searchSugResponse.sugList;
                        if (list != null) {
                            Iterator<SearchSugEntity> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().sugExtraInfo = null;
                            }
                        }
                        String strLJIILL = C7740030o.LIZ().getGson().LJIILL(searchSugResponse);
                        C313720CRm.LIZ.getClass();
                        ((Keva) C313720CRm.LJI.getValue()).storeString("history_sug_response", strLJIILL);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Saving ");
                        List<SearchSugEntity> list2 = C313720CRm.LIZLLL.sugList;
                        if (list2 != null) {
                            size = list2.size();
                        } else {
                            size = 0;
                        }
                        sbLIZ.append(size);
                        sbLIZ.append(" items to storage,json size:");
                        sbLIZ.append(strLJIILL.length());
                        C2188811AlT.LIZIZ(sbLIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugHistoryCache@3084.addSugList$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C313700CRk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

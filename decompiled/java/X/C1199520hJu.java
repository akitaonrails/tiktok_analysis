package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199520hJu {
    public static final C1199520hJu LIZ = new C1199520hJu();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(784));
    public static final Gson LIZJ = C7740030o.LIZ().getGson();

    public static PoiSearchApi.PoiSearchResultWrapper LIZ() {
        Object c098200Yq;
        try {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Gson gson = LIZJ;
            LIZ.getClass();
            Keva keva = (Keva) LIZIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("poi_search_result_");
            sbLIZ.append(curUserId);
            c098200Yq = (PoiSearchApi.PoiSearchResultWrapper) gson.LJII(keva.getString(C2188811AlT.LIZIZ(sbLIZ), null), PoiSearchApi.PoiSearchResultWrapper.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = (PoiSearchApi.PoiSearchResultWrapper) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        return poiSearchResultWrapper != null ? PoiSearchApi.PoiSearchResultWrapper.LJ(poiSearchResultWrapper, 2, 1, 1999) : poiSearchResultWrapper;
    }

    public static boolean LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = (Keva) LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_search_result_");
        sbLIZ.append(curUserId);
        return keva.getString(C2188811AlT.LIZIZ(sbLIZ), null) == null;
    }
}

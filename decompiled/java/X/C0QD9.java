package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.tabconfig.SearchTabConfig;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.0QD9, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QD9 {
    public static final n LIZ = new n();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C305300Bxw());
    public static Map<String, SearchTabConfig> LIZJ;

    public static Map LIZ() {
        Map<String, SearchTabConfig> mapLJ;
        Type type;
        try {
            n nVar = (n) LIZIZ.getValue();
            mapLJ = null;
            boolean z = true;
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(String.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(SearchTabConfig.class))));
                } else {
                    type = new TypeToken<Map<String, ? extends SearchTabConfig>>() { // from class: X.0PQ1
                    }.getType();
                }
                Object objLIZLLL = gsonLJFF.LIZLLL(nVar, type);
                if (!(objLIZLLL instanceof Map)) {
                    objLIZLLL = null;
                }
                mapLJ = (Map) objLIZLLL;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (mapLJ == null || !mapLJ.isEmpty()) {
                z = false;
            }
            if (z || mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mapLJ = C2097608Jq.LJ();
        }
        LIZJ = mapLJ;
        return mapLJ;
    }
}

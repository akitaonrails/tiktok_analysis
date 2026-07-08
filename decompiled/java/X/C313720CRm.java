package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C313720CRm {
    public static final C313720CRm LIZ = new C313720CRm();
    public static AnonymousClass0956 LIZIZ;
    public static final C054G LIZJ;
    public static SearchSugResponse LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static final C01GW LJI;

    static {
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        LIZJ = c054gLIZ;
        SearchSugResponse searchSugResponse = new SearchSugResponse();
        searchSugResponse.sugList = new ArrayList();
        LIZLLL = searchSugResponse;
        if (C301430Brh.LIZ()) {
            C23250099c.LIZLLL(c054gLIZ, null, null, new C313710CRl(null), 3);
        }
        LJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(517));
    }

    public final void LIZ() {
        SearchSugResponse searchSugResponse;
        if (C301430Brh.LIZ() || !C0BQT.LIZ() || LJFF) {
            return;
        }
        synchronized (this) {
            try {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (LJ) {
                        return;
                    }
                    LJ = true;
                    LIZ.getClass();
                    String string = ((Keva) LJI.getValue()).getString("history_sug_response", "");
                    if (string.length() > 0 && (searchSugResponse = (SearchSugResponse) C7740030o.LIZ().getGson().LJII(string, SearchSugResponse.class)) != null) {
                        List<SearchSugEntity> list = searchSugResponse.sugList;
                        if (list != null) {
                            for (SearchSugEntity searchSugEntity : list) {
                                if (searchSugEntity.sugExtraInfo == null) {
                                    searchSugEntity.sugExtraInfo = new SugExtraInfo();
                                }
                            }
                        }
                        LIZLLL = searchSugResponse;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Loaded ");
                        List<SearchSugEntity> list2 = searchSugResponse.sugList;
                        sbLIZ.append(list2 != null ? list2.size() : 0);
                        sbLIZ.append(" items from storage");
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadFromStorage cost:");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ2.append("ms");
                    C2188811AlT.LIZIZ(sbLIZ2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

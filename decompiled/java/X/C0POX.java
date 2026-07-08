package X;

import Y.ARunnableS104S0100000_4;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0POX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0POX {
    public static final C0POX LIZ = new C0POX();
    public static final Map<C0POK, Pair<C0POK, C15O7<?>>> LIZIZ = new HashMap();
    public static final Map<C15O7<?>, C0X9S<C1515820pY4<SearchMixFeedList>>> LIZJ = new LinkedHashMap();
    public static final Map<String, C0POW> LIZLLL = new HashMap();
    public static final Map<String, String> LJ = new HashMap();
    public static final Map<String, Long> LJFF = new HashMap();
    public static long LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public static final int LJIIIZ;
    public static int LJIIJ;
    public static final boolean LJIIJJI;
    public static int LJIIL;

    static {
        SearchSecurityControlConfig.LIZ.getClass();
        LJIIIIZZ = SearchSecurityControlConfig.LIZJ();
        LJIIIZ = SearchSecurityControlConfig.LIZJ();
        LJIIJ = -1;
        LJIIJJI = ((Number) C272700AmS.LIZ.getValue()).intValue() == 0;
    }

    public static String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UUID.randomUUID());
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('_');
        sbLIZ.append(AbstractC19994813Le.Default.nextInt(0, 100000));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(C0POK c0pok) {
        String keyword;
        SearchResultParam searchResultParam = c0pok.LL;
        if (searchResultParam != null && (keyword = searchResultParam.getKeyword()) != null) {
            Map<String, C0POW> map = LIZLLL;
            C0POW c0pow = (C0POW) ((HashMap) map).get(keyword);
            if (c0pow != null && !Intrinsics.LJFF(c0pow.LIZJ, "hit")) {
                C1ER1.LIZIZ.LLLJ("cancel", keyword, "TIME_OUT");
                ((HashMap) LIZIZ).remove(c0pok);
                LIZ.getClass();
                ((HashMap) map).remove(keyword);
            }
        }
    }

    public static void LIZIZ(C0POK c0pok) {
        Pair pair = (Pair) ((HashMap) LIZIZ).remove(c0pok);
        if (pair != null) {
            C643910PNl.LIZIZ((C15O7) pair.getSecond(), null);
        }
        String str = c0pok.LLILLJJLI;
        if (str != null) {
            ((HashMap) LIZLLL).remove(str);
        }
    }

    public static void LIZLLL(String str) throws JSONException {
        boolean z;
        String str2;
        String str3;
        if (str != null) {
            HashMap map = (HashMap) LJFF;
            Long l = (Long) map.get(str);
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0) {
                    C0POW c0pow = (C0POW) ((HashMap) LIZLLL).get(str);
                    map.remove(str);
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                    C666360QBu.LIZ.getClass();
                    boolean zBooleanValue = false;
                    if (jCurrentTimeMillis > C666360QBu.LIZ().clearCacheDelayTime) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str4 = null;
                    if (c0pow != null) {
                        str2 = c0pow.LIZ;
                        str3 = c0pow.LJ;
                        str4 = c0pow.LIZIZ;
                        Boolean bool = c0pow.LJFF;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                    } else {
                        str2 = null;
                        str3 = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prefetchId", str2);
                    jSONObject.put("prefetchType", str3);
                    jSONObject.put("isHit", -4);
                    jSONObject.put("enterMethod", str4);
                    jSONObject.put("gapTime", jCurrentTimeMillis);
                    jSONObject.put("actHit", z);
                    jSONObject.put("isAhead", zBooleanValue);
                    C823050WQl.LIZIZ().execute(new ARunnableS104S0100000_4(jSONObject, 168));
                }
            }
        }
    }
}

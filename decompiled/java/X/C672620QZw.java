package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.ECSearchApiParamsConfig;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QZw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672620QZw {
    public static final C672620QZw LIZ = new C672620QZw();
    public static Pair<C674800QdS, Long> LIZIZ;

    public static void LJ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        ECSearchApiParamsConfig eCSearchApiParamsConfig;
        List<String> list;
        try {
            Object obj = jSONObject.get("api_params");
            Integer numValueOf = null;
            if ((obj instanceof JSONObject) && (jSONObject2 = (JSONObject) obj) != null && (eCSearchApiParamsConfig = (ECSearchApiParamsConfig) C07P2.LIZIZ.getValue()) != null && (list = eCSearchApiParamsConfig.filterParams) != null) {
                JSONObject jSONObject3 = new JSONObject();
                for (String str : list) {
                    if (jSONObject2.has(str)) {
                        jSONObject3.put(str, jSONObject2.optString(str));
                    }
                }
                jSONObject.put("api_params", jSONObject3);
                numValueOf = Integer.valueOf(Log.d("ppbz_api_params", C1741890vQh.LJIIIIZZ(jSONObject3)));
            }
            C189200o6.m2constructorimpl(numValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(StringBuilder sb, String str, String str2, String str3) {
        if (!Intrinsics.LJFF(str3, str2)) {
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("_");
            sb.append(str3);
            sb.append("_");
        }
    }

    public static void LJFF(JSONObject jSONObject, C674800QdS c674800QdS, boolean z, Integer num) throws JSONException {
        String strLIZIZ;
        Object obj;
        if (c674800QdS.trafficSourceList == null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(c674800QdS.trafficSourceList);
            sbLIZ.append(']');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            try {
                C672620QZw c672620QZw = LIZ;
                try {
                    String strOptString = jSONObject.optString("keyword");
                    try {
                        String str = c674800QdS.keyword;
                        c672620QZw.getClass();
                        LIZ(sb, "keyword", strOptString, str);
                        LIZ(sb, "enter_from", jSONObject.optString("enter_from"), c674800QdS.enterFrom);
                        LIZ(sb, "source", jSONObject.optString("source"), c674800QdS.source);
                        LIZ(sb, "search_channel", jSONObject.optString("search_channel"), c674800QdS.searchChannel);
                        LIZ(sb, "traffic_source_list", jSONObject.optString("traffic_source_list"), strLIZIZ);
                        LIZ(sb, "tag_text", jSONObject.optString("tag_text"), c674800QdS.sugTagText);
                        LIZ(sb, "search_source", jSONObject.optString("search_source"), c674800QdS.searchSource);
                        LIZ(sb, "query_correct_type", String.valueOf(jSONObject.optInt("query_correct_type")), String.valueOf(c674800QdS.correctType));
                        LIZ(sb, "search_context", jSONObject.optString("search_context"), c674800QdS.searchContext);
                        LIZ(sb, "sug_type", jSONObject.optString("sug_type"), c674800QdS.sugType);
                        try {
                            try {
                                LIZ(sb, "last_search_id", jSONObject.optString("last_search_id"), c674800QdS.lastSearchId);
                                try {
                                    try {
                                        LIZ(sb, "sug_creator_id", jSONObject.optString("sug_creator_id"), c674800QdS.sugCreatorId);
                                        try {
                                            try {
                                                LIZ(sb, "sug_shop_id", jSONObject.optString("sug_shop_id"), c674800QdS.sugShopId);
                                                try {
                                                    try {
                                                        LIZ(sb, "attach_products", jSONObject.optString("attach_products"), c674800QdS.attachProducts);
                                                        try {
                                                            try {
                                                                LIZ(sb, "sug_query_state", jSONObject.optString("sug_query_state"), c674800QdS.sugQueryState);
                                                                try {
                                                                    try {
                                                                        LIZ(sb, "cmpl_enc", jSONObject.optString("cmpl_enc"), c674800QdS.cmplEnc);
                                                                        try {
                                                                            try {
                                                                                LIZ(sb, "is_filter_search", String.valueOf(jSONObject.optInt("is_filter_search")), String.valueOf(c674800QdS.isFilterSearch()));
                                                                                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                                                                                try {
                                                                                    JSONObject jSONObject2 = new JSONObject();
                                                                                    try {
                                                                                        jSONObject2.put("preload_different_param_info", sb.toString());
                                                                                        jSONObject2.put("enter_method", c674800QdS.searchSource);
                                                                                        jSONObject2.put("enter_from", c674800QdS.enterFrom);
                                                                                        if (num == null) {
                                                                                            obj = "unknown";
                                                                                        } else {
                                                                                            obj = num;
                                                                                        }
                                                                                        jSONObject2.put("root_enter_from_type", obj);
                                                                                        c1507790pL7.getClass();
                                                                                        C1507790pL7.LIZLLL("rd_ec_search_preload", jSONObject2);
                                                                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                                                                    } catch (Throwable th) {
                                                                                        th = th;
                                                                                        TryCatchGuardChecker.doCheck(th);
                                                                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                            }
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                        }
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                            }
                        } catch (Throwable th16) {
                            th = th16;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                    }
                } catch (Throwable th18) {
                    th = th18;
                }
            } catch (Throwable th19) {
                th = th19;
            }
        }
        jSONObject.put("keyword", c674800QdS.keyword);
        int value = C0QXR.PDP.getValue();
        if (num == null || num.intValue() != value || Intrinsics.LJFF(c674800QdS.enterFrom, jSONObject.optString("enter_from"))) {
            jSONObject.put("enter_from", c674800QdS.enterFrom);
        }
        jSONObject.put("source", c674800QdS.source);
        jSONObject.put("search_channel", c674800QdS.searchChannel);
        jSONObject.put("traffic_source_list", strLIZIZ);
        jSONObject.put("tag_text", c674800QdS.sugTagText);
        jSONObject.put("search_source", c674800QdS.searchSource);
        jSONObject.put("query_correct_type", c674800QdS.correctType);
        jSONObject.put("search_context", c674800QdS.searchContext);
        jSONObject.put("last_search_id", c674800QdS.lastSearchId);
        jSONObject.put("sug_type", c674800QdS.sugType);
        jSONObject.put("sug_creator_id", c674800QdS.sugCreatorId);
        jSONObject.put("sug_shop_id", c674800QdS.sugShopId);
        jSONObject.put("attach_products", c674800QdS.attachProducts);
        jSONObject.put("sug_query_state", c674800QdS.sugQueryState);
        jSONObject.put("cmpl_enc", c674800QdS.cmplEnc);
        jSONObject.put("is_filter_search", c674800QdS.isFilterSearch());
    }

    /* JADX WARN: Removed duplicated region for block: B:320:0x0560  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C674800QdS LIZIZ(com.ss.android.ugc.aweme.search.model.SearchResultParam r62, java.lang.String r63, java.lang.String r64, X.C672630QZx r65, java.lang.String r66) {
        /*
            Method dump skipped, instruction units count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672620QZw.LIZIZ(com.ss.android.ugc.aweme.search.model.SearchResultParam, java.lang.String, java.lang.String, X.0QZx, java.lang.String):X.0QdS");
    }

    public static C674800QdS LIZJ(SearchResultParam searchResultParam, String str, String str2, C669560QOc c669560QOc, String str3) {
        Long second;
        C674800QdS first;
        String str4;
        Pair<C674800QdS, Long> pair = LIZIZ;
        if (pair != null) {
            second = pair.getSecond();
        } else {
            second = null;
        }
        Pair<C674800QdS, Long> pair2 = LIZIZ;
        if (pair2 != null) {
            first = pair2.getFirst();
        } else {
            first = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C674800QdS c674800QdSLIZIZ = LIZIZ(searchResultParam, str, str2, new C672630QZx(null, c669560QOc), str3);
        if (((Boolean) C099700Zf.LIZ.getValue()).booleanValue() && first != null && second != null) {
            try {
                long jLongValue = second.longValue();
                C674790QdR.LIZ.getClass();
                if (jLongValue + ((long) C1208504o7.LIZ) > jCurrentTimeMillis && first.isSame(c674800QdSLIZIZ) && (str4 = first.clientRequestId) != null) {
                    String str5 = c674800QdSLIZIZ.clientRequestId;
                    c674800QdSLIZIZ.setClientRequestId(str4);
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("sync_client_request_id: origin=");
                    sbLIZ.append(str5);
                    sbLIZ.append(", preload=");
                    sbLIZ.append(str4);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZ(strLIZIZ);
                    return c674800QdSLIZIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sync_client_request_id error: ");
                sbLIZ2.append(e.getMessage());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c2341109Fh2.getClass();
                C2341109Fh.LIZJ(strLIZIZ2);
            }
        }
        return c674800QdSLIZIZ;
    }
}

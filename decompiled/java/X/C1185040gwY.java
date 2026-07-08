package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185040gwY {
    public static final C1185040gwY LIZ = new C1185040gwY();
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"ttls_rd_cache_flag", "ttls_rd_dedup_flag", "local_service_pass_through_uuid"});

    public static Object LIZ(Object obj, boolean z) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            HashMap map = new HashMap(jSONObject.length());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!z || !LIZIZ.contains(next)) {
                    map.put(next, LIZ(jSONObject.opt(next), false));
                }
            }
            return map;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(LIZ(jSONArray.opt(i), false));
            }
            return arrayList;
        }
        if (Intrinsics.LJFF(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    public static void LIZIZ(String str, Map map, C1185050gwZ c1185050gwZ) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
            LIZJ(str, jSONObject, c1185050gwZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.FAILED_TO_CONVERT_JSON_TO_MAP, e);
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject, C1185050gwZ c1185050gwZ) {
        PageFinder pageFinder;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (c1185050gwZ != null && (pageFinder = c1185050gwZ.LIZ) != null) {
            C1893310zMv.LIZIZ.LJ(pageFinder, str, jSONObject);
        }
        C20684815ws.LJIJ(str, jSONObject);
    }

    public static void LJFF(String str, Map map, C1185050gwZ c1185050gwZ) {
        if (C1893310zMv.LIZIZ.LJIIL()) {
            LIZIZ(str, map, c1185050gwZ);
        } else {
            C20684815ws.LJIILLIIL(str, map);
        }
    }

    public static void LJIIIIZZ(String str, JSONObject jSONObject, C1184710gw1 c1184710gw1) throws JSONException {
        EnumC1184770gw7 enumC1184770gw7LIZ;
        int iHashCode;
        try {
            Object objLIZ = LIZ(jSONObject, true);
            if (objLIZ != null) {
                iHashCode = objLIZ.hashCode();
            } else {
                iHashCode = 0;
            }
            enumC1184770gw7LIZ = c1184710gw1.LIZ(iHashCode, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1205490hTX.LIZ.LJ(C1EMR.SHOW_MOB_DEDUP_DECIDE_ERROR, th);
            enumC1184770gw7LIZ = EnumC1184770gw7.FIRE_NORMAL;
        }
        int i = C1184840gwE.LIZ[enumC1184770gw7LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        C20684815ws.LJIJ(str, jSONObject);
                        return;
                    }
                    throw new C1954807lC();
                }
                jSONObject.put("ttls_rd_dedup_flag", true);
                C20684815ws.LJIJ(str, jSONObject);
                return;
            }
            jSONObject.put("ttls_rd_cache_flag", true);
            C20684815ws.LJIJ(str, jSONObject);
        }
    }

    public static void LJI(String str, Map map, C1185050gwZ c1185050gwZ, C1184710gw1 c1184710gw1) {
        if (c1184710gw1 != null && c1184710gw1.LIZIZ()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                if (c1184710gw1 != null && c1184710gw1.LIZIZ()) {
                    if (c1185050gwZ != null) {
                        try {
                            PageFinder pageFinder = c1185050gwZ.LIZ;
                            if (pageFinder != null) {
                                C1893310zMv.LIZIZ.LJ(pageFinder, str, jSONObject);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1205490hTX.LIZ.LJ(C1EMR.SHOW_MOB_DEDUP_DECIDE_ERROR, th);
                            LIZJ(str, jSONObject, c1185050gwZ);
                            return;
                        }
                    }
                    LJIIIIZZ(str, jSONObject, c1184710gw1);
                    return;
                }
                LIZJ(str, jSONObject, c1185050gwZ);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX.LIZ.LJ(C1EMR.FAILED_TO_CONVERT_JSON_TO_MAP, e);
                return;
            }
        }
        LIZIZ(str, map, c1185050gwZ);
    }

    public static void LJII(String str, Map map, C1185050gwZ c1185050gwZ, C1184710gw1 c1184710gw1) {
        PageFinder pageFinder;
        if (c1184710gw1 != null && c1184710gw1.LIZIZ()) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
                if (c1184710gw1 != null && c1184710gw1.LIZIZ()) {
                    try {
                        C1893310zMv c1893310zMv = C1893310zMv.LIZIZ;
                        if (c1893310zMv.LJIIL() && c1185050gwZ != null && (pageFinder = c1185050gwZ.LIZ) != null) {
                            c1893310zMv.LJ(pageFinder, str, jSONObject);
                        }
                        LJIIIIZZ(str, jSONObject, c1184710gw1);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1205490hTX.LIZ.LJ(C1EMR.SHOW_MOB_DEDUP_DECIDE_ERROR, th);
                        if (C1893310zMv.LIZIZ.LJIIL()) {
                            LIZJ(str, jSONObject, c1185050gwZ);
                            return;
                        } else {
                            C20684815ws.LJIJ(str, jSONObject);
                            return;
                        }
                    }
                }
                if (C1893310zMv.LIZIZ.LJIIL()) {
                    LIZJ(str, jSONObject, c1185050gwZ);
                    return;
                } else {
                    C20684815ws.LJIJ(str, jSONObject);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX.LIZ.LJ(C1EMR.FAILED_TO_CONVERT_JSON_TO_MAP, e);
                return;
            }
        }
        LJFF(str, map, c1185050gwZ);
    }
}

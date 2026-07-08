package X;

import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.performance.h5.preload.predownload.fetcher.MinisH5ResourceFetcher;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Axe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196361Axe {
    public static JSONArray LIZ = new JSONArray();
    public static JSONObject LIZIZ = new JSONObject();
    public static HashMap<String, Object> LIZJ;

    public static String LIZ(C2196371Axf c2196371Axf) {
        ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = C2195161Avi.LIZ;
        String str = "hot";
        if (C2195161Avi.LIZLLL(C2195161Avi.LIZ(C2195221Avo.LJII))) {
            return "hot";
        }
        if (c2196371Axf == null || !c2196371Axf.isHotLaunch()) {
            str = "cold";
            if (c2196371Axf == null) {
                return "cold";
            }
        }
        if (c2196371Axf.isRetry()) {
            str = "retry";
            if (c2196371Axf == null) {
                return "retry";
            }
        }
        if (c2196371Axf.isRelaunch()) {
            return "relaunch";
        }
        return str;
    }

    public static void LIZLLL(SchemaParserData schemaParserData) {
        HashMap map = new HashMap();
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_enter", map, null, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_enter", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisEnter, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJ(SchemaParserData schemaParserData) {
        String str;
        Forest forest;
        HashMap map = new HashMap();
        MinisH5ResourceFetcher.Companion.getClass();
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
        if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
            forest.registerCustomFetcher("MinisH5ResourceFetcher", MinisH5ResourceFetcher.class);
        }
        C1528760psw.LIZIZ = true;
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_load_start", map, null, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        try {
            Object obj = C1842220y2W.LIZ;
            if (schemaParserData != null) {
                str = schemaParserData.clientKey;
            } else {
                str = null;
            }
            String strLIZIZ = C1842220y2W.LIZIZ(str);
            if (strLIZIZ != null) {
                map.put("error_msg", strLIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("minis-PerfEventTrace", "onMinisLoadStart pollBurstErrorMsg failed, swallowed", th);
        }
        C08S3.LIZLLL("tm_load_start", map, null, null);
        int i2 = C2187451AjH.LIZ;
        C1227904rF.LIZ.getClass();
        C1227904rF.LJI(map);
    }

    public static void LJIILJJIL(SchemaParserData schemaParserData) {
        HashMap map = new HashMap();
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_notify_on_game_ready", map, null, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_notify_on_game_ready", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisNotifyOnGameReady, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILLIIL(SchemaParserData schemaParserData) {
        Integer num;
        Integer num2;
        Long l;
        Long l2;
        HashMap map = LIZJ;
        Iterator<String> itKeys = LIZIZ.keys();
        while (itKeys.hasNext()) {
            LIZ.put(LIZIZ.optJSONObject(itKeys.next()));
        }
        Object obj = "";
        if (map == null) {
            map = new HashMap();
            map.put("download_result", 1);
            map.put("decompress_result", 1);
            map.put("result", 1);
            map.put("error_msg", "");
            map.put("is_startup", 1);
        }
        map.put("detail", LIZ.toString());
        Object obj2 = map.get("result");
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            map.remove("pkg_name");
        } else {
            Object obj3 = map.get("pkg_name");
            if ((obj3 instanceof String) && obj3 != null) {
                obj = obj3;
            }
            map.put("error_pkg_name", obj);
            Object obj4 = map.get("download_result");
            if (obj4 instanceof Integer) {
                num2 = (Integer) obj4;
            } else {
                num2 = null;
            }
            if (num2 != null && num2.intValue() == 0) {
                map.put("error_pkg_stage", "download");
            } else {
                map.put("error_pkg_stage", "decompress");
            }
        }
        C2196331Axb c2196331Axb = C2196331Axb.LIZ;
        Object obj5 = map.get("tm_timestamp");
        if (obj5 instanceof Long) {
            l = (Long) obj5;
        } else {
            l = null;
        }
        c2196331Axb.getClass();
        C2196331Axb.LIZJ("tm_startup_download_pkgs_result", map, null, l);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        Object obj6 = map.get("tm_timestamp");
        if (obj6 instanceof Long) {
            l2 = (Long) obj6;
        } else {
            l2 = null;
        }
        C08S3.LIZLLL("tm_startup_download_pkgs_result", map, null, l2);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tm_startup_download_pkgs_start, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ = new JSONObject();
        LIZ = new JSONArray();
        LIZJ = null;
    }

    public static void LJIIZILJ(SchemaParserData schemaParserData) {
        HashMap map = new HashMap();
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_startup_download_pkgs_start", map, null, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_startup_download_pkgs_start", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tm_startup_download_pkgs_start, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIJI(String str) {
        if (LIZJ == null) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("pkg_name", str);
            map.put("download_result", 1);
            map.put("decompress_result", 1);
            map.put("result", 1);
            map.put("error_msg", "");
            map.put("is_startup", 1);
            map.put("tm_timestamp", Long.valueOf(System.currentTimeMillis()));
            LIZJ = map;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x029f A[PHI: r5
      0x029f: PHI (r5v1 X.1Axm) = (r5v0 X.1Axm), (r5v3 X.1Axm) binds: [B:111:0x01b8, B:113:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.C2196371Axf r14, com.ss.android.ugc.aweme.minis.common.SchemaParserData r15) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196361Axe.LJI(X.1Axf, com.ss.android.ugc.aweme.minis.common.SchemaParserData):void");
    }

    public static void LJ(SchemaParserData schemaParserData, boolean z, String str) {
        HashMap map = new HashMap();
        map.put("result", Integer.valueOf(z ? 1 : 0));
        map.put("error_msg", str);
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_init_native_runtime_result", map, null, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_init_native_runtime_result", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisInitNativeRuntimeResult, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(X.C2196371Axf r13, com.ss.android.ugc.aweme.minis.common.SchemaParserData r14, java.util.Map r15) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196361Axe.LJII(X.1Axf, com.ss.android.ugc.aweme.minis.common.SchemaParserData, java.util.Map):void");
    }

    public static void LJIILL(boolean z, long j, SchemaParserData schemaParserData) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put("result", Integer.valueOf(z ? 1 : 0));
        map2.put("duration", Long.valueOf(j));
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_schema_decode_result", map, map2, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_schema_decode_result", map, map2, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisSchemaDecodeResult, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        sbLIZ.append(", metricMap:");
        sbLIZ.append(C1227904rF.LJI(map2));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIIIZZ(SchemaParserData schemaParserData, boolean z, boolean z2, String str) {
        HashMap map = new HashMap();
        map.put("has_installed", Integer.valueOf(z ? 1 : 0));
        map.put("result", Integer.valueOf(z2 ? 1 : 0));
        map.put("error_msg", str);
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_load_ship_so", map, null, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_load_ship_so", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisLoadShipSO, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJJI(SchemaParserData schemaParserData, boolean z, boolean z2, String str) {
        HashMap map = new HashMap();
        map.put("has_installed", Integer.valueOf(z ? 1 : 0));
        map.put("result", Integer.valueOf(z2 ? 1 : 0));
        map.put("error_msg", str);
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_load_vmsdk_so", map, null, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_load_vmsdk_so", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisLoadVmsdkSO, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(SchemaParserData schemaParserData, String str, boolean z, boolean z2, boolean z3) {
        HashMap map = new HashMap();
        map.put("pkg_name", str);
        map.put("is_startup", Integer.valueOf(z ? 1 : 0));
        map.put("is_preload", Integer.valueOf(z2 ? 1 : 0));
        map.put("is_cache", Integer.valueOf(z3 ? 1 : 0));
        if (z) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pkg_name", str);
            jSONObject2.put("tm_timestamp", System.currentTimeMillis());
            jSONObject.put("tm_download_pkg_start", jSONObject2);
            LIZIZ.put(str, jSONObject);
        }
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_download_pkg_start", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisDownloadPkgStart, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILIIL(boolean z, int i, int i2, long j, SchemaParserData schemaParserData) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put("is_success", Integer.valueOf(z ? 1 : 0));
        map.put("minis_status", Integer.valueOf(i));
        map.put("error_code", Integer.valueOf(i2));
        map2.put("duration", Long.valueOf(j));
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_meta_fetch_result", map, map2, null);
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_meta_fetch_result", map, map2, null);
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisMetaFetchResult, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        sbLIZ.append(", metricMap:");
        sbLIZ.append(C1227904rF.LJI(map2));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(int i, String str, String str2, int i2, long j, boolean z) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i3 = 0;
        if (C123100dR.LIZ(str)) {
            try {
                Uri uri = UriProtector.parse(str);
                SchemaParserData schemaParserData = new SchemaParserData(0);
                schemaParserData.LJIIL(uri);
                for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                    map.put((String) entry.getKey(), (String) entry.getValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onMinisLinkFetchResult, parse url failed, url:");
                sbLIZ.append(str);
                sbLIZ.append(", e:");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        if (z) {
            i3 = 1;
        }
        map.put("is_success", Integer.valueOf(i3));
        map.put("minis_status", Integer.valueOf(i));
        map.put("error_code", Integer.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        map.put("minis_id", str2);
        map2.put("duration", Long.valueOf(j));
        C08S3.LIZLLL("tm_link_fetch_result", map, map2, null);
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onMinisLinkFetchResult, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ2.append(C1227904rF.LJI(map));
        sbLIZ2.append(", metricMap:");
        sbLIZ2.append(C1227904rF.LJI(map2));
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJIJ(SchemaParserData schemaParserData, double d, double d2, double d3, int i, double d4, double d5) {
        double d6 = d5;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            d = 0.0d;
        }
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            d2 = 0.0d;
        }
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            d3 = 0.0d;
        }
        if (Double.isNaN(d4) || Double.isInfinite(d4)) {
            d4 = 0.0d;
        }
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            d6 = 0.0d;
        }
        map2.put("fps", Double.valueOf(new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        double d7 = 100;
        map2.put("cpu_usage_rate", Double.valueOf(new BigDecimal(d2 * d7).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        map2.put("cpu_avg_usage_rate", Double.valueOf(new BigDecimal(d3 * d7).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        map2.put("cpu_core_num", Integer.valueOf(i));
        map2.put("gpu_usage_rate", Double.valueOf(new BigDecimal(d4 * d7).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        map2.put("memory_usage", Double.valueOf(new BigDecimal(d6).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        C08S3.LIZLLL("tm_runtime_perf", map, map2, null);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTMRuntimePerf, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        sbLIZ.append(", metricMap:");
        sbLIZ.append(C1227904rF.LJI(map2));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(SchemaParserData schemaParserData, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5) throws JSONException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("pkg_name", str);
        map.put("download_result", Integer.valueOf(z2 ? 1 : 0));
        map.put("decompress_result", Integer.valueOf(z3 ? 1 : 0));
        map.put("result", Integer.valueOf(z ? 1 : 0));
        map.put("error_msg", str2);
        map.put("is_startup", Integer.valueOf(z4 ? 1 : 0));
        map.put("is_preload", Integer.valueOf(z5 ? 1 : 0));
        if (z4) {
            LIZJ = map;
            map.put("tm_timestamp", Long.valueOf(System.currentTimeMillis()));
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(map);
            if (strLJI == null) {
                strLJI = "{}";
            }
            JSONObject jSONObject = new JSONObject(strLJI);
            jSONObject.put("tm_timestamp", System.currentTimeMillis());
            JSONObject jSONObjectOptJSONObject = LIZIZ.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.put("tm_download_pkg_result", jSONObject);
            }
        }
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_download_pkg_result", map, null, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisDownloadPkgResult, categoryMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }
}

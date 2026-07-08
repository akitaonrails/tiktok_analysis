package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.google.gson.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.01fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C392601fo {
    public static final C392601fo LIZ = new C392601fo();
    public static final Map<Long, C393001fs> LIZIZ = new ConcurrentHashMap();
    public static final Map<String, Map<String, Long>> LIZJ = new ConcurrentHashMap();
    public static String LIZLLL = "";
    public static boolean LJ;
    public static boolean LJFF;

    public static void LIZLLL(C392701fp c392701fp) {
        Object objValueOf;
        String errMsg;
        C386801es c386801es;
        C386801es c386801es2;
        if (LJ) {
            return;
        }
        LJ = true;
        Map map = (Map) ((ConcurrentHashMap) LIZJ).get("liveboards_2");
        if (map != null) {
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    String str = (String) ((Map.Entry) it2.next()).getKey();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("stageName=");
                    sbLIZ.append(str);
                    sbLIZ.append(", ");
                    C392201fk.LIZ.getClass();
                    sbLIZ.append(LIZIZ("liveboards_2", C392201fk.LIZIZ, str));
                    sbLIZ.append(", _____");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("liveboards_2");
                sbLIZ2.append(" resource log report: ");
                sbLIZ2.append((Object) sb);
                C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_effect_apply_perf");
            C392201fk.LIZ.getClass();
            String str2 = C392201fk.LIZIZ;
            C393301fv.LIZ.getClass();
            String str3 = C393301fv.LIZIZ;
            c474500IjALIZ.LJJII(Long.valueOf(LIZIZ("liveboards_2", str2, str3)), "duration");
            if (c392701fp == null || (c386801es2 = c392701fp.LIZ) == null || (objValueOf = Integer.valueOf(c386801es2.getErrorCode()).toString()) == null) {
                objValueOf = Integer.valueOf(C386801es.DEFAULT);
            }
            c474500IjALIZ.LJJII(objValueOf, "error_code");
            if (c392701fp == null || (c386801es = c392701fp.LIZ) == null || (errMsg = c386801es.getErrMsg()) == null) {
                errMsg = "";
            }
            c474500IjALIZ.LJJII(errMsg, "error_message");
            c474500IjALIZ.LJJII("liveboards_2", "effect_resource_id");
            C393201fu.LIZ.getClass();
            c474500IjALIZ.LJJII(map.get(C393201fu.LIZIZ), "effect_fetch_ts");
            C393401fw.LIZ.getClass();
            String str4 = C393401fw.LIZIZ;
            c474500IjALIZ.LJJII(map.get(str4), "effect_start_download_ts");
            C393101ft.LIZ.getClass();
            String str5 = C393101ft.LIZIZ;
            c474500IjALIZ.LJJII(map.get(str5), "effect_downloaded_ts");
            c474500IjALIZ.LJJII(Long.valueOf(LIZIZ("liveboards_2", str4, str5)), "effect_download_duration");
            c474500IjALIZ.LJJII(map.get(str2), "effect_apply_ts");
            c474500IjALIZ.LJJII(map.get(str3), "effect_ready_ts");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJI(C392701fp c392701fp) {
        String string;
        Object obj;
        Object obj2;
        Object obj3;
        Long l;
        Object obj4 = null;
        LJII(c392701fp, null);
        HashMap map = new HashMap();
        map.put("action", "error");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ;
        Map map2 = (Map) concurrentHashMap.get("liveboards_2");
        if (map2 == null || (l = (Long) map2.get(c392701fp.LIZIZ)) == null || (string = l.toString()) == null) {
            string = "";
        }
        map.put("ts", string);
        map.put("group_id", "-1");
        map.put("item_id", "-1");
        C393601fy.LIZ.getClass();
        map.put("duration", String.valueOf(LIZIZ("liveboards_2", C393601fy.LIZIZ, c392701fp.LIZIZ)));
        map.put("error_code", String.valueOf(c392701fp.LIZ.getErrorCode()));
        map.put("msg", c392701fp.LIZ.getErrMsg());
        Map map3 = (Map) concurrentHashMap.get("liveboards_2");
        if (map3 != null) {
            C393201fu.LIZ.getClass();
            obj = map3.get(C393201fu.LIZIZ);
        } else {
            obj = null;
        }
        map.put("effect_fetch_ts", String.valueOf(obj));
        Map map4 = (Map) concurrentHashMap.get("liveboards_2");
        if (map4 != null) {
            C393101ft.LIZ.getClass();
            obj2 = map4.get(C393101ft.LIZIZ);
        } else {
            obj2 = null;
        }
        map.put("effect_downloaded_ts", String.valueOf(obj2));
        map.put("effect_resource_id", "liveboards_2");
        Map map5 = (Map) concurrentHashMap.get("liveboards_2");
        if (map5 != null) {
            C392101fj.LIZ.getClass();
            obj3 = map5.get(C392101fj.LIZIZ);
        } else {
            obj3 = null;
        }
        map.put("effect_apply_ts", String.valueOf(obj3));
        Map map6 = (Map) concurrentHashMap.get("liveboards_2");
        if (map6 != null) {
            C393301fv.LIZ.getClass();
            obj4 = map6.get(C393301fv.LIZIZ);
        }
        map.put("effect_ready_ts", String.valueOf(obj4));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            n nVar = new n();
            for (Map.Entry entry : map.entrySet()) {
                nVar.LJJIIJ((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Trace][Business] logError Session ended for resource id:");
            sbLIZ.append("liveboards_2");
            sbLIZ.append(", log= ");
            sbLIZ.append(nVar);
            C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_effect_error_perf");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        LIZLLL(c392701fp);
    }

    public static void LJII(AbstractC392801fq abstractC392801fq, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ = abstractC392801fq.LIZ();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZJ;
        Object concurrentHashMap2 = concurrentHashMap.get("liveboards_2");
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            concurrentHashMap.put("liveboards_2", concurrentHashMap2);
        }
        Map map = (Map) concurrentHashMap2;
        if (!map.containsKey(strLIZ)) {
            map.put(strLIZ, Long.valueOf(jCurrentTimeMillis));
        }
        StringBuilder sb = new StringBuilder("[Trace][Resource] resourceId: liveboards_2, stage: ");
        sb.append(strLIZ);
        sb.append(", timestamp: ");
        sb.append(jCurrentTimeMillis);
        sb.append(", ");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        C392901fr.LIZ(sb.toString());
    }

    public final void LJ(long j, C392701fp c392701fp) {
        String string;
        String string2;
        Object obj;
        Object obj2;
        Object obj3;
        InterfaceC395901gL interfaceC395901gL;
        String string3;
        InterfaceC395901gL interfaceC395901gL2;
        Map<String, Long> map;
        Long l;
        Object obj4 = null;
        LJFF(j, c392701fp, null);
        HashMap map2 = new HashMap();
        map2.put("action", "error");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        C393001fs c393001fs = (C393001fs) concurrentHashMap.get(Long.valueOf(j));
        String str = "";
        if (c393001fs == null || (map = c393001fs.LIZIZ) == null || (l = map.get(c392701fp.LIZIZ)) == null || (string = l.toString()) == null) {
            string = "";
        }
        map2.put("ts", string);
        C393001fs c393001fs2 = (C393001fs) concurrentHashMap.get(Long.valueOf(j));
        if (c393001fs2 == null || (interfaceC395901gL2 = c393001fs2.LIZ) == null || (string2 = Long.valueOf(interfaceC395901gL2.getGroupId()).toString()) == null) {
            string2 = "";
        }
        map2.put("group_id", string2);
        C393001fs c393001fs3 = (C393001fs) concurrentHashMap.get(Long.valueOf(j));
        if (c393001fs3 != null && (interfaceC395901gL = c393001fs3.LIZ) != null && (string3 = Long.valueOf(interfaceC395901gL.getBoardId()).toString()) != null) {
            str = string3;
        }
        map2.put("item_id", str);
        C393601fy.LIZ.getClass();
        map2.put("duration", String.valueOf(LIZ(j, C393601fy.LIZIZ, c392701fp.LIZIZ)));
        map2.put("error_code", String.valueOf(c392701fp.LIZ.getErrorCode()));
        map2.put("msg", c392701fp.LIZ.getErrMsg());
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZJ;
        Map map3 = (Map) concurrentHashMap2.get(LIZLLL);
        if (map3 != null) {
            C393201fu.LIZ.getClass();
            obj = map3.get(C393201fu.LIZIZ);
        } else {
            obj = null;
        }
        map2.put("effect_fetch_ts", String.valueOf(obj));
        Map map4 = (Map) concurrentHashMap2.get(LIZLLL);
        if (map4 != null) {
            C393101ft.LIZ.getClass();
            obj2 = map4.get(C393101ft.LIZIZ);
        } else {
            obj2 = null;
        }
        map2.put("effect_downloaded_ts", String.valueOf(obj2));
        map2.put("effect_resource_id", LIZLLL);
        Map map5 = (Map) concurrentHashMap2.get(LIZLLL);
        if (map5 != null) {
            C392101fj.LIZ.getClass();
            obj3 = map5.get(C392101fj.LIZIZ);
        } else {
            obj3 = null;
        }
        map2.put("effect_apply_ts", String.valueOf(obj3));
        Map map6 = (Map) concurrentHashMap2.get(LIZLLL);
        if (map6 != null) {
            C393301fv.LIZ.getClass();
            obj4 = map6.get(C393301fv.LIZIZ);
        }
        map2.put("effect_ready_ts", String.valueOf(obj4));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            n nVar = new n();
            for (Map.Entry entry : map2.entrySet()) {
                nVar.LJJIIJ((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Trace][Business] logError Session ended for uniqueId:");
            sbLIZ.append(j);
            sbLIZ.append(", log= ");
            sbLIZ.append(nVar);
            C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_effect_error_perf");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
        LIZJ(this, j, c392701fp, 2);
    }

    public static long LIZ(long j, String str, String str2) {
        C393001fs c393001fs = (C393001fs) ((ConcurrentHashMap) LIZIZ).get(Long.valueOf(j));
        if (c393001fs == null) {
            return 0L;
        }
        Long l = c393001fs.LIZIZ.get(str);
        Long l2 = c393001fs.LIZIZ.get(str2);
        if (l == null || l2 == null || l2.longValue() < l.longValue()) {
            return 0L;
        }
        return l2.longValue() - l.longValue();
    }

    public static long LIZIZ(String str, String str2, String str3) {
        Map map = (Map) ((ConcurrentHashMap) LIZJ).get(str);
        if (map == null) {
            return 0L;
        }
        Long l = (Long) map.get(str2);
        Long l2 = (Long) map.get(str3);
        if (l == null || l2 == null || l2.longValue() < l.longValue()) {
            return 0L;
        }
        return l2.longValue() - l.longValue();
    }

    public static void LJFF(long j, AbstractC392801fq abstractC392801fq, String str) {
        String str2;
        Map<String, Long> map;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ = abstractC392801fq.LIZ();
        C393001fs c393001fs = (C393001fs) ((ConcurrentHashMap) LIZIZ).get(Long.valueOf(j));
        if (c393001fs != null && (map = c393001fs.LIZIZ) != null) {
            map.put(strLIZ, Long.valueOf(jCurrentTimeMillis));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Trace][Business][");
        if (LJFF) {
            str2 = "native";
        } else {
            str2 = "effect";
        }
        sbLIZ.append(str2);
        sbLIZ.append("] uniqueId: ");
        sbLIZ.append(j);
        sbLIZ.append(", stage: ");
        sbLIZ.append(strLIZ);
        sbLIZ.append(", timestamp: ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(C392601fo c392601fo, long j, C392701fp c392701fp, int i) {
        String str;
        String string;
        String string2;
        int errorCode;
        String errMsg;
        Object obj;
        Object obj2;
        Object obj3;
        C393001fs c393001fs;
        Map<String, Long> map;
        String string3;
        InterfaceC395901gL interfaceC395901gL;
        String string4;
        InterfaceC395901gL interfaceC395901gL2;
        C386801es c386801es;
        C386801es c386801es2;
        InterfaceC395901gL interfaceC395901gL3;
        InterfaceC395901gL interfaceC395901gL4;
        C392701fp c392701fp2 = c392701fp;
        Object obj4 = null;
        if ((i & 2) != 0) {
            str = "liveboards_2";
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            c392701fp2 = null;
        }
        c392601fo.getClass();
        HashMap map2 = new HashMap();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZIZ;
        C393001fs c393001fs2 = (C393001fs) concurrentHashMap.get(Long.valueOf(j));
        String str2 = "";
        if (c393001fs2 == null || (interfaceC395901gL4 = c393001fs2.LIZ) == null || (string = Long.valueOf(interfaceC395901gL4.getGroupId()).toString()) == null) {
            string = "";
        }
        map2.put("group_id", string);
        C393001fs c393001fs3 = (C393001fs) concurrentHashMap.get(Long.valueOf(j));
        if (c393001fs3 == null || (interfaceC395901gL3 = c393001fs3.LIZ) == null || (string2 = Long.valueOf(interfaceC395901gL3.getBoardId()).toString()) == null) {
            string2 = "";
        }
        map2.put("item_id", string2);
        C393601fy.LIZ.getClass();
        map2.put("duration", String.valueOf(LIZ(j, C393601fy.LIZIZ, new C392001fi("", "").LIZJ)));
        if (c392701fp2 != null && (c386801es2 = c392701fp2.LIZ) != null) {
            errorCode = c386801es2.getErrorCode();
        } else {
            errorCode = C386801es.DEFAULT;
        }
        map2.put("error_code", String.valueOf(errorCode));
        if (c392701fp2 == null || (c386801es = c392701fp2.LIZ) == null || (errMsg = c386801es.getErrMsg()) == null) {
            errMsg = "";
        }
        map2.put("error_message", errMsg);
        C393201fu.LIZ.getClass();
        String str3 = C393201fu.LIZIZ;
        C393101ft.LIZ.getClass();
        String str4 = C393101ft.LIZIZ;
        map2.put("effect_prepare_duration", String.valueOf(LIZIZ(str, str3, str4)));
        C392101fj.LIZ.getClass();
        String str5 = C392101fj.LIZIZ;
        C393301fv.LIZ.getClass();
        String str6 = C393301fv.LIZIZ;
        map2.put("effect_apply_duration", String.valueOf(LIZIZ(str, str5, str6)));
        map2.put("effect_resource_id", str);
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) LIZJ;
        Map map3 = (Map) concurrentHashMap2.get(str);
        if (map3 != null) {
            obj = map3.get(str3);
        } else {
            obj = null;
        }
        map2.put("effect_fetch_ts", String.valueOf(obj));
        Map map4 = (Map) concurrentHashMap2.get(str);
        if (map4 != null) {
            obj2 = map4.get(str4);
        } else {
            obj2 = null;
        }
        map2.put("effect_downloaded_ts", String.valueOf(obj2));
        Map map5 = (Map) concurrentHashMap2.get(str);
        if (map5 != null) {
            obj3 = map5.get(str5);
        } else {
            obj3 = null;
        }
        map2.put("effect_apply_ts", String.valueOf(obj3));
        Map map6 = (Map) concurrentHashMap2.get(str);
        if (map6 != null) {
            obj4 = map6.get(str6);
        }
        map2.put("effect_ready_ts", String.valueOf(obj4));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && (c393001fs = (C393001fs) concurrentHashMap.get(Long.valueOf(j))) != null && (map = c393001fs.LIZIZ) != null) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = new String[2];
            strArr[0] = "group_id";
            C393001fs c393001fs4 = (C393001fs) concurrentHashMap.get(Long.valueOf(j));
            if (c393001fs4 == null || (interfaceC395901gL2 = c393001fs4.LIZ) == null || (string3 = Long.valueOf(interfaceC395901gL2.getGroupId()).toString()) == null) {
                string3 = "";
            }
            strArr[1] = string3;
            C2327709Ad.LJFF(sb, strArr);
            String[] strArr2 = new String[2];
            strArr2[0] = "item_id";
            C393001fs c393001fs5 = (C393001fs) concurrentHashMap.get(Long.valueOf(j));
            if (c393001fs5 != null && (interfaceC395901gL = c393001fs5.LIZ) != null && (string4 = Long.valueOf(interfaceC395901gL.getBoardId()).toString()) != null) {
                str2 = string4;
            }
            strArr2[1] = str2;
            C2327709Ad.LJFF(sb, strArr2);
            Iterator<Map.Entry<String, Long>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                String key = it2.next().getKey();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("key=");
                sbLIZ.append(key);
                sbLIZ.append(", duration=");
                C393601fy.LIZ.getClass();
                sbLIZ.append(LIZ(j, C393601fy.LIZIZ, key));
                sbLIZ.append(", _____");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Trace][Business] endBusinessSession Session ended for uniqueId:");
            sbLIZ2.append(j);
            sbLIZ2.append(", log= ");
            sbLIZ2.append((Object) sb);
            C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_effect_item_perf");
        c474500IjALIZ.LJJIIZI(map2);
        c474500IjALIZ.LIZ();
        ((ConcurrentHashMap) LIZIZ).remove(Long.valueOf(j));
    }
}

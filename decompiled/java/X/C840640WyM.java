package X;

import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.helios.network.api.consumer.ReportParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840640WyM {
    public static final C840640WyM LIZ = new C840640WyM();

    public static String LIZJ(Map map) throws JSONException {
        Object obj;
        if (map == null) {
            return "pns-null";
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("field_name", key);
            if (NetworkComponent.INSTANCE.isOfflineEnv()) {
                if (value == null) {
                    obj = "pns-null";
                } else {
                    obj = value;
                }
                jSONObject.put("field_sampling_value", obj);
            }
            if (value != null) {
                C840550WyD.LIZ.getClass();
                Set<String> set = C840550WyD.LIZIZ.get((String) value);
                if (set != null) {
                    Set set2 = (Set) jSONObject.opt("data_types");
                    if (set2 != null) {
                        C15442062u.LJIIIZ(set2, set);
                    } else {
                        jSONObject.put("data_types", set);
                    }
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray.toString();
    }

    public static String LIZLLL(Map map) {
        String str;
        if (map == null) {
            return "pns-null";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                String str2 = (String) entry.getKey();
                List<String> list = (List) entry.getValue();
                if (!u.LJJIIJZLJL(str2, "x-metasec", false)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("field_name", str2);
                    if (NetworkComponent.INSTANCE.isOfflineEnv()) {
                        if (list == null || (str = (String) list.get(0)) == null) {
                            str = "pns-null";
                        }
                        jSONObject.put("field_sampling_value", str);
                    }
                    if (list != null) {
                        for (String str3 : list) {
                            C840550WyD.LIZ.getClass();
                            Set<String> set = C840550WyD.LIZIZ.get(str3);
                            if (set != null) {
                                Set set2 = (Set) jSONObject.opt("data_types");
                                if (set2 != null) {
                                    C15442062u.LJIIIZ(set2, set);
                                } else {
                                    jSONObject.put("data_types", set);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONArray.toString();
    }

    public static String LJ(Map map) {
        String str;
        if (map == null) {
            return "pns-null";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!u.LJJIIJZLJL(str2, "x-metasec", false)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("field_name", str2);
                    if (NetworkComponent.INSTANCE.isOfflineEnv()) {
                        if (str3 == null) {
                            str = "pns-null";
                        } else {
                            str = str3;
                        }
                        jSONObject.put("field_sampling_value", str);
                    }
                    if (str3 != null) {
                        C840550WyD.LIZ.getClass();
                        Set<String> set = C840550WyD.LIZIZ.get(str3);
                        if (set != null) {
                            Set set2 = (Set) jSONObject.opt("data_types");
                            if (set2 != null) {
                                C15442062u.LJIIIZ(set2, set);
                            } else {
                                jSONObject.put("data_types", set);
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r1 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.InterfaceC823460WSa r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C840640WyM.LJFF(X.0WSa, java.lang.String):void");
    }

    public static void LJI(C840900Wym c840900Wym, List list) {
        Map<String, Object> map = c840900Wym.LIZIZ;
        Map<String, Object> map2 = c840900Wym.LIZJ;
        Map<String, Object> map3 = c840900Wym.LIZLLL;
        for (ReportParam reportParam : C13LP.LLIIII(list)) {
            String str = reportParam.type;
            int iHashCode = str.hashCode();
            if (iHashCode != -2012801195) {
                if (iHashCode != -1077545552) {
                    if (iHashCode == 50511102 && str.equals("category")) {
                        C840640WyM c840640WyM = LIZ;
                        String str2 = reportParam.key;
                        Object obj = reportParam.value;
                        reportParam.isCheckConflict();
                        c840640WyM.getClass();
                        LIZ(obj, str2, map);
                    }
                } else if (str.equals("metric")) {
                    C840640WyM c840640WyM2 = LIZ;
                    String str3 = reportParam.key;
                    Object obj2 = reportParam.value;
                    reportParam.isCheckConflict();
                    c840640WyM2.getClass();
                    LIZ(obj2, str3, map2);
                }
            } else if (str.equals("log_extra")) {
                C840640WyM c840640WyM3 = LIZ;
                String str4 = reportParam.key;
                Object obj3 = reportParam.value;
                reportParam.isCheckConflict();
                c840640WyM3.getClass();
                LIZ(obj3, str4, map3);
            }
        }
    }

    public static void LIZ(Object obj, String str, Map map) {
        List<String> list;
        NetworkConfig networkConfigNetworkConfigOrNull = NetworkComponent.INSTANCE.networkConfigOrNull();
        if (networkConfigNetworkConfigOrNull != null && (list = networkConfigNetworkConfigOrNull.reportBlockList) != null && list.contains(str)) {
            return;
        }
        map.put(str, obj);
    }
}

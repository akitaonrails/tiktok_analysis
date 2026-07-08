package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208460hYK {
    public static final CopyOnWriteArrayList<InterfaceC110100bL> LIZ = new CopyOnWriteArrayList<>();
    public static final List<C443120HZe<String, Map<String, Object>, Map<String, Long>>> LIZIZ = Collections.synchronizedList(new ArrayList());
    public static C18JF LIZJ;

    public static void LIZ(InterfaceC110100bL interfaceC110100bL) {
        CopyOnWriteArrayList<InterfaceC110100bL> copyOnWriteArrayList = LIZ;
        copyOnWriteArrayList.addIfAbsent(interfaceC110100bL);
        if (!copyOnWriteArrayList.isEmpty()) {
            List<C443120HZe<String, Map<String, Object>, Map<String, Long>>> list = LIZIZ;
            if (!list.isEmpty()) {
                ArrayList<C443120HZe> arrayList = new ArrayList();
                synchronized (list) {
                    try {
                        arrayList.addAll(list);
                        list.clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                for (C443120HZe c443120HZe : arrayList) {
                    LIZIZ((String) c443120HZe.getFirst(), (Map) c443120HZe.getSecond(), (Map) c443120HZe.getThird());
                }
            }
        }
    }

    public static void LIZIZ(String str, Map map, Map map2) {
        if (LIZ.isEmpty()) {
            List<C443120HZe<String, Map<String, Object>, Map<String, Long>>> list = LIZIZ;
            synchronized (list) {
                try {
                    if (list.size() >= 50) {
                        list.remove(0);
                    }
                    list.add(new C443120HZe<>(str, map, map2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        C421590Gg1.LIZ(new C020G(str, (String) map, (Map<String, ? extends Object>) map2, (Map<String, Long>) 3));
    }

    public static void LIZLLL(String str, String str2, String str3) {
        String btm;
        C18JF c18jf = LIZJ;
        if (c18jf != null) {
            btm = c18jf.getBtm();
        } else {
            btm = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("cert_name", str), new Pair("data_type", str2), new Pair("location_status", str3));
        if (btm != null && btm.length() != 0) {
            mapLJIIJ.put("btm", btm);
        }
        LIZIZ("pns_location_get_start", mapLJIIJ, C2097608Jq.LJ());
    }

    public static void LJFF(String str, String str2, String str3, String str4) {
        String btm;
        C18JF c18jf = LIZJ;
        if (c18jf != null) {
            btm = c18jf.getBtm();
        } else {
            btm = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("cert_name", str), new Pair("data_type", str2), new Pair("location_status", str4));
        if (str3 != null && str3.length() != 0) {
            mapLJIIJ.put("location_type", str3);
        }
        if (btm != null && btm.length() != 0) {
            mapLJIIJ.put("btm", btm);
        }
        LIZIZ("pns_location_post_start", mapLJIIJ, C2097608Jq.LJ());
    }

    public static void LJI(long j, long j2, String str, String str2) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("load_type", str), new Pair("last_load_timestamp", Long.valueOf(j2)));
        if (str2 != null) {
            mapLJIIJ.put("config_source", str2);
        }
        LIZIZ("pns_location_sdk_load_start", mapLJIIJ, C2097608Jq.LJIIJ(new Pair("cold_start_to_load_start_duration", Long.valueOf(j))));
    }

    public static void LIZJ(long j, String str, String str2, String str3, String str4, int i, String str5, boolean z, String str6) {
        String btm;
        int i2;
        C18JF c18jf = LIZJ;
        if (c18jf != null) {
            btm = c18jf.getBtm();
        } else {
            btm = null;
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("cert_name", str);
        pairArr[1] = new Pair("data_type", str2);
        pairArr[2] = new Pair("location_status", str4);
        pairArr[3] = new Pair("location_sdk_result", str5);
        pairArr[4] = new Pair("error_code", Integer.valueOf(i));
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        pairArr[5] = new Pair("is_cache", Integer.valueOf(i2));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str3 != null && str3.length() != 0) {
            mapLJIIJ.put("location_type", str3);
        }
        if (btm != null && btm.length() != 0) {
            mapLJIIJ.put("btm", btm);
        }
        if (str6 != null && str6.length() != 0) {
            mapLJIIJ.put("error_msg", str6);
        }
        LIZIZ("pns_location_get_result", mapLJIIJ, C2097608Jq.LJIIJ(new Pair("load_start_to_result_duration", Long.valueOf(j))));
    }

    public static void LJ(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, int i, String str7) {
        String btm;
        C18JF c18jf = LIZJ;
        if (c18jf != null) {
            btm = c18jf.getBtm();
        } else {
            btm = null;
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("cert_name", str), new Pair("data_type", str2), new Pair("location_status", str4), new Pair("location_get_status", str5), new Pair("location_sdk_result", str6), new Pair("error_code", Integer.valueOf(i)));
        if (str3 != null && str3.length() != 0) {
            mapLJIIJ.put("location_type", str3);
        }
        if (btm != null && btm.length() != 0) {
            mapLJIIJ.put("btm", btm);
        }
        if (str7 != null && str7.length() != 0) {
            mapLJIIJ.put("error_msg", str7);
        }
        LIZIZ("pns_location_post_result", mapLJIIJ, C2097608Jq.LJIIJ(new Pair("get_to_post_duration", Long.valueOf(j)), new Pair("load_start_to_result_duration", Long.valueOf(j2))));
    }
}

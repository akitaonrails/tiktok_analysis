package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pVq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514440pVq {
    public static final CopyOnWriteArrayList<InterfaceC110100bL> LIZ = new CopyOnWriteArrayList<>();
    public static final List<C443120HZe<String, Map<String, Object>, Map<String, Long>>> LIZIZ = Collections.synchronizedList(new ArrayList());

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

    public static void LIZLLL(long j, long j2) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("region_sdk_result", "success"), new Pair("error_code", 0));
        if ("success".length() != 0) {
            mapLJIIJ.put("error_msg", "success");
        }
        LIZIZ("pns_region_sdk_load_result", mapLJIIJ, C2097608Jq.LJIIJ(new Pair("cold_start_to_load_start_duration", Long.valueOf(j)), new Pair("load_start_to_result_duration", Long.valueOf(j2))));
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
        C421590Gg1.LIZ(new C020G(str, (String) map, (Map<String, ? extends Object>) map2, (Map<String, Long>) 1));
    }

    public static void LIZJ(long j, String str, int i, int i2, int i3, int i4, String str2, String str3) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("trigger", str), new Pair("result", str2), new Pair("error_code", Integer.valueOf(i)));
        if (str3 != null && str3.length() != 0) {
            mapLJIIJ.put("error_msg", str3);
        }
        LIZIZ("pns_privacy_header_refresh_result", mapLJIIJ, C2097608Jq.LJIIJ(new Pair("elapsed_ms", Long.valueOf(j)), new Pair("success_count", Long.valueOf(i2)), new Pair("failed_count", Long.valueOf(i3)), new Pair("cleared_count", Long.valueOf(i4))));
    }
}

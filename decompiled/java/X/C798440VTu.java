package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798440VTu {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static Map LIZ(int i) {
        String string;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                string = null;
            } else {
                string = C798460VTw.LIZ().getString("monitor_data_group_2", "");
            }
        } else {
            string = C798460VTw.LIZ().getString("monitor_data_group_1", "");
        }
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (z) {
            return new LinkedHashMap();
        }
        try {
            Map map = (Map) C08JS.LIZ(string, Map.class);
            if (map == null) {
                return new LinkedHashMap();
            }
            return C19719512Dh.LIZJ(map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new LinkedHashMap();
        }
    }

    public static void LIZIZ(Map map) {
        String strLIZLLL;
        int i = LIZIZ;
        if (map != null && !((ConcurrentHashMap) map).isEmpty()) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                }
                strLIZLLL = C08JS.LIZLLL(linkedHashMap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                strLIZLLL = null;
            }
        } else {
            strLIZLLL = null;
        }
        C798460VTw.LIZIZ(i, strLIZLLL);
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589840NBm {
    public static final void LIZIZ(String str, long j, Throwable th, Map<String, String> map, String str2) {
        try {
            Pair<Integer, String> pairLJ = C632140Oqq.LJ(th);
            int iIntValue = pairLJ.getFirst().intValue();
            LIZ(C632190Oqv.LIZIZ(th), j, Integer.valueOf(iIntValue), str, pairLJ.getSecond(), C632190Oqv.LIZJ(th), str2, map);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public static final void LIZJ(long j, String str, String str2, String str3, Map map) {
        try {
            LIZ(0, j, null, str, "", str2, str3, map);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZ(int i, long j, Integer num, String str, String str2, String str3, String str4, Map map) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("total_duration", Long.valueOf(j));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        C2241008qG c2241008qG2 = new C2241008qG();
        c2241008qG2.LIZ.put("url_path", str);
        c2241008qG2.LIZ.put("status_code", Integer.valueOf(i));
        if (num != null) {
            c2241008qG2.LIZIZ(num, "error_code");
        }
        if (str2.length() > 0) {
            c2241008qG2.LIZLLL("error_msg", str2);
        }
        if (str3.length() > 0) {
            c2241008qG2.LIZLLL("log_id", str3);
        }
        c2241008qG2.LIZLLL("response", str4);
        C2241008qG c2241008qG3 = new C2241008qG();
        if (map != null) {
            for (String str5 : map.keySet()) {
                c2241008qG3.LIZLLL(str5, (String) map.get(str5));
            }
            if (map.containsKey("scenario")) {
                c2241008qG2.LIZLLL("scenario", (String) map.get("scenario"));
            }
        }
        try {
            C793770VBv.LJII("pns_precise_network_monitor", c2241008qG2.LJ(), jSONObjectLJ, c2241008qG3.LJ());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}

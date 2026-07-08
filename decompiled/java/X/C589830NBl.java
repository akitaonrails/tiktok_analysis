package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589830NBl {
    public static final C589830NBl LIZ = new C589830NBl();

    public static void LIZ(String str, Map map, boolean z) {
        if (z) {
            return;
        }
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("type", str);
        if (map != null) {
            c2241008qG.LIZLLL("error_message", map.toString());
        }
        C794420VEi.LIZIZ("compliance_assert", "", c2241008qG.LJ());
    }

    public static void LIZIZ(String str, int i, long j, Integer num, String str2, String str3, Map map) {
        boolean z;
        boolean z2;
        String str4;
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
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2241008qG2.LIZLLL("error_msg", str2);
        }
        if (str3.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c2241008qG2.LIZLLL("log_id", str3);
        }
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
            C793770VBv.LJII("compliance_biz_network", c2241008qG2.LJ(), jSONObjectLJ, c2241008qG3.LJ());
            if (map == null) {
                str4 = null;
            } else {
                str4 = (String) map.get("report_to_tea");
            }
            if (Intrinsics.LJFF(str4, "true")) {
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("url_path", str), new Pair("status_code", String.valueOf(i)));
                if (num != null) {
                    mapLJIIJ.put("error_code", num.toString());
                }
                if (str2.length() > 0) {
                    mapLJIIJ.put("error_msg", str2);
                }
                if (str3.length() > 0) {
                    mapLJIIJ.put("log_id", str3);
                }
                C20684815ws.LJIILLIIL("compliance_biz_network", mapLJIIJ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}

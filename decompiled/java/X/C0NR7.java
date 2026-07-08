package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.pns.network.core.retry.PNSNetworkRetryConfigModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NR7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NR7 {
    public final PNSNetworkRetryConfigModel LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C2153208c6.LIZ().LIZ.plus(C2296908zH.LIZ()));

    public C0NR7(PNSNetworkRetryConfigModel pNSNetworkRetryConfigModel) {
        this.LIZ = pNSNetworkRetryConfigModel;
    }

    /* JADX WARN: Path cross not found for [B:35:0x00ce, B:77:0x01cb], limit reached: 101 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0233  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01b8 -> B:12:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r37, java.util.Map r38, X.InterfaceC1364105Vn r39, kotlin.jvm.functions.Function1 r40) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NR7.LIZIZ(java.lang.String, java.util.Map, X.05Vn, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static void LIZ(String str, String str2, int i, long j, long j2, boolean z, int i2, Integer num, String str3, String str4, long j3, Map map) {
        Object obj;
        boolean z2;
        boolean z3;
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("request_total_cost_ms", Long.valueOf(j2));
        c2241008qG.LIZ.put("request_attempt_cost_ms", Long.valueOf(j));
        c2241008qG.LIZ.put("request_time_since_cold_start_ms", Long.valueOf(j3));
        JSONObject jSONObjectLJ = c2241008qG.LJ();
        C2241008qG c2241008qG2 = new C2241008qG();
        c2241008qG2.LIZ.put("request_id", str);
        c2241008qG2.LIZ.put("url_path", str2);
        c2241008qG2.LIZ.put("is_final_attempt", Boolean.valueOf(z));
        c2241008qG2.LIZ.put("request_attempt_index", Integer.valueOf(i2));
        c2241008qG2.LIZ.put("status_code", Integer.valueOf(i));
        String str5 = "1";
        if (j3 <= 120000) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c2241008qG2.LIZ.put("launch", obj);
        if (num != null) {
            c2241008qG2.LIZIZ(num, "error_code");
        }
        if (str3.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c2241008qG2.LIZLLL("error_msg", str3);
        }
        if (str4.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            c2241008qG2.LIZLLL("log_id", str4);
        }
        C2241008qG c2241008qG3 = new C2241008qG();
        for (String str6 : map.keySet()) {
            c2241008qG3.LIZLLL(str6, (String) map.get(str6));
        }
        if (map.containsKey("scenario")) {
            c2241008qG2.LIZLLL("scenario", (String) map.get("scenario"));
        }
        try {
            C793770VBv.LJII("pns_api_request", c2241008qG2.LJ(), jSONObjectLJ, c2241008qG3.LJ());
            if (Intrinsics.LJFF(map.get("report_to_tea"), "1")) {
                Pair[] pairArr = new Pair[9];
                pairArr[0] = new Pair("request_id", str);
                pairArr[1] = new Pair("url_path", str2);
                pairArr[2] = new Pair("is_final_attempt", String.valueOf(z));
                pairArr[3] = new Pair("request_attempt_index", String.valueOf(i2));
                pairArr[4] = new Pair("status_code", String.valueOf(i));
                pairArr[5] = new Pair("request_attempt_cost_ms", String.valueOf(j));
                pairArr[6] = new Pair("request_total_cost_ms", String.valueOf(j2));
                pairArr[7] = new Pair("request_time_since_cold_start_ms", String.valueOf(j3));
                if (j3 > 120000) {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[8] = new Pair("launch", str5);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                if (num != null) {
                    mapLJIIJ.put("error_code", num.toString());
                }
                if (str3.length() > 0) {
                    mapLJIIJ.put("error_msg", str3);
                }
                if (str4.length() > 0) {
                    mapLJIIJ.put("log_id", str4);
                }
                C20684815ws.LJIILLIIL("pns_api_request", mapLJIIJ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}

package X;

import android.os.Build;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ulO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716280ulO {
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public final List<String> LJIIIIZZ;
    public final List<String> LJIIIZ;
    public boolean LJIIJ;
    public String LIZ = UUID.randomUUID().toString();
    public String LJFF = CardStruct.IStatusCode.DEFAULT;
    public Map<String, String> LJI = C2097608Jq.LJ();
    public long LJII = System.currentTimeMillis();

    public final Map<String, String> LIZIZ() {
        Pair[] pairArr = new Pair[10];
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        String str2 = this.LIZJ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("previous_page_id", str2);
        pairArr[2] = new Pair("trace_id", this.LIZ);
        pairArr[3] = new Pair("framework", "stellar");
        pairArr[4] = new Pair("country_code", C1717770unn.LJIIIIZZ().getPriorityRegion());
        pairArr[5] = new Pair("device_source", "Android");
        pairArr[6] = new Pair("os_version", Build.VERSION.RELEASE);
        pairArr[7] = new Pair("app_version", C1717770unn.LIZJ().getVersionInfo().LIZ);
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        pairArr[8] = new Pair("device_id", deviceId != null ? deviceId : "");
        pairArr[9] = new Pair("timestamp_collect", String.valueOf(System.currentTimeMillis()));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public C1716280ulO() {
        new LinkedHashMap();
        this.LJIIIIZZ = new ArrayList();
        this.LJIIIZ = new ArrayList();
        this.LJIIJ = true;
    }

    public static Map LIZ(Map map) {
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    public final void LIZJ(String str, Map<String, ? extends Object> map) {
        Object c098200Yq;
        try {
            C1713870uhV.LIZIZ(str, new JSONObject(C2097608Jq.LJIIL(map, LIZIZ())));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public final void LJ(String str, Long l, long j, String str2) {
        String str3;
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_type", "show");
        linkedHashMap.put("interface_return_cost", String.valueOf(j));
        linkedHashMap.put("render_cost", String.valueOf(l));
        linkedHashMap.put("error_code", str);
        if (this.LJIIJ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("first_render", str3);
        this.LJIIJ = false;
        String str4 = this.LJI.get("track_btm_id");
        if (str4 != null) {
            for (Map.Entry entry : BtmSDK.createReportParams$default(BtmSDK.INSTANCE, str4, PageFinder.via(str2), null, 4, null).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                linkedHashMap.put(key, string);
            }
        }
        LIZJ("pipo_page_show", C2097608Jq.LJIIL(this.LJI, linkedHashMap));
    }

    public static void LIZLLL(C1716280ulO c1716280ulO, String str, Long l, Boolean bool, Long l2, Long l3, Long l4, Map map, boolean z, int i) {
        long jLongValue;
        String str2;
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            l3 = null;
        }
        if ((i & 32) != 0) {
            l4 = null;
        }
        if ((i & 64) != 0) {
            map = C2097608Jq.LJ();
        }
        if ((i & 128) != 0) {
            z = false;
        }
        c1716280ulO.getClass();
        if (Intrinsics.LJFF(str, "start_request") && System.currentTimeMillis() - c1716280ulO.LJII > 1500) {
            c1716280ulO.LJII = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c1716280ulO.LJII;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("step", str);
        linkedHashMap.put("time_cost", String.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("step_duration", String.valueOf(jLongValue));
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("first_render", str2);
        }
        if (z) {
            linkedHashMap.put("has_risk", "1");
        }
        if (l2 != null) {
            linkedHashMap.put("inflate_duration", l2.toString());
        }
        if (l3 != null) {
            linkedHashMap.put("bind_duration", l3.toString());
        }
        if (l4 != null) {
            linkedHashMap.put("layout_measurement_duration", l4.toString());
        }
        String str3 = c1716280ulO.LIZLLL;
        if (str3 != null) {
            linkedHashMap.put("page_id", str3);
        }
        c1716280ulO.LIZJ("rd_pipo_stellar_render", C2097608Jq.LJIIL(C2097608Jq.LJIIL(linkedHashMap, c1716280ulO.LJI), map));
    }
}

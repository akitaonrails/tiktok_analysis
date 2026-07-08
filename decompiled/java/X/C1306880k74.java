package X;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS258S0000000_20;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k74, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306880k74 {
    public static int LIZIZ;
    public static int LIZJ;
    public static PthreadTimer LIZLLL;
    public static final C1306880k74 LIZ = new C1306880k74();
    public static final C1339180kxA LJ = new C1339180kxA(2);
    public static final C1339180kxA LJFF = new C1339180kxA(1);

    public static void LIZ() {
        PthreadTimer pthreadTimer;
        if (LIZIZ >= C1306910k77.LIZ().vodUpdateMaxCount) {
            LJ.cancel();
        }
        if (LIZJ >= C1306910k77.LIZ().liveUpdateMaxCount) {
            LJFF.cancel();
        }
        if (LIZIZ < C1306910k77.LIZ().vodUpdateMaxCount || LIZJ < C1306910k77.LIZ().liveUpdateMaxCount || (pthreadTimer = LIZLLL) == null) {
            return;
        }
        pthreadTimer.cancel();
    }

    public static void LIZLLL() {
        List<String> listSingletonList = Collections.singletonList("live");
        Map<String, Object> map = C1306910k77.LIZ().liveRequestParams;
        C1306940k7A.LIZ.LIZ(EnumC1306750k6r.MULTI_MEDIA).LJIIIIZZ(map != null ? new JSONObject(map) : new JSONObject(), listSingletonList, AFwS258S0000000_20.get$arr$(26));
    }

    public static void LJ() {
        List<String> listSingletonList = Collections.singletonList("vod");
        Map<String, Object> map = C1306910k77.LIZ().liveRequestParams;
        C1306940k7A.LIZ.LIZ(EnumC1306750k6r.MULTI_MEDIA).LJIIIIZZ(map != null ? new JSONObject(map) : new JSONObject(), listSingletonList, AFwS258S0000000_20.get$arr$(27));
    }

    public static void LIZIZ(Integer num, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("request_tag", str);
        if (num != null) {
            linkedHashMap.put("error_code", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            linkedHashMap.put("error_msg", str2);
        }
        AppLogNewUtils.onEventV3("startship_fetch_decision_configs_result", new JSONObject(linkedHashMap));
    }

    public static void LIZJ(C1306880k74 c1306880k74, JSONArray jSONArray, Integer num, String str) {
        c1306880k74.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("config_keys", jSONArray.toString());
        if (num != null) {
            linkedHashMap.put("config_count", Integer.valueOf(num.intValue()));
        }
        linkedHashMap.put("request_tag", str);
        linkedHashMap.put("error_code", 0);
        AppLogNewUtils.onEventV3("startship_fetch_decision_configs_result", new JSONObject(linkedHashMap));
    }
}

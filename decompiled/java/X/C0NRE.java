package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NRE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NRE {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public Map<String, String> LIZJ = C2097608Jq.LJ();

    public C0NRE(Map<String, String> map, Map<String, String> map2) {
        this.LIZ = map;
        this.LIZIZ = map2;
    }

    public final void LIZ(String str, Map<String, String> map) {
        for (Map.Entry<String, String> entry : this.LIZ.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, String> entry2 : this.LIZJ.entrySet()) {
            map.put(entry2.getKey(), entry2.getValue());
        }
        try {
            C100C.LIZ.LIZJ().LIZ(str, map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(long j, String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("business", str);
        linkedHashMap.put("style", str2);
        linkedHashMap.put("popup_id", str3);
        linkedHashMap.put("duration", String.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        if (str4 != null && (!a0.LJJJIL(str4))) {
            linkedHashMap.put("action_id", str4);
        }
        LIZ("pns_popup_dismissed", linkedHashMap);
    }
}

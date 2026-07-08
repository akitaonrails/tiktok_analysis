package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780130Uix {
    public static String LIZ() {
        String strJ3 = "";
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String value = LinkMicRtcAbParamsSetting.INSTANCE.getValue();
            Map<String, Object> mapLJ = C2097608Jq.LJ();
            if (C500260Jjc.LJJIJ(value)) {
                try {
                    if (value == null) {
                        value = "";
                    }
                    mapLJ = C2348809Ig.LIZJ(new JSONObject(value));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            linkedHashMap.putAll(mapLJ);
            strJ3 = C786410Ut5.J3(new JSONObject(linkedHashMap));
            return strJ3;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return strJ3;
        }
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestCommonSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsMultiGuestGuestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ucs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776360Ucs {
    public static final C776360Ucs LIZ = new C776360Ucs();

    static {
        new LinkedHashMap();
    }

    public static String LIZ() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map mapLIZIZ = LIZIZ(RtcAbLabelSetting.INSTANCE.getValue());
            Map mapLIZIZ2 = LIZIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
            Map mapLIZIZ3 = LIZIZ(LinkMicRtcAbParamsMultiGuestCommonSetting.INSTANCE.getValue());
            Map mapLIZIZ4 = LIZIZ(LinkMicRtcAbParamsMultiGuestGuestSetting.INSTANCE.getValue());
            linkedHashMap.putAll(mapLIZIZ);
            linkedHashMap.putAll(mapLIZIZ2);
            linkedHashMap.putAll(mapLIZIZ3);
            linkedHashMap.putAll(mapLIZIZ4);
            return C786410Ut5.J3(new JSONObject(linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("generateForMultiGuestGuest failed:");
            sbLIZ.append(th.getMessage());
            C20441214yg.LJ("RtcParamGenerator", C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
    }

    public static Map LIZIZ(String str) {
        Map mapLJ = C2097608Jq.LJ();
        if (C1533950q1J.LJ(str)) {
            try {
                mapLJ = C2348509Id.LIZIZ(new JSONObject(str));
                return mapLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("generateMap failed:");
                sbLIZ.append(th.getMessage());
                C20441214yg.LJ("RtcParamGenerator", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return mapLJ;
    }
}

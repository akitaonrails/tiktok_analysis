package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0K6I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K6I {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Map map, Map map2, Map map3, C0K6H c0k6h) {
        String strLIZIZ;
        if (c0k6h == C0K6H.EVENT_TYPE_TEA_LOG || c0k6h == C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG || c0k6h == C0K6H.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG) {
            if (!u.LJJIIJZLJL(str, "livesdk_", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("livesdk_");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = str;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ(strLIZIZ);
            c474500IjALIZ.LJJIIZI(C500260Jjc.LLD(map));
            c474500IjALIZ.LJJIIZI(C500260Jjc.LLD(map2));
            c474500IjALIZ.LJJIIZI(C500260Jjc.LLD(map3));
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LIZ();
        }
        if (c0k6h == C0K6H.EVENT_TYPE_SLARDAR_LOG || c0k6h == C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG) {
            if (!u.LJJIIJZLJL(str, "ttlive_", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ttlive_");
                sbLIZ2.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            try {
                C1CC2.LIZLLL(str, map, map2, map3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("CommonEventMonitor exception", e);
            }
        }
        C0K6H c0k6h2 = C0K6H.EVENT_TYPE_LIVE_SDK_SLARDAR_LOG;
    }
}

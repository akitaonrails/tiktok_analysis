package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.Map;

/* JADX INFO: renamed from: X.0oRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473560oRu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TTVideoEngine tTVideoEngine) {
        String strLLIZ = null;
        try {
            strLLIZ = C2204961BRm.LLIZ(C786410Ut5.A2(), C0CQT.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yD0EJ4beGbBtQ9pEd6MSGbtBLdTsrdFCoCBjIwxxLU1WoPUtl8Vtv6WA1DyFHqA2OxIQr1r6IXdjO8=", null));
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            C537680L6w.LIZ(C1429810nJL.LIZIZ, "PlayerHelper", "ignore WebView exception", e);
        }
        if (strLLIZ != null && strLLIZ.length() != 0) {
            tTVideoEngine.LJJIII("cookie", strLLIZ);
        }
        Map mapLIZJ = C847400XMc.LIZJ(C0CQT.LIZ);
        if (mapLIZJ != null && (true ^ mapLIZJ.isEmpty())) {
            for (String str : mapLIZJ.keySet()) {
                tTVideoEngine.LJJIII(str, (String) mapLIZJ.get(str));
            }
        }
    }
}

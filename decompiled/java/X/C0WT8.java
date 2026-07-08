package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WT8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WT8 {
    public static void LIZ(String str, String str2, String str3) {
        double dDoubleValue = ((Number) C0B4M.LIZ.getValue()).doubleValue();
        if (dDoubleValue > 0.0d) {
            if (dDoubleValue > 1.0d || ThreadLocalRandom.current().nextDouble() < dDoubleValue) {
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("resource_management_local_event", C2097608Jq.LJIIIIZZ(new Pair("intention_name", str), new Pair("strategy_name", str2), new Pair(FollowStatusChangeMethod.PARAM_UID, str3)));
            }
        }
    }
}

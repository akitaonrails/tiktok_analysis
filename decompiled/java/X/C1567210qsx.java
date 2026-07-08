package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567210qsx {
    public static boolean LIZ(NoticesResult.Notice notice) {
        long currentUserId;
        double dDoubleValue;
        if (notice == null) {
            return false;
        }
        int i = notice.maxViewCount;
        if (i <= 0) {
            return true;
        }
        String str = notice.id;
        long jLongValue = 0;
        if (UserService.getInstance().user() == null) {
            currentUserId = 0;
        } else {
            currentUserId = UserService.getInstance().user().getCurrentUserId();
        }
        Map<String, Double> mapLJ = InterfaceC1106030et7.O5.LIZIZ().get(String.valueOf(currentUserId));
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Double d = mapLJ.get(str);
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        int i2 = notice.dayLimit;
        HashMap map = (HashMap) InterfaceC1106030et7.P5.LIZ();
        if (map == null) {
            map = new HashMap();
        }
        Long l = (Long) map.get(str);
        if (l != null) {
            jLongValue = l.longValue();
        }
        return C1567180qsu.LIZ(new C1567170qst((long) dDoubleValue, i, jLongValue, i2)).LIZ;
    }
}

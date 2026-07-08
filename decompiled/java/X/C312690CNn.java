package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0CNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312690CNn {
    public static boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static boolean LJ;
    public static final C312690CNn LIZ = new C312690CNn();
    public static long LIZIZ = 60000;
    public static final C01GW LJFF = C452501pT.LIZIZ(new C0CLZ());

    public static long LIZ() {
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) LJFF.getValue();
        if (springApiLimitConfig == null) {
            return 60000L;
        }
        try {
            long jLongValue = springApiLimitConfig.getEndTime().longValue() - springApiLimitConfig.getStartTime().longValue();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jLongValue < 0 || jCurrentTimeMillis - springApiLimitConfig.getStartTime().longValue() < 0) {
                return 60000L;
            }
            if (jCurrentTimeMillis - springApiLimitConfig.getEndTime().longValue() > 0) {
                return 60000L;
            }
            try {
                return (long) ((Math.random() * (springApiLimitConfig.getLimitEndTime().longValue() - springApiLimitConfig.getLimitStartTime().longValue())) + springApiLimitConfig.getLimitStartTime().doubleValue());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 60000L;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return 60000L;
        }
    }

    public static boolean LIZIZ(C312690CNn c312690CNn) {
        c312690CNn.getClass();
        if (LIZLLL && !LIZJ) {
            if (!TextUtils.isEmpty("")) {
                C312710CNp c312710CNp = (C312710CNp) ((LinkedHashMap) C312700CNo.LIZ).get("");
                if (c312710CNp != null && c312710CNp.LIZ) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}

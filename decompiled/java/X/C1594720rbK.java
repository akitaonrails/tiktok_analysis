package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;

/* JADX INFO: renamed from: X.0rbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594720rbK {
    public static final C01GW LIZ = C292401Bi.LIZ(new C293670BfB());

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme.getAwemeType() == 101) {
            if (LIZ() > 0 || 1 == aweme.getDeduplicationType()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme, long j) {
        if (aweme == null) {
            return false;
        }
        int iLIZ = LIZ();
        if (iLIZ != 1) {
            if (iLIZ != 2) {
                if (1 != aweme.getDeduplicationType()) {
                    return true;
                }
                if (AwemeBizExtKt.getFilterDuplicateTime(aweme) <= 0 || (SystemClock.uptimeMillis() - AwemeBizExtKt.getFilterDuplicateTime(aweme)) / 1000 >= j) {
                    return false;
                }
                return true;
            }
            long clientAcceptanceTime = AwemeBizExtKt.getClientAcceptanceTime(aweme);
            if (AwemeBizExtKt.getLiveCardShowTime(aweme) <= 0 && AwemeBizExtKt.getLiveCardLeaveTime(aweme) <= 0 && clientAcceptanceTime <= 0) {
                return false;
            }
            long jMax = Math.max(clientAcceptanceTime, Math.max(AwemeBizExtKt.getLiveCardLeaveTime(aweme), AwemeBizExtKt.getLiveCardShowTime(aweme)));
            if ((AwemeBizExtKt.getLiveCardShowTime(aweme) <= 0 || AwemeBizExtKt.getLiveCardLeaveTime(aweme) >= 0) && (System.currentTimeMillis() - jMax) / 1000 >= j) {
                return false;
            }
            return true;
        }
        long clientAcceptanceTime2 = AwemeBizExtKt.getClientAcceptanceTime(aweme);
        if (clientAcceptanceTime2 <= 0 || (System.currentTimeMillis() - clientAcceptanceTime2) / 1000 >= j) {
            return false;
        }
        return true;
    }
}

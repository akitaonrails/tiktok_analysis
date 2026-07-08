package X;

import com.ss.android.ugc.aweme.im.strategy.experiment.StrategyConfigurationConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0ZMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZMZ implements InterfaceC1707406mO {
    public static long LIZIZ(InterfaceC898340ZMa interfaceC898340ZMa) {
        C0ZMY.LIZ.getClass();
        if (((StrategyConfigurationConfig) C0ZMY.LIZJ.getValue()).useLocalTime) {
            return interfaceC898340ZMa.LIZ();
        }
        return interfaceC898340ZMa.LIZIZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1707406mO
    public final Object LIZ(String str, InterfaceC898340ZMa interfaceC898340ZMa) {
        switch (str.hashCode()) {
            case -1603428597:
                if (!str.equals("relative_date_time")) {
                    return null;
                }
                break;
            case -980445194:
                if (!str.equals("absolute_date_time")) {
                    return null;
                }
                break;
            case 502138275:
                if (!str.equals("relative_day_time")) {
                    return null;
                }
                long jLIZIZ = LIZIZ(interfaceC898340ZMa);
                Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT).setTimeInMillis(jLIZIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                return Long.valueOf((r2.get(11) * 60 * 60) + (r2.get(12) * 60) + r2.get(13));
            case 1226862376:
                if (!str.equals("weekday")) {
                    return null;
                }
                long jLIZIZ2 = LIZIZ(interfaceC898340ZMa);
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.ROOT);
                calendar.setTimeInMillis(jLIZIZ2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                int i = 7;
                int i2 = calendar.get(7);
                if (i2 != 1) {
                    i = i2 - 1;
                }
                return Integer.valueOf(i);
            default:
                return null;
        }
        return Long.valueOf(LIZIZ(interfaceC898340ZMa));
    }
}

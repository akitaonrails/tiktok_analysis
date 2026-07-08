package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: X.0IhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473430IhR {
    public static double LIZ = -1.0d;
    public static Boolean LIZIZ;

    public static boolean LIZ(String str, Double d) {
        double dDoubleValue;
        Double d2;
        if (LIZIZ == null) {
            LIZIZ = Boolean.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline());
        }
        Boolean bool = LIZIZ;
        if (bool != null) {
            if (bool.booleanValue()) {
                return true;
            }
            if (LIZ < 0.0d) {
                LIZ = ThreadLocalRandom.current().nextDouble();
            }
            Map<String, Double> map = LiveLogSampleConfigSetting.INSTANCE.getValue().sampleConfigList;
            if (map != null && (d2 = map.get(str)) != null) {
                dDoubleValue = d2.doubleValue();
            } else {
                if (d == null) {
                    return true;
                }
                dDoubleValue = d.doubleValue();
            }
            if (LIZ < dDoubleValue) {
                return true;
            }
            return false;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}

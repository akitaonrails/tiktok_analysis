package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveColdBootApiOptConfig;
import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0CPM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CPM {
    public static String LIZJ;
    public static final C01GW LIZ = C452501pT.LIZIZ(new C0CPN());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0CPL());
    public static final LiveColdBootApiOptConfig LIZLLL = new LiveColdBootApiOptConfig(false, true, 12);

    public static boolean LIZ() {
        C01GW c01gw = LIZIZ;
        if (!((LiveColdBootApiOptConfig) c01gw.getValue()).settingsApiOptEnable) {
            return true;
        }
        long j = ((LiveColdBootApiOptConfig) c01gw.getValue()).settingsApiForceRefreshTimeHours * 24 * 60 * 60;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW c01gw2 = LIZ;
        if (System.currentTimeMillis() - ((Keva) c01gw2.getValue()).getLong("live_seting_api_last_fetch_all_time", 0L) < j) {
            return false;
        }
        ((Keva) c01gw2.getValue()).storeLong("live_seting_api_last_fetch_all_time", jCurrentTimeMillis);
        return true;
    }
}

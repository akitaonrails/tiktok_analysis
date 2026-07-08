package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchOptNtpSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.MatchTimeOptSetting;

/* JADX INFO: renamed from: X.0bT0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974520bT0 {
    public static boolean LIZIZ;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LIZ = Long.MAX_VALUE;
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static long LIZ() {
        return LIZIZ ? (SystemClock.elapsedRealtime() - LJII) + LJI : System.currentTimeMillis();
    }

    public static void LIZIZ(long j, long j2, String str, String str2) {
        long j3 = j + j2;
        if (j3 > 0) {
            if (j2 >= LIZ) {
                LiveMatchOptNtpSettings liveMatchOptNtpSettings = LiveMatchOptNtpSettings.INSTANCE;
                if (!liveMatchOptNtpSettings.enable() || System.currentTimeMillis() - LJFF < liveMatchOptNtpSettings.maxUpdateNetInterval()) {
                    return;
                }
            }
            if (j2 <= MatchTimeOptSetting.INSTANCE.getMatchHalfRttLimit()) {
                LIZ = j2;
                LJI = j3;
                LJ = j;
                LJFF = System.currentTimeMillis();
                LJII = SystemClock.elapsedRealtime();
                LIZIZ = true;
                LIZLLL = str;
                LIZJ = str2;
            }
        }
    }
}

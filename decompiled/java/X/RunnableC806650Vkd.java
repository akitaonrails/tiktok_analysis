package X;

import android.text.TextUtils;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vkd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC806650Vkd implements Runnable {
    public static void LIZ() {
        try {
            String string = Keva.getRepo("RemoveViewNPEChecker").getString("remove_view_point", "");
            if (!TextUtils.isEmpty(string)) {
                Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("RemoveViewNPEChecker", new Throwable(string)), "RemoveViewNPEChecker", (Map<String, String>) null, true);
                C805380Via.LJFF("LaunchProtectException", "RemoveViewNPEChecker", new RuntimeException("RemoveViewNPEChecker", new Throwable(string)));
                Keva.getRepo("RemoveViewNPEChecker").erase("remove_view_point");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            String string2 = Keva.getRepo("BundleTooLargeReporter").getString("bundle_too_large_point", "");
            if (!TextUtils.isEmpty(string2)) {
                Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("BundleTooLargeReporter", new Throwable(string2)), "BundleTooLargeReporter", (Map<String, String>) null, true);
                C805380Via.LJFF("LaunchProtectException", "BundleTooLargeReporter", new RuntimeException("BundleTooLargeReporter", new Throwable(string2)));
                Keva.getRepo("BundleTooLargeReporter").erase("bundle_too_large_point");
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            String string3 = Keva.getRepo("BitmapCrashReporter").getString("bitmap_crash_point", "");
            if (!TextUtils.isEmpty(string3)) {
                Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("BitmapCrashReporter", new Throwable(string3)), "BitmapCrashReporter", (Map<String, String>) null, true);
                C805380Via.LJFF("LaunchProtectException", "BitmapCrashReporter", new RuntimeException("BitmapCrashReporter", new Throwable(string3)));
                Keva.getRepo("BitmapCrashReporter").erase("bitmap_crash_point");
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        try {
            String string4 = Keva.getRepo("FrescoDraweeNpeReporter").getString("fresco_drawee_npe_point", "");
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("FrescoDraweeNpeReporter", new Throwable(string4)), "FrescoDraweeNpeReporter", (Map<String, String>) null, true);
            C805380Via.LJFF("LaunchProtectException", "FrescoDraweeNpeReporter", new RuntimeException("FrescoDraweeNpeReporter", new Throwable(string4)));
            Keva.getRepo("FrescoDraweeNpeReporter").erase("fresco_drawee_npe_point");
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("NpthSecondInitTask@cd2c.reportStabilityException$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NpthSecondInitTask@cd2c.reportStabilityException$1");
    }
}

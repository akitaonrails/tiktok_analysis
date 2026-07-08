package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.bundlechecker.BundleTooLargeChecker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806700Vki {
    public static void LIZ() {
        try {
            BundleTooLargeChecker.monitor(((Boolean) C258790ACf.LIZ.getValue()).booleanValue(), new BundleTooLargeChecker.BundleTooLargeCrashListener() { // from class: X.0Vkf
                @Override // com.bytedance.tt.reliability.monitor.bundlechecker.BundleTooLargeChecker.BundleTooLargeCrashListener
                public final void onCrash(String str) {
                    Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("BundleTooLargeReporter", new Throwable(str)), "BundleTooLargeReporter", (Map<String, String>) null, true);
                    C805380Via.LJFF("LaunchProtectException", "BundleTooLargeReporter", new RuntimeException("BundleTooLargeReporter", new Throwable(str)));
                    Keva.getRepo("BundleTooLargeReporter").storeString("bundle_too_large_point", str);
                    Npth.addTag("bundle_too_large_checker", "true");
                    HashMap map = new HashMap();
                    map.put("BundleTooLargeReporter", str);
                    C806720Vkk c806720Vkk = new C806720Vkk(map);
                    Npth.addAttachUserData(c806720Vkk, CrashType.JAVA);
                    Npth.addAttachUserData(c806720Vkk, CrashType.LAUNCH);
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

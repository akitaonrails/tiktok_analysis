package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vkh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806690Vkh {
    public static void LIZ() {
        try {
            BitmapCrashChecker.monitor(((Boolean) C259260AEa.LIZ.getValue()).booleanValue(), new BitmapCrashChecker.BitmapCrashCheckerListener() { // from class: X.0Vke
                @Override // com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.BitmapCrashCheckerListener
                public final void onCrash(String str) {
                    Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("BitmapCrashReporter", new Throwable(str)), "BitmapCrashReporter", (Map<String, String>) null, true);
                    C805380Via.LJFF("LaunchProtectException", "BitmapCrashReporter", new RuntimeException("BitmapCrashReporter", new Throwable(str)));
                    Keva.getRepo("BitmapCrashReporter").storeString("bitmap_crash_point", str);
                    Npth.addTag("bitmap_crash_checker", "true");
                    HashMap map = new HashMap();
                    map.put("BitmapCrashReporter", str);
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

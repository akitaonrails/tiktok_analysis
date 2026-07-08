package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.FrescoDraweeViewNPEChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vkm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806740Vkm {
    public static void LIZ() {
        try {
            if (((Boolean) C0B58.LIZ.getValue()).booleanValue()) {
                FrescoDraweeViewNPEChecker.monitor(true, new FrescoDraweeViewNPEChecker.DraweeViewNullCheckerListener() { // from class: X.0Vkl
                    @Override // com.bytedance.tt.reliability.monitor.viewchecker.FrescoDraweeViewNPEChecker.DraweeViewNullCheckerListener
                    public final void onCrash(String str) {
                        Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("FrescoDraweeNpeReporter", new Throwable(str)), "FrescoDraweeNpeReporter", (Map<String, String>) null, true);
                        C805380Via.LJFF("LaunchProtectException", "FrescoDraweeNpeReporter", new RuntimeException("FrescoDraweeNpeReporter", new Throwable(str)));
                        Keva.getRepo("FrescoDraweeNpeReporter").storeString("fresco_drawee_npe_point", str);
                        Npth.addTag("fresco_drawee_npe_checker", "true");
                        HashMap map = new HashMap();
                        map.put("FrescoDraweeNpeReporter", str);
                        C806720Vkk c806720Vkk = new C806720Vkk(map);
                        Npth.addAttachUserData(c806720Vkk, CrashType.JAVA);
                        Npth.addAttachUserData(c806720Vkk, CrashType.LAUNCH);
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

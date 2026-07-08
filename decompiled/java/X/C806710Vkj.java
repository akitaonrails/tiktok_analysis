package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806710Vkj {
    public static void LIZ() {
        try {
            RemoveViewCausedNPEChecker.monitor(((Boolean) C0B5A.LIZ.getValue()).booleanValue(), new RemoveViewCausedNPEChecker.ViewRemovedCausedNPEListener() { // from class: X.0Vkg
                @Override // com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.ViewRemovedCausedNPEListener
                public final void onCrash(String str) {
                    Npth.reportBizException("reliability_monitor", (Throwable) new RuntimeException("RemoveViewNPEChecker", new Throwable(str)), "RemoveViewNPEChecker", (Map<String, String>) null, true);
                    C805380Via.LJFF("LaunchProtectException", "RemoveViewNPEChecker", new RuntimeException("RemoveViewNPEChecker", new Throwable(str)));
                    Keva.getRepo("RemoveViewNPEChecker").storeString("remove_view_point", str);
                    Npth.addTag("remove_view_npe_checker", "true");
                    HashMap map = new HashMap();
                    map.put("RemoveViewNPEChecker", str);
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

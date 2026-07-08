package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;

/* JADX INFO: renamed from: X.0jfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289810jfX {
    public volatile InterfaceC1289820jfY LIZ;

    public final void LIZ(String str, String str2) {
        if (str2 != null) {
            try {
                if (this.LIZ == null) {
                    synchronized (this) {
                        try {
                            if (this.LIZ == null) {
                                this.LIZ = (InterfaceC1289820jfY) C1285920jZG.LIZJ().LIZ(InterfaceC1289820jfY.class);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                if (this.LIZ == null) {
                    LynxLog.e("LynxInfoReportHelper", "LynxMonitorService is null");
                } else {
                    this.LIZ.reportCrashGlobalContextTag(str, str2);
                }
            } catch (ClassCastException | NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Report Lynx Crash Context tag failed for LynxServiceCenter ");
                sbLIZ.append(e.getMessage());
                LynxLog.w("LynxInfoReportHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}

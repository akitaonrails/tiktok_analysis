package X;

import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0C46, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C46 {
    public static C0C6R LIZ() {
        if (C0C6R.LJJII == null) {
            synchronized (C0C6R.LJJIIJZLJL) {
                try {
                    if (C0C6R.LJJII == null) {
                        C0C6R.LJJII = new C0C6R();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C0C6R.LJJII;
    }

    public static void LIZIZ(String str, Throwable th) {
        try {
            if (C0C6R.LJJIIJ == null) {
                Keva repoSync = KevaImpl.getRepoSync("abmock_manager", 0);
                C0C6R.LJJIIJ = repoSync;
                int i = 10;
                if (repoSync != null) {
                    i = repoSync.getInt("abmock_error_report_sample", 10);
                }
                C0C6R.LJJIII = i;
            }
            if (AbstractC19994813Le.Default.nextInt(LSPassThroughRecordSizeConfig.DEFAULT) <= C0C6R.LJJIII) {
                Npth.reportBizException("ABMock", th, str, null);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }
}

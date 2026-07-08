package X;

import android.content.Intent;
import android.util.Log;
import androidx.core.app.JobIntentService;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.crash.LaunchProtectService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.Thread;

/* JADX INFO: renamed from: X.0WSu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C823660WSu implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            if (C823670WSv.LJ()) {
                try {
                    if (!Npth.isInit()) {
                        Intent intent = new Intent();
                        intent.putExtra("type", "report_buried");
                        intent.putExtra("stack", Log.getStackTraceString(th));
                        JobIntentService.enqueueWork(C823670WSv.LIZ, (Class<?>) LaunchProtectService.class, LSPassThroughRecordSizeConfig.DEFAULT, intent);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                C823670WSv.LIZIZ(C823670WSv.LIZ, th.toString(), false);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C823670WSv.LJII;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}

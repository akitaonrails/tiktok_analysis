package X;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.0Uto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC786860Uto implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Notification LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ SystemForegroundService LLILZ;

    public final void LIZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.LLILZ.startForeground(this.LL, this.LLILLJJLI, this.LLILLL);
            return;
        }
        SystemForegroundService systemForegroundService = this.LLILZ;
        int i = this.LL;
        Notification notification = this.LLILLJJLI;
        if (C294840Bh4.LIZ() && systemForegroundService != null) {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service info---->:");
            sbLIZ.append(systemForegroundService.getClass().getCanonicalName());
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        }
        systemForegroundService.startForeground(i, notification);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC786860Uto(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.LLILZ = systemForegroundService;
        this.LL = i;
        this.LLILLJJLI = notification;
        this.LLILLL = i2;
    }
}

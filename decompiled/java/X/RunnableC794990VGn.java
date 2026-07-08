package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class RunnableC794990VGn implements Runnable {
    public final C795000VGo LL;
    public final Intent LLILLJJLI;
    public final int LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LL.LIZ(this.LLILLL, this.LLILLJJLI);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC794990VGn(int i, Intent intent, C795000VGo c795000VGo) {
        this.LL = c795000VGo;
        this.LLILLJJLI = intent;
        this.LLILLL = i;
    }
}

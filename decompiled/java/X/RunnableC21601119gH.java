package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19gH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC21601119gH implements Runnable {
    public final /* synthetic */ C21600219g8 LL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.LL.setScrollState(0);
            this.LL.LJJIII();
            this.LL.LLIZ = false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC21601119gH(C21600219g8 c21600219g8) {
        this.LL = c21600219g8;
    }
}

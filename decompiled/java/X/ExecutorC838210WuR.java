package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ExecutorC838210WuR implements Executor {
    public final ThreadLocal<Integer> LL = new ThreadLocal<>();

    public final void LIZ() {
        Integer num = this.LL.get();
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() - 1;
        if (iIntValue == 0) {
            this.LL.remove();
        } else {
            this.LL.set(Integer.valueOf(iIntValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Integer num = this.LL.get();
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() + 1;
        this.LL.set(Integer.valueOf(iIntValue));
        try {
            if (iIntValue <= 15) {
                runnable.run();
            } else {
                C838200WuQ.LIZLLL.LIZ.execute(runnable);
            }
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ();
            throw th;
        }
    }
}

package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import xlp.c;

/* JADX INFO: renamed from: X.0XJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractRunnableC846600XJa implements Runnable {
    public final String LL;

    public abstract void LIZ();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String name = C786410Ut5.u3().getName();
            ThreadMethodProxy.setName(C786410Ut5.u3(), this.LL);
            try {
                LIZ();
                ThreadMethodProxy.setName(C786410Ut5.u3(), name);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ThreadMethodProxy.setName(C786410Ut5.u3(), name);
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (!C2179971ATj.LIZ(th2)) {
                throw th2;
            }
        }
    }

    public AbstractRunnableC846600XJa(String str, Object... objArr) {
        this.LL = c.LJIIJJI(str, objArr);
    }
}

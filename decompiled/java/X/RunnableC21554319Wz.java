package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19Wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC21554319Wz implements Runnable {
    public final /* synthetic */ C21552519Wh LL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C21552519Wh c21552519Wh = this.LL;
            c21552519Wh.LLJILJIL = null;
            c21552519Wh.drawableStateChanged();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC21554319Wz(C21552519Wh c21552519Wh) {
        this.LL = c21552519Wh;
    }
}

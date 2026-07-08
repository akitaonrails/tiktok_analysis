package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13Mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19997913Mj {
    public final Object LIZ = new Object();
    public final C557050Lt1 LIZIZ = new C557050Lt1(false);

    public final void LIZ(Function0<Unit> function0) {
        synchronized (this.LIZ) {
            try {
                this.LIZIZ.LIZJ(true);
                function0.invoke();
                this.LIZ.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

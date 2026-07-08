package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13Mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19999213Mw {
    public final C557050Lt1 LIZ = new C557050Lt1(false);
    public final C19999413My LIZIZ = new C19999413My();

    public final void LIZ(Function0<Unit> function0) {
        this.LIZ.LIZJ(true);
        function0.invoke();
        C19999413My c19999413My = this.LIZIZ;
        synchronized (c19999413My.LIZ) {
            try {
                c19999413My.LIZ.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

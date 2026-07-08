package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: renamed from: X.13TU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13TU {
    public final Queue<C13TW> LIZ = new ArrayDeque();

    public final C13TW LIZ() {
        C13TW c13tw;
        synchronized (this.LIZ) {
            try {
                c13tw = (C13TW) ((ArrayDeque) this.LIZ).poll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c13tw == null ? new C13TW() : c13tw;
    }

    public final void LIZIZ(C13TW c13tw) {
        synchronized (this.LIZ) {
            try {
                if (((ArrayDeque) this.LIZ).size() < 10) {
                    ((ArrayDeque) this.LIZ).offer(c13tw);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

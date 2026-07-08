package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: X.0ozx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1494670ozx {
    public Deque<Long> LIZ = new ArrayDeque();
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public long LJIIIZ = -1;
    public long LJIIJ = -1;

    public final long LIZ() {
        try {
            return System.nanoTime() - ((Long) ((ArrayDeque) this.LIZ).pop()).longValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    public final void LIZIZ() {
        this.LIZ.push(Long.valueOf(System.nanoTime()));
    }
}

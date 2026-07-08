package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0MSN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSN {
    public final String LIZ;
    public final C0L9K LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;
    public final AtomicBoolean LJFF = new AtomicBoolean(false);
    public final Set<WeakReference<C0MSH>> LJI = new CopyOnWriteArraySet();

    public C0MSN(C0MSD c0msd) {
        this.LIZ = c0msd.LIZ;
        this.LIZIZ = c0msd.LIZIZ;
    }

    public final void LIZ(C0MSD c0msd) {
        if (c0msd == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LJFF.get()) {
                    c0msd.LIZLLL = this.LIZJ;
                    c0msd.LJ = this.LIZLLL;
                    c0msd.LJFF = this.LJ;
                    c0msd.LIZ();
                    return;
                }
                ((CopyOnWriteArraySet) this.LJI).add(new WeakReference(c0msd));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

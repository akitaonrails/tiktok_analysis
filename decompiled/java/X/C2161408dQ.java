package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.08dQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2161408dQ {
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock(false);
    public final Map<String, C2161508dR> LIZIZ = new HashMap();
    public final AtomicInteger LIZJ = new AtomicInteger();

    public C2161408dQ() {
        new ArrayList();
    }

    public final void LIZ(int i, int i2, int i3, int i4, int i5, String str) {
        C2161508dR c2161508dR = (C2161508dR) ((HashMap) this.LIZIZ).get(str);
        if (c2161508dR == null) {
            if (((HashMap) this.LIZIZ).size() >= 256) {
                this.LIZJ.incrementAndGet();
                return;
            } else {
                c2161508dR = new C2161508dR(i, i3, i4, i5, str);
                ((HashMap) this.LIZIZ).put(str, c2161508dR);
            }
        }
        if (!c2161508dR.LIZ(i2)) {
            this.LIZJ.incrementAndGet();
        }
    }

    public final void LIZIZ(int i, int i2, int i3, int i4, int i5, String str) {
        this.LIZ.readLock().lock();
        try {
            C2161508dR c2161508dR = (C2161508dR) ((HashMap) this.LIZIZ).get(str);
            if (c2161508dR == null) {
                this.LIZ.readLock().unlock();
                this.LIZ.writeLock().lock();
                try {
                    LIZ(i, i2, i3, i4, i5, str);
                    this.LIZ.writeLock().unlock();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.writeLock().unlock();
                    throw th;
                }
            }
            if (!c2161508dR.LIZ(i2)) {
                this.LIZJ.incrementAndGet();
            }
            this.LIZ.readLock().unlock();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LIZ.readLock().unlock();
            throw th2;
        }
    }
}

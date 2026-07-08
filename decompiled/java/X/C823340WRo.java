package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0WRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823340WRo {
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public final Map<String, C0WR6> LIZIZ = new LinkedHashMap();

    public final void LIZ(String str, C0WR6 c0wr6) {
        ReentrantReadWriteLock.WriteLock writeLock = this.LIZ.writeLock();
        writeLock.lock();
        try {
            this.LIZIZ.put(str, c0wr6);
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            writeLock.unlock();
            throw th;
        }
    }
}

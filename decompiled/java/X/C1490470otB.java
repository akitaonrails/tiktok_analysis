package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0otB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490470otB {
    public final WeakHashMap<Activity, ConcurrentHashMap<Integer, String>> LIZ = new WeakHashMap<>();
    public final ReadWriteLock LIZIZ = new ReentrantReadWriteLock();

    public final ConcurrentHashMap<Integer, String> LIZ(Activity activity) {
        ((ReentrantReadWriteLock) this.LIZIZ).readLock().lock();
        try {
            ConcurrentHashMap<Integer, String> concurrentHashMap = this.LIZ.get(activity);
            ((ReentrantReadWriteLock) this.LIZIZ).readLock().unlock();
            return concurrentHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZIZ).readLock().unlock();
            throw th;
        }
    }

    public final void LIZIZ(Activity activity, ConcurrentHashMap<Integer, String> concurrentHashMap) {
        ((ReentrantReadWriteLock) this.LIZIZ).writeLock().lock();
        try {
            this.LIZ.put(activity, concurrentHashMap);
            ((ReentrantReadWriteLock) this.LIZIZ).writeLock().unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantReadWriteLock) this.LIZIZ).writeLock().unlock();
            throw th;
        }
    }
}

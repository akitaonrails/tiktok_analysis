package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0WPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822920WPy {
    public static int LIZIZ;
    public static boolean LJ;
    public static boolean LJFF;
    public static final HashMap<Integer, String> LIZ = new HashMap<>();
    public static final LinkedHashSet<InterfaceC822930WPz> LIZJ = new LinkedHashSet<>();
    public static final ReentrantReadWriteLock LIZLLL = new ReentrantReadWriteLock();
    public static final C822910WPx LJI = new AbstractC813150Vv7() { // from class: X.0WPx
        @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C822920WPy.LIZ(activity);
        }

        @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C822920WPy.LIZIZ(activity);
        }

        @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C822920WPy.LIZIZ(activity);
        }

        @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C822920WPy.LIZ(activity);
        }

        @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C822920WPy.LIZIZ(activity);
        }
    };

    public static long LIZJ() {
        C0WQ0 c0wq0LIZIZ = C822900WPw.LIZIZ();
        if (c0wq0LIZIZ.LIZIZ) {
            return -1L;
        }
        return SystemClock.elapsedRealtime() - c0wq0LIZIZ.LIZJ;
    }

    public static void LIZ(Activity activity) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = LIZLLL;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i = 0; i < readHoldCount; i++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            HashMap<Integer, String> map = LIZ;
            map.remove(Integer.valueOf(activity.hashCode()));
            boolean z = !map.isEmpty();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.lock();
            }
            writeLock.unlock();
            if (!z && LJ) {
                C822900WPw.LIZLLL(false);
                Iterator<InterfaceC822930WPz> it2 = LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
                LJ = false;
            }
            if (!C822900WPw.LIZIZ().LIZIZ && LJFF) {
                Iterator<InterfaceC822930WPz> it3 = LIZJ.iterator();
                while (it3.hasNext()) {
                    it3.next().onAppBackground();
                }
                LJFF = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            for (int i3 = 0; i3 < readHoldCount; i3++) {
                lock.lock();
            }
            writeLock.unlock();
            throw th;
        }
    }

    public static void LIZIZ(Activity activity) {
        int readHoldCount;
        int iHashCode = activity.hashCode();
        if (LIZIZ == iHashCode && LJ) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = LIZLLL;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZ.put(Integer.valueOf(iHashCode), activity.getClass().getName());
            LIZIZ = iHashCode;
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            if (!LJ) {
                C822900WPw.LIZLLL(true);
                Iterator<InterfaceC822930WPz> it2 = LIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
                LJ = true;
            }
            if (!LJFF) {
                Iterator<InterfaceC822930WPz> it3 = LIZJ.iterator();
                while (it3.hasNext()) {
                    it3.next().onAppForeground();
                }
                LJFF = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public static boolean LIZLLL(long j) {
        C0WQ0 c0wq0LIZIZ = C822900WPw.LIZIZ();
        if (!c0wq0LIZIZ.LIZIZ && SystemClock.elapsedRealtime() - c0wq0LIZIZ.LIZJ >= j) {
            return true;
        }
        return false;
    }

    public static void LJ(InterfaceC822930WPz interfaceC822930WPz) {
        LinkedHashSet<InterfaceC822930WPz> linkedHashSet = LIZJ;
        synchronized (linkedHashSet) {
            try {
                linkedHashSet.add(interfaceC822930WPz);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

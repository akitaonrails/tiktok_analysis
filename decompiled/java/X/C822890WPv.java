package X;

import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822890WPv {
    public static final C822890WPv LIZ = new C822890WPv();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static boolean LIZLLL = true;
    public static final Set<C0WQ1> LJ = Collections.newSetFromMap(new ConcurrentHashMap());

    static {
        HashMap<Integer, String> map = C822920WPy.LIZ;
        C822910WPx c822910WPx = C822920WPy.LJI;
        if (c822910WPx != null) {
            C813120Vv4.LIZ.add(c822910WPx);
        }
        C813120Vv4.LIZ.add(C813180VvA.LIZ);
    }

    public static final String LIZ() {
        String str;
        String str2;
        HashMap<Integer, String> map = C822920WPy.LIZ;
        try {
            ReentrantReadWriteLock.ReadLock lock = C822920WPy.LIZLLL.readLock();
            lock.lock();
            try {
                str = C822920WPy.LIZ.get(Integer.valueOf(C822920WPy.LIZIZ));
                lock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            str = null;
        }
        if (str != null && !Intrinsics.LJFF("null", str)) {
            return str;
        }
        C240300wL c240300wL = C813120Vv4.LIZIZ;
        return (c240300wL == null || (str2 = c240300wL.LIZJ) == null) ? "null" : str2;
    }

    public static final void LIZJ(C0WQ1 c0wq1) {
        Object c098200Yq;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (LIZJ.get()) {
            c0wq1.LIZ();
            return;
        }
        c098200Yq = Boolean.valueOf(LJ.add(c0wq1));
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZJ("registerInitCallback error", "ensure_not_reach_here", thM5exceptionOrNullimpl);
        }
    }

    public static final void LIZIZ(Application application, ExecutorC822880WPu executorC822880WPu) {
        boolean z;
        if (LIZIZ.get()) {
            return;
        }
        synchronized (LIZ) {
            try {
                application.registerActivityLifecycleCallbacks(new AbstractC813150Vv7() { // from class: X.0Vv5
                    @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        if (Build.VERSION.SDK_INT < 29) {
                            C813120Vv4.LIZIZ(activity);
                        }
                    }

                    @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        if (Build.VERSION.SDK_INT < 29) {
                            C813120Vv4.LIZJ(activity);
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostDestroyed(Activity activity) {
                        C813120Vv4.LIZIZ(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostPaused(Activity activity) {
                        C813120Vv4.LIZJ(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPostStopped(Activity activity) {
                        C813120Vv4.LJFF(activity);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPreResumed(Activity activity) {
                        if (C2345409Gy.LIZ()) {
                            C2345409Gy.LIZIZ(new RunnableC2345109Gv(0, activity, this));
                        } else {
                            C813120Vv4.LIZLLL(activity);
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPreStarted(Activity activity) {
                        C813120Vv4.LJ(activity);
                    }

                    @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        C813120Vv4.LIZLLL(activity);
                    }

                    @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        C813120Vv4.LJ(activity);
                    }

                    @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        if (Build.VERSION.SDK_INT < 29) {
                            C813120Vv4.LJFF(activity);
                        }
                    }

                    @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        C813120Vv4.LIZ(activity, bundle);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
                        C813120Vv4.LIZ(activity, bundle);
                    }
                });
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                runningAppProcessInfo.importance = 100;
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                if (runningAppProcessInfo.importance <= 100) {
                    z = true;
                } else {
                    z = false;
                }
                LIZLLL = z;
                MappedByteBuffer mappedByteBuffer = C822900WPw.LIZ;
                C822900WPw.LIZLLL = LIZLLL;
                executorC822880WPu.execute(new ARunnableS113S0100000_13(application, 195));
                LIZIZ.set(true);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}

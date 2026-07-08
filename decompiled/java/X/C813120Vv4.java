package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813120Vv4 {
    public static final Set<Application.ActivityLifecycleCallbacks> LIZ = Collections.newSetFromMap(new ConcurrentHashMap());
    public static C240300wL LIZIZ;

    public static void LIZIZ(Activity activity) {
        C240300wL c240300wL = new C240300wL(activity, Lifecycle.Event.ON_DESTROY);
        if (Intrinsics.LJFF(c240300wL, LIZIZ)) {
            return;
        }
        LIZIZ = c240300wL;
        Iterator<T> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                ((Application.ActivityLifecycleCallbacks) it2.next()).onActivityDestroyed(activity);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZJ(Activity activity) {
        C240300wL c240300wL = new C240300wL(activity, Lifecycle.Event.ON_PAUSE);
        if (Intrinsics.LJFF(c240300wL, LIZIZ)) {
            return;
        }
        LIZIZ = c240300wL;
        Iterator<T> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                ((Application.ActivityLifecycleCallbacks) it2.next()).onActivityPaused(activity);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZLLL(Activity activity) {
        new WeakReference(activity);
        C240300wL c240300wL = new C240300wL(activity, Lifecycle.Event.ON_RESUME);
        if (Intrinsics.LJFF(c240300wL, LIZIZ)) {
            return;
        }
        LIZIZ = c240300wL;
        Iterator<T> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                ((Application.ActivityLifecycleCallbacks) it2.next()).onActivityResumed(activity);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LJ(Activity activity) {
        C240300wL c240300wL = new C240300wL(activity, Lifecycle.Event.ON_START);
        if (Intrinsics.LJFF(c240300wL, LIZIZ)) {
            return;
        }
        LIZIZ = c240300wL;
        Iterator<T> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                ((Application.ActivityLifecycleCallbacks) it2.next()).onActivityStarted(activity);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LJFF(Activity activity) {
        C240300wL c240300wL = new C240300wL(activity, Lifecycle.Event.ON_STOP);
        if (Intrinsics.LJFF(c240300wL, LIZIZ)) {
            return;
        }
        LIZIZ = c240300wL;
        Iterator<T> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                ((Application.ActivityLifecycleCallbacks) it2.next()).onActivityStopped(activity);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZ(Activity activity, Bundle bundle) {
        C240300wL c240300wL = new C240300wL(activity, Lifecycle.Event.ON_CREATE);
        if (Intrinsics.LJFF(c240300wL, LIZIZ)) {
            return;
        }
        LIZIZ = c240300wL;
        Iterator<T> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            try {
                ((Application.ActivityLifecycleCallbacks) it2.next()).onActivityCreated(activity, bundle);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}

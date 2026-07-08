package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0VYX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYX implements Application.ActivityLifecycleCallbacks {
    public C800390VaX LL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C0VYX(C800390VaX c800390VaX) {
        this.LL = c800390VaX;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object c098200Yq;
        if (this.LL.LIZ) {
            try {
                String canonicalName = activity.getClass().getCanonicalName();
                if (canonicalName != null) {
                    List<C0VZI> list = C0VZH.LIZIZ.get(canonicalName);
                    if (list != null) {
                        synchronized (list) {
                            try {
                                if (!list.isEmpty()) {
                                    list.remove(list.size() - 1);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    C0VYW.LIZ.getClass();
                    C0VYW.LIZ(canonicalName);
                    C0VYY.LIZIZ(canonicalName, String.valueOf(activity.hashCode()));
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("message", "activity_scene_monitor_onActivityDestroyed_error");
                String canonicalName2 = activity.getClass().getCanonicalName();
                if (canonicalName2 == null) {
                    canonicalName2 = "null";
                }
                pairArr[1] = new Pair("activity", canonicalName2);
                C0VZK.LIZ(thM5exceptionOrNullimpl, "activity_scene_monitor_onActivityDestroyed_error", C2097608Jq.LJIIJ(pairArr));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object c098200Yq;
        if (this.LL.LIZ) {
            try {
                C0VZH.LIZIZ(activity.getClass().getCanonicalName());
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                Pair[] pairArr = new Pair[1];
                String canonicalName = activity.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = "null";
                }
                pairArr[0] = new Pair("activity", canonicalName);
                C0VZK.LIZ(thM5exceptionOrNullimpl, "activity_scene_monitor_onActivityResumed_error", C2097608Jq.LJIIJ(pairArr));
            }
        }
    }
}

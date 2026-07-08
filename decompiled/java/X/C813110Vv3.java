package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/* JADX INFO: renamed from: X.0Vv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813110Vv3 extends Observable implements Application.ActivityLifecycleCallbacks, WeakHandler.IHandler {
    public static C813110Vv3 LLILZLL = null;
    public static int LLIZ = 0;
    public static boolean LLIZLLLIL = true;
    public WeakReference<Activity> LL;
    public boolean LLILLJJLI;
    public final RunnableC810870VrR LLILLL = new Runnable() { // from class: X.0VrR
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("ActivityLifecycleObserver@d159.<field>$1");
            try {
                C813110Vv3 c813110Vv3 = this.LL;
                if (c813110Vv3.LLILLJJLI) {
                    c813110Vv3.LLILLJJLI = false;
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("ActivityLifecycleObserver@d159.<field>$1");
        }
    };
    public final WeakHandler LLILZ = new WeakHandler(this);
    public final List<Application.ActivityLifecycleCallbacks> LLILZIL = new ArrayList();

    public static synchronized C813110Vv3 LIZJ() {
        if (LLILZLL == null) {
            LLILZLL = new C813110Vv3();
        }
        return LLILZLL;
    }

    public final Object[] LIZ() {
        Object[] array;
        synchronized (this.LLILZIL) {
            try {
                array = ((ArrayList) this.LLILZIL).size() > 0 ? ((ArrayList) this.LLILZIL).toArray() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return array;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message.what == 1 && LLIZLLLIL) {
            setChanged();
            notifyObservers(Boolean.valueOf(LLIZLLLIL));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArrLIZ = LIZ();
        if (objArrLIZ != null) {
            for (Object obj : objArrLIZ) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.LLILLJJLI) {
            this.LLILZ.postDelayed(this.LLILLL, 30000L);
        }
        Object[] objArrLIZ = LIZ();
        if (objArrLIZ != null) {
            for (Object obj : objArrLIZ) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.LL = new WeakReference<>(activity);
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
        }
        this.LLILZ.removeCallbacks(this.LLILLL);
        Object[] objArrLIZ = LIZ();
        if (objArrLIZ != null) {
            for (Object obj : objArrLIZ) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Object[] objArrLIZ = LIZ();
        if (objArrLIZ != null) {
            for (Object obj : objArrLIZ) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        this.LLILZ.removeMessages(1);
        int i = LLIZ;
        if (i == 0) {
            LLIZLLLIL = false;
        }
        LLIZ = i + 1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Object[] objArrLIZ = LIZ();
        if (objArrLIZ != null) {
            for (Object obj : objArrLIZ) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        int i = LLIZ - 1;
        LLIZ = i;
        if (i == 0) {
            LLIZLLLIL = true;
            this.LLILZ.sendEmptyMessageDelayed(1, 30000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        LLIZLLLIL = false;
        Object[] objArrLIZ = LIZ();
        if (objArrLIZ != null) {
            for (Object obj : objArrLIZ) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArrLIZ = LIZ();
        if (objArrLIZ != null) {
            for (Object obj : objArrLIZ) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }
}

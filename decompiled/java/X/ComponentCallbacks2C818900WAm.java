package X;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0WAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ComponentCallbacks2C818900WAm implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final ComponentCallbacks2C818900WAm LLILZIL = new ComponentCallbacks2C818900WAm();
    public final AtomicBoolean LL = new AtomicBoolean();
    public final AtomicBoolean LLILLJJLI = new AtomicBoolean();
    public final ArrayList LLILLL = new ArrayList();
    public boolean LLILZ = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    public static void LIZJ(Application application) {
        ComponentCallbacks2C818900WAm componentCallbacks2C818900WAm = LLILZIL;
        synchronized (componentCallbacks2C818900WAm) {
            try {
                if (!componentCallbacks2C818900WAm.LLILZ) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C818900WAm);
                    C786410Ut5.u4(application, componentCallbacks2C818900WAm);
                    componentCallbacks2C818900WAm.LLILZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ(C0WB1 c0wb1) {
        synchronized (LLILZIL) {
            try {
                this.LLILLL.add(c0wb1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(boolean z) {
        synchronized (LLILZIL) {
            try {
                Iterator it2 = this.LLILLL.iterator();
                while (it2.hasNext()) {
                    ((C0WB1) it2.next()).LIZ(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.LL.compareAndSet(true, false);
        this.LLILLJJLI.set(true);
        if (zCompareAndSet) {
            LIZLLL(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.LL.compareAndSet(false, true)) {
            this.LLILLJJLI.set(true);
            LIZLLL(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.LL.compareAndSet(true, false);
        this.LLILLJJLI.set(true);
        if (zCompareAndSet) {
            LIZLLL(false);
        }
    }
}

package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0V7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792680V7q implements Application.ActivityLifecycleCallbacks, C0V7R {
    public final ArrayList<InterfaceC792690V7r> LL = new ArrayList<>();
    public WeakReference<Activity> LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public volatile boolean LLILZIL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // X.C0V7R
    public final String LIZLLL() {
        Activity activity;
        WeakReference<Activity> weakReference = this.LLILLJJLI;
        return (weakReference == null || (activity = weakReference.get()) == null) ? "" : activity.getClass().getCanonicalName();
    }

    public final Object[] LJ() {
        Object[] array;
        synchronized (this.LL) {
            try {
                array = this.LL.size() > 0 ? this.LL.toArray() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return array == null ? new Object[0] : array;
    }

    public C792680V7q() {
        Application application = C792190V5t.LIZIZ;
        application.unregisterActivityLifecycleCallbacks(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // X.C0V7R
    public final boolean isForeground() {
        return this.LLILZIL;
    }

    @Override // X.C0V7R
    public final void LIZ(InterfaceC792690V7r interfaceC792690V7r) {
        if (interfaceC792690V7r == null) {
            return;
        }
        synchronized (this.LL) {
            try {
                this.LL.add(interfaceC792690V7r);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0V7R
    public final void LIZJ(C0V7O c0v7o) {
        if (c0v7o == null) {
            return;
        }
        synchronized (this.LL) {
            try {
                this.LL.remove(c0v7o);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        for (Object obj : LJ()) {
            ((InterfaceC792690V7r) obj).LIZJ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.LLILLJJLI = new WeakReference<>(activity);
        for (Object obj : LJ()) {
            ((InterfaceC792690V7r) obj).LJ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        for (Object obj : LJ()) {
            ((InterfaceC792690V7r) obj).LIZIZ();
        }
        if (this.LLILLL) {
            this.LLILLL = false;
            return;
        }
        int i = this.LLILZ + 1;
        this.LLILZ = i;
        if (i == 1) {
            this.LLILZIL = true;
            for (Object obj2 : LJ()) {
                ((InterfaceC792690V7r) obj2).LIZLLL();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.LLILLL = true;
            return;
        }
        int i = this.LLILZ - 1;
        this.LLILZ = i;
        if (i == 0) {
            this.LLILZIL = false;
            for (Object obj : LJ()) {
                ((InterfaceC792690V7r) obj).onBackground();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : LJ()) {
            ((InterfaceC792690V7r) obj).LIZ();
        }
    }
}

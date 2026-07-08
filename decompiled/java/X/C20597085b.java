package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.085b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20597085b implements Application.ActivityLifecycleCallbacks {
    public Field LL;
    public Field LLILLJJLI;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AnonymousClass0892.LIZ("ViewRootImplHandlerHook", "onActivityStarted！");
        if (this.LL == null) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            decorView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2499909qv(decorView, this, 3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

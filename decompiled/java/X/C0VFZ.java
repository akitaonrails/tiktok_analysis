package X;

import Y.ACallableS420S0100000_13;
import Y.ARunnableS113S0100000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.power.scene.SceneGenerator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VFZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VFZ implements Application.ActivityLifecycleCallbacks {
    public Context LL;
    public int LLILLJJLI;
    public boolean LLILLL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C15O7.LIZIZ(new ACallableS420S0100000_13(activity, 15), C20684815ws.LJFF(), null);
        this.LLILLL = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C15O7.LIZIZ(new ACallableS420S0100000_13(activity, 16), C20684815ws.LJFF(), null);
        this.LLILLL = true;
        Context contextL3 = C786410Ut5.L3(activity);
        if (this.LL == null && contextL3 != null) {
            this.LL = contextL3;
            C823050WQl.LJ().scheduleAtFixedRate(new ARunnableS113S0100000_13(this, 285), 300L, 300L, TimeUnit.SECONDS);
        }
        SceneGenerator.LIZIZ().LJFF(activity.getClass().getName());
    }
}

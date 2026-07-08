package X;

import Y.ARunnableS81S0200000_12;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T6X, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T6X implements Application.ActivityLifecycleCallbacks {
    public static boolean LLILZIL = true;
    public static boolean LLILZLL;
    public static final Map<String, Object> LLIZ = new ConcurrentHashMap();
    public C0T6Y LL;
    public long LLILLL;
    public int LLILLJJLI = 1;
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());

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
        C0T6Y c0t6y = this.LL;
        if (c0t6y != null) {
            c0t6y.LIZ();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (LLILZLL) {
            C786410Ut5.LJJZZIII(this.LLILZ, new ARunnableS81S0200000_12(activity, this, 119));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i;
        if (LLILZIL) {
            this.LLILLL = System.currentTimeMillis();
            if (LLILZIL) {
                i = 1;
            } else {
                i = 2;
            }
            this.LLILLJJLI = i;
            LLILZIL = false;
            LLILZLL = true;
        }
    }
}

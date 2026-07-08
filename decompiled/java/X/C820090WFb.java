package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;

/* JADX INFO: renamed from: X.0WFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820090WFb implements Application.ActivityLifecycleCallbacks {
    public static final WeakHandler LLILZ = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() { // from class: X.0WFc
        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
        }
    });
    public boolean LL;
    public InterfaceC820110WFd LLILLJJLI;
    public final RunnableC820080WFa LLILLL = new Runnable() { // from class: X.0WFa
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("LifeCycleMonitor@f0a4.<field>$2");
            try {
                Logger.debug();
                C820090WFb c820090WFb = this.LL;
                if (c820090WFb.LL) {
                    c820090WFb.LL = false;
                    InterfaceC820110WFd interfaceC820110WFd = c820090WFb.LLILLJJLI;
                    if (interfaceC820110WFd != null) {
                        interfaceC820110WFd.LIZIZ();
                    }
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("LifeCycleMonitor@f0a4.<field>$2");
        }
    };

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
        if (this.LL) {
            LLILZ.postDelayed(this.LLILLL, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (!this.LL) {
            this.LL = true;
            InterfaceC820110WFd interfaceC820110WFd = this.LLILLJJLI;
            if (interfaceC820110WFd != null) {
                interfaceC820110WFd.LIZ();
            }
        }
        Logger.debug();
        LLILZ.removeCallbacks(this.LLILLL);
    }
}

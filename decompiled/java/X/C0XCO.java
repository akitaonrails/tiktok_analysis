package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0XCO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCO implements Application.ActivityLifecycleCallbacks, C0XD7 {
    public int LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public C0XDC LLILZ;

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
        int i = this.LL - 1;
        this.LL = i;
        if (i <= 0) {
            this.LLILLJJLI = false;
            if (i < 0) {
                this.LL = 0;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.LL < 0) {
            this.LL = 0;
        }
        int i = this.LL;
        if (i == 0) {
            this.LLILLJJLI = true;
        }
        this.LL = i + 1;
        this.LLILLL = true;
        C0XDC c0xdc = this.LLILZ;
        if (c0xdc != null) {
            C844880XCk c844880XCk = (C844880XCk) c0xdc;
            ((C0XCO) c844880XCk.LIZIZ.LLILZ).LLILZ = null;
            C844830XCf.LIZ("dispatcher#active onResume");
            C824170WUt.LJ(c844880XCk.LIZ, c844880XCk.LIZIZ.LL.LIZ());
        }
    }
}

package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: X.1BUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2205671BUf implements Application.ActivityLifecycleCallbacks {
    public boolean LL;
    public boolean LLILLJJLI;
    public InterfaceC2205761BUo LLILLL;

    public void LIZJ(boolean z) {
    }

    public boolean LIZLLL() {
        return false;
    }

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

    public final boolean LIZ() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || LIZLLL();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            if (this.LL) {
                LIZJ(true);
                InterfaceC2205761BUo interfaceC2205761BUo = this.LLILLL;
                if (interfaceC2205761BUo != null) {
                    interfaceC2205761BUo.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean zLIZ = LIZ();
        if (this.LLILLJJLI != zLIZ) {
            this.LLILLJJLI = zLIZ;
            if (this.LL) {
                LIZJ(zLIZ);
                InterfaceC2205761BUo interfaceC2205761BUo = this.LLILLL;
                if (interfaceC2205761BUo != null) {
                    interfaceC2205761BUo.a(zLIZ);
                }
            }
        }
    }
}

package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474960oUA {
    public final List<InterfaceC1474980oUC> LIZ = new CopyOnWriteArrayList();
    public int LIZIZ = 0;

    public C1474960oUA(Application application) {
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0oUB
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LL.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1474980oUC) it2.next()).LLLZLL();
                }
                C1474960oUA c1474960oUA = this.LL;
                if (c1474960oUA.LIZIZ == 0) {
                    Iterator it3 = ((CopyOnWriteArrayList) c1474960oUA.LIZ).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC1474980oUC) it3.next()).LIZJ();
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LL.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1474980oUC) it2.next()).LIZLLL();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LL.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1474980oUC) it2.next()).LJ();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                C1474960oUA c1474960oUA = this.LL;
                int i = c1474960oUA.LIZIZ + 1;
                c1474960oUA.LIZIZ = i;
                if (i == 1) {
                    Iterator it2 = ((CopyOnWriteArrayList) c1474960oUA.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1474980oUC) it2.next()).LJFF(false);
                    }
                }
                Iterator it3 = ((CopyOnWriteArrayList) this.LL.LIZ).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1474980oUC) it3.next()).LIZIZ();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                C1474960oUA c1474960oUA = this.LL;
                int i = c1474960oUA.LIZIZ - 1;
                c1474960oUA.LIZIZ = i;
                if (i == 0) {
                    Iterator it2 = ((CopyOnWriteArrayList) c1474960oUA.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1474980oUC) it2.next()).LJFF(true);
                    }
                }
                Iterator it3 = ((CopyOnWriteArrayList) this.LL.LIZ).iterator();
                while (it3.hasNext()) {
                    ((InterfaceC1474980oUC) it3.next()).LLLZL();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                Iterator it2 = ((CopyOnWriteArrayList) this.LL.LIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1474980oUC) it2.next()).LIZ();
                }
            }
        });
    }
}

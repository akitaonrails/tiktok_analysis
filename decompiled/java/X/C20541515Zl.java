package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.pns.timer.observer.AppLifeCycleObserver;

/* JADX INFO: renamed from: X.15Zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20541515Zl {
    public static void LIZ(final InterfaceC20541615Zm interfaceC20541615Zm) {
        Lifecycle lifecycle = ProcessLifecycleOwner.Companion.get().getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            lifecycle.addObserver(new AppLifeCycleObserver(interfaceC20541615Zm));
            return;
        }
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke instanceof Application) {
                Application application = (Application) objInvoke;
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.15Zk
                        public int LL = 1;

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
                        public final void onActivityStarted(Activity activity) {
                            int i = this.LL + 1;
                            this.LL = i;
                            if (i == 1) {
                                interfaceC20541615Zm.LIZ();
                            }
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                            int i = this.LL - 1;
                            this.LL = i;
                            if (i == 0) {
                                interfaceC20541615Zm.LIZIZ();
                            }
                        }
                    });
                    interfaceC20541615Zm.LIZ();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

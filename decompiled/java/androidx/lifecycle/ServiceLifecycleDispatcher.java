package androidx.lifecycle;

import X.C2179971ATj;
import X.C786410Ut5;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class ServiceLifecycleDispatcher {
    public final Handler handler = new Handler();
    public DispatchRunnable lastDispatchRunnable;
    public final LifecycleRegistry registry;

    public static final class DispatchRunnable implements Runnable {
        public final Lifecycle.Event event;
        public final LifecycleRegistry registry;
        public boolean wasExecuted;

        @Override // java.lang.Runnable
        public void run() {
            androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable__run$___twin___() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.handleLifecycleEvent(this.event);
            this.wasExecuted = true;
        }

        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        public static void androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(DispatchRunnable dispatchRunnable) {
            try {
                dispatchRunnable.androidx_lifecycle_ServiceLifecycleDispatcher$DispatchRunnable__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            this.registry = lifecycleRegistry;
            this.event = event;
        }
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
        this.registry = new LifecycleRegistry(lifecycleOwner);
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        C786410Ut5.LJL(this.handler, dispatchRunnable2);
    }
}

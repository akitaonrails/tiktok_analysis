package androidx.lifecycle;

import X.C786410Ut5;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleDispatcher {
    public static final LifecycleDispatcher INSTANCE = new LifecycleDispatcher();
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    public static final void init(Context context) {
        if (initialized.getAndSet(true)) {
            return;
        }
        ((Application) C786410Ut5.N3(context)).registerActivityLifecycleCallbacks(new DispatcherActivityCallback());
    }

    /* JADX INFO: loaded from: classes33.dex */
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.Companion.injectIfNeededIn(activity);
        }
    }
}

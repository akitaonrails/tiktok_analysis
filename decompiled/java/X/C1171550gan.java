package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gan, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171550gan implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ C1171960gbS LLILLJJLI;
    public final /* synthetic */ C1171530gal LLILLL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (Intrinsics.LJFF(activity, this.LL)) {
            this.LLILLJJLI.LIZJ();
            this.LLILLL.LIZIZ();
        }
    }

    public C1171550gan(C19EG c19eg, C1171960gbS c1171960gbS, C1171530gal c1171530gal) {
        this.LL = c19eg;
        this.LLILLJJLI = c1171960gbS;
        this.LLILLL = c1171530gal;
    }
}

package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.1BNB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNB {
    public static final /* synthetic */ int LJ = 0;
    public int LIZ;
    public volatile boolean LIZIZ = true;
    public long LIZJ;
    public C1BN9 LIZLLL;

    static {
        new WeakReference(null);
    }

    public C1BNB(Application application) {
        application.registerActivityLifecycleCallbacks(ActivityStack.lifecycleCallbacks);
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.1BNC
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                if (activity instanceof InterfaceC1602130rnH) {
                    this.LL.getClass();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (activity != null) {
                    C19719612Di.LJJIIJ(C08AJ.LIZ, new C015U(activity), true);
                }
                this.LL.getClass();
                C1BNB c1bnb = this.LL;
                System.currentTimeMillis();
                c1bnb.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (activity != null) {
                    LinkedList<WeakReference<Activity>> linkedList = C08AJ.LIZ;
                    C19719612Di.LJJIIJ(linkedList, new C015U(activity), true);
                    linkedList.addFirst(new WeakReference<>(activity));
                }
                this.LL.getClass();
                new WeakReference(activity);
                int i = C1BNB.LJ;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                C1BNB c1bnb = this.LL;
                int i = c1bnb.LIZ + 1;
                c1bnb.LIZ = i;
                if (i == 1) {
                    c1bnb.LIZIZ = false;
                    if (this.LL.LIZLLL != null) {
                        C0X35.LIZ("lifecycle_callback_time", false);
                        this.LL.LIZLLL.LIZ();
                        C0X35.LJIIJJI("lifecycle_callback_time", false);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                C1BNB c1bnb = this.LL;
                int i = c1bnb.LIZ - 1;
                c1bnb.LIZ = i;
                if (i == 0) {
                    c1bnb.LIZIZ = true;
                    this.LL.LIZJ = System.currentTimeMillis();
                    C1BN9 c1bn9 = this.LL.LIZLLL;
                    if (c1bn9 != null) {
                        c1bn9.LIZIZ();
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof InterfaceC1602130rnH) {
                    this.LL.getClass();
                }
            }
        });
    }
}

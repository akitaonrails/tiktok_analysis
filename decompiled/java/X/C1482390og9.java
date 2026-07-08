package X;

import Y.ARunnableS123S0100000_23;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0og9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482390og9 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C1482340og4 LL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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

    public C1482390og9(C1482340og4 c1482340og4) {
        this.LL = c1482340og4;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C1475000oUE.LJI().execute(new ARunnableS123S0100000_23(this, 200));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C1475000oUE.LJI().execute(new Runnable() { // from class: X.0og6
            @Override // java.lang.Runnable
            public final void run() {
                C1482390og9 c1482390og9 = this.LL;
                c1482390og9.getClass();
                C1C7U.LIZ("SimMergeOnePlayHelper@372c.initActivityLifecycleCallbacks$1$onActivityPaused$1L");
                if (C1474810oTv.LLIFFJFJJ() > 0) {
                    c1482390og9.LL.getClass();
                    C1482340og4.LJFF();
                } else {
                    C1482340og4.LIZIZ().getClass();
                    C1482340og4.LJII();
                    C1482350og5 c1482350og5 = C1482340og4.LIZIZ;
                    for (String str : c1482350og5.LIZJ.keySet()) {
                        JSONObject jSONObject = c1482350og5.LIZJ.get(str);
                        if (jSONObject != null && jSONObject.length() != 0) {
                            c1482350og5.LJI(EnumC1482380og8.OnePlay, str, C786410Ut5.J3(jSONObject));
                        }
                    }
                    for (String str2 : c1482350og5.LIZIZ.keySet()) {
                        JSONObject jSONObject2 = c1482350og5.LIZIZ.get(str2);
                        if (jSONObject2 != null && jSONObject2.length() != 0) {
                            c1482350og5.LJI(EnumC1482380og8.PlaySessionEvents, str2, C786410Ut5.J3(jSONObject2));
                        }
                    }
                }
                C1C7U.LIZIZ("SimMergeOnePlayHelper@372c.initActivityLifecycleCallbacks$1$onActivityPaused$1L");
            }
        });
    }
}

package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0pie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522380pie implements Application.ActivityLifecycleCallbacks {
    public static final C1522380pie LL = new C1522380pie();
    public static final C1522390pif LLILLJJLI = new C1522390pif();
    public static final List<AbstractC1522400pig> LLILLL;

    static {
        ArrayList arrayList = new ArrayList();
        LLILLL = arrayList;
        arrayList.add(new AbstractC1522400pig() { // from class: X.0pid
            public final C1522390pif LL;

            {
                C1522380pie.LL.getClass();
                this.LL = C1522380pie.LLILLJJLI;
            }

            @Override // X.AbstractC1522400pig, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                C1522390pif c1522390pif = this.LL;
                int i = c1522390pif.LIZJ + 1;
                c1522390pif.LIZJ = i;
                if (i >= 0) {
                    c1522390pif.getClass();
                    try {
                        for (InterfaceC1522420pii interfaceC1522420pii : (ArrayList) c1522390pif.LIZ) {
                            if (activity != null) {
                                C786410Ut5.L3(activity);
                            }
                            interfaceC1522420pii.LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1520960pgM.LIZIZ(th);
                    }
                }
                this.LL.getClass();
            }

            @Override // X.AbstractC1522400pig, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                C1522390pif c1522390pif = this.LL;
                int i = c1522390pif.LIZJ - 1;
                c1522390pif.LIZJ = i;
                if (i < 0) {
                    c1522390pif.getClass();
                    try {
                        for (InterfaceC1522410pih interfaceC1522410pih : (ArrayList) c1522390pif.LIZIZ) {
                            if (activity != null) {
                                C786410Ut5.L3(activity);
                            }
                            interfaceC1522410pih.LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1520960pgM.LIZIZ(th);
                    }
                }
                this.LL.getClass();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1522400pig) it2.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            ((AbstractC1522400pig) it2.next()).onActivityStopped(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it2 = ((ArrayList) LLILLL).iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
    }
}

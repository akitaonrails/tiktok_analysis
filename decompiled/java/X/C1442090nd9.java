package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442090nd9 {
    public static String LIZ = "";
    public static long LIZIZ;
    public static long LIZJ;

    public static final long LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || !Intrinsics.LJFF(str, LIZ)) {
            return -1L;
        }
        long j = LIZJ;
        LIZ = "";
        LIZJ = 0L;
        return j;
    }

    public static void LIZIZ(Application application) {
        final C19713312Ax c19713312Ax = C19712912At.LIZ;
        if (!c19713312Ax.LIZIZ) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.12Ay
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
                public final void onActivityDestroyed(Activity activity) {
                    C19713312Ax.LJFF.remove(activity);
                    C19713312Ax c19713312Ax2 = c19713312Ax;
                    int i = c19713312Ax2.LIZLLL - 1;
                    c19713312Ax2.LIZLLL = i;
                    if (i == 0) {
                        Iterator it2 = ((CopyOnWriteArrayList) c19713312Ax2.LIZ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC19713512Az) it2.next()).LIZ();
                        }
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                    C19713312Ax c19713312Ax2 = c19713312Ax;
                    c19713312Ax2.LIZJ++;
                    c19713312Ax2.LIZLLL();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    r1.LIZJ--;
                    c19713312Ax.LIZLLL();
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    LinkedList<Activity> linkedList = C19713312Ax.LJFF;
                    linkedList.remove(activity);
                    linkedList.add(activity);
                    c19713312Ax.LIZLLL++;
                }
            });
            c19713312Ax.LIZIZ = true;
        }
        if (C1442110ndB.LIZ() && !C1448840no2.LIZJ) {
            C1448840no2.LIZJ = true;
            C1448840no2.LIZIZ = System.currentTimeMillis();
            if (!c19713312Ax.LIZIZ) {
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.12Ay
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
                    public final void onActivityDestroyed(Activity activity) {
                        C19713312Ax.LJFF.remove(activity);
                        C19713312Ax c19713312Ax2 = c19713312Ax;
                        int i = c19713312Ax2.LIZLLL - 1;
                        c19713312Ax2.LIZLLL = i;
                        if (i == 0) {
                            Iterator it2 = ((CopyOnWriteArrayList) c19713312Ax2.LIZ).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC19713512Az) it2.next()).LIZ();
                            }
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        C19713312Ax c19713312Ax2 = c19713312Ax;
                        c19713312Ax2.LIZJ++;
                        c19713312Ax2.LIZLLL();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        r1.LIZJ--;
                        c19713312Ax.LIZLLL();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        LinkedList<Activity> linkedList = C19713312Ax.LJFF;
                        linkedList.remove(activity);
                        linkedList.add(activity);
                        c19713312Ax.LIZLLL++;
                    }
                });
                c19713312Ax.LIZIZ = true;
            }
            c19713312Ax.LJ(new C1434040nQA() { // from class: X.0ndA
                @Override // X.C1434040nQA, X.InterfaceC19713512Az
                public final void onAppBackground() {
                    C1448840no2 c1448840no2 = C1448840no2.LIZ;
                    C1448840no2.LJ = System.currentTimeMillis();
                }

                @Override // X.C1434040nQA, X.InterfaceC19713512Az
                public final void onAppForeground() {
                    C1448840no2 c1448840no2 = C1448840no2.LIZ;
                    synchronized (c1448840no2) {
                        try {
                            long j = C1448840no2.LJ;
                            if (j > 0) {
                                c1448840no2.LIZ(j, System.currentTimeMillis());
                                C1448840no2.LJ = 0L;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            });
        }
        c19713312Ax.LJ(new C1434040nQA() { // from class: X.0nd8
            @Override // X.C1434040nQA, X.InterfaceC19713512Az
            public final void onAppForeground() {
                C1442090nd9.LIZIZ = System.currentTimeMillis();
            }
        });
    }
}

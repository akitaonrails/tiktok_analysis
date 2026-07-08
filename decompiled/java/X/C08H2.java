package X;

import Y.ARunnableS83S0000000_3;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08H2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08H2 {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static final Object LIZJ = new Object();
    public static List<String> LIZLLL = new ArrayList();

    public static void LIZJ() {
        synchronized (LIZJ) {
            try {
                if (LIZ) {
                    C2090408Gw.LIZIZ = Boolean.FALSE;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZLLL() {
        synchronized (LIZJ) {
            try {
                if (LIZ) {
                    C2090408Gw.LIZIZ = Boolean.TRUE;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZIZ(String str) {
        List<String> list = LIZLLL;
        if (list == null || list.size() == 0 || TextUtils.isEmpty(str) || !LIZLLL.contains(str)) {
            return false;
        }
        return true;
    }

    public static void LIZ(int i, Activity activity, final boolean z, boolean z2) {
        synchronized (LIZJ) {
            try {
                if (!LIZ) {
                    if (LIZIZ) {
                        LIZ = false;
                        return;
                    }
                    try {
                        C2090408Gw.LJFF = z2;
                        if (Looper.getMainLooper() != Looper.myLooper()) {
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS83S0000000_3(31));
                        } else {
                            C2089608Go.LIZIZ();
                            C2090208Gu.LIZIZ();
                        }
                        LIZ = true;
                        C2090408Gw.LIZ(i);
                        C2090408Gw.LIZIZ = Boolean.TRUE;
                        if (z) {
                            new C2349009Ii(activity).LIZ();
                        }
                        activity.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.08H3
                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityCreated(Activity activity2, Bundle bundle) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityDestroyed(Activity activity2) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStarted(Activity activity2) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStopped(Activity activity2) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityPaused(Activity activity2) {
                                if (C08H2.LIZIZ(activity2.getComponentName().getClassName())) {
                                    C08H2.LIZLLL();
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityResumed(Activity activity2) {
                                if (z) {
                                    new C2349009Ii(activity2).LIZ();
                                }
                                if (C08H2.LIZIZ(activity2.getComponentName().getClassName())) {
                                    C08H2.LIZJ();
                                }
                            }
                        });
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    return;
                }
                C2090408Gw.LIZIZ = Boolean.TRUE;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

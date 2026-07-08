package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ott, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490910ott {
    public Application LIZ;
    public int LIZJ;
    public final List<InterfaceC1490890otr> LIZIZ = new ArrayList();
    public volatile int LIZLLL = -1;
    public final C1490900ots LJ = new Application.ActivityLifecycleCallbacks() { // from class: X.0ots
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            this.LL.getClass();
            C1490910ott c1490910ott = this.LL;
            if (c1490910ott.LIZJ == 0 && activity != null) {
                c1490910ott.LIZJ = activity.hashCode();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int iHashCode;
            C1490910ott c1490910ott = this.LL;
            int i = c1490910ott.LIZJ;
            if (activity != null) {
                iHashCode = activity.hashCode();
            } else {
                iHashCode = i;
            }
            c1490910ott.LIZJ = iHashCode;
            if (i == 0) {
                C1490910ott c1490910ott2 = this.LL;
                c1490910ott2.LIZLLL = 1;
                Object[] objArrLIZ = c1490910ott2.LIZ();
                if (objArrLIZ != null) {
                    for (Object obj : objArrLIZ) {
                        ((InterfaceC1490890otr) obj).onAppForeground();
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            int iHashCode;
            C1490910ott c1490910ott = this.LL;
            new WeakReference(activity);
            c1490910ott.getClass();
            C1490910ott c1490910ott2 = this.LL;
            int i = c1490910ott2.LIZJ;
            if (activity != null) {
                iHashCode = activity.hashCode();
            } else {
                iHashCode = i;
            }
            c1490910ott2.LIZJ = iHashCode;
            this.LL.getClass();
            if (i == 0) {
                C1490910ott c1490910ott3 = this.LL;
                c1490910ott3.LIZLLL = 1;
                Object[] objArrLIZ = c1490910ott3.LIZ();
                if (objArrLIZ != null) {
                    for (Object obj : objArrLIZ) {
                        ((InterfaceC1490890otr) obj).onAppForeground();
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            if (activity != null) {
                int iHashCode = activity.hashCode();
                C1490910ott c1490910ott = this.LL;
                if (iHashCode == c1490910ott.LIZJ) {
                    c1490910ott.LIZJ = 0;
                    c1490910ott.LIZLLL = 0;
                    Object[] objArrLIZ = c1490910ott.LIZ();
                    if (objArrLIZ != null) {
                        for (Object obj : objArrLIZ) {
                            ((InterfaceC1490890otr) obj).onAppBackground();
                        }
                    }
                }
            }
            this.LL.getClass();
        }
    };

    public final Object[] LIZ() {
        Object[] array;
        synchronized (this.LIZIZ) {
            try {
                array = ((ArrayList) this.LIZIZ).size() > 0 ? ((ArrayList) this.LIZIZ).toArray() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return array;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            r7 = this;
            int r1 = r7.LIZLLL
            r0 = -1
            r6 = 0
            r5 = 1
            if (r1 != r0) goto Ld
            goto L11
        L8:
            if (r0 == 0) goto L39
            r1 = 1
        Lb:
            r7.LIZLLL = r1
        Ld:
            if (r1 != r5) goto L10
            r6 = 1
        L10:
            return r6
        L11:
            android.app.Application r1 = r7.LIZ     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L56
            java.lang.String r0 = "activity"
            java.lang.Object r3 = X.C786410Ut5.H2(r1, r0)     // Catch: java.lang.Throwable -> L52
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.Throwable -> L52
            X.0WZX r2 = new X.0WZX     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisofnN7lIdDElhWHCwG38lvBrE4u1ClIFh"
            r0 = 0
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L52
            java.util.List r1 = X.C2204961BRm.LJII(r3, r2)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L56
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L56
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L52
        L39:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L56
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L52
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Throwable -> L52
            int r1 = r2.importance     // Catch: java.lang.Throwable -> L52
            r0 = 100
            if (r1 != r0) goto L39
            java.lang.String r0 = r2.processName     // Catch: java.lang.Throwable -> L52
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: java.lang.Throwable -> L52
            goto L8
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L56:
            r1 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490910ott.LIZJ():boolean");
    }

    public final void LIZIZ(Context context) {
        if (this.LIZ == null && (context instanceof Application)) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        Application application = (Application) context;
                        this.LIZ = application;
                        application.registerActivityLifecycleCallbacks(this.LJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}

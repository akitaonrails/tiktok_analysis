package X;

import J.N;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.base.PowerMonitor;
import com.ttnet.org.chromium.base.TTWeakHandler;

/* JADX INFO: renamed from: X.0UyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789700UyO implements Application.ActivityLifecycleCallbacks {
    public static boolean LLILZ;
    public static final TTWeakHandler LLILZIL = new TTWeakHandler(Looper.getMainLooper(), new InterfaceC742180T9k() { // from class: X.0T9l
        @Override // X.InterfaceC742180T9k
        public final void LIZ() {
        }
    });
    public int LL;
    public PowerMonitor LLILLJJLI;
    public final RunnableC789690UyN LLILLL = new Runnable() { // from class: X.0UyN
        public final void LIZ() throws Throwable {
            if (C789700UyO.LLILZ) {
                C789700UyO.LLILZ = false;
                if (this.LL.LLILLJJLI != null) {
                    Context context = C787230UuP.LIZ;
                    if (C08MY.LIZ(context)) {
                        Intent intent = new Intent();
                        intent.setAction(PowerMonitor.LJFF);
                        if (!TextUtils.isEmpty(PowerMonitor.LJIIIIZZ)) {
                            intent.setPackage(PowerMonitor.LJIIIIZZ);
                        }
                        try {
                            C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb7UzFo87pdzP/0NcitmU1jlw==", null));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    N.MBffe1lF();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("TTLifeCycleMonitor@b4bf.<field>$2");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("TTLifeCycleMonitor@b4bf.<field>$2");
        }
    };

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        r0 = r2.getDeclaredField("activity");
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((android.app.Activity) r0.get(r3)) == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        X.C789700UyO.LLILZ = true;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0UyN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C789700UyO() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C789700UyO.<init>():void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (LLILZ) {
            LLILZIL.postDelayed(this.LLILLL, 30000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws Throwable {
        if (!LLILZ) {
            LLILZ = true;
            if (this.LLILLJJLI != null) {
                Context context = C787230UuP.LIZ;
                if (C08MY.LIZ(context)) {
                    Intent intent = new Intent();
                    intent.setAction(PowerMonitor.LJ);
                    if (!TextUtils.isEmpty(PowerMonitor.LJIIIIZZ)) {
                        intent.setPackage(PowerMonitor.LJIIIIZZ);
                    }
                    try {
                        C2204961BRm.LJJJJI(context, intent, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb7UzFo87pdzP/0NcitmU1jlw==", null));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                N.MyS7kauI();
            }
        }
        LLILZIL.removeCallbacks(this.LLILLL);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.LL == 0 && this.LLILLJJLI != null) {
            N.MELAwTDU();
        }
        this.LL++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.LL - 1;
        this.LL = i;
        if (i == 0 && this.LLILLJJLI != null) {
            N.MolcG1Wq();
        }
    }
}

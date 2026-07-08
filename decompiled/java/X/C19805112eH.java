package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.12eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19805112eH implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C19804412eA LL;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public C19805112eH(C19804412eA c19804412eA) {
        this.LL = c19804412eA;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C19805012eG c19805012eGLJIIIIZZ = this.LL.LJIIIIZZ();
        synchronized (c19805012eGLJIIIIZZ.LJIIJJI) {
            try {
                if (activity == c19805012eGLJIIIIZZ.LJI) {
                    c19805012eGLJIIIIZZ.LJI = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c19805012eGLJIIIIZZ.LIZ.LJI.LJIL()) {
            ((ConcurrentHashMap) c19805012eGLJIIIIZZ.LJFF).remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        final C19805012eG c19805012eGLJIIIIZZ = this.LL.LJIIIIZZ();
        synchronized (c19805012eGLJIIIIZZ.LJIIJJI) {
            try {
                c19805012eGLJIIIIZZ.LJIIJ = false;
                c19805012eGLJIIIIZZ.LJII = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c19805012eGLJIIIIZZ.LIZ.LJIILIIL.getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!c19805012eGLJIIIIZZ.LIZ.LJI.LJIL()) {
            c19805012eGLJIIIIZZ.LIZJ = null;
            c19805012eGLJIIIIZZ.LJIIL().LJIILL(new Runnable() { // from class: X.12ey
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzkw@396d.run");
                    try {
                        c19805012eGLJIIIIZZ.LIZ.LJIIIIZZ().LJIIJJI(jElapsedRealtime);
                        c19805012eGLJIIIIZZ.LJ = null;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzkw@396d.run");
                }
            });
        } else {
            final C19811512fJ c19811512fJLJJ = c19805012eGLJIIIIZZ.LJJ(activity);
            c19805012eGLJIIIIZZ.LIZLLL = c19805012eGLJIIIIZZ.LIZJ;
            c19805012eGLJIIIIZZ.LIZJ = null;
            c19805012eGLJIIIIZZ.LJIIL().LJIILL(new Runnable() { // from class: X.12ev
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzkz@3970.run");
                    try {
                        c19805012eGLJIIIIZZ.LJIL(c19811512fJLJJ, false, jElapsedRealtime);
                        C19805012eG c19805012eG = c19805012eGLJIIIIZZ;
                        c19805012eG.LJ = null;
                        C19804512eB c19804512eBLJIIIZ = c19805012eG.LJIIIZ();
                        c19804512eBLJIIIZ.LJ();
                        c19804512eBLJIIIZ.LJIIJJI();
                        c19804512eBLJIIIZ.LJIIZILJ(new RunnableC19803812e4(c19804512eBLJIIIZ, null));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzkz@3970.run");
                }
            });
        }
        final C19809512ez c19809512ezLJIIJ = this.LL.LJIIJ();
        c19809512ezLJIIJ.LIZ.LJIILIIL.getClass();
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        c19809512ezLJIIJ.LJIIL().LJIILL(new Runnable() { // from class: X.12eV
            public final void LIZ() {
                C19809512ez c19809512ez = c19809512ezLJIIJ;
                long j = jElapsedRealtime2;
                c19809512ez.LJ();
                c19809512ez.LJIILLIIL();
                c19809512ez.LJIILJJIL().LJIILIIL.LIZ(Long.valueOf(j), "Activity paused, time");
                C19812312fR c19812312fR = c19809512ez.LJI;
                c19812312fR.getClass();
                c19812312fR.LIZIZ.LIZ.LJIILIIL.getClass();
                RunnableC19809312ex runnableC19809312ex = new RunnableC19809312ex(c19812312fR, System.currentTimeMillis(), j);
                c19812312fR.LIZ = runnableC19809312ex;
                C786410Ut5.LJLIIL(2000L, c19812312fR.LIZIZ.LIZJ, runnableC19809312ex);
                if (c19809512ez.LIZ.LJI.LJIL()) {
                    c19809512ez.LJFF.LIZJ.LIZ();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzmn@39a2.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzmn@39a2.run");
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        final C19809512ez c19809512ezLJIIJ = this.LL.LJIIJ();
        c19809512ezLJIIJ.LIZ.LJIILIIL.getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        c19809512ezLJIIJ.LJIIL().LJIILL(new Runnable() { // from class: X.12eP
            public final void LIZ() {
                C19809512ez c19809512ez = c19809512ezLJIIJ;
                long j = jElapsedRealtime;
                c19809512ez.LJ();
                c19809512ez.LJIILLIIL();
                c19809512ez.LJIILJJIL().LJIILIIL.LIZ(Long.valueOf(j), "Activity resumed, time");
                if (c19809512ez.LIZ.LJI.LJIJI(null, C19817012gC.LJLJL)) {
                    if (c19809512ez.LIZ.LJI.LJIL() || c19809512ez.LIZLLL) {
                        C19805612eM c19805612eM = c19809512ez.LJFF;
                        c19805612eM.LIZLLL.LJ();
                        c19805612eM.LIZJ.LIZ();
                        c19805612eM.LIZ = j;
                        c19805612eM.LIZIZ = j;
                    }
                } else if (c19809512ez.LIZ.LJI.LJIL() || c19809512ez.LIZIZ().LJIJI.LIZIZ()) {
                    C19805612eM c19805612eM2 = c19809512ez.LJFF;
                    c19805612eM2.LIZLLL.LJ();
                    c19805612eM2.LIZJ.LIZ();
                    c19805612eM2.LIZ = j;
                    c19805612eM2.LIZIZ = j;
                }
                C19812312fR c19812312fR = c19809512ez.LJI;
                c19812312fR.LIZIZ.LJ();
                RunnableC19809312ex runnableC19809312ex = c19812312fR.LIZ;
                if (runnableC19809312ex != null) {
                    c19812312fR.LIZIZ.LIZJ.removeCallbacks(runnableC19809312ex);
                }
                c19812312fR.LIZIZ.LIZIZ().LJIJI.LIZ(false);
                C19809512ez c19809512ez2 = c19812312fR.LIZIZ;
                c19809512ez2.LJ();
                c19809512ez2.LIZLLL = false;
                C19805712eN c19805712eN = c19809512ez.LJ;
                c19805712eN.LIZ.LJ();
                if (c19805712eN.LIZ.LIZ.LJFF()) {
                    c19805712eN.LIZ.LIZ.LJIILIIL.getClass();
                    c19805712eN.LIZIZ(System.currentTimeMillis(), false);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzmk@399f.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzmk@399f.run");
            }
        });
        final C19805012eG c19805012eGLJIIIIZZ = this.LL.LJIIIIZZ();
        synchronized (c19805012eGLJIIIIZZ.LJIIJJI) {
            try {
                c19805012eGLJIIIIZZ.LJIIJ = true;
                if (activity != c19805012eGLJIIIIZZ.LJI) {
                    synchronized (c19805012eGLJIIIIZZ.LJIIJJI) {
                        try {
                            c19805012eGLJIIIIZZ.LJI = activity;
                            c19805012eGLJIIIIZZ.LJII = false;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    if (c19805012eGLJIIIIZZ.LIZ.LJI.LJIL()) {
                        c19805012eGLJIIIIZZ.LJIIIIZZ = null;
                        c19805012eGLJIIIIZZ.LJIIL().LJIILL(new Runnable() { // from class: X.10q0
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("zzky@396f.run");
                                try {
                                    c19805012eGLJIIIIZZ.LJIIIZ = null;
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("zzky@396f.run");
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!c19805012eGLJIIIIZZ.LIZ.LJI.LJIL()) {
            c19805012eGLJIIIIZZ.LIZJ = c19805012eGLJIIIIZZ.LJIIIIZZ;
            c19805012eGLJIIIIZZ.LJIIL().LJIILL(new Runnable() { // from class: X.10q1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("zzkx@396e.run");
                    try {
                        C19805012eG c19805012eG = c19805012eGLJIIIIZZ;
                        c19805012eG.LJ = c19805012eG.LJIIIZ;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("zzkx@396e.run");
                }
            });
            return;
        }
        c19805012eGLJIIIIZZ.LJIJJ(activity, c19805012eGLJIIIIZZ.LJJ(activity), false);
        final C19806012eQ c19806012eQLJIIIIZZ = c19805012eGLJIIIIZZ.LIZ.LJIIIIZZ();
        c19806012eQLJIIIIZZ.LIZ.LJIILIIL.getClass();
        final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        c19806012eQLJIIIIZZ.LJIIL().LJIILL(new Runnable() { // from class: X.0hbJ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zze@9675.run");
                try {
                    c19806012eQLJIIIIZZ.LJIIZILJ(jElapsedRealtime2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zze@9675.run");
            }
        });
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0090: IGET (r0 I:X.12eA) = (r3 I:X.12eH) A[Catch: all -> 0x00a7] (LINE:33554576) X.12eH.LL X.12eA, block:B:35:0x008d */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ab: IGET (r0 I:X.12eA) = (r3 I:X.12eH) (LINE:33554603) X.12eH.LL X.12eA, block:B:39:0x00a8 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.12eH] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.12eH] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.app.Activity r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r3 = r8
            X.12eA r0 = r3.LL     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            X.12eS r0 = r0.LJIILJJIL()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            X.12fK r1 = r0.LJIILIIL     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            java.lang.String r0 = "onActivityCreated"
            r1.LIZJ(r0)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            android.content.Intent r2 = r9.getIntent()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            if (r2 != 0) goto L1e
            X.12eA r0 = r3.LL
            X.12eG r0 = r0.LJIIIIZZ()
            r0.LJIJI(r9, r10)
            return
        L1e:
            android.net.Uri r5 = r2.getData()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            if (r5 == 0) goto L29
            boolean r0 = r5.isHierarchical()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            goto L40
        L29:
            android.os.Bundle r1 = r2.getExtras()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> La7
            if (r1 == 0) goto L82
            java.lang.String r0 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r0)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            if (r0 != 0) goto L82
            android.net.Uri r5 = android.net.Uri.parse(r1)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            goto L42
        L40:
            if (r0 == 0) goto L29
        L42:
            if (r5 == 0) goto L82
            boolean r0 = r5.isHierarchical()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            if (r0 == 0) goto L82
            X.12eA r0 = r3.LL     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            r0.LIZJ()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            boolean r0 = X.C19803112dx.LJJJJI(r2)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            if (r0 == 0) goto L60
            java.lang.String r6 = "gs"
        L57:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            if (r10 != 0) goto L65
            goto L63
        L60:
            java.lang.String r6 = "auto"
            goto L57
        L63:
            r4 = 1
            goto L66
        L65:
            r4 = 0
        L66:
            X.12eA r0 = r3.LL     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            X.12jR r0 = r0.LJIIL()     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            X.12dy r2 = new X.12dy     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            r2.<init>(r3)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            r0.LJIILL(r2)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
            X.12eA r0 = r3.LL
            X.12eG r0 = r0.LJIIIIZZ()
            r0.LJIJI(r9, r10)
            return
        L7e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.RuntimeException -> L8c java.lang.Throwable -> La7
        L82:
            X.12eA r0 = r3.LL
            X.12eG r0 = r0.LJIIIIZZ()
            r0.LJIJI(r9, r10)
            return
        L8c:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> La7
            X.12eA r0 = r3.LL     // Catch: java.lang.Throwable -> La7
            X.12eS r0 = r0.LJIILJJIL()     // Catch: java.lang.Throwable -> La7
            X.12fK r1 = r0.LJFF     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "Throwable caught in onActivityCreated"
            r1.LIZ(r2, r0)     // Catch: java.lang.Throwable -> La7
            X.12eA r0 = r3.LL
            X.12eG r0 = r0.LJIIIIZZ()
            r0.LJIJI(r9, r10)
            return
        La7:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.12eA r0 = r3.LL
            X.12eG r0 = r0.LJIIIIZZ()
            r0.LJIJI(r9, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19805112eH.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C19811512fJ c19811512fJ;
        C19805012eG c19805012eGLJIIIIZZ = this.LL.LJIIIIZZ();
        if (c19805012eGLJIIIIZZ.LIZ.LJI.LJIL() && bundle != null && (c19811512fJ = (C19811512fJ) ((ConcurrentHashMap) c19805012eGLJIIIIZZ.LJFF).get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(FollowStatusChangeMethod.PARAM_UID, c19811512fJ.LIZJ);
            C786410Ut5.LJJJI("name", c19811512fJ.LIZ, bundle2);
            C786410Ut5.LJJJI("referrer_name", c19811512fJ.LIZIZ, bundle2);
            C786410Ut5.LJJIIZI(bundle, bundle2, "com.google.app_measurement.screen_service");
        }
    }
}

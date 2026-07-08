package X;

import android.graphics.Typeface;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.13rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20139913rB {
    public static final C603820NmG<String, Typeface> LIZ = new C603820NmG<>(16);
    public static final PThreadPoolExecutor LIZIZ;
    public static final Object LIZJ;
    public static final C830530Wi3<String, ArrayList<C092O<C20140013rC>>> LIZLLL;

    static {
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: X.0WP2
            public final String LL = "fonts-androidx";
            public final int LLILLJJLI = 10;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new PthreadThread(this.LL, runnable, this.LLILLJJLI) { // from class: X.0WP1
                    public final int LL;

                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        try {
                            Process.setThreadPriority(this.LL);
                            super.run();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }

                    {
                        this.LL = i;
                    }
                };
            }
        });
        pThreadPoolExecutor.allowCoreThreadTimeOut(true);
        LIZIZ = pThreadPoolExecutor;
        LIZJ = new Object();
        LIZLLL = new C830530Wi3<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        if (1 != 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20140013rC LIZ(java.lang.String r7, android.content.Context r8, X.C19968913Bf r9, int r10) {
        /*
            X.0NmG<java.lang.String, android.graphics.Typeface> r0 = X.C20139913rB.LIZ
            java.lang.Object r1 = r0.LIZJ(r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            X.13rC r0 = new X.13rC
            r0.<init>(r1)
            return r0
        L10:
            X.13Wu r6 = X.C20024813Ws.LIZ(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L59
            int r0 = r6.LIZ
            r5 = 1
            r4 = -3
            if (r0 == 0) goto L23
            if (r0 != r5) goto L36
            r5 = -2
        L1d:
            X.13rC r0 = new X.13rC
            r0.<init>(r5)
            return r0
        L23:
            X.13rA[] r3 = r6.LIZIZ
            if (r3 == 0) goto L3b
            int r0 = r3.length
            if (r0 == 0) goto L3b
            int r2 = r3.length
            r1 = 0
        L2c:
            if (r1 >= r2) goto L3e
            r0 = r3[r1]
            int r5 = r0.LJ
            if (r5 == 0) goto L38
            if (r5 >= 0) goto L1d
        L36:
            r5 = -3
            goto L1d
        L38:
            int r1 = r1 + 1
            goto L2c
        L3b:
            if (r5 == 0) goto L3e
            goto L1d
        L3e:
            X.13rA[] r1 = r6.LIZIZ
            X.13rQ r0 = X.C20140313rF.LIZ
            android.graphics.Typeface r1 = r0.LIZIZ(r8, r1, r10)
            if (r1 == 0) goto L53
            X.0NmG<java.lang.String, android.graphics.Typeface> r0 = X.C20139913rB.LIZ
            r0.LIZLLL(r7, r1)
            X.13rC r0 = new X.13rC
            r0.<init>(r1)
            return r0
        L53:
            X.13rC r0 = new X.13rC
            r0.<init>(r4)
            return r0
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.13rC r1 = new X.13rC
            r0 = -1
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20139913rB.LIZ(java.lang.String, android.content.Context, X.13Bf, int):X.13rC");
    }
}

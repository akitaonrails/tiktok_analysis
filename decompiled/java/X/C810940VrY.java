package X;

import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0VrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810940VrY {
    public static WeakReference<C810940VrY> LIZLLL;
    public final SharedPreferences LIZ;
    public C810960Vra LIZIZ;
    public final Executor LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C810920VrW LIZ() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.0Vra r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L29
            java.util.regex.Pattern r0 = X.C810920VrW.LIZLLL     // Catch: java.lang.Throwable -> L29
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L26
            java.lang.String r1 = "!"
            r0 = -1
            java.lang.String[] r3 = r2.split(r1, r0)     // Catch: java.lang.Throwable -> L29
            int r1 = r3.length     // Catch: java.lang.Throwable -> L29
            r0 = 2
            if (r1 != r0) goto L26
            X.0VrW r2 = new X.0VrW     // Catch: java.lang.Throwable -> L29
            r0 = 0
            r1 = r3[r0]     // Catch: java.lang.Throwable -> L29
            r0 = 1
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L29
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L29
            goto L27
        L26:
            r2 = 0
        L27:
            monitor-exit(r4)
            return r2
        L29:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C810940VrY.LIZ():X.0VrW");
    }

    public final synchronized void LIZIZ() {
        this.LIZIZ = C810960Vra.LIZ(this.LIZ, this.LIZJ);
    }

    public final synchronized void LIZJ(C810920VrW c810920VrW) {
        this.LIZIZ.LIZJ(c810920VrW.LIZJ);
    }

    public C810940VrY(SharedPreferences sharedPreferences, Executor executor) {
        this.LIZJ = executor;
        this.LIZ = sharedPreferences;
    }
}

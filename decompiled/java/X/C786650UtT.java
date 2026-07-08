package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786650UtT {
    public final SharedPreferences LIZ;

    public C786650UtT(Context context) {
        try {
            Context contextT2 = C786410Ut5.T2(context);
            this.LIZ = contextT2 == null ? null : C810670Vr7.LIZJ(contextT2, 0, "google_ads_flags");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ = null;
        }
    }

    public final String LIZIZ() {
        String string = "";
        if (C2080308Cz.LIZ != null && C2080308Cz.LIZJ != null) {
            synchronized (this) {
                try {
                    C2080308Cz.LIZJ.setAccessible(true);
                    C2080308Cz.LIZJ.set(this, C2080308Cz.LIZ);
                } catch (Throwable th) {
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        try {
            SharedPreferences sharedPreferences = this.LIZ;
            if (sharedPreferences != null) {
                string = sharedPreferences.getString("gads:ad_id_use_shared_preference:experiment_id", "");
                return string;
            }
        } catch (Throwable th2) {
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r3) {
        /*
            r2 = this;
            android.content.SharedPreferences r0 = X.C2080308Cz.LIZ
            if (r0 == 0) goto L23
            java.lang.reflect.Field r0 = X.C2080308Cz.LIZJ
            if (r0 == 0) goto L23
            monitor-enter(r2)
            java.lang.reflect.Field r1 = X.C2080308Cz.LIZJ     // Catch: java.lang.Throwable -> L17
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Field r1 = X.C2080308Cz.LIZJ     // Catch: java.lang.Throwable -> L17
            android.content.SharedPreferences r0 = X.C2080308Cz.LIZ     // Catch: java.lang.Throwable -> L17
            r1.set(r2, r0)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            goto L23
        L1d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L23:
            r1 = 0
            android.content.SharedPreferences r0 = r2.LIZ     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L31
            boolean r1 = r0.getBoolean(r3, r1)     // Catch: java.lang.Throwable -> L2d
            return r1
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C786650UtT.LIZ(java.lang.String):boolean");
    }
}

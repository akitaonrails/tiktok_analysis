package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0WH4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WH4 {
    public static final C829100Wfk LIZ = C829100Wfk.getInstance();
    public static final Object LIZIZ = new Object();
    public static Method LIZJ = null;
    public static Method LIZLLL = null;

    public static void LIZ(Context context) {
        C0W3J.LJIIIZ(context, "Context must not be null");
        LIZ.verifyGooglePlayServicesIsAvailable(context, 11925000);
        synchronized (LIZIZ) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Context context2 = DynamiteModule.LIZJ(context, DynamiteModule.LIZLLL, "com.google.android.gms.providerinstaller.dynamite").LIZ;
                    if (context2 != null) {
                        LIZIZ(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                        return;
                    }
                } catch (C0WH8 e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                Context remoteContext = C829090Wfj.getRemoteContext(context);
                if (remoteContext != null) {
                    try {
                        if (LIZLLL == null) {
                            Class<?> cls = Long.TYPE;
                            LIZLLL = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                        }
                        C2204961BRm.a0(LIZLLL, null, new Object[]{context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2)}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzve1VenF1YKPHkjPdd4ipU9nU84vh+4Szn9g==", new String[]{"016a9"}));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    LIZIZ(remoteContext, "com.google.android.gms.common.security.ProviderInstallerImpl");
                    return;
                }
                throw new C812710VuP(8);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ(Context context, String str) throws Throwable {
        try {
            if (LIZJ == null) {
                LIZJ = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            C2204961BRm.a0(LIZJ, null, new Object[]{context}, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzve1VenF1YKPHkjPdd4ipU9nU84vh+4Szn9g==", new String[]{"016a9"}));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    e.getMessage();
                } else {
                    cause.getMessage();
                }
            }
            throw new C812710VuP(8);
        }
    }
}

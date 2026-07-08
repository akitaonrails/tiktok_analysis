package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Vsd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811610Vsd {
    public static final long LIZ = TimeUnit.MINUTES.toMillis(1);
    public static final Object LIZIZ = new Object();
    public static C812210Vtb LIZJ;

    public static void LIZ(Context context) {
        if (LIZJ == null) {
            C812210Vtb c812210Vtb = new C812210Vtb(context);
            LIZJ = c812210Vtb;
            synchronized (c812210Vtb.LIZ) {
                try {
                    c812210Vtb.LJI = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZIZ(Intent intent) {
        synchronized (LIZIZ) {
            try {
                if (LIZJ != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    LIZJ.LIZJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static ComponentName LIZJ(Context context, Intent intent) {
        synchronized (LIZIZ) {
            try {
                LIZ(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameS3 = C786410Ut5.s3(context, intent);
                if (componentNameS3 == null) {
                    return null;
                }
                if (!booleanExtra) {
                    LIZJ.LIZ(LIZ);
                }
                return componentNameS3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

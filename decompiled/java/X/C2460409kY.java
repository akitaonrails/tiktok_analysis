package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09kY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2460409kY {
    public static final C2460309kX LIZJ = new C2460309kX("AgeSignalsService");
    public final Context LIZ;
    public final C2464409lC LIZIZ;

    public C2460409kY(Context context) {
        this.LIZ = context;
        try {
            if (!C786410Ut5.V3(context.getPackageManager(), "com.android.vending", 0).enabled) {
                C2460209kW.LIZ.LIZIZ("Play Store package is disabled.", new Object[0]);
            } else {
                try {
                    if (C2460209kW.LIZ(C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 64).signatures)) {
                        this.LIZIZ = new C2464409lC(context, LIZJ, C2460509kZ.LIZ);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2460209kW.LIZ.LIZIZ("Play Store package is not found.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2460209kW.LIZ.LIZIZ("Play Store package is not found.", new Object[0]);
        }
        this.LIZIZ = null;
    }
}

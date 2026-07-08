package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZL {
    public final C19804712eD LIZ;

    public final boolean LIZ() {
        try {
            C812460Vu0 c812460Vu0LIZ = C812450Vtz.LIZ(this.LIZ.LIZ);
            if (c812460Vu0LIZ != null) {
                return c812460Vu0LIZ.LIZIZ(128, "com.android.vending").versionCode >= 80837300;
            }
            this.LIZ.LJIILJJIL().LJIILIIL.LIZJ("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJIILJJIL().LJIILIIL.LIZ(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    public C12ZL(C12Z4 c12z4) {
        this.LIZ = c12z4.LJIIJJI;
    }
}

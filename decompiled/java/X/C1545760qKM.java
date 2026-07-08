package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;

/* JADX INFO: renamed from: X.0qKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545760qKM {
    public static final C1545760qKM LIZ = new C1545760qKM();
    public static volatile boolean LIZIZ;

    public static boolean LIZ(String str) {
        try {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void LIZIZ(final Context context) {
        boolean z;
        C0BLO.LIZ.getClass();
        if (C0BLO.LIZ() && LIZIZ) {
            return;
        }
        try {
            final ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi != null && !iSparkHostApi.checkPluginInstalled("com.bytedance.tiktok.vmsdk")) {
                iSparkHostApi.LJJIIZI(new C2203511BLx("com.bytedance.tiktok.vmsdk", true, false, true, false, true, false, false, false, false), new C1BME() { // from class: X.0qKL
                    @Override // X.C1BME
                    public final void onFailed(int i) {
                    }

                    @Override // X.C1BME
                    public final void onSuccess() {
                        try {
                            iSparkHostApi.splitCompatInstall(context);
                            iSparkHostApi.LLJJLIIIJLLLLLLLZ(context);
                            C1545760qKM.LIZ.getClass();
                            C1545760qKM.LIZ("v8_libfull.cr");
                            C1545760qKM.LIZ("napi_v8");
                            C1545760qKM.LIZ("lynx_v8_bridge");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        C0BLO.LIZ.getClass();
                        if (C0BLO.LIZ()) {
                            C1545760qKM.LIZIZ = true;
                        }
                    }
                });
                return;
            }
            boolean zLIZ = LIZ("v8_libfull.cr");
            boolean zLIZ2 = LIZ("napi_v8");
            boolean zLIZ3 = LIZ("lynx_v8_bridge");
            if (zLIZ && zLIZ2 && zLIZ3) {
                z = true;
            } else {
                z = false;
            }
            boolean zBooleanValue = Boolean.valueOf(z).booleanValue();
            if (C0BLO.LIZ()) {
                LIZIZ = zBooleanValue;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

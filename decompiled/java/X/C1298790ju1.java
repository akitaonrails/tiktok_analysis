package X;

import Y.ARunnableS96S0000000_20;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0ju1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298790ju1 {
    public static volatile boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        C1301610jyZ.LIZIZ().execute(new ARunnableS96S0000000_20(0));
        C1301610jyZ.LIZIZ().execute(new Runnable() { // from class: X.08Au
            public final /* synthetic */ boolean LL = true;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ClassWarmer@8dc1.warmClass$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ClassWarmer@8dc1.warmClass$2");
            }

            public final void LIZ() {
                try {
                    SystemClock.elapsedRealtime();
                    try {
                        Class.forName("com.lynx.devtool.LynxInspectorOwner");
                    } catch (ClassNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (this.LL) {
                            LoadSoLancet.LIZJ("lynx");
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Librarian.LJFF("lynx");
                            LoadSoLancet.LJ(jUptimeMillis, "lynx");
                            LoadSoLancet.LIZLLL(jUptimeMillis, "lynx");
                            LoadSoLancet.LIZIZ("lynx");
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        });
        C1301610jyZ.LIZIZ().execute(new ARunnableS96S0000000_20(1));
    }
}

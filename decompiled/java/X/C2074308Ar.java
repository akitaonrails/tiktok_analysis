package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.08Ar, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2074308Ar {
    public static int LIZ;

    public static synchronized boolean LIZ() {
        int i = LIZ;
        if (i != 0) {
            return i > 0;
        }
        try {
            LoadSoLancet.LIZJ("anrrelief");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("anrrelief");
            LoadSoLancet.LJ(jUptimeMillis, "anrrelief");
            LoadSoLancet.LIZLLL(jUptimeMillis, "anrrelief");
            LoadSoLancet.LIZIZ("anrrelief");
            LIZ = 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = -1;
        }
        return LIZ > 0;
    }
}

package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.08RS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RS {
    public static boolean LIZ;

    public static synchronized void LIZ() {
        if (LIZ) {
            return;
        }
        LoadSoLancet.LIZJ("bdzstd");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("bdzstd");
        LoadSoLancet.LJ(jUptimeMillis, "bdzstd");
        LoadSoLancet.LIZLLL(jUptimeMillis, "bdzstd");
        LoadSoLancet.LIZIZ("bdzstd");
        LIZ = true;
    }
}

package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.08ec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2168808ec {
    public volatile boolean LIZ;

    public final void LIZ(String str) {
        if (!this.LIZ) {
            synchronized (this) {
                try {
                    if (!this.LIZ) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        LoadSoLancet.LIZJ(str);
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        Librarian.LJFF(str);
                        LoadSoLancet.LJ(jUptimeMillis2, str);
                        LoadSoLancet.LIZLLL(jUptimeMillis2, str);
                        LoadSoLancet.LIZIZ(str);
                        this.LIZ = true;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("loadLibrary cost ");
                        sbLIZ.append(SystemClock.uptimeMillis() - jUptimeMillis);
                        sbLIZ.append(" ms");
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}

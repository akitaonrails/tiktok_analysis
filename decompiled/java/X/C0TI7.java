package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0TI7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TI7 {
    public static C0TI8 LIZ;

    public static boolean LIZ(String str) {
        C0TI8 c0ti8 = LIZ;
        if (TextUtils.isEmpty(str)) {
            C1698940uJQ.LIZ();
            return false;
        }
        if (c0ti8 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Loading [");
            sbLIZ.append(str);
            sbLIZ.append("] with external loader ");
            sbLIZ.append(c0ti8);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZ();
            return LiveAppBundleUtils.loadSOByLoader(str, "liveplayer-loadPlayerLibrary", true);
        }
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
}

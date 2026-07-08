package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0TI5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TI5 {
    public static C0TI6 LIZ;

    public static boolean LIZ(String str) throws Exception {
        C0TI6 c0ti6 = LIZ;
        if (!TextUtils.isEmpty(str)) {
            if (c0ti6 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Loading [");
                sbLIZ.append(str);
                sbLIZ.append("] with external loader ");
                sbLIZ.append(c0ti6);
                C2188811AlT.LIZIZ(sbLIZ);
                return c0ti6.loadLibrary(str);
            }
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            return true;
        }
        throw new Exception("Invalid library name.");
    }
}

package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.08Rq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2118408Rq {
    public static int LIZ(String str) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            try {
                LoadSoLancet.LIZJ(str);
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF(str);
                LoadSoLancet.LJ(jUptimeMillis, str);
                LoadSoLancet.LIZLLL(jUptimeMillis, str);
                LoadSoLancet.LIZIZ(str);
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return -1;
            }
        }
        throw new Exception("Invalid library name.");
    }
}

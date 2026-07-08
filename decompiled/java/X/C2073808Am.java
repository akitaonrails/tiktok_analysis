package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08Am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2073808Am {
    public static final boolean LIZ(List<String> list) {
        System.currentTimeMillis();
        for (String str : (ArrayList) list) {
            System.currentTimeMillis();
            synchronized (C07PM.class) {
                List<String> list2 = C07PM.LIZ;
                if (!((ArrayList) list2).contains(str)) {
                    try {
                        try {
                            LoadSoLancet.LIZJ(str);
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Librarian.LJFF(str);
                            LoadSoLancet.LJ(jUptimeMillis, str);
                            LoadSoLancet.LIZLLL(jUptimeMillis, str);
                            LoadSoLancet.LIZIZ(str);
                            ((ArrayList) list2).add(str);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            return false;
                        }
                    } catch (UnsatisfiedLinkError e) {
                        TryCatchGuardChecker.doCheck(e);
                        System.mapLibraryName(str);
                        return false;
                    }
                }
            }
            System.currentTimeMillis();
        }
        return true;
    }
}

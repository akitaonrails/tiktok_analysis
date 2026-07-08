package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.08Pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2111808Pc {
    public static volatile boolean LIZ;
    public static final ArrayList<UnsatisfiedLinkError> LIZIZ = new ArrayList<>();

    public static boolean LIZ(Context context) {
        if (LIZ) {
            return true;
        }
        synchronized (C2111808Pc.class) {
            try {
                if (LIZ) {
                    return true;
                }
                try {
                    try {
                        if (context != null) {
                            Librarian.LJI(context, "alignpage");
                        } else {
                            LoadSoLancet.LIZJ("alignpage");
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Librarian.LJFF("alignpage");
                            LoadSoLancet.LJ(jUptimeMillis, "alignpage");
                            LoadSoLancet.LIZLLL(jUptimeMillis, "alignpage");
                            LoadSoLancet.LIZIZ("alignpage");
                        }
                        LIZ = true;
                        return true;
                    } catch (UnsatisfiedLinkError e) {
                        TryCatchGuardChecker.doCheck(e);
                        LIZIZ.add(e);
                        return false;
                    }
                } catch (OverlappingFileLockException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

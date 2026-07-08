package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0WAL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAL {
    public static C0WAT LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static volatile C2214701Bm8 LIZLLL;

    public static C2214701Bm8 LIZIZ() {
        try {
            ArrayList arrayList = new ArrayList();
            C0WAK c0wakLIZJ = C0WAI.LIZJ(Process.myTid(), arrayList);
            C2214701Bm8 c2214701Bm8LIZ = LIZ(System.nanoTime(), c0wakLIZJ.LIZ, c0wakLIZJ.LIZIZ);
            if (c2214701Bm8LIZ == null) {
                try {
                    if (C2187451AjH.LJIIJ()) {
                        arrayList.isEmpty();
                        return c2214701Bm8LIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return c2214701Bm8LIZ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            try {
                C2187451AjH.LJIIJ();
                return null;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                return null;
            }
        }
    }

    public static C2214701Bm8 LIZ(long j, C0WAJ c0waj, boolean z) {
        long j2;
        long j3;
        long j4;
        if (c0waj != null && c0waj.LJ) {
            long j5 = c0waj.LIZ;
            if (z) {
                j2 = c0waj.LIZLLL;
                j3 = c0waj.LIZJ;
                j4 = c0waj.LIZIZ;
            } else {
                j2 = -1;
                j3 = -1;
                j4 = -1;
            }
            return new C2214701Bm8(j, j5, j2, j3, j4);
        }
        return null;
    }
}

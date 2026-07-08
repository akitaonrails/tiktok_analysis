package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import im3.b;
import im3.o;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801850Vct {
    public static boolean LIZ;

    public static void LIZ(final String str, final Map map, final Map map2) {
        if (LIZ) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String name = C786410Ut5.u3().getName();
        C0VXF.post(new Runnable(name, jCurrentTimeMillis, str, map, map2) { // from class: X.0Vcs
            public final long LL;
            public final String LLILLJJLI;
            public final Map<? extends String, ? extends String> LLILLL;
            public final Map<String, String> LLILZ;
            public final String LLILZIL;

            public final void LIZ() {
                C802790VeP c802790VeP = k.LIZ;
                if (c802790VeP == null) {
                    return;
                }
                try {
                    C801830Vcr c801830VcrLIZ = C801820Vcq.LIZ(c802790VeP, this.LLILZIL, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
                    b.LJI(o.LJFF(CrashType.DART, c801830VcrLIZ.LIZIZ.LIZ), c801830VcrLIZ.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DartCrash$UploadProcess@fb44.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DartCrash$UploadProcess@fb44.run");
            }

            {
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = str;
                this.LLILLL = map;
                this.LLILZ = map2;
                this.LLILZIL = name;
            }
        });
    }
}

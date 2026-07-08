package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0HDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C437400HDe {
    public static boolean LJ;
    public final long LIZ;
    public final AtomicBoolean LIZIZ;
    public final AtomicBoolean LIZJ;
    public final BPEAHandler LIZLLL;

    static {
        new Object() { // from class: X.0HDf
            public static void LIZ(long j, boolean z) {
                if (j > 0) {
                    final boolean z2 = C437400HDe.LJ;
                    C786410Ut5.LJLIIL(j, C0HDV.LIZ, new Runnable() { // from class: X.0HDg
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TouchTool$ViewClickScope@849.Companion$lockGlobalEvent$1");
                            try {
                                C437400HDe.LJ = z2;
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TouchTool$ViewClickScope@849.Companion$lockGlobalEvent$1");
                        }
                    });
                }
                C437400HDe.LJ = z;
            }
        };
    }

    public C437400HDe() {
        this(800L);
    }

    public C437400HDe(long j) {
        this.LIZ = j;
        this.LIZIZ = new AtomicBoolean(false);
        this.LIZJ = new AtomicBoolean(true);
        this.LIZLLL = new BPEAHandler(Looper.getMainLooper());
    }

    public static boolean LIZ(C437400HDe c437400HDe) {
        if (c437400HDe.LIZIZ.get() || !c437400HDe.LIZJ.get()) {
            return false;
        }
        long j = c437400HDe.LIZ;
        c437400HDe.LIZJ.set(false);
        C786410Ut5.LJLIIL(j, c437400HDe.LIZLLL, new ARunnableS106S0100000_6(c437400HDe, 15));
        return true;
    }
}

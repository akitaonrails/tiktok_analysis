package X;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: X.0QTY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QTY {
    public static long LIZJ;
    public static int LJ;
    public static final C0QTY LIZ = new C0QTY();
    public static volatile long LIZIZ = 500;
    public static final ArrayDeque<Long> LIZLLL = new ArrayDeque<>(50);
    public static final BPEAHandler LJFF = new BPEAHandler(Looper.getMainLooper());
    public static final RunnableC670850QTb LJI = RunnableC670850QTb.LL;

    public final synchronized void LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = LIZJ;
        if (j != 0) {
            long j2 = jElapsedRealtime - j;
            if (j2 > 0) {
                ArrayDeque<Long> arrayDeque = LIZLLL;
                if (arrayDeque.size() == 50) {
                    arrayDeque.removeFirst();
                }
                arrayDeque.addLast(Long.valueOf(j2));
            }
        }
        LIZJ = jElapsedRealtime;
        BPEAHandler bPEAHandler = LJFF;
        RunnableC670850QTb runnableC670850QTb = LJI;
        bPEAHandler.removeCallbacks(runnableC670850QTb);
        C786410Ut5.LJLIIL(LIZIZ, bPEAHandler, runnableC670850QTb);
    }

    public final synchronized void LIZIZ() {
        LIZJ = 0L;
        LIZLLL.clear();
        LJ = 0;
        LJFF.removeCallbacks(LJI);
    }

    public static void LIZJ(Long l) {
        long jLJFF;
        if (l != null && l.longValue() > 0) {
            jLJFF = C13LZ.LJFF(l.longValue(), 100L, Mp4ScreenVideoLoadTimeout.CONTROL);
        } else {
            jLJFF = 500;
        }
        if (jLJFF == LIZIZ) {
            return;
        }
        LIZIZ = jLJFF;
    }
}

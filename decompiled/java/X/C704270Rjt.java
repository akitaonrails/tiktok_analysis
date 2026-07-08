package X;

import Y.ARunnableS90S0000000_11;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Rjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704270Rjt {
    public static List<Runnable> LIZ;
    public static boolean LIZIZ;
    public static final ARunnableS90S0000000_11 LIZJ = new ARunnableS90S0000000_11(4);

    public static void LIZIZ() {
        C0CAU.LIZ.removeCallbacks(LIZJ);
        LIZIZ = false;
        List<Runnable> list = LIZ;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
        List<Runnable> list2 = LIZ;
        if (list2 != null) {
            ((ArrayList) list2).clear();
        }
    }

    public static void LIZ(Runnable runnable) {
        if (LIZ == null) {
            LIZ = new ArrayList();
        }
        ((ArrayList) LIZ).add(runnable);
        if (!LIZIZ && C1601090rlb.LIZ()) {
            LIZIZ = true;
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, C0CAU.LIZ, LIZJ);
        }
    }
}

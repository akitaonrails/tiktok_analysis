package X;

import Y.ARunnableS8S1100000_2;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05QE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05QE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C2344009Gk c2344009Gk) {
        ARunnableS8S1100000_2 aRunnableS8S1100000_2 = new ARunnableS8S1100000_2(c2344009Gk, 1);
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            ExecutorService executorServiceLJFF = C20684815ws.LJFF();
            if (executorServiceLJFF != null) {
                executorServiceLJFF.execute(aRunnableS8S1100000_2);
                return;
            }
            return;
        }
        aRunnableS8S1100000_2.run();
    }
}

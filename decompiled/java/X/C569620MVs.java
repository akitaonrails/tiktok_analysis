package X;

import android.content.Context;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569620MVs {
    public static C11RK<Integer> LIZ = new C11RK<>();
    public static C569630MVt LIZIZ;
    public static Context LIZJ;
    public static int LIZLLL;

    static {
        new BPEAHandler();
        LIZLLL = 1;
    }

    public static void LIZ() {
        try {
            LIZ.onComplete();
            Context context = LIZJ;
            if (context != null) {
                C786410Ut5.LJJIFFI(context, LIZIZ);
            }
            if (C1201120hMU.LIZ().leakOptCreativeTools) {
                LIZJ = null;
                LIZIZ = null;
            }
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

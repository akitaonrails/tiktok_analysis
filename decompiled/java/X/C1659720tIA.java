package X;

import Y.ARunnableS125S0100000_25;
import android.os.Looper;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0tIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659720tIA {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ() {
        if (LIZIZ()) {
            return;
        }
        final String str = "This method must call on main thread";
        RuntimeException runtimeException = new RuntimeException(str) { // from class: X.0tIB
        };
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThreadUtility checkUIThread error ");
        sbLIZ.append(Log.getStackTraceString(runtimeException));
        C1659700tI8.LIZ.e("ALS Framework", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJL(LIZ, new ARunnableS125S0100000_25(runtimeException, 4));
        throw runtimeException;
    }

    public static boolean LIZIZ() {
        return Looper.getMainLooper() == Looper.myLooper() && Looper.getMainLooper().getThread() == C786410Ut5.u3();
    }
}

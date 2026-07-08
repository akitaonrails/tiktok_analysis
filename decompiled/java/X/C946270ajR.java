package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0ajR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C946270ajR {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Object LIZIZ = new Object();
    public static volatile long LIZJ;
    public static volatile boolean LIZLLL;

    public static void LIZ() {
        LIZ.removeCallbacksAndMessages(LIZIZ);
        LIZJ++;
        C952690atn.LIZ.getClass();
        C952690atn.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel, newCycleId=");
        sbLIZ.append(LIZJ);
        C20441214yg.LJIIIZ("CoHostMultiPreloadScheduler", C2188811AlT.LIZIZ(sbLIZ));
    }
}

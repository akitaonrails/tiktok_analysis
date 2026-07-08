package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0jBR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271150jBR {
    public final InterfaceC1271120jBO LIZ;
    public SafeHandlerThread LIZLLL;
    public Handler LJ;
    public ARunnableS120S0100000_20 LJFF;
    public final int LJII;
    public boolean LJIIIIZZ;
    public int LJI = 66;
    public final C1271190jBV LIZIZ = new C1271190jBV();
    public LinkedList<C1271170jBT> LIZJ = new LinkedList<>();

    public C1271150jBR(C1271100jBM c1271100jBM, int i) {
        C1271200jBW c1271200jBW;
        boolean z;
        SafeHandlerThread safeHandlerThreadLIZIZ;
        this.LJII = 2;
        this.LIZ = c1271100jBM;
        this.LJII = (i < 1 || i > 6) ? 2 : i;
        C1271180jBU c1271180jBU = C1271160jBS.LIZ;
        if (c1271180jBU == null) {
            c1271200jBW = null;
        } else {
            c1271200jBW = (C1271200jBW) ((HashMap) c1271180jBU.LIZ).get(EnumC1270220j9w.WORK_THREAD);
        }
        if (c1271200jBW != null && c1271200jBW.LIZ != null) {
            z = c1271200jBW.LIZIZ;
        } else {
            z = false;
        }
        if (z) {
            safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(c1271200jBW.LIZJ, "TTLSRTCInputQueueThread");
        } else {
            safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "TTLSRTCInputQueueThread");
        }
        this.LIZLLL = safeHandlerThreadLIZIZ;
        safeHandlerThreadLIZIZ.start();
    }
}

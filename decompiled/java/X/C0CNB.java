package X;

import Y.ARunnableS84S0000000_4;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0CNB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNB {
    public static final List<C0CNC> LIZ = new ArrayList();
    public static volatile boolean LIZIZ = false;
    public static volatile boolean LIZJ = false;
    public static volatile boolean LIZLLL = false;

    public static void LIZ() {
        ArrayList<C0CNC> arrayList;
        LIZIZ = true;
        List<C0CNC> list = LIZ;
        synchronized (list) {
            try {
                arrayList = new ArrayList(list);
                ((ArrayList) list).clear();
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        for (C0CNC c0cnc : arrayList) {
            try {
                C786410Ut5.f3(c0cnc.LIZ, c0cnc.LIZIZ);
            } catch (Throwable th) {
            }
        }
    }

    public static void LIZIZ() {
        if (LIZLLL) {
            return;
        }
        synchronized (C0CNB.class) {
            try {
                if (!LIZLLL) {
                    try {
                        LIZJ = C12877052d.LIZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        LIZJ = false;
                    }
                    if (LIZJ) {
                        try {
                            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, new BPEAHandler(Looper.getMainLooper()), new ARunnableS84S0000000_4(5));
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                    LIZLLL = true;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }
}

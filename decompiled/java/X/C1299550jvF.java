package X;

import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.lynx.tasm.base.TraceEvent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299550jvF {
    public static RunnableC1299580jvI LIZJ;
    public static C1522030pi5 LIZLLL;
    public static InterfaceC1299540jvE LJ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1299570jvH());
    public static int LJI = 3;

    public static SharedPreferences LIZIZ() {
        return (SharedPreferences) LJFF.getValue();
    }

    public static void LIZ(EnumC1299600jvK enumC1299600jvK) {
        TraceEvent.LJIIJ(1L, "LynxSettingsDownloader.fetchSettings.enter");
        InterfaceC1299540jvE interfaceC1299540jvE = LJ;
        if (interfaceC1299540jvE == null) {
            interfaceC1299540jvE = null;
        }
        interfaceC1299540jvE.fetchSettings(new C1299560jvG(enumC1299600jvK));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0jvI, java.lang.Runnable] */
    public static void LIZJ(long j) {
        RunnableC1299580jvI runnableC1299580jvI = LIZJ;
        if (runnableC1299580jvI != null) {
            LIZIZ.removeCallbacks(runnableC1299580jvI);
        }
        ?? r1 = new Runnable() { // from class: X.0jvI
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LynxSettingsDownloader@5223.schedule$1L");
                new BPEAThread(new Runnable() { // from class: X.0jvJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("LynxSettingsDownloader@5223.schedule$lambda-3$1L");
                        C1299550jvF.LIZ(EnumC1299600jvK.TIMER);
                        C1C7U.LIZIZ("LynxSettingsDownloader@5223.schedule$lambda-3$1L");
                    }
                }).start();
                C1C7U.LIZIZ("LynxSettingsDownloader@5223.schedule$1L");
            }
        };
        LIZJ = r1;
        C786410Ut5.LJLIIL(j, LIZIZ, r1);
    }
}

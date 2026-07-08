package X;

import Y.ARunnableS118S0100000_18;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.task.resaltas.HeartbeatSamplingConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: renamed from: X.0gJX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160850gJX {
    public final HeartbeatSamplingConfig LIZ;
    public final InterfaceC1631620sYq<String, String, Map<String, ? extends Object>, Unit> LIZIZ;
    public final BPEAHandler LIZJ;
    public final long LIZLLL;
    public final AtomicBoolean LJ;
    public volatile boolean LJFF;
    public volatile int LJI;
    public volatile int LJII;
    public final ARunnableS118S0100000_18 LJIIIIZZ;

    public C1160850gJX(HeartbeatSamplingConfig heartbeatSamplingConfig, AwS667S0100000_18 awS667S0100000_18) {
        this.LIZ = heartbeatSamplingConfig;
        this.LIZIZ = awS667S0100000_18;
        HandlerThread handlerThread = new HandlerThread("resaltas-heartbeat");
        handlerThread.start();
        this.LIZJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        long j = heartbeatSamplingConfig.intervalMs;
        this.LIZLLL = j < 1000 ? 1000L : j;
        this.LJ = new AtomicBoolean(false);
        this.LJIIIIZZ = new ARunnableS118S0100000_18(this, 80);
    }
}

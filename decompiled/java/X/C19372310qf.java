package X;

import Y.ARunnableS129S0100000_29;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.task.resaltas.AnrLevelSamplingConfig;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: renamed from: X.10qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19372310qf {
    public final AnrLevelSamplingConfig LIZ;
    public final InterfaceC1631620sYq<String, String, Map<String, ? extends Object>, Unit> LIZIZ;
    public final BPEAHandler LIZJ;
    public final long LIZLLL;
    public final AtomicBoolean LJ;
    public C19372210qe LJFF;
    public final ARunnableS129S0100000_29 LJI;
    public final ARunnableS129S0100000_29 LJII;

    public final void LIZ() {
        if (this.LJFF == null) {
            return;
        }
        this.LJFF = null;
        this.LIZJ.removeCallbacks(this.LJI);
        this.LIZJ.removeCallbacks(this.LJII);
    }

    public C19372310qf(AnrLevelSamplingConfig anrLevelSamplingConfig, AwS667S0100000_18 awS667S0100000_18) {
        this.LIZ = anrLevelSamplingConfig;
        this.LIZIZ = awS667S0100000_18;
        HandlerThread handlerThread = new HandlerThread("resaltas-anr-level");
        handlerThread.start();
        this.LIZJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        long j = anrLevelSamplingConfig.intervalMs;
        this.LIZLLL = j < 500 ? 500L : j;
        this.LJ = new AtomicBoolean(false);
        this.LJI = new ARunnableS129S0100000_29(this, 173);
        this.LJII = new ARunnableS129S0100000_29(this, 174);
    }
}

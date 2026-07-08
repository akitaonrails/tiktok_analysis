package X;

import Y.ARunnableS129S0100000_29;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.task.resaltas.PeriodicSamplingConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS667S0100000_18;

/* JADX INFO: renamed from: X.10qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19371910qb {
    public final PeriodicSamplingConfig LIZ;
    public final InterfaceC1631620sYq<String, String, Map<String, ? extends Object>, Unit> LIZIZ;
    public final BPEAHandler LIZJ;
    public C19372010qc LIZLLL;
    public final long LJ;
    public final ARunnableS129S0100000_29 LJFF;
    public final ARunnableS129S0100000_29 LJI;

    public final void LIZ() {
        if (this.LIZLLL == null) {
            return;
        }
        this.LIZLLL = null;
        this.LIZJ.removeCallbacks(this.LJFF);
        this.LIZJ.removeCallbacks(this.LJI);
    }

    public C19371910qb(PeriodicSamplingConfig periodicSamplingConfig, AwS667S0100000_18 awS667S0100000_18) {
        this.LIZ = periodicSamplingConfig;
        this.LIZIZ = awS667S0100000_18;
        HandlerThread handlerThread = new HandlerThread("resaltas-periodic");
        handlerThread.start();
        this.LIZJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        long j = periodicSamplingConfig.intervalMs;
        this.LJ = j < 200 ? 200L : j;
        this.LJFF = new ARunnableS129S0100000_29(this, 175);
        this.LJI = new ARunnableS129S0100000_29(this, 176);
    }
}

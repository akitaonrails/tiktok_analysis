package X;

import Y.ARunnableS129S0100000_29;
import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.task.resaltas.TargetedSamplingConfig;
import com.ss.android.ugc.aweme.task.resaltas.WindowConfig;
import java.security.SecureRandom;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10qh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19372510qh {
    public final Context LIZ;
    public final TargetedSamplingConfig LIZIZ;
    public final InterfaceC19372610qi LIZJ;
    public final BPEAHandler LIZLLL;
    public final SecureRandom LJ;
    public volatile C19372110qd LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public final ARunnableS129S0100000_29 LJIIIIZZ;

    public final C0VSJ LIZ() {
        this.LJII = true;
        if (this.LJFF != null) {
            this.LJFF = null;
            this.LIZLLL.removeCallbacksAndMessages(null);
        }
        if (!this.LJI) {
            return null;
        }
        try {
            this.LIZJ.LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            String strLIZJ = this.LIZJ.LIZJ();
            if (strLIZJ == null) {
                return null;
            }
            C0VSJ c0vsj = new C0VSJ(strLIZJ);
            if (c0vsj.isDirectory()) {
                return c0vsj;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return null;
    }

    public final void LIZIZ(String str, String str2) {
        if (this.LJII) {
            return;
        }
        C19372110qd c19372110qd = this.LJFF;
        if (c19372110qd != null) {
            WindowConfig windowConfig = c19372110qd.LIZ;
            String str3 = windowConfig.endScene;
            if (str3 != null && windowConfig.endState != null && u.LJJIIJZLJL(str, str3, false) && Intrinsics.LJFF(str2, windowConfig.endState) && this.LJFF != null) {
                this.LJFF = null;
                this.LIZLLL.removeCallbacks(this.LJIIIIZZ);
                C786410Ut5.LJJZZIII(this.LIZLLL, new ARunnableS129S0100000_29(this, 178));
                return;
            }
            return;
        }
        for (WindowConfig windowConfig2 : this.LIZIZ.windows) {
            if (windowConfig2.startScene.length() > 0 && u.LJJIIJZLJL(str, windowConfig2.startScene, false) && Intrinsics.LJFF(str2, windowConfig2.startState)) {
                float fNextFloat = this.LJ.nextFloat();
                TargetedSamplingConfig targetedSamplingConfig = this.LIZIZ;
                if (fNextFloat < targetedSamplingConfig.sampleRate) {
                    try {
                        if (this.LIZJ.LIZIZ(this.LIZ, targetedSamplingConfig.dumpStack)) {
                            Npth.addTag("resaltas_checker", "true");
                            this.LJI = true;
                            this.LJFF = new C19372110qd(windowConfig2, SystemClock.elapsedRealtime());
                            long j = windowConfig2.timeoutMs;
                            if (j > 0) {
                                C786410Ut5.LJLIIL(j, this.LIZLLL, this.LJIIIIZZ);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                }
                return;
            }
        }
    }

    public C19372510qh(Context context, TargetedSamplingConfig targetedSamplingConfig, InterfaceC19372610qi interfaceC19372610qi) {
        this.LIZ = context;
        this.LIZIZ = targetedSamplingConfig;
        this.LIZJ = interfaceC19372610qi;
        HandlerThread handlerThread = new HandlerThread("resaltas-sampling");
        handlerThread.start();
        this.LIZLLL = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LJ = new SecureRandom();
        this.LJIIIIZZ = new ARunnableS129S0100000_29(this, 177);
    }
}

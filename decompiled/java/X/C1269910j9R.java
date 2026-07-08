package X;

import Y.ARunnableS120S0100000_20;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.lyrax.net.LyraxNetworkQuality;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0j9R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269910j9R {
    public HandlerThread LIZJ;
    public BPEAHandler LIZLLL;
    public boolean LJFF;
    public final CopyOnWriteArrayList<InterfaceC1269920j9S> LIZ = new CopyOnWriteArrayList<>();
    public volatile C1269820j9I LIZIZ = new C1269820j9I(0, LyraxNetworkQuality.UNKNOWN.value(), 0);
    public final ARunnableS120S0100000_20 LJ = new ARunnableS120S0100000_20(this, 205);

    public final void LIZLLL() {
        if (this.LJFF) {
            return;
        }
        HandlerThread handlerThread = this.LIZJ;
        if (handlerThread == null || !handlerThread.isAlive() || this.LIZLLL == null) {
            HandlerThread handlerThread2 = new HandlerThread("LyraxNetQualityPoll");
            this.LIZJ = handlerThread2;
            handlerThread2.start();
            this.LIZLLL = new BPEAHandler(C786410Ut5.W2(this.LIZJ));
        }
        BPEAHandler bPEAHandler = this.LIZLLL;
        if (bPEAHandler == null) {
            return;
        }
        this.LJFF = true;
        bPEAHandler.removeCallbacks(this.LJ);
        LIZIZ();
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LIZLLL, this.LJ);
    }

    public final void LIZIZ() {
        try {
            int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
            if (effectiveConnectionType < -1 || effectiveConnectionType > 9) {
                effectiveConnectionType = 9;
            }
            if (effectiveConnectionType != this.LIZIZ.LIZJ) {
                LJ(this.LIZIZ.LIZIZ, effectiveConnectionType);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final synchronized void LIZ(InterfaceC1269920j9S interfaceC1269920j9S) {
        if (interfaceC1269920j9S == null) {
            return;
        }
        if (this.LIZ.contains(interfaceC1269920j9S)) {
            return;
        }
        this.LIZ.add(interfaceC1269920j9S);
        if (this.LIZ.size() == 1) {
            LIZLLL();
        }
    }

    public final synchronized void LIZJ(InterfaceC1269920j9S interfaceC1269920j9S) {
        if (interfaceC1269920j9S == null) {
            return;
        }
        this.LIZ.remove(interfaceC1269920j9S);
        if (this.LIZ.isEmpty() && this.LJFF) {
            BPEAHandler bPEAHandler = this.LIZLLL;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacks(this.LJ);
            }
            this.LJFF = false;
            this.LIZIZ = new C1269820j9I(0, LyraxNetworkQuality.UNKNOWN.value(), 0);
        }
    }

    public final void LJ(int i, int i2) {
        int i3;
        synchronized (this) {
            try {
                C1269820j9I c1269820j9I = this.LIZIZ;
                LyraxNetworkQuality lyraxNetworkQuality = LyraxNetworkQuality.UNKNOWN;
                if (i < lyraxNetworkQuality.value() || i > LyraxNetworkQuality.DOWN.value()) {
                    i = lyraxNetworkQuality.value();
                }
                int iMax = -1;
                if (i2 < -1 || i2 > 9) {
                    i2 = 9;
                }
                int i4 = 3;
                boolean z = false;
                switch (i) {
                    case 1:
                    case 2:
                        i3 = 1;
                        break;
                    case 3:
                    case 4:
                        i3 = 2;
                        break;
                    case 5:
                        i3 = 3;
                        break;
                    case 6:
                        i3 = -1;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                switch (i2) {
                    case -1:
                    case 1:
                        i4 = -1;
                        break;
                    case 0:
                    default:
                        i4 = 0;
                        break;
                    case 2:
                        break;
                    case 3:
                        i4 = 2;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        i4 = 1;
                        break;
                }
                if (i3 != -1 && i4 != -1) {
                    iMax = i3 == 0 ? i4 : i4 == 0 ? i3 : Math.max(i3, i4);
                }
                C1269820j9I c1269820j9I2 = new C1269820j9I(iMax, i, i2);
                if (c1269820j9I.LIZ == iMax && c1269820j9I.LIZIZ == i && c1269820j9I.LIZJ == i2) {
                    return;
                }
                this.LIZIZ = c1269820j9I2;
                if (c1269820j9I.LIZ != iMax) {
                    z = true;
                }
                if (z) {
                    Iterator<InterfaceC1269920j9S> it2 = this.LIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(c1269820j9I2.LIZ);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

package Y;

import J.N;
import X.C0POE;
import X.C1499180p7E;
import X.C1499230p7J;
import X.C1515620pXk;
import X.C1515820pY4;
import X.C1526500ppI;
import X.C1533810q15;
import X.C1534050q1T;
import X.C1550740qSO;
import X.C1551330qTL;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1499200p7G;
import X.InterfaceC1550700qSK;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ttnet.org.chromium.base.JavaHandlerThread;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS23S0100100_23 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Pair<String, ? extends Throwable> pair = ((C1534050q1T) this.l0).LLILZ;
        if (pair != null) {
            C1533810q15 c1533810q15 = ((C1534050q1T) this.l0).LL.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error occurs on ");
            sbLIZ.append(pair.getFirst());
            sbLIZ.append(", error msg: ");
            sbLIZ.append(pair.getSecond());
            c1533810q15.LJ(3, C2188811AlT.LIZIZ(sbLIZ));
        }
        C1534050q1T c1534050q1T = (C1534050q1T) this.l0;
        Long l = c1534050q1T.LLILLL;
        if (l != null) {
            long j = this.j1;
            l.longValue();
            c1534050q1T.LL.LIZJ.LJFF(j, "stream");
        }
    }

    public static final void run$0(ARunnableS23S0100100_23 aRunnableS23S0100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("Compressor@97d.compressDirToZstdAsync$2");
        try {
            C1551330qTL c1551330qTL = C1551330qTL.LIZ;
            C1550740qSO c1550740qSO = new C1550740qSO(aRunnableS23S0100100_23.j1, (InterfaceC1550700qSK) aRunnableS23S0100100_23.l0);
            c1551330qTL.getClass();
            ReentrantLock reentrantLock = C1551330qTL.LJFF;
            reentrantLock.lock();
            try {
                c1550740qSO.invoke();
                reentrantLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1551330qTL.LJFF.unlock();
                throw th;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Compressor@97d.compressDirToZstdAsync$2");
    }

    public static final void run$1(ARunnableS23S0100100_23 aRunnableS23S0100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("JsWorker@ae4e.initWebAssembly$1");
        try {
            JsWorker.nativeInitQJSWebAssembly(aRunnableS23S0100100_23.j1, ((JsWorker) aRunnableS23S0100100_23.l0).mNativeWorkerPtr.get());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsWorker@ae4e.initWebAssembly$1");
    }

    public static final void run$2(ARunnableS23S0100100_23 aRunnableS23S0100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("JavaHandlerThread@e31d.quitThreadSafely$1");
        try {
            ((JavaHandlerThread) aRunnableS23S0100100_23.l0).LIZ.quit();
            N.MSKUcgE4(aRunnableS23S0100100_23.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JavaHandlerThread@e31d.quitThreadSafely$1");
    }

    public static final void run$3(ARunnableS23S0100100_23 aRunnableS23S0100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onLosing$1");
        try {
            InterfaceC1499200p7G interfaceC1499200p7G = ((C1499230p7J) aRunnableS23S0100100_23.l0).LIZIZ.LIZLLL;
            ((C1499180p7E) interfaceC1499200p7G).LIZ.LJFF(aRunnableS23S0100100_23.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onLosing$1");
    }

    public static final void run$4(ARunnableS23S0100100_23 aRunnableS23S0100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("WsMonitor@c22f.monitorStart$1$onWsStatusChanged$1");
        try {
            ((C1526500ppI) aRunnableS23S0100100_23.l0).LLILLJJLI.LIZ(aRunnableS23S0100100_23.j1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WsMonitor@c22f.monitorStart$1$onWsStatusChanged$1");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void run$5(ARunnableS23S0100100_23 aRunnableS23S0100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadChunkHelper@467f.preloadChunk$1");
        try {
            final C1515620pXk c1515620pXk = (C1515620pXk) aRunnableS23S0100100_23.l0;
            C1515820pY4<T> c1515820pY4 = c1515620pXk.LIZ;
            final long j = aRunnableS23S0100100_23.j1;
            c1515820pY4.LIZLLL((C0POE<T>) new C0POE<Object>() { // from class: X.0pXl
                @Override // X.C0POE
                public final void onComplete() {
                    c1515620pXk.LIZIZ.add(new C1515640pXm(1, null));
                }

                @Override // X.C0POE
                public final void onFailed(Throwable th) {
                    c1515620pXk.LIZIZ.add(new C1515640pXm(-1, th));
                }

                @Override // X.C0POE
                public final void onNext(Object obj) {
                    InterfaceC1196330hEl interfaceC1196330hEl;
                    if (j > 0 && (obj instanceof InterfaceC1196330hEl) && (interfaceC1196330hEl = (InterfaceC1196330hEl) obj) != null) {
                        interfaceC1196330hEl.setPreloadRealNetDurationMs(SystemClock.elapsedRealtime() - j);
                    }
                    c1515620pXk.LIZIZ.add(new C1515640pXm(0, obj));
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadChunkHelper@467f.preloadChunk$1");
    }

    public static final void run$6(ARunnableS23S0100100_23 aRunnableS23S0100100_23) {
        boolean zLIZ;
        C1C7U.LIZ("ForestStreamWrapper@1b1a.close$4$1");
        try {
            aRunnableS23S0100100_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ForestStreamWrapper@1b1a.close$4$1");
    }

    public ARunnableS23S0100100_23(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}

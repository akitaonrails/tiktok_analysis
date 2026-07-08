package X;

import android.app.Application;
import android.hardware.Sensor;
import android.os.Looper;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.util.PlayerMainHandler;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.radar.IRadarTransmitter;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0oUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475000oUE {
    public static Application LIZ;
    public static IAppConfig LJFF;
    public static IMonitor LJI;
    public static IEvent LJII;
    public static IALog LJIIIIZZ;
    public static Sensor LJIIIZ;
    public static IRadarTransmitter LJIIJ;
    public static Cert LJIIJJI;
    public static Cert LJIIL;
    public static Cert LJIILIIL;
    public static volatile C1474960oUA LJIILJJIL;
    public static final Object LIZIZ = new Object();
    public static volatile ExecutorService LIZJ = null;
    public static final ExecutorService LIZLLL = C807400Vlq.LIZ();
    public static final PlayerMainHandler LJ = new PlayerMainHandler(Looper.getMainLooper());
    public static int LJIILL = -1;

    public static IALog LIZ() {
        IALog iALog = LJIIIIZZ;
        return iALog == null ? (IALog) InjectedConfigManager.getConfig(IALog.class) : iALog;
    }

    public static IAppConfig LIZIZ() {
        IAppConfig iAppConfig = LJFF;
        return iAppConfig == null ? (IAppConfig) InjectedConfigManager.getConfig(IAppConfig.class) : iAppConfig;
    }

    public static IEvent LIZJ() {
        IEvent iEvent = LJII;
        return iEvent == null ? (IEvent) InjectedConfigManager.getConfig(IEvent.class) : iEvent;
    }

    public static ExecutorService LJI() {
        if (LIZJ == null) {
            synchronized (LIZIZ) {
                try {
                    if (LIZJ == null) {
                        LIZJ = C786410Ut5.d4(1);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public static Cert LJII() {
        if (LJIILIIL == null) {
            LJIILIIL = LIZIZ().getVideoFrameCert();
        }
        return LJIILIIL;
    }

    public static IMonitor LJIIIIZZ() {
        IMonitor iMonitor = LJI;
        return iMonitor == null ? (IMonitor) InjectedConfigManager.getConfig(IMonitor.class) : iMonitor;
    }

    public static IRadarTransmitter LJIIIZ() {
        IRadarTransmitter iRadarTransmitter = LJIIJ;
        return iRadarTransmitter == null ? (IRadarTransmitter) InjectedConfigManager.getConfig(IRadarTransmitter.class) : iRadarTransmitter;
    }

    public static Application LIZLLL() {
        return LIZ;
    }

    public static ExecutorService LJ() {
        return LIZLLL;
    }

    public static Cert LJFF(boolean z) {
        if (z) {
            if (LJIIJJI == null) {
                LJIIJJI = LIZIZ().getLightSensorCert(true);
            }
            return LJIIJJI;
        }
        if (LJIIL == null) {
            LJIIL = LIZIZ().getLightSensorCert(false);
        }
        return LJIIL;
    }
}

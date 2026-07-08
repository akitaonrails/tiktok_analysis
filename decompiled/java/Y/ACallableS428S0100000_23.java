package Y;

import X.C036E;
import X.C0O0L;
import X.C0R1F;
import X.C0XI7;
import X.C1285320jYI;
import X.C1478850oaR;
import X.C1480850odf;
import X.C1482520ogM;
import X.C1482640ogY;
import X.C1554450qYN;
import X.C15O7;
import X.C1AF0;
import X.C1C7U;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2213981Bky;
import X.C582130MsN;
import X.C786410Ut5;
import X.C797960VRy;
import X.C804440Vh4;
import X.C844470XAv;
import X.EnumC1493070oxN;
import X.EnumC804620VhM;
import X.InterfaceC1481870ofJ;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTWiFiCellSwitcher;
import com.ss.android.ugc.aweme.common.net.NetWorkStateReceiver;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import com.ss.android.ugc.aweme.network.ITrafficStatistics;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ttm.player.TTPlayerClient;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes24.dex */
public class ACallableS428S0100000_23 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return call$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return call$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return call$11(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        C1C7U.LIZ("SmartFeedAdUIServiceImpl@b7a3.getPredictTaskIndex$2");
        C1AF0.LJ((Throwable) aCallableS428S0100000_23.l0);
        C1C7U.LIZIZ("SmartFeedAdUIServiceImpl@b7a3.getPredictTaskIndex$2");
        return null;
    }

    public static final Object call$1(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        C1C7U.LIZ("SmartFeedAdUIServiceImpl@b7a3.startSmartAdUIJudge$1$onResult$1");
        C0R1F.LIZLLL("use_last_predict_label", ((SmartFeedAdUIServiceImpl) aCallableS428S0100000_23.l0).LIZLLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartFeedAdUIServiceImpl@b7a3.startSmartAdUIJudge$1$onResult$1");
        return unit;
    }

    public static final Object call$10(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        HashMap mapLIZIZ;
        C1C7U.LIZ("SimReporterImpl@9443.reportVideoPlayFailEvent$2");
        InterfaceC1481870ofJ interfaceC1481870ofJ = ((C1482520ogM) aCallableS428S0100000_23.l0).LLILZ;
        if (interfaceC1481870ofJ != null) {
            mapLIZIZ = interfaceC1481870ofJ.LIZIZ();
        } else {
            mapLIZIZ = null;
        }
        C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoPlayFailEvent$2");
        return mapLIZIZ;
    }

    public static final Object call$11(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        HashMap mapLIZIZ;
        C1C7U.LIZ("SimReporterImpl@9443.reportVideoFirstFrameEvent$2");
        InterfaceC1481870ofJ interfaceC1481870ofJ = ((C1482520ogM) aCallableS428S0100000_23.l0).LLILZ;
        if (interfaceC1481870ofJ != null) {
            mapLIZIZ = interfaceC1481870ofJ.LIZIZ();
        } else {
            mapLIZIZ = null;
        }
        C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoFirstFrameEvent$2");
        return mapLIZIZ;
    }

    public static final Object call$2(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        C1C7U.LIZ("SmartFeedPreloadServiceImpl@bf36.getCurrentSmartPreloadStrategyConfig$1");
        C1AF0.LJ((Throwable) aCallableS428S0100000_23.l0);
        C1C7U.LIZIZ("SmartFeedPreloadServiceImpl@bf36.getCurrentSmartPreloadStrategyConfig$1");
        return null;
    }

    public static final Object call$3(ACallableS428S0100000_23 aCallableS428S0100000_23) throws JSONException {
        C1C7U.LIZ("SpeedModeServiceImpl@2150.start$1");
        final SpeedModeServiceImpl speedModeServiceImpl = (SpeedModeServiceImpl) aCallableS428S0100000_23.l0;
        speedModeServiceImpl.LJII();
        if (!speedModeServiceImpl.LIZ && speedModeServiceImpl.enable() && SpeedModeServiceImpl.LIZJ()) {
            speedModeServiceImpl.LJI.getValue().getClass();
            TTWiFiCellSwitcher.inst().start();
            ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).observeMultiNetworkChange(new C0XI7() { // from class: X.0oxI
                @Override // X.C0XI7
                public final void LIZ(EnumC1493070oxN enumC1493070oxN) {
                    if (enumC1493070oxN == EnumC1493070oxN.DEFAULT_WIFI_WITH_CELLULAR_UP) {
                        if (speedModeServiceImpl.LJ) {
                            speedModeServiceImpl.LJ = false;
                            C15O7.LJIIIIZZ(60000L).LIZLLL(new C1554450qYN(speedModeServiceImpl, 0));
                        } else {
                            speedModeServiceImpl.LJ().LIZLLL();
                        }
                    } else {
                        speedModeServiceImpl.LJ().LJ();
                    }
                    if (enumC1493070oxN == EnumC1493070oxN.DEFAULT_WIFI_WITH_CELLULAR_DOWN && !speedModeServiceImpl.LIZIZ) {
                        C797960VRy.LIZ();
                        speedModeServiceImpl.LIZIZ = true;
                    }
                }
            });
            EnumC1493070oxN multiNetworkState = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getMultiNetworkState();
            if (multiNetworkState == EnumC1493070oxN.DEFAULT_WIFI_WITH_CELLULAR_UP) {
                if (speedModeServiceImpl.LJ) {
                    speedModeServiceImpl.LJ = false;
                    C15O7.LJIIIIZZ(60000L).LIZLLL(new C1554450qYN(speedModeServiceImpl, 1));
                } else {
                    speedModeServiceImpl.LJ().LIZLLL();
                }
            }
            if (multiNetworkState == EnumC1493070oxN.DEFAULT_WIFI_WITH_CELLULAR_DOWN) {
                C797960VRy.LIZ();
            }
            speedModeServiceImpl.LIZ = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpeedModeServiceImpl@2150.start$1");
        return unit;
    }

    public static final Object call$4(ACallableS428S0100000_23 aCallableS428S0100000_23) throws JSONException {
        C1C7U.LIZ("SpeedModeServiceImpl@2150.stop$1");
        SpeedModeServiceImpl speedModeServiceImpl = (SpeedModeServiceImpl) aCallableS428S0100000_23.l0;
        speedModeServiceImpl.LJII();
        if (speedModeServiceImpl.LIZ && speedModeServiceImpl.enable()) {
            speedModeServiceImpl.LJI.getValue().getClass();
            TTWiFiCellSwitcher.inst().stop();
            speedModeServiceImpl.LJ().LJ();
            speedModeServiceImpl.LIZ = false;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpeedModeServiceImpl@2150.stop$1");
        return unit;
    }

    public static final Object call$5(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        C1C7U.LIZ("TTPlayerClient@76d4.onSurfaceDestroyed$1");
        try {
            ((TTPlayerClient) aCallableS428S0100000_23.l0).LLJJIII.lockInterruptibly();
            try {
                if (((TTPlayerClient) aCallableS428S0100000_23.l0).LJJIJIIJIL()) {
                    ((TTPlayerClient) aCallableS428S0100000_23.l0).LLJJJ.LJII(null);
                }
                ((TTPlayerClient) aCallableS428S0100000_23.l0).LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((TTPlayerClient) aCallableS428S0100000_23.l0).LLJJIII.unlock();
                throw th;
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = TTPlayerClient.LLLI;
            C1285320jYI.LIZ(aCallableS428S0100000_23, "TTPlayerClient", "mPlayer setsurface null failed.");
        }
        C1C7U.LIZIZ("TTPlayerClient@76d4.onSurfaceDestroyed$1");
        return "OK";
    }

    public static final Object call$6(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        NetWorkStateReceiver netWorkStateReceiver = (NetWorkStateReceiver) aCallableS428S0100000_23.l0;
        netWorkStateReceiver.getClass();
        C1C7U.LIZ("NetWorkStateReceiver@83ed.com_ss_android_ugc_aweme_common_net_NetWorkStateReceiver__onReceive$___twin___$1L");
        C844470XAv.LIZ.getClass();
        NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(C844470XAv.LIZ(), "connectivity"));
        C804440Vh4 c804440Vh4 = C036E.LIZ;
        c804440Vh4.getClass();
        synchronized (C804440Vh4.class) {
            try {
                c804440Vh4.LIZ = networkInfoLJIJ;
                c804440Vh4.LJFF(networkInfoLJIJ);
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        EnumC804620VhM enumC804620VhM = c804440Vh4.LIZIZ;
        if (enumC804620VhM != netWorkStateReceiver.LIZ) {
            C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().setForceHttps(false);
            C2213981Bky.LIZIZ.getApplicationContext();
            try {
            } catch (Exception e) {
            }
            if (!c804440Vh4.LIZIZ()) {
                c804440Vh4.LJ(C0O0L.NOT_AVAILABLE);
            } else {
                c804440Vh4.LJ(C0O0L.AVAILABLE);
            }
        }
        if (netWorkStateReceiver.LIZ != EnumC804620VhM.UNKNOWN) {
            NetWorkStateReceiver.LIZJ = true;
        }
        netWorkStateReceiver.LIZ = enumC804620VhM;
        C1C7U.LIZIZ("NetWorkStateReceiver@83ed.com_ss_android_ugc_aweme_common_net_NetWorkStateReceiver__onReceive$___twin___$1L");
        return null;
    }

    public static final Object call$7(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        C1478850oaR[] c1478850oaRArr = (C1478850oaR[]) aCallableS428S0100000_23.l0;
        C1C7U.LIZ("BaseFeedListPreloadHandler@7d3b.reportTrafficStatistics$1L");
        int length = c1478850oaRArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                C1478850oaR c1478850oaR = c1478850oaRArr[length];
                long j = c1478850oaR.LLILLL;
                long j2 = (long) ((c1478850oaR.LL * j) / 8000.0d);
                String strLJII = C2211631BhB.LJII();
                ITrafficStatistics iTrafficStatistics = (ITrafficStatistics) ServiceManager.get().getService(ITrafficStatistics.class);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1478850oaR.LLILZ);
                sbLIZ.append("_video");
                iTrafficStatistics.addRecord(j2, strLJII, "video", j, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C1C7U.LIZIZ("BaseFeedListPreloadHandler@7d3b.reportTrafficStatistics$1L");
                return null;
            }
        }
    }

    public static final Object call$8(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        C1C7U.LIZ("PlayerImplOrigin@16d1.attach$1");
        C1482640ogY c1482640ogYLIZIZ = C1482640ogY.LIZIZ((FrameLayout) aCallableS428S0100000_23.l0, C1480850odf.LIZJ.isUseSurfaceView());
        C1C7U.LIZIZ("PlayerImplOrigin@16d1.attach$1");
        return c1482640ogYLIZIZ;
    }

    public static final Object call$9(ACallableS428S0100000_23 aCallableS428S0100000_23) {
        HashMap mapLIZIZ;
        C1C7U.LIZ("SimReporterImpl@9443.reportVideoStopEvent$2");
        InterfaceC1481870ofJ interfaceC1481870ofJ = ((C1482520ogM) aCallableS428S0100000_23.l0).LLILZ;
        if (interfaceC1481870ofJ != null) {
            mapLIZIZ = interfaceC1481870ofJ.LIZIZ();
        } else {
            mapLIZIZ = null;
        }
        C1C7U.LIZIZ("SimReporterImpl@9443.reportVideoStopEvent$2");
        return mapLIZIZ;
    }

    public ACallableS428S0100000_23(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ACallableS428S0100000_23(C1482520ogM c1482520ogM, String str, int i) {
        this.$t = i;
        this.l0 = c1482520ogM;
    }
}

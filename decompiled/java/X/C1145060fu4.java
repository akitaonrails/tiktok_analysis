package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.live.ai.api.pitaya.feature.ILiveFeaturesService;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fu4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145060fu4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZJ() {
        Object c098200Yq;
        LiveClientTriggerConfig liveClientTriggerConfig = LiveClientTriggerConfig.INSTANCE;
        if (liveClientTriggerConfig.enable()) {
            C01GW c01gw = C20430714wz.LIZ;
            AFwS205S0000000_17 aFwS205S0000000_17 = AFwS205S0000000_17.get$arr$(193);
            AFwS205S0000000_17 aFwS205S0000000_172 = AFwS205S0000000_17.get$arr$(194);
            try {
                C01GW c01gw2 = C20430714wz.LIZ;
                C157V c157v = (C157V) c01gw2.getValue();
                if (c157v != null) {
                    C01GW c01gw3 = C20430714wz.LIZIZ;
                    ((IHostAppContext) c01gw3.getValue()).context();
                    ((IHostAppContext) c01gw3.getValue()).getServerDeviceId();
                    C465680INy.LIZ();
                    ((IHostAppContext) c01gw3.getValue()).getChannel();
                    c157v.LJIL();
                    int iDelayDownloadPkgs = liveClientTriggerConfig.delayDownloadPkgs();
                    if (iDelayDownloadPkgs <= 0 || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        C157V c157v2 = (C157V) c01gw2.getValue();
                        if (c157v2 != null) {
                            c157v2.LJFF();
                        }
                    } else {
                        C11S5.LIZ.LIZJ(new Runnable() { // from class: X.0ere
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("LiveCepEnv@a829.setupCepEnv$1$1");
                                try {
                                    C157V c157v3 = (C157V) C20430714wz.LIZ.getValue();
                                    if (c157v3 != null) {
                                        c157v3.LJFF();
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("LiveCepEnv@a829.setupCepEnv$1$1");
                            }
                        }, iDelayDownloadPkgs, TimeUnit.SECONDS);
                    }
                    aFwS205S0000000_17.invoke();
                } else {
                    aFwS205S0000000_172.getClass();
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                aFwS205S0000000_172.getClass();
            }
        }
        LivePitayaEnv.LIZIZ();
    }

    public static final void LIZ(Fragment fragment, DataChannel dataChannel) {
        if (LiveClientTriggerConfig.INSTANCE.enable()) {
            ((ILiveTriggerService) C1145050fu3.LIZ.getValue()).g0(fragment, dataChannel);
        }
        ((ILiveFeaturesService) C1145070fu5.LIZ.getValue()).g0(fragment, dataChannel);
    }

    public static final void LIZIZ(Fragment fragment, DataChannel dataChannel) {
        LivePitayaEnv.LJII.clear();
        LivePitayaEnv.LJIIIIZZ.clear();
        ((C1ATJ) LivePitayaEnv.LJIIL()).LJII();
        if (LiveClientTriggerConfig.INSTANCE.enable()) {
            ((ILiveTriggerService) C1145050fu3.LIZ.getValue()).J9(fragment, dataChannel);
        }
        ((ILiveFeaturesService) C1145070fu5.LIZ.getValue()).J9(fragment, dataChannel);
    }
}

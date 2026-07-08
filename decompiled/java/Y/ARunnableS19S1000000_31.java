package Y;

import X.C0J0Q;
import X.C0J9X;
import X.C1083900eJQ;
import X.C1119390fEf;
import X.C1119400fEg;
import X.C1145060fu4;
import X.C1161920gLG;
import X.C1303170k15;
import X.C1851050yGl;
import X.C1C7U;
import X.C1EOY;
import X.C20337714hz;
import X.C20338514i7;
import X.C20338614i8;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C469620IbI;
import X.C476400ImE;
import X.C517110KPt;
import X.C766270U4b;
import X.C823050WQl;
import X.RunnableC514801zW;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.dynamicstrategy.IEPIStrategyService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;
import com.bytedance.android.livesdk.livesetting.performance.ApmOfflineDumpDataSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.message.IMessageService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS19S1000000_31 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1119400fEg c1119400fEgLIZIZ = C1119400fEg.LIZIZ();
        String str = this.s0;
        c1119400fEgLIZIZ.getClass();
        boolean zLJI = MethodIDManager.LJI(196650);
        if (!C1119400fEg.LIZIZ) {
            synchronized (C1119400fEg.class) {
                try {
                    if (!C1119400fEg.LIZIZ) {
                        C1119390fEf.LIZIZ[1] = SystemClock.uptimeMillis();
                        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).np2();
                        if (SettingsManager.isOptKevaSave()) {
                            ScheduledExecutorService scheduledExecutorServiceLJ = C823050WQl.LJ();
                            SettingsManager settingsManager = SettingsManager.INSTANCE;
                            Objects.requireNonNull(settingsManager);
                            scheduledExecutorServiceLJ.schedule(new ARunnableS131S0100000_31(settingsManager, 152), 0L, TimeUnit.MILLISECONDS);
                        }
                        SettingsManager.INSTANCE.init(new C476400ImE(), new C1083900eJQ(), C823050WQl.LIZIZ());
                        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerHostWS();
                        C1119400fEg.LIZLLL(str);
                        ((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).d40();
                        C20338614i8.LIZ = C1119400fEg.LIZ;
                        C20338614i8.LIZIZ = new C20338514i7();
                        ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).initZstdCompressResourceWhenSDKStart();
                        C1119400fEg.LIZJ();
                        try {
                            Method declaredMethod = Class.forName("com.bytedance.android.live.base.model.proto.ProtocolBuffersCollector").getDeclaredMethod("init", new Class[0]);
                            if (!declaredMethod.isAccessible()) {
                                declaredMethod.setAccessible(true);
                            }
                            declaredMethod.invoke(null, new Object[0]);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
                        if (c1303170k15Y22 != null) {
                            c1303170k15Y22.LJFF("LiveSDKInitP2TaskNew#linkMicDslTask");
                        }
                        C1145060fu4.LIZJ();
                        if (ApmOfflineDumpDataSetting.INSTANCE.getValue()) {
                            ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).dn0(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
                        }
                        C823050WQl.LIZJ().submit(new RunnableC514801zW(C0J0Q.APP, 44));
                        C469620IbI c469620IbI = C469620IbI.LIZ;
                        C469620IbI.LJ(false);
                        ((IEPIStrategyService) C1161920gLG.LIZJ(IEPIStrategyService.class)).Pa0();
                        new BadPhonesCommonOptTask().run();
                        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
                        GlobalContext.setApplicationContext(context);
                        try {
                            Class.forName("com.bytedance.android.livesdk.utils.LiveAppBundleUtils");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                        C0J9X.LIZ(context);
                        LiveAppBundleUtils.initCoreSOLoader();
                        C1EOY c1eoy = C1EOY.LIZ;
                        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ii2();
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                        C517110KPt.LJIIL();
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                        C517110KPt.LJIIJJI();
                        try {
                            IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                            Boolean bool = Boolean.FALSE;
                            iBroadcastService.checkScheduledLiveReplayVideoTask(true, null, bool, null, bool);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).initLiveInvitePushObserver();
                        C1851050yGl.LIZ();
                        C20337714hz.LIZJ.LIZ("live_sdk_core");
                        C1119390fEf.LIZJ[1] = SystemClock.uptimeMillis();
                        if (new SecureRandom().nextDouble() < 0.1d) {
                            C823050WQl.LIZIZ().execute(new ARunnableS10S1000000_17(str, 1));
                        }
                        C1119400fEg.LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    throw th;
                }
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void run$0(ARunnableS19S1000000_31 aRunnableS19S1000000_31) {
        boolean zLIZ;
        C1C7U.LIZ("TTLiveSDK@e12b.initP2Task$1");
        try {
            aRunnableS19S1000000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLiveSDK@e12b.initP2Task$1");
    }

    public static final void run$1(ARunnableS19S1000000_31 aRunnableS19S1000000_31) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GiftQueue client connected: ");
            sbLIZ.append(aRunnableS19S1000000_31.s0);
            C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public ARunnableS19S1000000_31(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}

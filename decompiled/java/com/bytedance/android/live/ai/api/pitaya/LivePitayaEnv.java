package com.bytedance.android.live.ai.api.pitaya;

import X.C015G;
import X.C01GW;
import X.C098200Yq;
import X.C1161920gLG;
import X.C11S5;
import X.C12825050d;
import X.C1514480pVu;
import X.C157U;
import X.C157V;
import X.C157W;
import X.C189200o6;
import X.C1ATJ;
import X.C1AWN;
import X.C1CC2;
import X.C20441214yg;
import X.C204585153n;
import X.C21406218pw;
import X.C452501pT;
import X.C465680INy;
import X.C823050WQl;
import X.C964490bCp;
import X.InterfaceC420801kM;
import X.InterfaceC500940Jki;
import X.InterfaceC964460bCm;
import Y.ARunnableS10S0001000_33;
import android.app.Activity;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.android.livesdk.livesetting.clientai.ClientAiAlgorithmPackageLaunchFilterSettings;
import com.bytedance.android.livesdk.livesetting.clientai.LivePitayaPkgUpdateStrategy;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYDIDCallback;
import com.bytedance.pitaya.api.PTYPackageFilterCallback;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.api.PTYSetupCallback;
import com.bytedance.pitaya.api.PTYUIDCallback;
import com.bytedance.pitaya.api.bean.PTYCleanStrategy;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYSetupInfo;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS66S0001000_33;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePitayaEnv {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static final CopyOnWriteArrayList<Function0<Unit>> LIZLLL = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<Function2<Integer, PTYError, Unit>> LJ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<Function0<Unit>> LJFF = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<Function2<Integer, PTYError, Unit>> LJI = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<Function0<Unit>> LJII = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<Function2<Integer, PTYError, Unit>> LJIIIIZZ = new CopyOnWriteArrayList<>();
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(7));

    public static final synchronized void LIZIZ() {
        if (LiveClientAISettings.INSTANCE.initAfterAppStart()) {
            if (LIZJ) {
                return;
            }
            LIZJ = true;
            LJFF(AFwS224S0000000_33.get$arr$(4), AFwS321S0000000_33.get$arr$(0), false, false);
            C157W.LIZJ();
        }
    }

    public static void LIZLLL() {
        Iterator<Function0<Unit>> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        Iterator<Function0<Unit>> it3 = LJFF.iterator();
        while (it3.hasNext()) {
            it3.next().invoke();
        }
        Iterator<Function0<Unit>> it4 = LJII.iterator();
        while (it4.hasNext()) {
            it4.next().invoke();
        }
        LJ();
    }

    public static void LJ() {
        LIZLLL.clear();
        LJ.clear();
        LJFF.clear();
        LJI.clear();
        LJII.clear();
        LJIIIIZZ.clear();
    }

    public static IHostAppContext LJIIJJI() {
        return (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
    }

    public static final InterfaceC964460bCm LJIIL() {
        return ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).hU0();
    }

    public static void LJIILJJIL() {
        if (!LIZIZ) {
            LiveClientAISettings liveClientAISettings = LiveClientAISettings.INSTANCE;
            if (liveClientAISettings.requestAllPkgsDelay() > 0) {
                C11S5.LIZ.LIZJ(new Runnable() { // from class: X.0bCo
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LivePitayaEnv@cdad.requestAllPkgs$1");
                        try {
                            LivePitayaEnv.LJIIL().LIZIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LivePitayaEnv@cdad.requestAllPkgs$1");
                    }
                }, liveClientAISettings.requestAllPkgsDelay(), TimeUnit.MILLISECONDS);
            } else {
                ((C1ATJ) LJIIL()).LIZIZ();
            }
        }
        if (LiveClientAISettings.INSTANCE.requestAllPkgsOnce()) {
            LIZIZ = true;
        }
    }

    public static void LIZJ(PTYError pTYError) {
        Iterator<Function2<Integer, PTYError, Unit>> it2 = LJ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(-1, pTYError);
        }
        Iterator<Function2<Integer, PTYError, Unit>> it3 = LJIIIIZZ.iterator();
        while (it3.hasNext()) {
            it3.next().invoke(-1, pTYError);
        }
        Iterator<Function2<Integer, PTYError, Unit>> it4 = LJI.iterator();
        while (it4.hasNext()) {
            it4.next().invoke(-1, pTYError);
        }
        LJ();
    }

    public static void LJII(int i) {
        InterfaceC420801kM interfaceC420801kMRegisterAppEnterForeBackgroundCallback;
        C1514480pVu c1514480pVu = C1514480pVu.LL;
        C20441214yg.LIZIZ("LivePitayaPkgUpdateStrategy", "enterLive");
        LivePitayaPkgUpdateStrategy livePitayaPkgUpdateStrategy = LivePitayaPkgUpdateStrategy.INSTANCE;
        if (livePitayaPkgUpdateStrategy.getStrategyVal() == livePitayaPkgUpdateStrategy.getONLY_IN_LIVE()) {
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext != null) {
                interfaceC420801kMRegisterAppEnterForeBackgroundCallback = iHostAppContext.registerAppEnterForeBackgroundCallback(c1514480pVu);
            } else {
                interfaceC420801kMRegisterAppEnterForeBackgroundCallback = null;
            }
            C1514480pVu.LLILZ = interfaceC420801kMRegisterAppEnterForeBackgroundCallback;
        }
        Map<String, Object> map = C015G.LIZ;
        ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).tE0();
        C12825050d.LIZJ = true;
        LJFF(new AwS66S0001000_33(i, 0), new C964490bCp(i), false, true);
        C157W.LIZJ();
        C157W.LIZIZ();
        C204585153n c204585153n = C204585153n.LIZ;
        if (C204585153n.LIZLLL()) {
            C157W.LIZIZ();
            C204585153n.LJFF();
        }
        C157W.LIZ();
        C157U c157u = C157U.LIZ;
        if (C157U.LIZLLL.enable) {
            C157W.LIZ();
            if (C157U.LJIIIIZZ()) {
                C157W.LIZ();
                c157u.LJIIJ();
            }
        }
        if (LiveClientAISettings.INSTANCE.frequentControlSettings().enableFrequentControl) {
            C21406218pw.LIZJ.start();
        }
    }

    public static final void LJIIIIZZ(Activity activity) {
        int iHashCode;
        Map<String, Object> map = C015G.LIZ;
        ((ILiveClientAIService) C1161920gLG.LIZJ(ILiveClientAIService.class)).tE0();
        C12825050d.LIZJ = true;
        if (activity != null) {
            iHashCode = activity.hashCode();
        } else {
            iHashCode = 0;
        }
        LJII(iHashCode);
    }

    public static final void LJIIIZ(LifecycleOwner lifecycleOwner) {
        int iHashCode;
        if (lifecycleOwner != null) {
            iHashCode = lifecycleOwner.hashCode();
        } else {
            iHashCode = 0;
        }
        LJII(iHashCode);
    }

    public static final void LJIIJ(LifecycleOwner lifecycleOwner) {
        int iHashCode;
        C1514480pVu c1514480pVu = C1514480pVu.LL;
        C20441214yg.LIZIZ("LivePitayaPkgUpdateStrategy", "exitLive");
        InterfaceC420801kM interfaceC420801kM = C1514480pVu.LLILZ;
        int i = 1;
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
        if (lifecycleOwner != null) {
            iHashCode = lifecycleOwner.hashCode();
        } else {
            iHashCode = 0;
        }
        C823050WQl.LIZIZ().execute(new ARunnableS10S0001000_33(iHashCode, 0));
        boolean z = LIZ;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!z) {
                i = 0;
            }
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            C1CC2.LIZJ("ttlive_pitaya_instance_can_use_monitor", jSONObject, new JSONObject(), new JSONObject());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILIIL(boolean z) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("init_status", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("init_latency", SystemClock.elapsedRealtime() - LJIIJJI().getAppFeedEndTime());
            C1CC2.LIZJ("ttlive_pitaya_instance_init_monitor", jSONObject, jSONObject2, new JSONObject());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILL(final Function0 function0, final Function1 function1) {
        final Map<String, Integer> getStickValue = ClientAiAlgorithmPackageLaunchFilterSettings.INSTANCE.getGetStickValue();
        C1AWN c1awn = new C1AWN();
        c1awn.LIZ = "1728";
        c1awn.LIZIZ = C465680INy.LIZ();
        c1awn.LIZJ = LJIIJJI().getChannel();
        c1awn.LJIIIZ = false;
        c1awn.LIZLLL = new PTYDIDCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$ptySetupInfo$1
            @Override // com.bytedance.pitaya.api.PTYDIDCallback
            public String getDid() {
                return LivePitayaEnv.LJIIJJI().getServerDeviceId();
            }
        };
        c1awn.LJ = new PTYUIDCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$ptySetupInfo$2
            @Override // com.bytedance.pitaya.api.PTYUIDCallback
            public String getUid() {
                String string;
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                return (interfaceC500940JkiUser == null || (string = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()).toString()) == null) ? CardStruct.IStatusCode.DEFAULT : string;
            }
        };
        c1awn.LJFF = new PTYPackageFilterCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$ptySetupInfo$3
            @Override // com.bytedance.pitaya.api.PTYPackageFilterCallback
            public JSONObject getFilter() {
                JSONObject jSONObject = new JSONObject();
                Map<String, Integer> map = getStickValue;
                try {
                    jSONObject.put("host_app_version", LivePitayaEnv.LJIIJJI().getVersionCode());
                    jSONObject.put("host_app_id", String.valueOf(LivePitayaEnv.LJIIJJI().appId()));
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), String.valueOf(entry.getValue().intValue()));
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return jSONObject;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return jSONObject;
                }
            }
        };
        c1awn.LJI = new PTYSettingsCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$ptySetupInfo$4
            @Override // com.bytedance.pitaya.api.PTYSettingsCallback
            public JSONObject getSettings(String str) {
                return LiveClientAISettings.INSTANCE.abParams();
            }
        };
        PTYSetupInfo pTYSetupInfo = new PTYSetupInfo(c1awn);
        C157V hostClientAiService = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getHostClientAiService();
        if (hostClientAiService != null && hostClientAiService.LIZIZ()) {
            pTYSetupInfo.setCleanStrategy(PTYCleanStrategy.Critical);
        } else {
            pTYSetupInfo.setCleanStrategy(PTYCleanStrategy.Normal);
        }
        ((IPitayaCore) LJIIIZ.getValue()).setup(LJIIJJI().context(), pTYSetupInfo, new PTYSetupCallback() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$1
            /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
            @Override // com.bytedance.pitaya.api.PTYSetupCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onResult(boolean r10, com.bytedance.pitaya.api.bean.PTYError r11) {
                /*
                    Method dump skipped, instruction units count: 373
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$setUpLivePitayaEnv$1.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError):void");
            }
        });
    }

    public static void LIZ(Function0 function0, Function2 function2, boolean z, boolean z2) {
        if (z) {
            LJII.add(function0);
            LJIIIIZZ.add(function2);
        } else if (z2) {
            LJFF.add(function0);
            LJI.add(function2);
        } else {
            LIZLLL.add(function0);
            LJ.add(function2);
        }
    }

    public static final void LJFF(Function0<Unit> function0, Function2<? super Integer, ? super PTYError, Unit> function2, boolean z, boolean z2) {
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(function0, (Function0<Unit>) 29);
        if (LIZ) {
            awS577S0100000_33.invoke();
            return;
        }
        if (!LiveClientAISettings.INSTANCE.enable()) {
            function2.invoke(-6, null);
            return;
        }
        if (!(!LIZLLL.isEmpty()) && !(!LJII.isEmpty()) && !(!LJFF.isEmpty())) {
            LIZ(function0, function2, z, z2);
            HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
            if (hostSetupWatcher.isHostSetup()) {
                LJIILL(AFwS224S0000000_33.get$arr$(5), AFwS279S0000000_33.get$arr$(10));
                return;
            } else {
                hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$ensurePitayaEnv$5
                    @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                    public void onHostSetup(boolean z3) {
                        boolean z4 = LivePitayaEnv.LIZ;
                        LivePitayaEnv.LJIILL(AFwS224S0000000_33.get$arr$(6), AFwS279S0000000_33.get$arr$(11));
                    }
                });
                return;
            }
        }
        LIZ(function0, function2, z, z2);
    }
}

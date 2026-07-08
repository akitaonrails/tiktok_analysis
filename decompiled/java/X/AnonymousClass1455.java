package X;

import X.AnonymousClass1455;
import android.content.Context;
import com.bytedance.fastengine.api.FastEngineManager;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import com.bytedance.pitaya.cep_auth.CepAuthenticator;
import com.bytedance.pitaya.cep_engine.CepEngineManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pitaya.IPitayaBundle;
import com.ss.android.ugc.aweme.pitaya.PitayaLiteModeConfig;
import com.ss.android.ugc.aweme.pitaya.experiment.PitayaExperiment;
import defpackage.v5;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import jv6.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1455, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1455 {
    public static final AnonymousClass1455 LIZ = new AnonymousClass1455();
    public static final Map<Integer, String> LIZIZ;
    public static boolean LIZJ;
    public static String LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final boolean LJI;
    public static int LJII;
    public static volatile IPitayaBundle LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final C20278314Wf LJIIJ;
    public static final C20278214We LJIIJJI;

    public final synchronized void LIZIZ() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (LJIIIZ) {
            return;
        }
        JSONObject jSONObject3 = PitayaExperiment.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        sbLIZ.append(C844470XAv.LJIIJ);
        sbLIZ.append("");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
            strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = CardStruct.IStatusCode.DEFAULT;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        c844470XAv.getClass();
        sbLIZ2.append(C844470XAv.LIZLLL());
        sbLIZ2.append("");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c844470XAv.getClass();
        String str = C844470XAv.LJIILL;
        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("pitaya_global");
        if (jSONObjectOptJSONObject == null || (jSONObject = jSONObjectOptJSONObject.optJSONObject("cep_settings")) == null) {
            jSONObject = new JSONObject();
        }
        C1305180k4K c1305180k4K = new C1305180k4K(strLIZIZ, jSONObject, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, str, strLIZIZ2);
        CepEngineManager cepEngineManager = CepEngineManager.INSTANCE;
        c844470XAv.getClass();
        cepEngineManager.configEngine(C844470XAv.LIZ(), c1305180k4K);
        CepAuthenticator.INSTANCE.setup();
        LJIIIZ = true;
        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("pitaya_global");
        if (jSONObjectOptJSONObject2 == null || (jSONObject2 = jSONObjectOptJSONObject2.optJSONObject("cep_signature_test_rule")) == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject2.length() != 0) {
            cepEngineManager.registerRule("test4430", "signature_test", "rule", jSONObject2, null);
            cepEngineManager.onEvent("test4430", "signature_test", "rule", "a", new JSONObject(), -1L);
            cepEngineManager.onEvent("test4430", "signature_test", "rule", "a", new JSONObject(), -1L);
            cepEngineManager.onEvent("test4430", "signature_test", "rule", "a", new JSONObject(), -1L);
            cepEngineManager.onEvent("test4430", "signature_test", "rule", "a", new JSONObject(), -1L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.14We] */
    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ = linkedHashMap;
        LIZLLL = "unknown";
        double dRandom = Math.random();
        LJIIJ = new C20278314Wf();
        LJIIJJI = new AnonymousClass1459() { // from class: X.14We
            @Override // X.AnonymousClass1459
            public final boolean LIZ() {
                C844470XAv.LIZ.getClass();
                return C2179771ASp.LJIIJ(C844470XAv.LIZ());
            }

            @Override // X.AnonymousClass1459
            public final long LIZJ() {
                return AnonymousClass1455.LJIIJ.LIZIZ;
            }

            @Override // X.AnonymousClass1459
            public final long LIZLLL() {
                return AnonymousClass1455.LJIIJ.LIZLLL;
            }

            @Override // X.AnonymousClass1459
            public final void init() {
                C20278314Wf c20278314Wf = AnonymousClass1455.LJIIJ;
                synchronized (c20278314Wf) {
                    try {
                        Keva repoSync = KevaImpl.getRepoSync("pitaya_keva", 0);
                        c20278314Wf.LIZ = repoSync;
                        long j = c20278314Wf.LJ;
                        if (j != -1) {
                            c20278314Wf.LIZLLL = j;
                            if (repoSync != null) {
                                repoSync.storeLong("disk_avail", j);
                            }
                        } else {
                            c20278314Wf.LIZLLL = repoSync != null ? repoSync.getLong("disk_avail", -1L) : -1L;
                        }
                        long j2 = c20278314Wf.LIZJ;
                        if (j2 != -1) {
                            c20278314Wf.LIZIZ = j2;
                            Keva keva = c20278314Wf.LIZ;
                            if (keva != null) {
                                keva.storeLong("disk_avail", j2);
                            }
                        } else {
                            Keva keva2 = c20278314Wf.LIZ;
                            c20278314Wf.LIZIZ = keva2 != null ? keva2.getLong("disk_total", -1L) : -1L;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.AnonymousClass1459
            public final float LIZIZ() {
                return (float) C1BCA.LIZLLL().LIZIZ;
            }
        };
        linkedHashMap.put(0, "Success, no error");
        linkedHashMap.put(1, "pitaya not enabled");
        linkedHashMap.put(2, "pitaya not inited");
        linkedHashMap.put(3, "pitaya bundle not installed, please wait a minutes");
        linkedHashMap.put(4, "url is empty, please check");
        LJI = dRandom > 0.99d;
    }

    public static IPitayaBundle LIZ() {
        if (LJIIIIZZ != null) {
            return LJIIIIZZ;
        }
        try {
            try {
                try {
                    LJIIIIZZ = (IPitayaBundle) Class.forName("com.ss.android.ugc.aweme.pitaya.PitayaPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (NoSuchMethodException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getPluginImpl - catch NoSuchMethodException = ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getPluginImpl - catch IllegalAccessException = ");
                sbLIZ2.append(e2.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
            } catch (InvocationTargetException e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getPluginImpl - catch InvocationTargetException = ");
                sbLIZ3.append(e3.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LJIIIIZZ;
    }

    public static void LIZJ() {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject = PitayaExperiment.LIZIZ.optJSONObject("pitaya_global");
        if (jSONObjectOptJSONObject == null || (jSONObject = jSONObjectOptJSONObject.optJSONObject("fast_engine_settings")) == null) {
            jSONObject = new JSONObject();
        }
        FastEngineManager.ensureInitialized(jSONObject);
    }

    public static boolean LJI() {
        return HostSetupWatcher.INSTANCE.isHostSetup() || PreHostSetupWatcher.INSTANCE.isPreHostSetup();
    }

    public static boolean LJII() {
        return HostSetupWatcher.INSTANCE.isHostSetup();
    }

    public static boolean LJ(String str, C204677157b c204677157b) {
        if (LJII()) {
            return true;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C057X(str, null, c204677157b, null), 3);
        return false;
    }

    public static final boolean LJIIIIZZ(PitayaLiteModeConfig pitayaLiteModeConfig, AnonymousClass1457 anonymousClass1457) {
        if (PitayaExperiment.LIZ.enable == 1) {
            try {
                final IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                if (iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.pitaya")) {
                    LIZJ = true;
                    LJFF = System.currentTimeMillis() - jCurrentTimeMillis;
                    return true;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final C013C c013c = new C013C();
                AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
                anonymousClass1403.LIZ = false;
                anonymousClass1403.LIZIZ = true;
                anonymousClass1403.LIZJ = true;
                anonymousClass1403.LIZLLL = true;
                anonymousClass1403.LJFF = false;
                C844020X9c c844020X9c = new C844020X9c();
                c844020X9c.LIZ = "com.ss.android.ugc.aweme.pitaya";
                c844020X9c.LIZIZ = true;
                c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
                c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.1454
                    @Override // X.InterfaceC842850X4p
                    public final void LIZJ(String str, boolean z) {
                        C1BLW c1blwLIZLLL;
                        PitayaExperiment.Config config = PitayaExperiment.LIZ;
                        if (PitayaExperiment.LIZLLL) {
                            IPluginService iPluginService2 = iPluginService;
                            if (iPluginService2 != null) {
                                c1blwLIZLLL = iPluginService2.LIZLLL();
                            } else {
                                c1blwLIZLLL = null;
                            }
                            C844470XAv.LIZ.getClass();
                            Context contextLIZ = C844470XAv.LIZ();
                            if (c1blwLIZLLL != null) {
                                a.install(contextLIZ);
                                a.LIZLLL(contextLIZ);
                            }
                        }
                        AnonymousClass1455.LIZJ = true;
                        AnonymousClass1455.LJFF = System.currentTimeMillis() - jCurrentTimeMillis;
                        c013c.element = true;
                        countDownLatch.countDown();
                    }

                    @Override // X.InterfaceC842850X4p
                    public final void LIZ(int i, String str, boolean z) {
                        AnonymousClass1455 anonymousClass1455 = AnonymousClass1455.LIZ;
                        AnonymousClass1455.LJFF = System.currentTimeMillis() - jCurrentTimeMillis;
                        c013c.element = false;
                        countDownLatch.countDown();
                    }
                };
                iPluginService.LJJI(new C202068144s(c844020X9c));
                countDownLatch.await();
                return c013c.element;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (anonymousClass1457 != null) {
                    anonymousClass1457.onFailed();
                }
                return false;
            }
        }
        LJIIIZ(pitayaLiteModeConfig, 2, 0L);
        return false;
    }

    public static void LJIIJ(int i, boolean z) {
        if (LJI) {
            long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
            AppLogNewUtils.onEventV3("smart_client_plugin_pre_init", new JSONObject().put("duration", jCurrentTimeMillis).put("delay_time", ((Number) C279690Axj.LIZ.getValue()).intValue()).put("success", z).put("task_priority", 2).put("setup_mode", i).put("load_plugin_dur", LJFF).put("pitaya_init_dur", System.currentTimeMillis() - LJ));
        }
    }

    public final void LJFF(PitayaLiteModeConfig pitayaLiteModeConfig, AnonymousClass1457 anonymousClass1457) {
        boolean zLJI = MethodIDManager.LJI(71921);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "pitaya_init_hardware_opt", false) == 1) {
            synchronized (this) {
                try {
                    if (AnonymousClass1458.LIZ == null) {
                        AnonymousClass1458.LIZ = LJIIJJI;
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
        LJ = System.currentTimeMillis();
        IPitayaBundle iPitayaBundleLIZ = LIZ();
        if (iPitayaBundleLIZ != null) {
            AnonymousClass1456 anonymousClass1456 = new AnonymousClass1456();
            anonymousClass1456.LIZ = pitayaLiteModeConfig;
            iPitayaBundleLIZ.initPitaya(anonymousClass1456);
            if (anonymousClass1457 != null) {
                anonymousClass1457.onSuccess();
            }
        } else if (anonymousClass1457 != null) {
            anonymousClass1457.onFailed();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJIIIZ(PitayaLiteModeConfig pitayaLiteModeConfig, int i, long j) {
        Integer numValueOf;
        if (!LJI) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - C1150504el.LIZ().LJJII;
        if (pitayaLiteModeConfig != null) {
            numValueOf = Integer.valueOf(pitayaLiteModeConfig.getSetupMode());
        } else {
            numValueOf = null;
        }
        AppLogNewUtils.onEventV3("smart_client_plugin_ready", new JSONObject().put("duration", jCurrentTimeMillis).put("code", i).put("setup_mode", numValueOf).put("load_plugin_dur", j).put("caller", LIZLLL));
    }

    public final boolean LIZLLL(String str, PitayaLiteModeConfig pitayaLiteModeConfig, AnonymousClass1457 anonymousClass1457) {
        boolean zLJII;
        int setupMode;
        if (pitayaLiteModeConfig != null && pitayaLiteModeConfig.getSetupMode() == 1) {
            zLJII = LJI();
        } else {
            zLJII = LJII();
        }
        if (zLJII) {
            return true;
        }
        if (pitayaLiteModeConfig != null) {
            setupMode = pitayaLiteModeConfig.getSetupMode();
        } else {
            setupMode = 3;
        }
        if (setupMode <= LJII) {
            return false;
        }
        LJII = setupMode;
        C202075144z c202075144z = C202075144z.LIZ;
        c202075144z.LJI();
        LIZIZ();
        synchronized (this) {
            try {
                LIZLLL = str;
                if (!LIZJ) {
                    AnonymousClass1455 anonymousClass1455 = LIZ;
                    if (!LJIIIIZZ(pitayaLiteModeConfig, anonymousClass1457)) {
                        LJIIIZ(pitayaLiteModeConfig, 1, 0L);
                        if (anonymousClass1457 != null) {
                            anonymousClass1457.onFailed();
                        }
                        return false;
                    }
                    LJIIIZ(pitayaLiteModeConfig, 0, LJFF);
                    HostSetupWatcher.INSTANCE.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.android.ugc.aweme.pitaya.PitayaInitHelper$registerHostWatcher$1
                        @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                        public void onHostSetup(boolean z) {
                            AnonymousClass1455.LIZ.getClass();
                            AnonymousClass1455.LJIIJ(3, z);
                        }
                    });
                    PreHostSetupWatcher.INSTANCE.registerListener(new PreHostSetupListener() { // from class: com.ss.android.ugc.aweme.pitaya.PitayaInitHelper$registerHostWatcher$2
                        @Override // com.bytedance.pitaya.api.mutilinstance.PreHostSetupListener
                        public void onPreHostSetup(boolean z) {
                            AnonymousClass1455.LIZ.getClass();
                            AnonymousClass1455.LJIIJ(1, z);
                        }
                    });
                    C08RY.LIZIZ = new v5();
                }
                c202075144z.LJII();
                AnonymousClass1455 anonymousClass14552 = LIZ;
                anonymousClass14552.getClass();
                LIZJ();
                anonymousClass14552.LJFF(pitayaLiteModeConfig, anonymousClass1457);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}

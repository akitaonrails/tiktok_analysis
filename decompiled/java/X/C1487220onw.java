package X;

import Y.AfS138S0000000_16;
import Y.AfS142S0000000_23;
import Y.AfS192S0100000_23;
import Y.AkS158S0000000_23;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.ColdBootPushStartupExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.IMediaIOCoreBridgeService;
import com.ss.android.ugc.aweme.net.bridge.MediaIOCoreBridgeServiceImpl;
import com.ss.android.ugc.aweme.video.PlayerPluginInstallTask;
import com.ss.android.ugc.aweme.video.simkit.SimKitConfigImpl;
import java.util.Objects;

/* JADX INFO: renamed from: X.0onw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487220onw {
    public static C11JF LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;

    public static void LIZIZ() {
        if (C07JG.LIZ()) {
            return;
        }
        if (ColdBootPushStartupExperiment.LIZ().preCreatePrerenderSession && (C2456309jt.LIZJ() || ColdBootPushStartupExperiment.LIZIZ())) {
            return;
        }
        C1483410ohn.LJLJJI().LJIIIZ();
        C0X35.LIZ("player_init_to_precreate", true);
    }

    public static void LIZ(int i) {
        boolean z;
        final boolean z2;
        if (((Boolean) C266280Ac6.LIZ.getValue()).booleanValue() && ((C2456309jt.LIZJ() || ColdBootPushStartupExperiment.LIZIZ()) && i == 0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZIZ = true;
            C1481110oe5.LIZIZ = new InterfaceC1481170oeB() { // from class: X.0oeA
                @Override // X.InterfaceC1481170oeB
                public final void onLog(String str) {
                    if (InterfaceC1481090oe3.LIZ) {
                        C2344809Gs.LIZLLL(6, "PlayerLog", str);
                    }
                }

                @Override // X.InterfaceC1481170oeB
                public final void ensureNotReachHere(Throwable th, String str) {
                    C1AF0.LJFF(th, str);
                }
            };
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_download_pcdn_so", true) == 1 && !iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.player")) {
                LIZ = (C11JF) C2214201BlK.LIZJ().LJJLJLI(new AfS142S0000000_23(1));
            }
            C2203461BLs.LIZ.getClass();
            C2203461BLs.LIZ();
            C1BWL.LIZ().registerActivityLifecycleCallbacks(new C20688088o() { // from class: X.0onx
                @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    if (C1487220onw.LIZIZ && !C1487220onw.LIZJ) {
                        C1487220onw.LIZJ = true;
                        C1487220onw.LIZ(1);
                    }
                }
            });
            return;
        }
        C1150504el.LIZ().LIZLLL("player_init_build_duration", false);
        C1481110oe5.LIZIZ = new InterfaceC1481170oeB() { // from class: X.0oe9
            @Override // X.InterfaceC1481170oeB
            public final void onLog(String str) {
                if (InterfaceC1481090oe3.LIZ) {
                    C2344809Gs.LIZLLL(6, "PlayerLog", str);
                }
            }

            @Override // X.InterfaceC1481170oeB
            public final void ensureNotReachHere(Throwable th, String str) {
                C1AF0.LJFF(th, str);
            }
        };
        C19488511Ml c19488511MlLJJIFFI = C11NZ.LJJJLL(C2214201BlK.LIZJ(), C2214201BlK.LIZJ.LJJLIIJ()).LJJJJZI(new AkS158S0000000_23(0)).LJJJLZIJ(C11S5.LIZ()).LJJIFFI();
        C1476910oXJ c1476910oXJLJ = C582130MsN.LIZ().LJ();
        Objects.requireNonNull(c1476910oXJLJ);
        c19488511MlLJJIFFI.LJJLL(new AfS192S0100000_23(c1476910oXJLJ, 3), new AfS138S0000000_16(11));
        if (C2551209zC.LIZ) {
            if (C2523409ui.LIZ) {
                if (C1475000oUE.LIZIZ() != null) {
                    C582130MsN.LIZ().LIZIZ();
                    C1487210onv.LIZ();
                    C0R7V.LIZ();
                }
                z2 = false;
            } else {
                if (C1475000oUE.LIZIZ() == null) {
                    InterfaceC1484530ojb interfaceC1484530ojbLIZ = C582130MsN.LIZ();
                    C844470XAv.LIZ.getClass();
                    interfaceC1484530ojbLIZ.LIZLLL(C844470XAv.LIZ(), new SimKitConfigImpl());
                }
                C582130MsN.LIZ().LIZIZ();
                C1487210onv.LIZ();
                C0R7V.LIZ();
            }
            z2 = true;
        } else {
            z2 = false;
        }
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0onu
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3 = z2;
                C1C7U.LIZ("PlayerKitInitHelper@d98f.init$3L");
                if (((Boolean) C2187891Ajz.LJIIJ.getValue()).booleanValue()) {
                    C2187801Ajq.LJ();
                }
                C2344809Gs.LJ("VideoCachePreloaderInitTask");
                C1483410ohn.LJLJJI();
                C1487220onw.LIZIZ();
                EnumC590100NCm.INS.init();
                InterfaceC1478200oZO interfaceC1478200oZO = (InterfaceC1478200oZO) C1126604au.LIZ("com.ss.android.ugc.aweme.ttkvideoplayer.StrategyCenterService");
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                interfaceC1478200oZO.LIZIZ(new SimKitConfigImpl());
                if (!C2551209zC.LIZ || !z3) {
                    C582130MsN.LIZ().LIZIZ();
                }
                try {
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_download_media_loader_p2p_so", true) == 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_download_media_loader_p2p_in_bg", true) != 1) {
                        PlayerPluginInstallTask playerPluginInstallTask = new PlayerPluginInstallTask();
                        C799900VZk.LIZ.getClass();
                        C799890VZj c799890VZj = new C799890VZj();
                        c799890VZj.LIZ(playerPluginInstallTask);
                        c799890VZj.LIZIZ();
                        C799900VZk.LIZJ(playerPluginInstallTask);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
                if (((Boolean) C2187891Ajz.LJIIJ.getValue()).booleanValue()) {
                    C2187801Ajq.LJFF();
                }
                if (!C2551209zC.LIZ || !z3) {
                    C1487210onv.LIZ();
                    C0R7V.LIZ();
                }
                if (((Number) C0ABJ.LIZ.getValue()).intValue() > 0 && C04TD.LIZ(IMediaIOCoreBridgeService.class, false) == null && C04TD.N2 == null) {
                    synchronized (IMediaIOCoreBridgeService.class) {
                        if (C04TD.N2 == null) {
                            C04TD.N2 = new MediaIOCoreBridgeServiceImpl();
                        }
                    }
                }
                C1C7U.LIZIZ("PlayerKitInitHelper@d98f.init$3L");
            }
        });
        C1024720cly.LIZ = new C1024750cm1();
        IPluginService iPluginService2 = (IPluginService) ServiceManager.get().getService(IPluginService.class);
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_download_pcdn_so", true) == 1 && !iPluginService2.checkPluginInstalled("com.ss.android.ugc.aweme.player")) {
            LIZ = (C11JF) C2214201BlK.LIZJ().LJJLJLI(new AfS142S0000000_23(0));
        }
        C2203461BLs.LIZ.getClass();
        C2203461BLs.LIZ();
    }
}

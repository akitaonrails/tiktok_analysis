package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.app.services.ILauncherService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.events.NujPerformanceTrackerV2;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0rnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602170rnL {
    public final AbstractActivityC1602020rn6 LIZ;

    public static void LIZIZ() {
        C0X35.LIZ("main_act_attach", true);
        if (!C1602190rnN.LIZIZ) {
            Object obj = C1602190rnN.LIZ;
            synchronized (obj) {
                try {
                    C1602190rnN.LIZIZ = true;
                    obj.notifyAll();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (C0CD2.LIZ() || ((Boolean) C0CD2.LJJIJIL.getValue()).booleanValue()) {
            return;
        }
        C0NET.LIZ.getClass();
        C0NET.LJIILJJIL();
    }

    public final void LIZLLL() {
        int iHashCode = this.LIZ.hashCode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("main activity onCreate: ");
        sbLIZ.append(iHashCode);
        C1581650rGF.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1581650rGF.LIZ++;
    }

    public final void LJI() {
        Uri referrer = this.LIZ.getReferrer();
        if (referrer == null) {
            return;
        }
        try {
            final String host = referrer.getHost();
            if (host == null) {
                return;
            }
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0raS
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainLegacyTrackers@f879.storeHostToCache$1");
                    try {
                        Keva.getRepo("referrer_host").storeString("host", host);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainLegacyTrackers@f879.storeHostToCache$1");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
    }

    public static void LJFF() {
        C20182613y4.LIZLLL().LJ().LIZ("cold_boot_main_resume_duration");
        if (C0CLM.LIZJ) {
            C0CLM.LIZJ = false;
            C1103004Tc.LIZ.LIZ(new C1489680oru(3));
        }
        C19266210Yy.LIZIZ.LIZIZ();
        C582600Mt8.LIZIZ("cold_boot_main_create_to_resume");
        C0X35.LJIIJJI("cold_boot_main_create_to_resume", true);
        C0X35.LIZ("cold_boot_main_resume_duration", true);
        C0X35.LIZIZ("cold_boot_main_resume_duration");
    }

    public C1602170rnL(AbstractActivityC1602020rn6 abstractActivityC1602020rn6) {
        this.LIZ = abstractActivityC1602020rn6;
    }

    public static void LIZJ(boolean z) {
        if (!z) {
            return;
        }
        C20182613y4.LIZLLL().LJ().LIZ("cold_boot_main_focus_duration");
        C202098145w c202098145wLIZ = C08TN.LIZ();
        if (c202098145wLIZ.LJJLIIIJL <= 0) {
            c202098145wLIZ.LJJJJL(EnumC1609850rzj.MAIN_FOCUS);
            c202098145wLIZ.LJJLIIIJL = SystemClock.elapsedRealtime();
        }
        if (C202094145s.LJ == 0) {
            C202094145s.LJ = SystemClock.elapsedRealtime();
            C202094145s.LJFF = SystemClock.uptimeMillis();
        }
        C582600Mt8.LIZIZ("cold_boot_main_measure_to_focus");
        C0X35.LJIIJJI("cold_boot_main_measure_to_focus", true);
        C0X35.LJIIJJI("cold_boot_main_resume_to_focus", true);
        C0X35.LIZ("cold_boot_main_focus_duration", true);
        C0X35.LIZIZ("cold_boot_main_focus_duration");
        C1150504el.LIZ().LJI("cold_boot_main_layout_to_focus", false);
        C1150504el.LIZ().LJI("cold_boot_main_draw_to_focus", false);
        if (C104100aN.LIZ().isNewUser()) {
            C844470XAv.LIZ.getClass();
            AppLog.activeUser(C844470XAv.LIZ());
        }
    }

    public final void LJ(Bundle bundle) {
        boolean z;
        int i;
        ILauncherService iLauncherService;
        C2344809Gs.LJ("saf: MainActivity onCreate Start");
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        C581760Mrm.LIZJ = SystemClock.uptimeMillis();
        C0CLM.LIZJ = false;
        if (z) {
            if (C0CLM.LIZ) {
                i = 5;
            } else {
                i = 4;
            }
        } else if (C0CLM.LIZ) {
            i = 1;
        } else {
            i = 2;
        }
        C0CLM.LIZLLL = i;
        if (((Boolean) C0B7D.LIZ.getValue()).booleanValue() && i == 2) {
            C581760Mrm.LIZ.getClass();
            C04TY.LIZIZ.LIZ();
        }
        C1103004Tc.LIZ.LIZ(new C1489680oru(i));
        C0CLM.LIZ = false;
        LJI();
        C807430Vlt.LIZ("cold_boot_start_to_main");
        C1563860qnY.LIZJ = false;
        C1602200rnO.LIZ().LIZLLL(EnumC585000Mx0.COLD_STARTUP);
        C20182613y4.LIZLLL().LJ().LIZ("cold_boot_main_create_duration");
        C202098145w c202098145wLIZ = C08TN.LIZ();
        c202098145wLIZ.LJJJJL(EnumC1609850rzj.MAIN_CREATE);
        EnumC1609840rzi enumC1609840rzi = EnumC1609840rzi.MAIN_CREATE;
        if (enumC1609840rzi != null) {
            c202098145wLIZ.LJJJLIIL = enumC1609840rzi;
            c202098145wLIZ.LJJJLL = 0L;
            c202098145wLIZ.LJJJLZIJ = 0L;
        }
        c202098145wLIZ.getClass();
        C0X35.LJIIJJI("cold_boot_application_to_main", true);
        C0X35.LJIIJJI("cold_boot_start_to_main", true);
        C0X35.LIZ("cold_boot_main_create_duration", true);
        C0X35.LIZ("cold_boot_main_create_start_to_init_scene", false);
        C0X35.LIZJ("cold_boot_main_create_duration", "main_create_before_super");
        C0X35.LIZ("main_act_begin_to_super", true);
        C0X35.LIZ("method_main_create_begin_to_splash_ad", false);
        c202098145wLIZ.LJ("main_act_create_assem", false);
        if (C202094145s.LIZJ == 0) {
            C202094145s.LIZJ = SystemClock.uptimeMillis();
        }
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0C31
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainLegacyTrackers@f879.logAppLaunch$1");
                try {
                    if (System.currentTimeMillis() - C1150504el.LIZ().LJJIIJZLJL < 2500) {
                        Keva repo = Keva.getRepo("app_launch");
                        repo.storeInt("launch_times", repo.getInt("launch_times", 0) + 1);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainLegacyTrackers@f879.logAppLaunch$1");
            }
        });
        C1593730rZj.LIZIZ.LJIIZILJ();
        if (C798410VTr.LIZ()) {
            HashMap map = new HashMap();
            map.put("monitor_scene", "scene_launch");
            map.put("launch_type", "launch_type_main");
            map.put("vv_code", 3100);
            map.put("launch_has_main", 1);
            C798410VTr.LJFF(map);
        }
        C19252910Tv.LIZIZ.LIZIZ(this.LIZ);
        if (((Boolean) C1244104tr.LIZIZ.getValue()).booleanValue() && (iLauncherService = (ILauncherService) PluggableExtentionKt.pluggableSpi$default(ILauncherService.class, false, false, false, 14, null)) != null) {
            iLauncherService.LIZLLL();
        }
        C0X35.LJIIJJI("cold_boot_main_create_start_to_init_scene", false);
        C0X35.LIZ("cold_boot_main_create_init_scene_duration", false);
    }

    public final void LIZ(boolean z, boolean z2) {
        if (z) {
            C807430Vlt.LIZ("app_start_to_main_focus");
            C0X35.LJIIJJI("cold_boot_main_focus_duration", true);
            C1150504el.LIZ().LJI("app_start_to_main_focus", true);
            C08TN.LIZ().LJIIIZ("app_start_to_main_focus");
            C0X35.LIZ("cold_boot_main_focus_ui_duration", true);
            C1602200rnO c1602200rnOLIZ = C1602200rnO.LIZ();
            c1602200rnOLIZ.getClass();
            EnumC585000Mx0 enumC585000Mx0 = EnumC585000Mx0.COLD_STARTUP_COMPLETED;
            if (enumC585000Mx0.ordinal() > c1602200rnOLIZ.LIZ.ordinal()) {
                C1602200rnO.LIZ().LIZLLL(enumC585000Mx0);
            }
            this.LIZ.getClass();
            C2155308cR.LIZIZ();
            NujPerformanceTrackerV2.LIZIZ(C0NJH.LAUNCH2MAIN_DURATION, false);
            NujPerformanceTrackerV2.LIZ(C0NJH.MAIN2NUJ_DURATION);
            C0X35.LJIIJJI("cold_boot_main_focus_ui_duration", true);
            C0X35.LIZ("cold_boot_main_focus_to_feed_success", true);
            C0X35.LIZ("cold_boot_main_focus_to_send_cache_success", false);
            C0X35.LIZIZ("cold_boot_main_focus_to_feed_success");
            C582600Mt8.LIZ("cold_boot_main_focus_to_feed_success");
            C08TN.LIZ().LJII(SystemClock.elapsedRealtime() - C202094145s.LIZIZ, "app_start_to_main_focus_v2");
            C1150504el.LIZ().LJ(SystemClock.elapsedRealtime() - C202094145s.LIZIZ, "app_start_to_main_focus_v2");
            if (!((Boolean) C0AHP.LIZ.getValue()).booleanValue() && !C1150504el.LIZ().LJIJJLI) {
                C1913090zsp c1913090zsp = C1913090zsp.LIZ;
                boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
                c1913090zsp.getClass();
                C1913090zsp.LIZ(zBooleanValue);
            }
            if (C2549209ys.LIZ && !C0DMU.LIZJ) {
                C0DMU.LIZJ = true;
                Map map = (Map) C1125304ah.LIZ.getValue();
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        C0C59 c0c59LJ = C0C59.LJ();
                        String str = (String) entry.getKey();
                        c0c59LJ.LJIILJJIL(0, false);
                        Object objLJIIJJI = c0c59LJ.LJIIJJI(str, true);
                        if (!(objLJIIJJI instanceof Boolean)) {
                            if ((objLJIIJJI instanceof String) || (objLJIIJJI instanceof Number)) {
                            }
                        } else {
                            objLJIIJJI = ((Boolean) objLJIIJJI).booleanValue() ? 1 : 0;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C0DMU.LIZIZ);
                        sbLIZ.append((String) entry.getKey());
                        sbLIZ.append('=');
                        sbLIZ.append(objLJIIJJI);
                        sbLIZ.append(';');
                        C0DMU.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                }
            }
            if (z2) {
                C0VWW.LIZIZ("latency_app_start_olduser");
            }
            TTWebViewEnableStatusSettings.LIZ.getClass();
            if (TTWebViewEnableStatusSettings.LIZ().isTTWebViewEnabled) {
                TTWebViewHelper.INSTANCE.onColdStartFinish();
            }
            C0S78.LIZJ(new C584240Mvm(this), true);
            C20182613y4.LIZLLL().LJ().LIZIZ();
            C20182613y4 c20182613y4LIZLLL = C20182613y4.LIZLLL();
            if (c20182613y4LIZLLL.LIZJ == null) {
                c20182613y4LIZLLL.LJFF();
            }
            c20182613y4LIZLLL.LIZJ.LIZ("cold_boot_main_focus_to_feed_success");
            return;
        }
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.MAIN_LOSE_FOCUS);
        C581760Mrm.LIZIZ = false;
    }
}

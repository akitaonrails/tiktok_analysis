package X;

import Y.ARunnableS102S0000000_29;
import Y.ARunnableS103S0200000_34;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS84S0000000_4;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.StrictMode;
import android.os.strictmode.Violation;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.IBootFinishEngine;
import com.ss.android.legoimpl.AppMonitorTask;
import com.ss.android.legoimpl.CpuTask;
import com.ss.android.legoimpl.DisableClassVerifyTask;
import com.ss.android.legoimpl.FixInflateCrashTask;
import com.ss.android.legoimpl.FlippedTask;
import com.ss.android.legoimpl.InitABTask;
import com.ss.android.legoimpl.InitGenoTask;
import com.ss.android.legoimpl.InitKevaTask;
import com.ss.android.legoimpl.InitRewordTask;
import com.ss.android.legoimpl.InjectApplicationTask;
import com.ss.android.legoimpl.LessMadviseOptTask;
import com.ss.android.legoimpl.LibrarianTask;
import com.ss.android.legoimpl.PreloadIOTask;
import com.ss.android.legoimpl.PreloadMDLSoTask;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.app.IInitAllService;
import com.ss.android.ugc.aweme.application.AppTaskProvider;
import com.ss.android.ugc.aweme.application.IStartupEngine;
import com.ss.android.ugc.aweme.debug.DebugDoolittleWSTask;
import com.ss.android.ugc.aweme.experiment.appinit.PreloaderInAppInit;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.legoImp.task.AnrThanosEarliestTask;
import com.ss.android.ugc.aweme.legoImp.task.AnrThanosTask;
import com.ss.android.ugc.aweme.legoImp.task.ArsenalPreloadInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootInitTask;
import com.ss.android.ugc.aweme.legoImp.task.ColdBootSystemOptTask;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.ss.android.ugc.aweme.legoImp.task.InitPushTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.ss.android.ugc.aweme.legoImp.task.NpthSecondInitTask;
import com.ss.android.ugc.aweme.legoImp.task.PushSetupTask;
import com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.ss.android.ugc.aweme.legoImp.task.uitask.UIInitTask;
import com.ss.android.ugc.aweme.legoImpl.task.AppStartupRecordTask;
import com.ss.android.ugc.aweme.offline.debug.perf.IDoolittleService;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;
import com.ss.android.ugc.aweme.task.HippoAntiDeteriorationKitTask;
import com.ss.android.ugc.aweme.task.ScalpelBackgroundRunnableMonitorTask;
import com.ss.android.ugc.aweme.utils.DeadSystemExceptionTask;
import com.ss.android.ugc.aweme.video.IPlayerInitService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1BX1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BX1 extends C1BWU {
    public final C1BWW LIZ;
    public final Application LJFF;
    public final AppBuildConfig LJI;
    public volatile C799890VZj LJII;
    public volatile C799890VZj LJIIIIZZ;
    public volatile C799890VZj LJIIIZ;
    public final Object LIZJ = new Object();
    public final Object LIZLLL = new Object();
    public final Object LJ = new Object();
    public long LJIIJ = 0;
    public final AppTaskProvider LIZIZ = (AppTaskProvider) PluggableExtentionKt.pluggableSpi(AppTaskProvider.class, false, false);

    @Override // X.C1BWK
    public final Resources LIZJ(Resources resources) {
        return resources;
    }

    @Override // X.C1BWU, X.C1BWK
    public final void LIZ() {
        IInitAllService iInitAllService = (IInitAllService) PluggableExtentionKt.pluggableSpi(IInitAllService.class);
        if (iInitAllService != null) {
            iInitAllService.LIZLLL();
        }
    }

    @Override // X.C1BWU, X.C1BWK
    public final void LJI() {
        if (C2162308dZ.LJI(this.LJFF)) {
            if (!C0BEC.LJFF(this.LJFF)) {
                FixInflateCrashTask.LIZ();
            }
            IUnKnownOwnershipBusinessOuterService iUnKnownOwnershipBusinessOuterService = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);
            if (iUnKnownOwnershipBusinessOuterService != null) {
                C799900VZk.LIZ.getClass();
                C799890VZj c799890VZj = new C799890VZj();
                c799890VZj.LIZ(iUnKnownOwnershipBusinessOuterService.LJI());
                c799890VZj.LIZIZ();
            }
        }
        C0X35.LIZ("application_beforecreate_create_tasks", false);
        C799890VZj c799890VZjLJIIJ = ((Boolean) AnonymousClass0716.LJJ.getValue()).booleanValue() ? LJIIJ() : LJIIIIZZ(this.LIZIZ.LIZ());
        C0X35.LJIIJJI("application_beforecreate_create_tasks", false);
        C0X35.LIZ("application_beforecreate_run_tasks", false);
        if (c799890VZjLJIIJ != null) {
            c799890VZjLJIIJ.LIZIZ();
        }
        C0X35.LJIIJJI("application_beforecreate_run_tasks", false);
    }

    public final void LJIIIZ() {
        Application application = this.LJFF;
        AppBuildConfig appBuildConfig = this.LJI;
        synchronized (AppMonitorTask.class) {
            try {
                if (C0X35.LJIIL("cold_boot_initAppMonitor")) {
                    C1BWY.LIZ.getClass();
                    C1BWY.LIZ(application, appBuildConfig);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C799890VZj LJIIJ() {
        if (this.LJIIIIZZ == null) {
            C1BY8.LIZIZ();
            synchronized (this.LIZLLL) {
                try {
                    C1BY8.LIZ();
                    if (this.LJIIIIZZ == null) {
                        C0X35.LIZ("application_preload_before_create_task", false);
                        this.LJIIIIZZ = LJIIIIZZ(this.LIZIZ.LIZ());
                        C0X35.LJIIJJI("application_preload_before_create_task", false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJIIIIZZ;
    }

    public final C799890VZj LJIIJJI() {
        if (this.LJII == null) {
            C1BY8.LIZIZ();
            synchronized (this.LIZJ) {
                try {
                    C1BY8.LIZ();
                    if (this.LJII == null) {
                        C0X35.LIZ("application_preload_attach_task", false);
                        this.LJII = LJIIIIZZ(this.LIZIZ.LIZIZ());
                        C0X35.LJIIJJI("application_preload_attach_task", false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJII;
    }

    public final C799890VZj LJIIL() {
        if (this.LJIIIZ == null) {
            synchronized (this.LJ) {
                try {
                    if (this.LJIIIZ == null) {
                        C0X35.LIZ("application_preload_create_task", false);
                        this.LJIIIZ = LJIIIIZZ(this.LIZIZ.LIZJ());
                        C0X35.LJIIJJI("application_preload_create_task", false);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJIIIZ;
    }

    @Override // X.C1BWU, X.C1BWK
    public final void onCreate() {
        C2407009bw.LIZ();
        C0X35.LIZ("application_oncreate_create_task", false);
        C799890VZj c799890VZjLJIIL = ((Boolean) C0CD2.LJFF.getValue()).booleanValue() ? LJIIL() : LJIIIIZZ(this.LIZIZ.LIZJ());
        C0X35.LJIIJJI("application_oncreate_create_task", false);
        C0X35.LIZ("application_oncreate_run_task", false);
        if (c799890VZjLJIIL != null) {
            c799890VZjLJIIL.LIZIZ();
        }
        C0X35.LJIIJJI("application_oncreate_run_task", false);
        C0X35.LIZ("application_oncreate_run_task_to_end", false);
        if (!((Boolean) C1244104tr.LIZIZ.getValue()).booleanValue()) {
            new C1BX2(2).run();
        }
        if (!C0BEC.LJFF(this.LJFF)) {
            CpuTask.LIZ();
        }
        IStartupEngine iStartupEngine = (IStartupEngine) PluggableExtentionKt.pluggableSpi(IStartupEngine.class, false, false);
        if (C0BEC.LJI(this.LJFF) && C08Q0.LJ(this.LJFF, "newlego_migrate_attach", false) && iStartupEngine != null) {
            C1BXD c1bxdLIZIZ = C1BXD.LIZIZ();
            iStartupEngine.LIZ();
            C1BXZ c1bxzLIZ = c1bxdLIZIZ.LIZ("StartupEngine");
            c1bxzLIZ.LIZIZ("InitAVModuleTask");
            c1bxzLIZ.LIZIZ("UIInitTaskEarly");
            c1bxzLIZ.LIZIZ("InitPushTaskEarlyMain");
            c1bxzLIZ.LIZIZ("InitPushTaskEarlyBackground");
            if (Looper.getMainLooper() == Looper.myLooper()) {
                InitAVModule.LJIIIIZZ().LJIIIZ();
            } else {
                C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS102S0000000_29(3));
            }
        }
        C202098145w c202098145wLIZ = C08TN.LIZ();
        c202098145wLIZ.getClass();
        C13WZ c13wz = C089N.LIZ;
        c13wz.LJIIJJI(1);
        c13wz.LJIIJJI(2);
        if (c202098145wLIZ.LJJIJIIJIL) {
            C823050WQl.LIZLLL().execute(new ARunnableS109S0100000_9(c202098145wLIZ, 175));
        }
        C0X35.LJIIJJI("application_oncreate_run_task_to_end", false);
        if (C2162308dZ.LJI(this.LJFF)) {
            if (C798410VTr.LIZ()) {
                HashMap map = new HashMap();
                map.put("vv_code", 1200);
                C798410VTr.LJFF(map);
            }
            if (C798410VTr.LIZ()) {
                HashMap map2 = new HashMap();
                map2.put("vv_code", 1201);
                C798410VTr.LJFF(map2);
            }
            C0X35.LIZ("cold_boot_application_to_stubmain", false);
            C202098145w c202098145wLIZ2 = C08TN.LIZ();
            c202098145wLIZ2.getClass();
            c202098145wLIZ2.getClass();
            C1150504el.LIZ().LJJIIJZLJL = System.currentTimeMillis();
        }
        if (Build.VERSION.SDK_INT >= 28 && C2162308dZ.LJI(this.LJFF) && ((Boolean) C291840BcE.LIZ.getValue()).booleanValue()) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().detectDiskWrites().detectDiskReads().penaltyListener(C823050WQl.LIZLLL(), new StrictMode.OnThreadViolationListener() { // from class: X.1BXI
                @Override // android.os.StrictMode.OnThreadViolationListener
                public final void onThreadViolation(Violation violation) {
                    C1BX1 c1bx1 = this.LIZ;
                    c1bx1.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c1bx1.LJIIJ > 1000) {
                        c1bx1.LJIIJ = jCurrentTimeMillis;
                        C1AF0.LJFF(violation, "StrictMode-ThreadPolicy-Violation");
                    }
                }
            }).build());
        }
    }

    public static C799890VZj LJIIIIZZ(List list) {
        if (list != null && !list.isEmpty()) {
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c799890VZj.LIZ((InterfaceC800080Va2) it2.next());
            }
            return c799890VZj;
        }
        return null;
    }

    @Override // X.C1BWK
    public final void LIZIZ(Context context) {
        C799890VZj c799890VZjLJIIIIZZ;
        C0X35.LIZ("application_initbefore", false);
        IStartupEngine iStartupEngine = (IStartupEngine) PluggableExtentionKt.pluggableSpi(IStartupEngine.class, false, false);
        if (C0BEC.LJI(this.LJFF) && C08Q0.LJ(context, "newlego_migrate_core", false) && iStartupEngine != null) {
            C1BXD c1bxdLIZIZ = C1BXD.LIZIZ();
            iStartupEngine.LIZ();
            C1BXZ c1bxzLIZ = c1bxdLIZIZ.LIZ("StartupEngine");
            iStartupEngine.LIZLLL();
            c1bxzLIZ.LIZ("onAttach");
        } else {
            C0X35.LIZ("application_initbefore_part1", false);
            C0X35.LIZ("application_inject_app", false);
            InjectApplicationTask.LIZ(this.LJFF, this.LJI, this.LIZ);
            C0X35.LJIIJJI("application_inject_app", false);
            if (!C08Q0.LJ(this.LJFF, "optimize_appmonitor_v2", false)) {
                C0X35.LIZ("application_init_appmonitor", false);
                Application application = this.LJFF;
                AppBuildConfig appBuildConfig = this.LJI;
                synchronized (AppMonitorTask.class) {
                    try {
                        if (C0X35.LJIIL("cold_boot_initAppMonitor")) {
                            C1BWY.LIZ.getClass();
                            C1BWY.LIZ(application, appBuildConfig);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C0X35.LJIIJJI("application_init_appmonitor", false);
            }
            InitABTask.LIZ();
            if (C08Q0.LJ(this.LJFF, "optimize_appmonitor_v2", false)) {
                C0X35.LIZ("application_init_appmonitor", false);
                LJIIIZ();
                C0X35.LJIIJJI("application_init_appmonitor", false);
            }
            C0X35.LIZ("application_player_kit_init_preload", false);
            IPlayerInitService iPlayerInitService = (IPlayerInitService) PluggableExtentionKt.pluggableSpi(IPlayerInitService.class);
            if (iPlayerInitService != null) {
                iPlayerInitService.LJ();
            }
            C0X35.LJIIJJI("application_player_kit_init_preload", false);
            C0X35.LIZ("application_initbefore_part1_updatelocal", false);
            if (C08Q0.LIZIZ(C1BWL.LIZ(), 0, "optimize_i18n") != 0) {
                C823050WQl.LIZIZ().execute(new ARunnableS134S0100000_34(context, 15));
            } else {
                InitRewordTask.LIZ(context);
            }
            C0X35.LJIIJJI("application_initbefore_part1_updatelocal", false);
            C0X35.LJIIJJI("application_initbefore_part1", false);
            C0X35.LIZ("application_initbefore_part2", false);
            ColdBootSystemOptTask.LJ(this.LJFF);
            PreloadIOTask.LIZ(context);
            C0X35.LJIIJJI("application_initbefore_part2", false);
        }
        C0X35.LIZ("application_initbefore_part3", false);
        C0VZV.LIZ(this.LJFF);
        C01GW c01gw = C0CD2.LJJJJIZL;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C823050WQl.LIZJ().execute(new ARunnableS134S0100000_34(this, 75));
        }
        if (((Boolean) AnonymousClass0716.LJJ.getValue()).booleanValue()) {
            C823050WQl.LIZJ().execute(new ARunnableS134S0100000_34(this, 76));
        }
        if (((Boolean) C0CD2.LJFF.getValue()).booleanValue()) {
            C823050WQl.LIZJ().execute(new ARunnableS134S0100000_34(this, 77));
        }
        C0X35.LJIIJJI("application_initbefore_part3", false);
        C0X35.LJIIJJI("application_initbefore", false);
        IStartupEngine iStartupEngine2 = (IStartupEngine) PluggableExtentionKt.pluggableSpi(IStartupEngine.class, false, false);
        if (C0BEC.LJI(this.LJFF) && C08Q0.LJ(this.LJFF, "newlego_migrate_attach", false) && iStartupEngine2 != null) {
            C1BXD c1bxdLIZIZ2 = C1BXD.LIZIZ();
            iStartupEngine2.LIZ();
            C1BXZ c1bxzLIZ2 = c1bxdLIZIZ2.LIZ("StartupEngine");
            iStartupEngine2.LJ();
            c1bxzLIZ2.LIZ("afterOnAttach");
        } else {
            C0X35.LIZ("application_attachbasecontext_system_reason", false);
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(new AppStartupRecordTask());
            c799890VZj.LIZ(new DebugDoolittleWSTask());
            c799890VZj.LIZ(new HippoAntiDeteriorationKitTask());
            c799890VZj.LIZ(new NpthCoreInitTask());
            c799890VZj.LIZ(new NpthSecondInitTask());
            c799890VZj.LIZ(new AnrThanosEarliestTask());
            c799890VZj.LIZ(new AnrThanosTask());
            c799890VZj.LIZ(new ScalpelBackgroundRunnableMonitorTask());
            c799890VZj.LIZ(DeadSystemExceptionTask.LL);
            c799890VZj.LIZ(new ColdBootInitTask());
            if (PushSetupTask.LL == null) {
                PushSetupTask.LL = new PushSetupTask();
            }
            c799890VZj.LIZ(PushSetupTask.LL);
            if (C1832107Fn.LIZ) {
                C809360Vp0.LIZ(this.LJFF);
                c799890VZj.LIZ(InitPushTask.LIZ());
            }
            if (C1866440yfa.LIZ()) {
                c799890VZj.LIZ(UIInitTask.LL);
            }
            if (C0BSP.LIZ) {
                c799890VZj.LIZ(ArsenalPreloadInitTask.LLILLJJLI);
            }
            c799890VZj.LIZ(new PreloadMDLSoTask());
            c799890VZj.LIZ(new InitGenoTask());
            c799890VZj.LIZIZ();
            C0X35.LJIIJJI("application_attachbasecontext_system_reason", false);
            C0X35.LIZ("application_attachbasecontext_create_task", false);
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                c799890VZjLJIIIIZZ = LJIIJJI();
            } else {
                c799890VZjLJIIIIZZ = LJIIIIZZ(this.LIZIZ.LIZIZ());
            }
            C0X35.LJIIJJI("application_attachbasecontext_create_task", false);
            C0X35.LIZ("application_attachbasecontext_run_task", false);
            if (c799890VZjLJIIIIZZ != null) {
                c799890VZjLJIIIIZZ.LIZIZ();
            }
            C0X35.LJIIJJI("application_attachbasecontext_run_task", false);
            C0X35.LIZ("application_attachbasecontext_end", false);
            if (!C0BEC.LJFF(this.LJFF)) {
                C823020WQi.LIZ = 1;
                C1BXS.LIZIZ.LIZ();
                C823050WQl.LIZJ().execute(new ARunnableS84S0000000_4(2));
            }
            C0X35.LJIIJJI("application_attachbasecontext_end", false);
        }
        if (C0BEC.LJI(this.LJFF) && C08Q0.LJ(this.LJFF, "newlego_migrate_core", false) && iStartupEngine2 != null) {
            C1BXD c1bxdLIZIZ3 = C1BXD.LIZIZ();
            iStartupEngine2.LIZ();
            c1bxdLIZIZ3.LIZ("StartupEngine").LIZIZ("AsyncInitRewordTask");
        }
    }

    @Override // X.C1BWU, X.C1BWK
    public final String LIZLLL(String str) {
        Logger.debug();
        String strLIZ = C2162308dZ.LIZ(this.LJFF);
        if (!C2093608Ic.LJ(strLIZ) && !C2093608Ic.LJ(str)) {
            strLIZ.endsWith(":ad");
        }
        return str;
    }

    @Override // X.C1BWK
    public final void LJ(Context context) {
        C1BXG c1bxgLIZIZ;
        C1150504el.LIZ().LIZLLL("app_start_to_main_focus", true);
        C08TN.LIZ().LIZJ("app_start_to_main_focus");
        C1150504el.LIZ().LIZLLL("feed_total", true);
        C08TN.LIZ().LIZJ("feed_total");
        C1150504el.LIZ().LIZLLL("feed_total_v2", true);
        C08TN.LIZ().LIZJ("feed_total_v2");
        if (context != null && C08Q0.LJ(context, "photomode_cold_boot_event_track_opt_v4110", false)) {
            C1150504el.LIZ().LIZLLL("feed_photo_total", true);
            C08TN.LIZ().LIZJ("feed_photo_total");
        }
        C0X35.LIZ("cold_boot_start_to_main", true);
        C0X35.LIZ("cold_boot_start_to_measure", true);
        C0X35.LIZ("cold_boot_start_to_ui_duration_end", true);
        C0X35.LIZ("cold_boot_start_to_ui_to_video_end", true);
        C0X35.LIZ("cold_boot_start_to_precreate", true);
        C0X35.LIZ("cold_boot_start_to_precreate_end", true);
        C0X35.LIZ("cold_boot_start_to_prerender", true);
        C0X35.LIZ("cold_boot_start_to_prepared_end", true);
        C0X35.LIZ("cold_boot_start_to_tryplay", true);
        C0X35.LIZ("cold_boot_start_to_setsurface", true);
        C0X35.LIZ("cold_boot_start_to_setsurface_end", true);
        C0X35.LIZ("cold_boot_start_to_enginepreloader", true);
        C0X35.LIZ("cold_boot_start_to_enginepreloader_end", true);
        C2456309jt.LIZIZ = C08Q0.LJ(context, "push_startup_reason_optimize", false);
        C0X35.LIZ("application_before_super_attach", false);
        C0X35.LIZLLL("application_before_super_attach");
        if (C0BEC.LJI(context)) {
            final Application application = this.LJFF;
            C1BWW c1bww = this.LIZ;
            AppBuildConfig appBuildConfig = this.LJI;
            C1BWX c1bwx = C848140XOy.LIZ;
            C1699860uKu.LIZIZ = application;
            String packageName = application.getPackageName();
            HashMap map = (HashMap) C1699860uKu.LIZ;
            map.put(packageName, 1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(packageName);
            sbLIZ.append(":push");
            map.put(C2188811AlT.LIZIZ(sbLIZ), 2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(packageName);
            sbLIZ2.append(":pushservice");
            map.put(C2188811AlT.LIZIZ(sbLIZ2), 32);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(packageName);
            sbLIZ3.append(":ttplayer");
            map.put(C2188811AlT.LIZIZ(sbLIZ3), 64);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(packageName);
            sbLIZ4.append(":miniapp0");
            map.put(C2188811AlT.LIZIZ(sbLIZ4), 16);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(packageName);
            sbLIZ5.append(":miniapp1");
            map.put(C2188811AlT.LIZIZ(sbLIZ5), 16);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(packageName);
            sbLIZ6.append(":miniapp2");
            map.put(C2188811AlT.LIZIZ(sbLIZ6), 16);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(packageName);
            sbLIZ7.append(":miniapp3");
            map.put(C2188811AlT.LIZIZ(sbLIZ7), 16);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(packageName);
            sbLIZ8.append(":miniapp4");
            map.put(C2188811AlT.LIZIZ(sbLIZ8), 16);
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(packageName);
            sbLIZ9.append(":miniapp100");
            map.put(C2188811AlT.LIZIZ(sbLIZ9), 16);
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(packageName);
            sbLIZ10.append(":miniapp200");
            map.put(C2188811AlT.LIZIZ(sbLIZ10), 16);
            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
            sbLIZ11.append(packageName);
            sbLIZ11.append(":error_activity");
            map.put(C2188811AlT.LIZIZ(sbLIZ11), 256);
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append(packageName);
            sbLIZ12.append(":safemode");
            map.put(C2188811AlT.LIZIZ(sbLIZ12), 128);
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append(packageName);
            sbLIZ13.append(":wallpaper");
            map.put(C2188811AlT.LIZIZ(sbLIZ13), 1024);
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append(packageName);
            sbLIZ14.append(":bm");
            map.put(C2188811AlT.LIZIZ(sbLIZ14), 512);
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append(packageName);
            sbLIZ15.append(":boost_multidex");
            map.put(C2188811AlT.LIZIZ(sbLIZ15), Integer.valueOf(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE));
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append(packageName);
            sbLIZ16.append(":downloader");
            map.put(C2188811AlT.LIZIZ(sbLIZ16), 4);
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append(packageName);
            sbLIZ17.append(":playcore_missing_splits_activity");
            map.put(C2188811AlT.LIZIZ(sbLIZ17), 131072);
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append(packageName);
            sbLIZ18.append(":feedbacker");
            map.put(C2188811AlT.LIZIZ(sbLIZ18), 262144);
            StringBuilder sbLIZ19 = C2188811AlT.LIZ();
            sbLIZ19.append(packageName);
            sbLIZ19.append(":dfmock");
            map.put(C2188811AlT.LIZIZ(sbLIZ19), 524288);
            c1bwx.LIZJ = application;
            c1bwx.LIZIZ = c1bww;
            c1bwx.LIZ = appBuildConfig;
            C1BX9 c1bx9 = new C1BX9();
            c1bx9.LIZJ = new C1BXV() { // from class: X.0CCX
                public List<String> LIZ;

                @Override // X.C1BXV
                public final void LIZIZ() {
                }

                @Override // X.C1BXV
                public final List<String> LIZ() {
                    if (!LibrarianTask.LLILLJJLI.LIZIZ() || !InitKevaTask.LL.LIZIZ()) {
                        return new ArrayList();
                    }
                    if (this.LIZ == null) {
                        Application application2 = application;
                        boolean zLJ = false;
                        if (application2 != null) {
                            try {
                                zLJ = C08Q0.LJ(application2, "fix_lego_init_crash", false);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        if (zLJ) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(C1933607hm.LIZ());
                            arrayList.addAll(C0CBQ.LIZ());
                            this.LIZ = arrayList;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            this.LIZ = arrayList2;
                            C19719512Dh.LIZIZ(arrayList2).addAll(C1933607hm.LIZ());
                            C19719512Dh.LIZIZ(this.LIZ).addAll(C0CBQ.LIZ());
                        }
                    }
                    return this.LIZ;
                }

                @Override // X.C1BXV
                public final Application getApplication() {
                    return application;
                }
            };
            ((ArrayList) c1bx9.LIZIZ).add(new C1BY0() { // from class: X.1462
                public final IDoolittleService LIZ = (IDoolittleService) PluggableExtentionKt.pluggableSpi(IDoolittleService.class);

                @Override // X.C1BY0
                public final void LIZJ() {
                }

                @Override // X.C1BY0
                public final void LIZ(String str) {
                    C1150504el.LIZ().LJI(str, false);
                    C08TN.LIZ().LJJJJIZL(str);
                }

                @Override // X.C1BY0
                public final void LIZIZ(String str) {
                    C1150504el.LIZ().LIZLLL(str, false);
                    C08TN.LIZ().LJIIL();
                    C08TN.LIZ().LJJJJI(str);
                    C08TN.LIZ().LJIILL(str);
                    C08TN.LIZ().LJIIZILJ(str);
                }
            });
            C1BXH c1bxhLIZIZ = null;
            if (C08Q0.LJ(application, "newlego_enable_startup_engine", false)) {
                IStartupEngine iStartupEngine = (IStartupEngine) PluggableExtentionKt.pluggableSpi$default(IStartupEngine.class, false, false, false, 14, null);
                if (iStartupEngine != null) {
                    c1bxgLIZIZ = iStartupEngine.LIZIZ();
                } else {
                    c1bxgLIZIZ = null;
                }
                if (!((ArrayList) c1bx9.LIZ).contains(c1bxgLIZIZ)) {
                    ((ArrayList) c1bx9.LIZ).add(c1bxgLIZIZ);
                }
            }
            if (C08Q0.LJ(application, "bootfinish_migrate_phase_one", false)) {
                IBootFinishEngine iBootFinishEngine = (IBootFinishEngine) PluggableExtentionKt.pluggableSpi$default(IBootFinishEngine.class, false, false, false, 14, null);
                if (iBootFinishEngine != null) {
                    c1bxhLIZIZ = iBootFinishEngine.LIZIZ();
                }
                if (!((ArrayList) c1bx9.LIZ).contains(c1bxhLIZIZ)) {
                    ((ArrayList) c1bx9.LIZ).add(c1bxhLIZIZ);
                }
            }
            C1BXD.LJ = new C1BXD(c1bx9);
            if (C08Q0.LJ(application, "bootfinish_migrate_phase_one", false)) {
                final C1BXC c1bxc = new C1BXC();
                if (C08Q0.LJ(application, "bootfinish_migrate_fix_invoke_timing", false)) {
                    C786410Ut5.LJLIIL(15000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(c1bxc, 130));
                    application.registerActivityLifecycleCallbacks(new C20688088o() { // from class: X.0uyV
                        @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                            c1bxc.LIZIZ(1);
                            application.unregisterActivityLifecycleCallbacks(this);
                        }
                    });
                }
            }
            if (C0BEC.LJI(application) && C08Q0.LJ(application, "newlego_enable_startup_engine", false) && (C08Q0.LJ(application, "newlego_migrate_core", false) || C08Q0.LJ(application, "newlego_migrate_attach", false))) {
                application.registerActivityLifecycleCallbacks(new C202117146p(application));
            }
        }
        IStartupEngine iStartupEngine2 = (IStartupEngine) PluggableExtentionKt.pluggableSpi(IStartupEngine.class, false, false);
        if (C0BEC.LJI(this.LJFF) && C08Q0.LJ(this.LJFF, "newlego_migrate_core", false) && iStartupEngine2 != null) {
            C1BXD c1bxdLIZIZ = C1BXD.LIZIZ();
            iStartupEngine2.LIZ();
            C1BXZ c1bxzLIZ = c1bxdLIZIZ.LIZ("StartupEngine");
            iStartupEngine2.LIZJ();
            c1bxzLIZ.LIZ("core");
        } else {
            LibrarianTask.LIZ(context, this.LJI);
            InitKevaTask.LIZ(context);
            FlippedTask.LIZ();
            DisableClassVerifyTask.LIZ(context);
            LessMadviseOptTask.LIZ(context);
            C0X35.LIZ("application_preload_decompress", false);
            if (Build.VERSION.SDK_INT >= 33 && C2104108Md.LIZLLL(context)) {
                try {
                    C08P9.LIZLLL(context);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    System.err.println(th);
                }
            }
            C0X35.LJIIJJI("application_preload_decompress", false);
        }
        C0X35.LJIIJJI("application_before_super_attach", false);
    }

    @Override // X.C1BWU, X.C1BWK
    public final void onTrimMemory(int i) {
        C799900VZk.LIZ.getClass();
        C0CPH c0cph = new C0CPH();
        c0cph.LIZ(new TrimMemoryTask(i));
        c0cph.LIZIZ();
    }

    public C1BX1(Application application, AwemeAppBuildConfig awemeAppBuildConfig, C1BWV c1bwv) {
        this.LJFF = application;
        this.LJI = awemeAppBuildConfig;
        this.LIZ = c1bwv;
        PreloaderInAppInit.LIZ = new ARunnableS103S0200000_34(this, application, 38);
        PreloaderInAppInit.LIZIZ = new ARunnableS83S0000000_3(38);
        PreloaderInAppInit.LIZJ = new ARunnableS104S0100000_4(application, 127);
    }
}

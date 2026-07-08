package Y;

import X.C0NBO;
import X.C0VO7;
import X.C0VSJ;
import X.C13LP;
import X.C1702010uON;
import X.C1702090uOV;
import X.C1783000wV0;
import X.C1BCC;
import X.C1BDD;
import X.C1BDE;
import X.C1BDF;
import X.C1BDK;
import X.C1BDQ;
import X.C1BDW;
import X.C1BDY;
import X.C1BIE;
import X.C1BIF;
import X.C1BMY;
import X.C1C7U;
import X.C2188811AlT;
import X.C2200391B9x;
import X.C2200401B9y;
import X.C2201111BCr;
import X.C2201211BDb;
import X.C2201221BDc;
import X.C2203571BMd;
import X.C2225431C8f;
import X.C291680Bby;
import X.C786410Ut5;
import X.C805560Vis;
import X.C807660VmG;
import X.C810380Vqe;
import X.C823690WSx;
import X.ExecutorC2203291BLb;
import android.content.Context;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.ies.safemode.SmartProtected.state.ExceptionManager;
import com.bytedance.pitaya.api.PitayaBootLoader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.DirectoryWalker;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS107S0000000_34 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                PitayaBootLoader.lambda$semisugar$commitBootTaskBySettings$lambda$0$0();
                break;
            case 1:
                PitayaBootLoader.lambda$semisugar$commitBootTaskBySettings$lambda$3$0();
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
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS107S0000000_34(int i) {
        this.$t = i;
    }

    public static final void run$10(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        C1C7U.LIZ("AabPluginServiceImpl$DelayedExecutor@70b1.trigger$1L");
        while (true) {
            Runnable runnablePoll = ExecutorC2203291BLb.LLILLL.poll();
            if (runnablePoll == null) {
                C1C7U.LIZIZ("AabPluginServiceImpl$DelayedExecutor@70b1.trigger$1L");
                return;
            }
            ExecutorC2203291BLb.LLILLJJLI.execute(runnablePoll);
        }
    }

    public static final void run$2(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        boolean zLIZ;
        C1C7U.LIZ("NavigationModule@c665.goBack$1");
        try {
            if (C2201221BDc.LIZIZ.LIZ() != null) {
                throw null;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationModule@c665.goBack$1");
    }

    public static final void run$3(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        C1C7U.LIZ("BootProtector@bc63.startCheckAppBoot$2L");
        Gson gson = SafeModeReporter.LIZ;
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("safemode_dialog_show_v2");
        arrayList.add("safemode_dialog_button_exit_v2");
        arrayList.add("safemode_dialog_button_clean_v2");
        arrayList.add("safemode_clean_success_v2");
        arrayList.add("safemode_start_success");
        arrayList.add("safemode_protect_success_v2_1");
        arrayList.add("safemode_protect_success_v2_2");
        arrayList.add("safemode_protect_fail_v2");
        arrayList.add("safemode_protect_other_crash_v2");
        arrayList.add("safemode_kill_process_cancel_v2");
        arrayList.add("safemode_reach_roll_back");
        arrayList.add("safemode_done_roll_back");
        arrayList.add("safemode_roll_back_start_success");
        arrayList.add("safemode_roll_back_protect_fail_same");
        arrayList.add("safemode_roll_back_protect_fail_other");
        arrayList.add("safemode_roll_back_protect_success");
        arrayList.add("safemode_roll_back_protect_success_2");
        arrayList.add("safemode_reach_boot_protect");
        arrayList.add("safemode_in_protect_period");
        arrayList.add("safemode_make_snapshot_fail");
        arrayList.add("safemode_abort_roll_back");
        arrayList.add("safemode_roll_back_fail");
        arrayList.add("safemode_skip_crash");
        arrayList.add("safemode_handle_exception_error");
        arrayList.add("safemode_trigger_handle_exception");
        arrayList.add("safemode_stack_calc_exception");
        C2200391B9x.LIZJ("begin reportAllEvent");
        for (String str : arrayList) {
            try {
                Context context = C1BMY.LIZIZ().LJ;
                if (context != null) {
                    C0VSJ c0vsj = new C0VSJ(new C0VSJ(SafeModeReporter.LIZ(context).getAbsolutePath(), "SafeModeReporter"), str);
                    ArrayList<File> arrayList2 = new ArrayList();
                    try {
                        new DirectoryWalker<File>() { // from class: X.13Vw
                            @Override // org.apache.commons.io.DirectoryWalker
                            public final void handleFile(File file, int i, Collection<File> collection) {
                                super.handleFile(file, i, collection);
                                collection.add(file);
                            }
                        }.walk(c0vsj, arrayList2);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    for (File file : arrayList2) {
                        try {
                            if (file.exists()) {
                                C823690WSx.LJ(str, new JSONObject(FileUtils.readFileToString(file, Charset.forName("UTF-8"))));
                                C2200391B9x.LIZJ(C786410Ut5.j4("report %s file %s deleteResult %b", new Object[]{str, file.getAbsolutePath(), Boolean.valueOf(file.delete())}));
                            }
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            } catch (JSONException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        C2200391B9x.LIZJ("end reportAllEvent");
        try {
            C805560Vis c805560VisLJ = C805560Vis.LJ("safe_mode_exception_repo");
            c805560VisLJ.LIZJ("log_tye", "");
            String strLIZJ = c805560VisLJ.LIZJ("exception_msg", "");
            c805560VisLJ.LIZJ("exception_type", "");
            String strLIZJ2 = c805560VisLJ.LIZJ("exception_stack", "");
            C823690WSx.LJII(strLIZJ, strLIZJ2);
            c805560VisLJ.LIZ.edit().clear().apply();
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        C1C7U.LIZIZ("BootProtector@bc63.startCheckAppBoot$2L");
    }

    public static final void run$4(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        Context contextL3;
        C1C7U.LIZ("SafeModeActivity$Companion@d52d.onPositiveClick$1L");
        C1BMY c1bmyLIZIZ = C1BMY.LIZIZ();
        SafeModeActivity safeModeActivity = SafeModeActivity.LLILZIL;
        if (safeModeActivity == null) {
            contextL3 = null;
        } else {
            contextL3 = C786410Ut5.L3(safeModeActivity);
        }
        c1bmyLIZIZ.getClass();
        C2200391B9x.LIZJ("begin cleanAllData");
        C2200401B9y.LJI(contextL3).clearAll();
        C823690WSx c823690WSx = (C823690WSx) C2203571BMd.LJIILLIIL.LIZIZ;
        c823690WSx.getClass();
        if (C291680Bby.LIZ()) {
            C810380Vqe.LIZIZ.LIZ().edit().clear().commit();
            C810380Vqe.LIZ.LIZ().edit().putLong("clear_timestamp", System.currentTimeMillis()).apply();
        } else {
            int size = ExceptionManager.LIZJ(C1BMY.LIZIZ().LJ).LIZ.LIZ().size();
            if (size >= 3) {
                C823690WSx.LIZJ(c823690WSx.LIZ);
                c823690WSx.LIZLLL();
                if (size >= 4) {
                    c823690WSx.LIZIZ();
                }
            }
            C810380Vqe.LIZ.LIZ().edit().putLong("clear_timestamp", System.currentTimeMillis()).apply();
        }
        C2200391B9x.LIZJ("end cleanAllData");
        SafeModeActivity safeModeActivity2 = SafeModeActivity.LLILZIL;
        if (safeModeActivity2 != null) {
            C786410Ut5.L3(safeModeActivity2);
        }
        SafeModeReporter.CrashInfo crashInfoLIZIZ = SafeModeReporter.CrashInfo.LIZIZ(SafeModeActivity.LL, SafeModeActivity.LLILLJJLI);
        int i = SafeModeActivity.LLILLL;
        Gson gson = SafeModeReporter.LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reachType", i);
            jSONObject.put("crash", crashInfoLIZIZ.LIZLLL());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        SafeModeReporter.LIZLLL("safemode_clean_success_v2", jSONObject);
        SafeModeReporter.LJFF("reportCleanSuccess", new ExceptionManager.ExceptionRecord(SafeModeActivity.LL, SafeModeActivity.LLILLJJLI, 0L, ""), "LOG_TYPE_PROTECTOR_REACH_EXCEPTION");
        SafeModeActivity safeModeActivity3 = SafeModeActivity.LLILZIL;
        if (safeModeActivity3 != null) {
            safeModeActivity3.finish();
        }
        SafeModeActivity safeModeActivity4 = SafeModeActivity.LLILZIL;
        if (safeModeActivity4 != null) {
            C0VO7.LIZ(safeModeActivity4);
        }
        C1C7U.LIZIZ("SafeModeActivity$Companion@d52d.onPositiveClick$1L");
    }

    public static final void run$5(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        boolean z;
        C1C7U.LIZ("MiloTimerFactory@ee99.<clinit>$1L");
        try {
            Iterator<C1BDD> it2 = C2201111BCr.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            List<C1BDE> list = C2201111BCr.LIZLLL;
            if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
                C2201111BCr.LIZIZ();
            } else {
                for (C1BDE c1bde : (ArrayList) list) {
                    if (c1bde != null && c1bde.LIZLLL()) {
                        ARunnableS107S0000000_34 aRunnableS107S0000000_342 = C2201111BCr.LIZJ;
                        C1BDF c1bdf = C2201111BCr.LJ;
                        long j = 3000;
                        if (c1bdf != null) {
                            long jLJ = c1bdf.LJ();
                            if (jLJ > 0) {
                                j = jLJ;
                            }
                        }
                        C0NBO.LIZJ(j, aRunnableS107S0000000_342);
                    }
                }
                C2201111BCr.LIZIZ();
            }
        } finally {
            if (z) {
            }
        }
        C1C7U.LIZIZ("MiloTimerFactory@ee99.<clinit>$1L");
    }

    public static final void run$6(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        ArrayList arrayList;
        Set<C1BDW> set;
        C1C7U.LIZ("TaskSchedulerDispatcher@eb0.tryExecuteNextTask$1L");
        int size = C1BDQ.LIZIZ.size();
        C1BDQ c1bdq = C1BDQ.LIZ;
        C1BDQ.LJI().getClass();
        if (size >= C1702010uON.LJII.length + C1702010uON.LJIIIIZZ.size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryExecuteNextTask, but count is exceed, just return, pending queue size: ");
            sbLIZ.append(C1BDQ.LIZJ.size());
            sbLIZ.append("  ");
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            PriorityQueue<C1BDK> priorityQueue = C1BDQ.LIZJ;
            if (!priorityQueue.isEmpty()) {
                Iterator<C1BDK> it2 = priorityQueue.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
                int i = C2201211BDb.LIZ;
                if (((C1702090uOV) C1BDY.LIZ.getValue()).LIZ()) {
                    PriorityQueue<C1BDK> priorityQueue2 = C1BDQ.LIZJ;
                    ArrayList arrayList2 = new ArrayList();
                    for (C1BDK c1bdk : priorityQueue2) {
                        C1BCC c1bcc = c1bdk.LL;
                        c1bcc.getClass();
                        ArrayList arrayList3 = (ArrayList) c1bcc.LLILLL;
                        if (!(!arrayList3.isEmpty()) || C1BDQ.LIZLLL.containsAll(arrayList3)) {
                            arrayList2.add(c1bdk);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.addAll(arrayList2);
                        for (Object obj : C1BDQ.LJ.keySet()) {
                            if (!Intrinsics.LJFF(obj, "all_milo_task")) {
                                arrayList = new ArrayList();
                                for (Object obj2 : arrayList2) {
                                    ((C1BDK) obj2).LL.getClass();
                                    if (Intrinsics.LJFF("", obj)) {
                                        arrayList.add(obj2);
                                    }
                                }
                            } else {
                                arrayList = arrayList2;
                            }
                            if (!arrayList.isEmpty() && (set = C1BDQ.LJ.get(obj)) != null) {
                                Iterator<T> it3 = set.iterator();
                                while (it3.hasNext()) {
                                    linkedHashSet.removeAll(C13LP.LLIIJI(((C1BDW) it3.next()).LIZJ(arrayList)));
                                }
                            }
                        }
                        arrayList2.size();
                        linkedHashSet.size();
                        PriorityQueue priorityQueue3 = new PriorityQueue();
                        priorityQueue3.addAll(linkedHashSet);
                        C1BDK c1bdk2 = (C1BDK) priorityQueue3.poll();
                        if (c1bdk2 != null) {
                            C1BDQ.LJIIJ(c1bdk2);
                        }
                    }
                }
            }
        }
        C1C7U.LIZIZ("TaskSchedulerDispatcher@eb0.tryExecuteNextTask$1L");
    }

    public static final void run$7(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        C1C7U.LIZ("TaskSchedulerDispatcher@eb0.callback$1L");
        long jCurrentTimeMillis = System.currentTimeMillis();
        PriorityQueue<C1BDK> priorityQueue = C1BDQ.LIZJ;
        ArrayList arrayList = new ArrayList();
        for (C1BDK c1bdk : priorityQueue) {
            C1BDK c1bdk2 = c1bdk;
            if (jCurrentTimeMillis - c1bdk2.LLILZ > c1bdk2.LL.LLJI) {
                arrayList.add(c1bdk);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            C1BDQ c1bdq = C1BDQ.LIZ;
            if (!zHasNext) {
                break;
            }
            C1BDK c1bdk3 = (C1BDK) it2.next();
            if (C1783000wV0.LIZ[c1bdk3.LL.LLILZIL.ordinal()] == 1) {
                C1BDQ.LJIIJ(c1bdk3);
            } else if (jCurrentTimeMillis - c1bdk3.LLILZ > ((long) 3) * c1bdk3.LL.LLJI) {
                C1BDQ.LJIIIIZZ(c1bdk3);
                c1bdk3.LL.getClass();
            }
        }
        if (jCurrentTimeMillis - C1BDQ.LJI > 600) {
            C0NBO.LIZ(new ARunnableS107S0000000_34(6));
            C1BDQ.LJI = jCurrentTimeMillis;
        }
        C1C7U.LIZIZ("TaskSchedulerDispatcher@eb0.callback$1L");
    }

    public static final void run$8(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        C1C7U.LIZ("NativeProtocol@2f27.updateAllAvailableProtocolVersionsAsync$1L");
        if (!C807660VmG.LIZ(C1BIE.class)) {
            try {
                try {
                    Iterator<C1BIF> it2 = C1BIE.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(true);
                    }
                    C1BIE.LIZLLL.set(false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1BIE.LIZLLL.set(false);
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        C1C7U.LIZIZ("NativeProtocol@2f27.updateAllAvailableProtocolVersionsAsync$1L");
    }

    public static final void run$9(ARunnableS107S0000000_34 aRunnableS107S0000000_34) {
        C1C7U.LIZ("AttributionReporter@37d1.<clinit>$1L");
        C2225431C8f.LIZIZ();
        C2225431C8f.LIZJ = 0;
        C1C7U.LIZIZ("AttributionReporter@37d1.<clinit>$1L");
    }
}

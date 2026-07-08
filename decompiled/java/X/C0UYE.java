package X;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.broadcast.notification.governor.BroadcastBgStageEvent;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostEnableNetControlSetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0UYE, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UYE {
    public final LiveBroadcastFragment LIZ;
    public final DataChannel LIZIZ;
    public long LJFF;
    public final Handler LIZJ = C473410IhP.LIZ();
    public final Map<EnumC780370UjL, Runnable> LIZLLL = new LinkedHashMap();
    public final Set<EnumC780370UjL> LJ = new LinkedHashSet();
    public final C0UYD LJI = new InterfaceC2188711AlJ() { // from class: X.0UYD
        @Override // X.InterfaceC2188711AlJ
        public final void LIZ(C1768270w7F c1768270w7F) {
            if (c1768270w7F == null || this.LIZ.LJFF <= 0 || c1768270w7F.LIZIZ != C09QO.LOW_PHYSICAL_MEM) {
                return;
            }
            int i = c1768270w7F.LJ;
            if (i != -100 && i != 15 && i != 80) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MemRelief: physical mem pressure level=");
            sbLIZ.append(c1768270w7F.LJ);
            sbLIZ.append(", accelerating");
            C20441214yg.LIZIZ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ));
            C0UYE c0uye = this.LIZ;
            if (c0uye.LJFF <= 0) {
                return;
            }
            Iterator it2 = ((LinkedHashMap) c0uye.LIZLLL).values().iterator();
            while (it2.hasNext()) {
                c0uye.LIZJ.removeCallbacks((Runnable) it2.next());
            }
            ((LinkedHashMap) c0uye.LIZLLL).clear();
            EnumC780370UjL[] enumC780370UjLArrValues = EnumC780370UjL.values();
            ArrayList arrayList = new ArrayList();
            for (EnumC780370UjL enumC780370UjL : enumC780370UjLArrValues) {
                if (!c0uye.LJ.contains(enumC780370UjL) && C1152750g6T.LIZIZ(enumC780370UjL).getEnabled()) {
                    arrayList.add(enumC780370UjL);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("executeRemainingStagesImmediately: ");
            sbLIZ2.append(arrayList.size());
            sbLIZ2.append(" stages");
            C20441214yg.LIZIZ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ2));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c0uye.LIZ((EnumC780370UjL) it3.next());
            }
        }
    };

    public final void LIZIZ() {
        if (this.LJFF > 0 || !this.LIZLLL.isEmpty()) {
            Iterator it2 = ((LinkedHashMap) this.LIZLLL).values().iterator();
            while (it2.hasNext()) {
                this.LIZJ.removeCallbacks((Runnable) it2.next());
            }
            ((LinkedHashMap) this.LIZLLL).clear();
            this.LJ.clear();
            if (this.LJFF > 0) {
                if (LiveHostEnableNetControlSetting.INSTANCE.enable()) {
                    try {
                        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).unRegisterNetworkControl("biz_live_broadcast_background");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("unregisterBackgroundNetControl failed: ");
                        sbLIZ.append(e.getMessage());
                        C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                if (C774430UZl.LIZ) {
                    C774430UZl.LIZ = false;
                    IPerformanceService iPerformanceService = (IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class);
                    if (iPerformanceService != null) {
                        try {
                            iPerformanceService.Sc1();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("resumeBackgroundExecutors failed: ");
                            sbLIZ2.append(th.getMessage());
                            C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                    C20441214yg.LIZIZ("BgGovernor", "resume: background executors resumed");
                    if (iPerformanceService != null) {
                        try {
                            iPerformanceService.QE1();
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("resetLowPriorityThreads failed: ");
                            sbLIZ3.append(th2.getMessage());
                            C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    C20441214yg.LIZIZ("BgGovernor", "resume: low-priority threads restored to normal");
                }
                try {
                    C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                    if (c1325540kbALIZ.LJIILL()) {
                        c1325540kbALIZ.LJIJJ();
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("resumeFresco failed: ");
                    sbLIZ4.append(e2.getMessage());
                    C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ4));
                }
                try {
                    ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).Ck2();
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("resumeGecko failed: ");
                    sbLIZ5.append(e3.getMessage());
                    C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ5));
                }
                try {
                    C800240VaI.LIZ();
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("resumeLegoTasks failed: ");
                    sbLIZ6.append(e4.getMessage());
                    C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
            this.LJFF = 0L;
            InterfaceC772190UQv.T3.LJFF("");
            InterfaceC772190UQv.U3.LJFF(0L);
            C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
            C0UYD c0uyd = this.LJI;
            c2188561Al4.getClass();
            C09QK.LIZ(c0uyd);
            C20441214yg.LIZIZ("BgGovernor", "stop: all cleaned up");
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0UYD] */
    public C0UYE(LiveBroadcastFragment liveBroadcastFragment) {
        this.LIZ = liveBroadcastFragment;
        this.LIZIZ = liveBroadcastFragment.getDataChannel();
    }

    public final void LIZ(final EnumC780370UjL enumC780370UjL) {
        Boolean boolValueOf;
        if (this.LJ.contains(enumC780370UjL)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("bg_governor_stage_enter");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(enumC780370UjL.name(), "stage");
        long delayMs = C1152750g6T.LIZIZ(enumC780370UjL).getDelayMs();
        if (delayMs < 0) {
            delayMs = enumC780370UjL.getDefaultDelayMs();
        }
        c474500IjALIZ.LJJII(Long.valueOf(delayMs), "delay_ms");
        c474500IjALIZ.LIZ();
        InterfaceC772190UQv.T3.LJFF(enumC780370UjL.name());
        InterfaceC772190UQv.U3.LJFF(Long.valueOf(SystemClock.uptimeMillis() - this.LJFF));
        this.LJ.add(enumC780370UjL);
        this.LIZLLL.remove(enumC780370UjL);
        DataChannel dataChannel = this.LIZIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        dataChannel.LC0(BroadcastBgStageEvent.class, new Object(enumC780370UjL, jCurrentTimeMillis) { // from class: X.04y8
            public final EnumC780370UjL LIZ;
            public final long LIZIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1270604y8)) {
                    return false;
                }
                C1270604y8 c1270604y8 = (C1270604y8) obj;
                return this.LIZ == c1270604y8.LIZ && this.LIZIZ == c1270604y8.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BroadcastBgStageData(stage=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", timestampMs=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = enumC780370UjL;
                this.LIZIZ = jCurrentTimeMillis;
            }
        });
        DataChannel dataChannel2 = this.LIZIZ;
        List<String> actions = C1152750g6T.LIZIZ(enumC780370UjL).getActions();
        if (actions.isEmpty()) {
            actions = enumC780370UjL.getDefaultActions();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long jUptimeMillis = SystemClock.uptimeMillis();
        Iterator<String> it2 = actions.iterator();
        while (true) {
            boolean z = true;
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            C0UZU c0uzu = C780360UjK.LIZ.get(next);
            if (c0uzu == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("action=");
                sbLIZ.append(next);
                sbLIZ.append(" stage=");
                sbLIZ.append(enumC780370UjL.name());
                sbLIZ.append(" skipped: not registered");
                C20441214yg.LJIIL("BgGovernor", C2188811AlT.LIZIZ(sbLIZ));
                boolValueOf = null;
            } else {
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                try {
                    c0uzu.LIZ(dataChannel2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Action ");
                    sbLIZ2.append(next);
                    sbLIZ2.append(" failed: ");
                    sbLIZ2.append(th.getMessage());
                    C20441214yg.LJ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ2));
                    z = false;
                }
                C20441214yg.LIZIZ("BgGovernor", "action=" + next + " stage=" + enumC780370UjL.name() + " success=" + z + " cost=" + (SystemClock.uptimeMillis() - jUptimeMillis3) + "ms");
                boolValueOf = Boolean.valueOf(z);
            }
            arrayList3.add(Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
            if (boolValueOf != null) {
                arrayList.add(next);
                if (!boolValueOf.booleanValue()) {
                    arrayList2.add(next);
                }
            }
        }
        long jUptimeMillis4 = SystemClock.uptimeMillis() - jUptimeMillis;
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("bg_governor_action_exec");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJII(enumC780370UjL.name(), "stage");
        c474500IjALIZ2.LJJII(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), "action_id_list");
        c474500IjALIZ2.LJJII(Long.valueOf(jUptimeMillis4), "total_cost");
        c474500IjALIZ2.LJJII(C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62), "action_cost");
        if (!arrayList2.isEmpty()) {
            c474500IjALIZ2.LJJII(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62), "failed_id");
        }
        c474500IjALIZ2.LIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("executeStage: ");
        sbLIZ3.append(enumC780370UjL.name());
        sbLIZ3.append(" done, elapsed=");
        sbLIZ3.append(SystemClock.uptimeMillis() - this.LJFF);
        sbLIZ3.append("ms");
        C20441214yg.LIZIZ("BgGovernor", C2188811AlT.LIZIZ(sbLIZ3));
    }
}

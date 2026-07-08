package X;

import android.app.Activity;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2185551AgD extends C08U0 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;
    public int LJI = -1;
    public final int LJIIJJI = Process.myPid();

    @Override // X.C08U0
    public final void onGCStart(int i, int i2, int i3) {
        long minorFaults;
        long majorFaults = -1;
        if (!C791560V3i.LJIIJJI) {
            minorFaults = -1;
        } else {
            minorFaults = MonitorJni.getMinorFaults();
        }
        this.LJ = minorFaults;
        if (C791560V3i.LJIIJJI) {
            majorFaults = MonitorJni.getMajorFaults();
        }
        this.LJFF = majorFaults;
        this.LJIIJ = 0;
        this.LJIIIZ = 0L;
        this.LJIIIIZZ = 0L;
    }

    @Override // X.C08U0
    public final void onWaitGc(int i, int i2, int i3) {
        if (this.LJIIIZ == 0) {
            this.LJIIIZ = System.nanoTime();
        }
        this.LJIIJ++;
        if (i == this.LJIIJJI) {
            this.LJIIIIZZ = System.nanoTime();
        }
        this.LJI = i3;
    }

    @Override // X.C08U0
    public final void onGCEnd(final int i, final int i2, final int i3, final long j, final boolean z, final long j2, final long j3, final long j4, final long j5, long j6) {
        final long j7;
        final long j8;
        long majorFaults;
        try {
            long j9 = this.LJIIIIZZ;
            this.LJIIIIZZ = 0L;
            long j10 = this.LJIIIZ;
            this.LJIIIZ = 0L;
            final int i4 = this.LJIIJ;
            this.LJIIJ = 0;
            long jNanoTime = System.nanoTime();
            if (j9 > 0) {
                j7 = (jNanoTime - j9) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                j7 = 0;
            }
            if (j10 <= 0) {
                j8 = 0;
            } else {
                j8 = (jNanoTime - j10) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final long j11 = this.LIZ;
            try {
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.1AgE
                    public final void LIZ() {
                        C2185551AgD c2185551AgD = this.LL;
                        final int i5 = i3;
                        final int i6 = i2;
                        final long j12 = j;
                        long j13 = jCurrentTimeMillis;
                        long j14 = j11;
                        final long j15 = j2;
                        final long j16 = j3;
                        final int i7 = i;
                        final long j17 = j5;
                        final long j18 = j4;
                        final boolean z2 = z;
                        final long j19 = j7;
                        final long j20 = j8;
                        final int i8 = i4;
                        final int i9 = c2185551AgD.LJI;
                        if (C2185581AgG.LIZ().getSceneSample() > 0) {
                            if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, C2185581AgG.LIZ().getSceneSample())) != 1 || j13 - c2185551AgD.LJII < C2185581AgG.LIZ().getMinInterval()) {
                                return;
                            }
                            c2185551AgD.LJII = j13;
                            long j21 = j14 > 0 ? j13 - j14 : -1L;
                            final C2185571AgF c2185571AgF = new C2185571AgF();
                            c2185571AgF.LIZ = c2185551AgD.LIZIZ;
                            c2185571AgF.LIZIZ = c2185551AgD.LIZJ;
                            c2185571AgF.LIZJ = c2185551AgD.LIZLLL;
                            c2185571AgF.LIZLLL = c2185551AgD.LJ;
                            c2185571AgF.LJ = c2185551AgD.LJFF;
                            final long j22 = j21;
                            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.1AgC
                                public final /* synthetic */ C794440VEk LLJIJIL = C794510VEr.LIZ;

                                public final void LIZ() {
                                    C19EG c19eg;
                                    MainActivityScope mainActivityScopeLIZJ;
                                    Activity activityLIZIZ;
                                    Object obj;
                                    int i10 = i5;
                                    int i11 = i6;
                                    long j23 = j12;
                                    long j24 = j22;
                                    long j25 = j15;
                                    long j26 = j16;
                                    int i12 = i7;
                                    long j28 = j17;
                                    long j29 = j18;
                                    boolean z3 = z2;
                                    C794440VEk c794440VEk = this.LLJIJIL;
                                    long j30 = j19;
                                    long j31 = j20;
                                    int i13 = i8;
                                    int i14 = i9;
                                    C2185571AgF c2185571AgF2 = c2185571AgF;
                                    try {
                                        long j32 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.bytes-allocated"));
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("gc_cause", i10);
                                        jSONObject.put("gc_type", i11);
                                        jSONObject.put("app_time", SystemClock.uptimeMillis() - C202094145s.LJII);
                                        jSONObject.put("gc_time", j23 / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                        if (C2185581AgG.LIZ().getSceneSample() > 0) {
                                            jSONObject.put("simple_rate", Float.valueOf(1.0f / C2185581AgG.LIZ().getSceneSample()));
                                        }
                                        if (j24 > 0) {
                                            jSONObject.put("gc_interval", j24);
                                        }
                                        jSONObject.put("freed_bytes", j25);
                                        jSONObject.put("freed_objs", j26);
                                        jSONObject.put("heap_size", Runtime.getRuntime().maxMemory());
                                        jSONObject.put("total_memory", Runtime.getRuntime().totalMemory());
                                        jSONObject.put("used_memory", Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
                                        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                                        jSONObject.put("activity_name", (abstractC1387200mCcLJ == null || (obj = abstractC1387200mCcLJ.LIZ) == null) ? null : obj.getClass().toString());
                                        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                                        Activity activityLIZ = (abstractC1387200mCcLJ2 == null || (activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ()) == null) ? null : C06MM.LIZ(activityLIZIZ);
                                        HomeTabAbility homeTabAbilityLIZ = (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null) ? null : C0DMM.LIZ(mainActivityScopeLIZJ);
                                        jSONObject.put("top_tab_name", homeTabAbilityLIZ != null ? homeTabAbilityLIZ.Ct0() : null);
                                        jSONObject.put("bottom_tab_name", homeTabAbilityLIZ != null ? homeTabAbilityLIZ.Zj2() : null);
                                        jSONObject.put("thread_name", C2095208Is.LIZ(i12));
                                        try {
                                            C189200o6.m2constructorimpl(jSONObject.put("thread_nice", Process.getThreadPriority(i12)));
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C189200o6.m2constructorimpl(new C098200Yq(th));
                                        }
                                        jSONObject.put("freed_larged_objs", j28);
                                        jSONObject.put("freed_larged_bytes", j29);
                                        jSONObject.put("clear_soft_ref", z3);
                                        jSONObject.put("gc_count_total", CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-count")));
                                        jSONObject.put("gc_time_total", CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-time")));
                                        jSONObject.put("block_gc_count_total", CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count")));
                                        jSONObject.put("block_gc_time_total", CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time")));
                                        jSONObject.put("allcated_bytes", j32 - c2185571AgF2.LIZ);
                                        jSONObject.put("allcated_bytes_total", j32);
                                        c794440VEk.getClass();
                                        long minorFaults = !C791560V3i.LJIIJJI ? -1L : MonitorJni.getMinorFaults();
                                        long majorFaults2 = C791560V3i.LJIIJJI ? MonitorJni.getMajorFaults() : -1L;
                                        long j33 = c2185571AgF2.LIZLLL;
                                        if (j33 > 0) {
                                            jSONObject.put("minor_faults_in_gc", minorFaults - j33);
                                            jSONObject.put("major_faults_in_gc", majorFaults2 - c2185571AgF2.LJ);
                                        }
                                        long j34 = c2185571AgF2.LIZJ;
                                        if (j34 > 0) {
                                            jSONObject.put("minor_faults_diff", minorFaults - j34);
                                            jSONObject.put("major_faults_diff", majorFaults2 - c2185571AgF2.LIZIZ);
                                        }
                                        jSONObject.put("minor_faults", minorFaults);
                                        jSONObject.put("major_faults", majorFaults2);
                                        jSONObject.put("main_wait", j30);
                                        jSONObject.put("wait_duration", j31);
                                        if (i14 >= 0) {
                                            jSONObject.put("wait_cause", i14);
                                        }
                                        jSONObject.put("wait_count", i13);
                                        jSONObject.put("is_background", C1906580ziK.LJI());
                                        C20684815ws.LJIJ("prf_gc_callback", jSONObject);
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("GCCallbackReporter@99ba.report$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("GCCallbackReporter@99ba.report$1");
                                }
                            });
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GCCallbackReporter@99ba.onGCEnd$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GCCallbackReporter@99ba.onGCEnd$1");
                    }
                });
                try {
                    this.LIZ = jCurrentTimeMillis;
                    this.LIZIZ = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.bytes-allocated"));
                    long minorFaults = -1;
                    if (!C791560V3i.LJIIJJI) {
                        majorFaults = -1;
                    } else {
                        majorFaults = MonitorJni.getMajorFaults();
                    }
                    this.LIZJ = majorFaults;
                    if (C791560V3i.LJIIJJI) {
                        minorFaults = MonitorJni.getMinorFaults();
                    }
                    this.LIZLLL = minorFaults;
                    this.LJI = -1;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.lynx.tasm.fluency.FluencySample;
import j27.s;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.0kSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320440kSw {
    public final C1320470kSz LIZ;
    public double LIZJ;
    public boolean LJ;
    public final SecureRandom LIZIZ = new SecureRandom();
    public EnumC1320490kT1 LIZLLL = EnumC1320490kT1.NON_FORCED;
    public EnumC1299430jv3 LJFF = EnumC1299430jv3.UNSET;

    public final boolean LIZ() {
        EnumC1320490kT1 enumC1320490kT1 = this.LIZLLL;
        if (enumC1320490kT1 != EnumC1320490kT1.NON_FORCED) {
            return enumC1320490kT1 == EnumC1320490kT1.FORCED_ON;
        }
        if (FluencySample.LIZ.compareAndSet(true, false)) {
            FluencySample.LIZIZ = LynxEnv.getBooleanFromExternalEnv(EnumC1310010kC7.ENABLE_FLUENCY_TRACE, false);
        }
        return FluencySample.LIZIZ;
    }

    public final void LIZLLL() {
        if (this.LIZJ < 0.0d) {
            EnumC1299430jv3 enumC1299430jv3 = this.LJFF;
            if (enumC1299430jv3 != EnumC1299430jv3.UNSET) {
                this.LIZLLL = enumC1299430jv3 == EnumC1299430jv3.TRUE ? EnumC1320490kT1.FORCED_ON : EnumC1320490kT1.FORCED_OFF;
                return;
            }
            return;
        }
        if (!this.LJ || this.LIZLLL == EnumC1320490kT1.NON_FORCED) {
            this.LJ = true;
            if (this.LIZIZ.nextDouble() <= this.LIZJ) {
                this.LIZLLL = EnumC1320490kT1.FORCED_ON;
            } else {
                this.LIZLLL = EnumC1320490kT1.FORCED_OFF;
            }
        }
    }

    public C1320440kSw(s sVar) {
        this.LIZJ = -1.0d;
        this.LJ = false;
        C1310290kCZ c1310290kCZ = sVar.LLLIIII;
        this.LIZJ = c1310290kCZ != null ? c1310290kCZ.LJJIL : -1.0d;
        this.LJ = false;
        LIZLLL();
        this.LIZ = new C1320470kSz(sVar);
    }

    public final void LIZJ(int i) {
        int i2;
        final C1320510kT3 c1320510kT3;
        if (this.LIZ != null && LIZ()) {
            C1320470kSz c1320470kSz = this.LIZ;
            C1320460kSy c1320460kSy = (C1320460kSy) ((HashMap) c1320470kSz.LIZIZ).get(Integer.valueOf(i));
            if (c1320460kSy != null) {
                if (c1320460kSy.LIZIZ) {
                    c1320460kSy.LJIIIZ = SystemClock.elapsedRealtime() - c1320460kSy.LJIIIIZZ;
                    if (c1320460kSy.LIZLLL != null) {
                        C786410Ut5.v2().removeFrameCallback(c1320460kSy.LIZLLL);
                    }
                    final C1320480kT0 c1320480kT0 = new C1320480kT0();
                    c1320480kT0.LIZLLL = c1320460kSy.LJIIIZ;
                    if (c1320460kSy.LJI - c1320460kSy.LJFF > 0 && (i2 = c1320460kSy.LJII) > 1) {
                        c1320480kT0.LIZIZ = (int) (((((double) (i2 - 1)) * 1000000.0d) * 1000.0d) / r6);
                        c1320480kT0.LIZJ = c1320460kSy.LJIIJ;
                        c1320460kSy.LJIIJ = -1;
                        if (!c1320460kSy.LJ.isEmpty()) {
                            LinkedList<Long> linkedList = c1320460kSy.LJ;
                            c1320460kSy.LJ = new LinkedList<>();
                            if (!linkedList.isEmpty()) {
                                int i3 = c1320480kT0.LIZJ - 1;
                                for (Long l : linkedList) {
                                    int i4 = (int) 1666.6666666666667d;
                                    int iMax = Math.max(Math.min((int) (((l.longValue() + ((long) (i4 - 1))) / ((long) i4)) - 1), i3), 0);
                                    long jLongValue = (l.longValue() / 100) - ((long) 16.666666666666668d);
                                    c1320480kT0.LIZ++;
                                    if (iMax >= 1) {
                                        c1320480kT0.LJ++;
                                        c1320480kT0.LJFF += jLongValue;
                                        if (iMax >= 3) {
                                            c1320480kT0.LJI++;
                                            c1320480kT0.LJII += jLongValue;
                                            if (iMax >= 7) {
                                                c1320480kT0.LJIIIIZZ++;
                                                c1320480kT0.LJIIIZ += jLongValue;
                                                if (iMax >= 25) {
                                                    c1320480kT0.LJIIJ++;
                                                    c1320480kT0.LJIIJJI += jLongValue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            s sVar = c1320460kSy.LIZ.get();
                            if (sVar != null && sVar.LIZLLL() && (c1320510kT3 = c1320460kSy.LIZJ) != null) {
                                LynxEventReporter.onEvent("lynxsdk_fluency_event", c1320510kT3.LIZIZ, new InterfaceC1289180jeW() { // from class: X.0kSx
                                    @Override // X.InterfaceC1289180jeW
                                    public final Map build() {
                                        C1320510kT3 c1320510kT32 = c1320510kT3;
                                        C1320480kT0 c1320480kT02 = c1320480kT0;
                                        c1320510kT32.getClass();
                                        HashMap map = new HashMap();
                                        map.put("lynxsdk_fluency_scene", c1320510kT32.LIZ.LIZ);
                                        map.put("lynxsdk_fluency_tag", c1320510kT32.LIZ.LIZIZ);
                                        map.put("lynxsdk_fluency_maximum_frames", Integer.valueOf(c1320480kT02.LIZJ));
                                        map.put("lynxsdk_fluency_frames_number", Integer.valueOf(c1320480kT02.LIZ));
                                        map.put("lynxsdk_fluency_fps", Integer.valueOf(c1320480kT02.LIZIZ));
                                        map.put("lynxsdk_fluency_dur", Long.valueOf(c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop1_count", Integer.valueOf(c1320480kT02.LJ));
                                        map.put("lynxsdk_fluency_drop1_duration", Long.valueOf(c1320480kT02.LJFF));
                                        map.put("lynxsdk_fluency_drop3_count", Integer.valueOf(c1320480kT02.LJI));
                                        map.put("lynxsdk_fluency_drop3_duration", Long.valueOf(c1320480kT02.LJII));
                                        map.put("lynxsdk_fluency_drop7_count", Integer.valueOf(c1320480kT02.LJIIIIZZ));
                                        map.put("lynxsdk_fluency_drop7_duration", Long.valueOf(c1320480kT02.LJIIIZ));
                                        map.put("lynxsdk_fluency_drop25_count", Integer.valueOf(c1320480kT02.LJIIJ));
                                        map.put("lynxsdk_fluency_drop25_duration", Long.valueOf(c1320480kT02.LJIIJJI));
                                        map.put("lynxsdk_fluency_drop1_count_per_second", Double.valueOf((((double) c1320480kT02.LJ) * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop3_count_per_second", Double.valueOf((((double) c1320480kT02.LJI) * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop7_count_per_second", Double.valueOf((((double) c1320480kT02.LJIIIIZZ) * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop25_count_per_second", Double.valueOf((((double) c1320480kT02.LJIIJ) * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop1_ratio", Double.valueOf((c1320480kT02.LJFF * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop3_ratio", Double.valueOf((c1320480kT02.LJII * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop7_ratio", Double.valueOf((c1320480kT02.LJIIIZ * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_drop25_ratio", Double.valueOf((c1320480kT02.LJIIJJI * 1000.0d) / c1320480kT02.LIZLLL));
                                        map.put("lynxsdk_fluency_pageconfig_probability", Double.valueOf(c1320510kT32.LIZ.LIZJ));
                                        map.put("lynxsdk_fluency_enabled_by_sampling", Integer.valueOf(c1320510kT32.LIZ.LIZLLL.ordinal()));
                                        return map;
                                    }
                                });
                            }
                        }
                    }
                    c1320460kSy.LIZIZ = false;
                }
                ((HashMap) c1320470kSz.LIZIZ).remove(Integer.valueOf(i));
            }
            TraceEvent.LJIIJ(0L, "StopFluencyTrace");
        }
    }

    public final void LIZIZ(int i, String str) {
        if (this.LIZ != null && LIZ()) {
            C1320500kT2 c1320500kT2 = new C1320500kT2();
            c1320500kT2.LIZ = "scroll";
            c1320500kT2.LIZIZ = str;
            c1320500kT2.LIZJ = this.LIZJ;
            c1320500kT2.LIZLLL = this.LJFF;
            C1320470kSz c1320470kSz = this.LIZ;
            C1320460kSy c1320460kSy = (C1320460kSy) ((HashMap) c1320470kSz.LIZIZ).get(Integer.valueOf(i));
            if (c1320460kSy == null) {
                s sVar = c1320470kSz.LIZ.get();
                if (sVar != null) {
                    c1320460kSy = new C1320460kSy(sVar);
                    c1320460kSy.LIZJ = new C1320510kT3(sVar.LLJLILLLLZIIL, c1320500kT2);
                    ((HashMap) c1320470kSz.LIZIZ).put(Integer.valueOf(i), c1320460kSy);
                } else {
                    return;
                }
            }
            if (!c1320460kSy.LIZIZ) {
                c1320460kSy.LJ.clear();
                c1320460kSy.LJFF = -1L;
                c1320460kSy.LJI = -1L;
                c1320460kSy.LJII = 0;
                c1320460kSy.LIZLLL = new ChoreographerFrameCallbackC1339260kxI(c1320460kSy, 2);
                try {
                    c1320460kSy.LJIIIIZZ = SystemClock.elapsedRealtime();
                    C786410Ut5.v2().postFrameCallback(c1320460kSy.LIZLLL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    c1320460kSy.LIZIZ = false;
                    c1320460kSy.LJFF = -1L;
                    c1320460kSy.LJI = -1L;
                    c1320460kSy.LJII = 0;
                    c1320460kSy.LIZLLL = null;
                    c1320460kSy.LJIIIIZZ = -1L;
                }
                c1320460kSy.LIZIZ = true;
            }
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put(Scene.SCENE_SERVICE, c1320500kT2.LIZ);
                map.put("tag", c1320500kT2.LIZIZ);
                TraceEvent.LJIIL(0L, "StartFluencyTrace", map);
            }
        }
    }
}

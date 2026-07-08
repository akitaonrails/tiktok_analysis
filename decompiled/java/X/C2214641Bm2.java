package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS134S0100000_34;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.otis.resource.psi.ResourceContentionConfig;
import com.bytedance.otis.resource.psi.ResourceContentionSnapshot;
import com.bytedance.otis.resource.psi.ResourcePsiListener;
import com.bytedance.otis.resource.psi.ResourcePsiMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214641Bm2 {
    public static volatile RunnableC2184141Adw LJJIJIL;
    public static final C2214641Bm2 LIZ = new C2214641Bm2();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicReference<Boolean> LJ = new AtomicReference<>();
    public static final AtomicBoolean LJFF = new AtomicBoolean(false);
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final AtomicLong LJIIIZ = new AtomicLong(0);
    public static final AtomicLong LJIIJ = new AtomicLong(0);
    public static final AtomicLong LJIIJJI = new AtomicLong(0);
    public static final AtomicLong LJIIL = new AtomicLong(0);
    public static final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILJJIL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILL = new AtomicBoolean(false);
    public static final AtomicBoolean LJIILLIIL = new AtomicBoolean(false);
    public static final AtomicReference<C2214701Bm8> LJIIZILJ = new AtomicReference<>();
    public static final AtomicReference<C2214701Bm8> LJIJ = new AtomicReference<>();
    public static final AtomicReference<String> LJIJI = new AtomicReference<>("missing");
    public static final AtomicLong LJIJJ = new AtomicLong(Long.MIN_VALUE);
    public static final AtomicLong LJIJJLI = new AtomicLong(Long.MIN_VALUE);
    public static final AtomicLong LJIL = new AtomicLong(Long.MIN_VALUE);
    public static final AtomicLong LJJ = new AtomicLong(Long.MIN_VALUE);
    public static final AtomicLong LJJI = new AtomicLong(Long.MIN_VALUE);
    public static final AtomicLong LJJIFFI = new AtomicLong(Long.MIN_VALUE);
    public static volatile boolean LJJII = true;
    public static final AtomicBoolean LJJIII = new AtomicBoolean(false);
    public static final AtomicBoolean LJJIIJ = new AtomicBoolean(false);
    public static final AtomicBoolean LJJIIJZLJL = new AtomicBoolean(false);
    public static final BPEAHandler LJJIIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Set<String> LJJIIZI = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> LJJIJ = new ConcurrentHashMap<>();
    public static final Set<String> LJJIJIIJI = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final Set<String> LJJIJIIJIL = C13LQ.LJLIIL(new String[]{"cold_boot_cpu_sched", "core_scene"});
    public static final C2214651Bm3 LJJIJL = new AbstractC791320V2k() { // from class: X.1Bm3
        @Override // X.AbstractC791320V2k
        public final void LJIILJJIL(String str) {
            String str2;
            long j;
            long j2;
            this.LL = true;
            if (!C2214641Bm2.LJJII) {
                if (C2214641Bm2.LIZLLL()) {
                    try {
                        ResourcePsiMonitor.getInstance().onDispatchStart();
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                }
                return;
            }
            long jNanoTime = System.nanoTime();
            if (!C2214641Bm2.LIZLLL()) {
                long jIncrementAndGet = C2214641Bm2.LJIIJJI.incrementAndGet();
                if (jIncrementAndGet <= 5) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dropNonMainDispatchStart#");
                    sbLIZ.append(jIncrementAndGet);
                    sbLIZ.append(", monoNs=");
                    sbLIZ.append(jNanoTime);
                    sbLIZ.append(", tid=");
                    sbLIZ.append(Process.myTid());
                    sbLIZ.append(", thread=");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    sbLIZ.append(", deltaFromStartPointMs=");
                    C2214701Bm8 c2214701Bm8 = C2214641Bm2.LJIIZILJ.get();
                    if (c2214701Bm8 != null) {
                        j2 = c2214701Bm8.LIZ;
                    } else {
                        j2 = Long.MIN_VALUE;
                    }
                    sbLIZ.append(C2214641Bm2.LIZIZ(j2, jNanoTime));
                    sbLIZ.append(", deltaFromObserverRegisterMs=");
                    sbLIZ.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIJJ.get(), jNanoTime));
                    sbLIZ.append(", msg=");
                    sbLIZ.append(C2214641Bm2.LJIJI(str));
                    C2214641Bm2.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            C2214641Bm2.LJIIIIZZ.set(true);
            long jIncrementAndGet2 = C2214641Bm2.LJIIIZ.incrementAndGet();
            boolean zCompareAndSet = C2214641Bm2.LJJI.compareAndSet(Long.MIN_VALUE, jNanoTime);
            if (zCompareAndSet || jIncrementAndGet2 <= 5) {
                StringBuilder sb = new StringBuilder();
                if (zCompareAndSet) {
                    str2 = "firstDispatchStart";
                } else {
                    str2 = "dispatchStart";
                }
                sb.append(str2);
                sb.append('#');
                sb.append(jIncrementAndGet2);
                sb.append(", monoNs=");
                sb.append(jNanoTime);
                sb.append(", count=");
                sb.append(jIncrementAndGet2);
                sb.append(", tid=");
                sb.append(Process.myTid());
                sb.append(", thread=");
                sb.append(C786410Ut5.u3().getName());
                sb.append(", deltaFromStartPointMs=");
                C2214701Bm8 c2214701Bm82 = C2214641Bm2.LJIIZILJ.get();
                if (c2214701Bm82 != null) {
                    j = c2214701Bm82.LIZ;
                } else {
                    j = Long.MIN_VALUE;
                }
                sb.append(C2214641Bm2.LIZIZ(j, jNanoTime));
                sb.append(", deltaFromObserverRegisterMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIJJ.get(), jNanoTime));
                sb.append(", deltaFromAddObserverStartMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIJJLI.get(), jNanoTime));
                sb.append(", deltaFromAddObserverEndMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIL.get(), jNanoTime));
                sb.append(", deltaFromOnCreateEndMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJJ.get(), jNanoTime));
                sb.append(", msg=");
                sb.append(C2214641Bm2.LJIJI(str));
                C2214641Bm2.LJFF(sb.toString());
            }
            try {
                ResourcePsiMonitor.getInstance().onDispatchStart();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }

        @Override // X.AbstractC791320V2k
        public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
            String str;
            this.LL = false;
            if (!C2214641Bm2.LJJII) {
                if (C2214641Bm2.LIZLLL()) {
                    try {
                        ResourcePsiMonitor.getInstance().onDispatchEnd();
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return;
                    }
                }
                return;
            }
            long jNanoTime = System.nanoTime();
            long j5 = Long.MIN_VALUE;
            if (!C2214641Bm2.LIZLLL()) {
                long jIncrementAndGet = C2214641Bm2.LJIIL.incrementAndGet();
                if (jIncrementAndGet <= 5) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dropNonMainDispatchEnd#");
                    sbLIZ.append(jIncrementAndGet);
                    sbLIZ.append(", monoNs=");
                    sbLIZ.append(jNanoTime);
                    sbLIZ.append(", tid=");
                    sbLIZ.append(Process.myTid());
                    sbLIZ.append(", thread=");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    sbLIZ.append(", deltaFromStartPointMs=");
                    C2214701Bm8 c2214701Bm8 = C2214641Bm2.LJIIZILJ.get();
                    if (c2214701Bm8 != null) {
                        j5 = c2214701Bm8.LIZ;
                    }
                    sbLIZ.append(C2214641Bm2.LIZIZ(j5, jNanoTime));
                    sbLIZ.append(", deltaFromObserverRegisterMs=");
                    sbLIZ.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIJJ.get(), jNanoTime));
                    C2214641Bm2.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            long jIncrementAndGet2 = C2214641Bm2.LJIIJ.incrementAndGet();
            boolean zCompareAndSet = C2214641Bm2.LJJIFFI.compareAndSet(Long.MIN_VALUE, jNanoTime);
            if (zCompareAndSet || jIncrementAndGet2 <= 5) {
                StringBuilder sb = new StringBuilder();
                if (zCompareAndSet) {
                    str = "firstDispatchEnd";
                } else {
                    str = "dispatchEnd";
                }
                sb.append(str);
                sb.append('#');
                sb.append(jIncrementAndGet2);
                sb.append(", monoNs=");
                sb.append(jNanoTime);
                sb.append(", count=");
                sb.append(jIncrementAndGet2);
                sb.append(", tid=");
                sb.append(Process.myTid());
                sb.append(", thread=");
                sb.append(C786410Ut5.u3().getName());
                sb.append(", deltaFromStartPointMs=");
                C2214701Bm8 c2214701Bm82 = C2214641Bm2.LJIIZILJ.get();
                if (c2214701Bm82 != null) {
                    j5 = c2214701Bm82.LIZ;
                }
                sb.append(C2214641Bm2.LIZIZ(j5, jNanoTime));
                sb.append(", deltaFromObserverRegisterMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIJJ.get(), jNanoTime));
                sb.append(", deltaFromAddObserverStartMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIJJLI.get(), jNanoTime));
                sb.append(", deltaFromAddObserverEndMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJIL.get(), jNanoTime));
                sb.append(", deltaFromOnCreateEndMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJJ.get(), jNanoTime));
                sb.append(", deltaFromFirstDispatchStartMs=");
                sb.append(C2214641Bm2.LIZIZ(C2214641Bm2.LJJI.get(), jNanoTime));
                C2214641Bm2.LJFF(sb.toString());
            }
            try {
                ResourcePsiMonitor.getInstance().onDispatchEnd();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    };

    public static C2214701Bm8 LIZ() {
        String str;
        AtomicReference<C2214701Bm8> atomicReference = LJIIZILJ;
        C2214701Bm8 c2214701Bm8 = atomicReference.get();
        if (c2214701Bm8 != null && c2214701Bm8.LIZ()) {
            return c2214701Bm8;
        }
        C2214701Bm8 c2214701Bm8LIZIZ = C0WAL.LIZLLL;
        if (c2214701Bm8LIZIZ == null || !c2214701Bm8LIZIZ.LIZ()) {
            c2214701Bm8LIZIZ = C0WAL.LIZIZ();
            str = (c2214701Bm8LIZIZ == null || !c2214701Bm8LIZIZ.LIZ()) ? "missing" : "psi_fallback";
        } else {
            str = "cold_boot_profiler";
        }
        LJIJI.set(str);
        if (c2214701Bm8LIZIZ == null || !c2214701Bm8LIZIZ.LIZ()) {
            LJIILLIIL("cold_boot_cpu_sched", "cold_boot_start_point_unavailable", str);
            return null;
        }
        while (!atomicReference.compareAndSet(null, c2214701Bm8LIZIZ) && atomicReference.get() == null) {
        }
        long jNanoTime = System.nanoTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPointCaptured, source=");
        sbLIZ.append(str);
        sbLIZ.append(", monoNs=");
        sbLIZ.append(c2214701Bm8LIZIZ.LIZ);
        sbLIZ.append(", execNs=");
        sbLIZ.append(c2214701Bm8LIZIZ.LIZIZ);
        sbLIZ.append(", nowNs=");
        sbLIZ.append(jNanoTime);
        sbLIZ.append(", deltaNowFromStartPointMs=");
        sbLIZ.append(LIZIZ(c2214701Bm8LIZIZ.LIZ, jNanoTime));
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        return LJIIZILJ.get();
    }

    public static final void LJIIIZ() {
        try {
            C2214701Bm8 c2214701Bm8 = LJIIZILJ.get();
            if (c2214701Bm8 == null || !c2214701Bm8.LIZ()) {
                LJIILLIIL("cold_boot_cpu_sched", "cold_boot_synthetic_skipped", "start_point_unavailable");
                return;
            }
            if (LJIILIIL.compareAndSet(false, true)) {
                C2214701Bm8 c2214701Bm8LIZIZ = C0WAL.LIZIZ();
                if (c2214701Bm8LIZIZ == null || !c2214701Bm8LIZIZ.LIZ()) {
                    LJIILLIIL("cold_boot_cpu_sched", "cold_boot_synthetic_skipped", "end_point_unavailable");
                    return;
                }
                LJIJ.set(c2214701Bm8LIZIZ);
                LJJ.compareAndSet(Long.MIN_VALUE, c2214701Bm8LIZIZ.LIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCreateEndCaptured, monoNs=");
                sbLIZ.append(c2214701Bm8LIZIZ.LIZ);
                sbLIZ.append(", execNs=");
                sbLIZ.append(c2214701Bm8LIZIZ.LIZIZ);
                sbLIZ.append(", wallFromStartPointMs=");
                sbLIZ.append((c2214701Bm8LIZIZ.LIZ - c2214701Bm8.LIZ) / 1000000);
                sbLIZ.append(", execFromStartPointMs=");
                sbLIZ.append((c2214701Bm8LIZIZ.LIZIZ - c2214701Bm8.LIZIZ) / 1000000);
                sbLIZ.append(", deltaFromObserverRegisterMs=");
                sbLIZ.append(LIZIZ(LJIJJ.get(), c2214701Bm8LIZIZ.LIZ));
                sbLIZ.append(", firstDispatchStartSeen=");
                sbLIZ.append(LJJI.get() != Long.MIN_VALUE);
                sbLIZ.append(", bridgeStartCount=");
                sbLIZ.append(LJIIIZ.get());
                sbLIZ.append(", bridgeEndCount=");
                sbLIZ.append(LJIIJ.get());
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
                LJJIFFI();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIJJLI() {
        if (!LJIILL.get() || LJIILLIIL.get()) {
            return;
        }
        LJIL("cold_boot_cpu_sched", C2097908Jt.LIZJ(new Pair("scene_type", "cold_start_first_feed")), LJIIZILJ.get());
    }

    public static void LJJIFFI() {
        C2214701Bm8 c2214701Bm8;
        C2214701Bm8 c2214701Bm82;
        if (LIZIZ.get()) {
            AtomicBoolean atomicBoolean = LJIILJJIL;
            if (atomicBoolean.get() || (c2214701Bm8 = LJIIZILJ.get()) == null || !c2214701Bm8.LIZ() || (c2214701Bm82 = LJIJ.get()) == null || !c2214701Bm82.LIZ()) {
                return;
            }
            try {
                boolean zAddSyntheticDispatchSegment = ResourcePsiMonitor.getInstance().addSyntheticDispatchSegment(c2214701Bm8, c2214701Bm82, true);
                if (zAddSyntheticDispatchSegment) {
                    atomicBoolean.set(true);
                } else {
                    LJIILLIIL("cold_boot_cpu_sched", "cold_boot_synthetic_not_added", "segment_rejected");
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("syntheticDispatchAdded, added=");
                sbLIZ.append(zAddSyntheticDispatchSegment);
                sbLIZ.append(", requestedWallMs=");
                sbLIZ.append((c2214701Bm82.LIZ - c2214701Bm8.LIZ) / 1000000);
                sbLIZ.append(", requestedExecMs=");
                sbLIZ.append((c2214701Bm82.LIZIZ - c2214701Bm8.LIZIZ) / 1000000);
                sbLIZ.append(", firstDispatchStartSeen=");
                AtomicLong atomicLong = LJJI;
                sbLIZ.append(atomicLong.get() != Long.MIN_VALUE);
                sbLIZ.append(", firstDispatchStartMinusOnCreateEndMs=");
                sbLIZ.append(LIZIZ(LJJ.get(), atomicLong.get()));
                LJFF(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static boolean LIZLLL() {
        return Process.myTid() == Process.myPid();
    }

    public static void LJIILJJIL() {
        try {
            long jNanoTime = System.nanoTime();
            LJIJJ.compareAndSet(Long.MIN_VALUE, jNanoTime);
            C791390V2r c791390V2r = C791390V2r.LJJIII;
            c791390V2r.LJIIJJI();
            long jNanoTime2 = System.nanoTime();
            LJIJJLI.compareAndSet(Long.MIN_VALUE, jNanoTime2);
            c791390V2r.LJ(LJJIJL);
            long jNanoTime3 = System.nanoTime();
            LJIL.compareAndSet(Long.MIN_VALUE, jNanoTime3);
            LJIIIIZZ.set(true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observerRegistered, monoNs=");
            sbLIZ.append(jNanoTime);
            sbLIZ.append(", addObserverStartNs=");
            sbLIZ.append(jNanoTime2);
            sbLIZ.append(", addObserverEndNs=");
            sbLIZ.append(jNanoTime3);
            sbLIZ.append(", addObserverCostUs=");
            sbLIZ.append((jNanoTime3 - jNanoTime2) / 1000);
            sbLIZ.append(", deltaFromStartPointMs=");
            AtomicReference<C2214701Bm8> atomicReference = LJIIZILJ;
            C2214701Bm8 c2214701Bm8 = atomicReference.get();
            sbLIZ.append(LIZIZ(c2214701Bm8 != null ? c2214701Bm8.LIZ : Long.MIN_VALUE, jNanoTime));
            sbLIZ.append(", addObserverStartDeltaFromStartPointMs=");
            C2214701Bm8 c2214701Bm82 = atomicReference.get();
            sbLIZ.append(LIZIZ(c2214701Bm82 != null ? c2214701Bm82.LIZ : Long.MIN_VALUE, jNanoTime2));
            sbLIZ.append(", addObserverEndDeltaFromStartPointMs=");
            C2214701Bm8 c2214701Bm83 = atomicReference.get();
            sbLIZ.append(LIZIZ(c2214701Bm83 != null ? c2214701Bm83.LIZ : Long.MIN_VALUE, jNanoTime3));
            LJFF(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJIIIIZZ.set(false);
            LJII.set(false);
        }
    }

    public static boolean LJ(Context context) {
        AtomicReference<Boolean> atomicReference = LJ;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        Context contextLJIIZILJ = LJIIZILJ(context);
        if (contextLJIIZILJ == null) {
            return false;
        }
        try {
            boolean zLJ = C08Q0.LJ(contextLJIIZILJ, "resource_psi_enabled", false);
            Boolean boolValueOf = Boolean.valueOf(zLJ);
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
            Boolean bool2 = LJ.get();
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return zLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AtomicReference<Boolean> atomicReference2 = LJ;
            Boolean bool3 = Boolean.FALSE;
            while (!atomicReference2.compareAndSet(null, bool3) && atomicReference2.get() == null) {
            }
            return false;
        }
    }

    public static void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resource psi cold boot diag ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static long LJII(long j) {
        if (j >= 0) {
            return j / 1000000;
        }
        return j;
    }

    public static final void LJIIIIZZ(Context context) {
        try {
            Context contextLJIIZILJ = LJIIZILJ(context);
            if (contextLJIIZILJ == null || !C2104108Md.LIZLLL(contextLJIIZILJ) || !LJ(contextLJIIZILJ)) {
                return;
            }
            LJIJJ(contextLJIIZILJ);
            try {
                Context contextLJIIZILJ2 = LJIIZILJ(contextLJIIZILJ);
                if (contextLJIIZILJ2 != null && LJ(contextLJIIZILJ2) && LJFF.compareAndSet(false, true)) {
                    C786410Ut5.LJLIIL(15000L, LJJIIZ, new ARunnableS134S0100000_34(contextLJIIZILJ2, 40));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            LJIIIZ();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static String LJIILL(String str) {
        if (Intrinsics.LJFF(str, "__global__")) {
            return "global";
        }
        if (!Intrinsics.LJFF(str, "__background__")) {
            return str;
        }
        return "background";
    }

    public static Context LJIIZILJ(Context context) {
        if (context != null) {
            try {
                Context contextN3 = C786410Ut5.N3(context);
                if (contextN3 != null) {
                    return contextN3;
                }
            } catch (C1955307lH e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    public static double LJIJ(float f) {
        if (!Float.isNaN(f) && !Float.isInfinite(f)) {
            return f;
        }
        return -1.0d;
    }

    public static String LJIJI(String str) {
        String strLJJI;
        String strLJJI2;
        String strLJZL;
        if (str != null && (strLJJI = u.LJJI(str, '\n', ' ', false)) != null && (strLJJI2 = u.LJJI(strLJJI, '\r', ' ', false)) != null && (strLJZL = C13LN.LJZL(160, strLJJI2)) != null) {
            return strLJZL;
        }
        return "null";
    }

    public static final void LJIJJ(Context context) {
        C2214701Bm8 c2214701Bm8LIZ;
        try {
            C2214641Bm2 c2214641Bm2 = LIZ;
            if (LJ(context) && (c2214701Bm8LIZ = LIZ()) != null && c2214701Bm8LIZ.LIZ()) {
                LJIILL.set(true);
                if (LIZJ.get()) {
                    LJIILLIIL.set(false);
                    LJIJJLI();
                } else {
                    LJIILLIIL.set(false);
                    c2214641Bm2.LIZJ(context);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJJI(boolean z) {
        if (!LJJIIJZLJL.compareAndSet(false, true)) {
            return;
        }
        RunnableC2184141Adw runnableC2184141Adw = LJJIJIL;
        if (runnableC2184141Adw != null) {
            LJJIIZ.removeCallbacks(runnableC2184141Adw);
        }
        LJJIJIL = null;
        LJJ("core_scene", C2097908Jt.LIZJ(new Pair("is_exit", Integer.valueOf(z ? 1 : 0))));
    }

    public final void LIZJ(Context context) {
        boolean zLJ;
        boolean zLJ2;
        AtomicBoolean atomicBoolean = LIZJ;
        if (atomicBoolean.get()) {
            return;
        }
        AtomicBoolean atomicBoolean2 = LIZLLL;
        if (atomicBoolean2.get()) {
            return;
        }
        synchronized (this) {
            try {
                if (atomicBoolean.get()) {
                    return;
                }
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    Context contextLJIIZILJ = LJIIZILJ(context);
                    if (contextLJIIZILJ == null) {
                        return;
                    }
                    if (!C2104108Md.LIZLLL(contextLJIIZILJ)) {
                        return;
                    }
                    try {
                        zLJ = C08Q0.LJ(contextLJIIZILJ, "resource_psi_gc_union_enabled", false);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        zLJ = false;
                    }
                    try {
                        zLJ2 = C08Q0.LJ(contextLJIIZILJ, "resource_psi_background_enabled", false);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        zLJ2 = false;
                    }
                    ResourcePsiMonitor resourcePsiMonitor = ResourcePsiMonitor.getInstance();
                    C2214681Bm6 c2214681Bm6Builder = ResourceContentionConfig.builder();
                    c2214681Bm6Builder.LIZIZ = true;
                    c2214681Bm6Builder.LIZ = 15000L;
                    c2214681Bm6Builder.LJFF = true;
                    c2214681Bm6Builder.LIZJ = true;
                    c2214681Bm6Builder.LJII = LJJIJIIJIL;
                    c2214681Bm6Builder.LJI = zLJ;
                    c2214681Bm6Builder.LIZLLL = zLJ2;
                    c2214681Bm6Builder.LJ = 30000L;
                    resourcePsiMonitor.init(contextLJIIZILJ, new ResourceContentionConfig(c2214681Bm6Builder));
                    resourcePsiMonitor.setListener(new ResourcePsiListener() { // from class: X.1Bm4
                        /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
                        @Override // com.bytedance.otis.resource.psi.ResourcePsiListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onSnapshot(com.bytedance.otis.resource.psi.ResourceContentionSnapshot r13) {
                            /*
                                Method dump skipped, instruction units count: 339
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C2214661Bm4.onSnapshot(com.bytedance.otis.resource.psi.ResourceContentionSnapshot):void");
                        }
                    });
                    LIZIZ.set(true);
                    if (LJII.compareAndSet(false, true)) {
                        if (LIZLLL()) {
                            LJIILJJIL();
                        } else {
                            C786410Ut5.LJJZZIII(LJJIIZ, new Runnable() { // from class: X.0Mvk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("ResourcePsiMonitorTask@9b22.registerApmLooperObserverBoundaryBridgeIfNeeded$1");
                                    try {
                                        C2214641Bm2.LJIILJJIL();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("ResourcePsiMonitorTask@9b22.registerApmLooperObserverBoundaryBridgeIfNeeded$1");
                                }
                            });
                        }
                    }
                    resourcePsiMonitor.start();
                    resourcePsiMonitor.onForeground();
                    LIZJ.set(true);
                    if (LJI.compareAndSet(false, true)) {
                        try {
                            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.1Bm5
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("ResourcePsiMonitorTask@9b22.registerForegroundState$1");
                                    if (((C606810Nr5) obj).LIZIZ) {
                                        ResourcePsiMonitor.getInstance().onBackground();
                                    } else {
                                        ResourcePsiMonitor.getInstance().onForeground();
                                    }
                                    C1C7U.LIZIZ("ResourcePsiMonitorTask@9b22.registerForegroundState$1");
                                }
                            });
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }
                    if (LJJIII.compareAndSet(false, true)) {
                        C0CMU.LIZ.LIZIZ(new C0CMV() { // from class: X.1Adv
                            @Override // X.C0CMV
                            public final void onExit() {
                                C2214641Bm2.LJJI(true);
                            }

                            @Override // X.C0CMV
                            public final void LIZJ() {
                                if (C2214641Bm2.LJJIIJ.compareAndSet(false, true)) {
                                    C2214641Bm2.LJJIIJZLJL.set(false);
                                    long jLongValue = ((Number) C285780BIa.LIZIZ.getValue()).longValue();
                                    C2214641Bm2.LJIL("core_scene", C2097608Jq.LJIIIIZZ(new Pair("scene_type", "startup_jank_first_period"), new Pair("core_scene_sample_period", Long.valueOf(jLongValue)), new Pair("loop_count", 0), new Pair("is_exit", 0)), null);
                                    RunnableC2184141Adw runnableC2184141Adw = RunnableC2184141Adw.LL;
                                    C2214641Bm2.LJJIJIL = runnableC2184141Adw;
                                    C786410Ut5.LJLIIL(jLongValue, C2214641Bm2.LJJIIZ, runnableC2184141Adw);
                                }
                            }
                        });
                        if (C0CMU.LIZIZ == C0CBL.EXITED && !LJJIIJ.get()) {
                            LJIILLIIL("core_scene", "core_scene_missed", "exited_before_psi_listener");
                        }
                    }
                    LJIJJLI();
                    LJJIFFI();
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    LIZIZ.set(false);
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                throw th5;
            }
        }
    }

    public static long LIZIZ(long j, long j2) {
        if (j != Long.MIN_VALUE && j2 != Long.MIN_VALUE && j > 0 && j2 >= j) {
            return (j2 - j) / 1000000;
        }
        return -1L;
    }

    public static void LJI(String str, Map map) {
        ConcurrentHashMap<String, Object> concurrentHashMapPutIfAbsent;
        if (map.isEmpty()) {
            return;
        }
        ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> concurrentHashMap = LJJIJ;
        ConcurrentHashMap<String, Object> concurrentHashMap2 = concurrentHashMap.get(str);
        if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = concurrentHashMapPutIfAbsent;
        }
        concurrentHashMap2.putAll(map);
    }

    public static void LJIIJ(JSONObject jSONObject, ResourceContentionSnapshot resourceContentionSnapshot) throws JSONException {
        jSONObject.put("gc_union_ms", LJII(resourceContentionSnapshot.gcUnionNs));
        jSONObject.put("main_wait_gc_ms", LJII(resourceContentionSnapshot.mainWaitGcNs));
        jSONObject.put("gc_stw_pause_ms", LJII(resourceContentionSnapshot.gcStwPauseNs));
        jSONObject.put("wait_ms", LJII(resourceContentionSnapshot.waitNs));
        jSONObject.put("iowait_ms", LJII(resourceContentionSnapshot.iowaitNs));
        jSONObject.put("block_ms", LJII(resourceContentionSnapshot.blockNs));
        jSONObject.put("sleep_ms", LJII(resourceContentionSnapshot.sleepNs));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJIIL(String str, JSONObject jSONObject) throws JSONException {
        switch (str.hashCode()) {
            case -1949452308:
                if (str.equals("core_scene")) {
                    jSONObject.put("scene_type", "startup_jank_first_period");
                    return;
                }
                break;
            case -1940070749:
                if (str.equals("__global__")) {
                    jSONObject.put("scene_type", "global_periodic");
                    return;
                }
                break;
            case 917009166:
                if (str.equals("cold_boot_cpu_sched")) {
                    jSONObject.put("scene_type", "cold_start_first_feed");
                    return;
                }
                break;
            case 1069877614:
                if (str.equals("__background__")) {
                    jSONObject.put("scene_type", "background_periodic");
                    return;
                }
                break;
        }
        jSONObject.put("scene_type", "");
    }

    public static void LJJ(String str, Map map) {
        if (!LIZJ.get() || !LJJIIZI.remove(str)) {
            return;
        }
        LJI(str, map);
        try {
            ResourcePsiMonitor.getInstance().stopScene(str);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        LJJIJ.remove(str);
    }

    public static void LJIIJJI(JSONObject jSONObject, ResourceContentionSnapshot resourceContentionSnapshot, List list) throws JSONException {
        jSONObject.put(Scene.SCENE_SERVICE, LJIILL(resourceContentionSnapshot.scene));
        jSONObject.put("foreground", resourceContentionSnapshot.foreground ? 1 : 0);
        jSONObject.put("wall_ms", resourceContentionSnapshot.wallNs / 1000000);
        jSONObject.put("exec_ms", resourceContentionSnapshot.execNs / 1000000);
        jSONObject.put("idle_ms", resourceContentionSnapshot.idleNs / 1000000);
        jSONObject.put("contention_ms", resourceContentionSnapshot.contentionNs / 1000000);
        jSONObject.put("busy_ms", resourceContentionSnapshot.busyNs / 1000000);
        jSONObject.put("ratio_over_busy", LJIJ(resourceContentionSnapshot.ratioOverBusy));
        jSONObject.put("resource_wait_over_busy", LJIJ(resourceContentionSnapshot.resourceWaitOverBusy));
        jSONObject.put("long_dispatch_over_busy", LJIJ(resourceContentionSnapshot.longDispatchOverBusy));
        jSONObject.put("metric_valid", ((ArrayList) list).isEmpty() ? 1 : 0);
        jSONObject.put("invalid_reasons", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
    }

    public static void LJIILLIIL(String str, String str2, String str3) {
        String strLJZL = C13LN.LJZL(96, str3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIILL(str));
        sbLIZ.append(':');
        sbLIZ.append(str2);
        sbLIZ.append(':');
        sbLIZ.append(strLJZL);
        if (!LJJIJIIJI.add(C2188811AlT.LIZIZ(sbLIZ))) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            LJIILIIL(str, str2, strLJZL, jSONObject);
            try {
                C823050WQl.LIZLLL().execute(new ARunnableS104S0100000_4(jSONObject, 65));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static void LJIL(String str, Map map, C2214701Bm8 c2214701Bm8) {
        if (!LIZJ.get()) {
            return;
        }
        LJI(str, map);
        if (!LJJIIZI.add(str)) {
            return;
        }
        if (c2214701Bm8 != null) {
            try {
                if (c2214701Bm8.LIZ()) {
                    ResourcePsiMonitor.getInstance().startScene(str, c2214701Bm8);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJJIIZI.remove(str);
                LJJIJ.remove(str);
                return;
            }
        }
        ResourcePsiMonitor.getInstance().startScene(str);
    }

    public static void LJIILIIL(String str, String str2, String str3, JSONObject jSONObject) throws JSONException {
        jSONObject.put(Scene.SCENE_SERVICE, LJIILL(str));
        LJIIL(str, jSONObject);
        jSONObject.put("psi_status", str2);
        jSONObject.put("foreground", 1);
        jSONObject.put("wall_ms", -1);
        jSONObject.put("exec_ms", -1);
        jSONObject.put("idle_ms", -1);
        jSONObject.put("contention_ms", -1);
        jSONObject.put("busy_ms", -1);
        jSONObject.put("ratio_over_busy", -1.0d);
        jSONObject.put("resource_wait_ms", -1);
        jSONObject.put("resource_wait_over_busy", -1.0d);
        jSONObject.put("long_dispatch_contention_ms", -1);
        jSONObject.put("long_dispatch_over_busy", -1.0d);
        jSONObject.put("gc_union_ms", -1);
        jSONObject.put("main_wait_gc_ms", -1);
        jSONObject.put("gc_stw_pause_ms", -1);
        jSONObject.put("wait_ms", -1);
        jSONObject.put("iowait_ms", -1);
        jSONObject.put("block_ms", -1);
        jSONObject.put("sleep_ms", -1);
        jSONObject.put("metric_valid", 0);
        jSONObject.put("invalid_reasons", str3);
    }
}

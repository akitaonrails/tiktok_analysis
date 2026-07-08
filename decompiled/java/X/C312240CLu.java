package X;

import Y.ARunnableS104S0100000_4;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CLu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312240CLu {
    /* JADX WARN: Type inference failed for: r3v5, types: [X.0CLr, java.lang.Runnable] */
    public static final void LIZ(final C0CM3 c0cm3) {
        String str;
        if (c0cm3.LIZLLL > 0 && ((Boolean) C0CMX.LJIIL.getValue()).booleanValue() && C312230CLt.LJI()) {
            String strLIZIZ = c0cm3.LJFF;
            if (strLIZIZ.length() == 0) {
                Function0<Unit> function0 = c0cm3.LJI;
                if (function0 != null) {
                    strLIZIZ = function0.getClass().getName();
                } else {
                    strLIZIZ = "UnknownTask";
                }
            }
            ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = C312230CLt.LIZ;
            AtomicInteger atomicInteger = concurrentHashMap.get(strLIZIZ);
            if (atomicInteger == null) {
                synchronized (concurrentHashMap) {
                    try {
                        atomicInteger = concurrentHashMap.get(strLIZIZ);
                        if (atomicInteger == null) {
                            atomicInteger = new AtomicInteger(0);
                            concurrentHashMap.put(strLIZIZ, atomicInteger);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            if (iIncrementAndGet > 1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append('-');
                sbLIZ.append(iIncrementAndGet);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            c0cm3.LJFF = strLIZIZ;
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final Function0<Unit> function02 = c0cm3.LJI;
            ?? r3 = new Runnable() { // from class: X.0CLr
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    Function0<Unit> function03;
                    C1C7U.LIZ("DowngradeAbility@31d1.wrapTaskWithTimeout$timeoutRunnable$1");
                    try {
                        if (atomicBoolean.compareAndSet(false, true) && ((Set) C312230CLt.LJIILIIL.getValue()).contains(c0cm3.LJFF) && (function03 = function02) != null) {
                            function03.invoke();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeAbility@31d1.wrapTaskWithTimeout$timeoutRunnable$1");
                }
            };
            if (((Boolean) C0CMX.LJIILL.getValue()).booleanValue()) {
                if (c0cm3.LJ == C0CM4.MAIN_THREAD.getType() || (c0cm3.LJ == C0CM4.DEFAULT.getType() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()))) {
                    C786410Ut5.LJLIIL(c0cm3.LIZLLL, C312230CLt.LIZIZ(), r3);
                } else {
                    C786410Ut5.LJLIIL(c0cm3.LIZLLL, C312230CLt.LIZLLL(), r3);
                }
            } else {
                C786410Ut5.LJLIIL(c0cm3.LIZLLL, C312230CLt.LIZIZ(), r3);
            }
            c0cm3 = new C0CM3(c0cm3.LIZ, c0cm3.LIZIZ, c0cm3.LIZJ, c0cm3.LIZLLL, c0cm3.LJ, c0cm3.LJFF, new C312220CLs(atomicBoolean, r3, function02));
        }
        C312290CLz c312290CLz = new C312290CLz(c0cm3);
        if (!C312230CLt.LJI() || !c0cm3.LIZIZ || !C0CMX.LIZ() || C312230CLt.LIZJ().contains(c0cm3.LIZ) || (!((Boolean) C0CMX.LJ.getValue()).booleanValue() && C312230CLt.LJI)) {
            Function0<Unit> function03 = c0cm3.LJI;
            if (function03 != null) {
                function03.invoke();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Original logic is triggered, class : ");
            Function0<Unit> function04 = c0cm3.LJI;
            if (function04 != null) {
                sbLIZ2.append(function04.getClass());
                sbLIZ2.append(", tag : ");
                sbLIZ2.append(c0cm3.LJFF);
                sbLIZ2.append(",downgradeUnit.isDelay : ");
                sbLIZ2.append(c0cm3.LIZIZ);
                sbLIZ2.append(", isOn is ");
                sbLIZ2.append(C0CMX.LIZ());
                sbLIZ2.append(", is ");
                sbLIZ2.append(c0cm3.LIZ.name());
                sbLIZ2.append(" scene finished : ");
                sbLIZ2.append(C312230CLt.LIZJ().contains(c0cm3.LIZ));
                sbLIZ2.append(", hasDestroyed : ");
                sbLIZ2.append(C312230CLt.LJI);
                sbLIZ2.append(", isWorked() : ");
                sbLIZ2.append(C312230CLt.LJI());
                C2188811AlT.LIZIZ(sbLIZ2);
                return;
            }
            return;
        }
        C0CME c0cme = c0cm3.LIZ;
        if ((c0cme == C0CME.FIRST_VIDEO_SHOW || c0cme == C0CME.FIRST_UI_FRAME || c0cme == C0CME.START_UP_END) && C104100aN.LIZ().isNewUser()) {
            Function0<Unit> function05 = c0cm3.LJI;
            if (function05 == null) {
                return;
            }
            function05.invoke();
            return;
        }
        if (c0cm3.LIZ == C0CME.NEVER_EXECUTE) {
            return;
        }
        C312230CLt.LJIIJJI();
        c312290CLz.invoke();
        C786410Ut5.LJJZZIII(C312230CLt.LIZLLL(), new ARunnableS104S0100000_4(c0cm3, 163));
        if (c0cm3.LJFF.length() > 0) {
            ((Set) C312230CLt.LJIILIIL.getValue()).add(c0cm3.LJFF);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Task is downgraded[no-act], scene is ");
        sbLIZ3.append(c0cm3.LIZ.name());
        sbLIZ3.append(", priority is ");
        int i = c0cm3.LIZJ;
        if (i == C0CMJ.HIGH_PRIORITY.getType()) {
            str = "[High]";
        } else if (i == C0CMJ.TOP_PRIORITY.getType()) {
            str = "[Top]";
        } else {
            str = "[Normal]";
        }
        sbLIZ3.append(str);
        sbLIZ3.append(", class : ");
        Function0<Unit> function06 = c0cm3.LJI;
        if (function06 == null) {
            return;
        }
        sbLIZ3.append(function06.getClass());
        sbLIZ3.append(", timeout is ");
        sbLIZ3.append(c0cm3.LIZLLL);
        sbLIZ3.append(", tag : ");
        sbLIZ3.append(c0cm3.LJFF);
        C2188811AlT.LIZIZ(sbLIZ3);
    }
}

package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0W8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818260W8a {
    public static C0W8Z LIZJ;
    public static RunnableC818270W8b LIZLLL;
    public static long LJ;
    public static volatile boolean LJII;
    public static volatile boolean LJIIIIZZ;
    public static final C818260W8a LIZ = new C818260W8a();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public static final Set<EnumC818320W8g> LJFF = new LinkedHashSet();
    public static final Set<EnumC818320W8g> LJI = new LinkedHashSet();
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(190));
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(191));

    public final synchronized void LIZ() {
        if (LJII) {
            return;
        }
        if (LJFF.containsAll((Set) LJIIIZ.getValue())) {
            LJ();
            LJI("checkIfInitCoreStepsAllFinished() finished", EnumC809870Vpp.INIT, EnumC818290W8d.INFO);
        }
    }

    public final synchronized void LIZIZ() {
        if (LJIIIIZZ) {
            return;
        }
        if (LJI.containsAll((Set) LJIIJ.getValue())) {
            LJFF();
            LJI("checkIfUpdateCoreStepsAllFinished() finished", EnumC809870Vpp.UPDATE, EnumC818290W8d.INFO);
        }
    }

    public final synchronized void LIZJ() {
        Set<EnumC818320W8g> set = LJFF;
        int size = set.size();
        C01GW c01gw = LJIIIZ;
        if (size >= ((Set) c01gw.getValue()).size()) {
            LJI("checkInitUnfinishedSteps() All steps completed normally", EnumC809870Vpp.INIT, EnumC818290W8d.INFO);
            return;
        }
        Set setLJII = C15442062u.LJII((Set) c01gw.getValue(), set);
        int size2 = set.size();
        int size3 = ((Set) c01gw.getValue()).size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n                force report, Push initialization not completed\n                Completed: ");
        sbLIZ.append(size2);
        sbLIZ.append('/');
        sbLIZ.append(size3);
        sbLIZ.append(" steps\n                Missing steps: ");
        sbLIZ.append(C13LP.LJJLIIIJ(setLJII, ", ", null, null, 0, null, AFwS247S0000000_13.get$arr$(29), 30));
        sbLIZ.append("\n                ");
        LJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), EnumC809870Vpp.INIT, EnumC818290W8d.WARNING);
        C810890VrT.LIZIZ.LIZ(setLJII.size());
    }

    public final synchronized void LIZLLL() {
        Set<EnumC818320W8g> set = LJI;
        int size = set.size();
        C01GW c01gw = LJIIJ;
        if (size >= ((Set) c01gw.getValue()).size()) {
            LJI("checkUpdateUnfinishedSteps, All steps completed normally", EnumC809870Vpp.UPDATE, EnumC818290W8d.INFO);
            return;
        }
        Set setLJII = C15442062u.LJII((Set) c01gw.getValue(), set);
        int size2 = set.size();
        int size3 = ((Set) c01gw.getValue()).size();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n                force report, Push update not completed\n                Completed: ");
        sbLIZ.append(size2);
        sbLIZ.append('/');
        sbLIZ.append(size3);
        sbLIZ.append(" steps\n                Missing steps: ");
        sbLIZ.append(C13LP.LJJLIIIJ(setLJII, ", ", null, null, 0, null, AFwS247S0000000_13.get$arr$(30), 30));
        sbLIZ.append("\n                ");
        LJI(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)), EnumC809870Vpp.UPDATE, EnumC818290W8d.WARNING);
        C810890VrT.LIZIZ.LJIILIIL(setLJII.size());
    }

    public final synchronized void LJ() {
        if (LJII) {
            return;
        }
        LJII = true;
        LIZJ();
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJI("initPushAll");
        c810890VrT.LJIIJJI("initPushAll");
        c810890VrT.LJIILJJIL();
        C0W8Z c0w8z = LIZJ;
        if (c0w8z != null) {
            LIZIZ.removeCallbacks(c0w8z);
        }
        LIZJ = null;
        LJI("forceReportInit() finished", EnumC809870Vpp.INIT, EnumC818290W8d.INFO);
    }

    public final synchronized void LJFF() {
        if (LJIIIIZZ) {
            return;
        }
        LJIIIIZZ = true;
        LIZLLL();
        C810890VrT.LIZIZ.LIZJ();
        RunnableC818270W8b runnableC818270W8b = LIZLLL;
        if (runnableC818270W8b != null) {
            LIZIZ.removeCallbacks(runnableC818270W8b);
        }
        LIZLLL = null;
        LJI("forceReportUpdate() finished", EnumC809870Vpp.UPDATE, EnumC818290W8d.INFO);
    }

    public final synchronized void LJII() {
        C0W8Z c0w8z = LIZJ;
        if (c0w8z != null) {
            LIZIZ.removeCallbacks(c0w8z);
        }
        C0W8Z c0w8z2 = C0W8Z.LL;
        LIZJ = c0w8z2;
        C786410Ut5.LJLIIL(60000L, LIZIZ, c0w8z2);
    }

    public final synchronized void LJIIIIZZ() {
        RunnableC818270W8b runnableC818270W8b = LIZLLL;
        if (runnableC818270W8b != null) {
            LIZIZ.removeCallbacks(runnableC818270W8b);
        }
        RunnableC818270W8b runnableC818270W8b2 = RunnableC818270W8b.LL;
        LIZLLL = runnableC818270W8b2;
        C786410Ut5.LJLIIL(300000L, LIZIZ, runnableC818270W8b2);
    }

    public static EnumC818320W8g LJIIIZ(String str) {
        EnumC818320W8g enumC818320W8g = null;
        if (a0.LJJJIL(str)) {
            return null;
        }
        Iterator<EnumC818320W8g> it2 = EnumC818320W8g.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            EnumC818320W8g next = it2.next();
            if (u.LJIJI(next.name(), str, true)) {
                enumC818320W8g = next;
                break;
            }
        }
        return enumC818320W8g;
    }

    public static void LJI(String str, EnumC809870Vpp enumC809870Vpp, EnumC818290W8d enumC818290W8d) {
        if (enumC809870Vpp != null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(enumC809870Vpp.getTag());
                sbLIZ.append(' ');
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        int i = C818280W8c.LIZ[enumC818290W8d.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new C1954807lC();
        }
    }
}

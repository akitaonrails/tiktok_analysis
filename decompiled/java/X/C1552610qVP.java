package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0qVP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552610qVP {
    public static final CopyOnWriteArrayList<AbstractRunnableC1553490qWp> LIZ = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(199));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(200));

    public static void LIZLLL() {
        CopyOnWriteArrayList<AbstractRunnableC1553490qWp> copyOnWriteArrayList = LIZ;
        synchronized (copyOnWriteArrayList) {
            try {
                LIZIZ.set(false);
                if (copyOnWriteArrayList.isEmpty()) {
                    return;
                }
                Iterator<AbstractRunnableC1553490qWp> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().run();
                }
                LIZ.clear();
                if (LIZIZ.get() || !C1957007lY.LIZ.LJIILIIL) {
                    return;
                }
                C2200821BBo.LIZ.getClass();
                if (C2200821BBo.LIZ()) {
                    return;
                }
                C1BCA.LJJIJ((InterfaceC1702110uOX) LIZJ.getValue());
                C1BCA.LJJIJL((C1BC3) LIZLLL.getValue());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (LIZIZ(null) && LIZJ(null)) {
                    LIZLLL();
                    return;
                }
                return;
            }
            if (!LIZIZ(null)) {
                return;
            }
            LIZLLL();
            return;
        }
        if (!LIZJ(null)) {
            return;
        }
        LIZLLL();
    }

    public static boolean LIZIZ(C1512840pTG c1512840pTG) {
        if (c1512840pTG == null) {
            c1512840pTG = C1BCA.LIZLLL();
        }
        if (c1512840pTG.LIZ.getScore() >= EnumC1006810cJ5.Low.getScore()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C1512850pTH c1512850pTH) {
        if (c1512850pTH == null) {
            c1512850pTH = C1BCA.LJIILIIL();
        }
        if (c1512850pTH.LIZ == EnumC1006810cJ5.Low) {
            return true;
        }
        return false;
    }
}

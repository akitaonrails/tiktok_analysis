package X;

import Y.ARunnableS104S0000000_31;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveHarConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.157U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C157U implements InterfaceC484110Iyf, C157X {
    public static long LIZJ;
    public static boolean LJ;
    public static boolean LJFF;
    public static ScheduledFuture<?> LJI;
    public static final C157U LIZ = new C157U();
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS221S0000000_31.get$arr$(503));
    public static final LiveHarConfig LIZLLL = LiveClientAISettings.INSTANCE.aiServices().liveHarConfig;
    public static final ARunnableS104S0000000_31 LJII = new ARunnableS104S0000000_31(5);
    public static final ArrayList<C157X> LJIIIIZZ = new ArrayList<>();

    public static final void LJFF() {
        C775320UbC c775320UbC = C775320UbC.LIZ;
        if (LJFF) {
            ArrayList<C157X> arrayList = LJIIIIZZ;
            synchronized (arrayList) {
                try {
                    if (!arrayList.contains(c775320UbC)) {
                        arrayList.add(c775320UbC);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static C157V LJI() {
        return (C157V) LIZIZ.getValue();
    }

    public static final void LJII() {
        if (!LJFF && LIZLLL.enable) {
            LJFF = true;
            Map<String, Object> map = C015G.LIZ;
            C015G.LIZ.put("livesdk_har_status", -1);
            C157V c157vLJI = LJI();
            if (c157vLJI != null) {
                c157vLJI.LJIJJ();
            }
        }
    }

    @Override // X.InterfaceC484110Iyf
    public final Map<String, Float> LIZIZ() {
        C157V c157vLJI;
        if (LJFF && (c157vLJI = LJI()) != null) {
            return c157vLJI.LJIIZILJ();
        }
        return null;
    }

    @Override // X.InterfaceC484110Iyf
    public final int LIZLLL() {
        C157V c157vLJI;
        if (LJFF && (c157vLJI = LJI()) != null) {
            return c157vLJI.LJIIIIZZ();
        }
        return -1;
    }

    @Override // X.InterfaceC484110Iyf
    public final boolean LJ() {
        return LIZLLL.timerTriggerEnable;
    }

    public final void LJIIJ() {
        if (LJFF) {
            C157V c157vLJI = LJI();
            if (c157vLJI != null) {
                c157vLJI.LJIJ(this);
            }
            if (LIZLLL.timerTriggerEnable) {
                C474790Ijd c474790Ijd = C474790Ijd.LIZ;
                C484100Iye c484100Iye = C484100Iye.LIZ;
                try {
                    Collection<InterfaceC474800Ije> collection = C474790Ijd.LIZIZ;
                    if (!collection.contains(c484100Iye)) {
                        collection.add(c484100Iye);
                    }
                    if (collection.isEmpty()) {
                        return;
                    }
                    synchronized (c474790Ijd) {
                        if (!C474790Ijd.LIZJ) {
                            InterfaceC474510IjB.LIZ.getClass();
                            C474520IjC.LIZIZ.add(c474790Ijd);
                            C474790Ijd.LIZJ = true;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final void LJIIJJI() {
        if (LJFF) {
            C157V c157vLJI = LJI();
            if (c157vLJI != null) {
                c157vLJI.LJJ();
            }
            C474790Ijd.LIZ.LIZIZ();
            LIZJ(false);
            ArrayList<C157X> arrayList = LJIIIIZZ;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    try {
                        arrayList.clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean LJIIL() {
        if (!LJFF) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - LIZJ >= LIZLLL.minTriggerInterval) {
            C20441214yg.LIZIZ("LiveHarService", "triggerSmartHarPredict start");
            C157V c157vLJI = LJI();
            if (c157vLJI != null && c157vLJI.LJI()) {
                int iLIZLLL = LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("triggerSmartHarPredict result: ");
                sbLIZ.append(iLIZLLL);
                C20441214yg.LIZIZ("LiveHarService", C2188811AlT.LIZIZ(sbLIZ));
                LIZJ = jCurrentTimeMillis;
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC484110Iyf
    public final boolean isEnable() {
        return LIZLLL.enable;
    }

    public static final boolean LJIIIIZZ() {
        C157V c157vLJI = LJI();
        if (c157vLJI != null) {
            return c157vLJI.LJIIJJI();
        }
        return false;
    }

    public static final void LJIIIZ(C157X c157x) {
        if (LJFF && c157x != null) {
            ArrayList<C157X> arrayList = LJIIIIZZ;
            synchronized (arrayList) {
                try {
                    if (arrayList.contains(c157x)) {
                        arrayList.remove(c157x);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC484110Iyf
    public final void LIZJ(boolean z) {
        if (!LJFF) {
            return;
        }
        LiveHarConfig liveHarConfig = LIZLLL;
        if (liveHarConfig.timerTriggerEnable && liveHarConfig.enable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("timerTriggerSmartHarPredict start:");
            sbLIZ.append(z);
            sbLIZ.append(", timerPredictRunning:");
            sbLIZ.append(LJ);
            C20441214yg.LIZIZ("LiveHarService", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                if (!LJ) {
                    LJ = true;
                    LJI = C2126108Up.LIZLLL.schedule(LJII, liveHarConfig.timerTriggerInterval, TimeUnit.MILLISECONDS);
                    if (LIZJ == 0) {
                        LJIIL();
                        return;
                    }
                    return;
                }
                return;
            }
            ScheduledFuture<?> scheduledFuture = LJI;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                LJI = null;
            }
            LJ = false;
        }
    }

    @Override // X.C157X
    public final void LIZ(int i, boolean z, Map map) {
        if (!LJFF) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHARPredictChanged :: [success == ");
        sbLIZ.append(z);
        sbLIZ.append(", harStatus == ");
        sbLIZ.append(i);
        sbLIZ.append(", statusMap == ");
        sbLIZ.append(map);
        sbLIZ.append(']');
        C20441214yg.LIZIZ("LiveHarService", C2188811AlT.LIZIZ(sbLIZ));
        Map<String, Object> map2 = C015G.LIZ;
        C015G.LIZ.put("livesdk_har_status", Integer.valueOf(i));
        ArrayList<C157X> arrayList = LJIIIIZZ;
        if (!arrayList.isEmpty()) {
            synchronized (arrayList) {
                try {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C157X c157x = LJIIIIZZ.get(i2);
                        if (c157x != null) {
                            c157x.LIZ(i, z, map);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}

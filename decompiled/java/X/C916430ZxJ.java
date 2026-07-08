package X;

import Y.AfS3S0000100_15;
import com.bytedance.android.live.liveinteract.multihost.biz.reservation.MultiCoHostNudgeCountDownEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS299S0000000_15;

/* JADX INFO: renamed from: X.0ZxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916430ZxJ {
    public static DataChannel LJ;
    public static final ConcurrentHashMap<Long, InterfaceC420801kM> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Long> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, InterfaceC420801kM> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Long, Long> LIZLLL = new ConcurrentHashMap<>();
    public static final AFwS299S0000000_15 LJFF = AFwS299S0000000_15.get$arr$(11);

    public static long LIZLLL(long j) {
        if (j == 0) {
            return 0L;
        }
        long jLIZ = C974520bT0.LIZ();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long jCurrentTimeMillis = jLIZ / j2;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis() / j2;
        }
        return 300 - Math.max(0L, jCurrentTimeMillis - j);
    }

    public static boolean LJ(long j) {
        if (!LIZ.containsKey(Long.valueOf(j)) && !LIZIZ.containsKey(Long.valueOf(j))) {
            return false;
        }
        return true;
    }

    public static void LJFF(long j) {
        C20441214yg.LJIIIZ("NudgeReservationHelper", "removeCountDown");
        ConcurrentHashMap<Long, InterfaceC420801kM> concurrentHashMap = LIZJ;
        InterfaceC420801kM interfaceC420801kM = concurrentHashMap.get(Long.valueOf(j));
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        concurrentHashMap.remove(Long.valueOf(j));
        LIZLLL.remove(Long.valueOf(j));
    }

    public static void LJI(long j) {
        C20441214yg.LJIIIZ("NudgeReservationHelper", "removeCountUp");
        ConcurrentHashMap<Long, InterfaceC420801kM> concurrentHashMap = LIZ;
        InterfaceC420801kM interfaceC420801kM = concurrentHashMap.get(Long.valueOf(j));
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        concurrentHashMap.remove(Long.valueOf(j));
        LIZIZ.remove(Long.valueOf(j));
    }

    public static void LIZ(final long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addCountDown, reserveTimestamp = ");
        sbLIZ.append(j2);
        sbLIZ.append(", hasStarted = ");
        ConcurrentHashMap<Long, InterfaceC420801kM> concurrentHashMap = LIZJ;
        sbLIZ.append(concurrentHashMap.containsKey(Long.valueOf(j)));
        C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ));
        long jLIZLLL = LIZLLL(j2);
        if (!concurrentHashMap.containsKey(Long.valueOf(j)) && j2 != 0 && jLIZLLL > 0) {
            InterfaceC420801kM interfaceC420801kM = concurrentHashMap.get(Long.valueOf(j));
            if (interfaceC420801kM != null) {
                interfaceC420801kM.dispose();
            }
            LJI(j);
            Long lValueOf = Long.valueOf(j);
            if (jLIZLLL < 300) {
                jLIZLLL++;
            }
            concurrentHashMap.put(lValueOf, C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(jLIZLLL).LJJJJZI(new C517101zt(jLIZLLL, 3)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C516301zl(j, 0), new C09JN() { // from class: X.00Qh
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("CoHostNudgeReservationHelper@a063.startCountDown$3");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startCountDown, throwable = ");
                    sbLIZ2.append(obj);
                    C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("CoHostNudgeReservationHelper@a063.startCountDown$3");
                }
            }, new InterfaceC781210Ukh() { // from class: X.01GE
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    C20441214yg.LJIIIZ("NudgeReservationHelper", "startCountDown, finish");
                    C916430ZxJ.LIZJ(j, 0L);
                }
            }));
        }
    }

    public static void LIZIZ(long j, long j2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addCountUp, reserveTimestamp = ");
        sbLIZ.append(j2);
        sbLIZ.append(", hasStarted = ");
        sbLIZ.append(LIZJ.containsKey(Long.valueOf(j)));
        C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (j2 != 0) {
            ConcurrentHashMap<Long, InterfaceC420801kM> concurrentHashMap = LIZ;
            if (!concurrentHashMap.containsKey(Long.valueOf(j))) {
                long jLIZ = C974520bT0.LIZ();
                long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                long jCurrentTimeMillis = jLIZ / j3;
                if (jCurrentTimeMillis <= 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() / j3;
                }
                long jMax = Math.max(0L, jCurrentTimeMillis - j2);
                InterfaceC420801kM interfaceC420801kM = concurrentHashMap.get(Long.valueOf(j));
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                LJFF(j);
                Long lValueOf = Long.valueOf(j);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("count up times = ");
                long j4 = 7300 - jMax;
                sbLIZ2.append(j4);
                sbLIZ2.append("  ");
                C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ2));
                C11O1 c11o1LIZ = C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS);
                if (jMax > 7200) {
                    j4 = 1;
                }
                concurrentHashMap.put(lValueOf, c11o1LIZ.LJLIIL(j4).LJJJJZI(new C517101zt(jMax, 4)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS3S0000100_15(j, 2), new C09JN() { // from class: X.00Qi
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("CoHostNudgeReservationHelper@a063.startCountUp$3");
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("startCountUp, throwable = ");
                        sbLIZ3.append(obj);
                        C20441214yg.LJIIIZ("NudgeReservationHelper", C2188811AlT.LIZIZ(sbLIZ3));
                        C1C7U.LIZIZ("CoHostNudgeReservationHelper@a063.startCountUp$3");
                    }
                }, new InterfaceC781210Ukh() { // from class: X.0ZwH
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C20441214yg.LJIIIZ("NudgeReservationHelper", "startCountUp, finish");
                    }
                }));
            }
        }
    }

    public static void LIZJ(long j, long j2) {
        if (j <= 0) {
            return;
        }
        LIZLLL.put(Long.valueOf(j), Long.valueOf(j2));
        DataChannel dataChannel = LJ;
        if (dataChannel != null) {
            dataChannel.LC0(MultiCoHostNudgeCountDownEvent.class, new C915780ZwG(j));
        }
    }
}

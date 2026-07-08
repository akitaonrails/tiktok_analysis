package X;

import com.ss.android.ugc.aweme.websocket.experiment.ZombieWsConnectionRecoveryConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: renamed from: X.0XEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845330XEd {
    public static final C845330XEd LIZ = new C845330XEd();
    public static final C845380XEi LIZIZ = C845380XEi.LL;
    public static final AFwS200S0000000_13 LIZJ = AFwS200S0000000_13.get$arr$(220);
    public static final AFwS247S0000000_13 LIZLLL = AFwS247S0000000_13.get$arr$(42);
    public static final AFwS200S0000000_13 LJ = AFwS200S0000000_13.get$arr$(221);
    public static final AFwS200S0000000_13 LJFF = AFwS200S0000000_13.get$arr$(222);
    public static final AFwS200S0000000_13 LJI = AFwS200S0000000_13.get$arr$(219);
    public static final C854820Xg8 LJII = C854820Xg8.get$arr$(2);
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(true);
    public static final AtomicLong LJIIIZ = new AtomicLong(-4611686018427387904L);
    public static volatile boolean LJIIJ;

    public static void LIZ(String str, boolean z, boolean z2, boolean z3) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[maybeCheck] start check [enterFrom] ");
        sbLIZ.append(str);
        C845400XEk.LIZIZ("WsHealthCheck", C2188811AlT.LIZIZ(sbLIZ));
        ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery zombieWsConnectionRecovery = (ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery) LJI.invoke();
        if (!zombieWsConnectionRecovery.enabled || !z || ((Boolean) LIZJ.invoke()).booleanValue()) {
            return;
        }
        if (!z3 && !LJIIIIZZ.get()) {
            return;
        }
        boolean z4 = true;
        if (z2) {
            if (!((Boolean) LJ.invoke()).booleanValue()) {
                return;
            }
        } else {
            long j = zombieWsConnectionRecovery.stalenessWindowMs;
            if (!((Boolean) LJ.invoke()).booleanValue()) {
                return;
            }
            long jLongValue = ((Number) LJFF.invoke()).longValue();
            if (jLongValue == 0 || ((Number) LIZIZ.invoke()).longValue() - jLongValue <= j) {
                return;
            }
        }
        long jLongValue2 = ((Number) LIZIZ.invoke()).longValue();
        long jLongValue3 = jLongValue2 - ((Number) LJFF.invoke()).longValue();
        AtomicLong atomicLong = LJIIIZ;
        long j2 = atomicLong.get();
        long j3 = jLongValue2 - j2;
        if (j3 >= zombieWsConnectionRecovery.minReconnectIntervalMs) {
            z4 = false;
        }
        String strLIZIZ = "n/a";
        String strLIZIZ2 = "never";
        if (!z4) {
            if (!atomicLong.compareAndSet(j2, jLongValue2)) {
                str2 = "cas-lost";
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[maybeCheck] zombie from ");
                sbLIZ2.append(str);
                sbLIZ2.append(", sinceInbound=");
                sbLIZ2.append(jLongValue3);
                sbLIZ2.append("ms, prevForcedReconnect=");
                if (j2 != -4611686018427387904L) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(j2);
                    sbLIZ3.append("ms");
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                sbLIZ2.append(strLIZIZ2);
                sbLIZ2.append(", sinceLastForced=");
                if (j2 != -4611686018427387904L) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(j3);
                    sbLIZ4.append("ms");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                }
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(", now=");
                sbLIZ2.append(jLongValue2);
                sbLIZ2.append("ms, reconnecting");
                C845400XEk.LIZIZ("WsHealthCheck", C2188811AlT.LIZIZ(sbLIZ2));
                LJII.invoke(EnumC845360XEg.FORCED.getStage(), str, Long.valueOf(jLongValue3), Long.valueOf(zombieWsConnectionRecovery.stalenessWindowMs));
                LIZLLL.invoke(str);
                return;
            }
        } else {
            str2 = "min-interval";
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("[maybeCheck] zombie from ");
        sbLIZ5.append(str);
        sbLIZ5.append(" suppressed (");
        sbLIZ5.append(str2);
        sbLIZ5.append("), sinceInbound=");
        sbLIZ5.append(jLongValue3);
        sbLIZ5.append("ms, lastForcedReconnect=");
        if (j2 != -4611686018427387904L) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(j2);
            sbLIZ6.append("ms");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
        }
        sbLIZ5.append(strLIZIZ2);
        sbLIZ5.append(", now=");
        sbLIZ5.append(jLongValue2);
        sbLIZ5.append("ms, sinceLastForced=");
        if (j2 != -4611686018427387904L) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(j3);
            sbLIZ7.append("ms");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
        }
        sbLIZ5.append(strLIZIZ);
        sbLIZ5.append(", interval=");
        sbLIZ5.append(zombieWsConnectionRecovery.minReconnectIntervalMs);
        sbLIZ5.append("ms");
        C845400XEk.LIZIZ("WsHealthCheck", C2188811AlT.LIZIZ(sbLIZ5));
        LJII.invoke(EnumC845360XEg.SUPPRESSED.getStage(), str, Long.valueOf(jLongValue3), Long.valueOf(zombieWsConnectionRecovery.stalenessWindowMs));
    }
}

package X;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS54S0000100_24;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0r5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575050r5b {
    public static final C1575050r5b LIZ = new C1575050r5b();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_ForegroundTracker");
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static volatile C11JF LIZLLL;

    public static void LIZ() {
        C11JF c11jf = LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LIZLLL = null;
        C1575430r6D.LIZ.getClass();
        long j = C1575430r6D.LIZ().strategy3HeartbeatIntervalMs;
        if (j < 0) {
            j = 0;
        } else if (j > 0) {
            LIZLLL = (C11JF) C11NZ.LJJJJJL(j, j, TimeUnit.MILLISECONDS).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0r5f
                @Override // X.C09JN
                public final void accept(Object obj) {
                    boolean z;
                    int[] iArrLIZIZ;
                    C1C7U.LIZ("OfflinePushForegroundTracker@f62a.startHeartbeat$2");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C10ID.LIZJ().LJIIIIZZ("last_foreground_ts", jCurrentTimeMillis);
                    C0VUQ.LIZ.getClass();
                    if (C0C64.LJIILLIIL().LJIIIZ(31744, "offline_feed_local_active_stats_enabled", true, true)) {
                        long jLIZ = C0VUQ.LIZ(jCurrentTimeMillis);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(jCurrentTimeMillis);
                        int i = calendar.get(11);
                        int i2 = (int) (jLIZ % ((long) 30));
                        String strLIZ = C10ID.LIZ(i2);
                        int i3 = 0;
                        if (strLIZ.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            iArrLIZIZ = new int[24];
                        } else {
                            int iLJJIZ = a0.LJJIZ(strLIZ, '|', 0, false, 6);
                            if (iLJJIZ <= 0) {
                                iArrLIZIZ = new int[24];
                            } else {
                                Long lLJIILIIL = C2095008Iq.LJIILIIL(strLIZ.substring(0, iLJJIZ));
                                if (lLJIILIIL != null && lLJIILIIL.longValue() == jLIZ) {
                                    iArrLIZIZ = C0VUQ.LIZIZ(strLIZ.substring(iLJJIZ + 1));
                                } else {
                                    iArrLIZIZ = new int[24];
                                }
                            }
                        }
                        C1575430r6D.LIZ.getClass();
                        long j2 = C1575430r6D.LIZ().strategy3HeartbeatIntervalMs;
                        if (j2 < 0 || j2 <= 0) {
                            j2 = 300000;
                        }
                        int i4 = (int) (3600000 / j2);
                        if (i4 < 1) {
                            i4 = 1;
                        }
                        int i5 = iArrLIZIZ[i] + 1;
                        if (i5 <= i4) {
                            i4 = i5;
                        }
                        iArrLIZIZ[i] = i4;
                        StringBuilder sb = new StringBuilder();
                        sb.append(jLIZ);
                        sb.append('|');
                        while (true) {
                            sb.append(iArrLIZIZ[i3]);
                            i3++;
                            if (i3 >= 24) {
                                break;
                            } else if (i3 > 0) {
                                sb.append(',');
                            }
                        }
                        String string = sb.toString();
                        InterfaceC625970Ogt interfaceC625970OgtLIZJ = C10ID.LIZJ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("local_active_day_");
                        sbLIZ.append(((i2 % 30) + 30) % 30);
                        interfaceC625970OgtLIZJ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), string);
                        C0VUQ.LIZIZ.LIZIZ(new C1156240gC6(jLIZ, i, i2, iArrLIZIZ));
                    }
                    C1C7U.LIZIZ("OfflinePushForegroundTracker@f62a.startHeartbeat$2");
                }
            }, new C09JN() { // from class: X.0qwL
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("OfflinePushForegroundTracker@f62a.startHeartbeat$3");
                    C19319410i8 c19319410i8 = C1575050r5b.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[ForegroundTracker] heartbeat error ");
                    sbLIZ.append(obj);
                    c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("OfflinePushForegroundTracker@f62a.startHeartbeat$3");
                }
            });
            return;
        }
        LIZIZ.LJIIJJI(new AwS54S0000100_24(j, 0));
    }
}

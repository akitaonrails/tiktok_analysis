package X;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AwS63S0001000_28;

/* JADX INFO: renamed from: X.10I8, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10I8 {
    public static final C10I8 LIZ = new C10I8();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_Reconciler");

    public static void LIZIZ(int i) {
        Object c098200Yq;
        Object c098200Yq2;
        InterfaceC625970Ogt interfaceC625970OgtLIZJ = C10ID.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pending_shown_ts_strategy_");
        sbLIZ.append(i);
        long j = interfaceC625970OgtLIZJ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        if (j <= 0) {
            return;
        }
        if (C10ID.LIZJ().getLong("last_clicked_ts", 0L) > j) {
            C10ID.LJIIIIZZ(i, 0L);
            LIZIZ.LJIIJJI(new AwS63S0001000_28(i, 7));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C1575430r6D.LIZ.getClass();
        int i2 = C1575430r6D.LIZ().timeoutNoClickHours;
        boolean z = false;
        if (i2 < 0) {
            i2 = 0;
        }
        long j2 = ((long) i2) * 3600000;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C816090Vzr.LIZ.getClass();
        int i3 = (i & 255) + 2000000;
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) C786410Ut5.H2(contextLIZ, "notification")).getActiveNotifications();
            if (activeNotifications != null) {
                int length = activeNotifications.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (activeNotifications[i4].getId() != i3) {
                        i4++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19319410i8 c19319410i8 = LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Reconcile] getActiveNotifications failed strategy=");
            sbLIZ2.append(i);
            sbLIZ2.append(" fallback=true ");
            sbLIZ2.append(thM5exceptionOrNullimpl);
            c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            c098200Yq = Boolean.TRUE;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            LIZ(i, jCurrentTimeMillis, "user_dismissed");
            return;
        }
        if (j2 > 0 && jCurrentTimeMillis >= j2) {
            LIZ(i, jCurrentTimeMillis, "timeout");
            try {
                C816090Vzr.LIZ.getClass();
                C816090Vzr.LIZIZ(i);
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl2 != null) {
                C19319410i8 c19319410i82 = LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[Reconcile] cancel after timeout failed strategy=");
                sbLIZ3.append(i);
                sbLIZ3.append(' ');
                sbLIZ3.append(thM5exceptionOrNullimpl2);
                c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            }
            C189200o6.m1boximpl(c098200Yq2);
            return;
        }
        LIZIZ.LIZIZ(new C1886820zCS(i, jCurrentTimeMillis, j2));
    }

    public static void LIZ(int i, long j, String str) {
        InterfaceC625970Ogt interfaceC625970OgtLIZJ = C10ID.LIZJ();
        interfaceC625970OgtLIZJ.LIZJ("consecutive_no_click", interfaceC625970OgtLIZJ.getInt("consecutive_no_click", 0) + 1);
        C10ID.LJIIIIZZ(i, 0L);
        C10I9 c10i9 = C10I9.LIZ;
        InterfaceC625970Ogt interfaceC625970OgtLIZJ2 = C10ID.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_shown_ts_strategy_");
        sbLIZ.append(i);
        long j2 = interfaceC625970OgtLIZJ2.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        String strLIZLLL = C10ID.LIZLLL(i);
        c10i9.getClass();
        C10I9.LIZIZ("offline_push_clear", C10I9.LIZ(j2, strLIZLLL));
        LIZIZ.LJIIJJI(new C2230508oZ(i, str, j));
    }
}

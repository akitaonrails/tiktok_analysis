package X;

import com.ss.android.ugc.aweme.offlinepush.worker.Strategy1NetworkExitWork;
import com.ss.android.ugc.aweme.offlinepush.worker.Strategy2WifiToCellularWork;
import com.ss.android.ugc.aweme.offlinepush.worker.Strategy3PeriodicWork;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0VQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQ7 {
    public static final C0VQ7 LIZ = new C0VQ7();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_Scheduler");

    public static void LIZ(int i) {
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    str = "offline_strategy_3_next";
                }
            } else {
                str = "offline_strategy_2";
            }
        } else {
            str = "offline_strategy_1";
        }
        C844470XAv.LIZ.getClass();
        C0VI1.LJII(C844470XAv.LIZ()).LJ(str);
        LIZIZ.LJIIJJI(new C0VQ8(i, str));
    }

    public static void LIZIZ(int i, long j, String str) throws IOException {
        String str2;
        C0VIO c0vio;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "offline_strategy_3_next";
                }
                C19319410i8 c19319410i8 = LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Scheduler] unknown strategy=");
                sbLIZ.append(i);
                sbLIZ.append(", skip schedule");
                c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            str2 = "offline_strategy_2";
        } else {
            str2 = "offline_strategy_1";
        }
        if (str2 != null) {
            C0VQA.LIZ.getClass();
            String strLIZ = C0VQA.LIZ();
            C795410VId c795410VId = new C795410VId();
            ((HashMap) c795410VId.LIZ).put("offline_push_strategy", Integer.valueOf(i));
            c795410VId.LIZLLL("offline_push_reason", str);
            c795410VId.LIZLLL("offline_push_sender_uid", strLIZ);
            C795380VIa c795380VIaLIZ = c795410VId.LIZ();
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    } else {
                        c0vio = new C0VIO(Strategy3PeriodicWork.class);
                    }
                } else {
                    c0vio = new C0VIO(Strategy2WifiToCellularWork.class);
                }
            } else {
                c0vio = new C0VIO(Strategy1NetworkExitWork.class);
            }
            c0vio.LJ(c795380VIaLIZ);
            long j2 = 0;
            if (j >= 0) {
                j2 = j;
            }
            c0vio.LIZLLL(j2, TimeUnit.MILLISECONDS);
            ((HashSet) c0vio.LIZLLL).add("offline_push");
            C0VIR c0virLIZ = c0vio.LIZ();
            C844470XAv.LIZ.getClass();
            C0VI1 c0vi1LJII = C0VI1.LJII(C844470XAv.LIZ());
            C0VI0 c0vi0 = C0VI0.REPLACE;
            c0vi1LJII.getClass();
            c0vi1LJII.LIZ(str2, c0vi0, Collections.singletonList(c0virLIZ)).LIZ();
            LIZIZ.LJIIJJI(new C0VQ9(i, str, str2, j, strLIZ));
            return;
        }
        C19319410i8 c19319410i82 = LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[Scheduler] unknown strategy=");
        sbLIZ2.append(i);
        sbLIZ2.append(", skip schedule");
        c19319410i82.LJ(C2188811AlT.LIZIZ(sbLIZ2));
    }
}

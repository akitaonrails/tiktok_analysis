package X;

import com.ss.android.ugc.localnotify.work.DoNotifyWork;
import com.ss.android.ugc.localnotify.work.NUGuideNotifyWork;
import com.ss.android.ugc.localnotify.work.PreWakeWork;
import com.ss.android.ugc.localnotify.work.SilentWakeWork;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0VPN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VPN {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(235));
    public static int LIZIZ = 4;

    public static void LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelWorkManagerTasksByTag(");
        sbLIZ.append(i);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C0VI7 c0vi7 = (C0VI7) LIZ.getValue();
        if (c0vi7 != null) {
            c0vi7.LIZIZ(String.valueOf(i));
        }
    }

    public static String LIZJ(C0VPR c0vpr) {
        String strLIZIZ;
        boolean z;
        long j = c0vpr.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j > jCurrentTimeMillis) {
            C0VPZ.LIZ.getClass();
            String strLIZJ = C0VPZ.LIZJ(j);
            C795410VId c795410VId = new C795410VId();
            c795410VId.LIZLLL("notification_id", c0vpr.LIZ);
            c795410VId.LIZLLL("scheduled_time_string", strLIZJ);
            ((HashMap) c795410VId.LIZ).put("scheduled_timestamp", Long.valueOf(j));
            C795380VIa c795380VIaLIZ = c795410VId.LIZ();
            long j2 = j - jCurrentTimeMillis;
            if (!c0vpr.LJ) {
                C0VQ5 c0vq5 = C0VQ5.LIZ;
                String str = c0vpr.LIZ;
                int i = c0vpr.LIZIZ;
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                c0vq5.getClass();
                C0VQ5.LIZIZ(i, j, str, z);
            }
            String strLJJIFFI = c0vpr.LIZ;
            if (C0VPS.LIZ && u.LJIIZILJ(strLJJIFFI, "_0", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('_');
                int i2 = LIZIZ;
                LIZIZ = i2 + 1;
                sbLIZ.append(i2);
                strLJJIFFI = u.LJJIFFI(strLJJIFFI, "_0", C2188811AlT.LIZIZ(sbLIZ), false);
            }
            LIZIZ(strLJJIFFI, c0vpr.LIZIZ, j2, c795380VIaLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("WM(");
            sbLIZ2.append(strLJJIFFI);
            sbLIZ2.append("): ");
            sbLIZ2.append(strLIZJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("WM(");
            sbLIZ3.append(c0vpr.LIZ);
            sbLIZ3.append("): Incorrect Date and Time!");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Set ");
        sbLIZ4.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ4);
        return strLIZIZ;
    }

    public static void LIZIZ(String str, int i, long j, C795380VIa c795380VIa) {
        Class cls;
        C795280VHq c795280VHqLIZ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    cls = SilentWakeWork.class;
                } else {
                    cls = NUGuideNotifyWork.class;
                }
            } else {
                cls = DoNotifyWork.class;
            }
        } else {
            cls = PreWakeWork.class;
        }
        C0VIO c0vio = new C0VIO(cls);
        c0vio.LIZLLL(j, TimeUnit.MILLISECONDS);
        ((HashSet) c0vio.LIZLLL).add(String.valueOf(i));
        c0vio.LJ(c795380VIa);
        C0VIR c0virLIZ = c0vio.LIZ();
        C0VI7 c0vi7 = (C0VI7) LIZ.getValue();
        if (c0vi7 != null && (c795280VHqLIZ = c0vi7.LIZ(str, C0VI0.REPLACE, Collections.singletonList(c0virLIZ))) != null) {
            c795280VHqLIZ.LIZ();
        }
    }
}

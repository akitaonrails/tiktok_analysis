package X;

import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;

/* JADX INFO: renamed from: X.0piV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522290piV {
    public static final C1522290piV LIZ = new C1522290piV();

    public static int LIZ(Integer num) {
        if (num == null) {
            return 3;
        }
        if (num.intValue() == 1) {
            return 0;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        if (num.intValue() != -2) {
            return 3;
        }
        return 2;
    }

    public static void LIZIZ(C1537710q7N c1537710q7N, C1522330piZ c1522330piZ, long j) {
        long jLongValue;
        C1521470phB c1521470phB = new C1521470phB();
        c1521470phB.LJI = c1522330piZ.LIZ;
        c1521470phB.LJII = LIZ(c1522330piZ.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1522330piZ.LIZJ);
        sbLIZ.append(", isRunInMainThread: ");
        sbLIZ.append(c1522330piZ.LJII);
        c1521470phB.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
        Long l = c1522330piZ.LJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c1521470phB.LJIIJ = jLongValue;
        if (jLongValue != 0) {
            c1521470phB.LJIIJJI = j;
            c1521470phB.LJIIIZ = j - jLongValue;
        }
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportJsbInfo(c1537710q7N, c1521470phB);
    }
}

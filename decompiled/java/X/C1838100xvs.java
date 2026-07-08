package X;

import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.0xvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838100xvs {
    public static final SimpleDateFormat LIZ;
    public static final SimpleDateFormat LIZIZ;
    public static final SimpleDateFormat LIZJ;

    static {
        new SimpleDateFormat("MMMM d", Locale.getDefault());
        LIZ = new SimpleDateFormat("MMM d", Locale.getDefault());
        new SimpleDateFormat("MMMM d, yyyy", Locale.getDefault());
        LIZIZ = new SimpleDateFormat("MMM d, yyyy", Locale.getDefault());
        LIZJ = new SimpleDateFormat("h:mm a", Locale.getDefault());
    }

    public static final String LIZ(long j) {
        SimpleDateFormat simpleDateFormat;
        String strLJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        long j2 = j * 1000;
        int i = 2131853248;
        if (DateUtils.isToday(j2)) {
            strLJIJI = C497740JfY.LJIJI(2131853248);
        } else {
            C1387320mCo c1387320mCoLIZLLL = C1387310mCn.LIZLLL();
            if (j2 >= c1387320mCoLIZLLL.LIZ && j2 < c1387320mCoLIZLLL.LIZIZ) {
                strLJIJI = C497740JfY.LJIJI(2131853249);
            } else if (C1387310mCn.LJI(j2)) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j2);
                switch (calendar.get(7)) {
                    case 1:
                        i = 2131853246;
                        break;
                    case 2:
                        i = 2131853244;
                        break;
                    case 3:
                        i = 2131853250;
                        break;
                    case 4:
                        i = 2131853251;
                        break;
                    case 5:
                        i = 2131853247;
                        break;
                    case 6:
                        i = 2131853243;
                        break;
                    case 7:
                        i = 2131853245;
                        break;
                }
                strLJIJI = C497740JfY.LJIJI(i);
            } else {
                Calendar calendar2 = Calendar.getInstance();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(j2);
                if (calendar2.get(1) == calendar3.get(1)) {
                    simpleDateFormat = LIZ;
                } else {
                    simpleDateFormat = LIZIZ;
                }
                strLJIJI = simpleDateFormat.format(Long.valueOf(j2));
            }
        }
        sbLIZ.append(strLJIJI);
        sbLIZ.append(", ");
        sbLIZ.append(LIZJ.format(Long.valueOf(j2)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZIZ(float f) {
        long j = (long) f;
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = j % j2;
        long j5 = 60;
        long j6 = j4 / j5;
        long j7 = j % j5;
        if (j3 > 0) {
            return C786410Ut5.j4("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j6), Long.valueOf(j7)}, 3));
        }
        return C786410Ut5.j4("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j7)}, 2));
    }
}

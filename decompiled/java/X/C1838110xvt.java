package X;

import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.0xvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838110xvt {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("MMMM d", Locale.getDefault());
    public static final SimpleDateFormat LIZIZ = new SimpleDateFormat("MMM d", Locale.getDefault());
    public static final SimpleDateFormat LIZJ = new SimpleDateFormat("h:mm a", Locale.getDefault());

    public static final String LIZ(long j, boolean z) {
        int i = 2131853248;
        if (DateUtils.isToday(j)) {
            return C497740JfY.LJIJI(2131853248);
        }
        C1387320mCo c1387320mCoLIZLLL = C1387310mCn.LIZLLL();
        if (j >= c1387320mCoLIZLLL.LIZ && j < c1387320mCoLIZLLL.LIZIZ) {
            return C497740JfY.LJIJI(2131853249);
        }
        if (C1387310mCn.LJI(j)) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
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
            return C497740JfY.LJIJI(i);
        }
        if (z) {
            return LIZIZ.format(Long.valueOf(j));
        }
        return LIZ.format(Long.valueOf(j));
    }
}

package X;

import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.0xzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840140xzA {
    public static final SimpleDateFormat LIZ;
    public static final SimpleDateFormat LIZIZ;
    public static final SimpleDateFormat LIZJ;

    static {
        Locale locale = Locale.US;
        LIZ = new SimpleDateFormat("M/d/yyyy HH:mm", locale);
        LIZIZ = new SimpleDateFormat("M/d HH:mm", locale);
        LIZJ = new SimpleDateFormat("HH:mm", locale);
    }

    public static String LIZ(long j) {
        if (j == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C497740JfY.LJIJI(2131851063));
            sbLIZ.append(" 00:00");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        int i = C1840150xzB.LIZ;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(1);
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (i2 == calendar.get(1)) {
            if (!DateUtils.isToday(j)) {
                return LIZIZ.format(Long.valueOf(j));
            }
            return C497740JfY.LJIJJ(2131834263, LIZJ.format(Long.valueOf(j)));
        }
        return LIZ.format(Long.valueOf(j));
    }
}

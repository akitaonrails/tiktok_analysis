package X;

import android.content.Context;
import com.bytedance.bddatefmt.BDDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.0KZF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KZF {
    public static final C0KZF LIZ = new C0KZF();

    public static String LIZ(Context context, long j, long j2) {
        if (j2 < 60000) {
            return new BDDateFormat("jn").LIZIZ(j2, Locale.getDefault());
        }
        if (j2 < 3600000) {
            return context.getString(2131850409, Long.valueOf(j2 / 60000));
        }
        if (j2 < 86400000) {
            return context.getString(2131850407, Long.valueOf(j2 / 3600000));
        }
        if (j2 < 604800000) {
            return context.getString(2131850405, Long.valueOf(j2 / 86400000));
        }
        long j3 = j2 / 86400000;
        if (j3 <= 2147483647L && ((int) j3) == 7) {
            return context.getString(2131850405, 7);
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar2.get(1) == calendar.get(1)) {
            return new BDDateFormat("ll-Y").LIZIZ(j, Locale.getDefault());
        }
        return new BDDateFormat("ll").LIZIZ(j, Locale.getDefault());
    }
}

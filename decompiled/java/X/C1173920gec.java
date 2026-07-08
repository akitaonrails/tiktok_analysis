package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: X.0gec, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1173920gec {
    public static final String LIZ(int i, long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(1) - i;
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setLenient(false);
        while (true) {
            try {
                calendar2.clear();
                calendar2.set(i2, i3, i4);
                return simpleDateFormat.format(calendar2.getTime());
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                i4--;
            }
        }
    }
}

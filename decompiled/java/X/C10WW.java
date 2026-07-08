package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: X.10WW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10WW {
    public static Date LIZ(String str) {
        Date date = null;
        if (str == null) {
            return null;
        }
        try {
            date = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).parse(str);
            return date;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            System.out.print(e);
            return date;
        }
    }

    public static String LIZJ(Locale locale) {
        String localizedPattern = ((SimpleDateFormat) DateFormat.getDateInstance(3, locale)).toLocalizedPattern();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String lowerCase = localizedPattern.toLowerCase(locale);
        int length = lowerCase.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = lowerCase.charAt(i);
            if (!hashSet.contains(Character.valueOf(cCharAt))) {
                if (cCharAt != 'd') {
                    if (cCharAt != 'm') {
                        if (cCharAt == 'y') {
                            arrayList.add("yyyy");
                        }
                    } else {
                        arrayList.add("mm");
                    }
                } else {
                    arrayList.add("dd");
                }
                hashSet.add(Character.valueOf(cCharAt));
            }
        }
        return C13LP.LJJLIIIJ(arrayList, "", null, null, 0, null, null, 62);
    }

    public static int LIZLLL(Date date) {
        Calendar calendar = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date == null) {
            return -1;
        }
        gregorianCalendar.setTime(date);
        int i = calendar.get(1) - gregorianCalendar.get(1);
        if (calendar.get(2) == gregorianCalendar.get(2)) {
            if (calendar.get(5) >= gregorianCalendar.get(5)) {
                return i;
            }
        } else if (calendar.get(2) >= gregorianCalendar.get(2)) {
            return i;
        }
        return i - 1;
    }

    public static int LIZIZ(double d, Context context) {
        if (context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
        }
        return 0;
    }
}

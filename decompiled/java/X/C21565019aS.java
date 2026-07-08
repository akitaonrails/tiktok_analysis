package X;

import android.content.res.Resources;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.19aS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21565019aS {
    public static final AtomicReference<C21565119aT> LIZ = new AtomicReference<>();

    public static SimpleDateFormat LJFF() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) DateFormat.getDateInstance(3, Locale.getDefault())).toLocalizedPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    public static Calendar LJII() {
        C21565119aT c21565119aT = LIZ.get();
        if (c21565119aT == null) {
            c21565119aT = C21565119aT.LIZJ;
        }
        TimeZone timeZone = c21565119aT.LIZIZ;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = c21565119aT.LIZ;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static long LIZ(long j) {
        Calendar calendarLJIIIIZZ = LJIIIIZZ(null);
        calendarLJIIIIZZ.setTimeInMillis(j);
        return LIZLLL(calendarLJIIIIZZ).getTimeInMillis();
    }

    public static Calendar LIZLLL(Calendar calendar) {
        Calendar calendarLJIIIIZZ = LJIIIIZZ(calendar);
        Calendar calendarLJIIIIZZ2 = LJIIIIZZ(null);
        calendarLJIIIIZZ2.set(calendarLJIIIIZZ.get(1), calendarLJIIIIZZ.get(2), calendarLJIIIIZZ.get(5));
        return calendarLJIIIIZZ2;
    }

    public static Calendar LJIIIIZZ(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static android.icu.text.DateFormat LIZJ(String str, Locale locale) {
        android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static DateFormat LJ(int i, Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
        return dateInstance;
    }

    public static String LJI(Resources resources, SimpleDateFormat simpleDateFormat) {
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        return localizedPattern.replaceAll("d", resources.getString(2131837564)).replaceAll("M", resources.getString(2131837565)).replaceAll("y", resources.getString(2131837566));
    }

    public static int LIZIZ(int i, int i2, String str, String str2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0 || i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) != '\'');
            }
            i2 += i;
        }
        return i2;
    }
}

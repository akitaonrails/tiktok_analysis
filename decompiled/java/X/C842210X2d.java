package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import xlp.c;

/* JADX INFO: renamed from: X.0X2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842210X2d {
    public static final C842220X2e LIZ = new ThreadLocal<DateFormat>() { // from class: X.0X2e
        @Override // java.lang.ThreadLocal
        public final DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(c.LJIILIIL);
            return simpleDateFormat;
        }
    };
}

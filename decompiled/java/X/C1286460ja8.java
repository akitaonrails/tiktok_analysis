package X;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: X.0ja8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286460ja8 {
    public static boolean LIZ() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ENGLISH;
        return str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals("samsung");
    }
}

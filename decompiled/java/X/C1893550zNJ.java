package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zNJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893550zNJ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        String lowerCase;
        if (str == null || str.length() == 0) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String lowerCase2 = str.toLowerCase(locale);
        C1893540zNI.LIZ.getClass();
        String str2 = C1893540zNI.LJ;
        if (str2 != null) {
            lowerCase = str2.toLowerCase(locale);
        } else {
            lowerCase = null;
        }
        return Intrinsics.LJFF(lowerCase2, lowerCase);
    }
}

package X;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VZ5 {
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            C0VZ6.LIZ(30);
            C0VZ6.LIZ(31);
            C0VZ6.LIZ(33);
            C0VZ6.LIZ(1000000);
        }
    }

    @InterfaceC1294060jmO
    public static final boolean LIZ() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i < 30) {
                return false;
            }
            String str = Build.VERSION.CODENAME;
            if (Intrinsics.LJFF("REL", str)) {
                return false;
            }
            Locale locale = Locale.ROOT;
            if (str.toUpperCase(locale).compareTo("S".toUpperCase(locale)) < 0) {
                return false;
            }
        }
        return true;
    }
}

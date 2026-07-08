package X;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488520oq2 {
    public static int LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 1, "audio_mode", true);
    }

    public static boolean LIZIZ() {
        if (LIZ() == 1) {
            return false;
        }
        String str = Build.MANUFACTURER;
        if (Intrinsics.LJFF(str != null ? str.toUpperCase(Locale.ROOT) : null, "OPPO")) {
            return false;
        }
        return !Intrinsics.LJFF(str != null ? str.toUpperCase(Locale.ROOT) : null, "REALME");
    }

    public static boolean LIZJ() {
        return LIZ() == 3 || LIZ() == 5;
    }
}

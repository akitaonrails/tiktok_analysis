package X;

import android.os.Build;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0BMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C286850BMd {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("ulefone", "onn", "myphone");

    public static final boolean LIZ() {
        if (!LIZ.contains(Build.MANUFACTURER.toLowerCase(Locale.getDefault()))) {
            int iIntValue = ((Number) C286830BMb.LIZ.getValue()).intValue();
            if (iIntValue == 0) {
                return ((Boolean) C0A0W.LIZIZ.getValue()).booleanValue();
            }
            if (iIntValue != 1 && (iIntValue == 2 || iIntValue == 3)) {
                return true;
            }
        }
        return false;
    }
}

package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0hlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216500hlI {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(833));

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ() {
        if (LIZ().getBoolean("has_shown", false)) {
            LIZ().storeBoolean("ug_pin_first_guide_shown", true);
            LIZ().storeBoolean("manage_menu_guide_shown", true);
            LIZ().storeBoolean("has_shown", false);
        }
    }
}

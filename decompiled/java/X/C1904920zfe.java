package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904920zfe {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(89));

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static final boolean LIZIZ(EnumC1904890zfb enumC1904890zfb) {
        int i = C1904910zfd.LIZ[enumC1904890zfb.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return LIZ().getBoolean("double_click_used", false);
            }
            throw new C1954807lC();
        }
        return LIZ().getBoolean("long_press_used", false);
    }

    public static final void LIZJ(EnumC1904890zfb enumC1904890zfb) {
        int i = C1904910zfd.LIZ[enumC1904890zfb.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZ().storeBoolean("double_click_used", true);
                return;
            }
            throw new C1954807lC();
        }
        LIZ().storeBoolean("long_press_used", true);
    }
}

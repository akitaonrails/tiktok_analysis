package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0C8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308690C8d {
    public static Bitmap LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS190S0000000_4.get$arr$(3320));
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS190S0000000_4.get$arr$(3321));
    }

    public static float LIZ(Integer num, Integer num2) {
        int iIntValue;
        int iIntValue2 = 1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        if (num2 != null && num2.intValue() != 0) {
            iIntValue2 = num2.intValue();
        }
        return ((int) Math.rint((((double) iIntValue) / ((double) iIntValue2)) * ((double) 100))) / 100;
    }
}

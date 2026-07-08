package X;

import java.util.Locale;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03oL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C955103oL {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(512));

    public static final EnumC955203oM LIZ(Integer num) {
        C909303gx.LIZ.getClass();
        String strLIZ = C909303gx.LIZ();
        String upperCase = null;
        if (strLIZ != null) {
            upperCase = strLIZ.toUpperCase(Locale.ROOT);
        }
        if (Intrinsics.LJFF(upperCase, "SA")) {
            return EnumC955203oM.TTF;
        }
        for (EnumC955203oM enumC955203oM : EnumC955203oM.values()) {
            int bizType = enumC955203oM.getBizType();
            if (num != null && bizType == num.intValue()) {
                return enumC955203oM;
            }
        }
        return EnumC955203oM.TTS;
    }

    public static final String LIZIZ(Integer num) {
        EnumC955203oM enumC955203oM;
        EnumC955203oM[] enumC955203oMArrValues = EnumC955203oM.values();
        int length = enumC955203oMArrValues.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC955203oM = enumC955203oMArrValues[i];
                int bizType = enumC955203oM.getBizType();
                if (num != null && bizType == num.intValue()) {
                    break;
                }
                i++;
            } else {
                enumC955203oM = EnumC955203oM.TTS;
                break;
            }
        }
        return enumC955203oM.getBizName();
    }
}

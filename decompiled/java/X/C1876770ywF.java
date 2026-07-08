package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ywF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876770ywF {
    public static EnumC1876780ywG LIZ(String str) {
        for (EnumC1876780ywG enumC1876780ywG : EnumC1876780ywG.values()) {
            String strName = enumC1876780ywG.name();
            Locale locale = Locale.ROOT;
            if (Intrinsics.LJFF(strName.toLowerCase(locale), str.toLowerCase(locale))) {
                return enumC1876780ywG;
            }
        }
        return null;
    }
}

package X;

import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Wb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826160Wb0 {
    public static EnumC826230Wb7 LIZ(C826120Waw c826120Waw) {
        String lowerCase;
        EnumC826230Wb7 enumC826230Wb7LIZ;
        List<String> list = C826270WbB.LIZ;
        String str = c826120Waw.LJ;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if ((lowerCase != null && lowerCase.length() != 0 && !list.contains(lowerCase)) || ((enumC826230Wb7LIZ = C826210Wb5.LIZ(c826120Waw.LIZLLL)) != EnumC826230Wb7.INTERNAL_THIRD_PARTY && enumC826230Wb7LIZ != EnumC826230Wb7.EXTERNAL_THIRD_PARTY && enumC826230Wb7LIZ != EnumC826230Wb7.UNKNOWN)) {
            return null;
        }
        return enumC826230Wb7LIZ;
    }
}

package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549280qQ2 {
    public static final C1549290qQ3 LIZ = new C1549290qQ3(0);

    public static String LIZ(String str, String str2, String str3) {
        String str4;
        Map<String, C1549300qQ4> map;
        C1549300qQ4 c1549300qQ4;
        Map<String, String> map2;
        C1549310qQ5 c1549310qQ5 = LIZ.LIZ.get(str);
        if (c1549310qQ5 != null && (map = c1549310qQ5.LIZ) != null && (c1549300qQ4 = map.get(str2)) != null && (map2 = c1549300qQ4.LIZ) != null) {
            str4 = map2.get(str3);
            if (str4 != null) {
                return str4;
            }
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(str2, "en")) {
            return LIZ(str, "en", str3);
        }
        return str4;
    }
}

package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679800QlW {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        Map<String, String> mapLJJIJIIJIL = C1ER1.LIZIZ.LJJIJIIJIL(null);
        String str2 = mapLJJIJIIJIL.get("search_type");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = mapLJJIJIIJIL.get("enter_from");
        if (str3 == null) {
            str3 = "";
        }
        EnumC669620QOi enumC669620QOi = EnumC669620QOi.PHOTO;
        if (Intrinsics.LJFF(str2, enumC669620QOi.getTabName()) && Intrinsics.LJFF(str3, "search_result")) {
            return enumC669620QOi.getTabName();
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}

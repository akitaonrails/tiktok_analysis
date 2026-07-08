package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0iCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233600iCs {
    public static final Map<Integer, C1233510iCj> LIZ = new LinkedHashMap();
    public static final Map<String, C1233510iCj> LIZIZ = C2097608Jq.LJIIJ(new Pair("_uid_", null));

    @InterfaceC1294060jmO
    public static Map LIZ(C1233440iCc c1233440iCc) {
        String string;
        String string2;
        Pair[] pairArr = new Pair[4];
        String str = c1233440iCc.LIZLLL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("video_link_id", str);
        String str3 = c1233440iCc.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("video_link_item_id", str3);
        EnumC1234280iDy enumC1234280iDy = c1233440iCc.LIZ;
        if (enumC1234280iDy == null || (string = Integer.valueOf(enumC1234280iDy.getRawValue()).toString()) == null) {
            string = "";
        }
        pairArr[2] = new Pair("video_link_share_type", string);
        EnumC1234280iDy enumC1234280iDy2 = c1233440iCc.LIZ;
        if (enumC1234280iDy2 != null && (string2 = Integer.valueOf(enumC1234280iDy2.getFollowFrom()).toString()) != null) {
            str2 = string2;
        }
        pairArr[3] = new Pair("from", str2);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}

package X;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Z1, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Z1 {
    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snssdk");
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LJIIJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C10YT.LIZ()) {
            if (str == null || str.length() == 0) {
                return false;
            }
            return C1E65.LIZ.contains(str);
        }
        if (!Intrinsics.LJFF(str, "sslocal") && !Intrinsics.LJFF(str, "snssdk1180") && !Intrinsics.LJFF(str, "snssdk1233") && !Intrinsics.LJFF(str, "snssdk473824") && !Intrinsics.LJFF(str, "musically") && !Intrinsics.LJFF(str, "tiktok") && !Intrinsics.LJFF(str, "snssdkotl1233") && !Intrinsics.LJFF(str, "snssdkm21233") && !Intrinsics.LJFF(str, "snssdklitem21233") && !Intrinsics.LJFF(str, "snssdk567753") && !Intrinsics.LJFF(str, "snssdk259") && !Intrinsics.LJFF(str, "snssdkotl259") && !Intrinsics.LJFF(str, "snssdk845221")) {
            return false;
        }
        return true;
    }
}

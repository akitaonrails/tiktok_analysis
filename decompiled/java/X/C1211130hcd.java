package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211130hcd {
    public static String LIZ(String str, String str2) {
        String str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (Intrinsics.LJFF(str, "others_homepage")) {
            str3 = "reposted_other_profile_list";
        } else {
            str3 = "reposted_self_profile_list";
        }
        sbLIZ.append(str3);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

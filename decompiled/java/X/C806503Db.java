package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C806503Db {
    public static void LIZ(StringBuilder sb, String str, String str2) {
        int iIndexOf;
        if (sb.indexOf(str) == -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[tiktokec_template_key_not_found] template = ");
            sbLIZ.append((Object) sb);
            sbLIZ.append(", key = ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (str != null && str.length() != 0 && str2.length() != 0 && (iIndexOf = sb.indexOf(str)) > -1 && !Intrinsics.LJFF(str, str2)) {
            do {
                sb.replace(iIndexOf, str.length() + iIndexOf, str2);
                iIndexOf = sb.indexOf(str, iIndexOf + str2.length());
            } while (iIndexOf > -1);
        }
    }
}

package X;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07j8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1942007j8 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r2 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(android.net.Uri r9) {
        /*
            boolean r0 = r9.isHierarchical()
            if (r0 == 0) goto L32
            java.lang.String r0 = r9.toString()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
        Le:
            java.lang.String r2 = r0.getHost()
            r8 = 0
            if (r2 == 0) goto L7d
            java.lang.String r7 = r0.getEncodedAuthority()
            if (r7 == 0) goto L7d
            r6 = 0
            r5 = 0
            r4 = 0
        L1e:
            int r3 = r7.length()
            r1 = 64
            r0 = 1
            if (r5 >= r3) goto L34
            char r0 = r7.charAt(r5)
            if (r0 != r1) goto L2f
            int r4 = r4 + 1
        L2f:
            int r5 = r5 + 1
            goto L1e
        L32:
            r0 = r9
            goto Le
        L34:
            if (r4 <= r0) goto L5d
            java.lang.String r4 = r9.getEncodedAuthority()
            if (r4 == 0) goto L7c
            r0 = 6
            int r3 = kotlin.text.a0.LJJJJ(r4, r1, r6, r0)
            int r0 = r4.length()
            int r2 = r0 + (-1)
        L47:
            if (r2 < 0) goto L75
            char r1 = r4.charAt(r2)
            r0 = 58
            if (r0 != r1) goto L6a
            int r0 = r3 + 1
            java.lang.String r0 = r4.substring(r0, r2)
        L57:
            java.lang.String r2 = android.net.Uri.decode(r0)
            if (r2 == 0) goto L7c
        L5d:
            r1 = 92
            boolean r0 = kotlin.text.a0.LJJIJ(r2, r1)
            if (r0 == 0) goto L69
            java.lang.String r2 = kotlin.text.a0.LJJLL(r1, r2, r2)
        L69:
            return r2
        L6a:
            r0 = 48
            if (r1 < r0) goto L75
            r0 = 57
            if (r1 > r0) goto L75
            int r2 = r2 + (-1)
            goto L47
        L75:
            int r0 = r3 + 1
            java.lang.String r0 = r4.substring(r0)
            goto L57
        L7c:
            return r8
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1942007j8.LIZ(android.net.Uri):java.lang.String");
    }

    public static final boolean LIZIZ(String str, List<String> list) {
        for (String str2 : list) {
            if (str2.length() != 0) {
                if (Intrinsics.LJFF(str2, str)) {
                    return true;
                }
                if (u.LJJIIJZLJL(str2, e3.d, false)) {
                    if (Intrinsics.LJFF(str2.substring(1), str) || u.LJIIZILJ(str, str2, false)) {
                        return true;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('.');
                    sbLIZ.append(str2);
                    if (u.LJIIZILJ(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LIZJ(Uri uri, List<String> list) {
        String strLIZ;
        if (((!Intrinsics.LJFF(uri.getScheme(), "http")) && (!Intrinsics.LJFF(uri.getScheme(), "https"))) || (strLIZ = LIZ(uri)) == null || strLIZ.length() == 0) {
            return false;
        }
        return LIZIZ(strLIZ, list);
    }
}

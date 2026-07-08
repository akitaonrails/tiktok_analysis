package X;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0kp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334150kp3 {
    public static final EnumC1334180kp6 LIZ;

    static {
        LIZ = C1743690vTb.LIZIZ() >= 1440 ? EnumC1334180kp6.HIGH : C1743690vTb.LIZIZ() <= 720 ? EnumC1334180kp6.LOW : EnumC1334180kp6.MID;
    }

    public static final String LIZIZ(Uri uri) {
        LruCache<String, C20155613ti> lruCache = C20155613ti.LJIIL;
        if (C1326230kcH.LJIILL(uri.getHost())) {
            C20155613ti c20155613ti = C20155613ti.LJIIL.get(uri.toString());
            if (c20155613ti != null) {
                return c20155613ti.LJIIJJI;
            }
        }
        return C1334160kp4.LIZ(uri.toString());
    }

    public static final String LIZJ(String str) {
        if (!C770702zh.LIZIZ(str)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[PHI: r4
      0x0059: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v4 java.lang.String) binds: [B:6:0x0020, B:11:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1334140kp2 LIZLLL(android.net.Uri r15) {
        /*
            r9 = 0
            if (r15 != 0) goto L4
            return r9
        L4:
            java.lang.String r6 = r15.toString()
            java.lang.String r0 = "ec_biz_cls"
            r11 = 0
            java.lang.String r0 = LIZ(r15, r6, r0, r11)
            java.lang.String r3 = LIZJ(r0)
            java.lang.String r0 = "ec_biz_scene"
            r7 = 1
            java.lang.String r0 = LIZ(r15, r6, r0, r7)
            java.lang.String r4 = LIZJ(r0)
            java.lang.String r5 = "page_name"
            if (r4 != 0) goto L59
            java.lang.String r0 = LIZ(r15, r6, r5, r11)
            java.lang.String r2 = LIZJ(r0)
            java.lang.String r0 = "module"
            java.lang.String r0 = LIZ(r15, r6, r0, r11)
            java.lang.String r4 = LIZJ(r0)
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            r1[r11] = r2
            r1[r7] = r4
            r0 = 2
            r1[r0] = r3
            java.util.List r7 = X.C13LQ.LJIJI(r1)
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L56
            java.lang.String r8 = "__"
            r14 = 62
            r10 = r9
            r12 = r9
            r13 = r9
            java.lang.String r9 = X.C13LP.LJJLIIIJ(r7, r8, r9, r10, r11, r12, r13, r14)
        L56:
            r4 = r9
            if (r2 != 0) goto L73
        L59:
            java.lang.String r2 = LIZ(r15, r6, r5, r11)
            if (r2 != 0) goto L73
            boolean r0 = X.C770702zh.LIZIZ(r4)
            if (r0 == 0) goto L73
            java.lang.String r1 = "__"
            r0 = 6
            int r1 = kotlin.text.a0.LJJJ(r4, r1, r11, r11, r0)
            r0 = -1
            if (r1 == r0) goto L73
            java.lang.String r2 = r4.substring(r11, r1)
        L73:
            X.0kp2 r0 = new X.0kp2
            r0.<init>(r4, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1334150kp3.LIZLLL(android.net.Uri):X.0kp2");
    }

    public static final String LJ(Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        String strLIZJ = LIZJ(LJFF(uri, string, "ec_biz_scene"));
        if (strLIZJ == null) {
            List listLJIJI = C13LQ.LJIJI(new String[]{LIZJ(LJFF(uri, string, "page_name")), LIZJ(LJFF(uri, string, "module")), LIZJ(LJFF(uri, string, "ec_biz_cls"))});
            if (((ArrayList) listLJIJI).isEmpty()) {
                return null;
            }
            return C13LP.LJJLIIIJ(listLJIJI, "__", null, null, 0, null, null, 62);
        }
        return strLIZJ;
    }

    public static final String LJI(Uri uri) {
        String string;
        String string2;
        if (uri == null) {
            return null;
        }
        String string3 = uri.toString();
        Object objLIZ = C1066210dqt.LIZ(string3, "page_name");
        if (objLIZ == null || (string2 = objLIZ.toString()) == null) {
            String strLIZ = C1946707jt.LIZ(uri, "page_name");
            if (strLIZ == null) {
                Object objLIZ2 = C1066210dqt.LIZ(string3, "ec_biz_scene");
                if (objLIZ2 == null || (string = objLIZ2.toString()) == null) {
                    return C1946707jt.LIZ(uri, "ec_biz_scene");
                }
                return string;
            }
            return strLIZ;
        }
        return string2;
    }

    public static final String LJFF(Uri uri, String str, String str2) {
        String string;
        Object objLIZ = C1066210dqt.LIZ(str, str2);
        if (objLIZ == null || (string = objLIZ.toString()) == null) {
            return C1946707jt.LIZ(uri, str2);
        }
        return string;
    }

    public static final String LIZ(Uri uri, String str, String str2, boolean z) {
        boolean z2;
        String encodedQuery;
        String string;
        Object objLIZ = C1066210dqt.LIZ(str, str2);
        if (objLIZ == null || (string = objLIZ.toString()) == null) {
            if (z && uri != null && !uri.isOpaque()) {
                if (str2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && (encodedQuery = uri.getEncodedQuery()) != null) {
                    String strEncode = Uri.encode(str2);
                    int length = encodedQuery.length();
                    int length2 = 0;
                    while (length2 < length) {
                        int iLJJJ = a0.LJJJ(encodedQuery, strEncode, length2, false, 4);
                        if (iLJJJ == -1) {
                            break;
                        }
                        length2 = iLJJJ + strEncode.length();
                        if (length2 == length || encodedQuery.charAt(length2) == '=' || encodedQuery.charAt(length2) == '&') {
                            if (length2 < length && encodedQuery.charAt(length2) == '=') {
                                int i = length2 + 1;
                                int iLJJIZ = a0.LJJIZ(encodedQuery, '&', i, false, 4);
                                if (iLJJIZ != -1) {
                                    length = iLJJIZ;
                                }
                                String strSubstring = encodedQuery.substring(i, length);
                                try {
                                    strSubstring = Uri.decode(strSubstring);
                                    return strSubstring;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return strSubstring;
                                }
                            }
                            return "";
                        }
                    }
                }
            }
            return null;
        }
        return string;
    }
}

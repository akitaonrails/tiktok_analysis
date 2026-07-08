package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0kp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334160kp4 {
    public static String LIZ(String str) {
        int iLJJJJ;
        int iLJJJ = a0.LJJJ(str, "~tplv-", 0, false, 6);
        if (iLJJJ <= 0 || (iLJJJJ = a0.LJJJJ(str, '/', iLJJJ - 1, 4)) == -1) {
            return "";
        }
        String strSubstring = str.substring(iLJJJJ + 1, iLJJJ);
        if (a0.LJJJIL(strSubstring)) {
            return "";
        }
        return strSubstring;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20155613ti LIZIZ(android.net.Uri r5) {
        /*
            java.lang.String r0 = r5.getHost()
            boolean r0 = X.C1326230kcH.LJIILL(r0)
            r4 = 0
            if (r0 != 0) goto Lc
            return r4
        Lc:
            java.lang.String r3 = r5.toString()
            android.util.LruCache<java.lang.String, X.13ti> r1 = X.C20155613ti.LJIIL
            java.lang.Object r2 = r1.get(r3)
            X.13ti r2 = (X.C20155613ti) r2
            if (r2 == 0) goto L4f
            X.0kp2 r0 = r2.LJIIIZ
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.LIZIZ
            if (r0 == 0) goto L44
            android.net.Uri r1 = r2.LIZ
            X.0kp6 r0 = X.C1334150kp3.LIZ
            if (r1 == 0) goto L4d
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "page_name"
            java.lang.Object r0 = X.C1066210dqt.LIZ(r1, r0)
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.toString()
        L38:
            X.0kp2 r0 = r2.LJIIIZ
            if (r0 == 0) goto L3e
            java.lang.String r4 = r0.LIZIZ
        L3e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r4)
            if (r0 != 0) goto L4c
        L44:
            android.net.Uri r0 = r2.LIZ
            X.0kp2 r0 = X.C1334150kp3.LIZLLL(r0)
            r2.LJIIIZ = r0
        L4c:
            return r2
        L4d:
            r1 = r4
            goto L38
        L4f:
            X.13tj r0 = new X.13tj
            r0.<init>(r5)
            X.13ti r0 = r0.LIZ()
            if (r0 == 0) goto L5e
            r1.put(r3, r0)
            return r0
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1334160kp4.LIZIZ(android.net.Uri):X.13ti");
    }
}

package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431800nMY {
    public static void LIZIZ(String str, Function1 function1) {
        if (str != null && str.length() != 0) {
            C1331660kl2.LJII(new C0VSJ(str)).LJJII(new C1769706wR(function1, 0));
        } else {
            function1.invoke(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[PHI: r1
      0x0022: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:11:0x0020, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.app.Activity r4, boolean r5, int r6) {
        /*
            int r3 = X.C300650BqR.LIZIZ
            r0 = 1
            if (r6 <= r3) goto L2e
            r2 = 0
            if (r5 != 0) goto L9
            return r2
        L9:
            if (r4 == 0) goto L1e
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r0 = r3 / 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            r0 = 2131836998(0x7f114046, float:1.9307179E38)
            java.lang.String r1 = r4.getString(r0, r1)
            if (r1 != 0) goto L22
        L1e:
            java.lang.String r1 = ""
            if (r4 == 0) goto L2d
        L22:
            X.0mGx r0 = new X.0mGx
            r0.<init>(r4)
            r0.LJIIJ(r1)
            r0.LJIIJJI()
        L2d:
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1431800nMY.LIZ(android.app.Activity, boolean, int):boolean");
    }
}

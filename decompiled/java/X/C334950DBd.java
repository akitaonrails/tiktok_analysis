package X;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: X.0DBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C334950DBd {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r8) {
        /*
            r4 = 46
            r7 = 0
            r2 = 6
            int r1 = kotlin.text.a0.LJJJJ(r8, r4, r7, r2)
            r0 = 44
            int r0 = kotlin.text.a0.LJJJJ(r8, r0, r7, r2)
            int r6 = java.lang.Math.max(r1, r0)
            r5 = 1
            r0 = -1
            if (r6 == r0) goto L7e
            int r0 = r6 + 1
            java.lang.String r3 = r8.substring(r0)
            int r2 = r3.length()
            r1 = 0
        L21:
            if (r1 >= r2) goto L31
            char r0 = r3.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L7b
            java.lang.String r3 = r3.substring(r7, r1)
        L31:
            int r1 = r3.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r7.intValue()
            if (r5 > r1) goto L7e
            r0 = 3
            if (r1 >= r0) goto L7e
        L41:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r5 = 0
            r3 = 0
        L48:
            int r0 = r8.length()
            if (r5 >= r0) goto L80
            char r2 = r8.charAt(r5)
            int r1 = r3 + 1
            boolean r0 = java.lang.Character.isDigit(r2)
            if (r0 == 0) goto L61
            r6.append(r2)
        L5d:
            int r5 = r5 + 1
            r3 = r1
            goto L48
        L61:
            if (r7 == 0) goto L6d
            int r0 = r7.intValue()
            if (r3 != r0) goto L6d
            r6.append(r4)
            goto L5d
        L6d:
            r0 = 45
            if (r2 != r0) goto L5d
            int r0 = r6.length()
            if (r0 != 0) goto L5d
            r6.append(r2)
            goto L5d
        L7b:
            int r1 = r1 + 1
            goto L21
        L7e:
            r7 = 0
            goto L41
        L80:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334950DBd.LIZIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Double LIZJ(java.lang.String r4) {
        /*
            r3 = 1
            if (r4 == 0) goto Le
            boolean r0 = kotlin.text.a0.LJJJIL(r4)
            if (r0 != 0) goto Le
            r0 = 0
        La:
            r2 = 0
            if (r0 != 0) goto L28
            goto L10
        Le:
            r0 = 1
            goto La
        L10:
            java.lang.String r1 = LIZIZ(r4)     // Catch: java.lang.Exception -> L24
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Exception -> L24
            r3 = r3 ^ r0
            if (r3 != 0) goto L1c
            r1 = r2
        L1c:
            if (r1 == 0) goto L28
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch: java.lang.Exception -> L24
            r0.<init>(r1)     // Catch: java.lang.Exception -> L24
            goto L29
        L24:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L33
            double r0 = r0.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L33:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334950DBd.LIZJ(java.lang.String):java.lang.Double");
    }

    public static C0D38 LIZ(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str) {
        if (bigDecimal != null && bigDecimal2 != null) {
            if (bigDecimal.compareTo(BigDecimal.ZERO) > 0 && bigDecimal2.compareTo(BigDecimal.ZERO) >= 0 && bigDecimal.compareTo(bigDecimal2) > 0) {
                int i = C2273431Dyf.LIZLLL(str).LIZLLL;
                if (bigDecimal.setScale(i, RoundingMode.HALF_UP).compareTo(bigDecimal2.setScale(i, RoundingMode.HALF_UP)) == 0) {
                    return new C0D38(null, null);
                }
                int iIntValue = bigDecimal.subtract(bigDecimal2).multiply(new BigDecimal("100")).divide(bigDecimal, 0, RoundingMode.DOWN).intValue();
                if (iIntValue <= 0) {
                    return new C0D38(null, null);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('-');
                sbLIZ.append(iIntValue);
                sbLIZ.append('%');
                return new C0D38(bigDecimal, C2188811AlT.LIZIZ(sbLIZ));
            }
            return new C0D38(null, null);
        }
        return new C0D38(null, null);
    }

    public static C0D38 LIZLLL(Double d, Double d2, String str) {
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2 = null;
        if (d != null) {
            bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
        } else {
            bigDecimalValueOf = null;
        }
        if (d2 != null) {
            bigDecimalValueOf2 = BigDecimal.valueOf(d2.doubleValue());
        }
        return LIZ(bigDecimalValueOf, bigDecimalValueOf2, str);
    }
}

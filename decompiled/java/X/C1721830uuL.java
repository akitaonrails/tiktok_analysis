package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.math.BigDecimal;

/* JADX INFO: renamed from: X.0uuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721830uuL {
    public static final /* synthetic */ int LIZ = 0;

    public static BigDecimal LIZJ(String str) {
        try {
            if (str == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            return new BigDecimal(str);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return BigDecimal.ZERO;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r8, defpackage.CurrencyFormat r9, java.lang.Integer r10, boolean r11, int r12) {
        /*
            java.util.Locale r4 = new java.util.Locale
            X.0uhY r0 = X.C1717770unn.LIZLLL()
            java.lang.String r1 = r0.getAppLanguage()
            X.0uv9 r0 = X.C1717770unn.LJIIIIZZ()
            java.lang.String r0 = r0.getCurrentRegionCode()
            r4.<init>(r1, r0)
            r7 = 0
            if (r10 == 0) goto L65
            int r3 = r10.intValue()
        L1c:
            int r5 = X.C13LZ.LJ(r12, r7, r3)
            if (r9 == 0) goto L94
            java.text.DecimalFormat r6 = new java.text.DecimalFormat
            java.lang.String r0 = "#,###"
            r6.<init>(r0)
            java.text.DecimalFormatSymbols r1 = new java.text.DecimalFormatSymbols
            r1.<init>()
            java.lang.String r0 = r9.groupingSeparator
            if (r0 == 0) goto L62
            java.lang.Character r0 = X.C13LN.LJLLILLLL(r0)
            if (r0 == 0) goto L62
            char r0 = r0.charValue()
        L3c:
            r1.setGroupingSeparator(r0)
            java.lang.String r0 = r9.decimalSeparator
            if (r0 == 0) goto L5f
            java.lang.Character r0 = X.C13LN.LJLLILLLL(r0)
            if (r0 == 0) goto L5f
            char r0 = r0.charValue()
        L4d:
            r1.setDecimalSeparator(r0)
            r6.setDecimalSeparatorAlwaysShown(r11)
            r6.setDecimalFormatSymbols(r1)
            r6.setMinimumFractionDigits(r5)
            r6.setMaximumFractionDigits(r3)
            java.lang.String r0 = r9.decimalSeparator
            goto L67
        L5f:
            r0 = 46
            goto L4d
        L62:
            r0 = 44
            goto L3c
        L65:
            r3 = 0
            goto L1c
        L67:
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L88
            if (r8 == 0) goto L82
            java.lang.String r1 = "."
            if (r0 == 0) goto L7b
            java.lang.Character r0 = X.C13LN.LJLLILLLL(r0)     // Catch: java.lang.NumberFormatException -> L88
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L88
            if (r0 != 0) goto L7c
        L7b:
            r0 = r1
        L7c:
            java.lang.String r0 = kotlin.text.u.LJJIFFI(r8, r0, r1, r7)     // Catch: java.lang.NumberFormatException -> L88
            if (r0 != 0) goto L84
        L82:
            java.lang.String r0 = "0"
        L84:
            r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L88
            goto L8e
        L88:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
        L8e:
            java.lang.String r0 = r6.format(r2)
            if (r0 != 0) goto Lb0
        L94:
            java.text.NumberFormat r1 = java.text.NumberFormat.getInstance(r4)
            r1.setMinimumFractionDigits(r5)
            r1.setMaximumFractionDigits(r3)
            boolean r0 = r1 instanceof java.text.DecimalFormat
            if (r0 == 0) goto La8
            r0 = r1
            java.text.DecimalFormat r0 = (java.text.DecimalFormat) r0
            r0.setDecimalSeparatorAlwaysShown(r11)
        La8:
            java.math.BigDecimal r0 = LIZJ(r8)
            java.lang.String r0 = r1.format(r0)
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1721830uuL.LIZ(java.lang.String, CurrencyFormat, java.lang.Integer, boolean, int):java.lang.String");
    }
}

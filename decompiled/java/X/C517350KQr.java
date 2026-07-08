package X;

import com.bytedance.android.livesdk.iap.AbsIapPricing;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0KQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517350KQr {
    public static final C517350KQr LIZ = new C517350KQr();

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(java.lang.String r6) {
        /*
            X.0KQs r2 = X.C517370KQt.LIZ(r6)
            java.lang.String r0 = r2.LIZIZ
            int r0 = r0.length()
            r1 = 1
            r6 = 0
            if (r0 != 0) goto L1a
            r0 = 1
        Lf:
            r5 = 0
            if (r0 == 0) goto L1c
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = ""
            r1.<init>(r0, r5)
            return r1
        L1a:
            r0 = 0
            goto Lf
        L1c:
            java.lang.String r4 = r2.LIZ
            java.lang.String r3 = r2.LIZIZ
            int r0 = r3.length()
            if (r0 == 0) goto L53
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.NumberFormat r2 = java.text.NumberFormat.getInstance(r0)
            boolean r0 = r2 instanceof java.text.DecimalFormat
            if (r0 == 0) goto L59
            java.text.DecimalFormat r2 = (java.text.DecimalFormat) r2
            if (r2 == 0) goto L59
            r2.setParseBigDecimal(r1)
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r1.<init>(r6)
            java.lang.Number r2 = r2.parse(r3, r1)
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L59
            if (r2 == 0) goto L59
            int r1 = r1.getIndex()
            int r0 = r3.length()
            if (r1 != r0) goto L59
            r5 = r2
        L53:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r4, r5)
            return r0
        L59:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch: java.lang.Throwable -> L62
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L62
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L62
            goto L6e
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L6e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L53
            r5 = r1
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C517350KQr.LIZIZ(java.lang.String):kotlin.Pair");
    }

    public static Pair LIZ(boolean z, List list, int i, boolean z2) {
        boolean z3;
        Object objLJJLIIIJL;
        String str;
        Long lValueOf;
        DecimalFormat decimalFormat;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        String str2 = null;
        if (z3) {
            return new Pair(null, null);
        }
        if (z2) {
            objLJJLIIIJL = C13LP.LJJJLL(list);
        } else {
            objLJJLIIIJL = C13LP.LJJLIIIJL(list);
        }
        AbsIapPricing absIapPricing = (AbsIapPricing) objLJJLIIIJL;
        if (absIapPricing != null) {
            str = absIapPricing.price;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (absIapPricing != null) {
            lValueOf = Long.valueOf(absIapPricing.priceAmountMicros);
        } else {
            lValueOf = null;
        }
        if (!z) {
            i = 1;
        }
        C517360KQs c517360KQsLIZ = C517370KQt.LIZ(str);
        Object first = new Pair(c517360KQsLIZ.LIZ, Boolean.valueOf(c517360KQsLIZ.LIZJ)).getFirst();
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue() / ((long) i);
            LIZ.getClass();
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
            if (!(numberFormat instanceof DecimalFormat) || (decimalFormat = (DecimalFormat) numberFormat) == null) {
                str2 = "";
            } else {
                decimalFormat.setParseBigDecimal(true);
                decimalFormat.setGroupingUsed(true);
                BigDecimal bigDecimal = new BigDecimal(jLongValue);
                BigDecimal bigDecimal2 = new BigDecimal(1000000L);
                if (bigDecimal.remainder(bigDecimal2).compareTo(BigDecimal.ZERO) != 0) {
                    i2 = 2;
                }
                str2 = decimalFormat.format(new BigDecimal(jLongValue).divide(bigDecimal2, 2, RoundingMode.HALF_UP).setScale(i2));
            }
        }
        return new Pair(first, str2);
    }
}

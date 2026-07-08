package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS7S0002000_7;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0KDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513890KDj {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(296));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(295));

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Locale LJ() {
        /*
            android.content.Context r0 = X.C511520K4g.LIZJ()
            android.content.res.Resources r2 = r0.getResources()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L28
            if (r2 == 0) goto L23
            android.content.res.Configuration r0 = r2.getConfiguration()
            if (r0 == 0) goto L23
            android.os.LocaleList r1 = r0.getLocales()
            if (r1 == 0) goto L23
            r0 = 0
            java.util.Locale r0 = r1.get(r0)
        L21:
            if (r0 != 0) goto L27
        L23:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L27:
            return r0
        L28:
            if (r2 == 0) goto L23
            android.content.res.Configuration r0 = r2.getConfiguration()
            if (r0 == 0) goto L23
            java.util.Locale r0 = r0.locale
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513890KDj.LJ():java.util.Locale");
    }

    public static int LIZIZ(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            IntRange intRange = new IntRange(0, 9);
            Integer numLIZ = C1244080iTm.LIZ(cCharAt);
            if (numLIZ != null && intRange.LJLJL(numLIZ.intValue())) {
                return i;
            }
        }
        return -1;
    }

    public static int LIZJ(String str) {
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = str.charAt(length);
                IntRange intRange = new IntRange(0, 9);
                Integer numLIZ = C1244080iTm.LIZ(cCharAt);
                if (numLIZ != null && intRange.LJLJL(numLIZ.intValue())) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0050 A[PHI: r0
      0x0050: PHI (r0v9 java.lang.String) = (r0v7 java.lang.String), (r0v11 java.lang.String) binds: [B:29:0x0048, B:18:0x0025] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo r5) {
        /*
            r1 = 0
            if (r5 == 0) goto Ld
            com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetail r0 = r5.getSubscriptionProductDetail()
            if (r0 == 0) goto Ld
            java.util.List r1 = r0.getPricePhaseList()
        Ld:
            r4 = 1
            if (r1 == 0) goto L4e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4e
            r0 = 0
        L17:
            java.lang.String r3 = ""
            if (r0 == 0) goto L28
            if (r5 == 0) goto L27
            webcast.api.sub.TemplateInfo r0 = r5.getTemplateInfo()
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.moneyDisplay
            if (r0 != 0) goto L50
        L27:
            return r3
        L28:
            java.lang.Object r0 = X.C13LP.LJJLIIIJL(r1)
            com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetail$PricePhase r0 = (com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetail.PricePhase) r0
            if (r0 == 0) goto L27
            r0.getPrice()
            java.lang.String r2 = r0.getPrice()
            if (r2 != 0) goto L3a
            r2 = r3
        L3a:
            java.lang.Long r0 = r0.getPriceAmountMicros()
            if (r0 == 0) goto L4b
            long r0 = r0.longValue()
        L44:
            java.lang.String r0 = LJFF(r4, r0, r2)
            if (r0 != 0) goto L50
            return r3
        L4b:
            r0 = 0
            goto L44
        L4e:
            r0 = 1
            goto L17
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513890KDj.LJI(com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo):java.lang.String");
    }

    public static Pair LJIIIIZZ(String str) {
        int iLIZIZ = LIZIZ(str);
        int iLIZJ = LIZJ(str);
        if (iLIZIZ == -1) {
            return new Pair("", Boolean.FALSE);
        }
        if (iLIZIZ == 0) {
            return new Pair(str.substring(iLIZJ + 1), Boolean.TRUE);
        }
        return new Pair(str.substring(0, iLIZIZ), Boolean.FALSE);
    }

    public static String LIZLLL(BigDecimal bigDecimal, Locale locale) {
        DecimalFormat decimalFormat;
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        if ((numberFormat instanceof DecimalFormat) && (decimalFormat = (DecimalFormat) numberFormat) != null) {
            decimalFormat.setParseBigDecimal(true);
            decimalFormat.setMinimumFractionDigits(bigDecimal.scale());
            String str = decimalFormat.format(bigDecimal);
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public static CharSequence LIZ(View view, String str, boolean z) {
        return C510740K1g.LIZ(str, 61, new AwS7S0002000_7(str.length(), C426930God.LIZIZ(R.attr.f_f, view), 1));
    }

    public static String LJFF(int i, long j, String str) {
        String str2;
        DecimalFormat decimalFormat;
        int i2;
        Pair pairLJIIIIZZ = LJIIIIZZ(str);
        String str3 = (String) pairLJIIIIZZ.getFirst();
        boolean zBooleanValue = ((Boolean) pairLJIIIIZZ.getSecond()).booleanValue();
        long j2 = j / ((long) i);
        NumberFormat numberFormat = NumberFormat.getInstance(LJ());
        if ((numberFormat instanceof DecimalFormat) && (decimalFormat = (DecimalFormat) numberFormat) != null) {
            decimalFormat.setParseBigDecimal(true);
            decimalFormat.setGroupingUsed(true);
            if (new BigDecimal(j2).remainder(new BigDecimal(1000000)).compareTo(BigDecimal.ZERO) == 0) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            str2 = decimalFormat.format(new BigDecimal(j2).divide(new BigDecimal(1000000), 2, RoundingMode.HALF_UP).setScale(i2));
        } else {
            str2 = "";
        }
        if (zBooleanValue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append(str3);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str3);
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static BigDecimal LJII(String str, Locale locale, Locale locale2) {
        String strSubstring;
        DecimalFormat decimalFormat;
        DecimalFormat decimalFormat2;
        BigDecimal bigDecimal;
        int iLIZIZ = LIZIZ(str);
        if (iLIZIZ == -1) {
            strSubstring = "";
        } else {
            strSubstring = str.substring(iLIZIZ, LIZJ(str) + 1);
        }
        NumberFormat numberFormat = NumberFormat.getInstance(locale2);
        BigDecimal bigDecimal2 = null;
        if (numberFormat instanceof DecimalFormat) {
            decimalFormat = (DecimalFormat) numberFormat;
        } else {
            decimalFormat = null;
        }
        if (decimalFormat == null) {
            return BigDecimal.ZERO;
        }
        NumberFormat numberFormat2 = NumberFormat.getInstance(locale);
        if (numberFormat2 instanceof DecimalFormat) {
            decimalFormat2 = (DecimalFormat) numberFormat2;
        } else {
            decimalFormat2 = null;
        }
        if (decimalFormat2 == null) {
            return BigDecimal.ZERO;
        }
        decimalFormat.setParseBigDecimal(true);
        decimalFormat2.setParseBigDecimal(true);
        try {
            Object object = decimalFormat2.parseObject(strSubstring);
            if (object instanceof BigDecimal) {
                bigDecimal = (BigDecimal) object;
            } else {
                bigDecimal = null;
            }
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            Object object2 = decimalFormat.parseObject(strSubstring);
            if (object2 instanceof BigDecimal) {
                bigDecimal2 = (BigDecimal) object2;
            }
            if (bigDecimal2 == null) {
                bigDecimal2 = BigDecimal.ZERO;
            }
            String str2 = decimalFormat2.format(bigDecimal);
            String str3 = decimalFormat.format(bigDecimal2);
            int i = 0;
            for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                if (Character.isDigit(strSubstring.charAt(i2))) {
                    i++;
                }
            }
            int i3 = 0;
            for (int i4 = 0; i4 < str2.length(); i4++) {
                if (Character.isDigit(str2.charAt(i4))) {
                    i3++;
                }
            }
            int i5 = 0;
            for (int i6 = 0; i6 < str3.length(); i6++) {
                if (Character.isDigit(str3.charAt(i6))) {
                    i5++;
                }
            }
            if (i3 <= i5) {
                bigDecimal = bigDecimal2;
            }
            int iMax = Math.max(i3, i5);
            if (i <= iMax) {
                return bigDecimal;
            }
            return bigDecimal.setScale(i - iMax);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return BigDecimal.ZERO;
        }
    }
}

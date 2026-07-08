package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0KDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513900KDk {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1839700xyS());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1839710xyT());

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Locale LJ() {
        /*
            android.content.res.Resources r2 = X.C497740JfY.LJIILJJIL()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L24
            if (r2 == 0) goto L1f
            android.content.res.Configuration r0 = r2.getConfiguration()
            if (r0 == 0) goto L1f
            android.os.LocaleList r1 = r0.getLocales()
            if (r1 == 0) goto L1f
            r0 = 0
            java.util.Locale r0 = r1.get(r0)
        L1d:
            if (r0 != 0) goto L23
        L1f:
            java.util.Locale r0 = java.util.Locale.getDefault()
        L23:
            return r0
        L24:
            if (r2 == 0) goto L1f
            android.content.res.Configuration r0 = r2.getConfiguration()
            if (r0 == 0) goto L1f
            java.util.Locale r0 = r0.locale
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513900KDk.LJ():java.util.Locale");
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

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[PHI: r0
      0x0047: PHI (r0v9 java.lang.String) = (r0v7 java.lang.String), (r0v11 java.lang.String) binds: [B:29:0x003f, B:18:0x0023] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJI(com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo r5) {
        /*
            r1 = 0
            if (r5 == 0) goto Lb
            com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail r0 = r5.getSubscriptionProductDetail()
            if (r0 == 0) goto Lb
            java.util.List<com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail$PricePhase> r1 = r0.pricePhaseList
        Lb:
            r4 = 1
            if (r1 == 0) goto L45
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L45
            r0 = 0
        L15:
            java.lang.String r3 = ""
            if (r0 == 0) goto L26
            if (r5 == 0) goto L25
            webcast.api.sub.TemplateInfo r0 = r5.getTemplateInfo()
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.moneyDisplay
            if (r0 != 0) goto L47
        L25:
            return r3
        L26:
            java.lang.Object r0 = X.C13LP.LJJLIIIJL(r1)
            com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail$PricePhase r0 = (com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetail.PricePhase) r0
            if (r0 == 0) goto L25
            java.lang.String r2 = r0.price
            if (r2 != 0) goto L33
            r2 = r3
        L33:
            java.lang.Long r0 = r0.priceAmountMicros
            if (r0 == 0) goto L42
            long r0 = r0.longValue()
        L3b:
            java.lang.String r0 = LJFF(r4, r0, r2)
            if (r0 != 0) goto L47
            return r3
        L42:
            r0 = 0
            goto L3b
        L45:
            r0 = 1
            goto L15
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C513900KDk.LJI(com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo):java.lang.String");
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

    public static SpannableStringBuilder LIZ(C16F5 c16f5, String str, boolean z) {
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new StrikethroughSpan(), 0, length, 34);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ewy, c16f5.getContext())), 0, length, 34);
        C1119920fFW.LJ(c16f5.getContext(), spannableStringBuilder, 0, length, 34, 8, 400);
        return spannableStringBuilder;
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
        BigDecimal scale;
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
            if (i3 > i5) {
                scale = bigDecimal;
            } else {
                scale = bigDecimal2;
            }
            int iMax = Math.max(i3, i5);
            if (i > iMax) {
                scale = scale.setScale(i - iMax);
            }
            C20441214yg.LIZIZ("PriceUtil", "input=" + strSubstring + " locale=" + locale + " origLocale=" + locale2 + " decimal=" + bigDecimal + " origDecimal=" + bigDecimal2 + " middle=" + str2 + " origMiddle=" + str3 + " inputCount=" + i + " middleCount=" + i3 + " origMiddleCount=" + i5 + " bigger=" + scale + " biggerCount=" + iMax);
            return scale;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return BigDecimal.ZERO;
        }
    }
}

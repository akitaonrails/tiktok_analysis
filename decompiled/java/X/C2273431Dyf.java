package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Dyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273431Dyf {
    public static final C0D4J LIZ;
    public static final Map<String, C0D4J> LIZIZ;

    static {
        Locale locale = Locale.US;
        C0D4M c0d4m = C0D4M.PREFIX;
        LIZ = new C0D4J("USD", locale, 2, c0d4m, true);
        Locale locale2 = Locale.GERMANY;
        C0D4M c0d4m2 = C0D4M.SUFFIX;
        LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("USD", new C0D4J(e3.c, locale, 2, c0d4m, false)), new Pair("CNY", new C0D4J("¥", Locale.CHINA, 2, c0d4m, false)), new Pair("EUR", new C0D4J("€", locale2, 2, c0d4m2, true)), new Pair("GBP", new C0D4J("£", Locale.UK, 2, c0d4m, false)), new Pair("JPY", new C0D4J("¥", Locale.JAPAN, 0, c0d4m, false)), new Pair("KRW", new C0D4J("₩", Locale.KOREA, 0, c0d4m, false)), new Pair("INR", new C0D4J("₹", new Locale("en", "IN"), 2, c0d4m, false)), new Pair("RUB", new C0D4J("₽", new Locale("ru", "RU"), 2, c0d4m2, true)), new Pair("BRL", new C0D4J("R$", new Locale("pt", "BR"), 2, c0d4m, true)), new Pair("CAD", new C0D4J("C$", Locale.CANADA, 2, c0d4m, false)), new Pair("AUD", new C0D4J("A$", new Locale("en", "AU"), 2, c0d4m, false)), new Pair("CHF", new C0D4J("CHF", new Locale("de", "CH"), 2, c0d4m, true)), new Pair("THB", new C0D4J("฿", new Locale("th", "TH"), 2, c0d4m, false)), new Pair("VND", new C0D4J("₫", new Locale("vi", "VN"), 0, c0d4m2, true)), new Pair("IDR", new C0D4J("Rp", new Locale(FollowStatusChangeMethod.PARAM_UID, "ID"), 0, c0d4m, true)), new Pair("SAR", new C0D4J("SAR", locale, 2, c0d4m2, true)), new Pair("TRY", new C0D4J("₺", new Locale("tr", "TR"), 2, c0d4m, false)), new Pair("HKD", new C0D4J("HK$", new Locale("en", "HK"), 2, c0d4m, false)), new Pair("TWD", new C0D4J("NT$", Locale.TAIWAN, 0, c0d4m, false)), new Pair("SGD", new C0D4J("S$", new Locale("en", "SG"), 2, c0d4m, false)));
    }

    public static C0D4J LIZ(String str) {
        String upperCase = a0.LJLIIIL(str).toString().toUpperCase(Locale.US);
        if (upperCase.length() == 0) {
            return (C0D4J) C2097608Jq.LJFF("USD", LIZIZ);
        }
        C0D4J c0d4j = LIZIZ.get(upperCase);
        if (c0d4j == null) {
            C0D4J c0d4j2 = LIZ;
            return new C0D4J(upperCase, c0d4j2.LIZIZ, c0d4j2.LIZJ, c0d4j2.LIZLLL, c0d4j2.LJ);
        }
        return c0d4j;
    }

    public static C0D4I LIZLLL(String str) {
        int i;
        C0D4J c0d4jLIZ = LIZ(str);
        String str2 = c0d4jLIZ.LIZ;
        if (c0d4jLIZ.LIZLLL == C0D4M.PREFIX) {
            i = 0;
        } else {
            i = 1;
        }
        return new C0D4I(str2, i, c0d4jLIZ.LJ, c0d4jLIZ.LIZJ, c0d4jLIZ.LIZIZ);
    }

    public static String LIZIZ(BigDecimal bigDecimal, String str) {
        String str2;
        String strLIZIZ;
        C0D4J c0d4jLIZ = LIZ(str);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(c0d4jLIZ.LIZIZ);
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setMinimumFractionDigits(c0d4jLIZ.LIZJ);
        decimalFormat.setMaximumFractionDigits(c0d4jLIZ.LIZJ);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str3 = decimalFormat.format(bigDecimal.abs());
        if (c0d4jLIZ.LJ) {
            str2 = " ";
        } else {
            str2 = "";
        }
        int i = C0D4L.LIZ[c0d4jLIZ.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
                sbLIZ.append(str2);
                sbLIZ.append(c0d4jLIZ.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                throw new C1954807lC();
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0d4jLIZ.LIZ);
            sbLIZ2.append(str2);
            sbLIZ2.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (bigDecimal.signum() < 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('-');
            sbLIZ3.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return strLIZIZ;
    }

    public static String LIZJ(double d, String str) {
        C0D4J c0d4jLIZ = LIZ(str);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(c0d4jLIZ.LIZIZ);
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setMinimumFractionDigits(c0d4jLIZ.LIZJ);
        decimalFormat.setMaximumFractionDigits(c0d4jLIZ.LIZJ);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(BigDecimal.valueOf(d));
    }
}

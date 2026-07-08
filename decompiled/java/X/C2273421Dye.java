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

/* JADX INFO: renamed from: X.1Dye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273421Dye {
    public static final Map<String, C0D4U> LIZ;

    static {
        new BigDecimal(100);
        Locale locale = Locale.US;
        LIZ = C2097608Jq.LJIIIIZZ(new Pair("USD", new C0D4U(e3.c, locale, 0, false)), new Pair("CNY", new C0D4U("¥", Locale.CHINA, 0, false)), new Pair("EUR", new C0D4U("€", Locale.GERMANY, 1, true)), new Pair("GBP", new C0D4U("£", Locale.UK, 0, false)), new Pair("JPY", new C0D4U("¥", Locale.JAPAN, 0, false)), new Pair("KRW", new C0D4U("₩", Locale.KOREA, 0, false)), new Pair("INR", new C0D4U("₹", new Locale("en", "IN"), 0, false)), new Pair("RUB", new C0D4U("₽", new Locale("ru", "RU"), 1, true)), new Pair("BRL", new C0D4U("R$", new Locale("pt", "BR"), 0, true)), new Pair("CAD", new C0D4U("C$", Locale.CANADA, 0, false)), new Pair("AUD", new C0D4U("A$", new Locale("en", "AU"), 0, false)), new Pair("CHF", new C0D4U("CHF", new Locale("de", "CH"), 0, true)), new Pair("THB", new C0D4U("฿", new Locale("th", "TH"), 0, false)), new Pair("VND", new C0D4U("₫", new Locale("vi", "VN"), 1, true)), new Pair("IDR", new C0D4U("Rp", new Locale(FollowStatusChangeMethod.PARAM_UID, "ID"), 0, true)), new Pair("SAR", new C0D4U("SAR", locale, 1, true)), new Pair("TRY", new C0D4U("₺", new Locale("tr", "TR"), 0, false)), new Pair("HKD", new C0D4U("HK$", new Locale("en", "HK"), 0, false)), new Pair("TWD", new C0D4U("NT$", Locale.TAIWAN, 0, false)), new Pair("SGD", new C0D4U("S$", new Locale("en", "SG"), 0, false)));
    }

    public static C0D4U LIZ(String str) {
        C0D4U c0d4u = LIZ.get(str);
        if (c0d4u == null) {
            return new C0D4U(str, Locale.US, 0, true);
        }
        return c0d4u;
    }

    public static String LIZLLL(String str) {
        String string;
        String upperCase;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null || upperCase.length() == 0) {
            return "USD";
        }
        return upperCase;
    }

    public static int LJ(C0DI3 c0di3) {
        C0DI5 c0di5 = c0di3.LIZ;
        if (c0di5 instanceof C0DI4) {
            int i = ((C0DI4) c0di5).LIZ;
            if (i < 0) {
                return 0;
            }
            return i;
        }
        throw new C1954807lC();
    }

    public static BigDecimal LJFF(Number number) {
        if (number instanceof BigDecimal) {
            return (BigDecimal) number;
        }
        if (!(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return BigDecimal.valueOf(number.doubleValue());
        }
        return BigDecimal.valueOf(number.longValue());
    }

    public static C334590D9t LIZIZ(String str, Number number, Number number2) {
        BigDecimal bigDecimalLJFF;
        BigDecimal bigDecimalLJFF2;
        C0DI3 c0di3 = new C0DI3(0);
        String strLIZLLL = LIZLLL(str);
        int iLJ = LJ(c0di3);
        if (number2 == null || (bigDecimalLJFF = LJFF(number2)) == null || bigDecimalLJFF.compareTo(BigDecimal.ZERO) == 0) {
            bigDecimalLJFF = BigDecimal.ONE;
        }
        if (number == null || (bigDecimalLJFF2 = LJFF(number)) == null) {
            bigDecimalLJFF2 = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalDivide = bigDecimalLJFF2.divide(bigDecimalLJFF, iLJ, RoundingMode.HALF_UP);
        return new C334590D9t(strLIZLLL, bigDecimalDivide, LIZJ(strLIZLLL, bigDecimalDivide, c0di3), bigDecimalDivide.setScale(LJ(c0di3), RoundingMode.HALF_UP).toPlainString(), LIZ(strLIZLLL).LIZ);
    }

    public static String LIZJ(String str, BigDecimal bigDecimal, C0DI3 c0di3) {
        String str2;
        String strLIZIZ;
        String strLIZLLL = LIZLLL(str);
        BigDecimal scale = bigDecimal.setScale(LJ(c0di3), RoundingMode.HALF_UP);
        C0D4U c0d4uLIZ = LIZ(strLIZLLL);
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(c0d4uLIZ.LIZIZ);
        int iLJ = LJ(c0di3);
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setMinimumFractionDigits(iLJ);
        decimalFormat.setMaximumFractionDigits(iLJ);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str3 = decimalFormat.format(scale.abs());
        if (c0d4uLIZ.LIZLLL) {
            str2 = " ";
        } else {
            str2 = "";
        }
        if (c0d4uLIZ.LIZJ == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append(str2);
            sbLIZ.append(c0d4uLIZ.LIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0d4uLIZ.LIZ);
            sbLIZ2.append(str2);
            sbLIZ2.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (scale.signum() < 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('-');
            sbLIZ3.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return strLIZIZ;
    }
}

package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.SinglePriceItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02vL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C743702vL {
    public static final String LIZJ(SinglePriceItem singlePriceItem) {
        String strCurrency;
        String strCurrency2;
        if (C770702zh.LIZ(singlePriceItem.originPriceFormat)) {
            StringBuilder sb = new StringBuilder();
            if (singlePriceItem.symbolPosition == 0) {
                strCurrency = singlePriceItem.originPriceFormat;
            } else {
                strCurrency = singlePriceItem.currency();
            }
            sb.append(strCurrency);
            if (Intrinsics.LJFF(singlePriceItem.showCurrencySpace, Boolean.TRUE)) {
                sb.append(" ");
            }
            if (singlePriceItem.symbolPosition == 0) {
                strCurrency2 = singlePriceItem.currency();
            } else {
                strCurrency2 = singlePriceItem.originPriceFormat;
            }
            sb.append(strCurrency2);
            return sb.toString();
        }
        return "";
    }

    public static final String LIZLLL(SinglePriceItem singlePriceItem) {
        String strCurrency;
        String strCurrency2;
        if (C770702zh.LIZ(singlePriceItem.salePriceFormat)) {
            StringBuilder sb = new StringBuilder();
            if (singlePriceItem.symbolPosition == 0) {
                strCurrency = singlePriceItem.salePriceFormat;
            } else {
                strCurrency = singlePriceItem.currency();
            }
            sb.append(strCurrency);
            if (Intrinsics.LJFF(singlePriceItem.showCurrencySpace, Boolean.TRUE)) {
                sb.append(" ");
            }
            if (singlePriceItem.symbolPosition == 0) {
                strCurrency2 = singlePriceItem.currency();
            } else {
                strCurrency2 = singlePriceItem.salePriceFormat;
            }
            sb.append(strCurrency2);
            return sb.toString();
        }
        return "";
    }

    public static CharSequence LJ(SinglePriceItem singlePriceItem) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (singlePriceItem.symbolPosition == 0) {
            LIZ(spannableStringBuilder, singlePriceItem.salePriceIntegerPartFormat, singlePriceItem.salePriceDecimalPartFormat, singlePriceItem.decimalPointSymbol, 22, 82, singlePriceItem.salePriceFormat);
        } else {
            String strCurrency = singlePriceItem.currency();
            if (strCurrency != null) {
                LIZIZ(spannableStringBuilder, strCurrency, 82);
            }
        }
        if (Intrinsics.LJFF(singlePriceItem.showCurrencySpace, Boolean.TRUE)) {
            LIZIZ(spannableStringBuilder, " ", 22);
        }
        if (singlePriceItem.symbolPosition == 0) {
            String strCurrency2 = singlePriceItem.currency();
            if (strCurrency2 != null) {
                LIZIZ(spannableStringBuilder, strCurrency2, 82);
            }
            return spannableStringBuilder;
        }
        LIZ(spannableStringBuilder, singlePriceItem.salePriceIntegerPartFormat, singlePriceItem.salePriceDecimalPartFormat, singlePriceItem.decimalPointSymbol, 22, 82, singlePriceItem.salePriceFormat);
        return spannableStringBuilder;
    }

    public static final void LIZIZ(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i, false), length, spannableStringBuilder.length(), 17);
    }

    public static final void LIZ(SpannableStringBuilder spannableStringBuilder, String str, String str2, String str3, int i, int i2, String str4) {
        if (C770702zh.LIZ(str)) {
            LIZIZ(spannableStringBuilder, str, i);
            if (C770702zh.LIZ(str2)) {
                if (str3 != null) {
                    LIZIZ(spannableStringBuilder, str3, i2);
                }
                LIZIZ(spannableStringBuilder, str2, i2);
                return;
            }
            return;
        }
        if (str4 == null) {
            return;
        }
        LIZIZ(spannableStringBuilder, str4, i);
    }
}

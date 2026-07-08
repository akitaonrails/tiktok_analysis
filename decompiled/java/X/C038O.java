package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.038O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C038O {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(String str, Price price, String str2, boolean z) {
        String symbol;
        String realPriceDecimal;
        boolean z2;
        boolean z3;
        int iLJJJ;
        if (str == null && (price == null || (str = price.getPriceStr()) == null)) {
            return "";
        }
        if (!z) {
            return str;
        }
        if (price == null || (symbol = price.getSymbol()) == null) {
            symbol = "";
        }
        if (price == null || (realPriceDecimal = price.getRealPriceDecimal()) == null) {
            realPriceDecimal = "";
        }
        if (realPriceDecimal.length() == 0) {
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = realPriceDecimal;
        }
        if (symbol.length() == 0 && str2.length() == 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (symbol.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (u.LJJIIJZLJL(str, symbol, false)) {
                C786410Ut5.q2(spannableStringBuilder, new C444920HcY(92, false), 0, symbol.length(), 33);
            } else {
                if (u.LJIIZILJ(str, symbol, false)) {
                    C786410Ut5.q2(spannableStringBuilder, new C444920HcY(92, false), str.length() - symbol.length(), str.length(), 33);
                }
                z3 = false;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (str2.length() > 0 && (iLJJJ = a0.LJJJ(str, str2, 0, false, 6)) >= 0) {
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(92, false), iLJJJ, str2.length() + iLJJJ, 33);
            return spannableStringBuilder;
        }
        if (z3) {
            return spannableStringBuilder;
        }
        return str;
    }
}

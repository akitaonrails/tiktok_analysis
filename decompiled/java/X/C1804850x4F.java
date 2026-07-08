package X;

import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804850x4F {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Diamond diamond) {
        if (diamond.LIZIZ() && C500260Jjc.LJJIJIIJI(diamond.currencyPrice)) {
            return ((CurrencyPriceItem) ListProtector.get(diamond.currencyPrice, 0)).currency;
        }
        return diamond.LIZIZ;
    }

    public static String LIZIZ(Diamond diamond) {
        String strJ4 = "";
        if (diamond == null || diamond.customPriceCurrency == null) {
            return "";
        }
        try {
            String symbol = Currency.getInstance(diamond.customPriceCurrency).getSymbol(new Locale("en", "US"));
            if (!C500260Jjc.LJJIIZ(symbol)) {
                symbol = null;
            }
            if (symbol == null) {
                symbol = diamond.customPriceCurrency;
            }
            strJ4 = C786410Ut5.j4("%s %s", Arrays.copyOf(new Object[]{symbol, diamond.customPrice}, 2));
            return strJ4;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return strJ4;
        }
    }

    public static String LIZJ(Diamond diamond) {
        boolean z;
        String str = diamond.customPriceCurrency;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || !Intrinsics.LJFF(diamond.customPriceCurrency, diamond.LIZIZ)) {
            return "";
        }
        return LJ(diamond.customPriceCurrency, new AwS571S0100000_27(diamond, 1030));
    }

    public static String LIZLLL(Diamond diamond) {
        if (diamond.LIZIZ == null) {
            return "";
        }
        return LJ(diamond.LIZIZ, new AwS571S0100000_27(diamond, 1031));
    }

    public static long LJFF(Diamond diamond) {
        Long l;
        CurrencyPriceItem currencyPriceItem = diamond.usdPrice;
        if (currencyPriceItem != null && (l = currencyPriceItem.price) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static String LJI(Diamond diamond) {
        CurrencyPriceItem currencyPriceItem = (CurrencyPriceItem) C13LP.LJJJLL(diamond.currencyPrice);
        if (currencyPriceItem == null) {
            return "";
        }
        double dLongValue = currencyPriceItem.price.longValue() / Math.pow(10.0d, currencyPriceItem.priceDot.intValue());
        try {
            Locale locale = Locale.getDefault();
            NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
            numberInstance.setGroupingUsed(true);
            int defaultFractionDigits = Currency.getInstance(currencyPriceItem.currency).getDefaultFractionDigits();
            numberInstance.setMinimumFractionDigits(defaultFractionDigits);
            numberInstance.setMaximumFractionDigits(defaultFractionDigits);
            String str = numberInstance.format(dLongValue);
            Object[] objArr = new Object[2];
            String symbol = Currency.getInstance(currencyPriceItem.currency).getSymbol(locale);
            if (!C500260Jjc.LJJIIZ(symbol)) {
                symbol = null;
            }
            if (symbol == null) {
                symbol = currencyPriceItem.priceShowForm;
            }
            objArr[0] = symbol;
            objArr[1] = str;
            return C786410Ut5.j4("%s %s", Arrays.copyOf(objArr, 2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            NumberFormat numberInstance2 = NumberFormat.getNumberInstance(Locale.getDefault());
            numberInstance2.setMinimumFractionDigits(2);
            numberInstance2.setMaximumFractionDigits(2);
            String str2 = numberInstance2.format(dLongValue);
            Object[] objArr2 = new Object[2];
            String str3 = currencyPriceItem.currency;
            if (str3 == null) {
                str3 = currencyPriceItem.priceShowForm;
            }
            objArr2[0] = str3;
            objArr2[1] = str2;
            return C786410Ut5.j4("%s %s", Arrays.copyOf(objArr2, 2));
        }
    }

    public static String LJ(String str, Function0 function0) {
        try {
            BigDecimal bigDecimal = (BigDecimal) function0.invoke();
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            Currency currency = Currency.getInstance(str);
            int defaultFractionDigits = currency.getDefaultFractionDigits();
            currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
            currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
            currencyInstance.setCurrency(currency);
            return currencyInstance.format(bigDecimal);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return "";
        }
    }
}

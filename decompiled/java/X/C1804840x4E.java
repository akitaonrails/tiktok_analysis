package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import webcast.api.profit.IapListResult;
import webcast.data.FXRate;

/* JADX INFO: renamed from: X.0x4E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1804840x4E {
    public final List<Diamond> LIZ;
    public final IapListResult.ListResultExtra LIZIZ;
    public final List<Diamond> LIZJ;
    public final long LIZLLL = System.currentTimeMillis();
    public boolean LJ;

    public String LJIIIIZZ() {
        return "google_play";
    }

    public boolean LJIJI() {
        return false;
    }

    public boolean LJIJJ() {
        return false;
    }

    public boolean LJIJJLI() {
        return false;
    }

    public Diamond LIZJ() {
        Diamond diamond = (Diamond) C13LP.LJJLIIIJL(LJ());
        if (diamond == null || !diamond.LIZ()) {
            return null;
        }
        return diamond;
    }

    public int LJIILIIL() {
        return LJ().size();
    }

    public Long LJIILJJIL() {
        IapListResult.ListResultExtra listResultExtraLJII = LJII();
        if (listResultExtraLJII != null) {
            return Long.valueOf(listResultExtraLJII.recentlyPurchasedPacketId);
        }
        return null;
    }

    public boolean LJIIZILJ() {
        return LJ().isEmpty();
    }

    public boolean LJIJ() {
        IapListResult.ListResultExtra listResultExtraLJII = LJII();
        if (listResultExtraLJII != null) {
            return listResultExtraLJII.isNewRecommendPackage;
        }
        return false;
    }

    public List<Diamond> LJ() {
        return this.LIZ;
    }

    public IapListResult.ListResultExtra LJII() {
        return this.LIZIZ;
    }

    public List<Diamond> LJIIIZ() {
        return this.LIZJ;
    }

    public Diamond LIZLLL(String str) {
        for (Diamond diamond : LJ()) {
            if (C2093608Ic.LIZJ(diamond.iapId, str)) {
                return diamond;
            }
        }
        return null;
    }

    public List<Diamond> LJIIJ(String str) {
        return LJ();
    }

    public Long LJIILL(String str) {
        IapListResult.ListResultExtra listResultExtraLJII = LJII();
        if (listResultExtraLJII != null) {
            return Long.valueOf(listResultExtraLJII.recommendedPacketId);
        }
        return null;
    }

    public List<IapListResult.VoucherItem> LJIILLIIL(String str) {
        IapListResult.ListResultExtra listResultExtraLJII = LJII();
        if (listResultExtraLJII != null) {
            return listResultExtraLJII.voucherList;
        }
        return null;
    }

    public String LIZ(Diamond diamond, String str) {
        BigDecimal bigDecimalDivide;
        Boolean boolValueOf;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(diamond.LIZJ);
        if (bigDecimalValueOf != null && (bigDecimalDivide = bigDecimalValueOf.divide(new BigDecimal(String.valueOf(1000000.0f)))) != null) {
            String str2 = diamond.price;
            String str3 = diamond.LIZIZ;
            float fFloatValue = bigDecimalDivide.floatValue();
            IapListResult.ListResultExtra listResultExtraLJII = LJII();
            List<FXRate> list = null;
            if (listResultExtraLJII != null) {
                boolValueOf = Boolean.valueOf(listResultExtraLJII.needDisplayMultiCurrency);
            } else {
                boolValueOf = null;
            }
            IapListResult.ListResultExtra listResultExtraLJII2 = LJII();
            if (listResultExtraLJII2 != null) {
                list = listResultExtraLJII2.multiCurrencyDisplayFxRateList;
            }
            return LIZIZ(diamond, str2, str3, fFloatValue, boolValueOf, list);
        }
        return "";
    }

    public String LJFF(Diamond diamond, String str) {
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalDivide;
        Boolean boolValueOf;
        if (diamond != null && (bigDecimalValueOf = BigDecimal.valueOf(diamond.LIZJ)) != null && (bigDecimalDivide = bigDecimalValueOf.divide(new BigDecimal(String.valueOf(1000000.0f)))) != null) {
            String str2 = diamond.price;
            String str3 = diamond.LIZIZ;
            float fFloatValue = bigDecimalDivide.floatValue();
            IapListResult.ListResultExtra listResultExtraLJII = LJII();
            List<FXRate> list = null;
            if (listResultExtraLJII != null) {
                boolValueOf = Boolean.valueOf(listResultExtraLJII.needDisplayMultiCurrency);
            } else {
                boolValueOf = null;
            }
            IapListResult.ListResultExtra listResultExtraLJII2 = LJII();
            if (listResultExtraLJII2 != null) {
                list = listResultExtraLJII2.multiCurrencyDisplayFxRateList;
            }
            return LJI(diamond, str2, str3, fFloatValue, boolValueOf, list);
        }
        return "";
    }

    public List<Diamond> LJIIJJI(String str, boolean z) {
        return LJ();
    }

    public C1804840x4E(List list, List list2, IapListResult.ListResultExtra listResultExtra) {
        this.LIZ = list;
        this.LIZIZ = listResultExtra;
        this.LIZJ = list2;
    }

    public static String LIZIZ(Diamond diamond, String str, String str2, float f, Boolean bool, List list) {
        boolean z;
        boolean z2;
        String str3;
        Object next;
        String strLIZIZ = "";
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && diamond != null) {
            boolean z3 = false;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (str2 != null && str2.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (list == null || list.isEmpty()) {
                        z3 = true;
                    }
                    if (!z3) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            str3 = null;
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (u.LJIJI(((FXRate) next).fromCurrency, str2, true)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        FXRate fXRate = (FXRate) next;
                        if (fXRate == null) {
                            return "";
                        }
                        BigDecimal bigDecimalMultiply = new BigDecimal(String.valueOf(f)).multiply(BigDecimal.valueOf(fXRate.rate).divide(BigDecimal.TEN.pow((int) fXRate.rateDecimalPosition)));
                        try {
                            Locale locale = Locale.getDefault();
                            NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
                            numberInstance.setMinimumFractionDigits(fXRate.postConversionPrecision);
                            numberInstance.setMaximumFractionDigits(fXRate.postConversionPrecision);
                            String symbol = Currency.getInstance(fXRate.toCurrency).getSymbol(locale);
                            if (C500260Jjc.LJJIIZ(symbol)) {
                                str3 = symbol;
                            }
                            if (str3 == null) {
                                str3 = fXRate.toCurrencyShowForm;
                            }
                            String str4 = numberInstance.format(bigDecimalMultiply);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str3);
                            sbLIZ.append(' ');
                            sbLIZ.append(str4);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            return strLIZIZ;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                        }
                    }
                }
            }
        }
        return strLIZIZ;
    }

    public static String LJI(Diamond diamond, String str, String str2, float f, Boolean bool, List list) {
        String strLIZIZ = LIZIZ(diamond, str, str2, f, bool, list);
        if (strLIZIZ.length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(str);
        sbLIZ.append(" ≈ ");
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

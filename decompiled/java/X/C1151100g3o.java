package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0g3o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151100g3o {
    public static String LIZIZ(int i) {
        boolean zIsRevenue;
        int i2;
        RevenueExchange revenueExchange;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF1 != null && (revenueExchange = walletStructTF1.revenue) != null) {
            zIsRevenue = revenueExchange.isRevenue();
        } else {
            zIsRevenue = false;
        }
        if (i == -1) {
            i2 = 2131851124;
        } else if (zIsRevenue) {
            if (walletStructTF1 != null && walletStructTF1.isPeriodicPayout) {
                i2 = 2131851126;
            } else {
                i2 = 2131851125;
            }
        } else if (walletStructTF1 != null && walletStructTF1.isPeriodicPayout) {
            i2 = 2131851127;
        } else {
            i2 = 2131851128;
        }
        return C497740JfY.LJIJI(i2);
    }

    public static CharSequence LIZJ(int i) {
        BalanceStructExtra balanceStructExtra;
        String strLJIIZILJ;
        long j;
        int keepDot;
        BalanceStructExtra balanceStructExtra2;
        UserBalance userBalance;
        String symbol;
        String code;
        boolean zIsRevenue = false;
        int keepDot2 = 0;
        String symbol2 = null;
        if (i != -2) {
            if (i == -1) {
                IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
                BalanceStruct balanceStructG52 = iWalletService.walletCenter().g52();
                if (balanceStructG52 != null && (balanceStructExtra2 = balanceStructG52.exchangeInfo) != null && (userBalance = balanceStructG52.userBalance) != null) {
                    CurrencyInfo currencyInfo = balanceStructExtra2.getCurrencyInfo();
                    if (currencyInfo != null) {
                        symbol = currencyInfo.getSymbol();
                    } else {
                        symbol = null;
                    }
                    long j2 = userBalance.balance;
                    CurrencyInfo currencyInfo2 = balanceStructExtra2.getCurrencyInfo();
                    if (currencyInfo2 != null) {
                        keepDot2 = currencyInfo2.getKeepDot();
                    }
                    CurrencyInfo currencyInfo3 = balanceStructExtra2.getCurrencyInfo();
                    if (currencyInfo3 != null) {
                        code = currencyInfo3.getCode();
                    } else {
                        code = null;
                    }
                    IWalletExchange iWalletExchangeWalletExchange = iWalletService.walletExchange();
                    CurrencyInfo currencyInfo4 = balanceStructExtra2.getCurrencyInfo();
                    if (currencyInfo4 != null) {
                        symbol2 = currencyInfo4.getCode();
                    }
                    return LIZLLL(balanceStructExtra2.getCoins(), -1, LIZ(symbol, j2, keepDot2, true, code, ((WalletExchange) iWalletExchangeWalletExchange).LJIIL(symbol2)), null, false);
                }
            }
        } else {
            WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
            if (walletStructTF1 != null && (balanceStructExtra = walletStructTF1.LIZ) != null) {
                if (balanceStructExtra.isLocal()) {
                    strLJIIZILJ = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIZILJ(balanceStructExtra.getCoins(), true);
                } else {
                    strLJIIZILJ = null;
                }
                CurrencyInfo currencyInfo5 = balanceStructExtra.getCurrencyInfo();
                if (currencyInfo5 != null) {
                    symbol2 = currencyInfo5.getSymbol();
                }
                RevenueExchange revenueExchange = walletStructTF1.revenue;
                if (revenueExchange != null) {
                    j = revenueExchange.balance;
                } else {
                    j = 0;
                }
                CurrencyInfo currencyInfo6 = balanceStructExtra.getCurrencyInfo();
                if (currencyInfo6 != null) {
                    keepDot = currencyInfo6.getKeepDot();
                } else {
                    keepDot = 0;
                }
                String strLIZ = LIZ(symbol2, j, keepDot, false, "", null);
                long coins = balanceStructExtra.getCoins();
                RevenueExchange revenueExchange2 = walletStructTF1.revenue;
                if (revenueExchange2 != null) {
                    zIsRevenue = revenueExchange2.isRevenue();
                }
                return LIZLLL(coins, -2, strLIZ, strLJIIZILJ, zIsRevenue);
            }
        }
        return null;
    }

    public static CharSequence LIZLLL(long j, int i, String str, String str2, boolean z) {
        int i2;
        String strLJIJJ;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0);
        if (drawableLJIIJ != null) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(10.0f);
            drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
            C416760GVu c416760GVu = new C416760GVu(drawableLJIIJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(". ");
            sbLIZ.append(j);
            sbLIZ.append(" )");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (i == -1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(" ( ");
                sbLIZ2.append(strLIZIZ);
                strLJIJJ = C497740JfY.LJIJJ(2131841599, C2188811AlT.LIZIZ(sbLIZ2));
            } else {
                if (z) {
                    if (walletStructTF1 != null && walletStructTF1.isPeriodicPayout) {
                        i2 = 2131841543;
                    } else {
                        i2 = 2131841973;
                    }
                } else if (walletStructTF1 != null && walletStructTF1.isPeriodicPayout) {
                    i2 = 2131841552;
                } else {
                    i2 = 2131841972;
                }
                if (str2 != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(" ≈ ");
                    sbLIZ3.append(str2);
                    sbLIZ3.append(" ( ");
                    sbLIZ3.append(strLIZIZ);
                    strLJIJJ = C497740JfY.LJIJJ(i2, C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append(" ( ");
                    sbLIZ4.append(strLIZIZ);
                    strLJIJJ = C497740JfY.LJIJJ(i2, C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
            SpannableString spannableString = new SpannableString(strLJIJJ);
            C786410Ut5.p2(spannableString, c416760GVu, strLJIJJ.length() - strLIZIZ.length(), (strLJIJJ.length() - strLIZIZ.length()) + 1, 33);
            return spannableString;
        }
        return null;
    }

    public static String LIZ(String str, long j, int i, boolean z, String str2, Locale locale) {
        String strLIZIZ;
        double dPow = j / Math.pow(10.0d, 2.0d);
        String str3 = "";
        if (z) {
            IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            List listSingletonList = Collections.singletonList(new BigDecimal(String.valueOf(dPow)));
            if (str2 != null) {
                str3 = str2;
            }
            Boolean bool = Boolean.TRUE;
            strLIZIZ = (String) ListProtector.get(((WalletExchange) iWalletExchangeWalletExchange).LJIILJJIL(listSingletonList, i, str3, locale, bool, bool), 0);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append(((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIJJI(dPow, i));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C497740JfY.LJJ() && !a0.LJJIIZI(strLIZIZ, "\u200f", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append((char) 8234);
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append("\u202c\u200f");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return strLIZIZ;
    }
}

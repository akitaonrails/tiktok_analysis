package X;

import Y.ACListenerS129S0200000_27;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.ViewGroup;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0x4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805200x4o extends AbstractC1807100x7s<AbstractC1806300x6a> {
    public final InterfaceC1806590x73 LL;
    public final Function0<Unit> LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;

    public static String N5(int i) {
        boolean z;
        int i2;
        RevenueExchange revenueExchange;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF1 != null && (revenueExchange = walletStructTF1.revenue) != null && revenueExchange.isRevenue()) {
            z = true;
        } else {
            z = false;
        }
        if (i == -1) {
            i2 = 2131851124;
        } else if (z) {
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void L5(AbstractC1806300x6a abstractC1806300x6a) {
        BalanceStructExtra balanceStructExtra;
        String strLJIIZILJ;
        long j;
        int keepDot;
        boolean zIsRevenue;
        BalanceStructExtra balanceStructExtra2;
        UserBalance userBalance;
        String symbol;
        int keepDot2;
        String code;
        Integer numValueOf;
        Boolean boolValueOf;
        boolean z;
        RevenueExchange revenueExchange;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        ExchangeDisplayInfo exchangeDisplayInfoKL2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().kL2();
        TuxTextView tuxTextView = this.LLILLL;
        CharSequence charSequenceP5 = null;
        String code2 = null;
        charSequenceP5 = null;
        charSequenceP5 = null;
        charSequenceP5 = null;
        charSequenceP5 = null;
        String symbol2 = null;
        charSequenceP5 = null;
        if (tuxTextView != null) {
            if (exchangeDisplayInfoKL2 != null) {
                numValueOf = Integer.valueOf(exchangeDisplayInfoKL2.exchangeEntranceTitle);
            } else {
                numValueOf = null;
            }
            int i = abstractC1806300x6a.LIZ;
            if (walletStructTF1 != null && (revenueExchange = walletStructTF1.revenue) != null) {
                boolValueOf = Boolean.valueOf(revenueExchange.isRevenue());
            } else {
                boolValueOf = null;
            }
            boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
            if (walletStructTF1 != null && walletStructTF1.isPeriodicPayout) {
                z = true;
            } else {
                z = false;
            }
            tuxTextView.setText(C1805860x5s.LIZ(i, numValueOf, zLJJJI, z));
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS129S0200000_27(abstractC1806300x6a, this, 41));
        }
        C1591306Kx.LJII(this.itemView, Integer.valueOf(exchangeDisplayInfoKL2.exchangeEntranceIcon));
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 != null) {
            int i2 = abstractC1806300x6a.LIZ;
            if (i2 != -2) {
                if (i2 == -1) {
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
                        } else {
                            keepDot2 = 0;
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
                            code2 = currencyInfo4.getCode();
                        }
                        charSequenceP5 = P5(balanceStructExtra2.getCoins(), -1, I5(symbol, j2, keepDot2, true, code, ((WalletExchange) iWalletExchangeWalletExchange).LJIIL(code2)), null, false);
                    }
                }
            } else {
                WalletStruct walletStructTF12 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
                if (walletStructTF12 != null && (balanceStructExtra = walletStructTF12.LIZ) != null) {
                    if (balanceStructExtra.isLocal()) {
                        strLJIIZILJ = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIZILJ(balanceStructExtra.getCoins(), true);
                    } else {
                        strLJIIZILJ = null;
                    }
                    CurrencyInfo currencyInfo5 = balanceStructExtra.getCurrencyInfo();
                    if (currencyInfo5 != null) {
                        symbol2 = currencyInfo5.getSymbol();
                    }
                    RevenueExchange revenueExchange2 = walletStructTF12.revenue;
                    if (revenueExchange2 != null) {
                        j = revenueExchange2.balance;
                    } else {
                        j = 0;
                    }
                    CurrencyInfo currencyInfo6 = balanceStructExtra.getCurrencyInfo();
                    if (currencyInfo6 != null) {
                        keepDot = currencyInfo6.getKeepDot();
                    } else {
                        keepDot = 0;
                    }
                    String strI5 = I5(symbol2, j, keepDot, false, "", null);
                    long coins = balanceStructExtra.getCoins();
                    RevenueExchange revenueExchange3 = walletStructTF12.revenue;
                    if (revenueExchange3 != null) {
                        zIsRevenue = revenueExchange3.isRevenue();
                    } else {
                        zIsRevenue = false;
                    }
                    charSequenceP5 = P5(coins, -2, strI5, strLJIIZILJ, zIsRevenue);
                }
            }
            tuxTextView3.setText(charSequenceP5);
        }
        if (abstractC1806300x6a.LJI == 2) {
            TuxTextView tuxTextView4 = this.LLILLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setEnabled(true);
            }
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                tuxTextView5.setEnabled(true);
            }
            TuxIconView tuxIconView = this.LLILZIL;
            if (tuxIconView != null) {
                tuxIconView.setEnabled(true);
                return;
            }
            return;
        }
        TuxTextView tuxTextView6 = this.LLILLL;
        if (tuxTextView6 != null) {
            tuxTextView6.setEnabled(false);
        }
        TuxTextView tuxTextView7 = this.LLILZ;
        if (tuxTextView7 != null) {
            tuxTextView7.setEnabled(false);
        }
        TuxIconView tuxIconView2 = this.LLILZIL;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setEnabled(false);
    }

    public C1805200x4o(ViewGroup viewGroup, InterfaceC1807160x7y interfaceC1807160x7y, AwS571S0100000_27 awS571S0100000_27) {
        super(R.layout.gqi, viewGroup);
        this.LL = interfaceC1807160x7y;
        this.LLILLJJLI = awS571S0100000_27;
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.h8_);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.h7o);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.h7e);
    }

    public static CharSequence P5(long j, int i, String str, String str2, boolean z) {
        String strLJIJJ;
        boolean z2;
        int i2;
        boolean z3;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        Drawable drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.el0);
        if (drawableLJIIJ != null) {
            try {
                int iLIZIZ = (int) C497740JfY.LIZIZ(10.0f);
                drawableLJIIJ.setBounds(0, 0, iLIZIZ, iLIZIZ);
                C416760GVu c416760GVu = new C416760GVu(drawableLJIIJ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(". ");
                sbLIZ.append(j);
                sbLIZ.append(" )");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (i != -1) {
                    if (z) {
                        if (walletStructTF1 == null || !walletStructTF1.isPeriodicPayout) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            i2 = 2131841543;
                        } else {
                            i2 = 2131841973;
                        }
                    } else {
                        if (walletStructTF1 == null || !walletStructTF1.isPeriodicPayout) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            i2 = 2131841552;
                        } else {
                            i2 = 2131841972;
                        }
                    }
                    if (str2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append(" ≈ ");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(" ( ");
                        sbLIZ2.append(strLIZIZ);
                        strLJIJJ = C497740JfY.LJIJJ(i2, C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str);
                        sbLIZ3.append(" ( ");
                        sbLIZ3.append(strLIZIZ);
                        strLJIJJ = C497740JfY.LJIJJ(i2, C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str);
                    sbLIZ4.append(" ( ");
                    sbLIZ4.append(strLIZIZ);
                    strLJIJJ = C497740JfY.LJIJJ(2131841599, C2188811AlT.LIZIZ(sbLIZ4));
                }
                SpannableString spannableString = new SpannableString(strLJIJJ);
                C786410Ut5.p2(spannableString, c416760GVu, strLJIJJ.length() - strLIZIZ.length(), (strLJIJJ.length() - strLIZIZ.length()) + 1, 33);
                return spannableString;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return null;
            }
        }
        return null;
    }

    public static String I5(String str, long j, int i, boolean z, String str2, Locale locale) {
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

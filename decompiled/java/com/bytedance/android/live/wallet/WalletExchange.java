package com.bytedance.android.live.wallet;

import X.C098200Yq;
import X.C09JN;
import X.C0UO0;
import X.C1131530fYF;
import X.C1144350fsv;
import X.C1149160g0g;
import X.C1149170g0h;
import X.C1149180g0i;
import X.C1149680g1W;
import X.C1149690g1X;
import X.C1151110g3p;
import X.C1151150g3t;
import X.C1161920gLG;
import X.C11NZ;
import X.C158B;
import X.C1796540wqq;
import X.C1802410x0J;
import X.C1805400x58;
import X.C189200o6;
import X.C20337914i1;
import X.C2093608Ic;
import X.C2348809Ig;
import X.C470590Icr;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C810670Vr7;
import X.EnumC1796260wqO;
import X.EnumC1805420x5A;
import X.EnumC1805430x5B;
import X.EnumC1805570x5P;
import X.EnumC1805710x5d;
import X.EnumC1805800x5m;
import X.InterfaceC1094160eZy;
import X.InterfaceC1151070g3l;
import Y.AfS186S0100000_17;
import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.ExchangeExtra;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.android.livesdk.livesetting.wallet.LiveGiftExchangeFESchema;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletApiTrackingSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletUgLocaleMappingSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletExchange implements IWalletExchange {
    public static final WalletExchange LL = new WalletExchange();

    public static String LJIIJ(int i, boolean z) {
        return z ? i != 0 ? i != 1 ? i == 2 ? "refund_credit" : "" : "anchor_income" : "ug_exchange" : i != 1 ? i != 2 ? "" : "anchor_income" : "ug_exchange";
    }

    public final String LJFF(int i) {
        if (i == 0) {
            return "live_recharge_page";
        }
        if (i == 1) {
            return "new_balance_page";
        }
        if (i == 15) {
            return "credit_refund_page";
        }
        switch (i) {
            case BdTuring.TYPE_ECAF /* 9 */:
                return "wallet_recharge_page";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "wallet_withdraw_page";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "send_gift_exchange";
            default:
                return "";
        }
    }

    public static boolean LIZ() {
        WalletStruct walletStruct;
        return LL.LJIL() || ((walletStruct = C1151110g3p.LIZ.LL) != null && walletStruct.autoSend);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJJI():void");
    }

    public static Locale LJIJI() {
        Locale locale = Locale.getDefault();
        Process processExec = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec(new String[]{"getprop", "persist.sys.locale"});
                Locale localeForLanguageTag = Locale.forLanguageTag(new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine());
                if (localeForLanguageTag != null) {
                    locale = localeForLanguageTag;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (processExec != null) {
                }
                return locale;
            }
            processExec.destroy();
            return locale;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
    }

    public final boolean LJIL() {
        return !C2093608Ic.LIZJ(CardStruct.IStatusCode.DEFAULT, C810670Vr7.LIZJ(C497740JfY.LJII(), 0, "js_kv_methods_20191113").getString("live_revenue_auto_exchange", CardStruct.IStatusCode.DEFAULT));
    }

    public final boolean LJJ() {
        return !C2093608Ic.LIZJ(CardStruct.IStatusCode.DEFAULT, C810670Vr7.LIZJ(C497740JfY.LJII(), 0, "js_kv_methods_20191113").getString("live_auto_exchange", CardStruct.IStatusCode.DEFAULT));
    }

    public static void LJJIIJZLJL(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C810670Vr7.LIZJ(C497740JfY.LJII(), 0, "js_kv_methods_20191113").edit().putString("live_revenue_auto_exchange", str).apply();
    }

    public static void LJJIIZ(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C810670Vr7.LIZJ(C497740JfY.LJII(), 0, "js_kv_methods_20191113").edit().putString("live_auto_exchange", str).apply();
    }

    public final boolean LIZIZ(int i) {
        boolean z;
        RevenueExchange revenueExchange;
        long coins;
        BalanceStructExtra balanceStructExtra;
        if (i > LiveExchangeConfirmThreshold.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        WalletStruct walletStruct = C1151110g3p.LIZ.LL;
        if (walletStruct == null || (revenueExchange = walletStruct.revenue) == null || !revenueExchange.enableExchange || z) {
            return false;
        }
        if (walletStruct != null && (balanceStructExtra = walletStruct.LIZ) != null) {
            coins = balanceStructExtra.getCoins();
        } else {
            coins = 0;
        }
        if (coins >= i) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        long j;
        boolean z;
        long coins;
        IWalletExchange iWalletExchangeWalletExchange;
        BalanceStructExtra balanceStructExtra;
        RevenueExchange revenueExchange;
        IWalletExchange iWalletExchangeWalletExchange2;
        WalletStruct walletStruct;
        BalanceStructExtra balanceStructExtra2;
        WalletCenter walletCenter = C1151110g3p.LIZ;
        WalletStruct walletStruct2 = walletCenter.LL;
        long jMax = 0;
        if (walletStruct2 != null) {
            j = walletStruct2.diamond;
        } else {
            j = 0;
        }
        if (i > LiveExchangeConfirmThreshold.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        long j2 = i;
        if (j < j2) {
            if (walletStruct2 != null && (revenueExchange = walletStruct2.revenue) != null && revenueExchange.enableExchange && !z && (iWalletExchangeWalletExchange2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()) != null && ((WalletExchange) iWalletExchangeWalletExchange2).LJIL() && (walletStruct = walletCenter.LL) != null && (balanceStructExtra2 = walletStruct.LIZ) != null) {
                coins = balanceStructExtra2.getCoins();
            } else {
                coins = 0;
            }
            BalanceStruct balanceStruct = walletCenter.LLILZIL;
            if (balanceStruct != null && balanceStruct.validUser && !z && (iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()) != null && ((WalletExchange) iWalletExchangeWalletExchange).LJJ()) {
                BalanceStruct balanceStruct2 = walletCenter.LLILZIL;
                if (balanceStruct2 != null && (balanceStructExtra = balanceStruct2.exchangeInfo) != null) {
                    jMax = balanceStructExtra.getCoins();
                }
                jMax = Math.max(coins, jMax);
            } else {
                jMax = coins;
            }
        }
        if (j + jMax >= j2) {
            return true;
        }
        return false;
    }

    public final Locale LJIIL(String str) {
        String str2 = LiveWalletUgLocaleMappingSetting.INSTANCE.getValue().get(str);
        if (str2 == null) {
            return null;
        }
        return Locale.forLanguageTag(str2);
    }

    public final String LJIJ(long j) {
        String code;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        CurrencyInfo currencyInfo;
        WalletCenter walletCenter = C1151110g3p.LIZ;
        BalanceStruct balanceStruct = walletCenter.LLILZIL;
        if (balanceStruct == null || (balanceStructExtra2 = balanceStruct.exchangeInfo) == null || (currencyInfo = balanceStructExtra2.getCurrencyInfo()) == null || (code = currencyInfo.getCode()) == null) {
            code = "";
        }
        Locale localeLJIIL = LJIIL(code);
        BalanceStruct balanceStruct2 = walletCenter.LLILZIL;
        if (balanceStruct2 != null) {
            balanceStructExtra = balanceStruct2.exchangeInfo;
        } else {
            balanceStructExtra = null;
        }
        return LJIILLIIL(j, balanceStructExtra, false, code, localeLJIIL);
    }

    public final String LJII(String str, Locale locale) {
        if (locale == null) {
            try {
                locale = LJIJI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return "";
            }
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(str));
        if (currencyInstance instanceof DecimalFormat) {
            return String.valueOf(((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getDecimalSeparator());
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return "";
    }

    public final String LJIIIIZZ(String str, Locale locale) {
        if (locale == null) {
            try {
                locale = LJIJI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return "";
            }
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(str));
        if (currencyInstance instanceof DecimalFormat) {
            String currencySymbol = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols().getCurrencySymbol();
            if (currencySymbol == null) {
                return "";
            }
            return currencySymbol;
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return "";
    }

    public final String LJIIJJI(double d, int i) {
        StringBuilder sb = new StringBuilder(CardStruct.IStatusCode.DEFAULT);
        if (i > 0) {
            sb.append(e3.d);
            int i2 = 0;
            do {
                sb.append(CardStruct.IStatusCode.DEFAULT);
                i2++;
            } while (i2 < i);
        }
        DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.US));
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        return decimalFormat.format(d);
    }

    public final String LJIIZILJ(long j, boolean z) {
        BalanceStructExtra balanceStructExtra;
        WalletStruct walletStruct = C1151110g3p.LIZ.LL;
        if (walletStruct != null) {
            balanceStructExtra = walletStruct.LIZ;
        } else {
            balanceStructExtra = null;
        }
        return LJIILLIIL(j, balanceStructExtra, z, null, null);
    }

    public final void LJJIIJ(final String str, final String str2) {
        C480460Ism.LIZ().getClass();
        ((IapApi) C480460Ism.LIZLLL(IapApi.class)).updateAutoExchange(true, 0).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0g3Y
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("WalletExchange@fd13.openUgAutoExchange$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                WalletExchange walletExchange = WalletExchange.LL;
                boolean after = ((AutoExchangeData) baseResponse.data).getAfter();
                walletExchange.getClass();
                WalletExchange.LJJIIZ(after);
                C1149680g1W.LJIJ(str, "ug_exchange", str2, ((AutoExchangeData) baseResponse.data).getAfter());
                if (walletExchange.LJJ()) {
                    C766270U4b.LIZLLL(2131840996);
                }
                C1C7U.LIZIZ("WalletExchange@fd13.openUgAutoExchange$1");
            }
        }, new C09JN() { // from class: X.0g3k
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("WalletExchange@fd13.openUgAutoExchange$2");
                C1C7U.LIZIZ("WalletExchange@fd13.openUgAutoExchange$2");
            }
        });
    }

    public static void LIZLLL(final String str, final String str2, final boolean z) {
        C480460Ism.LIZ().getClass();
        ((IapApi) C480460Ism.LIZLLL(IapApi.class)).updateAutoExchange(true, 1).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0g3X
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("WalletExchange@fd13.doOpenLiveAutoExchange$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                WalletExchange walletExchange = WalletExchange.LL;
                boolean after = ((AutoExchangeData) baseResponse.data).getAfter();
                walletExchange.getClass();
                WalletExchange.LJJIIJZLJL(after);
                C1149680g1W.LJIJ(str, "anchor_income", str2, ((AutoExchangeData) baseResponse.data).getAfter());
                if (walletExchange.LJIL() && z) {
                    C766270U4b.LIZLLL(2131840996);
                }
                C1C7U.LIZIZ("WalletExchange@fd13.doOpenLiveAutoExchange$1");
            }
        }, new C09JN() { // from class: X.0g3j
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("WalletExchange@fd13.doOpenLiveAutoExchange$2");
                C1C7U.LIZIZ("WalletExchange@fd13.doOpenLiveAutoExchange$2");
            }
        });
    }

    public static HashMap LJIIIZ(int i, String str, boolean z) {
        String str2;
        HashMap map = new HashMap();
        map.put("charge_channel", "Exchange");
        map.put("scenario", "exchange");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_exchange_only", str2);
        map.put("charge_reason", str);
        map.put("exchange_type", LJIIJ(i, z));
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0g3R] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0g3R] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZI(final android.content.Context r9, int r10, final java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJJIIZI(android.content.Context, int, java.lang.String):void");
    }

    public static void LJJIJIIJI(EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A, UserBalance userBalance) {
        C11NZ<C470590Icr<BalanceStructExtra>> basePackage;
        String value;
        C480460Ism.LIZ().getClass();
        IapApi iapApi = (IapApi) C480460Ism.LIZLLL(IapApi.class);
        if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            String value2 = null;
            if (enumC1805800x5m != null) {
                value = enumC1805800x5m.getValue();
            } else {
                value = null;
            }
            if (enumC1805420x5A != null) {
                value2 = enumC1805420x5A.getValue();
            }
            basePackage = iapApi.getBasePackageWithHeaders(value, value2, userBalance.currencyType, userBalance.countryCode, 100L, userBalance.balance, 2);
        } else {
            basePackage = iapApi.getBasePackage(userBalance.currencyType, userBalance.countryCode, 100L, userBalance.balance, 2);
        }
        basePackage.LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0g3T
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("WalletExchange@fd13.syncBasePackageForUG$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                WalletCenter walletCenter = C1151110g3p.LIZ;
                BalanceStruct balanceStruct = walletCenter.LLILZIL;
                if (balanceStruct == null) {
                    balanceStruct = new BalanceStruct();
                    walletCenter.LLILZIL = balanceStruct;
                }
                balanceStruct.setExchangeInfo((BalanceStructExtra) baseResponse.data);
                if (baseResponse.data != null) {
                    walletCenter.LLJILJILJ.onNext(Boolean.FALSE);
                }
                C1C7U.LIZIZ("WalletExchange@fd13.syncBasePackageForUG$1");
            }
        }, new C09JN() { // from class: X.0g3e
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("WalletExchange@fd13.syncBasePackageForUG$2");
                C1C7U.LIZIZ("WalletExchange@fd13.syncBasePackageForUG$2");
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (X.C1150830g3N.LIZJ(r22, r24, r23, "guide") != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (X.C1144360fsw.LIZIZ(X.EnumC1144380fsy.UG_INCOME, r22, r23, r24, r2.LJFF(11)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        r9 = 0;
        r24.LIZJ();
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(android.content.Context r22, X.C1144350fsv r23, X.InterfaceC1149850g1n r24) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJIJJLI(android.content.Context, X.0fsv, X.0g1n):boolean");
    }

    public final void LJJIII(Context context, int i, int i2, String str) {
        C1802410x0J c1802410x0J = new C1802410x0J();
        c1802410x0J.LJIIJJI = i;
        c1802410x0J.LJIIL = i2;
        c1802410x0J.LJIILIIL = false;
        C1151150g3t.LIZ.getClass();
        C1151150g3t.LIZIZ(context, false, str, c1802410x0J);
    }

    public final void LJ(final Context context, final String str, final boolean z, final ExchangeParams exchangeParams, final InterfaceC1151070g3l interfaceC1151070g3l) {
        if (exchangeParams == null) {
            return;
        }
        final WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        C480460Ism.LIZ().getClass();
        ((IapApi) C480460Ism.LIZLLL(IapApi.class)).exchangeCoins(exchangeParams.diamondId, exchangeParams.way, exchangeParams.currency, exchangeParams.source, exchangeParams.coinsCount, exchangeParams.localAmount, exchangeParams.currencyDot, exchangeParams.skipKycReminder, exchangeParams.penaltyWarningSkip, exchangeParams.isFirstRecharge, exchangeParams.showExchangeTooltip, exchangeParams.showExchangeAmountAdjustedText, exchangeParams.exchangeInputOption, exchangeParams.subSource, exchangeParams.campaignType).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0g3Q
            @Override // X.C09JN
            public final void accept(Object obj) {
                String str2;
                EnumC1805800x5m enumC1805800x5m;
                EnumC1805800x5m enumC1805800x5m2;
                boolean z2;
                String orderId;
                ExchangeExtra exchangeExtra;
                C1C7U.LIZ("WalletExchange@fd13.exchange$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                WalletExchange walletExchange = WalletExchange.LL;
                ExchangeParams exchangeParams2 = exchangeParams;
                int i = exchangeParams2.way;
                HashMap<String, String> map = exchangeParams2.eventParams;
                String str3 = "";
                if (map == null || (str2 = map.get("charge_reason")) == null) {
                    str2 = "";
                }
                walletExchange.getClass();
                HashMap<String, String> mapLJIIIZ = WalletExchange.LJIIIZ(i, str2, true);
                WalletCenter walletCenter = C1151110g3p.LIZ;
                EnumC1805710x5d enumC1805710x5d = EnumC1805710x5d.EXCHANGE_SUCCESS;
                boolean z3 = z;
                int i2 = exchangeParams.source;
                if (z3) {
                    enumC1805800x5m = EnumC1805800x5m.UG_TASK;
                } else if (i2 == 9) {
                    enumC1805800x5m = EnumC1805800x5m.PROFILE;
                } else if (i2 == 1) {
                    enumC1805800x5m = EnumC1805800x5m.WALLET;
                } else if (i2 == 0) {
                    enumC1805800x5m = EnumC1805800x5m.LIVE_DETAIL;
                } else {
                    enumC1805800x5m = EnumC1805800x5m.OTHERS;
                }
                EnumC1805420x5A enumC1805420x5A = EnumC1805420x5A.EXCHANGE_SUCCESS;
                walletCenter.lj0(enumC1805710x5d, enumC1805800x5m, enumC1805420x5A, mapLJIIIZ, false);
                boolean z4 = z;
                ExchangeParams exchangeParams3 = exchangeParams;
                int i3 = exchangeParams3.source;
                if (z4) {
                    enumC1805800x5m2 = EnumC1805800x5m.UG_TASK;
                } else if (i3 == 9) {
                    enumC1805800x5m2 = EnumC1805800x5m.PROFILE;
                } else if (i3 == 1) {
                    enumC1805800x5m2 = EnumC1805800x5m.WALLET;
                } else if (i3 == 0) {
                    enumC1805800x5m2 = EnumC1805800x5m.LIVE_DETAIL;
                } else {
                    enumC1805800x5m2 = EnumC1805800x5m.OTHERS;
                }
                EnumC1805430x5B enumC1805430x5B = EnumC1805430x5B.EXCHANGE_SUCCESS;
                boolean z5 = exchangeParams3.isFirstRecharge;
                if (exchangeParams3.way == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                walletCenter.yM0(enumC1805800x5m2, enumC1805430x5B, enumC1805420x5A, z5, false, z2);
                InterfaceC1151070g3l interfaceC1151070g3l2 = interfaceC1151070g3l;
                if (interfaceC1151070g3l2 != null) {
                    if (baseResponse != null && (exchangeExtra = (ExchangeExtra) baseResponse.extra) != null) {
                        orderId = exchangeExtra.getOrderId();
                    } else {
                        orderId = null;
                    }
                    interfaceC1151070g3l2.LIZIZ(orderId);
                }
                if (C1533950q1J.LJ(str) && InterfaceC1094160eZy.S0.LIZIZ().intValue() > 0) {
                    C20337914i1<Boolean> c20337914i1 = InterfaceC1094160eZy.T0;
                    if (c20337914i1.LIZIZ().booleanValue()) {
                        Context context2 = context;
                        String str4 = str;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        WalletExchange.LJJIIZI(context2, 2, str3);
                        c20337914i1.LJFF(Boolean.FALSE);
                    }
                }
                WalletStruct walletStruct = walletStructTF1;
                if (walletStruct != null && walletStruct.autoExchangeSupported) {
                    C20337914i1<Integer> c20337914i12 = InterfaceC1094160eZy.S0;
                    c20337914i12.LJFF(Integer.valueOf(c20337914i12.LIZIZ().intValue() + 1));
                }
                C1C7U.LIZIZ("WalletExchange@fd13.exchange$1");
            }
        }, new AfS186S0100000_17(interfaceC1151070g3l, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033 A[PHI: r0
      0x0033: PHI (r0v25 long) = (r0v7 long), (r0v27 long) binds: [B:45:0x00c9, B:19:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[PHI: r0
      0x00b9: PHI (r0v6 long) = (r0v5 long), (r0v7 long) binds: [B:38:0x00b5, B:45:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd A[PHI: r0 r2
      0x00cd: PHI (r0v24 long) = (r0v6 long), (r0v25 long) binds: [B:42:0x00c3, B:23:0x003d] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r2v8 java.lang.String) = (r2v1 java.lang.String), (r2v10 java.lang.String) binds: [B:42:0x00c3, B:23:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb A[PHI: r8
      0x00eb: PHI (r8v3 int) = (r8v1 int), (r8v5 int) binds: [B:52:0x00de, B:14:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILLIIL(long r17, com.bytedance.android.live.wallet.model.BalanceStructExtra r19, boolean r20, java.lang.String r21, java.util.Locale r22) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.WalletExchange.LJIILLIIL(long, com.bytedance.android.live.wallet.model.BalanceStructExtra, boolean, java.lang.String, java.util.Locale):java.lang.String");
    }

    public final void LJJIFFI(Throwable th, String str, Boolean bool, C1144350fsv c1144350fsv, Long l) {
        String strValueOf;
        String str2 = str;
        long jLongValue = l.longValue();
        String str3 = null;
        if (th != null) {
            C1149180g0i.Companion.getClass();
            strValueOf = String.valueOf(C1149170g0h.LIZ(th).getErrorCode());
            str3 = "diamond_exchange";
        } else {
            strValueOf = null;
        }
        long jNo0 = ((long) c1144350fsv.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        if (str2 == null) {
            str2 = "";
        }
        C1149680g1W.LJIILIIL("anchor_income", str2, c1144350fsv.LJ, true, strValueOf, C158B.LIZ() - jLongValue, jNo0, c1144350fsv.LIZLLL, str3, bool, "pre_claim");
    }

    public static List LJIILL(List list, int i, String str, Locale locale, boolean z, boolean z2) throws Throwable {
        Object c098200Yq;
        ArrayList arrayList = new ArrayList();
        if (locale == null) {
            try {
                LL.getClass();
                locale = LJIJI();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(str));
        currencyInstance.setMaximumFractionDigits(i);
        currencyInstance.setMinimumFractionDigits(i);
        currencyInstance.setRoundingMode(RoundingMode.CEILING);
        if (!z2) {
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol("");
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(currencyInstance.format((BigDecimal) it2.next()));
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (z) {
                arrayList = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(LL.LJIIJJI(((BigDecimal) it3.next()).doubleValue(), i));
                }
            } else {
                throw thM5exceptionOrNullimpl;
            }
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ List LJIILJJIL(List list, int i, String str, Locale locale, Boolean bool, Boolean bool2) {
        return LJIILL(list, i, str, locale, bool.booleanValue(), bool2.booleanValue());
    }

    public static void LJJIJ(EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A, String str, String str2, long j, Function1 function1, Function1 function12) {
        C11NZ<C470590Icr<BalanceStructExtra>> basePackage;
        C480460Ism.LIZ().getClass();
        IapApi iapApi = (IapApi) C480460Ism.LIZLLL(IapApi.class);
        if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            basePackage = iapApi.getBasePackageWithHeaders(enumC1805800x5m.getValue(), enumC1805420x5A.getValue(), str, str2, 101L, j, 2);
        } else {
            basePackage = iapApi.getBasePackage(str, str2, 101L, j, 2);
        }
        basePackage.LJIILIIL(new C0UO0()).LJJLL(new AfS186S0100000_17(function1, 19), new AfS186S0100000_17(function12, 20));
    }

    public final void LJJII(DataChannel dataChannel, long j, Boolean bool, int i, String str, String str2, long j2, String str3) {
        String str4;
        boolean zBooleanValue = bool.booleanValue();
        if (i != 1) {
            if (i != 2) {
                str4 = "";
            } else {
                str4 = "anchor_income";
            }
        } else {
            str4 = "ug_exchange";
        }
        C1149680g1W.LJIIZILJ(j, dataChannel, str4, str, zBooleanValue);
        C1149680g1W.LJIIJ(str4, C1149160g0g.LIZIZ(str, str3, zBooleanValue, LIZ()), str2, j2, String.valueOf(j), str, Boolean.valueOf(C1805400x58.LIZ(str, false)), str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public final void LJIJJ(Context context, DataChannel dataChannel, int i, Long l, String str, Long l2, String str2, boolean z, String str3) {
        boolean z2;
        EnumC1805800x5m enumC1805800x5m;
        EnumC1805800x5m enumC1805800x5m2;
        boolean z3;
        boolean z4;
        String str4;
        String str5;
        String str6;
        boolean z5;
        long jLongValue = l.longValue();
        long jLongValue2 = l2.longValue();
        HashMap<String, String> mapLJIIIZ = LJIIIZ(i, str2, false);
        if (!C1131530fYF.LJ(str) && !C1131530fYF.LJFF(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        WalletCenter walletCenter = C1151110g3p.LIZ;
        EnumC1805710x5d enumC1805710x5d = EnumC1805710x5d.EXCHANGE_SUCCESS;
        if (z2) {
            enumC1805800x5m = EnumC1805800x5m.UG_TASK;
        } else {
            enumC1805800x5m = EnumC1805800x5m.LIVE_DETAIL;
        }
        EnumC1805420x5A enumC1805420x5A = EnumC1805420x5A.EXCHANGE_SUCCESS;
        walletCenter.lj0(enumC1805710x5d, enumC1805800x5m, enumC1805420x5A, mapLJIIIZ, false);
        if (z2) {
            enumC1805800x5m2 = EnumC1805800x5m.UG_TASK;
        } else {
            enumC1805800x5m2 = EnumC1805800x5m.LIVE_DETAIL;
        }
        EnumC1805430x5B enumC1805430x5B = EnumC1805430x5B.EXCHANGE_SUCCESS;
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        walletCenter.yM0(enumC1805800x5m2, enumC1805430x5B, enumC1805420x5A, false, false, z3);
        if (i == 2) {
            if (LL.LJIL()) {
                z5 = true;
            } else {
                if (InterfaceC1094160eZy.S0.LIZIZ().intValue() > 0) {
                    C20337914i1<Boolean> c20337914i1 = InterfaceC1094160eZy.T0;
                    if (c20337914i1.LIZIZ().booleanValue()) {
                        LJJIIZI(context, i, str);
                        c20337914i1.LJFF(Boolean.FALSE);
                    }
                }
                z5 = false;
            }
            C20337914i1<Integer> c20337914i12 = InterfaceC1094160eZy.S0;
            c20337914i12.LJFF(Integer.valueOf(c20337914i12.LIZIZ().intValue() + 1));
            z4 = z5;
        } else {
            z4 = 0;
            z = false;
            z = false;
            z = false;
            boolean z6 = false;
            if (i == 1) {
                if (LL.LJJ()) {
                    z6 = true;
                } else if (InterfaceC1094160eZy.Q0.LIZIZ().intValue() > 0) {
                    C20337914i1<Boolean> c20337914i13 = InterfaceC1094160eZy.R0;
                    if (c20337914i13.LIZIZ().booleanValue() && z) {
                        LJJIIZI(context, i, str);
                        c20337914i13.LJFF(Boolean.FALSE);
                    }
                }
                C20337914i1<Integer> c20337914i14 = InterfaceC1094160eZy.Q0;
                c20337914i14.LJFF(Integer.valueOf(c20337914i14.LIZIZ().intValue() + 1));
                z4 = z6;
            }
        }
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().X41(EnumC1805570x5P.EXCHANGE_SUCCESS);
        if (i == 2 && !LIZ()) {
            return;
        }
        C1149680g1W.LJIILLIIL(dataChannel, jLongValue, str, i, z4);
        if (LiveGiftExchangeFESchema.INSTANCE.isEnableLynxGiftExchange()) {
            if (i == 1) {
                str4 = "ug_exchange";
            } else {
                str4 = "anchor_income";
            }
            HashMap map = new HashMap();
            map.put("gift_id", Long.valueOf(jLongValue));
            if (C497740JfY.LJIL()) {
                str5 = "portrait";
            } else {
                str5 = "landscape";
            }
            map.put("room_orientation", str5);
            map.put("enter_from", str4);
            map.put("gift_enter_from", str);
            map.put("is_auto", Integer.valueOf((int) z4));
            if (C500260Jjc.LJIIZILJ(dataChannel)) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_anchor", str6);
            map.put("user_id", Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
            C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_lynx_auto_send_gift_success", C2348809Ig.LIZLLL(map), null, null, null, "wallet");
        }
        String strLJIIJ = LJIIJ(i, false);
        String strLIZIZ = C1149160g0g.LIZIZ(str, str3, z4, LIZ());
        Boolean boolValueOf = Boolean.valueOf(C1805400x58.LIZ(str, false));
        if (!C1149690g1X.LIZ) {
            return;
        }
        C1149680g1W.LJIILIIL(strLJIIJ, strLIZIZ, str2, false, null, C158B.LIZ() - C1149690g1X.LIZIZ, jLongValue2, str, null, boolValueOf, str3);
        C1149690g1X.LIZ = false;
    }
}

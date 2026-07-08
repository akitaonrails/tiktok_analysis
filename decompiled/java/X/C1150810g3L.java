package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.livesetting.gift.LiveExchangeConfirmThreshold;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1150810g3L extends AbstractC1150840g3O {
    public EnumC1150950g3Z LIZJ = EnumC1150950g3Z.START_GIFT_EXCHANGE;
    public final List<Integer> LIZLLL = C1697810uHb.LJIIJJI(0, 1);
    public final String LJ = "exchange";
    public final String LJFF;
    public final Context LJI;
    public final C1144350fsv LJII;
    public Boolean LJIIIIZZ;
    public Boolean LJIIIZ;
    public long LJIIJ;

    @Override // X.AbstractC1150840g3O
    public final boolean LJIILIIL() {
        return this.LJIIJ <= ((long) LiveExchangeConfirmThreshold.INSTANCE.getValue()) && ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJ();
    }

    public Map<String, String> LJIJI() {
        String str;
        RevenueExchange revenueExchange;
        RevenueExchange revenueExchange2;
        BalanceStructExtra balanceStructExtra;
        BasePackage basePackage;
        BalanceStructExtra balanceStructExtra2;
        BasePackage basePackage2;
        RevenueExchange revenueExchange3;
        BalanceStructExtra balanceStructExtra3;
        BasePackage basePackage3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
        String str2 = (Intrinsics.LJFF(this.LJII.LIZLLL, "redpacket_new") || Intrinsics.LJFF(this.LJII.LIZLLL, "portal") || Intrinsics.LJFF(this.LJII.LIZLLL, "star_comment")) ? this.LJII.LIZLLL : "gift";
        int realDot = 0;
        boolean z = InterfaceC1094160eZy.Q0.LIZIZ().intValue() > 1;
        String strLJIJ = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIJ(this.LJIIJ);
        C1126800fQc.LIZ.M92();
        String str3 = C1133940fc8.LJIIJJI() ? "1" : CardStruct.IStatusCode.DEFAULT;
        linkedHashMap.put("source", "11");
        linkedHashMap.put("biz_exchange_id", this.LJFF);
        linkedHashMap.put("biz_source", str2);
        linkedHashMap.put("way", String.valueOf(((Number) ListProtector.get(this.LIZLLL, 0)).intValue()));
        linkedHashMap.put("exchange_mode", LJ());
        WalletStruct walletStructTF1 = iWalletCenterWalletCenter.TF1();
        Boolean boolValueOf = null;
        linkedHashMap.put("is_periodic_payout", String.valueOf(walletStructTF1 != null ? Boolean.valueOf(walletStructTF1.isPeriodicPayout) : null));
        linkedHashMap.put("sub_source", "112");
        linkedHashMap.put("require_billing_address", String.valueOf(this.LJIIIZ));
        linkedHashMap.put("is_in_auto_exchange_region", "true");
        linkedHashMap.put("show_auto_exchange", String.valueOf(z));
        linkedHashMap.put("short_coin_num", String.valueOf(this.LJIIJ));
        linkedHashMap.put("coin_balance", String.valueOf(iWalletCenterWalletCenter.No0()));
        linkedHashMap.put("short_coin_currency_value", strLJIJ);
        linkedHashMap.put("exchange_cancel_count", InterfaceC1094160eZy.K0.LIZIZ().toString());
        WalletStruct walletStructTF12 = iWalletCenterWalletCenter.TF1();
        long price = 0;
        linkedHashMap.put("diamond_id", String.valueOf((walletStructTF12 == null || (balanceStructExtra3 = walletStructTF12.LIZ) == null || (basePackage3 = balanceStructExtra3.getBasePackage()) == null) ? 0L : basePackage3.getId()));
        WalletStruct walletStructTF13 = iWalletCenterWalletCenter.TF1();
        if (walletStructTF13 == null || (revenueExchange3 = walletStructTF13.revenue) == null || (str = revenueExchange3.currency) == null) {
            str = "";
        }
        linkedHashMap.put("currency_code", str);
        WalletStruct walletStructTF14 = iWalletCenterWalletCenter.TF1();
        if (walletStructTF14 != null && (balanceStructExtra2 = walletStructTF14.LIZ) != null && (basePackage2 = balanceStructExtra2.getBasePackage()) != null) {
            realDot = basePackage2.getRealDot();
        }
        linkedHashMap.put("currency_dot", String.valueOf(realDot));
        linkedHashMap.put("gift_source", this.LJII.LIZLLL);
        WalletStruct walletStructTF15 = iWalletCenterWalletCenter.TF1();
        if (walletStructTF15 != null && (balanceStructExtra = walletStructTF15.LIZ) != null && (basePackage = balanceStructExtra.getBasePackage()) != null) {
            price = basePackage.getPrice();
        }
        linkedHashMap.put("local_amount", String.valueOf(price * this.LJIIJ));
        linkedHashMap.put("is_first_recharge", str3);
        WalletStruct walletStructTF16 = iWalletCenterWalletCenter.TF1();
        linkedHashMap.put("show_exchange_tooltip", String.valueOf((walletStructTF16 == null || (revenueExchange2 = walletStructTF16.revenue) == null) ? null : Boolean.valueOf(revenueExchange2.showExchangeTooltip)));
        WalletStruct walletStructTF17 = iWalletCenterWalletCenter.TF1();
        if (walletStructTF17 != null && (revenueExchange = walletStructTF17.revenue) != null) {
            boolValueOf = Boolean.valueOf(revenueExchange.showExchangeAmountAdjustedText);
        }
        linkedHashMap.put("show_exchange_amount_adjusted_text", String.valueOf(boolValueOf));
        linkedHashMap.put("exchange_type", "ug_exchange");
        linkedHashMap.put("exchange_scenario", "room_gift_manual_send_directly");
        linkedHashMap.put("gift_enter_from", this.LJII.LIZLLL);
        linkedHashMap.put("charge_reason", this.LJII.LJ);
        linkedHashMap.put("request_page", "live_detail");
        linkedHashMap.put("live_scene", ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Fc2());
        boolean zLJIILIIL = LJIILIIL();
        C1144350fsv c1144350fsv = this.LJII;
        if (C1805400x58.LIZIZ(zLJIILIIL, c1144350fsv.LIZIZ, c1144350fsv.LIZLLL, c1144350fsv.LIZJ, true, c1144350fsv.LIZ)) {
            C1144350fsv c1144350fsv2 = this.LJII;
            linkedHashMap.put("reward_amount_used_in_advance", String.valueOf(C1131530fYF.LIZIZ(c1144350fsv2.LIZJ, c1144350fsv2.LIZ)));
            linkedHashMap.put("skip_exchange_confirmation_popup", "true");
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC1150840g3O
    public final String LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC1150840g3O
    public final Context LIZLLL() {
        return this.LJI;
    }

    @Override // X.AbstractC1150840g3O
    public String LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC1150840g3O
    public final List<Integer> LJFF() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1150840g3O
    public final EnumC1150950g3Z LJI() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1150840g3O
    public final long LJII() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC1150840g3O
    public final C1144350fsv LJIIIIZZ() {
        return this.LJII;
    }

    @Override // X.AbstractC1150840g3O
    public final Boolean LJIIIZ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC1150840g3O
    public final Boolean LJIIJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1150840g3O
    public final boolean LIZIZ(boolean z) {
        long coins;
        BalanceStructExtra balanceStructExtra;
        BalanceStruct balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52();
        if (balanceStructG52 != null && (balanceStructExtra = balanceStructG52.exchangeInfo) != null) {
            coins = balanceStructExtra.getCoins();
        } else {
            coins = 0;
        }
        long jNo0 = ((long) this.LJII.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        this.LJIIJ = jNo0;
        if (balanceStructG52 == null || balanceStructG52.exchangeInfo == null || !balanceStructG52.validUser || jNo0 > coins || (!C1150830g3N.LJ(LJ()) && !LJIILIIL())) {
            this.LIZJ = EnumC1150950g3Z.EXCHANGE_FAILURE;
            LJIIJJI(this.LJI);
            return false;
        }
        if (!z && this.LJI != null) {
            if (this.LJII.LIZJ != 0) {
                boolean zLJIILIIL = LJIILIIL();
                C1144350fsv c1144350fsv = this.LJII;
                C1149680g1W.LJIIJJI("anchor_income", C1149160g0g.LIZIZ(c1144350fsv.LIZLLL, null, zLJIILIIL, true), c1144350fsv.LJ, zLJIILIIL);
            }
            this.LIZJ = EnumC1150950g3Z.CHECK_BALANCE_AMOUNT;
            LJIIJJI(this.LJI);
        }
        return true;
    }

    @Override // X.AbstractC1150840g3O
    public final void LJIILLIIL(EnumC1150950g3Z enumC1150950g3Z) {
        this.LIZJ = enumC1150950g3Z;
    }

    @Override // X.AbstractC1150840g3O
    public final void LJIIZILJ(Boolean bool) {
        this.LJIIIZ = bool;
    }

    @Override // X.AbstractC1150840g3O
    public final void LJIJ(Boolean bool) {
        this.LJIIIIZZ = bool;
    }

    @Override // X.AbstractC1150840g3O
    public final C495520Jby LIZ(Context context, C495520Jby c495520Jby) {
        for (Map.Entry<String, String> entry : LJIJI().entrySet()) {
            c495520Jby.LIZJ(entry.getKey(), entry.getValue());
        }
        C1803420x1w.LIZ(c495520Jby, context);
        return c495520Jby;
    }

    public C1150810g3L(String str, Context context, C1144350fsv c1144350fsv) {
        this.LJFF = str;
        this.LJI = context;
        this.LJII = c1144350fsv;
    }
}

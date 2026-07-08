package X;

import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnViewModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0fzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnViewModel$exchange$2", f = "RechargeBtnViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1148460fzY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1151410g4J LL;
    public final /* synthetic */ RechargePanelInputParams LLILLJJLI;
    public final /* synthetic */ RechargeBtnViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1148460fzY(C1151410g4J c1151410g4J, RechargePanelInputParams rechargePanelInputParams, RechargeBtnViewModel rechargeBtnViewModel, InterfaceC1364105Vn<? super C1148460fzY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1151410g4J;
        this.LLILLJJLI = rechargePanelInputParams;
        this.LLILLL = rechargeBtnViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1148460fzY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RechargePanelExchangeParams rechargePanelExchangeParams;
        int iLongValue;
        int i;
        long jLongValue;
        int i2;
        String str;
        String str2;
        Long l;
        C1C7U.LIZ("RechargeBtnViewModel@27e9.exchange$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1151410g4J c1151410g4J = this.LL;
        RechargePanelInputParams rechargePanelInputParams = this.LLILLJJLI;
        AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this.LLILLL, 554);
        if (rechargePanelInputParams != null && (rechargePanelExchangeParams = rechargePanelInputParams.exchangeParams) != null) {
            long j = c1151410g4J.LLILLJJLI;
            ExchangeParams exchangeParams = new ExchangeParams();
            Long l2 = rechargePanelExchangeParams.basePackageId;
            int iIntValue = 0;
            if (l2 != null) {
                iLongValue = (int) l2.longValue();
            } else {
                iLongValue = 0;
            }
            exchangeParams.diamondId = iLongValue;
            Integer num = rechargePanelExchangeParams.way;
            if (num != null) {
                iIntValue = num.intValue();
            }
            exchangeParams.way = iIntValue;
            if (Intrinsics.LJFF(rechargePanelInputParams.giftEnterFrom, "balance_page")) {
                i = 9;
            } else {
                i = 19;
            }
            exchangeParams.source = i;
            exchangeParams.coinsCount = j;
            RechargePanelExchangeParams rechargePanelExchangeParams2 = rechargePanelInputParams.exchangeParams;
            long jLongValue2 = 0;
            if (rechargePanelExchangeParams2 != null && (l = rechargePanelExchangeParams2.basePackagePrice) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            exchangeParams.localAmount = jLongValue * j;
            String str3 = rechargePanelExchangeParams.currencyCode;
            if (str3 == null) {
                str3 = "";
            }
            exchangeParams.currency = str3;
            exchangeParams.amount = C1149560g1K.LIZ(j, rechargePanelExchangeParams);
            String str4 = rechargePanelExchangeParams.symbol;
            if (str4 == null) {
                str4 = "";
            }
            exchangeParams.symbol = str4;
            Long l3 = rechargePanelExchangeParams.realDot;
            if (l3 != null) {
                jLongValue2 = l3.longValue();
            }
            exchangeParams.currencyDot = jLongValue2;
            exchangeParams.penaltyWarningSkip = "";
            if (C1149560g1K.LIZLLL(rechargePanelInputParams)) {
                i2 = 905;
            } else {
                i2 = 114;
            }
            exchangeParams.subSource = i2;
            exchangeParams.exchangeLevel = "";
            C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
            exchangeParams.isFirstRecharge = C1133940fc8.LJIIJJI();
            C1134860fdc c1134860fdc = C1134860fdc.LIZ;
            exchangeParams.campaignType = c1134860fdc.LIZ();
            HashMap<String, String> map = new HashMap<>();
            map.put("first_recharge_exchange_source", "special_page");
            map.put("first_recharge_exchange_entrance_page", "package");
            if (C1133940fc8.LJII() > 0) {
                str = "has_gift";
            } else {
                str = "not_has_gift";
            }
            map.put("first_recharge_bonus_type", str);
            map.put("can_exchange", "1");
            map.put("if_has_exchange_option", "1");
            map.put("exchange_coins", String.valueOf(j));
            map.put("exchange_level", "system_combo");
            map.put("exchange_panel", "package_page");
            C1126800fQc.LIZ.py();
            map.put("gift_id", String.valueOf(C1134860fdc.LJI()));
            map.put("strategy_task_type", String.valueOf(c1134860fdc.LIZ()));
            if (C1149560g1K.LIZLLL(rechargePanelInputParams)) {
                str2 = "wallet_first_recharge_package";
            } else {
                str2 = "room_first_recharge_package";
            }
            map.put("exchange_scenario", str2);
            map.put("gift_enter_from", rechargePanelInputParams.giftEnterFrom);
            exchangeParams.eventParams = map;
            C1149560g1K.LJFF(exchangeParams, awS596S0100000_17);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeBtnViewModel@27e9.exchange$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

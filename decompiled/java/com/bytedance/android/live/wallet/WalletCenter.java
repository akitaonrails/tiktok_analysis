package com.bytedance.android.live.wallet;

import X.AbstractC19484711Kz;
import X.AbstractC497160Jec;
import X.C098D;
import X.C09JN;
import X.C0IJT;
import X.C0PEM;
import X.C0UO0;
import X.C1149150g0f;
import X.C1150880g3S;
import X.C1161920gLG;
import X.C11NZ;
import X.C11O8;
import X.C11RK;
import X.C11S5;
import X.C1567380qtE;
import X.C1567390qtF;
import X.C1701940uOG;
import X.C1796440wqg;
import X.C1797270ws1;
import X.C1803800x2Y;
import X.C1805310x4z;
import X.C1805320x50;
import X.C1805390x57;
import X.C1805440x5C;
import X.C1805490x5H;
import X.C1805760x5i;
import X.C1806570x71;
import X.C1807350x8H;
import X.C19487011Lw;
import X.C19500311Qz;
import X.C1DFH;
import X.C20337914i1;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C470590Icr;
import X.C474500IjA;
import X.C480460Ism;
import X.C496230Jd7;
import X.C497120JeY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C823050WQl;
import X.EnumC1151140g3s;
import X.EnumC1803160x1W;
import X.EnumC1805420x5A;
import X.EnumC1805430x5B;
import X.EnumC1805570x5P;
import X.EnumC1805710x5d;
import X.EnumC1805800x5m;
import X.EnumC1988207qa;
import X.EnumC1993907rV;
import X.InterfaceC1094160eZy;
import X.InterfaceC1791820wjE;
import X.InterfaceC1791930wjP;
import X.InterfaceC1803980x2q;
import X.InterfaceC1806200x6Q;
import Y.AObjectS25S2100000_27;
import Y.AObjectS370S0100000_27;
import Y.ARunnableS127S0100000_27;
import Y.AfS110S0300000_17;
import Y.AfS132S0000000_7;
import Y.AfS138S0000000_16;
import Y.AfS186S0100000_17;
import Y.AfS196S0100000_27;
import android.os.SystemClock;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.data.api.IRevenueApi;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.live.wallet.data.model.wallet.LiveRevenueSwitchABResult;
import com.bytedance.android.live.wallet.data.model.wallet.LiveTransactionSwitchABResult;
import com.bytedance.android.live.wallet.data.model.wallet.WalletInfoExtra;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.livesetting.wallet.LiveBalanceTrackingSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEmailIncentiveKillSwitchSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEmailIncentiveSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveExchangeTaxEnableSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeCancelRetentionExperiment;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeSupportUGExchange;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRefreshProfileBalanceControlSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveUgBalanceRequestOptSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletApiTrackingSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFixFirstRechargeEventTracking;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGiftingOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletInfoDelaySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletPreloadWebviewConfigSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletQueryProductTimeOut;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeReminderBubbleConfig;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeReminderPushConfig;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceBalanceShownSetting;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceKillswitch;
import com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceLocationMoveSetting;
import com.bytedance.android.livesdk.livesetting.wallet.WalletProfileEntranceRedDotEnabledSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.wallet.tiktok.CheckEmailNotificationEligibilityResult;
import tikcast.api.wallet.tiktok.GetTotalBalanceResponse;
import webcast.api.profit.IapListResult;
import webcast.data.RechargeRetentionPopupConfig;

/* JADX INFO: loaded from: classes28.dex */
public class WalletCenter implements IWalletCenter {
    public WalletStruct LL;
    public WalletInfoExtra LLILLJJLI;
    public ExchangeDisplayInfo LLILLL;
    public GetTotalBalanceResponse.GetTotalBalanceData LLILZ;
    public BalanceStruct LLILZIL;
    public final C11RK LLILZLL;
    public final C11RK LLIZ;
    public final C11RK LLIZLLLIL;
    public C1807350x8H LLJ;
    public EnumC1151140g3s LLJI;
    public EnumC1151140g3s LLJIJIL;
    public EnumC1151140g3s LLJILJIL;
    public final C11RK LLJILJILJ;
    public final HashMap<Integer, InterfaceC1806200x6Q> LLJILLL;
    public IapListResult.ListResultExtra LLJJ;

    public static List LJIILLIIL() {
        ArrayList arrayList = new ArrayList();
        if (!LiveRechargeCancelRetentionExperiment.INSTANCE.disableCancelRetention()) {
            arrayList.add("recharge_cancel_retention_dialog");
        }
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3()) {
            arrayList.add("recharge_v3_retention_dialog");
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final boolean Aj1() {
        return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getPushSettingStatus("live_transaction_push").booleanValue();
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final C11O8 EU() {
        return this.LLIZ.LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final boolean JE1() {
        this.LLJ.getClass();
        return LiveWalletFixFirstRechargeEventTracking.INSTANCE.getValue();
    }

    @Override // X.InterfaceC1253830ijV
    public final boolean LIZ() {
        return WalletEntranceBalanceShownSetting.INSTANCE.shouldShowBAccountBalance();
    }

    @Override // X.InterfaceC1253830ijV
    public final void LIZLLL() {
        LJIL(EnumC1993907rV.TAB_RESUMED);
    }

    @Override // X.InterfaceC1253830ijV
    public final C11O8 LJ() {
        return this.LLIZLLLIL.LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    @Override // X.InterfaceC1253830ijV
    public final void LJFF() {
        if (LiveWalletPreloadWebviewConfigSetting.INSTANCE.getValue().enablePrecreate) {
            C1567390qtF c1567390qtF = C1567390qtF.LIZIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C1567380qtE(null), 3);
        }
    }

    @Override // X.InterfaceC1253830ijV
    public final boolean LJII() {
        if (!WalletProfileEntranceRedDotEnabledSetting.INSTANCE.getValue()) {
            return false;
        }
        Keva keva = C1806570x71.LIZ;
        Keva keva2 = C1806570x71.LIZ;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wallet_show_red_dot");
        sbLIZ.append(strValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (keva2.getBoolean(strLIZIZ, false)) {
            return false;
        }
        keva2.storeBoolean(strLIZIZ, true);
        return true;
    }

    @Override // X.InterfaceC1253830ijV
    public final boolean LJIIIZ() {
        return (WalletEntranceLocationMoveSetting.INSTANCE.shouldDisplayInSettingsNavBar() || WalletEntranceBalanceShownSetting.INSTANCE.shouldShowWalletEntrance()) && !WalletEntranceKillswitch.INSTANCE.isWalletEntranceKillswitchEnabled();
    }

    @Override // X.InterfaceC1253830ijV
    public final boolean LJIIJ() {
        return LiveWalletRechargeReminderPushConfig.INSTANCE.getValue().showLiveCustomizedUpdateSwitch;
    }

    @Override // X.InterfaceC1253830ijV
    public final String LJIIJJI() {
        GetTotalBalanceResponse.GetTotalBalanceData getTotalBalanceData = this.LLILZ;
        GetTotalBalanceResponse.BalanceInfo balanceInfo = getTotalBalanceData.balance;
        if (balanceInfo != null && getTotalBalanceData.hasIncomeBefore && !balanceInfo.symbol.isEmpty() && LJIIL()) {
            try {
                IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
                List listSingletonList = Collections.singletonList(new BigDecimal(this.LLILZ.balance.amount));
                GetTotalBalanceResponse.BalanceInfo balanceInfo2 = this.LLILZ.balance;
                return (String) ((WalletExchange) iWalletExchangeWalletExchange).LJIILJJIL(listSingletonList, balanceInfo2.decimalPlace, balanceInfo2.code, null, Boolean.FALSE, Boolean.TRUE).get(0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return "";
    }

    @Override // X.InterfaceC1253830ijV
    public final boolean LJIIL() {
        return WalletEntranceBalanceShownSetting.INSTANCE.shouldShowBalance() & this.LLILZ.hasIncomeBefore;
    }

    @Override // X.InterfaceC1253830ijV
    public final boolean LJIILJJIL() {
        return this.LLILZ.hasIncomeBefore;
    }

    @Override // X.InterfaceC1253830ijV
    public final boolean LJIILL() {
        LiveRefreshProfileBalanceControlSetting liveRefreshProfileBalanceControlSetting = LiveRefreshProfileBalanceControlSetting.INSTANCE;
        return liveRefreshProfileBalanceControlSetting.getValue() == liveRefreshProfileBalanceControlSetting.getDEFAULT();
    }

    public final void LJJI() {
        if (((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).canRedirectRechargeV3()) {
            InterfaceC1791930wjP interfaceC1791930wjP = (InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class);
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (interfaceC1791930wjP == null || iHostAppContext == null) {
                return;
            }
            interfaceC1791930wjP.LJIIIIZZ(iHostAppContext.context(), new InterfaceC1791820wjE() { // from class: X.0x5b
                @Override // X.InterfaceC1791820wjE
                public final void LIZ(C1791770wj9 c1791770wj9) {
                    RechargeRetentionPopupConfig rechargeRetentionPopupConfig;
                    WalletCenter walletCenter = this.LIZ;
                    walletCenter.getClass();
                    if (c1791770wj9.LIZ) {
                        if (walletCenter.LLILLJJLI.getRechargeRetentionPopupConfig().containsKey("recharge_v3_retention_dialog") && (rechargeRetentionPopupConfig = walletCenter.LLILLJJLI.getRechargeRetentionPopupConfig().get("recharge_v3_retention_dialog")) != null) {
                            C1804180x3A.LIZLLL(rechargeRetentionPopupConfig.showRetentionPopup);
                            return;
                        } else {
                            C1804180x3A.LIZLLL(false);
                            return;
                        }
                    }
                    C1804180x3A.LIZLLL(false);
                }
            }, "05816USpPkJiyBnttk");
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final long No0() {
        if (this.LL != null && LJJIFFI()) {
            return this.LL.diamond;
        }
        return 0L;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final C11O8 XF() {
        return this.LLJILJILJ.LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final boolean isFirstRecharge() {
        C1807350x8H c1807350x8H = this.LLJ;
        if (c1807350x8H.LIZ == null || c1807350x8H.LIZIZ == null) {
            c1807350x8H.LIZ();
        }
        c1807350x8H.LIZ = Boolean.valueOf(C500260Jjc.LJJJI(c1807350x8H.LIZ));
        c1807350x8H.LIZIZ = Boolean.valueOf(C500260Jjc.LJJJI(c1807350x8H.LIZIZ));
        return C500260Jjc.LJJJI(c1807350x8H.LIZ);
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final C1149150g0f iz2() {
        UserBalance userBalance;
        RevenueExchange revenueExchange;
        WalletStruct walletStruct = this.LL;
        long j = (walletStruct == null || (revenueExchange = walletStruct.revenue) == null) ? 0L : revenueExchange.balance;
        BalanceStruct balanceStruct = this.LLILZIL;
        return new C1149150g0f(this.LLJI, this.LLJIJIL, this.LLJILJIL, j > 0 || ((balanceStruct == null || (userBalance = balanceStruct.userBalance) == null) ? 0L : userBalance.balance) > 0);
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final boolean kb() {
        C1807350x8H c1807350x8H = this.LLJ;
        if (c1807350x8H.LIZ == null || c1807350x8H.LIZIZ == null) {
            c1807350x8H.LIZ();
        }
        c1807350x8H.LIZ = Boolean.valueOf(C500260Jjc.LJJJI(c1807350x8H.LIZ));
        Boolean boolValueOf = Boolean.valueOf(C500260Jjc.LJJJI(c1807350x8H.LIZIZ));
        c1807350x8H.LIZIZ = boolValueOf;
        return C500260Jjc.LJJJI(boolValueOf);
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final C11O8 l22() {
        return this.LLILZLL.LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0x5H] */
    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final C1805490x5H oN1() {
        return new AbstractC497160Jec<BaseResponse<WalletStruct, WalletInfoExtra>, C496230Jd7>() { // from class: X.0x5H
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/wallet_api_tiktok/wallet/info/";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<BaseResponse<WalletStruct, WalletInfoExtra>>() { // from class: X.0x5r
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<BaseResponse<WalletStruct, WalletInfoExtra>> LJIIIIZZ() {
                new BaseResponse();
                return BaseResponse.class;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                if (!LiveRechargeCancelRetentionExperiment.INSTANCE.disableCancelRetention()) {
                    Collections.singletonList("recharge_cancel_retention_dialog");
                    return null;
                }
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(BaseResponse<WalletStruct, WalletInfoExtra> baseResponse) {
                if (baseResponse.statusCode == 0) {
                    return true;
                }
                return false;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0x5C] */
    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final C1805440x5C pj0() {
        return new AbstractC497160Jec<C470590Icr<BalanceStruct>, C496230Jd7>() { // from class: X.0x5C
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/luckycat/tiktokm/v1/user/balance/get";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<BalanceStruct>>() { // from class: X.0x5x
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<BalanceStruct>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LIZ(C496230Jd7 c496230Jd7) {
                return LiveRechargeSupportUGExchange.INSTANCE.getValue();
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final Map LJI(C496230Jd7 c496230Jd7) {
                return C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, "1"));
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<BalanceStruct> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void sa() {
        if (LiveWalletGiftingOptimizationSetting.INSTANCE.getValue()) {
            this.LLILZIL = null;
            this.LL = null;
        } else {
            this.LLILZIL = new BalanceStruct();
            this.LL = new WalletStruct();
        }
        if (LiveUgBalanceRequestOptSetting.INSTANCE.getValue()) {
            this.LLILZIL = null;
        }
        this.LLILLJJLI = new WalletInfoExtra();
        this.LLJ = new C1807350x8H();
        EnumC1151140g3s enumC1151140g3s = EnumC1151140g3s.INIT;
        this.LLJI = enumC1151140g3s;
        this.LLJIJIL = enumC1151140g3s;
        this.LLJILJIL = enumC1151140g3s;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void tA2() {
        C1807350x8H c1807350x8H = this.LLJ;
        C19487011Lw c19487011Lw = c1807350x8H.LIZJ;
        if (c19487011Lw != null) {
            c19487011Lw.dispose();
        }
        c1807350x8H.LIZJ = null;
        InterfaceC1806200x6Q interfaceC1806200x6QAo2 = ao2(0);
        if (interfaceC1806200x6QAo2 != null) {
            interfaceC1806200x6QAo2.LIZLLL();
            C1805760x5i.LIZ = null;
            C1805760x5i.LIZIZ = null;
            C1805760x5i.LIZJ = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0x57] */
    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final C1805390x57 uC0() {
        return new AbstractC497160Jec<C470590Icr<ExchangeDisplayInfo>, C496230Jd7>() { // from class: X.0x57
            @Override // X.AbstractC497160Jec
            public final void LIZJ() {
            }

            @Override // X.AbstractC497160Jec
            public final String LIZLLL() {
                return "GET";
            }

            @Override // X.AbstractC497160Jec
            public final String LJ() {
                return "/webcast/wallet_api_tiktok/exchange_info";
            }

            @Override // X.AbstractC497160Jec
            public final String LJFF() {
                return "";
            }

            @Override // X.AbstractC497160Jec
            public final Type LJII() {
                return new TypeToken<C470590Icr<ExchangeDisplayInfo>>() { // from class: X.0x5w
                }.getType();
            }

            @Override // X.AbstractC497160Jec
            public final Class<C470590Icr<ExchangeDisplayInfo>> LJIIIIZZ() {
                new C470590Icr();
                return C470590Icr.class;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LIZ(C496230Jd7 c496230Jd7) {
                WalletCenter walletCenter = C1151110g3p.LIZ;
                walletCenter.getClass();
                if (!Long.valueOf(UserService.getInstance().user().getCurrentUserId()).equals(InterfaceC1094160eZy.Y0.LIZIZ())) {
                    return false;
                }
                ExchangeDisplayInfo exchangeDisplayInfo = walletCenter.LLILLL;
                if (exchangeDisplayInfo != null && !exchangeDisplayInfo.isFirstExchange && (exchangeDisplayInfo.w9TaxStatus == 4 || !LiveExchangeTaxEnableSetting.INSTANCE.getValue())) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Object LIZIZ(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final /* bridge */ /* synthetic */ Map LJI(C496230Jd7 c496230Jd7) {
                return null;
            }

            @Override // X.AbstractC497160Jec
            public final boolean LJIIIZ(C470590Icr<ExchangeDisplayInfo> c470590Icr) {
                if (c470590Icr.statusCode == 0) {
                    return true;
                }
                return false;
            }
        };
    }

    public WalletCenter() {
        LiveWalletGiftingOptimizationSetting liveWalletGiftingOptimizationSetting = LiveWalletGiftingOptimizationSetting.INSTANCE;
        this.LL = liveWalletGiftingOptimizationSetting.getValue() ? null : new WalletStruct();
        this.LLILLJJLI = new WalletInfoExtra();
        this.LLILLL = new ExchangeDisplayInfo();
        this.LLILZ = new GetTotalBalanceResponse.GetTotalBalanceData();
        this.LLILZIL = (liveWalletGiftingOptimizationSetting.getValue() || LiveUgBalanceRequestOptSetting.INSTANCE.getValue()) ? null : new BalanceStruct();
        this.LLILZLL = new C11RK();
        this.LLIZ = new C11RK();
        this.LLIZLLLIL = new C11RK();
        this.LLJ = new C1807350x8H();
        EnumC1151140g3s enumC1151140g3s = EnumC1151140g3s.INIT;
        this.LLJI = enumC1151140g3s;
        this.LLJIJIL = enumC1151140g3s;
        this.LLJILJIL = enumC1151140g3s;
        this.LLJILJILJ = new C11RK();
        this.LLJILLL = new HashMap<>();
        this.LLJJ = null;
        C823050WQl.LIZJ().execute(new ARunnableS127S0100000_27(this, 71));
    }

    public static boolean LJJIFFI() {
        return UserService.getInstance().user().isLogin();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1253830ijV
    public final boolean LIZIZ() {
        C480460Ism.LIZ().getClass();
        return ((LiveRevenueSwitchABResult) ((IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class)).getLiveRevenueSwitchAB().LJJIJIIJIL(LiveWalletQueryProductTimeOut.INSTANCE.getValue(), TimeUnit.SECONDS).LJJIFFI(AbstractC19484711Kz.LJIJJLI(new LiveRevenueSwitchABResult())).LJ()).getData().shouldShowLiveRewardsSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1253830ijV
    public final boolean LIZJ() {
        C480460Ism.LIZ().getClass();
        return ((LiveTransactionSwitchABResult) ((IRevenueApi) C480460Ism.LIZLLL(IRevenueApi.class)).getLiveTransactionSwitchAB().LJJIJIIJIL(LiveWalletQueryProductTimeOut.INSTANCE.getValue(), TimeUnit.SECONDS).LJJIFFI(AbstractC19484711Kz.LJIJJLI(new LiveTransactionSwitchABResult())).LJ()).getData().shouldShowLiveTransactionSettings;
    }

    @Override // X.InterfaceC1253830ijV
    public final void LJIIIIZZ() {
        boolean zLJI = MethodIDManager.LJI(137393);
        LJIL(EnumC1993907rV.REFRESH_DATA);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final WalletStruct TF1() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final BalanceStruct g52() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final ExchangeDisplayInfo kL2() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final IapListResult.ListResultExtra vx1() {
        return this.LLJJ;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void JW1(Map<String, String> map) {
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LIZLLL(map);
    }

    public final boolean LJIIZILJ(long j) {
        if (j == 0 || No0() != j) {
            return true;
        }
        return false;
    }

    public final boolean LJIJ(long j) {
        if (this.LL == null || !LJJIFFI() || this.LL.diamond < j) {
            return false;
        }
        return true;
    }

    public final void LJIJI(WalletStruct walletStruct) {
        WalletStruct walletStruct2 = this.LL;
        if (walletStruct2 == null) {
            this.LL = walletStruct;
            return;
        }
        walletStruct2.getClass();
        walletStruct2.LJ(walletStruct.diamond, walletStruct.coinBalanceVersion, walletStruct.frozenDiamond, walletStruct.coinsBalanceVersionV2);
        walletStruct.diamond = this.LL.diamond;
        walletStruct.coinBalanceVersion = this.LL.coinBalanceVersion;
        walletStruct.coinsBalanceVersionV2 = this.LL.coinsBalanceVersionV2;
        walletStruct.frozenDiamond = this.LL.frozenDiamond;
        walletStruct.LIZ = this.LL.LIZ;
        this.LL = walletStruct;
    }

    public final void LJIL(EnumC1993907rV enumC1993907rV) {
        C11NZ<GetTotalBalanceResponse> totalExchangeableBalance;
        boolean zLJI = MethodIDManager.LJI(137392);
        C480460Ism.LIZ().getClass();
        IWalletApi iWalletApi = (IWalletApi) C480460Ism.LIZLLL(IWalletApi.class);
        if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            totalExchangeableBalance = iWalletApi.getTotalExchangeableBalanceWithHeaders(EnumC1805800x5m.PROFILE.getValue(), enumC1993907rV.getValue());
        } else {
            totalExchangeableBalance = iWalletApi.getTotalExchangeableBalance();
        }
        totalExchangeableBalance.LJIILIIL(new C0UO0()).LJJLL(new AfS196S0100000_27(this, 45), new AfS138S0000000_16(19));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void Ri2(EnumC1805420x5A enumC1805420x5A) {
        boolean zLJI = MethodIDManager.LJI(196699);
        LJIJJ(EnumC1805710x5d.OTHERS, EnumC1805800x5m.LIVE_DETAIL, enumC1805420x5A, null, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void X41(EnumC1805570x5P enumC1805570x5P) {
        this.LLJ.LJFF(true, enumC1805570x5P);
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void Yb1(long j) {
        boolean zLJI = MethodIDManager.LJI(202157);
        if (!LJJIFFI()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        WalletStruct walletStruct = this.LL;
        if (walletStruct == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            walletStruct.diamond = j;
            this.LLILZLL.onNext(Long.valueOf(No0()));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final InterfaceC1806200x6Q ao2(int i) {
        if (LiveEmailIncentiveKillSwitchSetting.INSTANCE.getValue()) {
            InterfaceC1806200x6Q interfaceC1806200x6Q = this.LLJILLL.get(Integer.valueOf(i));
            if (interfaceC1806200x6Q == null) {
                if (i != 0) {
                    if (i == 1) {
                        C1805320x50 c1805320x50 = new C1805320x50();
                        this.LLJILLL.put(Integer.valueOf(i), c1805320x50);
                        return c1805320x50;
                    }
                    return interfaceC1806200x6Q;
                }
                C1805320x50 c1805320x502 = new C1805320x50() { // from class: X.0x4x
                    public C1805330x51 LIZJ;

                    public static boolean LJI() {
                        int i2 = LiveEmailIncentiveSetting.INSTANCE.getValue().incentivePopupMaxShowTimes;
                        Double dLIZ = InterfaceC1106030et7.T5.LIZ();
                        return (dLIZ != null ? (int) dLIZ.doubleValue() : 0) < i2;
                    }

                    /* JADX WARN: Type inference failed for: r1v0, types: [X.0foN, X.0x51] */
                    @Override // X.C1805320x50, X.InterfaceC1806200x6Q
                    public final void LIZIZ() {
                        if (this.LIZJ == null && LJ()) {
                            ?? r1 = new InterfaceC1141530foN() { // from class: X.0x51
                                /* JADX WARN: Type inference failed for: r2v1, types: [X.0x5g, X.0x62, X.0x63] */
                                @Override // X.InterfaceC1141530foN
                                public final void mh2(C262100zr c262100zr) {
                                    String str;
                                    String str2;
                                    int iDoubleValue;
                                    String str3;
                                    int i2;
                                    Integer numValueOf;
                                    int i3;
                                    C1805950x61 c1805950x61LIZ = C1805500x5I.LIZ(c262100zr);
                                    AbstractC1805960x62 abstractC1805960x62 = new AbstractC1805960x62() { // from class: X.0x6v
                                    };
                                    String str4 = "1";
                                    if (c1805950x61LIZ.LIZJ) {
                                        str = "1";
                                    } else {
                                        str = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    abstractC1805960x62.LIZ("delay_voucher", str);
                                    abstractC1805960x62.LIZ("mode", c1805950x61LIZ.LIZ);
                                    if (c1805950x61LIZ.LIZIZ) {
                                        str2 = "1";
                                    } else {
                                        str2 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    abstractC1805960x62.LIZ("success", str2);
                                    abstractC1805960x62.LIZIZ();
                                    Double dLIZ = InterfaceC1106030et7.T5.LIZ();
                                    if (dLIZ != null) {
                                        iDoubleValue = (int) dLIZ.doubleValue();
                                    } else {
                                        iDoubleValue = 0;
                                    }
                                    ?? r2 = new AbstractC1805740x5g() { // from class: X.0x63
                                        public final void LJ(String str5) {
                                            LIZ("trigger_position", str5);
                                        }
                                    };
                                    r2.LIZ("page_style", "popup");
                                    r2.LIZ("result_style", "toast");
                                    if (c1805950x61LIZ.LIZIZ) {
                                        str3 = "1";
                                    } else {
                                        str3 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    r2.LIZ("is_success", str3);
                                    String str5 = c1805950x61LIZ.LJFF;
                                    if (str5 == null) {
                                        str5 = "recharge_panel";
                                    }
                                    r2.LJ(str5);
                                    if (!Intrinsics.LJFF(c1805950x61LIZ.LIZ, "incentive")) {
                                        str4 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    r2.LIZ("with_voucher", str4);
                                    String str6 = c1805950x61LIZ.LJ;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    r2.LIZ("bind_type", str6);
                                    r2.LIZ("show_time", String.valueOf(iDoubleValue));
                                    r2.LIZJ();
                                    r2.LIZIZ();
                                    if (c1805950x61LIZ.LIZIZ) {
                                        String str7 = c1805950x61LIZ.LIZ;
                                        if (Intrinsics.LJFF(str7, "normal")) {
                                            if (Intrinsics.LJFF(c1805950x61LIZ.LJ, "only_bind")) {
                                                i3 = 2131855624;
                                            } else {
                                                i3 = 2131852051;
                                            }
                                            numValueOf = Integer.valueOf(i3);
                                        } else {
                                            if (Intrinsics.LJFF(str7, "incentive")) {
                                                if (c1805950x61LIZ.LIZJ) {
                                                    i2 = 2131852050;
                                                } else if (Intrinsics.LJFF(c1805950x61LIZ.LJ, "only_bind")) {
                                                    i2 = 2131855622;
                                                } else {
                                                    i2 = 2131852054;
                                                }
                                                numValueOf = Integer.valueOf(i2);
                                            }
                                            C1805760x5i.LIZ = null;
                                            C1805760x5i.LIZIZ = null;
                                            C1805760x5i.LIZJ = 0L;
                                            InterfaceC1106030et7.S5.LIZJ(Boolean.TRUE);
                                            C1797270ws1.LIZJ().LJIIL(null, null);
                                            C1806860x7U.LJIIIIZZ = LiveEmailIncentiveSetting.INSTANCE.getValue().emailVoucherTemplateId;
                                        }
                                        if (numValueOf != null) {
                                            C766270U4b.LJ(numValueOf.intValue(), 1, C497740JfY.LJII());
                                        }
                                        C1805760x5i.LIZ = null;
                                        C1805760x5i.LIZIZ = null;
                                        C1805760x5i.LIZJ = 0L;
                                        InterfaceC1106030et7.S5.LIZJ(Boolean.TRUE);
                                        C1797270ws1.LIZJ().LJIIL(null, null);
                                        C1806860x7U.LJIIIIZZ = LiveEmailIncentiveSetting.INSTANCE.getValue().emailVoucherTemplateId;
                                    }
                                }
                            };
                            this.LIZJ = r1;
                            C1548820qPI.LIZLLL("email_notif_activated", r1);
                        }
                    }

                    @Override // X.C1805320x50, X.InterfaceC1806200x6Q
                    public final void LIZLLL() {
                        C1805330x51 c1805330x51 = this.LIZJ;
                        if (c1805330x51 != null) {
                            C1548820qPI.LJIIIIZZ("email_notif_activated", c1805330x51);
                            this.LIZJ = null;
                        }
                    }

                    @Override // X.C1805320x50, X.InterfaceC1806200x6Q
                    public final void LIZ() {
                        if (LJ()) {
                            LJFF(true);
                        }
                    }

                    @Override // X.C1805320x50
                    public final boolean LJ() {
                        return super.LJ() && LJI();
                    }

                    @Override // X.C1805320x50, X.InterfaceC1806200x6Q
                    public final boolean LIZJ(EnumC1805630x5V enumC1805630x5V) {
                        CheckEmailNotificationEligibilityResult.Data dataLIZ;
                        boolean z;
                        int i2;
                        boolean z2;
                        int iDoubleValue;
                        int i3;
                        if (!((Boolean) this.LIZIZ.getValue()).booleanValue() || (dataLIZ = C1805760x5i.LIZ()) == null) {
                            return false;
                        }
                        int i4 = dataLIZ.eligibility;
                        if ((i4 != 2 && i4 != 1 && i4 != 5 && i4 != 4) || !LJI()) {
                            return false;
                        }
                        int i5 = C1805700x5c.LIZ[enumC1805630x5V.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                CheckEmailNotificationEligibilityResult.Data dataLIZ2 = C1805760x5i.LIZ();
                                if (dataLIZ2 == null || (((i3 = dataLIZ2.eligibility) != 4 && i3 != 5) || ((int) dataLIZ2.registrationAbTestGroup) != EnumC1781470wSX.AFTER_RECHARGE.getGroup())) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                long j = LiveEmailIncentiveSetting.INSTANCE.getValue().cooldownSeconds;
                                Double dLIZ = InterfaceC1106030et7.U5.LIZ();
                                if (dLIZ != null) {
                                    iDoubleValue = (int) dLIZ.doubleValue();
                                } else {
                                    iDoubleValue = 0;
                                }
                                if (C158B.LIZJ() - ((long) iDoubleValue) <= j || !z2) {
                                    return false;
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            CheckEmailNotificationEligibilityResult.Data dataLIZ3 = C1805760x5i.LIZ();
                            if (dataLIZ3 == null || ((i2 = dataLIZ3.eligibility) != 1 && i2 != 2 && ((i2 != 4 && i2 != 5) || ((int) dataLIZ3.registrationAbTestGroup) != EnumC1781470wSX.RECHARGE_PANEL.getGroup()))) {
                                z = false;
                            } else {
                                z = true;
                            }
                            C01GW<InterfaceC1133710fbl> c01gw = C1805240x4s.LJIIJ;
                            if (C1804990x4T.LIZIZ() || !z) {
                                return false;
                            }
                        }
                        return true;
                    }
                };
                this.LLJILLL.put(Integer.valueOf(i), c1805320x502);
                return c1805320x502;
            }
            return interfaceC1806200x6Q;
        }
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void pv1(EnumC1805570x5P enumC1805570x5P) {
        this.LLJ.LJFF(false, enumC1805570x5P);
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void setIapResultExtra(IapListResult.ListResultExtra listResultExtra) {
        this.LLJJ = listResultExtra;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void JJ0(EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A) {
        boolean zLJI = MethodIDManager.LJI(196699);
        LJIJJ(EnumC1805710x5d.OTHERS, enumC1805800x5m, enumC1805420x5A, null, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void iA1(long j, long j2) {
        boolean zLJI = MethodIDManager.LJI(202265);
        C1797270ws1.LIZJ().LJI(2, j, j2, EnumC1803160x1W.NON_USE, true);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final String tT1(int i, boolean z) {
        RevenueExchange revenueExchange;
        int keepDot;
        UserBalance userBalance;
        int keepDot2;
        double d = 10.0d;
        int i2 = 0;
        if (i == -1) {
            BalanceStruct balanceStruct = this.LLILZIL;
            if (balanceStruct != null && (userBalance = balanceStruct.userBalance) != null) {
                double d2 = userBalance.balance;
                BalanceStructExtra balanceStructExtra = balanceStruct.exchangeInfo;
                if (balanceStructExtra != null && balanceStructExtra.getCurrencyInfo() != null) {
                    keepDot2 = this.LLILZIL.exchangeInfo.getCurrencyInfo().getKeepDot();
                } else {
                    keepDot2 = 0;
                }
                if (!z) {
                    d = 1.0d;
                }
                IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
                double dPow = d2 / Math.pow(d, 2.0d);
                if (z) {
                    i2 = keepDot2;
                }
                return ((WalletExchange) iWalletExchangeWalletExchange).LJIIJJI(dPow, i2);
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        WalletStruct walletStruct = this.LL;
        if (walletStruct != null && (revenueExchange = walletStruct.revenue) != null) {
            double d3 = revenueExchange.balance;
            BalanceStructExtra balanceStructExtra2 = walletStruct.LIZ;
            if (balanceStructExtra2 != null && balanceStructExtra2.getCurrencyInfo() != null) {
                keepDot = this.LL.LIZ.getCurrencyInfo().getKeepDot();
            } else {
                keepDot = 0;
            }
            if (!z) {
                d = 1.0d;
            }
            IWalletExchange iWalletExchangeWalletExchange2 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            double dPow2 = d3 / Math.pow(d, 2.0d);
            if (z) {
                i2 = keepDot;
            }
            return ((WalletExchange) iWalletExchangeWalletExchange2).LJIIJJI(dPow2, i2);
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void JG(String str, String str2, boolean z) {
        if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
            C1150880g3S.LIZIZ(str2, str, null, null, z, true);
        }
    }

    public final void LJIJJLI(EnumC1805800x5m enumC1805800x5m, EnumC1805430x5B enumC1805430x5B, boolean z) {
        String value;
        C11NZ<C470590Icr<ExchangeDisplayInfo>> exchangeInfo;
        ExchangeDisplayInfo exchangeDisplayInfo;
        boolean zLJI = MethodIDManager.LJI(137973);
        Boolean bool = Boolean.TRUE;
        Long lValueOf = Long.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Long> c20337914i1 = InterfaceC1094160eZy.Y0;
        if (!lValueOf.equals(c20337914i1.LIZIZ())) {
            bool = Boolean.FALSE;
            c20337914i1.LJFF(lValueOf);
        }
        if (!bool.booleanValue() || (exchangeDisplayInfo = this.LLILLL) == null || exchangeDisplayInfo.isFirstExchange || (exchangeDisplayInfo.w9TaxStatus != 4 && LiveExchangeTaxEnableSetting.INSTANCE.getValue())) {
            String value2 = "";
            if (enumC1805800x5m == null) {
                value = "";
            } else {
                value = enumC1805800x5m.getValue();
            }
            if (enumC1805430x5B != null) {
                value2 = enumC1805430x5B.getValue();
            }
            C480460Ism.LIZ().getClass();
            IWalletApi iWalletApi = (IWalletApi) C480460Ism.LIZLLL(IWalletApi.class);
            if (z && LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/wallet_api_tiktok/exchange_info")) {
                exchangeInfo = C497120JeY.LJIIZILJ.LIZIZ("/webcast/wallet_api_tiktok/exchange_info", new AObjectS25S2100000_27(iWalletApi, value, value2, 0));
            } else if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
                exchangeInfo = iWalletApi.getExchangeInfoWithHeader(value, value2);
            } else {
                exchangeInfo = iWalletApi.getExchangeInfo();
            }
            if (exchangeInfo == null) {
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            } else {
                exchangeInfo.LJIILIIL(new C0UO0()).LJJLL(new AfS196S0100000_27(this, 44), new AfS132S0000000_7(49));
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJ(EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A, boolean z) {
        String value;
        C11NZ<C470590Icr<BalanceStruct>> uGBalanceInfo;
        boolean zLJI = MethodIDManager.LJI(137890);
        if (!LiveRechargeSupportUGExchange.INSTANCE.getValue()) {
            this.LLIZ.onNext(0L);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        String value2 = "";
        if (enumC1805800x5m == null) {
            value = "";
        } else {
            value = enumC1805800x5m.getValue();
        }
        if (enumC1805420x5A != null) {
            value2 = enumC1805420x5A.getValue();
        }
        C480460Ism.LIZ().getClass();
        IWalletApi iWalletApi = (IWalletApi) C480460Ism.LIZLLL(IWalletApi.class);
        if (z && LiveCombineRequestExp.INSTANCE.enableForRequest("/luckycat/tiktokm/v1/user/balance/get")) {
            uGBalanceInfo = C497120JeY.LJIIZILJ.LIZIZ("/luckycat/tiktokm/v1/user/balance/get", new AObjectS25S2100000_27(iWalletApi, value, value2, 1));
        } else if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            uGBalanceInfo = iWalletApi.getUGBalanceInfoWithHeader(value, value2, 1);
        } else {
            uGBalanceInfo = iWalletApi.getUGBalanceInfo(1);
        }
        if (uGBalanceInfo == null) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            uGBalanceInfo.LJIILIIL(new C0UO0()).LJJLL(new AfS110S0300000_17(this, enumC1805800x5m, enumC1805420x5A, 3), new AfS186S0100000_17(this, 145));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void a11(int i, long j, long j2) {
        if (this.LL != null && LJJIFFI() && i == EnumC1988207qa.LIVE_BALANCE.getType()) {
            this.LL.LJ(j, j2, 0L, j2);
            this.LLILZLL.onNext(Long.valueOf(No0()));
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void aF2(final EnumC1805800x5m enumC1805800x5m, final EnumC1805420x5A enumC1805420x5A, final InterfaceC1803980x2q interfaceC1803980x2q) {
        long jLIZ;
        C11NZ<BaseResponse<WalletStruct, WalletInfoExtra>> walletInfoNew;
        boolean zLJI = MethodIDManager.LJI(196699);
        if (!LJJIFFI()) {
            C501470JlZ c501470JlZ = new C501470JlZ(-666);
            c501470JlZ.setErrorMsg("user doesn't login");
            interfaceC1803980x2q.LIZIZ(c501470JlZ);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        final long jUptimeMillis = SystemClock.uptimeMillis();
        long jNo0 = No0();
        WalletStruct walletStruct = this.LL;
        if (walletStruct == null) {
            jLIZ = 0;
        } else {
            jLIZ = walletStruct.LIZ();
        }
        List<String> listLJIILLIIL = LJIILLIIL();
        C480460Ism.LIZ().getClass();
        IWalletApi iWalletApi = (IWalletApi) C480460Ism.LIZLLL(IWalletApi.class);
        if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            walletInfoNew = iWalletApi.getLiveBalanceInfoWithHeader(enumC1805800x5m.getValue(), enumC1805420x5A.getValue(), listLJIILLIIL);
        } else {
            walletInfoNew = iWalletApi.getWalletInfoNew(listLJIILLIIL);
        }
        final long j = jLIZ;
        walletInfoNew.LJIILIIL(new C0UO0()).LJJLL(new C1805310x4z(this, enumC1805800x5m, enumC1805420x5A, interfaceC1803980x2q, jUptimeMillis, jLIZ, jNo0), new C09JN<Throwable>() { // from class: X.0x2o
            @Override // X.C09JN
            public final void accept(Throwable th) {
                int errorCode;
                long jLIZ2;
                C1C7U.LIZ("WalletCenter@6213.sync$2");
                Throwable th2 = th;
                this.LLILZLL.LLJI = EnumC1151140g3s.FAILED;
                HashMap map = new HashMap();
                map.put("error_msg", th2.getMessage());
                if (th2 instanceof C501520Jle) {
                    errorCode = ((C501520Jle) th2).getErrorCode();
                } else {
                    errorCode = -16;
                }
                map.put("error_code", Integer.valueOf(errorCode));
                C1807660x8m.LIZLLL(1, C0KQH.LIZIZ("ttlive_charge_current_diamond_status"), map, SystemClock.uptimeMillis() - jUptimeMillis);
                C1803970x2p.LIZ(SystemClock.uptimeMillis() - jUptimeMillis, 1, map);
                interfaceC1803980x2q.LIZIZ(th2);
                if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
                    String value = enumC1805800x5m.getValue();
                    String value2 = enumC1805420x5A.getValue();
                    Long lValueOf = Long.valueOf(j);
                    WalletStruct walletStruct2 = this.LLILZLL.LL;
                    if (walletStruct2 == null) {
                        jLIZ2 = 0;
                    } else {
                        jLIZ2 = walletStruct2.LIZ();
                    }
                    C1150880g3S.LIZIZ(value, value2, lValueOf, Long.valueOf(jLIZ2), false, false);
                }
                C1C7U.LIZIZ("WalletCenter@6213.sync$2");
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void gi0(long j, long j2, boolean z, String str) {
        if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
            C1150880g3S.LIZIZ(null, str, Long.valueOf(j), Long.valueOf(j2), z, true);
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void xM0(EnumC1805800x5m enumC1805800x5m, EnumC1805430x5B enumC1805430x5B, EnumC1805420x5A enumC1805420x5A, boolean z) {
        boolean zLJI = MethodIDManager.LJI(137889);
        if (!LJJIFFI()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            LJIJJLI(enumC1805800x5m, enumC1805430x5B, false);
            LJJ(enumC1805800x5m, enumC1805420x5A, false);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public final void LJIJJ(final EnumC1805710x5d enumC1805710x5d, final EnumC1805800x5m enumC1805800x5m, final EnumC1805420x5A enumC1805420x5A, final HashMap<String, String> map, boolean z) {
        final long jLIZ;
        C11NZ<BaseResponse<WalletStruct, WalletInfoExtra>> walletInfoNew;
        if (!LJJIFFI()) {
            return;
        }
        final long jNo0 = No0();
        WalletStruct walletStruct = this.LL;
        long value = 0;
        if (walletStruct == null) {
            jLIZ = 0;
        } else {
            jLIZ = walletStruct.LIZ();
        }
        EnumC1805710x5d enumC1805710x5d2 = EnumC1805710x5d.LIVE_ROOM_PRELOAD;
        if (enumC1805710x5d == enumC1805710x5d2) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_preload_calling_wallet_api");
            c474500IjALIZ.LJJII(C1796440wqg.LIZ(), "pay_method");
            c474500IjALIZ.LJJII("live_room", "request_page");
            c474500IjALIZ.LIZ();
        }
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final List<String> listLJIILLIIL = LJIILLIIL();
        C480460Ism.LIZ().getClass();
        final IWalletApi iWalletApi = (IWalletApi) C480460Ism.LIZLLL(IWalletApi.class);
        if (z && LiveCombineRequestExp.INSTANCE.enableForRequest("/webcast/wallet_api_tiktok/wallet/info/")) {
            walletInfoNew = C497120JeY.LJIIZILJ.LIZIZ("/webcast/wallet_api_tiktok/wallet/info/", new Function0<C11NZ<BaseResponse<WalletStruct, WalletInfoExtra>>>() { // from class: X.0x4j
                @Override // kotlin.jvm.functions.Function0
                public final C11NZ<BaseResponse<WalletStruct, WalletInfoExtra>> invoke() {
                    return LiveWalletApiTrackingSetting.INSTANCE.getValue() ? iWalletApi.getLiveBalanceInfoWithHeader(enumC1805800x5m.getValue(), enumC1805420x5A.getValue(), listLJIILLIIL) : iWalletApi.getWalletInfoNew(listLJIILLIIL);
                }
            });
        } else if (LiveWalletApiTrackingSetting.INSTANCE.getValue()) {
            walletInfoNew = iWalletApi.getLiveBalanceInfoWithHeader(enumC1805800x5m.getValue(), enumC1805420x5A.getValue(), listLJIILLIIL);
        } else {
            walletInfoNew = iWalletApi.getWalletInfoNew(listLJIILLIIL);
        }
        C098D c098dLJIILIIL = walletInfoNew.LJIILIIL(new C0UO0());
        if (enumC1805710x5d == enumC1805710x5d2) {
            value = LiveWalletInfoDelaySetting.INSTANCE.getValue();
        }
        final long j = jLIZ;
        new C19500311Qz(c098dLJIILIIL, C11NZ.LJLJL(value, TimeUnit.SECONDS, C11S5.LIZIZ)).LJJLL(new C09JN() { // from class: X.0x4y
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C09JN
            public final void accept(Object obj) {
                EnumC1805800x5m enumC1805800x5m2;
                EnumC1805420x5A enumC1805420x5A2;
                boolean z2;
                String str;
                long j2;
                Boolean boolValueOf;
                Map<String, String> map2;
                String str2;
                String str3;
                final boolean z3;
                String str4;
                String str5;
                BalanceStructExtra balanceStructExtra;
                RevenueExchange revenueExchange;
                WalletCenter walletCenter = this.LL;
                EnumC1805800x5m enumC1805800x5m3 = enumC1805800x5m;
                EnumC1805420x5A enumC1805420x5A3 = enumC1805420x5A;
                EnumC1805710x5d enumC1805710x5d3 = enumC1805710x5d;
                long j3 = jUptimeMillis;
                HashMap map3 = map;
                long j4 = jNo0;
                long j5 = jLIZ;
                BaseResponse baseResponse = (BaseResponse) obj;
                walletCenter.getClass();
                C1C7U.LIZ("WalletCenter@6213.syncCommon$1L");
                HashMap map4 = new HashMap();
                WalletStruct walletStruct2 = (WalletStruct) baseResponse.data;
                if (walletStruct2 != null) {
                    walletCenter.LLJI = EnumC1151140g3s.SUCCESS;
                    WalletStruct walletStruct3 = walletCenter.LL;
                    if (walletStruct3 != null) {
                        balanceStructExtra = walletStruct3.LIZ;
                    } else {
                        balanceStructExtra = null;
                    }
                    walletCenter.LJIJI(walletStruct2);
                    WalletExchange walletExchange = WalletExchange.LL;
                    boolean zLIZLLL = walletStruct2.LIZLLL();
                    walletExchange.getClass();
                    WalletExchange.LJJIIZ(zLIZLLL);
                    WalletExchange.LJJIIJZLJL(walletStruct2.LIZJ());
                    WalletStruct walletStruct4 = walletCenter.LL;
                    if (walletStruct4 != null && (revenueExchange = walletStruct4.revenue) != null && revenueExchange.enableExchange) {
                        walletStruct4.LIZ = balanceStructExtra;
                        RevenueExchange revenueExchange2 = walletStruct2.revenue;
                        enumC1805800x5m2 = enumC1805800x5m3;
                        enumC1805420x5A2 = enumC1805420x5A3;
                        WalletExchange.LJJIJ(enumC1805800x5m3, enumC1805420x5A3, revenueExchange2.currency, revenueExchange2.region, revenueExchange2.balance, new AObjectS370S0100000_27(walletCenter, 6), new AObjectS370S0100000_27(walletCenter, 4));
                    } else {
                        enumC1805800x5m2 = enumC1805800x5m3;
                        enumC1805420x5A2 = enumC1805420x5A3;
                    }
                    map4.put("detail_raw_code", Long.valueOf(walletStruct2.diamond));
                } else {
                    enumC1805800x5m2 = enumC1805800x5m3;
                    enumC1805420x5A2 = enumC1805420x5A3;
                    map4.put("detail_raw_code", -1);
                }
                R r = baseResponse.extra;
                if (r != 0) {
                    WalletInfoExtra walletInfoExtra = (WalletInfoExtra) r;
                    walletCenter.LLILLJJLI = walletInfoExtra;
                    if (walletInfoExtra.getRechargeRetentionPopupConfig().containsKey("recharge_cancel_retention_dialog")) {
                        C750340Tc0.LIZJ(walletCenter.LLILLJJLI.getRechargeRetentionPopupConfig().get("recharge_cancel_retention_dialog"));
                    }
                    walletCenter.LJJI();
                }
                walletCenter.LLILZLL.onNext(Long.valueOf(walletCenter.No0()));
                if (enumC1805710x5d3 == EnumC1805710x5d.LIVE_ROOM_PRELOAD) {
                    final long jNo02 = walletCenter.No0();
                    EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
                    if (enterRoomConfig != null) {
                        Map<String, String> map5 = enterRoomConfig.mRoomsData.rechargeReminderPushList;
                        if (map5 != null && (str5 = map5.get("is_recharge_reminder")) != null) {
                            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(str5));
                        } else {
                            boolValueOf = null;
                        }
                        if (!Intrinsics.LJFF(boolValueOf, Boolean.FALSE) && (map2 = enterRoomConfig.mRoomsData.rechargeReminderPushList) != null && (str2 = map2.get("reminder_bubble_coin_balance_threshold")) != null) {
                            final long j6 = CastLongProtector.parseLong(str2);
                            Map<String, String> map6 = enterRoomConfig.mRoomsData.rechargeReminderPushList;
                            if (map6 != null && (str3 = map6.get("coin_balance_log")) != null) {
                                final long j7 = CastLongProtector.parseLong(str3);
                                if (jNo02 <= j6) {
                                    Map<String, String> map7 = enterRoomConfig.mRoomsData.rechargeReminderPushList;
                                    if (map7 != null && (str4 = map7.get("is_bubble_clickable")) != null) {
                                        z3 = Boolean.parseBoolean(str4);
                                    } else {
                                        z3 = false;
                                    }
                                    C473410IhP.LIZJ(new Runnable() { // from class: X.0ZwM
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean zLIZ;
                                            C1C7U.LIZ("RechargeReminderPushBubble@d24a.triggerRechargeReminderPush$1");
                                            try {
                                                C784440Upu.LIZ().LIZIZ(new C1120190fFx(z3, j6, j7, jNo02));
                                            } finally {
                                                if (!zLIZ) {
                                                }
                                            }
                                            C1C7U.LIZIZ("RechargeReminderPushBubble@d24a.triggerRechargeReminderPush$1");
                                        }
                                    }, LiveWalletRechargeReminderBubbleConfig.INSTANCE.getValue().bubbleShowDelaySec * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                }
                            }
                        }
                    }
                }
                C1803970x2p.LIZ(SystemClock.uptimeMillis() - j3, 0, map4);
                int i = C1805730x5f.LIZ[enumC1805710x5d3.ordinal()];
                long jLIZ2 = 0;
                if (i != 1) {
                    if (i == 2 && map3 != null) {
                        if (walletCenter.LJIIZILJ(j4)) {
                            str = "1";
                        } else {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        map3.put("is_update", str);
                        map3.put("request_succeeded", "1");
                        map3.put("scenario", "sync_balance_after_exchange");
                        map3.put("original_coin_version", String.valueOf(j5));
                        WalletStruct walletStruct5 = walletCenter.LL;
                        if (walletStruct5 == null) {
                            j2 = 0;
                        } else {
                            j2 = walletStruct5.coinsBalanceVersionV2;
                        }
                        map3.put("updated_coin_version", String.valueOf(j2));
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_recharge_coins_balance_response");
                        c474500IjALIZ2.LJJIIZI(map3);
                        c474500IjALIZ2.LIZ();
                        C1803800x2Y.LIZ.getClass();
                        C1803800x2Y.LJJJJJL(c474500IjALIZ2);
                    }
                } else {
                    C1803540x28.LIZLLL(walletCenter.No0(), SystemClock.uptimeMillis() - j3, true);
                }
                C1803540x28.LJFF(SystemClock.uptimeMillis() - j3, null, null);
                if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
                    String value2 = enumC1805800x5m2.getValue();
                    String value3 = enumC1805420x5A2.getValue();
                    Long lValueOf = Long.valueOf(j5);
                    WalletStruct walletStruct6 = walletCenter.LL;
                    if (walletStruct6 != null) {
                        jLIZ2 = walletStruct6.LIZ();
                    }
                    Long lValueOf2 = Long.valueOf(jLIZ2);
                    boolean zLJIIZILJ = walletCenter.LJIIZILJ(j4);
                    if (walletStruct2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C1150880g3S.LIZIZ(value2, value3, lValueOf, lValueOf2, zLJIIZILJ, z2);
                }
                C1C7U.LIZIZ("WalletCenter@6213.syncCommon$1L");
            }
        }, new C09JN() { // from class: X.0x2n
            @Override // X.C09JN
            public final void accept(Object obj) {
                int errorCode;
                long j2;
                WalletCenter walletCenter = this.LL;
                long j3 = jUptimeMillis;
                EnumC1805710x5d enumC1805710x5d3 = enumC1805710x5d;
                HashMap map2 = map;
                long j4 = j;
                EnumC1805800x5m enumC1805800x5m2 = enumC1805800x5m;
                EnumC1805420x5A enumC1805420x5A2 = enumC1805420x5A;
                Throwable th = (Throwable) obj;
                walletCenter.getClass();
                C1C7U.LIZ("WalletCenter@6213.syncCommon$2L");
                walletCenter.LLJI = EnumC1151140g3s.FAILED;
                HashMap map3 = new HashMap();
                if (th instanceof C501520Jle) {
                    errorCode = ((C501520Jle) th).getErrorCode();
                } else {
                    errorCode = -16;
                }
                map3.put("error_msg", th.getMessage());
                map3.put("error_code", Integer.valueOf(errorCode));
                C1807660x8m.LIZLLL(1, C0KQH.LIZIZ("ttlive_charge_current_diamond_status"), map3, SystemClock.uptimeMillis() - j3);
                C1803970x2p.LIZ(SystemClock.uptimeMillis() - j3, 1, map3);
                int i = C1805730x5f.LIZ[enumC1805710x5d3.ordinal()];
                long jLIZ2 = 0;
                if (i != 1) {
                    if (i == 2 && map2 != null) {
                        map2.put("is_update", CardStruct.IStatusCode.DEFAULT);
                        map2.put("request_succeeded", CardStruct.IStatusCode.DEFAULT);
                        map2.put("original_coin_version", String.valueOf(j4));
                        WalletStruct walletStruct2 = walletCenter.LL;
                        if (walletStruct2 == null) {
                            j2 = 0;
                        } else {
                            j2 = walletStruct2.coinsBalanceVersionV2;
                        }
                        map2.put("updated_coin_version", String.valueOf(j2));
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_recharge_coins_balance_response");
                        c474500IjALIZ2.LJJIIZI(map2);
                        c474500IjALIZ2.LIZ();
                        C1803800x2Y.LIZ.getClass();
                        C1803800x2Y.LJJJJJL(c474500IjALIZ2);
                    }
                } else {
                    C1803540x28.LIZLLL(walletCenter.No0(), SystemClock.uptimeMillis() - j3, false);
                }
                C1803540x28.LJFF(SystemClock.uptimeMillis() - j3, String.valueOf(errorCode), th.getMessage());
                if (LiveBalanceTrackingSetting.INSTANCE.getValue()) {
                    String value2 = enumC1805800x5m2.getValue();
                    String value3 = enumC1805420x5A2.getValue();
                    Long lValueOf = Long.valueOf(j4);
                    WalletStruct walletStruct3 = walletCenter.LL;
                    if (walletStruct3 != null) {
                        jLIZ2 = walletStruct3.LIZ();
                    }
                    C1150880g3S.LIZIZ(value2, value3, lValueOf, Long.valueOf(jLIZ2), false, false);
                }
                C1C7U.LIZIZ("WalletCenter@6213.syncCommon$2L");
            }
        });
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void lj0(EnumC1805710x5d enumC1805710x5d, EnumC1805800x5m enumC1805800x5m, EnumC1805420x5A enumC1805420x5A, HashMap<String, String> map, boolean z) {
        boolean zLJI = MethodIDManager.LJI(196893);
        LJIJJ(enumC1805710x5d, enumC1805800x5m, enumC1805420x5A, map, z);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletCenter
    public final void yM0(EnumC1805800x5m enumC1805800x5m, EnumC1805430x5B enumC1805430x5B, EnumC1805420x5A enumC1805420x5A, boolean z, boolean z2, boolean z3) {
        boolean zLJI = MethodIDManager.LJI(137889);
        if (!LJJIFFI()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        LJIJJLI(enumC1805800x5m, enumC1805430x5B, z2);
        if (!LiveUgBalanceRequestOptSetting.INSTANCE.getValue() || z3) {
            LJJ(enumC1805800x5m, enumC1805420x5A, z2);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}

package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.CloseCampaignPanelEvent;
import com.bytedance.android.livesdk.api.revenue.strategy.channel.ILiveIncentiveReferralService;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.guide.model.TaskEntranceInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoExtra;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.ConsumptionTaskPanel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel;
import com.bytedance.android.livesdk.impl.revenue.strategy.settings.LiveRechargePanelFallBackSetting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.BackpackRetentionPopupSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveProbeReportForWallet;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IProbeSDK;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.BagItem;

/* JADX INFO: renamed from: X.0fsK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143980fsK implements InterfaceC1144010fsN {
    public static final C1143980fsK LIZ = new C1143980fsK();
    public static String LIZIZ;

    public static boolean LJI() {
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        if (C1133940fc8.LJIIJJI() || c1133940fc8.LIZIZ()) {
            return false;
        }
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        return (taskManagerV2.LJIIJ() || taskManagerV2.LJIIJJI(106)) ? false : true;
    }

    public static void LJIILIIL() {
        IProbeSDK iProbeSDK;
        if (!LiveProbeReportForWallet.INSTANCE.getValue() || (iProbeSDK = (IProbeSDK) C1161920gLG.LIZJ(IProbeSDK.class)) == null) {
            return;
        }
        iProbeSDK.setUpProbeSDK("ttl_inapp_recharge_page", "https://api.tiktokv.com", null);
    }

    public static final void LJIILL() {
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().xM0(EnumC1805800x5m.LIVE_DETAIL, EnumC1805430x5B.UG_COIN_INCENTIVE_TASK, EnumC1805420x5A.UG_COIN_INCENTIVE_TASK, false);
    }

    public static void LIZIZ(Uri.Builder builder) {
        WalletStruct walletStructTF1;
        String str;
        long coins;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        RevenueExchange revenueExchange;
        String str2;
        BalanceStructExtra balanceStructExtra3;
        BalanceStructExtra balanceStructExtra4;
        IWalletCenter iWalletCenterWalletCenter = C1148670fzt.LIZ().walletCenter();
        if (iWalletCenterWalletCenter != null && (walletStructTF1 = iWalletCenterWalletCenter.TF1()) != null) {
            boolean z = false;
            if (walletStructTF1.LIZ != null) {
                WalletStruct walletStructTF12 = iWalletCenterWalletCenter.TF1();
                if (walletStructTF12 != null && walletStructTF12.isPeriodicPayout) {
                    z = true;
                }
                String str3 = "1";
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                builder.appendQueryParameter("is_periodic_payout", str);
                WalletStruct walletStructTF13 = iWalletCenterWalletCenter.TF1();
                if (walletStructTF13 != null && (balanceStructExtra4 = walletStructTF13.LIZ) != null) {
                    coins = balanceStructExtra4.getCoins();
                } else {
                    coins = 0;
                }
                if (coins > 0) {
                    IWalletCenter iWalletCenterWalletCenter2 = C1148670fzt.LIZ().walletCenter();
                    if (iWalletCenterWalletCenter2 != null) {
                        WalletStruct walletStructTF14 = iWalletCenterWalletCenter2.TF1();
                        if (walletStructTF14 != null && (balanceStructExtra3 = walletStructTF14.LIZ) != null) {
                            LIZJ(balanceStructExtra3, builder);
                        }
                        WalletStruct walletStructTF15 = iWalletCenterWalletCenter2.TF1();
                        if (walletStructTF15 != null && (revenueExchange = walletStructTF15.revenue) != null) {
                            builder.appendQueryParameter("balance", iWalletCenterWalletCenter2.tT1(-2, true));
                            if (!revenueExchange.isRevenue()) {
                                str2 = "1";
                            } else {
                                str2 = "2";
                            }
                            builder.appendQueryParameter("exchange_type_for_first", str2);
                        }
                        builder.appendQueryParameter("way", "1");
                        if (Intrinsics.LJFF(InterfaceC1094160eZy.G1.LIZ(), Boolean.TRUE)) {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        builder.appendQueryParameter("is_first_enter", str3);
                    }
                    InterfaceC1094160eZy.G1.LIZJ(Boolean.TRUE);
                    return;
                }
                BalanceStruct balanceStructG52 = iWalletCenterWalletCenter.g52();
                if (balanceStructG52 == null || (balanceStructExtra = balanceStructG52.exchangeInfo) == null || balanceStructExtra.getCoins() <= 0) {
                    return;
                }
                IWalletCenter iWalletCenterWalletCenter3 = C1148670fzt.LIZ().walletCenter();
                if (iWalletCenterWalletCenter3 != null) {
                    BalanceStruct balanceStructG522 = iWalletCenterWalletCenter3.g52();
                    if (balanceStructG522 != null && (balanceStructExtra2 = balanceStructG522.exchangeInfo) != null) {
                        LIZJ(balanceStructExtra2, builder);
                    }
                    BalanceStruct balanceStructG523 = iWalletCenterWalletCenter3.g52();
                    if (balanceStructG523 != null && balanceStructG523.userBalance != null) {
                        builder.appendQueryParameter("balance", iWalletCenterWalletCenter3.tT1(-1, true));
                    }
                    builder.appendQueryParameter("way", CardStruct.IStatusCode.DEFAULT);
                    builder.appendQueryParameter("exchange_type_for_first", "3");
                    if (Intrinsics.LJFF(InterfaceC1094160eZy.G1.LIZ(), Boolean.TRUE)) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    builder.appendQueryParameter("is_first_enter", str3);
                }
                InterfaceC1094160eZy.G1.LIZJ(Boolean.TRUE);
            }
        }
    }

    public static final boolean LJFF(C2436109gd c2436109gd) {
        String path;
        ILiveIncentiveReferralService iLiveIncentiveReferralService;
        Uri uri = c2436109gd.LIZ;
        if (uri != null && (path = uri.getPath()) != null && path.hashCode() == 2033664350 && path.equals("/open_share_panel") && (iLiveIncentiveReferralService = (ILiveIncentiveReferralService) PluggableExtentionKt.pluggableSpi$default(ILiveIncentiveReferralService.class, false, false, false, 14, null)) != null) {
            return iLiveIncentiveReferralService.DO0(c2436109gd);
        }
        return false;
    }

    public static void LJIILJJIL(Function0 function0) {
        C0IF2 c0if2 = new C0IF2(1);
        C1121570fIB c1121570fIB = new C1121570fIB((User) null);
        c1121570fIB.LIZJ = "campaign_recharge";
        c1121570fIB.LJIILIIL = SystemClock.uptimeMillis();
        c1121570fIB.LJ = new ARunnableS116S0100000_16(function0, (Function0<Unit>) 14);
        GiftService.LLILLJJLI.setFirstRechargePendingOpenDialogEvent(c1121570fIB);
        C784440Upu.LIZ().LIZIZ(c0if2);
    }

    public static void LIZJ(BalanceStructExtra balanceStructExtra, Uri.Builder builder) {
        String code;
        int keepDot;
        long id;
        long price;
        int realDot;
        int localDot;
        String symbol;
        CurrencyInfo currencyInfo = balanceStructExtra.getCurrencyInfo();
        String str = "";
        if (currencyInfo == null || (code = currencyInfo.getCode()) == null) {
            code = "";
        }
        builder.appendQueryParameter("currency_code", code);
        CurrencyInfo currencyInfo2 = balanceStructExtra.getCurrencyInfo();
        if (currencyInfo2 != null && (symbol = currencyInfo2.getSymbol()) != null) {
            str = symbol;
        }
        builder.appendQueryParameter("symbol", str);
        CurrencyInfo currencyInfo3 = balanceStructExtra.getCurrencyInfo();
        int keepDot2 = 0;
        if (currencyInfo3 != null) {
            keepDot = currencyInfo3.getKeepDot();
        } else {
            keepDot = 0;
        }
        builder.appendQueryParameter("keep_dot", String.valueOf(keepDot));
        builder.appendQueryParameter("max_coins", String.valueOf(balanceStructExtra.getCoins()));
        BasePackage basePackage = balanceStructExtra.getBasePackage();
        long localPrice = 0;
        if (basePackage != null) {
            id = basePackage.getId();
        } else {
            id = 0;
        }
        builder.appendQueryParameter("base_package_id", String.valueOf(id));
        BasePackage basePackage2 = balanceStructExtra.getBasePackage();
        if (basePackage2 != null) {
            price = basePackage2.getPrice();
        } else {
            price = 0;
        }
        builder.appendQueryParameter("base_package_price", String.valueOf(price));
        BasePackage basePackage3 = balanceStructExtra.getBasePackage();
        if (basePackage3 != null) {
            realDot = basePackage3.getRealDot();
        } else {
            realDot = 0;
        }
        builder.appendQueryParameter("real_dot", String.valueOf(realDot));
        BasePackage basePackage4 = balanceStructExtra.getBasePackage();
        if (basePackage4 != null) {
            localDot = basePackage4.getLocalDot();
        } else {
            localDot = 0;
        }
        builder.appendQueryParameter("local_price_real_dot", String.valueOf(localDot));
        CurrencyInfo localCurrencyInfo = balanceStructExtra.getLocalCurrencyInfo();
        if (localCurrencyInfo != null) {
            keepDot2 = localCurrencyInfo.getKeepDot();
        }
        builder.appendQueryParameter("local_keep_dot", String.valueOf(keepDot2));
        BasePackage basePackage5 = balanceStructExtra.getBasePackage();
        if (basePackage5 != null) {
            localPrice = basePackage5.getLocalPrice();
        }
        builder.appendQueryParameter("local_price", String.valueOf(localPrice));
    }

    public static final boolean LJ(Context context, String str) {
        C006A c006aLIZJ;
        try {
            c006aLIZJ = C1161920gLG.LIZJ(IActionHandlerService.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c006aLIZJ = null;
        }
        IActionHandlerService iActionHandlerService = (IActionHandlerService) c006aLIZJ;
        if (iActionHandlerService != null) {
            return iActionHandlerService.handle(context, str);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJII(Context context, Uri uri) {
        Boolean boolValueOf;
        TaskInfo taskInfo;
        TaskInfoExtra taskInfoExtra;
        TaskEntranceInfo taskEntranceInfo;
        String str;
        Uri uri2;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAppendQueryParameter;
        EnumC1134460fcy enumC1134460fcyLIZJ;
        if (uri == null) {
            return false;
        }
        C1134410fct c1134410fctLJI = TaskManagerV2.LIZ.LJI(14);
        Uri uriBuild = null;
        if (c1134410fctLJI != null) {
            boolValueOf = Boolean.valueOf(c1134410fctLJI.LJIIJJI());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
        if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "gift_guide_heartme_task_show_popup") && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "heartme_banner_entrance")) {
            if (c1134410fctLJI != null) {
                enumC1134460fcyLIZJ = c1134410fctLJI.LIZJ();
            } else {
                enumC1134460fcyLIZJ = null;
            }
            if (enumC1134460fcyLIZJ != EnumC1134460fcy.TASK_IN_PROGRESS) {
                return false;
            }
        }
        LJIILIIL();
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        if (c1134410fctLJI != null && (taskInfo = (TaskInfo) c1134410fctLJI.LIZ) != null && (taskInfoExtra = taskInfo.extra) != null && (taskEntranceInfo = taskInfoExtra.entrance) != null && (str = taskEntranceInfo.schemaUrl) != null && (uri2 = UriProtector.parse(str)) != null && (builderBuildUpon = uri2.buildUpon()) != null && (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
            uriBuild = builderAppendQueryParameter.build();
        }
        return iActionHandlerService.handle(context, uriBuild);
    }

    public static final void LJIIIIZZ(Context context, RechargePanelInputParams rechargePanelInputParams) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        if (LJI()) {
            C1134320fck.LIZ.LJI(EnumC1134330fcl.NO_RECHARGE_TASK, rechargePanelInputParams.chargeReason, rechargePanelInputParams.isFromQuickGift, rechargePanelInputParams.giftEnterFrom, rechargePanelInputParams.notificationType);
            C766270U4b.LIZLLL(2131851586);
            LJIIJ(context, rechargePanelInputParams.needCoins, rechargePanelInputParams.chargeReason, rechargePanelInputParams.giftEnterFrom, rechargePanelInputParams.notificationType);
            return;
        }
        if (TaskManagerV2.LIZ.LJIIJJI(106)) {
            LJIIJJI(context, rechargePanelInputParams);
            return;
        }
        if (rechargePanelInputParams.exchangeParams == null) {
            rechargePanelInputParams = C1144050fsR.LIZ(rechargePanelInputParams.needCoins, rechargePanelInputParams.chargeReason, rechargePanelInputParams.giftEnterFrom, rechargePanelInputParams.notificationType, rechargePanelInputParams.isFromQuickGift);
        }
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "KEY_INPUT_PARAMS", rechargePanelInputParams);
        if (!C497740JfY.LJIL() && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS418S0200000_17(bundle, supportFragmentManager, 21));
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new AwS418S0200000_17(bundle, supportFragmentManager, 20));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJJI(Context context, RechargePanelInputParams rechargePanelInputParams) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Class cls;
        TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
        if (!taskManagerV2.LJIIJJI(106)) {
            C1134320fck.LIZ.LJI(EnumC1134330fcl.NO_CASH_CONSUMPTION_TASK, rechargePanelInputParams.chargeReason, rechargePanelInputParams.isFromQuickGift, rechargePanelInputParams.giftEnterFrom, rechargePanelInputParams.notificationType);
            C766270U4b.LIZLLL(2131851586);
            return;
        }
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "KEY_INPUT_PARAMS", rechargePanelInputParams);
            C784440Upu.LIZ().LIZIZ(new CloseCampaignPanelEvent());
            C1134410fct c1134410fctLJ = taskManagerV2.LJ();
            if (c1134410fctLJ != null) {
                List<S> list = c1134410fctLJ.LJ;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((TaskInfo) ((AbstractC1134420fcu) obj).LIZ).taskType == 100) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((AbstractC1134420fcu) it2.next()).LIZJ().beforeOrEqualsStatus(EnumC1134460fcy.TASK_IN_PROGRESS)) {
                        cls = RechargeTaskPanel.class;
                        break;
                    }
                }
                cls = ConsumptionTaskPanel.class;
            } else {
                cls = ConsumptionTaskPanel.class;
            }
            if (Intrinsics.LJFF(cls, ConsumptionTaskPanel.class) && C1149560g1K.LIZLLL(rechargePanelInputParams)) {
                C1134320fck.LIZ.LJI(EnumC1134330fcl.CANNOT_SHOW_CONSUMPTION_PANEL_FROM_BALANCE, rechargePanelInputParams.chargeReason, rechargePanelInputParams.isFromQuickGift, rechargePanelInputParams.giftEnterFrom, rechargePanelInputParams.notificationType);
                C766270U4b.LIZLLL(2131851586);
            } else {
                LJIILIIL();
                C500260Jjc.LJJLIIIJILLIZJL(new AwS561S0100000_17(new AwS261S0300000_17(supportFragmentManager, (FragmentManager) cls, (Class<? extends Object>) bundle, (Bundle) 3), (Function0<Unit>) 191));
            }
        }
    }

    public static final boolean LJIILLIIL(long j, Context context) {
        BalanceStruct balanceStructG52;
        WalletStruct walletStructTF1;
        List list;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        boolean z = false;
        if (context == null || !BackpackRetentionPopupSetting.INSTANCE.isEnable()) {
            return false;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        IHybridStorageService iHybridStorageService = (IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancel_show_backpack_retention_pop_up_");
        sbLIZ.append(currentUserId);
        Integer num = (Integer) iHybridStorageService.Pp2(context, C2188811AlT.LIZIZ(sbLIZ), null);
        if ((num == null || num.intValue() < 3) && C1148670fzt.LIZ().walletCenter().No0() <= 0 && (((balanceStructG52 = C1148670fzt.LIZ().walletCenter().g52()) == null || (balanceStructExtra2 = balanceStructG52.exchangeInfo) == null || balanceStructExtra2.getCoins() <= 0) && (((walletStructTF1 = C1148670fzt.LIZ().walletCenter().TF1()) == null || (balanceStructExtra = walletStructTF1.LIZ) == null || balanceStructExtra.getCoins() <= 0) && (list = (List) DataChannelGlobal.LLILZ.gg0(C1148030fyr.class)) != null))) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BagItem) obj).available) {
                    arrayList.add(obj);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((BagItem) it2.next()).itemId == j) {
                            z = true;
                            break;
                        }
                    }
                }
                Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?spark_page=first_consumption_backpack_gift_reminder").buildUpon();
                if (z) {
                    builderBuildUpon.appendQueryParameter("gift_id", String.valueOf(j));
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, builderBuildUpon.build());
                return true;
            }
        }
        return false;
    }

    public final boolean LIZLLL(Context context, C2436109gd c2436109gd) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String path;
        Uri uri = c2436109gd.LIZ;
        if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gift_enter_from")) == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        Uri uri2 = c2436109gd.LIZ;
        if (uri2 != null && (path = uri2.getPath()) != null) {
            int iHashCode = path.hashCode();
            if (iHashCode != -1837744009) {
                if (iHashCode != 618164891) {
                    if (iHashCode != 939090708 || !path.equals("/detail_page/common_recharge_page")) {
                        return false;
                    }
                } else if (!path.equals("/detail_page/first_recharge_consumption_page")) {
                    return false;
                }
            } else if (!path.equals("/detail_page/first_recharge_page")) {
                return false;
            }
            LIZ(0, context, null, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null, false);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0fsO] */
    public static void LJIIJ(Context context, int i, String str, String str2, String str3) {
        C19EG c19egLIZIZ;
        if (LiveRechargePanelFallBackSetting.INSTANCE.isEnable() && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("key_charge_reason", str, bundle);
            bundle.putLong("key_bundle_need_coins", i);
            C786410Ut5.LJJJI("key_bundle_gift_from", str2, bundle);
            C786410Ut5.LJJJI("key_bundle_notification_type", str3, bundle);
            C786410Ut5.LJJJI("request_page", "live_detail", bundle);
            C500260Jjc.LJJLIIIJILLIZJL(new AwS561S0100000_17(new AwS261S0300000_17(c19egLIZIZ, (C1144020fsO) new InterfaceC1806230x6T() { // from class: X.0fsO
                @Override // X.InterfaceC1806230x6T
                public final /* synthetic */ void LIZ() {
                }

                @Override // X.InterfaceC1806230x6T
                public final void LIZIZ(int i2, int i3, String str4) {
                }

                @Override // X.InterfaceC1806230x6T
                public final /* synthetic */ void LIZJ() {
                }

                @Override // X.InterfaceC1806230x6T
                public final void onFail() {
                }

                @Override // X.InterfaceC1806230x6T
                public final void onSuccess(long j) {
                }
            }, bundle, 4), (Function0<Unit>) 191));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIZ(int r23, android.content.Context r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143980fsK.LJIIIZ(int, android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC1144010fsN
    public final void LIZ(int i, Context context, String str, String str2, String str3, boolean z) {
        String giftEnterFrom;
        String strLIZIZ = str;
        if (LJI()) {
            C1134320fck.LIZ.LJI(EnumC1134330fcl.NO_RECHARGE_TASK, strLIZIZ, z, str2, str3);
            LJIIJ(context, i, strLIZIZ, str2, str3);
            C766270U4b.LIZLLL(2131851586);
            return;
        }
        LJIILIIL();
        if (strLIZIZ == null) {
            strLIZIZ = C1144050fsR.LIZIZ();
        }
        if (str2 == null) {
            giftEnterFrom = GiftService.LLILLJJLI.getGiftEnterFrom();
        } else {
            giftEnterFrom = str2;
        }
        C1133940fc8 c1133940fc8 = C1133940fc8.LIZIZ;
        if (c1133940fc8.LIZIZ()) {
            if (!C497740JfY.LJIL() && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                LJIILJJIL(new C1144000fsM(i, context, strLIZIZ, str2, str3, z));
                return;
            } else {
                LJIIIZ(i, context, strLIZIZ, str2, str3, z);
                return;
            }
        }
        RechargePanelInputParams rechargePanelInputParamsLIZ = C1144050fsR.LIZ(i, strLIZIZ, giftEnterFrom, str3, z);
        if (!C1133940fc8.LJIIJJI() && !c1133940fc8.kb()) {
            TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
            if (!taskManagerV2.LJIIJJI(105)) {
                if (taskManagerV2.LJIIJJI(106)) {
                    LJIIJJI(context, rechargePanelInputParamsLIZ);
                    return;
                } else {
                    C470360IcU.LIZ(AFwS205S0000000_17.get$arr$(55));
                    return;
                }
            }
        }
        LJIIIIZZ(context, rechargePanelInputParamsLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(android.content.Context r27, int r28, java.lang.String r29, boolean r30, int r31, java.lang.String r32, java.lang.String r33, kotlin.jvm.internal.AwS561S0100000_17 r34, kotlin.jvm.internal.AwS561S0100000_17 r35, kotlin.jvm.internal.AwS383S0200000_17 r36, X.InterfaceC1364105Vn r37) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1143980fsK.LJIIL(android.content.Context, int, java.lang.String, boolean, int, java.lang.String, java.lang.String, kotlin.jvm.internal.AwS561S0100000_17, kotlin.jvm.internal.AwS561S0100000_17, kotlin.jvm.internal.AwS383S0200000_17, X.05Vn):java.lang.Object");
    }
}
